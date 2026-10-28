.class public interface abstract Llive/hms/video/signal/ISignalEventsObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/signal/ISignalEventsObserver;",
        "",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "jsep",
        "Ll83/a0;",
        "onOffer",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/connection/models/HMSTrickle;",
        "trickle",
        "onTrickle",
        "(Llive/hms/video/connection/models/HMSTrickle;)V",
        "Lcom/google/gson/JsonObject;",
        "message",
        "onNotification",
        "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onServerError",
        "(Llive/hms/video/error/HMSException;)V",
        "exception",
        "onFailure",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
        "tfc",
        "Lbc3/s;",
        "",
        "getDependency",
        "(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Lq83/d<",
            "-",
            "Lbc3/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onFailure(Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onOffer(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onServerError(Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onTrickle(Llive/hms/video/connection/models/HMSTrickle;)V
.end method
