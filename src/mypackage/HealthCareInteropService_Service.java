
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HealthCareInteropService", targetNamespace = "http://healthcareinterop.m2icone.org/", wsdlLocation = "file:///C:/Users/Mohamed/Desktop/HealthCareInteropService.wsdl")
public class HealthCareInteropService_Service
    extends Service
{

    private final static URL HEALTHCAREINTEROPSERVICE_WSDL_LOCATION;
    private final static WebServiceException HEALTHCAREINTEROPSERVICE_EXCEPTION;
    private final static QName HEALTHCAREINTEROPSERVICE_QNAME = new QName("http://healthcareinterop.m2icone.org/", "HealthCareInteropService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:///C:/Users/Mohamed/Desktop/HealthCareInteropService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HEALTHCAREINTEROPSERVICE_WSDL_LOCATION = url;
        HEALTHCAREINTEROPSERVICE_EXCEPTION = e;
    }

    public HealthCareInteropService_Service() {
        super(__getWsdlLocation(), HEALTHCAREINTEROPSERVICE_QNAME);
    }

    public HealthCareInteropService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HEALTHCAREINTEROPSERVICE_QNAME, features);
    }

    public HealthCareInteropService_Service(URL wsdlLocation) {
        super(wsdlLocation, HEALTHCAREINTEROPSERVICE_QNAME);
    }

    public HealthCareInteropService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HEALTHCAREINTEROPSERVICE_QNAME, features);
    }

    public HealthCareInteropService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HealthCareInteropService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HealthCareInteropService
     */
    @WebEndpoint(name = "HealthCareInteropServicePort")
    public HealthCareInteropService getHealthCareInteropServicePort() {
        return super.getPort(new QName("http://healthcareinterop.m2icone.org/", "HealthCareInteropServicePort"), HealthCareInteropService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HealthCareInteropService
     */
    @WebEndpoint(name = "HealthCareInteropServicePort")
    public HealthCareInteropService getHealthCareInteropServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://healthcareinterop.m2icone.org/", "HealthCareInteropServicePort"), HealthCareInteropService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HEALTHCAREINTEROPSERVICE_EXCEPTION!= null) {
            throw HEALTHCAREINTEROPSERVICE_EXCEPTION;
        }
        return HEALTHCAREINTEROPSERVICE_WSDL_LOCATION;
    }

}
