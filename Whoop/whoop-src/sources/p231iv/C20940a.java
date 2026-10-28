package p231iv;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C20940a {

    /* JADX INFO: renamed from: a */
    public final String f79119a;

    /* JADX INFO: renamed from: b */
    public final String f79120b;

    public C20940a(String title, String str) {
        AbstractC22676k.m65750j(title, "title");
        this.f79119a = title;
        this.f79120b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20940a)) {
            return false;
        }
        C20940a c20940a = (C20940a) obj;
        return AbstractC22676k.m65745e(this.f79119a, c20940a.f79119a) && AbstractC22676k.m65745e(this.f79120b, c20940a.f79120b);
    }

    public final int hashCode() {
        return this.f79120b.hashCode() + (this.f79119a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Attribution(title=");
        sb4.append(this.f79119a);
        sb4.append(", url=");
        return AbstractC25012a.m73377j(sb4, this.f79120b, ')');
    }
}
