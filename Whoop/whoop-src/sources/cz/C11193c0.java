package cz;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import l83.C23454a0;
import l83.C23468n;
import n53.C26318e;
import p000.C12473e;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: cz.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11193c0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35895w;

    /* JADX INFO: renamed from: x */
    public int f35896x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11215n0 f35897y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11193c0(C11215n0 c11215n0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f35895w = i13;
        this.f35897y = c11215n0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f35895w) {
            case 0:
                return new C11193c0(this.f35897y, interfaceC30057d, 0);
            case 1:
                return new C11193c0(this.f35897y, interfaceC30057d, 1);
            case 2:
                return new C11193c0(this.f35897y, interfaceC30057d, 2);
            case 3:
                return new C11193c0(this.f35897y, interfaceC30057d, 3);
            default:
                return new C11193c0(this.f35897y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f35895w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C11193c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM30348a;
        switch (this.f35895w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35896x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f35896x = 1;
                    if (C11215n0.m30335g(this.f35897y, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f35896x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11215n0 c11215n0 = this.f35897y;
                    C26318e c26318e = c11215n0.f35970S;
                    C11195d0 c11195d0 = new C11195d0(c11215n0, (InterfaceC30057d) null, 0);
                    this.f35896x = 1;
                    if (AbstractC13091v.m36604n(c26318e, c11195d0, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f35896x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11215n0 c11215n1 = this.f35897y;
                    C13045h2 c13045h2 = c11215n1.f35961J;
                    C12473e c12473e = new C12473e(c11215n1, (InterfaceC30057d) null, 25);
                    this.f35896x = 1;
                    if (AbstractC13091v.m36604n(c13045h2, c12473e, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f35896x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11215n0 c11215n2 = this.f35897y;
                    C13045h2 c13045h3 = c11215n2.f35961J;
                    C11195d0 c11195d1 = new C11195d0(c11215n2, (InterfaceC30057d) null, 1);
                    this.f35896x = 1;
                    if (AbstractC13091v.m36604n(c13045h3, c11195d1, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f35896x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11215n0 c11215n3 = this.f35897y;
                    InterfaceC11204i interfaceC11204i = c11215n3.f35958G;
                    C11190b c11190b = c11215n3.f35974z;
                    this.f35896x = 1;
                    objM30348a = ((C11233w0) interfaceC11204i).m30348a(c11190b, this);
                    if (objM30348a == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM30348a = ((C23468n) obj).f92940w;
                }
                return new C23468n(objM30348a);
        }
    }
}
