package n23;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: n23.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C26200c extends AbstractC26202e {

    /* JADX INFO: renamed from: e */
    public static final C26199b f103911e = new C26199b();

    /* JADX INFO: renamed from: a */
    public final String f103912a;

    /* JADX INFO: renamed from: b */
    public final int f103913b;

    /* JADX INFO: renamed from: c */
    public final int f103914c;

    /* JADX INFO: renamed from: d */
    public final Throwable f103915d;

    public C26200c(String message, int i13, int i14, Throwable th3) {
        AbstractC22676k.m65750j(message, "message");
        this.f103912a = message;
        this.f103913b = i13;
        this.f103914c = i14;
        this.f103915d = th3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m77808b(Throwable th3, Throwable th4) {
        if ((th3 == null && th4 == null) || th3 == th4) {
            return true;
        }
        if (AbstractC22676k.m65745e(th3 != null ? th3.getMessage() : null, th4 != null ? th4.getMessage() : null)) {
            return m77808b(th3 != null ? th3.getCause() : null, th4 != null ? th4.getCause() : null);
        }
        return false;
    }

    @Override // n23.AbstractC26202e
    /* JADX INFO: renamed from: a */
    public final String mo77807a() {
        return this.f103912a;
    }

    /* JADX INFO: renamed from: c */
    public final Throwable m77809c() {
        return this.f103915d;
    }

    /* JADX INFO: renamed from: d */
    public final int m77810d() {
        return this.f103913b;
    }

    /* JADX INFO: renamed from: e */
    public final int m77811e() {
        return this.f103914c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26200c.class != obj.getClass()) {
            return false;
        }
        AbstractC26202e abstractC26202e = obj instanceof AbstractC26202e ? (AbstractC26202e) obj : null;
        return abstractC26202e != null && AbstractC22676k.m65745e(this.f103912a, abstractC26202e.mo77807a()) && m77808b(this.f103915d, AbstractC32417h.m101171B(abstractC26202e));
    }

    public final int hashCode() {
        int iHashCode = this.f103912a.hashCode() * 31;
        Throwable th3 = this.f103915d;
        return iHashCode + (th3 != null ? th3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f103913b, "NetworkError(message=", this.f103912a, ", serverErrorCode=", ", statusCode=");
        sbM30467u.append(this.f103914c);
        sbM30467u.append(", cause=");
        sbM30467u.append(this.f103915d);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public /* synthetic */ C26200c(String str, int i13, int i14, int i15) {
        this(str, i13, (i15 & 4) != 0 ? -1 : i14, (Throwable) null);
    }
}
