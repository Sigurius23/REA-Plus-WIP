package l43;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d33.C11636x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import f53.C14119g;
import l83.C23454a0;
import n53.C26318e;
import p000.C36623w;
import p007a6.C0454t;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.C33366b4;
import t23.C33423m3;
import t23.C33443q3;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: l43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C23336b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f92524w;

    /* JADX INFO: renamed from: x */
    public int f92525x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33366b4 f92526y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23336b(C33366b4 c33366b4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f92524w = i13;
        this.f92526y = c33366b4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f92524w) {
            case 0:
                return new C23336b(this.f92526y, interfaceC30057d, 0);
            case 1:
                return new C23336b(this.f92526y, interfaceC30057d, 1);
            case 2:
                return new C23336b(this.f92526y, interfaceC30057d, 2);
            case 3:
                return new C23336b(this.f92526y, interfaceC30057d, 3);
            case 4:
                return new C23336b(this.f92526y, interfaceC30057d, 4);
            case 5:
                return new C23336b(this.f92526y, interfaceC30057d, 5);
            case 6:
                return new C23336b(this.f92526y, interfaceC30057d, 6);
            default:
                return new C23336b(this.f92526y, interfaceC30057d, 7);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f92524w) {
            case 0:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 2:
                ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 3:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 4:
                ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 5:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C23336b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f92524w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f92525x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f92525x = 1;
                    Object objM113953X = AbstractC35902e.m113953X(new C33443q3(this.f92526y, null, 1), this);
                    if (objM113953X != enumC31071a) {
                        objM113953X = c23454a0;
                    }
                    if (objM113953X == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f92525x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b4 = this.f92526y;
                C13096w1 c13096w1 = c33366b4.f139232E.f168482j.f50769g;
                C33423m3 c33423m3 = new C33423m3(c33366b4, 0);
                this.f92525x = 1;
                c13096w1.getClass();
                C13096w1.m36617k(c13096w1, c33423m3, this);
                return enumC31071a2;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f92525x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b5 = this.f92526y;
                C13045h2 c13045h2 = c33366b5.f139232E.f168482j.f50772j;
                C33423m3 c33423m4 = new C33423m3(c33366b5, 1);
                this.f92525x = 1;
                c13045h2.collect(c33423m4, this);
                return enumC31071a3;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f92525x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b6 = this.f92526y;
                C13096w1 c13096w2 = c33366b6.f139232E.f168482j.f50768f;
                C33423m3 c33423m5 = new C33423m3(c33366b6, 2);
                this.f92525x = 1;
                c13096w2.getClass();
                C13096w1.m36617k(c13096w2, c33423m5, this);
                return enumC31071a4;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f92525x;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw AbstractC2875y.m8309v(obj);
                }
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b7 = this.f92526y;
                C13045h2 c13045h3 = c33366b7.f139232E.f168482j.f50772j;
                C33423m3 c33423m6 = new C33423m3(c33366b7, 3);
                this.f92525x = 1;
                c13045h3.collect(c33423m6, this);
                return enumC31071a5;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i18 = this.f92525x;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C33366b4 c33366b8 = this.f92526y;
                C13045h2 c13045h4 = c33366b8.f139249V.f37369a;
                C33423m3 c33423m7 = new C33423m3(c33366b8, 4);
                this.f92525x = 1;
                c13045h4.collect(new C0454t(new C36623w(new C36623w(c33423m7, 19), 18), 2), this);
                return enumC31071a6;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                int i19 = this.f92525x;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f92525x = 1;
                Object objM105805w = this.f92526y.m105805w(this);
                return objM105805w == enumC31071a7 ? enumC31071a7 : objM105805w;
            default:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                int i24 = this.f92525x;
                if (i24 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26318e c26318eM121484x = AbstractC37926s0.m121484x(this.f92526y.f139232E.f168482j.f50770h, C14119g.f50736y);
                    C11636x c11636x = new C11636x(2, 8, null);
                    this.f92525x = 1;
                    obj = AbstractC13091v.m36616z(c26318eM121484x, c11636x, this);
                    if (obj == enumC31071a8) {
                        return enumC31071a8;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return (String) obj;
        }
    }
}
