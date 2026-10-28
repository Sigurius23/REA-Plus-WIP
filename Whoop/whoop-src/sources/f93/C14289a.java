package f93;

import d13.AbstractC11478a;
import im.InterfaceC18653b;
import io.sentry.internal.debugmeta.C20378c;
import j93.InterfaceC21493z;
import java.util.HashMap;
import mp.AbstractC25753b;
import mp.C25750a;
import p319m4.AbstractC25012a;
import p465rm.AbstractC31531f1;
import p465rm.C31545k0;
import p556vm.AbstractC36134a;
import p556vm.InterfaceC36141h;
import p618xk.InterfaceC38416g;
import p715kotlin.jvm.internal.AbstractC22676k;
import uc3.InterfaceC34767e;

/* JADX INFO: renamed from: f93.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14289a implements InterfaceC14292d, InterfaceC18653b, InterfaceC34767e, InterfaceC38416g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52185w;

    /* JADX INFO: renamed from: x */
    public Object f52186x;

    public /* synthetic */ C14289a(Object obj, int i13) {
        this.f52185w = i13;
        this.f52186x = obj;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC36134a m40831c(AbstractC31531f1 abstractC31531f1) {
        new C20378c(23, (byte) 0);
        abstractC31531f1.getClass();
        new HashMap();
        throw null;
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: a */
    public void mo40832a() {
    }

    @Override // uc3.InterfaceC34767e
    /* JADX INFO: renamed from: b */
    public String mo30616b() {
        return AbstractC11478a.m30860l(new StringBuilder("attempted to overwrite the existing value '"), this.f52186x, '\'');
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC36141h m40833d(C31545k0 c31545k0) {
        c31545k0.f130206x.getClass();
        c31545k0.f130206x.getClass();
        return InterfaceC36141h.f154644a;
    }

    @Override // p618xk.InterfaceC38416g
    /* JADX INFO: renamed from: e */
    public Object mo40834e() {
        return this.f52186x;
    }

    /* JADX INFO: renamed from: f */
    public Object m40835f() {
        if (AbstractC25753b.f101466x == null) {
            AbstractC25753b.f101466x = new C25750a();
        }
        synchronized (AbstractC25753b.f101465w) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        return this.f52186x;
    }

    @Override // f93.InterfaceC14291c
    public Object getValue(Object obj, InterfaceC21493z property) {
        AbstractC22676k.m65750j(property, "property");
        Object obj2 = this.f52186x;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // f93.InterfaceC14292d
    public void setValue(Object obj, InterfaceC21493z property, Object value) {
        AbstractC22676k.m65750j(property, "property");
        AbstractC22676k.m65750j(value, "value");
        this.f52186x = value;
    }

    public String toString() {
        String str;
        switch (this.f52185w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("NotNullProperty(");
                if (this.f52186x != null) {
                    str = "value=" + this.f52186x;
                } else {
                    str = "value not initialized yet";
                }
                return AbstractC25012a.m73377j(sb4, str, ')');
            default:
                return super.toString();
        }
    }

    public C14289a(int i13) {
        this.f52185w = i13;
        switch (i13) {
            case 6:
                this.f52186x = new Object();
                break;
        }
    }
}
