package p007a6;

import a63.C0479c;
import bc3.C3000d2;
import e93.AbstractC12889b;
import ec3.C13015a0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fa3.C14328u;
import fc3.AbstractC14371b;
import l83.C23454a0;
import p000.C36623w;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0456u implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1567w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1568x;

    public /* synthetic */ C0456u(Object obj, int i13) {
        this.f1567w = i13;
        this.f1568x = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        switch (this.f1567w) {
            case 0:
                Object objCollect = ((C13015a0) this.f1568x).collect(new C0454t(interfaceC13062m, 0), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            case 1:
                Object objEmit = interfaceC13062m.emit(this.f1568x, interfaceC30057d);
                return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
            case 2:
                C0458v c0458v = new C0458v((Function3) this.f1568x, interfaceC13062m, (InterfaceC30057d) null);
                C3000d2 c3000d2 = new C3000d2(interfaceC30057d.getContext(), interfaceC30057d, 1);
                Object objM36266c0 = AbstractC12889b.m36266c0(c3000d2, true, c3000d2, c0458v);
                return objM36266c0 == EnumC31071a.f128113w ? objM36266c0 : C23454a0.f92919a;
            case 3:
                Object objCollect2 = ((C13084s1) this.f1568x).collect(new C36623w(interfaceC13062m, 7), interfaceC30057d);
                return objCollect2 == EnumC31071a.f128113w ? objCollect2 : C23454a0.f92919a;
            default:
                InterfaceC13058l[] interfaceC13058lArr = (InterfaceC13058l[]) this.f1568x;
                Object objM41038a = AbstractC14371b.m41038a(new C14328u(interfaceC13058lArr, 10), interfaceC13062m, new C0479c(3, 4, (InterfaceC30057d) null), interfaceC30057d, interfaceC13058lArr);
                return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0456u(Function3 function3) {
        this.f1567w = 2;
        this.f1568x = (AbstractC32275i) function3;
    }
}
