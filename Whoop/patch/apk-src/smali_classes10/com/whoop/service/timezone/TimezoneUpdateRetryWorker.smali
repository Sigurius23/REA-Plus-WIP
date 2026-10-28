.class public final Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lcom/whoop/service/timezone/a;",
        "z",
        "Ll83/h;",
        "k",
        "()Lcom/whoop/service/timezone/a;",
        "timezoneUpdateUploader",
        "E",
        "a",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final E:Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;


# instance fields
.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->E:Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "timezone_update_retry"

    iput-object p1, p0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->z:Ll83/h;

    return-void
.end method

.method private final k()Lcom/whoop/service/timezone/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/timezone/a;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;

    iget v1, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;-><init>(Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "start_time"

    const-wide/16 v6, 0x0

    invoke-virtual {p1, v2, v6, v7}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v8

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v8

    invoke-virtual {p1, v10, v11}, Ljava/util/concurrent/TimeUnit;->toHours(J)J

    move-result-wide v10

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {p0}, Lic/v;->getRunAttemptCount()I

    move-result v2

    add-int/2addr v2, v5

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "TimezoneUpdateRetryWorker started, attempt: "

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", elapsed: "

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "h"

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v12, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v12}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    cmp-long p1, v8, v6

    if-lez p1, :cond_5

    const-wide/16 v6, 0x18

    cmp-long p1, v10, v6

    if-ltz p1, :cond_5

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v2, "24-hour retry cap reached (elapsed: "

    const-string v3, "h), clearing datastore and stopping retry"

    invoke-static {v10, v11, v2, v3}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->k()Lcom/whoop/service/timezone/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/service/timezone/a;->c()Lda2/a;

    move-result-object p1

    iput-wide v8, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->w:J

    iput-wide v10, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->x:J

    iput v5, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->E:I

    invoke-virtual {p1, v0}, Lda2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_5
    invoke-direct {p0}, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker;->k()Lcom/whoop/service/timezone/a;

    move-result-object p1

    iput-wide v8, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->w:J

    iput-wide v10, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->x:J

    iput v3, v0, Lcom/whoop/service/timezone/TimezoneUpdateRetryWorker$c;->E:I

    invoke-virtual {p1, v0}, Lcom/whoop/service/timezone/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Timezone update retry succeeded"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {p0}, Lic/v;->getRunAttemptCount()I

    move-result v0

    add-int/2addr v0, v5

    const-string v1, "Timezone update retry failed (attempt "

    const-string v2, "), WorkManager will retry with backoff"

    invoke-static {v0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
