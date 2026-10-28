package p316m1;

import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: m1.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C24922t {

    /* JADX INFO: renamed from: a */
    public final String f97605a;

    /* JADX INFO: renamed from: b */
    public final char f97606b;

    /* JADX INFO: renamed from: c */
    public final String f97607c;

    public C24922t(String str, char c3) {
        this.f97605a = str;
        this.f97606b = c3;
        this.f97607c = AbstractC39421y.m125926K(str, String.valueOf(c3), "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24922t)) {
            return false;
        }
        C24922t c24922t = (C24922t) obj;
        return AbstractC22676k.m65745e(this.f97605a, c24922t.f97605a) && this.f97606b == c24922t.f97606b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f97606b) + (this.f97605a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f97605a + ", delimiter=" + this.f97606b + ')';
    }
}
