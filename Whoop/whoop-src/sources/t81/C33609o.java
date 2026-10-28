package t81;

import c93.InterfaceC4352n;
import p390p1.InterfaceC28601c1;
import u81.C34637b;
import u81.C34639d;

/* JADX INFO: renamed from: t81.o */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33609o implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f140268E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC28601c1 f140269F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140270w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f140271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f140272y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f140273z;

    public /* synthetic */ C33609o(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, int i13) {
        this.f140270w = i13;
        this.f140271x = interfaceC28601c1;
        this.f140272y = interfaceC28601c2;
        this.f140273z = interfaceC28601c3;
        this.f140268E = interfaceC28601c4;
        this.f140269F = interfaceC28601c5;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f140270w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                return AbstractC33606l.c.m106183d(this.f140271x, this.f140272y, this.f140273z, this.f140268E, this.f140269F, (C34639d) obj, (C34637b) obj2, zBooleanValue, zBooleanValue2);
            default:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                return AbstractC33606l.m106126E(this.f140271x, this.f140272y, this.f140273z, this.f140268E, this.f140269F, (C34639d) obj, (C34637b) obj2, zBooleanValue3, zBooleanValue4);
        }
    }
}
