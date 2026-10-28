package p114eb;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.l */
/* JADX INFO: loaded from: classes.dex */
public final class C12971l {

    /* JADX INFO: renamed from: a */
    public final AbstractC12958g1 f44798a;

    /* JADX INFO: renamed from: b */
    public final boolean f44799b;

    /* JADX INFO: renamed from: c */
    public final boolean f44800c;

    /* JADX INFO: renamed from: d */
    public final Object f44801d;

    public C12971l(AbstractC12958g1 abstractC12958g1, boolean z4, Object obj, boolean z13) {
        if (!abstractC12958g1.f44773a && z4) {
            throw new IllegalArgumentException(abstractC12958g1.mo36412b().concat(" does not allow nullable values").toString());
        }
        if (!z4 && z13 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + abstractC12958g1.mo36412b() + " has null value but is not nullable.").toString());
        }
        this.f44798a = abstractC12958g1;
        this.f44799b = z4;
        this.f44801d = obj;
        this.f44800c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12971l.class.equals(obj.getClass())) {
            C12971l c12971l = (C12971l) obj;
            Object obj2 = c12971l.f44801d;
            if (this.f44799b != c12971l.f44799b || this.f44800c != c12971l.f44800c || !AbstractC22676k.m65745e(this.f44798a, c12971l.f44798a)) {
                return false;
            }
            Object obj3 = this.f44801d;
            if (obj3 != null) {
                return AbstractC22676k.m65745e(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f44798a.hashCode() * 31) + (this.f44799b ? 1 : 0)) * 31) + (this.f44800c ? 1 : 0)) * 31;
        Object obj = this.f44801d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C12971l.class.getSimpleName());
        sb4.append(" Type: " + this.f44798a);
        sb4.append(" Nullable: " + this.f44799b);
        if (this.f44800c) {
            sb4.append(" DefaultValue: " + this.f44801d);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "sb.toString()");
        return string;
    }
}
