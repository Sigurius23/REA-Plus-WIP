package p023ay;

import java.util.Set;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ay.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C2142p {

    /* JADX INFO: renamed from: a */
    public final String f8536a;

    /* JADX INFO: renamed from: b */
    public final Set f8537b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC38802c8 f8538c;

    public C2142p(String publishableKey, Set productUsage, InterfaceC38802c8 intent) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(intent, "intent");
        this.f8536a = publishableKey;
        this.f8537b = productUsage;
        this.f8538c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2142p)) {
            return false;
        }
        C2142p c2142p = (C2142p) obj;
        return AbstractC22676k.m65745e(this.f8536a, c2142p.f8536a) && AbstractC22676k.m65745e(this.f8537b, c2142p.f8537b) && AbstractC22676k.m65745e(this.f8538c, c2142p.f8538c);
    }

    public final int hashCode() {
        return this.f8538c.hashCode() + AbstractC25012a.m73368a(this.f8537b, this.f8536a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Args(publishableKey=" + this.f8536a + ", productUsage=" + this.f8537b + ", intent=" + this.f8538c + ")";
    }
}
