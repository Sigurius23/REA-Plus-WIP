.class final Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->startScreenshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Landroid/app/Notification;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.SDKDelegate$startScreenshare$1"
    f = "SDKDelegate.kt"
    l = {
        0x347,
        0x34f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $mediaProjectionPermissionResultData:Landroid/content/Intent;

.field final synthetic $resultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $screenShareNotification:Landroid/app/Notification;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Landroid/content/Intent;Landroid/app/Notification;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Landroid/content/Intent;",
            "Landroid/app/Notification;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$screenShareNotification:Landroid/app/Notification;

    iput-object p4, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$screenShareNotification:Landroid/app/Notification;

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Landroid/content/Intent;Landroid/app/Notification;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object p1

    new-instance v1, Llive/hms/video/media/settings/HMSTrackSettings$Builder;

    invoke-direct {v1}, Llive/hms/video/media/settings/HMSTrackSettings$Builder;-><init>()V

    new-instance v4, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    invoke-direct {v4}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;-><init>()V

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Llive/hms/video/sdk/models/role/PublishParams;->getScreen()Llive/hms/video/sdk/models/role/VideoParams;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Llive/hms/video/sdk/models/role/VideoParams;->getFrameRate()I

    move-result v5

    goto :goto_0

    :cond_3
    const/16 v5, 0x1e

    :goto_0
    invoke-virtual {v4, v5}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->maxFrameRate(I)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object v4

    new-instance v5, Llive/hms/video/media/settings/HMSVideoResolution;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Llive/hms/video/sdk/models/role/PublishParams;->getScreen()Llive/hms/video/sdk/models/role/VideoParams;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Llive/hms/video/sdk/models/role/VideoParams;->getWidth()I

    move-result v6

    goto :goto_1

    :cond_4
    const/16 v6, 0x780

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/HMSRole;->getPublishParams()Llive/hms/video/sdk/models/role/PublishParams;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/PublishParams;->getScreen()Llive/hms/video/sdk/models/role/VideoParams;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Llive/hms/video/sdk/models/role/VideoParams;->getHeight()I

    move-result p1

    goto :goto_2

    :cond_5
    const/16 p1, 0x438

    :goto_2
    invoke-direct {v5, v6, p1}, Llive/hms/video/media/settings/HMSVideoResolution;-><init>(II)V

    invoke-virtual {v4, v5}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->resolution(Llive/hms/video/media/settings/HMSVideoResolution;)Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object p1

    invoke-virtual {v1, p1}, Llive/hms/video/media/settings/HMSTrackSettings$Builder;->video(Llive/hms/video/media/settings/HMSVideoTrackSettings;)Llive/hms/video/media/settings/HMSTrackSettings$Builder;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSTrackSettings$Builder;->build()Llive/hms/video/media/settings/HMSTrackSettings;

    move-result-object v6

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v4

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getApplicationContext$p(Llive/hms/video/sdk/SDKDelegate;)Landroid/content/Context;

    move-result-object v5

    iget-object v7, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iget-object v8, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$screenShareNotification:Landroid/app/Notification;

    iput v3, p0, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->label:I

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Llive/hms/video/transport/ITransport;->getScreenShareTrack(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    check-cast p1, Llive/hms/video/media/tracks/HMSTrack;

    if-eqz p1, :cond_7

    iget-object v1, v9, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v3, v9, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    move-object v4, p1

    check-cast v4, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v4}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getCapturer$lib_release()Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object v4

    invoke-interface {v4}, Llive/hms/video/media/capturers/HMSCapturer;->start()V

    iput v2, v9, Llive/hms/video/sdk/SDKDelegate$startScreenshare$1;->label:I

    invoke-static {v1, p1, v3, p0}, Llive/hms/video/sdk/SDKDelegate;->access$publishScreenShareTrack(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_4
    return-object v0

    :cond_7
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
