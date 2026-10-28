package live.hms.video.media.tracks;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import hms.webrtc.RtpParameters;
import hms.webrtc.RtpTransceiver;
import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.VideoTrack;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.capturers.HMSCameraCapturer;
import live.hms.video.media.capturers.HMSCapturer;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.streams.HMSLocalStream;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HmsVideoFrameListener;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.signal.ISignal;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\u00020\u001dH\u0000¢\u0006\u0004\b-\u0010+J\u000f\u00101\u001a\u00020#H\u0000¢\u0006\u0004\b/\u00100J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0019\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u000207¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000bH\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001d¢\u0006\u0004\b?\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR0\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010]¨\u0006^"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "Llive/hms/video/media/tracks/HMSVideoTrack;", "Llive/hms/video/media/tracks/HMSLocalTrack;", "Llive/hms/video/media/streams/HMSLocalStream;", "stream", "Lhms/webrtc/VideoTrack;", "nativeTrack", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "settings", "Llive/hms/video/media/capturers/HMSCapturer;", "capturer", "", "source", "<init>", "(Llive/hms/video/media/streams/HMSLocalStream;Lhms/webrtc/VideoTrack;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/media/capturers/HMSCapturer;Ljava/lang/String;)V", "Llive/hms/video/sdk/HMSActionResultListener;", "onAction", "Lbc3/k1;", "switchCamera", "(Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "face", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;", "Llive/hms/video/media/capturers/camera/CameraControl;", "getCameraControl", "()Llive/hms/video/media/capturers/camera/CameraControl;", "deviceId", "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;", "newSettings", "Ll83/a0;", "setSettings", "(Llive/hms/video/media/settings/HMSVideoTrackSettings;Lq83/d;)Ljava/lang/Object;", "value", "setDescription", "(Ljava/lang/String;)V", "", "setMute", "(Z)V", "Llive/hms/video/sdk/HmsVideoFrameListener;", "videoFrameListener", "captureImageAtMaxPublishResolution", "(Llive/hms/video/sdk/HmsVideoFrameListener;)V", "stopCapturing$lib_release", "()V", "stopCapturing", "dispose$lib_release", "dispose", "isCapturing$lib_release", "()Z", "isCapturing", "Lhms/webrtc/SurfaceTextureHelper;", "getTextureHelper", "()Lhms/webrtc/SurfaceTextureHelper;", "Ll83/k;", "Lhms/webrtc/Size;", "", "getInputResolutionAndFps", "()Ll83/k;", "fps", "changeInputFps", "(I)V", "toString", "()Ljava/lang/String;", "setIsDispose", "Llive/hms/video/media/streams/HMSLocalStream;", "getStream$lib_release", "()Llive/hms/video/media/streams/HMSLocalStream;", "Llive/hms/video/media/capturers/HMSCapturer;", "getCapturer$lib_release", "()Llive/hms/video/media/capturers/HMSCapturer;", "Llive/hms/video/signal/ISignal;", "signal", "Llive/hms/video/signal/ISignal;", "getSignal$lib_release", "()Llive/hms/video/signal/ISignal;", "setSignal$lib_release", "(Llive/hms/video/signal/ISignal;)V", "Lhms/webrtc/RtpTransceiver;", "transceiver", "Lhms/webrtc/RtpTransceiver;", "getTransceiver$lib_release", "()Lhms/webrtc/RtpTransceiver;", "setTransceiver$lib_release", "(Lhms/webrtc/RtpTransceiver;)V", "Lkotlin/Function1;", "sendLocalUpdate", "Lkotlin/jvm/functions/Function1;", "getSendLocalUpdate$lib_release", "()Lkotlin/jvm/functions/Function1;", "setSendLocalUpdate$lib_release", "(Lkotlin/jvm/functions/Function1;)V", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "getSettings", "()Llive/hms/video/media/settings/HMSVideoTrackSettings;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSLocalVideoTrack extends HMSVideoTrack implements HMSLocalTrack {
    private final HMSCapturer capturer;
    private Function1 sendLocalUpdate;
    private HMSVideoTrackSettings settings;
    private ISignal signal;
    private final HMSLocalStream stream;
    private RtpTransceiver transceiver;

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalVideoTrack$setMute$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalVideoTrack$setMute$1", m100430f = "HMSLocalVideoTrack.kt", m100431l = {130}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241761 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $value;
        int label;
        final /* synthetic */ HMSLocalVideoTrack this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241761(boolean z4, HMSLocalVideoTrack hMSLocalVideoTrack, InterfaceC30057d<? super C241761> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$value = z4;
            this.this$0 = hMSLocalVideoTrack;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241761(this.$value, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241761) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSLogger.m71136d("HMSLocalVideoTrack", "setMute :: " + this.$value);
                HMSLocalVideoTrack hMSLocalVideoTrack = this.this$0;
                boolean z4 = this.$value ^ true;
                this.label = 1;
                if (hMSLocalVideoTrack.setEnabled$lib_release(z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ISignal signal = this.this$0.getSignal();
            if (signal != null) {
                signal.trackUpdate(AbstractC37056f.m118958J(HMSNotifications.Track.INSTANCE.from(this.this$0)));
            }
            Thread.sleep(100L);
            boolean isDisposed = this.this$0.getIsDisposed();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (isDisposed) {
                return c23454a0;
            }
            if (this.$value) {
                this.this$0.getCapturer().stop();
            } else {
                this.this$0.getCapturer().start();
            }
            Function1 sendLocalUpdate = this.this$0.getSendLocalUpdate();
            if (sendLocalUpdate != null) {
                sendLocalUpdate.invoke(this.this$0);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalVideoTrack$setSettings$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalVideoTrack", m100430f = "HMSLocalVideoTrack.kt", m100431l = {106}, m100432m = "setSettings")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241771 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C241771(InterfaceC30057d<? super C241771> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSLocalVideoTrack.this.setSettings(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$1", m100430f = "HMSLocalVideoTrack.kt", m100431l = {60}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241781 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241781(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241781> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$onAction = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSLocalVideoTrack.this.new C241781(this.$onAction, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241781) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSCapturer capturer = HMSLocalVideoTrack.this.getCapturer();
                AbstractC22676k.m65748h(capturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
                HMSActionResultListener hMSActionResultListener = this.$onAction;
                this.label = 1;
                if (((HMSCameraCapturer) capturer).switchCamera(hMSActionResultListener, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$2", m100430f = "HMSLocalVideoTrack.kt", m100431l = {66}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241792 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSVideoTrackSettings.CameraFacing $face;
        final /* synthetic */ HMSActionResultListener $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241792(HMSVideoTrackSettings.CameraFacing cameraFacing, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241792> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$face = cameraFacing;
            this.$onAction = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSLocalVideoTrack.this.new C241792(this.$face, this.$onAction, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241792) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSCapturer capturer = HMSLocalVideoTrack.this.getCapturer();
                AbstractC22676k.m65748h(capturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
                HMSVideoTrackSettings.CameraFacing cameraFacing = this.$face;
                HMSActionResultListener hMSActionResultListener = this.$onAction;
                this.label = 1;
                if (((HMSCameraCapturer) capturer).switchCamera(cameraFacing, hMSActionResultListener, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$3 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSLocalVideoTrack$switchCamera$3", m100430f = "HMSLocalVideoTrack.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241803 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $deviceId;
        final /* synthetic */ HMSActionResultListener $onAction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241803(String str, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241803> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$deviceId = str;
            this.$onAction = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSLocalVideoTrack.this.new C241803(this.$deviceId, this.$onAction, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241803) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSCapturer capturer = HMSLocalVideoTrack.this.getCapturer();
                AbstractC22676k.m65748h(capturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
                String str = this.$deviceId;
                HMSActionResultListener hMSActionResultListener = this.$onAction;
                this.label = 1;
                if (((HMSCameraCapturer) capturer).switchCamera(str, null, hMSActionResultListener, this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSLocalVideoTrack(HMSLocalStream stream2, VideoTrack nativeTrack, HMSVideoTrackSettings settings, HMSCapturer capturer, String source) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(capturer, "capturer");
        AbstractC22676k.m65750j(source, "source");
        this.stream = stream2;
        this.capturer = capturer;
        this.settings = settings;
        getStream().getTracks().add(this);
        if (settings.getInitialState() == HMSTrackSettings.InitState.MUTED) {
            setMute(true);
        }
    }

    public static /* synthetic */ InterfaceC3027k1 switchCamera$default(HMSLocalVideoTrack hMSLocalVideoTrack, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hMSActionResultListener = null;
        }
        return hMSLocalVideoTrack.switchCamera(hMSActionResultListener);
    }

    public final void captureImageAtMaxPublishResolution(HmsVideoFrameListener videoFrameListener) {
        AbstractC22676k.m65750j(videoFrameListener, "videoFrameListener");
        HMSCapturer hMSCapturer = this.capturer;
        if (hMSCapturer instanceof HMSCameraCapturer) {
            ((HMSCameraCapturer) hMSCapturer).addVideoFrameCapturer(videoFrameListener);
        }
    }

    public final void changeInputFps(int fps) {
        HMSCapturer hMSCapturer = this.capturer;
        AbstractC22676k.m65748h(hMSCapturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
        ((HMSCameraCapturer) hMSCapturer).changeInputFps(fps);
    }

    public final void dispose$lib_release() {
        this.capturer.dispose();
    }

    public final CameraControl getCameraControl() {
        HMSCapturer hMSCapturer = this.capturer;
        HMSCameraCapturer hMSCameraCapturer = hMSCapturer instanceof HMSCameraCapturer ? (HMSCameraCapturer) hMSCapturer : null;
        if (hMSCameraCapturer != null) {
            return hMSCameraCapturer.getCameraControls();
        }
        return null;
    }

    /* JADX INFO: renamed from: getCapturer$lib_release, reason: from getter */
    public final HMSCapturer getCapturer() {
        return this.capturer;
    }

    public final C23465k getInputResolutionAndFps() {
        HMSCapturer hMSCapturer = this.capturer;
        AbstractC22676k.m65748h(hMSCapturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
        return ((HMSCameraCapturer) hMSCapturer).getInputResolution();
    }

    /* JADX INFO: renamed from: getSendLocalUpdate$lib_release, reason: from getter */
    public final Function1 getSendLocalUpdate() {
        return this.sendLocalUpdate;
    }

    public final HMSVideoTrackSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: getSignal$lib_release, reason: from getter */
    public final ISignal getSignal() {
        return this.signal;
    }

    public final SurfaceTextureHelper getTextureHelper() {
        HMSCapturer hMSCapturer = this.capturer;
        AbstractC22676k.m65748h(hMSCapturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
        return ((HMSCameraCapturer) hMSCapturer).getSurTexture();
    }

    /* JADX INFO: renamed from: getTransceiver$lib_release, reason: from getter */
    public final RtpTransceiver getTransceiver() {
        return this.transceiver;
    }

    public final boolean isCapturing$lib_release() {
        HMSCapturer hMSCapturer = this.capturer;
        HMSCameraCapturer hMSCameraCapturer = hMSCapturer instanceof HMSCameraCapturer ? (HMSCameraCapturer) hMSCapturer : null;
        return hMSCameraCapturer != null && hMSCameraCapturer.getIsStarted();
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
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241761(value, this, null), 3);
    }

    public final void setSendLocalUpdate$lib_release(Function1 function1) {
        this.sendLocalUpdate = function1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setSettings(HMSVideoTrackSettings hMSVideoTrackSettings, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws HMSException {
        C241771 c241771;
        HMSLocalVideoTrack hMSLocalVideoTrack;
        if (interfaceC30057d instanceof C241771) {
            c241771 = (C241771) interfaceC30057d;
            int i13 = c241771.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241771.label = i13 - Integer.MIN_VALUE;
            } else {
                c241771 = new C241771(interfaceC30057d);
            }
        } else {
            c241771 = new C241771(interfaceC30057d);
        }
        Object obj = c241771.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c241771.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.settings.getCodec() != hMSVideoTrackSettings.getCodec()) {
                throw ErrorFactory.TracksErrors.CodecChangeNotPermitted$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, "Cannot change from " + this.settings.getCodec() + " to " + hMSVideoTrackSettings.getCodec() + " for " + this, null, null, 12, null);
            }
            if (this.transceiver != null && (hMSVideoTrackSettings.getMaxBitRate() != this.settings.getMaxBitRate() || hMSVideoTrackSettings.getMaxFrameRate() != this.settings.getMaxFrameRate() || !AbstractC22676k.m65745e(hMSVideoTrackSettings.getVideoSimulcastLayersParams(), this.settings.getVideoSimulcastLayersParams()) || !AbstractC22676k.m65745e(hMSVideoTrackSettings.getScreenShareSimulcastLayersParams(), this.settings.getScreenShareSimulcastLayersParams()))) {
                RtpTransceiver rtpTransceiver = this.transceiver;
                AbstractC22676k.m65747g(rtpTransceiver);
                RtpParameters parameters = rtpTransceiver.getSender().getParameters();
                List<RtpParameters.Encoding> list = parameters.encodings;
                list.clear();
                list.addAll(HMSUtils.getVideoEncodingParameter$lib_release$default(HMSUtils.INSTANCE, hMSVideoTrackSettings, false, 2, null));
                RtpTransceiver rtpTransceiver2 = this.transceiver;
                AbstractC22676k.m65747g(rtpTransceiver2);
                rtpTransceiver2.getSender().setParameters(parameters);
            }
            HMSCapturer hMSCapturer = this.capturer;
            AbstractC22676k.m65748h(hMSCapturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSCameraCapturer");
            c241771.L$0 = this;
            c241771.L$1 = hMSVideoTrackSettings;
            c241771.label = 1;
            if (((HMSCameraCapturer) hMSCapturer).setSettings$lib_release(hMSVideoTrackSettings, c241771) == enumC31071a) {
                return enumC31071a;
            }
            hMSLocalVideoTrack = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMSVideoTrackSettings = (HMSVideoTrackSettings) c241771.L$1;
            hMSLocalVideoTrack = (HMSLocalVideoTrack) c241771.L$0;
            AbstractC34132o.m107864I(obj);
        }
        hMSLocalVideoTrack.settings = hMSVideoTrackSettings;
        return C23454a0.f92919a;
    }

    public final void setSignal$lib_release(ISignal iSignal) {
        this.signal = iSignal;
    }

    public final void setTransceiver$lib_release(RtpTransceiver rtpTransceiver) {
        this.transceiver = rtpTransceiver;
    }

    public final void stopCapturing$lib_release() {
        this.capturer.stop();
    }

    public final InterfaceC3027k1 switchCamera(HMSActionResultListener onAction) {
        return AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241781(onAction, null), 3);
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack, live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSLocalVideoTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + ", settings=" + this.settings + ", capturer=" + this.capturer + '}';
    }

    public static /* synthetic */ InterfaceC3027k1 switchCamera$default(HMSLocalVideoTrack hMSLocalVideoTrack, HMSVideoTrackSettings.CameraFacing cameraFacing, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            hMSActionResultListener = null;
        }
        return hMSLocalVideoTrack.switchCamera(cameraFacing, hMSActionResultListener);
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    /* JADX INFO: renamed from: getStream$lib_release, reason: from getter */
    public HMSLocalStream getStream() {
        return this.stream;
    }

    public final InterfaceC3027k1 switchCamera(HMSVideoTrackSettings.CameraFacing face, HMSActionResultListener onAction) {
        AbstractC22676k.m65750j(face, "face");
        return AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241792(face, onAction, null), 3);
    }

    public final InterfaceC3027k1 switchCamera(String deviceId, HMSActionResultListener onAction) {
        AbstractC22676k.m65750j(deviceId, "deviceId");
        return AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241803(deviceId, onAction, null), 3);
    }
}
