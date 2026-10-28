package p159fy;

import java.util.Set;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38797c3;

/* JADX INFO: renamed from: fy.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14860e {

    /* JADX INFO: renamed from: a */
    public final C38797c3 f55486a;

    /* JADX INFO: renamed from: b */
    public final String f55487b;

    /* JADX INFO: renamed from: c */
    public final Set f55488c;

    public C14860e(C38797c3 passiveCaptchaParams, String str, Set productUsage) {
        AbstractC22676k.m65750j(passiveCaptchaParams, "passiveCaptchaParams");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f55486a = passiveCaptchaParams;
        this.f55487b = str;
        this.f55488c = productUsage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14860e)) {
            return false;
        }
        C14860e c14860e = (C14860e) obj;
        return AbstractC22676k.m65745e(this.f55486a, c14860e.f55486a) && AbstractC22676k.m65745e(this.f55487b, c14860e.f55487b) && AbstractC22676k.m65745e(this.f55488c, c14860e.f55488c);
    }

    public final int hashCode() {
        return this.f55488c.hashCode() + AbstractC11266d.m30450d(this.f55486a.hashCode() * 31, 31, this.f55487b);
    }

    public final String toString() {
        return "Args(passiveCaptchaParams=" + this.f55486a + ", publishableKey=" + this.f55487b + ", productUsage=" + this.f55488c + ")";
    }
}
