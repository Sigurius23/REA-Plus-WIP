package i20;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import c93.InterfaceC4339a;
import d40.AbstractC11673r;
import g40.C15369i3;
import h20.C16665h1;
import p163g1.AbstractC14981d1;
import p163g1.C14970c1;
import p390p1.C28635l;
import p390p1.C28655q;
import p522uf.AbstractC34870c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: i20.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17926a0 implements InterfaceC17929b0 {
    public static final Parcelable.Creator<C17926a0> CREATOR = new C17925a(11);

    /* JADX INFO: renamed from: w */
    public final C16665h1 f69673w;

    public C17926a0(C16665h1 appearance) {
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f69673w = appearance;
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: B */
    public final void mo51567B(boolean z4, InterfaceC4339a onBack, Composer composer, int i13) {
        AbstractC22676k.m65750j(onBack, "onBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1859306165);
        c28655q.m87150e0(-548047581);
        boolean z13 = (((i13 & 112) ^ 48) > 32 && c28655q.m87153g(onBack)) || (i13 & 48) == 32;
        Object objM87133R = c28655q.m87133R();
        if (z13 || objM87133R == C28635l.f115821a) {
            objM87133R = new C15369i3(onBack, 18);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        AbstractC32411b.m101083a(z4, (InterfaceC4339a) objM87133R, c28655q, i13 & 14);
        c28655q.m87173q(false);
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: d0 */
    public final long mo51568d0(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-252909403);
        long jM43093h = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43093h();
        c28655q.m87173q(false);
        return jM43093h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: e0 */
    public final void mo51569e0() {
        AbstractC34870c0.m109996f0(this.f69673w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17926a0) && AbstractC22676k.m65745e(this.f69673w, ((C17926a0) obj).f69673w);
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: h0 */
    public final void mo51570h0(C37816b c37816b, C28655q c28655q) {
        c28655q.m87150e0(1625248733);
        AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-806558713, c28655q, new C2567l4(c37816b, 14)), c28655q, 12582912, 127);
        c28655q.m87173q(false);
    }

    public final int hashCode() {
        return this.f69673w.hashCode();
    }

    public final String toString() {
        return "PaymentElement(appearance=" + this.f69673w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f69673w.writeToParcel(dest, i13);
    }
}
