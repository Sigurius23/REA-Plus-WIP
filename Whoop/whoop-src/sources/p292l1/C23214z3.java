package p292l1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ih0.AbstractC18489d0;
import kx1.C22881b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p027b3.AbstractC2453v1;
import p132f0.C13825t;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28653p1;
import p512u2.AbstractC34452c0;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.z3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23214z3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C13825t f91914E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f91915F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C37816b f91916G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f91917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC17869a1 f91918x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f91919y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f91920z;

    public C23214z3(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, float f13, C13825t c13825t, float f14, C37816b c37816b) {
        this.f91917w = modifier;
        this.f91918x = interfaceC17869a1;
        this.f91919y = j7;
        this.f91920z = f13;
        this.f91914E = c13825t;
        this.f91915F = f14;
        this.f91916G = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        Modifier modifierM67050c = AbstractC23077c4.m67050c(this.f91917w, this.f91918x, AbstractC23077c4.m67051d(this.f91919y, this.f91920z, c28655q), this.f91914E, ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(this.f91915F));
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C22881b(18);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM67050c, false, (Function1) objM87133R);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = C23208y3.f91865w;
            c28655q.m87172p0(objM87133R2);
        }
        Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierM51775c, c23454a0, (PointerInputEventHandler) objM87133R2);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, true);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM108903b);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
        AbstractC18489d0.m53384y(0, this.f91916G, c28655q, true);
        return c23454a0;
    }
}
