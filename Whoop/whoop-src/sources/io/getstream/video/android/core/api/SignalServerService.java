package io.getstream.video.android.core.api;

import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import stream.video.sfu.models.ICETrickle;
import stream.video.sfu.signal.ICERestartRequest;
import stream.video.sfu.signal.ICERestartResponse;
import stream.video.sfu.signal.ICETrickleResponse;
import stream.video.sfu.signal.SendAnswerRequest;
import stream.video.sfu.signal.SendAnswerResponse;
import stream.video.sfu.signal.SendMetricsRequest;
import stream.video.sfu.signal.SendMetricsResponse;
import stream.video.sfu.signal.SendStatsRequest;
import stream.video.sfu.signal.SendStatsResponse;
import stream.video.sfu.signal.SetPublisherRequest;
import stream.video.sfu.signal.SetPublisherResponse;
import stream.video.sfu.signal.StartNoiseCancellationRequest;
import stream.video.sfu.signal.StartNoiseCancellationResponse;
import stream.video.sfu.signal.StopNoiseCancellationRequest;
import stream.video.sfu.signal.StopNoiseCancellationResponse;
import stream.video.sfu.signal.UpdateMuteStatesRequest;
import stream.video.sfu.signal.UpdateMuteStatesResponse;
import stream.video.sfu.signal.UpdateSubscriptionsRequest;
import stream.video.sfu.signal.UpdateSubscriptionsResponse;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37280k;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, m65681d2 = {"Lio/getstream/video/android/core/api/SignalServerService;", "", "Lstream/video/sfu/signal/SetPublisherRequest;", "setPublisherRequest", "Lstream/video/sfu/signal/SetPublisherResponse;", "setPublisher", "(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/SendAnswerRequest;", "sendAnswerRequest", "Lstream/video/sfu/signal/SendAnswerResponse;", "sendAnswer", "(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/models/ICETrickle;", "iCETrickle", "Lstream/video/sfu/signal/ICETrickleResponse;", "iceTrickle", "(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/UpdateSubscriptionsRequest;", "updateSubscriptionsRequest", "Lstream/video/sfu/signal/UpdateSubscriptionsResponse;", "updateSubscriptions", "(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/UpdateMuteStatesRequest;", "updateMuteStatesRequest", "Lstream/video/sfu/signal/UpdateMuteStatesResponse;", "updateMuteStates", "(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/ICERestartRequest;", "iCERestartRequest", "Lstream/video/sfu/signal/ICERestartResponse;", "iceRestart", "(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/SendStatsRequest;", "sendStatsRequest", "Lstream/video/sfu/signal/SendStatsResponse;", "sendStats", "(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/SendMetricsRequest;", "sendMetricsRequest", "Lstream/video/sfu/signal/SendMetricsResponse;", "sendMetrics", "(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/StartNoiseCancellationRequest;", "startNoiseCancellationRequest", "Lstream/video/sfu/signal/StartNoiseCancellationResponse;", "startNoiseCancellation", "(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;", "Lstream/video/sfu/signal/StopNoiseCancellationRequest;", "stopNoiseCancellationRequest", "Lstream/video/sfu/signal/StopNoiseCancellationResponse;", "stopNoiseCancellation", "(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public interface SignalServerService {
    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/IceRestart")
    Object iceRestart(@InterfaceC37270a ICERestartRequest iCERestartRequest, InterfaceC30057d<? super ICERestartResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/IceTrickle")
    Object iceTrickle(@InterfaceC37270a ICETrickle iCETrickle, InterfaceC30057d<? super ICETrickleResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/SendAnswer")
    Object sendAnswer(@InterfaceC37270a SendAnswerRequest sendAnswerRequest, InterfaceC30057d<? super SendAnswerResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/SendMetrics")
    Object sendMetrics(@InterfaceC37270a SendMetricsRequest sendMetricsRequest, InterfaceC30057d<? super SendMetricsResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/SendStats")
    Object sendStats(@InterfaceC37270a SendStatsRequest sendStatsRequest, InterfaceC30057d<? super SendStatsResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/SetPublisher")
    Object setPublisher(@InterfaceC37270a SetPublisherRequest setPublisherRequest, InterfaceC30057d<? super SetPublisherResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/StartNoiseCancellation")
    Object startNoiseCancellation(@InterfaceC37270a StartNoiseCancellationRequest startNoiseCancellationRequest, InterfaceC30057d<? super StartNoiseCancellationResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/StopNoiseCancellation")
    Object stopNoiseCancellation(@InterfaceC37270a StopNoiseCancellationRequest stopNoiseCancellationRequest, InterfaceC30057d<? super StopNoiseCancellationResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/UpdateMuteStates")
    Object updateMuteStates(@InterfaceC37270a UpdateMuteStatesRequest updateMuteStatesRequest, InterfaceC30057d<? super UpdateMuteStatesResponse> interfaceC30057d);

    @InterfaceC37280k({"Content-Type: application/protobuf"})
    @InterfaceC37284o("/twirp/stream.video.sfu.signal.SignalServer/UpdateSubscriptions")
    Object updateSubscriptions(@InterfaceC37270a UpdateSubscriptionsRequest updateSubscriptionsRequest, InterfaceC30057d<? super UpdateSubscriptionsResponse> interfaceC30057d);
}
