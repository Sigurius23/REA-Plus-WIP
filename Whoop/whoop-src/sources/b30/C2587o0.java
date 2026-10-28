package b30;

import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import l83.C23454a0;
import n53.C26318e;
import p000.C13762f;
import p000.C36623w;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2587o0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10066w;

    /* JADX INFO: renamed from: x */
    public int f10067x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C2603q0 f10068y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2587o0(C2603q0 c2603q0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f10066w = i13;
        this.f10068y = c2603q0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f10066w) {
            case 0:
                return new C2587o0(this.f10068y, interfaceC30057d, 0);
            case 1:
                return new C2587o0(this.f10068y, interfaceC30057d, 1);
            case 2:
                return new C2587o0(this.f10068y, interfaceC30057d, 2);
            case 3:
                return new C2587o0(this.f10068y, interfaceC30057d, 3);
            case 4:
                return new C2587o0(this.f10068y, interfaceC30057d, 4);
            case 5:
                return new C2587o0(this.f10068y, interfaceC30057d, 5);
            case 6:
                return new C2587o0(this.f10068y, interfaceC30057d, 6);
            default:
                return new C2587o0(this.f10068y, interfaceC30057d, 7);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f10066w) {
            case 0:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 3:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 4:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 5:
                return ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 6:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            default:
                ((C2587o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10066w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f10067x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q0 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f2 = c2603q0.f10128a;
                    C2579n0 c2579n0 = new C2579n0(c2603q0, 0);
                    this.f10067x = 1;
                    if (interfaceC13037f2.collect(c2579n0, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f10067x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q1 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f3 = c2603q1.f10129b;
                    C2579n0 c2579n1 = new C2579n0(c2603q1, 1);
                    this.f10067x = 1;
                    if (interfaceC13037f3.collect(c2579n1, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f10067x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q2 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f4 = c2603q2.f10130c;
                    C2579n0 c2579n2 = new C2579n0(c2603q2, 2);
                    this.f10067x = 1;
                    if (interfaceC13037f4.collect(c2579n2, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f10067x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q3 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f5 = c2603q3.f10131d;
                    C2579n0 c2579n3 = new C2579n0(c2603q3, 3);
                    this.f10067x = 1;
                    if (interfaceC13037f5.collect(c2579n3, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f10067x;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q4 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f6 = c2603q4.f10133f;
                    C2579n0 c2579n4 = new C2579n0(c2603q4, 4);
                    this.f10067x = 1;
                    if (interfaceC13037f6.collect(c2579n4, this) == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                throw new KotlinNothingValueException();
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f10067x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2603q0 c2603q5 = this.f10068y;
                    InterfaceC13037f2 interfaceC13037f7 = c2603q5.f10135h;
                    C2579n0 c2579n5 = new C2579n0(c2603q5, 5);
                    this.f10067x = 1;
                    Object objCollect = interfaceC13037f7.collect(new C36623w(c2579n5, 1), this);
                    if (objCollect != enumC31071a6) {
                        objCollect = c23454a0;
                    }
                    if (objCollect == enumC31071a6) {
                        return enumC31071a6;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f10067x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C2603q0 c2603q6 = this.f10068y;
                C26318e c26318eM9513t = AbstractC3269g.m9513t(c2603q6.f10142o, c2603q6.f10136i, c2603q6.f10128a, new C13762f(c2603q6));
                C2579n0 c2579n6 = new C2579n0(c2603q6, 6);
                this.f10067x = 1;
                c26318eM9513t.collect(c2579n6, this);
                return enumC31071a7;
            default:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i24 = this.f10067x;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C2603q0 c2603q7 = this.f10068y;
                C26318e c26318e = c2603q7.f10134g;
                C2579n0 c2579n7 = new C2579n0(c2603q7, 7);
                this.f10067x = 1;
                c26318e.collect(c2579n7, this);
                return enumC31071a8;
        }
    }
}
