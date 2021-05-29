/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.team.bbs;

/**
 *
 * @author 916
 */
public class LogMemento {
    private String logData;
    public void setLog(String logData) {
        this.logData = logData;
    }
    public Memento saveToMemento() {
        return new Memento(logData);
    }
    public String restoreFromMemento(Memento memento) {
        logData = memento.getSavedData();
        return logData;
    }
    public static class Memento {
        private final String logData;
        public Memento(String dataToSave) {
            this.logData = dataToSave;
        }
        public String getSavedData() {
            return logData;
        }
    }
}
