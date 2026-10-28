package vc;

import p000.AbstractC11266d;
import p508ty.C34252f;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vc.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35873a {

    /* JADX INFO: renamed from: a */
    public final String f152713a;

    /* JADX INFO: renamed from: b */
    public final String f152714b;

    /* JADX INFO: renamed from: c */
    public final String f152715c;

    /* JADX INFO: renamed from: d */
    public final String f152716d;

    /* JADX INFO: renamed from: e */
    public final String f152717e;

    public C35873a(C34252f c34252f) {
        String str = c34252f.f143668a;
        AbstractC22676k.m65747g(str);
        String str2 = c34252f.f143669b;
        AbstractC22676k.m65747g(str2);
        String str3 = c34252f.f143670c;
        String str4 = c34252f.f143671d;
        String str5 = c34252f.f143672e;
        AbstractC22676k.m65747g(str5);
        this.f152713a = str;
        this.f152714b = str2;
        this.f152715c = str3;
        this.f152716d = str4;
        this.f152717e = str5;
        if (str3 != null && AbstractC39414r.m125890i0(str3)) {
            throw new IllegalArgumentException("ARN region must not be blank");
        }
        if (str4 != null && AbstractC39414r.m125890i0(str4)) {
            throw new IllegalArgumentException("ARN accountId must not be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35873a)) {
            return false;
        }
        C35873a c35873a = (C35873a) obj;
        if (AbstractC22676k.m65745e(this.f152713a, c35873a.f152713a) && AbstractC22676k.m65745e(this.f152714b, c35873a.f152714b) && AbstractC22676k.m65745e(this.f152715c, c35873a.f152715c) && AbstractC22676k.m65745e(this.f152716d, c35873a.f152716d)) {
            return AbstractC22676k.m65745e(this.f152717e, c35873a.f152717e);
        }
        return false;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f152713a.hashCode() * 31, 31, this.f152714b);
        String str = this.f152715c;
        int iHashCode = (iM30450d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f152716d;
        return this.f152717e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("arn:" + this.f152713a + ':' + this.f152714b + ':');
        String str = this.f152715c;
        if (str != null) {
            sb4.append(str);
        }
        sb4.append(":");
        String str2 = this.f152716d;
        if (str2 != null) {
            sb4.append(str2);
        }
        sb4.append(":" + this.f152717e);
        return sb4.toString();
    }
}
