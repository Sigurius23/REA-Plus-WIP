.class final Llive/hms/video/sdk/SDKDelegate$send$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->send(Llive/hms/video/sdk/models/HMSMessage;Llive/hms/video/sdk/HMSMessageResultListener;)V
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
    c = "live.hms.video.sdk.SDKDelegate$send$1"
    f = "SDKDelegate.kt"
    l = {
        0x7d5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

.field final synthetic $hmsMessageResultListener:Llive/hms/video/sdk/HMSMessageResultListener;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/HMSMessage;Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSMessageResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSMessage;",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/HMSMessageResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$send$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessageResultListener:Llive/hms/video/sdk/HMSMessageResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$send$1;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessageResultListener:Llive/hms/video/sdk/HMSMessageResultListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$send$1;-><init>(Llive/hms/video/sdk/models/HMSMessage;Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/HMSMessageResultListener;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$send$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$send$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$send$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$send$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSMessage;->getRecipient()Llive/hms/video/sdk/models/HMSMessageRecipient;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSMessageRecipient;->getRecipientRoles()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;

    new-instance v3, Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSMessage;->getMessage()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSMessage;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSMessage;->getRecipient()Llive/hms/video/sdk/models/HMSMessageRecipient;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSMessageRecipient;->getRecipientPeer()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    invoke-direct {v1, v3, v4, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendBroadcast;-><init>(Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;Ljava/lang/String;Ljava/util/List;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object p1

    iput v2, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->label:I

    invoke-interface {p1, v1, p0}, Llive/hms/video/transport/ITransport;->sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Llive/hms/video/sdk/models/HMSMessageSendResponse;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessageResultListener:Llive/hms/video/sdk/HMSMessageResultListener;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSMessageSendResponse;->getMessageId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    const-string v1, ""

    :cond_5
    move-object v8, v1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSMessageSendResponse;->getTimestamp()J

    move-result-wide v5

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessage:Llive/hms/video/sdk/models/HMSMessage;

    const/16 v9, 0x17

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v10}, Llive/hms/video/sdk/models/HMSMessage;->copy$default(Llive/hms/video/sdk/models/HMSMessage;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSMessageRecipient;JLlive/hms/video/sdk/models/HMSPeer;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSMessage;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/HMSMessageResultListener;->onSuccess(Llive/hms/video/sdk/models/HMSMessage;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_3
    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$send$1;->$hmsMessageResultListener:Llive/hms/video/sdk/HMSMessageResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
