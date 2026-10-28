package n53;

import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: n53.a2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26307a2 implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f104541w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13058l f104542x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f104543y;

    public /* synthetic */ C26307a2(int i13, InterfaceC13037f2 interfaceC13037f2, Function1 function1) {
        this.f104541w = i13;
        this.f104542x = interfaceC13037f2;
        this.f104543y = function1;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        switch (this.f104541w) {
            case 0:
                Object objCollect = this.f104542x.collect(new C26383z1(interfaceC13062m, this.f104543y, 0), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            default:
                Object objCollect2 = this.f104542x.collect(new C26383z1(interfaceC13062m, this.f104543y, 1), interfaceC30057d);
                return objCollect2 == EnumC31071a.f128113w ? objCollect2 : C23454a0.f92919a;
        }
    }
}
