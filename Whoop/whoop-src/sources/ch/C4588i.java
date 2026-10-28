package ch;

import ec3.C13063m0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import p007a6.C0454t;
import p040c0.C3723a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ch.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4588i implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18470w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13058l f18471x;

    public /* synthetic */ C4588i(InterfaceC13058l interfaceC13058l, int i13) {
        this.f18470w = i13;
        this.f18471x = interfaceC13058l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C13063m0 c13063m0;
        AbortFlowException e5;
        Object obj;
        switch (this.f18470w) {
            case 0:
                Object objCollect = this.f18471x.collect(new C0454t(interfaceC13062m, 1), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            case 1:
                if (interfaceC30057d instanceof C13063m0) {
                    c13063m0 = (C13063m0) interfaceC30057d;
                    int i13 = c13063m0.f45141x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c13063m0.f45141x = i13 - Integer.MIN_VALUE;
                    } else {
                        c13063m0 = new C13063m0(this, interfaceC30057d);
                    }
                } else {
                    c13063m0 = new C13063m0(this, interfaceC30057d);
                }
                Object obj2 = c13063m0.f45140w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c13063m0.f45141x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c13063m0.f45143z;
                    try {
                        AbstractC34132o.m107864I(obj2);
                    } catch (AbortFlowException e13) {
                        e5 = e13;
                        if (e5.f89399w != obj) {
                            throw e5;
                        }
                    }
                    break;
                } else {
                    AbstractC34132o.m107864I(obj2);
                    Object obj3 = new Object();
                    C22665e0 c22665e0 = new C22665e0();
                    try {
                        InterfaceC13058l interfaceC13058l = this.f18471x;
                        C3723a0 c3723a0 = new C3723a0(c22665e0, interfaceC13062m, obj3, 3);
                        c13063m0.f45143z = obj3;
                        c13063m0.f45141x = 1;
                        if (interfaceC13058l.collect(c3723a0, c13063m0) == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (AbortFlowException e14) {
                        e5 = e14;
                        obj = obj3;
                        if (e5.f89399w != obj) {
                            throw e5;
                        }
                    }
                }
                return C23454a0.f92919a;
            default:
                Object objCollect2 = this.f18471x.collect(new C0454t(interfaceC13062m, 2), interfaceC30057d);
                return objCollect2 == EnumC31071a.f128113w ? objCollect2 : C23454a0.f92919a;
        }
    }
}
