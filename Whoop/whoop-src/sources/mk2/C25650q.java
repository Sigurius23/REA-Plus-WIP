package mk2;

import com.whoop.domain.model.UnitSystem;
import com.whoop.navigation.C9598e;
import com.whoop.trackactivity.domain.models.SessionTargets;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mk2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0090\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b-\u00102R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b3\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b8\u0010=R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, m65681d2 = {"Lmk2/q;", "", "", "selectedActivityInternalName", "activityDisplayName", "Lmk2/j;", "contentType", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "restoreSessionDestination", "Lmk2/o;", "currentDialogType", "isDiscarding", "pendingExitEvent", "Lmk2/l;", "trackSessionState", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "targets", "Lmk2/v;", "selectedTab", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lmk2/j;ZLcom/whoop/navigation/e;Lmk2/o;ZLcom/whoop/navigation/e;Lmk2/l;Lcom/whoop/trackactivity/domain/models/SessionTargets;Lmk2/v;Lcom/whoop/domain/model/UnitSystem;)Lmk2/q;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "i", "b", "c", "Lmk2/j;", "d", "()Lmk2/j;", "Z", "f", "()Z", "e", "Lcom/whoop/navigation/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/navigation/e;", "Lmk2/o;", "()Lmk2/o;", "g", "n", "Lmk2/l;", "l", "()Lmk2/l;", "j", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "k", "()Lcom/whoop/trackactivity/domain/models/SessionTargets;", "Lmk2/v;", "()Lmk2/v;", "Lcom/whoop/domain/model/UnitSystem;", "m", "()Lcom/whoop/domain/model/UnitSystem;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25650q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectedActivityInternalName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String activityDisplayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC25643j contentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean gpsTrackingEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e restoreSessionDestination;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC25648o currentDialogType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isDiscarding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e pendingExitEvent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C25645l trackSessionState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final SessionTargets targets;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final EnumC25655v selectedTab;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final UnitSystem unitSystem;

    public C25650q(String selectedActivityInternalName, String activityDisplayName, EnumC25643j contentType, boolean z4, C9598e c9598e, InterfaceC25648o interfaceC25648o, boolean z13, C9598e c9598e2, C25645l c25645l, SessionTargets targets, EnumC25655v selectedTab, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        AbstractC22676k.m65750j(activityDisplayName, "activityDisplayName");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(targets, "targets");
        AbstractC22676k.m65750j(selectedTab, "selectedTab");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        this.selectedActivityInternalName = selectedActivityInternalName;
        this.activityDisplayName = activityDisplayName;
        this.contentType = contentType;
        this.gpsTrackingEnabled = z4;
        this.restoreSessionDestination = c9598e;
        this.currentDialogType = interfaceC25648o;
        this.isDiscarding = z13;
        this.pendingExitEvent = c9598e2;
        this.trackSessionState = c25645l;
        this.targets = targets;
        this.selectedTab = selectedTab;
        this.unitSystem = unitSystem;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C25650q m75484b(C25650q c25650q, String str, String str2, EnumC25643j enumC25643j, boolean z4, C9598e c9598e, InterfaceC25648o interfaceC25648o, boolean z13, C9598e c9598e2, C25645l c25645l, SessionTargets sessionTargets, EnumC25655v enumC25655v, UnitSystem unitSystem, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c25650q.selectedActivityInternalName;
        }
        if ((i13 & 2) != 0) {
            str2 = c25650q.activityDisplayName;
        }
        if ((i13 & 4) != 0) {
            enumC25643j = c25650q.contentType;
        }
        if ((i13 & 8) != 0) {
            z4 = c25650q.gpsTrackingEnabled;
        }
        if ((i13 & 16) != 0) {
            c9598e = c25650q.restoreSessionDestination;
        }
        if ((i13 & 32) != 0) {
            interfaceC25648o = c25650q.currentDialogType;
        }
        if ((i13 & 64) != 0) {
            z13 = c25650q.isDiscarding;
        }
        if ((i13 & 128) != 0) {
            c9598e2 = c25650q.pendingExitEvent;
        }
        if ((i13 & 256) != 0) {
            c25645l = c25650q.trackSessionState;
        }
        if ((i13 & 512) != 0) {
            sessionTargets = c25650q.targets;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            enumC25655v = c25650q.selectedTab;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            unitSystem = c25650q.unitSystem;
        }
        EnumC25655v enumC25655v2 = enumC25655v;
        UnitSystem unitSystem2 = unitSystem;
        C25645l c25645l2 = c25645l;
        SessionTargets sessionTargets2 = sessionTargets;
        boolean z14 = z13;
        C9598e c9598e3 = c9598e2;
        C9598e c9598e4 = c9598e;
        InterfaceC25648o interfaceC25648o2 = interfaceC25648o;
        return c25650q.m75485a(str, str2, enumC25643j, z4, c9598e4, interfaceC25648o2, z14, c9598e3, c25645l2, sessionTargets2, enumC25655v2, unitSystem2);
    }

    /* JADX INFO: renamed from: a */
    public final C25650q m75485a(String selectedActivityInternalName, String activityDisplayName, EnumC25643j contentType, boolean gpsTrackingEnabled, C9598e restoreSessionDestination, InterfaceC25648o currentDialogType, boolean isDiscarding, C9598e pendingExitEvent, C25645l trackSessionState, SessionTargets targets, EnumC25655v selectedTab, UnitSystem unitSystem) {
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        AbstractC22676k.m65750j(activityDisplayName, "activityDisplayName");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(targets, "targets");
        AbstractC22676k.m65750j(selectedTab, "selectedTab");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new C25650q(selectedActivityInternalName, activityDisplayName, contentType, gpsTrackingEnabled, restoreSessionDestination, currentDialogType, isDiscarding, pendingExitEvent, trackSessionState, targets, selectedTab, unitSystem);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getActivityDisplayName() {
        return this.activityDisplayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC25643j getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25648o getCurrentDialogType() {
        return this.currentDialogType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25650q)) {
            return false;
        }
        C25650q c25650q = (C25650q) other;
        return AbstractC22676k.m65745e(this.selectedActivityInternalName, c25650q.selectedActivityInternalName) && AbstractC22676k.m65745e(this.activityDisplayName, c25650q.activityDisplayName) && this.contentType == c25650q.contentType && this.gpsTrackingEnabled == c25650q.gpsTrackingEnabled && AbstractC22676k.m65745e(this.restoreSessionDestination, c25650q.restoreSessionDestination) && AbstractC22676k.m65745e(this.currentDialogType, c25650q.currentDialogType) && this.isDiscarding == c25650q.isDiscarding && AbstractC22676k.m65745e(this.pendingExitEvent, c25650q.pendingExitEvent) && AbstractC22676k.m65745e(this.trackSessionState, c25650q.trackSessionState) && AbstractC22676k.m65745e(this.targets, c25650q.targets) && this.selectedTab == c25650q.selectedTab && this.unitSystem == c25650q.unitSystem;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9598e getPendingExitEvent() {
        return this.pendingExitEvent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9598e getRestoreSessionDestination() {
        return this.restoreSessionDestination;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.contentType.hashCode() + AbstractC11266d.m30450d(this.selectedActivityInternalName.hashCode() * 31, 31, this.activityDisplayName)) * 31, 31, this.gpsTrackingEnabled);
        C9598e c9598e = this.restoreSessionDestination;
        int iHashCode = (iM8289b + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        InterfaceC25648o interfaceC25648o = this.currentDialogType;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode + (interfaceC25648o == null ? 0 : interfaceC25648o.hashCode())) * 31, 31, this.isDiscarding);
        C9598e c9598e2 = this.pendingExitEvent;
        int iHashCode2 = (iM8289b2 + (c9598e2 == null ? 0 : c9598e2.hashCode())) * 31;
        C25645l c25645l = this.trackSessionState;
        return this.unitSystem.hashCode() + ((this.selectedTab.hashCode() + ((this.targets.hashCode() + ((iHashCode2 + (c25645l != null ? c25645l.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC25655v getSelectedTab() {
        return this.selectedTab;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final SessionTargets getTargets() {
        return this.targets;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C25645l getTrackSessionState() {
        return this.trackSessionState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsDiscarding() {
        return this.isDiscarding;
    }

    public String toString() {
        String str = this.selectedActivityInternalName;
        String str2 = this.activityDisplayName;
        EnumC25643j enumC25643j = this.contentType;
        boolean z4 = this.gpsTrackingEnabled;
        C9598e c9598e = this.restoreSessionDestination;
        InterfaceC25648o interfaceC25648o = this.currentDialogType;
        boolean z13 = this.isDiscarding;
        C9598e c9598e2 = this.pendingExitEvent;
        C25645l c25645l = this.trackSessionState;
        SessionTargets sessionTargets = this.targets;
        EnumC25655v enumC25655v = this.selectedTab;
        UnitSystem unitSystem = this.unitSystem;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackSessionMiniArchDomainState(selectedActivityInternalName=", str, ", activityDisplayName=", str2, ", contentType=");
        sbM32001t.append(enumC25643j);
        sbM32001t.append(", gpsTrackingEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", restoreSessionDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", currentDialogType=");
        sbM32001t.append(interfaceC25648o);
        sbM32001t.append(", isDiscarding=");
        sbM32001t.append(z13);
        sbM32001t.append(", pendingExitEvent=");
        sbM32001t.append(c9598e2);
        sbM32001t.append(", trackSessionState=");
        sbM32001t.append(c25645l);
        sbM32001t.append(", targets=");
        sbM32001t.append(sessionTargets);
        sbM32001t.append(", selectedTab=");
        sbM32001t.append(enumC25655v);
        sbM32001t.append(", unitSystem=");
        sbM32001t.append(unitSystem);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C25650q(String str, String str2, EnumC25643j enumC25643j, boolean z4, C9598e c9598e, InterfaceC25648o interfaceC25648o, boolean z13, C9598e c9598e2, C25645l c25645l, SessionTargets sessionTargets, EnumC25655v enumC25655v, UnitSystem unitSystem, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) == 0 ? str2 : "", (i13 & 4) != 0 ? EnumC25643j.WORKOUT : enumC25643j, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : c9598e, (i13 & 32) != 0 ? null : interfaceC25648o, (i13 & 64) == 0 ? z13 : false, (i13 & 128) != 0 ? null : c9598e2, (i13 & 256) == 0 ? c25645l : null, (i13 & 512) != 0 ? new SessionTargets(null, null, null, null, 15, null) : sessionTargets, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC25655v.HEART_RATE : enumC25655v, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? UnitSystem.IMPERIAL : unitSystem);
    }
}
