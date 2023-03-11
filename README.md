# yaclass

## 一、内容简介
一款微服务搭建的课堂平台，分为管理员前台、用户前台，前后端分离。

## 二、技术框架
### （1）后端---yaclass_parent
- JDK1.8
- MySQL5.1.46<br>
- Nacos2.2.0<br>
- Mybatis Plus3.4.1
- Swagger2.9.2
- Maven3.8.4<br>
- Spring Boot<br>
- Spring Cloud Hoxton
- Spring Cloud Alibaba2.2.0
- 欢拓云直播SDK<br>
- 微信公众号开发<br>
- 腾讯云对象存储<br>
- 腾讯云点播<br>
### （2）前端---vue-admin、vue-mobile
- vue2，使用了vue-admin-template模板<br>
- Node.js
- Axios
- Echarts

## 三、项目运行
- （1）先运行数据库文件，配置好数据库连接，修改后端的连接
- （2）根据实际修改每个模块的`application.properties`配置文件
- （3）接着启动Nacos,再运行所有的微服务某块
- （4）使用`npm run dev`命令运行管理员前端项目（vue-admin），在vue-mobile的package.json中点击`"serve": "vue-cli-service serve"`运行用户前台项目。<br>

注意node的版本要和node-sass的版本要对应，否则运行不了vue-mobile
