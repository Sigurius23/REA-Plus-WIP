package p499t9;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: t9.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33625d0 {

    /* JADX INFO: renamed from: a */
    public final C33629f0 f140364a;

    /* JADX INFO: renamed from: b */
    public final C33629f0 f140365b;

    public C33625d0(C33629f0 c33629f0, C33629f0 c33629f1) {
        this.f140364a = c33629f0;
        this.f140365b = c33629f1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33625d0.class == obj.getClass()) {
            C33625d0 c33625d0 = (C33625d0) obj;
            if (this.f140364a.equals(c33625d0.f140364a) && this.f140365b.equals(c33625d0.f140365b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f140365b.hashCode() + (this.f140364a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("[");
        C33629f0 c33629f0 = this.f140364a;
        sb4.append(c33629f0);
        C33629f0 c33629f1 = this.f140365b;
        if (c33629f0.equals(c33629f1)) {
            str = "";
        } else {
            str = ", " + c33629f1;
        }
        return AbstractC25012a.m73376i(str, "]", sb4);
    }
}
