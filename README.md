# MyOkHttpDemo
OkHttp使用简单代码
---

### 加载依赖包
compile 'com.squareup.okhttp3:okhttp:3.10.0'

### 使用的是官方代码
![官方代码截图](https://github.com/think-ing/MyOkHttpDemo/blob/master/qwesd.png)  
  
<div>
   <br />
  </div>
  <div>
   在DUG中无法查看
  </div>
  <div>
   `RequestBody body = RequestBody.create(JSON, json);`
  </div>
  <div>
   封装的数据。
  </div>
  <div>
   <br />
  </div>
  <div>
   将之替换成：
  </div>
  <div>
   RequestBody requestBodyPost = new FormBody.Builder()
  </div>
  <div>
   &nbsp;.add(&quot;code&quot;, &quot;0&quot;)
  </div>
  <div>
   &nbsp;.add(&quot;msg&quot;, &quot;哈哈&quot;)
  </div>
  <div>
   &nbsp;.add(&quot;time&quot;, &quot;1530256032&quot;)
  </div>
  <div>
   &nbsp;.build();
  </div>
  <div>
   &nbsp;
  </div>
  <div>
   可视的post入参
  </div>
