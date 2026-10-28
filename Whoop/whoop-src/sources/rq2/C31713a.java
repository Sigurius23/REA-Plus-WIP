package rq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jr2.C21905d;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: rq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b2\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b9\u0010\u001a¨\u0006>"}, m65681d2 = {"Lrq2/a;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "", "barFillPercentage", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedText", "Lcom/whoop/design/util/TextResource;", "footerText", "footerSubText", "Ljr2/d;", "progressBackground", "progressBar", "subtitle", "title", "mainStatValue", "mainStatSuffix", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;FLjava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljr2/d;Ljr2/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "F", "e", "()F", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "f", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "Ljr2/d;", "k", "()Ljr2/d;", "i", "l", "j", "m", "n", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31713a implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float barFillPercentage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<HighlightedText> highlightedText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C21905d progressBackground;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C21905d progressBar;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String mainStatValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String mainStatSuffix;

    public C31713a(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, float f13, List<HighlightedText> highlightedText, TextResource textResource, TextResource textResource2, C21905d progressBackground, C21905d progressBar, String subtitle, String title, String mainStatValue, String mainStatSuffix) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(highlightedText, "highlightedText");
        AbstractC22676k.m65750j(progressBackground, "progressBackground");
        AbstractC22676k.m65750j(progressBar, "progressBar");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(mainStatValue, "mainStatValue");
        AbstractC22676k.m65750j(mainStatSuffix, "mainStatSuffix");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.barFillPercentage = f13;
        this.highlightedText = highlightedText;
        this.footerText = textResource;
        this.footerSubText = textResource2;
        this.progressBackground = progressBackground;
        this.progressBar = progressBar;
        this.subtitle = subtitle;
        this.title = title;
        this.mainStatValue = mainStatValue;
        this.mainStatSuffix = mainStatSuffix;
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
    public final float getBarFillPercentage() {
        return this.barFillPercentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31713a)) {
            return false;
        }
        C31713a c31713a = (C31713a) other;
        return this.footerStyle == c31713a.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31713a.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31713a.userJourneyStepName) && Float.compare(this.barFillPercentage, c31713a.barFillPercentage) == 0 && AbstractC22676k.m65745e(this.highlightedText, c31713a.highlightedText) && AbstractC22676k.m65745e(this.footerText, c31713a.footerText) && AbstractC22676k.m65745e(this.footerSubText, c31713a.footerSubText) && AbstractC22676k.m65745e(this.progressBackground, c31713a.progressBackground) && AbstractC22676k.m65745e(this.progressBar, c31713a.progressBar) && AbstractC22676k.m65745e(this.subtitle, c31713a.subtitle) && AbstractC22676k.m65745e(this.title, c31713a.title) && AbstractC22676k.m65745e(this.mainStatValue, c31713a.mainStatValue) && AbstractC22676k.m65745e(this.mainStatSuffix, c31713a.mainStatSuffix);
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
    public final List<HighlightedText> m98375h() {
        return this.highlightedText;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30447a(this.barFillPercentage, AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName), 31), 31, this.highlightedText);
        TextResource textResource = this.footerText;
        int iHashCode = (iM31983b + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerSubText;
        return this.mainStatSuffix.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.progressBar.hashCode() + ((this.progressBackground.hashCode() + ((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.subtitle), 31, this.title), 31, this.mainStatValue);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMainStatSuffix() {
        return this.mainStatSuffix;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getMainStatValue() {
        return this.mainStatValue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C21905d getProgressBackground() {
        return this.progressBackground;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C21905d getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        float f13 = this.barFillPercentage;
        List<HighlightedText> list = this.highlightedText;
        TextResource textResource = this.footerText;
        TextResource textResource2 = this.footerSubText;
        C21905d c21905d = this.progressBackground;
        C21905d c21905d2 = this.progressBar;
        String str2 = this.subtitle;
        String str3 = this.title;
        String str4 = this.mainStatValue;
        String str5 = this.mainStatSuffix;
        StringBuilder sb4 = new StringBuilder("HorizontalBarChartStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        sb4.append(str);
        sb4.append(", barFillPercentage=");
        sb4.append(f13);
        sb4.append(", highlightedText=");
        AbstractC30007c.m91852v(textResource, ", footerText=", ", footerSubText=", sb4, list);
        sb4.append(textResource2);
        sb4.append(", progressBackground=");
        sb4.append(c21905d);
        sb4.append(", progressBar=");
        sb4.append(c21905d2);
        sb4.append(", subtitle=");
        sb4.append(str2);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str3, ", mainStatValue=", str4, ", mainStatSuffix=");
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }
}
