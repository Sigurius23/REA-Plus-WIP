package ab3;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import l83.C23470p;
import lb3.AbstractC23791o;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import m83.AbstractC25265s;
import m83.C25271y;
import nb3.C26555l;
import nb3.EnumC26551h;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31126h;

/* JADX INFO: renamed from: ab3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0723o implements InterfaceC23796q0 {

    /* JADX INFO: renamed from: w */
    public final Set f2702w;

    /* JADX INFO: renamed from: x */
    public final C23470p f2703x;

    public C0723o(Set set) {
        C23784k0.f94165x.getClass();
        C23784k0 attributes = C23784k0.f94166y;
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC23791o.m69892k(C25271y.f99162w, C26555l.m78680a(EnumC26551h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, this, false);
        this.f2703x = AbstractC30060g.m92088H(new C0720l());
        this.f2702w = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m1782a() {
        return this.f2702w;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        return null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return false;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        return C25271y.f99162w;
    }

    @Override // lb3.InterfaceC23796q0
    public final Collection getSupertypes() {
        return (List) this.f2703x.getValue();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IntegerLiteralType");
        sb4.append("[" + AbstractC25265s.m74110N0(this.f2702w, ",", null, null, C0721m.f2700w, 30) + ']');
        return sb4.toString();
    }
}
