package live.hms.video.connection.helpers;

import hms.webrtc.SdpObserver;
import hms.webrtc.SessionDescription;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/connection/helpers/HMSSdpObserver;", "Lhms/webrtc/SdpObserver;", "Llive/hms/video/connection/models/HMSConnectionRole;", "role", "<init>", "(Llive/hms/video/connection/models/HMSConnectionRole;)V", "Lhms/webrtc/SessionDescription;", "sdp", "Ll83/a0;", "onCreateSuccess", "(Lhms/webrtc/SessionDescription;)V", "onSetSuccess", "()V", "", "error", "onCreateFailure", "(Ljava/lang/String;)V", "onSetFailure", "Llive/hms/video/connection/models/HMSConnectionRole;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSSdpObserver implements SdpObserver {
    public static final String TAG = "HMSSdpObserver";
    private final HMSConnectionRole role;

    public HMSSdpObserver(HMSConnectionRole role) {
        AbstractC22676k.m65750j(role, "role");
        this.role = role;
    }

    @Override // hms.webrtc.SdpObserver
    public void onCreateFailure(String error) {
        AbstractC22676k.m65750j(error, "error");
        HMSLogger.m71137e(TAG, "[" + this.role + "] onCreateFailure error=" + error);
    }

    @Override // hms.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sdp) {
        AbstractC22676k.m65750j(sdp, "sdp");
        HMSLogger.INSTANCE.m71140v(TAG, "[" + this.role + "] onCreateSuccess type=" + sdp.type + " [size=" + sdp.description.length() + "] description=" + sdp.description);
    }

    @Override // hms.webrtc.SdpObserver
    public void onSetFailure(String error) {
        AbstractC22676k.m65750j(error, "error");
        HMSLogger.m71137e(TAG, "[" + this.role + "] onSetFailure: error=" + error);
    }

    @Override // hms.webrtc.SdpObserver
    public void onSetSuccess() {
        HMSLogger.INSTANCE.m71140v(TAG, "[" + this.role + "] onSetSuccess");
    }
}
