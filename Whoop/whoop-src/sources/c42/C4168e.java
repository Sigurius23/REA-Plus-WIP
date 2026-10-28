package c42;

import com.whoop.design.util.TextResource;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c42.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, m65681d2 = {"Lc42/e;", "", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "description", "buttonText", "", "backgroundImageUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "d", "c", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4168e {

    /* JADX INFO: renamed from: f */
    public static final int f16960f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String backgroundImageUrl;

    public C4168e(TextResource title, TextResource subtitle, TextResource description, TextResource buttonText, String backgroundImageUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(backgroundImageUrl, "backgroundImageUrl");
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.buttonText = buttonText;
        this.backgroundImageUrl = backgroundImageUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
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
        if (!(other instanceof C4168e)) {
            return false;
        }
        C4168e c4168e = (C4168e) other;
        return AbstractC22676k.m65745e(this.title, c4168e.title) && AbstractC22676k.m65745e(this.subtitle, c4168e.subtitle) && AbstractC22676k.m65745e(this.description, c4168e.description) && AbstractC22676k.m65745e(this.buttonText, c4168e.buttonText) && AbstractC22676k.m65745e(this.backgroundImageUrl, c4168e.backgroundImageUrl);
    }

    public int hashCode() {
        return this.backgroundImageUrl.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.description, 31), this.buttonText, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.description;
        TextResource textResource4 = this.buttonText;
        String str = this.backgroundImageUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("OnboardingSavedViewState(title=", textResource, ", subtitle=", textResource2, ", description=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", buttonText=", textResource4, ", backgroundImageUrl=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }
}
