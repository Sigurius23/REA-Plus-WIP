package live.hms.video.diagnostics.models;

import hms.webrtc.IceCandidate;
import java.util.ArrayList;
import java.util.List;
import live.hms.video.connection.stats.HMSRTCStatsReport;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0016R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012@@X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR$\u0010!\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 @@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 @@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u0006+"}, m65681d2 = {"Llive/hms/video/diagnostics/models/MediaServerReport;", "", "<init>", "()V", "value", "", "isPublishICEConnected", "()Z", "setPublishICEConnected$lib_release", "(Z)V", "isSubcribeICEConnected", "setSubcribeICEConnected$lib_release", "Llive/hms/video/connection/stats/HMSRTCStatsReport;", "stats", "getStats", "()Llive/hms/video/connection/stats/HMSRTCStatsReport;", "setStats$lib_release", "(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V", "", "connectionQualityScore", "getConnectionQualityScore", "()Ljava/lang/Float;", "setConnectionQualityScore$lib_release", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "publishIceCandidatesGathered", "", "Lhms/webrtc/IceCandidate;", "getPublishIceCandidatesGathered", "()Ljava/util/List;", "subscribeIceCandidatesGathered", "getSubscribeIceCandidatesGathered", "Llive/hms/video/diagnostics/models/IceCandidatePair;", "publishICECandidatePairSelected", "getPublishICECandidatePairSelected", "()Llive/hms/video/diagnostics/models/IceCandidatePair;", "setPublishICECandidatePairSelected$lib_release", "(Llive/hms/video/diagnostics/models/IceCandidatePair;)V", "subscribeICECandidatePairSelected", "getSubscribeICECandidatePairSelected", "setSubscribeICECandidatePairSelected$lib_release", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class MediaServerReport {
    private Float connectionQualityScore;
    private boolean isPublishICEConnected;
    private boolean isSubcribeICEConnected;
    private HMSRTCStatsReport stats;
    private final List<IceCandidate> publishIceCandidatesGathered = new ArrayList();
    private final List<IceCandidate> subscribeIceCandidatesGathered = new ArrayList();
    private IceCandidatePair publishICECandidatePairSelected = new IceCandidatePair();
    private IceCandidatePair subscribeICECandidatePairSelected = new IceCandidatePair();

    public final Float getConnectionQualityScore() {
        return this.connectionQualityScore;
    }

    public final IceCandidatePair getPublishICECandidatePairSelected() {
        return this.publishICECandidatePairSelected;
    }

    public final List<IceCandidate> getPublishIceCandidatesGathered() {
        return this.publishIceCandidatesGathered;
    }

    public final HMSRTCStatsReport getStats() {
        return this.stats;
    }

    public final IceCandidatePair getSubscribeICECandidatePairSelected() {
        return this.subscribeICECandidatePairSelected;
    }

    public final List<IceCandidate> getSubscribeIceCandidatesGathered() {
        return this.subscribeIceCandidatesGathered;
    }

    /* JADX INFO: renamed from: isPublishICEConnected, reason: from getter */
    public final boolean getIsPublishICEConnected() {
        return this.isPublishICEConnected;
    }

    /* JADX INFO: renamed from: isSubcribeICEConnected, reason: from getter */
    public final boolean getIsSubcribeICEConnected() {
        return this.isSubcribeICEConnected;
    }

    public final void setConnectionQualityScore$lib_release(Float f13) {
        this.connectionQualityScore = f13;
    }

    public final void setPublishICECandidatePairSelected$lib_release(IceCandidatePair iceCandidatePair) {
        AbstractC22676k.m65750j(iceCandidatePair, "<set-?>");
        this.publishICECandidatePairSelected = iceCandidatePair;
    }

    public final void setPublishICEConnected$lib_release(boolean z4) {
        this.isPublishICEConnected = z4;
    }

    public final void setStats$lib_release(HMSRTCStatsReport hMSRTCStatsReport) {
        this.stats = hMSRTCStatsReport;
    }

    public final void setSubcribeICEConnected$lib_release(boolean z4) {
        this.isSubcribeICEConnected = z4;
    }

    public final void setSubscribeICECandidatePairSelected$lib_release(IceCandidatePair iceCandidatePair) {
        AbstractC22676k.m65750j(iceCandidatePair, "<set-?>");
        this.subscribeICECandidatePairSelected = iceCandidatePair;
    }

    public String toString() {
        return "MediaServerReport(isPublishICEConnected=" + this.isPublishICEConnected + ", isSubcribeICEConnected=" + this.isSubcribeICEConnected + ", stats=" + this.stats + ", connectionQualityScore=" + this.connectionQualityScore + ", publishIceCandidatesGathered=" + this.publishIceCandidatesGathered + ", subscribeIceCandidatesGathered=" + this.subscribeIceCandidatesGathered + ", publishICECandidatePairSelected=" + this.publishICECandidatePairSelected + ", subscribeICECandidatePairSelected=" + this.subscribeICECandidatePairSelected + ')';
    }
}
