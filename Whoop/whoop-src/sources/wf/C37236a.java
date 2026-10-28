package wf;

import p326mf.AbstractC25492l;
import p326mf.C25500t;
import p326mf.InterfaceC25488h;
import p501te.InterfaceC33739d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37236a implements InterfaceC33739d {

    /* JADX INFO: renamed from: a */
    public final C25500t f159235a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC25488h f159236b;

    /* JADX INFO: renamed from: c */
    public final AbstractC25492l f159237c;

    /* JADX INFO: renamed from: d */
    public final String f159238d;

    public C37236a(C25500t c25500t, InterfaceC25488h interfaceC25488h, AbstractC25492l abstractC25492l) {
        this.f159235a = c25500t;
        this.f159236b = interfaceC25488h;
        this.f159237c = abstractC25492l;
        this.f159238d = "HTTP " + c25500t.f99856a + ' ' + c25500t.f99857b;
    }

    @Override // p501te.InterfaceC33739d
    /* JADX INFO: renamed from: a */
    public final String mo106619a() {
        return this.f159238d;
    }

    /* JADX INFO: renamed from: b */
    public final C25500t m119336b() {
        return this.f159235a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37236a)) {
            return false;
        }
        C37236a c37236a = (C37236a) obj;
        return AbstractC22676k.m65745e(this.f159235a, c37236a.f159235a) && AbstractC22676k.m65745e(this.f159236b, c37236a.f159236b) && AbstractC22676k.m65745e(this.f159237c, c37236a.f159237c);
    }

    public final int hashCode() {
        return this.f159237c.hashCode() + ((this.f159236b.hashCode() + (Integer.hashCode(this.f159235a.f99856a) * 31)) * 31);
    }

    public final String toString() {
        return "DefaultHttpResponse(status=" + this.f159235a + ", headers=" + this.f159236b + ", body=" + this.f159237c + ')';
    }
}
