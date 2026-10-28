package pu0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pu0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011¨\u0006 "}, m65681d2 = {"Lpu0/a;", "", "", "batterySerial", "", "hardwareFamily", "pcbaRevision", "opticalRevision", "firmwareMajor", "firmwareMinor", "firmwarePoint", "firmwareExtra", "<init>", "(Ljava/lang/String;IIIIIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "f", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "g", "e", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29547a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String batterySerial;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int hardwareFamily;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int pcbaRevision;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int opticalRevision;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int firmwareMajor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int firmwareMinor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int firmwarePoint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int firmwareExtra;

    public C29547a(String batterySerial, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        AbstractC22676k.m65750j(batterySerial, "batterySerial");
        this.batterySerial = batterySerial;
        this.hardwareFamily = i13;
        this.pcbaRevision = i14;
        this.opticalRevision = i15;
        this.firmwareMajor = i16;
        this.firmwareMinor = i17;
        this.firmwarePoint = i18;
        this.firmwareExtra = i19;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBatterySerial() {
        return this.batterySerial;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFirmwareExtra() {
        return this.firmwareExtra;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFirmwareMajor() {
        return this.firmwareMajor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFirmwareMinor() {
        return this.firmwareMinor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFirmwarePoint() {
        return this.firmwarePoint;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29547a)) {
            return false;
        }
        C29547a c29547a = (C29547a) other;
        return AbstractC22676k.m65745e(this.batterySerial, c29547a.batterySerial) && this.hardwareFamily == c29547a.hardwareFamily && this.pcbaRevision == c29547a.pcbaRevision && this.opticalRevision == c29547a.opticalRevision && this.firmwareMajor == c29547a.firmwareMajor && this.firmwareMinor == c29547a.firmwareMinor && this.firmwarePoint == c29547a.firmwarePoint && this.firmwareExtra == c29547a.firmwareExtra;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHardwareFamily() {
        return this.hardwareFamily;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOpticalRevision() {
        return this.opticalRevision;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getPcbaRevision() {
        return this.pcbaRevision;
    }

    public int hashCode() {
        return Integer.hashCode(this.firmwareExtra) + AbstractC11266d.m30448b(this.firmwarePoint, AbstractC11266d.m30448b(this.firmwareMinor, AbstractC11266d.m30448b(this.firmwareMajor, AbstractC11266d.m30448b(this.opticalRevision, AbstractC11266d.m30448b(this.pcbaRevision, AbstractC11266d.m30448b(this.hardwareFamily, this.batterySerial.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.batterySerial;
        int i13 = this.hardwareFamily;
        int i14 = this.pcbaRevision;
        int i15 = this.opticalRevision;
        int i16 = this.firmwareMajor;
        int i17 = this.firmwareMinor;
        int i18 = this.firmwarePoint;
        int i19 = this.firmwareExtra;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "BatteryMetaData(batterySerial=", str, ", hardwareFamily=", ", pcbaRevision=");
        AbstractC30802r.m94773v(sbM30467u, i14, ", opticalRevision=", i15, ", firmwareMajor=");
        AbstractC30802r.m94773v(sbM30467u, i16, ", firmwareMinor=", i17, ", firmwarePoint=");
        return AbstractC26725a.m79505i(sbM30467u, i18, ", firmwareExtra=", i19, ")");
    }
}
