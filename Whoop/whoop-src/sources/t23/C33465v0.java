package t23;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33465v0 {

    /* JADX INFO: renamed from: a */
    public final String f139733a;

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristics f139734b;

    /* JADX INFO: renamed from: c */
    public final List f139735c;

    /* JADX INFO: renamed from: d */
    public final int f139736d;

    /* JADX INFO: renamed from: e */
    public final AbstractC33480y0 f139737e;

    public C33465v0(String id4, CameraCharacteristics cameraCharacteristics, List list, int i13, AbstractC33480y0 abstractC33480y0) {
        AbstractC22676k.m65750j(id4, "id");
        this.f139733a = id4;
        this.f139734b = cameraCharacteristics;
        this.f139735c = list;
        this.f139736d = i13;
        this.f139737e = abstractC33480y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33465v0)) {
            return false;
        }
        C33465v0 c33465v0 = (C33465v0) obj;
        return AbstractC22676k.m65745e(this.f139733a, c33465v0.f139733a) && AbstractC22676k.m65745e(this.f139734b, c33465v0.f139734b) && AbstractC22676k.m65745e(this.f139735c, c33465v0.f139735c) && this.f139736d == c33465v0.f139736d && AbstractC22676k.m65745e(this.f139737e, c33465v0.f139737e);
    }

    public final int hashCode() {
        int iHashCode = this.f139733a.hashCode() * 31;
        CameraCharacteristics cameraCharacteristics = this.f139734b;
        int iHashCode2 = (iHashCode + (cameraCharacteristics == null ? 0 : cameraCharacteristics.hashCode())) * 31;
        List list = this.f139735c;
        int iM30448b = AbstractC11266d.m30448b(this.f139736d, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
        AbstractC33480y0 abstractC33480y0 = this.f139737e;
        return iM30448b + (abstractC33480y0 != null ? abstractC33480y0.hashCode() : 0);
    }

    public final String toString() {
        return "CameraDeviceWrapped(id=" + this.f139733a + ", characteristics=" + this.f139734b + ", supportedFormats=" + this.f139735c + ", maxResolution=" + this.f139736d + ", direction=" + this.f139737e + ")";
    }
}
