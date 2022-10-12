//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.31 at 11:10:09 AM IST 
//


package org.apache.xml.security.configuration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.xml.security.configuration package. 
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

    private final static QName _Configuration_QNAME = new QName("http://www.xmlsecurity.org/NS/configuration", "Configuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.xml.security.configuration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfigurationType }
     * 
     */
    public ConfigurationType createConfigurationType() {
        return new ConfigurationType();
    }

    /**
     * Create an instance of {@link AlgorithmType }
     * 
     */
    public AlgorithmType createAlgorithmType() {
        return new AlgorithmType();
    }

    /**
     * Create an instance of {@link TransformAlgorithmType }
     * 
     */
    public TransformAlgorithmType createTransformAlgorithmType() {
        return new TransformAlgorithmType();
    }

    /**
     * Create an instance of {@link ResolverType }
     * 
     */
    public ResolverType createResolverType() {
        return new ResolverType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link TransformAlgorithmsType }
     * 
     */
    public TransformAlgorithmsType createTransformAlgorithmsType() {
        return new TransformAlgorithmsType();
    }

    /**
     * Create an instance of {@link HandlerType }
     * 
     */
    public HandlerType createHandlerType() {
        return new HandlerType();
    }

    /**
     * Create an instance of {@link SecurityHeaderHandlersType }
     * 
     */
    public SecurityHeaderHandlersType createSecurityHeaderHandlersType() {
        return new SecurityHeaderHandlersType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link JCEAlgorithmMappingsType }
     * 
     */
    public JCEAlgorithmMappingsType createJCEAlgorithmMappingsType() {
        return new JCEAlgorithmMappingsType();
    }

    /**
     * Create an instance of {@link ResourceResolversType }
     * 
     */
    public ResourceResolversType createResourceResolversType() {
        return new ResourceResolversType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xmlsecurity.org/NS/configuration", name = "Configuration")
    public JAXBElement<ConfigurationType> createConfiguration(ConfigurationType value) {
        return new JAXBElement<ConfigurationType>(_Configuration_QNAME, ConfigurationType.class, null, value);
    }

}
