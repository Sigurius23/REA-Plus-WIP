package live.hms.video.media.tracks;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.AudioTrack;
import hms.webrtc.MediaStreamTrack;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B+\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010$\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0011¨\u0006("}, m65681d2 = {"Llive/hms/video/media/tracks/HMSRemoteAudioTrack;", "Llive/hms/video/media/tracks/HMSAudioTrack;", "Llive/hms/video/media/tracks/HMSRemoteTrack;", "Llive/hms/video/media/streams/HMSRemoteStream;", "stream", "Lhms/webrtc/AudioTrack;", "nativeTrack", "", "source", "", "ssrc", "<init>", "(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;J)V", "", "isEnabled", "Ll83/a0;", "setExpectedLayer", "(Z)V", "", "getVolume", "()D", "value", "setVolume", "(D)V", "toString", "()Ljava/lang/String;", "Llive/hms/video/media/streams/HMSRemoteStream;", "getStream$lib_release", "()Llive/hms/video/media/streams/HMSRemoteStream;", "J", "getSsrc", "()J", "setSsrc", "(J)V", "volume", "D", "isPlaybackAllowed", "()Z", "setPlaybackAllowed", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSRemoteAudioTrack extends HMSAudioTrack implements HMSRemoteTrack {
    public static final String TAG = "HMSRemoteAudioTrack";
    private long ssrc;
    private final HMSRemoteStream stream;
    private double volume;

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSRemoteAudioTrack$isPlaybackAllowed$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteAudioTrack$isPlaybackAllowed$1", m100430f = "HMSRemoteAudioTrack.kt", m100431l = {38}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241811 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241811(boolean z4, InterfaceC30057d<? super C241811> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$value = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSRemoteAudioTrack.this.new C241811(this.$value, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241811) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSRemoteAudioTrack hMSRemoteAudioTrack = HMSRemoteAudioTrack.this;
                boolean z4 = this.$value;
                this.label = 1;
                if (HMSRemoteAudioTrack.super.setEnabled$lib_release(z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSRemoteAudioTrack$setExpectedLayer$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteAudioTrack$setExpectedLayer$1", m100430f = "HMSRemoteAudioTrack.kt", m100431l = {73}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241821 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $isEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241821(boolean z4, InterfaceC30057d<? super C241821> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$isEnabled = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSRemoteAudioTrack.this.new C241821(this.$isEnabled, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241821) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HMSRemoteStream stream2 = HMSRemoteAudioTrack.this.getStream();
                    String trackId = HMSRemoteAudioTrack.this.getTrackId();
                    boolean z4 = this.$isEnabled;
                    this.label = 1;
                    if (stream2.setAudio(trackId, z4, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                HMSLogger.INSTANCE.m71139i(HMSRemoteAudioTrack.TAG, "Successfully subscribed to audio for " + HMSRemoteAudioTrack.this.getTrackId());
            } catch (HMSException e5) {
                HMSLogger.m71137e(HMSRemoteAudioTrack.TAG, "error while subscribing to audio for " + HMSRemoteAudioTrack.this.getTrackId() + ", error :: " + e5.getMessage());
            }
            return C23454a0.f92919a;
        }
    }

    public /* synthetic */ HMSRemoteAudioTrack(HMSRemoteStream hMSRemoteStream, AudioTrack audioTrack, String str, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSRemoteStream, audioTrack, (i13 & 4) != 0 ? "regular" : str, j7);
    }

    private final void setExpectedLayer(boolean isEnabled) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241821(isEnabled, null), 3);
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public long getSsrc() {
        return this.ssrc;
    }

    public final double getVolume() {
        return this.volume;
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public boolean isPlaybackAllowed() {
        return getIsEnabled();
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public void setPlaybackAllowed(boolean z4) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241811(z4, null), 3);
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public void setSsrc(long j7) {
        this.ssrc = j7;
    }

    public final void setVolume(double value) {
        double d3 = this.volume;
        if (d3 != 0.0d && value == 0.0d) {
            setExpectedLayer(false);
        } else if (d3 == 0.0d && value > 0.0d) {
            setExpectedLayer(true);
        }
        MediaStreamTrack nativeTrack = getNativeTrack();
        AbstractC22676k.m65748h(nativeTrack, "null cannot be cast to non-null type hms.webrtc.AudioTrack");
        ((AudioTrack) nativeTrack).setVolume(value);
        this.volume = value;
    }

    @Override // live.hms.video.media.tracks.HMSAudioTrack, live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSRemoteAudioTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + '}';
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    /* JADX INFO: renamed from: getStream$lib_release, reason: from getter */
    public HMSRemoteStream getStream() {
        return this.stream;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSRemoteAudioTrack(HMSRemoteStream stream2, AudioTrack nativeTrack, String source, long j7) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(source, "source");
        this.stream = stream2;
        this.ssrc = j7;
        this.volume = 1.0d;
    }
}
