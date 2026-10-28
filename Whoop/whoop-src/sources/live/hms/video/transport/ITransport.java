package live.hms.video.transport;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import com.google.gson.JsonElement;
import com.mapbox.maps.MapboxMap;
import hms.webrtc.RTCStatsReport;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.factories.noisecancellation.NoiseCancellation;
import live.hms.video.groups.GroupJoinLeaveResponse;
import live.hms.video.media.capturers.HMSCapturer;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
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
import live.hms.video.sdk.models.FindPeerResponse;
import live.hms.video.sdk.models.HMSHLSConfig;
import live.hms.video.sdk.models.HMSHLSTimedMetadata;
import live.hms.video.sdk.models.HMSMessageSendResponse;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.HMSRoom;
import live.hms.video.sdk.models.PeerNameSearchResponse;
import live.hms.video.sdk.models.PerformanceMeasurement;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.sdk.models.enums.RetrySchedulerState;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.sessionstore.SetMetadataListenerResult;
import live.hms.video.sessionstore.SetSessionMetadataResult;
import live.hms.video.signal.init.HMSLayoutListener;
import live.hms.video.signal.init.HMSTokenListener;
import live.hms.video.signal.init.InitConfig;
import live.hms.video.signal.init.LayoutRequestOptions;
import live.hms.video.signal.init.TokenRequest;
import live.hms.video.signal.init.TokenRequestOptions;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.transport.models.TransportState;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.whiteboard.network.HMSCreateWhiteBoardResponse;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ê\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004JZ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH¦@¢\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018H¦@¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010#\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH&¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\nH¦@¢\u0006\u0004\b(\u0010)J(\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\nH¦@¢\u0006\u0004\b-\u0010.J*\u00100\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u001eH¦@¢\u0006\u0004\b0\u00101J*\u00109\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H¦@¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H&¢\u0006\u0004\b;\u0010<J6\u0010A\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?H¦@¢\u0006\u0004\bA\u0010BJ3\u0010F\u001a\u00020E2\u0006\u00103\u001a\u0002022\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010D\u001a\u00020C2\b\u0010@\u001a\u0004\u0018\u00010?H&¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010D\u001a\u00020CH&¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u000208H¦@¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0010H¦@¢\u0006\u0004\bM\u0010NJ$\u0010R\u001a\b\u0012\u0004\u0012\u0002080Q2\f\u0010P\u001a\b\u0012\u0004\u0012\u0002080OH¦@¢\u0006\u0004\bR\u0010SJ\u001e\u0010T\u001a\u00020\u00102\f\u0010P\u001a\b\u0012\u0004\u0012\u0002080OH¦@¢\u0006\u0004\bT\u0010SJ\u0018\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020UH¦@¢\u0006\u0004\bX\u0010YJ\u0012\u0010[\u001a\u0004\u0018\u00010ZH¦@¢\u0006\u0004\b[\u0010NJ\u0012\u0010\\\u001a\u0004\u0018\u00010ZH¦@¢\u0006\u0004\b\\\u0010NJ \u0010^\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u0005H¦@¢\u0006\u0004\b^\u0010_J \u0010a\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\nH¦@¢\u0006\u0004\ba\u0010bJ(\u0010e\u001a\u00020\u00102\u0006\u0010c\u001a\u0002082\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\nH¦@¢\u0006\u0004\be\u0010fJD\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\n2\b\u0010g\u001a\u0004\u0018\u0001062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010Q2\u0006\u0010/\u001a\u00020\u0005H¦@¢\u0006\u0004\be\u0010iJ\u0018\u0010l\u001a\u00020\u00102\u0006\u0010k\u001a\u00020jH¦@¢\u0006\u0004\bl\u0010mJ\u001a\u0010o\u001a\u00020\u00102\b\u0010k\u001a\u0004\u0018\u00010nH¦@¢\u0006\u0004\bo\u0010pJ\u001a\u0010q\u001a\u00020\u00102\b\u0010k\u001a\u0004\u0018\u00010nH¦@¢\u0006\u0004\bq\u0010pJ\u0010\u0010r\u001a\u00020\u0010H¦@¢\u0006\u0004\br\u0010NJ\u0018\u0010t\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u0005H¦@¢\u0006\u0004\bt\u0010uJ\u0018\u0010w\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\u0005H¦@¢\u0006\u0004\bw\u0010uJ\u001a\u0010z\u001a\u00020y2\b\u0010x\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\bz\u0010uJ\"\u0010}\u001a\u00020|2\u0006\u0010x\u001a\u00020\u00052\b\u0010v\u001a\u0004\u0018\u00010{H¦@¢\u0006\u0004\b}\u0010~J\"\u0010\u0081\u0001\u001a\u00020\u00102\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0QH¦@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J?\u0010\u0088\u0001\u001a\u00020\u00102\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010Q2\b\u0010\u0085\u0001\u001a\u00030\u0083\u00012\u0006\u0010,\u001a\u00020\n2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H¦@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J2\u0010\u0090\u0001\u001a\u00020\u00102\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H&¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J#\u0010\u0094\u0001\u001a\u00030\u0093\u00012\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050QH¦@¢\u0006\u0006\b\u0094\u0001\u0010\u0082\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0010H&¢\u0006\u0005\b\u0095\u0001\u0010<J\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0007\u0010V\u001a\u00030\u0096\u0001H¦@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001d\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010V\u001a\u00030\u009a\u0001H¦@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009f\u0001\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\b\u009f\u0001\u0010uJ\u001b\u0010 \u0001\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\b \u0001\u0010uJ\u001e\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¢\u0001\u001a\u00030¡\u0001H¦@¢\u0006\u0006\b¢\u0001\u0010¤\u0001J\u001e\u0010¨\u0001\u001a\u00030§\u00012\b\u0010¦\u0001\u001a\u00030¥\u0001H¦@¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001e\u0010\u00ad\u0001\u001a\u00030¬\u00012\b\u0010«\u0001\u001a\u00030ª\u0001H¦@¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001c\u0010°\u0001\u001a\u00030¯\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\b°\u0001\u0010uJ\u001e\u0010³\u0001\u001a\u00030²\u00012\b\u0010«\u0001\u001a\u00030±\u0001H¦@¢\u0006\u0006\b³\u0001\u0010´\u0001J3\u0010»\u0001\u001a\u00030º\u00012\b\u0010¶\u0001\u001a\u00030µ\u00012\b\u0010¸\u0001\u001a\u00030·\u00012\t\u0010¹\u0001\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001e\u0010À\u0001\u001a\u00030¿\u00012\b\u0010¾\u0001\u001a\u00030½\u0001H¦@¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001c\u0010Ä\u0001\u001a\u00030Ã\u00012\u0007\u0010Â\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\bÄ\u0001\u0010uJ0\u0010É\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\n\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\b\u0010È\u0001\u001a\u00030Ç\u0001H&¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010Í\u0001\u001a\u00030Ì\u00012\u0007\u0010Ë\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\bÍ\u0001\u0010uJ\u001c\u0010Î\u0001\u001a\u00030Ì\u00012\u0007\u0010Ë\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\bÎ\u0001\u0010uJ#\u0010Ï\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0007\u0010Ë\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\bÏ\u0001\u0010_J#\u0010Ð\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0007\u0010Ë\u0001\u001a\u00020\u0005H¦@¢\u0006\u0005\bÐ\u0001\u0010_JS\u0010×\u0001\u001a\u00030Ö\u00012\t\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00052\u001d\u0010Ô\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010Ò\u0001j\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`Ó\u00012\b\u0010Õ\u0001\u001a\u00030·\u0001H¦@¢\u0006\u0006\b×\u0001\u0010Ø\u0001J'\u0010Ú\u0001\u001a\u00030Ö\u00012\u0007\u0010Ù\u0001\u001a\u00020\u00052\b\u0010Õ\u0001\u001a\u00030·\u0001H¦@¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u001d\u0010Þ\u0001\u001a\u00020\u00102\b\u0010Ý\u0001\u001a\u00030Ü\u0001H¦@¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u001d\u0010à\u0001\u001a\u00020\u00102\b\u0010Ý\u0001\u001a\u00030Ü\u0001H¦@¢\u0006\u0006\bà\u0001\u0010ß\u0001J,\u0010ã\u0001\u001a\u00020\u00102\u0006\u00105\u001a\u0002042\u0007\u0010á\u0001\u001a\u00020\n2\u0007\u0010â\u0001\u001a\u00020\nH&¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0012\u0010å\u0001\u001a\u00020\u0010H¦@¢\u0006\u0005\bå\u0001\u0010NJ\u0012\u0010æ\u0001\u001a\u00020\u0010H¦@¢\u0006\u0005\bæ\u0001\u0010NJ$\u0010è\u0001\u001a\u00020\u00102\u0007\u0010á\u0001\u001a\u00020\n2\u0007\u0010ç\u0001\u001a\u00020\nH&¢\u0006\u0006\bè\u0001\u0010é\u0001J\u001b\u0010ë\u0001\u001a\u00020\u00102\u0007\u0010ê\u0001\u001a\u00020\nH¦@¢\u0006\u0005\bë\u0001\u0010)J1\u0010ð\u0001\u001a\u00030ï\u00012\u0007\u0010ì\u0001\u001a\u00020\u00052\b\u0010Õ\u0001\u001a\u00030·\u00012\b\u0010î\u0001\u001a\u00030í\u0001H¦@¢\u0006\u0006\bð\u0001\u0010ñ\u0001J\u001b\u0010ó\u0001\u001a\u00020\u00102\u0007\u0010ò\u0001\u001a\u00020\u0005H&¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u0012\u0010õ\u0001\u001a\u00020\u0010H¦@¢\u0006\u0005\bõ\u0001\u0010NJ&\u0010÷\u0001\u001a\u00020\u00102\b\u0010ö\u0001\u001a\u00030·\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H&¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001c\u0010ù\u0001\u001a\u00020\u00102\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H&¢\u0006\u0006\bù\u0001\u0010ú\u0001R\"\u0010ÿ\u0001\u001a\u00030í\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\bû\u0001\u0010ü\u0001\"\u0006\bý\u0001\u0010þ\u0001R\"\u0010\u0082\u0002\u001a\u00030í\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0002\u0010ü\u0001\"\u0006\b\u0081\u0002\u0010þ\u0001R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010¶\u0001\u001a\u00030\u0087\u00028&X¦\u0004¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002¨\u0006\u008a\u0002"}, m65681d2 = {"Llive/hms/video/transport/ITransport;", "", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "noiseCancellation", "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "", "authToken", "peerId", "peerName", "data", "", "serverSideSubscribeDegradation", "shouldSendOffer", "endpoint", "simulcastEnabled", "iceGatheringOnAnyAddressPorts", "Ll83/a0;", "join", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;", "token", "Llive/hms/video/sdk/models/enums/RetrySchedulerState;", "source", "Llive/hms/video/sdk/models/PerformanceMeasurement;", "performanceMeasurement", "Lkotlin/Function1;", "Llive/hms/video/signal/init/InitConfig;", "initSdkStoreFlags", "connect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "sessionId", "Llive/hms/video/sdk/models/HMSPeer;", "hmsPeer", "Llive/hms/video/sdk/models/HMSRoom;", "hmsRoom", "websocketUrl", "updateAnalyticsParams", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V", "isSocketConnectionOpen", "()Z", "notifyServer", "leave", "(ZLq83/d;)Ljava/lang/Object;", "forPeerId", "toRoleName", "force", "roleChangeRequest", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "requestedBy", "roleChangeAccept", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "Llive/hms/video/media/tracks/HMSTrackType;", "hmsTrackType", "Llive/hms/video/media/tracks/HMSTrack;", "getLocalTrackByType", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;", "removeTrackFromStream", "()V", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Landroid/app/Notification;", "screenShareNotification", "getScreenShareTrack", "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "Llive/hms/video/media/capturers/HMSCapturer;", "getAudioShareCapturer", "(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;", "setAudioMixingMode", "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "track", "publishScreenshare", "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;", "unpublishScreenshare", "(Lq83/d;)Ljava/lang/Object;", "", "tracks", "", "publish", "([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;", "unpublish", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "params", "Llive/hms/video/sdk/models/HMSMessageSendResponse;", "sendMessage", "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;", "Lhms/webrtc/RTCStatsReport;", "getPublishPacketStats", "getSubscribePacketStats", "reason", "removePeerRequest", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "lock", "endRoom", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "hmsTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "type", "roles", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "config", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;", "stopHLSStreaming", "stopRtmpAndRecording", "name", "changeName", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "metadata", "changeMetadata", "key", "Llive/hms/video/sessionstore/SessionMetadataResult;", "getSessionMetadata", "Lcom/google/gson/JsonElement;", "Llive/hms/video/sessionstore/SetSessionMetadataResult;", "changeSessionMetadata", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metadataModelList", "setHlsSessionMetadata", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/role/HMSRole;", "ofRoles", "toRole", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "bulkRoleChangeRequest", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/init/TokenRequest;", "tokenRequest", "Llive/hms/video/signal/init/TokenRequestOptions;", "tokenRequestOptions", "Llive/hms/video/signal/init/HMSTokenListener;", "hmsTokenListener", "getAuthTokenByRoomCode", "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V", "tags", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "setMetadataListener", "deInitLocalStreams", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/polls/network/PollCreateResponse;", "createPoll", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/polls/network/SetQuestionsResponse;", "createQuestion", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;", "pollId", "pollStart", "pollStop", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "pollQuestionsGet", "Llive/hms/video/polls/network/PollQuestionGetResponse;", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/HMSPollResponseBuilder;", "hmsPollResponseBuilder", "Llive/hms/video/polls/models/answer/PollAnswerResponse;", "pollAddResponse", "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "param", "Llive/hms/video/polls/network/PollGetResponsesReply;", "pollGetResponses", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/network/PollResultsResponse;", "pollGetResults", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "pollGetLeaderboard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/models/HmsPollState;", "state", "", "count", "start", "Llive/hms/video/polls/network/PollListResponse;", "pollGetList", "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "options", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "createWhiteBoard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;", "id", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "getWhiteBoard", "Llive/hms/video/signal/init/LayoutRequestOptions;", "layoutRequestOptions", "Llive/hms/video/signal/init/HMSLayoutListener;", "hmsLayoutConfigListener", "getLayoutConfigByToken", "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V", "groupName", "Llive/hms/video/groups/GroupJoinLeaveResponse;", "groupJoin", "groupLeave", "groupAdd", "groupRemove", "roleName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "peerIds", MapboxMap.QFE_LIMIT, "Llive/hms/video/sdk/models/FindPeerResponse;", "findPeers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;", "iteratorId", "peerIteratorNext", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;", "stopRealTimeTranscription", "isSimulcastEnabled", "isSoftwareEchoCancellationEnabled", "initializePeerConnectionFactoryIfNeeded", "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V", "renegotiationICE", "disposePeerConnectionFactory", "serverSoftwareEchoCancellationEnabled", "initHmsPeerConnectionFactory", "(ZZ)V", "isBackground", "reInitPeerConnectionFactory", "query", "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/models/PeerNameSearchResponse;", "peerNameSearch", "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;", "nodeId", "setNodeInfo", "(Ljava/lang/String;)V", "initPeerConnections", "audioResourceId", "streamAndPlayAudioFromRawFile", "(ILlive/hms/video/sdk/HMSActionResultListener;)V", "stopAudioFromRawFile", "(Llive/hms/video/sdk/HMSActionResultListener;)V", "getTimeAfterJoinResponse", "()J", "setTimeAfterJoinResponse", "(J)V", "timeAfterJoinResponse", "getTimeAfterWSOpen", "setTimeAfterWSOpen", "timeAfterWSOpen", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService", "()Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Llive/hms/video/transport/models/TransportState;", "getState", "()Llive/hms/video/transport/models/TransportState;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ITransport {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object connect$default(ITransport iTransport, String str, String str2, String str3, RetrySchedulerState retrySchedulerState, PerformanceMeasurement performanceMeasurement, Function1 function1, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
            }
            if ((i13 & 2) != 0) {
                str2 = HMSConstantsKt.cDefaultInitEndpoint;
            }
            String str4 = str2;
            if ((i13 & 8) != 0) {
                retrySchedulerState = RetrySchedulerState.PREVIEW;
            }
            RetrySchedulerState retrySchedulerState2 = retrySchedulerState;
            if ((i13 & 32) != 0) {
                function1 = null;
            }
            return iTransport.connect(str, str4, str3, retrySchedulerState2, performanceMeasurement, function1, interfaceC30057d);
        }

        public static /* synthetic */ Object join$default(ITransport iTransport, String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, boolean z14, boolean z15, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
            if (obj == null) {
                return iTransport.join(str, str2, str3, str4, z4, z13, (i13 & 64) != 0 ? HMSConstantsKt.cDefaultInitEndpoint : str5, z14, z15, interfaceC30057d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: join");
        }

        public static /* synthetic */ void updateAnalyticsParams$default(ITransport iTransport, String str, String str2, HMSPeer hMSPeer, HMSRoom hMSRoom, String str3, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAnalyticsParams");
            }
            if ((i13 & 1) != 0) {
                str = null;
            }
            if ((i13 & 2) != 0) {
                str2 = null;
            }
            if ((i13 & 4) != 0) {
                hMSPeer = null;
            }
            if ((i13 & 8) != 0) {
                hMSRoom = null;
            }
            if ((i13 & 16) != 0) {
                str3 = null;
            }
            iTransport.updateAnalyticsParams(str, str2, hMSPeer, hMSRoom, str3);
        }
    }

    Object bulkRoleChangeRequest(List<HMSRole> list, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeMetadata(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeName(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeSessionMetadata(String str, JsonElement jsonElement, InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d);

    Object changeTrackState(HMSTrack hMSTrack, String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeTrackState(boolean z4, HMSTrackType hMSTrackType, String str, List<String> list, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object connect(String str, String str2, String str3, RetrySchedulerState retrySchedulerState, PerformanceMeasurement performanceMeasurement, Function1 function1, InterfaceC30057d<? super InitConfig> interfaceC30057d);

    Object createPoll(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super PollCreateResponse> interfaceC30057d);

    Object createQuestion(HMSParams.PollQuestionsSet pollQuestionsSet, InterfaceC30057d<? super SetQuestionsResponse> interfaceC30057d);

    Object createWhiteBoard(HMSParams.Options options, InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d);

    void deInitLocalStreams();

    Object disposePeerConnectionFactory(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object endRoom(String str, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object findPeers(String str, String str2, ArrayList<String> arrayList, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d);

    AnalyticsEventsService getAnalyticsEventsService();

    HMSCapturer getAudioShareCapturer(Context context, Intent mediaProjectionPermissionResultData, AudioMixingMode audioMixingMode, Notification screenShareNotification);

    void getAuthTokenByRoomCode(TokenRequest tokenRequest, TokenRequestOptions tokenRequestOptions, HMSTokenListener hmsTokenListener);

    void getLayoutConfigByToken(String token, LayoutRequestOptions layoutRequestOptions, HMSLayoutListener hmsLayoutConfigListener);

    Object getLocalTrackByType(Context context, HMSTrackSettings hMSTrackSettings, HMSTrackType hMSTrackType, InterfaceC30057d<? super HMSTrack> interfaceC30057d);

    Object getPublishPacketStats(InterfaceC30057d<? super RTCStatsReport> interfaceC30057d);

    Object getScreenShareTrack(Context context, HMSTrackSettings hMSTrackSettings, Intent intent, Notification notification, InterfaceC30057d<? super HMSTrack> interfaceC30057d);

    Object getSessionMetadata(String str, InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d);

    TransportState getState();

    Object getSubscribePacketStats(InterfaceC30057d<? super RTCStatsReport> interfaceC30057d);

    long getTimeAfterJoinResponse();

    long getTimeAfterWSOpen();

    Object getWhiteBoard(String str, InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d);

    Object groupAdd(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object groupJoin(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d);

    Object groupLeave(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d);

    Object groupRemove(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void initHmsPeerConnectionFactory(boolean isSimulcastEnabled, boolean serverSoftwareEchoCancellationEnabled);

    Object initPeerConnections(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void initializePeerConnectionFactoryIfNeeded(HMSTrackSettings hmsTrackSettings, boolean isSimulcastEnabled, boolean isSoftwareEchoCancellationEnabled);

    boolean isSocketConnectionOpen();

    Object join(String str, String str2, String str3, String str4, boolean z4, boolean z13, String str5, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object leave(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    NoiseCancellation noiseCancellation();

    Object peerIteratorNext(String str, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d);

    Object peerNameSearch(String str, int i13, long j7, InterfaceC30057d<? super PeerNameSearchResponse> interfaceC30057d);

    Object pollAddResponse(HMSPollResponseBuilder hMSPollResponseBuilder, InterfaceC30057d<? super PollAnswerResponse> interfaceC30057d);

    Object pollGetLeaderboard(HMSParams.PollLeaderboardQuery pollLeaderboardQuery, InterfaceC30057d<? super PollLeaderboardResponse> interfaceC30057d);

    Object pollGetList(HmsPollState hmsPollState, int i13, String str, InterfaceC30057d<? super PollListResponse> interfaceC30057d);

    Object pollGetResponses(HMSParams.PollResponsesQuery pollResponsesQuery, InterfaceC30057d<? super PollGetResponsesReply> interfaceC30057d);

    Object pollGetResults(String str, InterfaceC30057d<? super PollResultsResponse> interfaceC30057d);

    Object pollQuestionsGet(HMSParams.PollQuestionsGet pollQuestionsGet, InterfaceC30057d<? super PollQuestionGetResponse> interfaceC30057d);

    Object pollStart(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object pollStop(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object publish(HMSTrack[] hMSTrackArr, InterfaceC30057d<? super List<? extends HMSTrack>> interfaceC30057d);

    Object publishScreenshare(HMSTrack hMSTrack, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object reInitPeerConnectionFactory(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object removePeerRequest(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void removeTrackFromStream();

    Object renegotiationICE(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object roleChangeAccept(String str, String str2, HMSPeer hMSPeer, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object roleChangeRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object sendMessage(HMSParams hMSParams, InterfaceC30057d<? super HMSMessageSendResponse> interfaceC30057d);

    void setAudioMixingMode(AudioMixingMode audioMixingMode);

    Object setHlsSessionMetadata(List<HMSHLSTimedMetadata> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setMetadataListener(List<String> list, InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d);

    void setNodeInfo(String nodeId);

    void setTimeAfterJoinResponse(long j7);

    void setTimeAfterWSOpen(long j7);

    Object startHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object startRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object startRtmpOrRecording(HMSRecordingConfig hMSRecordingConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void stopAudioFromRawFile(HMSActionResultListener hmsActionResultListener);

    Object stopHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object stopRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object stopRtmpAndRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void streamAndPlayAudioFromRawFile(int audioResourceId, HMSActionResultListener hmsActionResultListener);

    Object unpublish(HMSTrack[] hMSTrackArr, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object unpublishScreenshare(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void updateAnalyticsParams(String token, String sessionId, HMSPeer hmsPeer, HMSRoom hmsRoom, String websocketUrl);
}
