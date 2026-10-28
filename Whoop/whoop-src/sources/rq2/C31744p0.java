package rq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: rq2.p0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b0\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b*\u00102¨\u00063"}, m65681d2 = {"Lrq2/p0;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedText", "Lcom/whoop/design/util/TextResource;", "footerText", "footerSubText", "strainDate", "strainScore", "", "fillPercentage", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "e", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "f", "i", "j", "F", "()F", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31744p0 implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<HighlightedText> highlightedText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource strainDate;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource strainScore;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float fillPercentage;

    public C31744p0(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, List<HighlightedText> highlightedText, TextResource textResource, TextResource textResource2, TextResource strainDate, TextResource strainScore, float f13) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(highlightedText, "highlightedText");
        AbstractC22676k.m65750j(strainDate, "strainDate");
        AbstractC22676k.m65750j(strainScore, "strainScore");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.highlightedText = highlightedText;
        this.footerText = textResource;
        this.footerSubText = textResource2;
        this.strainDate = strainDate;
        this.strainScore = strainScore;
        this.fillPercentage = f13;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC24673e getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: b, reason: from getter */
    public UserJourneyFooterStyle getFooterStyle() {
        return this.footerStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: c */
    public /* bridge */ int mo5920c() {
        return super.mo5920c();
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUserJourneyStepName() {
        return this.userJourneyStepName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getFillPercentage() {
        return this.fillPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31744p0)) {
            return false;
        }
        C31744p0 c31744p0 = (C31744p0) other;
        return this.footerStyle == c31744p0.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31744p0.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31744p0.userJourneyStepName) && AbstractC22676k.m65745e(this.highlightedText, c31744p0.highlightedText) && AbstractC22676k.m65745e(this.footerText, c31744p0.footerText) && AbstractC22676k.m65745e(this.footerSubText, c31744p0.footerSubText) && AbstractC22676k.m65745e(this.strainDate, c31744p0.strainDate) && AbstractC22676k.m65745e(this.strainScore, c31744p0.strainScore) && Float.compare(this.fillPercentage, c31744p0.fillPercentage) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: h */
    public final List<HighlightedText> m98523h() {
        return this.highlightedText;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName), 31, this.highlightedText);
        TextResource textResource = this.footerText;
        int iHashCode = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerSubText;
        return Float.hashCode(this.fillPercentage) + AbstractC31061c.m95625a(AbstractC31061c.m95625a((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, this.strainDate, 31), this.strainScore, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getStrainDate() {
        return this.strainDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getStrainScore() {
        return this.strainScore;
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        List<HighlightedText> list = this.highlightedText;
        TextResource textResource = this.footerText;
        TextResource textResource2 = this.footerSubText;
        TextResource textResource3 = this.strainDate;
        TextResource textResource4 = this.strainScore;
        float f13 = this.fillPercentage;
        StringBuilder sb4 = new StringBuilder("StrainGaugeStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        AbstractC36095b.m114694v(str, ", highlightedText=", ", footerText=", sb4, list);
        AbstractC30007c.m91855y(sb4, textResource, ", footerSubText=", textResource2, ", strainDate=");
        AbstractC30007c.m91855y(sb4, textResource3, ", strainScore=", textResource4, ", fillPercentage=");
        return AbstractC30007c.m91837g(f13, ")", sb4);
    }
}
