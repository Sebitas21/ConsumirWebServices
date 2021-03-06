
package SessionBeanSuma;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalcuSuma", targetNamespace = "http://SessionBean/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalcuSuma {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calcuSuma", targetNamespace = "http://SessionBean/", className = "SessionBeanSuma.CalcuSuma_Type")
    @ResponseWrapper(localName = "calcuSumaResponse", targetNamespace = "http://SessionBean/", className = "SessionBeanSuma.CalcuSumaResponse")
    @Action(input = "http://SessionBean/CalcuSuma/calcuSumaRequest", output = "http://SessionBean/CalcuSuma/calcuSumaResponse")
    public Integer calcuSuma(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
