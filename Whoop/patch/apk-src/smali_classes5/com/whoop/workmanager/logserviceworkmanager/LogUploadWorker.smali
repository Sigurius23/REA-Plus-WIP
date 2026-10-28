.class public final Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lvr2/c;",
        "y",
        "Ll83/h;",
        "k",
        "()Lvr2/c;",
        "logEventUploader",
        "",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
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


# instance fields
.field private final y:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;->y:Ll83/h;

    return-void
.end method

.method private final k()Lvr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvr2/c;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v0

    const-string v1, "FORCE_UPLOAD_ALL_LOGS"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lic/g;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ONE_TIME_CONNECTED_UPLOAD_LOGS"

    return-object v0

    :cond_0
    const-string v0, "PERIODIC_CONNECTED_UPLOAD_LOGS"

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    const-string v0, "Force upload set to "

    instance-of v1, p1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;

    iget v2, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;

    invoke-direct {v1, p0, p1}, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;-><init>(Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->z:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

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

    :try_start_1
    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v3, "FORCE_UPLOAD_ALL_LOGS"

    invoke-virtual {p1, v3, v5}, Lic/g;->a(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v3, v0, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker;->k()Lvr2/c;

    move-result-object v0

    iput-boolean p1, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->w:Z

    iput v4, v1, Lcom/whoop/workmanager/logserviceworkmanager/LogUploadWorker$b;->z:I

    invoke-interface {v0, p1, v1}, Lvr2/c;->a(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p1, Lic/u;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error uploading logs: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v5, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
