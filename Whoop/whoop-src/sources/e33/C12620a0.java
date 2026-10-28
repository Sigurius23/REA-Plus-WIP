package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import org.webrtc.audio.JavaAudioDeviceModule;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: e33.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12620a0 implements JavaAudioDeviceModule.AudioTrackErrorCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12638j0 f43119a;

    public C12620a0(C12638j0 c12638j0) {
        this.f43119a = c12638j0;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackError(String str) {
        C2345k c2345kM35392a = this.f43119a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onWebRtcAudioTrackError] ", str), null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackInitError(String str) {
        C2345k c2345kM35392a = this.f43119a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onWebRtcAudioTrackInitError] ", str), null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        C2345k c2345kM35392a = this.f43119a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, "[onWebRtcAudioTrackStartError] " + audioTrackStartErrorCode, null);
        }
    }
}
