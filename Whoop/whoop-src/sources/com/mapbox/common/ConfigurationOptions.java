package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationOptions implements Serializable {
    private final Value data;
    private final String digest;
    private final ConfigurationOptionsSource source;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationOptions(Value value, String str, ConfigurationOptionsSource configurationOptionsSource) {
        this.data = value;
        this.digest = str;
        this.source = configurationOptionsSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationOptions configurationOptions = (ConfigurationOptions) obj;
        return Objects.equals(this.data, configurationOptions.data) && Objects.equals(this.digest, configurationOptions.digest) && Objects.equals(this.source, configurationOptions.source);
    }

    public Value getData() {
        return this.data;
    }

    public String getDigest() {
        return this.digest;
    }

    public ConfigurationOptionsSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.digest, this.source);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[data: ");
        sb4.append(RecordUtils.fieldToString(this.data));
        sb4.append(", digest: ");
        AbstractC3855a.m11838v(this.digest, ", source: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.source));
        sb4.append("]");
        return sb4.toString();
    }
}
