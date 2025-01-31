package se.vgregion.metaservice.keywordservice.domain.document;

import java.util.Map;

public class AnalysisDocument extends TextDocument implements Document {

    public String getPropertyString(String key) {
        return document.getPropertyString(key);
    }

    public Object getPropertyObject(String key) {
        return document.getPropertyObject(key);
    }

    public void setProperty(String key, Object value) {
        document.setProperty(key, value);
    }

    public Map<String,Object> getPropertyMap(){
        return document.getPropertyMap();
    }
}
