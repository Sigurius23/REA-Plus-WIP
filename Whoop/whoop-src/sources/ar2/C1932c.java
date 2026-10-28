package ar2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import lr2.InterfaceC24703d;
import ny0.C27256h;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ar2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b+\u0010.R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b/\u0010\u0013¨\u00060"}, m65681d2 = {"Lar2/c;", "Llr2/d;", "Llq2/e;", "backgroundStyle", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "", "userJourneyStepName", "Lcom/whoop/design/util/TextResource;", "shareButtonText", "Lkd1/o;", "imageSource", "shareMessage", "Lny0/h;", "secondaryButton", "shareableCardUrl", "<init>", "(Llq2/e;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lny0/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llq2/e;", "()Llq2/e;", "b", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "c", "Ljava/lang/String;", "d", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "e", "Lkd1/o;", "()Lkd1/o;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lny0/h;", "()Lny0/h;", "getShareableCardUrl", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C1932c implements InterfaceC24703d {

    /* JADX INFO: renamed from: i */
    public static final int f7661i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource shareButtonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource shareMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27256h secondaryButton;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String shareableCardUrl;

    static {
        int i13 = C27256h.f109055z;
        int i14 = TextResource.$stable;
        f7661i = i13 | i14 | AbstractC22403o.f87638a | i14;
    }

    public C1932c(InterfaceC24673e backgroundStyle, UserJourneyFooterStyle footerStyle, String userJourneyStepName, TextResource shareButtonText, AbstractC22403o imageSource, TextResource shareMessage, C27256h c27256h, String shareableCardUrl) {
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(shareButtonText, "shareButtonText");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(shareMessage, "shareMessage");
        AbstractC22676k.m65750j(shareableCardUrl, "shareableCardUrl");
        this.backgroundStyle = backgroundStyle;
        this.footerStyle = footerStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.shareButtonText = shareButtonText;
        this.imageSource = imageSource;
        this.shareMessage = shareMessage;
        this.secondaryButton = c27256h;
        this.shareableCardUrl = shareableCardUrl;
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

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1932c)) {
            return false;
        }
        C1932c c1932c = (C1932c) other;
        return AbstractC22676k.m65745e(this.backgroundStyle, c1932c.backgroundStyle) && this.footerStyle == c1932c.footerStyle && AbstractC22676k.m65745e(this.userJourneyStepName, c1932c.userJourneyStepName) && AbstractC22676k.m65745e(this.shareButtonText, c1932c.shareButtonText) && AbstractC22676k.m65745e(this.imageSource, c1932c.imageSource) && AbstractC22676k.m65745e(this.shareMessage, c1932c.shareMessage) && AbstractC22676k.m65745e(this.secondaryButton, c1932c.secondaryButton) && AbstractC22676k.m65745e(this.shareableCardUrl, c1932c.shareableCardUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C27256h getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getShareButtonText() {
        return this.shareButtonText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getShareMessage() {
        return this.shareMessage;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.imageSource, AbstractC31061c.m95625a(AbstractC11266d.m30450d((this.footerStyle.hashCode() + (this.backgroundStyle.hashCode() * 31)) * 31, 31, this.userJourneyStepName), this.shareButtonText, 31), 31), this.shareMessage, 31);
        C27256h c27256h = this.secondaryButton;
        return this.shareableCardUrl.hashCode() + ((iM95625a + (c27256h == null ? 0 : c27256h.hashCode())) * 31);
    }

    public String toString() {
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        String str = this.userJourneyStepName;
        TextResource textResource = this.shareButtonText;
        AbstractC22403o abstractC22403o = this.imageSource;
        TextResource textResource2 = this.shareMessage;
        C27256h c27256h = this.secondaryButton;
        String str2 = this.shareableCardUrl;
        StringBuilder sb4 = new StringBuilder("ShareableStepState(backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", userJourneyStepName=");
        AbstractC30007c.m91826A(sb4, str, ", shareButtonText=", textResource, ", imageSource=");
        AbstractC13673n.m38549A(sb4, abstractC22403o, ", shareMessage=", textResource2, ", secondaryButton=");
        sb4.append(c27256h);
        sb4.append(", shareableCardUrl=");
        sb4.append(str2);
        sb4.append(")");
        return sb4.toString();
    }
}
