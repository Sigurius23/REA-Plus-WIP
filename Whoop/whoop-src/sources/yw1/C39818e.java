package yw1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p748zc1.AbstractC40313e4;
import p748zc1.C40324f4;
import uw1.C35310c;
import uw1.C35311d;
import x22.C37864c;
import z22.AbstractC40028g;
import za2.AbstractC40237m;
import za2.C40234j;

/* JADX INFO: renamed from: yw1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39818e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171584w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f171585x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f171586y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f171587z;

    public /* synthetic */ C39818e(Object obj, Object obj2, Object obj3, int i13) {
        this.f171584w = i13;
        this.f171586y = obj;
        this.f171587z = obj2;
        this.f171585x = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f171584w) {
            case 0:
                return AbstractC39821h.m127671g((C35310c.a) this.f171586y, (C35310c) this.f171587z, (Function1) this.f171585x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return AbstractC39822i.m127710s((Function1) this.f171585x, (InterfaceC4339a) this.f171586y, (InterfaceC28601c1) this.f171587z, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC39828o.m127765j((C35311d.a) this.f171586y, (Function1) this.f171585x, (C35311d) this.f171587z, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC40028g.m128320h((C37864c.c) this.f171586y, (C37864c) this.f171587z, (Function1) this.f171585x, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return C40234j.m129209V((C40234j) this.f171586y, (Function1) this.f171585x, (InterfaceC28670t2) this.f171587z, (AbstractC40237m) obj, ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            default:
                return AbstractC40313e4.m129649m((InterfaceC28601c1) this.f171586y, (C40324f4) this.f171587z, (InterfaceC28601c1) this.f171585x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C39818e(Object obj, Function1 function1, Object obj2, int i13) {
        this.f171584w = i13;
        this.f171586y = obj;
        this.f171585x = function1;
        this.f171587z = obj2;
    }

    public /* synthetic */ C39818e(Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        this.f171584w = 1;
        this.f171585x = function1;
        this.f171586y = interfaceC4339a;
        this.f171587z = interfaceC28601c1;
    }
}
