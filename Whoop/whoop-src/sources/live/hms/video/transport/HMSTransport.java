package live.hms.video.transport;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.C3060t1;
import bc3.InterfaceC3055s;
import c93.InterfaceC4339a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.maps.MapboxMap;
import hms.webrtc.AudioTrack;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.DataChannel;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaConstraints;
import hms.webrtc.MediaStream;
import hms.webrtc.PeerConnection;
import hms.webrtc.PeerConnectionFactory;
import hms.webrtc.RTCStatsReport;
import hms.webrtc.RtpTransceiver;
import hms.webrtc.SessionDescription;
import hms.webrtc.VideoTrack;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kk1.C22541b;
import l01.C23045q;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.connection.models.HMSConfiguration;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.publish.HMSPublishConnection;
import live.hms.video.connection.subscribe.HMSSubscribeConnection;
import live.hms.video.connection.subscribe.ISubscribeConnectionObserver;
import live.hms.video.connection.subscribe.RemoteTrackFactory;
import live.hms.video.error.ErrorCodes;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSAction;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.factories.HMSPeerConnectionFactory;
import live.hms.video.factories.MediaConstraintsFactory;
import live.hms.video.factories.SafeVariable;
import live.hms.video.factories.noisecancellation.NoiseCancellation;
import live.hms.video.factories.noisecancellation.NoiseCancellationStatusChecker;
import live.hms.video.groups.GroupJoinLeaveResponse;
import live.hms.video.media.capturers.HMSCameraCapturer;
import live.hms.video.media.capturers.HMSCapturer;
import live.hms.video.media.capturers.HMSScreenCapturer;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.streams.HMSLocalStream;
import live.hms.video.media.streams.HMSStreamFactory;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackSource;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.network.HMSNetworkManager;
import live.hms.video.polls.HMSPollResponseBuilder;
import live.hms.video.polls.models.HmsPollState;
import live.hms.video.polls.models.answer.PollAnswerResponse;
import live.hms.video.polls.network.PollCreateResponse;
import live.hms.video.polls.network.PollGetResponsesReply;
import live.hms.video.polls.network.PollLeaderboardResponse;
import live.hms.video.polls.network.PollListResponse;
import live.hms.video.polls.network.PollQuestionGetResponse;
import live.hms.video.polls.network.PollResultsResponse;
import live.hms.video.polls.network.SetQuestionsResponse;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.OfflineAnalyticsPeerInfo;
import live.hms.video.sdk.featureflags.Features;
import live.hms.video.sdk.models.EVENT_TYPE;
import live.hms.video.sdk.models.FindPeerResponse;
import live.hms.video.sdk.models.HMSHLSConfig;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSMessageSendResponse;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.PeerNameSearchResponse;
import live.hms.video.sdk.models.PerformanceMeasurement;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.sdk.models.enums.HMSAnalyticsEventLevel;
import live.hms.video.sdk.models.enums.RetrySchedulerState;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.sessionstore.SetMetadataListenerResult;
import live.hms.video.sessionstore.SetSessionMetadataResult;
import live.hms.video.signal.ISignal;
import live.hms.video.signal.init.HMSLayoutListener;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.InitConfig;
import live.hms.video.signal.init.InitService;
import live.hms.video.signal.init.LayoutRequestOptions;
import live.hms.video.signal.init.ServerConfiguration;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.signal.init.TokenRequestOptions;
import live.hms.video.signal.jsonrpc.JSONRpcSignal;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.transport.models.ConnectParameters;
import live.hms.video.transport.models.JoinParameters;
import live.hms.video.transport.models.TransportCallbackTriple;
import live.hms.video.transport.models.TransportFailureCategory;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSAgentOs;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSPermissionsChecker;
import live.hms.video.utils.IdHelper;
import live.hms.video.utils.LayoutUtils;
import live.hms.video.utils.TokenUtils;
import live.hms.video.whiteboard.network.HMSCreateWhiteBoardResponse;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import m83.AbstractC25260n;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22691v;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b*\u0006\u008a\u0003\u0090\u0003\u0093\u0003\b\u0000\u0018\u0000 ¼\u00032\u00020\u0001:\u0002¼\u0003BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102JP\u0010=\u001a\u00020;2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u0001082\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u001b\u0018\u00010:H\u0096@¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020\u001b2\u0006\u0010?\u001a\u0002002\u0006\u0010@\u001a\u000200H\u0016¢\u0006\u0004\bA\u0010BJ\u0018\u0010D\u001a\u00020\u001b2\u0006\u0010C\u001a\u000200H\u0096@¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bF\u0010\u001dJA\u0010M\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u00010&2\b\u0010G\u001a\u0004\u0018\u00010&2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010L\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\bM\u0010NJX\u0010V\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u0002002\u0006\u00104\u001a\u00020&2\u0006\u0010T\u001a\u0002002\u0006\u0010U\u001a\u000200H\u0096@¢\u0006\u0004\bV\u0010WJ\u0018\u0010Y\u001a\u00020\u001b2\u0006\u0010X\u001a\u000200H\u0096@¢\u0006\u0004\bY\u0010EJ(\u0010]\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020&2\u0006\u0010[\u001a\u00020&2\u0006\u0010\\\u001a\u000200H\u0096@¢\u0006\u0004\b]\u0010^J*\u0010`\u001a\u00020\u001b2\u0006\u00103\u001a\u00020&2\u0006\u0010[\u001a\u00020&2\b\u0010_\u001a\u0004\u0018\u00010HH\u0096@¢\u0006\u0004\b`\u0010aJ'\u0010c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010?\u001a\u0002002\u0006\u0010b\u001a\u000200H\u0016¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020\u001bH\u0096@¢\u0006\u0004\be\u0010\u001dJ*\u0010h\u001a\u0004\u0018\u00010*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010g\u001a\u00020fH\u0096@¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u001bH\u0016¢\u0006\u0004\bj\u0010/J6\u0010o\u001a\u0004\u0018\u00010*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0096@¢\u0006\u0004\bo\u0010pJ3\u0010t\u001a\u00020s2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010r\u001a\u00020q2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bv\u0010wJ$\u0010{\u001a\b\u0012\u0004\u0012\u00020*0z2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020*0xH\u0096@¢\u0006\u0004\b{\u0010|J\u001e\u0010}\u001a\u00020\u001b2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020*0xH\u0096@¢\u0006\u0004\b}\u0010|J\u0010\u0010~\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b~\u0010\u001dJ\u001d\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0096@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0015\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0096@¢\u0006\u0005\b\u0085\u0001\u0010\u001dJ\u0015\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010\u001dJ$\u0010\u0088\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010\u0087\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J%\u0010\u008b\u0001\u001a\u0002002\u0007\u0010\u0087\u0001\u001a\u00020&2\u0007\u0010\u008a\u0001\u001a\u000200H\u0096@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J-\u0010\u008f\u0001\u001a\u00020\u001b2\u0007\u0010\u008d\u0001\u001a\u00020*2\u0006\u00105\u001a\u00020&2\u0007\u0010\u008e\u0001\u001a\u000200H\u0096@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JJ\u0010\u008f\u0001\u001a\u00020\u001b2\u0007\u0010\u008e\u0001\u001a\u0002002\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010f2\b\u00107\u001a\u0004\u0018\u00010&2\u000f\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010z2\u0006\u0010_\u001a\u00020&H\u0096@¢\u0006\u0006\b\u008f\u0001\u0010\u0093\u0001J\u001d\u0010\u0096\u0001\u001a\u00020\u001b2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u0099\u0001\u001a\u00020\u001b2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0096@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001f\u0010\u009b\u0001\u001a\u00020\u001b2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0096@¢\u0006\u0006\b\u009b\u0001\u0010\u009a\u0001J\u0012\u0010\u009c\u0001\u001a\u00020\u001bH\u0096@¢\u0006\u0005\b\u009c\u0001\u0010\u001dJ\u001c\u0010\u009e\u0001\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¡\u0001\u001a\u00020\u001b2\u0007\u0010 \u0001\u001a\u00020&H\u0096@¢\u0006\u0006\b¡\u0001\u0010\u009f\u0001J\u001f\u0010¤\u0001\u001a\u00030£\u00012\t\u0010¢\u0001\u001a\u0004\u0018\u00010&H\u0096@¢\u0006\u0006\b¤\u0001\u0010\u009f\u0001J)\u0010§\u0001\u001a\u00030¦\u00012\u0007\u0010¢\u0001\u001a\u00020&2\n\u0010 \u0001\u001a\u0005\u0018\u00010¥\u0001H\u0096@¢\u0006\u0006\b§\u0001\u0010¨\u0001J=\u0010¬\u0001\u001a\u00020\u001b2\u000e\u0010ª\u0001\u001a\t\u0012\u0005\u0012\u00030©\u00010z2\b\u0010«\u0001\u001a\u00030©\u00012\u0006\u0010\\\u001a\u0002002\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J2\u0010´\u0001\u001a\u00020\u001b2\b\u0010¯\u0001\u001a\u00030®\u00012\n\u0010±\u0001\u001a\u0005\u0018\u00010°\u00012\b\u0010³\u0001\u001a\u00030²\u0001H\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J0\u0010º\u0001\u001a\u00020\u001b2\u0006\u00103\u001a\u00020&2\n\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00012\b\u0010¹\u0001\u001a\u00030¸\u0001H\u0016¢\u0006\u0006\bº\u0001\u0010»\u0001J#\u0010¾\u0001\u001a\u00020\u001b2\u000e\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010zH\u0096@¢\u0006\u0006\b¾\u0001\u0010¿\u0001J#\u0010Â\u0001\u001a\u00030Á\u00012\r\u0010À\u0001\u001a\b\u0012\u0004\u0012\u00020&0zH\u0096@¢\u0006\u0006\bÂ\u0001\u0010¿\u0001J\u001e\u0010Å\u0001\u001a\u00030Ä\u00012\b\u0010\u0080\u0001\u001a\u00030Ã\u0001H\u0096@¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001e\u0010É\u0001\u001a\u00030È\u00012\b\u0010\u0080\u0001\u001a\u00030Ç\u0001H\u0096@¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010Ì\u0001\u001a\u00020\u001b2\u0007\u0010Ë\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bÌ\u0001\u0010\u009f\u0001J\u001c\u0010Í\u0001\u001a\u00020\u001b2\u0007\u0010Ë\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bÍ\u0001\u0010\u009f\u0001J\u001e\u0010Ï\u0001\u001a\u00030Ð\u00012\b\u0010Ï\u0001\u001a\u00030Î\u0001H\u0096@¢\u0006\u0006\bÏ\u0001\u0010Ñ\u0001J\u001e\u0010Õ\u0001\u001a\u00030Ô\u00012\b\u0010Ó\u0001\u001a\u00030Ò\u0001H\u0096@¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001e\u0010Ú\u0001\u001a\u00030Ù\u00012\b\u0010Ø\u0001\u001a\u00030×\u0001H\u0096@¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u001d\u0010Ý\u0001\u001a\u00030Ü\u00012\u0007\u0010Ë\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bÝ\u0001\u0010\u009f\u0001J\u001e\u0010à\u0001\u001a\u00030ß\u00012\b\u0010Ø\u0001\u001a\u00030Þ\u0001H\u0096@¢\u0006\u0006\bà\u0001\u0010á\u0001J2\u0010ç\u0001\u001a\u00030æ\u00012\b\u0010ã\u0001\u001a\u00030â\u00012\u0007\u0010ä\u0001\u001a\u00020\u001e2\t\u0010å\u0001\u001a\u0004\u0018\u00010&H\u0096@¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001e\u0010ì\u0001\u001a\u00030ë\u00012\b\u0010ê\u0001\u001a\u00030é\u0001H\u0096@¢\u0006\u0006\bì\u0001\u0010í\u0001J\u001d\u0010ð\u0001\u001a\u00030ï\u00012\u0007\u0010î\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bð\u0001\u0010\u009f\u0001J\u001d\u0010ó\u0001\u001a\u00030ò\u00012\u0007\u0010ñ\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bó\u0001\u0010\u009f\u0001J\u001d\u0010ô\u0001\u001a\u00030ò\u00012\u0007\u0010ñ\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bô\u0001\u0010\u009f\u0001J$\u0010õ\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010ñ\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bõ\u0001\u0010\u0089\u0001J$\u0010ö\u0001\u001a\u00020\u001b2\u0006\u00105\u001a\u00020&2\u0007\u0010ñ\u0001\u001a\u00020&H\u0096@¢\u0006\u0006\bö\u0001\u0010\u0089\u0001JE\u0010ü\u0001\u001a\u00030û\u00012\t\u0010ñ\u0001\u001a\u0004\u0018\u00010&2\t\u0010÷\u0001\u001a\u0004\u0018\u00010&2\u0010\u0010ù\u0001\u001a\u000b\u0012\u0004\u0012\u00020&\u0018\u00010ø\u00012\u0007\u0010ú\u0001\u001a\u00020\u001eH\u0096@¢\u0006\u0006\bü\u0001\u0010ý\u0001J&\u0010ÿ\u0001\u001a\u00030û\u00012\u0007\u0010þ\u0001\u001a\u00020&2\u0007\u0010ú\u0001\u001a\u00020\u001eH\u0096@¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001d\u0010\u0083\u0002\u001a\u00020\u001b2\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0096@¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u001d\u0010\u0085\u0002\u001a\u00020\u001b2\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0096@¢\u0006\u0006\b\u0085\u0002\u0010\u0084\u0002J0\u0010\u008a\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u0086\u0002\u001a\u00020&2\u0007\u0010ú\u0001\u001a\u00020\u001e2\b\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0096@¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u001e\u0010\u008e\u0002\u001a\u0002002\n\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u0002H\u0002¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u001d\u0010\u0092\u0002\u001a\u00020\u001b2\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0082@¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J<\u0010\u0094\u0002\u001a\u00020\u001b2\u0007\u0010\u009d\u0001\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\u0006\u0010S\u001a\u0002002\u0006\u0010T\u001a\u000200H\u0082@¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002JA\u0010\u0098\u0002\u001a\u00030\u0096\u00022\u0007\u0010\u009d\u0001\u001a\u00020&2\u0006\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u0002002\n\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u00022\u0006\u0010T\u001a\u000200H\u0082@¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J\"\u0010{\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0007\u0010\u009a\u0002\u001a\u000200H\u0082@¢\u0006\u0005\b{\u0010\u009b\u0002J\u0018\u0010}\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b}\u0010-J\u001d\u0010\u009e\u0002\u001a\u00020\u001b2\b\u0010\u009d\u0002\u001a\u00030\u009c\u0002H\u0082@¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002JC\u0010 \u0002\u001a\u00020;2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0016\b\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u001b\u0018\u00010:H\u0082@¢\u0006\u0006\b \u0002\u0010¡\u0002J3\u0010£\u0002\u001a\u00020&2\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0007\u0010¢\u0002\u001a\u00020&H\u0002¢\u0006\u0006\b£\u0002\u0010¤\u0002J\u001c\u0010§\u0002\u001a\u0002002\b\u0010¦\u0002\u001a\u00030¥\u0002H\u0002¢\u0006\u0006\b§\u0002\u0010¨\u0002Jd\u0010®\u0002\u001a\u00020\u001e2\b\u0010¦\u0002\u001a\u00030¥\u00022\b\u0010ª\u0002\u001a\u00030©\u00022;\u0010\u00ad\u0002\u001a6\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:j\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:H\u0082@¢\u0006\u0006\b®\u0002\u0010¯\u0002J\u0012\u0010°\u0002\u001a\u00020\u001bH\u0082@¢\u0006\u0005\b°\u0002\u0010\u001dR\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010±\u0002R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010²\u0002R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010³\u0002R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010´\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010µ\u0002R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¶\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010·\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010¸\u0002R\u001c\u0010º\u0002\u001a\u0005\u0018\u00010¹\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u001c\u0010½\u0002\u001a\u0005\u0018\u00010¼\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u0019\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010¿\u0002R\u0019\u0010À\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0019\u0010Â\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Á\u0002R\u0019\u0010Ã\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010Á\u0002R\u0019\u0010Ä\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010Á\u0002R%\u0010?\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b?\u0010Á\u0002\u001a\u0004\b?\u00102\"\u0006\bÅ\u0002\u0010Æ\u0002R&\u0010@\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b@\u0010Á\u0002\u001a\u0005\bÇ\u0002\u00102\"\u0006\bÈ\u0002\u0010Æ\u0002R\u001a\u0010Ê\u0002\u001a\u00030É\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R\u001a\u0010Í\u0002\u001a\u00030Ì\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÍ\u0002\u0010Î\u0002R\u001b\u0010Ï\u0002\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R4\u0010ã\u0001\u001a\u00030Ñ\u00022\b\u0010Ò\u0002\u001a\u00030Ñ\u00028\u0016@RX\u0096\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010Ó\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R \u0010Ù\u0002\u001a\u00030Ø\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÙ\u0002\u0010Ú\u0002\u001a\u0006\bÛ\u0002\u0010Ü\u0002R \u0010Ý\u0002\u001a\t\u0012\u0004\u0012\u00020*0ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R\u001b\u0010ß\u0002\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0002\u0010à\u0002R\u0019\u0010á\u0002\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R\u001c\u0010ä\u0002\u001a\u0005\u0018\u00010ã\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0002\u0010å\u0002R\u001c\u0010ç\u0002\u001a\u0005\u0018\u00010æ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0002\u0010è\u0002R!\u0010î\u0002\u001a\u00030é\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bê\u0002\u0010ë\u0002\u001a\u0006\bì\u0002\u0010í\u0002R\u0019\u0010ï\u0002\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0002\u0010Á\u0002R,\u0010ñ\u0002\u001a\u0005\u0018\u00010ð\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002\"\u0006\bõ\u0002\u0010ö\u0002R%\u0010ø\u0002\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030\u008c\u00020÷\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0002\u0010ù\u0002R\u0018\u0010û\u0002\u001a\u00030ú\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0002\u0010ü\u0002RK\u0010ý\u0002\u001a6\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:j\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0002\u0010þ\u0002RK\u0010ÿ\u0002\u001a6\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:j\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0002\u0010þ\u0002R*\u0010\u0080\u0003\u001a\u00030\u0087\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0080\u0003\u0010\u0081\u0003\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003\"\u0006\b\u0084\u0003\u0010\u0085\u0003R*\u0010\u0086\u0003\u001a\u00030\u0087\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0086\u0003\u0010\u0081\u0003\u001a\u0006\b\u0087\u0003\u0010\u0083\u0003\"\u0006\b\u0088\u0003\u0010\u0085\u0003RK\u0010\u0089\u0003\u001a6\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:j\u001a\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000«\u0002\u0012\u0007\u0012\u0005\u0018\u00010¬\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0003\u0010þ\u0002R\u0018\u0010\u008b\u0003\u001a\u00030\u008a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0003\u0010\u008c\u0003R\u0018\u0010\u008e\u0003\u001a\u00030\u008d\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008f\u0003R\u0018\u0010\u0091\u0003\u001a\u00030\u0090\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0003\u0010\u0092\u0003R\u0018\u0010\u0094\u0003\u001a\u00030\u0093\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0003\u0010\u0095\u0003R(\u0010\u0096\u0003\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0003\u0010Ð\u0002\u001a\u0006\b\u0097\u0003\u0010\u0098\u0003\"\u0005\b\u0099\u0003\u0010)R\u0018\u0010\u009b\u0003\u001a\u00030\u009a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0018\u0010\u009e\u0003\u001a\u00030\u009d\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0003\u0010\u009f\u0003R,\u0010¡\u0003\u001a\u0005\u0018\u00010 \u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0003\u0010¢\u0003\u001a\u0006\b£\u0003\u0010¤\u0003\"\u0006\b¥\u0003\u0010¦\u0003R,\u0010¨\u0003\u001a\u0005\u0018\u00010§\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0003\u0010©\u0003\u001a\u0006\bª\u0003\u0010«\u0003\"\u0006\b¬\u0003\u0010\u00ad\u0003R,\u0010¯\u0003\u001a\u0005\u0018\u00010®\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0003\u0010°\u0003\u001a\u0006\b±\u0003\u0010²\u0003\"\u0006\b³\u0003\u0010´\u0003R,\u0010¶\u0003\u001a\u0005\u0018\u00010µ\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0003\u0010·\u0003\u001a\u0006\b¸\u0003\u0010¹\u0003\"\u0006\bº\u0003\u0010»\u0003¨\u0006½\u0003"}, m65681d2 = {"Llive/hms/video/transport/HMSTransport;", "Llive/hms/video/transport/ITransport;", "Landroid/content/Context;", "context", "Llive/hms/video/transport/ITransportObserver;", "observer", "Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;", "analyticsEventLevel", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "trackFactory", "Llive/hms/video/utils/HMSAgentOs;", "agentOs", "Llive/hms/video/transport/IsQaLink;", "isQaLink", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "offlineAnalyticsPeerInfo", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "noiseCancellationStatusChecker", "Llive/hms/video/network/HMSNetworkManager;", "hmsNetworkManager", "<init>", "(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "noiseCancellation", "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "Ll83/a0;", "initPeerConnections", "(Lq83/d;)Ljava/lang/Object;", "", "audioResourceId", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "streamAndPlayAudioFromRawFile", "(ILlive/hms/video/sdk/HMSActionResultListener;)V", "stopAudioFromRawFile", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "", "nodeId", "setNodeInfo", "(Ljava/lang/String;)V", "Llive/hms/video/media/tracks/HMSTrack;", "track", "publishScreenshare", "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;", "deInitLocalStreams", "()V", "", "isSocketConnectionOpen", "()Z", "token", "endpoint", "peerId", "Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "source", "Llive/hms/video/sdk/models/PerformanceMeasurement;", "performanceMeasurement", "Lkotlin/Function1;", "Llive/hms/video/signal/init/InitConfig;", "initSdkStoreFlags", "connect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "isSimulcastEnabled", "serverSoftwareEchoCancellationEnabled", "initHmsPeerConnectionFactory", "(ZZ)V", "isBackground", "reInitPeerConnectionFactory", "(ZLq83/d;)Ljava/lang/Object;", "disposePeerConnectionFactory", "sessionId", "Llive/hms/video/sdk/models/HMSPeer;", "hmsPeer", "Llive/hms/video/sdk/models/HMSRoom;", "hmsRoom", "websocketUrl", "updateAnalyticsParams", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V", "authToken", "peerName", "data", "serverSideSubscribeDegradation", "shouldSendOffer", "simulcastEnabled", "iceGatheringOnAnyAddressPorts", "join", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;", "notifyServer", "leave", "forPeerId", "toRoleName", "force", "roleChangeRequest", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "requestedBy", "roleChangeAccept", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;", "isSoftwareEchoCancellationEnabled", "initializePeerConnectionFactoryIfNeeded", "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V", "renegotiationICE", "Llive/hms/video/media/tracks/HMSTrackType;", "hmsTrackType", "getLocalTrackByType", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;", "removeTrackFromStream", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Landroid/app/Notification;", "screenShareNotification", "getScreenShareTrack", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "Llive/hms/video/media/capturers/HMSCapturer;", "getAudioShareCapturer", "(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;", "setAudioMixingMode", "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "", "tracks", "", "publish", "([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;", "unpublish", "unpublishScreenshare", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "params", "Llive/hms/video/sdk/models/HMSMessageSendResponse;", "sendMessage", "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/RTCStatsReport;", "getPublishPacketStats", "getSubscribePacketStats", "reason", "removePeerRequest", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "lock", "endRoom", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "hmsTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "type", "roles", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "config", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;", "stopHLSStreaming", "stopRtmpAndRecording", "name", "changeName", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "metadata", "changeMetadata", "key", "Llive/hms/video/sessionstore/SessionMetadataResult;", "getSessionMetadata", "Lcom/google/gson/JsonElement;", "Llive/hms/video/sessionstore/SetSessionMetadataResult;", "changeSessionMetadata", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/role/HMSRole;", "ofRoles", "toRole", "bulkRoleChangeRequest", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/init/TokenRequest;", "tokenRequest", "Llive/hms/video/signal/init/TokenRequestOptions;", "tokenRequestOptions", "Llive/hms/video/signal/init/HMSTokenListener;", "hmsTokenListener", "getAuthTokenByRoomCode", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V", "Llive/hms/video/signal/init/LayoutRequestOptions;", "layoutRequestOptions", "Llive/hms/video/signal/init/HMSLayoutListener;", "hmsLayoutConfigListener", "getLayoutConfigByToken", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metadataModelList", "setHlsSessionMetadata", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "tags", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "setMetadataListener", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/polls/network/PollCreateResponse;", "createPoll", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/polls/network/SetQuestionsResponse;", "createQuestion", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;", "pollId", "pollStart", "pollStop", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "pollQuestionsGet", "Llive/hms/video/polls/network/PollQuestionGetResponse;", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/HMSPollResponseBuilder;", "hmsPollResponseBuilder", "Llive/hms/video/polls/models/answer/PollAnswerResponse;", "pollAddResponse", "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "param", "Llive/hms/video/polls/network/PollGetResponsesReply;", "pollGetResponses", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/network/PollResultsResponse;", "pollGetResults", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "pollGetLeaderboard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/models/HmsPollState;", "state", "count", "start", "Llive/hms/video/polls/network/PollListResponse;", "pollGetList", "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "options", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "createWhiteBoard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;", "id", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "getWhiteBoard", "groupName", "Llive/hms/video/groups/GroupJoinLeaveResponse;", "groupJoin", "groupLeave", "groupAdd", "groupRemove", "roleName", "Ljava/util/ArrayList;", "peerIds", MapboxMap.QFE_LIMIT, "Llive/hms/video/sdk/models/FindPeerResponse;", "findPeers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;", "iteratorId", "peerIteratorNext", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;", "stopRealTimeTranscription", "query", "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/models/PeerNameSearchResponse;", "peerNameSearch", "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;", "Llive/hms/video/transport/models/TransportCallbackTriple;", "callback", "isPeerConnectionDisposed", "(Llive/hms/video/transport/models/TransportCallbackTriple;)Z", "Lhms/webrtc/MediaConstraints;", "constraints", "performPublishRenegotiation", "(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;", "internalJoin", "(Ljava/lang/String;Ljava/lang/String;ZZZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/connection/models/HMSSessionDescription;", "offer", "measuredJoin", "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;ZLq83/d;)Ljava/lang/Object;", "isScreenShare", "(Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/connection/models/HMSConnectionRole;", "role", "handleIceConnectionFailed", "(Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;", "internalConnect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "userAgent", "makeWebsocketURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Llive/hms/video/error/HMSException;", "ex", "shouldRetry", "(Llive/hms/video/error/HMSException;)Z", "Llive/hms/video/transport/models/TransportFailureCategory;", "category", "Lq83/d;", "", "task", "scheduleRetry", "(Llive/hms/video/error/HMSException;Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "tearDownTransport", "Llive/hms/video/transport/ITransportObserver;", "Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/connection/subscribe/RemoteTrackFactory;", "Llive/hms/video/utils/HMSAgentOs;", "Llive/hms/video/transport/IsQaLink;", "Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "Llive/hms/video/network/HMSNetworkManager;", "Llive/hms/video/transport/models/JoinParameters;", "joinParameters", "Llive/hms/video/transport/models/JoinParameters;", "Llive/hms/video/transport/models/ConnectParameters;", "connectParameters", "Llive/hms/video/transport/models/ConnectParameters;", "Llive/hms/video/sdk/models/PerformanceMeasurement;", "isTearDownInProgress", "Z", "hasJoined", "isRenegotiationDone", "isPeerConnectionReady", "setSimulcastEnabled", "(Z)V", "getServerSoftwareEchoCancellationEnabled", "setServerSoftwareEchoCancellationEnabled", "Llive/hms/video/connection/publish/HMSPublishConnection;", "publishConnection", "Llive/hms/video/connection/publish/HMSPublishConnection;", "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;", "subscribeConnection", "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;", "lastKnownNetworkType", "Ljava/lang/String;", "Llive/hms/video/transport/models/TransportState;", "value", "Llive/hms/video/transport/models/TransportState;", "getState", "()Llive/hms/video/transport/models/TransportState;", "setState", "(Llive/hms/video/transport/models/TransportState;)V", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService", "()Llive/hms/video/events/AnalyticsEventsService;", "tracksToPublish", "Ljava/util/ArrayList;", "screenShareTrack", "Llive/hms/video/media/tracks/HMSTrack;", "initConfig", "Llive/hms/video/signal/init/InitConfig;", "Lhms/webrtc/MediaStream;", "nativeStream", "Lhms/webrtc/MediaStream;", "Llive/hms/video/media/streams/HMSLocalStream;", "stream", "Llive/hms/video/media/streams/HMSLocalStream;", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "hmsPeerConnectionFactory$delegate", "Ll83/h;", "getHmsPeerConnectionFactory", "()Llive/hms/video/factories/HMSPeerConnectionFactory;", "hmsPeerConnectionFactory", "isHmsPeerConnectionFactoryInitialized", "Llive/hms/video/transport/ITransportListener;", "connectivityListener", "Llive/hms/video/transport/ITransportListener;", "getConnectivityListener", "()Llive/hms/video/transport/ITransportListener;", "setConnectivityListener", "(Llive/hms/video/transport/ITransportListener;)V", "Ljava/util/HashMap;", "callbacks", "Ljava/util/HashMap;", "Llive/hms/video/transport/RetryScheduler;", "retryScheduler", "Llive/hms/video/transport/RetryScheduler;", "retryPublishIceFailedTask", "Lkotlin/jvm/functions/Function1;", "retrySignalDisconnectTask", "timeAfterJoinResponse", "J", "getTimeAfterJoinResponse", "()J", "setTimeAfterJoinResponse", "(J)V", "timeAfterWSOpen", "getTimeAfterWSOpen", "setTimeAfterWSOpen", "retrySubscribeIceFailedTask", "live/hms/video/transport/HMSTransport$signalObserver$1", "signalObserver", "Llive/hms/video/transport/HMSTransport$signalObserver$1;", "Llive/hms/video/signal/ISignal;", "signal", "Llive/hms/video/signal/ISignal;", "live/hms/video/transport/HMSTransport$publishConnectionObserver$1", "publishConnectionObserver", "Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;", "live/hms/video/transport/HMSTransport$subscribeConnectionObserver$1", "subscribeConnectionObserver", "Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;", "nodeID", "getNodeID", "()Ljava/lang/String;", "setNodeID", "Landroid/os/HandlerThread;", "rtcConfigurationThread", "Landroid/os/HandlerThread;", "Landroid/os/Handler;", "rtcConfigurationHandler", "Landroid/os/Handler;", "Lhms/webrtc/AudioTrack;", "nativeAudioTrack", "Lhms/webrtc/AudioTrack;", "getNativeAudioTrack", "()Lhms/webrtc/AudioTrack;", "setNativeAudioTrack", "(Lhms/webrtc/AudioTrack;)V", "Lhms/webrtc/VideoTrack;", "nativeVideoTrack", "Lhms/webrtc/VideoTrack;", "getNativeVideoTrack", "()Lhms/webrtc/VideoTrack;", "setNativeVideoTrack", "(Lhms/webrtc/VideoTrack;)V", "Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "localVideoTrack", "Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "getLocalVideoTrack", "()Llive/hms/video/media/tracks/HMSLocalVideoTrack;", "setLocalVideoTrack", "(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V", "Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "localAudioTrack", "Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "getLocalAudioTrack", "()Llive/hms/video/media/tracks/HMSLocalAudioTrack;", "setLocalAudioTrack", "(Llive/hms/video/media/tracks/HMSLocalAudioTrack;)V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSTransport implements ITransport {
    private static final String PROTOCOL_SPEC = "20240720";
    private static final String PROTOCOL_VERSION = "2.5";
    private static final String TAG = "HMSTransport";
    private final HMSAgentOs agentOs;
    private final AnalyticsEventsService analyticsEventsService;
    private final HashMap<String, TransportCallbackTriple> callbacks;
    private ConnectParameters connectParameters;
    private ITransportListener connectivityListener;
    private boolean hasJoined;
    private final HMSNetworkManager hmsNetworkManager;

    /* JADX INFO: renamed from: hmsPeerConnectionFactory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h hmsPeerConnectionFactory;
    private final HMSTrackSettings hmsTrackSettings;
    private InitConfig initConfig;
    private boolean isHmsPeerConnectionFactoryInitialized;
    private boolean isPeerConnectionReady;
    private final IsQaLink isQaLink;
    private boolean isRenegotiationDone;
    private boolean isSimulcastEnabled;
    private volatile boolean isTearDownInProgress;
    private JoinParameters joinParameters;
    private String lastKnownNetworkType;
    private HMSLocalAudioTrack localAudioTrack;
    private HMSLocalVideoTrack localVideoTrack;
    private AudioTrack nativeAudioTrack;
    private MediaStream nativeStream;
    private VideoTrack nativeVideoTrack;
    private String nodeID;
    private final NoiseCancellationStatusChecker noiseCancellationStatusChecker;
    private final ITransportObserver observer;
    private final OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo;
    private PerformanceMeasurement performanceMeasurement;
    private HMSPublishConnection publishConnection;
    private final HMSTransport$publishConnectionObserver$1 publishConnectionObserver;
    private final Function1 retryPublishIceFailedTask;
    private final RetryScheduler retryScheduler;
    private final Function1 retrySignalDisconnectTask;
    private final Function1 retrySubscribeIceFailedTask;
    private final Handler rtcConfigurationHandler;
    private final HandlerThread rtcConfigurationThread;
    private HMSTrack screenShareTrack;
    private boolean serverSoftwareEchoCancellationEnabled;
    private final ISignal signal;
    private final HMSTransport$signalObserver$1 signalObserver;
    private TransportState state;
    private HMSLocalStream stream;
    private HMSSubscribeConnection subscribeConnection;
    private final HMSTransport$subscribeConnectionObserver$1 subscribeConnectionObserver;
    private long timeAfterJoinResponse;
    private long timeAfterWSOpen;
    private final RemoteTrackFactory trackFactory;
    private ArrayList<HMSTrack> tracksToPublish;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HMSTrackType.values().length];
            try {
                iArr[HMSTrackType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSTrackType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMSConnectionRole.values().length];
            try {
                iArr2[HMSConnectionRole.PUBLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HMSConnectionRole.SUBSCRIBE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$connect$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {936, 949, 950}, m100432m = "connect")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243751 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C243751(InterfaceC30057d<? super C243751> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.connect(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$getAudioShareCapturer$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243761 extends C22672i implements InterfaceC4339a {
        public C243761(Object obj) {
            super(0, 0, ITransportObserver.class, obj, "onStopAudioshare", "onStopAudioshare()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134458invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134458invoke() {
            ((ITransportObserver) this.receiver).onStopAudioshare();
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$getLocalTrackByType$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1235, 1249, 1276}, m100432m = "getLocalTrackByType")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243771 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C243771(InterfaceC30057d<? super C243771> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.getLocalTrackByType(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$getScreenShareTrack$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1339, 1343, 1348}, m100432m = "getScreenShareTrack")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243781 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C243781(InterfaceC30057d<? super C243781> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.getScreenShareTrack(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$initPeerConnections$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {681, 683}, m100432m = "initPeerConnections")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243791 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C243791(InterfaceC30057d<? super C243791> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.initPeerConnections(this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$internalConnect$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {842, 871}, m100432m = "internalConnect")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243801 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C243801(InterfaceC30057d<? super C243801> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.internalConnect(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$internalJoin$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {602, 613, 630, 639}, m100432m = "internalJoin")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243811 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C243811(InterfaceC30057d<? super C243811> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.internalJoin(null, null, false, false, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$join$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1082, 1095}, m100432m = "join")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243821 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        /* synthetic */ Object result;

        public C243821(InterfaceC30057d<? super C243821> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.join(null, null, null, null, false, false, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$measuredJoin$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {665}, m100432m = "measuredJoin")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243831 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C243831(InterfaceC30057d<? super C243831> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.measuredJoin(null, null, false, null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$performPublishRenegotiation$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {529, 534, 541, 553}, m100432m = "performPublishRenegotiation")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243841 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C243841(InterfaceC30057d<? super C243841> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.performPublishRenegotiation(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$publish$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {738}, m100432m = "publish")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243851 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C243851(InterfaceC30057d<? super C243851> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.publish(null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$publish$4 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1395, 1396, 1411}, m100432m = "publish")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243864 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C243864(InterfaceC30057d<? super C243864> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.publish(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$renegotiationICE$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1221}, m100432m = "renegotiationICE")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243871 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243871(InterfaceC30057d<? super C243871> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.renegotiationICE(this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$scheduleRetry$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1021}, m100432m = "scheduleRetry")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243891 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C243891(InterfaceC30057d<? super C243891> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.scheduleRetry(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$tearDownTransport$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1127, 1149, 1153, 1183, 1183, 1183}, m100432m = "tearDownTransport")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243901 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C243901(InterfaceC30057d<? super C243901> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.tearDownTransport(this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$unpublish$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {802}, m100432m = "unpublish")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243911 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C243911(InterfaceC30057d<? super C243911> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.unpublish((HMSTrack) null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$unpublish$4 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1429}, m100432m = "unpublish")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243924 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C243924(InterfaceC30057d<? super C243924> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.unpublish((HMSTrack[]) null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.transport.HMSTransport$unpublishScreenshare$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.transport.HMSTransport", m100430f = "HMSTransport.kt", m100431l = {1436}, m100432m = "unpublishScreenshare")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243931 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C243931(InterfaceC30057d<? super C243931> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSTransport.this.unpublishScreenshare(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [live.hms.video.transport.HMSTransport$subscribeConnectionObserver$1] */
    public HMSTransport(Context context, ITransportObserver observer, HMSAnalyticsEventLevel analyticsEventLevel, HMSTrackSettings hmsTrackSettings, RemoteTrackFactory trackFactory, HMSAgentOs agentOs, final IsQaLink isQaLink, OfflineAnalyticsPeerInfo offlineAnalyticsPeerInfo, NoiseCancellationStatusChecker noiseCancellationStatusChecker, HMSNetworkManager hmsNetworkManager) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(observer, "observer");
        AbstractC22676k.m65750j(analyticsEventLevel, "analyticsEventLevel");
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        AbstractC22676k.m65750j(trackFactory, "trackFactory");
        AbstractC22676k.m65750j(agentOs, "agentOs");
        AbstractC22676k.m65750j(isQaLink, "isQaLink");
        AbstractC22676k.m65750j(offlineAnalyticsPeerInfo, "offlineAnalyticsPeerInfo");
        AbstractC22676k.m65750j(noiseCancellationStatusChecker, "noiseCancellationStatusChecker");
        AbstractC22676k.m65750j(hmsNetworkManager, "hmsNetworkManager");
        this.observer = observer;
        this.hmsTrackSettings = hmsTrackSettings;
        this.trackFactory = trackFactory;
        this.agentOs = agentOs;
        this.isQaLink = isQaLink;
        this.offlineAnalyticsPeerInfo = offlineAnalyticsPeerInfo;
        this.noiseCancellationStatusChecker = noiseCancellationStatusChecker;
        this.hmsNetworkManager = hmsNetworkManager;
        this.isSimulcastEnabled = true;
        this.state = TransportState.Disconnected;
        this.analyticsEventsService = new AnalyticsEventsService(context, analyticsEventLevel, agentOs, new AbstractC22691v(isQaLink) { // from class: live.hms.video.transport.HMSTransport$analyticsEventsService$1
            @Override // j93.InterfaceC21488u
            public Object get() {
                return Boolean.valueOf(((IsQaLink) this.receiver).getIsQa());
            }
        }, offlineAnalyticsPeerInfo);
        this.tracksToPublish = new ArrayList<>();
        this.hmsPeerConnectionFactory = AbstractC30060g.m92088H(new C23045q(20, context, this));
        this.callbacks = new HashMap<>();
        this.retryScheduler = new RetryScheduler(getAnalyticsEventsService(), new C22541b(this, 21));
        this.retryPublishIceFailedTask = new HMSTransport$retryPublishIceFailedTask$1(this, null);
        this.retrySignalDisconnectTask = new HMSTransport$retrySignalDisconnectTask$1(this, null);
        this.retrySubscribeIceFailedTask = new HMSTransport$retrySubscribeIceFailedTask$1(this, null);
        HMSTransport$signalObserver$1 hMSTransport$signalObserver$1 = new HMSTransport$signalObserver$1(this);
        this.signalObserver = hMSTransport$signalObserver$1;
        this.signal = new JSONRpcSignal(hMSTransport$signalObserver$1);
        this.publishConnectionObserver = new HMSTransport$publishConnectionObserver$1(this);
        this.subscribeConnectionObserver = new ISubscribeConnectionObserver() { // from class: live.hms.video.transport.HMSTransport$subscribeConnectionObserver$1

            @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
                    try {
                        iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // live.hms.video.connection.subscribe.ISubscribeConnectionObserver
            public Object onApiChannelMessage(JsonObject jsonObject, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                boolean z4 = this.this$0.isTearDownInProgress;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (!z4 && this.this$0.getState() != TransportState.Disconnected && this.this$0.getState() != TransportState.Failed) {
                    Object objOnNotification = this.this$0.observer.onNotification(jsonObject, interfaceC30057d);
                    return objOnNotification == EnumC31071a.f128113w ? objOnNotification : c23454a0;
                }
                HMSLogger.INSTANCE.m71141w("HMSTransport", "Ignoring " + jsonObject + " as leave in progress");
                return c23454a0;
            }

            @Override // live.hms.video.connection.subscribe.ISubscribeConnectionObserver
            public Object onDataChannel(DataChannel dataChannel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ISubscribeConnectionObserver.DefaultImpls.onDataChannel(this, dataChannel, interfaceC30057d);
            }

            @Override // live.hms.video.connection.IConnectionObserver
            public Object onIceCandidate(IceCandidate iceCandidate, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.this$0.observer.onIceCandidate(iceCandidate, false);
                return C23454a0.f92919a;
            }

            @Override // live.hms.video.connection.IConnectionObserver
            public Object onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC3055s deferred;
                HMSLogger.m71136d("HMSTransport", "[role=SUBSCRIBE] onIceConnectionChange state :: " + iceConnectionState);
                int i13 = WhenMappings.$EnumSwitchMapping$0[iceConnectionState.ordinal()];
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 1) {
                    Object objHandleIceConnectionFailed = this.this$0.handleIceConnectionFailed(HMSConnectionRole.SUBSCRIBE, interfaceC30057d);
                    return objHandleIceConnectionFailed == EnumC31071a.f128113w ? objHandleIceConnectionFailed : c23454a0;
                }
                if (i13 == 2) {
                    TransportCallbackTriple transportCallbackTriple = (TransportCallbackTriple) this.this$0.callbacks.remove(HMSConstantsKt.cSubscribeRenegotiationCallback);
                    if (transportCallbackTriple != null && (deferred = transportCallbackTriple.getDeferred()) != null) {
                        ((C3058t) deferred).m8807L(Boolean.TRUE);
                    }
                    this.this$0.observer.onICEConnected(false);
                }
                return c23454a0;
            }

            @Override // live.hms.video.connection.IConnectionObserver
            public Object onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.this$0.observer.onSelectedCandidatePairChanged(candidatePairChangeEvent, false);
                return C23454a0.f92919a;
            }

            @Override // live.hms.video.connection.subscribe.ISubscribeConnectionObserver
            public Object onTrackAdd(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                HMSLogger.INSTANCE.m71139i("HMSTransport", "ISubscribeConnectionObserver: onTrackAdd trackId=" + hMSTrack.getTrackId());
                this.this$0.observer.onTrackAdd(hMSTrack);
                return C23454a0.f92919a;
            }

            @Override // live.hms.video.connection.subscribe.ISubscribeConnectionObserver
            public Object onTrackRemove(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                HMSLogger.INSTANCE.m71139i("HMSTransport", "ISubscribeConnectionObserver: onTrackRemove trackId=" + hMSTrack.getTrackId());
                this.this$0.observer.onTrackRemove(hMSTrack);
                return C23454a0.f92919a;
            }
        };
        this.nodeID = "";
        HandlerThread handlerThread = new HandlerThread("RTCConfigurationThread");
        handlerThread.start();
        this.rtcConfigurationThread = handlerThread;
        this.rtcConfigurationHandler = new Handler(handlerThread.getLooper());
    }

    private final HMSPeerConnectionFactory getHmsPeerConnectionFactory() {
        return (HMSPeerConnectionFactory) this.hmsPeerConnectionFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleIceConnectionFailed(HMSConnectionRole hMSConnectionRole, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        int i13 = WhenMappings.$EnumSwitchMapping$1[hMSConnectionRole.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 1) {
            Object objSchedule = this.retryScheduler.schedule(TransportFailureCategory.PublishIceConnectionFailed, ErrorFactory.WebrtcErrors.ICEFailure$default(ErrorFactory.WebrtcErrors.INSTANCE, ErrorFactory.Action.PUBLISH, null, null, null, 14, null), true, this.retryPublishIceFailedTask, (16 & 16) != 0 ? 60000L : 0L, interfaceC30057d);
            return objSchedule == EnumC31071a.f128113w ? objSchedule : c23454a0;
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object objSchedule2 = this.retryScheduler.schedule(TransportFailureCategory.SubscribeIceConnectionFailed, ErrorFactory.WebrtcErrors.ICEFailure$default(ErrorFactory.WebrtcErrors.INSTANCE, ErrorFactory.Action.SUBSCRIBE, null, null, null, 14, null), true, this.retrySubscribeIceFailedTask, (16 & 16) != 0 ? 60000L : 0L, interfaceC30057d);
        return objSchedule2 == EnumC31071a.f128113w ? objSchedule2 : c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HMSPeerConnectionFactory hmsPeerConnectionFactory_delegate$lambda$0(Context context, HMSTransport this$0) {
        AbstractC22676k.m65750j(context, "$context");
        AbstractC22676k.m65750j(this$0, "this$0");
        return new HMSPeerConnectionFactory(context, this$0.getAnalyticsEventsService(), this$0.noiseCancellationStatusChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[Catch: Exception -> 0x00de, TryCatch #1 {Exception -> 0x00de, blocks: (B:36:0x00bc, B:38:0x00da, B:41:0x00e2, B:43:0x00ec, B:49:0x00f7, B:51:0x0109, B:56:0x0113), top: B:100:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: Exception -> 0x00de, TRY_LEAVE, TryCatch #1 {Exception -> 0x00de, blocks: (B:36:0x00bc, B:38:0x00da, B:41:0x00e2, B:43:0x00ec, B:49:0x00f7, B:51:0x0109, B:56:0x0113), top: B:100:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109 A[Catch: Exception -> 0x00de, TryCatch #1 {Exception -> 0x00de, blocks: (B:36:0x00bc, B:38:0x00da, B:41:0x00e2, B:43:0x00ec, B:49:0x00f7, B:51:0x0109, B:56:0x0113), top: B:100:0x00bc }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c A[Catch: HMSException -> 0x0085, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x014b A[Catch: HMSException -> 0x0085, TRY_LEAVE, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196 A[Catch: Exception -> 0x004a, TryCatch #3 {Exception -> 0x004a, blocks: (B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019a A[Catch: Exception -> 0x004a, TryCatch #3 {Exception -> 0x004a, blocks: (B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: HMSException -> 0x0085, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6 A[Catch: HMSException -> 0x0085, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01cf A[Catch: HMSException -> 0x0085, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:94:0x020a A[Catch: HMSException -> 0x0085, TryCatch #2 {HMSException -> 0x0085, blocks: (B:74:0x01b9, B:76:0x01bd, B:77:0x01c2, B:79:0x01c6, B:80:0x01cb, B:82:0x01cf, B:83:0x01d4, B:86:0x01f9, B:88:0x01fd, B:89:0x0202, B:57:0x0138, B:59:0x013c, B:60:0x0141, B:62:0x014b, B:92:0x0206, B:94:0x020a, B:95:0x020f, B:26:0x007b, B:28:0x007f, B:14:0x0045, B:67:0x0174, B:69:0x0196, B:71:0x019a, B:72:0x01ab, B:73:0x01ad, B:63:0x0150), top: B:102:0x0031, inners: #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object internalConnect(String str, String str2, String str3, Function1 function1, InterfaceC30057d<? super InitConfig> interfaceC30057d) throws Exception {
        C243801 c243801;
        HMSTransport hMSTransport;
        long j7;
        Object objFetchInitConfig$default;
        String str4;
        String str5;
        Function1 function2;
        HMSTransport hMSTransport2;
        PerformanceMeasurement performanceMeasurement;
        InitConfig initConfig;
        ServerConfiguration serverConfiguration;
        List<String> enabledFlags;
        List<String> list;
        ServerConfiguration serverConfiguration2;
        List<String> enabledFlags2;
        PerformanceMeasurement performanceMeasurement2;
        PerformanceMeasurement performanceMeasurement3;
        String strMakeWebsocketURL;
        long jCurrentTimeMillis;
        ISignal iSignal;
        String str6;
        String connectedNetworkType;
        PerformanceMeasurement performanceMeasurement4;
        PerformanceMeasurement performanceMeasurement5;
        PerformanceMeasurement performanceMeasurement6;
        if (interfaceC30057d instanceof C243801) {
            c243801 = (C243801) interfaceC30057d;
            int i13 = c243801.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243801.label = i13 - Integer.MIN_VALUE;
            } else {
                c243801 = new C243801(interfaceC30057d);
            }
        } else {
            c243801 = new C243801(interfaceC30057d);
        }
        C243801 c243802 = c243801;
        Object obj = c243802.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243802.label;
        HMSTransport hMSTransport3 = 1;
        int i15 = 2;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HMSLogger.m71136d(TAG, "connect: started ⏰");
                    PerformanceMeasurement performanceMeasurement7 = this.performanceMeasurement;
                    if (performanceMeasurement7 != null) {
                        performanceMeasurement7.start$lib_release(EVENT_TYPE.INIT_CALL);
                    }
                    try {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        InitService initService = InitService.INSTANCE;
                        HMSAgentOs hMSAgentOs = this.agentOs;
                        c243802.L$0 = this;
                        c243802.L$1 = str;
                        c243802.L$2 = str3;
                        c243802.L$3 = function1;
                        c243802.J$0 = jCurrentTimeMillis2;
                        c243802.label = 1;
                        j7 = jCurrentTimeMillis2;
                        objFetchInitConfig$default = InitService.fetchInitConfig$default(initService, str, null, hMSAgentOs, str2, c243802, 2, null);
                        if (objFetchInitConfig$default != enumC31071a) {
                            str4 = str;
                            str5 = str3;
                            function2 = function1;
                            hMSTransport2 = this;
                            initConfig = (InitConfig) objFetchInitConfig$default;
                            HMSLogger.m71136d("Profiling", "time taken to fetch init : " + (System.currentTimeMillis() - j7));
                            hMSTransport2.observer.onInitFetched();
                            if (function2 != null) {
                                function2.invoke(initConfig);
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            serverConfiguration = initConfig.getServerConfiguration();
                            if (serverConfiguration != null) {
                                enabledFlags = serverConfiguration.getEnabledFlags();
                            } else {
                                enabledFlags = null;
                            }
                            list = C25271y.f99162w;
                            if (enabledFlags == null) {
                                enabledFlags = list;
                            }
                            hMSTransport2.isSimulcastEnabled = enabledFlags.contains(Features.SIMULCAST.INSTANCE.getServerName());
                            serverConfiguration2 = initConfig.getServerConfiguration();
                            if (serverConfiguration2 != null) {
                                enabledFlags2 = serverConfiguration2.getEnabledFlags();
                            } else {
                                enabledFlags2 = null;
                            }
                            if (enabledFlags2 == null) {
                                list = enabledFlags2;
                            }
                            boolean zContains = list.contains(Features.SOFTWARE_ECHO_CANCELLATION_ENABLED.INSTANCE.getServerName());
                            hMSTransport2.serverSoftwareEchoCancellationEnabled = zContains;
                            hMSTransport2.initHmsPeerConnectionFactory(hMSTransport2.isSimulcastEnabled, zContains);
                            HMSLogger.m71136d("Profiling", "time taken to initialize peerconnection  " + (System.currentTimeMillis() - jCurrentTimeMillis3));
                            performanceMeasurement2 = hMSTransport2.performanceMeasurement;
                            if (performanceMeasurement2 != null) {
                                performanceMeasurement2.end$lib_release(EVENT_TYPE.INIT_CALL);
                            }
                            String userAgentUrlEncoded = hMSTransport2.agentOs.getUserAgentUrlEncoded();
                            performanceMeasurement3 = hMSTransport2.performanceMeasurement;
                            if (performanceMeasurement3 != null) {
                                performanceMeasurement3.start$lib_release(EVENT_TYPE.WEB_SOCKET_CONNECT_TIME);
                            }
                            strMakeWebsocketURL = hMSTransport2.makeWebsocketURL(initConfig.getEndpoint(), str5, str4, userAgentUrlEncoded);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            iSignal = hMSTransport2.signal;
                            c243802.L$0 = hMSTransport2;
                            c243802.L$1 = initConfig;
                            c243802.L$2 = strMakeWebsocketURL;
                            c243802.L$3 = null;
                            c243802.J$0 = jCurrentTimeMillis;
                            i15 = 2;
                            c243802.label = 2;
                            if (iSignal.open(strMakeWebsocketURL, c243802) != enumC31071a) {
                                str6 = strMakeWebsocketURL;
                                hMSTransport3 = hMSTransport2;
                                HMSLogger.m71136d("Profiling", "time taken to open web socket : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                                connectedNetworkType = hMSTransport3.hmsNetworkManager.getConnectedNetworkType();
                                if (!AbstractC22676k.m65745e(hMSTransport3.lastKnownNetworkType, connectedNetworkType)) {
                                    if (hMSTransport3.lastKnownNetworkType != null) {
                                        hMSTransport3.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.networkTypeEvent(connectedNetworkType)).flush();
                                    }
                                    hMSTransport3.lastKnownNetworkType = connectedNetworkType;
                                }
                                hMSTransport3.setTimeAfterWSOpen(System.currentTimeMillis());
                                hMSTransport3.observer.onWebSocketConnected(str6);
                                performanceMeasurement4 = hMSTransport3.performanceMeasurement;
                                if (performanceMeasurement4 != null) {
                                    performanceMeasurement4.end$lib_release(EVENT_TYPE.WEB_SOCKET_CONNECT_TIME);
                                }
                                performanceMeasurement5 = hMSTransport3.performanceMeasurement;
                                if (performanceMeasurement5 != null) {
                                    performanceMeasurement5.start$lib_release(EVENT_TYPE.POLICY_CHANGE);
                                }
                                performanceMeasurement6 = hMSTransport3.performanceMeasurement;
                                if (performanceMeasurement6 != null) {
                                    performanceMeasurement6.start$lib_release(EVENT_TYPE.ROOM_STATE);
                                }
                                hMSTransport3.getAnalyticsEventsService().addTransport(hMSTransport3.signal);
                                hMSTransport3.getAnalyticsEventsService().flush();
                                HMSLogger.m71136d(TAG, "connect: successful ✅");
                                hMSTransport3.setState(TransportState.SignalConnected);
                                ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), null, i15, null);
                                return initConfig;
                            }
                        }
                        return enumC31071a;
                    } catch (Exception e5) {
                        e = e5;
                        hMSTransport = this;
                        performanceMeasurement = hMSTransport.performanceMeasurement;
                        if (performanceMeasurement != null) {
                            performanceMeasurement.end$lib_release(EVENT_TYPE.INIT_CALL);
                        }
                        throw e;
                    }
                }
                if (i14 == 1) {
                    long j13 = c243802.J$0;
                    function2 = (Function1) c243802.L$3;
                    str5 = (String) c243802.L$2;
                    str4 = (String) c243802.L$1;
                    hMSTransport = (HMSTransport) c243802.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        j7 = j13;
                        hMSTransport2 = hMSTransport;
                        objFetchInitConfig$default = obj;
                        try {
                            initConfig = (InitConfig) objFetchInitConfig$default;
                            HMSLogger.m71136d("Profiling", "time taken to fetch init : " + (System.currentTimeMillis() - j7));
                            hMSTransport2.observer.onInitFetched();
                            if (function2 != null) {
                                function2.invoke(initConfig);
                            }
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            serverConfiguration = initConfig.getServerConfiguration();
                            if (serverConfiguration != null) {
                                enabledFlags = serverConfiguration.getEnabledFlags();
                            } else {
                                enabledFlags = null;
                            }
                            list = C25271y.f99162w;
                            if (enabledFlags == null) {
                                enabledFlags = list;
                            }
                            hMSTransport2.isSimulcastEnabled = enabledFlags.contains(Features.SIMULCAST.INSTANCE.getServerName());
                            serverConfiguration2 = initConfig.getServerConfiguration();
                            if (serverConfiguration2 != null) {
                                enabledFlags2 = serverConfiguration2.getEnabledFlags();
                            } else {
                                enabledFlags2 = null;
                            }
                            if (enabledFlags2 == null) {
                                list = enabledFlags2;
                            }
                            boolean zContains2 = list.contains(Features.SOFTWARE_ECHO_CANCELLATION_ENABLED.INSTANCE.getServerName());
                            hMSTransport2.serverSoftwareEchoCancellationEnabled = zContains2;
                            hMSTransport2.initHmsPeerConnectionFactory(hMSTransport2.isSimulcastEnabled, zContains2);
                            HMSLogger.m71136d("Profiling", "time taken to initialize peerconnection  " + (System.currentTimeMillis() - jCurrentTimeMillis4));
                            performanceMeasurement2 = hMSTransport2.performanceMeasurement;
                            if (performanceMeasurement2 != null) {
                                performanceMeasurement2.end$lib_release(EVENT_TYPE.INIT_CALL);
                            }
                            String userAgentUrlEncoded2 = hMSTransport2.agentOs.getUserAgentUrlEncoded();
                            performanceMeasurement3 = hMSTransport2.performanceMeasurement;
                            if (performanceMeasurement3 != null) {
                                performanceMeasurement3.start$lib_release(EVENT_TYPE.WEB_SOCKET_CONNECT_TIME);
                            }
                            strMakeWebsocketURL = hMSTransport2.makeWebsocketURL(initConfig.getEndpoint(), str5, str4, userAgentUrlEncoded2);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            iSignal = hMSTransport2.signal;
                            c243802.L$0 = hMSTransport2;
                            c243802.L$1 = initConfig;
                            c243802.L$2 = strMakeWebsocketURL;
                            c243802.L$3 = null;
                            c243802.J$0 = jCurrentTimeMillis;
                            i15 = 2;
                            c243802.label = 2;
                            if (iSignal.open(strMakeWebsocketURL, c243802) != enumC31071a) {
                                str6 = strMakeWebsocketURL;
                                hMSTransport3 = hMSTransport2;
                            }
                            return enumC31071a;
                        } catch (Exception e13) {
                            e = e13;
                            hMSTransport = hMSTransport2;
                            performanceMeasurement = hMSTransport.performanceMeasurement;
                            if (performanceMeasurement != null) {
                                performanceMeasurement.end$lib_release(EVENT_TYPE.INIT_CALL);
                            }
                            throw e;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        performanceMeasurement = hMSTransport.performanceMeasurement;
                        if (performanceMeasurement != null) {
                            performanceMeasurement.end$lib_release(EVENT_TYPE.INIT_CALL);
                        }
                        throw e;
                    }
                }
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jCurrentTimeMillis = c243802.J$0;
                str6 = (String) c243802.L$2;
                initConfig = (InitConfig) c243802.L$1;
                HMSTransport hMSTransport4 = (HMSTransport) c243802.L$0;
                AbstractC34132o.m107864I(obj);
                hMSTransport3 = hMSTransport4;
                HMSLogger.m71136d("Profiling", "time taken to open web socket : " + (System.currentTimeMillis() - jCurrentTimeMillis));
                connectedNetworkType = hMSTransport3.hmsNetworkManager.getConnectedNetworkType();
                if (!AbstractC22676k.m65745e(hMSTransport3.lastKnownNetworkType, connectedNetworkType)) {
                    if (hMSTransport3.lastKnownNetworkType != null) {
                        hMSTransport3.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.networkTypeEvent(connectedNetworkType)).flush();
                    }
                    hMSTransport3.lastKnownNetworkType = connectedNetworkType;
                }
                hMSTransport3.setTimeAfterWSOpen(System.currentTimeMillis());
                hMSTransport3.observer.onWebSocketConnected(str6);
                performanceMeasurement4 = hMSTransport3.performanceMeasurement;
                if (performanceMeasurement4 != null) {
                    performanceMeasurement4.end$lib_release(EVENT_TYPE.WEB_SOCKET_CONNECT_TIME);
                }
                performanceMeasurement5 = hMSTransport3.performanceMeasurement;
                if (performanceMeasurement5 != null) {
                    performanceMeasurement5.start$lib_release(EVENT_TYPE.POLICY_CHANGE);
                }
                performanceMeasurement6 = hMSTransport3.performanceMeasurement;
                if (performanceMeasurement6 != null) {
                    performanceMeasurement6.start$lib_release(EVENT_TYPE.ROOM_STATE);
                }
                hMSTransport3.getAnalyticsEventsService().addTransport(hMSTransport3.signal);
                hMSTransport3.getAnalyticsEventsService().flush();
                HMSLogger.m71136d(TAG, "connect: successful ✅");
                hMSTransport3.setState(TransportState.SignalConnected);
                ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), null, i15, null);
                return initConfig;
            } catch (Exception e15) {
                PerformanceMeasurement performanceMeasurement8 = hMSTransport3.performanceMeasurement;
                if (performanceMeasurement8 != null) {
                    performanceMeasurement8.end$lib_release(EVENT_TYPE.WEB_SOCKET_CONNECT_TIME);
                }
                throw e15;
            }
        } catch (HMSException e16) {
            HMSLogger.m71136d(TAG, "internalConnect:: failed ❌ [error=" + e16 + ']');
            throw e16;
        }
    }

    public static /* synthetic */ Object internalConnect$default(HMSTransport hMSTransport, String str, String str2, String str3, Function1 function1, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            function1 = null;
        }
        return hMSTransport.internalConnect(str, str2, str3, function1, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x0182 A[Catch: HMSException -> 0x02b6, TRY_LEAVE, TryCatch #4 {HMSException -> 0x02b6, blocks: (B:46:0x0162, B:48:0x0182), top: B:109:0x0162 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0207 A[Catch: HMSException -> 0x0293, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:58:0x020b A[Catch: HMSException -> 0x0293, TRY_LEAVE, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0213  */
    /* JADX WARN: Code duplicated, block: B:62:0x0216  */
    /* JADX WARN: Code duplicated, block: B:65:0x021f A[Catch: HMSException -> 0x0293, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0225  */
    /* JADX WARN: Code duplicated, block: B:70:0x025f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0289 A[Catch: HMSException -> 0x0293, LOOP:0: B:72:0x0283->B:74:0x0289, LOOP_END, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02a1 A[Catch: HMSException -> 0x0293, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02a7 A[Catch: HMSException -> 0x0293, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02ab A[Catch: HMSException -> 0x0293, TryCatch #2 {HMSException -> 0x0293, blocks: (B:71:0x0261, B:72:0x0283, B:74:0x0289, B:77:0x0297, B:54:0x01ff, B:56:0x0207, B:58:0x020b, B:63:0x0218, B:65:0x021f, B:68:0x0227, B:78:0x02a1, B:79:0x02a6, B:80:0x02a7, B:81:0x02aa, B:82:0x02ab, B:83:0x02b2), top: B:106:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0182, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v15, types: [live.hms.video.events.AnalyticsEventFactory] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Date] */
    /* JADX WARN: Type inference failed for: r9v10, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object internalJoin(String str, String str2, boolean z4, boolean z13, boolean z14, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C243811 c243811;
        char c3;
        ?? date;
        String str3;
        ?? r10;
        String str4;
        String str5;
        MediaConstraints mediaConstraints;
        boolean z15;
        long j7;
        boolean z16;
        HMSTransport hMSTransport;
        ?? r14;
        ?? r15;
        ?? r16;
        long jCurrentTimeMillis;
        String str6;
        String str7;
        HMSPublishConnection hMSPublishConnection;
        String str8;
        long jCurrentTimeMillis2;
        Throwable th3;
        String str9;
        String str10;
        ?? r17;
        ?? r18;
        ?? r19;
        Object objMeasuredJoin;
        long j13;
        ?? r110;
        HMSPublishConnection hMSPublishConnection2;
        ?? r111;
        ?? r24;
        ?? r25;
        ?? r112;
        ?? r26;
        HMSSessionDescription hMSSessionDescription;
        HMSPublishConnection hMSPublishConnection3;
        String sfuNodeId;
        String str11;
        HMSSubscribeConnection hMSSubscribeConnection;
        String sfuNodeId2;
        SessionDescription sessionDescriptionM134454native;
        ?? r113;
        ?? r27;
        Iterator it;
        String str12 = str;
        String str13 = "time taken to set remote answer : ";
        if (interfaceC30057d instanceof C243811) {
            c243811 = (C243811) interfaceC30057d;
            int i13 = c243811.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243811.label = i13 - Integer.MIN_VALUE;
            } else {
                c243811 = new C243811(interfaceC30057d);
            }
        } else {
            c243811 = new C243811(interfaceC30057d);
        }
        C243811 c243812 = c243811;
        Object obj = c243812.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243812.label;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    long j14 = c243812.J$0;
                    HMSPublishConnection hMSPublishConnection4 = (HMSPublishConnection) c243812.L$4;
                    HMSPublishConnection hMSPublishConnection5 = (HMSPublishConnection) c243812.L$3;
                    Date date2 = (Date) c243812.L$2;
                    String str14 = (String) c243812.L$1;
                    HMSTransport hMSTransport2 = (HMSTransport) c243812.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        str8 = "time taken for join response : ";
                        hMSPublishConnection = hMSPublishConnection5;
                        r26 = hMSTransport2;
                        th3 = null;
                        objMeasuredJoin = obj;
                        r112 = str14;
                        hMSPublishConnection2 = hMSPublishConnection4;
                        str9 = TAG;
                        str10 = "Profiling";
                        j13 = j14;
                        r110 = date2;
                        try {
                            hMSSessionDescription = (HMSSessionDescription) objMeasuredJoin;
                            if (hMSPublishConnection2.getIsClose()) {
                                throw new IllegalStateException("Transport is closed");
                            }
                            hMSPublishConnection3 = r26.publishConnection;
                            if (hMSPublishConnection3 == null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw th3;
                            }
                            sfuNodeId = hMSSessionDescription.getSfuNodeId();
                            if (sfuNodeId == null) {
                                str11 = "";
                            } else {
                                str11 = sfuNodeId;
                            }
                            hMSPublishConnection3.setNodeInfo(str11);
                            hMSSubscribeConnection = r26.subscribeConnection;
                            if (hMSSubscribeConnection == null) {
                                AbstractC22676k.m65757q("subscribeConnection");
                                throw th3;
                            }
                            sfuNodeId2 = hMSSessionDescription.getSfuNodeId();
                            if (sfuNodeId2 == null) {
                                sfuNodeId2 = "";
                            }
                            hMSSubscribeConnection.setNodeInfo(sfuNodeId2);
                            r26.setTimeAfterJoinResponse(System.currentTimeMillis());
                            HMSLogger.m71136d(str10, str8 + (r26.getTimeAfterJoinResponse() - j13));
                            sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                            c243812.L$0 = r26;
                            c243812.L$1 = r112;
                            c243812.L$2 = r110;
                            c243812.L$3 = hMSPublishConnection;
                            c243812.L$4 = hMSPublishConnection2;
                            c243812.label = 3;
                            r27 = r26;
                            r113 = r112;
                            if (hMSPublishConnection2.setRemoteDescription(sessionDescriptionM134454native, c243812) == enumC31071a) {
                                date = r26;
                                date = date;
                                return enumC31071a;
                            }
                            HMSLogger.m71136d(str10, str13 + (System.currentTimeMillis() - r27.getTimeAfterJoinResponse()));
                            it = hMSPublishConnection2.getCandidates().iterator();
                            while (it.hasNext()) {
                                hMSPublishConnection2.addIceCandidate((IceCandidate) it.next());
                            }
                            HMSLogger.m71136d(str9, "join: Offer negotiation with server successful");
                            r27.isRenegotiationDone = true;
                            str3 = str9;
                            r10 = r113;
                        } catch (HMSException e5) {
                            e = e5;
                            r24 = r26;
                            r111 = r110;
                            r25 = r111;
                            r16 = r24;
                            r16.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.joinFailedEvent(r25, new Date(), e, r16.hmsNetworkManager.getConnectedNetworkType())).flush();
                            throw e;
                        }
                    } catch (HMSException e13) {
                        e = e13;
                        r24 = hMSTransport2;
                        r111 = date2;
                        r25 = r111;
                        r16 = r24;
                        r16.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.joinFailedEvent(r25, new Date(), e, r16.hmsNetworkManager.getConnectedNetworkType())).flush();
                        throw e;
                    }
                } else if (i14 == 3) {
                    hMSPublishConnection2 = (HMSPublishConnection) c243812.L$4;
                    Date date3 = (Date) c243812.L$2;
                    String str15 = (String) c243812.L$1;
                    HMSTransport hMSTransport3 = (HMSTransport) c243812.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        r113 = str15;
                        str9 = TAG;
                        str13 = "time taken to set remote answer : ";
                        r27 = hMSTransport3;
                        str10 = "Profiling";
                        HMSLogger.m71136d(str10, str13 + (System.currentTimeMillis() - r27.getTimeAfterJoinResponse()));
                        it = hMSPublishConnection2.getCandidates().iterator();
                        while (it.hasNext()) {
                            hMSPublishConnection2.addIceCandidate((IceCandidate) it.next());
                        }
                        HMSLogger.m71136d(str9, "join: Offer negotiation with server successful");
                        r27.isRenegotiationDone = true;
                        str3 = str9;
                        r10 = r113;
                    } catch (HMSException e14) {
                        e = e14;
                        r25 = date3;
                        r16 = hMSTransport3;
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Date date4 = (Date) c243812.L$2;
                    String str16 = (String) c243812.L$1;
                    HMSTransport hMSTransport4 = (HMSTransport) c243812.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        str3 = TAG;
                        r10 = str16;
                    } catch (HMSException e15) {
                        e = e15;
                        r16 = hMSTransport4;
                        r25 = date4;
                    }
                }
                HMSLogger.INSTANCE.m71139i(str3, "Join successful [name=" + r10 + ']');
                return C23454a0.f92919a;
            }
            long j15 = c243812.J$0;
            boolean z17 = c243812.Z$1;
            boolean z18 = c243812.Z$0;
            Date date5 = (Date) c243812.L$4;
            MediaConstraints mediaConstraints2 = (MediaConstraints) c243812.L$3;
            String str17 = (String) c243812.L$2;
            String str18 = (String) c243812.L$1;
            HMSTransport hMSTransport5 = (HMSTransport) c243812.L$0;
            try {
                AbstractC34132o.m107864I(obj);
                hMSTransport = hMSTransport5;
                j7 = j15;
                mediaConstraints = mediaConstraints2;
                z16 = z18;
                str4 = "Profiling";
                r14 = date5;
                c3 = 3;
                str5 = str17;
                z15 = z17;
                r15 = str18;
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    str6 = str5;
                    str7 = str4;
                    HMSLogger.m71136d(str7, "time taken to init PC connections : " + (jCurrentTimeMillis - j7));
                    hMSPublishConnection = hMSTransport.publishConnection;
                    try {
                        if (hMSPublishConnection != null) {
                            AbstractC22676k.m65757q("publishConnection");
                            throw null;
                        }
                        HMSLogger.m71136d(TAG, "join: Starting offer negotiation with server");
                        str8 = "time taken for join response : ";
                        SessionDescription sessionDescription = (SessionDescription) AbstractC3006f0.m8699E(C30064k.f122676w, new HMSTransport$internalJoin$2$offer$1(hMSPublishConnection, mediaConstraints, null));
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        HMSLogger.m71136d(str7, "time taken to create offer : " + (jCurrentTimeMillis3 - jCurrentTimeMillis));
                        AbstractC3006f0.m8699E(C30064k.f122676w, new HMSTransport$internalJoin$2$1(hMSPublishConnection, sessionDescription, null));
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        HMSLogger.m71136d(str7, "time taken to set local offer : " + (jCurrentTimeMillis2 - jCurrentTimeMillis3));
                        HMSSessionDescription hMSSessionDescriptionFrom = HMSSessionDescription.INSTANCE.from(sessionDescription, null);
                        c243812.L$0 = hMSTransport;
                        c243812.L$1 = r15;
                        c243812.L$2 = r14;
                        c243812.L$3 = hMSPublishConnection;
                        c243812.L$4 = hMSPublishConnection;
                        c243812.J$0 = jCurrentTimeMillis2;
                        c243812.label = 2;
                        th3 = null;
                        str9 = TAG;
                        str10 = str7;
                        r17 = r15;
                        r18 = r14;
                        r19 = hMSTransport;
                        objMeasuredJoin = r19.measuredJoin(r17, str6, z16, hMSSessionDescriptionFrom, z15, c243812);
                        date = r19;
                        if (objMeasuredJoin != enumC31071a) {
                            j13 = jCurrentTimeMillis2;
                            r110 = r18;
                            hMSPublishConnection2 = hMSPublishConnection;
                            r26 = r19;
                            r112 = r17;
                            hMSSessionDescription = (HMSSessionDescription) objMeasuredJoin;
                            if (hMSPublishConnection2.getIsClose()) {
                                throw new IllegalStateException("Transport is closed");
                            }
                            hMSPublishConnection3 = r26.publishConnection;
                            if (hMSPublishConnection3 == null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw th3;
                            }
                            sfuNodeId = hMSSessionDescription.getSfuNodeId();
                            if (sfuNodeId == null) {
                                str11 = "";
                            } else {
                                str11 = sfuNodeId;
                            }
                            hMSPublishConnection3.setNodeInfo(str11);
                            hMSSubscribeConnection = r26.subscribeConnection;
                            if (hMSSubscribeConnection == null) {
                                AbstractC22676k.m65757q("subscribeConnection");
                                throw th3;
                            }
                            sfuNodeId2 = hMSSessionDescription.getSfuNodeId();
                            if (sfuNodeId2 == null) {
                                sfuNodeId2 = "";
                            }
                            hMSSubscribeConnection.setNodeInfo(sfuNodeId2);
                            r26.setTimeAfterJoinResponse(System.currentTimeMillis());
                            HMSLogger.m71136d(str10, str8 + (r26.getTimeAfterJoinResponse() - j13));
                            sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                            c243812.L$0 = r26;
                            c243812.L$1 = r112;
                            c243812.L$2 = r110;
                            c243812.L$3 = hMSPublishConnection;
                            c243812.L$4 = hMSPublishConnection2;
                            c243812.label = 3;
                            r27 = r26;
                            r113 = r112;
                            if (hMSPublishConnection2.setRemoteDescription(sessionDescriptionM134454native, c243812) == enumC31071a) {
                                date = r26;
                            }
                            HMSLogger.m71136d(str10, str13 + (System.currentTimeMillis() - r27.getTimeAfterJoinResponse()));
                            it = hMSPublishConnection2.getCandidates().iterator();
                            while (it.hasNext()) {
                                hMSPublishConnection2.addIceCandidate((IceCandidate) it.next());
                            }
                            HMSLogger.m71136d(str9, "join: Offer negotiation with server successful");
                            r27.isRenegotiationDone = true;
                            str3 = str9;
                            r10 = r113;
                            HMSLogger.INSTANCE.m71139i(str3, "Join successful [name=" + r10 + ']');
                            return C23454a0.f92919a;
                        }
                        date = date;
                        return enumC31071a;
                    } catch (HMSException e16) {
                        e = e16;
                    }
                } catch (HMSException e17) {
                    e = e17;
                    r15 = r14;
                    r14 = hMSTransport;
                }
                r16 = r14;
                r25 = r15;
            } catch (HMSException e18) {
                e = e18;
                r25 = date5;
                r16 = hMSTransport5;
            }
            r16.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.joinFailedEvent(r25, new Date(), e, r16.hmsNetworkManager.getConnectedNetworkType())).flush();
            throw e;
        }
        c3 = 3;
        AbstractC34132o.m107864I(obj);
        MediaConstraints mediaConstraintsMakePublishOfferConstraints = MediaConstraintsFactory.INSTANCE.makePublishOfferConstraints();
        date = new Date();
        HMSLogger.INSTANCE.m71139i(TAG, "Joining with name=" + str12);
        try {
            if (z13) {
                HMSLogger.m71136d(TAG, "joining with offer");
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                c243812.L$0 = this;
                c243812.L$1 = str12;
                c243812.L$2 = str2;
                c243812.L$3 = mediaConstraintsMakePublishOfferConstraints;
                c243812.L$4 = date;
                c243812.Z$0 = z4;
                c243812.Z$1 = z14;
                c243812.J$0 = jCurrentTimeMillis4;
                c243812.label = 1;
                if (initPeerConnections(c243812) != enumC31071a) {
                    date = date;
                    str4 = "Profiling";
                    str5 = str2;
                    mediaConstraints = mediaConstraintsMakePublishOfferConstraints;
                    z15 = z14;
                    j7 = jCurrentTimeMillis4;
                    z16 = z4;
                    hMSTransport = this;
                    r15 = str12;
                    r14 = date;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    str6 = str5;
                    str7 = str4;
                    HMSLogger.m71136d(str7, "time taken to init PC connections : " + (jCurrentTimeMillis - j7));
                    hMSPublishConnection = hMSTransport.publishConnection;
                    if (hMSPublishConnection != null) {
                        AbstractC22676k.m65757q("publishConnection");
                        throw null;
                    }
                    HMSLogger.m71136d(TAG, "join: Starting offer negotiation with server");
                    str8 = "time taken for join response : ";
                    SessionDescription sessionDescription2 = (SessionDescription) AbstractC3006f0.m8699E(C30064k.f122676w, new HMSTransport$internalJoin$2$offer$1(hMSPublishConnection, mediaConstraints, null));
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    HMSLogger.m71136d(str7, "time taken to create offer : " + (jCurrentTimeMillis5 - jCurrentTimeMillis));
                    AbstractC3006f0.m8699E(C30064k.f122676w, new HMSTransport$internalJoin$2$1(hMSPublishConnection, sessionDescription2, null));
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                    HMSLogger.m71136d(str7, "time taken to set local offer : " + (jCurrentTimeMillis2 - jCurrentTimeMillis5));
                    HMSSessionDescription hMSSessionDescriptionFrom2 = HMSSessionDescription.INSTANCE.from(sessionDescription2, null);
                    c243812.L$0 = hMSTransport;
                    c243812.L$1 = r15;
                    c243812.L$2 = r14;
                    c243812.L$3 = hMSPublishConnection;
                    c243812.L$4 = hMSPublishConnection;
                    c243812.J$0 = jCurrentTimeMillis2;
                    c243812.label = 2;
                    th3 = null;
                    str9 = TAG;
                    str10 = str7;
                    r17 = r15;
                    r18 = r14;
                    r19 = hMSTransport;
                    objMeasuredJoin = r19.measuredJoin(r17, str6, z16, hMSSessionDescriptionFrom2, z15, c243812);
                    date = r19;
                    if (objMeasuredJoin != enumC31071a) {
                        j13 = jCurrentTimeMillis2;
                        r110 = r18;
                        hMSPublishConnection2 = hMSPublishConnection;
                        r26 = r19;
                        r112 = r17;
                        hMSSessionDescription = (HMSSessionDescription) objMeasuredJoin;
                        if (hMSPublishConnection2.getIsClose()) {
                            throw new IllegalStateException("Transport is closed");
                        }
                        hMSPublishConnection3 = r26.publishConnection;
                        if (hMSPublishConnection3 == null) {
                            AbstractC22676k.m65757q("publishConnection");
                            throw th3;
                        }
                        sfuNodeId = hMSSessionDescription.getSfuNodeId();
                        if (sfuNodeId == null) {
                            str11 = "";
                        } else {
                            str11 = sfuNodeId;
                        }
                        hMSPublishConnection3.setNodeInfo(str11);
                        hMSSubscribeConnection = r26.subscribeConnection;
                        if (hMSSubscribeConnection == null) {
                            AbstractC22676k.m65757q("subscribeConnection");
                            throw th3;
                        }
                        sfuNodeId2 = hMSSessionDescription.getSfuNodeId();
                        if (sfuNodeId2 == null) {
                            sfuNodeId2 = "";
                        }
                        hMSSubscribeConnection.setNodeInfo(sfuNodeId2);
                        r26.setTimeAfterJoinResponse(System.currentTimeMillis());
                        HMSLogger.m71136d(str10, str8 + (r26.getTimeAfterJoinResponse() - j13));
                        sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                        c243812.L$0 = r26;
                        c243812.L$1 = r112;
                        c243812.L$2 = r110;
                        c243812.L$3 = hMSPublishConnection;
                        c243812.L$4 = hMSPublishConnection2;
                        c243812.label = 3;
                        r27 = r26;
                        r113 = r112;
                        if (hMSPublishConnection2.setRemoteDescription(sessionDescriptionM134454native, c243812) == enumC31071a) {
                            date = r26;
                        }
                        HMSLogger.m71136d(str10, str13 + (System.currentTimeMillis() - r27.getTimeAfterJoinResponse()));
                        it = hMSPublishConnection2.getCandidates().iterator();
                        while (it.hasNext()) {
                            hMSPublishConnection2.addIceCandidate((IceCandidate) it.next());
                        }
                        HMSLogger.m71136d(str9, "join: Offer negotiation with server successful");
                        r27.isRenegotiationDone = true;
                        str3 = str9;
                        r10 = r113;
                        HMSLogger.INSTANCE.m71139i(str3, "Join successful [name=" + r10 + ']');
                        return C23454a0.f92919a;
                    }
                    r16 = r14;
                    r25 = r15;
                    r16.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.joinFailedEvent(r25, new Date(), e, r16.hmsNetworkManager.getConnectedNetworkType())).flush();
                    throw e;
                }
            } else {
                HMSLogger.m71136d(TAG, "joining without offer");
                c243812.L$0 = this;
                c243812.L$1 = str12;
                c243812.L$2 = date;
                c243812.label = 4;
                str3 = TAG;
                date = date;
                if (measuredJoin(str12, str2, z4, null, z14, c243812) != enumC31071a) {
                    r10 = str;
                    HMSLogger.INSTANCE.m71139i(str3, "Join successful [name=" + r10 + ']');
                    return C23454a0.f92919a;
                }
            }
            date = date;
            return enumC31071a;
        } catch (HMSException e19) {
            e = e19;
            r16 = this;
            r25 = date;
        }
    }

    private final boolean isPeerConnectionDisposed(TransportCallbackTriple callback) {
        InterfaceC30061h deferred;
        if (this.isPeerConnectionReady) {
            HMSPublishConnection hMSPublishConnection = this.publishConnection;
            if (hMSPublishConnection == null) {
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
            if (hMSPublishConnection.getNativeConnection().connectionState() != PeerConnection.PeerConnectionState.CLOSED) {
                return false;
            }
        }
        HMSLogger.m71137e(TAG, "[role=PUBLISH]  publish renegotiation IGNORED as PeerConnection is closed ❌ already");
        if (callback == null || (deferred = callback.getDeferred()) == null) {
            return true;
        }
        ((C3060t1) deferred).mo8819p(new CancellationException("publish renegotiation IGNORED as PeerConnection is closed"));
        return true;
    }

    private final String makeWebsocketURL(String endpoint, String peerId, String token, String userAgent) {
        return endpoint + "?peer=" + peerId + "&token=" + token + '&' + userAgent + "&protocol_version=2.5&protocol_spec=20240720";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object measuredJoin(String str, String str2, boolean z4, HMSSessionDescription hMSSessionDescription, boolean z13, InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d) throws Throwable {
        C243831 c243831;
        Throwable th3;
        HMSTransport hMSTransport;
        PerformanceMeasurement performanceMeasurement;
        PerformanceMeasurement performanceMeasurement2;
        if (interfaceC30057d instanceof C243831) {
            c243831 = (C243831) interfaceC30057d;
            int i13 = c243831.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243831.label = i13 - Integer.MIN_VALUE;
            } else {
                c243831 = new C243831(interfaceC30057d);
            }
        } else {
            c243831 = new C243831(interfaceC30057d);
        }
        C243831 c243832 = c243831;
        Object objJoin = c243832.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243832.label;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMSTransport = (HMSTransport) c243832.L$0;
            try {
                AbstractC34132o.m107864I(objJoin);
                performanceMeasurement2 = hMSTransport.performanceMeasurement;
                if (performanceMeasurement2 != null) {
                    performanceMeasurement2.end$lib_release(EVENT_TYPE.JOIN_RESPONSE_TIME);
                }
                return objJoin;
            } catch (Throwable th4) {
                th3 = th4;
                performanceMeasurement = hMSTransport.performanceMeasurement;
                if (performanceMeasurement != null) {
                    throw th3;
                }
                performanceMeasurement.end$lib_release(EVENT_TYPE.JOIN_RESPONSE_TIME);
                throw th3;
            }
        }
        AbstractC34132o.m107864I(objJoin);
        PerformanceMeasurement performanceMeasurement3 = this.performanceMeasurement;
        if (performanceMeasurement3 != null) {
            performanceMeasurement3.start$lib_release(EVENT_TYPE.JOIN_RESPONSE_TIME);
        }
        try {
            ISignal iSignal = this.signal;
            PerformanceMeasurement performanceMeasurement4 = this.performanceMeasurement;
            c243832.L$0 = this;
            c243832.label = 1;
            objJoin = iSignal.join(str, str2, z4, hMSSessionDescription, performanceMeasurement4, z13, c243832);
            if (objJoin == enumC31071a) {
                return enumC31071a;
            }
            hMSTransport = this;
            performanceMeasurement2 = hMSTransport.performanceMeasurement;
            if (performanceMeasurement2 != null) {
                performanceMeasurement2.end$lib_release(EVENT_TYPE.JOIN_RESPONSE_TIME);
            }
            return objJoin;
        } catch (Throwable th5) {
            th3 = th5;
            hMSTransport = this;
            performanceMeasurement = hMSTransport.performanceMeasurement;
            if (performanceMeasurement != null) {
                throw th3;
            }
            performanceMeasurement.end$lib_release(EVENT_TYPE.JOIN_RESPONSE_TIME);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x020e A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0214 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:105:0x021a A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x023d  */
    /* JADX WARN: Code duplicated, block: B:119:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x025b  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0272  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fb A[Catch: Exception -> 0x0085, PHI: r0 r4 r9 r14 r15
      0x00fb: PHI (r0v23 hms.webrtc.SessionDescription) = (r0v21 hms.webrtc.SessionDescription), (r0v40 hms.webrtc.SessionDescription) binds: [B:48:0x00f7, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r4v7 live.hms.video.connection.publish.HMSPublishConnection) = 
      (r4v6 live.hms.video.connection.publish.HMSPublishConnection)
      (r4v14 live.hms.video.connection.publish.HMSPublishConnection)
     binds: [B:48:0x00f7, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r9v5 live.hms.video.connection.publish.HMSPublishConnection) = 
      (r9v4 live.hms.video.connection.publish.HMSPublishConnection)
      (r9v11 live.hms.video.connection.publish.HMSPublishConnection)
     binds: [B:48:0x00f7, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r14v6 live.hms.video.transport.models.TransportCallbackTriple) = 
      (r14v5 live.hms.video.transport.models.TransportCallbackTriple)
      (r14v11 live.hms.video.transport.models.TransportCallbackTriple)
     binds: [B:48:0x00f7, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r15v3 live.hms.video.transport.HMSTransport) = (r15v2 live.hms.video.transport.HMSTransport), (r15v7 live.hms.video.transport.HMSTransport) binds: [B:48:0x00f7, B:28:0x0081] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111 A[Catch: Exception -> 0x0085, LOOP:0: B:51:0x010b->B:53:0x0111, LOOP_END, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0130 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013c A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x0160 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0166 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:68:0x016a A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017d A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0187 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0199 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ce A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4 A[Catch: Exception -> 0x0085, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f9 A[Catch: Exception -> 0x0045, TryCatch #3 {Exception -> 0x0045, blocks: (B:15:0x0040, B:93:0x01f2, B:95:0x01f9, B:97:0x01ff), top: B:137:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0208 A[Catch: Exception -> 0x0085, TRY_ENTER, TryCatch #2 {Exception -> 0x0085, blocks: (B:62:0x0158, B:64:0x0160, B:66:0x0166, B:68:0x016a, B:71:0x0175, B:73:0x017d, B:75:0x0187, B:77:0x0199, B:79:0x01ba, B:81:0x01c0, B:83:0x01c8, B:84:0x01cd, B:85:0x01ce, B:86:0x01d3, B:87:0x01d4, B:88:0x01d9, B:89:0x01da, B:99:0x0208, B:100:0x020d, B:27:0x007e, B:50:0x00fb, B:51:0x010b, B:53:0x0111, B:54:0x0126, B:56:0x0130, B:58:0x013c, B:101:0x020e, B:102:0x0213, B:103:0x0214, B:104:0x0219, B:32:0x0099, B:45:0x00df, B:47:0x00e7, B:105:0x021a, B:106:0x021f), top: B:136:0x002e }] */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0086: MOVE (r2 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:30:0x0086 */
    public final Object performPublishRenegotiation(MediaConstraints mediaConstraints, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IllegalStateException {
        C243841 c243841;
        TransportCallbackTriple transportCallbackTriple;
        TransportCallbackTriple transportCallbackTriple2;
        Exception exc;
        HMSException hMSExceptionUnknown$default;
        InterfaceC3055s deferred;
        InterfaceC3055s deferred2;
        String message;
        HMSTransport hMSTransport;
        TransportCallbackTriple transportCallbackTriple3;
        HMSPublishConnection hMSPublishConnection;
        HMSPublishConnection hMSPublishConnection2;
        SessionDescription sessionDescription;
        ArrayList arrayList;
        Iterator<HMSTrack> it;
        ISignal signal;
        HMSSessionDescription.Companion companion;
        HMSPublishConnection hMSPublishConnection3;
        HMSSessionDescription hMSSessionDescriptionFrom;
        HMSPublishConnection hMSPublishConnection4;
        HMSPublishConnection hMSPublishConnection5;
        HMSTransport hMSTransport2;
        HMSSessionDescription hMSSessionDescription;
        SessionDescription sessionDescriptionM134454native;
        HMSPublishConnection hMSPublishConnection6;
        String sfuNodeId;
        HMSPublishConnection hMSPublishConnection7;
        HMSLogger hMSLogger;
        StringBuilder sb4;
        HMSPublishConnection hMSPublishConnection8;
        InterfaceC3055s deferred3;
        InterfaceC3055s deferred4;
        if (interfaceC30057d instanceof C243841) {
            c243841 = (C243841) interfaceC30057d;
            int i13 = c243841.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243841.label = i13 - Integer.MIN_VALUE;
            } else {
                c243841 = new C243841(interfaceC30057d);
            }
        } else {
            c243841 = new C243841(interfaceC30057d);
        }
        Object objOffer = c243841.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243841.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objOffer);
                HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded START ⏰");
                TransportCallbackTriple transportCallbackTripleRemove = this.callbacks.remove(HMSConstantsKt.cPublishRenegotiationCallback);
                if (transportCallbackTripleRemove == null) {
                    HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded called without any callback");
                }
                try {
                    HMSPublishConnection hMSPublishConnection9 = this.publishConnection;
                    if (hMSPublishConnection9 == null) {
                        AbstractC22676k.m65757q("publishConnection");
                        throw null;
                    }
                    HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded: initiating renegotiation");
                    if (isPeerConnectionDisposed(transportCallbackTripleRemove)) {
                        throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                    }
                    c243841.L$0 = this;
                    c243841.L$1 = transportCallbackTripleRemove;
                    c243841.L$2 = hMSPublishConnection9;
                    c243841.L$3 = hMSPublishConnection9;
                    c243841.label = 1;
                    Object objCreateOffer = hMSPublishConnection9.createOffer(mediaConstraints, c243841);
                    if (objCreateOffer != enumC31071a) {
                        hMSTransport = this;
                        transportCallbackTriple3 = transportCallbackTripleRemove;
                        hMSPublishConnection = hMSPublishConnection9;
                        objOffer = objCreateOffer;
                        hMSPublishConnection2 = hMSPublishConnection;
                        sessionDescription = (SessionDescription) objOffer;
                        if (!hMSTransport.isPeerConnectionDisposed(transportCallbackTriple3)) {
                            throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                        }
                        c243841.L$0 = hMSTransport;
                        c243841.L$1 = transportCallbackTriple3;
                        c243841.L$2 = hMSPublishConnection2;
                        c243841.L$3 = hMSPublishConnection;
                        c243841.L$4 = sessionDescription;
                        c243841.label = 2;
                        if (hMSPublishConnection.setLocalDescription(sessionDescription, c243841) == enumC31071a) {
                            arrayList = new ArrayList();
                            it = hMSTransport.tracksToPublish.iterator();
                            AbstractC22676k.m65749i(it, "iterator(...)");
                            while (it.hasNext()) {
                                HMSTrack next = it.next();
                                AbstractC22676k.m65749i(next, "next(...)");
                                arrayList.add(HMSNotifications.Track.INSTANCE.from(next));
                            }
                            signal = hMSPublishConnection.getSignal();
                            companion = HMSSessionDescription.INSTANCE;
                            hMSPublishConnection3 = hMSTransport.publishConnection;
                            if (hMSPublishConnection3 == null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw null;
                            }
                            hMSSessionDescriptionFrom = companion.from(sessionDescription, hMSPublishConnection3.get_nodeInfo());
                            hMSPublishConnection4 = hMSTransport.publishConnection;
                            if (hMSPublishConnection4 == null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw null;
                            }
                            String str = hMSPublishConnection4.get_nodeInfo();
                            c243841.L$0 = hMSTransport;
                            c243841.L$1 = transportCallbackTriple3;
                            c243841.L$2 = hMSPublishConnection2;
                            c243841.L$3 = hMSPublishConnection;
                            c243841.L$4 = null;
                            c243841.label = 3;
                            objOffer = signal.offer(hMSSessionDescriptionFrom, arrayList, str, c243841);
                            if (objOffer != enumC31071a) {
                                hMSPublishConnection5 = hMSPublishConnection2;
                                hMSTransport2 = hMSTransport;
                                hMSSessionDescription = (HMSSessionDescription) objOffer;
                                if (!hMSTransport2.isPeerConnectionDisposed(transportCallbackTriple3)) {
                                    throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                                }
                                if (hMSSessionDescription.getSfuNodeId() != null) {
                                    hMSPublishConnection6 = hMSTransport2.publishConnection;
                                    if (hMSPublishConnection6 != null) {
                                        AbstractC22676k.m65757q("publishConnection");
                                        throw null;
                                    }
                                    if (hMSPublishConnection6.get_nodeInfo().length() == 0) {
                                        sfuNodeId = hMSSessionDescription.getSfuNodeId();
                                        hMSPublishConnection7 = hMSTransport2.publishConnection;
                                        if (hMSPublishConnection7 != null) {
                                            AbstractC22676k.m65757q("publishConnection");
                                            throw null;
                                        }
                                        if (!AbstractC22676k.m65745e(sfuNodeId, hMSPublishConnection7.get_nodeInfo())) {
                                            hMSLogger = HMSLogger.INSTANCE;
                                            sb4 = new StringBuilder();
                                            sb4.append("[role=PUBLISH] node-mismatch the current peerConnection is old node id :");
                                            hMSPublishConnection8 = hMSTransport2.publishConnection;
                                            if (hMSPublishConnection8 != null) {
                                                AbstractC22676k.m65757q("publishConnection");
                                                throw null;
                                            }
                                            sb4.append(hMSPublishConnection8.get_nodeInfo());
                                            sb4.append(" and the offer is from node id ");
                                            sb4.append(hMSSessionDescription.getSfuNodeId());
                                            sb4.append("  ❌");
                                            hMSLogger.m71141w("SFUMIGRATION", sb4.toString());
                                            if (transportCallbackTriple3 != null) {
                                                ((C3058t) deferred3).m8807L(Boolean.TRUE);
                                            }
                                            return c23454a0;
                                        }
                                    }
                                }
                                sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                                c243841.L$0 = transportCallbackTriple3;
                                c243841.L$1 = hMSPublishConnection5;
                                c243841.L$2 = null;
                                c243841.L$3 = null;
                                c243841.label = 4;
                                if (hMSPublishConnection.setRemoteDescription(sessionDescriptionM134454native, c243841) != enumC31071a) {
                                    transportCallbackTriple2 = transportCallbackTriple3;
                                    HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded DONE ✅");
                                    if (transportCallbackTriple2 != null) {
                                        ((C3058t) deferred4).m8807L(Boolean.TRUE);
                                    }
                                }
                            }
                        }
                    }
                    return enumC31071a;
                } catch (Exception e5) {
                    e = e5;
                    transportCallbackTriple2 = transportCallbackTripleRemove;
                    if (e instanceof HMSException) {
                        exc = e;
                        hMSExceptionUnknown$default = (HMSException) exc;
                    } else {
                        ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
                        ErrorFactory.Action action = ErrorFactory.Action.PUBLISH;
                        message = e.getMessage();
                        if (message == null) {
                            message = "Renegotiation of local offer with server failed";
                        }
                        Exception exc2 = e;
                        hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors, action, message, exc2, null, 8, null);
                        exc = exc2;
                    }
                    if (hMSExceptionUnknown$default.getCode() == 421) {
                        if (transportCallbackTriple2 != null && (deferred2 = transportCallbackTriple2.getDeferred()) != null) {
                            ((C3058t) deferred2).m8807L(Boolean.TRUE);
                        }
                        HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded IGNORED 🤺", exc);
                    } else {
                        if (transportCallbackTriple2 != null && (deferred = transportCallbackTriple2.getDeferred()) != null) {
                            ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                        }
                        HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded FAILED ❌", exc);
                    }
                }
            } else {
                if (i14 == 1) {
                    hMSPublishConnection = (HMSPublishConnection) c243841.L$3;
                    hMSPublishConnection2 = (HMSPublishConnection) c243841.L$2;
                    transportCallbackTriple3 = (TransportCallbackTriple) c243841.L$1;
                    hMSTransport = (HMSTransport) c243841.L$0;
                    AbstractC34132o.m107864I(objOffer);
                    sessionDescription = (SessionDescription) objOffer;
                    if (!hMSTransport.isPeerConnectionDisposed(transportCallbackTriple3)) {
                        throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                    }
                    c243841.L$0 = hMSTransport;
                    c243841.L$1 = transportCallbackTriple3;
                    c243841.L$2 = hMSPublishConnection2;
                    c243841.L$3 = hMSPublishConnection;
                    c243841.L$4 = sessionDescription;
                    c243841.label = 2;
                    if (hMSPublishConnection.setLocalDescription(sessionDescription, c243841) == enumC31071a) {
                        arrayList = new ArrayList();
                        it = hMSTransport.tracksToPublish.iterator();
                        AbstractC22676k.m65749i(it, "iterator(...)");
                        while (it.hasNext()) {
                            HMSTrack next2 = it.next();
                            AbstractC22676k.m65749i(next2, "next(...)");
                            arrayList.add(HMSNotifications.Track.INSTANCE.from(next2));
                        }
                        signal = hMSPublishConnection.getSignal();
                        companion = HMSSessionDescription.INSTANCE;
                        hMSPublishConnection3 = hMSTransport.publishConnection;
                        if (hMSPublishConnection3 == null) {
                            AbstractC22676k.m65757q("publishConnection");
                            throw null;
                        }
                        hMSSessionDescriptionFrom = companion.from(sessionDescription, hMSPublishConnection3.get_nodeInfo());
                        hMSPublishConnection4 = hMSTransport.publishConnection;
                        if (hMSPublishConnection4 == null) {
                            AbstractC22676k.m65757q("publishConnection");
                            throw null;
                        }
                        String str2 = hMSPublishConnection4.get_nodeInfo();
                        c243841.L$0 = hMSTransport;
                        c243841.L$1 = transportCallbackTriple3;
                        c243841.L$2 = hMSPublishConnection2;
                        c243841.L$3 = hMSPublishConnection;
                        c243841.L$4 = null;
                        c243841.label = 3;
                        objOffer = signal.offer(hMSSessionDescriptionFrom, arrayList, str2, c243841);
                        if (objOffer != enumC31071a) {
                            hMSPublishConnection5 = hMSPublishConnection2;
                            hMSTransport2 = hMSTransport;
                            hMSSessionDescription = (HMSSessionDescription) objOffer;
                            if (!hMSTransport2.isPeerConnectionDisposed(transportCallbackTriple3)) {
                                throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                            }
                            if (hMSSessionDescription.getSfuNodeId() != null) {
                                hMSPublishConnection6 = hMSTransport2.publishConnection;
                                if (hMSPublishConnection6 != null) {
                                    AbstractC22676k.m65757q("publishConnection");
                                    throw null;
                                }
                                if (hMSPublishConnection6.get_nodeInfo().length() == 0) {
                                    sfuNodeId = hMSSessionDescription.getSfuNodeId();
                                    hMSPublishConnection7 = hMSTransport2.publishConnection;
                                    if (hMSPublishConnection7 != null) {
                                        AbstractC22676k.m65757q("publishConnection");
                                        throw null;
                                    }
                                    if (!AbstractC22676k.m65745e(sfuNodeId, hMSPublishConnection7.get_nodeInfo())) {
                                        hMSLogger = HMSLogger.INSTANCE;
                                        sb4 = new StringBuilder();
                                        sb4.append("[role=PUBLISH] node-mismatch the current peerConnection is old node id :");
                                        hMSPublishConnection8 = hMSTransport2.publishConnection;
                                        if (hMSPublishConnection8 != null) {
                                            AbstractC22676k.m65757q("publishConnection");
                                            throw null;
                                        }
                                        sb4.append(hMSPublishConnection8.get_nodeInfo());
                                        sb4.append(" and the offer is from node id ");
                                        sb4.append(hMSSessionDescription.getSfuNodeId());
                                        sb4.append("  ❌");
                                        hMSLogger.m71141w("SFUMIGRATION", sb4.toString());
                                        if (transportCallbackTriple3 != null) {
                                            ((C3058t) deferred3).m8807L(Boolean.TRUE);
                                        }
                                        return c23454a0;
                                    }
                                }
                            }
                            sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                            c243841.L$0 = transportCallbackTriple3;
                            c243841.L$1 = hMSPublishConnection5;
                            c243841.L$2 = null;
                            c243841.L$3 = null;
                            c243841.label = 4;
                            if (hMSPublishConnection.setRemoteDescription(sessionDescriptionM134454native, c243841) != enumC31071a) {
                                transportCallbackTriple2 = transportCallbackTriple3;
                                HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded DONE ✅");
                                if (transportCallbackTriple2 != null) {
                                    ((C3058t) deferred4).m8807L(Boolean.TRUE);
                                }
                            }
                        }
                    }
                    return enumC31071a;
                }
                if (i14 == 2) {
                    SessionDescription sessionDescription2 = (SessionDescription) c243841.L$4;
                    HMSPublishConnection hMSPublishConnection10 = (HMSPublishConnection) c243841.L$3;
                    hMSPublishConnection2 = (HMSPublishConnection) c243841.L$2;
                    transportCallbackTriple3 = (TransportCallbackTriple) c243841.L$1;
                    hMSTransport = (HMSTransport) c243841.L$0;
                    AbstractC34132o.m107864I(objOffer);
                    sessionDescription = sessionDescription2;
                    hMSPublishConnection = hMSPublishConnection10;
                    arrayList = new ArrayList();
                    it = hMSTransport.tracksToPublish.iterator();
                    AbstractC22676k.m65749i(it, "iterator(...)");
                    while (it.hasNext()) {
                        HMSTrack next3 = it.next();
                        AbstractC22676k.m65749i(next3, "next(...)");
                        arrayList.add(HMSNotifications.Track.INSTANCE.from(next3));
                    }
                    signal = hMSPublishConnection.getSignal();
                    companion = HMSSessionDescription.INSTANCE;
                    hMSPublishConnection3 = hMSTransport.publishConnection;
                    if (hMSPublishConnection3 == null) {
                        AbstractC22676k.m65757q("publishConnection");
                        throw null;
                    }
                    hMSSessionDescriptionFrom = companion.from(sessionDescription, hMSPublishConnection3.get_nodeInfo());
                    hMSPublishConnection4 = hMSTransport.publishConnection;
                    if (hMSPublishConnection4 == null) {
                        AbstractC22676k.m65757q("publishConnection");
                        throw null;
                    }
                    String str3 = hMSPublishConnection4.get_nodeInfo();
                    c243841.L$0 = hMSTransport;
                    c243841.L$1 = transportCallbackTriple3;
                    c243841.L$2 = hMSPublishConnection2;
                    c243841.L$3 = hMSPublishConnection;
                    c243841.L$4 = null;
                    c243841.label = 3;
                    objOffer = signal.offer(hMSSessionDescriptionFrom, arrayList, str3, c243841);
                    if (objOffer != enumC31071a) {
                        hMSPublishConnection5 = hMSPublishConnection2;
                        hMSTransport2 = hMSTransport;
                        hMSSessionDescription = (HMSSessionDescription) objOffer;
                        if (!hMSTransport2.isPeerConnectionDisposed(transportCallbackTriple3)) {
                            throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                        }
                        if (hMSSessionDescription.getSfuNodeId() != null) {
                            hMSPublishConnection6 = hMSTransport2.publishConnection;
                            if (hMSPublishConnection6 != null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw null;
                            }
                            if (hMSPublishConnection6.get_nodeInfo().length() == 0) {
                                sfuNodeId = hMSSessionDescription.getSfuNodeId();
                                hMSPublishConnection7 = hMSTransport2.publishConnection;
                                if (hMSPublishConnection7 != null) {
                                    AbstractC22676k.m65757q("publishConnection");
                                    throw null;
                                }
                                if (!AbstractC22676k.m65745e(sfuNodeId, hMSPublishConnection7.get_nodeInfo())) {
                                    hMSLogger = HMSLogger.INSTANCE;
                                    sb4 = new StringBuilder();
                                    sb4.append("[role=PUBLISH] node-mismatch the current peerConnection is old node id :");
                                    hMSPublishConnection8 = hMSTransport2.publishConnection;
                                    if (hMSPublishConnection8 != null) {
                                        AbstractC22676k.m65757q("publishConnection");
                                        throw null;
                                    }
                                    sb4.append(hMSPublishConnection8.get_nodeInfo());
                                    sb4.append(" and the offer is from node id ");
                                    sb4.append(hMSSessionDescription.getSfuNodeId());
                                    sb4.append("  ❌");
                                    hMSLogger.m71141w("SFUMIGRATION", sb4.toString());
                                    if (transportCallbackTriple3 != null) {
                                        ((C3058t) deferred3).m8807L(Boolean.TRUE);
                                    }
                                    return c23454a0;
                                }
                            }
                        }
                        sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                        c243841.L$0 = transportCallbackTriple3;
                        c243841.L$1 = hMSPublishConnection5;
                        c243841.L$2 = null;
                        c243841.L$3 = null;
                        c243841.label = 4;
                        if (hMSPublishConnection.setRemoteDescription(sessionDescriptionM134454native, c243841) != enumC31071a) {
                            transportCallbackTriple2 = transportCallbackTriple3;
                            HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded DONE ✅");
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred4).m8807L(Boolean.TRUE);
                            }
                        }
                    }
                    return enumC31071a;
                }
                if (i14 == 3) {
                    hMSPublishConnection = (HMSPublishConnection) c243841.L$3;
                    hMSPublishConnection5 = (HMSPublishConnection) c243841.L$2;
                    TransportCallbackTriple transportCallbackTriple4 = (TransportCallbackTriple) c243841.L$1;
                    hMSTransport2 = (HMSTransport) c243841.L$0;
                    try {
                        AbstractC34132o.m107864I(objOffer);
                        transportCallbackTriple3 = transportCallbackTriple4;
                        hMSSessionDescription = (HMSSessionDescription) objOffer;
                        if (!hMSTransport2.isPeerConnectionDisposed(transportCallbackTriple3)) {
                            throw new IllegalStateException("publish renegotiation IGNORED as PeerConnection is already closed");
                        }
                        if (hMSSessionDescription.getSfuNodeId() != null) {
                            hMSPublishConnection6 = hMSTransport2.publishConnection;
                            if (hMSPublishConnection6 != null) {
                                AbstractC22676k.m65757q("publishConnection");
                                throw null;
                            }
                            if (hMSPublishConnection6.get_nodeInfo().length() == 0) {
                                sfuNodeId = hMSSessionDescription.getSfuNodeId();
                                hMSPublishConnection7 = hMSTransport2.publishConnection;
                                if (hMSPublishConnection7 != null) {
                                    AbstractC22676k.m65757q("publishConnection");
                                    throw null;
                                }
                                if (!AbstractC22676k.m65745e(sfuNodeId, hMSPublishConnection7.get_nodeInfo())) {
                                    hMSLogger = HMSLogger.INSTANCE;
                                    sb4 = new StringBuilder();
                                    sb4.append("[role=PUBLISH] node-mismatch the current peerConnection is old node id :");
                                    hMSPublishConnection8 = hMSTransport2.publishConnection;
                                    if (hMSPublishConnection8 != null) {
                                        AbstractC22676k.m65757q("publishConnection");
                                        throw null;
                                    }
                                    sb4.append(hMSPublishConnection8.get_nodeInfo());
                                    sb4.append(" and the offer is from node id ");
                                    sb4.append(hMSSessionDescription.getSfuNodeId());
                                    sb4.append("  ❌");
                                    hMSLogger.m71141w("SFUMIGRATION", sb4.toString());
                                    if (transportCallbackTriple3 != null && (deferred3 = transportCallbackTriple3.getDeferred()) != null) {
                                        ((C3058t) deferred3).m8807L(Boolean.TRUE);
                                    }
                                    return c23454a0;
                                }
                            }
                        }
                        sessionDescriptionM134454native = hMSSessionDescription.m134454native();
                        c243841.L$0 = transportCallbackTriple3;
                        c243841.L$1 = hMSPublishConnection5;
                        c243841.L$2 = null;
                        c243841.L$3 = null;
                        c243841.label = 4;
                        if (hMSPublishConnection.setRemoteDescription(sessionDescriptionM134454native, c243841) != enumC31071a) {
                            transportCallbackTriple2 = transportCallbackTriple3;
                            HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded DONE ✅");
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred4).m8807L(Boolean.TRUE);
                            }
                        }
                        return enumC31071a;
                    } catch (Exception e13) {
                        e = e13;
                        transportCallbackTriple2 = transportCallbackTriple4;
                        if (e instanceof HMSException) {
                            ErrorFactory.GenericErrors genericErrors2 = ErrorFactory.GenericErrors.INSTANCE;
                            ErrorFactory.Action action2 = ErrorFactory.Action.PUBLISH;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Renegotiation of local offer with server failed";
                            }
                            Exception exc3 = e;
                            hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors2, action2, message, exc3, null, 8, null);
                            exc = exc3;
                        } else {
                            exc = e;
                            hMSExceptionUnknown$default = (HMSException) exc;
                        }
                        if (hMSExceptionUnknown$default.getCode() == 421) {
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred2).m8807L(Boolean.TRUE);
                            }
                            HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded IGNORED 🤺", exc);
                        } else {
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                            }
                            HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded FAILED ❌", exc);
                        }
                    }
                } else {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transportCallbackTriple2 = (TransportCallbackTriple) c243841.L$0;
                    try {
                        AbstractC34132o.m107864I(objOffer);
                        HMSLogger.m71136d(TAG, "[role=PUBLISH] onRenegotiationNeeded DONE ✅");
                        if (transportCallbackTriple2 != null && (deferred4 = transportCallbackTriple2.getDeferred()) != null) {
                            ((C3058t) deferred4).m8807L(Boolean.TRUE);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        if (e instanceof HMSException) {
                            ErrorFactory.GenericErrors genericErrors3 = ErrorFactory.GenericErrors.INSTANCE;
                            ErrorFactory.Action action3 = ErrorFactory.Action.PUBLISH;
                            message = e.getMessage();
                            if (message == null) {
                                message = "Renegotiation of local offer with server failed";
                            }
                            Exception exc4 = e;
                            hMSExceptionUnknown$default = ErrorFactory.GenericErrors.Unknown$default(genericErrors3, action3, message, exc4, null, 8, null);
                            exc = exc4;
                        } else {
                            exc = e;
                            hMSExceptionUnknown$default = (HMSException) exc;
                        }
                        if (hMSExceptionUnknown$default.getCode() == 421) {
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred2).m8807L(Boolean.TRUE);
                            }
                            HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded IGNORED 🤺", exc);
                        } else {
                            if (transportCallbackTriple2 != null) {
                                ((C3058t) deferred).completeExceptionally(hMSExceptionUnknown$default);
                            }
                            HMSLogger.INSTANCE.m71138e(TAG, "[role=PUBLISH] onRenegotiationNeeded FAILED ❌", exc);
                        }
                    }
                }
            }
        } catch (Exception e15) {
            e = e15;
            transportCallbackTriple2 = transportCallbackTriple;
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object publish(HMSTrack hMSTrack, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243851 c243851;
        HMSLocalStream stream2;
        RtpTransceiver rtpTransceiverAddTransceiver;
        HMSTransport hMSTransport;
        if (interfaceC30057d instanceof C243851) {
            c243851 = (C243851) interfaceC30057d;
            int i13 = c243851.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243851.label = i13 - Integer.MIN_VALUE;
            } else {
                c243851 = new C243851(interfaceC30057d);
            }
        } else {
            c243851 = new C243851(interfaceC30057d);
        }
        Object obj = c243851.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243851.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            HMSLogger.m71136d(TAG, "publish: track=" + hMSTrack + " STARTING");
            C3058t c3058tM8707a = AbstractC3006f0.m8707a();
            this.callbacks.put(HMSConstantsKt.cPublishRenegotiationCallback, new TransportCallbackTriple(c3058tM8707a, HMSAction.Publish, null, 4, null));
            int i15 = WhenMappings.$EnumSwitchMapping$0[hMSTrack.getType().ordinal()];
            if (i15 == 1) {
                stream2 = ((HMSLocalAudioTrack) hMSTrack).getStream();
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                stream2 = ((HMSLocalVideoTrack) hMSTrack).getStream();
            }
            HMSPublishConnection hMSPublishConnection = this.publishConnection;
            if (hMSPublishConnection == null) {
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
            rtpTransceiverAddTransceiver = stream2.addTransceiver(hMSPublishConnection, hMSTrack, z4, this.hmsTrackSettings);
            c243851.L$0 = this;
            c243851.L$1 = hMSTrack;
            c243851.L$2 = rtpTransceiverAddTransceiver;
            c243851.label = 1;
            if (c3058tM8707a.m8817m(c243851) == enumC31071a) {
                return enumC31071a;
            }
            hMSTransport = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RtpTransceiver rtpTransceiver = (RtpTransceiver) c243851.L$2;
            HMSTrack hMSTrack2 = (HMSTrack) c243851.L$1;
            hMSTransport = (HMSTransport) c243851.L$0;
            AbstractC34132o.m107864I(obj);
            rtpTransceiverAddTransceiver = rtpTransceiver;
            hMSTrack = hMSTrack2;
        }
        int i16 = WhenMappings.$EnumSwitchMapping$0[hMSTrack.getType().ordinal()];
        if (i16 == 1) {
            HMSLocalAudioTrack hMSLocalAudioTrack = (HMSLocalAudioTrack) hMSTrack;
            hMSLocalAudioTrack.setSignal$lib_release(hMSTransport.signal);
            hMSLocalAudioTrack.setTransceiver$lib_release(rtpTransceiverAddTransceiver);
            hMSLocalAudioTrack.setSendLocalUpdate$lib_release(new HMSTransport$publish$3$1(hMSTransport.observer));
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            HMSLocalVideoTrack hMSLocalVideoTrack = (HMSLocalVideoTrack) hMSTrack;
            hMSLocalVideoTrack.setSignal$lib_release(hMSTransport.signal);
            hMSLocalVideoTrack.setTransceiver$lib_release(rtpTransceiverAddTransceiver);
            hMSLocalVideoTrack.setSendLocalUpdate$lib_release(new HMSTransport$publish$2$1(hMSTransport.observer));
        }
        HMSLogger.m71136d(TAG, "publish: trackId=" + hMSTrack.getTrackId() + " DONE");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 retryScheduler$lambda$1(HMSTransport this$0, TransportState state, HMSException hMSException) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(state, "state");
        if (this$0.hasJoined || state != TransportState.Joined) {
            this$0.setState(state);
            this$0.observer.onStateChange(state, hMSException);
        } else {
            TransportState transportState = TransportState.SignalConnected;
            this$0.setState(transportState);
            this$0.observer.onStateChange(transportState, hMSException);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object scheduleRetry(HMSException hMSException, TransportFailureCategory transportFailureCategory, Function1 function1, InterfaceC30057d<? super Integer> interfaceC30057d) throws HMSException {
        C243891 c243891;
        HMSException hMSException2;
        if (interfaceC30057d instanceof C243891) {
            c243891 = (C243891) interfaceC30057d;
            int i13 = c243891.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243891.label = i13 - Integer.MIN_VALUE;
            } else {
                c243891 = new C243891(interfaceC30057d);
            }
        } else {
            c243891 = new C243891(interfaceC30057d);
        }
        C243891 c243892 = c243891;
        Object obj = c243892.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243892.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                long j7 = transportFailureCategory == TransportFailureCategory.JoinAPIFailed ? 500L : 60000L;
                RetryScheduler retryScheduler = this.retryScheduler;
                c243892.L$0 = transportFailureCategory;
                c243892.label = 1;
                try {
                    Object objSchedule = retryScheduler.schedule(transportFailureCategory, hMSException, false, function1, j7, c243892);
                    return objSchedule == enumC31071a ? enumC31071a : objSchedule;
                } catch (HMSException e5) {
                    hMSException2 = e5;
                    transportFailureCategory = transportFailureCategory;
                }
            } catch (HMSException e13) {
                e = e13;
                hMSException2 = e;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            transportFailureCategory = (TransportFailureCategory) c243892.L$0;
            try {
                AbstractC34132o.m107864I(obj);
                return obj;
            } catch (HMSException e14) {
                e = e14;
            }
        }
        hMSException2 = e;
        HMSLogger.m71137e(TAG, "Failed while retrying " + transportFailureCategory + " :: " + hMSException2.getDescription());
        throw hMSException2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(TransportState transportState) {
        HMSLogger.m71136d(TAG, "Transport state change: " + getState() + " -> " + transportState);
        TransportState transportState2 = TransportState.Failed;
        if (transportState == transportState2 && getState() != transportState2) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSTransport$state$1(this, null), 3);
        }
        this.state = transportState;
    }

    private final boolean shouldRetry(HMSException ex3) {
        return AbstractC25260n.m74056a0(new Integer[]{Integer.valueOf(ErrorCodes.InitAPIErrors.cEndpointUnreachable), 1003}, Integer.valueOf(ex3.getCode())) || AbstractC39421y.m125930O(String.valueOf(ex3.getCode()), "5", false) || AbstractC39421y.m125930O(String.valueOf(ex3.getCode()), "429", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0124 A[Catch: all -> 0x005c, Exception -> 0x005f, TRY_ENTER, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x012a A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x012e A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013b A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x013f A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[Catch: all -> 0x005c, Exception -> 0x005f, PHI: r4
      0x0143: PHI (r4v9 live.hms.video.transport.HMSTransport) = 
      (r4v21 live.hms.video.transport.HMSTransport)
      (r4v22 live.hms.video.transport.HMSTransport)
      (r4v23 live.hms.video.transport.HMSTransport)
      (r4v24 live.hms.video.transport.HMSTransport)
     binds: [B:51:0x011e, B:55:0x0128, B:59:0x0137, B:22:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x014b A[Catch: all -> 0x005c, Exception -> 0x005f, TRY_ENTER, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0151 A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0155 A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162 A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0166 A[Catch: all -> 0x005c, Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a A[Catch: all -> 0x005c, Exception -> 0x005f, PHI: r4
      0x016a: PHI (r4v12 live.hms.video.transport.HMSTransport) = 
      (r4v15 live.hms.video.transport.HMSTransport)
      (r4v16 live.hms.video.transport.HMSTransport)
      (r4v17 live.hms.video.transport.HMSTransport)
      (r4v18 live.hms.video.transport.HMSTransport)
     binds: [B:66:0x0145, B:70:0x014f, B:74:0x015e, B:15:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x005f, blocks: (B:15:0x0057, B:80:0x016a, B:22:0x0066, B:65:0x0143, B:69:0x014b, B:71:0x0151, B:73:0x0155, B:76:0x0162, B:77:0x0165, B:78:0x0166, B:79:0x0169, B:50:0x011a, B:54:0x0124, B:56:0x012a, B:58:0x012e, B:61:0x013b, B:62:0x013e, B:63:0x013f, B:64:0x0142), top: B:161:0x0032, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bf  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e5, code lost:
    
        if (r0 == r3) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e9, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027f, code lost:
    
        if (r0 == r3) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r2v7, types: [live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.lang.Object, live.hms.video.transport.HMSTransport] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: int
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:59)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:32)
    	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:508)
    	at jadx.core.dex.nodes.utils.TypeUtils.getClassTypeVars(TypeUtils.java:53)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:175)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tearDownTransport(q83.InterfaceC30057d<? super l83.C23454a0> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.HMSTransport.tearDownTransport(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object unpublish(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243911 c243911;
        HMSLocalStream stream2;
        if (interfaceC30057d instanceof C243911) {
            c243911 = (C243911) interfaceC30057d;
            int i13 = c243911.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243911.label = i13 - Integer.MIN_VALUE;
            } else {
                c243911 = new C243911(interfaceC30057d);
            }
        } else {
            c243911 = new C243911(interfaceC30057d);
        }
        Object obj = c243911.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243911.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSLogger.m71136d(TAG, "unpublish: track=" + hMSTrack + " STARTING");
                C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                this.callbacks.put(HMSConstantsKt.cPublishRenegotiationCallback, new TransportCallbackTriple(c3058tM8707a, HMSAction.Unpublish, null, 4, null));
                HMSTrackType type = hMSTrack.getType();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i15 = iArr[type.ordinal()];
                if (i15 == 1) {
                    stream2 = ((HMSLocalAudioTrack) hMSTrack).getStream();
                } else {
                    if (i15 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stream2 = ((HMSLocalVideoTrack) hMSTrack).getStream();
                }
                int i16 = iArr[hMSTrack.getType().ordinal()];
                if (i16 == 1) {
                    HMSLocalAudioTrack hMSLocalAudioTrack = (HMSLocalAudioTrack) hMSTrack;
                    hMSLocalAudioTrack.setSignal$lib_release(null);
                    hMSLocalAudioTrack.setTransceiver$lib_release(null);
                    hMSLocalAudioTrack.setSendLocalUpdate$lib_release(null);
                } else {
                    if (i16 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HMSLocalVideoTrack hMSLocalVideoTrack = (HMSLocalVideoTrack) hMSTrack;
                    hMSLocalVideoTrack.setSignal$lib_release(null);
                    hMSLocalVideoTrack.setTransceiver$lib_release(null);
                    hMSLocalVideoTrack.stopCapturing$lib_release();
                    hMSLocalVideoTrack.setSendLocalUpdate$lib_release(null);
                }
                HMSPublishConnection hMSPublishConnection = this.publishConnection;
                if (hMSPublishConnection == null) {
                    AbstractC22676k.m65757q("publishConnection");
                    throw null;
                }
                stream2.removeSender(hMSPublishConnection, hMSTrack);
                c243911.L$0 = hMSTrack;
                c243911.label = 1;
                if (c3058tM8707a.m8817m(c243911) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hMSTrack = (HMSTrack) c243911.L$0;
                AbstractC34132o.m107864I(obj);
            }
            HMSLogger.m71136d(TAG, "unpublish: trackId=" + hMSTrack.getTrackId() + " DONE");
        } catch (IllegalStateException unused) {
            HMSLogger.m71137e(TAG, "MediaStreamTrack has already been disposed");
        }
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object bulkRoleChangeRequest(List<HMSRole> list, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objBulkRoleChangeRequest = this.signal.bulkRoleChangeRequest(list, hMSRole, z4, hMSActionResultListener, interfaceC30057d);
        return objBulkRoleChangeRequest == EnumC31071a.f128113w ? objBulkRoleChangeRequest : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object changeMetadata(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objChangeMetadata = this.signal.changeMetadata(str, interfaceC30057d);
        return objChangeMetadata == EnumC31071a.f128113w ? objChangeMetadata : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object changeName(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objChangeName = this.signal.changeName(str, interfaceC30057d);
        return objChangeName == EnumC31071a.f128113w ? objChangeName : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object changeSessionMetadata(String str, JsonElement jsonElement, InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d) {
        return this.signal.changeSessionMetadata(str, jsonElement, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object changeTrackState(HMSTrack hMSTrack, String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objChangeTrackState = this.signal.changeTrackState(hMSTrack, str, z4, interfaceC30057d);
        return objChangeTrackState == EnumC31071a.f128113w ? objChangeTrackState : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112 A[Catch: HMSException -> 0x0127, TRY_LEAVE, TryCatch #4 {HMSException -> 0x0127, blocks: (B:49:0x010a, B:51:0x0112, B:45:0x00f3), top: B:86:0x00f3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0124  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    @Override // live.hms.video.transport.ITransport
    public Object connect(String str, String str2, String str3, RetrySchedulerState retrySchedulerState, PerformanceMeasurement performanceMeasurement, Function1 function1, InterfaceC30057d<? super InitConfig> interfaceC30057d) throws Exception {
        C243751 c243751;
        HMSTransport hMSTransport;
        String str4;
        String str5;
        String str6;
        Function1 function2;
        HMSTransport hMSTransport2;
        String str7;
        String str8;
        Function1 function3;
        PerformanceMeasurement performanceMeasurement2;
        String str9;
        C22669g0 c22669g0;
        TransportFailureCategory transportFailureCategory;
        HMSTransport$connect$connectConfig$task$1 hMSTransport$connect$connectConfig$task$1;
        PerformanceMeasurement performanceMeasurement3;
        C22669g0 c22669g1;
        ITransportListener iTransportListener;
        InitConfig initConfig;
        HMSTransport hMSTransport3;
        int iIntValue;
        ITransportListener iTransportListener2;
        Object obj;
        PerformanceMeasurement performanceMeasurement4 = performanceMeasurement;
        if (interfaceC30057d instanceof C243751) {
            c243751 = (C243751) interfaceC30057d;
            int i13 = c243751.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243751.label = i13 - Integer.MIN_VALUE;
            } else {
                c243751 = new C243751(interfaceC30057d);
            }
        } else {
            c243751 = new C243751(interfaceC30057d);
        }
        C243751 c243752 = c243751;
        Object objInternalConnect = c243752.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243752.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInternalConnect);
                this.performanceMeasurement = performanceMeasurement4;
                try {
                    this.connectParameters = new ConnectParameters(str, str3, str2);
                    this.retryScheduler.setState$lib_release(retrySchedulerState);
                    c243752.L$0 = this;
                    c243752.L$1 = str;
                    c243752.L$2 = str2;
                    c243752.L$3 = str3;
                    c243752.L$4 = performanceMeasurement4;
                    c243752.L$5 = function1;
                    c243752.label = 1;
                    objInternalConnect = internalConnect(str, str2, str3, function1, c243752);
                    if (objInternalConnect != enumC31071a) {
                        hMSTransport2 = this;
                        str7 = str2;
                        str8 = str3;
                        function3 = function1;
                        performanceMeasurement2 = performanceMeasurement4;
                        str9 = str;
                    }
                } catch (HMSException e5) {
                    e = e5;
                    hMSTransport = this;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                    function2 = function1;
                    c22669g0 = new C22669g0();
                    transportFailureCategory = TransportFailureCategory.SignalDisconnect;
                    hMSTransport$connect$connectConfig$task$1 = new HMSTransport$connect$connectConfig$task$1(c22669g0, hMSTransport, str4, str5, str6, function2, null);
                    if (!hMSTransport.shouldRetry(e)) {
                        iTransportListener = hMSTransport.connectivityListener;
                        if (iTransportListener != null) {
                            iTransportListener.onError(e);
                        }
                        throw e;
                    }
                    c243752.L$0 = hMSTransport;
                    c243752.L$1 = performanceMeasurement4;
                    c243752.L$2 = c22669g0;
                    c243752.L$3 = null;
                    c243752.L$4 = null;
                    c243752.L$5 = null;
                    c243752.label = 2;
                    objInternalConnect = hMSTransport.scheduleRetry(e, transportFailureCategory, hMSTransport$connect$connectConfig$task$1, c243752);
                    if (objInternalConnect != enumC31071a) {
                        performanceMeasurement3 = performanceMeasurement4;
                        c22669g1 = c22669g0;
                        iIntValue = ((Number) objInternalConnect).intValue();
                        if (performanceMeasurement3 != null) {
                            c243752.L$0 = hMSTransport;
                            c243752.L$1 = c22669g1;
                            c243752.L$2 = null;
                            c243752.label = 3;
                            if (performanceMeasurement3.numberedValue(EVENT_TYPE.CONNECT_RETRIES, iIntValue, c243752) != enumC31071a) {
                                hMSTransport3 = hMSTransport;
                                hMSTransport2 = hMSTransport3;
                            }
                        } else {
                            hMSTransport2 = hMSTransport;
                        }
                        obj = c22669g1.f89336w;
                        if (obj != null) {
                            AbstractC22676k.m65747g(obj);
                            initConfig = (InitConfig) obj;
                        } else {
                            initConfig = hMSTransport2.initConfig;
                            if (initConfig == null) {
                                AbstractC22676k.m65757q("initConfig");
                                throw null;
                            }
                        }
                        hMSTransport2.initConfig = initConfig;
                        iTransportListener2 = hMSTransport2.connectivityListener;
                        if (iTransportListener2 != null) {
                            iTransportListener2.onSignalConnected();
                        }
                        return initConfig;
                    }
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    c22669g1 = (C22669g0) c243752.L$2;
                    performanceMeasurement3 = (PerformanceMeasurement) c243752.L$1;
                    HMSTransport hMSTransport4 = (HMSTransport) c243752.L$0;
                    try {
                        AbstractC34132o.m107864I(objInternalConnect);
                        hMSTransport = hMSTransport4;
                        iIntValue = ((Number) objInternalConnect).intValue();
                        if (performanceMeasurement3 != null) {
                            c243752.L$0 = hMSTransport;
                            c243752.L$1 = c22669g1;
                            c243752.L$2 = null;
                            c243752.label = 3;
                            if (performanceMeasurement3.numberedValue(EVENT_TYPE.CONNECT_RETRIES, iIntValue, c243752) != enumC31071a) {
                                hMSTransport3 = hMSTransport;
                                hMSTransport2 = hMSTransport3;
                            }
                            return enumC31071a;
                        }
                        hMSTransport2 = hMSTransport;
                        obj = c22669g1.f89336w;
                        if (obj != null) {
                            AbstractC22676k.m65747g(obj);
                            initConfig = (InitConfig) obj;
                        } else {
                            initConfig = hMSTransport2.initConfig;
                            if (initConfig == null) {
                                AbstractC22676k.m65757q("initConfig");
                                throw null;
                            }
                        }
                        hMSTransport2.initConfig = initConfig;
                        iTransportListener2 = hMSTransport2.connectivityListener;
                        if (iTransportListener2 != null) {
                            iTransportListener2.onSignalConnected();
                        }
                        return initConfig;
                    } catch (HMSException e13) {
                        e = e13;
                        hMSTransport3 = hMSTransport4;
                    }
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c22669g1 = (C22669g0) c243752.L$1;
                    hMSTransport3 = (HMSTransport) c243752.L$0;
                    try {
                        AbstractC34132o.m107864I(objInternalConnect);
                        hMSTransport2 = hMSTransport3;
                        obj = c22669g1.f89336w;
                        if (obj != null) {
                            AbstractC22676k.m65747g(obj);
                            initConfig = (InitConfig) obj;
                        } else {
                            initConfig = hMSTransport2.initConfig;
                            if (initConfig == null) {
                                AbstractC22676k.m65757q("initConfig");
                                throw null;
                            }
                        }
                        hMSTransport2.initConfig = initConfig;
                        iTransportListener2 = hMSTransport2.connectivityListener;
                        if (iTransportListener2 != null) {
                            iTransportListener2.onSignalConnected();
                        }
                        return initConfig;
                    } catch (HMSException e14) {
                        e = e14;
                    }
                }
                ITransportListener iTransportListener3 = hMSTransport3.connectivityListener;
                if (iTransportListener3 != null) {
                    iTransportListener3.onError(e);
                }
                throw e;
            }
            function3 = (Function1) c243752.L$5;
            performanceMeasurement2 = (PerformanceMeasurement) c243752.L$4;
            str8 = (String) c243752.L$3;
            str7 = (String) c243752.L$2;
            str9 = (String) c243752.L$1;
            HMSTransport hMSTransport5 = (HMSTransport) c243752.L$0;
            try {
                AbstractC34132o.m107864I(objInternalConnect);
                hMSTransport2 = hMSTransport5;
            } catch (HMSException e15) {
                e = e15;
                function2 = function3;
                str6 = str8;
                str5 = str7;
                str4 = str9;
                hMSTransport = hMSTransport5;
                performanceMeasurement4 = performanceMeasurement2;
                c22669g0 = new C22669g0();
                transportFailureCategory = TransportFailureCategory.SignalDisconnect;
                hMSTransport$connect$connectConfig$task$1 = new HMSTransport$connect$connectConfig$task$1(c22669g0, hMSTransport, str4, str5, str6, function2, null);
                if (!hMSTransport.shouldRetry(e)) {
                    iTransportListener = hMSTransport.connectivityListener;
                    if (iTransportListener != null) {
                        iTransportListener.onError(e);
                    }
                    throw e;
                }
                try {
                    c243752.L$0 = hMSTransport;
                    c243752.L$1 = performanceMeasurement4;
                    c243752.L$2 = c22669g0;
                    c243752.L$3 = null;
                    c243752.L$4 = null;
                    c243752.L$5 = null;
                    c243752.label = 2;
                    objInternalConnect = hMSTransport.scheduleRetry(e, transportFailureCategory, hMSTransport$connect$connectConfig$task$1, c243752);
                    if (objInternalConnect != enumC31071a) {
                        performanceMeasurement3 = performanceMeasurement4;
                        c22669g1 = c22669g0;
                        iIntValue = ((Number) objInternalConnect).intValue();
                        if (performanceMeasurement3 != null) {
                            c243752.L$0 = hMSTransport;
                            c243752.L$1 = c22669g1;
                            c243752.L$2 = null;
                            c243752.label = 3;
                            if (performanceMeasurement3.numberedValue(EVENT_TYPE.CONNECT_RETRIES, iIntValue, c243752) != enumC31071a) {
                                hMSTransport3 = hMSTransport;
                                hMSTransport2 = hMSTransport3;
                            }
                        } else {
                            hMSTransport2 = hMSTransport;
                        }
                        obj = c22669g1.f89336w;
                        if (obj != null) {
                            AbstractC22676k.m65747g(obj);
                            initConfig = (InitConfig) obj;
                        } else {
                            initConfig = hMSTransport2.initConfig;
                            if (initConfig == null) {
                                AbstractC22676k.m65757q("initConfig");
                                throw null;
                            }
                        }
                        hMSTransport2.initConfig = initConfig;
                        iTransportListener2 = hMSTransport2.connectivityListener;
                        if (iTransportListener2 != null) {
                            iTransportListener2.onSignalConnected();
                        }
                        return initConfig;
                    }
                    return enumC31071a;
                } catch (HMSException e16) {
                    e = e16;
                    hMSTransport3 = hMSTransport;
                }
            }
            initConfig = (InitConfig) objInternalConnect;
        } catch (HMSException e17) {
            e = e17;
            hMSTransport = hMSTransport2;
            function2 = function3;
            str6 = str8;
            str5 = str7;
            str4 = str9;
            performanceMeasurement4 = performanceMeasurement2;
            c22669g0 = new C22669g0();
            transportFailureCategory = TransportFailureCategory.SignalDisconnect;
            hMSTransport$connect$connectConfig$task$1 = new HMSTransport$connect$connectConfig$task$1(c22669g0, hMSTransport, str4, str5, str6, function2, null);
            if (!hMSTransport.shouldRetry(e)) {
                iTransportListener = hMSTransport.connectivityListener;
                if (iTransportListener != null) {
                    iTransportListener.onError(e);
                }
                throw e;
            }
            c243752.L$0 = hMSTransport;
            c243752.L$1 = performanceMeasurement4;
            c243752.L$2 = c22669g0;
            c243752.L$3 = null;
            c243752.L$4 = null;
            c243752.L$5 = null;
            c243752.label = 2;
            objInternalConnect = hMSTransport.scheduleRetry(e, transportFailureCategory, hMSTransport$connect$connectConfig$task$1, c243752);
            if (objInternalConnect != enumC31071a) {
                performanceMeasurement3 = performanceMeasurement4;
                c22669g1 = c22669g0;
                iIntValue = ((Number) objInternalConnect).intValue();
                if (performanceMeasurement3 != null) {
                    c243752.L$0 = hMSTransport;
                    c243752.L$1 = c22669g1;
                    c243752.L$2 = null;
                    c243752.label = 3;
                    if (performanceMeasurement3.numberedValue(EVENT_TYPE.CONNECT_RETRIES, iIntValue, c243752) != enumC31071a) {
                        hMSTransport3 = hMSTransport;
                        hMSTransport2 = hMSTransport3;
                    }
                } else {
                    hMSTransport2 = hMSTransport;
                }
                obj = c22669g1.f89336w;
                if (obj != null) {
                    AbstractC22676k.m65747g(obj);
                    initConfig = (InitConfig) obj;
                } else {
                    initConfig = hMSTransport2.initConfig;
                    if (initConfig == null) {
                        AbstractC22676k.m65757q("initConfig");
                        throw null;
                    }
                }
            }
            return enumC31071a;
        }
        hMSTransport2.initConfig = initConfig;
        iTransportListener2 = hMSTransport2.connectivityListener;
        if (iTransportListener2 != null) {
            iTransportListener2.onSignalConnected();
        }
        return initConfig;
    }

    @Override // live.hms.video.transport.ITransport
    public Object createPoll(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super PollCreateResponse> interfaceC30057d) {
        return this.signal.createPoll(setPollParams, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object createQuestion(HMSParams.PollQuestionsSet pollQuestionsSet, InterfaceC30057d<? super SetQuestionsResponse> interfaceC30057d) {
        return this.signal.createQuestion(pollQuestionsSet, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object createWhiteBoard(HMSParams.Options options, InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d) {
        return this.signal.createWhiteBoard(options, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public void deInitLocalStreams() {
        this.stream = null;
        this.nativeStream = null;
        this.tracksToPublish.clear();
    }

    @Override // live.hms.video.transport.ITransport
    public Object disposePeerConnectionFactory(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.isHmsPeerConnectionFactoryInitialized = false;
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object endRoom(String str, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.signal.endRoom(str, z4, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object findPeers(String str, String str2, ArrayList<String> arrayList, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
        return this.signal.findPeer(str, str2, arrayList, i13, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public AnalyticsEventsService getAnalyticsEventsService() {
        return this.analyticsEventsService;
    }

    @Override // live.hms.video.transport.ITransport
    public HMSCapturer getAudioShareCapturer(Context context, Intent mediaProjectionPermissionResultData, AudioMixingMode audioMixingMode, Notification screenShareNotification) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        return HMSStreamFactory.INSTANCE.makeAudioShareCapturer(context, getHmsPeerConnectionFactory(), audioMixingMode, mediaProjectionPermissionResultData, screenShareNotification, new C243761(this.observer));
    }

    @Override // live.hms.video.transport.ITransport
    public void getAuthTokenByRoomCode(TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSTokenListener hmsTokenListener) {
        AbstractC22676k.m65750j(tokenRequest, "tokenRequest");
        AbstractC22676k.m65750j(hmsTokenListener, "hmsTokenListener");
        TokenUtils.INSTANCE.getAuthTokenByRoomCode(tokenRequest, tokenRequestOptions, hmsTokenListener, this.agentOs);
    }

    public final ITransportListener getConnectivityListener() {
        return this.connectivityListener;
    }

    @Override // live.hms.video.transport.ITransport
    public void getLayoutConfigByToken(String token, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener hmsLayoutConfigListener) {
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(hmsLayoutConfigListener, "hmsLayoutConfigListener");
        LayoutUtils.INSTANCE.getLayoutConfigByToken(token, layoutRequestOptions, hmsLayoutConfigListener, this.agentOs);
    }

    public final HMSLocalAudioTrack getLocalAudioTrack() {
        return this.localAudioTrack;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:40:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.transport.ITransport
    public Object getLocalTrackByType(Context context, HMSTrackSettings hMSTrackSettings, HMSTrackType hMSTrackType, InterfaceC30057d<? super HMSTrack> interfaceC30057d) {
        C243771 c243771;
        HMSPermissionsChecker hMSPermissionsChecker;
        HMSTrackSettings hMSTrackSettings2;
        String str;
        Object obj;
        HMSTransport hMSTransport;
        Context context2;
        HMSTransport hMSTransport2;
        HMSVideoTrackSettings videoSettings;
        long jCurrentTimeMillis;
        HMSStreamFactory hMSStreamFactory;
        Object obj2;
        HMSTrackSettings hMSTrackSettings3;
        HMSStreamFactory hMSStreamFactory2;
        Context context3;
        long j7;
        HMSTransport hMSTransport3;
        HMSTransport hMSTransport4;
        HMSAudioTrackSettings audioSettings;
        HMSStreamFactory hMSStreamFactory3;
        HMSTransport hMSTransport5;
        HMSTransport hMSTransport6;
        if (interfaceC30057d instanceof C243771) {
            c243771 = (C243771) interfaceC30057d;
            int i13 = c243771.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243771.label = i13 - Integer.MIN_VALUE;
            } else {
                c243771 = new C243771(interfaceC30057d);
            }
        } else {
            c243771 = new C243771(interfaceC30057d);
        }
        Object obj3 = c243771.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243771.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj3);
            hMSPermissionsChecker = new HMSPermissionsChecker();
            if (this.nativeStream != null && this.stream != null) {
                hMSTransport = this;
                if (hMSTrackType == HMSTrackType.AUDIO) {
                    audioSettings = hMSTrackSettings.getAudioSettings();
                    if (audioSettings != null) {
                        hMSPermissionsChecker.checkPermissionAndThrowError(context, "android.permission.RECORD_AUDIO");
                        hMSStreamFactory3 = HMSStreamFactory.INSTANCE;
                        SafeVariable<PeerConnectionFactory> factory = hMSTransport.getHmsPeerConnectionFactory().getFactory();
                        c243771.L$0 = hMSTransport;
                        c243771.L$1 = audioSettings;
                        c243771.L$2 = hMSStreamFactory3;
                        c243771.L$3 = hMSTransport;
                        c243771.L$4 = null;
                        c243771.L$5 = null;
                        c243771.L$6 = null;
                        c243771.label = 2;
                        obj3 = factory.get(c243771);
                        if (obj3 != enumC31071a) {
                            hMSTransport5 = hMSTransport;
                            hMSTransport6 = hMSTransport5;
                            hMSTransport5.nativeAudioTrack = hMSStreamFactory3.makeLocalAudioTrack((PeerConnectionFactory) obj3, audioSettings, hMSTransport6.noiseCancellationStatusChecker.enableWebrtcNoiseSuppression());
                            MediaStream mediaStream = hMSTransport6.nativeStream;
                            AbstractC22676k.m65747g(mediaStream);
                            mediaStream.addTrack(hMSTransport6.nativeAudioTrack);
                            HMSLocalStream hMSLocalStream = hMSTransport6.stream;
                            AbstractC22676k.m65747g(hMSLocalStream);
                            AudioTrack audioTrack = hMSTransport6.nativeAudioTrack;
                            AbstractC22676k.m65747g(audioTrack);
                            HMSLocalAudioTrack hMSLocalAudioTrack = new HMSLocalAudioTrack(hMSLocalStream, audioTrack, audioSettings, "regular");
                            hMSTransport6.localAudioTrack = hMSLocalAudioTrack;
                            return hMSLocalAudioTrack;
                        }
                    }
                    return null;
                }
                if (hMSTrackType == HMSTrackType.VIDEO && (videoSettings = hMSTrackSettings.getVideoSettings()) != null) {
                    hMSPermissionsChecker.checkPermissionAndThrowError(context, "android.permission.CAMERA");
                    System.currentTimeMillis();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    hMSStreamFactory = HMSStreamFactory.INSTANCE;
                    SafeVariable<PeerConnectionFactory> factory2 = hMSTransport.getHmsPeerConnectionFactory().getFactory();
                    c243771.L$0 = hMSTransport;
                    c243771.L$1 = context;
                    c243771.L$2 = hMSTrackSettings;
                    c243771.L$3 = videoSettings;
                    c243771.L$4 = hMSStreamFactory;
                    c243771.L$5 = hMSTransport;
                    c243771.L$6 = null;
                    c243771.J$0 = jCurrentTimeMillis;
                    c243771.label = 3;
                    obj2 = factory2.get(c243771);
                    if (obj2 != enumC31071a) {
                        hMSTrackSettings3 = hMSTrackSettings;
                        hMSStreamFactory2 = hMSStreamFactory;
                        context3 = context;
                        j7 = jCurrentTimeMillis;
                        obj3 = obj2;
                        hMSTransport3 = hMSTransport;
                        hMSTransport4 = hMSTransport3;
                        HMSVideoTrackSettings hMSVideoTrackSettings = videoSettings;
                        hMSTransport3.nativeVideoTrack = hMSStreamFactory2.makeLocalVideoTrack((PeerConnectionFactory) obj3, hMSTrackSettings3.getVideoSettings().getDisableAutoResize());
                        HMSLogger.m71136d("Profiling", "time taken to make local video Track : " + (System.currentTimeMillis() - j7));
                        MediaStream mediaStream2 = hMSTransport4.nativeStream;
                        AbstractC22676k.m65747g(mediaStream2);
                        mediaStream2.addTrack(hMSTransport4.nativeVideoTrack);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        HMSCameraCapturer hMSCameraCapturerMakeLocalVideoCapturer = HMSStreamFactory.INSTANCE.makeLocalVideoCapturer(context3, hMSVideoTrackSettings, hMSTransport4.getAnalyticsEventsService());
                        HMSLogger.m71136d("Profiling", "time taken to create video capturer : " + (System.currentTimeMillis() - jCurrentTimeMillis2));
                        HMSLocalStream hMSLocalStream2 = hMSTransport4.stream;
                        AbstractC22676k.m65747g(hMSLocalStream2);
                        VideoTrack videoTrack = hMSTransport4.nativeVideoTrack;
                        AbstractC22676k.m65747g(videoTrack);
                        HMSLocalVideoTrack hMSLocalVideoTrack = new HMSLocalVideoTrack(hMSLocalStream2, videoTrack, hMSVideoTrackSettings, hMSCameraCapturerMakeLocalVideoCapturer, "regular");
                        hMSTransport4.localVideoTrack = hMSLocalVideoTrack;
                        return hMSLocalVideoTrack;
                    }
                }
                return null;
            }
            String strMakeStreamId = IdHelper.INSTANCE.makeStreamId();
            SafeVariable<PeerConnectionFactory> factory3 = getHmsPeerConnectionFactory().getFactory();
            c243771.L$0 = this;
            c243771.L$1 = context;
            c243771.L$2 = hMSTrackSettings;
            c243771.L$3 = hMSTrackType;
            c243771.L$4 = hMSPermissionsChecker;
            c243771.L$5 = strMakeStreamId;
            c243771.L$6 = this;
            c243771.label = 1;
            Object obj4 = factory3.get(c243771);
            if (obj4 != enumC31071a) {
                hMSTrackSettings2 = hMSTrackSettings;
                str = strMakeStreamId;
                obj = obj4;
                hMSTransport = this;
                context2 = context;
                hMSTransport2 = hMSTransport;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                hMSTransport5 = (HMSTransport) c243771.L$3;
                hMSStreamFactory3 = (HMSStreamFactory) c243771.L$2;
                audioSettings = (HMSAudioTrackSettings) c243771.L$1;
                hMSTransport6 = (HMSTransport) c243771.L$0;
                AbstractC34132o.m107864I(obj3);
                hMSTransport5.nativeAudioTrack = hMSStreamFactory3.makeLocalAudioTrack((PeerConnectionFactory) obj3, audioSettings, hMSTransport6.noiseCancellationStatusChecker.enableWebrtcNoiseSuppression());
                MediaStream mediaStream3 = hMSTransport6.nativeStream;
                AbstractC22676k.m65747g(mediaStream3);
                mediaStream3.addTrack(hMSTransport6.nativeAudioTrack);
                HMSLocalStream hMSLocalStream3 = hMSTransport6.stream;
                AbstractC22676k.m65747g(hMSLocalStream3);
                AudioTrack audioTrack2 = hMSTransport6.nativeAudioTrack;
                AbstractC22676k.m65747g(audioTrack2);
                HMSLocalAudioTrack hMSLocalAudioTrack2 = new HMSLocalAudioTrack(hMSLocalStream3, audioTrack2, audioSettings, "regular");
                hMSTransport6.localAudioTrack = hMSLocalAudioTrack2;
                return hMSLocalAudioTrack2;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c243771.J$0;
            hMSTransport3 = (HMSTransport) c243771.L$5;
            hMSStreamFactory2 = (HMSStreamFactory) c243771.L$4;
            videoSettings = (HMSVideoTrackSettings) c243771.L$3;
            hMSTrackSettings3 = (HMSTrackSettings) c243771.L$2;
            context3 = (Context) c243771.L$1;
            hMSTransport4 = (HMSTransport) c243771.L$0;
            AbstractC34132o.m107864I(obj3);
            HMSVideoTrackSettings hMSVideoTrackSettings2 = videoSettings;
            hMSTransport3.nativeVideoTrack = hMSStreamFactory2.makeLocalVideoTrack((PeerConnectionFactory) obj3, hMSTrackSettings3.getVideoSettings().getDisableAutoResize());
            HMSLogger.m71136d("Profiling", "time taken to make local video Track : " + (System.currentTimeMillis() - j7));
            MediaStream mediaStream4 = hMSTransport4.nativeStream;
            AbstractC22676k.m65747g(mediaStream4);
            mediaStream4.addTrack(hMSTransport4.nativeVideoTrack);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            HMSCameraCapturer hMSCameraCapturerMakeLocalVideoCapturer2 = HMSStreamFactory.INSTANCE.makeLocalVideoCapturer(context3, hMSVideoTrackSettings2, hMSTransport4.getAnalyticsEventsService());
            HMSLogger.m71136d("Profiling", "time taken to create video capturer : " + (System.currentTimeMillis() - jCurrentTimeMillis3));
            HMSLocalStream hMSLocalStream4 = hMSTransport4.stream;
            AbstractC22676k.m65747g(hMSLocalStream4);
            VideoTrack videoTrack2 = hMSTransport4.nativeVideoTrack;
            AbstractC22676k.m65747g(videoTrack2);
            HMSLocalVideoTrack hMSLocalVideoTrack2 = new HMSLocalVideoTrack(hMSLocalStream4, videoTrack2, hMSVideoTrackSettings2, hMSCameraCapturerMakeLocalVideoCapturer2, "regular");
            hMSTransport4.localVideoTrack = hMSLocalVideoTrack2;
            return hMSLocalVideoTrack2;
        }
        hMSTransport2 = (HMSTransport) c243771.L$6;
        str = (String) c243771.L$5;
        HMSPermissionsChecker hMSPermissionsChecker2 = (HMSPermissionsChecker) c243771.L$4;
        HMSTrackType hMSTrackType2 = (HMSTrackType) c243771.L$3;
        hMSTrackSettings2 = (HMSTrackSettings) c243771.L$2;
        context2 = (Context) c243771.L$1;
        hMSTransport = (HMSTransport) c243771.L$0;
        AbstractC34132o.m107864I(obj3);
        hMSPermissionsChecker = hMSPermissionsChecker2;
        hMSTrackType = hMSTrackType2;
        obj = obj3;
        hMSTransport2.nativeStream = ((PeerConnectionFactory) obj).createLocalMediaStream(str);
        MediaStream mediaStream5 = hMSTransport.nativeStream;
        AbstractC22676k.m65747g(mediaStream5);
        hMSTransport.stream = new HMSLocalStream(mediaStream5);
        hMSTrackSettings = hMSTrackSettings2;
        context = context2;
        if (hMSTrackType == HMSTrackType.AUDIO) {
            audioSettings = hMSTrackSettings.getAudioSettings();
            if (audioSettings != null) {
                hMSPermissionsChecker.checkPermissionAndThrowError(context, "android.permission.RECORD_AUDIO");
                hMSStreamFactory3 = HMSStreamFactory.INSTANCE;
                SafeVariable<PeerConnectionFactory> factory4 = hMSTransport.getHmsPeerConnectionFactory().getFactory();
                c243771.L$0 = hMSTransport;
                c243771.L$1 = audioSettings;
                c243771.L$2 = hMSStreamFactory3;
                c243771.L$3 = hMSTransport;
                c243771.L$4 = null;
                c243771.L$5 = null;
                c243771.L$6 = null;
                c243771.label = 2;
                obj3 = factory4.get(c243771);
                if (obj3 != enumC31071a) {
                    hMSTransport5 = hMSTransport;
                    hMSTransport6 = hMSTransport5;
                    hMSTransport5.nativeAudioTrack = hMSStreamFactory3.makeLocalAudioTrack((PeerConnectionFactory) obj3, audioSettings, hMSTransport6.noiseCancellationStatusChecker.enableWebrtcNoiseSuppression());
                    MediaStream mediaStream6 = hMSTransport6.nativeStream;
                    AbstractC22676k.m65747g(mediaStream6);
                    mediaStream6.addTrack(hMSTransport6.nativeAudioTrack);
                    HMSLocalStream hMSLocalStream5 = hMSTransport6.stream;
                    AbstractC22676k.m65747g(hMSLocalStream5);
                    AudioTrack audioTrack3 = hMSTransport6.nativeAudioTrack;
                    AbstractC22676k.m65747g(audioTrack3);
                    HMSLocalAudioTrack hMSLocalAudioTrack3 = new HMSLocalAudioTrack(hMSLocalStream5, audioTrack3, audioSettings, "regular");
                    hMSTransport6.localAudioTrack = hMSLocalAudioTrack3;
                    return hMSLocalAudioTrack3;
                }
                return enumC31071a;
            }
            return null;
        }
        if (hMSTrackType == HMSTrackType.VIDEO) {
            hMSPermissionsChecker.checkPermissionAndThrowError(context, "android.permission.CAMERA");
            System.currentTimeMillis();
            jCurrentTimeMillis = System.currentTimeMillis();
            hMSStreamFactory = HMSStreamFactory.INSTANCE;
            SafeVariable<PeerConnectionFactory> factory5 = hMSTransport.getHmsPeerConnectionFactory().getFactory();
            c243771.L$0 = hMSTransport;
            c243771.L$1 = context;
            c243771.L$2 = hMSTrackSettings;
            c243771.L$3 = videoSettings;
            c243771.L$4 = hMSStreamFactory;
            c243771.L$5 = hMSTransport;
            c243771.L$6 = null;
            c243771.J$0 = jCurrentTimeMillis;
            c243771.label = 3;
            obj2 = factory5.get(c243771);
            if (obj2 != enumC31071a) {
                hMSTrackSettings3 = hMSTrackSettings;
                hMSStreamFactory2 = hMSStreamFactory;
                context3 = context;
                j7 = jCurrentTimeMillis;
                obj3 = obj2;
                hMSTransport3 = hMSTransport;
                hMSTransport4 = hMSTransport3;
                HMSVideoTrackSettings hMSVideoTrackSettings3 = videoSettings;
                hMSTransport3.nativeVideoTrack = hMSStreamFactory2.makeLocalVideoTrack((PeerConnectionFactory) obj3, hMSTrackSettings3.getVideoSettings().getDisableAutoResize());
                HMSLogger.m71136d("Profiling", "time taken to make local video Track : " + (System.currentTimeMillis() - j7));
                MediaStream mediaStream7 = hMSTransport4.nativeStream;
                AbstractC22676k.m65747g(mediaStream7);
                mediaStream7.addTrack(hMSTransport4.nativeVideoTrack);
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                HMSCameraCapturer hMSCameraCapturerMakeLocalVideoCapturer3 = HMSStreamFactory.INSTANCE.makeLocalVideoCapturer(context3, hMSVideoTrackSettings3, hMSTransport4.getAnalyticsEventsService());
                HMSLogger.m71136d("Profiling", "time taken to create video capturer : " + (System.currentTimeMillis() - jCurrentTimeMillis4));
                HMSLocalStream hMSLocalStream6 = hMSTransport4.stream;
                AbstractC22676k.m65747g(hMSLocalStream6);
                VideoTrack videoTrack3 = hMSTransport4.nativeVideoTrack;
                AbstractC22676k.m65747g(videoTrack3);
                HMSLocalVideoTrack hMSLocalVideoTrack3 = new HMSLocalVideoTrack(hMSLocalStream6, videoTrack3, hMSVideoTrackSettings3, hMSCameraCapturerMakeLocalVideoCapturer3, "regular");
                hMSTransport4.localVideoTrack = hMSLocalVideoTrack3;
                return hMSLocalVideoTrack3;
            }
            return enumC31071a;
        }
        return null;
    }

    public final HMSLocalVideoTrack getLocalVideoTrack() {
        return this.localVideoTrack;
    }

    public final AudioTrack getNativeAudioTrack() {
        return this.nativeAudioTrack;
    }

    public final VideoTrack getNativeVideoTrack() {
        return this.nativeVideoTrack;
    }

    public final String getNodeID() {
        return this.nodeID;
    }

    @Override // live.hms.video.transport.ITransport
    public Object getPublishPacketStats(InterfaceC30057d<? super RTCStatsReport> interfaceC30057d) {
        HMSPublishConnection hMSPublishConnection = this.publishConnection;
        if (hMSPublishConnection != null) {
            if (hMSPublishConnection == null) {
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
            if (!hMSPublishConnection.getIsClose()) {
                HMSPublishConnection hMSPublishConnection2 = this.publishConnection;
                if (hMSPublishConnection2 != null) {
                    Object stats = hMSPublishConnection2.getStats(interfaceC30057d);
                    return stats == EnumC31071a.f128113w ? stats : (RTCStatsReport) stats;
                }
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // live.hms.video.transport.ITransport
    public Object getScreenShareTrack(Context context, HMSTrackSettings hMSTrackSettings, Intent intent, Notification notification, InterfaceC30057d<? super HMSTrack> interfaceC30057d) {
        C243781 c243781;
        HMSVideoTrackSettings videoSettings;
        HMSStreamFactory hMSStreamFactory;
        Intent intent2;
        HMSTransport hMSTransport;
        Notification notification2;
        Context context2;
        String strMakeStreamId;
        VideoTrack videoTrack;
        HMSVideoTrackSettings hMSVideoTrackSettings;
        Notification notification3;
        Intent intent3;
        Context context3;
        HMSTransport hMSTransport2;
        HMSLocalStream hMSLocalStream;
        HMSStreamFactory hMSStreamFactory2;
        Object obj;
        HMSVideoTrackSettings hMSVideoTrackSettings2;
        Context context4;
        VideoTrack videoTrack2;
        HMSStreamFactory hMSStreamFactory3;
        HMSTransport hMSTransport3;
        if (interfaceC30057d instanceof C243781) {
            c243781 = (C243781) interfaceC30057d;
            int i13 = c243781.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243781.label = i13 - Integer.MIN_VALUE;
            } else {
                c243781 = new C243781(interfaceC30057d);
            }
        } else {
            c243781 = new C243781(interfaceC30057d);
        }
        Object obj2 = c243781.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243781.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            videoSettings = hMSTrackSettings.getVideoSettings();
            if (videoSettings == null) {
                HMSLogger.m71137e(TAG, "getScreenShareTrack :: Video Settings of HMSTrackSettings is null");
                return null;
            }
            hMSStreamFactory = HMSStreamFactory.INSTANCE;
            SafeVariable<PeerConnectionFactory> factory = getHmsPeerConnectionFactory().getFactory();
            c243781.L$0 = this;
            c243781.L$1 = context;
            intent2 = intent;
            c243781.L$2 = intent2;
            c243781.L$3 = notification;
            c243781.L$4 = videoSettings;
            c243781.L$5 = hMSStreamFactory;
            c243781.label = 1;
            obj2 = factory.get(c243781);
            if (obj2 != enumC31071a) {
                hMSTransport = this;
                notification2 = notification;
                context2 = context;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            hMSStreamFactory = (HMSStreamFactory) c243781.L$5;
            videoSettings = (HMSVideoTrackSettings) c243781.L$4;
            notification2 = (Notification) c243781.L$3;
            intent2 = (Intent) c243781.L$2;
            context2 = (Context) c243781.L$1;
            hMSTransport = (HMSTransport) c243781.L$0;
            AbstractC34132o.m107864I(obj2);
        } else {
            if (i14 == 2) {
                strMakeStreamId = (String) c243781.L$6;
                videoTrack = (VideoTrack) c243781.L$5;
                hMSVideoTrackSettings = (HMSVideoTrackSettings) c243781.L$4;
                notification3 = (Notification) c243781.L$3;
                intent3 = (Intent) c243781.L$2;
                context3 = (Context) c243781.L$1;
                hMSTransport2 = (HMSTransport) c243781.L$0;
                AbstractC34132o.m107864I(obj2);
                MediaStream mediaStreamCreateLocalMediaStream = ((PeerConnectionFactory) obj2).createLocalMediaStream(strMakeStreamId);
                AbstractC22676k.m65747g(mediaStreamCreateLocalMediaStream);
                hMSLocalStream = new HMSLocalStream(mediaStreamCreateLocalMediaStream);
                hMSStreamFactory2 = HMSStreamFactory.INSTANCE;
                SafeVariable<PeerConnectionFactory> factory2 = hMSTransport2.getHmsPeerConnectionFactory().getFactory();
                c243781.L$0 = hMSTransport2;
                c243781.L$1 = intent3;
                c243781.L$2 = notification3;
                c243781.L$3 = hMSVideoTrackSettings;
                c243781.L$4 = hMSStreamFactory2;
                c243781.L$5 = context3;
                c243781.L$6 = videoTrack;
                c243781.L$7 = hMSLocalStream;
                c243781.label = 3;
                obj = factory2.get(c243781);
                if (obj != enumC31071a) {
                    Context context5 = context3;
                    hMSVideoTrackSettings2 = hMSVideoTrackSettings;
                    context4 = context5;
                    videoTrack2 = videoTrack;
                    hMSStreamFactory3 = hMSStreamFactory2;
                    obj2 = obj;
                    hMSTransport3 = hMSTransport2;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HMSLocalStream hMSLocalStream2 = (HMSLocalStream) c243781.L$7;
            VideoTrack videoTrack3 = (VideoTrack) c243781.L$6;
            Context context6 = (Context) c243781.L$5;
            hMSStreamFactory3 = (HMSStreamFactory) c243781.L$4;
            HMSVideoTrackSettings hMSVideoTrackSettings3 = (HMSVideoTrackSettings) c243781.L$3;
            notification3 = (Notification) c243781.L$2;
            intent3 = (Intent) c243781.L$1;
            hMSTransport3 = (HMSTransport) c243781.L$0;
            AbstractC34132o.m107864I(obj2);
            hMSVideoTrackSettings2 = hMSVideoTrackSettings3;
            context4 = context6;
            videoTrack2 = videoTrack3;
            hMSLocalStream = hMSLocalStream2;
        }
        HMSCapturer hMSCapturerMakeScreenShareCapturer = hMSStreamFactory3.makeScreenShareCapturer(context4, (PeerConnectionFactory) obj2, intent3, hMSVideoTrackSettings2, notification3, new HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1(hMSTransport3.observer));
        AbstractC22676k.m65748h(hMSCapturerMakeScreenShareCapturer, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSScreenCapturer");
        return new HMSLocalVideoTrack(hMSLocalStream, videoTrack2, hMSVideoTrackSettings2, (HMSScreenCapturer) hMSCapturerMakeScreenShareCapturer, HMSTrackSource.SCREEN);
        VideoTrack videoTrackMakeLocalVideoTrack = hMSStreamFactory.makeLocalVideoTrack((PeerConnectionFactory) obj2, true);
        strMakeStreamId = IdHelper.INSTANCE.makeStreamId();
        SafeVariable<PeerConnectionFactory> factory3 = hMSTransport.getHmsPeerConnectionFactory().getFactory();
        c243781.L$0 = hMSTransport;
        c243781.L$1 = context2;
        c243781.L$2 = intent2;
        c243781.L$3 = notification2;
        c243781.L$4 = videoSettings;
        c243781.L$5 = videoTrackMakeLocalVideoTrack;
        c243781.L$6 = strMakeStreamId;
        c243781.label = 2;
        Object obj3 = factory3.get(c243781);
        if (obj3 != enumC31071a) {
            videoTrack = videoTrackMakeLocalVideoTrack;
            obj2 = obj3;
            hMSVideoTrackSettings = videoSettings;
            notification3 = notification2;
            intent3 = intent2;
            context3 = context2;
            hMSTransport2 = hMSTransport;
            MediaStream mediaStreamCreateLocalMediaStream2 = ((PeerConnectionFactory) obj2).createLocalMediaStream(strMakeStreamId);
            AbstractC22676k.m65747g(mediaStreamCreateLocalMediaStream2);
            hMSLocalStream = new HMSLocalStream(mediaStreamCreateLocalMediaStream2);
            hMSStreamFactory2 = HMSStreamFactory.INSTANCE;
            SafeVariable<PeerConnectionFactory> factory4 = hMSTransport2.getHmsPeerConnectionFactory().getFactory();
            c243781.L$0 = hMSTransport2;
            c243781.L$1 = intent3;
            c243781.L$2 = notification3;
            c243781.L$3 = hMSVideoTrackSettings;
            c243781.L$4 = hMSStreamFactory2;
            c243781.L$5 = context3;
            c243781.L$6 = videoTrack;
            c243781.L$7 = hMSLocalStream;
            c243781.label = 3;
            obj = factory4.get(c243781);
            if (obj != enumC31071a) {
                Context context7 = context3;
                hMSVideoTrackSettings2 = hMSVideoTrackSettings;
                context4 = context7;
                videoTrack2 = videoTrack;
                hMSStreamFactory3 = hMSStreamFactory2;
                obj2 = obj;
                hMSTransport3 = hMSTransport2;
                HMSCapturer hMSCapturerMakeScreenShareCapturer2 = hMSStreamFactory3.makeScreenShareCapturer(context4, (PeerConnectionFactory) obj2, intent3, hMSVideoTrackSettings2, notification3, new HMSTransport$getScreenShareTrack$2$hmsScreenCapturer$1(hMSTransport3.observer));
                AbstractC22676k.m65748h(hMSCapturerMakeScreenShareCapturer2, "null cannot be cast to non-null type live.hms.video.media.capturers.HMSScreenCapturer");
                return new HMSLocalVideoTrack(hMSLocalStream, videoTrack2, hMSVideoTrackSettings2, (HMSScreenCapturer) hMSCapturerMakeScreenShareCapturer2, HMSTrackSource.SCREEN);
            }
        }
        return enumC31071a;
    }

    public final boolean getServerSoftwareEchoCancellationEnabled() {
        return this.serverSoftwareEchoCancellationEnabled;
    }

    @Override // live.hms.video.transport.ITransport
    public Object getSessionMetadata(String str, InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d) {
        return this.signal.getSessionMetadata(str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public TransportState getState() {
        return this.state;
    }

    @Override // live.hms.video.transport.ITransport
    public Object getSubscribePacketStats(InterfaceC30057d<? super RTCStatsReport> interfaceC30057d) {
        HMSSubscribeConnection hMSSubscribeConnection = this.subscribeConnection;
        if (hMSSubscribeConnection != null) {
            if (hMSSubscribeConnection == null) {
                AbstractC22676k.m65757q("subscribeConnection");
                throw null;
            }
            if (!hMSSubscribeConnection.getIsClose()) {
                HMSSubscribeConnection hMSSubscribeConnection2 = this.subscribeConnection;
                if (hMSSubscribeConnection2 != null) {
                    Object stats = hMSSubscribeConnection2.getStats(interfaceC30057d);
                    return stats == EnumC31071a.f128113w ? stats : (RTCStatsReport) stats;
                }
                AbstractC22676k.m65757q("subscribeConnection");
                throw null;
            }
        }
        return null;
    }

    @Override // live.hms.video.transport.ITransport
    public long getTimeAfterJoinResponse() {
        return this.timeAfterJoinResponse;
    }

    @Override // live.hms.video.transport.ITransport
    public long getTimeAfterWSOpen() {
        return this.timeAfterWSOpen;
    }

    @Override // live.hms.video.transport.ITransport
    public Object getWhiteBoard(String str, InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d) {
        return this.signal.getWhiteBoard(str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object groupAdd(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objGroupAdd = this.signal.groupAdd(str, str2, interfaceC30057d);
        return objGroupAdd == EnumC31071a.f128113w ? objGroupAdd : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object groupJoin(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
        return this.signal.groupJoin(str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object groupLeave(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
        return this.signal.groupLeave(str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object groupRemove(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objGroupRemove = this.signal.groupRemove(str, str2, interfaceC30057d);
        return objGroupRemove == EnumC31071a.f128113w ? objGroupRemove : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public void initHmsPeerConnectionFactory(boolean isSimulcastEnabled, boolean serverSoftwareEchoCancellationEnabled) {
        if (this.isHmsPeerConnectionFactoryInitialized) {
            return;
        }
        getHmsPeerConnectionFactory().initialize(this.hmsTrackSettings, isSimulcastEnabled, serverSoftwareEchoCancellationEnabled);
        this.isHmsPeerConnectionFactoryInitialized = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.transport.ITransport
    public Object initPeerConnections(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243791 c243791;
        HMSTransport hMSTransport;
        HMSConfiguration hMSConfiguration;
        HMSTransport hMSTransport2;
        HMSConfiguration hMSConfiguration2;
        HMSTransport hMSTransport3;
        HMSTransport hMSTransport4;
        HMSPublishConnection hMSPublishConnection;
        HMSSubscribeConnection hMSSubscribeConnection;
        if (interfaceC30057d instanceof C243791) {
            c243791 = (C243791) interfaceC30057d;
            int i13 = c243791.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243791.label = i13 - Integer.MIN_VALUE;
            } else {
                c243791 = new C243791(interfaceC30057d);
            }
        } else {
            c243791 = new C243791(interfaceC30057d);
        }
        Object obj = c243791.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243791.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            HMSConfiguration.Companion companion = HMSConfiguration.INSTANCE;
            InitConfig initConfig = this.initConfig;
            if (initConfig == null) {
                AbstractC22676k.m65757q("initConfig");
                throw null;
            }
            HMSConfiguration hMSConfigurationFrom = companion.from(initConfig);
            JoinParameters joinParameters = this.joinParameters;
            hMSConfigurationFrom.enableIceGatheringOnAnyAddressPorts(joinParameters != null ? joinParameters.getIceGatheringOnAnyAddressPorts() : false);
            SafeVariable<PeerConnectionFactory> factory = getHmsPeerConnectionFactory().getFactory();
            c243791.L$0 = this;
            c243791.L$1 = hMSConfigurationFrom;
            c243791.L$2 = this;
            c243791.label = 1;
            Object obj2 = factory.get(c243791);
            if (obj2 != enumC31071a) {
                hMSTransport = this;
                hMSConfiguration = hMSConfigurationFrom;
                obj = obj2;
                hMSTransport2 = hMSTransport;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            hMSTransport2 = (HMSTransport) c243791.L$2;
            hMSConfiguration = (HMSConfiguration) c243791.L$1;
            hMSTransport = (HMSTransport) c243791.L$0;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hMSTransport4 = (HMSTransport) c243791.L$2;
            HMSConfiguration hMSConfiguration3 = (HMSConfiguration) c243791.L$1;
            hMSTransport3 = (HMSTransport) c243791.L$0;
            AbstractC34132o.m107864I(obj);
            hMSConfiguration2 = hMSConfiguration3;
        }
        hMSTransport4.subscribeConnection = new HMSSubscribeConnection((PeerConnectionFactory) obj, hMSTransport3.signal, hMSConfiguration2, hMSTransport3.subscribeConnectionObserver, hMSTransport3.trackFactory);
        hMSPublishConnection = hMSTransport3.publishConnection;
        if (hMSPublishConnection != null) {
            AbstractC22676k.m65757q("publishConnection");
            throw null;
        }
        hMSPublishConnection.setNodeInfo(hMSTransport3.nodeID);
        hMSSubscribeConnection = hMSTransport3.subscribeConnection;
        if (hMSSubscribeConnection != null) {
            AbstractC22676k.m65757q("subscribeConnection");
            throw null;
        }
        hMSSubscribeConnection.setNodeInfo(hMSTransport3.nodeID);
        hMSTransport3.isPeerConnectionReady = true;
        return C23454a0.f92919a;
        hMSTransport2.publishConnection = new HMSPublishConnection((PeerConnectionFactory) obj, hMSTransport.signal, hMSConfiguration, hMSTransport.publishConnectionObserver);
        SafeVariable<PeerConnectionFactory> factory2 = hMSTransport.getHmsPeerConnectionFactory().getFactory();
        c243791.L$0 = hMSTransport;
        c243791.L$1 = hMSConfiguration;
        c243791.L$2 = hMSTransport;
        c243791.label = 2;
        obj = factory2.get(c243791);
        if (obj != enumC31071a) {
            hMSConfiguration2 = hMSConfiguration;
            hMSTransport3 = hMSTransport;
            hMSTransport4 = hMSTransport3;
            hMSTransport4.subscribeConnection = new HMSSubscribeConnection((PeerConnectionFactory) obj, hMSTransport3.signal, hMSConfiguration2, hMSTransport3.subscribeConnectionObserver, hMSTransport3.trackFactory);
            hMSPublishConnection = hMSTransport3.publishConnection;
            if (hMSPublishConnection != null) {
                AbstractC22676k.m65757q("publishConnection");
                throw null;
            }
            hMSPublishConnection.setNodeInfo(hMSTransport3.nodeID);
            hMSSubscribeConnection = hMSTransport3.subscribeConnection;
            if (hMSSubscribeConnection != null) {
                AbstractC22676k.m65757q("subscribeConnection");
                throw null;
            }
            hMSSubscribeConnection.setNodeInfo(hMSTransport3.nodeID);
            hMSTransport3.isPeerConnectionReady = true;
            return C23454a0.f92919a;
        }
        return enumC31071a;
    }

    @Override // live.hms.video.transport.ITransport
    public void initializePeerConnectionFactoryIfNeeded(HMSTrackSettings hmsTrackSettings, boolean isSimulcastEnabled, boolean isSoftwareEchoCancellationEnabled) {
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        initHmsPeerConnectionFactory(isSimulcastEnabled, isSoftwareEchoCancellationEnabled);
    }

    /* JADX INFO: renamed from: isSimulcastEnabled, reason: from getter */
    public final boolean getIsSimulcastEnabled() {
        return this.isSimulcastEnabled;
    }

    @Override // live.hms.video.transport.ITransport
    public boolean isSocketConnectionOpen() {
        return this.signal.get_isConnected();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0140 A[Catch: HMSException -> 0x01df, TRY_LEAVE, TryCatch #10 {HMSException -> 0x01df, blocks: (B:47:0x0139, B:49:0x0140, B:52:0x0162), top: B:112:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x018d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0192 A[Catch: IllegalStateException -> 0x0198, HMSException -> 0x019c, TRY_LEAVE, TryCatch #7 {HMSException -> 0x019c, blocks: (B:61:0x018e, B:63:0x0192), top: B:108:0x018e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // live.hms.video.transport.ITransport
    public Object join(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C243821 c243821;
        String str6;
        HMSTransport hMSTransport;
        String str7;
        String str8;
        HMSTransport hMSTransport2;
        boolean z16;
        boolean z17;
        String str9;
        String str10;
        boolean z18;
        HMSTransport hMSTransport3;
        String str11;
        String str12;
        HMSTransport hMSTransport4;
        Object objInternalJoin;
        InitConfig initConfig;
        HMSTransport hMSTransport5;
        String str13;
        IllegalStateException e5;
        PerformanceMeasurement performanceMeasurement;
        HMSTransport hMSTransport6 = this;
        if (interfaceC30057d instanceof C243821) {
            c243821 = (C243821) interfaceC30057d;
            int i13 = c243821.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243821.label = i13 - Integer.MIN_VALUE;
            } else {
                c243821 = hMSTransport6.new C243821(interfaceC30057d);
            }
        } else {
            c243821 = hMSTransport6.new C243821(interfaceC30057d);
        }
        C243821 c243822 = c243821;
        Object obj = c243822.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243822.label;
        HMSException hMSException = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (hMSTransport6.getState() == TransportState.Failed) {
                hMSTransport6.setState(TransportState.Disconnected);
            }
            hMSTransport6.retryScheduler.setState$lib_release(RetrySchedulerState.JOINED);
            TransportState transportState = TransportState.Disconnected;
            if (!AbstractC25260n.m74056a0(new TransportState[]{transportState, TransportState.Reconnecting, TransportState.SignalConnected}, hMSTransport6.getState())) {
                throw ErrorFactory.WebsocketMethodErrors.AlreadyJoined$default(ErrorFactory.WebsocketMethodErrors.INSTANCE, ErrorFactory.Action.JOIN, "Cannot join a meeting in " + getState(), null, null, 12, null);
            }
            if (hMSTransport6.getState() == transportState) {
                hMSTransport6.setState(TransportState.Connecting);
                ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport6.observer, hMSTransport6.getState(), null, 2, null);
            }
            hMSTransport6.joinParameters = new JoinParameters(str, str2, str3, str4, str5, z4, z15);
            HMSLogger.m71136d(TAG, "join: started ⏰");
            if (!hMSTransport6.signal.get_isConnected() || hMSTransport6.initConfig == null) {
                try {
                    PerformanceMeasurement performanceMeasurement2 = hMSTransport6.performanceMeasurement;
                    c243822.L$0 = hMSTransport6;
                    c243822.L$1 = str;
                    c243822.L$2 = str3;
                    c243822.L$3 = str4;
                    c243822.L$4 = hMSTransport6;
                    c243822.L$5 = hMSTransport6;
                    c243822.Z$0 = z4;
                    c243822.Z$1 = z13;
                    c243822.Z$2 = z14;
                    c243822.label = 1;
                    str8 = TAG;
                    try {
                        Object objConnect$default = ITransport.DefaultImpls.connect$default(hMSTransport6, str, str5, str2, null, performanceMeasurement2, null, c243822, 40, null);
                        if (objConnect$default != enumC31071a) {
                            hMSTransport2 = this;
                            z16 = z13;
                            z17 = z14;
                            str9 = str3;
                            obj = objConnect$default;
                            str10 = str4;
                            z18 = z4;
                            hMSTransport = hMSTransport2;
                            str7 = str;
                            initConfig = hMSTransport.initConfig;
                            if (initConfig == null) {
                                str6 = str8;
                                AbstractC22676k.m65757q("initConfig");
                                throw hMSException;
                            }
                            hMSTransport5 = hMSTransport;
                            ITransport.DefaultImpls.updateAnalyticsParams$default(hMSTransport5, null, null, null, null, initConfig.getEndpoint(), 15, null);
                            hMSTransport2.initConfig = (InitConfig) obj;
                            hMSTransport6 = hMSTransport;
                            c243822.L$0 = hMSTransport6;
                            c243822.L$1 = str7;
                            c243822.L$2 = hMSException;
                            c243822.L$3 = hMSException;
                            c243822.L$4 = hMSException;
                            c243822.L$5 = hMSException;
                            c243822.label = 2;
                            hMSTransport4 = hMSTransport6;
                            objInternalJoin = hMSTransport4.internalJoin(str9, str10, z18, z16, z17, c243822);
                            hMSTransport3 = hMSTransport4;
                            if (objInternalJoin != enumC31071a) {
                                str12 = str7;
                                performanceMeasurement = hMSTransport3.performanceMeasurement;
                                if (performanceMeasurement != null) {
                                    performanceMeasurement.start$lib_release(EVENT_TYPE.PEER_LIST);
                                }
                                HMSLogger.m71136d(str8, "join: successful ✅");
                                hMSTransport3.setState(TransportState.Joined);
                                hMSTransport3.hasJoined = true;
                                ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), hMSException, 2, hMSException);
                                return C23454a0.f92919a;
                            }
                            str6 = str8;
                            HMSLogger.INSTANCE.m71138e(str6, AbstractC31061c.m95633i(']', "join: failed ❌ [token=", str7), e);
                            hMSTransport.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.connect(e, RetrySchedulerState.JOINED)).flush();
                            hMSTransport.setState(TransportState.Failed);
                            throw e;
                        }
                    } catch (HMSException e13) {
                        e = e13;
                        str6 = str8;
                        hMSTransport = this;
                        str7 = str;
                    }
                } catch (HMSException e14) {
                    e = e14;
                    str6 = TAG;
                }
            } else {
                str7 = str;
                str9 = str3;
                str10 = str4;
                z18 = z4;
                z16 = z13;
                z17 = z14;
                str8 = TAG;
                hMSException = null;
                c243822.L$0 = hMSTransport6;
                c243822.L$1 = str7;
                c243822.L$2 = hMSException;
                c243822.L$3 = hMSException;
                c243822.L$4 = hMSException;
                c243822.L$5 = hMSException;
                c243822.label = 2;
                hMSTransport4 = hMSTransport6;
                objInternalJoin = hMSTransport4.internalJoin(str9, str10, z18, z16, z17, c243822);
                hMSTransport3 = hMSTransport4;
                if (objInternalJoin != enumC31071a) {
                    str12 = str7;
                    performanceMeasurement = hMSTransport3.performanceMeasurement;
                    if (performanceMeasurement != null) {
                        performanceMeasurement.start$lib_release(EVENT_TYPE.PEER_LIST);
                    }
                    HMSLogger.m71136d(str8, "join: successful ✅");
                    hMSTransport3.setState(TransportState.Joined);
                    hMSTransport3.hasJoined = true;
                    ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), hMSException, 2, hMSException);
                    return C23454a0.f92919a;
                }
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            z17 = c243822.Z$2;
            z16 = c243822.Z$1;
            z18 = c243822.Z$0;
            HMSTransport hMSTransport7 = (HMSTransport) c243822.L$5;
            str10 = (String) c243822.L$3;
            str9 = (String) c243822.L$2;
            str7 = (String) c243822.L$1;
            hMSTransport = (HMSTransport) c243822.L$0;
            try {
                AbstractC34132o.m107864I(obj);
                str8 = TAG;
                hMSTransport2 = hMSTransport7;
                try {
                    initConfig = hMSTransport.initConfig;
                    if (initConfig == null) {
                        hMSTransport5 = hMSTransport;
                        try {
                            ITransport.DefaultImpls.updateAnalyticsParams$default(hMSTransport5, null, null, null, null, initConfig.getEndpoint(), 15, null);
                            hMSTransport2.initConfig = (InitConfig) obj;
                            hMSTransport6 = hMSTransport;
                            try {
                                try {
                                    c243822.L$0 = hMSTransport6;
                                    c243822.L$1 = str7;
                                    c243822.L$2 = hMSException;
                                    c243822.L$3 = hMSException;
                                    c243822.L$4 = hMSException;
                                    c243822.L$5 = hMSException;
                                    c243822.label = 2;
                                    hMSTransport4 = hMSTransport6;
                                    try {
                                        objInternalJoin = hMSTransport4.internalJoin(str9, str10, z18, z16, z17, c243822);
                                        hMSTransport3 = hMSTransport4;
                                        if (objInternalJoin != enumC31071a) {
                                            str12 = str7;
                                            performanceMeasurement = hMSTransport3.performanceMeasurement;
                                            if (performanceMeasurement != null) {
                                                performanceMeasurement.start$lib_release(EVENT_TYPE.PEER_LIST);
                                            }
                                            HMSLogger.m71136d(str8, "join: successful ✅");
                                            hMSTransport3.setState(TransportState.Joined);
                                            hMSTransport3.hasJoined = true;
                                            ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), hMSException, 2, hMSException);
                                            return C23454a0.f92919a;
                                        }
                                        return enumC31071a;
                                    } catch (HMSException e15) {
                                        e = e15;
                                        hMSTransport3 = hMSTransport4;
                                        str11 = str8;
                                        str12 = str7;
                                    }
                                } catch (HMSException e16) {
                                    e = e16;
                                    hMSTransport3 = hMSTransport6;
                                }
                            } catch (IllegalStateException e17) {
                                e5 = e17;
                                str13 = str8;
                                HMSLogger.INSTANCE.m71138e(str13, "join: failed cause peer is closed ❌ ", e5);
                                throw e5;
                            }
                        } catch (HMSException e18) {
                            e = e18;
                            hMSTransport = hMSTransport5;
                        }
                    } else {
                        str6 = str8;
                        try {
                            AbstractC22676k.m65757q("initConfig");
                            throw hMSException;
                        } catch (HMSException e19) {
                            e = e19;
                        }
                    }
                } catch (HMSException e22) {
                    e = e22;
                }
                str6 = str8;
            } catch (HMSException e24) {
                e = e24;
                str6 = TAG;
            }
            HMSLogger.INSTANCE.m71138e(str6, AbstractC31061c.m95633i(']', "join: failed ❌ [token=", str7), e);
            hMSTransport.getAnalyticsEventsService().queue(AnalyticsEventFactory.INSTANCE.connect(e, RetrySchedulerState.JOINED)).flush();
            hMSTransport.setState(TransportState.Failed);
            throw e;
        }
        if (i14 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str12 = (String) c243822.L$1;
        hMSTransport3 = (HMSTransport) c243822.L$0;
        try {
            AbstractC34132o.m107864I(obj);
            str8 = TAG;
            hMSException = null;
            try {
                performanceMeasurement = hMSTransport3.performanceMeasurement;
                if (performanceMeasurement != null) {
                    performanceMeasurement.start$lib_release(EVENT_TYPE.PEER_LIST);
                }
                HMSLogger.m71136d(str8, "join: successful ✅");
                hMSTransport3.setState(TransportState.Joined);
                hMSTransport3.hasJoined = true;
                ITransportObserver.DefaultImpls.onStateChange$default(hMSTransport3.observer, hMSTransport3.getState(), hMSException, 2, hMSException);
                return C23454a0.f92919a;
            } catch (HMSException e25) {
                e = e25;
                str11 = str8;
            }
        } catch (IllegalStateException e26) {
            e5 = e26;
            str13 = TAG;
            HMSLogger.INSTANCE.m71138e(str13, "join: failed cause peer is closed ❌ ", e5);
            throw e5;
        } catch (HMSException e27) {
            e = e27;
            str11 = TAG;
        }
        HMSLogger.INSTANCE.m71138e(str11, AbstractC31061c.m95633i(']', "join: failed ❌ [token=", str12), e);
        hMSTransport3.setState(TransportState.Failed);
        throw e;
    }

    @Override // live.hms.video.transport.ITransport
    public Object leave(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        TransportState state = getState();
        TransportState transportState = TransportState.Disconnected;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (state == transportState) {
            HMSLogger.m71137e(TAG, "Ignoring leave() call, transport is already in disconnected state");
            return c23454a0;
        }
        this.signal.leave(z4);
        Object objTearDownTransport = tearDownTransport(interfaceC30057d);
        return objTearDownTransport == EnumC31071a.f128113w ? objTearDownTransport : c23454a0;
    }

    @Override // live.hms.video.transport.ITransport
    public NoiseCancellation noiseCancellation() {
        return getHmsPeerConnectionFactory().getNoiseCancellation();
    }

    @Override // live.hms.video.transport.ITransport
    public Object peerIteratorNext(String str, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
        return this.signal.peerIteratorNext(str, i13, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object peerNameSearch(String str, int i13, long j7, InterfaceC30057d<? super PeerNameSearchResponse> interfaceC30057d) {
        return this.signal.peerNameSearch(str, i13, j7, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollAddResponse(HMSPollResponseBuilder hMSPollResponseBuilder, InterfaceC30057d<? super PollAnswerResponse> interfaceC30057d) {
        return this.signal.pollAddResponse(hMSPollResponseBuilder, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollGetLeaderboard(HMSParams.PollLeaderboardQuery pollLeaderboardQuery, InterfaceC30057d<? super PollLeaderboardResponse> interfaceC30057d) {
        return this.signal.pollGetLeaderboard(pollLeaderboardQuery, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollGetList(HmsPollState hmsPollState, int i13, String str, InterfaceC30057d<? super PollListResponse> interfaceC30057d) {
        return this.signal.pollGetList(hmsPollState, i13, str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollGetResponses(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super PollGetResponsesReply> interfaceC30057d) {
        return this.signal.pollGetResponses(pollResponsesQuery, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollGetResults(String str, InterfaceC30057d<? super PollResultsResponse> interfaceC30057d) {
        return this.signal.pollGetResults(str, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollQuestionsGet(HMSParams.PollQuestionsGet pollQuestionsGet, InterfaceC30057d<? super PollQuestionGetResponse> interfaceC30057d) {
        return this.signal.pollQuestionsGet(pollQuestionsGet, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollStart(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objPollStart = this.signal.pollStart(str, interfaceC30057d);
        return objPollStart == EnumC31071a.f128113w ? objPollStart : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object pollStop(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objPollStop = this.signal.pollStop(str, interfaceC30057d);
        return objPollStop == EnumC31071a.f128113w ? objPollStop : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object publishScreenshare(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSLogger.m71136d(TAG, "publish: screenshare track=" + hMSTrack + " STARTING");
        boolean zContains = this.tracksToPublish.contains(hMSTrack);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zContains) {
            this.screenShareTrack = hMSTrack;
            this.tracksToPublish.add(hMSTrack);
            Object objPublish = publish(hMSTrack, true, interfaceC30057d);
            if (objPublish == EnumC31071a.f128113w) {
                return objPublish;
            }
        }
        return c23454a0;
    }

    @Override // live.hms.video.transport.ITransport
    public Object reInitPeerConnectionFactory(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.isHmsPeerConnectionFactoryInitialized = false;
        HMSLogger.m71136d("SFUMIGRATION", "Create new Peer connection");
        getHmsPeerConnectionFactory().getFactory().reset();
        initHmsPeerConnectionFactory(this.isSimulcastEnabled, this.serverSoftwareEchoCancellationEnabled);
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object removePeerRequest(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRemovePeer = this.signal.removePeer(str, str2, interfaceC30057d);
        return objRemovePeer == EnumC31071a.f128113w ? objRemovePeer : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public void removeTrackFromStream() {
        MediaStream mediaStream;
        MediaStream mediaStream2;
        AudioTrack audioTrack = this.nativeAudioTrack;
        if (audioTrack != null && (mediaStream2 = this.nativeStream) != null) {
            mediaStream2.removeTrack(audioTrack);
        }
        VideoTrack videoTrack = this.nativeVideoTrack;
        if (videoTrack == null || (mediaStream = this.nativeStream) == null) {
            return;
        }
        mediaStream.removeTrack(videoTrack);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.transport.ITransport
    public Object renegotiationICE(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243871 c243871;
        if (interfaceC30057d instanceof C243871) {
            c243871 = (C243871) interfaceC30057d;
            int i13 = c243871.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243871.label = i13 - Integer.MIN_VALUE;
            } else {
                c243871 = new C243871(interfaceC30057d);
            }
        } else {
            c243871 = new C243871(interfaceC30057d);
        }
        Object obj = c243871.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c243871.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                MediaConstraints mediaConstraintsMakePublishOfferConstraints = MediaConstraintsFactory.INSTANCE.makePublishOfferConstraints();
                c243871.label = 1;
                if (performPublishRenegotiation(mediaConstraintsMakePublishOfferConstraints, c243871) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (IllegalStateException e5) {
            HMSLogger.INSTANCE.m71141w(TAG, "Renegotiation didnt complete due to : " + e5.getMessage());
        }
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object roleChangeAccept(String str, String str2, HMSPeer hMSPeer, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRoleChangeAccept = this.signal.roleChangeAccept(str, str2, hMSPeer, interfaceC30057d);
        return objRoleChangeAccept == EnumC31071a.f128113w ? objRoleChangeAccept : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object roleChangeRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRoleChangeRequest = this.signal.roleChangeRequest(str, z4, str2, interfaceC30057d);
        return objRoleChangeRequest == EnumC31071a.f128113w ? objRoleChangeRequest : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object sendMessage(HMSParams hMSParams, InterfaceC30057d<? super HMSMessageSendResponse> interfaceC30057d) {
        return this.signal.sendMessage(hMSParams, interfaceC30057d);
    }

    @Override // live.hms.video.transport.ITransport
    public void setAudioMixingMode(AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        getHmsPeerConnectionFactory().setAudioMixingMode(audioMixingMode);
    }

    public final void setConnectivityListener(ITransportListener iTransportListener) {
        this.connectivityListener = iTransportListener;
    }

    @Override // live.hms.video.transport.ITransport
    public Object setHlsSessionMetadata(List<HMSHLSTimedMetadata> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object hlsSessionMetadata = this.signal.setHlsSessionMetadata(list, interfaceC30057d);
        return hlsSessionMetadata == EnumC31071a.f128113w ? hlsSessionMetadata : C23454a0.f92919a;
    }

    public final void setLocalAudioTrack(HMSLocalAudioTrack hMSLocalAudioTrack) {
        this.localAudioTrack = hMSLocalAudioTrack;
    }

    public final void setLocalVideoTrack(HMSLocalVideoTrack hMSLocalVideoTrack) {
        this.localVideoTrack = hMSLocalVideoTrack;
    }

    @Override // live.hms.video.transport.ITransport
    public Object setMetadataListener(List<String> list, InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d) {
        return this.signal.setMetadataListener(list, interfaceC30057d);
    }

    public final void setNativeAudioTrack(AudioTrack audioTrack) {
        this.nativeAudioTrack = audioTrack;
    }

    public final void setNativeVideoTrack(VideoTrack videoTrack) {
        this.nativeVideoTrack = videoTrack;
    }

    public final void setNodeID(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.nodeID = str;
    }

    @Override // live.hms.video.transport.ITransport
    public void setNodeInfo(String nodeId) {
        AbstractC22676k.m65750j(nodeId, "nodeId");
        this.nodeID = nodeId;
    }

    public final void setServerSoftwareEchoCancellationEnabled(boolean z4) {
        this.serverSoftwareEchoCancellationEnabled = z4;
    }

    public final void setSimulcastEnabled(boolean z4) {
        this.isSimulcastEnabled = z4;
    }

    @Override // live.hms.video.transport.ITransport
    public void setTimeAfterJoinResponse(long j7) {
        this.timeAfterJoinResponse = j7;
    }

    @Override // live.hms.video.transport.ITransport
    public void setTimeAfterWSOpen(long j7) {
        this.timeAfterWSOpen = j7;
    }

    @Override // live.hms.video.transport.ITransport
    public Object startHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStartHLSStreaming = this.signal.startHLSStreaming(hMSHLSConfig, interfaceC30057d);
        return objStartHLSStreaming == EnumC31071a.f128113w ? objStartHLSStreaming : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object startRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStartRealTimeTranscription = this.signal.startRealTimeTranscription(transcriptionsMode, interfaceC30057d);
        return objStartRealTimeTranscription == EnumC31071a.f128113w ? objStartRealTimeTranscription : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object startRtmpOrRecording(HMSRecordingConfig hMSRecordingConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStartRtmpOrRecording = this.signal.startRtmpOrRecording(hMSRecordingConfig, interfaceC30057d);
        return objStartRtmpOrRecording == EnumC31071a.f128113w ? objStartRtmpOrRecording : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public void stopAudioFromRawFile(HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        getHmsPeerConnectionFactory().stopAudioFromRawFile(hmsActionResultListener);
    }

    @Override // live.hms.video.transport.ITransport
    public Object stopHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStopHLSStreaming = this.signal.stopHLSStreaming(hMSHLSConfig, interfaceC30057d);
        return objStopHLSStreaming == EnumC31071a.f128113w ? objStopHLSStreaming : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object stopRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStopRealTimeTranscription = this.signal.stopRealTimeTranscription(transcriptionsMode, interfaceC30057d);
        return objStopRealTimeTranscription == EnumC31071a.f128113w ? objStopRealTimeTranscription : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public Object stopRtmpAndRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStopRtmpAndRecording = this.signal.stopRtmpAndRecording(interfaceC30057d);
        return objStopRtmpAndRecording == EnumC31071a.f128113w ? objStopRtmpAndRecording : C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public void streamAndPlayAudioFromRawFile(int audioResourceId, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        getHmsPeerConnectionFactory().streamAndPlayAudioFromRawFile(audioResourceId, hmsActionResultListener);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.transport.ITransport
    public Object unpublishScreenshare(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243931 c243931;
        HMSTransport hMSTransport;
        if (interfaceC30057d instanceof C243931) {
            c243931 = (C243931) interfaceC30057d;
            int i13 = c243931.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243931.label = i13 - Integer.MIN_VALUE;
            } else {
                c243931 = new C243931(interfaceC30057d);
            }
        } else {
            c243931 = new C243931(interfaceC30057d);
        }
        Object obj = c243931.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243931.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            HMSTrack hMSTrack = this.screenShareTrack;
            if (hMSTrack != null) {
                this.tracksToPublish.remove(hMSTrack);
                c243931.L$0 = this;
                c243931.label = 1;
                if (unpublish(hMSTrack, c243931) == enumC31071a) {
                    return enumC31071a;
                }
                hMSTransport = this;
            } else {
                HMSLogger.m71137e(TAG, "No screenshare track present to unpublish");
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hMSTransport = (HMSTransport) c243931.L$0;
        AbstractC34132o.m107864I(obj);
        hMSTransport.screenShareTrack = null;
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.transport.ITransport
    public void updateAnalyticsParams(String token, String sessionId, HMSPeer hmsPeer, HMSRoom hmsRoom, String websocketUrl) {
        getAnalyticsEventsService().updateAnalyticsParams(token, sessionId, hmsPeer, hmsRoom, websocketUrl);
    }

    @Override // live.hms.video.transport.ITransport
    public Object changeTrackState(boolean z4, HMSTrackType hMSTrackType, String str, List<String> list, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objChangeTrackState = this.signal.changeTrackState(z4, hMSTrackType, str, list, str2, interfaceC30057d);
        return objChangeTrackState == EnumC31071a.f128113w ? objChangeTrackState : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:58:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0179 -> B:73:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0198 -> B:70:0x0199). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // live.hms.video.transport.ITransport
    public java.lang.Object publish(live.hms.video.media.tracks.HMSTrack[] r17, q83.InterfaceC30057d<? super java.util.List<? extends live.hms.video.media.tracks.HMSTrack>> r18) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.HMSTransport.publish(live.hms.video.media.tracks.HMSTrack[], q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // live.hms.video.transport.ITransport
    public java.lang.Object unpublish(live.hms.video.media.tracks.HMSTrack[] r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof live.hms.video.transport.HMSTransport.C243924
            if (r0 == 0) goto L13
            r0 = r9
            live.hms.video.transport.HMSTransport$unpublish$4 r0 = (live.hms.video.transport.HMSTransport.C243924) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            live.hms.video.transport.HMSTransport$unpublish$4 r0 = new live.hms.video.transport.HMSTransport$unpublish$4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            live.hms.video.media.tracks.HMSTrack[] r4 = (live.hms.video.media.tracks.HMSTrack[]) r4
            java.lang.Object r5 = r0.L$0
            live.hms.video.transport.HMSTransport r5 = (live.hms.video.transport.HMSTransport) r5
            p505ts.AbstractC34132o.m107864I(r9)
            r9 = r4
            goto L5f
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            p505ts.AbstractC34132o.m107864I(r9)
            int r9 = r8.length
            r2 = 0
            r5 = r9
            r9 = r8
            r8 = r5
            r5 = r7
        L45:
            if (r2 >= r8) goto L61
            r4 = r9[r2]
            java.util.ArrayList<live.hms.video.media.tracks.HMSTrack> r6 = r5.tracksToPublish
            r6.remove(r4)
            r0.L$0 = r5
            r0.L$1 = r9
            r0.I$0 = r2
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r4 = r5.unpublish(r4, r0)
            if (r4 != r1) goto L5f
            return r1
        L5f:
            int r2 = r2 + r3
            goto L45
        L61:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: live.hms.video.transport.HMSTransport.unpublish(live.hms.video.media.tracks.HMSTrack[], q83.d):java.lang.Object");
    }
}
