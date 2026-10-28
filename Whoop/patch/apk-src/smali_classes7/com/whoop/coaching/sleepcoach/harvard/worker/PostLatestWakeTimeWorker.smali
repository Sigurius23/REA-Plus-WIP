.class public final Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;",
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
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "y",
        "Ll83/h;",
        "l",
        "()Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "smartAlarmApi",
        "Lrr2/c;",
        "z",
        "k",
        "()Lrr2/c;",
        "crashReporter",
        "",
        "E",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "F",
        "a",
        "sleep-coach_release"
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
.field public static final F:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;

.field public static final G:I


# instance fields
.field private final E:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->F:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->G:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->y:Ll83/h;

    new-instance p2, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->z:Ll83/h;

    const-string p1, "PostLatestWakeTimeWorker"

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->E:Ljava/lang/String;

    return-void
.end method

.method private final k()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    return-object v0
.end method

.method private final l()Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->E:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;

    iget v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;

    invoke-direct {v0, p0, p1}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;-><init>(Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    iget-object v0, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/Instant;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "newLwt"

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v2, v4, v5}, Lic/g;->b(Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long p1, v6, v4

    if-nez p1, :cond_3

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_3
    new-instance p1, Lorg/joda/time/Instant;

    invoke-direct {p1, v6, v7}, Lorg/joda/time/Instant;-><init>(J)V

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_4
    sget-object v2, Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;->Factory:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto$Factory;

    invoke-virtual {v2, p1}, Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto$Factory;->a(Lorg/joda/time/Instant;)Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    move-result-object p1

    :try_start_1
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->l()Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    move-result-object v2

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->x:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->y:Ljava/lang/Object;

    iput-wide v6, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->w:J

    iput v3, v0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    invoke-interface {v2, p1, v0}, Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;->putNewStrapLatestWakeTime(Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->k()Lrr2/c;

    move-result-object v1

    const-string v2, "Failed to post new strap LWT"

    invoke-static {p1, v2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
