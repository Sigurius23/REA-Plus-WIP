package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import org.webrtc.audio.JavaAudioDeviceModule;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: e33.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C12666z implements JavaAudioDeviceModule.AudioRecordErrorCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12638j0 f43311a;

    public C12666z(C12638j0 c12638j0) {
        this.f43311a = c12638j0;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordError(String str) {
        C2345k c2345kM35392a = this.f43311a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onWebRtcAudioRecordError] ", str), null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordInitError(String str) {
        C2345k c2345kM35392a = this.f43311a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onWebRtcAudioRecordInitError] ", str), null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        C2345k c2345kM35392a = this.f43311a.m35392a();
        InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str2 = c2345kM35392a.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM35392a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[onWebRtcAudioRecordInitError] ", str), null);
        }
    }
}
