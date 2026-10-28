package live.hms.video.signal.jsonrpc;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.C3060t1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.CommandDefaults;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import le3.C23886g;
import lh1.C24069a;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.factories.OkHttpFactory;
import live.hms.video.groups.GroupJoinLeaveResponse;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.polls.HMSPollResponseBuilder;
import live.hms.video.polls.models.HmsPollState;
import live.hms.video.polls.models.answer.PollAnswerResponse;
import live.hms.video.polls.network.HMSPollLeaderboardResponse;
import live.hms.video.polls.network.PollCreateResponse;
import live.hms.video.polls.network.PollGetResponsesReply;
import live.hms.video.polls.network.PollLeaderboardResponse;
import live.hms.video.polls.network.PollListResponse;
import live.hms.video.polls.network.PollQuestionGetResponse;
import live.hms.video.polls.network.PollResultsResponse;
import live.hms.video.polls.network.SetQuestionsResponse;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.models.EVENT_TYPE;
import live.hms.video.sdk.models.FindPeerResponse;
import live.hms.video.sdk.models.HMSHLSConfig;
import live.hms.video.sdk.models.HMSHLSMeetingURLVariant;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSMessageSendResponse;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.IRetryAttemptTracking;
import live.hms.video.sdk.models.PeerNameSearchResponse;
import live.hms.video.sdk.models.TranscriptionStartResponse;
import live.hms.video.sdk.models.TranscriptionStopResponse;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.enums.HMSNotificationMethod;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.sessionstore.SetMetadataListenerResult;
import live.hms.video.sessionstore.SetSessionMetadataResult;
import live.hms.video.signal.HMSSignalMethod;
import live.hms.video.signal.ISignal;
import live.hms.video.signal.ISignalEventsObserver;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.signal.jsonrpc.models.JsonRpcRequest;
import live.hms.video.transport.models.TransportFailureCategory;
import live.hms.video.utils.CoroutineExceptionTrackerKt;
import live.hms.video.utils.ExtensionUtilsKt;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.IdHelper;
import live.hms.video.whiteboard.network.HMSCreateWhiteBoardResponse;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import mc3.InterfaceC25435a;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.UninitializedPropertyAccessException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34811e1;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000ª\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 ñ\u00012\u00020\u00012\u00020\u0002:\u0004ñ\u0001ò\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u001e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J6\u00105\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00072\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J(\u00109\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00132\u0006\u00108\u001a\u00020\bH\u0096@¢\u0006\u0004\b9\u0010:J*\u0010>\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010<H\u0096@¢\u0006\u0004\b>\u0010?J \u0010B\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0096@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bE\u0010FJ(\u0010J\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0013H\u0096@¢\u0006\u0004\bJ\u0010KJD\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u00132\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010N\u001a\u0004\u0018\u00010\b2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010P\u001a\u00020\bH\u0096@¢\u0006\u0004\bJ\u0010QJ\u0018\u0010T\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0096@¢\u0006\u0004\bT\u0010UJ\u001a\u0010W\u001a\u00020\u000e2\b\u0010S\u001a\u0004\u0018\u00010VH\u0096@¢\u0006\u0004\bW\u0010XJ\u001a\u0010Y\u001a\u00020\u000e2\b\u0010S\u001a\u0004\u0018\u00010VH\u0096@¢\u0006\u0004\bY\u0010XJ\u0010\u0010Z\u001a\u00020\u000eH\u0096@¢\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0096@¢\u0006\u0004\b\\\u0010\u0010J\u0018\u0010^\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\bH\u0096@¢\u0006\u0004\b^\u0010\u0010J\u001a\u0010a\u001a\u00020`2\b\u0010_\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\ba\u0010\u0010J\"\u0010d\u001a\u00020c2\u0006\u0010_\u001a\u00020\b2\b\u0010]\u001a\u0004\u0018\u00010bH\u0096@¢\u0006\u0004\bd\u0010eJ\u001e\u0010h\u001a\u00020\u000e2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0\u0007H\u0096@¢\u0006\u0004\bh\u0010\fJ\u0017\u0010j\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u000eH\u0016¢\u0006\u0004\bl\u0010mJ\u001f\u0010r\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ)\u0010v\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010u\u001a\u00020t2\b\u0010q\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0004\bv\u0010wJ\u001f\u0010y\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010x\u001a\u00020\bH\u0016¢\u0006\u0004\by\u0010zJ'\u0010}\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010|\u001a\u00020{2\u0006\u0010A\u001a\u00020\bH\u0016¢\u0006\u0004\b}\u0010~J\u001c\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010&\u001a\u00020\u007fH\u0096@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010&\u001a\u00030\u0083\u0001H\u0096@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b\u0088\u0001\u0010\u0010J\u001b\u0010\u0089\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b\u0089\u0001\u0010\u0010J\u001e\u0010\u008b\u0001\u001a\u00030\u008c\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0096@¢\u0006\u0006\b\u008b\u0001\u0010\u008d\u0001J\u001e\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0096@¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0096\u0001\u001a\u00030\u0095\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0096@¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0087\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b\u0099\u0001\u0010\u0010J\u001e\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\u0010\u0094\u0001\u001a\u00030\u009a\u0001H\u0096@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001e\u0010¡\u0001\u001a\u00030 \u00012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0096@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001c\u0010¥\u0001\u001a\u00030¤\u00012\u0007\u0010£\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b¥\u0001\u0010\u0010J2\u0010«\u0001\u001a\u00030ª\u00012\b\u0010§\u0001\u001a\u00030¦\u00012\u0007\u0010¨\u0001\u001a\u00020{2\t\u0010©\u0001\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010¯\u0001\u001a\u00030®\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b¯\u0001\u0010\u0010J\u001c\u0010°\u0001\u001a\u00030®\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b°\u0001\u0010\u0010J#\u0010±\u0001\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\b2\u0007\u0010\u00ad\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b±\u0001\u0010CJ#\u0010²\u0001\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\b2\u0007\u0010\u00ad\u0001\u001a\u00020\bH\u0096@¢\u0006\u0005\b²\u0001\u0010CJR\u0010¹\u0001\u001a\u00030¸\u00012\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\b2\t\u0010³\u0001\u001a\u0004\u0018\u00010\b2\u001d\u0010¶\u0001\u001a\u0018\u0012\u0004\u0012\u00020\b\u0018\u00010´\u0001j\u000b\u0012\u0004\u0012\u00020\b\u0018\u0001`µ\u00012\u0007\u0010·\u0001\u001a\u00020{H\u0096@¢\u0006\u0006\b¹\u0001\u0010º\u0001J&\u0010¼\u0001\u001a\u00030¸\u00012\u0007\u0010»\u0001\u001a\u00020\b2\u0007\u0010·\u0001\u001a\u00020{H\u0096@¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001d\u0010À\u0001\u001a\u00020\u000e2\b\u0010¿\u0001\u001a\u00030¾\u0001H\u0096@¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001d\u0010Â\u0001\u001a\u00020\u000e2\b\u0010¿\u0001\u001a\u00030¾\u0001H\u0096@¢\u0006\u0006\bÂ\u0001\u0010Á\u0001J0\u0010Ç\u0001\u001a\u00030Æ\u00012\u0007\u0010Ã\u0001\u001a\u00020\b2\u0007\u0010·\u0001\u001a\u00020{2\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0096@¢\u0006\u0006\bÇ\u0001\u0010È\u0001J<\u0010Î\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010É\u00012\b\u0010Ë\u0001\u001a\u00030Ê\u00012\u0006\u0010&\u001a\u00020%2\u000e\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Ì\u0001H\u0082@¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J:\u0010Ô\u0001\u001a\u00020\u000e2\t\u0010Ð\u0001\u001a\u0004\u0018\u00010n2\u0007\u0010Ñ\u0001\u001a\u00020\b2\u0012\b\u0002\u0010Ó\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010Ò\u0001H\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J$\u0010Ö\u0001\u001a\u00020\u000e2\b\u0010Ë\u0001\u001a\u00030Ê\u00012\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001R\u001d\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0019\u0010Û\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R \u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R \u0010ß\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130Ò\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Þ\u0001R\u001b\u0010Ð\u0001\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010à\u0001R%\u0010ã\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030â\u00010á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R!\u0010ê\u0001\u001a\u00030å\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R\u001e\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020\"0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0019\u0010í\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010Ü\u0001R\u0019\u0010î\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010Ü\u0001R\u0017\u0010ï\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001¨\u0006ó\u0001"}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/JSONRpcSignal;", "Llive/hms/video/signal/ISignal;", "Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;", "Llive/hms/video/signal/ISignalEventsObserver;", "observer", "<init>", "(Llive/hms/video/signal/ISignalEventsObserver;)V", "", "", "tags", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "setMetadataListener", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "uri", "Ll83/a0;", ProfileAnalyticsKt.OPEN, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "name", "data", "", "serverSideSubscribeDegradation", "Llive/hms/video/connection/models/HMSSessionDescription;", "offer", "Llive/hms/video/sdk/models/IRetryAttemptTracking;", "retryAttemptTracking", "simulcastEnabled", "join", "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "tracks", "nodeInfo", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "answer", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V", "Llive/hms/video/connection/models/HMSTrickle;", "trickle", "(Llive/hms/video/connection/models/HMSTrickle;)V", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "params", "Llive/hms/video/sdk/models/HMSMessageSendResponse;", "sendMessage", "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;", "trackUpdate", "(Ljava/util/List;)V", "notifyServer", "leave", "(Z)V", "Llive/hms/video/sdk/models/role/HMSRole;", "ofRoles", "toRole", "force", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "bulkRoleChangeRequest", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "forPeerId", "role", "roleChangeRequest", "(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "token", "Llive/hms/video/sdk/models/HMSPeer;", "requestedBy", "roleChangeAccept", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;", "peerId", "reason", "removePeer", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "lock", "endRoom", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrack;", "hmsTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrackType;", "type", "source", "roles", "requestedByPeerId", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "config", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;", "stopHLSStreaming", "stopRtmpAndRecording", "(Lq83/d;)Ljava/lang/Object;", "changeName", "metadata", "changeMetadata", "key", "Llive/hms/video/sessionstore/SessionMetadataResult;", "getSessionMetadata", "Lcom/google/gson/JsonElement;", "Llive/hms/video/sessionstore/SetSessionMetadataResult;", "changeSessionMetadata", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metadataModelList", "setHlsSessionMetadata", "Llive/hms/video/events/AnalyticsEvent;", NotificationCompat.CATEGORY_EVENT, "(Llive/hms/video/events/AnalyticsEvent;)V", "close", "()V", "Lud3/e1;", "webSocket", "Lud3/x0;", "response", "onOpen", "(Lud3/e1;Lud3/x0;)V", "", "t", "onFailure", "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V", "text", "onMessage", "(Lud3/e1;Ljava/lang/String;)V", "", "code", "onClosed", "(Lud3/e1;ILjava/lang/String;)V", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/polls/network/PollCreateResponse;", "createPoll", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/polls/network/SetQuestionsResponse;", "createQuestion", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;", "pollId", "pollStart", "pollStop", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "pollQuestionsGet", "Llive/hms/video/polls/network/PollQuestionGetResponse;", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/HMSPollResponseBuilder;", "hmsPollResponseBuilder", "Llive/hms/video/polls/models/answer/PollAnswerResponse;", "pollAddResponse", "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "param", "Llive/hms/video/polls/network/PollGetResponsesReply;", "pollGetResponses", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/network/PollResultsResponse;", "pollGetResults", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "pollGetLeaderboard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "options", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "createWhiteBoard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;", "id", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "getWhiteBoard", "Llive/hms/video/polls/models/HmsPollState;", "state", "count", "start", "Llive/hms/video/polls/network/PollListResponse;", "pollGetList", "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "groupName", "Llive/hms/video/groups/GroupJoinLeaveResponse;", "groupJoin", "groupLeave", "groupAdd", "groupRemove", "roleName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "peerIds", MapboxMap.QFE_LIMIT, "Llive/hms/video/sdk/models/FindPeerResponse;", "findPeer", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;", "iteratorId", "peerIteratorNext", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;", "stopRealTimeTranscription", "query", "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/models/PeerNameSearchResponse;", "peerNameSearch", "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;", "T", "Llive/hms/video/signal/HMSSignalMethod;", "method", "Ljava/lang/Class;", "c", NotificationCompat.CATEGORY_CALL, "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;", "socket", "message", "Lbc3/s;", "deferred", "sendSocketMessage", "(Lud3/e1;Ljava/lang/String;Lbc3/s;)V", "notify", "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V", "Llive/hms/video/signal/ISignalEventsObserver;", "getObserver", "()Llive/hms/video/signal/ISignalEventsObserver;", "_isConnected", "Z", "webSocketOpenDeferred", "Lbc3/s;", "onRoleChangeDeferred", "Lud3/e1;", "Ljava/util/HashMap;", "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;", "callbacks", "Ljava/util/HashMap;", "Lmc3/a;", "mutex$delegate", "Ll83/h;", "getMutex", "()Lmc3/a;", "mutex", "pendingTrickle", "Ljava/util/ArrayList;", "isJoinCompleted", "isLeaveInProgress", "isConnected", "()Z", "Companion", "Callback", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class JSONRpcSignal extends HMSWebSocketListener implements ISignal {
    public static final String TAG = "JsonRPCSignal";
    private boolean _isConnected;
    private final HashMap<String, Callback> callbacks;
    private boolean isJoinCompleted;
    private boolean isLeaveInProgress;

    /* JADX INFO: renamed from: mutex$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h mutex;
    private final ISignalEventsObserver observer;
    private InterfaceC3055s onRoleChangeDeferred;
    private final ArrayList<HMSTrickle> pendingTrickle;
    private InterfaceC34811e1 socket;
    private InterfaceC3055s webSocketOpenDeferred;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, m65681d2 = {"Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;", "", "Lbc3/s;", "", "deferred", "message", "Llive/hms/video/signal/HMSSignalMethod;", "method", "<init>", "(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)V", "component1", "()Lbc3/s;", "component2", "()Ljava/lang/String;", "component3", "()Llive/hms/video/signal/HMSSignalMethod;", "copy", "(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbc3/s;", "getDeferred", "Ljava/lang/String;", "getMessage", "Llive/hms/video/signal/HMSSignalMethod;", "getMethod", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Callback {
        private final InterfaceC3055s deferred;
        private final String message;
        private final HMSSignalMethod method;

        public Callback(InterfaceC3055s deferred, String message, HMSSignalMethod method) {
            AbstractC22676k.m65750j(deferred, "deferred");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(method, "method");
            this.deferred = deferred;
            this.message = message;
            this.method = method;
        }

        public static /* synthetic */ Callback copy$default(Callback callback, InterfaceC3055s interfaceC3055s, String str, HMSSignalMethod hMSSignalMethod, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                interfaceC3055s = callback.deferred;
            }
            if ((i13 & 2) != 0) {
                str = callback.message;
            }
            if ((i13 & 4) != 0) {
                hMSSignalMethod = callback.method;
            }
            return callback.copy(interfaceC3055s, str, hMSSignalMethod);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final InterfaceC3055s getDeferred() {
            return this.deferred;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final HMSSignalMethod getMethod() {
            return this.method;
        }

        public final Callback copy(InterfaceC3055s deferred, String message, HMSSignalMethod method) {
            AbstractC22676k.m65750j(deferred, "deferred");
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(method, "method");
            return new Callback(deferred, message, method);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Callback)) {
                return false;
            }
            Callback callback = (Callback) other;
            return AbstractC22676k.m65745e(this.deferred, callback.deferred) && AbstractC22676k.m65745e(this.message, callback.message) && this.method == callback.method;
        }

        public final InterfaceC3055s getDeferred() {
            return this.deferred;
        }

        public final String getMessage() {
            return this.message;
        }

        public final HMSSignalMethod getMethod() {
            return this.method;
        }

        public int hashCode() {
            return this.method.hashCode() + AbstractC11266d.m30450d(this.deferred.hashCode() * 31, 31, this.message);
        }

        public String toString() {
            return "Callback(deferred=" + this.deferred + ", message=" + this.message + ", method=" + this.method + ')';
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSSignalMethod.values().length];
            try {
                iArr[HMSSignalMethod.TRICKLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSSignalMethod.OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMSSignalMethod.SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$bulkRoleChangeRequest$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$bulkRoleChangeRequest$2", m100430f = "JSONRpcSignal.kt", m100431l = {DfuBaseService.NOTIFICATION_ID}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242882 extends AbstractC32275i implements Function1 {
        final /* synthetic */ boolean $force;
        final /* synthetic */ List<HMSRole> $ofRoles;
        final /* synthetic */ HMSRole $toRole;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242882(List<HMSRole> list, boolean z4, HMSRole hMSRole, InterfaceC30057d<? super C242882> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$ofRoles = list;
            this.$force = z4;
            this.$toRole = hMSRole;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242882(this.$ofRoles, this.$force, this.$toRole, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.ROLE_CHANGE_REQUEST;
            List<HMSRole> list = this.$ofRoles;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HMSRole) it.next()).getName());
            }
            HMSParams.BulkRoleChangeRequest bulkRoleChangeRequest = new HMSParams.BulkRoleChangeRequest(arrayList, this.$force, this.$toRole.getName());
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, bulkRoleChangeRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C242882) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$bulkRoleChangeRequest$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242893 extends C22672i implements InterfaceC4351m {
        public C242893(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$call$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {141}, m100432m = NotificationCompat.CATEGORY_CALL)
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242901<T> extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C242901(InterfaceC30057d<? super C242901> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.call(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeMetadata$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeMetadata$2", m100430f = "JSONRpcSignal.kt", m100431l = {364}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242912 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $metadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242912(String str, InterfaceC30057d<? super C242912> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$metadata = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242912(this.$metadata, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.PEER_UPDATE;
            HMSParams.PeerMetadataUpdate peerMetadataUpdate = new HMSParams.PeerMetadataUpdate(null, this.$metadata, null, 4, null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, peerMetadataUpdate, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C242912) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeMetadata$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242923 extends C22672i implements InterfaceC4351m {
        public C242923(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeName$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeName$2", m100430f = "JSONRpcSignal.kt", m100431l = {356}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242932 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242932(String str, InterfaceC30057d<? super C242932> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$name = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242932(this.$name, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.PEER_UPDATE;
            HMSParams.PeerMetadataUpdate peerMetadataUpdate = new HMSParams.PeerMetadataUpdate(this.$name, null, null, 4, null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, peerMetadataUpdate, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C242932) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeName$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242943 extends C22672i implements InterfaceC4351m {
        public C242943(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeSessionMetadata$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeSessionMetadata$2", m100430f = "JSONRpcSignal.kt", m100431l = {381}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sessionstore/SetSessionMetadataResult;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242952 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.SetSessionMetadata $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242952(HMSParams.SetSessionMetadata setSessionMetadata, InterfaceC30057d<? super C242952> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = setSessionMetadata;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242952(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.SET_METADATA;
            HMSParams.SetSessionMetadata setSessionMetadata = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, setSessionMetadata, SetSessionMetadataResult.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d) {
            return ((C242952) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeSessionMetadata$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242963 extends C22672i implements InterfaceC4351m {
        public C242963(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$2", m100430f = "JSONRpcSignal.kt", m100431l = {313}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242972 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSTrack $hmsTrack;
        final /* synthetic */ boolean $mute;
        final /* synthetic */ String $peerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242972(String str, HMSTrack hMSTrack, boolean z4, InterfaceC30057d<? super C242972> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$peerId = str;
            this.$hmsTrack = hMSTrack;
            this.$mute = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242972(this.$peerId, this.$hmsTrack, this.$mute, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.TRACK_UPDATE_REQUEST;
            HMSParams.TrackUpdateRequest trackUpdateRequest = new HMSParams.TrackUpdateRequest(this.$peerId, this.$hmsTrack.getTrackId(), this.$hmsTrack.getStream().getId(), this.$mute);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, trackUpdateRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C242972) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C242983 extends C22672i implements InterfaceC4351m {
        public C242983(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$5 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$5", m100430f = "JSONRpcSignal.kt", m100431l = {323}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242995 extends AbstractC32275i implements Function1 {
        final /* synthetic */ boolean $mute;
        final /* synthetic */ List<String> $roles;
        final /* synthetic */ String $source;
        final /* synthetic */ HMSTrackType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242995(List<String> list, HMSTrackType hMSTrackType, String str, boolean z4, InterfaceC30057d<? super C242995> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$roles = list;
            this.$type = hMSTrackType;
            this.$source = str;
            this.$mute = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C242995(this.$roles, this.$type, this.$source, this.$mute, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.CHANGE_TRACK_MUTE_STATE_REQUEST;
            HMSParams.TrackUpdateAllRequest trackUpdateAllRequest = new HMSParams.TrackUpdateAllRequest(null, this.$roles, this.$type, this.$source, this.$mute);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, trackUpdateAllRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C242995) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243006 extends C22672i implements InterfaceC4351m {
        public C243006(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$createPoll$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$createPoll$2", m100430f = "JSONRpcSignal.kt", m100431l = {592}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/network/PollCreateResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243012 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.SetPollParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243012(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super C243012> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = setPollParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243012(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_INFO_SET;
            HMSParams.SetPollParams setPollParams = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, setPollParams, PollCreateResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PollCreateResponse> interfaceC30057d) {
            return ((C243012) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$createPoll$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243023 extends C22672i implements InterfaceC4351m {
        public C243023(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$createQuestion$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {602}, m100432m = "createQuestion")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243031 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243031(InterfaceC30057d<? super C243031> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.createQuestion(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$createWhiteBoard$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243042 extends C22672i implements InterfaceC4351m {
        public C243042(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$createWhiteBoard$3 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$createWhiteBoard$3", m100430f = "JSONRpcSignal.kt", m100431l = {691}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243053 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.Options $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243053(HMSParams.Options options, InterfaceC30057d<? super C243053> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$options = options;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243053(this.$options, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.WHITEBOARD_CREATE;
            HMSParams.Options options = this.$options;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, options, HMSCreateWhiteBoardResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d) {
            return ((C243053) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$endRoom$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {307}, m100432m = "endRoom")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243061 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243061(InterfaceC30057d<? super C243061> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.endRoom(null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$endRoom$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$endRoom$2", m100430f = "JSONRpcSignal.kt", m100431l = {307}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243072 extends AbstractC32275i implements Function1 {
        final /* synthetic */ boolean $lock;
        final /* synthetic */ String $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243072(boolean z4, String str, InterfaceC30057d<? super C243072> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$lock = z4;
            this.$reason = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243072(this.$lock, this.$reason, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.END_ROOM;
            HMSParams.EndRoomRequest endRoomRequest = new HMSParams.EndRoomRequest(this.$lock, this.$reason);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, endRoomRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C243072) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$endRoom$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243083 extends C22672i implements InterfaceC4351m {
        public C243083(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$findPeer$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$findPeer$2", m100430f = "JSONRpcSignal.kt", m100431l = {780}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/FindPeerResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243092 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.FindPeer $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243092(HMSParams.FindPeer findPeer, InterfaceC30057d<? super C243092> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = findPeer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243092(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.FIND_PEER;
            HMSParams.FindPeer findPeer = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, findPeer, FindPeerResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
            return ((C243092) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$findPeer$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243103 extends C22672i implements InterfaceC4351m {
        public C243103(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$getSessionMetadata$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$getSessionMetadata$2", m100430f = "JSONRpcSignal.kt", m100431l = {372}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sessionstore/SessionMetadataResult;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243112 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243112(String str, InterfaceC30057d<? super C243112> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$key = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243112(this.$key, interfaceC30057d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.GET_METADATA;
            HMSParams.SessionMetadataRequest sessionMetadataRequest = new HMSParams.SessionMetadataRequest(this.$key, null, 2, 0 == true ? 1 : 0);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, sessionMetadataRequest, SessionMetadataResult.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d) {
            return ((C243112) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$getSessionMetadata$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243123 extends C22672i implements InterfaceC4351m {
        public C243123(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$getWhiteBoard$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$getWhiteBoard$2", m100430f = "JSONRpcSignal.kt", m100431l = {705}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243132 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243132(String str, InterfaceC30057d<? super C243132> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$id = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243132(this.$id, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.WHITEBOARD_GET;
            HMSParams.HMSWhiteBoardGetOption hMSWhiteBoardGetOption = new HMSParams.HMSWhiteBoardGetOption(this.$id);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, hMSWhiteBoardGetOption, HMSGetWhiteBoardResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d) {
            return ((C243132) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$getWhiteBoard$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243143 extends C22672i implements InterfaceC4351m {
        public C243143(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupAdd$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$groupAdd$2", m100430f = "JSONRpcSignal.kt", m100431l = {753}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243152 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.GroupAdd $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243152(HMSParams.GroupAdd groupAdd, InterfaceC30057d<? super C243152> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = groupAdd;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243152(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
                HMSSignalMethod hMSSignalMethod = HMSSignalMethod.GROUP_ADD;
                HMSParams.GroupAdd groupAdd = this.$param;
                this.label = 1;
                if (jSONRpcSignal.call(hMSSignalMethod, groupAdd, JsonObject.class, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243152) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupAdd$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243163 extends C22672i implements InterfaceC4351m {
        public C243163(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupJoin$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$groupJoin$2", m100430f = "JSONRpcSignal.kt", m100431l = {731}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/groups/GroupJoinLeaveResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243172 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.GroupJoin $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243172(HMSParams.GroupJoin groupJoin, InterfaceC30057d<? super C243172> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = groupJoin;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243172(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.GROUP_JOIN;
            HMSParams.GroupJoin groupJoin = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, groupJoin, GroupJoinLeaveResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
            return ((C243172) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupJoin$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243183 extends C22672i implements InterfaceC4351m {
        public C243183(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupLeave$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$groupLeave$2", m100430f = "JSONRpcSignal.kt", m100431l = {742}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/groups/GroupJoinLeaveResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243192 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.GroupLeave $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243192(HMSParams.GroupLeave groupLeave, InterfaceC30057d<? super C243192> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = groupLeave;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243192(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.GROUP_LEAVE;
            HMSParams.GroupLeave groupLeave = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, groupLeave, GroupJoinLeaveResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
            return ((C243192) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupLeave$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243203 extends C22672i implements InterfaceC4351m {
        public C243203(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupRemove$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$groupRemove$2", m100430f = "JSONRpcSignal.kt", m100431l = {764}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243212 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.GroupRemove $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243212(HMSParams.GroupRemove groupRemove, InterfaceC30057d<? super C243212> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = groupRemove;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243212(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
                HMSSignalMethod hMSSignalMethod = HMSSignalMethod.GROUP_REMOVE;
                HMSParams.GroupRemove groupRemove = this.$param;
                this.label = 1;
                if (jSONRpcSignal.call(hMSSignalMethod, groupRemove, JsonObject.class, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243212) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$groupRemove$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243223 extends C22672i implements InterfaceC4351m {
        public C243223(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$join$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {211}, m100432m = "join")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243231 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C243231(InterfaceC30057d<? super C243231> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.join(null, null, false, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$offer$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$offer$2", m100430f = "JSONRpcSignal.kt", m100431l = {238}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/connection/models/HMSSessionDescription;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243242 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.SendOffer $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243242(HMSParams.SendOffer sendOffer, InterfaceC30057d<? super C243242> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = sendOffer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243242(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.OFFER;
            HMSParams.SendOffer sendOffer = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, sendOffer, HMSSessionDescription.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d) {
            return ((C243242) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$offer$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243253 extends C22672i implements InterfaceC4351m {
        public C243253(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$1", m100430f = "JSONRpcSignal.kt", m100431l = {509}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243261 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ JsonObject $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243261(JsonObject jsonObject, InterfaceC30057d<? super C243261> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$response = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243261(this.$response, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243261) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ISignalEventsObserver observer = JSONRpcSignal.this.getObserver();
                JsonObject jsonObject = this.$response;
                AbstractC22676k.m65747g(jsonObject);
                this.label = 1;
                if (observer.onNotification(jsonObject, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$2", m100430f = "JSONRpcSignal.kt", m100431l = {840, 536}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243272 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $method;
        final /* synthetic */ JsonObject $response;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243272(String str, JsonObject jsonObject, InterfaceC30057d<? super C243272> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$method = str;
            this.$response = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243272(this.$method, this.$response, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243272) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a mutex;
            String str;
            JsonObject jsonObject;
            JSONRpcSignal jSONRpcSignal;
            InterfaceC25435a interfaceC25435a;
            Throwable th3;
            String str2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    mutex = JSONRpcSignal.this.getMutex();
                    str = this.$method;
                    JSONRpcSignal jSONRpcSignal2 = JSONRpcSignal.this;
                    jsonObject = this.$response;
                    this.L$0 = mutex;
                    this.L$1 = str;
                    this.L$2 = jSONRpcSignal2;
                    this.L$3 = jsonObject;
                    this.label = 1;
                    if (mutex.mo68211b(this) != enumC31071a) {
                        jSONRpcSignal = jSONRpcSignal2;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$1;
                    interfaceC25435a = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        HMSLogger.m71136d("SFUMIGRATION", str2 + " Handling done. Unlocking ");
                        interfaceC25435a.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a.mo68214i(null);
                        throw th3;
                    }
                }
                JsonObject jsonObject2 = (JsonObject) this.L$3;
                jSONRpcSignal = (JSONRpcSignal) this.L$2;
                String str3 = (String) this.L$1;
                InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                mutex = interfaceC25435a2;
                jsonObject = jsonObject2;
                str = str3;
                HMSLogger.m71136d("SFUMIGRATION", str + " received. Taking lock");
                ISignalEventsObserver observer = jSONRpcSignal.getObserver();
                AbstractC22676k.m65747g(jsonObject);
                this.L$0 = mutex;
                this.L$1 = str;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (observer.onNotification(jsonObject, this) != enumC31071a) {
                    str2 = str;
                    interfaceC25435a = mutex;
                    HMSLogger.m71136d("SFUMIGRATION", str2 + " Handling done. Unlocking ");
                    interfaceC25435a.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                interfaceC25435a = mutex;
                th3 = th5;
                interfaceC25435a.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$3 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$3", m100430f = "JSONRpcSignal.kt", m100431l = {543}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243283 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ JsonObject $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243283(JsonObject jsonObject, InterfaceC30057d<? super C243283> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$response = jsonObject;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243283(this.$response, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243283) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ISignalEventsObserver observer = JSONRpcSignal.this.getObserver();
                JsonObject jsonObject = this.$response;
                AbstractC22676k.m65747g(jsonObject);
                this.label = 1;
                if (observer.onNotification(jsonObject, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$4 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$4", m100430f = "JSONRpcSignal.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243294 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243294(HMSParams hMSParams, InterfaceC30057d<? super C243294> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$params = hMSParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243294(this.$params, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243294) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ISignalEventsObserver observer = JSONRpcSignal.this.getObserver();
            HMSParams hMSParams = this.$params;
            AbstractC22676k.m65748h(hMSParams, "null cannot be cast to non-null type live.hms.video.signal.jsonrpc.models.HMSParams.Trickle");
            observer.onTrickle(((HMSParams.Trickle) hMSParams).toTrickle());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$5 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$5", m100430f = "JSONRpcSignal.kt", m100431l = {840, 563}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243305 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSParams $params;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243305(HMSParams hMSParams, InterfaceC30057d<? super C243305> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$params = hMSParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243305(this.$params, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243305) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a mutex;
            JSONRpcSignal jSONRpcSignal;
            HMSParams hMSParams;
            InterfaceC25435a interfaceC25435a;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    mutex = JSONRpcSignal.this.getMutex();
                    JSONRpcSignal jSONRpcSignal2 = JSONRpcSignal.this;
                    HMSParams hMSParams2 = this.$params;
                    this.L$0 = mutex;
                    this.L$1 = jSONRpcSignal2;
                    this.L$2 = hMSParams2;
                    this.label = 1;
                    if (mutex.mo68211b(this) != enumC31071a) {
                        jSONRpcSignal = jSONRpcSignal2;
                        hMSParams = hMSParams2;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a.mo68214i(null);
                        throw th3;
                    }
                }
                hMSParams = (HMSParams) this.L$2;
                jSONRpcSignal = (JSONRpcSignal) this.L$1;
                InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                mutex = interfaceC25435a2;
                ISignalEventsObserver observer = jSONRpcSignal.getObserver();
                AbstractC22676k.m65748h(hMSParams, "null cannot be cast to non-null type live.hms.video.signal.jsonrpc.models.HMSParams.Offer");
                HMSSessionDescription sdp = ((HMSParams.Offer) hMSParams).toSDP();
                this.L$0 = mutex;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (observer.onOffer(sdp, this) != enumC31071a) {
                    interfaceC25435a = mutex;
                    interfaceC25435a.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                interfaceC25435a = mutex;
                th3 = th5;
                interfaceC25435a.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$6 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$6", m100430f = "JSONRpcSignal.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243316 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSSignalMethod $method;
        final /* synthetic */ HMSParams $params;
        int label;
        final /* synthetic */ JSONRpcSignal this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243316(HMSParams hMSParams, JSONRpcSignal jSONRpcSignal, HMSSignalMethod hMSSignalMethod, InterfaceC30057d<? super C243316> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$params = hMSParams;
            this.this$0 = jSONRpcSignal;
            this.$method = hMSSignalMethod;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C243316(this.$params, this.this$0, this.$method, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243316) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HMSParams hMSParams = this.$params;
            AbstractC22676k.m65748h(hMSParams, "null cannot be cast to non-null type live.hms.video.signal.jsonrpc.models.HMSParams.OnError");
            this.this$0.getObserver().onServerError(ErrorFactory.WebsocketMethodErrors.ServerErrors$default(ErrorFactory.WebsocketMethodErrors.INSTANCE, ((HMSParams.OnError) this.$params).getCode(), this.$method.toErrorAction(), ((HMSParams.OnError) this.$params).getMessage(), null, null, 24, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$open$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {191}, m100432m = ProfileAnalyticsKt.OPEN)
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243321 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C243321(InterfaceC30057d<? super C243321> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.open(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$peerIteratorNext$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$peerIteratorNext$2", m100430f = "JSONRpcSignal.kt", m100431l = {791}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/FindPeerResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243332 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PeerIteratorNext $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243332(HMSParams.PeerIteratorNext peerIteratorNext, InterfaceC30057d<? super C243332> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = peerIteratorNext;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243332(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.PEER_ITER_NEXT;
            HMSParams.PeerIteratorNext peerIteratorNext = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, peerIteratorNext, FindPeerResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
            return ((C243332) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$peerIteratorNext$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243343 extends C22672i implements InterfaceC4351m {
        public C243343(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$peerNameSearch$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$peerNameSearch$2", m100430f = "JSONRpcSignal.kt", m100431l = {824}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/PeerNameSearchResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243352 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PeerNameSearch $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243352(HMSParams.PeerNameSearch peerNameSearch, InterfaceC30057d<? super C243352> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = peerNameSearch;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243352(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.PEER_NAME_SEARCH;
            HMSParams.PeerNameSearch peerNameSearch = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, peerNameSearch, PeerNameSearchResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PeerNameSearchResponse> interfaceC30057d) {
            return ((C243352) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$peerNameSearch$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243363 extends C22672i implements InterfaceC4351m {
        public C243363(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollAddResponse$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollAddResponse$2", m100430f = "JSONRpcSignal.kt", m100431l = {652}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/models/answer/PollAnswerResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243372 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PollResponseSet $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243372(HMSParams.PollResponseSet pollResponseSet, InterfaceC30057d<? super C243372> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = pollResponseSet;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243372(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_RESPONSE;
            HMSParams.PollResponseSet pollResponseSet = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, pollResponseSet, PollAnswerResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PollAnswerResponse> interfaceC30057d) {
            return ((C243372) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollAddResponse$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243383 extends C22672i implements InterfaceC4351m {
        public C243383(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetLeaderboard$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {680}, m100432m = "pollGetLeaderboard")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243391 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243391(InterfaceC30057d<? super C243391> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.pollGetLeaderboard(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetList$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetList$2", m100430f = "JSONRpcSignal.kt", m100431l = {720}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/network/PollListResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243402 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PollListQuery $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243402(HMSParams.PollListQuery pollListQuery, InterfaceC30057d<? super C243402> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = pollListQuery;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243402(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_LIST;
            HMSParams.PollListQuery pollListQuery = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, pollListQuery, PollListResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PollListResponse> interfaceC30057d) {
            return ((C243402) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetList$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243413 extends C22672i implements InterfaceC4351m {
        public C243413(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResponses$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {660}, m100432m = "pollGetResponses")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243421 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243421(InterfaceC30057d<? super C243421> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.pollGetResponses(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResponses$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResponses$2", m100430f = "JSONRpcSignal.kt", m100431l = {661}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243432 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PollResponsesQuery $param;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243432(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super C243432> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$param = pollResponsesQuery;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243432(this.$param, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_RESPONSES;
            HMSParams.PollResponsesQuery pollResponsesQuery = this.$param;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, pollResponsesQuery, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C243432) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResponses$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243443 extends C22672i implements InterfaceC4351m {
        public C243443(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResults$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResults$2", m100430f = "JSONRpcSignal.kt", m100431l = {674}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/network/PollResultsResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243452 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $pollId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243452(String str, InterfaceC30057d<? super C243452> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$pollId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243452(this.$pollId, interfaceC30057d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_RESULT;
            HMSParams.PollResultsQuery pollResultsQuery = new HMSParams.PollResultsQuery(this.$pollId, null, 2, 0 == true ? 1 : 0);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, pollResultsQuery, PollResultsResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PollResultsResponse> interfaceC30057d) {
            return ((C243452) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollGetResults$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243463 extends C22672i implements InterfaceC4351m {
        public C243463(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollQuestionsGet$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollQuestionsGet$2", m100430f = "JSONRpcSignal.kt", m100431l = {635}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/polls/network/PollQuestionGetResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243472 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.PollQuestionsGet $pollQuestionsGet;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243472(HMSParams.PollQuestionsGet pollQuestionsGet, InterfaceC30057d<? super C243472> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$pollQuestionsGet = pollQuestionsGet;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243472(this.$pollQuestionsGet, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_QUESTIONS_GET;
            HMSParams.PollQuestionsGet pollQuestionsGet = this.$pollQuestionsGet;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, pollQuestionsGet, PollQuestionGetResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PollQuestionGetResponse> interfaceC30057d) {
            return ((C243472) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollQuestionsGet$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243483 extends C22672i implements InterfaceC4351m {
        public C243483(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollStart$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {613}, m100432m = "pollStart")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243491 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243491(InterfaceC30057d<? super C243491> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.pollStart(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollStop$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$pollStop$2", m100430f = "JSONRpcSignal.kt", m100431l = {626}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C243502 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $pollId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243502(String str, InterfaceC30057d<? super C243502> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$pollId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243502(this.$pollId, interfaceC30057d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
                HMSSignalMethod hMSSignalMethod = HMSSignalMethod.POLL_STOP;
                HMSParams.PollStopRequest pollStopRequest = new HMSParams.PollStopRequest(this.$pollId, null, 2, 0 == true ? 1 : 0);
                this.label = 1;
                if (jSONRpcSignal.call(hMSSignalMethod, pollStopRequest, JsonObject.class, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C243502) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$pollStop$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243513 extends C22672i implements InterfaceC4351m {
        public C243513(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$removePeer$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$removePeer$2", m100430f = "JSONRpcSignal.kt", m100431l = {302}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243522 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $peerId;
        final /* synthetic */ String $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243522(String str, String str2, InterfaceC30057d<? super C243522> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$peerId = str;
            this.$reason = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243522(this.$peerId, this.$reason, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.PEER_LEAVE_REQUEST;
            HMSParams.RemovePeerRequest removePeerRequest = new HMSParams.RemovePeerRequest(this.$peerId, this.$reason);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, removePeerRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C243522) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$removePeer$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243533 extends C22672i implements InterfaceC4351m {
        public C243533(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeAccept$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeAccept$2", m100430f = "JSONRpcSignal.kt", m100431l = {297}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243542 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSPeer $requestedBy;
        final /* synthetic */ String $role;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243542(String str, String str2, HMSPeer hMSPeer, InterfaceC30057d<? super C243542> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$token = str;
            this.$role = str2;
            this.$requestedBy = hMSPeer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243542(this.$token, this.$role, this.$requestedBy, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.ROLE_CHANGE;
            String str = this.$token;
            String str2 = this.$role;
            HMSPeer hMSPeer = this.$requestedBy;
            HMSParams.RoleChangeAccept roleChangeAccept = new HMSParams.RoleChangeAccept(str, str2, hMSPeer != null ? hMSPeer.getPeerID() : null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, roleChangeAccept, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C243542) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeAccept$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243553 extends C22672i implements InterfaceC4351m {
        public C243553(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeRequest$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeRequest$2", m100430f = "JSONRpcSignal.kt", m100431l = {291}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/google/gson/JsonObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243562 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $forPeerId;
        final /* synthetic */ boolean $force;
        final /* synthetic */ String $role;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243562(String str, boolean z4, String str2, InterfaceC30057d<? super C243562> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$forPeerId = str;
            this.$force = z4;
            this.$role = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243562(this.$forPeerId, this.$force, this.$role, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.ROLE_CHANGE_REQUEST;
            HMSParams.RoleChangeRequest roleChangeRequest = new HMSParams.RoleChangeRequest(this.$forPeerId, this.$force, this.$role);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, roleChangeRequest, JsonObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JsonObject> interfaceC30057d) {
            return ((C243562) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeRequest$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243573 extends C22672i implements InterfaceC4351m {
        public C243573(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$sendMessage$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$sendMessage$2", m100430f = "JSONRpcSignal.kt", m100431l = {255}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/HMSMessageSendResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243582 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243582(HMSParams hMSParams, InterfaceC30057d<? super C243582> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = hMSParams;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243582(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.BROADCAST;
            HMSParams hMSParams = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, hMSParams, HMSMessageSendResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HMSMessageSendResponse> interfaceC30057d) {
            return ((C243582) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$sendMessage$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243593 extends C22672i implements InterfaceC4351m {
        public C243593(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$setHlsSessionMetadata$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$setHlsSessionMetadata$2", m100430f = "JSONRpcSignal.kt", m100431l = {391}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243602 extends AbstractC32275i implements Function1 {
        final /* synthetic */ List<HMSHLSTimedMetadata> $metadataModelList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243602(List<HMSHLSTimedMetadata> list, InterfaceC30057d<? super C243602> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$metadataModelList = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243602(this.$metadataModelList, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.HLS_TIMED_METADATA;
            HMSParams.SetHLSSessionMetadata setHLSSessionMetadata = new HMSParams.SetHLSSessionMetadata(this.$metadataModelList, AbstractC11895b.m31995n("toString(...)"), null, 4, null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, setHLSSessionMetadata, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C243602) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$setHlsSessionMetadata$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243613 extends C22672i implements InterfaceC4351m {
        public C243613(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$setMetadataListener$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$setMetadataListener$2", m100430f = "JSONRpcSignal.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sessionstore/SetMetadataListenerResult;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243622 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.ListenMetadataChangeRequest $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243622(HMSParams.ListenMetadataChangeRequest listenMetadataChangeRequest, InterfaceC30057d<? super C243622> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = listenMetadataChangeRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243622(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.LISTEN_METADATA_CHANGE;
            HMSParams.ListenMetadataChangeRequest listenMetadataChangeRequest = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, listenMetadataChangeRequest, SetMetadataListenerResult.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d) {
            return ((C243622) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$setMetadataListener$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243633 extends C22672i implements InterfaceC4351m {
        public C243633(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startHLSStreaming$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$startHLSStreaming$2", m100430f = "JSONRpcSignal.kt", m100431l = {337}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243642 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSHLSConfig $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243642(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C243642> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$config = hMSHLSConfig;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243642(this.$config, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.HLS_START;
            HMSHLSConfig hMSHLSConfig = this.$config;
            List<HMSHLSMeetingURLVariant> meetingURLVariants = hMSHLSConfig != null ? hMSHLSConfig.getMeetingURLVariants() : null;
            HMSHLSConfig hMSHLSConfig2 = this.$config;
            HMSParams.HLSStart hLSStart = new HMSParams.HLSStart(meetingURLVariants, hMSHLSConfig2 != null ? hMSHLSConfig2.getHmsHlsRecordingConfig() : null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, hLSStart, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C243642) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startHLSStreaming$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243653 extends C22672i implements InterfaceC4351m {
        public C243653(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startRealTimeTranscription$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$startRealTimeTranscription$2", m100430f = "JSONRpcSignal.kt", m100431l = {802}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/TranscriptionStartResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243662 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.StartTranscription $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243662(HMSParams.StartTranscription startTranscription, InterfaceC30057d<? super C243662> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = startTranscription;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243662(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.TRANSCRIPTION_START;
            HMSParams.StartTranscription startTranscription = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, startTranscription, TranscriptionStartResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TranscriptionStartResponse> interfaceC30057d) {
            return ((C243662) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startRealTimeTranscription$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243673 extends C22672i implements InterfaceC4351m {
        public C243673(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startRtmpOrRecording$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$startRtmpOrRecording$2", m100430f = "JSONRpcSignal.kt", m100431l = {330}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243682 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSRecordingConfig $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243682(HMSRecordingConfig hMSRecordingConfig, InterfaceC30057d<? super C243682> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$config = hMSRecordingConfig;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243682(this.$config, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.RTMP_START;
            HMSParams.RtmpStart rtmpStart = new HMSParams.RtmpStart(this.$config.getMeetingUrl(), this.$config.getRtmpUrls(), this.$config.getRecord(), this.$config.getResolution(), null, 16, null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, rtmpStart, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C243682) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$startRtmpOrRecording$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243693 extends C22672i implements InterfaceC4351m {
        public C243693(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$stopHLSStreaming$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$stopHLSStreaming$2", m100430f = "JSONRpcSignal.kt", m100431l = {343}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lorg/json/JSONObject;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243702 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSHLSConfig $config;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243702(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C243702> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$config = hMSHLSConfig;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243702(this.$config, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.HLS_STOP;
            HMSHLSConfig hMSHLSConfig = this.$config;
            HMSParams.HLSStop hLSStop = new HMSParams.HLSStop(hMSHLSConfig != null ? hMSHLSConfig.getMeetingURLVariants() : null);
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, hLSStop, JSONObject.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super JSONObject> interfaceC30057d) {
            return ((C243702) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$stopHLSStreaming$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243713 extends C22672i implements InterfaceC4351m {
        public C243713(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$stopRealTimeTranscription$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$stopRealTimeTranscription$2", m100430f = "JSONRpcSignal.kt", m100431l = {813}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Llive/hms/video/sdk/models/TranscriptionStopResponse;"}, m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243722 extends AbstractC32275i implements Function1 {
        final /* synthetic */ HMSParams.StopTranscription $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243722(HMSParams.StopTranscription stopTranscription, InterfaceC30057d<? super C243722> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$params = stopTranscription;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return JSONRpcSignal.this.new C243722(this.$params, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JSONRpcSignal jSONRpcSignal = JSONRpcSignal.this;
            HMSSignalMethod hMSSignalMethod = HMSSignalMethod.TRANSCRIPTION_STOP;
            HMSParams.StopTranscription stopTranscription = this.$params;
            this.label = 1;
            Object objCall = jSONRpcSignal.call(hMSSignalMethod, stopTranscription, TranscriptionStopResponse.class, this);
            return objCall == enumC31071a ? enumC31071a : objCall;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TranscriptionStopResponse> interfaceC30057d) {
            return ((C243722) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$stopRealTimeTranscription$3 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C243733 extends C22672i implements InterfaceC4351m {
        public C243733(Object obj) {
            super(2, 0, ISignalEventsObserver.class, obj, "getDependency", "getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(TransportFailureCategory transportFailureCategory, InterfaceC30057d<? super InterfaceC3055s> interfaceC30057d) {
            return ((ISignalEventsObserver) this.receiver).getDependency(transportFailureCategory, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.signal.jsonrpc.JSONRpcSignal$stopRtmpAndRecording$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.signal.jsonrpc.JSONRpcSignal", m100430f = "JSONRpcSignal.kt", m100431l = {349}, m100432m = "stopRtmpAndRecording")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C243741 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C243741(InterfaceC30057d<? super C243741> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JSONRpcSignal.this.stopRtmpAndRecording(this);
        }
    }

    public JSONRpcSignal(ISignalEventsObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.observer = observer;
        this.webSocketOpenDeferred = AbstractC3006f0.m8707a();
        this.onRoleChangeDeferred = AbstractC3006f0.m8707a();
        this.callbacks = new HashMap<>();
        this.mutex = AbstractC30060g.m92088H(new C24069a(11));
        this.pendingTrickle = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final <T> Object call(HMSSignalMethod hMSSignalMethod, HMSParams hMSParams, Class<T> cls, InterfaceC30057d<? super T> interfaceC30057d) throws Throwable {
        C242901 c242901;
        Throwable th3;
        JSONRpcSignal jSONRpcSignal;
        String str;
        if (interfaceC30057d instanceof C242901) {
            c242901 = (C242901) interfaceC30057d;
            int i13 = c242901.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242901.label = i13 - Integer.MIN_VALUE;
            } else {
                c242901 = new C242901(interfaceC30057d);
            }
        } else {
            c242901 = new C242901(interfaceC30057d);
        }
        Object obj = c242901.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242901.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String strMakeCallSignalId = IdHelper.INSTANCE.makeCallSignalId();
            C3058t c3058tM8707a = AbstractC3006f0.m8707a();
            String json = new JsonRpcRequest(strMakeCallSignalId, hMSSignalMethod, hMSParams).toJson();
            this.callbacks.put(strMakeCallSignalId, new Callback(c3058tM8707a, json, hMSSignalMethod));
            try {
                HMSLogger.m71136d(TAG, "Sending ws message: [size=" + json.length() + "] " + json);
                sendSocketMessage(this.socket, json, c3058tM8707a);
                c242901.L$0 = this;
                c242901.L$1 = cls;
                c242901.L$2 = strMakeCallSignalId;
                c242901.label = 1;
                Object objM8817m = c3058tM8707a.m8817m(c242901);
                if (objM8817m == enumC31071a) {
                    return enumC31071a;
                }
                obj = objM8817m;
                str = strMakeCallSignalId;
                jSONRpcSignal = this;
            } catch (UninitializedPropertyAccessException unused) {
                jSONRpcSignal = this;
                str = strMakeCallSignalId;
                throw ErrorFactory.GenericErrors.NotConnected$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.NONE, "Websocket was either not initialized or not connected", null, null, 12, null);
            } catch (Throwable th4) {
                th3 = th4;
                jSONRpcSignal = this;
                str = strMakeCallSignalId;
                jSONRpcSignal.callbacks.remove(str);
                throw th3;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c242901.L$2;
            cls = (Class) c242901.L$1;
            jSONRpcSignal = (JSONRpcSignal) c242901.L$0;
            try {
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (UninitializedPropertyAccessException unused2) {
                    throw ErrorFactory.GenericErrors.NotConnected$default(ErrorFactory.GenericErrors.INSTANCE, ErrorFactory.Action.NONE, "Websocket was either not initialized or not connected", null, null, 12, null);
                }
            } catch (Throwable th5) {
                th3 = th5;
                jSONRpcSignal.callbacks.remove(str);
                throw th3;
            }
        }
        jSONRpcSignal.callbacks.remove(str);
        Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson((String) obj, (Class<Object>) cls);
        jSONRpcSignal.callbacks.remove(str);
        return objFromJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 close$lambda$2() {
        HMSLogger.m71137e(TAG, "Socket is null, Cannot close");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC25435a getMutex() {
        return (InterfaceC25435a) this.mutex.getValue();
    }

    private final void notify(HMSSignalMethod method, HMSParams params) {
        String json = new JsonRpcRequest(method, params).toJson();
        HMSLogger.m71136d(TAG, "Sending ws message: [size=" + json.length() + "] " + json);
        sendSocketMessage(this.socket, json, null);
    }

    private final void sendSocketMessage(InterfaceC34811e1 socket, String message, InterfaceC3055s deferred) {
        if (socket == null && deferred != null) {
            ((C3058t) deferred).completeExceptionally(ErrorFactory.WebSocketConnectionErrors.WebSocketNotAvailable$default(ErrorFactory.WebSocketConnectionErrors.INSTANCE, ErrorFactory.Action.NONE, "Websocket is not ready yet or has been destroyed", null, null, 12, null));
            return;
        }
        Boolean boolValueOf = socket != null ? Boolean.valueOf(((C23886g) socket).m70166h(message)) : null;
        if (boolValueOf == null || !boolValueOf.equals(Boolean.FALSE) || deferred == null) {
            return;
        }
        ((C3058t) deferred).completeExceptionally(ErrorFactory.WebSocketConnectionErrors.WebSocketConnectionLost$default(ErrorFactory.WebSocketConnectionErrors.INSTANCE, ErrorFactory.Action.NONE, "WebSocket Disconnected", null, null, 12, null));
    }

    public static /* synthetic */ void sendSocketMessage$default(JSONRpcSignal jSONRpcSignal, InterfaceC34811e1 interfaceC34811e1, String str, InterfaceC3055s interfaceC3055s, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC3055s = null;
        }
        jSONRpcSignal.sendSocketMessage(interfaceC34811e1, str, interfaceC3055s);
    }

    @Override // live.hms.video.signal.ISignal
    public void answer(HMSSessionDescription answer, String nodeInfo) {
        AbstractC22676k.m65750j(answer, "answer");
        AbstractC22676k.m65750j(nodeInfo, "nodeInfo");
        notify(HMSSignalMethod.ANSWER, new HMSParams.Answer(answer));
    }

    @Override // live.hms.video.signal.ISignal
    public Object bulkRoleChangeRequest(List<HMSRole> list, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C242882(list, z4, hMSRole, null), new C242893(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object changeMetadata(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C242912(str, null), new C242923(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object changeName(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C242932(str, null), new C242943(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object changeSessionMetadata(String str, JsonElement jsonElement, InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C242952(new HMSParams.SetSessionMetadata(str, jsonElement, null, null, 12, null), null), new C242963(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object changeTrackState(HMSTrack hMSTrack, String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C242972(str, hMSTrack, z4, null), new C242983(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public void close() {
        HMSLogger.m71136d(TAG, "close: closing socket");
        InterfaceC34811e1 interfaceC34811e1 = this.socket;
        if ((interfaceC34811e1 != null ? Boolean.valueOf(((C23886g) interfaceC34811e1).m70161b(1000, "Closing")) : new C24069a(12)).equals(Boolean.TRUE)) {
            HMSLogger.m71136d(TAG, "Successfully closed");
        } else {
            HMSLogger.m71137e(TAG, "Could not close socket");
        }
        this.socket = null;
    }

    @Override // live.hms.video.signal.ISignal
    public Object createPoll(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super PollCreateResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243012(setPollParams, null), new C243023(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object createQuestion(HMSParams.PollQuestionsSet pollQuestionsSet, InterfaceC30057d<? super SetQuestionsResponse> interfaceC30057d) {
        C243031 c243031;
        if (interfaceC30057d instanceof C243031) {
            c243031 = (C243031) interfaceC30057d;
            int i13 = c243031.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243031.label = i13 - Integer.MIN_VALUE;
            } else {
                c243031 = new C243031(interfaceC30057d);
            }
        } else {
            c243031 = new C243031(interfaceC30057d);
        }
        C243031 c243032 = c243031;
        Object objWithRetry$default = c243032.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243032.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            Log.d("PollsSetQuestionz", "Params: " + ExtensionUtilsKt.toJsonObject(pollQuestionsSet));
            JSONRpcSignal$createQuestion$result$1 jSONRpcSignal$createQuestion$result$1 = new JSONRpcSignal$createQuestion$result$1(this, pollQuestionsSet, null);
            JSONRpcSignal$createQuestion$result$2 jSONRpcSignal$createQuestion$result$2 = new JSONRpcSignal$createQuestion$result$2(getObserver());
            c243032.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(jSONRpcSignal$createQuestion$result$1, jSONRpcSignal$createQuestion$result$2, null, null, null, 0, c243032, 60, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        JsonObject jsonObject = (JsonObject) objWithRetry$default;
        Log.d("PollsSetQuestions", "Setz: " + jsonObject);
        Object objFromJson = GsonUtils.INSTANCE.getGson().fromJson((JsonElement) jsonObject, (Class<Object>) SetQuestionsResponse.class);
        AbstractC22676k.m65749i(objFromJson, "fromJson(...)");
        return objFromJson;
    }

    @Override // live.hms.video.signal.ISignal
    public Object createWhiteBoard(HMSParams.Options options, InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243053(options, null), new C243042(getObserver()), null, null, null, 0, interfaceC30057d, 28, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object endRoom(String str, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C243061 c243061;
        if (interfaceC30057d instanceof C243061) {
            c243061 = (C243061) interfaceC30057d;
            int i13 = c243061.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243061.label = i13 - Integer.MIN_VALUE;
            } else {
                c243061 = new C243061(interfaceC30057d);
            }
        } else {
            c243061 = new C243061(interfaceC30057d);
        }
        C243061 c243062 = c243061;
        Object obj = c243062.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243062.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C243072 c243072 = new C243072(z4, str, null);
            C243083 c243083 = new C243083(getObserver());
            c243062.label = 1;
            if (ExtensionUtilsKt.withRetry$default(c243072, c243083, null, null, null, 0, c243062, 60, null) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.TRUE;
    }

    @Override // live.hms.video.events.IAnalyticsTransport
    public void event(AnalyticsEvent event) {
        AbstractC22676k.m65750j(event, "event");
        notify(HMSSignalMethod.ANALYTICS, HMSParams.Event.INSTANCE.from(event));
    }

    @Override // live.hms.video.signal.ISignal
    public Object findPeer(String str, String str2, ArrayList<String> arrayList, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243092(new HMSParams.FindPeer(str, str2, arrayList, i13), null), new C243103(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public ISignalEventsObserver getObserver() {
        return this.observer;
    }

    @Override // live.hms.video.signal.ISignal
    public Object getSessionMetadata(String str, InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243112(str, null), new C243123(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object getWhiteBoard(String str, InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243132(str, null), new C243143(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object groupAdd(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243152(new HMSParams.GroupAdd(str2, str, null, 4, null), null), new C243163(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object groupJoin(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243172(new HMSParams.GroupJoin(str), null), new C243183(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // live.hms.video.signal.ISignal
    public Object groupLeave(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243192(new HMSParams.GroupLeave(str, null, 2, 0 == true ? 1 : 0), null), new C243203(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object groupRemove(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243212(new HMSParams.GroupRemove(str2, str, null, 4, null), null), new C243223(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    /* JADX INFO: renamed from: isConnected, reason: from getter */
    public boolean get_isConnected() {
        return this._isConnected;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // live.hms.video.signal.ISignal
    public Object join(String str, String str2, boolean z4, HMSSessionDescription hMSSessionDescription, IRetryAttemptTracking iRetryAttemptTracking, boolean z13, InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d) {
        C243231 c243231;
        JSONRpcSignal jSONRpcSignal;
        if (interfaceC30057d instanceof C243231) {
            c243231 = (C243231) interfaceC30057d;
            int i13 = c243231.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243231.label = i13 - Integer.MIN_VALUE;
            } else {
                c243231 = new C243231(interfaceC30057d);
            }
        } else {
            c243231 = new C243231(interfaceC30057d);
        }
        C243231 c243232 = c243231;
        Object objWithRetry$default = c243232.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243232.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            JSONRpcSignal$join$res$1 jSONRpcSignal$join$res$1 = new JSONRpcSignal$join$res$1(this, new HMSParams.Join(str, str2, hMSSessionDescription, false, z4, z13, 8, null), null);
            JSONRpcSignal$join$res$2 jSONRpcSignal$join$res$2 = new JSONRpcSignal$join$res$2(getObserver());
            EVENT_TYPE event_type = EVENT_TYPE.JOIN_RETRIES;
            c243232.L$0 = this;
            c243232.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(jSONRpcSignal$join$res$1, jSONRpcSignal$join$res$2, null, event_type, iRetryAttemptTracking, 0, c243232, 36, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
            jSONRpcSignal = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONRpcSignal = (JSONRpcSignal) c243232.L$0;
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        HMSSessionDescription hMSSessionDescription2 = (HMSSessionDescription) objWithRetry$default;
        jSONRpcSignal.isJoinCompleted = true;
        Iterator<T> it = jSONRpcSignal.pendingTrickle.iterator();
        while (it.hasNext()) {
            jSONRpcSignal.trickle((HMSTrickle) it.next());
        }
        jSONRpcSignal.pendingTrickle.clear();
        return hMSSessionDescription2;
    }

    @Override // live.hms.video.signal.ISignal
    public void leave(boolean notifyServer) {
        this.isLeaveInProgress = true;
        if (notifyServer) {
            notify(HMSSignalMethod.LEAVE, new HMSParams.Leave("1.0"));
        }
        close();
    }

    @Override // live.hms.video.signal.ISignal
    public Object offer(HMSSessionDescription hMSSessionDescription, List<HMSNotifications.Track> list, String str, InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d) {
        HashMap map = new HashMap();
        for (HMSNotifications.Track track : list) {
            if (AbstractC39414r.m125876U(hMSSessionDescription.getDescription(), track.getTrackId(), false)) {
                map.put(track.getTrackId(), track);
            }
        }
        return ExtensionUtilsKt.withRetry$default(new C243242(new HMSParams.SendOffer(hMSSessionDescription, map, str), null), new C243253(getObserver()), null, null, null, 0, interfaceC30057d, 56, null);
    }

    @Override // live.hms.video.signal.jsonrpc.HMSWebSocketListener, ud3.AbstractC34814f1
    public void onClosed(InterfaceC34811e1 webSocket, int code, String reason) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(reason, "reason");
        super.onClosed(webSocket, code, reason);
        HMSLogger.INSTANCE.m71141w(TAG, "onClosed signal with reason = ".concat(reason));
        this.isLeaveInProgress = false;
        this._isConnected = false;
    }

    @Override // live.hms.video.signal.jsonrpc.HMSWebSocketListener, ud3.AbstractC34814f1
    public void onFailure(InterfaceC34811e1 webSocket, Throwable t14, C34850x0 response) {
        int i13;
        C34832o0 c34832o0;
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(t14, "t");
        HMSLogger.INSTANCE.m71141w(TAG, "OnFailure of web socket");
        this._isConnected = false;
        if (((C3060t1) this.onRoleChangeDeferred).isActive()) {
            ((C3058t) this.onRoleChangeDeferred).completeExceptionally(t14);
        }
        this.onRoleChangeDeferred = AbstractC3006f0.m8707a();
        if (this.isLeaveInProgress) {
            this.isLeaveInProgress = false;
            return;
        }
        super.onFailure(webSocket, t14, response);
        ErrorFactory.WebSocketConnectionErrors webSocketConnectionErrors = ErrorFactory.WebSocketConnectionErrors.INSTANCE;
        ErrorFactory.Action action = ErrorFactory.Action.NONE;
        String message = t14.getMessage();
        if (message == null) {
            message = "WebSocket Disconnected";
        }
        HMSException hMSExceptionWebSocketConnectionLost$default = ErrorFactory.WebSocketConnectionErrors.WebSocketConnectionLost$default(webSocketConnectionErrors, action, message, t14, null, 8, null);
        if (response != null && ((i13 = response.f146792z) == 401 || i13 == 403)) {
            ErrorFactory.APIErrors aPIErrors = ErrorFactory.APIErrors.INSTANCE;
            ErrorFactory.Action action2 = ErrorFactory.Action.INIT;
            InterfaceC34811e1 interfaceC34811e1 = this.socket;
            hMSExceptionWebSocketConnectionLost$default = aPIErrors.HTTPError(i13, action2, "Token Not Authorized", t14, AbstractC25247g0.m73987V(new C23465k("endpoint", String.valueOf((interfaceC34811e1 == null || (c34832o0 = ((C23886g) interfaceC34811e1).f94445a) == null) ? null : c34832o0.f146712a)), new C23465k("response_code", Integer.valueOf(response.f146792z)), new C23465k("response", response.toString())));
        }
        if (((C3060t1) this.webSocketOpenDeferred).isCompleted()) {
            getObserver().onFailure(hMSExceptionWebSocketConnectionLost$default);
        } else {
            ((C3058t) this.webSocketOpenDeferred).completeExceptionally(hMSExceptionWebSocketConnectionLost$default);
        }
    }

    @Override // live.hms.video.signal.jsonrpc.HMSWebSocketListener, ud3.AbstractC34814f1
    public void onMessage(InterfaceC34811e1 webSocket, String text) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(text, "text");
        super.onMessage(webSocket, text);
        JsonObject jsonObject = (JsonObject) GsonUtils.INSTANCE.getGson().fromJson(text, JsonObject.class);
        HMSLogger.m71136d(TAG, "message on ws : " + jsonObject);
        if (jsonObject.has("id")) {
            String asString = jsonObject.get("id").getAsString();
            if (!this.callbacks.containsKey(asString)) {
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, CoroutineExceptionTrackerKt.exceptionSurfacer(TAG), null, new C243261(jsonObject, null), 2);
                return;
            }
            Callback callbackRemove = this.callbacks.remove(asString);
            AbstractC22676k.m65747g(callbackRemove);
            Callback callback = callbackRemove;
            if (jsonObject.has("result")) {
                InterfaceC3055s deferred = callback.getDeferred();
                String string = jsonObject.get("result").toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                ((C3058t) deferred).m8807L(string);
                return;
            }
            HMSLogger.m71137e(TAG, "Server Side Error: [size=" + text.length() + "] " + text);
            JsonObject asJsonObject = jsonObject.getAsJsonObject("error");
            ErrorFactory.WebsocketMethodErrors websocketMethodErrors = ErrorFactory.WebsocketMethodErrors.INSTANCE;
            int asInt = asJsonObject.get("code").getAsInt();
            ErrorFactory.Action errorAction = callback.getMethod().toErrorAction();
            String asString2 = asJsonObject.get("message").getAsString();
            AbstractC22676k.m65749i(asString2, "getAsString(...)");
            ((C3058t) callback.getDeferred()).completeExceptionally(ErrorFactory.WebsocketMethodErrors.ServerErrors$default(websocketMethodErrors, asInt, errorAction, asString2, null, null, 24, null));
            return;
        }
        if (!jsonObject.has("method")) {
            HMSLogger.INSTANCE.m71141w(TAG, "WebSocket message has no `method` or `id` field, message=" + jsonObject);
            return;
        }
        String asString3 = jsonObject.get("method").getAsString();
        if (AbstractC22676k.m65745e(asString3, HMSNotificationMethod.ON_POLICY_CHANGE) && !((C3060t1) this.onRoleChangeDeferred).isCompleted()) {
            ((C3058t) this.onRoleChangeDeferred).m8807L(Boolean.TRUE);
        }
        HMSSignalMethod.Companion companion = HMSSignalMethod.INSTANCE;
        AbstractC22676k.m65747g(asString3);
        HMSSignalMethod hMSSignalMethodFrom = companion.from(asString3);
        if (hMSSignalMethodFrom == HMSSignalMethod.SDK_NOTIFICATION) {
            JsonElement jsonElement = jsonObject.get("method");
            String asString4 = jsonElement != null ? jsonElement.getAsString() : null;
            if (asString4 == null) {
                HMSLogger.INSTANCE.m71141w(TAG, "Ignoring notification with no method: " + jsonObject);
                return;
            }
            HMSNotifications.Companion companion2 = HMSNotifications.INSTANCE;
            JsonObject asJsonObject2 = jsonObject.get("params").getAsJsonObject();
            AbstractC22676k.m65749i(asJsonObject2, "getAsJsonObject(...)");
            if (companion2.from(asString4, asJsonObject2) instanceof HMSNotifications.Unsupported) {
                HMSLogger.INSTANCE.m71141w(TAG, "Ignoring unsupported notification: " + jsonObject);
                return;
            }
            if (asString4.equals(HMSNotificationMethod.NODE_INFO) || asString4.equals(HMSNotificationMethod.ON_POLICY_CHANGE)) {
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, CoroutineExceptionTrackerKt.exceptionSurfacer(TAG), null, new C243272(asString4, jsonObject, null), 2);
                return;
            } else {
                AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, CoroutineExceptionTrackerKt.exceptionSurfacer(TAG), null, new C243283(jsonObject, null), 2);
                return;
            }
        }
        HMSParams.Companion companion3 = HMSParams.INSTANCE;
        JsonObject asJsonObject3 = jsonObject.get("params").getAsJsonObject();
        AbstractC22676k.m65749i(asJsonObject3, "getAsJsonObject(...)");
        HMSParams hMSParamsFromReceivedParams = companion3.fromReceivedParams(hMSSignalMethodFrom, asJsonObject3);
        if (hMSParamsFromReceivedParams instanceof HMSParams.Unsupported) {
            HMSLogger.INSTANCE.m71141w(TAG, "Ignoring unsupported notification: " + jsonObject.get("params"));
            return;
        }
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        hMSLogger.m71140v(TAG, "[method=" + hMSSignalMethodFrom + "] Received params=" + hMSParamsFromReceivedParams);
        int i13 = WhenMappings.$EnumSwitchMapping$0[hMSSignalMethodFrom.ordinal()];
        if (i13 == 1) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C243294(hMSParamsFromReceivedParams, null), 3);
            return;
        }
        if (i13 == 2) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C243305(hMSParamsFromReceivedParams, null), 3);
            return;
        }
        if (i13 == 3) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C243316(hMSParamsFromReceivedParams, this, hMSSignalMethodFrom, null), 3);
            return;
        }
        hMSLogger.m71141w(TAG, "Received unknown " + hMSSignalMethodFrom + " message from server, [size=" + text.length() + "] " + text);
    }

    @Override // live.hms.video.signal.jsonrpc.HMSWebSocketListener, ud3.AbstractC34814f1
    public void onOpen(InterfaceC34811e1 webSocket, C34850x0 response) {
        AbstractC22676k.m65750j(webSocket, "webSocket");
        AbstractC22676k.m65750j(response, "response");
        super.onOpen(webSocket, response);
        ((C3058t) this.webSocketOpenDeferred).m8807L(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // live.hms.video.signal.ISignal
    public Object open(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243321 c243321;
        JSONRpcSignal jSONRpcSignal;
        if (interfaceC30057d instanceof C243321) {
            c243321 = (C243321) interfaceC30057d;
            int i13 = c243321.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243321.label = i13 - Integer.MIN_VALUE;
            } else {
                c243321 = new C243321(interfaceC30057d);
            }
        } else {
            c243321 = new C243321(interfaceC30057d);
        }
        Object obj = c243321.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243321.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            HMSLogger.m71136d(TAG, "open: Connecting WebSocket to endpoint=" + str + " ⏰");
            if (((C3060t1) this.webSocketOpenDeferred).isCompleted()) {
                this.webSocketOpenDeferred = AbstractC3006f0.m8707a();
            }
            this.socket = OkHttpFactory.INSTANCE.makeWebSocket(str, this);
            InterfaceC3055s interfaceC3055s = this.webSocketOpenDeferred;
            c243321.L$0 = this;
            c243321.L$1 = str;
            c243321.label = 1;
            if (((C3058t) interfaceC3055s).m8817m(c243321) == enumC31071a) {
                return enumC31071a;
            }
            jSONRpcSignal = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c243321.L$1;
            jSONRpcSignal = (JSONRpcSignal) c243321.L$0;
            AbstractC34132o.m107864I(obj);
        }
        jSONRpcSignal._isConnected = true;
        HMSLogger.m71136d(TAG, "open: WebSocket connected to endpoint=" + str + " ✅");
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object peerIteratorNext(String str, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243332(new HMSParams.PeerIteratorNext(str, i13), null), new C243343(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object peerNameSearch(String str, int i13, long j7, InterfaceC30057d<? super PeerNameSearchResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243352(new HMSParams.PeerNameSearch(str, i13, j7), null), new C243363(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object pollAddResponse(HMSPollResponseBuilder hMSPollResponseBuilder, InterfaceC30057d<? super PollAnswerResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243372(new HMSParams.PollResponseSet(hMSPollResponseBuilder.getHmsPoll().getPollId(), hMSPollResponseBuilder.getAllAnswers$lib_release(), null, 4, null), null), new C243383(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object pollGetLeaderboard(HMSParams.PollLeaderboardQuery pollLeaderboardQuery, InterfaceC30057d<? super PollLeaderboardResponse> interfaceC30057d) {
        C243391 c243391;
        if (interfaceC30057d instanceof C243391) {
            c243391 = (C243391) interfaceC30057d;
            int i13 = c243391.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243391.label = i13 - Integer.MIN_VALUE;
            } else {
                c243391 = new C243391(interfaceC30057d);
            }
        } else {
            c243391 = new C243391(interfaceC30057d);
        }
        C243391 c243392 = c243391;
        Object objWithRetry$default = c243392.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243392.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            JSONRpcSignal$pollGetLeaderboard$r$1 jSONRpcSignal$pollGetLeaderboard$r$1 = new JSONRpcSignal$pollGetLeaderboard$r$1(this, pollLeaderboardQuery, null);
            JSONRpcSignal$pollGetLeaderboard$r$2 jSONRpcSignal$pollGetLeaderboard$r$2 = new JSONRpcSignal$pollGetLeaderboard$r$2(getObserver());
            c243392.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(jSONRpcSignal$pollGetLeaderboard$r$1, jSONRpcSignal$pollGetLeaderboard$r$2, null, null, null, 0, c243392, 60, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        return ((HMSPollLeaderboardResponse) GsonUtils.INSTANCE.getGson().fromJson((JsonElement) objWithRetry$default, HMSPollLeaderboardResponse.class)).mapToPollLeaderboardResponse();
    }

    @Override // live.hms.video.signal.ISignal
    public Object pollGetList(HmsPollState hmsPollState, int i13, String str, InterfaceC30057d<? super PollListResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243402(new HMSParams.PollListQuery(i13, str, hmsPollState, null, 8, null), null), new C243413(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object pollGetResponses(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super PollGetResponsesReply> interfaceC30057d) {
        C243421 c243421;
        if (interfaceC30057d instanceof C243421) {
            c243421 = (C243421) interfaceC30057d;
            int i13 = c243421.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243421.label = i13 - Integer.MIN_VALUE;
            } else {
                c243421 = new C243421(interfaceC30057d);
            }
        } else {
            c243421 = new C243421(interfaceC30057d);
        }
        C243421 c243422 = c243421;
        Object objWithRetry$default = c243422.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243422.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            C243432 c243432 = new C243432(pollResponsesQuery, null);
            C243443 c243443 = new C243443(getObserver());
            c243422.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(c243432, c243443, null, null, null, 0, c243422, 60, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        JsonObject jsonObject = (JsonObject) objWithRetry$default;
        Log.d("PrintingResponses", String.valueOf(jsonObject));
        PollGetResponsesReply pollGetResponsesReply = (PollGetResponsesReply) GsonUtils.INSTANCE.getGson().fromJson((JsonElement) jsonObject, PollGetResponsesReply.class);
        AbstractC22676k.m65749i(pollGetResponsesReply, "let(...)");
        return pollGetResponsesReply;
    }

    @Override // live.hms.video.signal.ISignal
    public Object pollGetResults(String str, InterfaceC30057d<? super PollResultsResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243452(str, null), new C243463(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object pollQuestionsGet(HMSParams.PollQuestionsGet pollQuestionsGet, InterfaceC30057d<? super PollQuestionGetResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243472(pollQuestionsGet, null), new C243483(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object pollStart(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243491 c243491;
        if (interfaceC30057d instanceof C243491) {
            c243491 = (C243491) interfaceC30057d;
            int i13 = c243491.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243491.label = i13 - Integer.MIN_VALUE;
            } else {
                c243491 = new C243491(interfaceC30057d);
            }
        } else {
            c243491 = new C243491(interfaceC30057d);
        }
        C243491 c243492 = c243491;
        Object objWithRetry$default = c243492.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243492.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            Log.d("PollStart", "starting");
            JSONRpcSignal$pollStart$result$1 jSONRpcSignal$pollStart$result$1 = new JSONRpcSignal$pollStart$result$1(this, str, null);
            JSONRpcSignal$pollStart$result$2 jSONRpcSignal$pollStart$result$2 = new JSONRpcSignal$pollStart$result$2(getObserver());
            c243492.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(jSONRpcSignal$pollStart$result$1, jSONRpcSignal$pollStart$result$2, null, null, null, 0, c243492, 60, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        Log.d("WebsocketMessageZ", "Start: " + ((JsonObject) objWithRetry$default));
        return C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object pollStop(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243502(str, null), new C243513(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object removePeer(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243522(str, str2, null), new C243533(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object roleChangeAccept(String str, String str2, HMSPeer hMSPeer, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243542(str, str2, hMSPeer, null), new C243553(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object roleChangeRequest(String str, boolean z4, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243562(str, z4, str2, null), new C243573(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object sendMessage(HMSParams hMSParams, InterfaceC30057d<? super HMSMessageSendResponse> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243582(hMSParams, null), new C243593(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object setHlsSessionMetadata(List<HMSHLSTimedMetadata> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243602(list, null), new C243613(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // live.hms.video.signal.ISignal
    public Object setMetadataListener(List<String> list, InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d) {
        return ExtensionUtilsKt.withRetry$default(new C243622(new HMSParams.ListenMetadataChangeRequest(list, null, 2, 0 == true ? 1 : 0), null), new C243633(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
    }

    @Override // live.hms.video.signal.ISignal
    public Object startHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243642(hMSHLSConfig, null), new C243653(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object startRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243662(new HMSParams.StartTranscription(transcriptionsMode), null), new C243673(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object startRtmpOrRecording(HMSRecordingConfig hMSRecordingConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243682(hMSRecordingConfig, null), new C243693(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object stopHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243702(hMSHLSConfig, null), new C243713(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    @Override // live.hms.video.signal.ISignal
    public Object stopRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C243722(new HMSParams.StopTranscription(transcriptionsMode), null), new C243733(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // live.hms.video.signal.ISignal
    public Object stopRtmpAndRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C243741 c243741;
        if (interfaceC30057d instanceof C243741) {
            c243741 = (C243741) interfaceC30057d;
            int i13 = c243741.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c243741.label = i13 - Integer.MIN_VALUE;
            } else {
                c243741 = new C243741(interfaceC30057d);
            }
        } else {
            c243741 = new C243741(interfaceC30057d);
        }
        C243741 c243742 = c243741;
        Object objWithRetry$default = c243742.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c243742.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objWithRetry$default);
            JSONRpcSignal$stopRtmpAndRecording$result$1 jSONRpcSignal$stopRtmpAndRecording$result$1 = new JSONRpcSignal$stopRtmpAndRecording$result$1(this, null);
            JSONRpcSignal$stopRtmpAndRecording$result$2 jSONRpcSignal$stopRtmpAndRecording$result$2 = new JSONRpcSignal$stopRtmpAndRecording$result$2(getObserver());
            c243742.label = 1;
            objWithRetry$default = ExtensionUtilsKt.withRetry$default(jSONRpcSignal$stopRtmpAndRecording$result$1, jSONRpcSignal$stopRtmpAndRecording$result$2, null, null, null, 0, c243742, 60, null);
            if (objWithRetry$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objWithRetry$default);
        }
        HMSLogger.m71136d(TAG, "Result was " + ((JSONObject) objWithRetry$default));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // live.hms.video.signal.ISignal
    public void trackUpdate(List<HMSNotifications.Track> tracks) {
        AbstractC22676k.m65750j(tracks, "tracks");
        HashMap map = new HashMap();
        for (HMSNotifications.Track track : tracks) {
            map.put(track.getTrackId(), track);
        }
        notify(HMSSignalMethod.TRACK_UPDATE, new HMSParams.TrackUpdate(map, null, 2, 0 == true ? 1 : 0));
    }

    @Override // live.hms.video.signal.ISignal
    public void trickle(HMSTrickle trickle) {
        AbstractC22676k.m65750j(trickle, "trickle");
        if (this.isJoinCompleted) {
            notify(HMSSignalMethod.TRICKLE, HMSParams.Trickle.INSTANCE.from(trickle));
        } else {
            this.pendingTrickle.add(trickle);
        }
    }

    @Override // live.hms.video.signal.ISignal
    public Object changeTrackState(boolean z4, HMSTrackType hMSTrackType, String str, List<String> list, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objWithRetry$default = ExtensionUtilsKt.withRetry$default(new C242995(list, hMSTrackType, str, z4, null), new C243006(getObserver()), null, null, null, 0, interfaceC30057d, 60, null);
        return objWithRetry$default == EnumC31071a.f128113w ? objWithRetry$default : C23454a0.f92919a;
    }
}
