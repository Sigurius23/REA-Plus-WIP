.class public final Llive/hms/video/connection/HMSConnection$createOffer$2;
.super Llive/hms/video/connection/helpers/HMSSdpObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/HMSConnection;->createOffer(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/connection/HMSConnection$createOffer$2",
        "Llive/hms/video/connection/helpers/HMSSdpObserver;",
        "Lhms/webrtc/SessionDescription;",
        "sdp",
        "Ll83/a0;",
        "onCreateSuccess",
        "(Lhms/webrtc/SessionDescription;)V",
        "",
        "error",
        "onCreateFailure",
        "(Ljava/lang/String;)V",
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


# instance fields
.field final synthetic $deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/connection/HMSConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/HMSConnection;Lbc3/s;Llive/hms/video/connection/models/HMSConnectionRole;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/HMSConnection;",
            "Lbc3/s;",
            "Llive/hms/video/connection/models/HMSConnectionRole;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->this$0:Llive/hms/video/connection/HMSConnection;

    iput-object p2, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->$deferred:Lbc3/s;

    invoke-direct {p0, p3}, Llive/hms/video/connection/helpers/HMSSdpObserver;-><init>(Llive/hms/video/connection/models/HMSConnectionRole;)V

    return-void
.end method


# virtual methods
.method public onCreateFailure(Ljava/lang/String;)V
    .locals 8

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failed to create offer : "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSSdpObserver"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSSdpObserver;->onCreateFailure(Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->$deferred:Lbc3/s;

    sget-object v1, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebrtcErrors;

    iget-object v2, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->this$0:Llive/hms/video/connection/HMSConnection;

    invoke-static {v2}, Llive/hms/video/connection/HMSConnection;->access$getAction$p(Llive/hms/video/connection/HMSConnection;)Llive/hms/video/error/ErrorFactory$Action;

    move-result-object v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$WebrtcErrors;->CreateOfferFailed$default(Llive/hms/video/error/ErrorFactory$WebrtcErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onCreateSuccess(Lhms/webrtc/SessionDescription;)V
    .locals 2

    const-string v0, "sdp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "HMSSdpObserver"

    const-string v1, "offer created successfully"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSSdpObserver;->onCreateSuccess(Lhms/webrtc/SessionDescription;)V

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->this$0:Llive/hms/video/connection/HMSConnection;

    invoke-static {v0, p1}, Llive/hms/video/connection/HMSConnection;->access$enableOpusDtx(Llive/hms/video/connection/HMSConnection;Lhms/webrtc/SessionDescription;)Lhms/webrtc/SessionDescription;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/connection/HMSConnection$createOffer$2;->$deferred:Lbc3/s;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method
