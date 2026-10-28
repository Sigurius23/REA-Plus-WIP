package p132f0;

import android.widget.Magnifier;
import e10.C12554k0;

/* JADX INFO: renamed from: f0.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13794i1 extends C12554k0 {
    @Override // e10.C12554k0
    /* JADX INFO: renamed from: O */
    public final void mo35226O(long j7, long j13) {
        Magnifier magnifier = (Magnifier) this.f42881x;
        if (!Float.isNaN(Float.NaN)) {
            magnifier.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j13) != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }
}
