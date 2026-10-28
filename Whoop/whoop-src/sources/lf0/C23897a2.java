package lf0;

import c41.C4092p2;
import de0.C11980a;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.a2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0092\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b&\u0010/R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b*\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\b8\u0010;¨\u0006<"}, m65681d2 = {"Llf0/a2;", "Lm91/u;", "", "siteCode", "titleDisplay", "subtitleDisplay", "distanceDisplay", "Lgz0/m0;", "distanceIcon", "", "Llf0/e;", "appointmentButtons", "collapsedTextDisplay", "expandedTextDisplay", "Lc41/p2;", "infoCallout", "", "isExpanded", "", "maxVisibleButtons", "Lde0/a;", "selectedAppointment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lc41/p2;ZILde0/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lc41/p2;ZILde0/a;)Llf0/a2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "l", "b", "n", "c", "m", "d", "f", "e", "Lgz0/m0;", "g", "()Lgz0/m0;", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Lc41/p2;", "()Lc41/p2;", "j", "Z", "o", "()Z", "k", "I", "Lde0/a;", "()Lde0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23897a2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String siteCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String subtitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String distanceDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC16313m0 distanceIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C23910e> appointmentButtons;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String collapsedTextDisplay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String expandedTextDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C4092p2 infoCallout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isExpanded;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int maxVisibleButtons;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C11980a selectedAppointment;

    public C23897a2(String siteCode, String titleDisplay, String subtitleDisplay, String distanceDisplay, EnumC16313m0 distanceIcon, List<C23910e> appointmentButtons, String collapsedTextDisplay, String expandedTextDisplay, C4092p2 c4092p2, boolean z4, int i13, C11980a c11980a) {
        AbstractC22676k.m65750j(siteCode, "siteCode");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(distanceDisplay, "distanceDisplay");
        AbstractC22676k.m65750j(distanceIcon, "distanceIcon");
        AbstractC22676k.m65750j(appointmentButtons, "appointmentButtons");
        AbstractC22676k.m65750j(collapsedTextDisplay, "collapsedTextDisplay");
        AbstractC22676k.m65750j(expandedTextDisplay, "expandedTextDisplay");
        this.siteCode = siteCode;
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.distanceDisplay = distanceDisplay;
        this.distanceIcon = distanceIcon;
        this.appointmentButtons = appointmentButtons;
        this.collapsedTextDisplay = collapsedTextDisplay;
        this.expandedTextDisplay = expandedTextDisplay;
        this.infoCallout = c4092p2;
        this.isExpanded = z4;
        this.maxVisibleButtons = i13;
        this.selectedAppointment = c11980a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23897a2 m70182b(C23897a2 c23897a2, String str, String str2, String str3, String str4, EnumC16313m0 enumC16313m0, List list, String str5, String str6, C4092p2 c4092p2, boolean z4, int i13, C11980a c11980a, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c23897a2.siteCode;
        }
        if ((i14 & 2) != 0) {
            str2 = c23897a2.titleDisplay;
        }
        if ((i14 & 4) != 0) {
            str3 = c23897a2.subtitleDisplay;
        }
        if ((i14 & 8) != 0) {
            str4 = c23897a2.distanceDisplay;
        }
        if ((i14 & 16) != 0) {
            enumC16313m0 = c23897a2.distanceIcon;
        }
        if ((i14 & 32) != 0) {
            list = c23897a2.appointmentButtons;
        }
        if ((i14 & 64) != 0) {
            str5 = c23897a2.collapsedTextDisplay;
        }
        if ((i14 & 128) != 0) {
            str6 = c23897a2.expandedTextDisplay;
        }
        if ((i14 & 256) != 0) {
            c4092p2 = c23897a2.infoCallout;
        }
        if ((i14 & 512) != 0) {
            z4 = c23897a2.isExpanded;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            i13 = c23897a2.maxVisibleButtons;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c11980a = c23897a2.selectedAppointment;
        }
        int i15 = i13;
        C11980a c11980a2 = c11980a;
        C4092p2 c4092p3 = c4092p2;
        boolean z13 = z4;
        String str7 = str5;
        String str8 = str6;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        List list2 = list;
        return c23897a2.m70183a(str, str2, str3, str4, enumC16313m1, list2, str7, str8, c4092p3, z13, i15, c11980a2);
    }

    /* JADX INFO: renamed from: a */
    public final C23897a2 m70183a(String siteCode, String titleDisplay, String subtitleDisplay, String distanceDisplay, EnumC16313m0 distanceIcon, List<C23910e> appointmentButtons, String collapsedTextDisplay, String expandedTextDisplay, C4092p2 infoCallout, boolean isExpanded, int maxVisibleButtons, C11980a selectedAppointment) {
        AbstractC22676k.m65750j(siteCode, "siteCode");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(distanceDisplay, "distanceDisplay");
        AbstractC22676k.m65750j(distanceIcon, "distanceIcon");
        AbstractC22676k.m65750j(appointmentButtons, "appointmentButtons");
        AbstractC22676k.m65750j(collapsedTextDisplay, "collapsedTextDisplay");
        AbstractC22676k.m65750j(expandedTextDisplay, "expandedTextDisplay");
        return new C23897a2(siteCode, titleDisplay, subtitleDisplay, distanceDisplay, distanceIcon, appointmentButtons, collapsedTextDisplay, expandedTextDisplay, infoCallout, isExpanded, maxVisibleButtons, selectedAppointment);
    }

    /* JADX INFO: renamed from: c */
    public final List<C23910e> m70184c() {
        return this.appointmentButtons;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCollapsedTextDisplay() {
        return this.collapsedTextDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23897a2)) {
            return false;
        }
        C23897a2 c23897a2 = (C23897a2) other;
        return AbstractC22676k.m65745e(this.siteCode, c23897a2.siteCode) && AbstractC22676k.m65745e(this.titleDisplay, c23897a2.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, c23897a2.subtitleDisplay) && AbstractC22676k.m65745e(this.distanceDisplay, c23897a2.distanceDisplay) && this.distanceIcon == c23897a2.distanceIcon && AbstractC22676k.m65745e(this.appointmentButtons, c23897a2.appointmentButtons) && AbstractC22676k.m65745e(this.collapsedTextDisplay, c23897a2.collapsedTextDisplay) && AbstractC22676k.m65745e(this.expandedTextDisplay, c23897a2.expandedTextDisplay) && AbstractC22676k.m65745e(this.infoCallout, c23897a2.infoCallout) && this.isExpanded == c23897a2.isExpanded && this.maxVisibleButtons == c23897a2.maxVisibleButtons && AbstractC22676k.m65745e(this.selectedAppointment, c23897a2.selectedAppointment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDistanceDisplay() {
        return this.distanceDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getDistanceIcon() {
        return this.distanceIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getExpandedTextDisplay() {
        return this.expandedTextDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC17176i.m48500b(this.distanceIcon, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.siteCode.hashCode() * 31, 31, this.titleDisplay), 31, this.subtitleDisplay), 31, this.distanceDisplay), 31), 31, this.appointmentButtons), 31, this.collapsedTextDisplay), 31, this.expandedTextDisplay);
        C4092p2 c4092p2 = this.infoCallout;
        int iM30448b = AbstractC11266d.m30448b(this.maxVisibleButtons, AbstractC2875y.m8289b((iM30450d + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31, 31, this.isExpanded), 31);
        C11980a c11980a = this.selectedAppointment;
        return iM30448b + (c11980a != null ? c11980a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C4092p2 getInfoCallout() {
        return this.infoCallout;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxVisibleButtons() {
        return this.maxVisibleButtons;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C11980a getSelectedAppointment() {
        return this.selectedAppointment;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSiteCode() {
        return this.siteCode;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.siteCode;
        String str2 = this.titleDisplay;
        String str3 = this.subtitleDisplay;
        String str4 = this.distanceDisplay;
        EnumC16313m0 enumC16313m0 = this.distanceIcon;
        List<C23910e> list = this.appointmentButtons;
        String str5 = this.collapsedTextDisplay;
        String str6 = this.expandedTextDisplay;
        C4092p2 c4092p2 = this.infoCallout;
        boolean z4 = this.isExpanded;
        int i13 = this.maxVisibleButtons;
        C11980a c11980a = this.selectedAppointment;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SchedulingTileViewState(siteCode=", str, ", titleDisplay=", str2, ", subtitleDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", distanceDisplay=", str4, ", distanceIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", appointmentButtons=");
        sbM32001t.append(list);
        sbM32001t.append(", collapsedTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", expandedTextDisplay=", str6, ", infoCallout=");
        sbM32001t.append(c4092p2);
        sbM32001t.append(", isExpanded=");
        sbM32001t.append(z4);
        sbM32001t.append(", maxVisibleButtons=");
        sbM32001t.append(i13);
        sbM32001t.append(", selectedAppointment=");
        sbM32001t.append(c11980a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C23897a2(String str, String str2, String str3, String str4, EnumC16313m0 enumC16313m0, List list, String str5, String str6, C4092p2 c4092p2, boolean z4, int i13, C11980a c11980a, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, enumC16313m0, list, str5, str6, c4092p2, (i14 & 512) != 0 ? false : z4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 6 : i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c11980a);
    }
}
