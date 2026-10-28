package ge;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C15720e {

    /* JADX INFO: renamed from: a */
    public final String f59227a;

    public C15720e(String str) {
        this.f59227a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15720e) && AbstractC22676k.m65745e(this.f59227a, ((C15720e) obj).f59227a);
    }

    public final int hashCode() {
        return this.f59227a.hashCode();
    }

    public final String toString() {
        return AbstractC15719d.m44302c(2, "exec-env", null, this.f59227a);
    }
}
