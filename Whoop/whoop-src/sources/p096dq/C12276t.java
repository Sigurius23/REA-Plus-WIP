package p096dq;

import com.google.android.gms.common.api.InterfaceC4972c;
import java.util.Arrays;
import p077d0.C11387o2;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: dq.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12276t implements InterfaceC4972c {

    /* JADX INFO: renamed from: w */
    public final int f41105w;

    public C12276t(C11387o2 c11387o2) {
        this.f41105w = c11387o2.f36515x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12276t) || !AbstractC35135w.m111097i(Integer.valueOf(this.f41105w), Integer.valueOf(((C12276t) obj).f41105w)) || !AbstractC35135w.m111097i(1, 1) || !AbstractC35135w.m111097i(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return AbstractC35135w.m111097i(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41105w), 1, null, Boolean.TRUE});
    }
}
