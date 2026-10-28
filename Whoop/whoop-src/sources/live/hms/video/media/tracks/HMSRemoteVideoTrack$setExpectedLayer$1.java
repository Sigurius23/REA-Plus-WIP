package live.hms.video.media.tracks;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.media.settings.HMSSimulcastLayer;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.media.streams.models.PreferStateResponse;
import live.hms.video.sdk.HMSAddSinkResultListener;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteVideoTrack$setExpectedLayer$1", m100430f = "HMSRemoteVideoTrack.kt", m100431l = {120}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class HMSRemoteVideoTrack$setExpectedLayer$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ HMSSimulcastLayer $layer;
    final /* synthetic */ HMSAddSinkResultListener $resultListener;
    int label;
    final /* synthetic */ HMSRemoteVideoTrack this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSRemoteVideoTrack$setExpectedLayer$1(HMSRemoteVideoTrack hMSRemoteVideoTrack, HMSSimulcastLayer hMSSimulcastLayer, HMSAddSinkResultListener hMSAddSinkResultListener, InterfaceC30057d<? super HMSRemoteVideoTrack$setExpectedLayer$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = hMSRemoteVideoTrack;
        this.$layer = hMSSimulcastLayer;
        this.$resultListener = hMSAddSinkResultListener;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new HMSRemoteVideoTrack$setExpectedLayer$1(this.this$0, this.$layer, this.$resultListener, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((HMSRemoteVideoTrack$setExpectedLayer$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSRemoteStream stream2 = this.this$0.getStream();
                HMSSimulcastLayer hMSSimulcastLayer = this.$layer;
                String trackId = this.this$0.getTrackId();
                this.label = 1;
                obj = stream2.setVideo(hMSSimulcastLayer, trackId, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            PreferStateResponse preferStateResponse = (PreferStateResponse) obj;
            HMSAddSinkResultListener hMSAddSinkResultListener = this.$resultListener;
            if (hMSAddSinkResultListener != null) {
                hMSAddSinkResultListener.onSuccess(preferStateResponse.getInfo().getTrackId());
            }
        } catch (HMSException e5) {
            HMSAddSinkResultListener hMSAddSinkResultListener2 = this.$resultListener;
            if (hMSAddSinkResultListener2 != null) {
                hMSAddSinkResultListener2.onError(e5);
            }
        }
        return C23454a0.f92919a;
    }
}
