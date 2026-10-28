package fc0;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fc0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lfc0/b;", "", "Lkd1/o;", "image", "", "title", "subtitle", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Ljava/lang/String;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14358b {

    /* JADX INFO: renamed from: d */
    public static final int f52414d = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitle;

    public C14358b(AbstractC22403o image, String title, String subtitle) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14358b)) {
            return false;
        }
        C14358b c14358b = (C14358b) other;
        return AbstractC22676k.m65745e(this.image, c14358b.image) && AbstractC22676k.m65745e(this.title, c14358b.title) && AbstractC22676k.m65745e(this.subtitle, c14358b.subtitle);
    }

    public int hashCode() {
        return this.subtitle.hashCode() + AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        String str = this.title;
        String str2 = this.subtitle;
        StringBuilder sb4 = new StringBuilder("HorizontalImagePagerItemState(image=");
        sb4.append(abstractC22403o);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", subtitle=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
