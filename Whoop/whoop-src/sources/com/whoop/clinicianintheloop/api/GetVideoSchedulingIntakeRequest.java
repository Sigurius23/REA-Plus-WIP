package com.whoop.clinicianintheloop.api;

import com.whoop.network.request.GetApiRequest;
import com.whoop.network.request.HttpTimeoutConfig;
import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import n83.C26463f;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/GetVideoSchedulingIntakeRequest;", "Lcom/whoop/network/request/GetApiRequest;", "appointmentType", "", "appointmentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppointmentType", "()Ljava/lang/String;", "getAppointmentId", "path", "getPath", "parameters", "", "getParameters", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GetVideoSchedulingIntakeRequest implements GetApiRequest {
    public static final int $stable = 8;
    private final String appointmentId;
    private final String appointmentType;
    private final Map<String, String> parameters;
    private final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public GetVideoSchedulingIntakeRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetVideoSchedulingIntakeRequest copy$default(GetVideoSchedulingIntakeRequest getVideoSchedulingIntakeRequest, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getVideoSchedulingIntakeRequest.appointmentType;
        }
        if ((i13 & 2) != 0) {
            str2 = getVideoSchedulingIntakeRequest.appointmentId;
        }
        return getVideoSchedulingIntakeRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppointmentType() {
        return this.appointmentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppointmentId() {
        return this.appointmentId;
    }

    public final GetVideoSchedulingIntakeRequest copy(String appointmentType, String appointmentId) {
        return new GetVideoSchedulingIntakeRequest(appointmentType, appointmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVideoSchedulingIntakeRequest)) {
            return false;
        }
        GetVideoSchedulingIntakeRequest getVideoSchedulingIntakeRequest = (GetVideoSchedulingIntakeRequest) other;
        return AbstractC22676k.m65745e(this.appointmentType, getVideoSchedulingIntakeRequest.appointmentType) && AbstractC22676k.m65745e(this.appointmentId, getVideoSchedulingIntakeRequest.appointmentId);
    }

    public final String getAppointmentId() {
        return this.appointmentId;
    }

    public final String getAppointmentType() {
        return this.appointmentType;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public Map<String, String> getParameters() {
        return this.parameters;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        String str = this.appointmentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appointmentId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("GetVideoSchedulingIntakeRequest(appointmentType=", this.appointmentType, ", appointmentId=", this.appointmentId, ")");
    }

    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    public GetVideoSchedulingIntakeRequest(String str, String str2) {
        this.appointmentType = str;
        this.appointmentId = str2;
        this.path = "clinician-in-the-loop-service/v1/scheduling/intake";
        C26463f c26463f = new C26463f();
        if (str != null && !AbstractC39414r.m125890i0(str)) {
            c26463f.put("appointmentType", str);
        }
        if (str2 != null && !AbstractC39414r.m125890i0(str2)) {
            c26463f.put("appointmentId", str2);
        }
        this.parameters = c26463f.m78380b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Void, l83.a0] */
    @Override // com.whoop.network.request.GetApiRequest, z02.InterfaceC39944a
    public /* bridge */ C23454a0 getBody() {
        return super.getBody();
    }

    public /* synthetic */ GetVideoSchedulingIntakeRequest(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }
}
