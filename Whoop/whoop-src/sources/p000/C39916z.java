package p000;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import l83.C23454a0;
import ld0.C23854m;
import lf0.AbstractC23899b0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import tk2.InterfaceC33899q;
import w41.C36806f;
import wb3.AbstractC37056f;
import x81.C38072d;
import yk2.AbstractC39614n;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39916z implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f172320E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172321w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f172322x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f172323y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f172324z;

    public /* synthetic */ C39916z(Object obj, float f13, Object obj2, Object obj3, int i13) {
        this.f172321w = i13;
        this.f172323y = obj;
        this.f172322x = f13;
        this.f172324z = obj2;
        this.f172320E = obj3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f172321w) {
            case 0:
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) this.f172323y;
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) this.f172324z;
                C12476e0 c12476e0 = (C12476e0) this.f172320E;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C2306l c2306l = C2299e.f9109L;
                    float f13 = ((C39174f) interfaceC28670t2.getValue()).f168413w;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM107879c = AbstractC34132o.m107879c(((Number) interfaceC28670t3.getValue()).floatValue(), AbstractC1099a.m3392n(c2314t, 0.0f, f13, 1));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM107879c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    String strValueOf = String.valueOf(AbstractC12889b.m36258X(this.f172322x));
                    C38072d c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strValueOf, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN2(), null, c28655q, 0, 0, 196602);
                    AbstractC30795n.m94707h(c12476e0.f42579c, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * 8, 7), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN4(), null, c28655q, 48, 0, 196600);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC23899b0.m70230r((C23854m) this.f172323y, this.f172322x, (InterfaceC28601c1) this.f172324z, (Function1) this.f172320E, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC39614n.m126577f((InterfaceC33899q.b) this.f172323y, this.f172322x, (Modifier) this.f172324z, (C36806f) this.f172320E, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C39916z(InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, float f13, C12476e0 c12476e0) {
        this.f172321w = 0;
        this.f172323y = interfaceC28670t2;
        this.f172324z = interfaceC28670t3;
        this.f172322x = f13;
        this.f172320E = c12476e0;
    }
}
