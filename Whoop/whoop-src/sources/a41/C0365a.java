package a41;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: a41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"La41/a;", "Lm91/u;", "", "id", "testimonial", "title", "subtitle", "Lkd1/o;", "profileImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "c", "e", "d", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0365a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String testimonial;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o profileImage;

    public C0365a(String id4, String testimonial, String str, String str2, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(testimonial, "testimonial");
        this.id = id4;
        this.testimonial = testimonial;
        this.title = str;
        this.subtitle = str2;
        this.profileImage = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getProfileImage() {
        return this.profileImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTestimonial() {
        return this.testimonial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0365a)) {
            return false;
        }
        C0365a c0365a = (C0365a) other;
        return AbstractC22676k.m65745e(this.id, c0365a.id) && AbstractC22676k.m65745e(this.testimonial, c0365a.testimonial) && AbstractC22676k.m65745e(this.title, c0365a.title) && AbstractC22676k.m65745e(this.subtitle, c0365a.subtitle) && AbstractC22676k.m65745e(this.profileImage, c0365a.profileImage);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.testimonial);
        String str = this.title;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.profileImage;
        return iHashCode2 + (abstractC22403o != null ? abstractC22403o.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.testimonial;
        String str3 = this.title;
        String str4 = this.subtitle;
        AbstractC22403o abstractC22403o = this.profileImage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TestimonialState(id=", str, ", testimonial=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", profileImage=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
