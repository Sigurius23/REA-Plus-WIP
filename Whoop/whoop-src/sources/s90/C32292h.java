package s90;

import com.whoop.design.util.TextResource;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: s90.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b*\u00100¨\u00061"}, m65681d2 = {"Ls90/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "Lkd1/o;", "image", "navigationBarText", "", "Ls90/c;", "trialCodes", "analyticsName", "referralType", "Ls90/b;", "howItWorksSection", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ls90/b;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ls90/b;)Ls90/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "i", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lkd1/o;", "f", "()Lkd1/o;", "d", "getNavigationBarText", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "g", "Ls90/b;", "()Ls90/b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32292h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource navigationBarText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C32287c> trialCodes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String referralType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C32286b howItWorksSection;

    public C32292h(TextResource title, String subtitle, AbstractC22403o image, TextResource navigationBarText, List<C32287c> trialCodes, String analyticsName, String str, C32286b howItWorksSection) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(trialCodes, "trialCodes");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(howItWorksSection, "howItWorksSection");
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;
        this.navigationBarText = navigationBarText;
        this.trialCodes = trialCodes;
        this.analyticsName = analyticsName;
        this.referralType = str;
        this.howItWorksSection = howItWorksSection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32292h m100515b(C32292h c32292h, TextResource textResource, String str, AbstractC22403o abstractC22403o, TextResource textResource2, List list, String str2, String str3, C32286b c32286b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c32292h.title;
        }
        if ((i13 & 2) != 0) {
            str = c32292h.subtitle;
        }
        if ((i13 & 4) != 0) {
            abstractC22403o = c32292h.image;
        }
        if ((i13 & 8) != 0) {
            textResource2 = c32292h.navigationBarText;
        }
        if ((i13 & 16) != 0) {
            list = c32292h.trialCodes;
        }
        if ((i13 & 32) != 0) {
            str2 = c32292h.analyticsName;
        }
        if ((i13 & 64) != 0) {
            str3 = c32292h.referralType;
        }
        if ((i13 & 128) != 0) {
            c32286b = c32292h.howItWorksSection;
        }
        String str4 = str3;
        C32286b c32286b2 = c32286b;
        List list2 = list;
        String str5 = str2;
        return c32292h.m100516a(textResource, str, abstractC22403o, textResource2, list2, str5, str4, c32286b2);
    }

    /* JADX INFO: renamed from: a */
    public final C32292h m100516a(TextResource title, String subtitle, AbstractC22403o image, TextResource navigationBarText, List<C32287c> trialCodes, String analyticsName, String referralType, C32286b howItWorksSection) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(navigationBarText, "navigationBarText");
        AbstractC22676k.m65750j(trialCodes, "trialCodes");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(howItWorksSection, "howItWorksSection");
        return new C32292h(title, subtitle, image, navigationBarText, trialCodes, analyticsName, referralType, howItWorksSection);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C32286b getHowItWorksSection() {
        return this.howItWorksSection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32292h)) {
            return false;
        }
        C32292h c32292h = (C32292h) other;
        return AbstractC22676k.m65745e(this.title, c32292h.title) && AbstractC22676k.m65745e(this.subtitle, c32292h.subtitle) && AbstractC22676k.m65745e(this.image, c32292h.image) && AbstractC22676k.m65745e(this.navigationBarText, c32292h.navigationBarText) && AbstractC22676k.m65745e(this.trialCodes, c32292h.trialCodes) && AbstractC22676k.m65745e(this.analyticsName, c32292h.analyticsName) && AbstractC22676k.m65745e(this.referralType, c32292h.referralType) && AbstractC22676k.m65745e(this.howItWorksSection, c32292h.howItWorksSection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReferralType() {
        return this.referralType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC30007c.m91833c(this.image, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31), this.navigationBarText, 31), 31, this.trialCodes), 31, this.analyticsName);
        String str = this.referralType;
        return this.howItWorksSection.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: j */
    public final List<C32287c> m100523j() {
        return this.trialCodes;
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        AbstractC22403o abstractC22403o = this.image;
        TextResource textResource2 = this.navigationBarText;
        List<C32287c> list = this.trialCodes;
        String str2 = this.analyticsName;
        String str3 = this.referralType;
        C32286b c32286b = this.howItWorksSection;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("ReferAFriendCodesViewState(title=", textResource, ", subtitle=", str, ", image=");
        AbstractC13673n.m38549A(sbM91845o, abstractC22403o, ", navigationBarText=", textResource2, ", trialCodes=");
        AbstractC17176i.m48511m(", analyticsName=", str2, ", referralType=", sbM91845o, list);
        sbM91845o.append(str3);
        sbM91845o.append(", howItWorksSection=");
        sbM91845o.append(c32286b);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }
}
