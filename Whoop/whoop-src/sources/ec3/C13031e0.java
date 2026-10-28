package ec3;

import androidx.compose.material.ripple.RippleNode;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import mc.AbstractC25406c;
import mc.InterfaceC25409f;
import p005a3.AbstractC0201g;
import p238j0.C21085k;
import p238j0.C21086l;
import p238j0.C21087m;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21088n;
import p390p1.InterfaceC28601c1;
import p420qc.C30207q;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13031e0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45046w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f45047x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f45048y;

    public /* synthetic */ C13031e0(int i13, Object obj, Object obj2) {
        this.f45046w = i13;
        this.f45048y = obj;
        this.f45047x = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Type inference failed for: r2v5, types: [c93.m, java.lang.Object] */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        C13027d0 c13027d0;
        Throwable th3;
        C13031e0 c13031e0;
        C13101y0 c13101y0;
        C13031e0 c13031e1;
        C13048i1 c13048i1;
        Object obj2;
        InterfaceC13062m interfaceC13062m;
        switch (this.f45046w) {
            case 0:
                if (interfaceC30057d instanceof C13027d0) {
                    c13027d0 = (C13027d0) interfaceC30057d;
                    int i13 = c13027d0.f45034z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c13027d0.f45034z = i13 - Integer.MIN_VALUE;
                    } else {
                        c13027d0 = new C13027d0(this, interfaceC30057d);
                    }
                } else {
                    c13027d0 = new C13027d0(this, interfaceC30057d);
                }
                Object obj3 = c13027d0.f45032x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c13027d0.f45034z;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c13031e0 = c13027d0.f45031w;
                    try {
                        AbstractC34132o.m107864I(obj3);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        ((C22669g0) c13031e0.f45047x).f89336w = th3;
                        throw th3;
                    }
                }
                AbstractC34132o.m107864I(obj3);
                try {
                    InterfaceC13062m interfaceC13062m2 = (InterfaceC13062m) this.f45048y;
                    try {
                        c13027d0.f45031w = this;
                        c13027d0.f45034z = 1;
                        if (interfaceC13062m2.emit(obj, c13027d0) == enumC31071a) {
                            return enumC31071a;
                        }
                        return C23454a0.f92919a;
                    } catch (Throwable th5) {
                        th3 = th5;
                        c13031e0 = this;
                        ((C22669g0) c13031e0.f45047x).f89336w = th3;
                        throw th3;
                    }
                } catch (Throwable th6) {
                    th3 = th6;
                }
                break;
            case 1:
                if (interfaceC30057d instanceof C13101y0) {
                    c13101y0 = (C13101y0) interfaceC30057d;
                    int i15 = c13101y0.f45272y;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c13101y0.f45272y = i15 - Integer.MIN_VALUE;
                    } else {
                        c13101y0 = new C13101y0(this, interfaceC30057d);
                    }
                } else {
                    c13101y0 = new C13101y0(this, interfaceC30057d);
                }
                Object objInvoke = c13101y0.f45271x;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c13101y0.f45272y;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(objInvoke);
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f45048y;
                    c13101y0.f45270w = this;
                    c13101y0.f45269E = obj;
                    c13101y0.f45272y = 1;
                    objInvoke = interfaceC4351m.invoke(obj, c13101y0);
                    if (objInvoke == enumC31071a2) {
                        return enumC31071a2;
                    }
                    c13031e1 = this;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c13101y0.f45269E;
                    c13031e1 = c13101y0.f45270w;
                    AbstractC34132o.m107864I(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return C23454a0.f92919a;
                }
                ((C22669g0) c13031e1.f45047x).f89336w = obj;
                throw new AbortFlowException(c13031e1);
            case 2:
                if (interfaceC30057d instanceof C13048i1) {
                    c13048i1 = (C13048i1) interfaceC30057d;
                    int i17 = c13048i1.f45098x;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c13048i1.f45098x = i17 - Integer.MIN_VALUE;
                    } else {
                        c13048i1 = new C13048i1(this, interfaceC30057d);
                    }
                } else {
                    c13048i1 = new C13048i1(this, interfaceC30057d);
                }
                Object obj4 = c13048i1.f45097w;
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i18 = c13048i1.f45098x;
                if (i18 != 0) {
                    if (i18 == 1) {
                        interfaceC13062m = c13048i1.f45096E;
                        obj2 = c13048i1.f45100z;
                        AbstractC34132o.m107864I(obj4);
                    } else {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj4);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj4);
                InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) this.f45048y;
                c13048i1.f45100z = obj;
                c13048i1.f45096E = interfaceC13062m3;
                c13048i1.f45098x = 1;
                if (this.f45047x.invoke(obj, c13048i1) == enumC31071a3) {
                    return enumC31071a3;
                }
                obj2 = obj;
                interfaceC13062m = interfaceC13062m3;
                c13048i1.f45100z = null;
                c13048i1.f45096E = null;
                c13048i1.f45098x = 2;
                if (interfaceC13062m.emit(obj2, c13048i1) == enumC31071a3) {
                    return enumC31071a3;
                }
                return C23454a0.f92919a;
            case 3:
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) obj;
                ArrayList arrayList = (ArrayList) this.f45048y;
                if (interfaceC21082h instanceof C21086l) {
                    arrayList.add(interfaceC21082h);
                } else if (interfaceC21082h instanceof C21087m) {
                    arrayList.remove(((C21087m) interfaceC21082h).m58924a());
                } else if (interfaceC21082h instanceof C21085k) {
                    arrayList.remove(((C21085k) interfaceC21082h).m58923a());
                }
                ((InterfaceC28601c1) this.f45047x).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return C23454a0.f92919a;
            case 4:
                InterfaceC21082h interfaceC21082h2 = (InterfaceC21082h) obj;
                RippleNode rippleNode = (RippleNode) this.f45048y;
                if (!(interfaceC21082h2 instanceof InterfaceC21088n)) {
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f45047x;
                    C3936c c3936c = rippleNode.f4732S;
                    if (c3936c == null) {
                        c3936c = new C3936c(rippleNode.f4731R, rippleNode.f4729P);
                        AbstractC0201g.m508h(rippleNode);
                        rippleNode.f4732S = c3936c;
                    }
                    c3936c.m11988e(interfaceC21082h2, interfaceC2994c0);
                } else if (rippleNode.f4735V) {
                    rippleNode.m3463X0((InterfaceC21088n) interfaceC21082h2);
                } else {
                    rippleNode.f4736W.m98a(interfaceC21082h2);
                }
                return C23454a0.f92919a;
            default:
                ((InterfaceC25409f) this.f45048y).mo64225d((C30207q) this.f45047x, (AbstractC25406c) obj);
                return C23454a0.f92919a;
        }
    }
}
