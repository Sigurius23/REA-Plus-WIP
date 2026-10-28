.class public final Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0019\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0019\u001a\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroid/app/Notification;",
        "k",
        "()Landroid/app/Notification;",
        "Lic/u;",
        "doWork",
        "(Lq83/d;)Ljava/lang/Object;",
        "j",
        "Lic/m;",
        "getForegroundInfo",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lcom/whoop/whooplabs/a;",
        "z",
        "Ll83/h;",
        "m",
        "()Lcom/whoop/whooplabs/a;",
        "dwlServiceConnector",
        "Loz2/a;",
        "E",
        "l",
        "()Loz2/a;",
        "btHrPeriodicCheckScheduler",
        "Lc12/c;",
        "F",
        "n",
        "()Lc12/c;",
        "notificationInitializer",
        "G",
        "a",
        "whooplabs_release"
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
.field public static final G:Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;

.field public static final H:I


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->G:Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->H:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "DWL_BTHR_UPLOAD"

    iput-object p1, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->F:Ll83/h;

    return-void
.end method

.method private final k()Landroid/app/Notification;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->n()Lc12/c;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lyw2/e;->y:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lyw2/e;->x:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Luv0/b;->a:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget-object v1, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->G:Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;

    invoke-static {v1}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;->a(Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;)Lc12/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final l()Loz2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loz2/a;

    return-object v0
.end method

.method private final m()Lcom/whoop/whooplabs/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/a;

    return-object v0
.end method

.method private final n()Lc12/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc12/c;

    return-object v0
.end method


# virtual methods
.method public doWork(Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p1, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;

    iget v1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;-><init>(Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

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

    iput v4, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->y:I

    invoke-virtual {p0, v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$b;->y:I

    invoke-super {p0, v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->doWork(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public getForegroundInfo(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/16 v1, 0x6d

    if-lt p1, v0, :cond_0

    new-instance p1, Lic/m;

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->k()Landroid/app/Notification;

    move-result-object v0

    const/16 v2, 0x11

    invoke-direct {p1, v1, v0, v2}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    return-object p1

    :cond_0
    new-instance p1, Lic/m;

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->k()Landroid/app/Notification;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lic/m;-><init>(ILandroid/app/Notification;)V

    return-object p1
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

    instance-of v0, p1, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;

    iget v1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;

    invoke-direct {v0, p0, p1}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;-><init>(Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v2, "Started work"

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p1, v2, v7}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->l()Loz2/a;

    move-result-object p1

    invoke-interface {p1}, Loz2/a;->b()V

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->m()Lcom/whoop/whooplabs/a;

    move-result-object p1

    iput v5, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->z:I

    invoke-virtual {p1, v3, v0}, Lcom/whoop/whooplabs/a;->c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object v3, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->w:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$f;->z:I

    invoke-virtual {p1, v0}, Lcom/whoop/whooplabs/WhoopLabsService;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Finished uploading data"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Error uploading data"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
