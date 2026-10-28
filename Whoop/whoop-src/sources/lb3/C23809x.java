package lb3;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import o93.AbstractC27736h;
import ob3.InterfaceC27802l;
import p000.C31931s;
import p133f1.C13982u0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;

/* JADX INFO: renamed from: lb3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C23809x implements InterfaceC23796q0, InterfaceC27802l {

    /* JADX INFO: renamed from: w */
    public AbstractC23811y f94204w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashSet f94205x;

    /* JADX INFO: renamed from: y */
    public final int f94206y;

    public C23809x(AbstractCollection typesToIntersect) {
        AbstractC22676k.m65750j(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f94205x = linkedHashSet;
        this.f94206y = linkedHashSet.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC23763c0 m69912a() {
        C23784k0.f94165x.getClass();
        return AbstractC23791o.m69893l(C23784k0.f94166y, this, C25271y.f99162w, false, AbstractC22674j.m65739y("member scope for intersection type", this.f94205x), new C31931s(this, 11));
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        AbstractC27736h abstractC27736hMo1783c = ((AbstractC23811y) this.f94205x.iterator().next()).mo69844i0().mo1783c();
        AbstractC22676k.m65749i(abstractC27736hMo1783c, "getBuiltIns(...)");
        return abstractC27736hMo1783c;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final String m69913e(Function1 getProperTypeRelatedToStringify) {
        AbstractC22676k.m65750j(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return AbstractC25265s.m74110N0(AbstractC25265s.m74152u1(this.f94205x, new C13982u0(getProperTypeRelatedToStringify, 3)), " & ", "{", "}", new C23805v(getProperTypeRelatedToStringify, 0), 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23809x)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f94205x, ((C23809x) obj).f94205x);
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
        return this.f94205x;
    }

    public final int hashCode() {
        return this.f94206y;
    }

    public final String toString() {
        return m69913e(C23807w.f94202x);
    }
}
