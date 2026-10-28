package p007a6;

import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.C13079r;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import l73.InterfaceC23413d;
import l83.C23454a0;
import p027b3.C2419o2;
import p249jc.AbstractC21598x;
import p390p1.InterfaceC28661r1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import w73.C36919e;

/* JADX INFO: renamed from: a6.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0466z implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1591w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1592x;

    public /* synthetic */ C0466z(Object obj, int i13) {
        this.f1591w = i13;
        this.f1592x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object objM1110f;
        C13079r c13079r;
        switch (this.f1591w) {
            case 0:
                C0429i0 c0429i0 = (C0429i0) this.f1592x;
                return ((c0429i0.f1477g.m11154C() instanceof C0453s0) || (objM1110f = C0429i0.m1110f(c0429i0, true, interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM1110f;
            case 1:
                ((C2419o2) this.f1592x).f9475w.m87023y(((Number) obj).floatValue());
                return C23454a0.f92919a;
            case 2:
                if (interfaceC30057d instanceof C13079r) {
                    c13079r = (C13079r) interfaceC30057d;
                    int i13 = c13079r.f45195y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c13079r.f45195y = i13 - Integer.MIN_VALUE;
                    } else {
                        c13079r = new C13079r(this, interfaceC30057d);
                    }
                } else {
                    c13079r = new C13079r(this, interfaceC30057d);
                }
                Object obj2 = c13079r.f45193w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c13079r.f45195y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f1592x;
                    if (obj == null) {
                        obj = AbstractC14371b.f52477b;
                    }
                    c13079r.f45195y = 1;
                    if (((C11935t) interfaceC11936u).f39041z.mo32219t(obj, c13079r) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            case 3:
                C36919e c36919e = (C36919e) this.f1592x;
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                    if (!c36919e.m118548a(nullPointerException)) {
                        AbstractC21598x.m60677d0(nullPointerException);
                    }
                } else if (!c36919e.isDisposed()) {
                    ((InterfaceC23413d) c36919e.f157975x).onNext(obj);
                }
                return C23454a0.f92919a;
            default:
                ((InterfaceC28661r1) this.f1592x).setValue(obj);
                return C23454a0.f92919a;
        }
    }
}
