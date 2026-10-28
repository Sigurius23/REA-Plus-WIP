package p363ob;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25271y;
import p026b2.C2298d;
import p500tb.InterfaceC33687a;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import te0.AbstractC33745d;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: ob.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C27788k {

    /* JADX INFO: renamed from: a */
    public final String f112036a;

    /* JADX INFO: renamed from: b */
    public final Object f112037b;

    /* JADX INFO: renamed from: c */
    public final Set f112038c;

    /* JADX INFO: renamed from: d */
    public final Set f112039d;

    public C27788k(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        AbstractC22676k.m65750j(foreignKeys, "foreignKeys");
        this.f112036a = str;
        this.f112037b = map;
        this.f112038c = foreignKeys;
        this.f112039d = abstractSet;
    }

    /* JADX INFO: renamed from: a */
    public static final C27788k m83879a(String str, InterfaceC33687a interfaceC33687a) {
        return AbstractC32417h.m101188S(str, interfaceC33687a);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27788k)) {
            return false;
        }
        C27788k c27788k = (C27788k) obj;
        if (!this.f112036a.equals(c27788k.f112036a) || !this.f112037b.equals(c27788k.f112037b) || !AbstractC22676k.m65745e(this.f112038c, c27788k.f112038c)) {
            return false;
        }
        Set set2 = this.f112039d;
        if (set2 == null || (set = c27788k.f112039d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f112038c.hashCode() + AbstractC33745d.m106644c(this.f112036a.hashCode() * 31, 31, this.f112037b);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb4 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb4.append(this.f112036a);
        sb4.append("',\n            |    columns = {");
        sb4.append(AbstractC34235f.m108204K(AbstractC25265s.m74152u1(this.f112037b.values(), new C2298d(23))));
        sb4.append("\n            |    foreignKeys = {");
        sb4.append(AbstractC34235f.m108204K(this.f112038c));
        sb4.append("\n            |    indices = {");
        Set set = this.f112039d;
        sb4.append(AbstractC34235f.m108204K(set != null ? AbstractC25265s.m74152u1(set, new C2298d(24)) : C25271y.f99162w));
        sb4.append("\n            |}\n        ");
        return AbstractC39415s.m125910t(sb4.toString());
    }
}
