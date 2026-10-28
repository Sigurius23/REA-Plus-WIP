package zt1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lzt1/b;", "", "", "displayIcon", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "", "id", "<init>", "(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41127b {

    /* JADX INFO: renamed from: e */
    public static final int f177287e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean displayIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String id;

    public C41127b(boolean z4, TextResource title, TextResource subTitle, String id4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(id4, "id");
        this.displayIcon = z4;
        this.title = title;
        this.subTitle = subTitle;
        this.id = id4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisplayIcon() {
        return this.displayIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41127b)) {
            return false;
        }
        C41127b c41127b = (C41127b) other;
        return this.displayIcon == c41127b.displayIcon && AbstractC22676k.m65745e(this.title, c41127b.title) && AbstractC22676k.m65745e(this.subTitle, c41127b.subTitle) && AbstractC22676k.m65745e(this.id, c41127b.id);
    }

    public int hashCode() {
        return this.id.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(Boolean.hashCode(this.displayIcon) * 31, this.title, 31), this.subTitle, 31);
    }

    public String toString() {
        return "LabradorReadingViewState(displayIcon=" + this.displayIcon + ", title=" + this.title + ", subTitle=" + this.subTitle + ", id=" + this.id + ")";
    }
}
