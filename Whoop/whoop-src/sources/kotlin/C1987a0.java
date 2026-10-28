package kotlin;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import cj1.C4753i;
import ej1.AbstractC13252o;
import n71.EnumC26437r;
import ot2.C28334c;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import pt2.AbstractC29530l;
import v41.AbstractC35664f;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.a0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C1987a0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f7858E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f7859F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f7860G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7861w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f7862x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f7863y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f7864z;

    public /* synthetic */ C1987a0(int i13, C4753i.d dVar, InterfaceC25312u interfaceC25312u, Integer num, EnumC26437r enumC26437r, Function1 function1) {
        this.f7861w = 1;
        this.f7862x = i13;
        this.f7864z = dVar;
        this.f7858E = interfaceC25312u;
        this.f7859F = num;
        this.f7860G = enumC26437r;
        this.f7863y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7861w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC1993c0.m6094y((AbstractC39758e.j) this.f7864z, (AbstractC35664f.a) this.f7858E, this.f7862x, (InterfaceC2994c0) this.f7859F, this.f7863y, (InterfaceC28601c1) this.f7860G, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC13252o.m37250m(this.f7862x, (C4753i.d) this.f7864z, (InterfaceC25312u) this.f7858E, (Integer) this.f7859F, (EnumC26437r) this.f7860G, this.f7863y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC29530l.m90301F((C28334c) this.f7864z, (AbstractC35664f.a) this.f7858E, this.f7862x, (InterfaceC2994c0) this.f7859F, this.f7863y, (InterfaceC28601c1) this.f7860G, (InterfaceC23013y) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C1987a0(Object obj, AbstractC35664f.a aVar, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i14) {
        this.f7861w = i14;
        this.f7864z = obj;
        this.f7858E = aVar;
        this.f7862x = i13;
        this.f7859F = interfaceC2994c0;
        this.f7863y = function1;
        this.f7860G = interfaceC28601c1;
    }
}
