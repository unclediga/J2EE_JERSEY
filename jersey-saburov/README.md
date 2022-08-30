standalone examples from repo J2EE_SABUROV related to Jersey

https://ru.wikipedia.org/wiki/Jakarta_EE


Описание	Использованная версия
	J2EE 1.4	Java EE 5	Java EE 6	Java EE 7	Java EE 8
	2003 г.	         2006 г.	2009 г.	         2013 г.	2018 г

EJB	Enterprise JavaBeans — спецификация технологии серверных компонентов, содержащих бизнес-логику	2.1	3.0	3.1	3.2	3.2
JPA	Java Persistence API — управление постоянством и объектно-реляционное отображение	Нет	1.0	2.0	2.1	2.2
Servlet	Обслуживание запросов веб-клиентов	2.4	2.5	3.0	3.1	4.0
JSP	JavaServer Pages — динамическая генерация веб-страниц на стороне сервера	2.0	2.1	2.2	2.3	2.3
JSTL	JavaServer Pages Standard Tag Library	Нет	1.2	1.2	1.2	1.2
JSF	JavaServer Faces — компонентный серверный фреймворк для разработки веб-приложений на технологии Java	Нет	1.2	2.0	2.2	2.3
JAX-WS	Java API for XML Web Services — создание веб-сервисов	1.0	1.2	1.2	2.2	2.2
JAX-RS	Java API for RESTful Web Services — создание RESTful веб-сервисов	Нет	Нет	1.1	2.0	2.1
WebSocket	Java API for WebSocket	Нет	Нет	Нет	1.0	1.1
JSON-P	Java API for JSON Processing — разбор и генерация JSON	Нет	Нет	Нет	1.0	1.1
JSON-B	Java API for JSON Binding — преобразование Java объектов в/из JSON	Нет	Нет	Нет	Нет	1.0
JNDI	Java Naming and Directory Interface — служба каталогов	1.2	1.2	1.2	1.2	1.2
JMS	Java Message Service — обмен сообщениями	1.1	1.1	1.1	2.0	2.0
JTA	Java Transaction API — управление транзакциями	1.0.1B	1.1	1.1	1.2	1.2
JAAS	Java Authentication and Authorization Service — Java-реализация PAM	1.0	1.0	1.0		
JavaMail	Получение и отправка электронной почты	1.2	1.4	1.4	1.5	1.6
JACC	Java Authorization Contract for Containers	1.0	1.1	1.1	1.4	1.5
JCA	J2EE Connector Architecture	1.5	1.5	1.6	1.6	1.7
JAF	JavaBeans Activation Framework	1.0	1.1	1.1	1.1	1.1
StAX	Streaming API for XML	Нет	1.0	1.0	1.0	1.0
CDI	Context and Dependency Injection	Нет	Нет	1.0	1.1	2.0
Validation	Bean Validation	Нет	Нет	1.0	1.1	2.0
Security	Java EE Security API	Нет	Нет	Нет	Нет	1.0


Jetty Version	Servlet	License						     Java
------------------------------------------------------------------
Jetty 9.4.x 	3.1     JavaEE 8/javax.servlet.*         Java 8
Jetty 10.0.x    4.0     JakartaEE 8/javax.servlet.*      Java 11+
Jetty 11.0.x    5.0     JakartaEE 9/jakartaee.servlet.*  Java 11+


https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/migration.html#mig-2.30


30.1. Migrating from Jersey 2.29 to 2.29.1 and 2.30+
30.1.1. Breaking Changes
Versions 2.30+ do not introduce nothing breaking, however version 2.29.1 has a major change which means migration of Jersey to Jakarta EE (8) platform thus all inner dependencies to APIs are migrated to jakarta EE maven coordinates. This also means that all dependencies which were taken from JDK as such (like JAXB etc) are now external for JDK 1.8 (but for JDK 11+ they are external even in their Java EE form). So, for those who will migrate to versions of Jersey 2.29.1 or 2.30+ , a massive extension of dependencies being downloaded for the project build will occur. Also there is extended support of JDKs - maximum compatibility with JDK 15 (including previous JDKs). And other major improvements and fixes which are described in details in release notes below.