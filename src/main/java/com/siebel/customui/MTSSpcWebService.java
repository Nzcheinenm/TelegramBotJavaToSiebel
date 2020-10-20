
package com.siebel.customui;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MTS_spcWebService", targetNamespace = "http://siebel.com/CustomUI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.customui.ObjectFactory.class,
    com.siebel.xml.contact_20io.ObjectFactory.class
})
public interface MTSSpcWebService {


    /**
     * 
     * @param telegramSiebelBotInput
     * @return
     *     returns com.siebel.customui.TelegramSiebelBotOutput
     */
    @WebMethod(operationName = "TelegramSiebelBot", action = "document/http://siebel.com/CustomUI:TelegramSiebelBot")
    @WebResult(name = "TelegramSiebelBot_Output", targetNamespace = "http://siebel.com/CustomUI", partName = "TelegramSiebelBot_Output")
    public TelegramSiebelBotOutput telegramSiebelBot(
        @WebParam(name = "TelegramSiebelBot_Input", targetNamespace = "http://siebel.com/CustomUI", partName = "TelegramSiebelBot_Input")
        TelegramSiebelBotInput telegramSiebelBotInput);

}