package lw1;

import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: lw1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0094\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b+\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b(\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b\"\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b1\u0010\u0017¨\u00062"}, m65681d2 = {"Llw1/i;", "", "", "title", "price", "priceSubtitle", "", "selected", "disclaimer", "trackingLabel", "strikethroughPrice", "ctaTitle", "secondaryCtaTitle", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Llw1/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "m", "b", "g", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "Z", "j", "()Z", "e", "f", "n", "k", "i", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "l", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24773i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String price;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String priceSubtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String disclaimer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String trackingLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String strikethroughPrice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String ctaTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String secondaryCtaTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String tag;

    public C24773i(String title, String price, String str, boolean z4, String str2, String trackingLabel, String str3, String ctaTitle, String str4, C9598e destination, Action action, String str5) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.price = price;
        this.priceSubtitle = str;
        this.selected = z4;
        this.disclaimer = str2;
        this.trackingLabel = trackingLabel;
        this.strikethroughPrice = str3;
        this.ctaTitle = ctaTitle;
        this.secondaryCtaTitle = str4;
        this.destination = destination;
        this.action = action;
        this.tag = str5;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C24773i m72590b(C24773i c24773i, String str, String str2, String str3, boolean z4, String str4, String str5, String str6, String str7, String str8, C9598e c9598e, Action action, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c24773i.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c24773i.price;
        }
        if ((i13 & 4) != 0) {
            str3 = c24773i.priceSubtitle;
        }
        if ((i13 & 8) != 0) {
            z4 = c24773i.selected;
        }
        if ((i13 & 16) != 0) {
            str4 = c24773i.disclaimer;
        }
        if ((i13 & 32) != 0) {
            str5 = c24773i.trackingLabel;
        }
        if ((i13 & 64) != 0) {
            str6 = c24773i.strikethroughPrice;
        }
        if ((i13 & 128) != 0) {
            str7 = c24773i.ctaTitle;
        }
        if ((i13 & 256) != 0) {
            str8 = c24773i.secondaryCtaTitle;
        }
        if ((i13 & 512) != 0) {
            c9598e = c24773i.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            action = c24773i.action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str9 = c24773i.tag;
        }
        Action action2 = action;
        String str10 = str9;
        String str11 = str8;
        C9598e c9598e2 = c9598e;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return c24773i.m72591a(str, str2, str3, z4, str14, str15, str12, str13, str11, c9598e2, action2, str10);
    }

    /* JADX INFO: renamed from: a */
    public final C24773i m72591a(String title, String price, String priceSubtitle, boolean selected, String disclaimer, String trackingLabel, String strikethroughPrice, String ctaTitle, String secondaryCtaTitle, C9598e destination, Action action, String tag) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(price, "price");
        AbstractC22676k.m65750j(trackingLabel, "trackingLabel");
        AbstractC22676k.m65750j(ctaTitle, "ctaTitle");
        AbstractC22676k.m65750j(destination, "destination");
        return new C24773i(title, price, priceSubtitle, selected, disclaimer, trackingLabel, strikethroughPrice, ctaTitle, secondaryCtaTitle, destination, action, tag);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24773i)) {
            return false;
        }
        C24773i c24773i = (C24773i) other;
        return AbstractC22676k.m65745e(this.title, c24773i.title) && AbstractC22676k.m65745e(this.price, c24773i.price) && AbstractC22676k.m65745e(this.priceSubtitle, c24773i.priceSubtitle) && this.selected == c24773i.selected && AbstractC22676k.m65745e(this.disclaimer, c24773i.disclaimer) && AbstractC22676k.m65745e(this.trackingLabel, c24773i.trackingLabel) && AbstractC22676k.m65745e(this.strikethroughPrice, c24773i.strikethroughPrice) && AbstractC22676k.m65745e(this.ctaTitle, c24773i.ctaTitle) && AbstractC22676k.m65745e(this.secondaryCtaTitle, c24773i.secondaryCtaTitle) && AbstractC22676k.m65745e(this.destination, c24773i.destination) && AbstractC22676k.m65745e(this.action, c24773i.action) && AbstractC22676k.m65745e(this.tag, c24773i.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPriceSubtitle() {
        return this.priceSubtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.price);
        String str = this.priceSubtitle;
        int iM8289b = AbstractC2875y.m8289b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.selected);
        String str2 = this.disclaimer;
        int iM30450d2 = AbstractC11266d.m30450d((iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.trackingLabel);
        String str3 = this.strikethroughPrice;
        int iM30450d3 = AbstractC11266d.m30450d((iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.ctaTitle);
        String str4 = this.secondaryCtaTitle;
        int iM114673a = AbstractC36095b.m114673a(this.destination, (iM30450d3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        Action action = this.action;
        int iHashCode = (iM114673a + (action == null ? 0 : action.hashCode())) * 31;
        String str5 = this.tag;
        return iHashCode + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getStrikethroughPrice() {
        return this.strikethroughPrice;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTrackingLabel() {
        return this.trackingLabel;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.price;
        String str3 = this.priceSubtitle;
        boolean z4 = this.selected;
        String str4 = this.disclaimer;
        String str5 = this.trackingLabel;
        String str6 = this.strikethroughPrice;
        String str7 = this.ctaTitle;
        String str8 = this.secondaryCtaTitle;
        C9598e c9598e = this.destination;
        Action action = this.action;
        String str9 = this.tag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExtensionsV2LandingOptionState(title=", str, ", price=", str2, ", priceSubtitle=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", selected=", z4, ", disclaimer=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", trackingLabel=", str5, ", strikethroughPrice=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", ctaTitle=", str7, ", secondaryCtaTitle=");
        AbstractC30007c.m91827B(sbM32001t, str8, ", destination=", c9598e, ", action=");
        sbM32001t.append(action);
        sbM32001t.append(", tag=");
        sbM32001t.append(str9);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
