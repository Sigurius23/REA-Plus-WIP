package com.mapbox.common.location;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class ExtendedLocationProviderParameters implements Serializable {
    private final Boolean allowUserDefined;
    private final DeviceLocationProviderType deviceLocationProviderType;
    private final String locationProviderName;

    public static final class Builder {
        private Boolean allowUserDefined;
        private DeviceLocationProviderType deviceLocationProviderType;
        private String locationProviderName;

        public Builder allowUserDefined(Boolean bool) {
            this.allowUserDefined = bool;
            return this;
        }

        public ExtendedLocationProviderParameters build() {
            return new ExtendedLocationProviderParameters(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName);
        }

        public Builder deviceLocationProviderType(DeviceLocationProviderType deviceLocationProviderType) {
            this.deviceLocationProviderType = deviceLocationProviderType;
            return this;
        }

        public Builder locationProviderName(String str) {
            this.locationProviderName = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendedLocationProviderParameters extendedLocationProviderParameters = (ExtendedLocationProviderParameters) obj;
        return Objects.equals(this.deviceLocationProviderType, extendedLocationProviderParameters.deviceLocationProviderType) && Objects.equals(this.allowUserDefined, extendedLocationProviderParameters.allowUserDefined) && Objects.equals(this.locationProviderName, extendedLocationProviderParameters.locationProviderName);
    }

    public Boolean getAllowUserDefined() {
        return this.allowUserDefined;
    }

    public DeviceLocationProviderType getDeviceLocationProviderType() {
        return this.deviceLocationProviderType;
    }

    public String getLocationProviderName() {
        return this.locationProviderName;
    }

    public int hashCode() {
        return Objects.hash(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName);
    }

    public Builder toBuilder() {
        return new Builder().deviceLocationProviderType(this.deviceLocationProviderType).allowUserDefined(this.allowUserDefined).locationProviderName(this.locationProviderName);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[deviceLocationProviderType: ");
        sb4.append(RecordUtils.fieldToString(this.deviceLocationProviderType));
        sb4.append(", allowUserDefined: ");
        sb4.append(RecordUtils.fieldToString(this.allowUserDefined));
        sb4.append(", locationProviderName: ");
        return AbstractC3855a.m11826j(this.locationProviderName, "]", sb4);
    }

    private ExtendedLocationProviderParameters(DeviceLocationProviderType deviceLocationProviderType, Boolean bool, String str) {
        this.deviceLocationProviderType = deviceLocationProviderType;
        this.allowUserDefined = bool;
        this.locationProviderName = str;
    }
}
