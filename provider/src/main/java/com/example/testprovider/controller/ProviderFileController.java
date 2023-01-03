package com.example.testprovider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/file/")
public class ProviderFileController {

    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        String name = file.getOriginalFilename();
        // 设置上传至项目文件夹下的uploadFile文件夹中，没有文件夹则创建
        if (file.getSize() > 1 * 1024) {
            return "上传失败，文件大于1K";
        }
        if (!".txt".equals(name.substring(name.lastIndexOf(".")))) {
            return "上传失败，文件类型非txt";
        }


        File dir = new File("uploadFile");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        file.transferTo(new File(dir.getAbsolutePath() + File.separator + name));
        return "上传完成！文件名：" + name;
    }


}
