# 线上考试平台

## 技术栈：springboot+mybaits+websocket+mysql+vue+lua

## 项目介绍：

​	这是一个线上考试的平台的服务端口，其前端使用vue和nodejs进行与后端的分离，

其内容包括学生端，教师端，管理端三端交互完成线上考试。

## 设计：

1.使用webSocket完成留言操作哦

2.每个实体类位mybatis逆向工程生成，与数据库表一一对应

3.采用二进制解压缩的方式进行对用户数据的下载和上传

4.登录信息采用加密验证方式，公钥和私钥解锁

5.MVC架构

优化架构图：
![image-20221004141512239](https://github.com/nacey5/oes/blob/master/image.png)
