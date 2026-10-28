package ri1;

import com.whoop.health.domain.models.HealthTabResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sl1.AbstractC32703b;
import y00.AbstractC38963t7;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: ri1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b!\u0010*¨\u0006+"}, m65681d2 = {"Lri1/h;", "", "Lri1/g;", "currentDialogType", "Lcom/whoop/health/domain/models/HealthTabResponse;", "healthTabResponse", "", "manualRefresh", "displayRefreshingSpinner", "Lyg2/d;", "liveHrState", "Lsl1/b;", "connectivityTileState", "<init>", "(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;)V", "a", "(Lri1/g;Lcom/whoop/health/domain/models/HealthTabResponse;ZZLyg2/d;Lsl1/b;)Lri1/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lri1/g;", "d", "()Lri1/g;", "b", "Lcom/whoop/health/domain/models/HealthTabResponse;", "f", "()Lcom/whoop/health/domain/models/HealthTabResponse;", "c", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "e", "Lyg2/d;", "g", "()Lyg2/d;", "Lsl1/b;", "()Lsl1/b;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31459h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31458g currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HealthTabResponse healthTabResponse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC39529d liveHrState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC32703b connectivityTileState;

    public C31459h(InterfaceC31458g interfaceC31458g, HealthTabResponse healthTabResponse, boolean z4, boolean z13, AbstractC39529d liveHrState, AbstractC32703b connectivityTileState) {
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        AbstractC22676k.m65750j(connectivityTileState, "connectivityTileState");
        this.currentDialogType = interfaceC31458g;
        this.healthTabResponse = healthTabResponse;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.liveHrState = liveHrState;
        this.connectivityTileState = connectivityTileState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31459h m96861b(C31459h c31459h, InterfaceC31458g interfaceC31458g, HealthTabResponse healthTabResponse, boolean z4, boolean z13, AbstractC39529d abstractC39529d, AbstractC32703b abstractC32703b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC31458g = c31459h.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            healthTabResponse = c31459h.healthTabResponse;
        }
        if ((i13 & 4) != 0) {
            z4 = c31459h.manualRefresh;
        }
        if ((i13 & 8) != 0) {
            z13 = c31459h.displayRefreshingSpinner;
        }
        if ((i13 & 16) != 0) {
            abstractC39529d = c31459h.liveHrState;
        }
        if ((i13 & 32) != 0) {
            abstractC32703b = c31459h.connectivityTileState;
        }
        AbstractC39529d abstractC39529d2 = abstractC39529d;
        AbstractC32703b abstractC32703b2 = abstractC32703b;
        return c31459h.m96862a(interfaceC31458g, healthTabResponse, z4, z13, abstractC39529d2, abstractC32703b2);
    }

    /* JADX INFO: renamed from: a */
    public final C31459h m96862a(InterfaceC31458g currentDialogType, HealthTabResponse healthTabResponse, boolean manualRefresh, boolean displayRefreshingSpinner, AbstractC39529d liveHrState, AbstractC32703b connectivityTileState) {
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        AbstractC22676k.m65750j(connectivityTileState, "connectivityTileState");
        return new C31459h(currentDialogType, healthTabResponse, manualRefresh, displayRefreshingSpinner, liveHrState, connectivityTileState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC32703b getConnectivityTileState() {
        return this.connectivityTileState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC31458g getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getDisplayRefreshingSpinner() {
        return this.displayRefreshingSpinner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31459h)) {
            return false;
        }
        C31459h c31459h = (C31459h) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c31459h.currentDialogType) && AbstractC22676k.m65745e(this.healthTabResponse, c31459h.healthTabResponse) && this.manualRefresh == c31459h.manualRefresh && this.displayRefreshingSpinner == c31459h.displayRefreshingSpinner && AbstractC22676k.m65745e(this.liveHrState, c31459h.liveHrState) && AbstractC22676k.m65745e(this.connectivityTileState, c31459h.connectivityTileState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final HealthTabResponse getHealthTabResponse() {
        return this.healthTabResponse;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC39529d getLiveHrState() {
        return this.liveHrState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getManualRefresh() {
        return this.manualRefresh;
    }

    public int hashCode() {
        InterfaceC31458g interfaceC31458g = this.currentDialogType;
        int iHashCode = (interfaceC31458g == null ? 0 : interfaceC31458g.hashCode()) * 31;
        HealthTabResponse healthTabResponse = this.healthTabResponse;
        return this.connectivityTileState.hashCode() + ((this.liveHrState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (healthTabResponse != null ? healthTabResponse.hashCode() : 0)) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner)) * 31);
    }

    public String toString() {
        InterfaceC31458g interfaceC31458g = this.currentDialogType;
        HealthTabResponse healthTabResponse = this.healthTabResponse;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        AbstractC39529d abstractC39529d = this.liveHrState;
        AbstractC32703b abstractC32703b = this.connectivityTileState;
        StringBuilder sb4 = new StringBuilder("HealthTabDomainState(currentDialogType=");
        sb4.append(interfaceC31458g);
        sb4.append(", healthTabResponse=");
        sb4.append(healthTabResponse);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", liveHrState=");
        sb4.append(abstractC39529d);
        sb4.append(", connectivityTileState=");
        sb4.append(abstractC32703b);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C31459h(InterfaceC31458g interfaceC31458g, HealthTabResponse healthTabResponse, boolean z4, boolean z13, AbstractC39529d abstractC39529d, AbstractC32703b abstractC32703b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC31458g, (i13 & 2) != 0 ? null : healthTabResponse, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? AbstractC39529d.b.f169991b : abstractC39529d, (i13 & 32) != 0 ? AbstractC32703b.f.f135864o : abstractC32703b);
    }
}
