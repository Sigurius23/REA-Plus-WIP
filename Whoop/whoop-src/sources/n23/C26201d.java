package n23;

import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: n23.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C26201d extends AbstractC26202e {

    /* JADX INFO: renamed from: a */
    public final String f103916a;

    /* JADX INFO: renamed from: b */
    public final Throwable f103917b;

    public C26201d(String message, Throwable cause) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(cause, "cause");
        this.f103916a = message;
        this.f103917b = cause;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77812b(Throwable th3, Throwable th4) {
        if ((th3 == null && th4 == null) || th3 == th4) {
            return true;
        }
        if (AbstractC22676k.m65745e(th3 != null ? th3.getMessage() : null, th4 != null ? th4.getMessage() : null)) {
            return m77812b(th3 != null ? th3.getCause() : null, th4 != null ? th4.getCause() : null);
        }
        return false;
    }

    @Override // n23.AbstractC26202e
    /* JADX INFO: renamed from: a */
    public final String mo77807a() {
        return this.f103916a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26201d.class != obj.getClass()) {
            return false;
        }
        AbstractC26202e abstractC26202e = obj instanceof AbstractC26202e ? (AbstractC26202e) obj : null;
        return abstractC26202e != null && AbstractC22676k.m65745e(this.f103916a, abstractC26202e.mo77807a()) && m77812b(this.f103917b, AbstractC32417h.m101171B(abstractC26202e));
    }

    public final int hashCode() {
        return this.f103917b.hashCode() + (this.f103916a.hashCode() * 31);
    }

    public final String toString() {
        return "ThrowableError(message=" + this.f103916a + ", cause=" + this.f103917b + ")";
    }
}
