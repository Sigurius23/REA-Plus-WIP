package wt2;

import com.whoop.design.util.TextResource;
import e11.C12584d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import zt2.C41136e;
import zt2.C41139h;

/* JADX INFO: renamed from: wt2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009a\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u00100\u001a\u0004\b3\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b/\u00105R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b6\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b+\u0010<R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b3\u0010@\u001a\u0004\b:\u0010A¨\u0006B"}, m65681d2 = {"Lwt2/n;", "", "Lwt2/d;", "datePicker", "", "planNameForAnalytics", "Lwt2/h;", "title", "Lcom/whoop/design/util/TextResource;", "description", "subtitle", "Le11/d;", "currentPlan", "", "Lm91/u;", "headerItems", "Lzt2/h;", "goalSection", "Lzt2/e;", "bannerTile", "Lwt2/g;", "progressBar", "Lwt2/e;", "gradientStyle", "<init>", "(Lwt2/d;Ljava/lang/String;Lwt2/h;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Le11/d;Ljava/util/List;Ljava/util/List;Lzt2/e;Lwt2/g;Lwt2/e;)V", "a", "(Lwt2/d;Ljava/lang/String;Lwt2/h;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Le11/d;Ljava/util/List;Ljava/util/List;Lzt2/e;Lwt2/g;Lwt2/e;)Lwt2/n;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwt2/d;", "e", "()Lwt2/d;", "b", "Ljava/lang/String;", "getPlanNameForAnalytics", "c", "Lwt2/h;", "l", "()Lwt2/h;", "d", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "k", "Le11/d;", "()Le11/d;", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzt2/e;", "()Lzt2/e;", "j", "Lwt2/g;", "()Lwt2/g;", "Lwt2/e;", "()Lwt2/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37633n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37623d datePicker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String planNameForAnalytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37627h title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C12584d currentPlan;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> headerItems;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C41139h> goalSection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C41136e bannerTile;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C37626g progressBar;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC37624e gradientStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public C37633n(C37623d c37623d, String planNameForAnalytics, C37627h title, TextResource textResource, TextResource textResource2, C12584d c12584d, List<? extends InterfaceC25312u> list, List<C41139h> goalSection, C41136e c41136e, C37626g c37626g, EnumC37624e enumC37624e) {
        AbstractC22676k.m65750j(planNameForAnalytics, "planNameForAnalytics");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(goalSection, "goalSection");
        this.datePicker = c37623d;
        this.planNameForAnalytics = planNameForAnalytics;
        this.title = title;
        this.description = textResource;
        this.subtitle = textResource2;
        this.currentPlan = c12584d;
        this.headerItems = list;
        this.goalSection = goalSection;
        this.bannerTile = c41136e;
        this.progressBar = c37626g;
        this.gradientStyle = enumC37624e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37633n m120928b(C37633n c37633n, C37623d c37623d, String str, C37627h c37627h, TextResource textResource, TextResource textResource2, C12584d c12584d, List list, List list2, C41136e c41136e, C37626g c37626g, EnumC37624e enumC37624e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c37623d = c37633n.datePicker;
        }
        if ((i13 & 2) != 0) {
            str = c37633n.planNameForAnalytics;
        }
        if ((i13 & 4) != 0) {
            c37627h = c37633n.title;
        }
        if ((i13 & 8) != 0) {
            textResource = c37633n.description;
        }
        if ((i13 & 16) != 0) {
            textResource2 = c37633n.subtitle;
        }
        if ((i13 & 32) != 0) {
            c12584d = c37633n.currentPlan;
        }
        if ((i13 & 64) != 0) {
            list = c37633n.headerItems;
        }
        if ((i13 & 128) != 0) {
            list2 = c37633n.goalSection;
        }
        if ((i13 & 256) != 0) {
            c41136e = c37633n.bannerTile;
        }
        if ((i13 & 512) != 0) {
            c37626g = c37633n.progressBar;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC37624e = c37633n.gradientStyle;
        }
        C37626g c37626g2 = c37626g;
        EnumC37624e enumC37624e2 = enumC37624e;
        List list3 = list2;
        C41136e c41136e2 = c41136e;
        C12584d c12584d2 = c12584d;
        List list4 = list;
        TextResource textResource3 = textResource2;
        C37627h c37627h2 = c37627h;
        return c37633n.m120929a(c37623d, str, c37627h2, textResource, textResource3, c12584d2, list4, list3, c41136e2, c37626g2, enumC37624e2);
    }

    /* JADX INFO: renamed from: a */
    public final C37633n m120929a(C37623d datePicker, String planNameForAnalytics, C37627h title, TextResource description, TextResource subtitle, C12584d currentPlan, List<? extends InterfaceC25312u> headerItems, List<C41139h> goalSection, C41136e bannerTile, C37626g progressBar, EnumC37624e gradientStyle) {
        AbstractC22676k.m65750j(planNameForAnalytics, "planNameForAnalytics");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(goalSection, "goalSection");
        return new C37633n(datePicker, planNameForAnalytics, title, description, subtitle, currentPlan, headerItems, goalSection, bannerTile, progressBar, gradientStyle);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C41136e getBannerTile() {
        return this.bannerTile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C12584d getCurrentPlan() {
        return this.currentPlan;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C37623d getDatePicker() {
        return this.datePicker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37633n)) {
            return false;
        }
        C37633n c37633n = (C37633n) other;
        return AbstractC22676k.m65745e(this.datePicker, c37633n.datePicker) && AbstractC22676k.m65745e(this.planNameForAnalytics, c37633n.planNameForAnalytics) && AbstractC22676k.m65745e(this.title, c37633n.title) && AbstractC22676k.m65745e(this.description, c37633n.description) && AbstractC22676k.m65745e(this.subtitle, c37633n.subtitle) && AbstractC22676k.m65745e(this.currentPlan, c37633n.currentPlan) && AbstractC22676k.m65745e(this.headerItems, c37633n.headerItems) && AbstractC22676k.m65745e(this.goalSection, c37633n.goalSection) && AbstractC22676k.m65745e(this.bannerTile, c37633n.bannerTile) && AbstractC22676k.m65745e(this.progressBar, c37633n.progressBar) && this.gradientStyle == c37633n.gradientStyle;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: g */
    public final List<C41139h> m120934g() {
        return this.goalSection;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC37624e getGradientStyle() {
        return this.gradientStyle;
    }

    public int hashCode() {
        C37623d c37623d = this.datePicker;
        int iHashCode = (this.title.hashCode() + AbstractC11266d.m30450d((c37623d == null ? 0 : c37623d.hashCode()) * 31, 31, this.planNameForAnalytics)) * 31;
        TextResource textResource = this.description;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C12584d c12584d = this.currentPlan;
        int iHashCode4 = (iHashCode3 + (c12584d == null ? 0 : c12584d.hashCode())) * 31;
        List<InterfaceC25312u> list = this.headerItems;
        int iM31983b = AbstractC11895b.m31983b((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.goalSection);
        C41136e c41136e = this.bannerTile;
        int iHashCode5 = (iM31983b + (c41136e == null ? 0 : c41136e.hashCode())) * 31;
        C37626g c37626g = this.progressBar;
        int iHashCode6 = (iHashCode5 + (c37626g == null ? 0 : c37626g.hashCode())) * 31;
        EnumC37624e enumC37624e = this.gradientStyle;
        return iHashCode6 + (enumC37624e != null ? enumC37624e.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC25312u> m120936i() {
        return this.headerItems;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C37626g getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C37627h getTitle() {
        return this.title;
    }

    public String toString() {
        C37623d c37623d = this.datePicker;
        String str = this.planNameForAnalytics;
        C37627h c37627h = this.title;
        TextResource textResource = this.description;
        TextResource textResource2 = this.subtitle;
        C12584d c12584d = this.currentPlan;
        List<InterfaceC25312u> list = this.headerItems;
        List<C41139h> list2 = this.goalSection;
        C41136e c41136e = this.bannerTile;
        C37626g c37626g = this.progressBar;
        EnumC37624e enumC37624e = this.gradientStyle;
        StringBuilder sb4 = new StringBuilder("WeeklyPlanState(datePicker=");
        sb4.append(c37623d);
        sb4.append(", planNameForAnalytics=");
        sb4.append(str);
        sb4.append(", title=");
        sb4.append(c37627h);
        sb4.append(", description=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        sb4.append(textResource2);
        sb4.append(", currentPlan=");
        sb4.append(c12584d);
        sb4.append(", headerItems=");
        AbstractC21702c.m61148s(sb4, list, ", goalSection=", list2, ", bannerTile=");
        sb4.append(c41136e);
        sb4.append(", progressBar=");
        sb4.append(c37626g);
        sb4.append(", gradientStyle=");
        sb4.append(enumC37624e);
        sb4.append(")");
        return sb4.toString();
    }
}
