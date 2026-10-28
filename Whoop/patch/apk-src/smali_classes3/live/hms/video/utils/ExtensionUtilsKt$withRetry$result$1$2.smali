.class final Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/ExtensionUtilsKt;->withRetry(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "R",
        "Lec3/m;",
        "",
        "cause",
        "",
        "attempt",
        "",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;J)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.utils.ExtensionUtilsKt$withRetry$result$1$2"
    f = "ExtensionUtils.kt"
    l = {
        0x61,
        0x63
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $maxRetryCount:I

.field final synthetic $name:Llive/hms/video/sdk/models/EVENT_TYPE;

.field final synthetic $retryAttemptTracking:Llive/hms/video/sdk/models/IRetryAttemptTracking;

.field I$0:I

.field synthetic J$0:J

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ILlive/hms/video/sdk/models/IRetryAttemptTracking;Llive/hms/video/sdk/models/EVENT_TYPE;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$maxRetryCount:I

    iput-object p2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$retryAttemptTracking:Llive/hms/video/sdk/models/IRetryAttemptTracking;

    iput-object p3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$name:Llive/hms/video/sdk/models/EVENT_TYPE;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;

    iget v0, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$maxRetryCount:I

    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$retryAttemptTracking:Llive/hms/video/sdk/models/IRetryAttemptTracking;

    iget-object v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$name:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-direct {p1, v0, v1, v2, p5}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;-><init>(ILlive/hms/video/sdk/models/IRetryAttemptTracking;Llive/hms/video/sdk/models/EVENT_TYPE;Lq83/d;)V

    iput-object p2, p1, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->L$0:Ljava/lang/Object;

    iput-wide p3, p1, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->J$0:J

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2
    move-object v1, p1

    check-cast v1, Lec3/m;

    move-object v2, p2

    check-cast v2, Ljava/lang/Throwable;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    move-object v5, p4

    check-cast v5, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->invoke(Lec3/m;Ljava/lang/Throwable;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->I$0:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->I$0:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-wide v5, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->J$0:J

    const-string v1, "schedule: retry retry count "

    const-string v7, " and error reason "

    invoke-static {v5, v6, v1, v7}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_0
    if-nez v7, :cond_4

    const-string v7, ""

    :cond_4
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v7, "Retry Scheduler"

    invoke-static {v7, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    const-string v7, "null cannot be cast to non-null type java.lang.Exception"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Exception;

    invoke-virtual {v1, p1}, Llive/hms/video/utils/HMSUtils;->shouldRetry(Ljava/lang/Exception;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$maxRetryCount:I

    int-to-long v7, p1

    cmp-long p1, v5, v7

    if-gez p1, :cond_5

    move v1, v4

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    if-eqz v1, :cond_8

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$retryAttemptTracking:Llive/hms/video/sdk/models/IRetryAttemptTracking;

    if-eqz p1, :cond_6

    iget-object v7, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->$name:Llive/hms/video/sdk/models/EVENT_TYPE;

    if-eqz v7, :cond_6

    const-wide/16 v8, 0x1

    add-long/2addr v5, v8

    iput v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->I$0:I

    iput v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->label:I

    invoke-interface {p1, v7, v5, v6, p0}, Llive/hms/video/sdk/models/IRetryAttemptTracking;->numberedValue(Llive/hms/video/sdk/models/EVENT_TYPE;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    sget-object p1, Llive/hms/video/transport/RetryScheduler;->Companion:Llive/hms/video/transport/RetryScheduler$Companion;

    sget-object v5, Llive/hms/video/transport/models/TransportFailureCategory;->JoinAPIFailed:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {p1, v5}, Llive/hms/video/transport/RetryScheduler$Companion;->getDelayForCategory(Llive/hms/video/transport/models/TransportFailureCategory;)J

    move-result-wide v5

    iput v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->I$0:I

    iput v3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$2;->label:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    move v0, v1

    :goto_4
    move v1, v0

    :cond_8
    if-eqz v1, :cond_9

    move v2, v4

    :cond_9
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
