package wt2;

import au2.C2079d;
import au2.C2084i;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.C12476e0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: wt2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0005\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, m65681d2 = {"Lwt2/l;", "", "", "planId", "", "isDismissible", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "Lv41/r0;", "animation", "Lwt2/h;", "header", "description", "Lau2/i;", "summary", "Lau2/d;", "newSummary", "Lwt2/a;", "primaryButton", "secondaryButton", "", "goalsCompleted", "Le0;", "percentageGauge", "<init>", "(Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/r0;Lwt2/h;Lcom/whoop/design/util/TextResource;Lau2/i;Lau2/d;Lwt2/a;Lwt2/a;ILe0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "Lcom/whoop/design/util/TextResource;", "getTitle", "()Lcom/whoop/design/util/TextResource;", "d", "getSubtitle", "e", "Lv41/r0;", "getAnimation", "()Lv41/r0;", "f", "Lwt2/h;", "getHeader", "()Lwt2/h;", "g", "getDescription", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lau2/i;", "getSummary", "()Lau2/i;", "i", "Lau2/d;", "getNewSummary", "()Lau2/d;", "j", "Lwt2/a;", "getPrimaryButton", "()Lwt2/a;", "k", "getSecondaryButton", "l", "I", "m", "Le0;", "getPercentageGauge", "()Le0;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37631l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String planId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isDismissible;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC35689r0 animation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C37627h header;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C2084i summary;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C2079d newSummary;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C37620a primaryButton;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C37620a secondaryButton;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int goalsCompleted;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C12476e0 percentageGauge;

    public C37631l(String planId, boolean z4, TextResource title, TextResource subtitle, InterfaceC35689r0 animation, C37627h header, TextResource description, C2084i summary, C2079d c2079d, C37620a primaryButton, C37620a c37620a, int i13, C12476e0 c12476e0) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(summary, "summary");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.planId = planId;
        this.isDismissible = z4;
        this.title = title;
        this.subtitle = subtitle;
        this.animation = animation;
        this.header = header;
        this.description = description;
        this.summary = summary;
        this.newSummary = c2079d;
        this.primaryButton = primaryButton;
        this.secondaryButton = c37620a;
        this.goalsCompleted = i13;
        this.percentageGauge = c12476e0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGoalsCompleted() {
        return this.goalsCompleted;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37631l)) {
            return false;
        }
        C37631l c37631l = (C37631l) other;
        return AbstractC22676k.m65745e(this.planId, c37631l.planId) && this.isDismissible == c37631l.isDismissible && AbstractC22676k.m65745e(this.title, c37631l.title) && AbstractC22676k.m65745e(this.subtitle, c37631l.subtitle) && AbstractC22676k.m65745e(this.animation, c37631l.animation) && AbstractC22676k.m65745e(this.header, c37631l.header) && AbstractC22676k.m65745e(this.description, c37631l.description) && AbstractC22676k.m65745e(this.summary, c37631l.summary) && AbstractC22676k.m65745e(this.newSummary, c37631l.newSummary) && AbstractC22676k.m65745e(this.primaryButton, c37631l.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, c37631l.secondaryButton) && this.goalsCompleted == c37631l.goalsCompleted && AbstractC22676k.m65745e(this.percentageGauge, c37631l.percentageGauge);
    }

    public int hashCode() {
        int iHashCode = (this.summary.hashCode() + AbstractC31061c.m95625a((this.header.hashCode() + ((this.animation.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC2875y.m8289b(this.planId.hashCode() * 31, 31, this.isDismissible), this.title, 31), this.subtitle, 31)) * 31)) * 31, this.description, 31)) * 31;
        C2079d c2079d = this.newSummary;
        int iHashCode2 = (this.primaryButton.hashCode() + ((iHashCode + (c2079d == null ? 0 : c2079d.hashCode())) * 31)) * 31;
        C37620a c37620a = this.secondaryButton;
        int iM30448b = AbstractC11266d.m30448b(this.goalsCompleted, (iHashCode2 + (c37620a == null ? 0 : c37620a.hashCode())) * 31, 31);
        C12476e0 c12476e0 = this.percentageGauge;
        return iM30448b + (c12476e0 != null ? c12476e0.hashCode() : 0);
    }

    public String toString() {
        String str = this.planId;
        boolean z4 = this.isDismissible;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        InterfaceC35689r0 interfaceC35689r0 = this.animation;
        C37627h c37627h = this.header;
        TextResource textResource3 = this.description;
        C2084i c2084i = this.summary;
        C2079d c2079d = this.newSummary;
        C37620a c37620a = this.primaryButton;
        C37620a c37620a2 = this.secondaryButton;
        int i13 = this.goalsCompleted;
        C12476e0 c12476e0 = this.percentageGauge;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("SummaryViewState(planId=", str, ", isDismissible=", ", title=", z4);
        AbstractC30007c.m91855y(sbM73379l, textResource, ", subtitle=", textResource2, ", animation=");
        sbM73379l.append(interfaceC35689r0);
        sbM73379l.append(", header=");
        sbM73379l.append(c37627h);
        sbM73379l.append(", description=");
        sbM73379l.append(textResource3);
        sbM73379l.append(", summary=");
        sbM73379l.append(c2084i);
        sbM73379l.append(", newSummary=");
        sbM73379l.append(c2079d);
        sbM73379l.append(", primaryButton=");
        sbM73379l.append(c37620a);
        sbM73379l.append(", secondaryButton=");
        sbM73379l.append(c37620a2);
        sbM73379l.append(", goalsCompleted=");
        sbM73379l.append(i13);
        sbM73379l.append(", percentageGauge=");
        sbM73379l.append(c12476e0);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public /* synthetic */ C37631l(String str, boolean z4, TextResource textResource, TextResource textResource2, InterfaceC35689r0 interfaceC35689r0, C37627h c37627h, TextResource textResource3, C2084i c2084i, C2079d c2079d, C37620a c37620a, C37620a c37620a2, int i13, C12476e0 c12476e0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, textResource, textResource2, interfaceC35689r0, c37627h, textResource3, c2084i, c2079d, c37620a, c37620a2, i13, (i14 & 4096) != 0 ? null : c12476e0);
    }
}
