package t23;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33451s1 {

    /* JADX INFO: renamed from: a */
    public final CameraEnumerationAndroid.CaptureFormat f139690a;

    /* JADX INFO: renamed from: b */
    public final List f139691b;

    /* JADX INFO: renamed from: c */
    public final CameraEnumerationAndroid.CaptureFormat f139692c;

    /* JADX INFO: renamed from: d */
    public final String f139693d;

    /* JADX INFO: renamed from: e */
    public final String f139694e;

    /* JADX INFO: renamed from: f */
    public final String f139695f;

    public C33451s1(CameraEnumerationAndroid.CaptureFormat captureFormat, List list, CameraEnumerationAndroid.CaptureFormat captureFormat2, String str, String str2, String deviceModel) {
        AbstractC22676k.m65750j(deviceModel, "deviceModel");
        this.f139690a = captureFormat;
        this.f139691b = list;
        this.f139692c = captureFormat2;
        this.f139693d = str;
        this.f139694e = str2;
        this.f139695f = deviceModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33451s1)) {
            return false;
        }
        C33451s1 c33451s1 = (C33451s1) obj;
        return AbstractC22676k.m65745e(this.f139690a, c33451s1.f139690a) && AbstractC22676k.m65745e(this.f139691b, c33451s1.f139691b) && AbstractC22676k.m65745e(this.f139692c, c33451s1.f139692c) && this.f139693d.equals(c33451s1.f139693d) && this.f139694e.equals(c33451s1.f139694e) && AbstractC22676k.m65745e(this.f139695f, c33451s1.f139695f);
    }

    public final int hashCode() {
        CameraEnumerationAndroid.CaptureFormat captureFormat = this.f139690a;
        int iHashCode = (captureFormat == null ? 0 : captureFormat.hashCode()) * 31;
        List list = this.f139691b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.f139692c;
        return this.f139695f.hashCode() + ((((this.f139694e.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (captureFormat2 != null ? captureFormat2.hashCode() : 0)) * 31, 31, this.f139693d)) * 31) + 1446855205) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LocalStats(resolution=");
        sb4.append(this.f139690a);
        sb4.append(", availableResolutions=");
        sb4.append(this.f139691b);
        sb4.append(", maxResolution=");
        sb4.append(this.f139692c);
        sb4.append(", sfu=");
        sb4.append(this.f139693d);
        sb4.append(", os=");
        return AbstractC11266d.m30464r(sb4, this.f139694e, ", sdkVersion=1.28.0, deviceModel=", this.f139695f, ")");
    }
}
