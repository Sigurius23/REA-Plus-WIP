package ec3;

import c93.InterfaceC4351m;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13077q0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45188w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC13062m f45189x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC32275i f45190y;

    /* JADX WARN: Multi-variable type inference failed */
    public C13077q0(InterfaceC13062m interfaceC13062m, InterfaceC4351m interfaceC4351m) {
        this.f45189x = interfaceC13062m;
        this.f45190y = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r2v10, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r9v2, types: [c93.m, s83.i] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C13074p0 c13074p0;
        Object obj2;
        Object obj3;
        C13077q0 c13077q0;
        C13089u0 c13089u0;
        InterfaceC13062m interfaceC13062m;
        switch (this.f45188w) {
            case 0:
                if (interfaceC30057d instanceof C13074p0) {
                    c13074p0 = (C13074p0) interfaceC30057d;
                    int i13 = c13074p0.f45180y;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c13074p0.f45180y = i13 - Integer.MIN_VALUE;
                    } else {
                        c13074p0 = new C13074p0(this, interfaceC30057d);
                    }
                } else {
                    c13074p0 = new C13074p0(this, interfaceC30057d);
                }
                Object obj4 = c13074p0.f45179x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c13074p0.f45180y;
                boolean z4 = true;
                if (i14 != 0) {
                    if (i14 == 1) {
                        Object obj5 = c13074p0.f45177E;
                        C13077q0 c13077q1 = c13074p0.f45178w;
                        AbstractC34132o.m107864I(obj4);
                        obj3 = obj5;
                        c13077q0 = c13077q1;
                        obj2 = obj4;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c13077q0 = c13074p0.f45178w;
                        AbstractC34132o.m107864I(obj4);
                    }
                    if (z4) {
                        return C23454a0.f92919a;
                    }
                    throw new AbortFlowException(c13077q0);
                }
                AbstractC34132o.m107864I(obj4);
                c13074p0.f45178w = this;
                c13074p0.f45177E = obj;
                c13074p0.f45180y = 1;
                Object objInvoke = this.f45190y.invoke(obj, c13074p0);
                if (objInvoke == enumC31071a) {
                    return enumC31071a;
                }
                obj2 = objInvoke;
                obj3 = obj;
                c13077q0 = this;
                if (((Boolean) obj2).booleanValue()) {
                    InterfaceC13062m interfaceC13062m2 = c13077q0.f45189x;
                    c13074p0.f45178w = c13077q0;
                    c13074p0.f45177E = null;
                    c13074p0.f45180y = 2;
                    if (interfaceC13062m2.emit(obj3, c13074p0) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    z4 = false;
                }
                if (z4) {
                    return C23454a0.f92919a;
                }
                throw new AbortFlowException(c13077q0);
            default:
                if (interfaceC30057d instanceof C13089u0) {
                    c13089u0 = (C13089u0) interfaceC30057d;
                    int i15 = c13089u0.f45224x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c13089u0.f45224x = i15 - Integer.MIN_VALUE;
                    } else {
                        c13089u0 = new C13089u0(this, interfaceC30057d);
                    }
                } else {
                    c13089u0 = new C13089u0(this, interfaceC30057d);
                }
                Object obj6 = c13089u0.f45223w;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c13089u0.f45224x;
                if (i16 != 0) {
                    if (i16 == 1) {
                        interfaceC13062m = c13089u0.f45225y;
                        AbstractC34132o.m107864I(obj6);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj6);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj6);
                InterfaceC13062m interfaceC13062m3 = this.f45189x;
                c13089u0.f45225y = interfaceC13062m3;
                c13089u0.f45224x = 1;
                Object objInvoke2 = this.f45190y.invoke(obj, c13089u0);
                if (objInvoke2 == enumC31071a2) {
                    return enumC31071a2;
                }
                obj6 = objInvoke2;
                interfaceC13062m = interfaceC13062m3;
                c13089u0.f45225y = null;
                c13089u0.f45224x = 2;
                if (interfaceC13062m.emit(obj6, c13089u0) == enumC31071a2) {
                    return enumC31071a2;
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13077q0(InterfaceC4351m interfaceC4351m, InterfaceC13062m interfaceC13062m) {
        this.f45190y = (AbstractC32275i) interfaceC4351m;
        this.f45189x = interfaceC13062m;
    }
}
