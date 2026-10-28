package rq2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.FooterText;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import com.whoop.user.journey.model.yearinreview.NumberWithImageFontSize;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: rq2.y */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b+\u00100R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b@\u00102\u001a\u0004\bA\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b>\u0010C\u001a\u0004\bF\u0010ER\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bB\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\b@\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\b<\u00106R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bA\u0010J\u001a\u0004\bH\u0010KR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b:\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\bI\u0010#R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bD\u0010O\u001a\u0004\bG\u0010PR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\b7\u0010?¨\u0006Q"}, m65681d2 = {"Lrq2/y;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "Lcom/whoop/design/util/TextResource;", "title", "displayNumber", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "text", "Lkd1/o;", "image", "recoveryLevel", "", "isFoundingMember", "isWhoopPro", "Lcom/whoop/user/journey/model/yearinreview/FooterText;", "footerTextList", "footerText", "footerSubText", "Li2/x;", "numberColor", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "numberFontSize", "recoveryBadgeLevel", "Lv41/r0;", "lottieWrapper", "backgroundImage", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Lkd1/o;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;Ljava/lang/String;Lv41/r0;Lkd1/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "Lcom/whoop/design/util/TextResource;", "p", "()Lcom/whoop/design/util/TextResource;", "e", "f", "Ljava/util/List;", "o", "()Ljava/util/List;", "g", "Lkd1/o;", "j", "()Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "n", "i", "Ljava/lang/Boolean;", "q", "()Ljava/lang/Boolean;", "r", "k", "l", "m", "J", "()J", "Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "getNumberFontSize", "()Lcom/whoop/user/journey/model/yearinreview/NumberWithImageFontSize;", "Lv41/r0;", "()Lv41/r0;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31757y implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String displayNumber;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<HighlightedText> text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String recoveryLevel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Boolean isFoundingMember;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Boolean isWhoopPro;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<FooterText> footerTextList;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long numberColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final NumberWithImageFontSize numberFontSize;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String recoveryBadgeLevel;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    public /* synthetic */ C31757y(UserJourneyFooterStyle userJourneyFooterStyle, InterfaceC24673e interfaceC24673e, String str, TextResource textResource, String str2, List list, AbstractC22403o abstractC22403o, String str3, Boolean bool, Boolean bool2, List list2, TextResource textResource2, TextResource textResource3, long j7, NumberWithImageFontSize numberWithImageFontSize, String str4, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o2, DefaultConstructorMarker defaultConstructorMarker) {
        this(userJourneyFooterStyle, interfaceC24673e, str, textResource, str2, list, abstractC22403o, str3, bool, bool2, list2, textResource2, textResource3, j7, numberWithImageFontSize, str4, interfaceC35689r0, abstractC22403o2);
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
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31757y)) {
            return false;
        }
        C31757y c31757y = (C31757y) other;
        return this.footerStyle == c31757y.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31757y.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31757y.userJourneyStepName) && AbstractC22676k.m65745e(this.title, c31757y.title) && AbstractC22676k.m65745e(this.displayNumber, c31757y.displayNumber) && AbstractC22676k.m65745e(this.text, c31757y.text) && AbstractC22676k.m65745e(this.image, c31757y.image) && AbstractC22676k.m65745e(this.recoveryLevel, c31757y.recoveryLevel) && AbstractC22676k.m65745e(this.isFoundingMember, c31757y.isFoundingMember) && AbstractC22676k.m65745e(this.isWhoopPro, c31757y.isWhoopPro) && AbstractC22676k.m65745e(this.footerTextList, c31757y.footerTextList) && AbstractC22676k.m65745e(this.footerText, c31757y.footerText) && AbstractC22676k.m65745e(this.footerSubText, c31757y.footerSubText) && C17919x.m51542d(this.numberColor, c31757y.numberColor) && this.numberFontSize == c31757y.numberFontSize && AbstractC22676k.m65745e(this.recoveryBadgeLevel, c31757y.recoveryBadgeLevel) && AbstractC22676k.m65745e(this.lottieWrapper, c31757y.lottieWrapper) && AbstractC22676k.m65745e(this.backgroundImage, c31757y.backgroundImage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisplayNumber() {
        return this.displayNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getFooterSubText() {
        return this.footerSubText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName);
        TextResource textResource = this.title;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.displayNumber), 31, this.text);
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode = (iM31983b + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        String str = this.recoveryLevel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isFoundingMember;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWhoopPro;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<FooterText> list = this.footerTextList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        TextResource textResource2 = this.footerText;
        int iHashCode6 = (iHashCode5 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.footerSubText;
        int iHashCode7 = (iHashCode6 + (textResource3 == null ? 0 : textResource3.hashCode())) * 31;
        long j7 = this.numberColor;
        int i13 = C17919x.f69638o;
        int iM30450d2 = AbstractC11266d.m30450d((this.numberFontSize.hashCode() + AbstractC11266d.m30451e(iHashCode7, j7, 31)) * 31, 31, this.recoveryBadgeLevel);
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        int iHashCode8 = (iM30450d2 + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31;
        AbstractC22403o abstractC22403o2 = this.backgroundImage;
        return iHashCode8 + (abstractC22403o2 != null ? abstractC22403o2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<FooterText> m98570i() {
        return this.footerTextList;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getNumberColor() {
        return this.numberColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRecoveryBadgeLevel() {
        return this.recoveryBadgeLevel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /* JADX INFO: renamed from: o */
    public final List<HighlightedText> m98576o() {
        return this.text;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getIsFoundingMember() {
        return this.isFoundingMember;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getIsWhoopPro() {
        return this.isWhoopPro;
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        TextResource textResource = this.title;
        String str2 = this.displayNumber;
        List<HighlightedText> list = this.text;
        AbstractC22403o abstractC22403o = this.image;
        String str3 = this.recoveryLevel;
        Boolean bool = this.isFoundingMember;
        Boolean bool2 = this.isWhoopPro;
        List<FooterText> list2 = this.footerTextList;
        TextResource textResource2 = this.footerText;
        TextResource textResource3 = this.footerSubText;
        String strM51548j = C17919x.m51548j(this.numberColor);
        NumberWithImageFontSize numberWithImageFontSize = this.numberFontSize;
        String str4 = this.recoveryBadgeLevel;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        AbstractC22403o abstractC22403o2 = this.backgroundImage;
        StringBuilder sb4 = new StringBuilder("NumberWithImageStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        AbstractC30007c.m91826A(sb4, str, ", title=", textResource, ", displayNumber=");
        AbstractC36095b.m114694v(str2, ", text=", ", image=", sb4, list);
        sb4.append(abstractC22403o);
        sb4.append(", recoveryLevel=");
        sb4.append(str3);
        sb4.append(", isFoundingMember=");
        AbstractC3855a.m11839w(sb4, bool, ", isWhoopPro=", bool2, ", footerTextList=");
        AbstractC30007c.m91852v(textResource2, ", footerText=", ", footerSubText=", sb4, list2);
        AbstractC30007c.m91856z(sb4, textResource3, ", numberColor=", strM51548j, ", numberFontSize=");
        sb4.append(numberWithImageFontSize);
        sb4.append(", recoveryBadgeLevel=");
        sb4.append(str4);
        sb4.append(", lottieWrapper=");
        sb4.append(interfaceC35689r0);
        sb4.append(", backgroundImage=");
        sb4.append(abstractC22403o2);
        sb4.append(")");
        return sb4.toString();
    }

    private C31757y(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, TextResource textResource, String displayNumber, List<HighlightedText> text, AbstractC22403o abstractC22403o, String str, Boolean bool, Boolean bool2, List<FooterText> list, TextResource textResource2, TextResource textResource3, long j7, NumberWithImageFontSize numberFontSize, String recoveryBadgeLevel, InterfaceC35689r0 interfaceC35689r0, AbstractC22403o abstractC22403o2) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(displayNumber, "displayNumber");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(numberFontSize, "numberFontSize");
        AbstractC22676k.m65750j(recoveryBadgeLevel, "recoveryBadgeLevel");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.title = textResource;
        this.displayNumber = displayNumber;
        this.text = text;
        this.image = abstractC22403o;
        this.recoveryLevel = str;
        this.isFoundingMember = bool;
        this.isWhoopPro = bool2;
        this.footerTextList = list;
        this.footerText = textResource2;
        this.footerSubText = textResource3;
        this.numberColor = j7;
        this.numberFontSize = numberFontSize;
        this.recoveryBadgeLevel = recoveryBadgeLevel;
        this.lottieWrapper = interfaceC35689r0;
        this.backgroundImage = abstractC22403o2;
    }
}
