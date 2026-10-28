package cr2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: cr2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b-\u0010'¨\u0006."}, m65681d2 = {"Lcr2/c;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "Lcom/whoop/design/util/TextResource;", "title", "", "Lcr2/g;", "stats", "legendText", "wirFooterText", "wirFooterSubText", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11087c implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C11091g> stats;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource legendText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource wirFooterText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final TextResource wirFooterSubText;

    public C11087c(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, TextResource textResource, List<C11091g> stats, TextResource legendText, TextResource textResource2, TextResource textResource3) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(stats, "stats");
        AbstractC22676k.m65750j(legendText, "legendText");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.title = textResource;
        this.stats = stats;
        this.legendText = legendText;
        this.wirFooterText = textResource2;
        this.wirFooterSubText = textResource3;
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
    public final TextResource getLegendText() {
        return this.legendText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11087c)) {
            return false;
        }
        C11087c c11087c = (C11087c) other;
        return this.footerStyle == c11087c.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c11087c.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c11087c.userJourneyStepName) && AbstractC22676k.m65745e(this.title, c11087c.title) && AbstractC22676k.m65745e(this.stats, c11087c.stats) && AbstractC22676k.m65745e(this.legendText, c11087c.legendText) && AbstractC22676k.m65745e(this.wirFooterText, c11087c.wirFooterText) && AbstractC22676k.m65745e(this.wirFooterSubText, c11087c.wirFooterSubText);
    }

    /* JADX INFO: renamed from: f */
    public final List<C11091g> m29922f() {
        return this.stats;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getWirFooterSubText() {
        return this.wirFooterSubText;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName);
        TextResource textResource = this.title;
        int iM95625a = AbstractC31061c.m95625a(AbstractC11895b.m31983b((iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.stats), this.legendText, 31);
        TextResource textResource2 = this.wirFooterText;
        int iHashCode = (iM95625a + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        TextResource textResource3 = this.wirFooterSubText;
        return iHashCode + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getWirFooterText() {
        return this.wirFooterText;
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        TextResource textResource = this.title;
        List<C11091g> list = this.stats;
        TextResource textResource2 = this.legendText;
        TextResource textResource3 = this.wirFooterText;
        TextResource textResource4 = this.wirFooterSubText;
        StringBuilder sb4 = new StringBuilder("StatItemListStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        AbstractC30007c.m91826A(sb4, str, ", title=", textResource, ", stats=");
        AbstractC30007c.m91852v(textResource2, ", legendText=", ", wirFooterText=", sb4, list);
        return AbstractC33745d.m106655n(sb4, textResource3, ", wirFooterSubText=", textResource4, ")");
    }
}
