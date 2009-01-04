package org.forzaframework.web;

/**
 * @author cesarreyes
 *         Date: 19-ago-2008
 *         Time: 9:29:23
 */
public class LabelValue {

    private String label;
    private String value;

    public LabelValue() {
    }

    public LabelValue(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}