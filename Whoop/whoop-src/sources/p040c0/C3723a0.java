package p040c0;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;
import androidx.room.AbstractC1848z0;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13046i;
import ec3.C13050j;
import ec3.C13055k0;
import ec3.C13064m1;
import ec3.C13067n0;
import ec3.InterfaceC13062m;
import fc3.AbstractC14371b;
import ge3.AbstractC15751g;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import lb.C23566i;
import p007a6.C0458v;
import p077d0.C11421z1;
import p180h0.C16385f;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28661r1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: c0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3723a0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15203w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15204x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15205y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f15206z;

    public /* synthetic */ C3723a0(Object obj, Object obj2, Object obj3, int i13) {
        this.f15203w = i13;
        this.f15204x = obj;
        this.f15205y = obj2;
        this.f15206z = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x021c  */
    /* JADX WARN: Code duplicated, block: B:125:0x024f  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r14v16, types: [c93.m, s83.i] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        C13046i c13046i;
        C13055k0 c13055k0;
        C3723a0 c3723a0;
        InterfaceC13062m interfaceC13062m;
        C13067n0 c13067n0;
        C13064m1 c13064m1;
        C22669g0 c22669g0;
        C3723a0 c3723a1;
        C16385f c16385f;
        C23566i c23566i;
        InterfaceC13062m interfaceC13062m2;
        switch (this.f15203w) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C11421z1 c11421z1 = (C11421z1) this.f15205y;
                ((InterfaceC28661r1) this.f15204x).setValue(Boolean.valueOf(zBooleanValue ? ((Boolean) ((InterfaceC4351m) ((InterfaceC28601c1) this.f15206z).getValue()).invoke(c11421z1.f36630a.mo2428y0(), c11421z1.f36633d.getValue())).booleanValue() : false));
                return C23454a0.f92919a;
            case 1:
                C22669g0 c22669g1 = (C22669g0) this.f15205y;
                C13050j c13050j = (C13050j) this.f15204x;
                if (interfaceC30057d instanceof C13046i) {
                    c13046i = (C13046i) interfaceC30057d;
                    int i13 = c13046i.f45092y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c13046i.f45092y = i13 - Integer.MIN_VALUE;
                    } else {
                        c13046i = new C13046i(this, interfaceC30057d);
                    }
                } else {
                    c13046i = new C13046i(this, interfaceC30057d);
                }
                Object obj2 = c13046i.f45090w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c13046i.f45092y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    Object objInvoke = c13050j.f45103x.invoke(obj);
                    Object obj3 = c22669g1.f89336w;
                    if (obj3 == AbstractC14371b.f52477b || !((Boolean) c13050j.f45104y.invoke(obj3, objInvoke)).booleanValue()) {
                        c22669g1.f89336w = objInvoke;
                        InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) this.f15206z;
                        c13046i.f45092y = 1;
                        if (interfaceC13062m3.emit(obj, c13046i) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return c23454a0;
            case 2:
                if (interfaceC30057d instanceof C13055k0) {
                    c13055k0 = (C13055k0) interfaceC30057d;
                    int i15 = c13055k0.f45117E;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c13055k0.f45117E = i15 - Integer.MIN_VALUE;
                    } else {
                        c13055k0 = new C13055k0(this, interfaceC30057d);
                    }
                } else {
                    c13055k0 = new C13055k0(this, interfaceC30057d);
                }
                Object objInvoke2 = c13055k0.f45120y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c13055k0.f45117E;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            obj = c13055k0.f45119x;
                            c3723a0 = c13055k0.f45118w;
                            AbstractC34132o.m107864I(objInvoke2);
                            if (!((Boolean) objInvoke2).booleanValue()) {
                                ((C22659b0) c3723a0.f15204x).f89329w = true;
                                interfaceC13062m = (InterfaceC13062m) c3723a0.f15205y;
                                c13055k0.f45118w = null;
                                c13055k0.f45119x = null;
                                c13055k0.f45117E = 3;
                                if (interfaceC13062m.emit(obj, c13055k0) == enumC31071a2) {
                                    return enumC31071a2;
                                }
                            }
                        } else if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC34132o.m107864I(objInvoke2);
                } else {
                    AbstractC34132o.m107864I(objInvoke2);
                    if (((C22659b0) this.f15204x).f89329w) {
                        InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) this.f15205y;
                        c13055k0.f45117E = 1;
                        if (interfaceC13062m4.emit(obj, c13055k0) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    } else {
                        ?? r14 = (AbstractC32275i) this.f15206z;
                        c13055k0.f45118w = this;
                        c13055k0.f45119x = obj;
                        c13055k0.f45117E = 2;
                        objInvoke2 = r14.invoke(obj, c13055k0);
                        if (objInvoke2 == enumC31071a2) {
                            return enumC31071a2;
                        }
                        c3723a0 = this;
                        if (!((Boolean) objInvoke2).booleanValue()) {
                            ((C22659b0) c3723a0.f15204x).f89329w = true;
                            interfaceC13062m = (InterfaceC13062m) c3723a0.f15205y;
                            c13055k0.f45118w = null;
                            c13055k0.f45119x = null;
                            c13055k0.f45117E = 3;
                            if (interfaceC13062m.emit(obj, c13055k0) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        }
                    }
                }
                return c23454a1;
            case 3:
                InterfaceC13062m interfaceC13062m5 = (InterfaceC13062m) this.f15205y;
                if (interfaceC30057d instanceof C13067n0) {
                    c13067n0 = (C13067n0) interfaceC30057d;
                    int i17 = c13067n0.f45158y;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c13067n0.f45158y = i17 - Integer.MIN_VALUE;
                    } else {
                        c13067n0 = new C13067n0(this, interfaceC30057d);
                    }
                } else {
                    c13067n0 = new C13067n0(this, interfaceC30057d);
                }
                Object obj4 = c13067n0.f45156w;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = c13067n0.f45158y;
                C23454a0 c23454a2 = C23454a0.f92919a;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj4);
                    C22665e0 c22665e0 = (C22665e0) this.f15204x;
                    int i19 = c22665e0.f89334w + 1;
                    c22665e0.f89334w = i19;
                    if (i19 >= 1) {
                        c13067n0.f45158y = 2;
                        AbstractC13091v.m36594d(interfaceC13062m5, obj, this.f15206z, c13067n0);
                        return enumC31071a3;
                    }
                    c13067n0.f45158y = 1;
                    if (interfaceC13062m5.emit(obj, c13067n0) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i18 != 1 && i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj4);
                }
                return c23454a2;
            case 4:
                if (interfaceC30057d instanceof C13064m1) {
                    c13064m1 = (C13064m1) interfaceC30057d;
                    int i24 = c13064m1.f45144E;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        c13064m1.f45144E = i24 - Integer.MIN_VALUE;
                    } else {
                        c13064m1 = new C13064m1(this, interfaceC30057d);
                    }
                } else {
                    c13064m1 = new C13064m1(this, interfaceC30057d);
                }
                Object obj5 = c13064m1.f45147y;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i25 = c13064m1.f45144E;
                if (i25 != 0) {
                    if (i25 == 1) {
                        c22669g0 = c13064m1.f45146x;
                        c3723a1 = c13064m1.f45145w;
                        AbstractC34132o.m107864I(obj5);
                    } else {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj5);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj5);
                C22669g0 c22669g2 = (C22669g0) this.f15204x;
                Function3 function3 = (Function3) this.f15205y;
                Object obj6 = c22669g2.f89336w;
                c13064m1.f45145w = this;
                c13064m1.f45146x = c22669g2;
                c13064m1.f45144E = 1;
                Object objInvoke3 = function3.invoke(obj6, obj, c13064m1);
                if (objInvoke3 == enumC31071a4) {
                    return enumC31071a4;
                }
                obj5 = objInvoke3;
                c22669g0 = c22669g2;
                c3723a1 = this;
                c22669g0.f89336w = obj5;
                InterfaceC13062m interfaceC13062m6 = (InterfaceC13062m) c3723a1.f15206z;
                Object obj7 = ((C22669g0) c3723a1.f15204x).f89336w;
                c13064m1.f45145w = null;
                c13064m1.f45146x = null;
                c13064m1.f45144E = 2;
                if (interfaceC13062m6.emit(obj7, c13064m1) == enumC31071a4) {
                    return enumC31071a4;
                }
                return C23454a0.f92919a;
            case 5:
                C22669g0 c22669g3 = (C22669g0) this.f15204x;
                if (interfaceC30057d instanceof C16385f) {
                    c16385f = (C16385f) interfaceC30057d;
                    int i26 = c16385f.f62997E;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        c16385f.f62997E = i26 - Integer.MIN_VALUE;
                    } else {
                        c16385f = new C16385f(this, interfaceC30057d);
                    }
                } else {
                    c16385f = new C16385f(this, interfaceC30057d);
                }
                Object obj8 = c16385f.f63000y;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i27 = c16385f.f62997E;
                if (i27 == 0) {
                    AbstractC34132o.m107864I(obj8);
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g3.f89336w;
                    if (interfaceC3027k1 != null) {
                        interfaceC3027k1.cancel((CancellationException) new AnchoredDragFinishedSignal());
                        c16385f.f62998w = obj;
                        c16385f.f62999x = interfaceC3027k1;
                        c16385f.f62997E = 1;
                        if (interfaceC3027k1.join(c16385f) == enumC31071a5) {
                            return enumC31071a5;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c16385f.f62998w;
                    AbstractC34132o.m107864I(obj8);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f15205y;
                c22669g3.f89336w = AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new C0458v((InterfaceC4351m) this.f15206z, obj, interfaceC2994c0, null, 8), 1);
                return C23454a0.f92919a;
            default:
                if (interfaceC30057d instanceof C23566i) {
                    c23566i = (C23566i) interfaceC30057d;
                    int i28 = c23566i.f93463x;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        c23566i.f93463x = i28 - Integer.MIN_VALUE;
                    } else {
                        c23566i = new C23566i(this, interfaceC30057d);
                    }
                } else {
                    c23566i = new C23566i(this, interfaceC30057d);
                }
                Object obj9 = c23566i.f93462w;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i29 = c23566i.f93463x;
                if (i29 != 0) {
                    if (i29 == 1) {
                        interfaceC13062m2 = c23566i.f93464y;
                        AbstractC34132o.m107864I(obj9);
                    } else {
                        if (i29 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj9);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj9);
                InterfaceC13062m interfaceC13062m7 = (InterfaceC13062m) this.f15204x;
                AbstractC1848z0 abstractC1848z0 = (AbstractC1848z0) this.f15205y;
                Function1 function1 = (Function1) this.f15206z;
                c23566i.f93464y = interfaceC13062m7;
                c23566i.f93463x = 1;
                Object objM44434N = AbstractC15751g.m44434N(abstractC1848z0, true, false, function1, c23566i);
                if (objM44434N == enumC31071a6) {
                    return enumC31071a6;
                }
                obj9 = objM44434N;
                interfaceC13062m2 = interfaceC13062m7;
                c23566i.f93464y = null;
                c23566i.f93463x = 2;
                if (interfaceC13062m2.emit(obj9, c23566i) == enumC31071a6) {
                    return enumC31071a6;
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3723a0(C22659b0 c22659b0, InterfaceC13062m interfaceC13062m, InterfaceC4351m interfaceC4351m) {
        this.f15203w = 2;
        this.f15204x = c22659b0;
        this.f15205y = interfaceC13062m;
        this.f15206z = (AbstractC32275i) interfaceC4351m;
    }
}
