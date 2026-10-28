package f01;

import com.whoop.design.util.TextResource;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f01.j0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lf01/j0;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lny0/h;", "cardButton", "Ly81/f;", "titleColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ly81/f;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ly81/f;)Lf01/j0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Lny0/h;", "()Lny0/h;", "Ly81/f;", "f", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13870j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27256h cardButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    public C13870j0(TextResource title, TextResource subtitle, C27256h cardButton, EnumC39333f titleColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        this.title = title;
        this.subtitle = subtitle;
        this.cardButton = cardButton;
        this.titleColor = titleColor;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13870j0 m39321b(C13870j0 c13870j0, TextResource textResource, TextResource textResource2, C27256h c27256h, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c13870j0.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c13870j0.subtitle;
        }
        if ((i13 & 4) != 0) {
            c27256h = c13870j0.cardButton;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = c13870j0.titleColor;
        }
        return c13870j0.m39322a(textResource, textResource2, c27256h, enumC39333f);
    }

    /* JADX INFO: renamed from: a */
    public final C13870j0 m39322a(TextResource title, TextResource subtitle, C27256h cardButton, EnumC39333f titleColor) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        return new C13870j0(title, subtitle, cardButton, titleColor);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13870j0)) {
            return false;
        }
        C13870j0 c13870j0 = (C13870j0) other;
        return AbstractC22676k.m65745e(this.title, c13870j0.title) && AbstractC22676k.m65745e(this.subtitle, c13870j0.subtitle) && AbstractC22676k.m65745e(this.cardButton, c13870j0.cardButton) && this.titleColor == c13870j0.titleColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    public int hashCode() {
        return this.titleColor.hashCode() + ((this.cardButton.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        C27256h c27256h = this.cardButton;
        EnumC39333f enumC39333f = this.titleColor;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("FooterState(title=", textResource, ", subtitle=", textResource2, ", cardButton=");
        sbM106658q.append(c27256h);
        sbM106658q.append(", titleColor=");
        sbM106658q.append(enumC39333f);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
