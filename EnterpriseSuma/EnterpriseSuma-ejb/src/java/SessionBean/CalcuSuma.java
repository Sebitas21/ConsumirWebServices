/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author super
 */
@WebService
@Stateless
public class CalcuSuma implements CalcuSumaLocal {

    @Override
    public Integer calcuSuma(int a, int b) {
        return (a+b);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
