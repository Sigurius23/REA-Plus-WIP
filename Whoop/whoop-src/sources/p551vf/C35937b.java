package p551vf;

import cg.C4555j;
import cg.C4560o;
import java.util.LinkedHashMap;
import java.util.Map;
import p097ds.AbstractC12313p;
import p326mf.AbstractC25492l;
import p326mf.C25483c;
import p326mf.C25486f;
import p326mf.C25487g;
import p326mf.C25489i;
import p326mf.C25490j;
import p326mf.EnumC25498r;
import p326mf.InterfaceC25482b;
import p326mf.InterfaceC25488h;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.InterfaceC35957d;

/* JADX INFO: renamed from: vf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35937b implements InterfaceC35957d {

    /* JADX INFO: renamed from: E */
    public final C25483c f153014E;

    /* JADX INFO: renamed from: w */
    public EnumC25498r f153015w;

    /* JADX INFO: renamed from: x */
    public final C4555j f153016x;

    /* JADX INFO: renamed from: y */
    public final C25483c f153017y;

    /* JADX INFO: renamed from: z */
    public AbstractC25492l f153018z;

    public C35937b(EnumC25498r enumC25498r, C4555j c4555j, C25483c c25483c, AbstractC25492l abstractC25492l, C25483c c25483c2) {
        this.f153015w = enumC25498r;
        this.f153016x = c4555j;
        this.f153017y = c25483c;
        this.f153018z = abstractC25492l;
        this.f153014E = c25483c2;
    }

    @Override // vg.InterfaceC35957d
    /* JADX INFO: renamed from: a */
    public final Object mo14238a() {
        EnumC25498r enumC25498r = this.f153015w;
        C4555j c4555jM14240c = this.f153016x.mo14238a();
        LinkedHashMap linkedHashMapM34249A = AbstractC12313p.m34249A((Map) this.f153017y.f475x);
        C25483c c25483c = new C25483c(1);
        ((Map) c25483c.f475x).putAll(linkedHashMapM34249A);
        AbstractC25492l abstractC25492l = this.f153018z;
        LinkedHashMap linkedHashMapM34249A2 = AbstractC12313p.m34249A((Map) this.f153014E.f475x);
        C25483c c25483c2 = new C25483c(0);
        ((Map) c25483c2.f475x).putAll(linkedHashMapM34249A2);
        return new C35937b(enumC25498r, c4555jM14240c, c25483c, abstractC25492l, c25483c2);
    }

    /* JADX INFO: renamed from: b */
    public final C35943h m114177b() {
        InterfaceC25488h c25489i;
        InterfaceC25482b interfaceC25482bM74900Q;
        EnumC25498r method = this.f153015w;
        C4560o c4560oM14239b = this.f153016x.m14239b();
        C25483c c25483c = this.f153017y;
        if (((Map) c25483c.f475x).isEmpty()) {
            InterfaceC25488h.f99824b.getClass();
            c25489i = C25487g.f99823c;
        } else {
            Map values = (Map) c25483c.f475x;
            AbstractC22676k.m65750j(values, "values");
            c25489i = new C25489i(values);
        }
        AbstractC25492l body = this.f153018z;
        C25483c c25483c2 = this.f153014E;
        if (((Map) c25483c2.f475x).isEmpty()) {
            InterfaceC25482b.f99807a.getClass();
            interfaceC25482bM74900Q = C25486f.f99822c;
        } else {
            interfaceC25482bM74900Q = c25483c2.m74900Q();
        }
        InterfaceC25482b interfaceC25482b = interfaceC25482bM74900Q;
        AbstractC22676k.m65750j(method, "method");
        AbstractC22676k.m65750j(body, "body");
        return new C35943h(method, c4560oM14239b, c25489i, body, interfaceC25482b);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC25492l m114178c() {
        return this.f153018z;
    }

    /* JADX INFO: renamed from: d */
    public final C25483c m114179d() {
        return this.f153017y;
    }

    /* JADX INFO: renamed from: e */
    public final EnumC25498r m114180e() {
        return this.f153015w;
    }

    /* JADX INFO: renamed from: f */
    public final C25483c m114181f() {
        return this.f153014E;
    }

    /* JADX INFO: renamed from: g */
    public final C4555j m114182g() {
        return this.f153016x;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("HttpRequestBuilder(method=" + this.f153015w + ", url=" + this.f153016x + ", headers=" + this.f153017y + ", body=" + this.f153018z + ", trailingHeaders=" + this.f153014E + ')');
        return sb4.toString();
    }

    public C35937b() {
        this(EnumC25498r.f99840w, new C4555j(), new C25483c(1), C25490j.f99825a, new C25483c(0));
    }
}
