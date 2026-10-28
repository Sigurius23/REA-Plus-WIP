package tp1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tp1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010\r¨\u0006!"}, m65681d2 = {"Ltp1/i;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "descriptionDisplay", "ctaTextDisplay", "Lgz0/m0;", "ctaIcon", "", "ctaUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Lgz0/m0;", "getCtaIcon", "()Lgz0/m0;", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34069i implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f142775f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource ctaTextDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 ctaIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String ctaUrl;

    public C34069i(TextResource titleDisplay, TextResource descriptionDisplay, TextResource ctaTextDisplay, EnumC16313m0 ctaIcon, String ctaUrl) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        AbstractC22676k.m65750j(ctaUrl, "ctaUrl");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.ctaTextDisplay = ctaTextDisplay;
        this.ctaIcon = ctaIcon;
        this.ctaUrl = ctaUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34069i)) {
            return false;
        }
        C34069i c34069i = (C34069i) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c34069i.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c34069i.descriptionDisplay) && AbstractC22676k.m65745e(this.ctaTextDisplay, c34069i.ctaTextDisplay) && this.ctaIcon == c34069i.ctaIcon && AbstractC22676k.m65745e(this.ctaUrl, c34069i.ctaUrl);
    }

    public int hashCode() {
        return this.ctaUrl.hashCode() + AbstractC17176i.m48500b(this.ctaIcon, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.titleDisplay.hashCode() * 31, this.descriptionDisplay, 31), this.ctaTextDisplay, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.descriptionDisplay;
        TextResource textResource3 = this.ctaTextDisplay;
        EnumC16313m0 enumC16313m0 = this.ctaIcon;
        String str = this.ctaUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("HormonalInsightsPrivacyState(titleDisplay=", textResource, ", descriptionDisplay=", textResource2, ", ctaTextDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", ctaIcon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", ctaUrl=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }
}
