package u93;

import cb3.AbstractC4393e;
import java.util.Collection;
import java.util.List;
import jb3.C21561u;
import lb3.InterfaceC23796q0;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;

/* JADX INFO: renamed from: u93.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C34674f implements InterfaceC23796q0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC34676g f146054w;

    public C34674f(AbstractC34676g abstractC34676g) {
        this.f146054w = abstractC34676g;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        return AbstractC4393e.m13807e(this.f146054w);
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        return this.f146054w;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return true;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        List list = ((C21561u) this.f146054w).f82697R;
        if (list != null) {
            return list;
        }
        AbstractC22676k.m65757q("typeConstructorParameters");
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    public final Collection getSupertypes() {
        Collection supertypes = ((C21561u) this.f146054w).m60591L0().mo69844i0().getSupertypes();
        AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    public final String toString() {
        return "[typealias " + this.f146054w.getName().m113817b() + ']';
    }
}
