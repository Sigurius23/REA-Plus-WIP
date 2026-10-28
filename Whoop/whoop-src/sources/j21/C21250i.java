package j21;

import b91.EnumC2888c;
import c41.C4092p2;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import v51.C35704c;

/* JADX INFO: renamed from: j21.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b4\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b*\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b.\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b'\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b=\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b/\u0010C\u001a\u0004\b8\u0010DR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b2\u0010E\u001a\u0004\b@\u0010FR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\b9\u0010HR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b,\u0010I\u001a\u0004\b:\u0010J¨\u0006K"}, m65681d2 = {"Lj21/i;", "Lm91/u;", "", "id", "Lhy0/c2;", "trend", "title", "Ly81/f;", "titleColor", "Lb91/c;", "titleStyle", "description", "actionRecommendation", "Lc41/p2;", "callout", "Lny0/h;", "actionButton", "Lgz0/m0;", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "Lj21/j;", "textAlignment", "Lv51/c;", "expandableContent", "Lj21/c;", "leadingIconStyle", "<init>", "(Ljava/lang/String;Lhy0/c2;Ljava/lang/String;Ly81/f;Lb91/c;Ljava/lang/String;Ljava/lang/String;Lc41/p2;Lny0/h;Lgz0/m0;Lcom/whoop/navigation/e;Lj21/j;Lv51/c;Lj21/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lhy0/c2;", "n", "()Lhy0/c2;", "c", "k", "d", "Ly81/f;", "l", "()Ly81/f;", "e", "Lb91/c;", "m", "()Lb91/c;", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lc41/p2;", "()Lc41/p2;", "i", "Lny0/h;", "()Lny0/h;", "j", "Lgz0/m0;", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lj21/j;", "()Lj21/j;", "Lv51/c;", "()Lv51/c;", "Lj21/c;", "()Lj21/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21250i implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17731c2 trend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC2888c titleStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String actionRecommendation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C4092p2 callout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C27256h actionButton;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC21251j textAlignment;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C35704c expandableContent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC21244c leadingIconStyle;

    public C21250i(String id4, C17731c2 trend, String title, EnumC39333f enumC39333f, EnumC2888c enumC2888c, String description, String str, C4092p2 c4092p2, C27256h c27256h, EnumC16313m0 enumC16313m0, C9598e c9598e, EnumC21251j textAlignment, C35704c c35704c, EnumC21244c leadingIconStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(textAlignment, "textAlignment");
        AbstractC22676k.m65750j(leadingIconStyle, "leadingIconStyle");
        this.id = id4;
        this.trend = trend;
        this.title = title;
        this.titleColor = enumC39333f;
        this.titleStyle = enumC2888c;
        this.description = description;
        this.actionRecommendation = str;
        this.callout = c4092p2;
        this.actionButton = c27256h;
        this.rightIcon = enumC16313m0;
        this.destination = c9598e;
        this.textAlignment = textAlignment;
        this.expandableContent = c35704c;
        this.leadingIconStyle = leadingIconStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getActionButton() {
        return this.actionButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActionRecommendation() {
        return this.actionRecommendation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C4092p2 getCallout() {
        return this.callout;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21250i)) {
            return false;
        }
        C21250i c21250i = (C21250i) other;
        return AbstractC22676k.m65745e(this.id, c21250i.id) && AbstractC22676k.m65745e(this.trend, c21250i.trend) && AbstractC22676k.m65745e(this.title, c21250i.title) && this.titleColor == c21250i.titleColor && this.titleStyle == c21250i.titleStyle && AbstractC22676k.m65745e(this.description, c21250i.description) && AbstractC22676k.m65745e(this.actionRecommendation, c21250i.actionRecommendation) && AbstractC22676k.m65745e(this.callout, c21250i.callout) && AbstractC22676k.m65745e(this.actionButton, c21250i.actionButton) && this.rightIcon == c21250i.rightIcon && AbstractC22676k.m65745e(this.destination, c21250i.destination) && this.textAlignment == c21250i.textAlignment && AbstractC22676k.m65745e(this.expandableContent, c21250i.expandableContent) && this.leadingIconStyle == c21250i.leadingIconStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C35704c getExpandableContent() {
        return this.expandableContent;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC21244c getLeadingIconStyle() {
        return this.leadingIconStyle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.trend.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title);
        EnumC39333f enumC39333f = this.titleColor;
        int iHashCode = (iM30450d + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        EnumC2888c enumC2888c = this.titleStyle;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31, 31, this.description);
        String str = this.actionRecommendation;
        int iHashCode2 = (iM30450d2 + (str == null ? 0 : str.hashCode())) * 31;
        C4092p2 c4092p2 = this.callout;
        int iHashCode3 = (iHashCode2 + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31;
        C27256h c27256h = this.actionButton;
        int iHashCode4 = (iHashCode3 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (this.textAlignment.hashCode() + ((iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31)) * 31;
        C35704c c35704c = this.expandableContent;
        return this.leadingIconStyle.hashCode() + ((iHashCode6 + (c35704c != null ? c35704c.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC21251j getTextAlignment() {
        return this.textAlignment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final EnumC2888c getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C17731c2 getTrend() {
        return this.trend;
    }

    public String toString() {
        return "InsightsItemState(id=" + this.id + ", trend=" + this.trend + ", title=" + this.title + ", titleColor=" + this.titleColor + ", titleStyle=" + this.titleStyle + ", description=" + this.description + ", actionRecommendation=" + this.actionRecommendation + ", callout=" + this.callout + ", actionButton=" + this.actionButton + ", rightIcon=" + this.rightIcon + ", destination=" + this.destination + ", textAlignment=" + this.textAlignment + ", expandableContent=" + this.expandableContent + ", leadingIconStyle=" + this.leadingIconStyle + ")";
    }
}
