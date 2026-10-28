package live.hms.video.diagnostics;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.AudioTrack;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaStreamTrack;
import io.sentry.RunnableC20277c7;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.connection.stats.HMSLocalAudioStats;
import live.hms.video.connection.stats.HMSLocalVideoStats;
import live.hms.video.connection.stats.HMSRTCStatsReport;
import live.hms.video.connection.stats.HMSRemoteAudioStats;
import live.hms.video.connection.stats.HMSRemoteVideoStats;
import live.hms.video.connection.stats.HMSStatsObserver;
import live.hms.video.diagnostics.models.ConnectivityCheckResult;
import live.hms.video.diagnostics.models.ConnectivityState;
import live.hms.video.diagnostics.models.DiagnosticTokenResponse;
import live.hms.video.diagnostics.models.MediaServerReport;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.HMSUpdateListener;
import live.hms.video.sdk.SDKDelegate;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSMessage;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRemovedFromRoom;
import live.hms.video.sdk.models.HMSRoleChangeRequest;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSRoomUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.sdk.models.trackchangerequest.HMSChangeTrackStateRequest;
import live.hms.video.sdk.transcripts.HmsTranscripts;
import live.hms.video.sessionstore.HmsSessionStore;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001;\u0018\u0000 O2\u00020\u0001:\u0001OB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J)\u0010\u001d\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0010J\u001f\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010G\u001a\n\u0018\u00010Ej\u0004\u0018\u0001`F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, m65681d2 = {"Llive/hms/video/diagnostics/HMSDiagnostics;", "", "Llive/hms/video/sdk/SDKDelegate;", "delegate", "", "customerUserId", "<init>", "(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)V", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "cameraFacing", "Llive/hms/video/diagnostics/HMSCameraCheckListener;", "listener", "Ll83/a0;", "startCameraCheck", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;)V", "stopCameraCheck", "()V", "Landroid/content/Context;", "context", "Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;", "startMicCheck", "(Landroid/content/Context;Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;)V", "stopMicCheck", "startSpeakerCheck", "stopSpeakerCheck", "region", "Llive/hms/video/diagnostics/ConnectivityCheckListener;", "", "timeInMillis", "startConnectivityCheck", "(Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;J)V", "stopConnectivityCheck", "updateAverageCQSInResult", "setConnectivityCheckValues", "tearDownDiagnostic", "leaveConnectivityTestRoom", "addPendingCQSTillNow", "handleTestCompletion", "authToken", "joinConnectivityTestRoom", "(Ljava/lang/String;J)V", "Llive/hms/video/sdk/SDKDelegate;", "connectivityCheckListener", "Llive/hms/video/diagnostics/ConnectivityCheckListener;", "Llive/hms/video/diagnostics/models/ConnectivityCheckResult;", "result", "Llive/hms/video/diagnostics/models/ConnectivityCheckResult;", "Landroid/media/MediaRecorder;", "recorder", "Landroid/media/MediaRecorder;", "recordingPath", "Ljava/lang/String;", "lastNetworkQualityUpdatedAt", "J", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "live/hms/video/diagnostics/HMSDiagnostics$transportListener$1", "transportListener", "Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;", "Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "videoTrack", "Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "getVideoTrack", "()Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "setVideoTrack", "(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", "Ljava/lang/Runnable;", "Landroid/media/MediaPlayer;", "mp", "Landroid/media/MediaPlayer;", "", "isPreparing", "Z", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSDiagnostics {
    private static final String TAG = "HMSDiagnostic";
    private ConnectivityCheckListener connectivityCheckListener;
    private final SDKDelegate delegate;
    private final Handler handler;
    private boolean isPreparing;
    private long lastNetworkQualityUpdatedAt;
    private MediaPlayer mp;
    private MediaRecorder recorder;
    private String recordingPath;
    private ConnectivityCheckResult result;
    private Runnable runnable;
    private final HMSDiagnostics$transportListener$1 transportListener;
    private HMSLocalVideoTrack videoTrack;

    /* JADX INFO: renamed from: live.hms.video.diagnostics.HMSDiagnostics$joinConnectivityTestRoom$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.diagnostics.HMSDiagnostics$joinConnectivityTestRoom$1", m100430f = "HMSDiagnostics.kt", m100431l = {359}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241351 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSConfig $config;
        final /* synthetic */ long $timeInMillis;
        int label;

        /* JADX INFO: renamed from: live.hms.video.diagnostics.HMSDiagnostics$joinConnectivityTestRoom$1$1, reason: invalid class name */
        @Metadata(m65680d1 = {"\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%¨\u0006'"}, m65681d2 = {"live/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1", "Llive/hms/video/sdk/HMSUpdateListener;", "Llive/hms/video/sdk/models/HMSRoom;", "room", "Ll83/a0;", "onJoin", "(Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;", "type", "hmsRoom", "onRoomUpdate", "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V", "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;", "Llive/hms/video/sdk/models/HMSPeer;", "peer", "onPeerUpdate", "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/sdk/models/enums/HMSTrackUpdate;", "Llive/hms/video/media/tracks/HMSTrack;", "track", "onTrackUpdate", "(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/sdk/models/HMSRoleChangeRequest;", "request", "onRoleChangeRequest", "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V", "Llive/hms/video/sdk/models/HMSMessage;", "message", "onMessageReceived", "(Llive/hms/video/sdk/models/HMSMessage;)V", "Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;", "details", "onChangeTrackStateRequest", "(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V", "Llive/hms/video/error/HMSException;", "error", "onReconnecting", "(Llive/hms/video/error/HMSException;)V", "onError", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class AnonymousClass1 implements HMSUpdateListener {
            final /* synthetic */ long $timeInMillis;
            final /* synthetic */ HMSDiagnostics this$0;

            public AnonymousClass1(HMSDiagnostics hMSDiagnostics, long j7) {
                this.this$0 = hMSDiagnostics;
                this.$timeInMillis = j7;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void onJoin$lambda$0(HMSDiagnostics this$0) {
                AbstractC22676k.m65750j(this$0, "this$0");
                this$0.leaveConnectivityTestRoom();
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onChangeTrackStateRequest(HMSChangeTrackStateRequest details) {
                AbstractC22676k.m65750j(details, "details");
            }

            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSLogger.m71137e(HMSDiagnostics.TAG, "error :: " + error.getMessage());
                List<HMSException> errors = this.this$0.result.getErrors();
                AbstractC22676k.m65748h(errors, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.error.HMSException>");
                ((ArrayList) errors).add(error);
                if (error.getIsTerminal()) {
                    HMSLogger.m71137e(HMSDiagnostics.TAG, "Terminal error received. Completing the test");
                    this.this$0.handleTestCompletion();
                }
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onJoin(HMSRoom room) {
                AbstractC22676k.m65750j(room, "room");
                HMSLogger.m71136d(HMSDiagnostics.TAG, "Joined Diagnostic room");
                SDKDelegate sDKDelegate = this.this$0.delegate;
                final HMSDiagnostics hMSDiagnostics = this.this$0;
                sDKDelegate.addStatsObserver(new HMSStatsObserver() { // from class: live.hms.video.diagnostics.HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1
                    @Override // live.hms.video.connection.stats.HMSStatsObserver
                    public void onLocalAudioStats(HMSLocalAudioStats hMSLocalAudioStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
                        HMSStatsObserver.DefaultImpls.onLocalAudioStats(this, hMSLocalAudioStats, hMSTrack, hMSPeer);
                    }

                    @Override // live.hms.video.connection.stats.HMSStatsObserver
                    public void onLocalVideoStats(List<HMSLocalVideoStats> list, HMSTrack hMSTrack, HMSPeer hMSPeer) {
                        HMSStatsObserver.DefaultImpls.onLocalVideoStats(this, list, hMSTrack, hMSPeer);
                    }

                    @Override // live.hms.video.connection.stats.HMSStatsObserver
                    public void onRTCStats(HMSRTCStatsReport rtcStats) {
                        AbstractC22676k.m65750j(rtcStats, "rtcStats");
                        HMSLogger.m71136d("HMSDiagnostic", "Cumulative stats: " + rtcStats);
                        hMSDiagnostics.result.getMediaServerReport().setStats$lib_release(rtcStats);
                    }

                    @Override // live.hms.video.connection.stats.HMSStatsObserver
                    public void onRemoteAudioStats(HMSRemoteAudioStats hMSRemoteAudioStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
                        HMSStatsObserver.DefaultImpls.onRemoteAudioStats(this, hMSRemoteAudioStats, hMSTrack, hMSPeer);
                    }

                    @Override // live.hms.video.connection.stats.HMSStatsObserver
                    public void onRemoteVideoStats(HMSRemoteVideoStats hMSRemoteVideoStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
                        HMSStatsObserver.DefaultImpls.onRemoteVideoStats(this, hMSRemoteVideoStats, hMSTrack, hMSPeer);
                    }
                });
                this.this$0.getHandler().postDelayed(new RunnableC20277c7(this.this$0, 27), this.$timeInMillis);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onMessageReceived(HMSMessage message) {
                AbstractC22676k.m65750j(message, "message");
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onPeerUpdate(HMSPeerUpdate type, HMSPeer peer) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(peer, "peer");
            }

            @Override // live.hms.video.sdk.RequestPermissionInterface
            public void onPermissionsRequested(List<String> list) {
                HMSUpdateListener.DefaultImpls.onPermissionsRequested(this, list);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onReconnected() {
                HMSUpdateListener.DefaultImpls.onReconnected(this);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onReconnecting(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSLogger.m71137e(HMSDiagnostics.TAG, "onReconnecting");
                this.this$0.addPendingCQSTillNow();
                this.this$0.updateAverageCQSInResult();
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onRemovedFromRoom(HMSRemovedFromRoom hMSRemovedFromRoom) {
                HMSUpdateListener.DefaultImpls.onRemovedFromRoom(this, hMSRemovedFromRoom);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onRoleChangeRequest(HMSRoleChangeRequest request) {
                AbstractC22676k.m65750j(request, "request");
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onRoomUpdate(HMSRoomUpdate type, HMSRoom hmsRoom) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(hmsRoom, "hmsRoom");
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onSessionStoreAvailable(HmsSessionStore hmsSessionStore) {
                HMSUpdateListener.DefaultImpls.onSessionStoreAvailable(this, hmsSessionStore);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onTrackUpdate(HMSTrackUpdate type, HMSTrack track, HMSPeer peer) {
                AbstractC22676k.m65750j(type, "type");
                AbstractC22676k.m65750j(track, "track");
                AbstractC22676k.m65750j(peer, "peer");
                HMSLogger.m71136d(HMSDiagnostics.TAG, "onTrackUpdate :: " + type + " track :: " + track);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void onTranscripts(HmsTranscripts hmsTranscripts) {
                HMSUpdateListener.DefaultImpls.onTranscripts(this, hmsTranscripts);
            }

            @Override // live.hms.video.sdk.HMSUpdateListener
            public void peerListUpdated(ArrayList<HMSPeer> arrayList, ArrayList<HMSPeer> arrayList2) {
                HMSUpdateListener.DefaultImpls.peerListUpdated(this, arrayList, arrayList2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241351(HMSConfig hMSConfig, long j7, InterfaceC30057d<? super C241351> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$config = hMSConfig;
            this.$timeInMillis = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSDiagnostics.this.new C241351(this.$config, this.$timeInMillis, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241351) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SDKDelegate sDKDelegate = HMSDiagnostics.this.delegate;
                HMSConfig hMSConfig = this.$config;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HMSDiagnostics.this, this.$timeInMillis);
                this.label = 1;
                if (sDKDelegate.join(hMSConfig, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.diagnostics.HMSDiagnostics$leaveConnectivityTestRoom$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.diagnostics.HMSDiagnostics$leaveConnectivityTestRoom$1", m100430f = "HMSDiagnostics.kt", m100431l = {322}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241361 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C241361(InterfaceC30057d<? super C241361> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSDiagnostics.this.new C241361(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241361) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SDKDelegate sDKDelegate = HMSDiagnostics.this.delegate;
                this.label = 1;
                if (SDKDelegate.leave$default(sDKDelegate, false, this, 1, null) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            HMSLogger.m71136d(HMSDiagnostics.TAG, "Left diagnostic room");
            HMSDiagnostics.this.addPendingCQSTillNow();
            HMSDiagnostics.this.updateAverageCQSInResult();
            HMSDiagnostics.this.handleTestCompletion();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.diagnostics.HMSDiagnostics$startCameraCheck$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.diagnostics.HMSDiagnostics$startCameraCheck$1", m100430f = "HMSDiagnostics.kt", m100431l = {164}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241371 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSCameraCheckListener $listener;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241371(HMSCameraCheckListener hMSCameraCheckListener, InterfaceC30057d<? super C241371> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$listener = hMSCameraCheckListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSDiagnostics.this.new C241371(this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241371) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            HMSDiagnostics hMSDiagnostics;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HMSDiagnostics hMSDiagnostics2 = HMSDiagnostics.this;
                    SDKDelegate sDKDelegate = hMSDiagnostics2.delegate;
                    this.L$0 = hMSDiagnostics2;
                    this.label = 1;
                    Object localVideoTrack$default = SDKDelegate.getLocalVideoTrack$default(sDKDelegate, null, this, 1, null);
                    if (localVideoTrack$default == enumC31071a) {
                        return enumC31071a;
                    }
                    hMSDiagnostics = hMSDiagnostics2;
                    obj = localVideoTrack$default;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hMSDiagnostics = (HMSDiagnostics) this.L$0;
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                hMSDiagnostics.setVideoTrack((HMSLocalVideoTrack) obj);
                HMSLocalVideoTrack videoTrack = HMSDiagnostics.this.getVideoTrack();
                AbstractC22676k.m65748h(videoTrack, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                videoTrack.getCapturer().start();
                HMSCameraCheckListener hMSCameraCheckListener = this.$listener;
                HMSLocalVideoTrack videoTrack2 = HMSDiagnostics.this.getVideoTrack();
                AbstractC22676k.m65748h(videoTrack2, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSVideoTrack");
                hMSCameraCheckListener.onVideoTrack(videoTrack2);
                HMSDiagnostics.this.result.getDeviceTestReport().getVideoInputReport().setPassed(true);
            } catch (HMSException e5) {
                this.$listener.onError(e5);
                HMSDiagnostics.this.result.getDeviceTestReport().getVideoInputReport().setPassed(false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.diagnostics.HMSDiagnostics$startConnectivityCheck$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.diagnostics.HMSDiagnostics$startConnectivityCheck$1", m100430f = "HMSDiagnostics.kt", m100431l = {290}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241381 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $region;
        final /* synthetic */ long $timeInMillis;
        int label;
        final /* synthetic */ HMSDiagnostics this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241381(String str, HMSDiagnostics hMSDiagnostics, long j7, InterfaceC30057d<? super C241381> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$region = str;
            this.this$0 = hMSDiagnostics;
            this.$timeInMillis = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C241381(this.$region, this.this$0, this.$timeInMillis, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241381) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    DiagnosticTokenService diagnosticTokenService = DiagnosticTokenService.INSTANCE;
                    String str = this.$region;
                    this.label = 1;
                    obj = diagnosticTokenService.getDiagnosticRoomToken(str, null, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                String token = ((DiagnosticTokenResponse) obj).getToken();
                if (token != null) {
                    this.this$0.joinConnectivityTestRoom(token, this.$timeInMillis);
                }
            } catch (HMSException e5) {
                HMSLogger.m71137e(HMSDiagnostics.TAG, "Error in getting token from Diagnostic API :: " + e5.getMessage());
                List<HMSException> errors = this.this$0.result.getErrors();
                AbstractC22676k.m65748h(errors, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.error.HMSException>");
                ((ArrayList) errors).add(e5);
                this.this$0.handleTestCompletion();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [live.hms.video.diagnostics.HMSDiagnostics$transportListener$1] */
    public HMSDiagnostics(SDKDelegate delegate, String str) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.delegate = delegate;
        this.result = new ConnectivityCheckResult();
        delegate.startAudioManager$lib_release();
        this.handler = new Handler(Looper.getMainLooper());
        this.transportListener = new ITransportListener() { // from class: live.hms.video.diagnostics.HMSDiagnostics$transportListener$1
            @Override // live.hms.video.diagnostics.ITransportListener
            public void onCompleted() {
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onICEConnected(boolean isPublish) {
                HMSLogger.m71136d("HMSDiagnostic", "onICEConnected , isPublish :: " + isPublish);
                if (isPublish) {
                    this.this$0.result.getMediaServerReport().setPublishICEConnected$lib_release(true);
                    this.this$0.result.setPublishICEConnected$lib_release(true);
                    if (this.this$0.result.getIsSubscribeICEConnected()) {
                        ConnectivityCheckResult connectivityCheckResult = this.this$0.result;
                        ConnectivityState connectivityState = ConnectivityState.ICE_ESTABLISHED;
                        connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
                        ConnectivityCheckListener connectivityCheckListener = this.this$0.connectivityCheckListener;
                        if (connectivityCheckListener != null) {
                            connectivityCheckListener.onConnectivityStateChanged(connectivityState);
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.this$0.result.getMediaServerReport().setSubcribeICEConnected$lib_release(true);
                this.this$0.result.setSubscribeICEConnected$lib_release(true);
                if (this.this$0.result.getIsPublishICEConnected()) {
                    ConnectivityCheckResult connectivityCheckResult2 = this.this$0.result;
                    ConnectivityState connectivityState2 = ConnectivityState.ICE_ESTABLISHED;
                    connectivityCheckResult2.setConnectivityState$lib_release(connectivityState2);
                    ConnectivityCheckListener connectivityCheckListener2 = this.this$0.connectivityCheckListener;
                    if (connectivityCheckListener2 != null) {
                        connectivityCheckListener2.onConnectivityStateChanged(connectivityState2);
                    }
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onIceCandidate(IceCandidate candidate, boolean isPublish) {
                AbstractC22676k.m65750j(candidate, "candidate");
                if (isPublish) {
                    List<IceCandidate> publishIceCandidatesGathered = this.this$0.result.getMediaServerReport().getPublishIceCandidatesGathered();
                    AbstractC22676k.m65748h(publishIceCandidatesGathered, "null cannot be cast to non-null type java.util.ArrayList<hms.webrtc.IceCandidate>");
                    ((ArrayList) publishIceCandidatesGathered).add(candidate);
                } else {
                    List<IceCandidate> subscribeIceCandidatesGathered = this.this$0.result.getMediaServerReport().getSubscribeIceCandidatesGathered();
                    AbstractC22676k.m65748h(subscribeIceCandidatesGathered, "null cannot be cast to non-null type java.util.ArrayList<hms.webrtc.IceCandidate>");
                    ((ArrayList) subscribeIceCandidatesGathered).add(candidate);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onInitFetched() {
                HMSLogger.m71136d("HMSDiagnostic", "onInitFetched");
                this.this$0.result.getSignallingReport().setInitConnected$lib_release(true);
                ConnectivityCheckResult connectivityCheckResult = this.this$0.result;
                ConnectivityState connectivityState = ConnectivityState.INIT_FETCHED;
                connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
                ConnectivityCheckListener connectivityCheckListener = this.this$0.connectivityCheckListener;
                if (connectivityCheckListener != null) {
                    connectivityCheckListener.onConnectivityStateChanged(connectivityState);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onMediaCaptured() {
                ConnectivityCheckResult connectivityCheckResult = this.this$0.result;
                ConnectivityState connectivityState = ConnectivityState.MEDIA_CAPTURED;
                connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
                ConnectivityCheckListener connectivityCheckListener = this.this$0.connectivityCheckListener;
                if (connectivityCheckListener != null) {
                    connectivityCheckListener.onConnectivityStateChanged(connectivityState);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onMediaPublished() {
                ConnectivityCheckResult connectivityCheckResult = this.this$0.result;
                ConnectivityState connectivityState = ConnectivityState.MEDIA_PUBLISHED;
                connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
                ConnectivityCheckListener connectivityCheckListener = this.this$0.connectivityCheckListener;
                if (connectivityCheckListener != null) {
                    connectivityCheckListener.onConnectivityStateChanged(connectivityState);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onNetworkQuality(int quality) {
                if (quality < 0) {
                    return;
                }
                if (this.this$0.result.getNetworkQualityValues$lib_release().size() == 0) {
                    this.this$0.result.getNetworkQualityValues$lib_release().add(Float.valueOf(quality));
                    this.this$0.lastNetworkQualityUpdatedAt = System.currentTimeMillis();
                } else {
                    this.this$0.addPendingCQSTillNow();
                    this.this$0.result.getNetworkQualityValues$lib_release().add(Float.valueOf(quality));
                }
                this.this$0.updateAverageCQSInResult();
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onRTCTrackAdded(HMSTrack track) {
                AbstractC22676k.m65750j(track, "track");
                if (track instanceof HMSRemoteAudioTrack) {
                    HMSLogger.m71136d("HMSDiagnostic", "Setting volume of remote track to 0");
                    MediaStreamTrack nativeTrack = track.getNativeTrack();
                    AbstractC22676k.m65748h(nativeTrack, "null cannot be cast to non-null type hms.webrtc.AudioTrack");
                    ((AudioTrack) nativeTrack).setVolume(0.0d);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event, boolean isPublish) {
                if (isPublish) {
                    this.this$0.result.getMediaServerReport().getPublishICECandidatePairSelected().setLocal$lib_release(event != null ? event.local : null);
                    this.this$0.result.getMediaServerReport().getPublishICECandidatePairSelected().setRemote$lib_release(event != null ? event.remote : null);
                } else {
                    this.this$0.result.getMediaServerReport().getSubscribeICECandidatePairSelected().setLocal$lib_release(event != null ? event.local : null);
                    this.this$0.result.getMediaServerReport().getSubscribeICECandidatePairSelected().setRemote$lib_release(event != null ? event.remote : null);
                }
            }

            @Override // live.hms.video.diagnostics.ITransportListener
            public void onWebSocketConnected(String websocketUrl) {
                AbstractC22676k.m65750j(websocketUrl, "websocketUrl");
                HMSLogger.m71136d("HMSDiagnostic", "onWebSocketConnected");
                ConnectivityCheckListener connectivityCheckListener = this.this$0.connectivityCheckListener;
                if (connectivityCheckListener != null) {
                    connectivityCheckListener.onConnectivityStateChanged(ConnectivityState.SIGNAL_CONNECTED);
                }
                this.this$0.result.setConnectivityState$lib_release(ConnectivityState.SIGNAL_CONNECTED);
                this.this$0.result.getSignallingReport().setConnected$lib_release(true);
                this.this$0.result.getSignallingReport().setWebsocketUrl$lib_release(websocketUrl);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addPendingCQSTillNow() {
        if (this.result.getNetworkQualityValues$lib_release().size() > 0) {
            for (long jCurrentTimeMillis = (System.currentTimeMillis() - this.lastNetworkQualityUpdatedAt) / ((long) 1000); jCurrentTimeMillis > 0; jCurrentTimeMillis--) {
                this.result.getNetworkQualityValues$lib_release().add(AbstractC25265s.m74112P0(this.result.getNetworkQualityValues$lib_release()));
            }
            this.lastNetworkQualityUpdatedAt = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTestCompletion() {
        ConnectivityCheckResult connectivityCheckResult = this.result;
        ConnectivityState connectivityState = ConnectivityState.COMPLETED;
        connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
        ConnectivityCheckListener connectivityCheckListener = this.connectivityCheckListener;
        if (connectivityCheckListener != null) {
            connectivityCheckListener.onConnectivityStateChanged(connectivityState);
        }
        ConnectivityCheckListener connectivityCheckListener2 = this.connectivityCheckListener;
        if (connectivityCheckListener2 != null) {
            connectivityCheckListener2.onCompleted(this.result);
        }
        tearDownDiagnostic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void joinConnectivityTestRoom(String authToken, long timeInMillis) {
        this.delegate.addDiagnosticListener(this.transportListener);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241351(new HMSConfig("diagnostic-test", authToken, null, false, null, 28, null), timeInMillis, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void leaveConnectivityTestRoom() {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241361(null), 3);
    }

    private final void setConnectivityCheckValues() {
        ConnectivityCheckResult connectivityCheckResult = new ConnectivityCheckResult();
        this.result = connectivityCheckResult;
        ConnectivityState connectivityState = ConnectivityState.STARTING;
        connectivityCheckResult.setConnectivityState$lib_release(connectivityState);
        ConnectivityCheckListener connectivityCheckListener = this.connectivityCheckListener;
        if (connectivityCheckListener != null) {
            connectivityCheckListener.onConnectivityStateChanged(connectivityState);
        }
        this.result.setTestTimestamp$lib_release(Long.valueOf(System.currentTimeMillis()));
    }

    public static /* synthetic */ void startCameraCheck$default(HMSDiagnostics hMSDiagnostics, HMSVideoTrackSettings.CameraFacing cameraFacing, HMSCameraCheckListener hMSCameraCheckListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cameraFacing = HMSVideoTrackSettings.CameraFacing.FRONT;
        }
        hMSDiagnostics.startCameraCheck(cameraFacing, hMSCameraCheckListener);
    }

    public static /* synthetic */ void startConnectivityCheck$default(HMSDiagnostics hMSDiagnostics, String str, ConnectivityCheckListener connectivityCheckListener, long j7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j7 = 20000;
        }
        hMSDiagnostics.startConnectivityCheck(str, connectivityCheckListener, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startSpeakerCheck$lambda$3(HMSDiagnostics this$0, MediaPlayer mediaPlayer) {
        AbstractC22676k.m65750j(this$0, "this$0");
        mediaPlayer.start();
        this$0.isPreparing = false;
    }

    private final void tearDownDiagnostic() {
        this.handler.removeCallbacksAndMessages(null);
        this.connectivityCheckListener = null;
        this.result = new ConnectivityCheckResult();
        this.lastNetworkQualityUpdatedAt = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAverageCQSInResult() {
        if (this.result.getNetworkQualityValues$lib_release().isEmpty()) {
            return;
        }
        MediaServerReport mediaServerReport = this.result.getMediaServerReport();
        List<Float> networkQualityValues$lib_release = this.result.getNetworkQualityValues$lib_release();
        AbstractC22676k.m65750j(networkQualityValues$lib_release, "<this>");
        Iterator<T> it = networkQualityValues$lib_release.iterator();
        double dFloatValue = 0.0d;
        int i13 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i13++;
            if (i13 < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        mediaServerReport.setConnectionQualityScore$lib_release(Float.valueOf((float) (i13 == 0 ? Double.NaN : dFloatValue / ((double) i13))));
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final HMSLocalVideoTrack getVideoTrack() {
        return this.videoTrack;
    }

    public final void setVideoTrack(HMSLocalVideoTrack hMSLocalVideoTrack) {
        this.videoTrack = hMSLocalVideoTrack;
    }

    public final void startCameraCheck(HMSVideoTrackSettings.CameraFacing cameraFacing, HMSCameraCheckListener listener) {
        AbstractC22676k.m65750j(cameraFacing, "cameraFacing");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241371(listener, null), 3);
    }

    public final void startConnectivityCheck(String region, ConnectivityCheckListener listener, long timeInMillis) {
        AbstractC22676k.m65750j(listener, "listener");
        HMSLogger.m71136d(TAG, "startConnectivityCheck called");
        this.connectivityCheckListener = listener;
        setConnectivityCheckValues();
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241381(region, this, timeInMillis, null), 3);
    }

    public final void startMicCheck(Context context, final HMSAudioDeviceCheckListener listener) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(listener, "listener");
        this.recorder = new MediaRecorder();
        this.runnable = new Runnable() { // from class: live.hms.video.diagnostics.HMSDiagnostics$startMicCheck$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    MediaRecorder mediaRecorder = this.this$0.recorder;
                    listener.onAudioLevelChanged((mediaRecorder != null ? Float.valueOf(mediaRecorder.getMaxAmplitude()) : 0).intValue());
                    Runnable runnable = this.this$0.runnable;
                    if (runnable != null) {
                        this.this$0.getHandler().postDelayed(runnable, 10L);
                    }
                } catch (IllegalStateException unused) {
                }
            }
        };
        try {
            MediaRecorder mediaRecorder = this.recorder;
            if (mediaRecorder != null) {
                mediaRecorder.setAudioSource(1);
            }
            Runnable runnable = this.runnable;
            if (runnable != null) {
                this.handler.postDelayed(runnable, 10L);
            }
            MediaRecorder mediaRecorder2 = this.recorder;
            if (mediaRecorder2 != null) {
                mediaRecorder2.setOutputFormat(0);
            }
            MediaRecorder mediaRecorder3 = this.recorder;
            if (mediaRecorder3 != null) {
                mediaRecorder3.setAudioEncoder(0);
            }
            String absolutePath = new File(context.getCacheDir(), "MediaUtil#micAvailTestFile").getAbsolutePath();
            this.recordingPath = absolutePath;
            MediaRecorder mediaRecorder4 = this.recorder;
            if (mediaRecorder4 != null) {
                mediaRecorder4.setOutputFile(absolutePath);
            }
            MediaRecorder mediaRecorder5 = this.recorder;
            if (mediaRecorder5 != null) {
                mediaRecorder5.prepare();
            }
            MediaRecorder mediaRecorder6 = this.recorder;
            if (mediaRecorder6 != null) {
                mediaRecorder6.start();
            }
            listener.onSuccess();
            this.result.getDeviceTestReport().getAudioInputReport().setPassed(true);
        } catch (Exception e5) {
            String message = e5.getMessage();
            String message2 = (message == null || message.length() == 0) ? "Exception in starting mic" : e5.getMessage();
            ErrorFactory.TracksErrors tracksErrors = ErrorFactory.TracksErrors.INSTANCE;
            ErrorFactory.Action action = ErrorFactory.Action.TRACK;
            AbstractC22676k.m65747g(message2);
            listener.onError(ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(tracksErrors, action, "microphone", message2, false, null, null, 48, null));
            this.result.getDeviceTestReport().getAudioInputReport().setPassed(false);
        }
    }

    public final void startSpeakerCheck() {
        MediaPlayer mediaPlayer = this.mp;
        if ((mediaPlayer == null || !mediaPlayer.isPlaying()) && !this.isPreparing) {
            try {
                this.mp = new MediaPlayer();
                this.isPreparing = true;
                String str = this.recordingPath;
                if (str == null || str.length() == 0) {
                    MediaPlayer mediaPlayer2 = this.mp;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.setDataSource("https://100ms.live/test-audio.wav");
                    }
                } else {
                    MediaPlayer mediaPlayer3 = this.mp;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.setDataSource(this.recordingPath);
                    }
                }
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    mediaPlayer4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: live.hms.video.diagnostics.a
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer5) {
                            HMSDiagnostics.startSpeakerCheck$lambda$3(this.f95201w, mediaPlayer5);
                        }
                    });
                }
                MediaPlayer mediaPlayer5 = this.mp;
                if (mediaPlayer5 != null) {
                    mediaPlayer5.prepareAsync();
                }
                this.result.getDeviceTestReport().getAudioOutputReport().setPassed(true);
            } catch (IOException e5) {
                HMSLogger.m71137e(TAG, " error while playing :" + e5.getMessage());
                this.result.getDeviceTestReport().getAudioOutputReport().setPassed(false);
            }
        }
    }

    public final void stopCameraCheck() {
        HMSLocalVideoTrack hMSLocalVideoTrack = this.videoTrack;
        if (hMSLocalVideoTrack != null) {
            hMSLocalVideoTrack.stopCapturing$lib_release();
        }
    }

    public final void stopConnectivityCheck() {
        HMSLogger.m71136d(TAG, "stopConnectivityCheck called");
        leaveConnectivityTestRoom();
    }

    public final void stopMicCheck() {
        this.handler.removeCallbacksAndMessages(null);
        MediaRecorder mediaRecorder = this.recorder;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
        }
        MediaRecorder mediaRecorder2 = this.recorder;
        if (mediaRecorder2 != null) {
            mediaRecorder2.release();
        }
    }

    public final void stopSpeakerCheck() {
        try {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
        } catch (IllegalStateException unused) {
        }
    }
}
