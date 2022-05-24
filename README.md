# JSP Login JAVA
![image](https://user-images.githubusercontent.com/58933926/169929006-a06519f3-476d-4868-8236-8a2123f9bc9f.png)

![image](https://user-images.githubusercontent.com/58933926/169929097-a9181cae-bb2e-48d3-91f4-55dc33781a24.png)

Note:
if you facing this
```
An invalid character [32] was present in the Cookie value
```
Add this to your contex.xml at location %CATALINA_HOME% (i.e. C:\apache-tomcat-8.5.20\conf\context.xml in my case)
```
<CookieProcessor className="org.apache.tomcat.util.http.LegacyCookieProcessor" />
```
so your context.xml will look like this
```
<?xml version="1.0" encoding="UTF-8"?>

<Context reloadable="true">
    <WatchedResource>WEB-INF/web.xml</WatchedResource>
    <WatchedResource>${catalina.base}/conf/web.xml</WatchedResource>
    <Transaction factory="bitronix.tm.BitronixUserTransactionObjectFactory"/>
    <CookieProcessor className="org.apache.tomcat.util.http.LegacyCookieProcessor" />    
</Context>
```
