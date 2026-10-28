.class public final Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u00088\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "exceptionName",
        "Ll83/a0;",
        "o",
        "(Ljava/lang/String;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lhx0/e;",
        "y",
        "Ll83/h;",
        "n",
        "()Lhx0/e;",
        "newRawDataUploader",
        "Lrr2/c;",
        "z",
        "m",
        "()Lrr2/c;",
        "crashReporter",
        "Lfi0/a;",
        "E",
        "l",
        "()Lfi0/a;",
        "baseAnalytics",
        "F",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "data-sync-service_release"
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
.field private final E:Ll83/h;

.field private final F:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->y:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->E:Ll83/h;

    const-string p1, "PERIODIC_RAW_DATA_UPLOAD"

    iput-object p1, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->F:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;)Lhx0/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->n()Lhx0/e;

    move-result-object p0

    return-object p0
.end method

.method private final l()Lfi0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    return-object v0
.end method

.method private final m()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    return-object v0
.end method

.method private final n()Lhx0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhx0/e;

    return-object v0
.end method

.method private final o(Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->l()Lfi0/a;

    move-result-object v0

    const-string v1, "Error"

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const/4 v3, 0x0

    const-string v4, "Upload Raw Packets to API"

    const-string v1, "Connectivity"

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->F:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;

    iget v1, v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;

    invoke-direct {v0, p0, p1}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;-><init>(Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;->y:I

    const/4 v3, 0x0

    const-string v4, "Error uploading raw data"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteOutOfMemoryException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
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
    sget-object p1, Lbc3/y1;->w:Lbc3/y1;

    new-instance v2, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$e;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$e;-><init>(Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;Lq83/d;)V

    iput v5, v0, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker$d;->y:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteOutOfMemoryException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :goto_1
    invoke-direct {p0}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->m()Lrr2/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->o(Ljava/lang/String;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    goto :goto_3

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const-string p1, "SQLiteOutOfMemoryException"

    invoke-direct {p0, p1}, Lcom/whoop/dataSyncService/rawdata/RawDataUploadWorker;->o(Ljava/lang/String;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    :goto_3
    return-object p1
.end method
