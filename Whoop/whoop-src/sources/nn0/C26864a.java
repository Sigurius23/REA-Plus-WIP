package nn0;

import com.whoop.challengedetails.domain.models.ChallengeDetailsStyle;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nn0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001f\u0010/R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b+\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b0\u00102R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u0010\"R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"¨\u00067"}, m65681d2 = {"Lnn0/a;", "", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "Lkd1/o;", "headerImage", "", "isMemberEligible", "ineligibleText", "challengeTitle", "", "Lnn0/b;", "challengeCardItems", "descriptionTitle", "descriptionText", "ctaText", "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "style", "savingText", "savingSubText", "<init>", "(Lcom/whoop/design/util/TextResource;Lkd1/o;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "Lkd1/o;", "f", "()Lkd1/o;", "c", "Z", "j", "()Z", "d", "g", "e", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;", "k", "getSavingText", "l", "getSavingSubText", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26864a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource toolbarTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o headerImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isMemberEligible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource ineligibleText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource challengeTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C26865b> challengeCardItems;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource descriptionTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource descriptionText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final TextResource ctaText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ChallengeDetailsStyle style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final TextResource savingText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource savingSubText;

    public C26864a(TextResource toolbarTitle, AbstractC22403o headerImage, boolean z4, TextResource textResource, TextResource challengeTitle, List<C26865b> challengeCardItems, TextResource descriptionTitle, TextResource descriptionText, TextResource ctaText, ChallengeDetailsStyle style, TextResource savingText, TextResource savingSubText) {
        AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
        AbstractC22676k.m65750j(headerImage, "headerImage");
        AbstractC22676k.m65750j(challengeTitle, "challengeTitle");
        AbstractC22676k.m65750j(challengeCardItems, "challengeCardItems");
        AbstractC22676k.m65750j(descriptionTitle, "descriptionTitle");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(savingText, "savingText");
        AbstractC22676k.m65750j(savingSubText, "savingSubText");
        this.toolbarTitle = toolbarTitle;
        this.headerImage = headerImage;
        this.isMemberEligible = z4;
        this.ineligibleText = textResource;
        this.challengeTitle = challengeTitle;
        this.challengeCardItems = challengeCardItems;
        this.descriptionTitle = descriptionTitle;
        this.descriptionText = descriptionText;
        this.ctaText = ctaText;
        this.style = style;
        this.savingText = savingText;
        this.savingSubText = savingSubText;
    }

    /* JADX INFO: renamed from: a */
    public final List<C26865b> m80182a() {
        return this.challengeCardItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getChallengeTitle() {
        return this.challengeTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getDescriptionTitle() {
        return this.descriptionTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26864a)) {
            return false;
        }
        C26864a c26864a = (C26864a) other;
        return AbstractC22676k.m65745e(this.toolbarTitle, c26864a.toolbarTitle) && AbstractC22676k.m65745e(this.headerImage, c26864a.headerImage) && this.isMemberEligible == c26864a.isMemberEligible && AbstractC22676k.m65745e(this.ineligibleText, c26864a.ineligibleText) && AbstractC22676k.m65745e(this.challengeTitle, c26864a.challengeTitle) && AbstractC22676k.m65745e(this.challengeCardItems, c26864a.challengeCardItems) && AbstractC22676k.m65745e(this.descriptionTitle, c26864a.descriptionTitle) && AbstractC22676k.m65745e(this.descriptionText, c26864a.descriptionText) && AbstractC22676k.m65745e(this.ctaText, c26864a.ctaText) && this.style == c26864a.style && AbstractC22676k.m65745e(this.savingText, c26864a.savingText) && AbstractC22676k.m65745e(this.savingSubText, c26864a.savingSubText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getHeaderImage() {
        return this.headerImage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getIneligibleText() {
        return this.ineligibleText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ChallengeDetailsStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC30007c.m91833c(this.headerImage, this.toolbarTitle.hashCode() * 31, 31), 31, this.isMemberEligible);
        TextResource textResource = this.ineligibleText;
        return this.savingSubText.hashCode() + AbstractC31061c.m95625a((this.style.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC31061c.m95625a((iM8289b + (textResource == null ? 0 : textResource.hashCode())) * 31, this.challengeTitle, 31), 31, this.challengeCardItems), this.descriptionTitle, 31), this.descriptionText, 31), this.ctaText, 31)) * 31, this.savingText, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsMemberEligible() {
        return this.isMemberEligible;
    }

    public String toString() {
        TextResource textResource = this.toolbarTitle;
        AbstractC22403o abstractC22403o = this.headerImage;
        boolean z4 = this.isMemberEligible;
        TextResource textResource2 = this.ineligibleText;
        TextResource textResource3 = this.challengeTitle;
        List<C26865b> list = this.challengeCardItems;
        TextResource textResource4 = this.descriptionTitle;
        TextResource textResource5 = this.descriptionText;
        TextResource textResource6 = this.ctaText;
        ChallengeDetailsStyle challengeDetailsStyle = this.style;
        TextResource textResource7 = this.savingText;
        TextResource textResource8 = this.savingSubText;
        StringBuilder sb4 = new StringBuilder("ChallengeDetails(toolbarTitle=");
        sb4.append(textResource);
        sb4.append(", headerImage=");
        sb4.append(abstractC22403o);
        sb4.append(", isMemberEligible=");
        AbstractC21702c.m61144o(textResource2, ", ineligibleText=", ", challengeTitle=", sb4, z4);
        AbstractC21702c.m61143n(textResource3, ", challengeCardItems=", ", descriptionTitle=", sb4, list);
        AbstractC30007c.m91855y(sb4, textResource4, ", descriptionText=", textResource5, ", ctaText=");
        sb4.append(textResource6);
        sb4.append(", style=");
        sb4.append(challengeDetailsStyle);
        sb4.append(", savingText=");
        return AbstractC33745d.m106655n(sb4, textResource7, ", savingSubText=", textResource8, ")");
    }
}
