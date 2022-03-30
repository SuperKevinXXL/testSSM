# 搭建ssm项目的具体步骤
1、新建Maven工程

2、修改目录，修改pom.xml文件

3、添加ssm框架的所有依赖

4、拷贝jdbc.porperties到resource目录下

5、新建applicationContext_dao.xml文件，进行数据库访问层的配置

6、新建applicationContext_service.xml文件，进行业务逻辑层的配置

7、新建springmvc.xml文件，配置springmvc的框架

8、新建SqlMapConfig.xml文件，进行分页插件的配置

9、配置web.xml文件

10、使用逆向工程生成pojo和mapper的文件

11、开发业务逻辑层，实现登录判断

12、开发控制器AdminAction，完成登录处理

13、改造页面，发送登录请求，验证登录

