package v10;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35525a {

    /* JADX INFO: renamed from: a */
    public final String f151149a;

    public C35525a(String str) {
        this.f151149a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m112681a() {
        return AbstractC11266d.m30461o("stripesdk://payment_return_url/", this.f151149a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35525a) && AbstractC22676k.m65745e(this.f151149a, ((C35525a) obj).f151149a);
    }

    public final int hashCode() {
        return this.f151149a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DefaultReturnUrl(packageName=", this.f151149a, ")");
    }
}
