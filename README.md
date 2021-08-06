### swagger
https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
http://localhost:8080/v2/api-docs
http://localhost:8080/swagger-ui.html

### SpringBoot Controller坑
- spring的request body并不支持空字段，空字段的DTO应属于设计上的问题

### PropertySource
ProperySource这里有一个坑需要注意，yaml的层级关系，spring不会处理。  
Spring从机制上只会处理key:value的形式，如
```yaml
shoot:
  name: hzj
```
Spring只能解析出name:hzj,解析不出shoot.name:hzj