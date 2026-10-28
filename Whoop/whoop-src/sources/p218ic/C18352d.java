package p218ic;

import android.net.Uri;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18352d {

    /* JADX INFO: renamed from: a */
    public final Uri f71462a;

    /* JADX INFO: renamed from: b */
    public final boolean f71463b;

    public C18352d(boolean z4, Uri uri) {
        this.f71462a = uri;
        this.f71463b = z4;
    }

    /* JADX INFO: renamed from: a */
    public final Uri m52854a() {
        return this.f71462a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m52855b() {
        return this.f71463b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C18352d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        C18352d c18352d = (C18352d) obj;
        return AbstractC22676k.m65745e(this.f71462a, c18352d.f71462a) && this.f71463b == c18352d.f71463b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71463b) + (this.f71462a.hashCode() * 31);
    }
}
