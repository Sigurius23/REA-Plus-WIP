package vq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jr2.C21905d;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: vq2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b4\u0010'R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b:\u0010'R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b2\u0010+R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b(\u0010<R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b$\u0010>R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b0\u0010\u001b¨\u0006@"}, m65681d2 = {"Lvq2/c;", "Llr2/d;", "Lcom/whoop/design/util/TextResource;", "bedtimeText", "", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "highlightedText", "Ljr2/d;", "horizontalBarBackground", "footerText", "footerSubText", "subtitleText", "sleepFillBackground", "", "sleepFillPercentageHigher", "sleepFillPercentageLower", "waketimeText", "axisLabels", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljr2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljr2/d;FFLcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "c", "Ljr2/d;", "j", "()Ljr2/d;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "g", "n", "k", "F", "l", "()F", "m", "o", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36286c implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource bedtimeText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<HighlightedText> highlightedText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21905d horizontalBarBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource subtitleText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C21905d sleepFillBackground;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float sleepFillPercentageHigher;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float sleepFillPercentageLower;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final TextResource waketimeText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<TextResource> axisLabels;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX WARN: Multi-variable type inference failed */
    public C36286c(TextResource bedtimeText, List<HighlightedText> highlightedText, C21905d horizontalBarBackground, TextResource textResource, TextResource textResource2, TextResource subtitleText, C21905d sleepFillBackground, float f13, float f14, TextResource waketimeText, List<? extends TextResource> axisLabels, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName) {
        AbstractC22676k.m65750j(bedtimeText, "bedtimeText");
        AbstractC22676k.m65750j(highlightedText, "highlightedText");
        AbstractC22676k.m65750j(horizontalBarBackground, "horizontalBarBackground");
        AbstractC22676k.m65750j(subtitleText, "subtitleText");
        AbstractC22676k.m65750j(sleepFillBackground, "sleepFillBackground");
        AbstractC22676k.m65750j(waketimeText, "waketimeText");
        AbstractC22676k.m65750j(axisLabels, "axisLabels");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.bedtimeText = bedtimeText;
        this.highlightedText = highlightedText;
        this.horizontalBarBackground = horizontalBarBackground;
        this.footerText = textResource;
        this.footerSubText = textResource2;
        this.subtitleText = subtitleText;
        this.sleepFillBackground = sleepFillBackground;
        this.sleepFillPercentageHigher = f13;
        this.sleepFillPercentageLower = f14;
        this.waketimeText = waketimeText;
        this.axisLabels = axisLabels;
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

    /* JADX INFO: renamed from: e */
    public final List<TextResource> m115996e() {
        return this.axisLabels;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36286c)) {
            return false;
        }
        C36286c c36286c = (C36286c) other;
        return AbstractC22676k.m65745e(this.bedtimeText, c36286c.bedtimeText) && AbstractC22676k.m65745e(this.highlightedText, c36286c.highlightedText) && AbstractC22676k.m65745e(this.horizontalBarBackground, c36286c.horizontalBarBackground) && AbstractC22676k.m65745e(this.footerText, c36286c.footerText) && AbstractC22676k.m65745e(this.footerSubText, c36286c.footerSubText) && AbstractC22676k.m65745e(this.subtitleText, c36286c.subtitleText) && AbstractC22676k.m65745e(this.sleepFillBackground, c36286c.sleepFillBackground) && Float.compare(this.sleepFillPercentageHigher, c36286c.sleepFillPercentageHigher) == 0 && Float.compare(this.sleepFillPercentageLower, c36286c.sleepFillPercentageLower) == 0 && AbstractC22676k.m65745e(this.waketimeText, c36286c.waketimeText) && AbstractC22676k.m65745e(this.axisLabels, c36286c.axisLabels) && this.footerStyle == c36286c.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c36286c.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c36286c.userJourneyStepName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getBedtimeText() {
        return this.bedtimeText;
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
        int iHashCode = (this.horizontalBarBackground.hashCode() + AbstractC11895b.m31983b(this.bedtimeText.hashCode() * 31, 31, this.highlightedText)) * 31;
        TextResource textResource = this.footerText;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerSubText;
        return this.userJourneyStepName.hashCode() + AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.sleepFillPercentageLower, AbstractC11266d.m30447a(this.sleepFillPercentageHigher, (this.sleepFillBackground.hashCode() + AbstractC31061c.m95625a((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, this.subtitleText, 31)) * 31, 31), 31), this.waketimeText, 31), 31, this.axisLabels)) * 31, 31);
    }

    /* JADX INFO: renamed from: i */
    public final List<HighlightedText> m116000i() {
        return this.highlightedText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C21905d getHorizontalBarBackground() {
        return this.horizontalBarBackground;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C21905d getSleepFillBackground() {
        return this.sleepFillBackground;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getSleepFillPercentageHigher() {
        return this.sleepFillPercentageHigher;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getSleepFillPercentageLower() {
        return this.sleepFillPercentageLower;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextResource getSubtitleText() {
        return this.subtitleText;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextResource getWaketimeText() {
        return this.waketimeText;
    }

    public String toString() {
        TextResource textResource = this.bedtimeText;
        List<HighlightedText> list = this.highlightedText;
        C21905d c21905d = this.horizontalBarBackground;
        TextResource textResource2 = this.footerText;
        TextResource textResource3 = this.footerSubText;
        TextResource textResource4 = this.subtitleText;
        C21905d c21905d2 = this.sleepFillBackground;
        float f13 = this.sleepFillPercentageHigher;
        float f14 = this.sleepFillPercentageLower;
        TextResource textResource5 = this.waketimeText;
        List<TextResource> list2 = this.axisLabels;
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "HorizontalSleepBarStepState(bedtimeText=", ", highlightedText=", ", horizontalBarBackground=", list);
        sbM106657p.append(c21905d);
        sbM106657p.append(", footerText=");
        sbM106657p.append(textResource2);
        sbM106657p.append(", footerSubText=");
        AbstractC30007c.m91855y(sbM106657p, textResource3, ", subtitleText=", textResource4, ", sleepFillBackground=");
        sbM106657p.append(c21905d2);
        sbM106657p.append(", sleepFillPercentageHigher=");
        sbM106657p.append(f13);
        sbM106657p.append(", sleepFillPercentageLower=");
        sbM106657p.append(f14);
        sbM106657p.append(", waketimeText=");
        sbM106657p.append(textResource5);
        sbM106657p.append(", axisLabels=");
        sbM106657p.append(list2);
        sbM106657p.append(", footerStyle=");
        sbM106657p.append(userJourneyFooterStyle);
        sbM106657p.append(", backgroundStyle=");
        sbM106657p.append(interfaceC24673e);
        sbM106657p.append(", userJourneyStepName=");
        sbM106657p.append(str);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
