# Lecture 1
When using hibernate as an OR-Mapper there are several things to do like:
- resolving dependencies for hibernate
- configuration of database connection
- creating an entity
- creating a Sessionfactory

## Dependencies
It doesn't matter what kind of build tool we use. In this tutorial we are using maven to solve dependencies and build our example.
The following dependencies are needed for lecture 1. As Lecture 1 shows you a minimal application of using a database with hibernate
the dependencies define the minimum of dependencies needed.

At first we declare the dependency for the database we are going to use. In our case it is H2 database.
   
       <dependency>
           <groupId>com.h2database</groupId>
           <artifactId>h2</artifactId>
           <version>1.4.196</version>
       </dependency>

To define Entities we need Annotations defined in the persistence API.

       <dependency>
           <groupId>javax.persistence</groupId>
           <artifactId>persistence-api</artifactId>
           <version>1.0.2</version>
       </dependency>

To create a SessionFactory and configure hibernate we need a library containing hibernate code. In this case we start with 
hibernate core.

       <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.2.15.Final</version>
        </dependency>

At least we need a library for manipulating byte code, as hibernate uses reflection to instantiate Entities.

        <dependency>
            <groupId>org.javassist</groupId>
            <artifactId>javassist</artifactId>
            <version>3.22.0-GA</version>
        </dependency> 
        
## Entity
To create an entity we start by implementing a simple POJO. The POJO contains the members that matches the columns in database. To 
transform this POJO into an entity we have to add several annotations. 

At first we annotate the class using @Entity and @Table. If we like to use the name of the class as the tablename in database, we 
don't have to define a name in @Table. Otherwise the @Table annotation needs to be given the name as a parameter  i.e. 
name="name in database".

Now we have an Entity with columns matching the defined members of the class. I am pretty sure that we are missing the member that 
defined the ID of the entity.

It is strongly recommended the an ID is a number and only a number. It might be possible that a business case defines a primary 
key of some columns to be in total unique. Creating a primary key of multiple columns is not only a violation of a database 
norm but also a problem of indexing data, especially if one or more of the columns of the primary key is a string (varchar). It is 
much faster using  a number and less complex when joining tables. Though we define the id by

        @Id
        private Long id;
        
We use a Long object and not a native long as the Object can be null and a native long not. To tell hibernate that this member is 
the id of this entity we annotate the member with @ID. As an id must be unique, we have to tell hibernate how to ensure that the id 
will be unique. We don't want to define the ids manually and hibernate provides a solution for this. When we want hibernate to
generate an id for a new entity, we have to annotate the member as well with @GeneratedValue. This annotation expects at least one
of the parameters strategy and generator.
