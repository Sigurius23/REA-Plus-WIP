package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: renamed from: e33.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12624c0 implements JavaAudioDeviceModule.AudioTrackStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12638j0 f43123a;

    public C12624c0(C12638j0 c12638j0) {
        this.f43123a = c12638j0;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStart() {
        C2345k c2345kM35392a = this.f43123a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35392a.f9274b.log(enumC2341g, str, "[onWebRtcAudioTrackStart] no args", null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStop() {
        C2345k c2345kM35392a = this.f43123a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35392a.f9274b.log(enumC2341g, str, "[onWebRtcAudioTrackStop] no args", null);
        }
    }
}
