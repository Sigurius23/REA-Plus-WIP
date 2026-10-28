.class public final Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;",
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
        "Lr03/b;",
        "y",
        "Ll83/h;",
        "l",
        "()Lr03/b;",
        "consolePacketUploader",
        "Lat0/b;",
        "z",
        "k",
        "()Lat0/b;",
        "consolePacketService",
        "",
        "E",
        "Ljava/lang/String;",
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

    new-instance p2, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->y:Ll83/h;

    new-instance p2, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->z:Ll83/h;

    const-string p1, "PERIODIC_CONSOLE_PACKET_UPLOAD"

    iput-object p1, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->E:Ljava/lang/String;

    return-void
.end method

.method private final k()Lat0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lat0/b;

    return-object v0
.end method

.method private final l()Lr03/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr03/b;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->E:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;

    iget v1, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;-><init>(Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->w:Ljava/lang/Object;

    check-cast v0, Lic/u;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-direct {p0}, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->l()Lr03/b;

    move-result-object p1

    iput v5, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->z:I

    invoke-interface {p1, v0}, Lr03/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lic/u;

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v2

    const-string v5, "Uploading Maverick Console packets"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {v2, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker;->k()Lat0/b;

    move-result-object v2

    iput-object p1, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->w:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/workmanager/consolepacketworkmanager/ConsolePacketUploadWorker$c;->z:I

    invoke-interface {v2, v0}, Lat0/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_6

    check-cast p1, Ll83/a0;

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    goto :goto_4

    :cond_6
    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_4
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const-string v1, "Error uploading console logs: "

    invoke-static {p1, v1}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
