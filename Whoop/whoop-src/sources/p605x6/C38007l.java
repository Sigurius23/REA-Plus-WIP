package p605x6;

import androidx.glance.session.SessionWorker;
import c93.InterfaceC4351m;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import x31.C37942a;

/* JADX INFO: renamed from: x6.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C38007l implements InterfaceC38001f {

    /* JADX INFO: renamed from: a */
    public final Class f162807a;

    /* JADX INFO: renamed from: b */
    public final C37942a f162808b;

    /* JADX INFO: renamed from: c */
    public final C38014s f162809c;

    /* JADX INFO: renamed from: d */
    public final C25437c f162810d;

    /* JADX INFO: renamed from: e */
    public final C38006k f162811e;

    public C38007l() {
        C37942a c37942a = new C37942a(3);
        this.f162807a = SessionWorker.class;
        this.f162808b = c37942a;
        this.f162809c = C38020y.f162854a;
        this.f162810d = AbstractC25438d.m74669a();
        this.f162811e = new C38006k(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Object m121742b(C38007l c38007l, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C38002g c38002g;
        C25437c c25437c;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof C38002g) {
            c38002g = (C38002g) interfaceC30057d;
            int i13 = c38002g.f162789F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38002g.f162789F = i13 - Integer.MIN_VALUE;
            } else {
                c38002g = new C38002g(c38007l, interfaceC30057d);
            }
        } else {
            c38002g = new C38002g(c38007l, interfaceC30057d);
        }
        Object obj = c38002g.f162793z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c38002g.f162789F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c25437c = c38007l.f162810d;
                c38002g.f162790w = c38007l;
                c38002g.f162791x = (AbstractC32275i) interfaceC4351m;
                c38002g.f162792y = c25437c;
                c38002g.f162789F = 1;
                if (c25437c.mo68211b(c38002g) != obj2) {
                }
                interfaceC4351m2 = interfaceC4351m;
                return obj2;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a = (InterfaceC25435a) c38002g.f162790w;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a.mo68214i(null);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a.mo68214i(null);
                    throw th;
                }
            }
            C25437c c25437c2 = c38002g.f162792y;
            InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) c38002g.f162791x;
            C38007l c38007l2 = (C38007l) c38002g.f162790w;
            AbstractC34132o.m107864I(obj);
            c25437c = c25437c2;
            c38007l = c38007l2;
            interfaceC4351m2 = interfaceC4351m3;
            interfaceC4351m2 = interfaceC4351m;
            Object obj3 = c38007l.f162811e;
            c38002g.f162790w = c25437c;
            c38002g.f162791x = null;
            c38002g.f162792y = null;
            c38002g.f162789F = 2;
            Object objInvoke = interfaceC4351m2.invoke(obj3, c38002g);
            if (objInvoke != obj2) {
                C25437c c25437c3 = c25437c;
                obj = objInvoke;
                interfaceC25435a = c25437c3;
                interfaceC25435a.mo68214i(null);
                return obj;
            }
            interfaceC4351m2 = interfaceC4351m;
            return obj2;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a = c25437c;
            interfaceC25435a.mo68214i(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m121743a(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        return m121742b(this, interfaceC4351m, interfaceC30057d);
    }
}
