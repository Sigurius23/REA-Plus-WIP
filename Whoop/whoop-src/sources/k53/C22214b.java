package k53;

import java.util.Arrays;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k53.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C22214b {

    /* JADX INFO: renamed from: a */
    public final long[] f86568a = {0, 1000, 500, 1000};

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C22214b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type io.getstream.video.android.core.sounds.RingingCallVibrationConfig");
        return Arrays.equals(this.f86568a, ((C22214b) obj).f86568a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f86568a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return AbstractC11895b.m31996o("RingingCallVibrationConfig(vibratePattern=", Arrays.toString(this.f86568a), ", enabled=false)");
    }
}
