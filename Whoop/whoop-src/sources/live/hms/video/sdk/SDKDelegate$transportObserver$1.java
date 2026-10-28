package live.hms.video.sdk;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import io.getstream.chat.android.client.api.QueryParams;
import live.hms.video.diagnostics.ITransportListener;
import live.hms.video.error.HMSException;
import live.hms.video.media.tracks.HMSLocalTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.transport.ITransportObserver;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"live/hms/video/sdk/SDKDelegate$transportObserver$1", "Llive/hms/video/transport/ITransportObserver;", "Lcom/google/gson/JsonObject;", "message", "Ll83/a0;", "onNotification", "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onTrackAdd", "(Llive/hms/video/media/tracks/HMSTrack;)V", "onTrackRemove", "Llive/hms/video/transport/models/TransportState;", "state", "Llive/hms/video/error/HMSException;", "error", "onStateChange", "(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V", "", QueryParams.URL, "onWebSocketConnected", "(Ljava/lang/String;)V", "", "isPublish", "onICEConnected", "(Z)V", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;Z)V", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;Z)V", "onInitFetched", "()V", "onNonFatalError", "(Llive/hms/video/error/HMSException;)V", "onStopScreenshare", "onStopAudioshare", "Llive/hms/video/media/tracks/HMSLocalTrack;", "localTrack", "onTrackMuteChange", "(Llive/hms/video/media/tracks/HMSLocalTrack;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SDKDelegate$transportObserver$1 implements ITransportObserver {
    final /* synthetic */ SDKDelegate this$0;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransportState.values().length];
            try {
                iArr[TransportState.Disconnected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransportState.Connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransportState.SignalConnected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransportState.Joined.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransportState.Failed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransportState.Reconnecting.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SDKDelegate$transportObserver$1(SDKDelegate sDKDelegate) {
        this.this$0 = sDKDelegate;
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onICEConnected(boolean isPublish) {
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onICEConnected(isPublish);
        }
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onIceCandidate(IceCandidate candidate, boolean isPublish) {
        AbstractC22676k.m65750j(candidate, "candidate");
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onIceCandidate(candidate, isPublish);
        }
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onInitFetched() {
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onInitFetched();
        }
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onNonFatalError(HMSException error) {
        AbstractC22676k.m65750j(error, "error");
        IErrorListener iErrorListener = this.this$0.errorListener;
        if (iErrorListener != null) {
            iErrorListener.onError(error);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x0611  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02eb, code lost:
    
        if (r5.onPolicyChangeHandled(r2, r3) == r4) goto L125;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:191:0x0611, please report this as an issue */
    @Override // live.hms.video.transport.ITransportObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNotification(com.google.gson.JsonObject r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) {
        /*
            Method dump skipped, instruction units count: 1724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate$transportObserver$1.onNotification(com.google.gson.JsonObject, q83.d):java.lang.Object");
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event, boolean isPublish) {
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onSelectedCandidatePairChanged(event, isPublish);
        }
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onStateChange(TransportState state, HMSException error) {
        HMSUpdateListener hMSUpdateListener;
        AbstractC22676k.m65750j(state, "state");
        HMSLogger.m71136d("SDKDelegate", "onStateChange :: " + state);
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                if (this.this$0.isReconnecting && (hMSUpdateListener = this.this$0.hmsUpdateListener) != null) {
                    hMSUpdateListener.onReconnected();
                }
                this.this$0.isReconnecting = false;
                this.this$0.webrtcStatsMonitor.setTransportConnected(true);
                break;
            case 5:
                HMSUpdateListener hMSUpdateListener2 = this.this$0.hmsUpdateListener;
                if (hMSUpdateListener2 != null) {
                    AbstractC22676k.m65747g(error);
                    hMSUpdateListener2.onError(error);
                }
                HMSPreviewListener hMSPreviewListener = this.this$0.hmsPreviewListener;
                if (hMSPreviewListener != null) {
                    AbstractC22676k.m65747g(error);
                    hMSPreviewListener.onError(error);
                }
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new SDKDelegate$transportObserver$1$onStateChange$1(this.this$0, null), 3);
                break;
            case 6:
                if (!this.this$0.isReconnecting) {
                    this.this$0.isReconnecting = true;
                    HMSUpdateListener hMSUpdateListener3 = this.this$0.hmsUpdateListener;
                    if (hMSUpdateListener3 != null) {
                        AbstractC22676k.m65747g(error);
                        hMSUpdateListener3.onReconnecting(error);
                    }
                    this.this$0.webrtcStatsMonitor.setTransportConnected(false);
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.this$0.transportState = state;
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onStopAudioshare() {
        this.this$0.stopAudioshare(new HMSActionResultListener() { // from class: live.hms.video.sdk.SDKDelegate$transportObserver$1$onStopAudioshare$1
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSLogger.INSTANCE.m71140v("SDKDelegate", "Audio share could not be stopped from notification " + error);
            }

            @Override // live.hms.video.sdk.HMSActionResultListener
            public void onSuccess() {
                HMSLogger.INSTANCE.m71140v("SDKDelegate", "Audio share successfully stopped from notification");
            }
        });
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onStopScreenshare() {
        this.this$0.stopScreenshare(new HMSActionResultListener() { // from class: live.hms.video.sdk.SDKDelegate$transportObserver$1$onStopScreenshare$1
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSLogger.INSTANCE.m71140v("SDKDelegate", "Screenshare could not be stopped from notification " + error);
            }

            @Override // live.hms.video.sdk.HMSActionResultListener
            public void onSuccess() {
                HMSLogger.INSTANCE.m71140v("SDKDelegate", "Screenshare successfully stopped from notification");
            }
        });
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onTrackAdd(HMSTrack track) {
        AbstractC22676k.m65750j(track, "track");
        HMSLogger.m71136d("SDKDelegate", "onTrackAdd received :: " + track);
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onRTCTrackAdded(track);
        }
        this.this$0.fireUpdates(this.this$0.onTrackAddManager.manageNativeTrack(track));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // live.hms.video.transport.ITransportObserver
    public void onTrackMuteChange(HMSLocalTrack localTrack) {
        AbstractC22676k.m65750j(localTrack, "localTrack");
        SDKUpdate.Track trackTrackMuteUpdate = SDKUpdate.INSTANCE.trackMuteUpdate((HMSTrack) localTrack, this.this$0.store);
        if (trackTrackMuteUpdate != null) {
            this.this$0.fireUpdates(AbstractC37056f.m118958J(trackTrackMuteUpdate));
        }
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onTrackRemove(HMSTrack track) {
        AbstractC22676k.m65750j(track, "track");
        HMSLogger.m71136d("SDKDelegate", "onTrackRemove received :: " + track);
        this.this$0.fireUpdates(this.this$0.onTrackRemoveManager.manage(track));
    }

    @Override // live.hms.video.transport.ITransportObserver
    public void onWebSocketConnected(String url) {
        AbstractC22676k.m65750j(url, "url");
        ITransportListener iTransportListener = this.this$0.connectivityTestListener;
        if (iTransportListener != null) {
            iTransportListener.onWebSocketConnected(url);
        }
    }
}
