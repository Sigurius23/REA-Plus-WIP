package c42;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c42.u */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lc42/u;", "", "Lcom/whoop/design/util/TextResource;", "title", "description", "ctaText", "", "ctaUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4184u {

    /* JADX INFO: renamed from: e */
    public static final int f17017e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String ctaUrl;

    public C4184u(TextResource title, TextResource description, TextResource ctaText, String ctaUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        this.title = title;
        this.description = description;
        this.ctaText = ctaText;
        this.ctaUrl = ctaUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4184u)) {
            return false;
        }
        C4184u c4184u = (C4184u) other;
        return AbstractC22676k.m65745e(this.title, c4184u.title) && AbstractC22676k.m65745e(this.description, c4184u.description) && AbstractC22676k.m65745e(this.ctaText, c4184u.ctaText) && AbstractC22676k.m65745e(this.ctaUrl, c4184u.ctaUrl);
    }

    public int hashCode() {
        return this.ctaUrl.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), this.ctaText, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        TextResource textResource3 = this.ctaText;
        String str = this.ctaUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("PrivacyViewState(title=", textResource, ", description=", textResource2, ", ctaText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaUrl=");
        sbM106658q.append(str);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
