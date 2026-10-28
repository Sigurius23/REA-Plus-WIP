package lf0;

import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lf0.x0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Llf0/x0;", "", "", "title", "Ly81/f;", "titleColor", "subtitle", "Lkd1/o;", "image", "<init>", "(Ljava/lang/String;Ly81/f;Ljava/lang/String;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ly81/f;", "d", "()Ly81/f;", "Lkd1/o;", "()Lkd1/o;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23983x0 {

    /* JADX INFO: renamed from: e */
    public static final int f94685e = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    public C23983x0(String title, EnumC39333f titleColor, String str, AbstractC22403o image) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(image, "image");
        this.title = title;
        this.titleColor = titleColor;
        this.subtitle = str;
        this.image = image;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23983x0)) {
            return false;
        }
        C23983x0 c23983x0 = (C23983x0) other;
        return AbstractC22676k.m65745e(this.title, c23983x0.title) && this.titleColor == c23983x0.titleColor && AbstractC22676k.m65745e(this.subtitle, c23983x0.subtitle) && AbstractC22676k.m65745e(this.image, c23983x0.image);
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.titleColor, this.title.hashCode() * 31, 31);
        String str = this.subtitle;
        return this.image.hashCode() + ((iM61132c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return "ImageSplitItemState(title=" + this.title + ", titleColor=" + this.titleColor + ", subtitle=" + this.subtitle + ", image=" + this.image + ")";
    }
}
