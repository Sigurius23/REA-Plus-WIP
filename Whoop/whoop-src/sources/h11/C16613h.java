package h11;

import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: h11.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJª\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b<\u0010.R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b9\u0010?\u001a\u0004\b=\u0010@R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b*\u0010D\u001a\u0004\bA\u0010ER\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u0010,\u001a\u0004\bF\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b+\u0010\u001e¨\u0006G"}, m65681d2 = {"Lh11/h;", "Lm91/u;", "Lh11/a;", "dateDisplay", "multiDayCycleDateDisplay", "", "isSelected", "Lh11/g;", "style", "", HttpHeaders.DATE, "", "cycleId", "Lgz0/m0;", "icon", "showDot", "showDashBorder", "Ly81/e;", "dotColorOverride", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "isClickable", "contentDescription", "<init>", "(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;)V", "a", "(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;)Lh11/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lh11/a;", "g", "()Lh11/a;", "b", "l", "c", "Z", "q", "()Z", "d", "Lh11/g;", "o", "()Lh11/g;", "e", "Ljava/lang/String;", "f", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lgz0/m0;", "j", "()Lgz0/m0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "n", "i", "m", "Ly81/e;", "()Ly81/e;", "k", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "p", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16613h implements InterfaceC25312u {

    /* JADX INFO: renamed from: o */
    public static final int f63914o = GenericInteraction.$stable | C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16606a dateDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16606a multiDayCycleDateDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16612g style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Long cycleId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showDot;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean showDashBorder;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC39332e dotColorOverride;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final GenericInteraction interaction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean isClickable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String contentDescription;

    public C16613h(C16606a dateDisplay, C16606a c16606a, boolean z4, EnumC16612g style, String date, Long l7, EnumC16313m0 enumC16313m0, boolean z13, boolean z14, InterfaceC39332e interfaceC39332e, C9598e c9598e, GenericInteraction genericInteraction, boolean z15, String str) {
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(date, "date");
        this.dateDisplay = dateDisplay;
        this.multiDayCycleDateDisplay = c16606a;
        this.isSelected = z4;
        this.style = style;
        this.date = date;
        this.cycleId = l7;
        this.icon = enumC16313m0;
        this.showDot = z13;
        this.showDashBorder = z14;
        this.dotColorOverride = interfaceC39332e;
        this.destination = c9598e;
        this.interaction = genericInteraction;
        this.isClickable = z15;
        this.contentDescription = str;
    }

    /* JADX INFO: renamed from: a */
    public final C16613h m47163a(C16606a dateDisplay, C16606a multiDayCycleDateDisplay, boolean isSelected, EnumC16612g style, String date, Long cycleId, EnumC16313m0 icon, boolean showDot, boolean showDashBorder, InterfaceC39332e dotColorOverride, C9598e destination, GenericInteraction interaction, boolean isClickable, String contentDescription) {
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(date, "date");
        return new C16613h(dateDisplay, multiDayCycleDateDisplay, isSelected, style, date, cycleId, icon, showDot, showDashBorder, dotColorOverride, destination, interaction, isClickable, contentDescription);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getCycleId() {
        return this.cycleId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16613h)) {
            return false;
        }
        C16613h c16613h = (C16613h) other;
        return AbstractC22676k.m65745e(this.dateDisplay, c16613h.dateDisplay) && AbstractC22676k.m65745e(this.multiDayCycleDateDisplay, c16613h.multiDayCycleDateDisplay) && this.isSelected == c16613h.isSelected && this.style == c16613h.style && AbstractC22676k.m65745e(this.date, c16613h.date) && AbstractC22676k.m65745e(this.cycleId, c16613h.cycleId) && this.icon == c16613h.icon && this.showDot == c16613h.showDot && this.showDashBorder == c16613h.showDashBorder && AbstractC22676k.m65745e(this.dotColorOverride, c16613h.dotColorOverride) && AbstractC22676k.m65745e(this.destination, c16613h.destination) && AbstractC22676k.m65745e(this.interaction, c16613h.interaction) && this.isClickable == c16613h.isClickable && AbstractC22676k.m65745e(this.contentDescription, c16613h.contentDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C16606a getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public int hashCode() {
        int iHashCode = this.dateDisplay.hashCode() * 31;
        C16606a c16606a = this.multiDayCycleDateDisplay;
        int iM30450d = AbstractC11266d.m30450d((this.style.hashCode() + AbstractC2875y.m8289b((iHashCode + (c16606a == null ? 0 : c16606a.hashCode())) * 31, 31, this.isSelected)) * 31, 31, this.date);
        Long l7 = this.cycleId;
        int iHashCode2 = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31, this.showDot), 31, this.showDashBorder);
        InterfaceC39332e interfaceC39332e = this.dotColorOverride;
        int iHashCode3 = (iM8289b + (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31, 31, this.isClickable);
        String str = this.contentDescription;
        return iM8289b2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC39332e getDotColorOverride() {
        return this.dotColorOverride;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C16606a getMultiDayCycleDateDisplay() {
        return this.multiDayCycleDateDisplay;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowDashBorder() {
        return this.showDashBorder;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getShowDot() {
        return this.showDot;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final EnumC16612g getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsClickable() {
        return this.isClickable;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        C16606a c16606a = this.dateDisplay;
        C16606a c16606a2 = this.multiDayCycleDateDisplay;
        boolean z4 = this.isSelected;
        EnumC16612g enumC16612g = this.style;
        String str = this.date;
        Long l7 = this.cycleId;
        EnumC16313m0 enumC16313m0 = this.icon;
        boolean z13 = this.showDot;
        boolean z14 = this.showDashBorder;
        InterfaceC39332e interfaceC39332e = this.dotColorOverride;
        C9598e c9598e = this.destination;
        GenericInteraction genericInteraction = this.interaction;
        boolean z15 = this.isClickable;
        String str2 = this.contentDescription;
        StringBuilder sb4 = new StringBuilder("DatePillViewState(dateDisplay=");
        sb4.append(c16606a);
        sb4.append(", multiDayCycleDateDisplay=");
        sb4.append(c16606a2);
        sb4.append(", isSelected=");
        sb4.append(z4);
        sb4.append(", style=");
        sb4.append(enumC16612g);
        sb4.append(", date=");
        sb4.append(str);
        sb4.append(", cycleId=");
        sb4.append(l7);
        sb4.append(", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", showDot=");
        sb4.append(z13);
        sb4.append(", showDashBorder=");
        sb4.append(z14);
        sb4.append(", dotColorOverride=");
        sb4.append(interfaceC39332e);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", isClickable=");
        return AbstractC21702c.m61139j(sb4, z15, ", contentDescription=", str2, ")");
    }

    public /* synthetic */ C16613h(C16606a c16606a, C16606a c16606a2, boolean z4, EnumC16612g enumC16612g, String str, Long l7, EnumC16313m0 enumC16313m0, boolean z13, boolean z14, InterfaceC39332e interfaceC39332e, C9598e c9598e, GenericInteraction genericInteraction, boolean z15, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16606a, (i13 & 2) != 0 ? null : c16606a2, (i13 & 4) != 0 ? false : z4, enumC16612g, str, (i13 & 32) != 0 ? null : l7, (i13 & 64) != 0 ? null : enumC16313m0, (i13 & 128) != 0 ? true : z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? null : interfaceC39332e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : genericInteraction, (i13 & 4096) != 0 ? true : z15, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str2);
    }
}
