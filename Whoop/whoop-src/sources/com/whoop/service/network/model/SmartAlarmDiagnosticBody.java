package com.whoop.service.network.model;

import com.google.gson.annotations.SerializedName;
import f82.EnumC14250a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, m65681d2 = {"Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;", "", "Lf82/a;", "eventType", "Lcom/whoop/service/network/model/MobileEventMetaData;", "mobileEventMetadata", "", "alarmTrigger", "", "timestamp", "<init>", "(Lf82/a;Lcom/whoop/service/network/model/MobileEventMetaData;Ljava/lang/String;J)V", "component1", "()Lf82/a;", "component2", "()Lcom/whoop/service/network/model/MobileEventMetaData;", "component3", "()Ljava/lang/String;", "component4", "()J", "copy", "(Lf82/a;Lcom/whoop/service/network/model/MobileEventMetaData;Ljava/lang/String;J)Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf82/a;", "getEventType", "Lcom/whoop/service/network/model/MobileEventMetaData;", "getMobileEventMetadata", "Ljava/lang/String;", "getAlarmTrigger", "J", "getTimestamp", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SmartAlarmDiagnosticBody {
    public static final int $stable = 0;

    @SerializedName("alarm_trigger")
    private final String alarmTrigger;

    @SerializedName("event_type")
    private final EnumC14250a eventType;

    @SerializedName("mobile_event_metadata")
    private final MobileEventMetaData mobileEventMetadata;

    @SerializedName("timestamp")
    private final long timestamp;

    public SmartAlarmDiagnosticBody(EnumC14250a eventType, MobileEventMetaData mobileEventMetadata, String str, long j7) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(mobileEventMetadata, "mobileEventMetadata");
        this.eventType = eventType;
        this.mobileEventMetadata = mobileEventMetadata;
        this.alarmTrigger = str;
        this.timestamp = j7;
    }

    public static /* synthetic */ SmartAlarmDiagnosticBody copy$default(SmartAlarmDiagnosticBody smartAlarmDiagnosticBody, EnumC14250a enumC14250a, MobileEventMetaData mobileEventMetaData, String str, long j7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC14250a = smartAlarmDiagnosticBody.eventType;
        }
        if ((i13 & 2) != 0) {
            mobileEventMetaData = smartAlarmDiagnosticBody.mobileEventMetadata;
        }
        if ((i13 & 4) != 0) {
            str = smartAlarmDiagnosticBody.alarmTrigger;
        }
        if ((i13 & 8) != 0) {
            j7 = smartAlarmDiagnosticBody.timestamp;
        }
        String str2 = str;
        return smartAlarmDiagnosticBody.copy(enumC14250a, mobileEventMetaData, str2, j7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC14250a getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MobileEventMetaData getMobileEventMetadata() {
        return this.mobileEventMetadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlarmTrigger() {
        return this.alarmTrigger;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final SmartAlarmDiagnosticBody copy(EnumC14250a eventType, MobileEventMetaData mobileEventMetadata, String alarmTrigger, long timestamp) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(mobileEventMetadata, "mobileEventMetadata");
        return new SmartAlarmDiagnosticBody(eventType, mobileEventMetadata, alarmTrigger, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartAlarmDiagnosticBody)) {
            return false;
        }
        SmartAlarmDiagnosticBody smartAlarmDiagnosticBody = (SmartAlarmDiagnosticBody) other;
        return this.eventType == smartAlarmDiagnosticBody.eventType && AbstractC22676k.m65745e(this.mobileEventMetadata, smartAlarmDiagnosticBody.mobileEventMetadata) && AbstractC22676k.m65745e(this.alarmTrigger, smartAlarmDiagnosticBody.alarmTrigger) && this.timestamp == smartAlarmDiagnosticBody.timestamp;
    }

    public final String getAlarmTrigger() {
        return this.alarmTrigger;
    }

    public final EnumC14250a getEventType() {
        return this.eventType;
    }

    public final MobileEventMetaData getMobileEventMetadata() {
        return this.mobileEventMetadata;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (this.mobileEventMetadata.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        String str = this.alarmTrigger;
        return Long.hashCode(this.timestamp) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "SmartAlarmDiagnosticBody(eventType=" + this.eventType + ", mobileEventMetadata=" + this.mobileEventMetadata + ", alarmTrigger=" + this.alarmTrigger + ", timestamp=" + this.timestamp + ")";
    }
}
