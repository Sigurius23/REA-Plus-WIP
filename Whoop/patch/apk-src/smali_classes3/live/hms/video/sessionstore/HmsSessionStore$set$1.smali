.class final Llive/hms/video/sessionstore/HmsSessionStore$set$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sessionstore/HmsSessionStore;->set(Ljava/lang/Object;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V
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
    c = "live.hms.video.sessionstore.HmsSessionStore$set$1"
    f = "HmsSessionStore.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $data:Ljava/lang/Object;

.field final synthetic $hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $key:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sessionstore/HmsSessionStore;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Llive/hms/video/sessionstore/HmsSessionStore;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Llive/hms/video/sessionstore/HmsSessionStore;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/HmsSessionStore$set$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$data:Ljava/lang/Object;

    iput-object p2, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->this$0:Llive/hms/video/sessionstore/HmsSessionStore;

    iput-object p3, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$key:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

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

    new-instance v0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;

    iget-object v1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$data:Ljava/lang/Object;

    iget-object v2, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->this$0:Llive/hms/video/sessionstore/HmsSessionStore;

    iget-object v3, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$key:Ljava/lang/String;

    iget-object v4, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/sessionstore/HmsSessionStore$set$1;-><init>(Ljava/lang/Object;Llive/hms/video/sessionstore/HmsSessionStore;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sessionstore/HmsSessionStore$set$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/google/gson/JsonElement;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$data:Ljava/lang/Object;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$data:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lcom/google/gson/Gson;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object p1

    :goto_0
    :try_start_1
    iget-object v1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->this$0:Llive/hms/video/sessionstore/HmsSessionStore;

    invoke-static {v1}, Llive/hms/video/sessionstore/HmsSessionStore;->access$getChangeSessionStore$p(Llive/hms/video/sessionstore/HmsSessionStore;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    iget-object v3, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$key:Ljava/lang/String;

    iput-object p1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->label:I

    invoke-interface {v1, v3, p1, p0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v4, p1

    move-object p1, v1

    :goto_1
    check-cast p1, Llive/hms/video/sessionstore/SetSessionMetadataResult;

    iget-object v9, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->this$0:Llive/hms/video/sessionstore/HmsSessionStore;

    invoke-virtual {p1}, Llive/hms/video/sessionstore/SetSessionMetadataResult;->getChangeVersion()J

    move-result-wide v1

    invoke-virtual {p1}, Llive/hms/video/sessionstore/SetSessionMetadataResult;->getVersion()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Llive/hms/video/sessionstore/SessionMetadataResult;

    iget-object v6, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$key:Ljava/lang/String;

    const-wide/16 v7, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v8}, Llive/hms/video/sessionstore/SessionMetadataResult;-><init>(JLjava/lang/String;Lcom/google/gson/JsonElement;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v9, p1}, Llive/hms/video/sessionstore/HmsSessionStore;->sendKeyChangeUpdates$lib_release(Ljava/util/List;)Lbc3/k1;

    iget-object p1, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v0, p0, Llive/hms/video/sessionstore/HmsSessionStore$set$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
