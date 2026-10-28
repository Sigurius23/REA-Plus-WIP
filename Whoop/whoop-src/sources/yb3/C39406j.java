package yb3;

import i93.C18284j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C39406j {

    /* JADX INFO: renamed from: a */
    public final String f169579a;

    /* JADX INFO: renamed from: b */
    public final C18284j f169580b;

    public C39406j(String str, C18284j c18284j) {
        this.f169579a = str;
        this.f169580b = c18284j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39406j)) {
            return false;
        }
        C39406j c39406j = (C39406j) obj;
        return AbstractC22676k.m65745e(this.f169579a, c39406j.f169579a) && AbstractC22676k.m65745e(this.f169580b, c39406j.f169580b);
    }

    public final int hashCode() {
        return this.f169580b.hashCode() + (this.f169579a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f169579a + ", range=" + this.f169580b + ')';
    }
}
