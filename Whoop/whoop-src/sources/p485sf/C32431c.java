package p485sf;

import p091dg.C12002a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32431c {

    /* JADX INFO: renamed from: a */
    public Object f134261a;

    /* JADX INFO: renamed from: b */
    public final C12002a f134262b;

    public C32431c(C12002a executionContext, Object obj) {
        AbstractC22676k.m65750j(executionContext, "executionContext");
        this.f134261a = obj;
        this.f134262b = executionContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32431c)) {
            return false;
        }
        C32431c c32431c = (C32431c) obj;
        return AbstractC22676k.m65745e(this.f134261a, c32431c.f134261a) && AbstractC22676k.m65745e(this.f134262b, c32431c.f134262b);
    }

    public final int hashCode() {
        Object obj = this.f134261a;
        return this.f134262b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "HttpInputInterceptorContext(request=" + this.f134261a + ", executionContext=" + this.f134262b + ')';
    }
}
