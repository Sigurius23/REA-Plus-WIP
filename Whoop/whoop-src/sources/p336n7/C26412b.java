package p336n7;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C26412b {

    /* JADX INFO: renamed from: a */
    public final String f104887a;

    /* JADX INFO: renamed from: b */
    public final String f104888b;

    /* JADX INFO: renamed from: c */
    public final int f104889c;

    public C26412b(String str, String str2, int i13) {
        this.f104887a = str;
        this.f104888b = str2;
        this.f104889c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C26412b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.records.metadata.Device");
        C26412b c26412b = (C26412b) obj;
        return AbstractC22676k.m65745e(this.f104887a, c26412b.f104887a) && AbstractC22676k.m65745e(this.f104888b, c26412b.f104888b) && this.f104889c == c26412b.f104889c;
    }

    public final int hashCode() {
        String str = this.f104887a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104888b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f104889c;
    }
}
