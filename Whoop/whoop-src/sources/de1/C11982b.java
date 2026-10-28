package de1;

import c41.C4103r;
import com.mapbox.common.HttpHeaders;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: de1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u009e\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b/\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b5\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b9\u00108¨\u0006:"}, m65681d2 = {"Lde1/b;", "", "Lde1/d;", "screenState", "", "Lc41/r;", "activities", "Lm91/u;", "footerState", "gpsInfoCalloutState", "maxDurationInfoCalloutState", "maxSelectionInfoCalloutState", "", "selectedActivityV2Ids", "", "maxActivitiesInSelection", "", "maxDurationHours", HttpHeaders.DATE, "", "shouldDismiss", "showDeleteConfirmation", "<init>", "(Lde1/d;Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Ljava/util/List;IJLjava/lang/String;ZZ)V", "a", "(Lde1/d;Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Ljava/util/List;IJLjava/lang/String;ZZ)Lde1/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lde1/d;", "j", "()Lde1/d;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lm91/u;", "d", "()Lm91/u;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "i", "g", "k", "I", "J", "()J", "Ljava/lang/String;", "getDate", "Z", "l", "()Z", "m", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11982b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11984d screenState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C4103r> activities;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC25312u footerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u gpsInfoCalloutState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u maxDurationInfoCalloutState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25312u maxSelectionInfoCalloutState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<String> selectedActivityV2Ids;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int maxActivitiesInSelection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long maxDurationHours;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String date;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean shouldDismiss;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean showDeleteConfirmation;

    public C11982b(InterfaceC11984d screenState, List<C4103r> activities, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, InterfaceC25312u interfaceC25312u4, List<String> selectedActivityV2Ids, int i13, long j7, String str, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(activities, "activities");
        AbstractC22676k.m65750j(selectedActivityV2Ids, "selectedActivityV2Ids");
        this.screenState = screenState;
        this.activities = activities;
        this.footerState = interfaceC25312u;
        this.gpsInfoCalloutState = interfaceC25312u2;
        this.maxDurationInfoCalloutState = interfaceC25312u3;
        this.maxSelectionInfoCalloutState = interfaceC25312u4;
        this.selectedActivityV2Ids = selectedActivityV2Ids;
        this.maxActivitiesInSelection = i13;
        this.maxDurationHours = j7;
        this.date = str;
        this.shouldDismiss = z4;
        this.showDeleteConfirmation = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11982b m32981b(C11982b c11982b, InterfaceC11984d interfaceC11984d, List list, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, InterfaceC25312u interfaceC25312u4, List list2, int i13, long j7, String str, boolean z4, boolean z13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            interfaceC11984d = c11982b.screenState;
        }
        return c11982b.m32982a(interfaceC11984d, (i14 & 2) != 0 ? c11982b.activities : list, (i14 & 4) != 0 ? c11982b.footerState : interfaceC25312u, (i14 & 8) != 0 ? c11982b.gpsInfoCalloutState : interfaceC25312u2, (i14 & 16) != 0 ? c11982b.maxDurationInfoCalloutState : interfaceC25312u3, (i14 & 32) != 0 ? c11982b.maxSelectionInfoCalloutState : interfaceC25312u4, (i14 & 64) != 0 ? c11982b.selectedActivityV2Ids : list2, (i14 & 128) != 0 ? c11982b.maxActivitiesInSelection : i13, (i14 & 256) != 0 ? c11982b.maxDurationHours : j7, (i14 & 512) != 0 ? c11982b.date : str, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c11982b.shouldDismiss : z4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c11982b.showDeleteConfirmation : z13);
    }

    /* JADX INFO: renamed from: a */
    public final C11982b m32982a(InterfaceC11984d screenState, List<C4103r> activities, InterfaceC25312u footerState, InterfaceC25312u gpsInfoCalloutState, InterfaceC25312u maxDurationInfoCalloutState, InterfaceC25312u maxSelectionInfoCalloutState, List<String> selectedActivityV2Ids, int maxActivitiesInSelection, long maxDurationHours, String date, boolean shouldDismiss, boolean showDeleteConfirmation) {
        AbstractC22676k.m65750j(screenState, "screenState");
        AbstractC22676k.m65750j(activities, "activities");
        AbstractC22676k.m65750j(selectedActivityV2Ids, "selectedActivityV2Ids");
        return new C11982b(screenState, activities, footerState, gpsInfoCalloutState, maxDurationInfoCalloutState, maxSelectionInfoCalloutState, selectedActivityV2Ids, maxActivitiesInSelection, maxDurationHours, date, shouldDismiss, showDeleteConfirmation);
    }

    /* JADX INFO: renamed from: c */
    public final List<C4103r> m32983c() {
        return this.activities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getFooterState() {
        return this.footerState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getGpsInfoCalloutState() {
        return this.gpsInfoCalloutState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11982b)) {
            return false;
        }
        C11982b c11982b = (C11982b) other;
        return AbstractC22676k.m65745e(this.screenState, c11982b.screenState) && AbstractC22676k.m65745e(this.activities, c11982b.activities) && AbstractC22676k.m65745e(this.footerState, c11982b.footerState) && AbstractC22676k.m65745e(this.gpsInfoCalloutState, c11982b.gpsInfoCalloutState) && AbstractC22676k.m65745e(this.maxDurationInfoCalloutState, c11982b.maxDurationInfoCalloutState) && AbstractC22676k.m65745e(this.maxSelectionInfoCalloutState, c11982b.maxSelectionInfoCalloutState) && AbstractC22676k.m65745e(this.selectedActivityV2Ids, c11982b.selectedActivityV2Ids) && this.maxActivitiesInSelection == c11982b.maxActivitiesInSelection && this.maxDurationHours == c11982b.maxDurationHours && AbstractC22676k.m65745e(this.date, c11982b.date) && this.shouldDismiss == c11982b.shouldDismiss && this.showDeleteConfirmation == c11982b.showDeleteConfirmation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxActivitiesInSelection() {
        return this.maxActivitiesInSelection;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getMaxDurationHours() {
        return this.maxDurationHours;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC25312u getMaxDurationInfoCalloutState() {
        return this.maxDurationInfoCalloutState;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.screenState.hashCode() * 31, 31, this.activities);
        InterfaceC25312u interfaceC25312u = this.footerState;
        int iHashCode = (iM31983b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.gpsInfoCalloutState;
        int iHashCode2 = (iHashCode + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u3 = this.maxDurationInfoCalloutState;
        int iHashCode3 = (iHashCode2 + (interfaceC25312u3 == null ? 0 : interfaceC25312u3.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u4 = this.maxSelectionInfoCalloutState;
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.maxActivitiesInSelection, AbstractC11895b.m31983b((iHashCode3 + (interfaceC25312u4 == null ? 0 : interfaceC25312u4.hashCode())) * 31, 31, this.selectedActivityV2Ids), 31), this.maxDurationHours, 31);
        String str = this.date;
        return Boolean.hashCode(this.showDeleteConfirmation) + AbstractC2875y.m8289b((iM30451e + (str != null ? str.hashCode() : 0)) * 31, 31, this.shouldDismiss);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC25312u getMaxSelectionInfoCalloutState() {
        return this.maxSelectionInfoCalloutState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC11984d getScreenState() {
        return this.screenState;
    }

    /* JADX INFO: renamed from: k */
    public final List<String> m32991k() {
        return this.selectedActivityV2Ids;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShouldDismiss() {
        return this.shouldDismiss;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowDeleteConfirmation() {
        return this.showDeleteConfirmation;
    }

    public String toString() {
        return "EditActivitiesDrawerDomainState(screenState=" + this.screenState + ", activities=" + this.activities + ", footerState=" + this.footerState + ", gpsInfoCalloutState=" + this.gpsInfoCalloutState + ", maxDurationInfoCalloutState=" + this.maxDurationInfoCalloutState + ", maxSelectionInfoCalloutState=" + this.maxSelectionInfoCalloutState + ", selectedActivityV2Ids=" + this.selectedActivityV2Ids + ", maxActivitiesInSelection=" + this.maxActivitiesInSelection + ", maxDurationHours=" + this.maxDurationHours + ", date=" + this.date + ", shouldDismiss=" + this.shouldDismiss + ", showDeleteConfirmation=" + this.showDeleteConfirmation + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11982b(InterfaceC11984d interfaceC11984d, List list, InterfaceC25312u interfaceC25312u, InterfaceC25312u interfaceC25312u2, InterfaceC25312u interfaceC25312u3, InterfaceC25312u interfaceC25312u4, List list2, int i13, long j7, String str, boolean z4, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC11984d = (i14 & 1) != 0 ? InterfaceC11984d.f.f39426a : interfaceC11984d;
        int i15 = i14 & 2;
        List list3 = C25271y.f99162w;
        this(interfaceC11984d, i15 != 0 ? list3 : list, (i14 & 4) != 0 ? null : interfaceC25312u, (i14 & 8) != 0 ? null : interfaceC25312u2, (i14 & 16) != 0 ? null : interfaceC25312u3, (i14 & 32) != 0 ? null : interfaceC25312u4, (i14 & 64) == 0 ? list2 : list3, (i14 & 128) != 0 ? 10 : i13, (i14 & 256) != 0 ? 24L : j7, (i14 & 512) == 0 ? str : null, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13);
    }
}
