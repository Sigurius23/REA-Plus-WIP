package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: renamed from: e33.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12622b0 implements JavaAudioDeviceModule.AudioRecordStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12638j0 f43121a;

    public C12622b0(C12638j0 c12638j0) {
        this.f43121a = c12638j0;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStart() {
        C2345k c2345kM35392a = this.f43121a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35392a.f9274b.log(enumC2341g, str, "[onWebRtcAudioRecordStart] no args", null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStop() {
        C2345k c2345kM35392a = this.f43121a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM35392a.f9274b.log(enumC2341g, str, "[onWebRtcAudioRecordStop] no args", null);
        }
    }
}
