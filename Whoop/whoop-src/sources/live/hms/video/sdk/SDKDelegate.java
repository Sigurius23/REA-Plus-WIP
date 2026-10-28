package live.hms.video.sdk;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3060t1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.google.gson.JsonElement;
import com.mapbox.maps.MapboxMap;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13065m2;
import ec3.C13078q1;
import ec3.C13100y;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13087t1;
import hc3.AbstractC17182o;
import hms.webrtc.Size;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.audio.BluetoothPermissionHandler;
import live.hms.video.audio.HMSAudioDeviceInfo;
import live.hms.video.audio.HMSAudioManager;
import live.hms.video.audio.HMSAudioManagerLegacy;
import live.hms.video.audio.manager.HMSAudioManagerApi31;
import live.hms.video.connection.degredation.WebRtcStatsMonitor;
import live.hms.video.connection.stats.HMSStatsObserver;
import live.hms.video.connection.stats.quality.HMSNetworkObserver;
import live.hms.video.connection.subscribe.RemoteTrackFactory;
import live.hms.video.diagnostics.ITransportListener;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.factories.noisecancellation.AvailabilityStatus;
import live.hms.video.factories.noisecancellation.NoiseCancellationStatusChecker;
import live.hms.video.interactivity.HmsInteractivityCenter;
import live.hms.video.media.capturers.HMSCameraCapturer;
import live.hms.video.media.capturers.HMSCapturer;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSLogSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.streams.HMSStreamFactory;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSRemoteAudioTrack;
import live.hms.video.media.tracks.HMSRemoteVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackSource;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.media.tracks.HMSVideoTrack;
import live.hms.video.network.HMSNetworkManager;
import live.hms.video.network.HMSNetworkManagerApi31;
import live.hms.video.network.HMSNetworkManagerLegacy;
import live.hms.video.plugin.video.HMSVideoPlugin;
import live.hms.video.polls.HMSPollResponseBuilder;
import live.hms.video.polls.models.HmsPollState;
import live.hms.video.polls.models.answer.PollAnswerResponse;
import live.hms.video.polls.network.HmsPollResultsManager;
import live.hms.video.polls.network.HmsPollsStartManager;
import live.hms.video.polls.network.PollCreateResponse;
import live.hms.video.polls.network.PollGetResponsesReply;
import live.hms.video.polls.network.PollLeaderboardResponse;
import live.hms.video.polls.network.PollListResponse;
import live.hms.video.polls.network.PollResultsResponse;
import live.hms.video.polls.network.QuestionContainer;
import live.hms.video.polls.network.SetQuestionsResponse;
import live.hms.video.sdk.featureflags.FeatureFlags;
import live.hms.video.sdk.featureflags.Features;
import live.hms.video.sdk.managers.ActiveSpeakerManager;
import live.hms.video.sdk.managers.BroadcastManager;
import live.hms.video.sdk.managers.HLSUpdateManager;
import live.hms.video.sdk.managers.InitialPeerListManager;
import live.hms.video.sdk.managers.OnPeerJoinManager;
import live.hms.video.sdk.managers.OnPeerLeaveManager;
import live.hms.video.sdk.managers.OnPeerNetworkUpdateManager;
import live.hms.video.sdk.managers.OnPeerRemovedManager;
import live.hms.video.sdk.managers.OnPeerUpdateManager;
import live.hms.video.sdk.managers.OnPolicyChangeManager;
import live.hms.video.sdk.managers.OnRoleChangeRequestManager;
import live.hms.video.sdk.managers.OnTrackAddManager;
import live.hms.video.sdk.managers.OnTrackRemoveManager;
import live.hms.video.sdk.managers.OnTrackUpdateManager;
import live.hms.video.sdk.managers.OnTranscriptionManager;
import live.hms.video.sdk.managers.OnTranscriptionStateManager;
import live.hms.video.sdk.managers.ReconnectPeerListManager;
import live.hms.video.sdk.managers.RecordingUpdateManager;
import live.hms.video.sdk.managers.RoomInfoManager;
import live.hms.video.sdk.managers.RtmpUpdateManager;
import live.hms.video.sdk.managers.SessionInfoManager;
import live.hms.video.sdk.managers.TrackUpdateRequestedManager;
import live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager;
import live.hms.video.sdk.managers.local.muteonphonecall.helpers.HmsAudioMangerFlowHelperKt;
import live.hms.video.sdk.models.EVENT_TYPE;
import live.hms.video.sdk.models.FindPeerResponse;
import live.hms.video.sdk.models.FrameworkInfo;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSHLSConfig;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSMessage;
import live.hms.video.sdk.models.HMSMessageRecipient;
import live.hms.video.sdk.models.HMSMessageSendResponse;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSPeerType;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.HMSRemotePeer;
import live.hms.video.sdk.models.HMSRemovedFromRoom;
import live.hms.video.sdk.models.HMSRoleChangeRequest;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.LastTrackState;
import live.hms.video.sdk.models.PeerListIterator;
import live.hms.video.sdk.models.PeerListIteratorOptions;
import live.hms.video.sdk.models.PeerNameSearchResponse;
import live.hms.video.sdk.models.PeerSearchResponse;
import live.hms.video.sdk.models.PerformanceMeasurement;
import live.hms.video.sdk.models.SDKUpdate;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import live.hms.video.sdk.models.enums.HMSMessageRecipientType;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.sdk.models.enums.HMSTrackUpdate;
import live.hms.video.sdk.models.enums.RetrySchedulerState;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.PublishParams;
import live.hms.video.sdk.models.trackchangerequest.HMSChangeTrackStateRequest;
import live.hms.video.sdk.transcripts.HmsTranscripts;
import live.hms.video.sessionstore.HmsSessionStore;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.sessionstore.SessionStoreUpdateManager;
import live.hms.video.sessionstore.SetMetadataListenerResult;
import live.hms.video.sessionstore.SetSessionMetadataResult;
import live.hms.video.signal.init.C24287VB;
import live.hms.video.signal.init.HMSLayoutListener;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.InitConfig;
import live.hms.video.signal.init.LayoutRequestOptions;
import live.hms.video.signal.init.ServerConfiguration;
import live.hms.video.signal.init.Stats;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.signal.init.TokenRequestOptions;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.transport.HMSTransport;
import live.hms.video.transport.ITransport;
import live.hms.video.transport.IsQaLink;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSAgentOs;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import live.hms.video.utils.LogUtils;
import live.hms.video.utils.MicrophoneUtils;
import live.hms.video.whiteboard.HMSWhiteboardPermissions;
import live.hms.video.whiteboard.network.HMSCreateWhiteBoardResponse;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import m83.AbstractC25265s;
import m83.C25271y;
import org.joda.time.DateTimeConstants;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22691v;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000¸\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0086\u0003\b\u0000\u0018\u0000 ¾\u00042\u00020\u0001:\u0002¾\u0004BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010\u001dJ\u0015\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010&J\u0015\u0010+\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020)¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020)03¢\u0006\u0004\b4\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020603¢\u0006\u0004\b7\u00105J \u0010<\u001a\u00020\u00192\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0086@¢\u0006\u0004\b<\u0010=J\u001e\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>H\u0086@¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0019¢\u0006\u0004\bC\u0010DJ \u0010I\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0086@¢\u0006\u0004\bI\u0010JJ \u0010M\u001a\u00020\u00192\u0006\u0010F\u001a\u00020E2\u0006\u0010L\u001a\u00020KH\u0086@¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020\u0019H\u0000¢\u0006\u0004\bO\u0010DJ3\u0010U\u001a\u00020\u00192\f\u0010Q\u001a\b\u0012\u0004\u0012\u000208032\u0006\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0004\bU\u0010VJ-\u0010Y\u001a\u00020\u00192\u0006\u0010X\u001a\u00020W2\u0006\u0010R\u001a\u0002082\u0006\u0010S\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0004\bY\u0010ZJ\u001d\u0010]\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020[2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0004\b]\u0010^J\u001a\u0010`\u001a\u00020\u00192\b\b\u0002\u0010_\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b`\u0010aJ%\u0010f\u001a\u00020\u00192\u0006\u0010c\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\u0019¢\u0006\u0004\bh\u0010DJ%\u0010i\u001a\u00020\u00192\u0006\u0010c\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bi\u0010gJ\u001d\u0010j\u001a\u00020\u00192\u0006\u0010c\u001a\u00020b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010l¢\u0006\u0004\bm\u0010nJ%\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020o2\u0006\u0010s\u001a\u00020r¢\u0006\u0004\bt\u0010uJ-\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020o2\u0006\u0010v\u001a\u00020W2\u0006\u0010s\u001a\u00020r¢\u0006\u0004\bt\u0010wJ3\u0010t\u001a\u00020\u00192\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020o2\f\u0010x\u001a\b\u0012\u0004\u0012\u000208032\u0006\u0010s\u001a\u00020r¢\u0006\u0004\bt\u0010yJ\u001d\u0010|\u001a\u00020\u00192\u0006\u0010{\u001a\u00020z2\u0006\u0010s\u001a\u00020r¢\u0006\u0004\b|\u0010}J)\u0010\u0081\u0001\u001a\u00020\u00192\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020o2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J*\u0010\u0084\u0001\u001a\u00020\u00192\u0007\u0010\u0080\u0001\u001a\u00020o2\u0007\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0088\u0001\u001a\u00020\u00192\u0007\u0010\u0086\u0001\u001a\u00020@2\u0007\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001JH\u0010\u0088\u0001\u001a\u00020\u00192\u0007\u0010\u0087\u0001\u001a\u00020\u000e2\t\u0010p\u001a\u0005\u0018\u00010\u008a\u00012\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010o2\u000f\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020o\u0018\u0001032\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0088\u0001\u0010\u008d\u0001J!\u0010\u008f\u0001\u001a\u00020\u00192\u0007\u0010F\u001a\u00030\u008e\u00012\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J#\u0010\u0092\u0001\u001a\u00020\u00192\t\u0010F\u001a\u0005\u0018\u00010\u0091\u00012\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J#\u0010\u0094\u0001\u001a\u00020\u00192\t\u0010F\u001a\u0005\u0018\u00010\u0091\u00012\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0017\u0010\u0095\u0001\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0005\b\u0095\u0001\u0010\u001dJ!\u0010\u0097\u0001\u001a\u00020\u00192\u0007\u0010\u0096\u0001\u001a\u00020o2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J!\u0010\u009a\u0001\u001a\u00020\u00192\u0007\u0010\u0099\u0001\u001a\u00020o2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\b\u009a\u0001\u0010\u0098\u0001J\"\u0010\u009d\u0001\u001a\u00020\u00192\u0007\u0010\u009b\u0001\u001a\u00020\u00132\u0007\u0010\u009c\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J!\u0010\u009f\u0001\u001a\u00020\u00192\u0006\u0010X\u001a\u00020W2\u0007\u0010\u009b\u0001\u001a\u00020\u0013¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001f\u0010¤\u0001\u001a\u00030£\u00012\f\b\u0002\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J'\u0010§\u0001\u001a\u00020\u00192\n\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00012\u0007\u0010H\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J-\u0010«\u0001\u001a\u00020\u00192\u0007\u0010©\u0001\u001a\u00020o2\u0007\u0010ª\u0001\u001a\u00020d2\u0007\u0010H\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J4\u0010±\u0001\u001a\u0014\u0012\u0004\u0012\u00020W0¯\u0001j\t\u0012\u0004\u0012\u00020W`°\u00012\u000e\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u000103H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001a\u0010µ\u0001\u001a\u00020\u00192\b\u0010´\u0001\u001a\u00030³\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001a\u0010¸\u0001\u001a\u00020\u00192\b\u0010´\u0001\u001a\u00030·\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u0019¢\u0006\u0005\bº\u0001\u0010DJ\u0018\u0010»\u0001\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0019\u0010¾\u0001\u001a\u00020\u00192\u0007\u0010½\u0001\u001a\u00020d¢\u0006\u0006\b¾\u0001\u0010¿\u0001J(\u0010Â\u0001\u001a\u00020\u00192\u000e\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u0001032\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J0\u0010Ê\u0001\u001a\u00020\u00192\b\u0010Å\u0001\u001a\u00030Ä\u00012\n\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\b\u0010É\u0001\u001a\u00030È\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001a\u0010Î\u0001\u001a\u00020\u000e2\b\u0010Í\u0001\u001a\u00030Ì\u0001¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0011\u0010Ô\u0001\u001a\u00030Ó\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u000f\u0010Ö\u0001\u001a\u00020\u0019¢\u0006\u0005\bÖ\u0001\u0010DJ/\u0010Ü\u0001\u001a\u00020\u00192\u0007\u0010×\u0001\u001a\u00020o2\n\u0010Ù\u0001\u001a\u0005\u0018\u00010Ø\u00012\b\u0010Û\u0001\u001a\u00030Ú\u0001¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J!\u0010ß\u0001\u001a\u00020\u00192\u0007\u0010Þ\u0001\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0010\u0010á\u0001\u001a\u00020\u000e¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0011\u0010ä\u0001\u001a\u00030ã\u0001¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0019\u0010ç\u0001\u001a\u00020\u00192\u0007\u0010H\u001a\u00030æ\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\"\u0010é\u0001\u001a\u00020\u00192\b\u0010Í\u0001\u001a\u00030Ì\u00012\u0006\u0010H\u001a\u00020\u0013¢\u0006\u0006\bé\u0001\u0010ê\u0001J\"\u0010ë\u0001\u001a\u00020\u00192\b\u0010Í\u0001\u001a\u00030Ì\u00012\u0006\u0010H\u001a\u00020\u0013¢\u0006\u0006\bë\u0001\u0010ê\u0001J<\u0010ñ\u0001\u001a\u00020\u00192\u0007\u0010ì\u0001\u001a\u00020o2\u0007\u0010ª\u0001\u001a\u00020d2\b\u0010î\u0001\u001a\u00030í\u00012\u000e\u0010H\u001a\n\u0012\u0005\u0012\u00030ð\u00010ï\u0001¢\u0006\u0006\bñ\u0001\u0010ò\u0001J#\u0010ô\u0001\u001a\u00020\u00192\t\b\u0001\u0010ó\u0001\u001a\u00020d2\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u0017\u0010ö\u0001\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u0013¢\u0006\u0005\bö\u0001\u0010\u001dJ0\u0010ù\u0001\u001a\u00020\u00192\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010¯\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`°\u0001H\u0082@¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u0011\u0010û\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\bû\u0001\u0010DJ\u001c\u0010þ\u0001\u001a\u00020\u000e2\b\u0010ý\u0001\u001a\u00030ü\u0001H\u0002¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\"\u0010\u0080\u0002\u001a\u00020\u00192\u000e\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u000103H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0013\u0010\u0082\u0002\u001a\u00020\u0019H\u0082@¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J#\u0010\u0084\u0002\u001a\u00020\u00192\u000e\u0010ø\u0001\u001a\t\u0012\u0005\u0012\u00030÷\u000103H\u0082@¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u0011\u0010\u0086\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0086\u0002\u0010DJ\u001b\u0010\u0088\u0002\u001a\u00020\u00192\u0007\u0010\u0087\u0002\u001a\u00020\u000eH\u0082@¢\u0006\u0005\b\u0088\u0002\u0010aJC\u0010\u0089\u0002\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010¯\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`°\u00012\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010¯\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`°\u0001H\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J/\u0010\u008b\u0002\u001a\u00020\u00192\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010¯\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`°\u0001H\u0002¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J/\u0010\u008d\u0002\u001a\u00020\u00192\u001b\u0010ø\u0001\u001a\u0016\u0012\u0005\u0012\u00030÷\u00010¯\u0001j\n\u0012\u0005\u0012\u00030÷\u0001`°\u0001H\u0002¢\u0006\u0006\b\u008d\u0002\u0010\u008c\u0002J(\u0010\u0091\u0002\u001a\u00020\u00192\b\u0010\u008f\u0002\u001a\u00030\u008e\u00022\t\b\u0002\u0010\u0090\u0002\u001a\u00020\u000eH\u0082@¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J\u001b\u0010\u0094\u0002\u001a\u00020\u00192\u0007\u0010\u0093\u0002\u001a\u00020\u000eH\u0082@¢\u0006\u0005\b\u0094\u0002\u0010aJ&\u0010\u0095\u0002\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u0001082\u0007\u0010\u0093\u0002\u001a\u00020\u000eH\u0082@¢\u0006\u0006\b\u0095\u0002\u0010\u0096\u0002J\u001e\u0010\u0098\u0002\u001a\u00020\u000e2\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u008e\u0002H\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J%\u0010\u009b\u0002\u001a\u00020\u00192\u0007\u0010\u009a\u0002\u001a\u0002082\u0007\u0010\u0093\u0002\u001a\u00020\u000eH\u0082@¢\u0006\u0006\b\u009b\u0002\u0010\u0096\u0002J\u001e\u0010\u009c\u0002\u001a\u00020\u00192\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u008e\u0002H\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J\u0011\u0010\u009e\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009e\u0002\u0010DJ\u001c\u0010¡\u0002\u001a\u00020\u00192\b\u0010 \u0002\u001a\u00030\u009f\u0002H\u0002¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u0011\u0010£\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b£\u0002\u0010DJ\u0011\u0010¤\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¤\u0002\u0010DJ\u0011\u0010¥\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¥\u0002\u0010DJ\u0012\u0010¦\u0002\u001a\u00020\u000eH\u0002¢\u0006\u0006\b¦\u0002\u0010â\u0001J\u001d\u0010¨\u0002\u001a\u0004\u0018\u00010W2\u0007\u0010§\u0002\u001a\u00020oH\u0002¢\u0006\u0006\b¨\u0002\u0010©\u0002J\u0011\u0010ª\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\bª\u0002\u0010DJ\u001c\u0010¬\u0002\u001a\u00020\u00192\u0007\u0010«\u0002\u001a\u00020#H\u0082@¢\u0006\u0006\b¬\u0002\u0010\u00ad\u0002J\u001d\u0010®\u0002\u001a\u00020\u00192\b\u0010\u008f\u0002\u001a\u00030\u008e\u0002H\u0082@¢\u0006\u0006\b®\u0002\u0010¯\u0002J$\u0010±\u0002\u001a\u00020\u00192\u0007\u0010°\u0002\u001a\u00020@2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0006\b±\u0002\u0010²\u0002J\u0011\u0010³\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b³\u0002\u0010DJ\u001a\u0010´\u0002\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u000eH\u0082@¢\u0006\u0005\b´\u0002\u0010aJ\u0011\u0010µ\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\bµ\u0002\u0010DJ\u0011\u0010¶\u0002\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¶\u0002\u0010DJ(\u0010¹\u0002\u001a\u00020d2\u0014\u0010F\u001a\u0010\u0012\u0005\u0012\u00030¸\u0002\u0012\u0004\u0012\u00020d0·\u0002H\u0002¢\u0006\u0006\b¹\u0002\u0010º\u0002J\u001d\u0010½\u0002\u001a\u00030¼\u00022\u0007\u0010»\u0002\u001a\u00020oH\u0082@¢\u0006\u0006\b½\u0002\u0010¾\u0002J:\u0010Â\u0002\u001a\u00030¼\u00022\u0007\u0010»\u0002\u001a\u00020o2\t\b\u0002\u0010¿\u0002\u001a\u00020d2\u0010\b\u0002\u0010Á\u0002\u001a\t\u0012\u0005\u0012\u00030À\u000203H\u0082P¢\u0006\u0006\bÂ\u0002\u0010Ã\u0002J(\u0010Å\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u009f\u0002\u0012\u0004\u0012\u00020\u00190Ä\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ç\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010È\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010É\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ê\u0002R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Ë\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010Ì\u0002R\u0015\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ì\u0002R\u0018\u0010Î\u0002\u001a\u00030Í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010Ï\u0002R\u0018\u0010Ñ\u0002\u001a\u00030Ð\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010Ò\u0002R$\u0010Ô\u0002\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010Ó\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R!\u0010Û\u0002\u001a\u00030Ö\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0002\u0010Ø\u0002\u001a\u0006\bÙ\u0002\u0010Ú\u0002R\u0018\u0010Ý\u0002\u001a\u00030Ü\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R\u0018\u0010à\u0002\u001a\u00030ß\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\u001c\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0002\u0010â\u0002R\u0019\u0010ã\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0002\u0010Ì\u0002R\u001b\u0010ä\u0002\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0002\u0010å\u0002R\u001b\u0010æ\u0002\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0002\u0010ç\u0002R\u001c\u0010é\u0002\u001a\u0005\u0018\u00010è\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0002\u0010ê\u0002R\u0019\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010ë\u0002R!\u0010ð\u0002\u001a\u00030ì\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0002\u0010Ø\u0002\u001a\u0006\bî\u0002\u0010ï\u0002R\u001c\u0010ò\u0002\u001a\u0005\u0018\u00010ñ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0002\u0010ó\u0002R\u001c\u0010ô\u0002\u001a\u0005\u0018\u00010æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010õ\u0002R!\u0010ú\u0002\u001a\u00030ö\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b÷\u0002\u0010Ø\u0002\u001a\u0006\bø\u0002\u0010ù\u0002R!\u0010ÿ\u0002\u001a\u00030û\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bü\u0002\u0010Ø\u0002\u001a\u0006\bý\u0002\u0010þ\u0002R\u0018\u0010\u0081\u0003\u001a\u00030\u0080\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0003\u0010\u0082\u0003R\u0018\u0010\u0084\u0003\u001a\u00030\u0083\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0003\u0010\u0085\u0003R\u0018\u0010\u0087\u0003\u001a\u00030\u0086\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R\u0018\u0010\u008a\u0003\u001a\u00030\u0089\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0003\u0010\u008b\u0003R!\u0010\u0090\u0003\u001a\u00030\u008c\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0003\u0010Ø\u0002\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003R\u001a\u0010\u0092\u0003\u001a\u00030\u0091\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0003\u0010\u0093\u0003R\u001f\u0010\u0094\u0003\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0094\u0003\u0010ë\u0002\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R!\u0010\u009b\u0003\u001a\u00030\u0097\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0003\u0010Ø\u0002\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003R\u0018\u0010\u009d\u0003\u001a\u00030\u009c\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0003\u0010\u009e\u0003R\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bL\u0010\u009f\u0003R\u001b\u0010 \u0003\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0003\u0010¡\u0003R\u001c\u0010£\u0003\u001a\u0005\u0018\u00010¢\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0003\u0010¤\u0003R\u0019\u0010¥\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0003\u0010Ì\u0002R\u0018\u0010§\u0003\u001a\u00030¦\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0003\u0010¨\u0003R\u0018\u0010ª\u0003\u001a\u00030©\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0003\u0010«\u0003R\u0018\u0010\u00ad\u0003\u001a\u00030¬\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0003\u0010®\u0003R\u0018\u0010°\u0003\u001a\u00030¯\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0003\u0010±\u0003R\u0018\u0010³\u0003\u001a\u00030²\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0003\u0010´\u0003R\u0018\u0010¶\u0003\u001a\u00030µ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0003\u0010·\u0003R\u0018\u0010¹\u0003\u001a\u00030¸\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0003\u0010º\u0003R\u0018\u0010¼\u0003\u001a\u00030»\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0003\u0010½\u0003R\u0018\u0010¿\u0003\u001a\u00030¾\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0003\u0010À\u0003R\u0018\u0010Â\u0003\u001a\u00030Á\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0003\u0010Ã\u0003R\u0018\u0010Å\u0003\u001a\u00030Ä\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0003\u0010Æ\u0003R\u0018\u0010È\u0003\u001a\u00030Ç\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0003\u0010É\u0003R\u0018\u0010Ë\u0003\u001a\u00030Ê\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0003\u0010Ì\u0003R\u0018\u0010Î\u0003\u001a\u00030Í\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0003\u0010Ï\u0003R\u0018\u0010Ñ\u0003\u001a\u00030Ð\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0003\u0010Ò\u0003R\u0018\u0010Ô\u0003\u001a\u00030Ó\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0003\u0010Õ\u0003R\u0018\u0010×\u0003\u001a\u00030Ö\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0003\u0010Ø\u0003R\u0018\u0010Ú\u0003\u001a\u00030Ù\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0003\u0010Û\u0003R\u0018\u0010Ý\u0003\u001a\u00030Ü\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0003\u0010Þ\u0003R\u0018\u0010à\u0003\u001a\u00030ß\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0003\u0010á\u0003R\u0018\u0010ã\u0003\u001a\u00030â\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0003\u0010ä\u0003R\u0018\u0010æ\u0003\u001a\u00030å\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0003\u0010ç\u0003R\u0018\u0010é\u0003\u001a\u00030è\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0003\u0010ê\u0003R\u0018\u0010ì\u0003\u001a\u00030ë\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0003\u0010í\u0003R\u0018\u0010ï\u0003\u001a\u00030î\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0003\u0010ð\u0003R!\u0010õ\u0003\u001a\u00030ñ\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0003\u0010Ø\u0002\u001a\u0006\bó\u0003\u0010ô\u0003R\u0018\u0010÷\u0003\u001a\u00030ö\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0003\u0010ø\u0003R\u0018\u0010ú\u0003\u001a\u00030ù\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0003\u0010û\u0003R\u0018\u0010ý\u0003\u001a\u00030ü\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0003\u0010þ\u0003R\u0018\u0010\u0080\u0004\u001a\u00030ÿ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0004\u0010\u0081\u0004R'\u0010\u0084\u0004\u001a\n\u0012\u0005\u0012\u00030\u0083\u00040\u0082\u00048\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0004\u0010\u0085\u0004\u001a\u0006\b\u0086\u0004\u0010\u0087\u0004R\u0018\u0010\u0089\u0004\u001a\u00030\u0088\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0004\u0010\u008a\u0004R\u0018\u0010\u008c\u0004\u001a\u00030\u008b\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0004\u0010\u008d\u0004R!\u0010\u0092\u0004\u001a\u00030\u008e\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0004\u0010Ø\u0002\u001a\u0006\b\u0090\u0004\u0010\u0091\u0004R\u0019\u0010\u0093\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0004\u0010Ì\u0002R\u0019\u0010\u0094\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0004\u0010Ì\u0002R\u0019\u0010\u0095\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0004\u0010Ì\u0002R)\u0010\u0096\u0004\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0004\u0010Ì\u0002\u001a\u0006\b\u0096\u0004\u0010â\u0001\"\u0006\b\u0097\u0004\u0010\u0098\u0004R)\u0010\u0099\u0004\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0004\u0010Ì\u0002\u001a\u0006\b\u0099\u0004\u0010â\u0001\"\u0006\b\u009a\u0004\u0010\u0098\u0004R&\u0010\u009e\u0004\u001a\t\u0012\u0004\u0012\u00020@0\u009b\u00048BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009c\u0004\u0010Ø\u0002\u001a\u0005\b\u009d\u0004\u00105R\u0019\u0010\u009f\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0004\u0010Ì\u0002R\u0019\u0010 \u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0004\u0010Ì\u0002R)\u0010¡\u0004\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0004\u0010¢\u0004\u001a\u0006\b£\u0004\u0010¤\u0004\"\u0006\b¥\u0004\u0010¦\u0004R\u0019\u0010§\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0004\u0010Ì\u0002R\u001a\u0010¨\u0004\u001a\u00030í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0004\u0010©\u0004R\u0019\u0010ª\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0004\u0010Ì\u0002R2\u0010\u00ad\u0004\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00130·\u00020l8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b«\u0004\u0010Ø\u0002\u001a\u0005\b¬\u0004\u0010nR\u001c\u0010®\u0004\u001a\u0005\u0018\u00010£\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0004\u0010¯\u0004R,\u0010±\u0004\u001a\u0005\u0018\u00010°\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b±\u0004\u0010²\u0004\u001a\u0006\b³\u0004\u0010´\u0004\"\u0006\bµ\u0004\u0010¶\u0004R0\u0010½\u0004\u001a\u0005\u0018\u00010·\u00042\n\u0010¸\u0004\u001a\u0005\u0018\u00010·\u00048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¹\u0004\u0010º\u0004\"\u0006\b»\u0004\u0010¼\u0004¨\u0006¿\u0004"}, m65681d2 = {"Llive/hms/video/sdk/SDKDelegate;", "Llive/hms/video/sdk/IPeerListIterator;", "Landroid/content/Context;", "applicationContext", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "Llive/hms/video/media/settings/HMSLogSettings;", "hmsLogSettings", "Llive/hms/video/sdk/SDKStore;", "store", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "analyticsEventLevel", "Llive/hms/video/sdk/models/FrameworkInfo;", "frameworkInfo", "", "haltPreviewJoinForPermissions", "iceGatheringOnAnyAddressPorts", "<init>", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/settings/HMSLogSettings;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/sdk/models/FrameworkInfo;ZZ)V", "Llive/hms/video/sdk/HMSActionResultListener;", "resultListener", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Landroid/app/Notification;", "screenShareNotification", "Ll83/a0;", "startScreenshare", "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V", "stopScreenshare", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "startAudioshare", "(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V", "stopAudioshare", "Llive/hms/video/error/HMSException;", "ex", "sendErrorCallback", "(Llive/hms/video/error/HMSException;)V", "hmsException", "sendErrorEvent", "Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "audioDevice", "switchAudioMode", "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V", "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "audioManagerDeviceChangeListener", "setAudioDeviceChangeListener", "(Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;)V", "getAudioOutputRouteType", "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;", "", "getAvailableAudioDevicesList", "()Ljava/util/List;", "Llive/hms/video/audio/HMSAudioDeviceInfo;", "getAvailableAudioDevicesInfoList", "Llive/hms/video/sdk/models/role/HMSRole;", "role", "Llive/hms/video/sdk/RolePreviewListener;", "rolePreviewListener", "previewForRole", "(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RolePreviewListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "cameraFacing", "Llive/hms/video/media/tracks/HMSTrack;", "getLocalVideoTrack", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Lq83/d;)Ljava/lang/Object;", "cancelRolePreview", "()V", "Llive/hms/video/sdk/models/HMSConfig;", "config", "Llive/hms/video/sdk/HMSPreviewListener;", "listener", "preview", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSPreviewListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/HMSUpdateListener;", "hmsUpdateListener", "join", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/HMSUpdateListener;Lq83/d;)Ljava/lang/Object;", "startAudioManager$lib_release", "startAudioManager", "ofRoles", "toRole", "force", "hmsActionResultListener", "bulkRoleChangeRequest", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSPeer;", "forPeer", "roleChangeRequest", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSRoleChangeRequest;", "hmsRoleChangeRequest", "roleChangeAccept", "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V", "notifyServer", "leave", "(ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/plugin/video/HMSVideoPlugin;", "plugin", "", "pluginFrameRate", "addPluginLaterAfterJoinOrPreviewSuccess", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;I)V", "dispatchPendingPluginSetup", "addPlugin", "removePlugin", "(Llive/hms/video/plugin/video/HMSVideoPlugin;Llive/hms/video/sdk/HMSActionResultListener;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlugins", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "", "type", "message", "Llive/hms/video/sdk/HMSMessageResultListener;", "hmsMessageResultListener", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/HMSMessageResultListener;)V", "peerTo", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSMessageResultListener;)V", "rolesTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSMessageResultListener;)V", "Llive/hms/video/sdk/models/HMSMessage;", "hmsMessage", "send", "(Llive/hms/video/sdk/models/HMSMessage;Llive/hms/video/sdk/HMSMessageResultListener;)V", "Llive/hms/video/sdk/models/HMSRemotePeer;", "peer", "reason", "removePeer", "(Llive/hms/video/sdk/models/HMSRemotePeer;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "lock", "endRoom", "(Ljava/lang/String;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "hmsTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/media/tracks/HMSTrackType;", "source", "roles", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Llive/hms/video/sdk/HMSActionResultListener;)V", "stopHLSStreaming", "stopRtmpAndRecording", "name", "changeName", "(Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "metadata", "changeMetadata", "actionlistener", "raiseHand", "changeLocalPeerHand", "(Llive/hms/video/sdk/HMSActionResultListener;Z)V", "lowerRemotePeerHand", "(Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/sdk/models/PeerListIteratorOptions;", "peerListIteratorOptions", "Llive/hms/video/sdk/models/PeerListIterator;", "getPeerListIterator", "(Llive/hms/video/sdk/models/PeerListIteratorOptions;)Llive/hms/video/sdk/models/PeerListIterator;", "Llive/hms/video/sdk/FindPeerListener;", "findPeers", "(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V", "iteratorID", MapboxMap.QFE_LIMIT, "peerIteratorNext", "(Ljava/lang/String;ILlive/hms/video/sdk/FindPeerListener;)V", "Llive/hms/video/sdk/models/HMSNotifications$Peer;", "peers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "convertToHMSPeer", "(Ljava/util/List;)Ljava/util/ArrayList;", "Llive/hms/video/connection/stats/quality/HMSNetworkObserver;", "observer", "addNetworkObserver", "(Llive/hms/video/connection/stats/quality/HMSNetworkObserver;)V", "Llive/hms/video/connection/stats/HMSStatsObserver;", "addStatsObserver", "(Llive/hms/video/connection/stats/HMSStatsObserver;)V", "removeRtcStatsObserver", "setAudioMixingMode", "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "audioMode", "setAudioMode", "(I)V", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metadataModelList", "setHlsSessionMetadata", "(Ljava/util/List;Llive/hms/video/sdk/HMSActionResultListener;)V", "Llive/hms/video/signal/init/TokenRequest;", "tokenRequest", "Llive/hms/video/signal/init/TokenRequestOptions;", "tokenRequestOptions", "Llive/hms/video/signal/init/HMSTokenListener;", "hmsTokenListener", "getAuthTokenByRoomCode", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "hasRealTimeTranscriptionTogglePermissions", "(Llive/hms/video/sdk/models/TranscriptionsMode;)Z", "Llive/hms/video/whiteboard/HMSWhiteboardPermissions;", "getWhiteboardPermissions", "()Llive/hms/video/whiteboard/HMSWhiteboardPermissions;", "Llive/hms/video/interactivity/HmsInteractivityCenter;", "getHmsInteractivityCenter", "()Llive/hms/video/interactivity/HmsInteractivityCenter;", "setPermissionsAccepted", "token", "Llive/hms/video/signal/init/LayoutRequestOptions;", "layoutRequestOptions", "Llive/hms/video/signal/init/HMSLayoutListener;", "hmsLayoutConfigListener", "getLayoutConfigByToken", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V", "enable", "enableNoiseCancellation", "(ZLlive/hms/video/sdk/HMSActionResultListener;)V", "isNoiseCancellationEnabled", "()Z", "Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "isNoiseCancellationSupported", "()Llive/hms/video/factories/noisecancellation/AvailabilityStatus;", "Llive/hms/video/diagnostics/ITransportListener;", "addDiagnosticListener", "(Llive/hms/video/diagnostics/ITransportListener;)V", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Llive/hms/video/sdk/HMSActionResultListener;)V", "stopRealTimeTranscription", "query", "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/HmsTypedActionResultListener;", "Llive/hms/video/sdk/models/PeerSearchResponse;", "searchPeerName", "(Ljava/lang/String;IJLlive/hms/video/sdk/HmsTypedActionResultListener;)V", "audioResourceId", "streamAndPlayAudioFromRawFile", "(ILlive/hms/video/sdk/HMSActionResultListener;)V", "stopAudioFromRawFile", "Llive/hms/video/sdk/models/SDKUpdate;", "updates", "handleSFUMigration", "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;", "addPluginIfRequired", "Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;", "params", "checkIfLocalVideoTrackRequiresUnPublish", "(Llive/hms/video/sdk/models/HMSNotifications$PolicyChange;)Z", "fireUpdates", "(Ljava/util/List;)V", "renegotiateICE", "(Lq83/d;)Ljava/lang/Object;", "onPolicyChangeHandled", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "saveLastTrackState", "videoTrackUnpublishRequired", "unPublishVideoTrackOnlyIfSimulcastPolicy", "handleRemoveScreenshare", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "createSDKUpdatesForMigration", "(Ljava/util/ArrayList;)V", "unpublishLocalTrackAndUpdateForMigration", "Llive/hms/video/sdk/models/HMSLocalPeer;", "hmsLocalPeer", "forceUnPublishVideoTrack", "unPublishTracksIfNeeded", "(Llive/hms/video/sdk/models/HMSLocalPeer;ZLq83/d;)Ljava/lang/Object;", "isSfuMigrating", "getLocalTracksByRoleAndApplySettings", "initLocalTracks", "(Llive/hms/video/sdk/models/role/HMSRole;ZLq83/d;)Ljava/lang/Object;", "localPeer", "isFetchingLocalTracksNeeded", "(Llive/hms/video/sdk/models/HMSLocalPeer;)Z", "newRole", "applyRoleSettings", "sendPreviewListnerUpdate", "(Llive/hms/video/sdk/models/HMSLocalPeer;)V", "sendJoinNotification", "Llive/hms/video/signal/init/InitConfig;", "initConfig", "setPublishSubscriberStatsConfig", "(Llive/hms/video/signal/init/InitConfig;)V", "createHmsInteractivityCenterIfNeeded", "updateConfig", "initLogStorage", "shouldJoinAsWebrtcPeer", "videoTrackID", "getCorrespondingPeerFromVideoTrackId", "(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;", "onJoinSuccess", "exception", "onJoinError", "(Llive/hms/video/error/HMSException;Lq83/d;)Ljava/lang/Object;", "publishLocalTracks", "(Llive/hms/video/sdk/models/HMSLocalPeer;Lq83/d;)Ljava/lang/Object;", "screenShareTrack", "publishScreenShareTrack", "(Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "tearDownSDKDelegate", "leaveMeeting", "removePlugins", "clearPluginPendingState", "Ll83/k;", "Lhms/webrtc/Size;", "setPluginFpsBasedOnResolution", "(Ll83/k;)I", "pollId", "Llive/hms/video/polls/network/QuestionContainer;", "safeGetAllPollQuestions", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "index", "Llive/hms/video/polls/models/question/HMSPollQuestion;", "questions", "getAllPollQuestions", "(Ljava/lang/String;ILjava/util/List;Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "setSdkStoreConfig", "(Llive/hms/video/sdk/SDKStore;)Lkotlin/jvm/functions/Function1;", "Landroid/content/Context;", "Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/media/settings/HMSLogSettings;", "Llive/hms/video/sdk/SDKStore;", "Llive/hms/video/sdk/models/FrameworkInfo;", "Z", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "offlineAnalyticsPeerInfo", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "Llive/hms/video/sdk/SpeedTestUseCase;", "previewSpeedTestUseCase", "Llive/hms/video/sdk/SpeedTestUseCase;", "Lbc3/i0;", "lowSpeedDuringPreviewEarlyWarning", "Lbc3/i0;", "Llive/hms/video/sdk/PermissionsHandlers;", "permissionsHandler$delegate", "Ll83/h;", "getPermissionsHandler", "()Llive/hms/video/sdk/PermissionsHandlers;", "permissionsHandler", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "ncStatusChecker", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "Llive/hms/video/sdk/NoiseCancellationReportingUseCase;", "noiseCancellationReportingUseCase", "Llive/hms/video/sdk/NoiseCancellationReportingUseCase;", "Llive/hms/video/signal/init/InitConfig;", "isLogWriterInitialised", "isLastLocalVideoTrackMuted", "Ljava/lang/Boolean;", "lastNodeInfo", "Ljava/lang/String;", "Llive/hms/video/sdk/models/LastTrackState;", "lastTrackState", "Llive/hms/video/sdk/models/LastTrackState;", "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "Llive/hms/video/sdk/models/PerformanceMeasurement;", "performanceMeasurement$delegate", "getPerformanceMeasurement", "()Llive/hms/video/sdk/models/PerformanceMeasurement;", "performanceMeasurement", "Llive/hms/video/media/capturers/HMSCapturer;", "audioShareCapturer", "Llive/hms/video/media/capturers/HMSCapturer;", "connectivityTestListener", "Llive/hms/video/diagnostics/ITransportListener;", "Landroid/os/HandlerThread;", "audioHandlerThread$delegate", "getAudioHandlerThread", "()Landroid/os/HandlerThread;", "audioHandlerThread", "Landroid/os/Handler;", "audioHandler$delegate", "getAudioHandler", "()Landroid/os/Handler;", "audioHandler", "Ljava/lang/Object;", "audioLock", "Ljava/lang/Object;", "Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "trackFactory", "Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "live/hms/video/sdk/SDKDelegate$transportObserver$1", "transportObserver", "Llive/hms/video/sdk/SDKDelegate$transportObserver$1;", "Llive/hms/video/transport/IsQaLink;", "isQalink", "Llive/hms/video/transport/IsQaLink;", "Llive/hms/video/transport/ITransport;", "transportLayer$delegate", "getTransportLayer", "()Llive/hms/video/transport/ITransport;", "transportLayer", "Llive/hms/video/transport/models/TransportState;", "transportState", "Llive/hms/video/transport/models/TransportState;", "audioDeviceListener", "getAudioDeviceListener$lib_release", "()Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;", "Llive/hms/video/audio/HMSAudioManager;", "hmsAudioManager$delegate", "getHmsAudioManager", "()Llive/hms/video/audio/HMSAudioManager;", "hmsAudioManager", "Llive/hms/video/network/HMSNetworkManager;", "hmsNetworkManager", "Llive/hms/video/network/HMSNetworkManager;", "Llive/hms/video/sdk/HMSUpdateListener;", "hmsPreviewListener", "Llive/hms/video/sdk/HMSPreviewListener;", "Llive/hms/video/sdk/IErrorListener;", "errorListener", "Llive/hms/video/sdk/IErrorListener;", "isPreviewListenerCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLeaveInProgressAtomic", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Llive/hms/video/sdk/managers/ActiveSpeakerManager;", "activeSpeakerManager", "Llive/hms/video/sdk/managers/ActiveSpeakerManager;", "Llive/hms/video/sdk/managers/BroadcastManager;", "broadcastManager", "Llive/hms/video/sdk/managers/BroadcastManager;", "Llive/hms/video/sdk/managers/OnTranscriptionManager;", "onTranscriptionManager", "Llive/hms/video/sdk/managers/OnTranscriptionManager;", "Llive/hms/video/sdk/managers/OnPeerJoinManager;", "onPeerJoinManager", "Llive/hms/video/sdk/managers/OnPeerJoinManager;", "Llive/hms/video/sdk/managers/OnPeerLeaveManager;", "onPeerLeaveManager", "Llive/hms/video/sdk/managers/OnPeerLeaveManager;", "Llive/hms/video/sdk/managers/OnPolicyChangeManager;", "onPolicyChangeManager", "Llive/hms/video/sdk/managers/OnPolicyChangeManager;", "Llive/hms/video/sdk/managers/OnRoleChangeRequestManager;", "onRoleChangeRequestManager", "Llive/hms/video/sdk/managers/OnRoleChangeRequestManager;", "Llive/hms/video/sdk/managers/OnPeerUpdateManager;", "onPeerUpdateManager", "Llive/hms/video/sdk/managers/OnPeerUpdateManager;", "Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;", "onPeerNetworkUpdateManager", "Llive/hms/video/sdk/managers/OnPeerNetworkUpdateManager;", "Llive/hms/video/sdk/managers/OnTrackAddManager;", "onTrackAddManager", "Llive/hms/video/sdk/managers/OnTrackAddManager;", "Llive/hms/video/sdk/managers/OnTrackRemoveManager;", "onTrackRemoveManager", "Llive/hms/video/sdk/managers/OnTrackRemoveManager;", "Llive/hms/video/sdk/managers/OnTrackUpdateManager;", "onTrackUpdateManager", "Llive/hms/video/sdk/managers/OnTrackUpdateManager;", "Llive/hms/video/sdk/managers/OnPeerRemovedManager;", "onPeerRemovedManager", "Llive/hms/video/sdk/managers/OnPeerRemovedManager;", "Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;", "onTrackUpdateRequestedManager", "Llive/hms/video/sdk/managers/TrackUpdateRequestedManager;", "Llive/hms/video/sdk/managers/RecordingUpdateManager;", "onRecordingUpdateManager", "Llive/hms/video/sdk/managers/RecordingUpdateManager;", "Llive/hms/video/sdk/managers/RtmpUpdateManager;", "onRtmpUpdateManager", "Llive/hms/video/sdk/managers/RtmpUpdateManager;", "Llive/hms/video/sdk/managers/HLSUpdateManager;", "onHLSUpdateManager", "Llive/hms/video/sdk/managers/HLSUpdateManager;", "Llive/hms/video/sdk/TrackLayerUpdateManager;", "onTrackLayerUpdateManager", "Llive/hms/video/sdk/TrackLayerUpdateManager;", "Llive/hms/video/sessionstore/SessionStoreUpdateManager;", "sessionStoreUpdateManager", "Llive/hms/video/sessionstore/SessionStoreUpdateManager;", "Llive/hms/video/polls/network/HmsPollsStartManager;", "hmsPollsStartManager", "Llive/hms/video/polls/network/HmsPollsStartManager;", "Llive/hms/video/sdk/HmsPollsStopManager;", "hmsPollStopManager", "Llive/hms/video/sdk/HmsPollsStopManager;", "Llive/hms/video/polls/network/HmsPollResultsManager;", "hmsPollResultsManager", "Llive/hms/video/polls/network/HmsPollResultsManager;", "Llive/hms/video/sdk/managers/RoomInfoManager;", "roomInfoManager", "Llive/hms/video/sdk/managers/RoomInfoManager;", "Llive/hms/video/sdk/managers/SessionInfoManager;", "sessionInfoManager", "Llive/hms/video/sdk/managers/SessionInfoManager;", "Llive/hms/video/sdk/HmsWhiteBoardManager;", "hmsWhiteBoardManager$delegate", "getHmsWhiteBoardManager", "()Llive/hms/video/sdk/HmsWhiteBoardManager;", "hmsWhiteBoardManager", "Llive/hms/video/sdk/managers/OnTranscriptionStateManager;", "onTranscriptionControlManager", "Llive/hms/video/sdk/managers/OnTranscriptionStateManager;", "Llive/hms/video/sdk/managers/InitialPeerListManager;", "initialPeerListManager", "Llive/hms/video/sdk/managers/InitialPeerListManager;", "Llive/hms/video/sdk/managers/ReconnectPeerListManager;", "reconnectPeerListManager", "Llive/hms/video/sdk/managers/ReconnectPeerListManager;", "Llive/hms/video/connection/degredation/WebRtcStatsMonitor;", "webrtcStatsMonitor", "Llive/hms/video/connection/degredation/WebRtcStatsMonitor;", "Lec3/t1;", "Llive/hms/video/connection/degredation/StatsBundle;", "statsFlow", "Lec3/t1;", "getStatsFlow$lib_release", "()Lec3/t1;", "Llive/hms/video/sdk/NetworkObserverUseCase;", "networkObserverUseCase", "Llive/hms/video/sdk/NetworkObserverUseCase;", "Llive/hms/video/sdk/RtcStatsObserverUseCase;", "rtcStatsObserverUseCase", "Llive/hms/video/sdk/RtcStatsObserverUseCase;", "Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;", "muteOnPhoneCalManager$delegate", "getMuteOnPhoneCalManager", "()Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;", "muteOnPhoneCalManager", "hasJoined", "isOnPolicyChangeHandled", "isReconnecting", "isScreenShared", "setScreenShared", "(Z)V", "isAudioShared", "setAudioShared", "", "previewForRoleTracks$delegate", "getPreviewForRoleTracks", "previewForRoleTracks", "sssd", "nonWebRTCDisableOffer", "hmsConfig", "Llive/hms/video/sdk/models/HMSConfig;", "getHmsConfig", "()Llive/hms/video/sdk/models/HMSConfig;", "setHmsConfig", "(Llive/hms/video/sdk/models/HMSConfig;)V", "waitingForPolicyToJoin", "timeBeforeJoin", "J", "pendingPluginSetupRequired", "pendingPluginList$delegate", "getPendingPluginList", "pendingPluginList", "peerListIterator", "Llive/hms/video/sdk/models/PeerListIterator;", "Lbc3/k1;", "searchPeerNameJob", "Lbc3/k1;", "getSearchPeerNameJob", "()Lbc3/k1;", "setSearchPeerNameJob", "(Lbc3/k1;)V", "Llive/hms/video/sdk/HMSAudioListener;", "value", "getAudioObserver", "()Llive/hms/video/sdk/HMSAudioListener;", "setAudioObserver", "(Llive/hms/video/sdk/HMSAudioListener;)V", "audioObserver", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SDKDelegate implements IPeerListIterator {
    private static final String HAND_RAISE_GROUP_NAME = "_handraise";
    private static final String TAG = "SDKDelegate";
    private final ActiveSpeakerManager activeSpeakerManager;
    private final Context applicationContext;
    private final HMSAudioManager.AudioManagerDeviceChangeListener audioDeviceListener;

    /* JADX INFO: renamed from: audioHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h audioHandler;

    /* JADX INFO: renamed from: audioHandlerThread$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h audioHandlerThread;
    private final Object audioLock;
    private HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener;
    private HMSCapturer audioShareCapturer;
    private final BroadcastManager broadcastManager;
    private ITransportListener connectivityTestListener;
    private IErrorListener errorListener;
    private final FrameworkInfo frameworkInfo;
    private final boolean haltPreviewJoinForPermissions;
    private boolean hasJoined;

    /* JADX INFO: renamed from: hmsAudioManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h hmsAudioManager;
    public HMSConfig hmsConfig;
    private final HMSLogSettings hmsLogSettings;
    private final HMSNetworkManager hmsNetworkManager;
    private final HmsPollResultsManager hmsPollResultsManager;
    private final HmsPollsStopManager hmsPollStopManager;
    private final HmsPollsStartManager hmsPollsStartManager;
    private HMSPreviewListener hmsPreviewListener;
    private final HMSTrackSettings hmsTrackSettings;
    private HMSUpdateListener hmsUpdateListener;

    /* JADX INFO: renamed from: hmsWhiteBoardManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h hmsWhiteBoardManager;
    private final boolean iceGatheringOnAnyAddressPorts;
    private InitConfig initConfig;
    private final InitialPeerListManager initialPeerListManager;
    private boolean isAudioShared;
    private Boolean isLastLocalVideoTrackMuted;
    private final AtomicBoolean isLeaveInProgressAtomic;
    private boolean isLogWriterInitialised;
    private boolean isOnPolicyChangeHandled;
    private boolean isPreviewListenerCalled;
    private final IsQaLink isQalink;
    private boolean isReconnecting;
    private boolean isScreenShared;
    private String lastNodeInfo;
    private LastTrackState lastTrackState;
    private InterfaceC3018i0 lowSpeedDuringPreviewEarlyWarning;

    /* JADX INFO: renamed from: muteOnPhoneCalManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h muteOnPhoneCalManager;
    private final NoiseCancellationStatusChecker ncStatusChecker;
    private final NetworkObserverUseCase networkObserverUseCase;
    private final NoiseCancellationReportingUseCase noiseCancellationReportingUseCase;
    private boolean nonWebRTCDisableOffer;
    private final OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo;
    private final HLSUpdateManager onHLSUpdateManager;
    private final OnPeerJoinManager onPeerJoinManager;
    private final OnPeerLeaveManager onPeerLeaveManager;
    private final OnPeerNetworkUpdateManager onPeerNetworkUpdateManager;
    private final OnPeerRemovedManager onPeerRemovedManager;
    private final OnPeerUpdateManager onPeerUpdateManager;
    private final OnPolicyChangeManager onPolicyChangeManager;
    private final RecordingUpdateManager onRecordingUpdateManager;
    private final OnRoleChangeRequestManager onRoleChangeRequestManager;
    private final RtmpUpdateManager onRtmpUpdateManager;
    private final OnTrackAddManager onTrackAddManager;
    private final TrackLayerUpdateManager onTrackLayerUpdateManager;
    private final OnTrackRemoveManager onTrackRemoveManager;
    private final OnTrackUpdateManager onTrackUpdateManager;
    private final TrackUpdateRequestedManager onTrackUpdateRequestedManager;
    private final OnTranscriptionStateManager onTranscriptionControlManager;
    private final OnTranscriptionManager onTranscriptionManager;
    private PeerListIterator peerListIterator;

    /* JADX INFO: renamed from: pendingPluginList$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h pendingPluginList;
    private boolean pendingPluginSetupRequired;

    /* JADX INFO: renamed from: performanceMeasurement$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h performanceMeasurement;

    /* JADX INFO: renamed from: permissionsHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h permissionsHandler;

    /* JADX INFO: renamed from: previewForRoleTracks$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h previewForRoleTracks;
    private final SpeedTestUseCase previewSpeedTestUseCase;
    private final ReconnectPeerListManager reconnectPeerListManager;
    private final RoomInfoManager roomInfoManager;
    private final RtcStatsObserverUseCase rtcStatsObserverUseCase;
    private InterfaceC3027k1 searchPeerNameJob;
    private final SessionInfoManager sessionInfoManager;
    private final SessionStoreUpdateManager sessionStoreUpdateManager;
    private boolean sssd;
    private final InterfaceC13087t1 statsFlow;
    private final SDKStore store;
    private long timeBeforeJoin;
    private final RemoteTrackFactory trackFactory;

    /* JADX INFO: renamed from: transportLayer$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h transportLayer;
    private final SDKDelegate$transportObserver$1 transportObserver;
    private TransportState transportState;
    private boolean waitingForPolicyToJoin;
    private final WebRtcStatsMonitor webrtcStatsMonitor;

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$applyRoleSettings$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1239, 1253}, m100432m = "applyRoleSettings")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241981 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C241981(InterfaceC30057d<? super C241981> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.applyRoleSettings(null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$bulkRoleChangeRequest$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$bulkRoleChangeRequest$1", m100430f = "SDKDelegate.kt", m100431l = {1669}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241991 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $force;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ List<HMSRole> $ofRoles;
        final /* synthetic */ HMSRole $toRole;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241991(List<HMSRole> list, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C241991> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$ofRoles = list;
            this.$toRole = hMSRole;
            this.$force = z4;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C241991(this.$ofRoles, this.$toRole, this.$force, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241991) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C241991 c241991;
            HMSException hMSException;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    List<HMSRole> list = this.$ofRoles;
                    HMSRole hMSRole = this.$toRole;
                    boolean z4 = this.$force;
                    HMSActionResultListener hMSActionResultListener = this.$hmsActionResultListener;
                    this.label = 1;
                    c241991 = this;
                    try {
                        if (transportLayer.bulkRoleChangeRequest(list, hMSRole, z4, hMSActionResultListener, c241991) == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (HMSException e5) {
                        e = e5;
                        hMSException = e;
                        c241991.$hmsActionResultListener.onError(hMSException);
                    }
                } catch (HMSException e13) {
                    e = e13;
                    c241991 = this;
                    hMSException = e;
                    c241991.$hmsActionResultListener.onError(hMSException);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    c241991 = this;
                } catch (HMSException e14) {
                    hMSException = e14;
                    c241991 = this;
                    c241991.$hmsActionResultListener.onError(hMSException);
                }
            }
            c241991.$hmsActionResultListener.onSuccess();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$changeLocalPeerHand$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$changeLocalPeerHand$1", m100430f = "SDKDelegate.kt", m100431l = {2174, 2176}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242001 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $actionlistener;
        final /* synthetic */ boolean $raiseHand;
        int label;
        final /* synthetic */ SDKDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242001(boolean z4, SDKDelegate sDKDelegate, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242001> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$raiseHand = z4;
            this.this$0 = sDKDelegate;
            this.$actionlistener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242001(this.$raiseHand, this.this$0, this.$actionlistener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242001) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        
            if (r5 == r0) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: live.hms.video.error.HMSException -> L10
                goto L48
            L10:
                r5 = move-exception
                goto L50
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                p505ts.AbstractC34132o.m107864I(r5)     // Catch: live.hms.video.error.HMSException -> L10
                goto L36
            L1e:
                p505ts.AbstractC34132o.m107864I(r5)
                boolean r5 = r4.$raiseHand     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r1 = "_handraise"
                if (r5 == 0) goto L39
                live.hms.video.sdk.SDKDelegate r5 = r4.this$0     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.transport.ITransport r5 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r5)     // Catch: live.hms.video.error.HMSException -> L10
                r4.label = r3     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.Object r5 = r5.groupJoin(r1, r4)     // Catch: live.hms.video.error.HMSException -> L10
                if (r5 != r0) goto L36
                goto L47
            L36:
                live.hms.video.groups.GroupJoinLeaveResponse r5 = (live.hms.video.groups.GroupJoinLeaveResponse) r5     // Catch: live.hms.video.error.HMSException -> L10
                goto L4a
            L39:
                live.hms.video.sdk.SDKDelegate r5 = r4.this$0     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.transport.ITransport r5 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r5)     // Catch: live.hms.video.error.HMSException -> L10
                r4.label = r2     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.Object r5 = r5.groupLeave(r1, r4)     // Catch: live.hms.video.error.HMSException -> L10
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                live.hms.video.groups.GroupJoinLeaveResponse r5 = (live.hms.video.groups.GroupJoinLeaveResponse) r5     // Catch: live.hms.video.error.HMSException -> L10
            L4a:
                live.hms.video.sdk.HMSActionResultListener r5 = r4.$actionlistener     // Catch: live.hms.video.error.HMSException -> L10
                r5.onSuccess()     // Catch: live.hms.video.error.HMSException -> L10
                goto L55
            L50:
                live.hms.video.sdk.HMSActionResultListener r0 = r4.$actionlistener
                r0.onError(r5)
            L55:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.C242001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$changeMetadata$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$changeMetadata$1", m100430f = "SDKDelegate.kt", m100431l = {2156}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242011 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ String $metadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242011(String str, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242011> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$metadata = str;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242011(this.$metadata, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242011) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String str = this.$metadata;
                    this.label = 1;
                    if (transportLayer.changeMetadata(str, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                HMSLocalPeer localPeer = SDKDelegate.this.store.getLocalPeer();
                if (localPeer != null) {
                    localPeer.setMetadata$lib_release(this.$metadata);
                    SDKDelegate.this.fireUpdates(AbstractC37056f.m118958J(new SDKUpdate.Peer(HMSPeerUpdate.METADATA_CHANGED, localPeer)));
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$changeName$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$changeName$1", m100430f = "SDKDelegate.kt", m100431l = {2134}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242021 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242021(String str, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242021> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$name = str;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242021(this.$name, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242021) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String str = this.$name;
                    this.label = 1;
                    if (transportLayer.changeName(str, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                HMSLocalPeer localPeer = SDKDelegate.this.store.getLocalPeer();
                if (localPeer != null) {
                    localPeer.setName$lib_release(this.$name);
                    SDKDelegate.this.fireUpdates(AbstractC37056f.m118958J(new SDKUpdate.Peer(HMSPeerUpdate.NAME_CHANGED, localPeer)));
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$changeTrackState$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$changeTrackState$1", m100430f = "SDKDelegate.kt", m100431l = {2043}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242031 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSTrack $hmsTrack;
        final /* synthetic */ boolean $mute;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242031(HMSTrack hMSTrack, HMSActionResultListener hMSActionResultListener, boolean z4, InterfaceC30057d<? super C242031> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsTrack = hMSTrack;
            this.$hmsActionResultListener = hMSActionResultListener;
            this.$mute = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242031(this.$hmsTrack, this.$hmsActionResultListener, this.$mute, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242031) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            HMSActionResultListener hMSActionResultListener;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HMSPeer peerByTrackId = SDKDelegate.this.store.getPeerByTrackId(this.$hmsTrack.getTrackId());
                    if (peerByTrackId != null) {
                        SDKDelegate sDKDelegate = SDKDelegate.this;
                        HMSTrack hMSTrack = this.$hmsTrack;
                        boolean z4 = this.$mute;
                        HMSActionResultListener hMSActionResultListener2 = this.$hmsActionResultListener;
                        ITransport transportLayer = sDKDelegate.getTransportLayer();
                        String peerID = peerByTrackId.getPeerID();
                        this.L$0 = hMSActionResultListener2;
                        this.label = 1;
                        if (transportLayer.changeTrackState(hMSTrack, peerID, z4, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        hMSActionResultListener = hMSActionResultListener2;
                    }
                    return C23454a0.f92919a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMSActionResultListener = (HMSActionResultListener) this.L$0;
                AbstractC34132o.m107864I(obj);
                hMSActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$changeTrackState$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$changeTrackState$2", m100430f = "SDKDelegate.kt", m100431l = {2059}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242042 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ boolean $mute;
        final /* synthetic */ List<String> $roles;
        final /* synthetic */ String $source;
        final /* synthetic */ HMSTrackType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242042(boolean z4, HMSTrackType hMSTrackType, String str, List<String> list, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242042> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mute = z4;
            this.$type = hMSTrackType;
            this.$source = str;
            this.$roles = list;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242042(this.$mute, this.$type, this.$source, this.$roles, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242042) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C242042 c242042;
            HMSException hMSException;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    boolean z4 = this.$mute;
                    HMSTrackType hMSTrackType = this.$type;
                    String str = this.$source;
                    List<String> list = this.$roles;
                    String localPeerId = SDKDelegate.this.store.getLocalPeerId();
                    this.label = 1;
                    c242042 = this;
                    try {
                        if (transportLayer.changeTrackState(z4, hMSTrackType, str, list, localPeerId, c242042) == enumC31071a) {
                            return enumC31071a;
                        }
                    } catch (HMSException e5) {
                        e = e5;
                        hMSException = e;
                        c242042.$hmsActionResultListener.onError(hMSException);
                    }
                } catch (HMSException e13) {
                    e = e13;
                    c242042 = this;
                    hMSException = e;
                    c242042.$hmsActionResultListener.onError(hMSException);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    AbstractC34132o.m107864I(obj);
                    c242042 = this;
                } catch (HMSException e14) {
                    hMSException = e14;
                    c242042 = this;
                    c242042.$hmsActionResultListener.onError(hMSException);
                }
            }
            c242042.$hmsActionResultListener.onSuccess();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242051 extends C22672i implements InterfaceC4351m {
        public C242051(Object obj) {
            super(2, 0, ITransport.class, obj, "createPoll", "createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super PollCreateResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).createPoll(setPollParams, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$10 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C2420610 extends C22672i implements InterfaceC4352n {
        public C2420610(Object obj) {
            super(4, 0, ITransport.class, obj, "pollGetList", "pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((HmsPollState) obj, ((Number) obj2).intValue(), (String) obj3, (InterfaceC30057d<? super PollListResponse>) obj4);
        }

        public final Object invoke(HmsPollState hmsPollState, int i13, String str, InterfaceC30057d<? super PollListResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).pollGetList(hmsPollState, i13, str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$11 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C2420711 extends C22672i implements InterfaceC4351m {
        public C2420711(Object obj) {
            super(2, 0, ITransport.class, obj, "createWhiteBoard", "createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.Options options, InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).createWhiteBoard(options, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$12 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C2420812 extends C22672i implements InterfaceC4351m {
        public C2420812(Object obj) {
            super(2, 0, ITransport.class, obj, "getWhiteBoard", "getWhiteBoard(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).getWhiteBoard(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242102 extends C22672i implements InterfaceC4351m {
        public C242102(Object obj) {
            super(2, 0, ITransport.class, obj, "createQuestion", "createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.PollQuestionsSet pollQuestionsSet, InterfaceC30057d<? super SetQuestionsResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).createQuestion(pollQuestionsSet, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242113 extends C22672i implements InterfaceC4351m {
        public C242113(Object obj) {
            super(2, 0, ITransport.class, obj, "pollStart", "pollStart(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((ITransport) this.receiver).pollStart(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$4 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242124 extends C22672i implements InterfaceC4351m {
        public C242124(Object obj) {
            super(2, 0, ITransport.class, obj, "pollStop", "pollStop(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((ITransport) this.receiver).pollStop(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$5 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242135 extends C22672i implements InterfaceC4351m {
        public C242135(Object obj) {
            super(2, 0, ITransport.class, obj, "pollAddResponse", "pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSPollResponseBuilder hMSPollResponseBuilder, InterfaceC30057d<? super PollAnswerResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).pollAddResponse(hMSPollResponseBuilder, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242146 extends C22672i implements InterfaceC4351m {
        public C242146(Object obj) {
            super(2, 0, ITransport.class, obj, "pollGetResponses", "pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super PollGetResponsesReply> interfaceC30057d) {
            return ((ITransport) this.receiver).pollGetResponses(pollResponsesQuery, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$7 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242157 extends C22672i implements InterfaceC4351m {
        public C242157(Object obj) {
            super(2, 0, ITransport.class, obj, "pollGetResults", "pollGetResults(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super PollResultsResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).pollGetResults(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$8 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242168 extends C22672i implements InterfaceC4351m {
        public C242168(Object obj) {
            super(2, 0, ITransport.class, obj, "pollGetLeaderboard", "pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(HMSParams.PollLeaderboardQuery pollLeaderboardQuery, InterfaceC30057d<? super PollLeaderboardResponse> interfaceC30057d) {
            return ((ITransport) this.receiver).pollGetLeaderboard(pollLeaderboardQuery, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$createHmsInteractivityCenterIfNeeded$9 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242179 extends C22672i implements InterfaceC4351m {
        public C242179(Object obj) {
            super(2, 0, SDKDelegate.class, obj, "safeGetAllPollQuestions", "safeGetAllPollQuestions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super QuestionContainer> interfaceC30057d) {
            return ((SDKDelegate) this.receiver).safeGetAllPollQuestions(str, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$enableNoiseCancellation$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$enableNoiseCancellation$1", m100430f = "SDKDelegate.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242181 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $enable;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242181(boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242181> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$enable = z4;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242181(this.$enable, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242181) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SDKDelegate.this.noiseCancellationReportingUseCase.noiseCancellationState(this.$enable);
            SDKDelegate.this.getTransportLayer().noiseCancellation().setNoiseCancellationEnabled(this.$enable);
            AvailabilityStatus availabilityStatusIsNoiseCancellationSupported = SDKDelegate.this.isNoiseCancellationSupported();
            if (AbstractC22676k.m65745e(availabilityStatusIsNoiseCancellationSupported, AvailabilityStatus.Available.INSTANCE) && SDKDelegate.this.getTransportLayer().noiseCancellation().getNoiseCancellationEnabled() == this.$enable) {
                this.$hmsActionResultListener.onSuccess();
            } else if (availabilityStatusIsNoiseCancellationSupported instanceof AvailabilityStatus.NotAvailable) {
                this.$hmsActionResultListener.onError(ErrorFactory.INSTANCE.NoiseCancellationNotAvailable((AvailabilityStatus.NotAvailable) availabilityStatusIsNoiseCancellationSupported));
            } else {
                this.$hmsActionResultListener.onError(ErrorFactory.INSTANCE.NoiseCancellationToggleFailed(this.$enable, SDKDelegate.this.getTransportLayer().noiseCancellation().getNoiseCancellationEnabled()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$endRoom$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$endRoom$1", m100430f = "SDKDelegate.kt", m100431l = {2029, 2030}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242191 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ boolean $lock;
        final /* synthetic */ String $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242191(String str, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242191> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$reason = str;
            this.$lock = z4;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242191(this.$reason, this.$lock, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242191) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            if (live.hms.video.sdk.SDKDelegate.leave$default(r6, false, r5, 1, null) == r0) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p505ts.AbstractC34132o.m107864I(r6)     // Catch: live.hms.video.error.HMSException -> L10
                goto L49
            L10:
                r6 = move-exception
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                p505ts.AbstractC34132o.m107864I(r6)     // Catch: live.hms.video.error.HMSException -> L10
                goto L34
            L1e:
                p505ts.AbstractC34132o.m107864I(r6)
                live.hms.video.sdk.SDKDelegate r6 = live.hms.video.sdk.SDKDelegate.this     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.transport.ITransport r6 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r6)     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r1 = r5.$reason     // Catch: live.hms.video.error.HMSException -> L10
                boolean r4 = r5.$lock     // Catch: live.hms.video.error.HMSException -> L10
                r5.label = r3     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.Object r6 = r6.endRoom(r1, r4, r5)     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 != r0) goto L34
                goto L48
            L34:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: live.hms.video.error.HMSException -> L10
                boolean r6 = r6.booleanValue()     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 == 0) goto L54
                live.hms.video.sdk.SDKDelegate r6 = live.hms.video.sdk.SDKDelegate.this     // Catch: live.hms.video.error.HMSException -> L10
                r5.label = r2     // Catch: live.hms.video.error.HMSException -> L10
                r1 = 0
                r2 = 0
                java.lang.Object r6 = live.hms.video.sdk.SDKDelegate.leave$default(r6, r1, r5, r3, r2)     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                live.hms.video.sdk.HMSActionResultListener r6 = r5.$hmsActionResultListener     // Catch: live.hms.video.error.HMSException -> L10
                r6.onSuccess()     // Catch: live.hms.video.error.HMSException -> L10
                goto L54
            L4f:
                live.hms.video.sdk.HMSActionResultListener r0 = r5.$hmsActionResultListener
                r0.onError(r6)
            L54:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.C242191.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$findPeers$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$findPeers$1", m100430f = "SDKDelegate.kt", m100431l = {2211}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242201 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ FindPeerListener $listener;
        final /* synthetic */ PeerListIteratorOptions $peerListIteratorOptions;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242201(PeerListIteratorOptions peerListIteratorOptions, FindPeerListener findPeerListener, InterfaceC30057d<? super C242201> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$peerListIteratorOptions = peerListIteratorOptions;
            this.$listener = findPeerListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242201(this.$peerListIteratorOptions, this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242201) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            HMSException hMSException;
            C242201 c242201;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    try {
                        ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                        PeerListIteratorOptions peerListIteratorOptions = this.$peerListIteratorOptions;
                        String byGroupName = peerListIteratorOptions != null ? peerListIteratorOptions.getByGroupName() : null;
                        PeerListIteratorOptions peerListIteratorOptions2 = this.$peerListIteratorOptions;
                        String byRoleName = peerListIteratorOptions2 != null ? peerListIteratorOptions2.getByRoleName() : null;
                        PeerListIteratorOptions peerListIteratorOptions3 = this.$peerListIteratorOptions;
                        ArrayList<String> byPeerIds = peerListIteratorOptions3 != null ? peerListIteratorOptions3.getByPeerIds() : null;
                        PeerListIteratorOptions peerListIteratorOptions4 = this.$peerListIteratorOptions;
                        int limit = peerListIteratorOptions4 != null ? peerListIteratorOptions4.getLimit() : 10;
                        this.label = 1;
                        c242201 = this;
                        try {
                            obj = transportLayer.findPeers(byGroupName, byRoleName, byPeerIds, limit, c242201);
                            if (obj == enumC31071a) {
                                return enumC31071a;
                            }
                        } catch (HMSException e5) {
                            e = e5;
                            hMSException = e;
                            c242201.$listener.onError(hMSException);
                        }
                    } catch (HMSException e13) {
                        e = e13;
                        c242201 = this;
                        hMSException = e;
                        c242201.$listener.onError(hMSException);
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    c242201 = this;
                }
                FindPeerResponse findPeerResponse = (FindPeerResponse) obj;
                PeerListIterator peerListIterator = SDKDelegate.this.peerListIterator;
                if (peerListIterator != null) {
                    peerListIterator.setIteratorId$lib_release(findPeerResponse.getIteratorId());
                }
                c242201.$listener.onResult(findPeerResponse);
            } catch (HMSException e14) {
                hMSException = e14;
                c242201 = this;
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$fireUpdates$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$fireUpdates$2", m100430f = "SDKDelegate.kt", m100431l = {661}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242212 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C242212(InterfaceC30057d<? super C242212> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242212(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242212) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SDKDelegate sDKDelegate = SDKDelegate.this;
                this.label = 1;
                if (sDKDelegate.leave(false, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$getAllPollQuestions$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {2320}, m100432m = "getAllPollQuestions")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242221 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C242221(InterfaceC30057d<? super C242221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.getAllPollQuestions(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$getLocalTracksByRoleAndApplySettings$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1050, 1055}, m100432m = "getLocalTracksByRoleAndApplySettings")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242231 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C242231(InterfaceC30057d<? super C242231> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.getLocalTracksByRoleAndApplySettings(false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$handleSFUMigration$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {429, 432, 435, 438, 443}, m100432m = "handleSFUMigration")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242241 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C242241(InterfaceC30057d<? super C242241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.handleSFUMigration(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$initLocalTracks$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1094, 1136}, m100432m = "initLocalTracks")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242251 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C242251(InterfaceC30057d<? super C242251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.initLocalTracks(null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$initLogStorage$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$initLogStorage$1", m100430f = "SDKDelegate.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242261 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C242261(InterfaceC30057d<? super C242261> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242261(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242261) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SDKDelegate sDKDelegate = SDKDelegate.this;
            try {
                if (sDKDelegate.hmsLogSettings.isLogStorageEnabled()) {
                    LogUtils logUtils = LogUtils.INSTANCE;
                    logUtils.checkDirSizeAndRemove(sDKDelegate.applicationContext);
                    logUtils.staticFileWriterStart(sDKDelegate.applicationContext, sDKDelegate.frameworkInfo);
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$join$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$join$2", m100430f = "SDKDelegate.kt", m100431l = {1520}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242272 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSConfig $config;
        final /* synthetic */ HMSUpdateListener $hmsUpdateListener;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$join$2$1, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class AnonymousClass1 extends C22672i implements Function3 {
            public AnonymousClass1(Object obj) {
                super(3, 0, ITransport.class, obj, "changeSessionMetadata", "changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(String str, JsonElement jsonElement, InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d) {
                return ((ITransport) this.receiver).changeSessionMetadata(str, jsonElement, interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$join$2$2, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class AnonymousClass2 extends C22672i implements InterfaceC4351m {
            public AnonymousClass2(Object obj) {
                super(2, 0, ITransport.class, obj, "getSessionMetadata", "getSessionMetadata(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(String str, InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d) {
                return ((ITransport) this.receiver).getSessionMetadata(str, interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$join$2$3, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class AnonymousClass3 extends C22672i implements InterfaceC4351m {
            public AnonymousClass3(Object obj) {
                super(2, 0, ITransport.class, obj, "setMetadataListener", "setMetadataListener(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(List<String> list, InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d) {
                return ((ITransport) this.receiver).setMetadataListener(list, interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242272(HMSUpdateListener hMSUpdateListener, HMSConfig hMSConfig, InterfaceC30057d<? super C242272> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsUpdateListener = hMSUpdateListener;
            this.$config = hMSConfig;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242272(this.$hmsUpdateListener, this.$config, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242272) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00b5  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            HMSLocalPeer hMSLocalPeer;
            HMSLocalPeer hMSLocalPeer2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SDKDelegate.this.timeBeforeJoin = System.currentTimeMillis();
                if (SDKDelegate.this.hasJoined) {
                    this.$hmsUpdateListener.onError(ErrorFactory.WebsocketMethodErrors.AlreadyJoined$default(ErrorFactory.WebsocketMethodErrors.INSTANCE, ErrorFactory.Action.JOIN, null, null, null, 14, null));
                    return c23454a0;
                }
                SDKDelegate.this.isQalink.updateIsQaLink(this.$config);
                SDKDelegate.this.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.JOIN_CALL);
                SDKDelegate.this.setHmsConfig(this.$config);
                InterfaceC30061h interfaceC30061h = SDKDelegate.this.lowSpeedDuringPreviewEarlyWarning;
                if (interfaceC30061h != null) {
                    ((C3060t1) interfaceC30061h).cancel((CancellationException) null);
                }
                SDKDelegate.this.previewSpeedTestUseCase.close();
                SDKDelegate.this.errorListener = this.$hmsUpdateListener;
                SDKDelegate.this.hmsUpdateListener = this.$hmsUpdateListener;
                if (SDKDelegate.this.store.getLocalPeer() == null) {
                    z4 = false;
                } else {
                    HMSLocalPeer localPeer = SDKDelegate.this.store.getLocalPeer();
                    if (AbstractC22676k.m65745e(localPeer != null ? localPeer.getName() : null, this.$config.getUserName())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                }
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SDKDelegate.this.store.initWithConfig(this.$config);
                    HMSLogger.m71136d("Profiling", "time taken to parse auth token : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    if (SDKDelegate.this.store.getHmsSessionStore() == null) {
                        SDKDelegate.this.store.setHmsSessionStore(new HmsSessionStore(new AnonymousClass1(SDKDelegate.this.getTransportLayer()), new AnonymousClass2(SDKDelegate.this.getTransportLayer()), new AnonymousClass3(SDKDelegate.this.getTransportLayer()), null, 8, null));
                    }
                    SDKDelegate.this.createHmsInteractivityCenterIfNeeded();
                    HMSLocalPeer localPeer2 = SDKDelegate.this.store.getLocalPeer();
                    if (localPeer2 != null) {
                        SDKDelegate sDKDelegate = SDKDelegate.this;
                        HMSConfig hMSConfig = this.$config;
                        InterfaceC30063j coroutineContext = HMSCoroutineScope.INSTANCE.getCoroutineContext();
                        SDKDelegate$join$2$4$1 sDKDelegate$join$2$4$1 = new SDKDelegate$join$2$4$1(sDKDelegate, hMSConfig, localPeer2, localPeer2, z4, null);
                        this.L$0 = localPeer2;
                        this.label = 1;
                        if (AbstractC3006f0.m8705K(coroutineContext, sDKDelegate$join$2$4$1, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        hMSLocalPeer2 = localPeer2;
                    } else {
                        HMSLogger.m71137e(SDKDelegate.TAG, "Local Peer is null");
                        hMSLocalPeer = localPeer2;
                    }
                    ITransport.DefaultImpls.updateAnalyticsParams$default(SDKDelegate.this.getTransportLayer(), this.$config.getAuthtoken(), null, hMSLocalPeer, SDKDelegate.this.store.get_room(), null, 16, null);
                    return c23454a0;
                } catch (HMSException e5) {
                    SDKDelegate.this.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.JOIN_CALL).fireJoinPerformanceMeasurementEvent$lib_release(false);
                    this.$hmsUpdateListener.onError(e5);
                    return c23454a0;
                }
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMSLocalPeer2 = (HMSLocalPeer) this.L$0;
            AbstractC34132o.m107864I(obj);
            hMSLocalPeer = hMSLocalPeer2;
            ITransport.DefaultImpls.updateAnalyticsParams$default(SDKDelegate.this.getTransportLayer(), this.$config.getAuthtoken(), null, hMSLocalPeer, SDKDelegate.this.store.get_room(), null, 16, null);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$leave$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$leave$2", m100430f = "SDKDelegate.kt", m100431l = {1806, 1809, 1813}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242282 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $notifyServer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242282(boolean z4, InterfaceC30057d<? super C242282> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$notifyServer = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C242282 c242282 = SDKDelegate.this.new C242282(this.$notifyServer, interfaceC30057d);
            c242282.L$0 = obj;
            return c242282;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242282) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0064  */
        /* JADX WARN: Code duplicated, block: B:33:0x0074  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        
            if (live.hms.video.utils.HmsExtensionKt.stopScreenShareSuspend(r1, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        
            if (live.hms.video.utils.HmsExtensionKt.stopAudioShareSuspend(r8, r7) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
        
            if (r8.leaveMeeting(r1, r7) == r0) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2d
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r8)
                goto L91
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L21
                goto L74
            L21:
                r8 = move-exception
                goto L71
            L23:
                java.lang.Object r1 = r7.L$0
                bc3.c0 r1 = (bc3.InterfaceC2994c0) r1
                p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Throwable -> L2b
                goto L5c
            L2b:
                r8 = move-exception
                goto L59
            L2d:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.L$0
                bc3.c0 r8 = (bc3.InterfaceC2994c0) r8
                live.hms.video.sdk.SDKDelegate r1 = live.hms.video.sdk.SDKDelegate.this
                java.util.concurrent.atomic.AtomicBoolean r1 = live.hms.video.sdk.SDKDelegate.access$isLeaveInProgressAtomic$p(r1)
                r1.set(r5)
                java.lang.String r1 = "SDKDelegate"
                java.lang.String r6 = "Leave initiated ..."
                live.hms.video.utils.HMSLogger.m71136d(r1, r6)
                live.hms.video.sdk.SDKDelegate r1 = live.hms.video.sdk.SDKDelegate.this
                boolean r1 = r1.getIsScreenShared()
                if (r1 == 0) goto L5c
                live.hms.video.sdk.SDKDelegate r1 = live.hms.video.sdk.SDKDelegate.this
                r7.L$0 = r8     // Catch: java.lang.Throwable -> L2b
                r7.label = r5     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r8 = live.hms.video.utils.HmsExtensionKt.stopScreenShareSuspend(r1, r7)     // Catch: java.lang.Throwable -> L2b
                if (r8 != r0) goto L5c
                goto L90
            L59:
                p505ts.AbstractC34132o.m107888l(r8)
            L5c:
                live.hms.video.sdk.SDKDelegate r8 = live.hms.video.sdk.SDKDelegate.this
                boolean r8 = r8.getIsAudioShared()
                if (r8 == 0) goto L74
                live.hms.video.sdk.SDKDelegate r8 = live.hms.video.sdk.SDKDelegate.this
                r7.L$0 = r2     // Catch: java.lang.Throwable -> L21
                r7.label = r4     // Catch: java.lang.Throwable -> L21
                java.lang.Object r8 = live.hms.video.utils.HmsExtensionKt.stopAudioShareSuspend(r8, r7)     // Catch: java.lang.Throwable -> L21
                if (r8 != r0) goto L74
                goto L90
            L71:
                p505ts.AbstractC34132o.m107888l(r8)
            L74:
                live.hms.video.sdk.SDKDelegate r8 = live.hms.video.sdk.SDKDelegate.this
                live.hms.video.connection.degredation.WebRtcStatsMonitor r8 = live.hms.video.sdk.SDKDelegate.access$getWebrtcStatsMonitor$p(r8)
                r8.forcePublishStats()
                live.hms.video.sdk.SDKDelegate r8 = live.hms.video.sdk.SDKDelegate.this
                live.hms.video.sdk.SDKDelegate.access$clearPluginPendingState(r8)
                live.hms.video.sdk.SDKDelegate r8 = live.hms.video.sdk.SDKDelegate.this
                boolean r1 = r7.$notifyServer
                r7.L$0 = r2
                r7.label = r3
                java.lang.Object r8 = live.hms.video.sdk.SDKDelegate.access$leaveMeeting(r8, r1, r7)
                if (r8 != r0) goto L91
            L90:
                return r0
            L91:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.C242282.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$leaveMeeting$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1828}, m100432m = "leaveMeeting")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242291 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C242291(InterfaceC30057d<? super C242291> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.leaveMeeting(false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$lowerRemotePeerHand$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$lowerRemotePeerHand$1", m100430f = "SDKDelegate.kt", m100431l = {2190}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242301 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $actionlistener;
        final /* synthetic */ HMSPeer $forPeer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242301(HMSPeer hMSPeer, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242301> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$forPeer = hMSPeer;
            this.$actionlistener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242301(this.$forPeer, this.$actionlistener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242301) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String peerID = this.$forPeer.getPeerID();
                    this.label = 1;
                    if (transportLayer.groupRemove(peerID, SDKDelegate.HAND_RAISE_GROUP_NAME, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$actionlistener.onSuccess();
            } catch (HMSException e5) {
                this.$actionlistener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$onJoinSuccess$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242312 extends C22672i implements Function1 {
        public C242312(Object obj) {
            super(1, 0, SDKDelegate.class, obj, "fireUpdates", "fireUpdates(Ljava/util/List;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends SDKUpdate>) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(List<? extends SDKUpdate> p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((SDKDelegate) this.receiver).fireUpdates(p13);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$onPolicyChangeHandled$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {716, 725, 746, 769, 772, 779}, m100432m = "onPolicyChangeHandled")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242321 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C242321(InterfaceC30057d<? super C242321> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.onPolicyChangeHandled(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$peerIteratorNext$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$peerIteratorNext$1", m100430f = "SDKDelegate.kt", m100431l = {2226}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242331 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $iteratorID;
        final /* synthetic */ int $limit;
        final /* synthetic */ FindPeerListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242331(String str, int i13, FindPeerListener findPeerListener, InterfaceC30057d<? super C242331> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$iteratorID = str;
            this.$limit = i13;
            this.$listener = findPeerListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242331(this.$iteratorID, this.$limit, this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242331) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String str = this.$iteratorID;
                    int i14 = this.$limit;
                    this.label = 1;
                    obj = transportLayer.peerIteratorNext(str, i14, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$listener.onResult((FindPeerResponse) obj);
            } catch (HMSException e5) {
                this.$listener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$preview$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$preview$2", m100430f = "SDKDelegate.kt", m100431l = {1414}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242342 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSConfig $config;
        final /* synthetic */ HMSPreviewListener $listener;
        int label;

        /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$preview$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$preview$2$1", m100430f = "SDKDelegate.kt", m100431l = {DateTimeConstants.MINUTES_PER_DAY}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ HMSConfig $config;
            final /* synthetic */ HMSPreviewListener $listener;
            final /* synthetic */ HMSLocalPeer $peer;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final /* synthetic */ SDKDelegate this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HMSLocalPeer hMSLocalPeer, SDKDelegate sDKDelegate, HMSPreviewListener hMSPreviewListener, HMSConfig hMSConfig, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.$peer = hMSLocalPeer;
                this.this$0 = sDKDelegate;
                this.$listener = hMSPreviewListener;
                this.$config = hMSConfig;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$3$lambda$0(SDKDelegate sDKDelegate, InterfaceC2994c0 interfaceC2994c0) {
                sDKDelegate.lowSpeedDuringPreviewEarlyWarning = AbstractC3006f0.m8711e(interfaceC2994c0, AbstractC3050q0.f12077a, new SDKDelegate$preview$2$1$1$onTimeout$1$1(sDKDelegate, null), 2);
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$3$lambda$1(SDKDelegate sDKDelegate) {
                InterfaceC30061h interfaceC30061h = sDKDelegate.lowSpeedDuringPreviewEarlyWarning;
                if (interfaceC30061h == null) {
                    return null;
                }
                ((C3060t1) interfaceC30061h).cancel((CancellationException) null);
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$3$lambda$2(InterfaceC4339a interfaceC4339a) {
                interfaceC4339a.invoke();
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$peer, this.this$0, this.$listener, this.$config, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                SDKDelegate sDKDelegate;
                Object objConnect;
                SDKDelegate sDKDelegate2;
                InterfaceC4339a interfaceC4339a;
                InterfaceC4339a interfaceC4339a2;
                HMSConfig hMSConfig;
                ServerConfiguration serverConfiguration;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
                        HMSLocalPeer hMSLocalPeer = this.$peer;
                        if (hMSLocalPeer != null) {
                            sDKDelegate = this.this$0;
                            HMSPreviewListener hMSPreviewListener = this.$listener;
                            HMSConfig hMSConfig2 = this.$config;
                            sDKDelegate.hmsPreviewListener = hMSPreviewListener;
                            InterfaceC30061h interfaceC30061h = sDKDelegate.lowSpeedDuringPreviewEarlyWarning;
                            if (interfaceC30061h != null) {
                                ((C3060t1) interfaceC30061h).cancel((CancellationException) null);
                            }
                            C24264e c24264e = new C24264e(sDKDelegate, interfaceC2994c0, 0);
                            C24265f c24265f = new C24265f(sDKDelegate, 0);
                            ITransport transportLayer = sDKDelegate.getTransportLayer();
                            String authtoken = hMSConfig2.getAuthtoken();
                            String initEndpoint = hMSConfig2.getInitEndpoint();
                            String peerID = hMSLocalPeer.getPeerID();
                            RetrySchedulerState retrySchedulerState = RetrySchedulerState.PREVIEW;
                            PerformanceMeasurement performanceMeasurement = sDKDelegate.getPerformanceMeasurement();
                            Function1 sdkStoreConfig = sDKDelegate.setSdkStoreConfig(sDKDelegate.store);
                            this.L$0 = sDKDelegate;
                            this.L$1 = hMSConfig2;
                            this.L$2 = c24264e;
                            this.L$3 = c24265f;
                            this.L$4 = sDKDelegate;
                            this.label = 1;
                            objConnect = transportLayer.connect(authtoken, initEndpoint, peerID, retrySchedulerState, performanceMeasurement, sdkStoreConfig, this);
                            if (objConnect == enumC31071a) {
                                return enumC31071a;
                            }
                            sDKDelegate2 = sDKDelegate;
                            interfaceC4339a = c24264e;
                            interfaceC4339a2 = c24265f;
                            hMSConfig = hMSConfig2;
                        } else {
                            HMSLogger.m71137e(SDKDelegate.TAG, "Local Peer is null");
                        }
                        return C23454a0.f92919a;
                    }
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SDKDelegate sDKDelegate3 = (SDKDelegate) this.L$4;
                    interfaceC4339a2 = (InterfaceC4339a) this.L$3;
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) this.L$2;
                    HMSConfig hMSConfig3 = (HMSConfig) this.L$1;
                    sDKDelegate2 = (SDKDelegate) this.L$0;
                    AbstractC34132o.m107864I(obj);
                    sDKDelegate = sDKDelegate3;
                    interfaceC4339a = interfaceC4339a3;
                    hMSConfig = hMSConfig3;
                    objConnect = obj;
                    sDKDelegate.initConfig = (InitConfig) objConnect;
                    sDKDelegate2.updateConfig();
                    SpeedTestUseCase speedTestUseCase = sDKDelegate2.previewSpeedTestUseCase;
                    InitConfig initConfig = sDKDelegate2.initConfig;
                    SpeedTestUseCase.speedTestAndNotify$default(speedTestUseCase, hMSConfig, (initConfig == null || (serverConfiguration = initConfig.getServerConfiguration()) == null) ? null : serverConfiguration.getNetworkHealth(), sDKDelegate2.store, sDKDelegate2.hmsPreviewListener, sDKDelegate2.getTransportLayer().getAnalyticsEventsService(), interfaceC4339a, new C24261b(interfaceC4339a2, 1), null, 128, null);
                    HMSLogger.m71136d("profiling", "preview under lock done ");
                } catch (HMSException e5) {
                    this.this$0.getPerformanceMeasurement().firePreviewPerformanceMeasurementEvent$lib_release(false);
                    this.$listener.onError(e5);
                    this.this$0.store.set_room(null);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242342(HMSPreviewListener hMSPreviewListener, HMSConfig hMSConfig, InterfaceC30057d<? super C242342> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$listener = hMSPreviewListener;
            this.$config = hMSConfig;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242342(this.$listener, this.$config, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242342) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!SDKDelegate.this.hasJoined) {
                    SDKDelegate.this.errorListener = this.$listener;
                }
                SDKDelegate.this.isQalink.updateIsQaLink(this.$config);
                SDKDelegate.this.getPerformanceMeasurement().startPreview$lib_release();
                if (SDKDelegate.this.getTransportLayer().isSocketConnectionOpen()) {
                    this.$listener.onError(ErrorFactory.WebsocketMethodErrors.PreviewAlreadyStarted$default(ErrorFactory.WebsocketMethodErrors.INSTANCE, ErrorFactory.Action.PREVIEW, null, null, null, 14, null));
                    return c23454a0;
                }
                SDKDelegate.this.isPreviewListenerCalled = false;
                SDKDelegate.this.store.initWithConfig(this.$config);
                HMSLocalPeer localPeer = SDKDelegate.this.store.getLocalPeer();
                ITransport.DefaultImpls.updateAnalyticsParams$default(SDKDelegate.this.getTransportLayer(), this.$config.getAuthtoken(), null, localPeer, SDKDelegate.this.store.get_room(), null, 16, null);
                InterfaceC30063j coroutineContext = HMSCoroutineScope.INSTANCE.getCoroutineContext();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(localPeer, SDKDelegate.this, this.$listener, this.$config, null);
                this.label = 1;
                if (AbstractC3006f0.m8705K(coroutineContext, anonymousClass1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$previewForRole$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1325, 1331, 1354}, m100432m = "previewForRole")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242351 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C242351(InterfaceC30057d<? super C242351> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.previewForRole(null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$publishLocalTracks$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1718}, m100432m = "publishLocalTracks")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242361 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C242361(InterfaceC30057d<? super C242361> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.publishLocalTracks(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$publishScreenShareTrack$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1746}, m100432m = "publishScreenShareTrack")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242371 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C242371(InterfaceC30057d<? super C242371> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.publishScreenShareTrack(null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$removePeer$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$removePeer$1", m100430f = "SDKDelegate.kt", m100431l = {2018}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242381 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSRemotePeer $peer;
        final /* synthetic */ String $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242381(HMSRemotePeer hMSRemotePeer, String str, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242381> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$peer = hMSRemotePeer;
            this.$reason = str;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242381(this.$peer, this.$reason, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242381) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String peerID = this.$peer.getPeerID();
                    String str = this.$reason;
                    this.label = 1;
                    if (transportLayer.removePeerRequest(peerID, str, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$roleChangeAccept$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$roleChangeAccept$1", m100430f = "SDKDelegate.kt", m100431l = {1698}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242391 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSRoleChangeRequest $hmsRoleChangeRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242391(HMSRoleChangeRequest hMSRoleChangeRequest, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242391> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsRoleChangeRequest = hMSRoleChangeRequest;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242391(this.$hmsRoleChangeRequest, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242391) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    String token$lib_release = this.$hmsRoleChangeRequest.getToken$lib_release();
                    String name = this.$hmsRoleChangeRequest.getSuggestedRole().getName();
                    HMSPeer requestedBy = this.$hmsRoleChangeRequest.getRequestedBy();
                    this.label = 1;
                    if (transportLayer.roleChangeAccept(token$lib_release, name, requestedBy, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$roleChangeRequest$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$roleChangeRequest$1", m100430f = "SDKDelegate.kt", m100431l = {1682, 1684}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242401 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSPeer $forPeer;
        final /* synthetic */ boolean $force;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSRole $toRole;
        int label;
        final /* synthetic */ SDKDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242401(HMSPeer hMSPeer, SDKDelegate sDKDelegate, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242401> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$forPeer = hMSPeer;
            this.this$0 = sDKDelegate;
            this.$toRole = hMSRole;
            this.$force = z4;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242401(this.$forPeer, this.this$0, this.$toRole, this.$force, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242401) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            if (r6.roleChangeRequest(r1, r3, r4, r5) == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Lc
                if (r1 != r2) goto L12
            Lc:
                p505ts.AbstractC34132o.m107864I(r6)     // Catch: live.hms.video.error.HMSException -> L10
                goto L5d
            L10:
                r6 = move-exception
                goto L63
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                p505ts.AbstractC34132o.m107864I(r6)
                live.hms.video.sdk.models.HMSPeer r6 = r5.$forPeer     // Catch: live.hms.video.error.HMSException -> L10
                boolean r6 = r6.getIsLocal()     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 == 0) goto L40
                live.hms.video.sdk.SDKDelegate r6 = r5.this$0     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.transport.ITransport r6 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r6)     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.sdk.models.HMSPeer r1 = r5.$forPeer     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r1 = r1.getPeerID()     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.sdk.models.role.HMSRole r2 = r5.$toRole     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r2 = r2.getName()     // Catch: live.hms.video.error.HMSException -> L10
                r5.label = r3     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.Object r6 = r6.roleChangeRequest(r1, r2, r3, r5)     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 != r0) goto L5d
                goto L5c
            L40:
                live.hms.video.sdk.SDKDelegate r6 = r5.this$0     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.transport.ITransport r6 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r6)     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.sdk.models.HMSPeer r1 = r5.$forPeer     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r1 = r1.getPeerID()     // Catch: live.hms.video.error.HMSException -> L10
                live.hms.video.sdk.models.role.HMSRole r3 = r5.$toRole     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.String r3 = r3.getName()     // Catch: live.hms.video.error.HMSException -> L10
                boolean r4 = r5.$force     // Catch: live.hms.video.error.HMSException -> L10
                r5.label = r2     // Catch: live.hms.video.error.HMSException -> L10
                java.lang.Object r6 = r6.roleChangeRequest(r1, r3, r4, r5)     // Catch: live.hms.video.error.HMSException -> L10
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                live.hms.video.sdk.HMSActionResultListener r6 = r5.$hmsActionResultListener     // Catch: live.hms.video.error.HMSException -> L10
                r6.onSuccess()     // Catch: live.hms.video.error.HMSException -> L10
                goto L68
            L63:
                live.hms.video.sdk.HMSActionResultListener r0 = r5.$hmsActionResultListener
                r0.onError(r6)
            L68:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.C242401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$safeGetAllPollQuestions$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {2310}, m100432m = "safeGetAllPollQuestions")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242411 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C242411(InterfaceC30057d<? super C242411> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.safeGetAllPollQuestions(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$searchPeerName$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$searchPeerName$2", m100430f = "SDKDelegate.kt", m100431l = {2447}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242422 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $limit;
        final /* synthetic */ HmsTypedActionResultListener<PeerSearchResponse> $listener;
        final /* synthetic */ long $offset;
        final /* synthetic */ String $query;
        Object L$0;
        int label;
        final /* synthetic */ SDKDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242422(String str, HmsTypedActionResultListener<PeerSearchResponse> hmsTypedActionResultListener, SDKDelegate sDKDelegate, long j7, int i13, InterfaceC30057d<? super C242422> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$query = str;
            this.$listener = hmsTypedActionResultListener;
            this.this$0 = sDKDelegate;
            this.$offset = j7;
            this.$limit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242422(this.$query, this.$listener, this.this$0, this.$offset, this.$limit, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242422) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007f  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C242422 c242422;
            SDKStore sDKStore;
            HMSException hMSException;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.$query.length() == 0) {
                    this.$listener.onSuccess(new PeerSearchResponse(this.this$0.store, C25271y.f99162w, true, this.$offset, 0L, this.$limit));
                } else {
                    try {
                        SDKStore sDKStore2 = this.this$0.store;
                        ITransport transportLayer = this.this$0.getTransportLayer();
                        String str = this.$query;
                        int i14 = this.$limit;
                        long j7 = this.$offset;
                        this.L$0 = sDKStore2;
                        this.label = 1;
                        c242422 = this;
                        try {
                            Object objPeerNameSearch = transportLayer.peerNameSearch(str, i14, j7, c242422);
                            if (objPeerNameSearch == enumC31071a) {
                                return enumC31071a;
                            }
                            sDKStore = sDKStore2;
                            obj = objPeerNameSearch;
                        } catch (HMSException e5) {
                            e = e5;
                            hMSException = e;
                            if (!(hMSException.getCause() instanceof CancellationException)) {
                                c242422.$listener.onError(hMSException);
                            }
                        }
                    } catch (HMSException e13) {
                        e = e13;
                        c242422 = this;
                        hMSException = e;
                        if (!(hMSException.getCause() instanceof CancellationException)) {
                            c242422.$listener.onError(hMSException);
                        }
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sDKStore = (SDKStore) this.L$0;
            try {
                AbstractC34132o.m107864I(obj);
                c242422 = this;
            } catch (HMSException e14) {
                hMSException = e14;
                c242422 = this;
                if (!(hMSException.getCause() instanceof CancellationException)) {
                    c242422.$listener.onError(hMSException);
                }
            }
            c242422.$listener.onSuccess(new PeerSearchResponse(sDKStore, (PeerNameSearchResponse) obj));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$send$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$send$1", m100430f = "SDKDelegate.kt", m100431l = {2005}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242431 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSMessage $hmsMessage;
        final /* synthetic */ HMSMessageResultListener $hmsMessageResultListener;
        int label;
        final /* synthetic */ SDKDelegate this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242431(HMSMessage hMSMessage, SDKDelegate sDKDelegate, HMSMessageResultListener hMSMessageResultListener, InterfaceC30057d<? super C242431> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsMessage = hMSMessage;
            this.this$0 = sDKDelegate;
            this.$hmsMessageResultListener = hMSMessageResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242431(this.$hmsMessage, this.this$0, this.$hmsMessageResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242431) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = this.$hmsMessage.getRecipient().getRecipientRoles().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((HMSRole) it.next()).getName());
                    }
                    HMSNotifications.BroadcastInfo broadcastInfo = new HMSNotifications.BroadcastInfo(this.$hmsMessage.getMessage(), this.$hmsMessage.getType());
                    HMSPeer recipientPeer = this.$hmsMessage.getRecipient().getRecipientPeer();
                    HMSParams.SendBroadcast sendBroadcast = new HMSParams.SendBroadcast(broadcastInfo, recipientPeer != null ? recipientPeer.getPeerID() : null, arrayList);
                    ITransport transportLayer = this.this$0.getTransportLayer();
                    this.label = 1;
                    obj = transportLayer.sendMessage(sendBroadcast, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                HMSMessageSendResponse hMSMessageSendResponse = (HMSMessageSendResponse) obj;
                HMSMessageResultListener hMSMessageResultListener = this.$hmsMessageResultListener;
                String messageId = hMSMessageSendResponse.getMessageId();
                if (messageId == null) {
                    messageId = "";
                }
                hMSMessageResultListener.onSuccess(HMSMessage.copy$default(this.$hmsMessage, null, null, null, hMSMessageSendResponse.getTimestamp(), null, messageId, 23, null));
            } catch (HMSException e5) {
                this.$hmsMessageResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$setHlsSessionMetadata$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$setHlsSessionMetadata$1", m100430f = "SDKDelegate.kt", m100431l = {2280}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242441 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ List<HMSHLSTimedMetadata> $metadataModelList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242441(List<HMSHLSTimedMetadata> list, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242441> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$metadataModelList = list;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242441(this.$metadataModelList, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242441) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    List<HMSHLSTimedMetadata> list = this.$metadataModelList;
                    this.label = 1;
                    if (transportLayer.setHlsSessionMetadata(list, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$startAudioshare$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$startAudioshare$1", m100430f = "SDKDelegate.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242451 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ AudioMixingMode $audioMixingMode;
        final /* synthetic */ Intent $mediaProjectionPermissionResultData;
        final /* synthetic */ HMSActionResultListener $resultListener;
        final /* synthetic */ Notification $screenShareNotification;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242451(HMSActionResultListener hMSActionResultListener, Intent intent, AudioMixingMode audioMixingMode, Notification notification, InterfaceC30057d<? super C242451> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$resultListener = hMSActionResultListener;
            this.$mediaProjectionPermissionResultData = intent;
            this.$audioMixingMode = audioMixingMode;
            this.$screenShareNotification = notification;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C242451 c242451 = SDKDelegate.this.new C242451(this.$resultListener, this.$mediaProjectionPermissionResultData, this.$audioMixingMode, this.$screenShareNotification, interfaceC30057d);
            c242451.L$0 = obj;
            return c242451;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242451) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!SDKDelegate.this.getIsAudioShared()) {
                SDKDelegate sDKDelegate = SDKDelegate.this;
                try {
                    sDKDelegate.audioShareCapturer = sDKDelegate.getTransportLayer().getAudioShareCapturer(sDKDelegate.applicationContext, this.$mediaProjectionPermissionResultData, this.$audioMixingMode, this.$screenShareNotification);
                    HMSCapturer hMSCapturer = sDKDelegate.audioShareCapturer;
                    if (hMSCapturer != null) {
                        hMSCapturer.start();
                        objM107888l = hMSCapturer;
                    } else {
                        objM107888l = null;
                    }
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l instanceof C23467m) {
                    SDKDelegate.this.setAudioShared(false);
                    HMSActionResultListener hMSActionResultListener = this.$resultListener;
                    ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
                    ErrorFactory.Action action = ErrorFactory.Action.NONE;
                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a == null) {
                        thM68037a = new UnknownError();
                    }
                    hMSActionResultListener.onError(ErrorFactory.GenericErrors.Unknown$default(genericErrors, action, "Failed to share audio", thM68037a, null, 8, null));
                } else {
                    this.$resultListener.onSuccess();
                    SDKDelegate.this.setAudioShared(true);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$startHLSStreaming$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$startHLSStreaming$1", m100430f = "SDKDelegate.kt", m100431l = {2089}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242461 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSHLSConfig $config;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242461(HMSHLSConfig hMSHLSConfig, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242461> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$config = hMSHLSConfig;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242461(this.$config, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242461) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    HMSHLSConfig hMSHLSConfig = this.$config;
                    this.label = 1;
                    if (transportLayer.startHLSStreaming(hMSHLSConfig, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$startRealTimeTranscription$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$startRealTimeTranscription$1", m100430f = "SDKDelegate.kt", m100431l = {2411}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242471 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $listener;
        final /* synthetic */ TranscriptionsMode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242471(TranscriptionsMode transcriptionsMode, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242471> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mode = transcriptionsMode;
            this.$listener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242471(this.$mode, this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242471) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    TranscriptionsMode transcriptionsMode = this.$mode;
                    this.label = 1;
                    if (transportLayer.startRealTimeTranscription(transcriptionsMode, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$listener.onSuccess();
            } catch (HMSException e5) {
                this.$listener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$startRtmpOrRecording$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$startRtmpOrRecording$1", m100430f = "SDKDelegate.kt", m100431l = {2073}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242481 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSRecordingConfig $config;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242481(HMSRecordingConfig hMSRecordingConfig, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242481> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$config = hMSRecordingConfig;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242481(this.$config, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242481) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    HMSRecordingConfig hMSRecordingConfig = this.$config;
                    this.label = 1;
                    if (transportLayer.startRtmpOrRecording(hMSRecordingConfig, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$startScreenshare$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$startScreenshare$1", m100430f = "SDKDelegate.kt", m100431l = {839, 847}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242491 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Intent $mediaProjectionPermissionResultData;
        final /* synthetic */ HMSActionResultListener $resultListener;
        final /* synthetic */ Notification $screenShareNotification;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242491(Intent intent, Notification notification, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242491> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mediaProjectionPermissionResultData = intent;
            this.$screenShareNotification = notification;
            this.$resultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242491(this.$mediaProjectionPermissionResultData, this.$screenShareNotification, this.$resultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242491) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
        
            if (r1.publishScreenShareTrack(r11, r3, r10) == r0) goto L40;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p505ts.AbstractC34132o.m107864I(r11)
                r9 = r10
                goto Lc4
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                p505ts.AbstractC34132o.m107864I(r11)
                r9 = r10
                goto La9
            L20:
                p505ts.AbstractC34132o.m107864I(r11)
                live.hms.video.sdk.SDKDelegate r11 = live.hms.video.sdk.SDKDelegate.this
                live.hms.video.sdk.SDKStore r11 = live.hms.video.sdk.SDKDelegate.access$getStore$p(r11)
                live.hms.video.sdk.models.role.HMSRole r11 = r11.getRole()
                live.hms.video.media.settings.HMSTrackSettings$Builder r1 = new live.hms.video.media.settings.HMSTrackSettings$Builder
                r1.<init>()
                live.hms.video.media.settings.HMSVideoTrackSettings$Builder r4 = new live.hms.video.media.settings.HMSVideoTrackSettings$Builder
                r4.<init>()
                if (r11 == 0) goto L4a
                live.hms.video.sdk.models.role.PublishParams r5 = r11.getPublishParams()
                if (r5 == 0) goto L4a
                live.hms.video.sdk.models.role.VideoParams r5 = r5.getScreen()
                if (r5 == 0) goto L4a
                int r5 = r5.getFrameRate()
                goto L4c
            L4a:
                r5 = 30
            L4c:
                live.hms.video.media.settings.HMSVideoTrackSettings$Builder r4 = r4.maxFrameRate(r5)
                live.hms.video.media.settings.HMSVideoResolution r5 = new live.hms.video.media.settings.HMSVideoResolution
                if (r11 == 0) goto L65
                live.hms.video.sdk.models.role.PublishParams r6 = r11.getPublishParams()
                if (r6 == 0) goto L65
                live.hms.video.sdk.models.role.VideoParams r6 = r6.getScreen()
                if (r6 == 0) goto L65
                int r6 = r6.getWidth()
                goto L67
            L65:
                r6 = 1920(0x780, float:2.69E-42)
            L67:
                if (r11 == 0) goto L7a
                live.hms.video.sdk.models.role.PublishParams r11 = r11.getPublishParams()
                if (r11 == 0) goto L7a
                live.hms.video.sdk.models.role.VideoParams r11 = r11.getScreen()
                if (r11 == 0) goto L7a
                int r11 = r11.getHeight()
                goto L7c
            L7a:
                r11 = 1080(0x438, float:1.513E-42)
            L7c:
                r5.<init>(r6, r11)
                live.hms.video.media.settings.HMSVideoTrackSettings$Builder r11 = r4.resolution(r5)
                live.hms.video.media.settings.HMSVideoTrackSettings r11 = r11.build()
                live.hms.video.media.settings.HMSTrackSettings$Builder r11 = r1.video(r11)
                live.hms.video.media.settings.HMSTrackSettings r6 = r11.build()
                live.hms.video.sdk.SDKDelegate r11 = live.hms.video.sdk.SDKDelegate.this
                live.hms.video.transport.ITransport r4 = live.hms.video.sdk.SDKDelegate.access$getTransportLayer(r11)
                live.hms.video.sdk.SDKDelegate r11 = live.hms.video.sdk.SDKDelegate.this
                android.content.Context r5 = live.hms.video.sdk.SDKDelegate.access$getApplicationContext$p(r11)
                android.content.Intent r7 = r10.$mediaProjectionPermissionResultData
                android.app.Notification r8 = r10.$screenShareNotification
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.getScreenShareTrack(r5, r6, r7, r8, r9)
                if (r11 != r0) goto La9
                goto Lc3
            La9:
                live.hms.video.media.tracks.HMSTrack r11 = (live.hms.video.media.tracks.HMSTrack) r11
                if (r11 == 0) goto Lc4
                live.hms.video.sdk.SDKDelegate r1 = live.hms.video.sdk.SDKDelegate.this
                live.hms.video.sdk.HMSActionResultListener r3 = r9.$resultListener
                r4 = r11
                live.hms.video.media.tracks.HMSLocalVideoTrack r4 = (live.hms.video.media.tracks.HMSLocalVideoTrack) r4
                live.hms.video.media.capturers.HMSCapturer r4 = r4.getCapturer()
                r4.start()
                r9.label = r2
                java.lang.Object r11 = live.hms.video.sdk.SDKDelegate.access$publishScreenShareTrack(r1, r11, r3, r10)
                if (r11 != r0) goto Lc4
            Lc3:
                return r0
            Lc4:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.C242491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$stopAudioshare$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$stopAudioshare$1", m100430f = "SDKDelegate.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242501 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $resultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242501(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242501> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$resultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242501(this.$resultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242501) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Object obj2 = SDKDelegate.this.audioLock;
            SDKDelegate sDKDelegate = SDKDelegate.this;
            synchronized (obj2) {
                sDKDelegate.getHmsAudioManager().setAudioMode(3);
            }
            HMSCapturer hMSCapturer = SDKDelegate.this.audioShareCapturer;
            if (hMSCapturer != null) {
                HMSActionResultListener hMSActionResultListener = this.$resultListener;
                hMSCapturer.stop();
                hMSActionResultListener.onSuccess();
            }
            SDKDelegate.this.setAudioShared(false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$stopHLSStreaming$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$stopHLSStreaming$1", m100430f = "SDKDelegate.kt", m100431l = {2105}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242511 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSHLSConfig $config;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242511(HMSHLSConfig hMSHLSConfig, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242511> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$config = hMSHLSConfig;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242511(this.$config, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242511) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    HMSHLSConfig hMSHLSConfig = this.$config;
                    this.label = 1;
                    if (transportLayer.stopHLSStreaming(hMSHLSConfig, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$stopRealTimeTranscription$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$stopRealTimeTranscription$1", m100430f = "SDKDelegate.kt", m100431l = {2422}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242521 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $listener;
        final /* synthetic */ TranscriptionsMode $mode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242521(TranscriptionsMode transcriptionsMode, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242521> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$mode = transcriptionsMode;
            this.$listener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242521(this.$mode, this.$listener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242521) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    TranscriptionsMode transcriptionsMode = this.$mode;
                    this.label = 1;
                    if (transportLayer.stopRealTimeTranscription(transcriptionsMode, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$listener.onSuccess();
            } catch (HMSException e5) {
                this.$listener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$stopRtmpAndRecording$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$stopRtmpAndRecording$1", m100430f = "SDKDelegate.kt", m100431l = {2119}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242531 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242531(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242531> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242531(this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242531) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                    this.label = 1;
                    if (transportLayer.stopRtmpAndRecording(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$stopScreenshare$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate$stopScreenshare$1", m100430f = "SDKDelegate.kt", m100431l = {861}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242541 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $resultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242541(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242541> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$resultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SDKDelegate.this.new C242541(this.$resultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242541) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ITransport transportLayer = SDKDelegate.this.getTransportLayer();
                this.label = 1;
                if (transportLayer.unpublishScreenshare(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            SDKDelegate.this.setScreenShared(false);
            ArrayList arrayList = new ArrayList();
            SDKDelegate.this.handleRemoveScreenshare(arrayList);
            SDKDelegate.this.fireUpdates(arrayList);
            this.$resultListener.onSuccess();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SDKDelegate$unPublishTracksIfNeeded$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SDKDelegate", m100430f = "SDKDelegate.kt", m100431l = {1023, 1026}, m100432m = "unPublishTracksIfNeeded")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242551 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C242551(InterfaceC30057d<? super C242551> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SDKDelegate.this.unPublishTracksIfNeeded(null, false, this);
        }
    }

    public SDKDelegate(Context applicationContext, HMSTrackSettings hmsTrackSettings, HMSLogSettings hmsLogSettings, SDKStore store, HMSAnalyticsEventLevel analyticsEventLevel, FrameworkInfo frameworkInfo, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        AbstractC22676k.m65750j(hmsLogSettings, "hmsLogSettings");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(analyticsEventLevel, "analyticsEventLevel");
        AbstractC22676k.m65750j(frameworkInfo, "frameworkInfo");
        this.applicationContext = applicationContext;
        this.hmsTrackSettings = hmsTrackSettings;
        this.hmsLogSettings = hmsLogSettings;
        this.store = store;
        this.frameworkInfo = frameworkInfo;
        this.haltPreviewJoinForPermissions = z4;
        this.iceGatheringOnAnyAddressPorts = z13;
        OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo = new OfflineAnalyticsPeerInfo();
        this.offlineAnalyticsPeerInfo = offlineAnalyticsPeerInfo;
        this.previewSpeedTestUseCase = new SpeedTestUseCase();
        this.permissionsHandler = AbstractC30060g.m92088H(new C24265f(this, 8));
        NoiseCancellationStatusChecker noiseCancellationStatusChecker = new NoiseCancellationStatusChecker(applicationContext, new C24265f(this, 2), new C24265f(this, 3));
        this.ncStatusChecker = noiseCancellationStatusChecker;
        final int i13 = 0;
        NoiseCancellationReportingUseCase noiseCancellationReportingUseCase = new NoiseCancellationReportingUseCase(hmsTrackSettings, noiseCancellationStatusChecker, new Function1(this) { // from class: live.hms.video.sdk.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SDKDelegate f95252x;

            {
                this.f95252x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return SDKDelegate.noiseCancellationReportingUseCase$lambda$3(this.f95252x, (AnalyticsEvent) obj);
                    case 1:
                        return SDKDelegate.onTranscriptionManager$lambda$11(this.f95252x, (HmsTranscripts) obj);
                    default:
                        return SDKDelegate.webrtcStatsMonitor$lambda$14(this.f95252x, (String) obj);
                }
            }
        });
        this.noiseCancellationReportingUseCase = noiseCancellationReportingUseCase;
        this.performanceMeasurement = AbstractC30060g.m92088H(new C24265f(this, 4));
        this.audioHandlerThread = AbstractC30060g.m92088H(new C24069a(10));
        this.audioHandler = AbstractC30060g.m92088H(new C24265f(this, 5));
        this.audioLock = new Object();
        this.trackFactory = new RemoteTrackFactory();
        this.transportObserver = new SDKDelegate$transportObserver$1(this);
        this.isQalink = new IsQaLink();
        this.transportLayer = AbstractC30060g.m92088H(new C24264e(this, analyticsEventLevel, 1));
        this.transportState = TransportState.Disconnected;
        this.audioDeviceListener = new HMSAudioManager.AudioManagerDeviceChangeListener() { // from class: live.hms.video.sdk.SDKDelegate$audioDeviceListener$1
            @Override // live.hms.video.audio.HMSAudioManager.AudioManagerDeviceChangeListener
            public void onAudioDeviceChanged(HMSAudioManager.AudioDevice selectedAudioDevice, Set<? extends HMSAudioManager.AudioDevice> availableAudioDevices) {
                AbstractC22676k.m65750j(selectedAudioDevice, "selectedAudioDevice");
                AbstractC22676k.m65750j(availableAudioDevices, "availableAudioDevices");
                HMSLogger.m71136d("SDKDelegate", "onAudioManagerDevicesChanged: " + availableAudioDevices + ", selected: " + selectedAudioDevice);
                HMSCoroutineScope hMSCoroutineScope = HMSCoroutineScope.INSTANCE;
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3006f0.m8732z(hMSCoroutineScope, AbstractC17182o.f65999a, null, new SDKDelegate$audioDeviceListener$1$onAudioDeviceChanged$1(this.this$0, selectedAudioDevice, availableAudioDevices, null), 2);
            }

            @Override // live.hms.video.audio.HMSAudioManager.AudioManagerDeviceChangeListener
            public void onAudioDeviceInfoChanged(HMSAudioManager.AudioDevice selectedAudioDevice, List<HMSAudioDeviceInfo> groupedAudioDevice) {
                AbstractC22676k.m65750j(selectedAudioDevice, "selectedAudioDevice");
                AbstractC22676k.m65750j(groupedAudioDevice, "groupedAudioDevice");
                HMSCoroutineScope hMSCoroutineScope = HMSCoroutineScope.INSTANCE;
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3006f0.m8732z(hMSCoroutineScope, AbstractC17182o.f65999a, null, new SDKDelegate$audioDeviceListener$1$onAudioDeviceInfoChanged$1(this.this$0, selectedAudioDevice, groupedAudioDevice, null), 2);
            }

            @Override // live.hms.video.audio.HMSAudioManager.AudioManagerDeviceChangeListener
            public void onError(HMSException e5) {
                AbstractC22676k.m65750j(e5, "e");
            }
        };
        this.hmsAudioManager = AbstractC30060g.m92088H(new C24265f(this, 6));
        this.hmsNetworkManager = Build.VERSION.SDK_INT >= 31 ? new HMSNetworkManagerApi31(applicationContext) : new HMSNetworkManagerLegacy(applicationContext);
        this.isLeaveInProgressAtomic = new AtomicBoolean(false);
        this.activeSpeakerManager = new ActiveSpeakerManager(store);
        this.broadcastManager = new BroadcastManager(store);
        final int i14 = 1;
        this.onTranscriptionManager = new OnTranscriptionManager(store, new Function1(this) { // from class: live.hms.video.sdk.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SDKDelegate f95252x;

            {
                this.f95252x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return SDKDelegate.noiseCancellationReportingUseCase$lambda$3(this.f95252x, (AnalyticsEvent) obj);
                    case 1:
                        return SDKDelegate.onTranscriptionManager$lambda$11(this.f95252x, (HmsTranscripts) obj);
                    default:
                        return SDKDelegate.webrtcStatsMonitor$lambda$14(this.f95252x, (String) obj);
                }
            }
        });
        OnPeerJoinManager onPeerJoinManager = new OnPeerJoinManager(store);
        this.onPeerJoinManager = onPeerJoinManager;
        OnPeerLeaveManager onPeerLeaveManager = new OnPeerLeaveManager(store);
        this.onPeerLeaveManager = onPeerLeaveManager;
        this.onPolicyChangeManager = new OnPolicyChangeManager(store, offlineAnalyticsPeerInfo, noiseCancellationReportingUseCase, new C24265f(this, 9));
        this.onRoleChangeRequestManager = new OnRoleChangeRequestManager(store);
        OnPeerUpdateManager onPeerUpdateManager = new OnPeerUpdateManager(store, onPeerLeaveManager);
        this.onPeerUpdateManager = onPeerUpdateManager;
        this.onPeerNetworkUpdateManager = new OnPeerNetworkUpdateManager(store);
        OnTrackAddManager onTrackAddManager = new OnTrackAddManager(store);
        this.onTrackAddManager = onTrackAddManager;
        OnTrackRemoveManager onTrackRemoveManager = new OnTrackRemoveManager(store);
        this.onTrackRemoveManager = onTrackRemoveManager;
        OnTrackUpdateManager onTrackUpdateManager = new OnTrackUpdateManager(store);
        this.onTrackUpdateManager = onTrackUpdateManager;
        this.onPeerRemovedManager = new OnPeerRemovedManager(store);
        this.onTrackUpdateRequestedManager = new TrackUpdateRequestedManager(store);
        this.onRecordingUpdateManager = new RecordingUpdateManager(store);
        this.onRtmpUpdateManager = new RtmpUpdateManager(store);
        this.onHLSUpdateManager = new HLSUpdateManager(store);
        this.onTrackLayerUpdateManager = new TrackLayerUpdateManager(store);
        this.sessionStoreUpdateManager = new SessionStoreUpdateManager(store);
        this.hmsPollsStartManager = new HmsPollsStartManager(store, new SDKDelegate$hmsPollsStartManager$1(this));
        this.hmsPollStopManager = new HmsPollsStopManager(store);
        this.hmsPollResultsManager = new HmsPollResultsManager(store);
        this.roomInfoManager = new RoomInfoManager(store);
        this.sessionInfoManager = new SessionInfoManager(store);
        this.hmsWhiteBoardManager = AbstractC30060g.m92088H(new C24265f(this, 10));
        this.onTranscriptionControlManager = new OnTranscriptionStateManager(store);
        this.initialPeerListManager = new InitialPeerListManager(store, onTrackAddManager, onPeerJoinManager);
        this.reconnectPeerListManager = new ReconnectPeerListManager(store, onTrackAddManager, onTrackRemoveManager, onPeerJoinManager, onPeerLeaveManager, onTrackUpdateManager, onPeerUpdateManager);
        ITransport transportLayer = getTransportLayer();
        C22365e c22365e = AbstractC3050q0.f12077a;
        final int i15 = 2;
        WebRtcStatsMonitor webRtcStatsMonitor = new WebRtcStatsMonitor(transportLayer, 0L, AbstractC3006f0.m8708b(c22365e), getTransportLayer().getAnalyticsEventsService(), applicationContext, new Function1(this) { // from class: live.hms.video.sdk.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SDKDelegate f95252x;

            {
                this.f95252x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return SDKDelegate.noiseCancellationReportingUseCase$lambda$3(this.f95252x, (AnalyticsEvent) obj);
                    case 1:
                        return SDKDelegate.onTranscriptionManager$lambda$11(this.f95252x, (HmsTranscripts) obj);
                    default:
                        return SDKDelegate.webrtcStatsMonitor$lambda$14(this.f95252x, (String) obj);
                }
            }
        }, 2, null);
        this.webrtcStatsMonitor = webRtcStatsMonitor;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(new C13100y(new C13015a0(new SDKDelegate$statsFlow$2(this, null), new C13065m2(webRtcStatsMonitor.getStatsFlow(), new SDKDelegate$statsFlow$1(this, null))), new SDKDelegate$statsFlow$3(this, null)), AbstractC3006f0.m8708b(c22365e), C13105z1.m36630a(3, 0L), 0);
        this.statsFlow = c13078q1M36586L;
        this.networkObserverUseCase = new NetworkObserverUseCase(c13078q1M36586L, store, new C24265f(this, 11));
        this.rtcStatsObserverUseCase = new RtcStatsObserverUseCase(c13078q1M36586L, store, new C24265f(this, 12));
        this.muteOnPhoneCalManager = AbstractC30060g.m92088H(new C24265f(this, 1));
        this.previewForRoleTracks = AbstractC30060g.m92088H(new C24069a(8));
        this.pendingPluginList = AbstractC30060g.m92088H(new C24069a(9));
    }

    private final void addPluginIfRequired() {
        HMSStreamFactory.INSTANCE.updatePluginCameraSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (r13.setSettings(r12, r0) == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyRoleSettings(live.hms.video.sdk.models.role.HMSRole r12, boolean r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.applyRoleSettings(live.hms.video.sdk.models.role.HMSRole, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread audioHandlerThread_delegate$lambda$6() {
        HandlerThread handlerThread = new HandlerThread("audio-thread");
        handlerThread.start();
        return handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler audioHandler_delegate$lambda$7(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new Handler(this$0.getAudioHandlerThread().getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkIfLocalVideoTrackRequiresUnPublish(HMSNotifications.PolicyChange params) {
        if (this.store.getRolesMap().isEmpty()) {
            return false;
        }
        return HMSUtils.INSTANCE.didSimulcastLayerChangeHappen$lib_release(this.store.getRole(), params.getRolesMap().get(params.getRoleName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPluginPendingState() {
        this.pendingPluginSetupRequired = false;
        getPendingPluginList().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createHmsInteractivityCenterIfNeeded() {
        if (this.store.getHmsInteractivityCenter() == null) {
            this.store.setHmsInteractivityCenter(new HmsInteractivityCenter(new C242051(getTransportLayer()), new C242102(getTransportLayer()), new C242113(getTransportLayer()), new C242124(getTransportLayer()), new C242135(getTransportLayer()), new C242146(getTransportLayer()), new C242157(getTransportLayer()), new C242168(getTransportLayer()), new C242179(this), new C2420610(getTransportLayer()), new C2420711(getTransportLayer()), new C2420812(getTransportLayer()), new C24265f(this, 7), this.store, new AbstractC22691v(this.isQalink) { // from class: live.hms.video.sdk.SDKDelegate.createHmsInteractivityCenterIfNeeded.14
                @Override // j93.InterfaceC21488u
                public Object get() {
                    return Boolean.valueOf(((IsQaLink) this.receiver).getIsQa());
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransportState createHmsInteractivityCenterIfNeeded$lambda$65(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.transportState;
    }

    private final void createSDKUpdatesForMigration(ArrayList<SDKUpdate> updates) {
        if (this.isScreenShared) {
            this.isScreenShared = false;
            handleRemoveScreenshare(updates);
        }
        for (HMSRemotePeer hMSRemotePeer : this.store.getRemotePeers()) {
            HMSRemoteAudioTrack audioTrack = hMSRemotePeer.getAudioTrack();
            if (audioTrack != null) {
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, audioTrack, hMSRemotePeer));
                this.store.remove(audioTrack);
            }
            HMSRemoteVideoTrack videoTrack = hMSRemotePeer.getVideoTrack();
            if (videoTrack != null) {
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, videoTrack, hMSRemotePeer));
                this.store.remove(videoTrack);
            }
            for (HMSTrack hMSTrack : hMSRemotePeer.getAuxiliaryTracks()) {
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, hMSTrack, hMSRemotePeer));
                this.store.remove(hMSTrack);
            }
            hMSRemotePeer.setAudioTrack$lib_release(null);
            hMSRemotePeer.setVideoTrack$lib_release(null);
            hMSRemotePeer.getAuxiliaryTracks().clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireUpdates(List<? extends SDKUpdate> updates) {
        for (SDKUpdate sDKUpdate : updates) {
            if (sDKUpdate instanceof SDKUpdate.Track) {
                HMSUpdateListener hMSUpdateListener = this.hmsUpdateListener;
                if (hMSUpdateListener != null) {
                    SDKUpdate.Track track = (SDKUpdate.Track) sDKUpdate;
                    hMSUpdateListener.onTrackUpdate(track.getType(), track.getTrack(), track.getPeer());
                }
            } else if (sDKUpdate instanceof SDKUpdate.Peer) {
                HMSUpdateListener hMSUpdateListener2 = this.hmsUpdateListener;
                if (hMSUpdateListener2 != null) {
                    SDKUpdate.Peer peer = (SDKUpdate.Peer) sDKUpdate;
                    hMSUpdateListener2.onPeerUpdate(peer.getType(), peer.getPeer());
                } else {
                    HMSPreviewListener hMSPreviewListener = this.hmsPreviewListener;
                    if (hMSPreviewListener != null) {
                        SDKUpdate.Peer peer2 = (SDKUpdate.Peer) sDKUpdate;
                        hMSPreviewListener.onPeerUpdate(peer2.getType(), peer2.getPeer());
                    }
                }
            } else if (sDKUpdate instanceof SDKUpdate.Broadcast) {
                HMSUpdateListener hMSUpdateListener3 = this.hmsUpdateListener;
                if (hMSUpdateListener3 != null) {
                    hMSUpdateListener3.onMessageReceived(((SDKUpdate.Broadcast) sDKUpdate).getMessage());
                }
            } else if (sDKUpdate instanceof SDKUpdate.Room) {
                HMSRoom hMSRoom = this.store.get_room();
                if (hMSRoom != null) {
                    HMSUpdateListener hMSUpdateListener4 = this.hmsUpdateListener;
                    if (hMSUpdateListener4 != null) {
                        hMSUpdateListener4.onRoomUpdate(((SDKUpdate.Room) sDKUpdate).getType(), hMSRoom);
                    } else {
                        HMSPreviewListener hMSPreviewListener2 = this.hmsPreviewListener;
                        if (hMSPreviewListener2 != null) {
                            hMSPreviewListener2.onRoomUpdate(((SDKUpdate.Room) sDKUpdate).getType(), hMSRoom);
                        }
                    }
                }
            } else if (sDKUpdate instanceof SDKUpdate.HMSRoleChangeRequest) {
                HMSUpdateListener hMSUpdateListener5 = this.hmsUpdateListener;
                if (hMSUpdateListener5 != null) {
                    SDKUpdate.HMSRoleChangeRequest hMSRoleChangeRequest = (SDKUpdate.HMSRoleChangeRequest) sDKUpdate;
                    hMSUpdateListener5.onRoleChangeRequest(new HMSRoleChangeRequest(hMSRoleChangeRequest.getRequestedBy(), hMSRoleChangeRequest.getSuggestedRole(), hMSRoleChangeRequest.getToken()));
                }
            } else if (sDKUpdate instanceof SDKUpdate.HMSPeerRemoved) {
                HMSUpdateListener hMSUpdateListener6 = this.hmsUpdateListener;
                if (hMSUpdateListener6 != null) {
                    SDKUpdate.HMSPeerRemoved hMSPeerRemoved = (SDKUpdate.HMSPeerRemoved) sDKUpdate;
                    hMSUpdateListener6.onRemovedFromRoom(new HMSRemovedFromRoom(hMSPeerRemoved.getReason(), hMSPeerRemoved.getRemovedBy(), hMSPeerRemoved.getRoomWasEnded()));
                }
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242212(null), 3);
            } else if (sDKUpdate instanceof SDKUpdate.HMSTrackStateUpdate) {
                HMSUpdateListener hMSUpdateListener7 = this.hmsUpdateListener;
                if (hMSUpdateListener7 != null) {
                    SDKUpdate.HMSTrackStateUpdate hMSTrackStateUpdate = (SDKUpdate.HMSTrackStateUpdate) sDKUpdate;
                    hMSUpdateListener7.onChangeTrackStateRequest(new HMSChangeTrackStateRequest(hMSTrackStateUpdate.getTrack(), hMSTrackStateUpdate.getRequestedBy(), hMSTrackStateUpdate.getMute()));
                }
            } else {
                if (!(sDKUpdate instanceof SDKUpdate.PeerListUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                SDKUpdate.PeerListUpdate peerListUpdate = (SDKUpdate.PeerListUpdate) sDKUpdate;
                ArrayList<HMSPeer> peersAdded = peerListUpdate.getPeersAdded();
                if (peersAdded != null) {
                    HMSUpdateListener hMSUpdateListener8 = this.hmsUpdateListener;
                    if (hMSUpdateListener8 != null) {
                        hMSUpdateListener8.peerListUpdated(peersAdded, null);
                    }
                    HMSPreviewListener hMSPreviewListener3 = this.hmsPreviewListener;
                    if (hMSPreviewListener3 != null) {
                        hMSPreviewListener3.peerListUpdated(peersAdded, null);
                    }
                }
                ArrayList<HMSPeer> peersRemoved = peerListUpdate.getPeersRemoved();
                if (peersRemoved != null) {
                    HMSUpdateListener hMSUpdateListener9 = this.hmsUpdateListener;
                    if (hMSUpdateListener9 != null) {
                        hMSUpdateListener9.peerListUpdated(null, peersRemoved);
                    }
                    HMSPreviewListener hMSPreviewListener4 = this.hmsPreviewListener;
                    if (hMSPreviewListener4 != null) {
                        hMSPreviewListener4.peerListUpdated(null, peersRemoved);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d5 A[LOOP:0: B:20:0x00cf->B:22:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x010f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0119  */
    /* JADX WARN: Code duplicated, block: B:30:0x0129  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:19:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getAllPollQuestions(java.lang.String r30, int r31, java.util.List<live.hms.video.polls.models.question.HMSPollQuestion> r32, q83.InterfaceC30057d<? super live.hms.video.polls.network.QuestionContainer> r33) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.getAllPollQuestions(java.lang.String, int, java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAllPollQuestions$default(SDKDelegate sDKDelegate, String str, int i13, List list, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            list = C25271y.f99162w;
        }
        return sDKDelegate.getAllPollQuestions(str, i13, list, interfaceC30057d);
    }

    private final Handler getAudioHandler() {
        return (Handler) this.audioHandler.getValue();
    }

    private final HandlerThread getAudioHandlerThread() {
        return (HandlerThread) this.audioHandlerThread.getValue();
    }

    private final HMSPeer getCorrespondingPeerFromVideoTrackId(String videoTrackID) {
        List<HMSPeer> peerList;
        HMSRoom hMSRoom = this.store.get_room();
        HMSPeer hMSPeer = null;
        if (hMSRoom == null || (peerList = hMSRoom.getPeerList()) == null) {
            return null;
        }
        ListIterator<HMSPeer> listIterator = peerList.listIterator(peerList.size());
        while (listIterator.hasPrevious()) {
            HMSPeer hMSPeerPrevious = listIterator.previous();
            HMSVideoTrack videoTrack = hMSPeerPrevious.getVideoTrack();
            if (AbstractC22676k.m65745e(videoTrack != null ? videoTrack.getTrackId() : null, videoTrackID)) {
                hMSPeer = hMSPeerPrevious;
                break;
            }
        }
        return hMSPeer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMSAudioManager getHmsAudioManager() {
        return (HMSAudioManager) this.hmsAudioManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HmsWhiteBoardManager getHmsWhiteBoardManager() {
        return (HmsWhiteBoardManager) this.hmsWhiteBoardManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: HMSException -> 0x0032, TryCatch #0 {HMSException -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:29:0x006a, B:31:0x006e, B:33:0x0073, B:38:0x009f), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[Catch: HMSException -> 0x0032, TryCatch #0 {HMSException -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:29:0x006a, B:31:0x006e, B:33:0x0073, B:38:0x009f), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f A[Catch: HMSException -> 0x0032, TRY_LEAVE, TryCatch #0 {HMSException -> 0x0032, blocks: (B:13:0x002e, B:37:0x0088, B:29:0x006a, B:31:0x006e, B:33:0x0073, B:38:0x009f), top: B:45:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object getLocalTracksByRoleAndApplySettings(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242231 c242231;
        HMSRole role;
        boolean z13;
        SDKDelegate sDKDelegate;
        ITransportListener iTransportListener;
        long jCurrentTimeMillis;
        long j7;
        if (interfaceC30057d instanceof C242231) {
            c242231 = (C242231) interfaceC30057d;
            int i13 = c242231.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242231.label = i13 - Integer.MIN_VALUE;
            } else {
                c242231 = new C242231(interfaceC30057d);
            }
        } else {
            c242231 = new C242231(interfaceC30057d);
        }
        Object obj = c242231.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c242231.label;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    boolean z14 = c242231.Z$0;
                    role = (HMSRole) c242231.L$1;
                    SDKDelegate sDKDelegate2 = (SDKDelegate) c242231.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        z13 = z14;
                        sDKDelegate = sDKDelegate2;
                        iTransportListener = sDKDelegate.connectivityTestListener;
                        if (iTransportListener != null) {
                            iTransportListener.onMediaCaptured();
                        }
                        if (role != null) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                            c242231.L$0 = sDKDelegate;
                            c242231.L$1 = null;
                            c242231.J$0 = jCurrentTimeMillis;
                            c242231.label = 2;
                            if (sDKDelegate.applyRoleSettings(role, z13, c242231) != obj2) {
                                j7 = jCurrentTimeMillis;
                            }
                            return obj2;
                        }
                        HMSLogger.m71137e(TAG, " No role found to apply publish-params");
                    } catch (HMSException e5) {
                        e = e5;
                        z4 = sDKDelegate2;
                        HMSLogger.m71137e(OnPolicyChangeManager.TAG, "getLocalTracksByRoleAndApplySettings :: " + e.getMessage());
                        z4.sendErrorCallback(e);
                    }
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j7 = c242231.J$0;
                    AbstractC34132o.m107864I(obj);
                }
                HMSLogger.m71136d("Profiling", "time taken to apply role settings " + (System.currentTimeMillis() - j7));
            } else {
                AbstractC34132o.m107864I(obj);
                try {
                    role = this.store.getRole();
                    c242231.L$0 = this;
                    c242231.L$1 = role;
                    c242231.Z$0 = z4;
                    c242231.label = 1;
                    if (initLocalTracks(role, z4, c242231) != obj2) {
                        z13 = z4;
                        sDKDelegate = this;
                        iTransportListener = sDKDelegate.connectivityTestListener;
                        if (iTransportListener != null) {
                            iTransportListener.onMediaCaptured();
                        }
                        if (role != null) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                            c242231.L$0 = sDKDelegate;
                            c242231.L$1 = null;
                            c242231.J$0 = jCurrentTimeMillis;
                            c242231.label = 2;
                            if (sDKDelegate.applyRoleSettings(role, z13, c242231) != obj2) {
                                j7 = jCurrentTimeMillis;
                                HMSLogger.m71136d("Profiling", "time taken to apply role settings " + (System.currentTimeMillis() - j7));
                            }
                        } else {
                            HMSLogger.m71137e(TAG, " No role found to apply publish-params");
                        }
                    }
                    return obj2;
                } catch (HMSException e13) {
                    e = e13;
                    z4 = this;
                    HMSLogger.m71137e(OnPolicyChangeManager.TAG, "getLocalTracksByRoleAndApplySettings :: " + e.getMessage());
                    z4.sendErrorCallback(e);
                }
            }
        } catch (HMSException e14) {
            e = e14;
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ Object getLocalVideoTrack$default(SDKDelegate sDKDelegate, HMSVideoTrackSettings.CameraFacing cameraFacing, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cameraFacing = null;
        }
        return sDKDelegate.getLocalVideoTrack(cameraFacing, interfaceC30057d);
    }

    private final MuteOnPhoneCallManager getMuteOnPhoneCalManager() {
        return (MuteOnPhoneCallManager) this.muteOnPhoneCalManager.getValue();
    }

    public static /* synthetic */ PeerListIterator getPeerListIterator$default(SDKDelegate sDKDelegate, PeerListIteratorOptions peerListIteratorOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            peerListIteratorOptions = null;
        }
        return sDKDelegate.getPeerListIterator(peerListIteratorOptions);
    }

    private final CopyOnWriteArrayList<C23465k> getPendingPluginList() {
        return (CopyOnWriteArrayList) this.pendingPluginList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PerformanceMeasurement getPerformanceMeasurement() {
        return (PerformanceMeasurement) this.performanceMeasurement.getValue();
    }

    private final PermissionsHandlers getPermissionsHandler() {
        return (PermissionsHandlers) this.permissionsHandler.getValue();
    }

    private final List<HMSTrack> getPreviewForRoleTracks() {
        return (List) this.previewForRoleTracks.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ITransport getTransportLayer() {
        return (ITransport) this.transportLayer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<SDKUpdate> handleRemoveScreenshare(ArrayList<SDKUpdate> updates) {
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer != null) {
            List<HMSTrack> auxiliaryTracks = localPeer.getAuxiliaryTracks();
            ArrayList arrayList = new ArrayList();
            for (Object obj : auxiliaryTracks) {
                if (AbstractC22676k.m65745e(((HMSTrack) obj).getSource(), HMSTrackSource.SCREEN)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                HMSTrack hMSTrack = (HMSTrack) AbstractC25265s.m74096F0(arrayList);
                localPeer.getAuxiliaryTracks().remove(hMSTrack);
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, hMSTrack, localPeer));
            }
        }
        return updates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[PHI: r10
      0x00b6: PHI (r10v7 live.hms.video.sdk.SDKDelegate) = (r10v6 live.hms.video.sdk.SDKDelegate), (r10v16 live.hms.video.sdk.SDKDelegate) binds: [B:30:0x00b3, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[PHI: r10
      0x00c6: PHI (r10v8 live.hms.video.sdk.SDKDelegate) = (r10v7 live.hms.video.sdk.SDKDelegate), (r10v18 live.hms.video.sdk.SDKDelegate) binds: [B:33:0x00c3, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        if (r10.publishLocalTracks(r11, r0) == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleSFUMigration(java.util.ArrayList<live.hms.video.sdk.models.SDKUpdate> r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.handleSFUMigration(java.util.ArrayList, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSAudioManager hmsAudioManager_delegate$lambda$10(final SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return Build.VERSION.SDK_INT >= 31 ? new HMSAudioManagerApi31(this$0.applicationContext, this$0.getTransportLayer().getAnalyticsEventsService(), this$0.hmsTrackSettings.getAudioSettings(), this$0.audioDeviceListener, new IErrorListener() { // from class: live.hms.video.sdk.SDKDelegate$hmsAudioManager$2$1
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSUpdateListener hMSUpdateListener = this.this$0.hmsUpdateListener;
                if (hMSUpdateListener != null) {
                    hMSUpdateListener.onError(error);
                }
            }
        }) : new HMSAudioManagerLegacy(this$0.applicationContext, this$0.getTransportLayer().getAnalyticsEventsService(), this$0.hmsTrackSettings.getAudioSettings(), new IErrorListener() { // from class: live.hms.video.sdk.SDKDelegate$hmsAudioManager$2$2
            @Override // live.hms.video.sdk.IErrorListener
            public void onError(HMSException error) {
                AbstractC22676k.m65750j(error, "error");
                HMSUpdateListener hMSUpdateListener = this.this$0.hmsUpdateListener;
                if (hMSUpdateListener != null) {
                    hMSUpdateListener.onError(error);
                }
            }
        }, this$0.audioDeviceListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HmsWhiteBoardManager hmsWhiteBoardManager_delegate$lambda$13(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new HmsWhiteBoardManager(this$0.store);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x027c A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02bd A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02d8 A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02dd A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e5 A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:123:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f7 A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0311 A[Catch: HMSException -> 0x0284, TryCatch #0 {HMSException -> 0x0284, blocks: (B:100:0x0271, B:102:0x027c, B:105:0x0288, B:106:0x02b7, B:108:0x02bd, B:112:0x02ce, B:115:0x02d8, B:124:0x02f2, B:116:0x02dd, B:118:0x02e5, B:120:0x02eb, B:126:0x02f7, B:128:0x0311, B:130:0x0317), top: B:142:0x0271 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x034d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x017c A[Catch: HMSException -> 0x018c, TryCatch #3 {HMSException -> 0x018c, blocks: (B:48:0x0145, B:49:0x0176, B:51:0x017c, B:57:0x018f, B:60:0x0199, B:69:0x01b3, B:61:0x019e, B:63:0x01a6, B:65:0x01ac, B:71:0x01b8, B:73:0x01d2, B:75:0x01d8), top: B:148:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0199 A[Catch: HMSException -> 0x018c, TryCatch #3 {HMSException -> 0x018c, blocks: (B:48:0x0145, B:49:0x0176, B:51:0x017c, B:57:0x018f, B:60:0x0199, B:69:0x01b3, B:61:0x019e, B:63:0x01a6, B:65:0x01ac, B:71:0x01b8, B:73:0x01d2, B:75:0x01d8), top: B:148:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x019e A[Catch: HMSException -> 0x018c, TryCatch #3 {HMSException -> 0x018c, blocks: (B:48:0x0145, B:49:0x0176, B:51:0x017c, B:57:0x018f, B:60:0x0199, B:69:0x01b3, B:61:0x019e, B:63:0x01a6, B:65:0x01ac, B:71:0x01b8, B:73:0x01d2, B:75:0x01d8), top: B:148:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6 A[Catch: HMSException -> 0x018c, TryCatch #3 {HMSException -> 0x018c, blocks: (B:48:0x0145, B:49:0x0176, B:51:0x017c, B:57:0x018f, B:60:0x0199, B:69:0x01b3, B:61:0x019e, B:63:0x01a6, B:65:0x01ac, B:71:0x01b8, B:73:0x01d2, B:75:0x01d8), top: B:148:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b8 A[Catch: HMSException -> 0x018c, TryCatch #3 {HMSException -> 0x018c, blocks: (B:48:0x0145, B:49:0x0176, B:51:0x017c, B:57:0x018f, B:60:0x0199, B:69:0x01b3, B:61:0x019e, B:63:0x01a6, B:65:0x01ac, B:71:0x01b8, B:73:0x01d2, B:75:0x01d8), top: B:148:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:99:0x026d  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x02f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x01b8, please report this as an issue */
    public final Object initLocalTracks(HMSRole hMSRole, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242251 c242251;
        String str;
        HMSLocalPeer localPeer;
        boolean z13;
        SDKDelegate sDKDelegate;
        HMSRole hMSRole2;
        HMSLocalPeer hMSLocalPeer;
        PublishParams publishParams;
        ArrayList<String> allowed;
        HMSLocalPeer hMSLocalPeer2;
        HMSLocalPeer hMSLocalPeer3;
        HMSLocalPeer hMSLocalPeer4;
        long j7;
        PublishParams publishParams2;
        ArrayList<String> allowed2;
        HMSLocalPeer hMSLocalPeer5;
        HMSLocalPeer hMSLocalPeer6;
        SDKDelegate sDKDelegate2;
        long jCurrentTimeMillis;
        HMSLocalPeer hMSLocalPeer7;
        boolean z14;
        HMSLocalAudioTrack audioTrack;
        Iterator<T> it;
        Object next;
        HMSLocalAudioTrack hMSLocalAudioTrack;
        HMSLocalAudioTrack audioTrack2;
        LastTrackState lastTrackState;
        HMSLocalAudioTrack audioTrack3;
        HMSAudioTrackSettings audioSettings;
        HMSTrackSettings.InitState initialState;
        boolean zIsMute;
        HMSLocalVideoTrack videoTrack;
        HMSLocalVideoTrack hMSLocalVideoTrack;
        Boolean bool;
        Iterator<T> it3;
        Object next2;
        HMSLocalVideoTrack hMSLocalVideoTrack2;
        HMSLocalVideoTrack videoTrack2;
        LastTrackState lastTrackState2;
        HMSLocalVideoTrack videoTrack3;
        HMSVideoTrackSettings videoSettings;
        HMSTrackSettings.InitState initialState2;
        boolean zIsMute2;
        if (interfaceC30057d instanceof C242251) {
            c242251 = (C242251) interfaceC30057d;
            int i13 = c242251.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242251.label = i13 - Integer.MIN_VALUE;
            } else {
                c242251 = new C242251(interfaceC30057d);
            }
        } else {
            c242251 = new C242251(interfaceC30057d);
        }
        Object localTrackByType = c242251.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242251.label;
        if (i14 == 0) {
            str = "Profiling";
            AbstractC34132o.m107864I(localTrackByType);
            localPeer = this.store.getLocalPeer();
            if (localPeer != null) {
                if (hMSRole == null || (publishParams = hMSRole.getPublishParams()) == null || (allowed = publishParams.getAllowed()) == null || !allowed.contains("audio") || localPeer.getAudioTrack() != null) {
                    z13 = z4;
                    sDKDelegate = this;
                    hMSRole2 = hMSRole;
                    hMSLocalPeer = localPeer;
                    if (hMSRole2 != null) {
                        sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        ITransport transportLayer = sDKDelegate.getTransportLayer();
                        Context context = sDKDelegate.applicationContext;
                        HMSTrackSettings hMSTrackSettings = sDKDelegate.hmsTrackSettings;
                        HMSTrackType hMSTrackType = HMSTrackType.VIDEO;
                        c242251.L$0 = sDKDelegate;
                        c242251.L$1 = localPeer;
                        c242251.L$2 = hMSLocalPeer;
                        c242251.L$3 = localPeer;
                        c242251.L$4 = null;
                        c242251.Z$0 = z13;
                        c242251.J$0 = jCurrentTimeMillis;
                        c242251.label = 2;
                        localTrackByType = transportLayer.getLocalTrackByType(context, hMSTrackSettings, hMSTrackType, c242251);
                        if (localTrackByType != enumC31071a) {
                            hMSLocalPeer7 = localPeer;
                            hMSLocalPeer6 = hMSLocalPeer7;
                            sDKDelegate2 = sDKDelegate;
                            z14 = z13;
                            AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                            hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                            bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                            if (bool != null) {
                                hMSLocalVideoTrack.setMute(bool.booleanValue());
                            }
                            hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                            HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                            sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                            it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                            hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                            videoTrack2 = hMSLocalPeer6.getVideoTrack();
                            if (videoTrack2 != null) {
                                if (hMSLocalVideoTrack2 != null) {
                                    zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                                } else {
                                    videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                                    if (videoSettings != null) {
                                        initialState2 = videoSettings.getInitialState();
                                    } else {
                                        initialState2 = null;
                                    }
                                    if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                        zIsMute2 = true;
                                    } else {
                                        zIsMute2 = false;
                                    }
                                }
                                videoTrack2.setMute(zIsMute2);
                            }
                            if (z14) {
                                Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                                lastTrackState2 = sDKDelegate2.lastTrackState;
                                if (lastTrackState2 != null) {
                                    videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                                }
                            }
                            sDKDelegate = sDKDelegate2;
                            videoTrack = hMSLocalPeer.getVideoTrack();
                            if (videoTrack != null) {
                                sDKDelegate.store.addNativeTrack(videoTrack);
                            }
                        }
                    }
                    sDKDelegate.getPreviewForRoleTracks().clear();
                } else {
                    try {
                        PerformanceMeasurement performanceMeasurement = getPerformanceMeasurement();
                        EVENT_TYPE event_type = EVENT_TYPE.LOCAL_AUDIO_TRACK;
                        performanceMeasurement.start$lib_release(event_type);
                        boolean zIsMicrophoneAccessAvailable = MicrophoneUtils.INSTANCE.isMicrophoneAccessAvailable(this.applicationContext);
                        HMSLogger.m71136d(TAG, "Mic access available?: " + zIsMicrophoneAccessAvailable);
                        if (zIsMicrophoneAccessAvailable) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            ITransport transportLayer2 = getTransportLayer();
                            Context context2 = this.applicationContext;
                            HMSTrackSettings hMSTrackSettings2 = this.hmsTrackSettings;
                            HMSTrackType hMSTrackType2 = HMSTrackType.AUDIO;
                            c242251.L$0 = this;
                            c242251.L$1 = hMSRole;
                            c242251.L$2 = localPeer;
                            c242251.L$3 = localPeer;
                            c242251.L$4 = localPeer;
                            z13 = z4;
                            try {
                                c242251.Z$0 = z13;
                                c242251.J$0 = jCurrentTimeMillis2;
                                c242251.label = 1;
                                localTrackByType = transportLayer2.getLocalTrackByType(context2, hMSTrackSettings2, hMSTrackType2, c242251);
                                if (localTrackByType != enumC31071a) {
                                    sDKDelegate = this;
                                    hMSRole2 = hMSRole;
                                    hMSLocalPeer2 = localPeer;
                                    hMSLocalPeer4 = hMSLocalPeer2;
                                    j7 = jCurrentTimeMillis2;
                                    hMSLocalPeer3 = hMSLocalPeer4;
                                    AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalAudioTrack");
                                    hMSLocalPeer4.setAudioTrack$lib_release((HMSLocalAudioTrack) localTrackByType);
                                    HMSLogger.m71136d(str, "time taken to get audio track  " + (System.currentTimeMillis() - j7));
                                    sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                                    it = sDKDelegate.getPreviewForRoleTracks().iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (((HMSTrack) next).getType() != HMSTrackType.AUDIO);
                                    hMSLocalAudioTrack = (HMSLocalAudioTrack) next;
                                    audioTrack2 = hMSLocalPeer3.getAudioTrack();
                                    if (audioTrack2 != null) {
                                        if (hMSLocalAudioTrack != null) {
                                            zIsMute = hMSLocalAudioTrack.getIsMute();
                                        } else {
                                            audioSettings = sDKDelegate.hmsTrackSettings.getAudioSettings();
                                            if (audioSettings != null) {
                                                initialState = audioSettings.getInitialState();
                                            } else {
                                                initialState = null;
                                            }
                                            if (initialState == HMSTrackSettings.InitState.MUTED) {
                                                zIsMute = true;
                                            } else {
                                                zIsMute = false;
                                            }
                                        }
                                        audioTrack2.setMute(zIsMute);
                                    }
                                    if (z13) {
                                        Log.d("SFUMIGRATION", "adding new audio track with last state as " + sDKDelegate.lastTrackState);
                                        lastTrackState = sDKDelegate.lastTrackState;
                                        if (lastTrackState != null) {
                                            audioTrack3.setMute(lastTrackState.isLocalAudioMuted());
                                        }
                                    }
                                    localPeer = hMSLocalPeer2;
                                    audioTrack = localPeer.getAudioTrack();
                                    if (audioTrack != null) {
                                        sDKDelegate.store.addNativeTrack(audioTrack);
                                    }
                                    hMSLocalPeer = localPeer;
                                    localPeer = hMSLocalPeer3;
                                    if (hMSRole2 != null) {
                                        sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                        jCurrentTimeMillis = System.currentTimeMillis();
                                        ITransport transportLayer3 = sDKDelegate.getTransportLayer();
                                        Context context3 = sDKDelegate.applicationContext;
                                        HMSTrackSettings hMSTrackSettings3 = sDKDelegate.hmsTrackSettings;
                                        HMSTrackType hMSTrackType3 = HMSTrackType.VIDEO;
                                        c242251.L$0 = sDKDelegate;
                                        c242251.L$1 = localPeer;
                                        c242251.L$2 = hMSLocalPeer;
                                        c242251.L$3 = localPeer;
                                        c242251.L$4 = null;
                                        c242251.Z$0 = z13;
                                        c242251.J$0 = jCurrentTimeMillis;
                                        c242251.label = 2;
                                        localTrackByType = transportLayer3.getLocalTrackByType(context3, hMSTrackSettings3, hMSTrackType3, c242251);
                                        if (localTrackByType != enumC31071a) {
                                            hMSLocalPeer7 = localPeer;
                                            hMSLocalPeer6 = hMSLocalPeer7;
                                            sDKDelegate2 = sDKDelegate;
                                            z14 = z13;
                                            AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                                            hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                                            bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                                            if (bool != null) {
                                                hMSLocalVideoTrack.setMute(bool.booleanValue());
                                            }
                                            hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                                            HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                            sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                            it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                                            do {
                                                if (!it3.hasNext()) {
                                                    next2 = null;
                                                    break;
                                                }
                                                next2 = it3.next();
                                            } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                                            hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                                            videoTrack2 = hMSLocalPeer6.getVideoTrack();
                                            if (videoTrack2 != null) {
                                                if (hMSLocalVideoTrack2 != null) {
                                                    zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                                                } else {
                                                    videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                                                    if (videoSettings != null) {
                                                        initialState2 = videoSettings.getInitialState();
                                                    } else {
                                                        initialState2 = null;
                                                    }
                                                    if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                                        zIsMute2 = true;
                                                    } else {
                                                        zIsMute2 = false;
                                                    }
                                                }
                                                videoTrack2.setMute(zIsMute2);
                                            }
                                            if (z14) {
                                                Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                                                lastTrackState2 = sDKDelegate2.lastTrackState;
                                                if (lastTrackState2 != null) {
                                                    videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                                                }
                                            }
                                            sDKDelegate = sDKDelegate2;
                                            videoTrack = hMSLocalPeer.getVideoTrack();
                                            if (videoTrack != null) {
                                                sDKDelegate.store.addNativeTrack(videoTrack);
                                            }
                                        }
                                    }
                                    sDKDelegate.getPreviewForRoleTracks().clear();
                                }
                            } catch (HMSException e5) {
                                e = e5;
                                sDKDelegate = this;
                                hMSRole2 = hMSRole;
                                hMSLocalPeer2 = localPeer;
                                hMSLocalPeer3 = hMSLocalPeer2;
                                sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                                HMSLogger.m71137e(TAG, "Error in creating local audio track :: " + e);
                                hMSLocalPeer3.setAudioTrack$lib_release(null);
                                sDKDelegate.sendErrorCallback(e);
                                localPeer = hMSLocalPeer2;
                                audioTrack = localPeer.getAudioTrack();
                                if (audioTrack != null) {
                                    sDKDelegate.store.addNativeTrack(audioTrack);
                                }
                                hMSLocalPeer = localPeer;
                                localPeer = hMSLocalPeer3;
                                if (hMSRole2 != null) {
                                    sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                    ITransport transportLayer4 = sDKDelegate.getTransportLayer();
                                    Context context4 = sDKDelegate.applicationContext;
                                    HMSTrackSettings hMSTrackSettings4 = sDKDelegate.hmsTrackSettings;
                                    HMSTrackType hMSTrackType4 = HMSTrackType.VIDEO;
                                    c242251.L$0 = sDKDelegate;
                                    c242251.L$1 = localPeer;
                                    c242251.L$2 = hMSLocalPeer;
                                    c242251.L$3 = localPeer;
                                    c242251.L$4 = null;
                                    c242251.Z$0 = z13;
                                    c242251.J$0 = jCurrentTimeMillis;
                                    c242251.label = 2;
                                    localTrackByType = transportLayer4.getLocalTrackByType(context4, hMSTrackSettings4, hMSTrackType4, c242251);
                                    if (localTrackByType != enumC31071a) {
                                        hMSLocalPeer7 = localPeer;
                                        hMSLocalPeer6 = hMSLocalPeer7;
                                        sDKDelegate2 = sDKDelegate;
                                        z14 = z13;
                                        AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                                        hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                                        bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                                        if (bool != null) {
                                            hMSLocalVideoTrack.setMute(bool.booleanValue());
                                        }
                                        hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                                        HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                        sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                        it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it3.next();
                                        } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                                        hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                                        videoTrack2 = hMSLocalPeer6.getVideoTrack();
                                        if (videoTrack2 != null) {
                                            if (hMSLocalVideoTrack2 != null) {
                                                zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                                            } else {
                                                videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                                                if (videoSettings != null) {
                                                    initialState2 = videoSettings.getInitialState();
                                                } else {
                                                    initialState2 = null;
                                                }
                                                if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                                    zIsMute2 = true;
                                                } else {
                                                    zIsMute2 = false;
                                                }
                                            }
                                            videoTrack2.setMute(zIsMute2);
                                        }
                                        if (z14) {
                                            Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                                            lastTrackState2 = sDKDelegate2.lastTrackState;
                                            if (lastTrackState2 != null) {
                                                videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                                            }
                                        }
                                        sDKDelegate = sDKDelegate2;
                                        videoTrack = hMSLocalPeer.getVideoTrack();
                                        if (videoTrack != null) {
                                            sDKDelegate.store.addNativeTrack(videoTrack);
                                        }
                                    }
                                    return enumC31071a;
                                }
                                sDKDelegate.getPreviewForRoleTracks().clear();
                                return C23454a0.f92919a;
                            }
                        } else {
                            try {
                                getPerformanceMeasurement().end$lib_release(event_type);
                                HMSException hMSExceptionCantAccessCaptureDevice$default = ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, "microphone", "Microphone was not available", false, null, null, 48, null);
                                localPeer.setAudioTrack$lib_release(null);
                                getTransportLayer().getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.publishFail(hMSExceptionCantAccessCaptureDevice$default)).flush();
                                sendErrorCallback(hMSExceptionCantAccessCaptureDevice$default);
                                z13 = z4;
                                sDKDelegate = this;
                                hMSRole2 = hMSRole;
                                hMSLocalPeer3 = localPeer;
                            } catch (HMSException e13) {
                                e = e13;
                                z13 = z4;
                                sDKDelegate = this;
                                hMSRole2 = hMSRole;
                                hMSLocalPeer2 = localPeer;
                                hMSLocalPeer3 = hMSLocalPeer2;
                                sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                                HMSLogger.m71137e(TAG, "Error in creating local audio track :: " + e);
                                hMSLocalPeer3.setAudioTrack$lib_release(null);
                                sDKDelegate.sendErrorCallback(e);
                                localPeer = hMSLocalPeer2;
                            }
                            audioTrack = localPeer.getAudioTrack();
                            if (audioTrack != null) {
                                sDKDelegate.store.addNativeTrack(audioTrack);
                            }
                            hMSLocalPeer = localPeer;
                            localPeer = hMSLocalPeer3;
                            if (hMSRole2 != null) {
                                sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                jCurrentTimeMillis = System.currentTimeMillis();
                                ITransport transportLayer5 = sDKDelegate.getTransportLayer();
                                Context context5 = sDKDelegate.applicationContext;
                                HMSTrackSettings hMSTrackSettings5 = sDKDelegate.hmsTrackSettings;
                                HMSTrackType hMSTrackType5 = HMSTrackType.VIDEO;
                                c242251.L$0 = sDKDelegate;
                                c242251.L$1 = localPeer;
                                c242251.L$2 = hMSLocalPeer;
                                c242251.L$3 = localPeer;
                                c242251.L$4 = null;
                                c242251.Z$0 = z13;
                                c242251.J$0 = jCurrentTimeMillis;
                                c242251.label = 2;
                                localTrackByType = transportLayer5.getLocalTrackByType(context5, hMSTrackSettings5, hMSTrackType5, c242251);
                                if (localTrackByType != enumC31071a) {
                                    hMSLocalPeer7 = localPeer;
                                    hMSLocalPeer6 = hMSLocalPeer7;
                                    sDKDelegate2 = sDKDelegate;
                                    z14 = z13;
                                    AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                                    hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                                    bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                                    if (bool != null) {
                                        hMSLocalVideoTrack.setMute(bool.booleanValue());
                                    }
                                    hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                                    HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                    sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                                    it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                                    hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                                    videoTrack2 = hMSLocalPeer6.getVideoTrack();
                                    if (videoTrack2 != null) {
                                        if (hMSLocalVideoTrack2 != null) {
                                            zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                                        } else {
                                            videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                                            if (videoSettings != null) {
                                                initialState2 = videoSettings.getInitialState();
                                            } else {
                                                initialState2 = null;
                                            }
                                            if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                                zIsMute2 = true;
                                            } else {
                                                zIsMute2 = false;
                                            }
                                        }
                                        videoTrack2.setMute(zIsMute2);
                                    }
                                    if (z14) {
                                        Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                                        lastTrackState2 = sDKDelegate2.lastTrackState;
                                        if (lastTrackState2 != null) {
                                            videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                                        }
                                    }
                                    sDKDelegate = sDKDelegate2;
                                    videoTrack = hMSLocalPeer.getVideoTrack();
                                    if (videoTrack != null) {
                                        sDKDelegate.store.addNativeTrack(videoTrack);
                                    }
                                }
                            }
                            sDKDelegate.getPreviewForRoleTracks().clear();
                        }
                    } catch (HMSException e14) {
                        e = e14;
                        z13 = z4;
                    }
                }
                return enumC31071a;
            }
            HMSLogger.m71137e(TAG, "initLocalTracks() :: Local Peer is null");
        } else if (i14 == 1) {
            str = "Profiling";
            j7 = c242251.J$0;
            boolean z15 = c242251.Z$0;
            hMSLocalPeer4 = (HMSLocalPeer) c242251.L$4;
            HMSLocalPeer hMSLocalPeer8 = (HMSLocalPeer) c242251.L$3;
            hMSLocalPeer3 = (HMSLocalPeer) c242251.L$2;
            hMSRole2 = (HMSRole) c242251.L$1;
            sDKDelegate = (SDKDelegate) c242251.L$0;
            try {
                AbstractC34132o.m107864I(localTrackByType);
                hMSLocalPeer2 = hMSLocalPeer8;
                z13 = z15;
                try {
                    AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalAudioTrack");
                    hMSLocalPeer4.setAudioTrack$lib_release((HMSLocalAudioTrack) localTrackByType);
                    HMSLogger.m71136d(str, "time taken to get audio track  " + (System.currentTimeMillis() - j7));
                    sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                    it = sDKDelegate.getPreviewForRoleTracks().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((HMSTrack) next).getType() != HMSTrackType.AUDIO);
                    hMSLocalAudioTrack = (HMSLocalAudioTrack) next;
                    audioTrack2 = hMSLocalPeer3.getAudioTrack();
                    if (audioTrack2 != null) {
                        if (hMSLocalAudioTrack != null) {
                            zIsMute = hMSLocalAudioTrack.getIsMute();
                        } else {
                            audioSettings = sDKDelegate.hmsTrackSettings.getAudioSettings();
                            if (audioSettings != null) {
                                initialState = audioSettings.getInitialState();
                            } else {
                                initialState = null;
                            }
                            if (initialState == HMSTrackSettings.InitState.MUTED) {
                                zIsMute = true;
                            } else {
                                zIsMute = false;
                            }
                        }
                        audioTrack2.setMute(zIsMute);
                    }
                    if (z13) {
                        Log.d("SFUMIGRATION", "adding new audio track with last state as " + sDKDelegate.lastTrackState);
                        lastTrackState = sDKDelegate.lastTrackState;
                        if (lastTrackState != null && (audioTrack3 = hMSLocalPeer3.getAudioTrack()) != null) {
                            audioTrack3.setMute(lastTrackState.isLocalAudioMuted());
                        }
                    }
                } catch (HMSException e15) {
                    e = e15;
                    sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                    HMSLogger.m71137e(TAG, "Error in creating local audio track :: " + e);
                    hMSLocalPeer3.setAudioTrack$lib_release(null);
                    sDKDelegate.sendErrorCallback(e);
                }
            } catch (HMSException e16) {
                e = e16;
                hMSLocalPeer2 = hMSLocalPeer8;
                z13 = z15;
                sDKDelegate.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_AUDIO_TRACK);
                HMSLogger.m71137e(TAG, "Error in creating local audio track :: " + e);
                hMSLocalPeer3.setAudioTrack$lib_release(null);
                sDKDelegate.sendErrorCallback(e);
                localPeer = hMSLocalPeer2;
                audioTrack = localPeer.getAudioTrack();
                if (audioTrack != null) {
                    sDKDelegate.store.addNativeTrack(audioTrack);
                }
                hMSLocalPeer = localPeer;
                localPeer = hMSLocalPeer3;
                if (hMSRole2 != null) {
                    try {
                        sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        ITransport transportLayer6 = sDKDelegate.getTransportLayer();
                        Context context6 = sDKDelegate.applicationContext;
                        HMSTrackSettings hMSTrackSettings6 = sDKDelegate.hmsTrackSettings;
                        HMSTrackType hMSTrackType6 = HMSTrackType.VIDEO;
                        c242251.L$0 = sDKDelegate;
                        c242251.L$1 = localPeer;
                        c242251.L$2 = hMSLocalPeer;
                        c242251.L$3 = localPeer;
                        c242251.L$4 = null;
                        c242251.Z$0 = z13;
                        c242251.J$0 = jCurrentTimeMillis;
                        c242251.label = 2;
                        localTrackByType = transportLayer6.getLocalTrackByType(context6, hMSTrackSettings6, hMSTrackType6, c242251);
                        if (localTrackByType != enumC31071a) {
                            hMSLocalPeer7 = localPeer;
                            hMSLocalPeer6 = hMSLocalPeer7;
                            sDKDelegate2 = sDKDelegate;
                            z14 = z13;
                            AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                            hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                            bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                            if (bool != null) {
                                hMSLocalVideoTrack.setMute(bool.booleanValue());
                            }
                            hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                            HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                            sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                            it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                            hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                            videoTrack2 = hMSLocalPeer6.getVideoTrack();
                            if (videoTrack2 != null) {
                                if (hMSLocalVideoTrack2 != null) {
                                    zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                                } else {
                                    videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                                    if (videoSettings != null) {
                                        initialState2 = videoSettings.getInitialState();
                                    } else {
                                        initialState2 = null;
                                    }
                                    if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                        zIsMute2 = true;
                                    } else {
                                        zIsMute2 = false;
                                    }
                                }
                                videoTrack2.setMute(zIsMute2);
                            }
                            if (z14) {
                                Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                                lastTrackState2 = sDKDelegate2.lastTrackState;
                                if (lastTrackState2 != null) {
                                    videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                                }
                            }
                            sDKDelegate = sDKDelegate2;
                            videoTrack = hMSLocalPeer.getVideoTrack();
                            if (videoTrack != null) {
                                sDKDelegate.store.addNativeTrack(videoTrack);
                            }
                        }
                        return enumC31071a;
                    } catch (HMSException e17) {
                        e = e17;
                        hMSLocalPeer5 = hMSLocalPeer;
                        hMSLocalPeer6 = localPeer;
                        sDKDelegate2 = sDKDelegate;
                        sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                        HMSLogger.m71137e(TAG, "Error in creating local video track :: " + e);
                        hMSLocalPeer6.setVideoTrack$lib_release(null);
                        sDKDelegate2.sendErrorCallback(e);
                        hMSLocalPeer = hMSLocalPeer5;
                        sDKDelegate = sDKDelegate2;
                        videoTrack = hMSLocalPeer.getVideoTrack();
                        if (videoTrack != null) {
                            sDKDelegate.store.addNativeTrack(videoTrack);
                        }
                        sDKDelegate.getPreviewForRoleTracks().clear();
                        return C23454a0.f92919a;
                    }
                }
                sDKDelegate.getPreviewForRoleTracks().clear();
                return C23454a0.f92919a;
            }
            localPeer = hMSLocalPeer2;
            audioTrack = localPeer.getAudioTrack();
            if (audioTrack != null) {
                sDKDelegate.store.addNativeTrack(audioTrack);
            }
            hMSLocalPeer = localPeer;
            localPeer = hMSLocalPeer3;
            if (hMSRole2 != null && (publishParams2 = hMSRole2.getPublishParams()) != null && (allowed2 = publishParams2.getAllowed()) != null && allowed2.contains("video") && localPeer.getVideoTrack() == null) {
                sDKDelegate.getPerformanceMeasurement().start$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                jCurrentTimeMillis = System.currentTimeMillis();
                ITransport transportLayer7 = sDKDelegate.getTransportLayer();
                Context context7 = sDKDelegate.applicationContext;
                HMSTrackSettings hMSTrackSettings7 = sDKDelegate.hmsTrackSettings;
                HMSTrackType hMSTrackType7 = HMSTrackType.VIDEO;
                c242251.L$0 = sDKDelegate;
                c242251.L$1 = localPeer;
                c242251.L$2 = hMSLocalPeer;
                c242251.L$3 = localPeer;
                c242251.L$4 = null;
                c242251.Z$0 = z13;
                c242251.J$0 = jCurrentTimeMillis;
                c242251.label = 2;
                localTrackByType = transportLayer7.getLocalTrackByType(context7, hMSTrackSettings7, hMSTrackType7, c242251);
                if (localTrackByType != enumC31071a) {
                    hMSLocalPeer7 = localPeer;
                    hMSLocalPeer6 = hMSLocalPeer7;
                    sDKDelegate2 = sDKDelegate;
                    z14 = z13;
                    AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                    hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                    bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                    if (bool != null) {
                        hMSLocalVideoTrack.setMute(bool.booleanValue());
                    }
                    hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                    HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                    it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                    hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                    videoTrack2 = hMSLocalPeer6.getVideoTrack();
                    if (videoTrack2 != null) {
                        if (hMSLocalVideoTrack2 != null) {
                            zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                        } else {
                            videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                            if (videoSettings != null) {
                                initialState2 = videoSettings.getInitialState();
                            } else {
                                initialState2 = null;
                            }
                            if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                zIsMute2 = true;
                            } else {
                                zIsMute2 = false;
                            }
                        }
                        videoTrack2.setMute(zIsMute2);
                    }
                    if (z14) {
                        Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                        lastTrackState2 = sDKDelegate2.lastTrackState;
                        if (lastTrackState2 != null) {
                            videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                        }
                    }
                    sDKDelegate = sDKDelegate2;
                    videoTrack = hMSLocalPeer.getVideoTrack();
                    if (videoTrack != null) {
                        sDKDelegate.store.addNativeTrack(videoTrack);
                    }
                }
                return enumC31071a;
            }
            sDKDelegate.getPreviewForRoleTracks().clear();
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = c242251.J$0;
            z14 = c242251.Z$0;
            hMSLocalPeer7 = (HMSLocalPeer) c242251.L$3;
            hMSLocalPeer5 = (HMSLocalPeer) c242251.L$2;
            hMSLocalPeer6 = (HMSLocalPeer) c242251.L$1;
            sDKDelegate2 = (SDKDelegate) c242251.L$0;
            try {
                AbstractC34132o.m107864I(localTrackByType);
                hMSLocalPeer = hMSLocalPeer5;
                str = "Profiling";
                try {
                    AbstractC22676k.m65748h(localTrackByType, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack");
                    hMSLocalVideoTrack = (HMSLocalVideoTrack) localTrackByType;
                    bool = sDKDelegate2.isLastLocalVideoTrackMuted;
                    if (bool != null) {
                        hMSLocalVideoTrack.setMute(bool.booleanValue());
                    }
                    hMSLocalPeer7.setVideoTrack$lib_release(hMSLocalVideoTrack);
                    HMSLogger.m71136d(str, "time taken to get local video track : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                    it3 = sDKDelegate2.getPreviewForRoleTracks().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((HMSTrack) next2).getType() != HMSTrackType.VIDEO);
                    hMSLocalVideoTrack2 = (HMSLocalVideoTrack) next2;
                    videoTrack2 = hMSLocalPeer6.getVideoTrack();
                    if (videoTrack2 != null) {
                        if (hMSLocalVideoTrack2 != null) {
                            zIsMute2 = hMSLocalVideoTrack2.getIsMute();
                        } else {
                            videoSettings = sDKDelegate2.hmsTrackSettings.getVideoSettings();
                            if (videoSettings != null) {
                                initialState2 = videoSettings.getInitialState();
                            } else {
                                initialState2 = null;
                            }
                            if (initialState2 == HMSTrackSettings.InitState.MUTED) {
                                zIsMute2 = true;
                            } else {
                                zIsMute2 = false;
                            }
                        }
                        videoTrack2.setMute(zIsMute2);
                    }
                    if (z14) {
                        Log.d("SFUMIGRATION", "adding new video track with last state as " + sDKDelegate2.lastTrackState);
                        lastTrackState2 = sDKDelegate2.lastTrackState;
                        if (lastTrackState2 != null && (videoTrack3 = hMSLocalPeer6.getVideoTrack()) != null) {
                            videoTrack3.setMute(lastTrackState2.isLocalVideoMuted());
                        }
                    }
                } catch (HMSException e18) {
                    e = e18;
                    hMSLocalPeer5 = hMSLocalPeer;
                    sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                    HMSLogger.m71137e(TAG, "Error in creating local video track :: " + e);
                    hMSLocalPeer6.setVideoTrack$lib_release(null);
                    sDKDelegate2.sendErrorCallback(e);
                    hMSLocalPeer = hMSLocalPeer5;
                }
            } catch (HMSException e19) {
                e = e19;
                sDKDelegate2.getPerformanceMeasurement().end$lib_release(EVENT_TYPE.LOCAL_VIDEO_TRACK);
                HMSLogger.m71137e(TAG, "Error in creating local video track :: " + e);
                hMSLocalPeer6.setVideoTrack$lib_release(null);
                sDKDelegate2.sendErrorCallback(e);
                hMSLocalPeer = hMSLocalPeer5;
                sDKDelegate = sDKDelegate2;
                videoTrack = hMSLocalPeer.getVideoTrack();
                if (videoTrack != null) {
                    sDKDelegate.store.addNativeTrack(videoTrack);
                }
                sDKDelegate.getPreviewForRoleTracks().clear();
                return C23454a0.f92919a;
            }
            sDKDelegate = sDKDelegate2;
            videoTrack = hMSLocalPeer.getVideoTrack();
            if (videoTrack != null) {
                sDKDelegate.store.addNativeTrack(videoTrack);
            }
            sDKDelegate.getPreviewForRoleTracks().clear();
        }
        return C23454a0.f92919a;
    }

    private final void initLogStorage() {
        if (this.isLogWriterInitialised) {
            return;
        }
        this.isLogWriterInitialised = true;
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C242261(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    private final boolean isFetchingLocalTracksNeeded(HMSLocalPeer localPeer) {
        PublishParams publishParams;
        ArrayList<String> allowed;
        PublishParams publishParams2;
        ArrayList<String> allowed2;
        HMSRole role = this.store.getRole();
        if (role == null || (publishParams2 = role.getPublishParams()) == null || (allowed2 = publishParams2.getAllowed()) == null || !allowed2.contains("video")) {
            if (role != null && (publishParams = role.getPublishParams()) != null && (allowed = publishParams.getAllowed()) != null && allowed.contains("audio")) {
                if ((localPeer != null ? localPeer.getAudioTrack() : null) == null) {
                }
            }
            return false;
        }
        if ((localPeer != null ? localPeer.getVideoTrack() : null) != null) {
            if (role != null) {
                if ((localPeer != null ? localPeer.getAudioTrack() : null) == null) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object leave$default(SDKDelegate sDKDelegate, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return sDKDelegate.leave(z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object leaveMeeting(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242291 c242291;
        SDKDelegate sDKDelegate;
        if (interfaceC30057d instanceof C242291) {
            c242291 = (C242291) interfaceC30057d;
            int i13 = c242291.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242291.label = i13 - Integer.MIN_VALUE;
            } else {
                c242291 = new C242291(interfaceC30057d);
            }
        } else {
            c242291 = new C242291(interfaceC30057d);
        }
        Object obj = c242291.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242291.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AnalyticsEvent report = this.noiseCancellationReportingUseCase.getReport();
            if (report != null) {
                getTransportLayer().getAnalyticsEventsService().queue(report).flush();
            }
            this.noiseCancellationReportingUseCase.reset();
            InterfaceC30061h interfaceC30061h = this.lowSpeedDuringPreviewEarlyWarning;
            if (interfaceC30061h != null) {
                ((C3060t1) interfaceC30061h).cancel((CancellationException) null);
            }
            this.previewSpeedTestUseCase.close();
            HmsInteractivityCenter hmsInteractivityCenter = this.store.getHmsInteractivityCenter();
            if (hmsInteractivityCenter != null) {
                hmsInteractivityCenter.close$lib_release();
            }
            this.networkObserverUseCase.close();
            this.rtcStatsObserverUseCase.close();
            this.activeSpeakerManager.close();
            ITransport transportLayer = getTransportLayer();
            c242291.L$0 = this;
            c242291.label = 1;
            if (transportLayer.leave(z4, c242291) == enumC31071a) {
                return enumC31071a;
            }
            sDKDelegate = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sDKDelegate = (SDKDelegate) c242291.L$0;
            AbstractC34132o.m107864I(obj);
        }
        OfflineAnalyticsPeerInfo.leave$default(sDKDelegate.offlineAnalyticsPeerInfo, 0L, 1, null);
        sDKDelegate.removePlugins();
        sDKDelegate.tearDownSDKDelegate();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MuteOnPhoneCallManager muteOnPhoneCalManager_delegate$lambda$18(SDKDelegate this$0) {
        InterfaceC13058l interfaceC13058lAudioFocusFlow;
        AbstractC22676k.m65750j(this$0, "this$0");
        SDKStore sDKStore = this$0.store;
        synchronized (this$0.audioLock) {
            interfaceC13058lAudioFocusFlow = HmsAudioMangerFlowHelperKt.audioFocusFlow(this$0.getHmsAudioManager(), this$0.getTransportLayer().getAnalyticsEventsService(), this$0.hmsTrackSettings.getAudioSettings());
        }
        return new MuteOnPhoneCallManager(sDKStore, interfaceC13058lAudioFocusFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean ncStatusChecker$lambda$1(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        FeatureFlags featureFlags = this$0.store.getFeatureFlags();
        if (featureFlags != null) {
            return Boolean.valueOf(featureFlags.isFeatureEnabled(Features.NOISE_CANCELLATION.INSTANCE));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean ncStatusChecker$lambda$2(SDKDelegate this$0) {
        HMSNotifications.NoiseCancellationPlugin noiseCancellation;
        AbstractC22676k.m65750j(this$0, "this$0");
        HMSNotifications.Plugins plugins = this$0.store.getPlugins();
        if (plugins == null || (noiseCancellation = plugins.getNoiseCancellation()) == null) {
            return null;
        }
        return noiseCancellation.getEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean networkObserverUseCase$lambda$15(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.hasJoined;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 noiseCancellationReportingUseCase$lambda$3(SDKDelegate this$0, AnalyticsEvent ncStartStopEvent) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(ncStartStopEvent, "ncStartStopEvent");
        this$0.getTransportLayer().getAnalyticsEventsService().queue(ncStartStopEvent).flush();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onJoinError(HMSException hMSException, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        this.hasJoined = false;
        getPerformanceMeasurement().end$lib_release(EVENT_TYPE.JOIN_CALL).fireJoinPerformanceMeasurementEvent$lib_release(false);
        HMSUpdateListener hMSUpdateListener = this.hmsUpdateListener;
        if (hMSUpdateListener != null) {
            hMSUpdateListener.onError(hMSException);
        }
        this.store.set_room(null);
        Object objLeave = leave(false, interfaceC30057d);
        return objLeave == EnumC31071a.f128113w ? objLeave : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJoinSuccess() {
        HMSUpdateListener hMSUpdateListener;
        this.hasJoined = true;
        this.networkObserverUseCase.startNetworkObserver();
        this.rtcStatsObserverUseCase.startStatsObserver();
        this.hmsPreviewListener = null;
        HmsSessionStore hmsSessionStore = this.store.getHmsSessionStore();
        if (hmsSessionStore != null && (hMSUpdateListener = this.hmsUpdateListener) != null) {
            hMSUpdateListener.onSessionStoreAvailable(hmsSessionStore);
        }
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        if (audioSettings == null || audioSettings.getDisableInternalAudioManager()) {
            return;
        }
        MuteOnPhoneCallManager.initPhoneCallManager$default(getMuteOnPhoneCalManager(), new C242312(this), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:104:0x0225  */
    /* JADX WARN: Code duplicated, block: B:108:0x024e  */
    /* JADX WARN: Code duplicated, block: B:124:0x028e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x028f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209 A[Catch: IllegalStateException -> 0x01e6, HMSException -> 0x026c, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x01e6, blocks: (B:109:0x024f, B:105:0x0226, B:84:0x01dd, B:95:0x0202, B:97:0x0209, B:99:0x0212, B:101:0x021d, B:80:0x01cf), top: B:135:0x01cf }] */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (r11.requestAndAwaitPermissions(r12, r0, r13, r15) == r4) goto L124;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x011d, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onPolicyChangeHandled(java.util.List<? extends live.hms.video.sdk.models.SDKUpdate> r24, q83.InterfaceC30057d<? super l83.C23454a0> r25) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.onPolicyChangeHandled(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPolicyChangeHandled$lambda$23(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        synchronized (this$0.audioLock) {
            this$0.getHmsAudioManager().stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPolicyChangeManager$lambda$12(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.hasJoined;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 onTranscriptionManager$lambda$11(SDKDelegate this$0, HmsTranscripts hmsTranscripts) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(hmsTranscripts, "hmsTranscripts");
        HMSUpdateListener hMSUpdateListener = this$0.hmsUpdateListener;
        if (hMSUpdateListener != null) {
            hMSUpdateListener.onTranscripts(hmsTranscripts);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CopyOnWriteArrayList pendingPluginList_delegate$lambda$77() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PerformanceMeasurement performanceMeasurement_delegate$lambda$4(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new PerformanceMeasurement(this$0.getTransportLayer().getAnalyticsEventsService(), this$0.applicationContext, this$0.hmsNetworkManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PermissionsHandlers permissionsHandler_delegate$lambda$0(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new PermissionsHandlers(new BluetoothPermissionHandler(this$0.hmsTrackSettings));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List previewForRoleTracks_delegate$lambda$58() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object publishLocalTracks(HMSLocalPeer hMSLocalPeer, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242361 c242361;
        SDKDelegate sDKDelegate;
        IErrorListener iErrorListener;
        if (interfaceC30057d instanceof C242361) {
            c242361 = (C242361) interfaceC30057d;
            int i13 = c242361.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242361.label = i13 - Integer.MIN_VALUE;
            } else {
                c242361 = new C242361(interfaceC30057d);
            }
        } else {
            c242361 = new C242361(interfaceC30057d);
        }
        Object objPublish = c242361.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242361.label;
        C23454a0 c23454a0 = null;
        C23454a0 c23454a1 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objPublish);
                if (!shouldJoinAsWebrtcPeer()) {
                    return c23454a1;
                }
                try {
                    ITransport transportLayer = getTransportLayer();
                    HMSTrack[] allTracks = hMSLocalPeer.getAllTracks();
                    c242361.L$0 = this;
                    c242361.L$1 = hMSLocalPeer;
                    c242361.label = 1;
                    objPublish = transportLayer.publish(allTracks, c242361);
                    if (objPublish == enumC31071a) {
                        return enumC31071a;
                    }
                    sDKDelegate = this;
                } catch (HMSException e5) {
                    e = e5;
                    sDKDelegate = this;
                    iErrorListener = sDKDelegate.errorListener;
                    if (iErrorListener != null) {
                        iErrorListener.onError(e);
                    }
                    if (c23454a0 == null) {
                        HMSLogger.m71137e(TAG, "onPeerListNotificationHandled() :: Local Peer is null");
                    }
                    return c23454a1;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMSLocalPeer = (HMSLocalPeer) c242361.L$1;
                sDKDelegate = (SDKDelegate) c242361.L$0;
                try {
                    AbstractC34132o.m107864I(objPublish);
                } catch (HMSException e13) {
                    e = e13;
                    iErrorListener = sDKDelegate.errorListener;
                    if (iErrorListener != null) {
                        iErrorListener.onError(e);
                    }
                    if (c23454a0 == null) {
                        HMSLogger.m71137e(TAG, "onPeerListNotificationHandled() :: Local Peer is null");
                    }
                    return c23454a1;
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) objPublish).iterator();
            while (it.hasNext()) {
                arrayList.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_ADDED, (HMSTrack) it.next(), hMSLocalPeer));
            }
            sDKDelegate.fireUpdates(arrayList);
            ITransportListener iTransportListener = sDKDelegate.connectivityTestListener;
            if (iTransportListener != null) {
                iTransportListener.onMediaPublished();
                c23454a0 = c23454a1;
            }
        } catch (IllegalStateException e14) {
            HMSLogger.INSTANCE.m71141w(TAG, "Renegotiation didnt complete due to : " + e14.getMessage());
        }
        if (c23454a0 == null) {
            HMSLogger.m71137e(TAG, "onPeerListNotificationHandled() :: Local Peer is null");
        }
        return c23454a1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object publishScreenShareTrack(HMSTrack hMSTrack, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242371 c242371;
        SDKDelegate sDKDelegate;
        if (interfaceC30057d instanceof C242371) {
            c242371 = (C242371) interfaceC30057d;
            int i13 = c242371.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242371.label = i13 - Integer.MIN_VALUE;
            } else {
                c242371 = new C242371(interfaceC30057d);
            }
        } else {
            c242371 = new C242371(interfaceC30057d);
        }
        Object obj = c242371.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242371.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                ITransport transportLayer = getTransportLayer();
                c242371.L$0 = this;
                c242371.L$1 = hMSTrack;
                c242371.L$2 = hMSActionResultListener;
                c242371.label = 1;
                if (transportLayer.publishScreenshare(hMSTrack, c242371) == enumC31071a) {
                    return enumC31071a;
                }
                sDKDelegate = this;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMSActionResultListener = (HMSActionResultListener) c242371.L$2;
                hMSTrack = (HMSTrack) c242371.L$1;
                sDKDelegate = (SDKDelegate) c242371.L$0;
                AbstractC34132o.m107864I(obj);
            }
            sDKDelegate.isScreenShared = true;
            HMSLocalPeer localPeer = sDKDelegate.store.getLocalPeer();
            if (localPeer != null) {
                localPeer.getAuxiliaryTracks().add(hMSTrack);
                sDKDelegate.fireUpdates(AbstractC37056f.m118980f(new SDKUpdate.Track(HMSTrackUpdate.TRACK_ADDED, hMSTrack, localPeer)));
            }
            hMSActionResultListener.onSuccess();
        } catch (HMSException e5) {
            hMSActionResultListener.onError(e5);
        }
        return C23454a0.f92919a;
    }

    private final void removePlugins() {
        try {
            CopyOnWriteArrayList<HMSVideoPlugin> plugins = getPlugins();
            if (plugins != null) {
                for (HMSVideoPlugin hMSVideoPlugin : plugins) {
                    HMSStreamFactory hMSStreamFactory = HMSStreamFactory.INSTANCE;
                    AbstractC22676k.m65747g(hMSVideoPlugin);
                    hMSStreamFactory.removePlugin(hMSVideoPlugin);
                }
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object renegotiateICE(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRenegotiationICE = getTransportLayer().renegotiationICE(interfaceC30057d);
        return objRenegotiationICE == EnumC31071a.f128113w ? objRenegotiationICE : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rtcStatsObserverUseCase$lambda$16(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return this$0.hasJoined;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object safeGetAllPollQuestions(String str, InterfaceC30057d<? super QuestionContainer> interfaceC30057d) {
        C242411 c242411;
        if (interfaceC30057d instanceof C242411) {
            c242411 = (C242411) interfaceC30057d;
            int i13 = c242411.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242411.label = i13 - Integer.MIN_VALUE;
            } else {
                c242411 = new C242411(interfaceC30057d);
            }
        } else {
            c242411 = new C242411(interfaceC30057d);
        }
        C242411 c242412 = c242411;
        Object allPollQuestions$default = c242412.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242412.label;
        int i15 = 1;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(allPollQuestions$default);
                c242412.label = 1;
                allPollQuestions$default = getAllPollQuestions$default(this, str, 0, null, c242412, 6, null);
                if (allPollQuestions$default == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(allPollQuestions$default);
            }
            return (QuestionContainer) allPollQuestions$default;
        } catch (HMSException e5) {
            return new QuestionContainer(null, e5, i15, 0 == true ? 1 : 0);
        }
    }

    private final void saveLastTrackState() {
        HMSVideoTrackSettings.CameraFacing currentCameraFace;
        HMSLocalVideoTrack videoTrack;
        HMSLocalAudioTrack audioTrack;
        HMSLocalVideoTrack videoTrack2;
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        boolean zIsMute = true;
        boolean zIsMute2 = (localPeer == null || (videoTrack2 = localPeer.getVideoTrack()) == null) ? true : videoTrack2.getIsMute();
        HMSLocalPeer localPeer2 = this.store.getLocalPeer();
        if (localPeer2 != null && (audioTrack = localPeer2.getAudioTrack()) != null) {
            zIsMute = audioTrack.getIsMute();
        }
        boolean z4 = this.isScreenShared;
        HMSLocalPeer localPeer3 = this.store.getLocalPeer();
        HMSCapturer capturer$lib_release = (localPeer3 == null || (videoTrack = localPeer3.getVideoTrack()) == null) ? null : videoTrack.getCapturer();
        HMSCameraCapturer hMSCameraCapturer = capturer$lib_release instanceof HMSCameraCapturer ? (HMSCameraCapturer) capturer$lib_release : null;
        if (hMSCameraCapturer == null || (currentCameraFace = hMSCameraCapturer.getCurrentCameraFace()) == null) {
            currentCameraFace = HMSVideoTrackSettings.CameraFacing.FRONT;
        }
        this.lastTrackState = new LastTrackState(zIsMute2, zIsMute, z4, currentCameraFace);
        HMSLogger.m71136d("SFUMIGRATION", "SFUMIGRATION>last track " + this.lastTrackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendJoinNotification() {
        HMSUpdateListener hMSUpdateListener;
        HMSRoom hMSRoom = this.store.get_room();
        if (hMSRoom == null || (hMSUpdateListener = this.hmsUpdateListener) == null) {
            return;
        }
        hMSUpdateListener.onJoin(hMSRoom);
    }

    private final void sendPreviewListnerUpdate(HMSLocalPeer localPeer) {
        HMSPreviewListener hMSPreviewListener = this.hmsPreviewListener;
        HMSRoom hMSRoom = this.store.get_room();
        if (hMSPreviewListener == null || hMSRoom == null || localPeer == null) {
            HMSLogger.m71137e(TAG, "onRoleChangeHandled() :: hmsPreviewListener is null");
        } else {
            if (this.isPreviewListenerCalled) {
                return;
            }
            hMSPreviewListener.onPreview(hMSRoom, localPeer.getAllTracks());
            dispatchPendingPluginSetup();
            this.isPreviewListenerCalled = true;
            getPerformanceMeasurement().firePreviewPerformanceMeasurementEvent$lib_release(true);
        }
    }

    private final int setPluginFpsBasedOnResolution(C23465k config) {
        Object obj = config.f92937w;
        Object obj2 = config.f92938x;
        if (((Size) obj).width <= 0 || ((Size) obj).height <= 0) {
            return 0;
        }
        return ((Size) obj).height <= 360 ? ((Number) obj2).intValue() / 2 : ((Number) obj2).intValue() / 3;
    }

    private final void setPublishSubscriberStatsConfig(InitConfig initConfig) {
        WebRtcStatsMonitor webRtcStatsMonitor = this.webrtcStatsMonitor;
        FeatureFlags featureFlags = this.store.getFeatureFlags();
        boolean z4 = false;
        boolean z13 = featureFlags != null && featureFlags.isFeatureEnabled(Features.PUBLISH_STATS.INSTANCE);
        ServerConfiguration serverConfiguration = initConfig.getServerConfiguration();
        Stats publishStats = serverConfiguration != null ? serverConfiguration.getPublishStats() : null;
        FeatureFlags featureFlags2 = this.store.getFeatureFlags();
        if (featureFlags2 != null && featureFlags2.isFeatureEnabled(Features.SUBSCRIBER_STATS.INSTANCE)) {
            z4 = true;
        }
        ServerConfiguration serverConfiguration2 = initConfig.getServerConfiguration();
        webRtcStatsMonitor.setPublishSubscriberStatsConfig(z13, publishStats, z4, serverConfiguration2 != null ? serverConfiguration2.getSubscribeStats() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1 setSdkStoreConfig(SDKStore store) {
        return new C24260a(store, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setSdkStoreConfig$lambda$87(SDKStore store, InitConfig config) {
        AbstractC22676k.m65750j(store, "$store");
        AbstractC22676k.m65750j(config, "config");
        ServerConfiguration serverConfiguration = config.getServerConfiguration();
        store.setFeatureFlags(serverConfiguration != null ? serverConfiguration.getEnabledFlags() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldJoinAsWebrtcPeer() {
        if (!this.nonWebRTCDisableOffer) {
            return true;
        }
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer != null) {
            return localPeer.isWebrtcPeer();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAudioManager$lambda$68(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        synchronized (this$0.audioLock) {
            this$0.getHmsAudioManager().start();
        }
    }

    private final void tearDownSDKDelegate() {
        HMSLogger.m71136d(TAG, "tearDownSDKDelegate started ⏰");
        getMuteOnPhoneCalManager().close();
        this.store.clear();
        this.hasJoined = false;
        this.isReconnecting = false;
        this.isPreviewListenerCalled = false;
        this.waitingForPolicyToJoin = false;
        this.isOnPolicyChangeHandled = false;
        this.hmsUpdateListener = null;
        this.hmsPreviewListener = null;
        this.errorListener = null;
        setAudioObserver(null);
        this.initConfig = null;
        this.isLastLocalVideoTrackMuted = null;
        this.audioManagerDeviceChangeListener = null;
        getPerformanceMeasurement().close();
        this.offlineAnalyticsPeerInfo.close();
        getPreviewForRoleTracks().clear();
        this.lastNodeInfo = null;
        this.lastTrackState = null;
        this.isScreenShared = false;
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        if (audioSettings != null && !audioSettings.getDisableInternalAudioManager()) {
            getAudioHandler().post(new RunnableC24262c(this, 2));
        }
        this.hmsNetworkManager.stop();
        HMSStreamFactory.INSTANCE.clean();
        LogUtils.INSTANCE.closeLogging();
        HMSLogger.m71136d(TAG, "tearDownSDKDelegate completed ✅");
        this.isLeaveInProgressAtomic.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tearDownSDKDelegate$lambda$74(SDKDelegate this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        synchronized (this$0.audioLock) {
            this$0.getHmsAudioManager().stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSTransport transportLayer_delegate$lambda$9(SDKDelegate this$0, HMSAnalyticsEventLevel analyticsEventLevel) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(analyticsEventLevel, "$analyticsEventLevel");
        Context context = this$0.applicationContext;
        return new HMSTransport(context, this$0.transportObserver, analyticsEventLevel, this$0.hmsTrackSettings, this$0.trackFactory, new HMSAgentOs(this$0.frameworkInfo, new SignatureChecker(context)), this$0.isQalink, this$0.offlineAnalyticsPeerInfo, this$0.ncStatusChecker, this$0.hmsNetworkManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132 A[LOOP:0: B:71:0x012c->B:73:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (live.hms.video.utils.HmsExtensionKt.stopScreenShareSuspend(r8, r0) == r1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unPublishTracksIfNeeded(live.hms.video.sdk.models.HMSLocalPeer r9, boolean r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.unPublishTracksIfNeeded(live.hms.video.sdk.models.HMSLocalPeer, boolean, q83.d):java.lang.Object");
    }

    public static /* synthetic */ Object unPublishTracksIfNeeded$default(SDKDelegate sDKDelegate, HMSLocalPeer hMSLocalPeer, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return sDKDelegate.unPublishTracksIfNeeded(hMSLocalPeer, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object unPublishVideoTrackOnlyIfSimulcastPolicy(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        HMSLocalVideoTrack videoTrack = localPeer != null ? localPeer.getVideoTrack() : null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (videoTrack != null && z4) {
            HMSLocalVideoTrack videoTrack2 = localPeer.getVideoTrack();
            this.isLastLocalVideoTrackMuted = videoTrack2 != null ? Boolean.valueOf(videoTrack2.getIsMute()) : null;
            Object objUnPublishTracksIfNeeded = unPublishTracksIfNeeded(localPeer, true, interfaceC30057d);
            if (objUnPublishTracksIfNeeded == EnumC31071a.f128113w) {
                return objUnPublishTracksIfNeeded;
            }
        }
        return c23454a0;
    }

    private final void unpublishLocalTrackAndUpdateForMigration(ArrayList<SDKUpdate> updates) {
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer != null) {
            HMSLocalVideoTrack videoTrack = localPeer.getVideoTrack();
            if (videoTrack != null) {
                videoTrack.stopCapturing$lib_release();
            }
            HMSLocalAudioTrack audioTrack = localPeer.getAudioTrack();
            if (audioTrack != null) {
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, audioTrack, localPeer));
            }
            HMSLocalVideoTrack videoTrack2 = localPeer.getVideoTrack();
            if (videoTrack2 != null) {
                updates.add(new SDKUpdate.Track(HMSTrackUpdate.TRACK_REMOVED, videoTrack2, localPeer));
            }
            localPeer.setVideoTrack$lib_release(null);
            localPeer.setAudioTrack$lib_release(null);
        }
        getTransportLayer().deInitLocalStreams();
        createSDKUpdatesForMigration(updates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfig() {
        ServerConfiguration serverConfiguration;
        ITransport transportLayer = getTransportLayer();
        InitConfig initConfig = this.initConfig;
        List<String> enabledFlags = null;
        ITransport.DefaultImpls.updateAnalyticsParams$default(transportLayer, null, null, null, null, initConfig != null ? initConfig.getEndpoint() : null, 15, null);
        SDKStore sDKStore = this.store;
        InitConfig initConfig2 = this.initConfig;
        if (initConfig2 != null && (serverConfiguration = initConfig2.getServerConfiguration()) != null) {
            enabledFlags = serverConfiguration.getEnabledFlags();
        }
        sDKStore.setFeatureFlags(enabledFlags);
        InitConfig initConfig3 = this.initConfig;
        if (initConfig3 != null) {
            setPublishSubscriberStatsConfig(initConfig3);
        }
        FeatureFlags featureFlags = this.store.getFeatureFlags();
        if (featureFlags == null || !featureFlags.isFeatureEnabled(Features.HIPPA_ROOM.INSTANCE)) {
            HMSLogger.INSTANCE.setLevel(this.hmsLogSettings.getLevel());
            initLogStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSPeer webrtcStatsMonitor$lambda$14(SDKDelegate this$0, String it) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        return this$0.getCorrespondingPeerFromVideoTrackId(it);
    }

    public final void addDiagnosticListener(ITransportListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.connectivityTestListener = listener;
        this.onPeerNetworkUpdateManager.setConnectivityCheckListener(listener);
    }

    public final void addNetworkObserver(HMSNetworkObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.networkObserverUseCase.addNetworkObserver(observer);
    }

    public final void addPlugin(HMSVideoPlugin plugin, HMSActionResultListener resultListener, int pluginFrameRate) {
        ServerConfiguration serverConfiguration;
        C24287VB vb4;
        HMSLocalVideoTrack videoTrack;
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(resultListener, "resultListener");
        try {
            HMSLocalPeer localPeer = this.store.getLocalPeer();
            String effectsKey = null;
            C23465k inputResolutionAndFps = (localPeer == null || (videoTrack = localPeer.getVideoTrack()) == null) ? null : videoTrack.getInputResolutionAndFps();
            if (localPeer != null && inputResolutionAndFps != null) {
                Object obj = inputResolutionAndFps.f92938x;
                int pluginFpsBasedOnResolution = setPluginFpsBasedOnResolution(inputResolutionAndFps);
                FeatureFlags featureFlags = this.store.getFeatureFlags();
                boolean zIsFeatureEnabled = featureFlags != null ? featureFlags.isFeatureEnabled(Features.EFFECTS_SDK_ENABLED.INSTANCE) : false;
                InitConfig initConfig = this.initConfig;
                if (initConfig != null && (serverConfiguration = initConfig.getServerConfiguration()) != null && (vb4 = serverConfiguration.getVb()) != null) {
                    effectsKey = vb4.getEffectsKey();
                }
                if (effectsKey == null) {
                    effectsKey = "";
                }
                String str = effectsKey;
                if (1 > pluginFpsBasedOnResolution || pluginFpsBasedOnResolution >= pluginFrameRate) {
                    HMSStreamFactory.INSTANCE.addPlugin(plugin, resultListener, ((Number) obj).intValue(), pluginFrameRate, getTransportLayer().getAnalyticsEventsService(), zIsFeatureEnabled, str);
                    return;
                } else {
                    HMSStreamFactory.INSTANCE.addPlugin(plugin, resultListener, ((Number) obj).intValue(), pluginFpsBasedOnResolution, getTransportLayer().getAnalyticsEventsService(), zIsFeatureEnabled, str);
                    return;
                }
            }
            addPluginLaterAfterJoinOrPreviewSuccess(plugin, resultListener, pluginFrameRate);
            resultListener.onError(ErrorFactory.GenericErrors.Unknown$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.PLUGIN, "Local peer or local video track is null", null, null, 12, null));
        } catch (HMSException e5) {
            HMSLogger.m71137e(TAG, "addPlugin :: Cannot add virtual background plugin");
            resultListener.onError(e5);
        }
    }

    public final void addPluginLaterAfterJoinOrPreviewSuccess(HMSVideoPlugin plugin, HMSActionResultListener resultListener, int pluginFrameRate) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(resultListener, "resultListener");
        if (this.isLeaveInProgressAtomic.get()) {
            return;
        }
        this.pendingPluginSetupRequired = true;
        getPendingPluginList().add(new C23465k(plugin, resultListener));
    }

    public final void addStatsObserver(HMSStatsObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.rtcStatsObserverUseCase.addStatsObserver(observer);
    }

    public final void bulkRoleChangeRequest(List<HMSRole> ofRoles, HMSRole toRole, boolean force, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(ofRoles, "ofRoles");
        AbstractC22676k.m65750j(toRole, "toRole");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241991(ofRoles, toRole, force, hmsActionResultListener, null), 3);
    }

    public final void cancelRolePreview() {
        getPreviewForRoleTracks().clear();
        getTransportLayer().removeTrackFromStream();
    }

    public final void changeLocalPeerHand(HMSActionResultListener actionlistener, boolean raiseHand) {
        AbstractC22676k.m65750j(actionlistener, "actionlistener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242001(raiseHand, this, actionlistener, null), 3);
    }

    public final void changeMetadata(String metadata, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242011(metadata, hmsActionResultListener, null), 3);
    }

    public final void changeName(String name, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242021(name, hmsActionResultListener, null), 3);
    }

    public final void changeTrackState(HMSTrack hmsTrack, boolean mute, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsTrack, "hmsTrack");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242031(hmsTrack, hmsActionResultListener, mute, null), 3);
    }

    @Override // live.hms.video.sdk.IPeerListIterator
    public ArrayList<HMSPeer> convertToHMSPeer(List<HMSNotifications.Peer> peers) {
        AbstractC22676k.m65750j(peers, "peers");
        ArrayList<HMSPeer> arrayList = new ArrayList<>();
        for (HMSNotifications.Peer peer : peers) {
            if (AbstractC22676k.m65745e(peer.getPeerId(), this.store.getLocalPeerId())) {
                HMSLocalPeer localPeer = this.store.getLocalPeer();
                if (localPeer != null) {
                    arrayList.add(localPeer);
                }
            } else {
                String peerId = peer.getPeerId();
                String customerUserId = peer.getInfo().getCustomerUserId();
                String userName = peer.getInfo().getUserName();
                HMSRole hMSRole = this.store.getRolesMap().get(peer.getRole());
                AbstractC22676k.m65747g(hMSRole);
                HMSRole hMSRole2 = hMSRole;
                long joinedAt = peer.getJoinedAt();
                HMSPeerType typeSipOrRegular = peer.getTypeSipOrRegular();
                if (typeSipOrRegular == null) {
                    typeSipOrRegular = HMSPeerType.REGULAR;
                }
                HMSRemotePeer hMSRemotePeer = new HMSRemotePeer(peerId, customerUserId, userName, hMSRole2, joinedAt, null, typeSipOrRegular, 32, null);
                hMSRemotePeer.setGroups$lib_release(peer.getGroups());
                arrayList.add(hMSRemotePeer);
            }
        }
        return arrayList;
    }

    public final void dispatchPendingPluginSetup() {
        if (this.pendingPluginSetupRequired) {
            for (C23465k c23465k : getPendingPluginList()) {
                addPlugin((HMSVideoPlugin) c23465k.f92937w, (HMSActionResultListener) c23465k.f92938x, 30);
            }
        }
        clearPluginPendingState();
    }

    public final void enableNoiseCancellation(boolean enable, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242181(enable, hmsActionResultListener, null), 3);
    }

    public final void endRoom(String reason, boolean lock, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242191(reason, lock, hmsActionResultListener, null), 3);
    }

    @Override // live.hms.video.sdk.IPeerListIterator
    public void findPeers(PeerListIteratorOptions peerListIteratorOptions, FindPeerListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242201(peerListIteratorOptions, listener, null), 3);
    }

    /* JADX INFO: renamed from: getAudioDeviceListener$lib_release, reason: from getter */
    public final HMSAudioManager.AudioManagerDeviceChangeListener getAudioDeviceListener() {
        return this.audioDeviceListener;
    }

    public final HMSAudioListener getAudioObserver() {
        return this.activeSpeakerManager.getAudioObserver();
    }

    public final HMSAudioManager.AudioDevice getAudioOutputRouteType() {
        HMSAudioManager.AudioDevice selectedAudioDevice;
        synchronized (this.audioLock) {
            try {
                HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
                selectedAudioDevice = (audioSettings == null || !audioSettings.getDisableInternalAudioManager()) ? getHmsAudioManager().getSelectedAudioDevice() : HMSAudioManager.AudioDevice.AUTOMATIC;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return selectedAudioDevice;
    }

    public final void getAuthTokenByRoomCode(TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSTokenListener hmsTokenListener) {
        AbstractC22676k.m65750j(tokenRequest, "tokenRequest");
        AbstractC22676k.m65750j(hmsTokenListener, "hmsTokenListener");
        getTransportLayer().getAuthTokenByRoomCode(tokenRequest, tokenRequestOptions, hmsTokenListener);
    }

    public final List<HMSAudioDeviceInfo> getAvailableAudioDevicesInfoList() {
        List<HMSAudioDeviceInfo> audioDevicesInfoList;
        synchronized (this.audioLock) {
            try {
                HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
                audioDevicesInfoList = (audioSettings == null || !audioSettings.getDisableInternalAudioManager()) ? getHmsAudioManager().getAudioDevicesInfoList() : C25271y.f99162w;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return audioDevicesInfoList;
    }

    public final List<HMSAudioManager.AudioDevice> getAvailableAudioDevicesList() {
        List<HMSAudioManager.AudioDevice> listM74093D1;
        synchronized (this.audioLock) {
            try {
                HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
                listM74093D1 = (audioSettings == null || !audioSettings.getDisableInternalAudioManager()) ? AbstractC25265s.m74093D1(getHmsAudioManager().getAudioDevices()) : C25271y.f99162w;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listM74093D1;
    }

    public final HMSConfig getHmsConfig() {
        HMSConfig hMSConfig = this.hmsConfig;
        if (hMSConfig != null) {
            return hMSConfig;
        }
        AbstractC22676k.m65757q("hmsConfig");
        throw null;
    }

    public final HmsInteractivityCenter getHmsInteractivityCenter() {
        createHmsInteractivityCenterIfNeeded();
        HmsInteractivityCenter hmsInteractivityCenter = this.store.getHmsInteractivityCenter();
        AbstractC22676k.m65747g(hmsInteractivityCenter);
        return hmsInteractivityCenter;
    }

    public final void getLayoutConfigByToken(String token, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener hmsLayoutConfigListener) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(hmsLayoutConfigListener, "hmsLayoutConfigListener");
        getTransportLayer().getLayoutConfigByToken(token, layoutRequestOptions, hmsLayoutConfigListener);
    }

    public final Object getLocalVideoTrack(HMSVideoTrackSettings.CameraFacing cameraFacing, InterfaceC30057d<? super HMSTrack> interfaceC30057d) {
        HMSVideoTrackSettings videoSettings;
        if (cameraFacing != null && (videoSettings = this.hmsTrackSettings.getVideoSettings()) != null) {
            videoSettings.setCameraFacing(cameraFacing);
        }
        getTransportLayer().initializePeerConnectionFactoryIfNeeded(this.hmsTrackSettings, true, false);
        return getTransportLayer().getLocalTrackByType(this.applicationContext, this.hmsTrackSettings, HMSTrackType.VIDEO, interfaceC30057d);
    }

    public final PeerListIterator getPeerListIterator(PeerListIteratorOptions peerListIteratorOptions) {
        PeerListIterator peerListIterator = new PeerListIterator(peerListIteratorOptions);
        this.peerListIterator = peerListIterator;
        peerListIterator.setIteratorImpl$lib_release(this);
        PeerListIterator peerListIterator2 = this.peerListIterator;
        AbstractC22676k.m65747g(peerListIterator2);
        return peerListIterator2;
    }

    public final CopyOnWriteArrayList<HMSVideoPlugin> getPlugins() {
        return HMSStreamFactory.INSTANCE.getPlugins();
    }

    public final InterfaceC3027k1 getSearchPeerNameJob() {
        return this.searchPeerNameJob;
    }

    /* JADX INFO: renamed from: getStatsFlow$lib_release, reason: from getter */
    public final InterfaceC13087t1 getStatsFlow() {
        return this.statsFlow;
    }

    public final HMSWhiteboardPermissions getWhiteboardPermissions() {
        HMSNotifications.Whiteboard whiteboard;
        HMSNotifications.Plugins plugins = this.store.getPlugins();
        HMSNotifications.WhiteboardPermissions permissions = (plugins == null || (whiteboard = plugins.getWhiteboard()) == null) ? null : whiteboard.getPermissions();
        List<String> admin = permissions != null ? permissions.getAdmin() : null;
        List<String> list = C25271y.f99162w;
        if (admin == null) {
            admin = list;
        }
        List<String> reader = permissions != null ? permissions.getReader() : null;
        if (reader == null) {
            reader = list;
        }
        List<String> writer = permissions != null ? permissions.getWriter() : null;
        if (writer != null) {
            list = writer;
        }
        return new HMSWhiteboardPermissions(admin, reader, list);
    }

    public final boolean hasRealTimeTranscriptionTogglePermissions(TranscriptionsMode mode) {
        HMSNotifications.TranscriptionsPluginPermissions permissions;
        List<String> admin;
        String name;
        HMSRole hmsRole;
        List<HMSNotifications.TranscriptionsPlugin> transcriptions;
        AbstractC22676k.m65750j(mode, "mode");
        HMSNotifications.Plugins plugins = this.store.getPlugins();
        HMSNotifications.TranscriptionsPlugin transcriptionsPlugin = null;
        Object obj = null;
        transcriptionsPlugin = null;
        if (plugins != null && (transcriptions = plugins.getTranscriptions()) != null) {
            for (Object obj2 : transcriptions) {
                if (((HMSNotifications.TranscriptionsPlugin) obj2).getMode() == mode) {
                    obj = obj2;
                    break;
                }
            }
            transcriptionsPlugin = (HMSNotifications.TranscriptionsPlugin) obj;
        }
        if (transcriptionsPlugin != null && (permissions = transcriptionsPlugin.getPermissions()) != null && (admin = permissions.getAdmin()) != null) {
            HMSLocalPeer localPeer = this.store.getLocalPeer();
            if (localPeer == null || (hmsRole = localPeer.getHmsRole()) == null || (name = hmsRole.getName()) == null) {
                name = "";
            }
            if (admin.contains(name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: isAudioShared, reason: from getter */
    public final boolean getIsAudioShared() {
        return this.isAudioShared;
    }

    public final boolean isNoiseCancellationEnabled() {
        return getTransportLayer().noiseCancellation().getNoiseCancellationEnabled();
    }

    public final AvailabilityStatus isNoiseCancellationSupported() {
        return this.ncStatusChecker.isNoiseCancellationAvailable();
    }

    /* JADX INFO: renamed from: isScreenShared, reason: from getter */
    public final boolean getIsScreenShared() {
        return this.isScreenShared;
    }

    public final Object join(HMSConfig hMSConfig, HMSUpdateListener hMSUpdateListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C22365e c22365e = AbstractC3050q0.f12077a;
        Object objM8705K = AbstractC3006f0.m8705K(AbstractC17182o.f65999a, new C242272(hMSUpdateListener, hMSConfig, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public final Object leave(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(HMSCoroutineScope.INSTANCE.getCoroutineContext(), new C242282(z4, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public final void lowerRemotePeerHand(HMSPeer forPeer, HMSActionResultListener actionlistener) {
        AbstractC22676k.m65750j(forPeer, "forPeer");
        AbstractC22676k.m65750j(actionlistener, "actionlistener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242301(forPeer, actionlistener, null), 3);
    }

    @Override // live.hms.video.sdk.IPeerListIterator
    public void peerIteratorNext(String iteratorID, int limit, FindPeerListener listener) {
        AbstractC22676k.m65750j(iteratorID, "iteratorID");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242331(iteratorID, limit, listener, null), 3);
    }

    public final Object preview(HMSConfig hMSConfig, HMSPreviewListener hMSPreviewListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C22365e c22365e = AbstractC3050q0.f12077a;
        Object objM8705K = AbstractC3006f0.m8705K(AbstractC17182o.f65999a, new C242342(hMSPreviewListener, hMSConfig, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e9 A[Catch: HMSException -> 0x005c, TRY_LEAVE, TryCatch #2 {HMSException -> 0x005c, blocks: (B:21:0x0057, B:53:0x00e5, B:55:0x00e9), top: B:87:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:73:0x0148  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e A[Catch: HMSException -> 0x003c, TRY_LEAVE, TryCatch #3 {HMSException -> 0x003c, blocks: (B:14:0x0037, B:74:0x014a, B:76:0x014e), top: B:89:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r14.requestAndAwaitPermissions(r12, r13, r2, r0) == r1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object previewForRole(live.hms.video.sdk.models.role.HMSRole r12, live.hms.video.sdk.RolePreviewListener r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.sdk.SDKDelegate.previewForRole(live.hms.video.sdk.models.role.HMSRole, live.hms.video.sdk.RolePreviewListener, q83.d):java.lang.Object");
    }

    public final void removePeer(HMSRemotePeer peer, String reason, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(peer, "peer");
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242381(peer, reason, hmsActionResultListener, null), 3);
    }

    public final void removePlugin(HMSVideoPlugin plugin, HMSActionResultListener resultListener) {
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(resultListener, "resultListener");
        try {
            CopyOnWriteArrayList<C23465k> pendingPluginList = getPendingPluginList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : pendingPluginList) {
                if (!AbstractC22676k.m65745e(((C23465k) obj).f92937w, plugin)) {
                    arrayList.add(obj);
                }
            }
            HMSStreamFactory.INSTANCE.removePlugin(plugin);
            resultListener.onSuccess();
        } catch (HMSException e5) {
            HMSLogger.m71137e(TAG, "removePlugin :: Cannot remove virtual background plugin");
            resultListener.onError(e5);
        }
    }

    public final void removeRtcStatsObserver() {
        this.rtcStatsObserverUseCase.close();
    }

    public final void roleChangeAccept(HMSRoleChangeRequest hmsRoleChangeRequest, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsRoleChangeRequest, "hmsRoleChangeRequest");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        String name = hmsRoleChangeRequest.getSuggestedRole().getName();
        HMSRole role = this.store.getRole();
        if (AbstractC22676k.m65745e(name, role != null ? role.getName() : null)) {
            HMSLogger.m71137e(TAG, "Cannot change Role to exisiting role");
        } else {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242391(hmsRoleChangeRequest, hmsActionResultListener, null), 3);
        }
    }

    public final void roleChangeRequest(HMSPeer forPeer, HMSRole toRole, boolean force, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(forPeer, "forPeer");
        AbstractC22676k.m65750j(toRole, "toRole");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242401(forPeer, this, toRole, force, hmsActionResultListener, null), 3);
    }

    public final void searchPeerName(String query, int limit, long offset, HmsTypedActionResultListener<PeerSearchResponse> listener) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(listener, "listener");
        try {
            InterfaceC3027k1 interfaceC3027k1 = this.searchPeerNameJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
        this.searchPeerNameJob = AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242422(query, listener, this, offset, limit, null), 3);
    }

    public final void send(HMSMessage hmsMessage, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(hmsMessage, "hmsMessage");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242431(hmsMessage, this, hmsMessageResultListener, null), 3);
    }

    public final void sendErrorCallback(HMSException ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        HMSPreviewListener hMSPreviewListener = this.hmsPreviewListener;
        if (hMSPreviewListener != null) {
            hMSPreviewListener.onError(ex3);
        }
        HMSUpdateListener hMSUpdateListener = this.hmsUpdateListener;
        if (hMSUpdateListener != null) {
            hMSUpdateListener.onError(ex3);
        }
    }

    public final void sendErrorEvent(HMSException hmsException) {
        AbstractC22676k.m65750j(hmsException, "hmsException");
        getTransportLayer().getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.genericHMSExceptionEvent(hmsException));
        getTransportLayer().getAnalyticsEventsService().flush();
    }

    public final void sendMessage(String type, String message, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer == null) {
            hmsMessageResultListener.onError(ErrorFactory.GenericErrors.CannotSendMessage$default(ErrorFactory.GenericErrors.INSTANCE, null, null, null, null, 15, null));
            return;
        }
        send(new HMSMessage(message, type, null, System.currentTimeMillis(), localPeer, null, 36, null), hmsMessageResultListener);
    }

    public final void setAudioDeviceChangeListener(HMSAudioManager.AudioManagerDeviceChangeListener audioManagerDeviceChangeListener) {
        AbstractC22676k.m65750j(audioManagerDeviceChangeListener, "audioManagerDeviceChangeListener");
        this.audioManagerDeviceChangeListener = audioManagerDeviceChangeListener;
    }

    public final void setAudioMixingMode(AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        getTransportLayer().setAudioMixingMode(audioMixingMode);
    }

    public final void setAudioMode(int audioMode) {
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        if (audioSettings == null || audioSettings.getDisableInternalAudioManager()) {
            return;
        }
        synchronized (this.audioLock) {
            getHmsAudioManager().setAudioMode(audioMode);
        }
    }

    public final void setAudioObserver(HMSAudioListener hMSAudioListener) {
        this.activeSpeakerManager.setAudioObserver(hMSAudioListener);
    }

    public final void setAudioShared(boolean z4) {
        this.isAudioShared = z4;
    }

    public final void setHlsSessionMetadata(List<HMSHLSTimedMetadata> metadataModelList, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(metadataModelList, "metadataModelList");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242441(metadataModelList, hmsActionResultListener, null), 3);
    }

    public final void setHmsConfig(HMSConfig hMSConfig) {
        AbstractC22676k.m65750j(hMSConfig, "<set-?>");
        this.hmsConfig = hMSConfig;
    }

    public final void setPermissionsAccepted() {
        getPermissionsHandler().setPermissionsAccepted();
    }

    public final void setScreenShared(boolean z4) {
        this.isScreenShared = z4;
    }

    public final void setSearchPeerNameJob(InterfaceC3027k1 interfaceC3027k1) {
        this.searchPeerNameJob = interfaceC3027k1;
    }

    public final void startAudioManager$lib_release() {
        HMSAudioTrackSettings audioSettings;
        if (getHmsAudioManager().isStarted() || (audioSettings = this.hmsTrackSettings.getAudioSettings()) == null || audioSettings.getDisableInternalAudioManager()) {
            return;
        }
        getAudioHandler().post(new RunnableC24262c(this, 1));
    }

    public final void startAudioshare(HMSActionResultListener resultListener, Intent mediaProjectionPermissionResultData, AudioMixingMode audioMixingMode, Notification screenShareNotification) {
        AbstractC22676k.m65750j(resultListener, "resultListener");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242451(resultListener, mediaProjectionPermissionResultData, audioMixingMode, screenShareNotification, null), 3);
    }

    public final void startHLSStreaming(HMSHLSConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242461(config, hmsActionResultListener, null), 3);
    }

    public final void startRealTimeTranscription(TranscriptionsMode mode, HMSActionResultListener listener) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242471(mode, listener, null), 3);
    }

    public final void startRtmpOrRecording(HMSRecordingConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242481(config, hmsActionResultListener, null), 3);
    }

    public final void startScreenshare(HMSActionResultListener resultListener, Intent mediaProjectionPermissionResultData, Notification screenShareNotification) {
        AbstractC22676k.m65750j(resultListener, "resultListener");
        if (Build.VERSION.SDK_INT >= 34 && AbstractC32122c.checkSelfPermission(this.applicationContext, "android.permission.FOREGROUND_SERVICE_MEDIA_PROJECTION") != 0) {
            resultListener.onError(ErrorFactory.INSTANCE.MediaProjectionPermissionError());
        } else if (this.isScreenShared) {
            HMSLogger.m71137e(TAG, "Cannot start screenshare again as it is already shared");
        } else {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242491(mediaProjectionPermissionResultData, screenShareNotification, resultListener, null), 3);
        }
    }

    public final void stopAudioFromRawFile(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        getTransportLayer().stopAudioFromRawFile(hmsActionResultListener);
    }

    public final void stopAudioshare(HMSActionResultListener resultListener) {
        AbstractC22676k.m65750j(resultListener, "resultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242501(resultListener, null), 3);
    }

    public final void stopHLSStreaming(HMSHLSConfig config, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242511(config, hmsActionResultListener, null), 3);
    }

    public final void stopRealTimeTranscription(TranscriptionsMode mode, HMSActionResultListener listener) {
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(listener, "listener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242521(mode, listener, null), 3);
    }

    public final void stopRtmpAndRecording(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242531(hmsActionResultListener, null), 3);
    }

    public final void stopScreenshare(HMSActionResultListener resultListener) {
        AbstractC22676k.m65750j(resultListener, "resultListener");
        HMSLogger.m71136d(TAG, "transport state : " + this.transportState);
        if (this.transportState == TransportState.Joined) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242541(resultListener, null), 3);
            return;
        }
        String str = "stopScreenshare :: Cannot unpublish screenshare because transportis in " + this.transportState + " state";
        HMSLogger.m71137e(TAG, str);
        resultListener.onError(ErrorFactory.TracksErrors.GenericTrack$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, str, null, null, false, 28, null));
    }

    public final void streamAndPlayAudioFromRawFile(int audioResourceId, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        getTransportLayer().streamAndPlayAudioFromRawFile(audioResourceId, hmsActionResultListener);
    }

    public final void switchAudioMode(HMSAudioManager.AudioDevice audioDevice) {
        AbstractC22676k.m65750j(audioDevice, "audioDevice");
        this.store.muteAllRemoteTracks(false);
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        if (audioSettings == null || audioSettings.getDisableInternalAudioManager()) {
            return;
        }
        synchronized (this.audioLock) {
            getHmsAudioManager().selectAudioDevice(audioDevice);
        }
    }

    public final void changeTrackState(boolean mute, HMSTrackType type, String source, List<String> roles, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242042(mute, type, source, roles, hmsActionResultListener, null), 3);
    }

    public final void sendMessage(String type, String message, HMSPeer peerTo, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(peerTo, "peerTo");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer == null) {
            hmsMessageResultListener.onError(ErrorFactory.GenericErrors.CannotSendMessage$default(ErrorFactory.GenericErrors.INSTANCE, null, null, null, null, 15, null));
            return;
        }
        String str = null;
        send(new HMSMessage(message, type, new HMSMessageRecipient(peerTo, null, HMSMessageRecipientType.PEER, 2, null), System.currentTimeMillis(), localPeer, str, 32, null), hmsMessageResultListener);
    }

    public final void sendMessage(String type, String message, List<HMSRole> rolesTo, HMSMessageResultListener hmsMessageResultListener) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(rolesTo, "rolesTo");
        AbstractC22676k.m65750j(hmsMessageResultListener, "hmsMessageResultListener");
        HMSLocalPeer localPeer = this.store.getLocalPeer();
        if (localPeer == null) {
            hmsMessageResultListener.onError(ErrorFactory.GenericErrors.CannotSendMessage$default(ErrorFactory.GenericErrors.INSTANCE, null, null, null, null, 15, null));
            return;
        }
        String str = null;
        send(new HMSMessage(message, type, new HMSMessageRecipient(null, rolesTo, HMSMessageRecipientType.ROLES, 1, null), System.currentTimeMillis(), localPeer, str, 32, null), hmsMessageResultListener);
    }
}
