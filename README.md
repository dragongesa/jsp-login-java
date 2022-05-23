# JSP Login JAVA
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
