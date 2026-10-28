package a41;

import ih0.AbstractC18489d0;
import java.util.List;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: a41.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"La41/m;", "Lm91/u;", "", "La41/a;", "testimonials", "", "selectedTestimonialId", "", "autoscroll", "<init>", "(Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0377m implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C0365a> testimonials;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedTestimonialId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean autoscroll;

    public C0377m(List<C0365a> testimonials, String str, boolean z4) {
        AbstractC22676k.m65750j(testimonials, "testimonials");
        this.testimonials = testimonials;
        this.selectedTestimonialId = str;
        this.autoscroll = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoscroll() {
        return this.autoscroll;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectedTestimonialId() {
        return this.selectedTestimonialId;
    }

    /* JADX INFO: renamed from: c */
    public final List<C0365a> m1045c() {
        return this.testimonials;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0377m)) {
            return false;
        }
        C0377m c0377m = (C0377m) other;
        return AbstractC22676k.m65745e(this.testimonials, c0377m.testimonials) && AbstractC22676k.m65745e(this.selectedTestimonialId, c0377m.selectedTestimonialId) && this.autoscroll == c0377m.autoscroll;
    }

    public int hashCode() {
        int iHashCode = this.testimonials.hashCode() * 31;
        String str = this.selectedTestimonialId;
        return Boolean.hashCode(this.autoscroll) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        List<C0365a> list = this.testimonials;
        String str = this.selectedTestimonialId;
        return AbstractC18489d0.m53372m(AbstractC26725a.m79507k("TestimonialsState(testimonials=", ", selectedTestimonialId=", str, ", autoscroll=", list), this.autoscroll, ")");
    }

    public /* synthetic */ C0377m(List list, String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i13 & 4) != 0 ? false : z4);
    }
}
