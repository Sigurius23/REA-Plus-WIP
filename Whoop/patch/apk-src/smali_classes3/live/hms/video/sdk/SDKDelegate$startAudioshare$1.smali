.class final Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->startAudioshare(Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)V
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
    c = "live.hms.video.sdk.SDKDelegate$startAudioshare$1"
    f = "SDKDelegate.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

.field final synthetic $mediaProjectionPermissionResultData:Landroid/content/Intent;

.field final synthetic $resultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $screenShareNotification:Landroid/app/Notification;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Landroid/content/Intent;",
            "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
            "Landroid/app/Notification;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iput-object p4, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    iput-object p5, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$screenShareNotification:Landroid/app/Notification;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    iget-object v5, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$screenShareNotification:Landroid/app/Notification;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSActionResultListener;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->label:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKDelegate;->isAudioShared()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$mediaProjectionPermissionResultData:Landroid/content/Intent;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$audioMixingMode:Llive/hms/video/sdk/models/enums/AudioMixingMode;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$screenShareNotification:Landroid/app/Notification;

    :try_start_0
    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v3

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getApplicationContext$p(Llive/hms/video/sdk/SDKDelegate;)Landroid/content/Context;

    move-result-object v4

    invoke-interface {v3, v4, v0, v1, v2}, Llive/hms/video/transport/ITransport;->getAudioShareCapturer(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/sdk/SDKDelegate;->access$setAudioShareCapturer$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/media/capturers/HMSCapturer;)V

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getAudioShareCapturer$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Llive/hms/video/media/capturers/HMSCapturer;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_1
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_1

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Llive/hms/video/sdk/SDKDelegate;->setAudioShared(Z)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/SDKDelegate;->setAudioShared(Z)V

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$startAudioshare$1;->$resultListener:Llive/hms/video/sdk/HMSActionResultListener;

    sget-object v1, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/UnknownError;

    invoke-direct {p1}, Ljava/lang/UnknownError;-><init>()V

    :cond_2
    move-object v4, p1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v3, "Failed to share audio"

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
