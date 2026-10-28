package r90;

import c31.C3927k;
import com.whoop.design.util.TextResource;
import d70.C11753g;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: r90.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ¸\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b-\u0010\u001eR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010:R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b<\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b1\u0010=\u001a\u0004\b;\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b?\u0010\u001eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\bC\u0010\u001e¨\u0006D"}, m65681d2 = {"Lr90/g;", "Lm91/u;", "Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "", "subTitle", "selectAllTitle", "jumpCtaTitle", "acceptCtaTitle", "", "Lr90/j;", "terms", "analyticsName", "", "consentsAccepted", "marketingOptIn", "recommendationOptIn", "Lc31/k;", "progressButtonState", "Ld70/g;", "cardZip", "stripeToken", "userCountryCode", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLc31/k;Ld70/g;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZLc31/k;Ld70/g;Ljava/lang/String;Ljava/lang/String;)Lr90/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkd1/o;", "g", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "p", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "n", "d", "l", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ljava/util/List;", "o", "()Ljava/util/List;", "i", "Z", "()Z", "j", "k", "Lc31/k;", "()Lc31/k;", "m", "Ld70/g;", "getCardZip", "()Ld70/g;", "q", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31100g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectAllTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String jumpCtaTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String acceptCtaTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C31103j> terms;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean consentsAccepted;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean marketingOptIn;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean recommendationOptIn;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C3927k progressButtonState;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C11753g cardZip;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String stripeToken;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String userCountryCode;

    public C31100g(AbstractC22403o image, TextResource title, String subTitle, String str, String str2, String str3, List<C31103j> terms, String analyticsName, boolean z4, boolean z13, boolean z14, C3927k c3927k, C11753g cardZip, String str4, String str5) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(terms, "terms");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
        this.selectAllTitle = str;
        this.jumpCtaTitle = str2;
        this.acceptCtaTitle = str3;
        this.terms = terms;
        this.analyticsName = analyticsName;
        this.consentsAccepted = z4;
        this.marketingOptIn = z13;
        this.recommendationOptIn = z14;
        this.progressButtonState = c3927k;
        this.cardZip = cardZip;
        this.stripeToken = str4;
        this.userCountryCode = str5;
    }

    /* JADX INFO: renamed from: a */
    public final C31100g m95805a(AbstractC22403o image, TextResource title, String subTitle, String selectAllTitle, String jumpCtaTitle, String acceptCtaTitle, List<C31103j> terms, String analyticsName, boolean consentsAccepted, boolean marketingOptIn, boolean recommendationOptIn, C3927k progressButtonState, C11753g cardZip, String stripeToken, String userCountryCode) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(terms, "terms");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(cardZip, "cardZip");
        return new C31100g(image, title, subTitle, selectAllTitle, jumpCtaTitle, acceptCtaTitle, terms, analyticsName, consentsAccepted, marketingOptIn, recommendationOptIn, progressButtonState, cardZip, stripeToken, userCountryCode);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAcceptCtaTitle() {
        return this.acceptCtaTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31100g)) {
            return false;
        }
        C31100g c31100g = (C31100g) other;
        return AbstractC22676k.m65745e(this.image, c31100g.image) && AbstractC22676k.m65745e(this.title, c31100g.title) && AbstractC22676k.m65745e(this.subTitle, c31100g.subTitle) && AbstractC22676k.m65745e(this.selectAllTitle, c31100g.selectAllTitle) && AbstractC22676k.m65745e(this.jumpCtaTitle, c31100g.jumpCtaTitle) && AbstractC22676k.m65745e(this.acceptCtaTitle, c31100g.acceptCtaTitle) && AbstractC22676k.m65745e(this.terms, c31100g.terms) && AbstractC22676k.m65745e(this.analyticsName, c31100g.analyticsName) && this.consentsAccepted == c31100g.consentsAccepted && this.marketingOptIn == c31100g.marketingOptIn && this.recommendationOptIn == c31100g.recommendationOptIn && AbstractC22676k.m65745e(this.progressButtonState, c31100g.progressButtonState) && AbstractC22676k.m65745e(this.cardZip, c31100g.cardZip) && AbstractC22676k.m65745e(this.stripeToken, c31100g.stripeToken) && AbstractC22676k.m65745e(this.userCountryCode, c31100g.userCountryCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getConsentsAccepted() {
        return this.consentsAccepted;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getJumpCtaTitle() {
        return this.jumpCtaTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.image.hashCode() * 31, this.title, 31), 31, this.subTitle);
        String str = this.selectAllTitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jumpCtaTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acceptCtaTitle;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.terms), 31, this.analyticsName), 31, this.consentsAccepted), 31, this.marketingOptIn), 31, this.recommendationOptIn);
        C3927k c3927k = this.progressButtonState;
        int iHashCode3 = (this.cardZip.hashCode() + ((iM8289b + (c3927k == null ? 0 : c3927k.hashCode())) * 31)) * 31;
        String str4 = this.stripeToken;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userCountryCode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getMarketingOptIn() {
        return this.marketingOptIn;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C3927k getProgressButtonState() {
        return this.progressButtonState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRecommendationOptIn() {
        return this.recommendationOptIn;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSelectAllTitle() {
        return this.selectAllTitle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStripeToken() {
        return this.stripeToken;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: o */
    public final List<C31103j> m95817o() {
        return this.terms;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource = this.title;
        String str = this.subTitle;
        String str2 = this.selectAllTitle;
        String str3 = this.jumpCtaTitle;
        String str4 = this.acceptCtaTitle;
        List<C31103j> list = this.terms;
        String str5 = this.analyticsName;
        boolean z4 = this.consentsAccepted;
        boolean z13 = this.marketingOptIn;
        boolean z14 = this.recommendationOptIn;
        C3927k c3927k = this.progressButtonState;
        C11753g c11753g = this.cardZip;
        String str6 = this.stripeToken;
        String str7 = this.userCountryCode;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("PrivacyConsentState(image=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC11266d.m30444B(sbM114683k, str, ", selectAllTitle=", str2, ", jumpCtaTitle=");
        AbstractC11266d.m30444B(sbM114683k, str3, ", acceptCtaTitle=", str4, ", terms=");
        AbstractC17176i.m48511m(", analyticsName=", str5, ", consentsAccepted=", sbM114683k, list);
        AbstractC38963t7.m124392v(sbM114683k, z4, ", marketingOptIn=", z13, ", recommendationOptIn=");
        sbM114683k.append(z14);
        sbM114683k.append(", progressButtonState=");
        sbM114683k.append(c3927k);
        sbM114683k.append(", cardZip=");
        sbM114683k.append(c11753g);
        sbM114683k.append(", stripeToken=");
        sbM114683k.append(str6);
        sbM114683k.append(", userCountryCode=");
        return AbstractC25012a.m73376i(str7, ")", sbM114683k);
    }

    public /* synthetic */ C31100g(AbstractC22403o abstractC22403o, TextResource textResource, String str, String str2, String str3, String str4, List list, String str5, boolean z4, boolean z13, boolean z14, C3927k c3927k, C11753g c11753g, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, textResource, str, str2, str3, str4, list, str5, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c3927k, (i13 & 4096) != 0 ? new C11753g(null, 1, null) : c11753g, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str6, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str7);
    }
}
