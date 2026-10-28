package nk1;

import e81.C12827f0;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import ny0.C27273p0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;

/* JADX INFO: renamed from: nk1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jh\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b(\u0010\u0015¨\u00060"}, m65681d2 = {"Lnk1/d;", "Lm91/n;", "", "id", "titleDisplay", "", "Lhy0/c2;", "trends", "Lny0/p0;", "button", "Le81/f0;", "pieChart", "countDisplay", "", "isExpanded", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;Le81/f0;Ljava/lang/String;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;Le81/f0;Ljava/lang/String;ZLjava/lang/String;)Lnk1/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Ljava/util/List;", "i", "()Ljava/util/List;", "d", "Lny0/p0;", "()Lny0/p0;", "e", "Le81/f0;", "g", "()Le81/f0;", "f", "Z", "j", "()Z", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26798d implements InterfaceC25305n<String> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C17731c2> trends;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27273p0 button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C12827f0 pieChart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String countDisplay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String category;

    public C26798d(String id4, String titleDisplay, List<C17731c2> trends, C27273p0 button, C12827f0 c12827f0, String countDisplay, boolean z4, String category) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(countDisplay, "countDisplay");
        AbstractC22676k.m65750j(category, "category");
        this.id = id4;
        this.titleDisplay = titleDisplay;
        this.trends = trends;
        this.button = button;
        this.pieChart = c12827f0;
        this.countDisplay = countDisplay;
        this.isExpanded = z4;
        this.category = category;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26798d m79869b(C26798d c26798d, String str, String str2, List list, C27273p0 c27273p0, C12827f0 c12827f0, String str3, boolean z4, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c26798d.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c26798d.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            list = c26798d.trends;
        }
        if ((i13 & 8) != 0) {
            c27273p0 = c26798d.button;
        }
        if ((i13 & 16) != 0) {
            c12827f0 = c26798d.pieChart;
        }
        if ((i13 & 32) != 0) {
            str3 = c26798d.countDisplay;
        }
        if ((i13 & 64) != 0) {
            z4 = c26798d.isExpanded;
        }
        if ((i13 & 128) != 0) {
            str4 = c26798d.category;
        }
        boolean z13 = z4;
        String str5 = str4;
        C12827f0 c12827f1 = c12827f0;
        String str6 = str3;
        return c26798d.m79870a(str, str2, list, c27273p0, c12827f1, str6, z13, str5);
    }

    /* JADX INFO: renamed from: a */
    public final C26798d m79870a(String id4, String titleDisplay, List<C17731c2> trends, C27273p0 button, C12827f0 pieChart, String countDisplay, boolean isExpanded, String category) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(countDisplay, "countDisplay");
        AbstractC22676k.m65750j(category, "category");
        return new C26798d(id4, titleDisplay, trends, button, pieChart, countDisplay, isExpanded, category);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27273p0 getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26798d)) {
            return false;
        }
        C26798d c26798d = (C26798d) other;
        return AbstractC22676k.m65745e(this.id, c26798d.id) && AbstractC22676k.m65745e(this.titleDisplay, c26798d.titleDisplay) && AbstractC22676k.m65745e(this.trends, c26798d.trends) && AbstractC22676k.m65745e(this.button, c26798d.button) && AbstractC22676k.m65745e(this.pieChart, c26798d.pieChart) && AbstractC22676k.m65745e(this.countDisplay, c26798d.countDisplay) && this.isExpanded == c26798d.isExpanded && AbstractC22676k.m65745e(this.category, c26798d.category);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountDisplay() {
        return this.countDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C12827f0 getPieChart() {
        return this.pieChart;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.button.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.titleDisplay), 31, this.trends)) * 31;
        C12827f0 c12827f0 = this.pieChart;
        return this.category.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode + (c12827f0 == null ? 0 : c12827f0.hashCode())) * 31, 31, this.countDisplay), 31, this.isExpanded);
    }

    /* JADX INFO: renamed from: i */
    public final List<C17731c2> m79876i() {
        return this.trends;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        List<C17731c2> list = this.trends;
        C27273p0 c27273p0 = this.button;
        C12827f0 c12827f0 = this.pieChart;
        String str3 = this.countDisplay;
        boolean z4 = this.isExpanded;
        String str4 = this.category;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabsImpactCardViewState(id=", str, ", titleDisplay=", str2, ", trends=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(c27273p0);
        sbM32001t.append(", pieChart=");
        sbM32001t.append(c12827f0);
        sbM32001t.append(", countDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", isExpanded=");
        return AbstractC21702c.m61139j(sbM32001t, z4, ", category=", str4, ")");
    }

    @Override // p720m91.InterfaceC25305n
    public String getId() {
        return this.id;
    }
}
