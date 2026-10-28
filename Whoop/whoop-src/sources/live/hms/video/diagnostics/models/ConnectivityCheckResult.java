package live.hms.video.diagnostics.models;

import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.error.HMSException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u00100\u001a\u000201H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0011¨\u00062"}, m65681d2 = {"Llive/hms/video/diagnostics/models/ConnectivityCheckResult;", "", "<init>", "()V", "isPublishICEConnected", "", "isPublishICEConnected$lib_release", "()Z", "setPublishICEConnected$lib_release", "(Z)V", "isSubscribeICEConnected", "isSubscribeICEConnected$lib_release", "setSubscribeICEConnected$lib_release", "networkQualityValues", "", "", "getNetworkQualityValues$lib_release", "()Ljava/util/List;", "value", "", "testTimestamp", "getTestTimestamp", "()Ljava/lang/Long;", "setTestTimestamp$lib_release", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "Llive/hms/video/diagnostics/models/ConnectivityState;", "connectivityState", "getConnectivityState", "()Llive/hms/video/diagnostics/models/ConnectivityState;", "setConnectivityState$lib_release", "(Llive/hms/video/diagnostics/models/ConnectivityState;)V", "signallingReport", "Llive/hms/video/diagnostics/models/SignallingReport;", "getSignallingReport", "()Llive/hms/video/diagnostics/models/SignallingReport;", "mediaServerReport", "Llive/hms/video/diagnostics/models/MediaServerReport;", "getMediaServerReport", "()Llive/hms/video/diagnostics/models/MediaServerReport;", "deviceTestReport", "Llive/hms/video/diagnostics/models/DeviceTestReport;", "getDeviceTestReport", "()Llive/hms/video/diagnostics/models/DeviceTestReport;", "errors", "", "Llive/hms/video/error/HMSException;", "getErrors", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ConnectivityCheckResult {
    private boolean isPublishICEConnected;
    private boolean isSubscribeICEConnected;
    private Long testTimestamp;
    private final List<Float> networkQualityValues = new ArrayList();
    private ConnectivityState connectivityState = ConnectivityState.STARTING;
    private final SignallingReport signallingReport = new SignallingReport();
    private final MediaServerReport mediaServerReport = new MediaServerReport();
    private final DeviceTestReport deviceTestReport = new DeviceTestReport();
    private final List<HMSException> errors = new ArrayList();

    public final ConnectivityState getConnectivityState() {
        return this.connectivityState;
    }

    public final DeviceTestReport getDeviceTestReport() {
        return this.deviceTestReport;
    }

    public final List<HMSException> getErrors() {
        return this.errors;
    }

    public final MediaServerReport getMediaServerReport() {
        return this.mediaServerReport;
    }

    public final List<Float> getNetworkQualityValues$lib_release() {
        return this.networkQualityValues;
    }

    public final SignallingReport getSignallingReport() {
        return this.signallingReport;
    }

    public final Long getTestTimestamp() {
        return this.testTimestamp;
    }

    /* JADX INFO: renamed from: isPublishICEConnected$lib_release, reason: from getter */
    public final boolean getIsPublishICEConnected() {
        return this.isPublishICEConnected;
    }

    /* JADX INFO: renamed from: isSubscribeICEConnected$lib_release, reason: from getter */
    public final boolean getIsSubscribeICEConnected() {
        return this.isSubscribeICEConnected;
    }

    public final void setConnectivityState$lib_release(ConnectivityState connectivityState) {
        AbstractC22676k.m65750j(connectivityState, "<set-?>");
        this.connectivityState = connectivityState;
    }

    public final void setPublishICEConnected$lib_release(boolean z4) {
        this.isPublishICEConnected = z4;
    }

    public final void setSubscribeICEConnected$lib_release(boolean z4) {
        this.isSubscribeICEConnected = z4;
    }

    public final void setTestTimestamp$lib_release(Long l7) {
        this.testTimestamp = l7;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("ConnectivityCheckResult(testTimestamp=");
        sb4.append(this.testTimestamp);
        sb4.append(", connectivityState=");
        sb4.append(this.connectivityState);
        sb4.append(", signallingReport=");
        sb4.append(this.signallingReport);
        sb4.append(", mediaServerReport=");
        sb4.append(this.mediaServerReport);
        sb4.append(", deviceTestReport=");
        sb4.append(this.deviceTestReport);
        sb4.append(", errors=");
        return AbstractC17176i.m48506h(sb4, this.errors, ')');
    }
}
