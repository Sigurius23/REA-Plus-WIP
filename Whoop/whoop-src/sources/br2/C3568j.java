package br2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import com.whoop.user.journey.model.yearinreview.HighlightedText;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: br2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b,\u0010(¨\u0006/"}, m65681d2 = {"Lbr2/j;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "Lcom/whoop/design/util/TextResource;", "title", "", "Lbr2/c;", "bars", "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;", "text", "footerText", "footerSubText", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3568j implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C3561c> bars;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<HighlightedText> text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource footerSubText;

    public C3568j(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, TextResource textResource, List<C3561c> bars, List<HighlightedText> text, TextResource textResource2, TextResource textResource3) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(bars, "bars");
        AbstractC22676k.m65750j(text, "text");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.title = textResource;
        this.bars = bars;
        this.text = text;
        this.footerText = textResource2;
        this.footerSubText = textResource3;
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
    public /* bridge */ int getAnimatableComponentCount() {
        return super.getAnimatableComponentCount();
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUserJourneyStepName() {
        return this.userJourneyStepName;
    }

    /* JADX INFO: renamed from: e */
    public final List<C3561c> m10713e() {
        return this.bars;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3568j)) {
            return false;
        }
        C3568j c3568j = (C3568j) other;
        return this.footerStyle == c3568j.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c3568j.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c3568j.userJourneyStepName) && AbstractC22676k.m65745e(this.title, c3568j.title) && AbstractC22676k.m65745e(this.bars, c3568j.bars) && AbstractC22676k.m65745e(this.text, c3568j.text) && AbstractC22676k.m65745e(this.footerText, c3568j.footerText) && AbstractC22676k.m65745e(this.footerSubText, c3568j.footerSubText);
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
    public final List<HighlightedText> m10716h() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName);
        TextResource textResource = this.title;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.bars), 31, this.text);
        TextResource textResource2 = this.footerText;
        int iHashCode = (iM31983b + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.footerSubText;
        return iHashCode + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        TextResource textResource = this.title;
        List<C3561c> list = this.bars;
        List<HighlightedText> list2 = this.text;
        TextResource textResource2 = this.footerText;
        TextResource textResource3 = this.footerSubText;
        StringBuilder sb4 = new StringBuilder("StackedHorizontalBarStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        AbstractC30007c.m91826A(sb4, str, ", title=", textResource, ", bars=");
        AbstractC21702c.m61148s(sb4, list, ", text=", list2, ", footerText=");
        return AbstractC33745d.m106655n(sb4, textResource2, ", footerSubText=", textResource3, ")");
    }
}
