package p116ef;

import cg.C4560o;
import gf.C15768i;
import gf.InterfaceC15761b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ef.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13140a {

    /* JADX INFO: renamed from: a */
    public final C4560o f45448a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15761b f45449b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13140a(C4560o uri) {
        this(uri, C15768i.f59433w);
        AbstractC22676k.m65750j(uri, "uri");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13140a)) {
            return false;
        }
        C13140a c13140a = (C13140a) obj;
        return AbstractC22676k.m65745e(this.f45448a, c13140a.f45448a) && AbstractC22676k.m65745e(this.f45449b, c13140a.f45449b);
    }

    public final int hashCode() {
        return this.f45449b.hashCode() + (this.f45448a.hashCode() * 961);
    }

    public final String toString() {
        return "Endpoint(uri=" + this.f45448a + ", headers=null, attributes=" + this.f45449b + ')';
    }

    public C13140a(C4560o uri, InterfaceC15761b attributes) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(attributes, "attributes");
        this.f45448a = uri;
        this.f45449b = attributes;
    }
}
