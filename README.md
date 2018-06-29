# MyOkHttpDemo
OkHttp使用简单代码
---

### 加载依赖包
compile 'com.squareup.okhttp3:okhttp:3.10.0'

### 使用的是官方代码
![官方代码截图](https://github.com/think-ing/MyOkHttpDemo/blob/master/qwesd.png)

  在DUG中无法查看
  RequestBody body = RequestBody.create(JSON, json);
  封装的数据。

  将之替换成：
  `RequestBody requestBodyPost = new FormBody.Builder()
  .add("code", "0")
  .add("msg", "哈哈")
  .add("time", "1530256032")
  .build();`
 
  可视的post入参
