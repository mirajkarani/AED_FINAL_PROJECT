/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author milin
 */
public class AdopterWorkStatusCheckRequest extends WorkRequest {
     private String bgcStatus;
     private String financeStatus;

    public String getBgcStatus() {
        return bgcStatus;
    }
    public String getFinanceStatus() {
        return financeStatus;
    }

    public void setFinanceStatus(String financeStatus) {
        this.financeStatus = financeStatus;
    }

    public void setBgcStatus(String bgcStatus) {
        this.bgcStatus = bgcStatus;
    }

    
    
}
