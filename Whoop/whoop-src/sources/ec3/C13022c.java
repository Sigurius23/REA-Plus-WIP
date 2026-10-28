package ec3;

import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import fc3.AbstractC14373d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C13022c extends C13042h {

    /* JADX INFO: renamed from: F */
    public final AbstractC32275i f45020F;

    /* JADX WARN: Multi-variable type inference failed */
    public C13022c(InterfaceC4351m interfaceC4351m, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        super(interfaceC4351m, interfaceC30063j, i13, enumC11916a);
        this.f45020F = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.C13042h, fc3.AbstractC14373d
    /* JADX INFO: renamed from: e */
    public final Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d) {
        C13018b c13018b;
        if (interfaceC30057d instanceof C13018b) {
            c13018b = (C13018b) interfaceC30057d;
            int i13 = c13018b.f45008z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13018b.f45008z = i13 - Integer.MIN_VALUE;
            } else {
                c13018b = new C13018b(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c13018b = new C13018b(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c13018b.f45006x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13018b.f45008z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c13018b.f45005w = interfaceC11936u;
            c13018b.f45008z = 1;
            if (super.mo36558e(interfaceC11936u, c13018b) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11936u = c13018b.f45005w;
            AbstractC34132o.m107864I(obj);
        }
        if (((C11935t) interfaceC11936u).f39041z.m32222x()) {
            return C23454a0.f92919a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c93.m, s83.i] */
    @Override // ec3.C13042h, fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public final AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return new C13022c(this.f45020F, interfaceC30063j, i13, enumC11916a);
    }
}
