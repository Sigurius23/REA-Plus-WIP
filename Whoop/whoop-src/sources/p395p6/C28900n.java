package p395p6;

import bc3.C3033m;
import bc3.InterfaceC3025k;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import java.util.concurrent.atomic.AtomicReference;
import p000.C31931s;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C28900n implements InterfaceC30061h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AtomicReference f116981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC11936u f116982x;

    public C28900n(AtomicReference atomicReference, InterfaceC11936u interfaceC11936u) {
        this.f116981w = atomicReference;
        this.f116982x = interfaceC11936u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m87818a(InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C28897m c28897m;
        if (abstractC32269c instanceof C28897m) {
            c28897m = (C28897m) abstractC32269c;
            int i13 = c28897m.f116974z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28897m.f116974z = i13 - Integer.MIN_VALUE;
            } else {
                c28897m = new C28897m(this, abstractC32269c);
            }
        } else {
            c28897m = new C28897m(this, abstractC32269c);
        }
        Object obj = c28897m.f116972x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28897m.f116974z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c28897m.f116971w = interfaceC4351m;
            c28897m.f116974z = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c28897m));
            c3033m.m8774s();
            InterfaceC11936u interfaceC11936u = this.f116982x;
            c3033m.m8776u(new C31931s(interfaceC11936u, 16));
            InterfaceC3025k interfaceC3025k = (InterfaceC3025k) this.f116981w.getAndSet(c3033m);
            if (interfaceC3025k != null) {
                interfaceC3025k.cancel(null);
            }
            ((C11935t) interfaceC11936u).mo32218s(interfaceC4351m);
            if (c3033m.m8773r() == enumC31071a) {
                return;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public InterfaceC30062i getKey() {
        return C28918t.f117028w;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
