package e81;

import a01.C0088h;
import androidx.compose.runtime.Composer;
import j22.AbstractC21256e;
import l83.C23454a0;
import p114eb.C12982q;
import p181h2.C16617b;
import p512u2.C34472r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import wo1.AbstractC37437a0;

/* JADX INFO: renamed from: e81.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12826f implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43973w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f43974x;

    public /* synthetic */ C12826f(Function1 function1, int i13) {
        this.f43973w = i13;
        this.f43974x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f43973w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC12836k.m35977J(this.f43974x, (C0088h) obj, (Composer) obj2, iIntValue);
            case 1:
                this.f43974x.invoke(new C16617b(((C34472r) obj2).f144817c));
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC21256e.m59604G(this.f43974x, (C12982q) obj, (Composer) obj2, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC21256e.m59606I(this.f43974x, (C12982q) obj, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC37437a0.m119849d(this.f43974x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue4);
        }
    }
}
