package com.jshen.girl.controller;

import com.jshen.girl.POJO.UpdateResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@RestController
public class FileController {

    private static final String filePath = "G:/girl/src/main/resources/static/img/";

    @PostMapping("/update")
    public UpdateResult updateFile(@RequestParam ("head_img") MultipartFile file,
                                   HttpServletRequest request){

        //检测
        if (file.isEmpty()){
            return new UpdateResult("-2", "empty file");
        }

        //获取名称
        String name = request.getParameter("name");
        System.out.println("用户名"+name);

        //获取上传文件的原名
        String fileName = file.getOriginalFilename();
        System.out.println("上传的原名"+fileName);

        //获取后缀
        String suffixName = fileName.substring(fileName.indexOf("."));
        System.out.println("上传的类型"+suffixName);

        //建立上传的路径
        fileName = UUID.randomUUID()+suffixName;
        File dest = new File(filePath+fileName);
        System.out.println("上传后文件名"+fileName);

        try {
            file.transferTo(dest);
            return new UpdateResult("0", fileName);
        }catch (Exception e){
            e.printStackTrace();
        }

        return new UpdateResult("-1", null, "save failed ");

    }
}
