package p102dy;

import java.util.Set;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38797c3;

/* JADX INFO: renamed from: dy.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12434c {

    /* JADX INFO: renamed from: a */
    public final C38797c3 f42365a;

    /* JADX INFO: renamed from: b */
    public final String f42366b;

    /* JADX INFO: renamed from: c */
    public final Set f42367c;

    public C12434c(C38797c3 passiveCaptchaParams, String publishableKey, Set productUsage) {
        AbstractC22676k.m65750j(passiveCaptchaParams, "passiveCaptchaParams");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f42365a = passiveCaptchaParams;
        this.f42366b = publishableKey;
        this.f42367c = productUsage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12434c)) {
            return false;
        }
        C12434c c12434c = (C12434c) obj;
        return AbstractC22676k.m65745e(this.f42365a, c12434c.f42365a) && AbstractC22676k.m65745e(this.f42366b, c12434c.f42366b) && AbstractC22676k.m65745e(this.f42367c, c12434c.f42367c);
    }

    public final int hashCode() {
        return this.f42367c.hashCode() + AbstractC11266d.m30450d(this.f42365a.hashCode() * 31, 31, this.f42366b);
    }

    public final String toString() {
        return "Args(passiveCaptchaParams=" + this.f42365a + ", publishableKey=" + this.f42366b + ", productUsage=" + this.f42367c + ")";
    }
}
