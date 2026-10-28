package com.mapbox.maps;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class RequestInfo implements Serializable {
    private final List<RequestLoadingMethodType> loadingMethod;
    private final RequestPriorityType priority;
    private final RequestResourceType resource;
    private final String url;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public RequestInfo(String str, RequestResourceType requestResourceType, RequestPriorityType requestPriorityType, List<RequestLoadingMethodType> list) {
        this.url = str;
        this.resource = requestResourceType;
        this.priority = requestPriorityType;
        this.loadingMethod = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestInfo.class != obj.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        return Objects.equals(this.url, requestInfo.url) && Objects.equals(this.resource, requestInfo.resource) && Objects.equals(this.priority, requestInfo.priority) && Objects.equals(this.loadingMethod, requestInfo.loadingMethod);
    }

    public List<RequestLoadingMethodType> getLoadingMethod() {
        return this.loadingMethod;
    }

    public RequestPriorityType getPriority() {
        return this.priority;
    }

    public RequestResourceType getResource() {
        return this.resource;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.url, this.resource, this.priority, this.loadingMethod);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[url: ");
        AbstractC3855a.m11838v(this.url, ", resource: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.resource));
        sb4.append(", priority: ");
        sb4.append(RecordUtils.fieldToString(this.priority));
        sb4.append(", loadingMethod: ");
        sb4.append(RecordUtils.fieldToString(this.loadingMethod));
        sb4.append("]");
        return sb4.toString();
    }
}
