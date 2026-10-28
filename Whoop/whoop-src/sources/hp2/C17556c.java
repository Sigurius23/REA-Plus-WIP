package hp2;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: hp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lhp2/c;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "imageSubtitle", "title", "subtitle", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17556c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f67968e = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource imageSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    public C17556c(AbstractC22403o image, TextResource imageSubtitle, TextResource title, TextResource subtitle) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(imageSubtitle, "imageSubtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.image = image;
        this.imageSubtitle = imageSubtitle;
        this.title = title;
        this.subtitle = subtitle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getImageSubtitle() {
        return this.imageSubtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17556c)) {
            return false;
        }
        C17556c c17556c = (C17556c) other;
        return AbstractC22676k.m65745e(this.image, c17556c.image) && AbstractC22676k.m65745e(this.imageSubtitle, c17556c.imageSubtitle) && AbstractC22676k.m65745e(this.title, c17556c.title) && AbstractC22676k.m65745e(this.subtitle, c17556c.subtitle);
    }

    public int hashCode() {
        return this.subtitle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.image.hashCode() * 31, this.imageSubtitle, 31), this.title, 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.imageSubtitle;
        return AbstractC33745d.m106655n(AbstractC36095b.m114683k("ReceiptHeaderViewState(image=", textResource, abstractC22403o, ", imageSubtitle=", ", title="), this.title, ", subtitle=", this.subtitle, ")");
    }
}
