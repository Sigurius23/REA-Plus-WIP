package ik2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ik2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\u0017\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0013¨\u0006&"}, m65681d2 = {"Lik2/a;", "", "", "display", "Lkd1/o;", "imageUrl", "Lcom/whoop/design/util/TextResource;", "contentDescription", "headerTitle", "bodyText", "buttonText", "", "featureId", "<init>", "(ZLkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lkd1/o;", "f", "()Lkd1/o;", "Lcom/whoop/design/util/TextResource;", "getContentDescription", "()Lcom/whoop/design/util/TextResource;", "d", "e", "g", "I", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18613a {

    /* JADX INFO: renamed from: h */
    public static final int f72776h = TextResource.$stable | AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean display;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource contentDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource headerTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource bodyText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int featureId;

    public C18613a(boolean z4, AbstractC22403o abstractC22403o, TextResource contentDescription, TextResource headerTitle, TextResource bodyText, TextResource buttonText, int i13) {
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        AbstractC22676k.m65750j(headerTitle, "headerTitle");
        AbstractC22676k.m65750j(bodyText, "bodyText");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.display = z4;
        this.imageUrl = abstractC22403o;
        this.contentDescription = contentDescription;
        this.headerTitle = headerTitle;
        this.bodyText = bodyText;
        this.buttonText = buttonText;
        this.featureId = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFeatureId() {
        return this.featureId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHeaderTitle() {
        return this.headerTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18613a)) {
            return false;
        }
        C18613a c18613a = (C18613a) other;
        return this.display == c18613a.display && AbstractC22676k.m65745e(this.imageUrl, c18613a.imageUrl) && AbstractC22676k.m65745e(this.contentDescription, c18613a.contentDescription) && AbstractC22676k.m65745e(this.headerTitle, c18613a.headerTitle) && AbstractC22676k.m65745e(this.bodyText, c18613a.bodyText) && AbstractC22676k.m65745e(this.buttonText, c18613a.buttonText) && this.featureId == c18613a.featureId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.display) * 31;
        AbstractC22403o abstractC22403o = this.imageUrl;
        return Integer.hashCode(this.featureId) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.contentDescription, 31), this.headerTitle, 31), this.bodyText, 31), this.buttonText, 31);
    }

    public String toString() {
        boolean z4 = this.display;
        AbstractC22403o abstractC22403o = this.imageUrl;
        TextResource textResource = this.contentDescription;
        TextResource textResource2 = this.headerTitle;
        TextResource textResource3 = this.bodyText;
        TextResource textResource4 = this.buttonText;
        int i13 = this.featureId;
        StringBuilder sb4 = new StringBuilder("DayOneTransitionOverlayViewState(display=");
        sb4.append(z4);
        sb4.append(", imageUrl=");
        sb4.append(abstractC22403o);
        sb4.append(", contentDescription=");
        AbstractC30007c.m91855y(sb4, textResource, ", headerTitle=", textResource2, ", bodyText=");
        AbstractC30007c.m91855y(sb4, textResource3, ", buttonText=", textResource4, ", featureId=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
