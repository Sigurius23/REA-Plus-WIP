package androidx.recyclerview.widget;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C1655a {

    /* JADX INFO: renamed from: a */
    public int f6559a;

    /* JADX INFO: renamed from: b */
    public int f6560b;

    /* JADX INFO: renamed from: c */
    public Object f6561c;

    /* JADX INFO: renamed from: d */
    public int f6562d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1655a)) {
                return false;
            }
            C1655a c1655a = (C1655a) obj;
            int i13 = this.f6559a;
            if (i13 != c1655a.f6559a) {
                return false;
            }
            if (i13 != 8 || Math.abs(this.f6562d - this.f6560b) != 1 || this.f6562d != c1655a.f6560b || this.f6560b != c1655a.f6562d) {
                if (this.f6562d != c1655a.f6562d || this.f6560b != c1655a.f6560b) {
                    return false;
                }
                Object obj2 = this.f6561c;
                if (obj2 != null) {
                    if (!obj2.equals(c1655a.f6561c)) {
                        return false;
                    }
                } else if (c1655a.f6561c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f6559a * 31) + this.f6560b) * 31) + this.f6562d;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("[");
        int i13 = this.f6559a;
        if (i13 == 1) {
            str = "add";
        } else if (i13 == 2) {
            str = "rm";
        } else if (i13 != 4) {
            str = i13 != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb4.append(str);
        sb4.append(",s:");
        sb4.append(this.f6560b);
        sb4.append("c:");
        sb4.append(this.f6562d);
        sb4.append(",p:");
        return AbstractC2875y.m8303p(sb4, "]", this.f6561c);
    }
}
