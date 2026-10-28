package io.getstream.android.video.generated.apis;

import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import io.getstream.android.video.generated.models.AcceptCallResponse;
import io.getstream.android.video.generated.models.BlockUserRequest;
import io.getstream.android.video.generated.models.BlockUserResponse;
import io.getstream.android.video.generated.models.CollectUserFeedbackRequest;
import io.getstream.android.video.generated.models.CollectUserFeedbackResponse;
import io.getstream.android.video.generated.models.CreateDeviceRequest;
import io.getstream.android.video.generated.models.CreateGuestRequest;
import io.getstream.android.video.generated.models.CreateGuestResponse;
import io.getstream.android.video.generated.models.DeleteCallRequest;
import io.getstream.android.video.generated.models.DeleteCallResponse;
import io.getstream.android.video.generated.models.DeleteRecordingResponse;
import io.getstream.android.video.generated.models.DeleteTranscriptionResponse;
import io.getstream.android.video.generated.models.EndCallResponse;
import io.getstream.android.video.generated.models.GetCallParticipantSessionMetricsResponse;
import io.getstream.android.video.generated.models.GetCallReportResponse;
import io.getstream.android.video.generated.models.GetCallResponse;
import io.getstream.android.video.generated.models.GetCallSessionParticipantStatsDetailsResponse;
import io.getstream.android.video.generated.models.GetEdgesResponse;
import io.getstream.android.video.generated.models.GetOrCreateCallRequest;
import io.getstream.android.video.generated.models.GetOrCreateCallResponse;
import io.getstream.android.video.generated.models.GoLiveRequest;
import io.getstream.android.video.generated.models.GoLiveResponse;
import io.getstream.android.video.generated.models.JoinCallRequest;
import io.getstream.android.video.generated.models.JoinCallResponse;
import io.getstream.android.video.generated.models.KickUserRequest;
import io.getstream.android.video.generated.models.KickUserResponse;
import io.getstream.android.video.generated.models.ListDevicesResponse;
import io.getstream.android.video.generated.models.ListRecordingsResponse;
import io.getstream.android.video.generated.models.ListTranscriptionsResponse;
import io.getstream.android.video.generated.models.MuteUsersRequest;
import io.getstream.android.video.generated.models.MuteUsersResponse;
import io.getstream.android.video.generated.models.PinRequest;
import io.getstream.android.video.generated.models.PinResponse;
import io.getstream.android.video.generated.models.QueryAggregateCallStatsRequest;
import io.getstream.android.video.generated.models.QueryAggregateCallStatsResponse;
import io.getstream.android.video.generated.models.QueryCallMembersRequest;
import io.getstream.android.video.generated.models.QueryCallMembersResponse;
import io.getstream.android.video.generated.models.QueryCallParticipantSessionsResponse;
import io.getstream.android.video.generated.models.QueryCallParticipantsRequest;
import io.getstream.android.video.generated.models.QueryCallParticipantsResponse;
import io.getstream.android.video.generated.models.QueryCallSessionParticipantStatsResponse;
import io.getstream.android.video.generated.models.QueryCallSessionParticipantStatsTimelineResponse;
import io.getstream.android.video.generated.models.QueryCallSessionStatsRequest;
import io.getstream.android.video.generated.models.QueryCallSessionStatsResponse;
import io.getstream.android.video.generated.models.QueryCallStatsMapResponse;
import io.getstream.android.video.generated.models.QueryCallStatsRequest;
import io.getstream.android.video.generated.models.QueryCallStatsResponse;
import io.getstream.android.video.generated.models.QueryCallsRequest;
import io.getstream.android.video.generated.models.QueryCallsResponse;
import io.getstream.android.video.generated.models.RejectCallRequest;
import io.getstream.android.video.generated.models.RejectCallResponse;
import io.getstream.android.video.generated.models.ReportClientEventRequest;
import io.getstream.android.video.generated.models.ReportClientEventResponse;
import io.getstream.android.video.generated.models.RequestPermissionRequest;
import io.getstream.android.video.generated.models.RequestPermissionResponse;
import io.getstream.android.video.generated.models.ResolveSipAuthRequest;
import io.getstream.android.video.generated.models.ResolveSipAuthResponse;
import io.getstream.android.video.generated.models.ResolveSipInboundRequest;
import io.getstream.android.video.generated.models.ResolveSipInboundResponse;
import io.getstream.android.video.generated.models.Response;
import io.getstream.android.video.generated.models.RingCallRequest;
import io.getstream.android.video.generated.models.RingCallResponse;
import io.getstream.android.video.generated.models.SendCallEventRequest;
import io.getstream.android.video.generated.models.SendCallEventResponse;
import io.getstream.android.video.generated.models.SendReactionRequest;
import io.getstream.android.video.generated.models.SendReactionResponse;
import io.getstream.android.video.generated.models.SortParamRequest;
import io.getstream.android.video.generated.models.StartClosedCaptionsRequest;
import io.getstream.android.video.generated.models.StartClosedCaptionsResponse;
import io.getstream.android.video.generated.models.StartFrameRecordingRequest;
import io.getstream.android.video.generated.models.StartFrameRecordingResponse;
import io.getstream.android.video.generated.models.StartHLSBroadcastingResponse;
import io.getstream.android.video.generated.models.StartRTMPBroadcastsRequest;
import io.getstream.android.video.generated.models.StartRTMPBroadcastsResponse;
import io.getstream.android.video.generated.models.StartRecordingRequest;
import io.getstream.android.video.generated.models.StartRecordingResponse;
import io.getstream.android.video.generated.models.StartTranscriptionRequest;
import io.getstream.android.video.generated.models.StartTranscriptionResponse;
import io.getstream.android.video.generated.models.StopAllRTMPBroadcastsResponse;
import io.getstream.android.video.generated.models.StopClosedCaptionsRequest;
import io.getstream.android.video.generated.models.StopClosedCaptionsResponse;
import io.getstream.android.video.generated.models.StopFrameRecordingResponse;
import io.getstream.android.video.generated.models.StopHLSBroadcastingResponse;
import io.getstream.android.video.generated.models.StopLiveRequest;
import io.getstream.android.video.generated.models.StopLiveResponse;
import io.getstream.android.video.generated.models.StopRecordingResponse;
import io.getstream.android.video.generated.models.StopTranscriptionRequest;
import io.getstream.android.video.generated.models.StopTranscriptionResponse;
import io.getstream.android.video.generated.models.UnblockUserRequest;
import io.getstream.android.video.generated.models.UnblockUserResponse;
import io.getstream.android.video.generated.models.UnpinRequest;
import io.getstream.android.video.generated.models.UnpinResponse;
import io.getstream.android.video.generated.models.UpdateCallMembersRequest;
import io.getstream.android.video.generated.models.UpdateCallMembersResponse;
import io.getstream.android.video.generated.models.UpdateCallRequest;
import io.getstream.android.video.generated.models.UpdateCallResponse;
import io.getstream.android.video.generated.models.UpdateUserPermissionsRequest;
import io.getstream.android.video.generated.models.UpdateUserPermissionsResponse;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000â\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\fJ`\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\b\u001d\u0010\u001fJ:\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b#\u0010$J0\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b#\u0010%J$\u0010'\u001a\u00020&2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\b'\u0010\u001fJ.\u0010+\u001a\u00020*2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010)\u001a\u00020(H§@¢\u0006\u0004\b+\u0010,J.\u00100\u001a\u00020/2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b0\u00101J$\u00100\u001a\u00020/2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\b0\u0010\u001fJ.\u00105\u001a\u0002042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b5\u00106J$\u00105\u001a\u0002042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\b5\u0010\u001fJ.\u0010:\u001a\u0002092\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u00108\u001a\u000207H§@¢\u0006\u0004\b:\u0010;J.\u0010?\u001a\u00020>2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010=\u001a\u00020<H§@¢\u0006\u0004\b?\u0010@J$\u0010?\u001a\u00020>2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\b?\u0010\u001fJ:\u0010D\u001a\u00020C2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010B\u001a\u00020AH§@¢\u0006\u0004\bD\u0010EJ.\u0010I\u001a\u00020H2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010G\u001a\u00020FH§@¢\u0006\u0004\bI\u0010JJ$\u0010L\u001a\u00020K2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\bL\u0010\u001fJ.\u0010P\u001a\u00020O2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010N\u001a\u00020MH§@¢\u0006\u0004\bP\u0010QJ$\u0010P\u001a\u00020O2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\bP\u0010\u001fJ.\u0010U\u001a\u00020T2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0004\bU\u0010VJ$\u0010U\u001a\u00020T2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\bU\u0010\u001fJ:\u0010[\u001a\u00020Z2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010Y\u001a\u00020XH§@¢\u0006\u0004\b[\u0010\\J0\u0010[\u001a\u00020Z2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0004\b[\u0010]J.\u0010a\u001a\u00020`2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010_\u001a\u00020^H§@¢\u0006\u0004\ba\u0010bJ.\u0010f\u001a\u00020e2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010d\u001a\u00020cH§@¢\u0006\u0004\bf\u0010gJ$\u0010i\u001a\u00020h2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\bi\u0010\u001fJ8\u0010n\u001a\u00020m2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010j\u001a\u00020\r2\b\b\u0001\u0010l\u001a\u00020kH§@¢\u0006\u0004\bn\u0010oJ.\u0010n\u001a\u00020m2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010j\u001a\u00020\rH§@¢\u0006\u0004\bn\u0010%J.\u0010q\u001a\u00020p2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010j\u001a\u00020\rH§@¢\u0006\u0004\bq\u0010%J.\u0010u\u001a\u00020t2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010s\u001a\u00020rH§@¢\u0006\u0004\bu\u0010vJ$\u0010u\u001a\u00020t2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0004\bu\u0010\u001fJ0\u0010y\u001a\u00020x2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010w\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\by\u0010%J.\u0010}\u001a\u00020|2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0001\u0010{\u001a\u00020zH§@¢\u0006\u0004\b}\u0010~J3\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007fH§@¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b\u0082\u0001\u0010\u001fJ4\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010\u0085\u0001\u001a\u00030\u0084\u0001H§@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J'\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b\u008a\u0001\u0010\u001fJe\u0010\u0092\u0001\u001a\u00030\u0091\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008d\u0001\u001a\u00020\r2\f\b\u0003\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00012\f\b\u0003\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008e\u0001H§@¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001Ju\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u00112\u000b\b\u0003\u0010\u0094\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\r2\u001a\b\u0003\u0010\u0097\u0001\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0096\u0001H§@¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J'\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b\u009c\u0001\u0010\u001fJ4\u0010 \u0001\u001a\u00030\u009f\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010\u009e\u0001\u001a\u00030\u009d\u0001H§@¢\u0006\u0006\b \u0001\u0010¡\u0001J'\u0010 \u0001\u001a\u00030\u009f\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b \u0001\u0010\u001fJ4\u0010¥\u0001\u001a\u00030¤\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010£\u0001\u001a\u00030¢\u0001H§@¢\u0006\u0006\b¥\u0001\u0010¦\u0001J'\u0010¥\u0001\u001a\u00030¤\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b¥\u0001\u0010\u001fJ4\u0010ª\u0001\u001a\u00030©\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010¨\u0001\u001a\u00030§\u0001H§@¢\u0006\u0006\bª\u0001\u0010«\u0001J'\u0010ª\u0001\u001a\u00030©\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\bª\u0001\u0010\u001fJ'\u0010\u00ad\u0001\u001a\u00030¬\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b\u00ad\u0001\u0010\u001fJ4\u0010±\u0001\u001a\u00030°\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010¯\u0001\u001a\u00030®\u0001H§@¢\u0006\u0006\b±\u0001\u0010²\u0001J'\u0010±\u0001\u001a\u00030°\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b±\u0001\u0010\u001fJ'\u0010´\u0001\u001a\u00030³\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b´\u0001\u0010\u001fJ4\u0010¸\u0001\u001a\u00030·\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010¶\u0001\u001a\u00030µ\u0001H§@¢\u0006\u0006\b¸\u0001\u0010¹\u0001J'\u0010¸\u0001\u001a\u00030·\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b¸\u0001\u0010\u001fJ4\u0010½\u0001\u001a\u00030¼\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010»\u0001\u001a\u00030º\u0001H§@¢\u0006\u0006\b½\u0001\u0010¾\u0001J'\u0010½\u0001\u001a\u00030¼\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\b½\u0001\u0010\u001fJ'\u0010À\u0001\u001a\u00030¿\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0005\bÀ\u0001\u0010\u001fJ4\u0010Ä\u0001\u001a\u00030Ã\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010Â\u0001\u001a\u00030Á\u0001H§@¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J4\u0010É\u0001\u001a\u00030È\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010Ç\u0001\u001a\u00030Æ\u0001H§@¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J4\u0010Î\u0001\u001a\u00030Í\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0001\u0010Ì\u0001\u001a\u00030Ë\u0001H§@¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J>\u0010Ò\u0001\u001a\u00030Ñ\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\t\b\u0001\u0010Ð\u0001\u001a\u00020\rH§@¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J>\u0010Õ\u0001\u001a\u00030Ô\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\t\b\u0001\u0010Ð\u0001\u001a\u00020\rH§@¢\u0006\u0006\bÕ\u0001\u0010Ó\u0001J \u0010Ù\u0001\u001a\u00030Ø\u00012\n\b\u0001\u0010×\u0001\u001a\u00030Ö\u0001H§@¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J \u0010Þ\u0001\u001a\u00030Ý\u00012\n\b\u0001\u0010Ü\u0001\u001a\u00030Û\u0001H§@¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0013\u0010Þ\u0001\u001a\u00030Ý\u0001H§@¢\u0006\u0005\bÞ\u0001\u0010\fJx\u0010è\u0001\u001a\u00030ç\u00012\t\b\u0001\u0010à\u0001\u001a\u00020\r2\t\b\u0001\u0010á\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\f\b\u0003\u0010â\u0001\u001a\u0005\u0018\u00010\u008e\u00012\f\b\u0003\u0010ã\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u000b\b\u0003\u0010ä\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0003\u0010å\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0003\u0010æ\u0001\u001a\u0004\u0018\u00010\u0013H§@¢\u0006\u0006\bè\u0001\u0010é\u0001Jr\u0010ì\u0001\u001a\u00030ë\u00012\t\b\u0001\u0010à\u0001\u001a\u00020\r2\t\b\u0001\u0010á\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008d\u0001\u001a\u00020\r2\u000b\b\u0003\u0010\u008f\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0003\u0010\u0090\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0003\u0010ê\u0001\u001a\u0004\u0018\u00010\u0011H§@¢\u0006\u0006\bì\u0001\u0010í\u0001J\u008c\u0001\u0010ò\u0001\u001a\u00030ñ\u00012\t\b\u0001\u0010à\u0001\u001a\u00020\r2\t\b\u0001\u0010á\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u00112\u000b\b\u0003\u0010\u0094\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0003\u0010\u0095\u0001\u001a\u0004\u0018\u00010\r2\u0013\b\u0003\u0010ð\u0001\u001a\f\u0012\u0005\u0012\u00030ï\u0001\u0018\u00010î\u00012\u001a\b\u0003\u0010\u0097\u0001\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0096\u0001H§@¢\u0006\u0006\bò\u0001\u0010ó\u0001Jy\u0010ö\u0001\u001a\u00030õ\u00012\t\b\u0001\u0010à\u0001\u001a\u00020\r2\t\b\u0001\u0010á\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\r2\t\b\u0001\u0010\u008d\u0001\u001a\u00020\r2\u000b\b\u0003\u0010â\u0001\u001a\u0004\u0018\u00010\r2\u000b\b\u0003\u0010ã\u0001\u001a\u0004\u0018\u00010\r2\u0012\b\u0003\u0010ô\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010î\u0001H§@¢\u0006\u0006\bö\u0001\u0010÷\u0001J,\u0010û\u0001\u001a\u00030ú\u00012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010ù\u0001\u001a\u00030ø\u0001H§@¢\u0006\u0006\bû\u0001\u0010ü\u0001J \u0010û\u0001\u001a\u00030ú\u00012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0006\bû\u0001\u0010ý\u0001J\u001e\u0010ÿ\u0001\u001a\u00030þ\u00012\b\b\u0001\u0010\u000f\u001a\u00020\rH§@¢\u0006\u0006\bÿ\u0001\u0010ý\u0001J\u0013\u0010\u0081\u0002\u001a\u00030\u0080\u0002H§@¢\u0006\u0005\b\u0081\u0002\u0010\fJ \u0010\u0084\u0002\u001a\u00030þ\u00012\n\b\u0001\u0010\u0083\u0002\u001a\u00030\u0082\u0002H§@¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u0013\u0010\u0087\u0002\u001a\u00030\u0086\u0002H§@¢\u0006\u0005\b\u0087\u0002\u0010\fJ \u0010\u008b\u0002\u001a\u00030\u008a\u00022\n\b\u0001\u0010\u0089\u0002\u001a\u00030\u0088\u0002H§@¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0013\u0010\u008e\u0002\u001a\u00030\u008d\u0002H§@¢\u0006\u0005\b\u008e\u0002\u0010\fJ \u0010\u0092\u0002\u001a\u00030\u0091\u00022\n\b\u0001\u0010\u0090\u0002\u001a\u00030\u008f\u0002H§@¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J \u0010\u0097\u0002\u001a\u00030\u0096\u00022\n\b\u0001\u0010\u0095\u0002\u001a\u00030\u0094\u0002H§@¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J \u0010\u009c\u0002\u001a\u00030\u009b\u00022\n\b\u0001\u0010\u009a\u0002\u001a\u00030\u0099\u0002H§@¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J\u0013\u0010\u009c\u0002\u001a\u00030\u009b\u0002H§@¢\u0006\u0005\b\u009c\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u009e\u0002À\u0006\u0001"}, m65681d2 = {"Lio/getstream/android/video/generated/apis/ProductvideoApi;", "", "Lio/getstream/android/video/generated/models/QueryCallMembersRequest;", "queryCallMembersRequest", "Lio/getstream/android/video/generated/models/QueryCallMembersResponse;", "queryCallMembers", "(Lio/getstream/android/video/generated/models/QueryCallMembersRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/QueryCallStatsRequest;", "queryCallStatsRequest", "Lio/getstream/android/video/generated/models/QueryCallStatsResponse;", "queryCallStats", "(Lio/getstream/android/video/generated/models/QueryCallStatsRequest;Lq83/d;)Ljava/lang/Object;", "(Lq83/d;)Ljava/lang/Object;", "", "type", "id", "connectionId", "", "membersLimit", "", "ring", "notify", "video", "Lio/getstream/android/video/generated/models/GetCallResponse;", "getCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/UpdateCallRequest;", "updateCallRequest", "Lio/getstream/android/video/generated/models/UpdateCallResponse;", "updateCall", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UpdateCallRequest;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/GetOrCreateCallRequest;", "getOrCreateCallRequest", "Lio/getstream/android/video/generated/models/GetOrCreateCallResponse;", "getOrCreateCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/GetOrCreateCallRequest;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/AcceptCallResponse;", "acceptCall", "Lio/getstream/android/video/generated/models/BlockUserRequest;", "blockUserRequest", "Lio/getstream/android/video/generated/models/BlockUserResponse;", "blockUser", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/BlockUserRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/DeleteCallRequest;", "deleteCallRequest", "Lio/getstream/android/video/generated/models/DeleteCallResponse;", "deleteCall", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/DeleteCallRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/SendCallEventRequest;", "sendCallEventRequest", "Lio/getstream/android/video/generated/models/SendCallEventResponse;", "sendCallEvent", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SendCallEventRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/CollectUserFeedbackRequest;", "collectUserFeedbackRequest", "Lio/getstream/android/video/generated/models/CollectUserFeedbackResponse;", "collectUserFeedback", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CollectUserFeedbackRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/GoLiveRequest;", "goLiveRequest", "Lio/getstream/android/video/generated/models/GoLiveResponse;", "goLive", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/GoLiveRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/JoinCallRequest;", "joinCallRequest", "Lio/getstream/android/video/generated/models/JoinCallResponse;", "joinCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/JoinCallRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/KickUserRequest;", "kickUserRequest", "Lio/getstream/android/video/generated/models/KickUserResponse;", "kickUser", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/KickUserRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/EndCallResponse;", "endCall", "Lio/getstream/android/video/generated/models/UpdateCallMembersRequest;", "updateCallMembersRequest", "Lio/getstream/android/video/generated/models/UpdateCallMembersResponse;", "updateCallMembers", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UpdateCallMembersRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/MuteUsersRequest;", "muteUsersRequest", "Lio/getstream/android/video/generated/models/MuteUsersResponse;", "muteUsers", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/MuteUsersRequest;Lq83/d;)Ljava/lang/Object;", MapboxMap.QFE_LIMIT, "Lio/getstream/android/video/generated/models/QueryCallParticipantsRequest;", "queryCallParticipantsRequest", "Lio/getstream/android/video/generated/models/QueryCallParticipantsResponse;", "queryCallParticipants", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lio/getstream/android/video/generated/models/QueryCallParticipantsRequest;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/PinRequest;", "pinRequest", "Lio/getstream/android/video/generated/models/PinResponse;", "videoPin", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/PinRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/SendReactionRequest;", "sendReactionRequest", "Lio/getstream/android/video/generated/models/SendReactionResponse;", "sendVideoReaction", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/SendReactionRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/ListRecordingsResponse;", "listRecordings", "recordingType", "Lio/getstream/android/video/generated/models/StartRecordingRequest;", "startRecordingRequest", "Lio/getstream/android/video/generated/models/StartRecordingResponse;", "startRecording", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartRecordingRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StopRecordingResponse;", "stopRecording", "Lio/getstream/android/video/generated/models/RejectCallRequest;", "rejectCallRequest", "Lio/getstream/android/video/generated/models/RejectCallResponse;", "rejectCall", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RejectCallRequest;Lq83/d;)Ljava/lang/Object;", "sessionId", "Lio/getstream/android/video/generated/models/GetCallReportResponse;", "getCallReport", "Lio/getstream/android/video/generated/models/RequestPermissionRequest;", "requestPermissionRequest", "Lio/getstream/android/video/generated/models/RequestPermissionResponse;", "requestPermission", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RequestPermissionRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/RingCallRequest;", "ringCallRequest", "Lio/getstream/android/video/generated/models/RingCallResponse;", "ringCall", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/RingCallRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StartRTMPBroadcastsRequest;", "startRTMPBroadcastsRequest", "Lio/getstream/android/video/generated/models/StartRTMPBroadcastsResponse;", "startRTMPBroadcasts", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartRTMPBroadcastsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StopAllRTMPBroadcastsResponse;", "stopAllRTMPBroadcasts", "session", UserState.Sources.USER, "userSession", "Ljg3/i;", "since", "until", "Lio/getstream/android/video/generated/models/GetCallParticipantSessionMetricsResponse;", "getCallParticipantSessionMetrics", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Lq83/d;)Ljava/lang/Object;", "prev", "next", "", "filterConditions", "Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;", "queryCallParticipantSessions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StartHLSBroadcastingResponse;", "startHLSBroadcasting", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest;", "startClosedCaptionsRequest", "Lio/getstream/android/video/generated/models/StartClosedCaptionsResponse;", "startClosedCaptions", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StartFrameRecordingRequest;", "startFrameRecordingRequest", "Lio/getstream/android/video/generated/models/StartFrameRecordingResponse;", "startFrameRecording", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartFrameRecordingRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest;", "startTranscriptionRequest", "Lio/getstream/android/video/generated/models/StartTranscriptionResponse;", "startTranscription", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartTranscriptionRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StopHLSBroadcastingResponse;", "stopHLSBroadcasting", "Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;", "stopClosedCaptionsRequest", "Lio/getstream/android/video/generated/models/StopClosedCaptionsResponse;", "stopClosedCaptions", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StopClosedCaptionsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StopFrameRecordingResponse;", "stopFrameRecording", "Lio/getstream/android/video/generated/models/StopLiveRequest;", "stopLiveRequest", "Lio/getstream/android/video/generated/models/StopLiveResponse;", "stopLive", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StopLiveRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/StopTranscriptionRequest;", "stopTranscriptionRequest", "Lio/getstream/android/video/generated/models/StopTranscriptionResponse;", "stopTranscription", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/StopTranscriptionRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/ListTranscriptionsResponse;", "listTranscriptions", "Lio/getstream/android/video/generated/models/UnblockUserRequest;", "unblockUserRequest", "Lio/getstream/android/video/generated/models/UnblockUserResponse;", "unblockUser", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UnblockUserRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/UnpinRequest;", "unpinRequest", "Lio/getstream/android/video/generated/models/UnpinResponse;", "videoUnpin", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UnpinRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/UpdateUserPermissionsRequest;", "updateUserPermissionsRequest", "Lio/getstream/android/video/generated/models/UpdateUserPermissionsResponse;", "updateUserPermissions", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/UpdateUserPermissionsRequest;Lq83/d;)Ljava/lang/Object;", "filename", "Lio/getstream/android/video/generated/models/DeleteRecordingResponse;", "deleteRecording", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/DeleteTranscriptionResponse;", "deleteTranscription", "Lio/getstream/android/video/generated/models/ReportClientEventRequest;", "reportClientEventRequest", "Lio/getstream/android/video/generated/models/ReportClientEventResponse;", "reportClientCallEvent", "(Lio/getstream/android/video/generated/models/ReportClientEventRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/QueryCallSessionStatsRequest;", "queryCallSessionStatsRequest", "Lio/getstream/android/video/generated/models/QueryCallSessionStatsResponse;", "queryCallSessionStats", "(Lio/getstream/android/video/generated/models/QueryCallSessionStatsRequest;Lq83/d;)Ljava/lang/Object;", "callType", "callId", "startTime", "endTime", "excludePublishers", "excludeSubscribers", "excludeSfus", "Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;", "getCallStatsMap", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lq83/d;)Ljava/lang/Object;", "maxPoints", "Lio/getstream/android/video/generated/models/GetCallSessionParticipantStatsDetailsResponse;", "getCallSessionParticipantStatsDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;", "", "Lio/getstream/android/video/generated/models/SortParamRequest;", "sort", "Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;", "queryCallSessionParticipantStats", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "severity", "Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsTimelineResponse;", "getCallSessionParticipantStatsTimeline", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/QueryCallsRequest;", "queryCallsRequest", "Lio/getstream/android/video/generated/models/QueryCallsResponse;", "queryCalls", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/QueryCallsRequest;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/Response;", "deleteDevice", "Lio/getstream/android/video/generated/models/ListDevicesResponse;", "listDevices", "Lio/getstream/android/video/generated/models/CreateDeviceRequest;", "createDeviceRequest", "createDevice", "(Lio/getstream/android/video/generated/models/CreateDeviceRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/GetEdgesResponse;", "getEdges", "Lio/getstream/android/video/generated/models/CreateGuestRequest;", "createGuestRequest", "Lio/getstream/android/video/generated/models/CreateGuestResponse;", "createGuest", "(Lio/getstream/android/video/generated/models/CreateGuestRequest;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "videoConnect", "Lio/getstream/android/video/generated/models/ResolveSipAuthRequest;", "resolveSipAuthRequest", "Lio/getstream/android/video/generated/models/ResolveSipAuthResponse;", "resolveSipAuth", "(Lio/getstream/android/video/generated/models/ResolveSipAuthRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;", "resolveSipInboundRequest", "Lio/getstream/android/video/generated/models/ResolveSipInboundResponse;", "resolveSipInbound", "(Lio/getstream/android/video/generated/models/ResolveSipInboundRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/android/video/generated/models/QueryAggregateCallStatsRequest;", "queryAggregateCallStatsRequest", "Lio/getstream/android/video/generated/models/QueryAggregateCallStatsResponse;", "queryAggregateCallStats", "(Lio/getstream/android/video/generated/models/QueryAggregateCallStatsRequest;Lq83/d;)Ljava/lang/Object;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public interface ProductvideoApi {
    static /* synthetic */ Object getCall$default(ProductvideoApi productvideoApi, String str, String str2, String str3, Integer num, Boolean bool, Boolean bool2, Boolean bool3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCall");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            num = null;
        }
        if ((i13 & 16) != 0) {
            bool = null;
        }
        if ((i13 & 32) != 0) {
            bool2 = null;
        }
        if ((i13 & 64) != 0) {
            bool3 = null;
        }
        return productvideoApi.getCall(str, str2, str3, num, bool, bool2, bool3, interfaceC30057d);
    }

    static /* synthetic */ Object getCallParticipantSessionMetrics$default(ProductvideoApi productvideoApi, String str, String str2, String str3, String str4, String str5, C21682i c21682i, C21682i c21682i2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallParticipantSessionMetrics");
        }
        if ((i13 & 32) != 0) {
            c21682i = null;
        }
        if ((i13 & 64) != 0) {
            c21682i2 = null;
        }
        return productvideoApi.getCallParticipantSessionMetrics(str, str2, str3, str4, str5, c21682i, c21682i2, interfaceC30057d);
    }

    static /* synthetic */ Object getCallReport$default(ProductvideoApi productvideoApi, String str, String str2, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallReport");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return productvideoApi.getCallReport(str, str2, str3, interfaceC30057d);
    }

    static /* synthetic */ Object getCallSessionParticipantStatsDetails$default(ProductvideoApi productvideoApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallSessionParticipantStatsDetails");
        }
        if ((i13 & 32) != 0) {
            str6 = null;
        }
        if ((i13 & 64) != 0) {
            str7 = null;
        }
        if ((i13 & 128) != 0) {
            num = null;
        }
        return productvideoApi.getCallSessionParticipantStatsDetails(str, str2, str3, str4, str5, str6, str7, num, interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object getCallSessionParticipantStatsTimeline$default(ProductvideoApi productvideoApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallSessionParticipantStatsTimeline");
        }
        if ((i13 & 32) != 0) {
            str6 = null;
        }
        if ((i13 & 64) != 0) {
            str7 = null;
        }
        if ((i13 & 128) != 0) {
            list = null;
        }
        return productvideoApi.getCallSessionParticipantStatsTimeline(str, str2, str3, str4, str5, str6, str7, list, interfaceC30057d);
    }

    static /* synthetic */ Object getCallStatsMap$default(ProductvideoApi productvideoApi, String str, String str2, String str3, C21682i c21682i, C21682i c21682i2, Boolean bool, Boolean bool2, Boolean bool3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallStatsMap");
        }
        if ((i13 & 8) != 0) {
            c21682i = null;
        }
        if ((i13 & 16) != 0) {
            c21682i2 = null;
        }
        if ((i13 & 32) != 0) {
            bool = null;
        }
        if ((i13 & 64) != 0) {
            bool2 = null;
        }
        if ((i13 & 128) != 0) {
            bool3 = null;
        }
        return productvideoApi.getCallStatsMap(str, str2, str3, c21682i, c21682i2, bool, bool2, bool3, interfaceC30057d);
    }

    static /* synthetic */ Object getOrCreateCall$default(ProductvideoApi productvideoApi, String str, String str2, String str3, GetOrCreateCallRequest getOrCreateCallRequest, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrCreateCall");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return productvideoApi.getOrCreateCall(str, str2, str3, getOrCreateCallRequest, interfaceC30057d);
    }

    static /* synthetic */ Object joinCall$default(ProductvideoApi productvideoApi, String str, String str2, String str3, JoinCallRequest joinCallRequest, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinCall");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return productvideoApi.joinCall(str, str2, str3, joinCallRequest, interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object queryCallParticipantSessions$default(ProductvideoApi productvideoApi, String str, String str2, String str3, Integer num, String str4, String str5, Map map, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCallParticipantSessions");
        }
        if ((i13 & 8) != 0) {
            num = null;
        }
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        if ((i13 & 32) != 0) {
            str5 = null;
        }
        if ((i13 & 64) != 0) {
            map = null;
        }
        return productvideoApi.queryCallParticipantSessions(str, str2, str3, num, str4, str5, map, interfaceC30057d);
    }

    static /* synthetic */ Object queryCallParticipants$default(ProductvideoApi productvideoApi, String str, String str2, Integer num, QueryCallParticipantsRequest queryCallParticipantsRequest, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCallParticipants");
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        return productvideoApi.queryCallParticipants(str, str2, num, queryCallParticipantsRequest, interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object queryCallSessionParticipantStats$default(ProductvideoApi productvideoApi, String str, String str2, String str3, Integer num, String str4, String str5, List list, Map map, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCallSessionParticipantStats");
        }
        if ((i13 & 8) != 0) {
            num = null;
        }
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        if ((i13 & 32) != 0) {
            str5 = null;
        }
        if ((i13 & 64) != 0) {
            list = null;
        }
        if ((i13 & 128) != 0) {
            map = null;
        }
        return productvideoApi.queryCallSessionParticipantStats(str, str2, str3, num, str4, str5, list, map, interfaceC30057d);
    }

    static /* synthetic */ Object queryCalls$default(ProductvideoApi productvideoApi, String str, QueryCallsRequest queryCallsRequest, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCalls");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        return productvideoApi.queryCalls(str, queryCallsRequest, interfaceC30057d);
    }

    @InterfaceC37284o("/video/call/{type}/{id}/accept")
    Object acceptCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super AcceptCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/block")
    Object blockUser(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a BlockUserRequest blockUserRequest, InterfaceC30057d<? super BlockUserResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/feedback")
    Object collectUserFeedback(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a CollectUserFeedbackRequest collectUserFeedbackRequest, InterfaceC30057d<? super CollectUserFeedbackResponse> interfaceC30057d);

    @InterfaceC37284o("/video/devices")
    Object createDevice(@InterfaceC37270a CreateDeviceRequest createDeviceRequest, InterfaceC30057d<? super Response> interfaceC30057d);

    @InterfaceC37284o("/video/guest")
    Object createGuest(@InterfaceC37270a CreateGuestRequest createGuestRequest, InterfaceC30057d<? super CreateGuestResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/delete")
    Object deleteCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a DeleteCallRequest deleteCallRequest, InterfaceC30057d<? super DeleteCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/delete")
    Object deleteCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super DeleteCallResponse> interfaceC30057d);

    @InterfaceC37271b("/video/devices")
    Object deleteDevice(@InterfaceC37289t("id") String str, InterfaceC30057d<? super Response> interfaceC30057d);

    @InterfaceC37271b("/video/call/{type}/{id}/{session}/recordings/{filename}")
    Object deleteRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37288s("filename") String str4, InterfaceC30057d<? super DeleteRecordingResponse> interfaceC30057d);

    @InterfaceC37271b("/video/call/{type}/{id}/{session}/transcriptions/{filename}")
    Object deleteTranscription(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37288s("filename") String str4, InterfaceC30057d<? super DeleteTranscriptionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/mark_ended")
    Object endCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super EndCallResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}")
    Object getCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37289t(QueryParams.CONNECTION_ID) String str3, @InterfaceC37289t("members_limit") Integer num, @InterfaceC37289t("ring") Boolean bool, @InterfaceC37289t("notify") Boolean bool2, @InterfaceC37289t("video") Boolean bool3, InterfaceC30057d<? super GetCallResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}/session/{session}/participant/{user}/{user_session}/details/track")
    Object getCallParticipantSessionMetrics(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37288s(UserState.Sources.USER) String str4, @InterfaceC37288s("user_session") String str5, @InterfaceC37289t("since") C21682i c21682i, @InterfaceC37289t("until") C21682i c21682i2, InterfaceC30057d<? super GetCallParticipantSessionMetricsResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}/report")
    Object getCallReport(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37289t("session_id") String str3, InterfaceC30057d<? super GetCallReportResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call_stats/{call_type}/{call_id}/{session}/participant/{user}/{user_session}/details")
    Object getCallSessionParticipantStatsDetails(@InterfaceC37288s("call_type") String str, @InterfaceC37288s("call_id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37288s(UserState.Sources.USER) String str4, @InterfaceC37288s("user_session") String str5, @InterfaceC37289t("since") String str6, @InterfaceC37289t("until") String str7, @InterfaceC37289t("max_points") Integer num, InterfaceC30057d<? super GetCallSessionParticipantStatsDetailsResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call_stats/{call_type}/{call_id}/{session}/participants/{user}/{user_session}/timeline")
    Object getCallSessionParticipantStatsTimeline(@InterfaceC37288s("call_type") String str, @InterfaceC37288s("call_id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37288s(UserState.Sources.USER) String str4, @InterfaceC37288s("user_session") String str5, @InterfaceC37289t("start_time") String str6, @InterfaceC37289t("end_time") String str7, @InterfaceC37289t("severity") List<String> list, InterfaceC30057d<? super QueryCallSessionParticipantStatsTimelineResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call_stats/{call_type}/{call_id}/{session}/map")
    Object getCallStatsMap(@InterfaceC37288s("call_type") String str, @InterfaceC37288s("call_id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37289t("start_time") C21682i c21682i, @InterfaceC37289t("end_time") C21682i c21682i2, @InterfaceC37289t("exclude_publishers") Boolean bool, @InterfaceC37289t("exclude_subscribers") Boolean bool2, @InterfaceC37289t("exclude_sfus") Boolean bool3, InterfaceC30057d<? super QueryCallStatsMapResponse> interfaceC30057d);

    @InterfaceC37275f("/video/edges")
    Object getEdges(InterfaceC30057d<? super GetEdgesResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}")
    Object getOrCreateCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37289t(QueryParams.CONNECTION_ID) String str3, @InterfaceC37270a GetOrCreateCallRequest getOrCreateCallRequest, InterfaceC30057d<? super GetOrCreateCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}")
    Object getOrCreateCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37289t(QueryParams.CONNECTION_ID) String str3, InterfaceC30057d<? super GetOrCreateCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/go_live")
    Object goLive(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a GoLiveRequest goLiveRequest, InterfaceC30057d<? super GoLiveResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/go_live")
    Object goLive(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super GoLiveResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/join")
    Object joinCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37289t(QueryParams.CONNECTION_ID) String str3, @InterfaceC37270a JoinCallRequest joinCallRequest, InterfaceC30057d<? super JoinCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/kick")
    Object kickUser(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a KickUserRequest kickUserRequest, InterfaceC30057d<? super KickUserResponse> interfaceC30057d);

    @InterfaceC37275f("/video/devices")
    Object listDevices(InterfaceC30057d<? super ListDevicesResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}/recordings")
    Object listRecordings(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super ListRecordingsResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}/transcriptions")
    Object listTranscriptions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super ListTranscriptionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/mute_users")
    Object muteUsers(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a MuteUsersRequest muteUsersRequest, InterfaceC30057d<? super MuteUsersResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/mute_users")
    Object muteUsers(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super MuteUsersResponse> interfaceC30057d);

    @InterfaceC37284o("/video/stats")
    Object queryAggregateCallStats(@InterfaceC37270a QueryAggregateCallStatsRequest queryAggregateCallStatsRequest, InterfaceC30057d<? super QueryAggregateCallStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/stats")
    Object queryAggregateCallStats(InterfaceC30057d<? super QueryAggregateCallStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/members")
    Object queryCallMembers(@InterfaceC37270a QueryCallMembersRequest queryCallMembersRequest, InterfaceC30057d<? super QueryCallMembersResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call/{type}/{id}/session/{session}/participant_sessions")
    Object queryCallParticipantSessions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37289t(MapboxMap.QFE_LIMIT) Integer num, @InterfaceC37289t("prev") String str4, @InterfaceC37289t("next") String str5, @InterfaceC37289t("filter_conditions") Map<String, ? extends Object> map, InterfaceC30057d<? super QueryCallParticipantSessionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/participants")
    Object queryCallParticipants(@InterfaceC37288s("id") String str, @InterfaceC37288s("type") String str2, @InterfaceC37289t(MapboxMap.QFE_LIMIT) Integer num, @InterfaceC37270a QueryCallParticipantsRequest queryCallParticipantsRequest, InterfaceC30057d<? super QueryCallParticipantsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/participants")
    Object queryCallParticipants(@InterfaceC37288s("id") String str, @InterfaceC37288s("type") String str2, @InterfaceC37289t(MapboxMap.QFE_LIMIT) Integer num, InterfaceC30057d<? super QueryCallParticipantsResponse> interfaceC30057d);

    @InterfaceC37275f("/video/call_stats/{call_type}/{call_id}/{session}/participants")
    Object queryCallSessionParticipantStats(@InterfaceC37288s("call_type") String str, @InterfaceC37288s("call_id") String str2, @InterfaceC37288s("session") String str3, @InterfaceC37289t(MapboxMap.QFE_LIMIT) Integer num, @InterfaceC37289t("prev") String str4, @InterfaceC37289t("next") String str5, @InterfaceC37289t("sort") List<SortParamRequest> list, @InterfaceC37289t("filter_conditions") Map<String, ? extends Object> map, InterfaceC30057d<? super QueryCallSessionParticipantStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call_stats")
    Object queryCallSessionStats(@InterfaceC37270a QueryCallSessionStatsRequest queryCallSessionStatsRequest, InterfaceC30057d<? super QueryCallSessionStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call_stats")
    Object queryCallSessionStats(InterfaceC30057d<? super QueryCallSessionStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/stats")
    Object queryCallStats(@InterfaceC37270a QueryCallStatsRequest queryCallStatsRequest, InterfaceC30057d<? super QueryCallStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/stats")
    Object queryCallStats(InterfaceC30057d<? super QueryCallStatsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/calls")
    Object queryCalls(@InterfaceC37289t(QueryParams.CONNECTION_ID) String str, @InterfaceC37270a QueryCallsRequest queryCallsRequest, InterfaceC30057d<? super QueryCallsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/calls")
    Object queryCalls(@InterfaceC37289t(QueryParams.CONNECTION_ID) String str, InterfaceC30057d<? super QueryCallsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/reject")
    Object rejectCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a RejectCallRequest rejectCallRequest, InterfaceC30057d<? super RejectCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/reject")
    Object rejectCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super RejectCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call_client_event")
    Object reportClientCallEvent(@InterfaceC37270a ReportClientEventRequest reportClientEventRequest, InterfaceC30057d<? super ReportClientEventResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/request_permission")
    Object requestPermission(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a RequestPermissionRequest requestPermissionRequest, InterfaceC30057d<? super RequestPermissionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/sip/auth")
    Object resolveSipAuth(@InterfaceC37270a ResolveSipAuthRequest resolveSipAuthRequest, InterfaceC30057d<? super ResolveSipAuthResponse> interfaceC30057d);

    @InterfaceC37284o("/video/sip/resolve")
    Object resolveSipInbound(@InterfaceC37270a ResolveSipInboundRequest resolveSipInboundRequest, InterfaceC30057d<? super ResolveSipInboundResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/ring")
    Object ringCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a RingCallRequest ringCallRequest, InterfaceC30057d<? super RingCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/ring")
    Object ringCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super RingCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/event")
    Object sendCallEvent(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a SendCallEventRequest sendCallEventRequest, InterfaceC30057d<? super SendCallEventResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/event")
    Object sendCallEvent(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super SendCallEventResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/reaction")
    Object sendVideoReaction(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a SendReactionRequest sendReactionRequest, InterfaceC30057d<? super SendReactionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_closed_captions")
    Object startClosedCaptions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StartClosedCaptionsRequest startClosedCaptionsRequest, InterfaceC30057d<? super StartClosedCaptionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_closed_captions")
    Object startClosedCaptions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StartClosedCaptionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_frame_recording")
    Object startFrameRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StartFrameRecordingRequest startFrameRecordingRequest, InterfaceC30057d<? super StartFrameRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_frame_recording")
    Object startFrameRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StartFrameRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_broadcasting")
    Object startHLSBroadcasting(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StartHLSBroadcastingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/rtmp_broadcasts")
    Object startRTMPBroadcasts(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StartRTMPBroadcastsRequest startRTMPBroadcastsRequest, InterfaceC30057d<? super StartRTMPBroadcastsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/recordings/{recording_type}/start")
    Object startRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("recording_type") String str3, @InterfaceC37270a StartRecordingRequest startRecordingRequest, InterfaceC30057d<? super StartRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/recordings/{recording_type}/start")
    Object startRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("recording_type") String str3, InterfaceC30057d<? super StartRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_transcription")
    Object startTranscription(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StartTranscriptionRequest startTranscriptionRequest, InterfaceC30057d<? super StartTranscriptionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/start_transcription")
    Object startTranscription(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StartTranscriptionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/rtmp_broadcasts/stop")
    Object stopAllRTMPBroadcasts(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopAllRTMPBroadcastsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_closed_captions")
    Object stopClosedCaptions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StopClosedCaptionsRequest stopClosedCaptionsRequest, InterfaceC30057d<? super StopClosedCaptionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_closed_captions")
    Object stopClosedCaptions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopClosedCaptionsResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_frame_recording")
    Object stopFrameRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopFrameRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_broadcasting")
    Object stopHLSBroadcasting(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopHLSBroadcastingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_live")
    Object stopLive(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StopLiveRequest stopLiveRequest, InterfaceC30057d<? super StopLiveResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_live")
    Object stopLive(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopLiveResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/recordings/{recording_type}/stop")
    Object stopRecording(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37288s("recording_type") String str3, InterfaceC30057d<? super StopRecordingResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_transcription")
    Object stopTranscription(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a StopTranscriptionRequest stopTranscriptionRequest, InterfaceC30057d<? super StopTranscriptionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/stop_transcription")
    Object stopTranscription(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super StopTranscriptionResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/unblock")
    Object unblockUser(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a UnblockUserRequest unblockUserRequest, InterfaceC30057d<? super UnblockUserResponse> interfaceC30057d);

    @InterfaceC37283n("/video/call/{type}/{id}")
    Object updateCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a UpdateCallRequest updateCallRequest, InterfaceC30057d<? super UpdateCallResponse> interfaceC30057d);

    @InterfaceC37283n("/video/call/{type}/{id}")
    Object updateCall(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super UpdateCallResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/members")
    Object updateCallMembers(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a UpdateCallMembersRequest updateCallMembersRequest, InterfaceC30057d<? super UpdateCallMembersResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/members")
    Object updateCallMembers(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, InterfaceC30057d<? super UpdateCallMembersResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/user_permissions")
    Object updateUserPermissions(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a UpdateUserPermissionsRequest updateUserPermissionsRequest, InterfaceC30057d<? super UpdateUserPermissionsResponse> interfaceC30057d);

    @InterfaceC37275f("/video/longpoll")
    Object videoConnect(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/pin")
    Object videoPin(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a PinRequest pinRequest, InterfaceC30057d<? super PinResponse> interfaceC30057d);

    @InterfaceC37284o("/video/call/{type}/{id}/unpin")
    Object videoUnpin(@InterfaceC37288s("type") String str, @InterfaceC37288s("id") String str2, @InterfaceC37270a UnpinRequest unpinRequest, InterfaceC30057d<? super UnpinResponse> interfaceC30057d);

    static /* synthetic */ Object getOrCreateCall$default(ProductvideoApi productvideoApi, String str, String str2, String str3, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrCreateCall");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        return productvideoApi.getOrCreateCall(str, str2, str3, interfaceC30057d);
    }

    static /* synthetic */ Object queryCallParticipants$default(ProductvideoApi productvideoApi, String str, String str2, Integer num, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCallParticipants");
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        return productvideoApi.queryCallParticipants(str, str2, num, interfaceC30057d);
    }

    static /* synthetic */ Object queryCalls$default(ProductvideoApi productvideoApi, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryCalls");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        return productvideoApi.queryCalls(str, interfaceC30057d);
    }
}
