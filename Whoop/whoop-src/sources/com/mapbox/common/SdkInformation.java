package com.mapbox.common;

import c13.AbstractC3855a;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class SdkInformation implements Serializable {
    private final String name;
    private final String packageName;
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformation(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.packageName = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkInformation sdkInformation = (SdkInformation) obj;
        return Objects.equals(this.name, sdkInformation.name) && Objects.equals(this.version, sdkInformation.version) && Objects.equals(this.packageName, sdkInformation.packageName);
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.packageName);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[name: ");
        AbstractC3855a.m11838v(this.name, ", version: ", sb4);
        AbstractC3855a.m11838v(this.version, ", packageName: ", sb4);
        return AbstractC3855a.m11826j(this.packageName, "]", sb4);
    }
}
