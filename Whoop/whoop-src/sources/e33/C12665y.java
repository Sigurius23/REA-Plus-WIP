package e33;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.os.Build;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import c93.InterfaceC4339a;
import f33.C14048a;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SimulcastAlignedVideoEncoderFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import stream.video.sfu.models.AudioBitrateProfile;
import t23.C33414l;

/* JADX INFO: renamed from: e33.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C12665y extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12638j0 f43310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12665y(C12638j0 c12638j0) {
        super(0);
        this.f43310w = c12638j0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C12638j0 c12638j0 = this.f43310w;
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(c12638j0.f43151a).setInjectableLogger(new C12661v(c12638j0), c12638j0.f43155e).createInitializationOptions());
        C33414l c33414l = c12638j0.f43152b;
        AudioBitrateProfile audioBitrateProfile = (AudioBitrateProfile) c12638j0.f43153c.invoke();
        c12638j0.f43156f = audioBitrateProfile;
        boolean z4 = audioBitrateProfile == AudioBitrateProfile.AUDIO_BITRATE_PROFILE_MUSIC_HIGH_QUALITY;
        boolean z13 = !z4 && Build.VERSION.SDK_INT >= 29;
        boolean z14 = !z4 && Build.VERSION.SDK_INT >= 29;
        JavaAudioDeviceModule.Builder useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.builder(c12638j0.f43151a).setUseHardwareAcousticEchoCanceler(z13);
        if (((Number) c33414l.invoke()).intValue() != 2) {
            useHardwareAcousticEchoCanceler.setAudioAttributes(new AudioAttributes.Builder().setUsage(((Number) c33414l.invoke()).intValue()).build());
        }
        JavaAudioDeviceModule javaAudioDeviceModuleCreateAudioDeviceModule = useHardwareAcousticEchoCanceler.setUseHardwareNoiseSuppressor(z14).setAudioRecordErrorCallback(new C12666z(c12638j0)).setAudioTrackErrorCallback(new C12620a0(c12638j0)).setAudioRecordStateCallback(new C12622b0(c12638j0)).setAudioTrackStateCallback(new C12624c0(c12638j0)).setSamplesReadyCallback(new C12661v(c12638j0)).setAudioBufferCallback(new C12661v(c12638j0)).setUseStereoOutput(true).createAudioDeviceModule();
        javaAudioDeviceModuleCreateAudioDeviceModule.setMicrophoneMute(false);
        javaAudioDeviceModuleCreateAudioDeviceModule.setSpeakerMute(false);
        c12638j0.f43166p = javaAudioDeviceModuleCreateAudioDeviceModule;
        if (c12638j0.f43168r) {
            JavaAudioDeviceModule javaAudioDeviceModule = c12638j0.f43166p;
            if (javaAudioDeviceModule != null) {
                javaAudioDeviceModule.setPreferredInputDevice(c12638j0.f43167q);
            }
            C2345k c2345kM35392a = c12638j0.m35392a();
            InterfaceC2339e interfaceC2339e = c2345kM35392a.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, c2345kM35392a.f9273a)) {
                InterfaceC2344j interfaceC2344j = c2345kM35392a.f9274b;
                String str = c2345kM35392a.f9273a;
                AudioDeviceInfo audioDeviceInfo = c12638j0.f43167q;
                interfaceC2344j.log(enumC2341g, str, "[createFactory] Applied pending preferred input device: " + ((Object) (audioDeviceInfo != null ? audioDeviceInfo.getProductName() : null)), null);
            }
            c12638j0.f43168r = false;
        }
        c12638j0.f43153c.invoke();
        PeerConnectionFactory peerConnectionFactoryCreatePeerConnectionFactory = PeerConnectionFactory.builder().setVideoDecoderFactory((C14048a) c12638j0.f43163m.getValue()).setVideoEncoderFactory((SimulcastAlignedVideoEncoderFactory) c12638j0.f43164n.getValue()).setAudioDeviceModule(c12638j0.f43166p).createPeerConnectionFactory();
        AbstractC22676k.m65749i(peerConnectionFactoryCreatePeerConnectionFactory, "createPeerConnectionFactory(...)");
        return peerConnectionFactoryCreatePeerConnectionFactory;
    }
}
