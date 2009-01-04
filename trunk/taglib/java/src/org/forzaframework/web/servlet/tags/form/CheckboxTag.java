package org.forzaframework.web.servlet.tags.form;

import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.forzaframework.web.servlet.tags.form.FieldTag;
import org.forzaframework.web.servlet.tags.JSONFunction;

/**
 * User: Cesar Reyes
 * Date: 11/06/2007
 * Time: 05:09:25 PM
 * Description:
 */
public class CheckboxTag extends FieldTag {

    private Boolean checked;
    public String onCheck;

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getOnCheck() {
        return onCheck;
    }

    public void setOnCheck(String onCheck) {
        this.onCheck = onCheck;
    }

    public String getType() {
        return "checkbox";
    }

    public JSON toJSON() {
        JSONObject json = new JSONObject();

        json.elementOpt("id", id);
        json.put("boxLabel", title != null ? title : getText(titleKey));        
//        json.put("hideLabel", true);
        json.put("labelSeparator", "");
        json.put("name", this.getField());
//        json.elementOpt("mapping", this.getMapping());
        json.elementOpt("description", getDescription());
        json.elementOpt("inputValue", this.getValue());
        json.elementOpt("checked", this.getChecked());
        json.elementOpt("disabled", this.getDisabled());
        json.elementOpt("width", getWidth());
        json.elementOpt("autoHeight", getAutoHeight());
        json.elementOpt("anchor", anchor);
        json.put("validateOnBlur", false);
        json.put("xtype", getType());

        if(StringUtils.isNotBlank(onCheck)){
            JSONObject listeners = new JSONObject();
            listeners.put("check", new JSONFunction(onCheck));
            json.put("listeners", listeners);
        }

        return json;
    }

    public String getHtmlDeclaration(){
        StringBuilder sb = new StringBuilder();

        sb.append("<input style=\"width: ").append(getWidth()).append(";\" class=\"x-form-text x-form-field\" size=\"20\" autocomplete=\"off\" id=\"");
        sb.append(getField());
        sb.append("\" name=\"");
        sb.append(getField());
        sb.append("\" type=\"checkbox\">");

        return sb.toString();
    }
}
