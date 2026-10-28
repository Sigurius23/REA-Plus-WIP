package ec3;

import a63.C0493j;
import androidx.room.AbstractC1848z0;
import fc3.AbstractC14371b;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p040c0.C3723a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13060l1 implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45133w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13058l f45134x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC23459e f45135y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f45136z;

    public /* synthetic */ C13060l1(InterfaceC13058l interfaceC13058l, Object obj, InterfaceC23459e interfaceC23459e, int i13) {
        this.f45133w = i13;
        this.f45134x = interfaceC13058l;
        this.f45136z = obj;
        this.f45135y = interfaceC23459e;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C13056k1 c13056k1;
        C13060l1 c13060l1;
        InterfaceC13062m interfaceC13062m2;
        C22669g0 c22669g0;
        int i13 = this.f45133w;
        InterfaceC23459e interfaceC23459e = this.f45135y;
        InterfaceC13058l interfaceC13058l = this.f45134x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f45136z;
        switch (i13) {
            case 0:
                if (interfaceC30057d instanceof C13056k1) {
                    c13056k1 = (C13056k1) interfaceC30057d;
                    int i14 = c13056k1.f45125x;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c13056k1.f45125x = i14 - Integer.MIN_VALUE;
                    } else {
                        c13056k1 = new C13056k1(this, interfaceC30057d);
                    }
                } else {
                    c13056k1 = new C13056k1(this, interfaceC30057d);
                }
                Object obj2 = c13056k1.f45124w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c13056k1.f45125x;
                if (i15 == 0) {
                    C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj2);
                    c22669g0M32004w.f89336w = obj;
                    c13056k1.f45127z = this;
                    c13056k1.f45122E = interfaceC13062m;
                    c13056k1.f45123F = c22669g0M32004w;
                    c13056k1.f45125x = 1;
                    if (interfaceC13062m.emit(obj, c13056k1) != enumC31071a) {
                        c13060l1 = this;
                        interfaceC13062m2 = interfaceC13062m;
                        c22669g0 = c22669g0M32004w;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                    return c23454a0;
                }
                c22669g0 = c13056k1.f45123F;
                interfaceC13062m2 = c13056k1.f45122E;
                c13060l1 = c13056k1.f45127z;
                AbstractC34132o.m107864I(obj2);
                InterfaceC13058l interfaceC13058l2 = c13060l1.f45134x;
                C3723a0 c3723a0 = new C3723a0(c22669g0, (Function3) c13060l1.f45135y, interfaceC13062m2, 4);
                c13056k1.f45127z = null;
                c13056k1.f45122E = null;
                c13056k1.f45123F = null;
                c13056k1.f45125x = 2;
                if (interfaceC13058l2.collect(c3723a0, c13056k1) != enumC31071a) {
                    return c23454a0;
                }
                return enumC31071a;
            case 1:
                Object objM41038a = AbstractC14371b.m41038a(C13068n1.f45159w, interfaceC13062m, new C0493j((Function3) interfaceC23459e, (InterfaceC30057d) null), interfaceC30057d, new InterfaceC13058l[]{interfaceC13058l, (InterfaceC13058l) obj});
                return objM41038a == EnumC31071a.f128113w ? objM41038a : c23454a0;
            default:
                Object objCollect = interfaceC13058l.collect(new C3723a0(interfaceC13062m, (AbstractC1848z0) obj, (Function1) interfaceC23459e, 6), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : c23454a0;
        }
    }

    public C13060l1(Object obj, InterfaceC13058l interfaceC13058l, Function3 function3) {
        this.f45133w = 0;
        this.f45136z = obj;
        this.f45134x = interfaceC13058l;
        this.f45135y = function3;
    }
}
