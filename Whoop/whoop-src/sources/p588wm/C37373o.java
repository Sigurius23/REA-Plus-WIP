package p588wm;

import q63.AbstractC30007c;

/* JADX INFO: renamed from: wm.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C37373o {

    /* JADX INFO: renamed from: a */
    public final C37375q f159867a;

    /* JADX INFO: renamed from: b */
    public final C37375q f159868b;

    public C37373o(C37375q c37375q, C37375q c37375q2) {
        this.f159867a = c37375q;
        this.f159868b = c37375q2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C37373o.class == obj.getClass()) {
            C37373o c37373o = (C37373o) obj;
            if (this.f159867a.equals(c37373o.f159867a) && this.f159868b.equals(c37373o.f159868b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f159868b.hashCode() + (this.f159867a.hashCode() * 31);
    }

    public final String toString() {
        String string;
        C37375q c37375q = this.f159867a;
        String strValueOf = String.valueOf(c37375q);
        C37375q c37375q2 = this.f159868b;
        if (c37375q.equals(c37375q2)) {
            string = "";
        } else {
            String strValueOf2 = String.valueOf(c37375q2);
            StringBuilder sb4 = new StringBuilder(strValueOf2.length() + 2);
            sb4.append(", ");
            sb4.append(strValueOf2);
            string = sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder(AbstractC30007c.m91832b(strValueOf.length() + 2, string));
        sb5.append("[");
        sb5.append(strValueOf);
        sb5.append(string);
        sb5.append("]");
        return sb5.toString();
    }
}
