package vr2;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vr2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lvr2/a;", "", "", "utcStartDateTimeMillis", "utcEndDateTimeMillis", "deviceModel", "deviceOS", "devicePlatform", "uniqueDeviceId", "", "logEvents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUtcStartDateTimeMillis", "b", "getUtcEndDateTimeMillis", "c", "getDeviceModel", "d", "getDeviceOS", "e", "getDevicePlatform", "f", "getUniqueDeviceId", "g", "Ljava/util/List;", "getLogEvents", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36308a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("log_start_time_in_millis")
    private final String utcStartDateTimeMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("log_end_time_in_millis")
    private final String utcEndDateTimeMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("device_model")
    private final String deviceModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("device_os")
    private final String deviceOS;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("device_platform")
    private final String devicePlatform;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("unique_device_id")
    private final String uniqueDeviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("logs")
    private final List<String> logEvents;

    public C36308a(String utcStartDateTimeMillis, String utcEndDateTimeMillis, String deviceModel, String deviceOS, String devicePlatform, String uniqueDeviceId, List<String> logEvents) {
        AbstractC22676k.m65750j(utcStartDateTimeMillis, "utcStartDateTimeMillis");
        AbstractC22676k.m65750j(utcEndDateTimeMillis, "utcEndDateTimeMillis");
        AbstractC22676k.m65750j(deviceModel, "deviceModel");
        AbstractC22676k.m65750j(deviceOS, "deviceOS");
        AbstractC22676k.m65750j(devicePlatform, "devicePlatform");
        AbstractC22676k.m65750j(uniqueDeviceId, "uniqueDeviceId");
        AbstractC22676k.m65750j(logEvents, "logEvents");
        this.utcStartDateTimeMillis = utcStartDateTimeMillis;
        this.utcEndDateTimeMillis = utcEndDateTimeMillis;
        this.deviceModel = deviceModel;
        this.deviceOS = deviceOS;
        this.devicePlatform = devicePlatform;
        this.uniqueDeviceId = uniqueDeviceId;
        this.logEvents = logEvents;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36308a)) {
            return false;
        }
        C36308a c36308a = (C36308a) other;
        return AbstractC22676k.m65745e(this.utcStartDateTimeMillis, c36308a.utcStartDateTimeMillis) && AbstractC22676k.m65745e(this.utcEndDateTimeMillis, c36308a.utcEndDateTimeMillis) && AbstractC22676k.m65745e(this.deviceModel, c36308a.deviceModel) && AbstractC22676k.m65745e(this.deviceOS, c36308a.deviceOS) && AbstractC22676k.m65745e(this.devicePlatform, c36308a.devicePlatform) && AbstractC22676k.m65745e(this.uniqueDeviceId, c36308a.uniqueDeviceId) && AbstractC22676k.m65745e(this.logEvents, c36308a.logEvents);
    }

    public int hashCode() {
        return this.logEvents.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.utcStartDateTimeMillis.hashCode() * 31, 31, this.utcEndDateTimeMillis), 31, this.deviceModel), 31, this.deviceOS), 31, this.devicePlatform), 31, this.uniqueDeviceId);
    }

    public String toString() {
        String str = this.utcStartDateTimeMillis;
        String str2 = this.utcEndDateTimeMillis;
        String str3 = this.deviceModel;
        String str4 = this.deviceOS;
        String str5 = this.devicePlatform;
        String str6 = this.uniqueDeviceId;
        List<String> list = this.logEvents;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JsonLogEvents(utcStartDateTimeMillis=", str, ", utcEndDateTimeMillis=", str2, ", deviceModel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", deviceOS=", str4, ", devicePlatform=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", uniqueDeviceId=", str6, ", logEvents=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }
}
