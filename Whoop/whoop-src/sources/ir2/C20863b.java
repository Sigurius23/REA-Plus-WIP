package ir2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import java.util.List;
import lr2.InterfaceC24703d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ir2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001a\u0010(R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b$\u0010\u0011¨\u0006*"}, m65681d2 = {"Lir2/b;", "Llr2/d;", "", "Lir2/a;", "recommendations", "Lcom/whoop/design/util/TextResource;", "footerText", "footerSubText", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "<init>", "(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "e", "d", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "Ljava/lang/String;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20863b implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C20862a> recommendations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource footerSubText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String userJourneyStepName;

    public C20863b(List<C20862a> recommendations, TextResource footerText, TextResource footerSubText, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(footerSubText, "footerSubText");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.recommendations = recommendations;
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
        if (!(other instanceof C20863b)) {
            return false;
        }
        C20863b c20863b = (C20863b) other;
        return AbstractC22676k.m65745e(this.recommendations, c20863b.recommendations) && AbstractC22676k.m65745e(this.footerText, c20863b.footerText) && AbstractC22676k.m65745e(this.footerSubText, c20863b.footerSubText) && this.footerStyle == c20863b.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c20863b.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c20863b.userJourneyStepName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: g */
    public final List<C20862a> m57625g() {
        return this.recommendations;
    }

    public int hashCode() {
        return this.userJourneyStepName.hashCode() + AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.recommendations.hashCode() * 31, this.footerText, 31), this.footerSubText, 31)) * 31, 31);
    }

    public String toString() {
        return "WirWrapUpRecommendationsStepState(recommendations=" + this.recommendations + ", footerText=" + this.footerText + ", footerSubText=" + this.footerSubText + ", footerStyle=" + this.footerStyle + ", backgroundStyle=" + this.backgroundStyle + ", userJourneyStepName=" + this.userJourneyStepName + ")";
    }
}
