package jr2;

import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: jr2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ljr2/d;", "", "Li2/x;", "color", "Li2/t;", "brush", "<init>", "(Li2/x;Li2/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li2/x;", "b", "()Li2/x;", "Li2/t;", "()Li2/t;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21905d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17919x color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC17911t brush;

    public /* synthetic */ C21905d(C17919x c17919x, AbstractC17911t abstractC17911t, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17919x, abstractC17911t);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17911t getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C17919x getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21905d)) {
            return false;
        }
        C21905d c21905d = (C21905d) other;
        return AbstractC22676k.m65745e(this.color, c21905d.color) && AbstractC22676k.m65745e(this.brush, c21905d.brush);
    }

    public int hashCode() {
        C17919x c17919x = this.color;
        int iHashCode = (c17919x == null ? 0 : Long.hashCode(c17919x.f69639a)) * 31;
        AbstractC17911t abstractC17911t = this.brush;
        return iHashCode + (abstractC17911t != null ? abstractC17911t.hashCode() : 0);
    }

    public String toString() {
        return "ViewBackground(color=" + this.color + ", brush=" + this.brush + ")";
    }

    private C21905d(C17919x c17919x, AbstractC17911t abstractC17911t) {
        this.color = c17919x;
        this.brush = abstractC17911t;
    }

    public /* synthetic */ C21905d(C17919x c17919x, AbstractC17911t abstractC17911t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c17919x, (i13 & 2) != 0 ? null : abstractC17911t, null);
    }
}
