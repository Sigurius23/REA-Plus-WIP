package c42;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c42.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, m65681d2 = {"Lc42/c;", "", "Lcom/whoop/design/util/TextResource;", "subtitle", "title", "description", "featureDescription", "primaryButtonText", "", "ctaUrl", "dismissText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "d", "e", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4166c {

    /* JADX INFO: renamed from: h */
    public static final int f16944h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource featureDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource primaryButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String ctaUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource dismissText;

    public C4166c(TextResource subtitle, TextResource title, TextResource description, TextResource featureDescription, TextResource primaryButtonText, String ctaUrl, TextResource dismissText) {
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(featureDescription, "featureDescription");
        AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        AbstractC22676k.m65750j(dismissText, "dismissText");
        this.subtitle = subtitle;
        this.title = title;
        this.description = description;
        this.featureDescription = featureDescription;
        this.primaryButtonText = primaryButtonText;
        this.ctaUrl = ctaUrl;
        this.dismissText = dismissText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDismissText() {
        return this.dismissText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getFeatureDescription() {
        return this.featureDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4166c)) {
            return false;
        }
        C4166c c4166c = (C4166c) other;
        return AbstractC22676k.m65745e(this.subtitle, c4166c.subtitle) && AbstractC22676k.m65745e(this.title, c4166c.title) && AbstractC22676k.m65745e(this.description, c4166c.description) && AbstractC22676k.m65745e(this.featureDescription, c4166c.featureDescription) && AbstractC22676k.m65745e(this.primaryButtonText, c4166c.primaryButtonText) && AbstractC22676k.m65745e(this.ctaUrl, c4166c.ctaUrl) && AbstractC22676k.m65745e(this.dismissText, c4166c.dismissText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.dismissText.hashCode() + AbstractC11266d.m30450d(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.subtitle.hashCode() * 31, this.title, 31), this.description, 31), this.featureDescription, 31), this.primaryButtonText, 31), 31, this.ctaUrl);
    }

    public String toString() {
        TextResource textResource = this.subtitle;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.description;
        TextResource textResource4 = this.featureDescription;
        TextResource textResource5 = this.primaryButtonText;
        String str = this.ctaUrl;
        TextResource textResource6 = this.dismissText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ExitDialogViewState(subtitle=", textResource, ", title=", textResource2, ", description=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", featureDescription=", textResource4, ", primaryButtonText=");
        AbstractC30007c.m91856z(sbM106658q, textResource5, ", ctaUrl=", str, ", dismissText=");
        return AbstractC30007c.m91841k(sbM106658q, textResource6, ")");
    }
}
