package f01;

import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f01.q0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, m65681d2 = {"Lf01/q0;", "", "Lgz0/m0;", "leadingIcon", "Lkd1/o;", "leadingImage", "", "title", "trailingIcon", "<init>", "(Lgz0/m0;Lkd1/o;Ljava/lang/String;Lgz0/m0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "()Lgz0/m0;", "b", "Lkd1/o;", "()Lkd1/o;", "c", "Ljava/lang/String;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13891q0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 leadingIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o leadingImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 trailingIcon;

    public C13891q0(EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, String str, EnumC16313m0 enumC16313m1) {
        this.leadingIcon = enumC16313m0;
        this.leadingImage = abstractC22403o;
        this.title = str;
        this.trailingIcon = enumC16313m1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getLeadingImage() {
        return this.leadingImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getTrailingIcon() {
        return this.trailingIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13891q0)) {
            return false;
        }
        C13891q0 c13891q0 = (C13891q0) other;
        return this.leadingIcon == c13891q0.leadingIcon && AbstractC22676k.m65745e(this.leadingImage, c13891q0.leadingImage) && AbstractC22676k.m65745e(this.title, c13891q0.title) && this.trailingIcon == c13891q0.trailingIcon;
    }

    public int hashCode() {
        EnumC16313m0 enumC16313m0 = this.leadingIcon;
        int iHashCode = (enumC16313m0 == null ? 0 : enumC16313m0.hashCode()) * 31;
        AbstractC22403o abstractC22403o = this.leadingImage;
        int iHashCode2 = (iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.trailingIcon;
        return iHashCode3 + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0);
    }

    public String toString() {
        return "HeaderContentViewState(leadingIcon=" + this.leadingIcon + ", leadingImage=" + this.leadingImage + ", title=" + this.title + ", trailingIcon=" + this.trailingIcon + ")";
    }
}
