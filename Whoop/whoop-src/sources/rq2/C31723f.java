package rq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.FooterText;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import lr2.InterfaceC24703d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: rq2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b.\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b$\u00103R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b \u00105R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b,\u0010\u0017¨\u00067"}, m65681d2 = {"Lrq2/f;", "Llr2/d;", "", "Lcom/whoop/user/journey/model/yearinreview/FooterText;", "footerTextList", "Lkd1/o;", "image", "Lv41/r0;", "lottieWrapper", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "text", "Lcom/whoop/design/util/TextResource;", "footerText", "footerSubText", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "<init>", "(Ljava/util/List;Lkd1/o;Lv41/r0;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Lkd1/o;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lkd1/o;", "c", "Lv41/r0;", "i", "()Lv41/r0;", "d", "j", "e", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31723f implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<FooterText> footerTextList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC35689r0 lottieWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<HighlightedText> text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String userJourneyStepName;

    public C31723f(List<FooterText> footerTextList, AbstractC22403o image, InterfaceC35689r0 interfaceC35689r0, List<HighlightedText> text, TextResource textResource, TextResource textResource2, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName) {
        AbstractC22676k.m65750j(footerTextList, "footerTextList");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.footerTextList = footerTextList;
        this.image = image;
        this.lottieWrapper = interfaceC35689r0;
        this.text = text;
        this.footerText = textResource;
        this.footerSubText = textResource2;
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
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
    public final TextResource getFooterSubText() {
        return this.footerSubText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31723f)) {
            return false;
        }
        C31723f c31723f = (C31723f) other;
        return AbstractC22676k.m65745e(this.footerTextList, c31723f.footerTextList) && AbstractC22676k.m65745e(this.image, c31723f.image) && AbstractC22676k.m65745e(this.lottieWrapper, c31723f.lottieWrapper) && AbstractC22676k.m65745e(this.text, c31723f.text) && AbstractC22676k.m65745e(this.footerText, c31723f.footerText) && AbstractC22676k.m65745e(this.footerSubText, c31723f.footerSubText) && this.footerStyle == c31723f.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31723f.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31723f.userJourneyStepName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: g */
    public final List<FooterText> m98442g() {
        return this.footerTextList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.image, this.footerTextList.hashCode() * 31, 31);
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        int iM31983b = AbstractC11895b.m31983b((iM91833c + (interfaceC35689r0 == null ? 0 : interfaceC35689r0.hashCode())) * 31, 31, this.text);
        TextResource textResource = this.footerText;
        int iHashCode = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerSubText;
        return this.userJourneyStepName.hashCode() + AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + ((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC35689r0 getLottieWrapper() {
        return this.lottieWrapper;
    }

    /* JADX INFO: renamed from: j */
    public final List<HighlightedText> m98445j() {
        return this.text;
    }

    public String toString() {
        List<FooterText> list = this.footerTextList;
        AbstractC22403o abstractC22403o = this.image;
        InterfaceC35689r0 interfaceC35689r0 = this.lottieWrapper;
        List<HighlightedText> list2 = this.text;
        TextResource textResource = this.footerText;
        TextResource textResource2 = this.footerSubText;
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        StringBuilder sb4 = new StringBuilder("ImageOnlyStepState(footerTextList=");
        sb4.append(list);
        sb4.append(", image=");
        sb4.append(abstractC22403o);
        sb4.append(", lottieWrapper=");
        sb4.append(interfaceC35689r0);
        sb4.append(", text=");
        sb4.append(list2);
        sb4.append(", footerText=");
        AbstractC30007c.m91855y(sb4, textResource, ", footerSubText=", textResource2, ", footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
