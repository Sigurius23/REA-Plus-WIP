package gf;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.u */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15780u implements InterfaceC15779t {

    /* JADX INFO: renamed from: c */
    public final Map f59467c;

    public AbstractC15780u(Map initialValues) {
        AbstractC22676k.m65750j(initialValues, "initialValues");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(initialValues.size()));
        for (Map.Entry entry : initialValues.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC25265s.m74093D1((List) entry.getValue()));
        }
        C15764e c15764e = new C15764e();
        c15764e.putAll(linkedHashMap);
        this.f59467c = c15764e;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: b */
    public final Set mo44479b() {
        return this.f59467c.entrySet();
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: d */
    public final boolean mo44481d() {
        return true;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: e */
    public final List mo44482e(String str) {
        return (List) this.f59467c.get(str);
    }

    public final boolean equals(Object obj) {
        boolean z4 = obj instanceof AbstractC15780u;
        Map map = this.f59467c;
        if (z4) {
            if (!AbstractC22676k.m65745e(map, ((AbstractC15780u) obj).f59467c)) {
                return false;
            }
        } else {
            if (!(obj instanceof InterfaceC15779t)) {
                return false;
            }
            InterfaceC15779t interfaceC15779t = (InterfaceC15779t) obj;
            if (true != interfaceC15779t.mo44481d() || !AbstractC22676k.m65745e(map.entrySet(), interfaceC15779t.mo44479b())) {
                return false;
            }
        }
        return true;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: f */
    public final boolean mo44483f() {
        return this.f59467c.containsKey("Accept-Encoding");
    }

    public final int hashCode() {
        return this.f59467c.hashCode();
    }

    @Override // gf.InterfaceC15779t
    public final boolean isEmpty() {
        return this.f59467c.isEmpty();
    }
}
