# WeRom
Android Rom, 目前只包括以原生桌面为base的定制化桌面

## 优先解决gradle jcenter下载速度

```
    repositories { 
          jcenter() 
    }
```

替换为

```
    repositories {
        maven{url 'http://maven.aliyun.com/nexus/content/groups/public/'}
    }
```

## How to decrease gradle build time
1. 为什么要优化gradle编译时间，如果一个复杂的项目一天需要编译15次，每次编译2分钟，那么一天
就需要30分钟去等待编译结果，简直是在浪费生命，高效地工作，才是职业的软件工程师
2. 不要让编译浪费我的时间 ： 
```
 第一步配置gradle.properties在项目根目录, 内容 如下：
   org.gradle.daemon=true
   org.gradle.jvmargs=-Xmx4092m -XX:MaxPermSize=512m -XX:+HeapDumpOnOutOfMemoryError -Dfile.encoding=UTF-8
   org.gradle.parallel=true
   org.gradle.configureondemand=true
   
   第二步检查一次编译时间的消耗情况 
   1. 使用命令：./gradlew(linux:./gradlew, win:gradlew.bat) build --profile 检查时间消耗在哪里
   
   2. 根据生成的report去调试，ex:
      before : summary如下：
      Total Build Time	1m4.18s
      Startup	1.583s
      Settings and BuildSrc	0.048s
      Loading Projects	0.011s
      Configuring Projects	0.625s
      Task Execution	1m1.08s
      
      时间主要浪费到Task Execution上，1分钟简直让人抓狂，这才几行代码，具体内容如下：
      launcher	1m1.08s	(total)
           :launcher:lint	48.698s	
      时间都浪费在了lint上。
      
    3. 解决方案， 官方的guide： https://docs.gradle.org/current/userguide/userguide_single.html#sec:excluding_tasks_from_the_command_line
       具体实施， 如果是命令执行build，可以使用如下命令：
       gradlew.bat(linux: gradlew) build  -x lint -x lintVitalRelease
       如果习惯了ide生成apk，可以下面方案：
       tasks.whenTaskAdded { task ->
       if (task.name.equals("lint")) {
           task.enabled = false
           }
       }
      apply plugin: 'com.android.application' 请注意，经过1万册的实验（有点夸张），
      tasks一定要添加到apply plugin: 'com.android.application'之前
      
    4. 看看2种方案后的结果：
       Total Build Time	9.912s
       Startup	1.323s
       Settings and BuildSrc	0.040s
       Loading Projects	0.007s
       Configuring Projects	0.411s
       Task Execution	7.444s
       浪费生命就是犯罪！
``` 

## About git
1. git init
2. git remote add origin https://github.com/yuzhuguan/WeRom.git
3. git push -u origin master

## 截图

![](device-2017-12-16-221949.png)
