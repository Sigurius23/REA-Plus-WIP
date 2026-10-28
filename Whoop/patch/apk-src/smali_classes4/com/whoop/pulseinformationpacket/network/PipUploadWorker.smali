.class public final Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;",
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
        "Lj52/b;",
        "y",
        "Ll83/h;",
        "m",
        "()Lj52/b;",
        "pipUploader",
        "Lrr2/c;",
        "z",
        "l",
        "()Lrr2/c;",
        "crashReporter",
        "",
        "E",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "pulseInformationPacket_release"
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
.field private final E:Ljava/lang/String;

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

    new-instance p2, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->y:Ll83/h;

    new-instance p2, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->z:Ll83/h;

    const-string p1, "PERIODIC_PIP_UPLOAD"

    iput-object p1, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->E:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic k(Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;)Lj52/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->m()Lj52/b;

    move-result-object p0

    return-object p0
.end method

.method private final l()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    return-object v0
.end method

.method private final m()Lj52/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj52/b;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->E:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;

    iget v1, v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;-><init>(Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;->y:I

    const/4 v3, 0x0

    const-string v4, "Error uploading pulse info packets"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteOutOfMemoryException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p1, Lbc3/y1;->w:Lbc3/y1;

    new-instance v2, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$d;

    const/4 v6, 0x0

    invoke-direct {v2, p0, v6}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$d;-><init>(Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;Lq83/d;)V

    iput v5, v0, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker$c;->y:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lic/u;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteOutOfMemoryException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    invoke-direct {p0}, Lcom/whoop/pulseinformationpacket/network/PipUploadWorker;->l()Lrr2/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    goto :goto_4

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, v4, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    :goto_4
    return-object p1
.end method
