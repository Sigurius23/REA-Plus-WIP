package hb3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.C32331e;

/* JADX INFO: renamed from: hb3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C17128q {

    /* JADX INFO: renamed from: a */
    public final Object f65771a;

    /* JADX INFO: renamed from: b */
    public final Object f65772b;

    /* JADX INFO: renamed from: c */
    public final Object f65773c;

    /* JADX INFO: renamed from: d */
    public final C32331e f65774d;

    /* JADX INFO: renamed from: e */
    public final String f65775e;

    public C17128q(Object obj, Object obj2, C32331e c32331e, C32331e c32331e2, String filePath) {
        AbstractC22676k.m65750j(filePath, "filePath");
        this.f65771a = obj;
        this.f65772b = obj2;
        this.f65773c = c32331e;
        this.f65774d = c32331e2;
        this.f65775e = filePath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17128q)) {
            return false;
        }
        C17128q c17128q = (C17128q) obj;
        return this.f65771a.equals(c17128q.f65771a) && AbstractC22676k.m65745e(this.f65772b, c17128q.f65772b) && AbstractC22676k.m65745e(this.f65773c, c17128q.f65773c) && this.f65774d.equals(c17128q.f65774d) && AbstractC22676k.m65745e(this.f65775e, c17128q.f65775e);
    }

    public final int hashCode() {
        int iHashCode = this.f65771a.hashCode() * 31;
        Object obj = this.f65772b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f65773c;
        return this.f65775e.hashCode() + ((this.f65774d.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb4.append(this.f65771a);
        sb4.append(", compilerVersion=");
        sb4.append(this.f65772b);
        sb4.append(", languageVersion=");
        sb4.append(this.f65773c);
        sb4.append(", expectedVersion=");
        sb4.append(this.f65774d);
        sb4.append(", filePath=");
        return AbstractC25012a.m73377j(sb4, this.f65775e, ')');
    }
}
