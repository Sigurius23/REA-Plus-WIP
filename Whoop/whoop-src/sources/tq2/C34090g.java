package tq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lr2.InterfaceC24703d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b\u001a\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b$\u0010\u0011¨\u0006+"}, m65681d2 = {"Ltq2/g;", "Llr2/d;", "Ltq2/h;", "leftBar", "rightBar", "Lcom/whoop/design/util/TextResource;", "footerText", "footerSubText", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "<init>", "(Ltq2/h;Ltq2/h;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq2/h;", "g", "()Ltq2/h;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "e", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34090g implements InterfaceC24703d {

    /* JADX INFO: renamed from: h */
    public static final int f142962h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34091h leftBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34091h rightBar;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String userJourneyStepName;

    public C34090g(C34091h leftBar, C34091h rightBar, TextResource footerText, TextResource footerSubText, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName) {
        AbstractC22676k.m65750j(leftBar, "leftBar");
        AbstractC22676k.m65750j(rightBar, "rightBar");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.leftBar = leftBar;
        this.rightBar = rightBar;
        this.footerText = footerText;
        this.footerSubText = footerSubText;
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
        if (!(other instanceof C34090g)) {
            return false;
        }
        C34090g c34090g = (C34090g) other;
        return AbstractC22676k.m65745e(this.leftBar, c34090g.leftBar) && AbstractC22676k.m65745e(this.rightBar, c34090g.rightBar) && AbstractC22676k.m65745e(this.footerText, c34090g.footerText) && AbstractC22676k.m65745e(this.footerSubText, c34090g.footerSubText) && this.footerStyle == c34090g.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c34090g.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c34090g.userJourneyStepName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C34091h getLeftBar() {
        return this.leftBar;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C34091h getRightBar() {
        return this.rightBar;
    }

    public int hashCode() {
        return this.userJourneyStepName.hashCode() + AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.rightBar.hashCode() + (this.leftBar.hashCode() * 31)) * 31, this.footerText, 31), this.footerSubText, 31)) * 31, 31);
    }

    public String toString() {
        C34091h c34091h = this.leftBar;
        C34091h c34091h2 = this.rightBar;
        TextResource textResource = this.footerText;
        TextResource textResource2 = this.footerSubText;
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        StringBuilder sb4 = new StringBuilder("DualBarStepState(leftBar=");
        sb4.append(c34091h);
        sb4.append(", rightBar=");
        sb4.append(c34091h2);
        sb4.append(", footerText=");
        AbstractC30007c.m91855y(sb4, textResource, ", footerSubText=", textResource2, ", footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
