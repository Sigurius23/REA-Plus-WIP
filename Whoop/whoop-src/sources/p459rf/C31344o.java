package p459rf;

import aws.smithy.kotlin.runtime.http.HttpException;
import bc3.AbstractC3006f0;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;
import l83.C23470p;
import m83.C25262p;
import p091dg.C12002a;
import p423qf.C30318b;
import p481s6.AbstractC32229a;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p551vf.C35943h;
import p551vf.InterfaceC35936a;
import pf.AbstractC29128f;
import pf.AbstractC29131i;
import q11.C29793c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32416g;
import ud3.C34826l0;
import ud3.C34850x0;
import ug.AbstractC34914c;
import ug.C34913b;
import wf.C37236a;
import x43.AbstractC37978j;
import zd3.C40571o;

/* JADX INFO: renamed from: rf.o */
/* JADX INFO: loaded from: classes.dex */
public final class C31344o extends AbstractC29128f {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f128974H = 0;

    /* JADX INFO: renamed from: E */
    public final C34826l0 f128975E;

    /* JADX INFO: renamed from: F */
    public final C30318b f128976F;

    /* JADX INFO: renamed from: G */
    public final C23470p f128977G;

    /* JADX INFO: renamed from: z */
    public final C31347r f128978z;

    public C31344o(C31347r c31347r, C34826l0 c34826l0) {
        this.f128978z = c31347r;
        this.f128975E = c34826l0;
        c31347r.getClass();
        this.f128976F = new C30318b(c31347r.f117919j);
        this.f128977G = AbstractC30060g.m92088H(new C25262p(this, 12));
    }

    @Override // pf.InterfaceC29123a
    public final AbstractC29131i getConfig() {
        return this.f128978z;
    }

    @Override // pf.AbstractC29128f
    public final void shutdown() throws Throwable {
        this.f128976F.close();
        if (this.f128975E == null) {
            C23470p c23470p = this.f128977G;
            ((C34826l0) c23470p.getValue()).f146648F.m109909a();
            ((ThreadPoolExecutor) ((C34826l0) c23470p.getValue()).f146649a.m109920a()).shutdown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pf.InterfaceC29123a
    /* JADX INFO: renamed from: z0 */
    public final Object mo88491z0(C12002a c12002a, C35943h c35943h, InterfaceC30057d interfaceC30057d) {
        C31343n c31343n;
        InterfaceC35936a interfaceC35936a;
        C40571o c40571oM109898b;
        InterfaceC35936a interfaceC35936a2;
        InterfaceC30063j interfaceC30063j;
        if (interfaceC30057d instanceof C31343n) {
            c31343n = (C31343n) interfaceC30057d;
            int i13 = c31343n.f128969G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c31343n.f128969G = i13 - Integer.MIN_VALUE;
            } else {
                c31343n = new C31343n(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c31343n = new C31343n(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM101159p = c31343n.f128967E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c31343n.f128969G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM101159p);
                c31343n.f128970w = c12002a;
                c31343n.f128971x = c35943h;
                c31343n.f128969G = 1;
                objM101159p = AbstractC32416g.m101159p(c31343n);
                if (objM101159p != enumC31071a) {
                }
                interfaceC35936a = c35943h;
                return enumC31071a;
            }
            if (i14 == 1) {
                InterfaceC35936a interfaceC35936a3 = c31343n.f128971x;
                c12002a = c31343n.f128970w;
                AbstractC34132o.m107864I(objM101159p);
                interfaceC35936a = interfaceC35936a3;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c40571oM109898b = c31343n.f128973z;
                InterfaceC30063j interfaceC30063j2 = c31343n.f128972y;
                InterfaceC35936a interfaceC35936a4 = c31343n.f128971x;
                AbstractC34132o.m107864I(objM101159p);
                interfaceC30063j = interfaceC30063j2;
                interfaceC35936a2 = interfaceC35936a4;
            }
            C40571o c40571o = c40571oM109898b;
            C34850x0 c34850x0 = (C34850x0) objM101159p;
            C37236a c37236aM121641Z = AbstractC37978j.m121641Z(c34850x0);
            C33647p c33647p = C34913b.f147015x;
            C31341l c31341l = new C31341l(interfaceC35936a2, c37236aM121641Z, AbstractC34914c.m110116a(c33647p, c34850x0.f146783L), AbstractC34914c.m110116a(c33647p, c34850x0.f146784M), interfaceC30063j, c40571o);
            AbstractC3006f0.m8725s(interfaceC30063j).invokeOnCompletion(new C29793c(16, c31341l, c34850x0));
            return c31341l;
            interfaceC35936a = c35943h;
            InterfaceC30063j interfaceC30063j3 = (InterfaceC30063j) objM101159p;
            c40571oM109898b = ((C34826l0) this.f128977G.getValue()).m109898b(AbstractC37978j.m121640Y(interfaceC35936a, c12002a, interfaceC30063j3, this.f128976F));
            c31343n.f128970w = null;
            c31343n.f128971x = interfaceC35936a;
            c31343n.f128972y = interfaceC30063j3;
            c31343n.f128973z = c40571oM109898b;
            c31343n.f128969G = 2;
            Object objM100257d = AbstractC32229a.m100257d(c40571oM109898b, c31343n);
            if (objM100257d != enumC31071a) {
                interfaceC35936a2 = interfaceC35936a;
                interfaceC30063j = interfaceC30063j3;
                objM101159p = objM100257d;
                C40571o c40571o2 = c40571oM109898b;
                C34850x0 c34850x1 = (C34850x0) objM101159p;
                C37236a c37236aM121641Z2 = AbstractC37978j.m121641Z(c34850x1);
                C33647p c33647p2 = C34913b.f147015x;
                C31341l c31341l2 = new C31341l(interfaceC35936a2, c37236aM121641Z2, AbstractC34914c.m110116a(c33647p2, c34850x1.f146783L), AbstractC34914c.m110116a(c33647p2, c34850x1.f146784M), interfaceC30063j, c40571o2);
                AbstractC3006f0.m8725s(interfaceC30063j).invokeOnCompletion(new C29793c(16, c31341l2, c34850x1));
                return c31341l2;
            }
            interfaceC35936a = c35943h;
            return enumC31071a;
        } catch (IOException e5) {
            throw new HttpException(e5, AbstractC37978j.m121660u(e5));
        }
    }
}
