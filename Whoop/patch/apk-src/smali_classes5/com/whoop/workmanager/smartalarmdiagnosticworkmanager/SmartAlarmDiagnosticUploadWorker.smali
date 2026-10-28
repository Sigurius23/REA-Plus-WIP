.class public final Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;",
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
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lt03/b;",
        "z",
        "Ll83/h;",
        "k",
        "()Lt03/b;",
        "smartAlarmDiagnosticUploader",
        "app_prodStandardRelease"
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
.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "PERIODIC_SMART_ALARM_DIAGNOSTIC_UPLOAD_WORK"

    iput-object p1, p0, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;->z:Ll83/h;

    return-void
.end method

.method private final k()Lt03/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt03/b;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    invoke-direct {p0}, Lcom/whoop/workmanager/smartalarmdiagnosticworkmanager/SmartAlarmDiagnosticUploadWorker;->k()Lt03/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lt03/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
