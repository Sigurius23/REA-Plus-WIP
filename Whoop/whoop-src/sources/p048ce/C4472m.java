package p048ce;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C4472m {

    /* JADX INFO: renamed from: a */
    public final int f18002a;

    /* JADX INFO: renamed from: b */
    public final String f18003b;

    public C4472m(int i13, String content) {
        AbstractC22676k.m65750j(content, "content");
        this.f18002a = i13;
        this.f18003b = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4472m)) {
            return false;
        }
        C4472m c4472m = (C4472m) obj;
        return this.f18002a == c4472m.f18002a && AbstractC22676k.m65745e(this.f18003b, c4472m.f18003b);
    }

    public final int hashCode() {
        return this.f18003b.hashCode() + (Integer.hashCode(this.f18002a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FileLine(lineNumber=");
        sb4.append(this.f18002a);
        sb4.append(", content=");
        return AbstractC25012a.m73377j(sb4, this.f18003b, ')');
    }
}
