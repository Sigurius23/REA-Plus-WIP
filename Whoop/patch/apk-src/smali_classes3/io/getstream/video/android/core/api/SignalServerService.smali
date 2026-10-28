.class public interface abstract Lio/getstream/video/android/core/api/SignalServerService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0008\u0008\u0001\u0010!\u001a\u00020 H\u00a7@\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010(\u001a\u00020\'2\u0008\u0008\u0001\u0010&\u001a\u00020%H\u00a7@\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010-\u001a\u00020,2\u0008\u0008\u0001\u0010+\u001a\u00020*H\u00a7@\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u0008\u0001\u00100\u001a\u00020/H\u00a7@\u00a2\u0006\u0004\u00082\u00103\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00064\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/video/android/core/api/SignalServerService;",
        "",
        "Lstream/video/sfu/signal/SetPublisherRequest;",
        "setPublisherRequest",
        "Lstream/video/sfu/signal/SetPublisherResponse;",
        "setPublisher",
        "(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/SendAnswerRequest;",
        "sendAnswerRequest",
        "Lstream/video/sfu/signal/SendAnswerResponse;",
        "sendAnswer",
        "(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/models/ICETrickle;",
        "iCETrickle",
        "Lstream/video/sfu/signal/ICETrickleResponse;",
        "iceTrickle",
        "(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/UpdateSubscriptionsRequest;",
        "updateSubscriptionsRequest",
        "Lstream/video/sfu/signal/UpdateSubscriptionsResponse;",
        "updateSubscriptions",
        "(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/UpdateMuteStatesRequest;",
        "updateMuteStatesRequest",
        "Lstream/video/sfu/signal/UpdateMuteStatesResponse;",
        "updateMuteStates",
        "(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/ICERestartRequest;",
        "iCERestartRequest",
        "Lstream/video/sfu/signal/ICERestartResponse;",
        "iceRestart",
        "(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/SendStatsRequest;",
        "sendStatsRequest",
        "Lstream/video/sfu/signal/SendStatsResponse;",
        "sendStats",
        "(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/SendMetricsRequest;",
        "sendMetricsRequest",
        "Lstream/video/sfu/signal/SendMetricsResponse;",
        "sendMetrics",
        "(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/StartNoiseCancellationRequest;",
        "startNoiseCancellationRequest",
        "Lstream/video/sfu/signal/StartNoiseCancellationResponse;",
        "startNoiseCancellation",
        "(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;",
        "Lstream/video/sfu/signal/StopNoiseCancellationRequest;",
        "stopNoiseCancellationRequest",
        "Lstream/video/sfu/signal/StopNoiseCancellationResponse;",
        "stopNoiseCancellation",
        "(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract iceRestart(Lstream/video/sfu/signal/ICERestartRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/ICERestartRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/ICERestartRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/ICERestartResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/IceRestart"
    .end annotation
.end method

.method public abstract iceTrickle(Lstream/video/sfu/models/ICETrickle;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/models/ICETrickle;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/models/ICETrickle;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/ICETrickleResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/IceTrickle"
    .end annotation
.end method

.method public abstract sendAnswer(Lstream/video/sfu/signal/SendAnswerRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/SendAnswerRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/SendAnswerRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/SendAnswerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/SendAnswer"
    .end annotation
.end method

.method public abstract sendMetrics(Lstream/video/sfu/signal/SendMetricsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/SendMetricsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/SendMetricsRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/SendMetricsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/SendMetrics"
    .end annotation
.end method

.method public abstract sendStats(Lstream/video/sfu/signal/SendStatsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/SendStatsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/SendStatsRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/SendStatsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/SendStats"
    .end annotation
.end method

.method public abstract setPublisher(Lstream/video/sfu/signal/SetPublisherRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/SetPublisherRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/SetPublisherRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/SetPublisherResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/SetPublisher"
    .end annotation
.end method

.method public abstract startNoiseCancellation(Lstream/video/sfu/signal/StartNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/StartNoiseCancellationRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/StartNoiseCancellationRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/StartNoiseCancellationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/StartNoiseCancellation"
    .end annotation
.end method

.method public abstract stopNoiseCancellation(Lstream/video/sfu/signal/StopNoiseCancellationRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/StopNoiseCancellationRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/StopNoiseCancellationRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/StopNoiseCancellationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/StopNoiseCancellation"
    .end annotation
.end method

.method public abstract updateMuteStates(Lstream/video/sfu/signal/UpdateMuteStatesRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/UpdateMuteStatesRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/UpdateMuteStatesRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/UpdateMuteStatesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/UpdateMuteStates"
    .end annotation
.end method

.method public abstract updateSubscriptions(Lstream/video/sfu/signal/UpdateSubscriptionsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lstream/video/sfu/signal/UpdateSubscriptionsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lstream/video/sfu/signal/UpdateSubscriptionsRequest;",
            "Lq83/d<",
            "-",
            "Lstream/video/sfu/signal/UpdateSubscriptionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/k;
        value = {
            "Content-Type: application/protobuf"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/twirp/stream.video.sfu.signal.SignalServer/UpdateSubscriptions"
    .end annotation
.end method
