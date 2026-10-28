package a30;

import h20.C16624a2;
import h20.C16636c2;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C0300j implements InterfaceC0303k {

    /* JADX INFO: renamed from: a */
    public final C16636c2 f1039a;

    /* JADX INFO: renamed from: b */
    public final C16624a2 f1040b;

    /* JADX INFO: renamed from: c */
    public final String f1041c;

    /* JADX INFO: renamed from: d */
    public final String f1042d;

    public C0300j(C16636c2 customerConfig, C16624a2 c16624a2) {
        AbstractC22676k.m65750j(customerConfig, "customerConfig");
        this.f1039a = customerConfig;
        this.f1040b = c16624a2;
        this.f1041c = customerConfig.f63983w;
        this.f1042d = c16624a2.f63959w;
    }

    @Override // a30.InterfaceC0303k
    /* JADX INFO: renamed from: a */
    public final String mo825a() {
        return this.f1042d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0300j)) {
            return false;
        }
        C0300j c0300j = (C0300j) obj;
        return AbstractC22676k.m65745e(this.f1039a, c0300j.f1039a) && AbstractC22676k.m65745e(this.f1040b, c0300j.f1040b);
    }

    @Override // a30.InterfaceC0303k
    public final String getId() {
        return this.f1041c;
    }

    public final int hashCode() {
        return this.f1040b.f63959w.hashCode() + (this.f1039a.hashCode() * 31);
    }

    public final String toString() {
        return "Legacy(customerConfig=" + this.f1039a + ", accessType=" + this.f1040b + ")";
    }
}
