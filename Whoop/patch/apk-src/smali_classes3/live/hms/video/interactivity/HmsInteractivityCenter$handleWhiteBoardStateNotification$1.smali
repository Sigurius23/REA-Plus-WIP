.class final Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/interactivity/HmsInteractivityCenter;->handleWhiteBoardStateNotification$lib_release(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;)V
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
    c = "live.hms.video.interactivity.HmsInteractivityCenter$handleWhiteBoardStateNotification$1"
    f = "HmsInteractivityCenter.kt"
    l = {
        0x255
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $isOpen:Z

.field final synthetic $isOwner:Z

.field final synthetic $params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

.field label:I

.field final synthetic this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;Llive/hms/video/interactivity/HmsInteractivityCenter;ZZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;",
            "Llive/hms/video/interactivity/HmsInteractivityCenter;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    iput-object p2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iput-boolean p3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOpen:Z

    iput-boolean p4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOwner:Z

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

    new-instance v0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-boolean v3, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOpen:Z

    iget-boolean v4, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOwner:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;-><init>(Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;Llive/hms/video/interactivity/HmsInteractivityCenter;ZZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->label:I

    const/4 v2, 0x1

    const-string v3, ""

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    :try_start_1
    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getGetWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Lc93/m;

    move-result-object p1

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v1, v3

    :cond_2
    iput v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->label:I

    invoke-interface {p1, v1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_13

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v5, v3

    goto :goto_3

    :cond_4
    move-object v5, v1

    :goto_3
    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getTitle()Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {v1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getSdkStore$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$params:Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$WhiteboardInfo;->getOwner()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    move-object v2, v3

    :cond_5
    invoke-virtual {v1, v2}, Llive/hms/video/sdk/SDKStore;->getPeerByCustomerUserId(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v7

    iget-object v1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    move-object v4, v2

    goto :goto_4

    :cond_6
    move-object v4, p1

    :goto_4
    check-cast v4, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getAddr()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_7
    move-object v4, v2

    :goto_5
    if-nez v4, :cond_8

    move-object v4, v3

    :cond_8
    if-eqz v0, :cond_9

    move-object p1, v2

    :cond_9
    check-cast p1, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;->getToken()Ljava/lang/String;

    move-result-object v2

    :cond_a
    if-nez v2, :cond_b

    goto :goto_6

    :cond_b
    move-object v3, v2

    :goto_6
    invoke-static {v1, v4, v3}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$formatWhiteBoardUrl(Llive/hms/video/interactivity/HmsInteractivityCenter;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getLocalWhiteBoardstart$lib_release()Z

    move-result p1

    if-eqz p1, :cond_c

    :goto_7
    sget-object p1, Llive/hms/video/whiteboard/State;->Started:Llive/hms/video/whiteboard/State;

    :goto_8
    move-object v10, p1

    goto :goto_9

    :cond_c
    iget-boolean p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOpen:Z

    if-eqz p1, :cond_d

    goto :goto_7

    :cond_d
    sget-object p1, Llive/hms/video/whiteboard/State;->Stopped:Llive/hms/video/whiteboard/State;

    goto :goto_8

    :goto_9
    new-instance v4, Llive/hms/video/whiteboard/HMSWhiteboard;

    iget-boolean v8, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->$isOwner:Z

    invoke-direct/range {v4 .. v10}, Llive/hms/video/whiteboard/HMSWhiteboard;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;ZLjava/lang/String;Llive/hms/video/whiteboard/State;)V

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getLocalWhiteBoardstart$lib_release()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setLocalWhiteBoardstart$lib_release(Z)V

    :cond_e
    invoke-virtual {v4}, Llive/hms/video/whiteboard/HMSWhiteboard;->getState()Llive/hms/video/whiteboard/State;

    move-result-object p1

    sget-object v0, Llive/hms/video/whiteboard/State;->Started:Llive/hms/video/whiteboard/State;

    if-ne p1, v0, :cond_10

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getCurrentWhiteBoardState()Llive/hms/video/whiteboard/State;

    move-result-object p1

    if-eq p1, v0, :cond_10

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getWhiteBoardUpdateListener$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v1, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;

    invoke-direct {v1, v4}, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Start;-><init>(Llive/hms/video/whiteboard/HMSWhiteboard;)V

    invoke-interface {p1, v1}, Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;->onUpdate(Llive/hms/video/whiteboard/HMSWhiteboardUpdate;)V

    :cond_f
    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1, v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setCurrentWhiteBoardState(Llive/hms/video/whiteboard/State;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v4}, Llive/hms/video/whiteboard/HMSWhiteboard;->getState()Llive/hms/video/whiteboard/State;

    move-result-object p1

    sget-object v0, Llive/hms/video/whiteboard/State;->Stopped:Llive/hms/video/whiteboard/State;

    if-ne p1, v0, :cond_12

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->getCurrentWhiteBoardState()Llive/hms/video/whiteboard/State;

    move-result-object p1

    if-eq p1, v0, :cond_12

    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {p1}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$getWhiteBoardUpdateListener$p(Llive/hms/video/interactivity/HmsInteractivityCenter;)Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance v1, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Stop;

    invoke-direct {v1, v4}, Llive/hms/video/whiteboard/HMSWhiteboardUpdate$Stop;-><init>(Llive/hms/video/whiteboard/HMSWhiteboard;)V

    invoke-interface {p1, v1}, Llive/hms/video/whiteboard/HMSWhiteboardUpdateListener;->onUpdate(Llive/hms/video/whiteboard/HMSWhiteboardUpdate;)V

    :cond_11
    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-virtual {p1, v0}, Llive/hms/video/interactivity/HmsInteractivityCenter;->setCurrentWhiteBoardState(Llive/hms/video/whiteboard/State;)V

    :cond_12
    :goto_a
    iget-object p1, p0, Llive/hms/video/interactivity/HmsInteractivityCenter$handleWhiteBoardStateNotification$1;->this$0:Llive/hms/video/interactivity/HmsInteractivityCenter;

    invoke-static {p1, v4}, Llive/hms/video/interactivity/HmsInteractivityCenter;->access$setCurrentWhiteBoard$p(Llive/hms/video/interactivity/HmsInteractivityCenter;Llive/hms/video/whiteboard/HMSWhiteboard;)V

    goto :goto_e

    :cond_13
    sget-object v5, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v6, Llive/hms/video/error/ErrorFactory$Action;->WHITEBOARD:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_c

    :cond_14
    :goto_b
    move-object v7, v0

    goto :goto_d

    :cond_15
    :goto_c
    const-string v0, "unable to get white board notification"

    goto :goto_b

    :goto_d
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    :goto_e
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
