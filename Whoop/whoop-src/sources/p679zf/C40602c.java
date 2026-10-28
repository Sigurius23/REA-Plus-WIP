package p679zf;

import bc3.AbstractC3006f0;
import bc3.C3031l1;
import bc3.InterfaceC3061u;
import c93.InterfaceC4339a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: zf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C40602c {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f174958b = AtomicReferenceFieldUpdater.newUpdater(C40602c.class, Object.class, "a");

    /* JADX INFO: renamed from: a */
    public volatile /* synthetic */ Object f174959a;

    /* JADX INFO: renamed from: a */
    public final void m131679a() {
        InterfaceC3061u interfaceC3061u = (InterfaceC3061u) f174958b.getAndSet(this, null);
        if (interfaceC3061u != null) {
            interfaceC3061u.complete();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m131680b(InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) {
        C40600a c40600a;
        if (abstractC32269c instanceof C40600a) {
            c40600a = (C40600a) abstractC32269c;
            int i13 = c40600a.f174953y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40600a.f174953y = i13 - Integer.MIN_VALUE;
            } else {
                c40600a = new C40600a(this, abstractC32269c);
            }
        } else {
            c40600a = new C40600a(this, abstractC32269c);
        }
        Object objM131681c = c40600a.f174951w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c40600a.f174953y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM131681c);
            c40600a.f174953y = 1;
            objM131681c = m131681c(interfaceC4339a, c40600a);
            if (objM131681c == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM131681c);
        }
        boolean zBooleanValue = ((Boolean) objM131681c).booleanValue();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zBooleanValue) {
            return c23454a0;
        }
        m131679a();
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m131681c(InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) {
        C40601b c40601b;
        int i13;
        if (abstractC32269c instanceof C40601b) {
            c40601b = (C40601b) abstractC32269c;
            int i14 = c40601b.f174957z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c40601b.f174957z = i14 - Integer.MIN_VALUE;
            } else {
                c40601b = new C40601b(this, abstractC32269c);
            }
        } else {
            c40601b = new C40601b(this, abstractC32269c);
        }
        Object obj = c40601b.f174955x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c40601b.f174957z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            C3031l1 c3031l1M8709c = AbstractC3006f0.m8709c();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f174958b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, c3031l1M8709c)) {
                    if (((Boolean) interfaceC4339a.invoke()).booleanValue()) {
                        c40601b.f174954w = 1;
                        c40601b.f174957z = 1;
                        if (c3031l1M8709c.join(c40601b) != enumC31071a) {
                            i13 = 1;
                            break;
                        }
                        return enumC31071a;
                    }
                } else if (atomicReferenceFieldUpdater.get(this) != null) {
                }
                i13 = 0;
                break;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c40601b.f174954w;
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.valueOf(i13 != 0);
    }
}
