package com.mapbox.common;

import c13.AbstractC3855a;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CrashEvent implements Serializable {
    private final String appStartDate;
    private final HashMap<String, String> customData;
    private final boolean isSilent;
    private final String threadDetails;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CrashEvent(boolean z4, String str, String str2, HashMap<String, String> map) {
        this.isSilent = z4;
        this.threadDetails = str;
        this.appStartDate = str2;
        this.customData = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return this.isSilent == crashEvent.isSilent && Objects.equals(this.threadDetails, crashEvent.threadDetails) && Objects.equals(this.appStartDate, crashEvent.appStartDate) && Objects.equals(this.customData, crashEvent.customData);
    }

    public String getAppStartDate() {
        return this.appStartDate;
    }

    public HashMap<String, String> getCustomData() {
        return this.customData;
    }

    public boolean getIsSilent() {
        return this.isSilent;
    }

    public String getThreadDetails() {
        return this.threadDetails;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSilent), this.threadDetails, this.appStartDate, this.customData);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("[isSilent: ");
        sb4.append(RecordUtils.fieldToString(Boolean.valueOf(this.isSilent)));
        sb4.append(", threadDetails: ");
        AbstractC3855a.m11838v(this.threadDetails, ", appStartDate: ", sb4);
        AbstractC3855a.m11838v(this.appStartDate, ", customData: ", sb4);
        sb4.append(RecordUtils.fieldToString(this.customData));
        sb4.append("]");
        return sb4.toString();
    }
}
