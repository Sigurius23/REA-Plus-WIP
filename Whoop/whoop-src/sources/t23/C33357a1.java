package t23;

import bc3.C3033m;
import org.webrtc.CameraVideoCapturer;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: t23.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33357a1 implements CameraVideoCapturer.CameraSwitchHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3033m f139189a;

    public C33357a1(C3033m c3033m) {
        this.f139189a = c3033m;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchDone(boolean z4) {
        C3033m c3033m = this.f139189a;
        if (c3033m.isActive()) {
            c3033m.resumeWith(Boolean.valueOf(z4));
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraSwitchHandler
    public final void onCameraSwitchError(String str) {
        C3033m c3033m = this.f139189a;
        if (c3033m.isActive()) {
            if (str == null) {
                str = "Unknown";
            }
            c3033m.resumeWith(AbstractC34132o.m107888l(new RuntimeException(str)));
        }
    }
}
