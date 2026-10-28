.class public final Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Lof3/a;",
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
        "Lci2/b;",
        "z",
        "Ll83/h;",
        "l",
        "()Lci2/b;",
        "whoopStrapProvider",
        "Lgt0/e;",
        "E",
        "k",
        "()Lgt0/e;",
        "fwUpdateApi",
        "firmware-update-service_release"
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

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PeriodicFwUpdateCheckWorker"

    iput-object p1, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->E:Ll83/h;

    return-void
.end method

.method private final k()Lgt0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgt0/e;

    return-object v0
.end method

.method private final l()Lci2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->l()Lci2/b;

    move-result-object v0

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "No strap available, skipping firmware update check"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v2

    const-string v3, "Sending Fw update check for strap"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker;->k()Lgt0/e;

    move-result-object v1

    new-instance v2, Lgt0/g$a;

    invoke-static {v0}, Lci2/a;->b(Ljk0/d;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    invoke-direct {v2, v0}, Lgt0/g$a;-><init>(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    invoke-interface {v1, v2}, Lgt0/e;->b(Lgt0/g;)Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$c;

    invoke-direct {v1, v0}, Lcom/whoop/firmwareUpdateService/workmanager/PeriodicFwUpdateCheckWorker$c;-><init>(Lec3/l;)V

    invoke-static {v1, p1}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
