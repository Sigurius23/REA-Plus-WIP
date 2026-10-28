package live.hms.video.media.tracks;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.AudioTrack;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.RtpParameters;
import hms.webrtc.RtpTransceiver;
import l83.C23454a0;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.streams.HMSLocalStream;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.signal.ISignal;
import live.hms.video.utils.HMSCoroutineScope;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R*\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, m65681d2 = {"Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "Llive/hms/video/media/tracks/HMSAudioTrack;", "Llive/hms/video/media/tracks/HMSLocalTrack;", "Llive/hms/video/media/streams/HMSLocalStream;", "stream", "Lhms/webrtc/AudioTrack;", "nativeTrack", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "settings", "", "source", "<init>", "(Llive/hms/video/media/streams/HMSLocalStream;Lhms/webrtc/AudioTrack;Llive/hms/video/media/settings/HMSAudioTrackSettings;Ljava/lang/String;)V", "newSettings", "Ll83/a0;", "setSettings", "(Llive/hms/video/media/settings/HMSAudioTrackSettings;Lq83/d;)Ljava/lang/Object;", "value", "setDescription", "(Ljava/lang/String;)V", "", "setMute", "(Z)V", "toString", "()Ljava/lang/String;", "setIsDispose", "()V", "Llive/hms/video/media/streams/HMSLocalStream;", "getStream$lib_release", "()Llive/hms/video/media/streams/HMSLocalStream;", "Llive/hms/video/signal/ISignal;", "signal", "Llive/hms/video/signal/ISignal;", "getSignal$lib_release", "()Llive/hms/video/signal/ISignal;", "setSignal$lib_release", "(Llive/hms/video/signal/ISignal;)V", "Lhms/webrtc/RtpTransceiver;", "transceiver", "Lhms/webrtc/RtpTransceiver;", "getTransceiver$lib_release", "()Lhms/webrtc/RtpTransceiver;", "setTransceiver$lib_release", "(Lhms/webrtc/RtpTransceiver;)V", "Lkotlin/Function1;", "sendLocalUpdate", "Lkotlin/jvm/functions/Function1;", "getSendLocalUpdate$lib_release", "()Lkotlin/jvm/functions/Function1;", "setSendLocalUpdate$lib_release", "(Lkotlin/jvm/functions/Function1;)V", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "getSettings", "()Llive/hms/video/media/settings/HMSAudioTrackSettings;", "", "volume", "D", "getVolume", "()D", "setVolume", "(D)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSLocalAudioTrack extends HMSAudioTrack implements HMSLocalTrack {
    private Function1 sendLocalUpdate;
    private HMSAudioTrackSettings settings;
    private ISignal signal;
    private final HMSLocalStream stream;
    private RtpTransceiver transceiver;
    private double volume;

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalAudioTrack$setMute$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalAudioTrack$setMute$1", m100430f = "HMSLocalAudioTrack.kt", m100431l = {101}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241751 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241751(boolean z4, InterfaceC30057d<? super C241751> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$value = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSLocalAudioTrack.this.new C241751(this.$value, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241751) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSLocalAudioTrack hMSLocalAudioTrack = HMSLocalAudioTrack.this;
                boolean z4 = !this.$value;
                this.label = 1;
                if (hMSLocalAudioTrack.setEnabled$lib_release(z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ISignal signal = HMSLocalAudioTrack.this.getSignal();
            if (signal != null) {
                signal.trackUpdate(AbstractC37056f.m118958J(HMSNotifications.Track.INSTANCE.from(HMSLocalAudioTrack.this)));
            }
            Function1 sendLocalUpdate = HMSLocalAudioTrack.this.getSendLocalUpdate();
            if (sendLocalUpdate != null) {
                sendLocalUpdate.invoke(HMSLocalAudioTrack.this);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSLocalAudioTrack(HMSLocalStream stream2, AudioTrack nativeTrack, HMSAudioTrackSettings settings, String source) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(source, "source");
        this.stream = stream2;
        this.settings = settings;
        getStream().getTracks().add(this);
        nativeTrack.setVolume(settings.getVolume());
        if (settings.getInitialState() == HMSTrackSettings.InitState.MUTED) {
            setMute(true);
        }
        this.volume = settings.getVolume();
    }

    /* JADX INFO: renamed from: getSendLocalUpdate$lib_release, reason: from getter */
    public final Function1 getSendLocalUpdate() {
        return this.sendLocalUpdate;
    }

    public final HMSAudioTrackSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: getSignal$lib_release, reason: from getter */
    public final ISignal getSignal() {
        return this.signal;
    }

    /* JADX INFO: renamed from: getTransceiver$lib_release, reason: from getter */
    public final RtpTransceiver getTransceiver() {
        return this.transceiver;
    }

    public final double getVolume() {
        return this.volume;
    }

    @Override // live.hms.video.media.tracks.HMSLocalTrack
    public void setDescription(String value) {
        AbstractC22676k.m65750j(value, "value");
        setDescription$lib_release(value);
        ISignal iSignal = this.signal;
        if (iSignal != null) {
            iSignal.trackUpdate(AbstractC37056f.m118958J(HMSNotifications.Track.INSTANCE.from(this)));
        }
    }

    public final void setIsDispose() {
        setDisposed$lib_release(true);
    }

    @Override // live.hms.video.media.tracks.HMSLocalTrack
    public void setMute(boolean value) {
        if (getIsMute() == value) {
            return;
        }
        setMute$lib_release(value);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241751(value, null), 3);
    }

    public final void setSendLocalUpdate$lib_release(Function1 function1) {
        this.sendLocalUpdate = function1;
    }

    public final Object setSettings(HMSAudioTrackSettings hMSAudioTrackSettings, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws HMSException {
        if (this.settings.getCodec() != hMSAudioTrackSettings.getCodec()) {
            throw ErrorFactory.TracksErrors.CodecChangeNotPermitted$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, "Cannot change from " + this.settings.getCodec() + " to " + hMSAudioTrackSettings.getCodec() + " for " + this, null, null, 12, null);
        }
        if (this.transceiver != null && hMSAudioTrackSettings.getMaxBitrate() != this.settings.getMaxBitrate()) {
            RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
            encoding.bitratePriority = 2.0d;
            encoding.maxBitrateBps = new Integer(hMSAudioTrackSettings.getMaxBitrate() * 1000);
            RtpTransceiver rtpTransceiver = this.transceiver;
            AbstractC22676k.m65747g(rtpTransceiver);
            RtpParameters parameters = rtpTransceiver.getSender().getParameters();
            parameters.encodings.clear();
            parameters.encodings.add(encoding);
            RtpTransceiver rtpTransceiver2 = this.transceiver;
            AbstractC22676k.m65747g(rtpTransceiver2);
            rtpTransceiver2.getSender().setParameters(parameters);
        }
        setVolume(hMSAudioTrackSettings.getVolume());
        this.settings = hMSAudioTrackSettings;
        return C23454a0.f92919a;
    }

    public final void setSignal$lib_release(ISignal iSignal) {
        this.signal = iSignal;
    }

    public final void setTransceiver$lib_release(RtpTransceiver rtpTransceiver) {
        this.transceiver = rtpTransceiver;
    }

    public final void setVolume(double d3) {
        if (!getIsDisposed()) {
            MediaStreamTrack nativeTrack = getNativeTrack();
            AbstractC22676k.m65748h(nativeTrack, "null cannot be cast to non-null type hms.webrtc.AudioTrack");
            ((AudioTrack) nativeTrack).setVolume(d3);
        }
        this.volume = d3;
    }

    @Override // live.hms.video.media.tracks.HMSAudioTrack, live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSLocalAudioTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + ", settings=" + this.settings + '}';
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    /* JADX INFO: renamed from: getStream$lib_release, reason: from getter */
    public HMSLocalStream getStream() {
        return this.stream;
    }
}
