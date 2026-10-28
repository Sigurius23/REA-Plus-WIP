package ab3;

import lb3.AbstractC23811y;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;

/* JADX INFO: renamed from: ab3.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0715g {

    /* JADX INFO: renamed from: a */
    public final Object f2696a;

    public AbstractC0715g(Object obj) {
        this.f2696a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC23811y mo1776a(InterfaceC31109b0 interfaceC31109b0);

    /* JADX INFO: renamed from: b */
    public Object mo1777b() {
        return this.f2696a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo1777b = mo1777b();
        AbstractC0715g abstractC0715g = obj instanceof AbstractC0715g ? (AbstractC0715g) obj : null;
        return AbstractC22676k.m65745e(objMo1777b, abstractC0715g != null ? abstractC0715g.mo1777b() : null);
    }

    public final int hashCode() {
        Object objMo1777b = mo1777b();
        if (objMo1777b != null) {
            return objMo1777b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo1777b());
    }
}
