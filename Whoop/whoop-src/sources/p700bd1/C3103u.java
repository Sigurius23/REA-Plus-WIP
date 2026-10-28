package p700bd1;

import kd1.C22396h;
import p000.AbstractC11266d;
import p132f0.C13825t;
import p208i2.C17924z0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: bd1.u */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, m65681d2 = {"Lbd1/u;", "Lm91/u;", "Lkd1/h;", "Lf0/t;", "borderStrokeDescription", "Li2/z0;", "shadowDescription", "", "description", "Ly3/f;", "cornerRadius", "<init>", "(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/h;", "()Lkd1/h;", "b", "e", "c", "Ljava/lang/String;", "d", "Ly3/f;", "()Ly3/f;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3103u implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f12147e = C22396h.f87627d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22396h<C13825t> borderStrokeDescription;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22396h<C17924z0> shadowDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39174f cornerRadius;

    public /* synthetic */ C3103u(C22396h c22396h, C22396h c22396h2, String str, C39174f c39174f, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22396h, c22396h2, str, c39174f);
    }

    /* JADX INFO: renamed from: a */
    public final C22396h<C13825t> m8907a() {
        return this.borderStrokeDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39174f getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e */
    public final C22396h<C17924z0> m8910e() {
        return this.shadowDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3103u)) {
            return false;
        }
        C3103u c3103u = (C3103u) other;
        return AbstractC22676k.m65745e(this.borderStrokeDescription, c3103u.borderStrokeDescription) && AbstractC22676k.m65745e(this.shadowDescription, c3103u.shadowDescription) && AbstractC22676k.m65745e(this.description, c3103u.description) && AbstractC22676k.m65745e(this.cornerRadius, c3103u.cornerRadius);
    }

    public int hashCode() {
        C22396h<C13825t> c22396h = this.borderStrokeDescription;
        int iHashCode = (c22396h == null ? 0 : c22396h.hashCode()) * 31;
        C22396h<C17924z0> c22396h2 = this.shadowDescription;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (c22396h2 == null ? 0 : c22396h2.hashCode())) * 31, 31, this.description);
        C39174f c39174f = this.cornerRadius;
        return iM30450d + (c39174f != null ? Float.hashCode(c39174f.f168413w) : 0);
    }

    public String toString() {
        return "GalleryStyleSwatchState(borderStrokeDescription=" + this.borderStrokeDescription + ", shadowDescription=" + this.shadowDescription + ", description=" + this.description + ", cornerRadius=" + this.cornerRadius + ")";
    }

    private C3103u(C22396h<C13825t> c22396h, C22396h<C17924z0> c22396h2, String description, C39174f c39174f) {
        AbstractC22676k.m65750j(description, "description");
        this.borderStrokeDescription = c22396h;
        this.shadowDescription = c22396h2;
        this.description = description;
        this.cornerRadius = c39174f;
    }

    public /* synthetic */ C3103u(C22396h c22396h, C22396h c22396h2, String str, C39174f c39174f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c22396h, (i13 & 2) != 0 ? null : c22396h2, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? null : c39174f, null);
    }
}
