package p208i2;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import p088dc.AbstractC11895b;
import p181h2.C16617b;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i2.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17878d1 extends AbstractC17922y0 {

    /* JADX INFO: renamed from: f */
    public final List f69562f;

    /* JADX INFO: renamed from: g */
    public final List f69563g;

    public C17878d1(List list, ArrayList arrayList) {
        this.f69562f = list;
        this.f69563g = arrayList;
    }

    @Override // p208i2.AbstractC17922y0
    /* JADX INFO: renamed from: b */
    public final Shader mo29549b(long j7) {
        long jM60656L = AbstractC21598x.m60656L(j7);
        List list = this.f69562f;
        List list2 = this.f69563g;
        AbstractC17918w0.m51511M(list, list2);
        return new SweepGradient(Float.intBitsToFloat((int) (jM60656L >> 32)), Float.intBitsToFloat((int) (jM60656L & 4294967295L)), AbstractC17918w0.m51537y(list), AbstractC17918w0.m51538z(list2, list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17878d1)) {
            return false;
        }
        C17878d1 c17878d1 = (C17878d1) obj;
        return C16617b.m47187c(9205357640488583168L, 9205357640488583168L) && this.f69562f.equals(c17878d1.f69562f) && AbstractC22676k.m65745e(this.f69563g, c17878d1.f69563g);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Long.hashCode(9205357640488583168L) * 31, 31, this.f69562f);
        List list = this.f69563g;
        return iM31983b + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("SweepGradient(", "", "colors=");
        sbM53375p.append(this.f69562f);
        sbM53375p.append(", stops=");
        return AbstractC17176i.m48506h(sbM53375p, this.f69563g, ')');
    }
}
