# DependencyInjectionRef
Dependency Injection using reference. 
Return on the server side
A{x=12, ob=B{y=90}}Person{name='Avinash', id=15 5000000 AUDI} Person{name='Abhijeet', id=45 4500000 BMW}

On terminal output

A{x=12, ob=B{y=90}}
B{y=90}
A{x=12, ob=B{y=90}}
B{y=90}
A{x=12, ob=B{y=90}}
B{y=90}


**Now you've two assignments
1. Change the constructor-arg into c schema for Person with ref of Car
2. Add List variable to the Person class as one of its variable.**

I've done it in using 3 different files or I can use the package and will
try to use its class path in the main function with ApplicationContext

Output: 

Person{name='Avinash', id=15 Family members name: [Ishi, Suyash, Nikhil, Sushil] 4500000 BMW}
Person{name='Abhijeet', id=45 Family members name: [Avinash, Abhijeet, Amisha, Ishi, Manju] 5000000 AUDI}

Sol: 1 & 2
```xml
<bean class="Class_name" name="Object_name" 
      c:var1="var1_value" c:var2="var2_value"
      c:Class-ref="bean_name_of the_ref_class"
      c:list_name="Name1, Name2, Name3, Name4, Name5" />
```
eg:
```xml


<bean class="com.example.DependencyInjectionRef.assgnmet.PersonA" name="consObj2A"
c:name="Abhijeet" c:id="45" 
c:car-ref="consObjCar2A" 
c:famName="Avinash, Abhijeet, Amisha, Ishi, Manju" />
```
**You can find the Implementation in assgnmet package and configuration file in consConfigA.xml**


**Solving anbiguity in constructor injection:**

Package_Name: **ambiguity**
Configuration_file_name: **ambiConfig.xml**

if order is like int,int

Constructor: int, int
37

Now reversing the order of the constructor in Sum.java

Constructor: double,double
37

But as soon we put String , String It'll not care for order and it'll take string
Output
Constructor: String, String
37

we can give type in constructor-arg 

Index can be used for the constructor variable to save data in

Sum(int a, int b, int c, int d)
``` xml
<cunstructor-arg value="12" type="int" index="2" />
```
Means int c =12