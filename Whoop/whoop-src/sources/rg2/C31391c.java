package rg2;

import gi1.InterfaceC15891a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import sg2.C32457h;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: rg2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b.\u00103R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b\u001f\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b4\u0010\u0017¨\u0006:"}, m65681d2 = {"Lrg2/c;", "Lm91/u;", "", "isLoading", "Lrg2/p;", "heartRateState", "Lrg2/n;", "backgroundState", "Lrg2/m;", "activitySelectionState", "Lrg2/o;", "gpsToggleState", "Lgi1/a;", "gpsPermissionEffect", "showGpsLocationPermissionPrompt", "committedIsGpsTrackingEnabled", "Lsg2/h;", "activitySummaryState", "", "resolvedDefaultInternalName", "<init>", "(ZLrg2/p;Lrg2/n;Lrg2/m;Lrg2/o;Lgi1/a;ZZLsg2/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "i", "()Z", "b", "Lrg2/p;", "f", "()Lrg2/p;", "c", "Lrg2/n;", "()Lrg2/n;", "d", "Lrg2/m;", "getActivitySelectionState", "()Lrg2/m;", "e", "Lrg2/o;", "getGpsToggleState", "()Lrg2/o;", "Lgi1/a;", "()Lgi1/a;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lsg2/h;", "()Lsg2/h;", "j", "Ljava/lang/String;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31391c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC31404p heartRateState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC31402n backgroundState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31401m activitySelectionState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C31403o gpsToggleState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC15891a gpsPermissionEffect;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showGpsLocationPermissionPrompt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean committedIsGpsTrackingEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C32457h activitySummaryState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String resolvedDefaultInternalName;

    public C31391c(boolean z4, AbstractC31404p heartRateState, AbstractC31402n backgroundState, C31401m activitySelectionState, C31403o c31403o, InterfaceC15891a interfaceC15891a, boolean z13, boolean z14, C32457h activitySummaryState, String str) {
        AbstractC22676k.m65750j(heartRateState, "heartRateState");
        AbstractC22676k.m65750j(backgroundState, "backgroundState");
        AbstractC22676k.m65750j(activitySelectionState, "activitySelectionState");
        AbstractC22676k.m65750j(activitySummaryState, "activitySummaryState");
        this.isLoading = z4;
        this.heartRateState = heartRateState;
        this.backgroundState = backgroundState;
        this.activitySelectionState = activitySelectionState;
        this.gpsToggleState = c31403o;
        this.gpsPermissionEffect = interfaceC15891a;
        this.showGpsLocationPermissionPrompt = z13;
        this.committedIsGpsTrackingEnabled = z14;
        this.activitySummaryState = activitySummaryState;
        this.resolvedDefaultInternalName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C32457h getActivitySummaryState() {
        return this.activitySummaryState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC31402n getBackgroundState() {
        return this.backgroundState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCommittedIsGpsTrackingEnabled() {
        return this.committedIsGpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC15891a getGpsPermissionEffect() {
        return this.gpsPermissionEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31391c)) {
            return false;
        }
        C31391c c31391c = (C31391c) other;
        return this.isLoading == c31391c.isLoading && AbstractC22676k.m65745e(this.heartRateState, c31391c.heartRateState) && AbstractC22676k.m65745e(this.backgroundState, c31391c.backgroundState) && AbstractC22676k.m65745e(this.activitySelectionState, c31391c.activitySelectionState) && AbstractC22676k.m65745e(this.gpsToggleState, c31391c.gpsToggleState) && AbstractC22676k.m65745e(this.gpsPermissionEffect, c31391c.gpsPermissionEffect) && this.showGpsLocationPermissionPrompt == c31391c.showGpsLocationPermissionPrompt && this.committedIsGpsTrackingEnabled == c31391c.committedIsGpsTrackingEnabled && AbstractC22676k.m65745e(this.activitySummaryState, c31391c.activitySummaryState) && AbstractC22676k.m65745e(this.resolvedDefaultInternalName, c31391c.resolvedDefaultInternalName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC31404p getHeartRateState() {
        return this.heartRateState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getResolvedDefaultInternalName() {
        return this.resolvedDefaultInternalName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowGpsLocationPermissionPrompt() {
        return this.showGpsLocationPermissionPrompt;
    }

    public int hashCode() {
        int iHashCode = (this.activitySelectionState.hashCode() + ((this.backgroundState.hashCode() + ((this.heartRateState.hashCode() + (Boolean.hashCode(this.isLoading) * 31)) * 31)) * 31)) * 31;
        C31403o c31403o = this.gpsToggleState;
        int iHashCode2 = (iHashCode + (c31403o == null ? 0 : c31403o.hashCode())) * 31;
        InterfaceC15891a interfaceC15891a = this.gpsPermissionEffect;
        int iHashCode3 = (this.activitySummaryState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC15891a == null ? 0 : interfaceC15891a.hashCode())) * 31, 31, this.showGpsLocationPermissionPrompt), 31, this.committedIsGpsTrackingEnabled)) * 31;
        String str = this.resolvedDefaultInternalName;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        boolean z4 = this.isLoading;
        AbstractC31404p abstractC31404p = this.heartRateState;
        AbstractC31402n abstractC31402n = this.backgroundState;
        C31401m c31401m = this.activitySelectionState;
        C31403o c31403o = this.gpsToggleState;
        InterfaceC15891a interfaceC15891a = this.gpsPermissionEffect;
        boolean z13 = this.showGpsLocationPermissionPrompt;
        boolean z14 = this.committedIsGpsTrackingEnabled;
        C32457h c32457h = this.activitySummaryState;
        String str = this.resolvedDefaultInternalName;
        StringBuilder sb4 = new StringBuilder("PreSessionMiniArchViewState(isLoading=");
        sb4.append(z4);
        sb4.append(", heartRateState=");
        sb4.append(abstractC31404p);
        sb4.append(", backgroundState=");
        sb4.append(abstractC31402n);
        sb4.append(", activitySelectionState=");
        sb4.append(c31401m);
        sb4.append(", gpsToggleState=");
        sb4.append(c31403o);
        sb4.append(", gpsPermissionEffect=");
        sb4.append(interfaceC15891a);
        sb4.append(", showGpsLocationPermissionPrompt=");
        AbstractC38963t7.m124392v(sb4, z13, ", committedIsGpsTrackingEnabled=", z14, ", activitySummaryState=");
        sb4.append(c32457h);
        sb4.append(", resolvedDefaultInternalName=");
        sb4.append(str);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C31391c(boolean z4, AbstractC31404p abstractC31404p, AbstractC31402n abstractC31402n, C31401m c31401m, C31403o c31403o, InterfaceC15891a interfaceC15891a, boolean z13, boolean z14, C32457h c32457h, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = 3;
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? new AbstractC31404p.c(null, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0) : abstractC31404p, (i13 & 4) != 0 ? AbstractC31402n.a.f129244a : abstractC31402n, (i13 & 8) != 0 ? new C31401m(0 == true ? 1 : 0, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0) : c31401m, (i13 & 16) != 0 ? null : c31403o, (i13 & 32) != 0 ? null : interfaceC15891a, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? false : z14, (i13 & 256) != 0 ? new C32457h("", false, false, new C31395g(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0)) : c32457h, (i13 & 512) != 0 ? null : str);
    }
}
