package r20;

import p696zy.C41210b;

/* JADX INFO: renamed from: r20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30863a {

    /* JADX INFO: renamed from: a */
    public final C41210b f127258a;

    public C30863a(C41210b c41210b) {
        this.f127258a = c41210b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30863a) && this.f127258a.equals(((C30863a) obj).f127258a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f127258a.hashCode() * 31);
    }

    public final String toString() {
        return "BuyButtonOverride(label=" + this.f127258a + ", lockEnabled=false)";
    }
}
