package com.ya.yaclass.vod.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author yagote    create 2023/2/20 21:17
 */
public interface FileService {
    //文件上传
    String upload(MultipartFile file);
}
