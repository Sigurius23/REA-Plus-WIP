package i20;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import b30.C2567l4;
import c93.InterfaceC4339a;
import g00.AbstractC14936g;
import g00.C14931b;
import g40.C15369i3;
import h00.C16508j;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: i20.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C17989z implements InterfaceC17929b0 {

    /* JADX INFO: renamed from: w */
    public static final C17989z f69832w = new C17989z();
    public static final Parcelable.Creator<C17989z> CREATOR = new C17925a(10);

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: B */
    public final void mo51567B(boolean z4, InterfaceC4339a onBack, Composer composer, int i13) {
        AbstractC22676k.m65750j(onBack, "onBack");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1210515695);
        boolean z13 = true;
        C16508j c16508j = new C16508j(false, !z4, null, false);
        c28655q.m87150e0(1091838719);
        if ((((i13 & 112) ^ 48) <= 32 || !c28655q.m87153g(onBack)) && (i13 & 48) != 32) {
            z13 = false;
        }
        Object objM87133R = c28655q.m87133R();
        if (z13 || objM87133R == C28635l.f115821a) {
            objM87133R = new C15369i3(onBack, 17);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        AbstractC32411b.m101097i(c16508j, null, (InterfaceC4339a) objM87133R, c28655q, 0);
        c28655q.m87173q(false);
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: d0 */
    public final long mo51568d0(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(491402441);
        c28655q.m87150e0(-443512897);
        C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
        c28655q.m87173q(false);
        long j7 = c14931b.f55663b;
        c28655q.m87173q(false);
        return j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: e0 */
    public final void mo51569e0() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C17989z);
    }

    @Override // i20.InterfaceC17929b0
    /* JADX INFO: renamed from: h0 */
    public final void mo51570h0(C37816b c37816b, C28655q c28655q) {
        c28655q.m87150e0(418825729);
        AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(368993405, c28655q, new C2567l4(c37816b, 13)), c28655q, 48);
        c28655q.m87173q(false);
    }

    public final int hashCode() {
        return 367777705;
    }

    public final String toString() {
        return "Link";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
