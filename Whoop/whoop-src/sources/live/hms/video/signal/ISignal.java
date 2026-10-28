package live.hms.video.signal;

import com.google.gson.JsonElement;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.models.CommandDefaults;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.connection.models.HMSSessionDescription;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.events.IAnalyticsTransport;
import live.hms.video.groups.GroupJoinLeaveResponse;
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
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.sdk.models.HMSRecordingConfig;
import live.hms.video.sdk.models.IRetryAttemptTracking;
import live.hms.video.sdk.models.PeerNameSearchResponse;
import live.hms.video.sdk.models.TranscriptionsMode;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sessionstore.SessionMetadataResult;
import live.hms.video.sessionstore.SetMetadataListenerResult;
import live.hms.video.sessionstore.SetSessionMetadataResult;
import live.hms.video.signal.jsonrpc.models.HMSParams;
import live.hms.video.whiteboard.network.HMSCreateWhiteBoardResponse;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJF\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u000bH&¢\u0006\u0004\b&\u0010'J(\u0010+\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0002H¦@¢\u0006\u0004\b+\u0010,J*\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010.H¦@¢\u0006\u0004\b0\u00101J \u00104\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H¦@¢\u0006\u0004\b4\u00105J \u00107\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000bH¦@¢\u0006\u0004\b7\u00108J(\u0010<\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u00102\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u000bH¦@¢\u0006\u0004\b<\u0010=JD\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u000b2\b\u0010?\u001a\u0004\u0018\u00010>2\b\u0010@\u001a\u0004\u0018\u00010\u00022\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142\u0006\u0010/\u001a\u00020\u0002H¦@¢\u0006\u0004\b<\u0010BJ\u0018\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH¦@¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010GH¦@¢\u0006\u0004\bH\u0010IJ\u001a\u0010J\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010GH¦@¢\u0006\u0004\bJ\u0010IJ\u0010\u0010K\u001a\u00020\u0004H¦@¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\bM\u0010\u0006J\u0018\u0010O\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0002H¦@¢\u0006\u0004\bO\u0010\u0006J\u001a\u0010R\u001a\u00020Q2\b\u0010P\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\bR\u0010\u0006J\"\u0010U\u001a\u00020T2\u0006\u0010P\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010SH¦@¢\u0006\u0004\bU\u0010VJ\u001e\u0010Y\u001a\u00020\u00042\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0\u0014H¦@¢\u0006\u0004\bY\u0010ZJ6\u0010`\u001a\u00020\u00042\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00142\u0006\u0010]\u001a\u00020[2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020^H¦@¢\u0006\u0004\b`\u0010aJ\u001e\u0010d\u001a\u00020c2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H¦@¢\u0006\u0004\bd\u0010ZJ\u0018\u0010g\u001a\u00020f2\u0006\u0010\u001f\u001a\u00020eH¦@¢\u0006\u0004\bg\u0010hJ\u0018\u0010k\u001a\u00020j2\u0006\u0010\u001f\u001a\u00020iH¦@¢\u0006\u0004\bk\u0010lJ\u0018\u0010n\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0002H¦@¢\u0006\u0004\bn\u0010\u0006J\u0018\u0010o\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0002H¦@¢\u0006\u0004\bo\u0010\u0006J\u0018\u0010q\u001a\u00020r2\u0006\u0010q\u001a\u00020pH¦@¢\u0006\u0004\bq\u0010sJ\u0018\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020tH¦@¢\u0006\u0004\bw\u0010xJ\u0018\u0010|\u001a\u00020{2\u0006\u0010z\u001a\u00020yH¦@¢\u0006\u0004\b|\u0010}J\u0018\u0010\u007f\u001a\u00020~2\u0006\u0010m\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u007f\u0010\u0006J\u001d\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010z\u001a\u00030\u0080\u0001H¦@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J3\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001e\u0010\u008f\u0001\u001a\u00030\u008e\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H¦@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0091\u0001\u001a\u00020\u0002H¦@¢\u0006\u0005\b\u0093\u0001\u0010\u0006J\u001c\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0002H¦@¢\u0006\u0005\b\u0096\u0001\u0010\u0006J\u001c\u0010\u0097\u0001\u001a\u00030\u0095\u00012\u0007\u0010\u0094\u0001\u001a\u00020\u0002H¦@¢\u0006\u0005\b\u0097\u0001\u0010\u0006J#\u0010\u0098\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u0002H¦@¢\u0006\u0005\b\u0098\u0001\u00105J#\u0010\u0099\u0001\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00022\u0007\u0010\u0094\u0001\u001a\u00020\u0002H¦@¢\u0006\u0005\b\u0099\u0001\u00105JS\u0010 \u0001\u001a\u00030\u009f\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00022\u001d\u0010\u009d\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u009b\u0001j\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u009c\u00012\b\u0010\u009e\u0001\u001a\u00030\u0086\u0001H¦@¢\u0006\u0006\b \u0001\u0010¡\u0001J'\u0010£\u0001\u001a\u00030\u009f\u00012\u0007\u0010¢\u0001\u001a\u00020\u00022\b\u0010\u009e\u0001\u001a\u00030\u0086\u0001H¦@¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001d\u0010§\u0001\u001a\u00020\u00042\b\u0010¦\u0001\u001a\u00030¥\u0001H¦@¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001d\u0010©\u0001\u001a\u00020\u00042\b\u0010¦\u0001\u001a\u00030¥\u0001H¦@¢\u0006\u0006\b©\u0001\u0010¨\u0001J1\u0010®\u0001\u001a\u00030\u00ad\u00012\u0007\u0010ª\u0001\u001a\u00020\u00022\b\u0010\u009e\u0001\u001a\u00030\u0086\u00012\b\u0010¬\u0001\u001a\u00030«\u0001H¦@¢\u0006\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010´\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¶\u0001"}, m65681d2 = {"Llive/hms/video/signal/ISignal;", "Llive/hms/video/events/IAnalyticsTransport;", "", "uri", "Ll83/a0;", ProfileAnalyticsKt.OPEN, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "close", "()V", "name", "data", "", "serverSideSubscribeDegradation", "Llive/hms/video/connection/models/HMSSessionDescription;", "offer", "Llive/hms/video/sdk/models/IRetryAttemptTracking;", "retryAttemptTracking", "simulcastEnabled", "join", "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;", "", "Llive/hms/video/sdk/models/HMSNotifications$Track;", "tracks", "nodeInfo", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "answer", "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V", "Llive/hms/video/connection/models/HMSTrickle;", "trickle", "(Llive/hms/video/connection/models/HMSTrickle;)V", "Llive/hms/video/signal/jsonrpc/models/HMSParams;", "params", "Llive/hms/video/sdk/models/HMSMessageSendResponse;", "sendMessage", "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;", "trackUpdate", "(Ljava/util/List;)V", "notifyServer", "leave", "(Z)V", "forPeerId", "force", "role", "roleChangeRequest", "(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "token", "Llive/hms/video/sdk/models/HMSPeer;", "requestedBy", "roleChangeAccept", "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;", "peerId", "reason", "removePeer", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "lock", "endRoom", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrack;", "hmsTrack", CommandDefaults.MUTE, "changeTrackState", "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/tracks/HMSTrackType;", "type", "source", "roles", "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSRecordingConfig;", "config", "startRtmpOrRecording", "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSConfig;", "startHLSStreaming", "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;", "stopHLSStreaming", "stopRtmpAndRecording", "(Lq83/d;)Ljava/lang/Object;", "changeName", "metadata", "changeMetadata", "key", "Llive/hms/video/sessionstore/SessionMetadataResult;", "getSessionMetadata", "Lcom/google/gson/JsonElement;", "Llive/hms/video/sessionstore/SetSessionMetadataResult;", "changeSessionMetadata", "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;", "metadataModelList", "setHlsSessionMetadata", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/role/HMSRole;", "ofRoles", "toRole", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "bulkRoleChangeRequest", "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "tags", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "setMetadataListener", "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;", "Llive/hms/video/polls/network/PollCreateResponse;", "createPoll", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;", "Llive/hms/video/polls/network/SetQuestionsResponse;", "createQuestion", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;", "pollId", "pollStart", "pollStop", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;", "pollQuestionsGet", "Llive/hms/video/polls/network/PollQuestionGetResponse;", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/HMSPollResponseBuilder;", "hmsPollResponseBuilder", "Llive/hms/video/polls/models/answer/PollAnswerResponse;", "pollAddResponse", "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;", "param", "Llive/hms/video/polls/network/PollGetResponsesReply;", "pollGetResponses", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/network/PollResultsResponse;", "pollGetResults", "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;", "Llive/hms/video/polls/network/PollLeaderboardResponse;", "pollGetLeaderboard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/polls/models/HmsPollState;", "state", "", "count", "start", "Llive/hms/video/polls/network/PollListResponse;", "pollGetList", "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;", "options", "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;", "createWhiteBoard", "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;", "id", "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;", "getWhiteBoard", "groupName", "Llive/hms/video/groups/GroupJoinLeaveResponse;", "groupJoin", "groupLeave", "groupAdd", "groupRemove", "roleName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "peerIds", MapboxMap.QFE_LIMIT, "Llive/hms/video/sdk/models/FindPeerResponse;", "findPeer", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;", "iteratorId", "peerIteratorNext", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/models/TranscriptionsMode;", "mode", "startRealTimeTranscription", "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;", "stopRealTimeTranscription", "query", "", MapboxMap.QFE_OFFSET, "Llive/hms/video/sdk/models/PeerNameSearchResponse;", "peerNameSearch", "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;", "Llive/hms/video/signal/ISignalEventsObserver;", "getObserver", "()Llive/hms/video/signal/ISignalEventsObserver;", "observer", "isConnected", "()Z", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface ISignal extends IAnalyticsTransport {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object join$default(ISignal iSignal, String str, String str2, boolean z4, HMSSessionDescription hMSSessionDescription, IRetryAttemptTracking iRetryAttemptTracking, boolean z13, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: join");
            }
            if ((i13 & 8) != 0) {
                hMSSessionDescription = null;
            }
            return iSignal.join(str, str2, z4, hMSSessionDescription, iRetryAttemptTracking, z13, interfaceC30057d);
        }
    }

    void answer(HMSSessionDescription answer, String nodeInfo);

    Object bulkRoleChangeRequest(List<HMSRole> list, HMSRole hMSRole, boolean z4, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeMetadata(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeName(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeSessionMetadata(String str, JsonElement jsonElement, InterfaceC30057d<? super SetSessionMetadataResult> interfaceC30057d);

    Object changeTrackState(HMSTrack hMSTrack, String str, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object changeTrackState(boolean z4, HMSTrackType hMSTrackType, String str, List<String> list, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void close();

    Object createPoll(HMSParams.SetPollParams setPollParams, InterfaceC30057d<? super PollCreateResponse> interfaceC30057d);

    Object createQuestion(HMSParams.PollQuestionsSet pollQuestionsSet, InterfaceC30057d<? super SetQuestionsResponse> interfaceC30057d);

    Object createWhiteBoard(HMSParams.Options options, InterfaceC30057d<? super HMSCreateWhiteBoardResponse> interfaceC30057d);

    Object endRoom(String str, boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d);

    Object findPeer(String str, String str2, ArrayList<String> arrayList, int i13, InterfaceC30057d<? super FindPeerResponse> interfaceC30057d);

    ISignalEventsObserver getObserver();

    Object getSessionMetadata(String str, InterfaceC30057d<? super SessionMetadataResult> interfaceC30057d);

    Object getWhiteBoard(String str, InterfaceC30057d<? super HMSGetWhiteBoardResponse> interfaceC30057d);

    Object groupAdd(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object groupJoin(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d);

    Object groupLeave(String str, InterfaceC30057d<? super GroupJoinLeaveResponse> interfaceC30057d);

    Object groupRemove(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: isConnected */
    boolean get_isConnected();

    Object join(String str, String str2, boolean z4, HMSSessionDescription hMSSessionDescription, IRetryAttemptTracking iRetryAttemptTracking, boolean z13, InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d);

    void leave(boolean notifyServer);

    Object offer(HMSSessionDescription hMSSessionDescription, List<HMSNotifications.Track> list, String str, InterfaceC30057d<? super HMSSessionDescription> interfaceC30057d);

    Object open(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

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

    Object removePeer(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object roleChangeAccept(String str, String str2, HMSPeer hMSPeer, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object roleChangeRequest(String str, boolean z4, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object sendMessage(HMSParams hMSParams, InterfaceC30057d<? super HMSMessageSendResponse> interfaceC30057d);

    Object setHlsSessionMetadata(List<HMSHLSTimedMetadata> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object setMetadataListener(List<String> list, InterfaceC30057d<? super SetMetadataListenerResult> interfaceC30057d);

    Object startHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object startRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object startRtmpOrRecording(HMSRecordingConfig hMSRecordingConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object stopHLSStreaming(HMSHLSConfig hMSHLSConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object stopRealTimeTranscription(TranscriptionsMode transcriptionsMode, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object stopRtmpAndRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void trackUpdate(List<HMSNotifications.Track> tracks);

    void trickle(HMSTrickle trickle);
}
