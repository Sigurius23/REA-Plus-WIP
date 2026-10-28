package p485sf;

import l83.C23468n;
import p091dg.C12002a;
import p459rf.C31341l;
import p551vf.InterfaceC35936a;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: sf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32432d {

    /* JADX INFO: renamed from: a */
    public final Object f134263a;

    /* JADX INFO: renamed from: b */
    public final Object f134264b;

    /* JADX INFO: renamed from: c */
    public final C31341l f134265c;

    /* JADX INFO: renamed from: d */
    public final C12002a f134266d;

    public C32432d(Object obj, Object obj2, C31341l c31341l, C12002a executionContext) {
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134263a = obj;
        this.f134264b = obj2;
        this.f134265c = c31341l;
        this.f134266d = executionContext;
        InterfaceC35936a interfaceC35936a = c31341l.f128963w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32432d)) {
            return false;
        }
        C32432d c32432d = (C32432d) obj;
        return AbstractC22676k.m65745e(this.f134263a, c32432d.f134263a) && AbstractC22676k.m65745e(this.f134264b, c32432d.f134264b) && AbstractC22676k.m65745e(this.f134265c, c32432d.f134265c) && AbstractC22676k.m65745e(this.f134266d, c32432d.f134266d);
    }

    public final int hashCode() {
        Object obj = this.f134263a;
        return this.f134266d.hashCode() + ((this.f134265c.hashCode() + AbstractC33745d.m106644c((obj == null ? 0 : obj.hashCode()) * 31, 31, this.f134264b)) * 31);
    }

    public final String toString() {
        return "HttpInputOutputInterceptorContext(request=" + this.f134263a + ", response=" + ((Object) C23468n.m68038b(this.f134264b)) + ", call=" + this.f134265c + ", executionContext=" + this.f134266d + ')';
    }
}
