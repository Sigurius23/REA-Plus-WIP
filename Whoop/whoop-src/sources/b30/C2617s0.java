package b30;

import c93.InterfaceC4339a;
import h20.C16687l;
import h20.C16689l1;
import h20.C16698m4;
import h20.C16704n4;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import h20.InterfaceC16728r4;
import hc3.C17171d;
import java.util.Set;
import l83.C23454a0;
import p537ux.InterfaceC35320a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38940r2;
import y00.C38977v3;
import y00.C38995x3;
import y00.C39013z3;
import y00.EnumC38853i;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: b30.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2617s0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10194w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2659y0 f10195x;

    public /* synthetic */ C2617s0(C2659y0 c2659y0, int i13) {
        this.f10194w = i13;
        this.f10195x = c2659y0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f10194w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C2659y0 c2659y0 = this.f10195x;
        switch (i13) {
            case 0:
                Set set = c2659y0.f10395f;
                Function1 function1 = c2659y0.f10403n;
                C16687l c16687l = c2659y0.f10392c;
                C17171d c17171d = c2659y0.f10406q;
                C2519f4 c2519f4 = c2659y0.f10405p;
                InterfaceC35320a interfaceC35320a = c2659y0.f10393d;
                InterfaceC16728r4 interfaceC16728r4 = c16687l.f64179c;
                if (!(interfaceC16728r4 instanceof C16698m4)) {
                    if (!(interfaceC16728r4 instanceof C16704n4)) {
                        throw new IllegalArgumentException("Card or Link payment method required for creating EditCardDetailsInteractor");
                    }
                    InterfaceC38949s2 interfaceC38949s2 = ((C16704n4) interfaceC16728r4).f64231a;
                    C38940r2 c38940r2 = interfaceC38949s2 instanceof C38940r2 ? (C38940r2) interfaceC38949s2 : null;
                    if (c38940r2 == null) {
                        throw new IllegalArgumentException("Link payment method is not a card");
                    }
                    C2540i1 c2540i1 = new C2540i1(c38940r2.f167630z, Integer.valueOf(c38940r2.f167628x), Integer.valueOf(c38940r2.f167629y), c38940r2.f167625E, null, null, null);
                    C2658y c2658y = new C2658y(interfaceC35320a, false, false);
                    EnumC16677j1 enumC16677j1 = EnumC16677j1.f64132x;
                    EnumC16683k1 enumC16683k1 = EnumC16683k1.f64149w;
                    return c2519f4.m7461a(c17171d, c2658y, c2540i1, new C16689l1(enumC16677j1, set), function1, new C2610r0(c2659y0, 1));
                }
                C16698m4 c16698m4 = (C16698m4) interfaceC16728r4;
                boolean z4 = c2659y0.f10396g;
                boolean zM47246d = c16687l.m47246d(z4);
                C39013z3 card = c16698m4.f64222a;
                C38977v3 c38977v3 = c16698m4.f64223b;
                AbstractC22676k.m65750j(card, "card");
                String str = card.f167913H;
                Integer num = card.f167921z;
                Integer num2 = card.f167910E;
                EnumC38853i enumC38853i = card.f167918w;
                String str2 = card.f167917L;
                C38995x3 c38995x3 = card.f167916K;
                C2540i1 c2540i2 = new C2540i1(str, num, num2, enumC38853i, str2, c38995x3 != null ? c38995x3.f167842w : null, c38977v3);
                C2658y c2658y2 = new C2658y(interfaceC35320a, zM47246d && c16687l.m47244b(), zM47246d && z4);
                EnumC16677j1 enumC16677j2 = c2659y0.f10394e;
                EnumC16683k1 enumC16683k2 = EnumC16683k1.f64149w;
                return c2519f4.m7461a(c17171d, c2658y2, c2540i2, new C16689l1(enumC16677j2, set), function1, new C2610r0(c2659y0, 2));
            case 1:
                c2659y0.m7526c(C2529g6.f9832a);
                return c23454a0;
            default:
                c2659y0.m7526c(C2513e6.f9782a);
                return c23454a0;
        }
    }
}
