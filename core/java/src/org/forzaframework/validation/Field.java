package org.forzaframework.validation;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Cesar Reyes
 * Date: 11/06/2007
 * Time: 09:39:07 AM
 * Description:
 */
public class Field {

    private String id;
    private String code;
    private List<Error> errors = new ArrayList<Error>();

    public Field() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public void addError(Error error){
        this.errors.add(error);
    }

    public JSONObject toJSON(){
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("code", code);
        JSONArray errors = new JSONArray();
        for(Error error : this.errors){
            errors.add(error.toJSON());
        }
        json.put("errors", errors);
        return json;
    }
}