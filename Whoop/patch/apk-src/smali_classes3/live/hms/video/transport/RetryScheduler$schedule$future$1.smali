.class final Llive/hms/video/transport/RetryScheduler$schedule$future$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/RetryScheduler;->schedule(Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.transport.RetryScheduler$schedule$future$1"
    f = "RetryScheduler.kt"
    l = {
        0xd1,
        0xf0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $category:Llive/hms/video/transport/models/TransportFailureCategory;

.field final synthetic $deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field final synthetic $error:Llive/hms/video/error/HMSException;

.field final synthetic $failedAtMillis:J

.field final synthetic $maxRetryInMillis:J

.field final synthetic $newRetries:Lkotlin/jvm/internal/e0;

.field final synthetic $retries:I

.field final synthetic $shouldSendStateUpdate:Z

.field final synthetic $task:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/transport/RetryScheduler;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/transport/RetryScheduler;JZLkotlin/jvm/internal/e0;Llive/hms/video/error/HMSException;JILbc3/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Llive/hms/video/transport/RetryScheduler;",
            "JZ",
            "Lkotlin/jvm/internal/e0;",
            "Llive/hms/video/error/HMSException;",
            "JI",
            "Lbc3/s;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/transport/RetryScheduler$schedule$future$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$task:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    iput-object p3, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->this$0:Llive/hms/video/transport/RetryScheduler;

    iput-wide p4, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$failedAtMillis:J

    iput-boolean p6, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$shouldSendStateUpdate:Z

    iput-object p7, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$newRetries:Lkotlin/jvm/internal/e0;

    iput-object p8, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$error:Llive/hms/video/error/HMSException;

    iput-wide p9, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$maxRetryInMillis:J

    iput p11, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$retries:I

    iput-object p12, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$deferred:Lbc3/s;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p13}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;

    iget-object v1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$task:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    iget-object v3, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->this$0:Llive/hms/video/transport/RetryScheduler;

    iget-wide v4, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$failedAtMillis:J

    iget-boolean v6, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$shouldSendStateUpdate:Z

    iget-object v7, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$newRetries:Lkotlin/jvm/internal/e0;

    iget-object v8, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$error:Llive/hms/video/error/HMSException;

    iget-wide v9, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$maxRetryInMillis:J

    iget v11, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$retries:I

    iget-object v12, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$deferred:Lbc3/s;

    move-object v13, p1

    invoke-direct/range {v0 .. v13}, Llive/hms/video/transport/RetryScheduler$schedule$future$1;-><init>(Lkotlin/jvm/functions/Function1;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/transport/RetryScheduler;JZLkotlin/jvm/internal/e0;Llive/hms/video/error/HMSException;JILbc3/s;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/RetryScheduler$schedule$future$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->label:I

    const-string v1, "] Leave has been called while retry was in progress. Ignoring further actions,"

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "["

    const-string v6, "RetryScheduler"

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/e0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, v0

    move-object v0, p1

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, p1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$task:Lkotlin/jvm/functions/Function1;

    iput v3, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->label:I

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_0
    check-cast v0, Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_5

    :goto_1
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "] Un-caught exception "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " in retry-task, initiating retry"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v6, v3, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_5

    :goto_2
    sget-object v3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v6, v1, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    move-object v0, v4

    goto :goto_5

    :goto_4
    sget-object v3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v6, v1, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_5
    if-nez v0, :cond_4

    const-string v0, "Retry could not be finished as leave was called in bewtween"

    invoke-static {v6, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->this$0:Llive/hms/video/transport/RetryScheduler;

    invoke-static {v0}, Llive/hms/video/transport/RetryScheduler;->access$getInProgress$p(Llive/hms/video/transport/RetryScheduler;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/s;

    if-eqz v0, :cond_5

    iget-wide v1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$failedAtMillis:J

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v3}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_5
    iget-boolean v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$shouldSendStateUpdate:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->this$0:Llive/hms/video/transport/RetryScheduler;

    invoke-static {v0}, Llive/hms/video/transport/RetryScheduler;->access$getOnStateChange$p(Llive/hms/video/transport/RetryScheduler;)Lc93/m;

    move-result-object v0

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Joined:Llive/hms/video/transport/models/TransportState;

    invoke-interface {v0, v1, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "schedule: ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] [failedRetryCount="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$failedAtMillis:J

    const-string v4, "] Recovered \u267b\ufe0f"

    invoke-static {v2, v3, v4, v1}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_7
    :try_start_3
    iget-object v13, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$newRetries:Lkotlin/jvm/internal/e0;

    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->this$0:Llive/hms/video/transport/RetryScheduler;

    iget-object v1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$category:Llive/hms/video/transport/models/TransportFailureCategory;

    iget-object v3, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$error:Llive/hms/video/error/HMSException;

    move-object v4, v3

    iget-boolean v3, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$shouldSendStateUpdate:Z

    move-object v5, v4

    iget-object v4, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$task:Lkotlin/jvm/functions/Function1;

    move-object v7, v5

    iget-wide v5, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$maxRetryInMillis:J

    move-object v9, v7

    iget-wide v7, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$failedAtMillis:J

    iget v10, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$retries:I

    iput-object v13, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->label:I

    move-object v2, v9

    const/4 v9, 0x0

    move-object v11, p0

    invoke-static/range {v0 .. v11}, Llive/hms/video/transport/RetryScheduler;->access$schedule(Llive/hms/video/transport/RetryScheduler;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/error/HMSException;ZLkotlin/jvm/functions/Function1;JJZILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_8

    :goto_6
    return-object v12

    :cond_8
    :goto_7
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iput v0, v13, Lkotlin/jvm/internal/e0;->w:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_9

    :goto_8
    iget-object v1, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$deferred:Lbc3/s;

    check-cast v1, Lbc3/t;

    invoke-virtual {v1, v0}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_9
    iget-object v0, p0, Llive/hms/video/transport/RetryScheduler$schedule$future$1;->$deferred:Lbc3/s;

    check-cast v0, Lbc3/t;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, v1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-object v1
.end method
