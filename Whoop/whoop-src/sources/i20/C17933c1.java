package i20;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C15033h9;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.InterfaceC15237i;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i20.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17933c1 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f69696E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f69697F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f69698G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f69699H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f69700I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69701w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f69702x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f69703y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f69704z;

    public /* synthetic */ C17933c1(String str, C37816b c37816b, C37816b c37816b2, C37816b c37816b3, String str2, boolean z4, InterfaceC15237i interfaceC15237i, InterfaceC4339a interfaceC4339a, int i13) {
        this.f69701w = i13;
        this.f69702x = str;
        this.f69703y = c37816b;
        this.f69704z = c37816b2;
        this.f69696E = c37816b3;
        this.f69697F = str2;
        this.f69698G = z4;
        this.f69699H = interfaceC15237i;
        this.f69700I = interfaceC4339a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f69701w;
        InterfaceC4351m interfaceC4351m = this.f69696E;
        InterfaceC4351m interfaceC4351m2 = this.f69704z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj4 = this.f69700I;
        Object obj5 = this.f69699H;
        Object obj6 = this.f69703y;
        Object obj7 = this.f69697F;
        Object obj8 = this.f69702x;
        switch (i13) {
            case 0:
                InterfaceC23013y ScrollableColumn = (InterfaceC23013y) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(ScrollableColumn, "$this$ScrollableColumn");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    }
                }
                C11669n c11669n = C11671p.f37680a;
                C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3393o(c22976l1M31081j, c2314t), 0.0f, C11671p.f37685f.f37645b, 0.0f, 0.0f, 13);
                String str = (String) obj8;
                C37816b c37816b = (C37816b) obj6;
                C37816b c37816b2 = (C37816b) interfaceC4351m2;
                C37816b c37816b3 = (C37816b) interfaceC4351m;
                String str2 = (String) obj7;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) obj5;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj4;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer, 0);
                int iM87266t = AbstractC28683x.m87266t(composer);
                C28655q c28655q2 = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q2, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                AbstractC15011f9.m43114b(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 8, 7), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56277d, composer, 48, 0, 65532);
                C23016z c23016z = C23016z.f90757a;
                c37816b.invoke(c23016z, composer, 6);
                c37816b2.invoke(c23016z, composer, 6);
                c37816b3.invoke(c23016z, composer, 6);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 16, 1);
                c28655q2.m87150e0(1192580623);
                boolean zM87157i = c28655q2.m87157i(interfaceC15237i) | c28655q2.m87153g(interfaceC4339a);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C17930b1(interfaceC15237i, interfaceC4339a, 1);
                    c28655q2.m87172p0(objM87133R);
                }
                c28655q2.m87173q(false);
                AbstractC20301a.m56341i(str2, this.f69698G, (InterfaceC4339a) objM87133R, modifierM3396r, false, false, false, null, composer, 3072, 240);
                c28655q2.m87173q(true);
                break;
            case 1:
                InterfaceC22973k1 it = (InterfaceC22973k1) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(it, "it");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(it) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    AbstractC17960l1.m51583j(AbstractC1099a.m3393o(it, C2314t.f9131w), null, AbstractC37817c.m121344e(1302516336, composer2, new C17933c1((String) obj8, (C37816b) obj6, (C37816b) interfaceC4351m2, (C37816b) interfaceC4351m, (String) obj7, this.f69698G, (InterfaceC15237i) obj5, (InterfaceC4339a) obj4, 0)), composer2, 384);
                } else {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (!c28655q3.m87121F()) {
                        AbstractC17960l1.m51583j(AbstractC1099a.m3393o(it, C2314t.f9131w), null, AbstractC37817c.m121344e(1302516336, composer2, new C17933c1((String) obj8, (C37816b) obj6, (C37816b) interfaceC4351m2, (C37816b) interfaceC4351m, (String) obj7, this.f69698G, (InterfaceC15237i) obj5, (InterfaceC4339a) obj4, 0)), composer2, 384);
                    } else {
                        c28655q3.m87138X();
                    }
                }
                break;
            default:
                InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87157i(interfaceC4351m3) ? 4 : 2;
                }
                C28655q c28655q4 = (C28655q) composer3;
                if (!c28655q4.m87135U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c28655q4.m87138X();
                } else {
                    C15043i8.f56313a.m43133c(((C29891y) obj8).f122125a.f92135x, interfaceC4351m3, this.f69698G, false, (InterfaceC29873g0) obj7, (InterfaceC21083i) obj6, null, this.f69704z, this.f69696E, (InterfaceC17869a1) obj5, (C15197y1) obj4, null, c28655q4, (iIntValue3 << 3) & 112, 24576, DfuBaseService.ERROR_REMOTE_MASK);
                }
                break;
        }
        return c23454a0;
    }

    public C17933c1(C29891y c29891y, boolean z4, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1) {
        this.f69701w = 2;
        this.f69702x = c29891y;
        this.f69698G = z4;
        this.f69697F = interfaceC29873g0;
        this.f69703y = interfaceC21083i;
        this.f69704z = interfaceC4351m;
        this.f69696E = interfaceC4351m2;
        this.f69699H = interfaceC17869a1;
        this.f69700I = c15197y1;
    }
}
