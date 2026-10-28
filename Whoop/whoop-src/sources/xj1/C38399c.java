package xj1;

import c41.C4141w2;
import com.whoop.healthmonitor.domain.models.ComposableHealthMonitorResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sl1.AbstractC32703b;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: xj1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010-\u001a\u0004\b'\u0010.¨\u0006/"}, m65681d2 = {"Lxj1/c;", "", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "response", "Lc41/w2;", "tileDialog", "Lxj1/f;", "modalType", "Lsl1/b;", "connectivityTile", "Lxj1/d;", "liveHrState", "Lxj1/g;", "healthReport", "<init>", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;)V", "a", "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lc41/w2;Lxj1/f;Lsl1/b;Lxj1/d;Lxj1/g;)Lxj1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "g", "()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;", "b", "Lc41/w2;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lc41/w2;", "c", "Lxj1/f;", "f", "()Lxj1/f;", "d", "Lsl1/b;", "()Lsl1/b;", "e", "Lxj1/d;", "()Lxj1/d;", "Lxj1/g;", "()Lxj1/g;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38399c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ComposableHealthMonitorResponse response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4141w2 tileDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC38402f modalType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC32703b connectivityTile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38400d liveHrState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC38403g healthReport;

    public C38399c(ComposableHealthMonitorResponse composableHealthMonitorResponse, C4141w2 c4141w2, EnumC38402f enumC38402f, AbstractC32703b connectivityTile, C38400d liveHrState, AbstractC38403g abstractC38403g) {
        AbstractC22676k.m65750j(connectivityTile, "connectivityTile");
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        this.response = composableHealthMonitorResponse;
        this.tileDialog = c4141w2;
        this.modalType = enumC38402f;
        this.connectivityTile = connectivityTile;
        this.liveHrState = liveHrState;
        this.healthReport = abstractC38403g;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38399c m122974b(C38399c c38399c, ComposableHealthMonitorResponse composableHealthMonitorResponse, C4141w2 c4141w2, EnumC38402f enumC38402f, AbstractC32703b abstractC32703b, C38400d c38400d, AbstractC38403g abstractC38403g, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            composableHealthMonitorResponse = c38399c.response;
        }
        if ((i13 & 2) != 0) {
            c4141w2 = c38399c.tileDialog;
        }
        if ((i13 & 4) != 0) {
            enumC38402f = c38399c.modalType;
        }
        if ((i13 & 8) != 0) {
            abstractC32703b = c38399c.connectivityTile;
        }
        if ((i13 & 16) != 0) {
            c38400d = c38399c.liveHrState;
        }
        if ((i13 & 32) != 0) {
            abstractC38403g = c38399c.healthReport;
        }
        C38400d c38400d2 = c38400d;
        AbstractC38403g abstractC38403g2 = abstractC38403g;
        return c38399c.m122975a(composableHealthMonitorResponse, c4141w2, enumC38402f, abstractC32703b, c38400d2, abstractC38403g2);
    }

    /* JADX INFO: renamed from: a */
    public final C38399c m122975a(ComposableHealthMonitorResponse response, C4141w2 tileDialog, EnumC38402f modalType, AbstractC32703b connectivityTile, C38400d liveHrState, AbstractC38403g healthReport) {
        AbstractC22676k.m65750j(connectivityTile, "connectivityTile");
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        return new C38399c(response, tileDialog, modalType, connectivityTile, liveHrState, healthReport);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC32703b getConnectivityTile() {
        return this.connectivityTile;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC38403g getHealthReport() {
        return this.healthReport;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C38400d getLiveHrState() {
        return this.liveHrState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38399c)) {
            return false;
        }
        C38399c c38399c = (C38399c) other;
        return AbstractC22676k.m65745e(this.response, c38399c.response) && AbstractC22676k.m65745e(this.tileDialog, c38399c.tileDialog) && this.modalType == c38399c.modalType && AbstractC22676k.m65745e(this.connectivityTile, c38399c.connectivityTile) && AbstractC22676k.m65745e(this.liveHrState, c38399c.liveHrState) && AbstractC22676k.m65745e(this.healthReport, c38399c.healthReport);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC38402f getModalType() {
        return this.modalType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ComposableHealthMonitorResponse getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C4141w2 getTileDialog() {
        return this.tileDialog;
    }

    public int hashCode() {
        ComposableHealthMonitorResponse composableHealthMonitorResponse = this.response;
        int iHashCode = (composableHealthMonitorResponse == null ? 0 : composableHealthMonitorResponse.hashCode()) * 31;
        C4141w2 c4141w2 = this.tileDialog;
        int iHashCode2 = (iHashCode + (c4141w2 == null ? 0 : c4141w2.hashCode())) * 31;
        EnumC38402f enumC38402f = this.modalType;
        int iHashCode3 = (this.liveHrState.hashCode() + ((this.connectivityTile.hashCode() + ((iHashCode2 + (enumC38402f == null ? 0 : enumC38402f.hashCode())) * 31)) * 31)) * 31;
        AbstractC38403g abstractC38403g = this.healthReport;
        return iHashCode3 + (abstractC38403g != null ? abstractC38403g.hashCode() : 0);
    }

    public String toString() {
        return "ComposableHealthMonitorDomainResult(response=" + this.response + ", tileDialog=" + this.tileDialog + ", modalType=" + this.modalType + ", connectivityTile=" + this.connectivityTile + ", liveHrState=" + this.liveHrState + ", healthReport=" + this.healthReport + ")";
    }

    public /* synthetic */ C38399c(ComposableHealthMonitorResponse composableHealthMonitorResponse, C4141w2 c4141w2, EnumC38402f enumC38402f, AbstractC32703b abstractC32703b, C38400d c38400d, AbstractC38403g abstractC38403g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : composableHealthMonitorResponse, (i13 & 2) != 0 ? null : c4141w2, (i13 & 4) != 0 ? null : enumC38402f, (i13 & 8) != 0 ? AbstractC32703b.f.f135864o : abstractC32703b, (i13 & 16) != 0 ? new C38400d(AbstractC39529d.b.f169991b, false) : c38400d, (i13 & 32) != 0 ? null : abstractC38403g);
    }
}
