package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g40.AbstractC15376j4;
import g40.InterfaceC15391m3;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import js2.C21927e;
import l83.C23454a0;
import n00.EnumC26076d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p132f0.InterfaceC13832v0;
import p164g2.C15247s;
import p209i3.C18027i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p291l0.C23016z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.u7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15163u7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56878E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56879F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56880G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56881w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f56882x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f56883y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56884z;

    public C15163u7(Modifier modifier, boolean z4, C1119d c1119d, boolean z13, InterfaceC4339a interfaceC4339a, C37816b c37816b) {
        this.f56884z = modifier;
        this.f56882x = z4;
        this.f56878E = c1119d;
        this.f56883y = z13;
        this.f56879F = interfaceC4339a;
        this.f56880G = c37816b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        EnumC26076d enumC26076d;
        int i13;
        boolean z4;
        switch (this.f56881w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1110b.m3444a((Modifier) this.f56884z, this.f56882x, null, (InterfaceC13832v0) this.f56878E, this.f56883y, new C18027i(4), (InterfaceC4339a) this.f56879F));
                    C2305k c2305k = C2299e.f9111N;
                    C22961h c22961h = AbstractC22977m.f90654e;
                    C37816b c37816b = (C37816b) this.f56880G;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 54);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    c37816b.invoke(C23016z.f90757a, c28655q2, 6);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f56878E;
                if ((iIntValue2 & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        Modifier modifierM3483b = AbstractC1126a.m3483b(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 4, 1), (C15247s) this.f56884z);
                        c28655q = (C28655q) composer2;
                        c28655q.m87150e0(-101211456);
                        zM87153g = c28655q.m87153g(interfaceC28601c1);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            objM87133R = new C21927e(15, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R);
                        }
                        c28655q.m87173q(false);
                        Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM3483b, (Function1) objM87133R);
                        enumC26076d = (EnumC26076d) this.f56879F;
                        if (enumC26076d == EnumC26076d.f103268y) {
                            i13 = 6;
                        } else {
                            i13 = 7;
                        }
                        int i14 = i13;
                        if (this.f56882x || !this.f56883y || enumC26076d == EnumC26076d.f103267x) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        AbstractC15376j4.m43587c((InterfaceC15391m3) this.f56880G, z4, i14, modifierM3484c, null, 0, 0, null, false, false, c28655q, 0, MessageListItemViewType.GIPHY);
                    }
                } else {
                    Modifier modifierM3483b2 = AbstractC1126a.m3483b(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 4, 1), (C15247s) this.f56884z);
                    c28655q = (C28655q) composer2;
                    c28655q.m87150e0(-101211456);
                    zM87153g = c28655q.m87153g(interfaceC28601c1);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C21927e(15, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21927e(15, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM3483b2, (Function1) objM87133R);
                    enumC26076d = (EnumC26076d) this.f56879F;
                    if (enumC26076d == EnumC26076d.f103268y) {
                        i13 = 6;
                    } else {
                        i13 = 7;
                    }
                    int i15 = i13;
                    if (this.f56882x) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    AbstractC15376j4.m43587c((InterfaceC15391m3) this.f56880G, z4, i15, modifierM3484c2, null, 0, 0, null, false, false, c28655q, 0, MessageListItemViewType.GIPHY);
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C15163u7(C15247s c15247s, InterfaceC28601c1 interfaceC28601c1, EnumC26076d enumC26076d, boolean z4, boolean z13, InterfaceC15391m3 interfaceC15391m3) {
        this.f56884z = c15247s;
        this.f56878E = interfaceC28601c1;
        this.f56879F = enumC26076d;
        this.f56882x = z4;
        this.f56883y = z13;
        this.f56880G = interfaceC15391m3;
    }
}
