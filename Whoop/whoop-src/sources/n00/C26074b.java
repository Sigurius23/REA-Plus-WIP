package n00;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ch.C4599t;
import d30.C11518b0;
import d40.EnumC11668m;
import g00.AbstractC14930a;
import g40.C15454z1;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import p026b2.C2314t;
import p027b3.InterfaceC2464x2;
import p163g1.C15001f;
import p164g2.C15247s;
import p291l0.InterfaceC23013y;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: n00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26074b implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC15391m3 f103249E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15247s f103250F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f103251G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C15454z1 f103252H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC15391m3 f103253I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C26075c f103254w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f103255x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f103256y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2464x2 f103257z;

    public C26074b(C26075c c26075c, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC2464x2 interfaceC2464x2, InterfaceC15391m3 interfaceC15391m3, C15247s c15247s, Function1 function1, C15454z1 c15454z1, InterfaceC15391m3 interfaceC15391m4) {
        this.f103254w = c26075c;
        this.f103255x = z4;
        this.f103256y = interfaceC4339a;
        this.f103257z = interfaceC2464x2;
        this.f103249E = interfaceC15391m3;
        this.f103250F = c15247s;
        this.f103251G = function1;
        this.f103252H = c15454z1;
        this.f103253I = interfaceC15391m4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C26075c c26075c;
        boolean z4;
        boolean z13;
        InterfaceC23013y ScrollableTopLevelColumn = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(ScrollableTopLevelColumn) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                int i13 = iIntValue & 14;
                AbstractC32411b.m101105q(ScrollableTopLevelColumn, composer, i13);
                EnumC11668m enumC11668m = EnumC11668m.f37665w;
                C15247s c15247s = this.f103250F;
                c26075c = this.f103254w;
                AbstractC14930a.m43026a(enumC11668m, AbstractC37817c.m121344e(-1596536181, composer, new C15001f(c26075c, this.f103249E, c15247s, 10)), composer, 54, 0);
                if (c26075c.f103265h != null || c26075c.f103262e == EnumC26076d.f103267x) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                C2314t c2314t = C2314t.f9131w;
                int i14 = i13 | 1573248;
                AbstractC1090b.m3350e(ScrollableTopLevelColumn, z4, AbstractC1102d.m3409f(1.0f, c2314t), null, null, null, AbstractC37817c.m121344e(24485352, composer, new C11518b0(5, c26075c, this.f103251G)), composer, i14, 28);
                if (!this.f103255x || c26075c.f103264g == null) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AbstractC1090b.m3350e(ScrollableTopLevelColumn, z13, AbstractC1102d.m3409f(1.0f, c2314t), null, null, null, AbstractC37817c.m121344e(512474193, composer, new C26073a(c26075c, 1)), composer, i14, 28);
                AbstractC1090b.m3350e(ScrollableTopLevelColumn, this.f103255x, null, null, null, null, AbstractC37817c.m121344e(1285516144, composer, new C4599t(this.f103252H, this.f103253I, c26075c, 4)), composer, i13 | 1572864, 30);
                AbstractC32411b.m101104p(this.f103255x, this.f103254w, this.f103256y, this.f103257z, composer, 0);
            }
        } else {
            int i15 = iIntValue & 14;
            AbstractC32411b.m101105q(ScrollableTopLevelColumn, composer, i15);
            EnumC11668m enumC11668m2 = EnumC11668m.f37665w;
            C15247s c15247s2 = this.f103250F;
            c26075c = this.f103254w;
            AbstractC14930a.m43026a(enumC11668m2, AbstractC37817c.m121344e(-1596536181, composer, new C15001f(c26075c, this.f103249E, c15247s2, 10)), composer, 54, 0);
            if (c26075c.f103265h != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            C2314t c2314t2 = C2314t.f9131w;
            int i16 = i15 | 1573248;
            AbstractC1090b.m3350e(ScrollableTopLevelColumn, z4, AbstractC1102d.m3409f(1.0f, c2314t2), null, null, null, AbstractC37817c.m121344e(24485352, composer, new C11518b0(5, c26075c, this.f103251G)), composer, i16, 28);
            if (this.f103255x) {
                z13 = false;
            } else {
                z13 = false;
            }
            AbstractC1090b.m3350e(ScrollableTopLevelColumn, z13, AbstractC1102d.m3409f(1.0f, c2314t2), null, null, null, AbstractC37817c.m121344e(512474193, composer, new C26073a(c26075c, 1)), composer, i16, 28);
            AbstractC1090b.m3350e(ScrollableTopLevelColumn, this.f103255x, null, null, null, null, AbstractC37817c.m121344e(1285516144, composer, new C4599t(this.f103252H, this.f103253I, c26075c, 4)), composer, i15 | 1572864, 30);
            AbstractC32411b.m101104p(this.f103255x, this.f103254w, this.f103256y, this.f103257z, composer, 0);
        }
        return C23454a0.f92919a;
    }
}
