package live.hms.video.connection.subscribe;

import android.util.Log;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.MediaStream;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.RtpReceiver;
import l83.C23454a0;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onAddTrack$1", m100430f = "HMSSubscribeConnection.kt", m100431l = {145}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class HMSSubscribeConnection$nativeObserver$1$onAddTrack$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ MediaStream[] $mediaStreams;
    final /* synthetic */ ISubscribeConnectionObserver $observer;
    final /* synthetic */ RtpReceiver $receiver;
    final /* synthetic */ RemoteTrackFactory $remoteTrackFactory;
    int label;
    final /* synthetic */ HMSSubscribeConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSSubscribeConnection$nativeObserver$1$onAddTrack$1(HMSSubscribeConnection hMSSubscribeConnection, MediaStream[] mediaStreamArr, RtpReceiver rtpReceiver, RemoteTrackFactory remoteTrackFactory, ISubscribeConnectionObserver iSubscribeConnectionObserver, InterfaceC30057d<? super HMSSubscribeConnection$nativeObserver$1$onAddTrack$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSSubscribeConnection;
        this.$mediaStreams = mediaStreamArr;
        this.$receiver = rtpReceiver;
        this.$remoteTrackFactory = remoteTrackFactory;
        this.$observer = iSubscribeConnectionObserver;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new HMSSubscribeConnection$nativeObserver$1$onAddTrack$1(this.this$0, this.$mediaStreams, this.$receiver, this.$remoteTrackFactory, this.$observer, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((HMSSubscribeConnection$nativeObserver$1$onAddTrack$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.this$0.getIsClose()) {
                    Log.d("HMSSubscribeConnection", "Ignoring onAddTrack as connection is closed");
                    return c23454a0;
                }
                MediaStream mediaStream = this.$mediaStreams[0];
                if (!this.this$0.remoteStreams.containsKey(mediaStream.getId())) {
                    HMSRemoteStream hMSRemoteStream = new HMSRemoteStream(mediaStream, this.this$0);
                    HMSLogger.m71136d("HMSSubscribeConnection", "Adding to remoteStreams :: " + hMSRemoteStream.getId());
                    this.this$0.remoteStreams.put(hMSRemoteStream.getId(), hMSRemoteStream);
                }
                Object obj2 = this.this$0.remoteStreams.get(mediaStream.getId());
                AbstractC22676k.m65747g(obj2);
                HMSRemoteStream hMSRemoteStream2 = (HMSRemoteStream) obj2;
                MediaStreamTrack mediaStreamTrackTrack = this.$receiver.track();
                AbstractC22676k.m65747g(mediaStreamTrackTrack);
                if (this.$receiver.getParameters().encodings.size() == 0) {
                    HMSLogger.m71137e("HMSSubscribeConnection", "RtpParameters are not ready.");
                    return c23454a0;
                }
                RemoteTrackFactory remoteTrackFactory = this.$remoteTrackFactory;
                Long ssrc = this.$receiver.getParameters().encodings.get(0).ssrc;
                AbstractC22676k.m65749i(ssrc, "ssrc");
                HMSTrack hMSTrackCreateRemoteTrack = remoteTrackFactory.createRemoteTrack(mediaStreamTrackTrack, hMSRemoteStream2, ssrc.longValue());
                HMSLogger.m71136d("HMSSubscribeConnection", "Adding " + hMSTrackCreateRemoteTrack.getType() + " track :: trackId = " + mediaStreamTrackTrack.m49577id() + " ssrc = " + this.$receiver.getParameters().encodings.get(0).ssrc);
                hMSRemoteStream2.getTracks().add(hMSTrackCreateRemoteTrack);
                StringBuilder sb4 = new StringBuilder("Added to the ");
                sb4.append(hMSRemoteStream2.getTracks().size() - 1);
                sb4.append("th position");
                HMSLogger.m71136d("HMSSubscribeConnection", sb4.toString());
                ISubscribeConnectionObserver iSubscribeConnectionObserver = this.$observer;
                this.label = 1;
                if (iSubscribeConnectionObserver.onTrackAdd(hMSTrackCreateRemoteTrack, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (IllegalStateException e5) {
            HMSLogger.m71137e("HMSSubscribeConnection", "Ignoring onAddTrack as MediaStream is already disposed " + e5.getMessage());
        }
        return c23454a0;
    }
}
