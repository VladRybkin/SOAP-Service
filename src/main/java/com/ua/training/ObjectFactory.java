//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.31 at 02:22:55 PM EET 
//


package com.ua.training;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ua.training package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ua.training
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserRequest }
     * 
     */
    public GetUserRequest createGetUserRequest() {
        return new GetUserRequest();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     * 
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link PutUserRequest }
     * 
     */
    public PutUserRequest createPutUserRequest() {
        return new PutUserRequest();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link PostUserRequest }
     * 
     */
    public PostUserRequest createPostUserRequest() {
        return new PostUserRequest();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

}
