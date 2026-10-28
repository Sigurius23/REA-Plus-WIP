.class public final Lcom/whoop/service/push/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/service/push/a;",
        "",
        "Lc12/c;",
        "notificationInitializer",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lc12/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "a",
        "(Landroid/content/Context;)V",
        "Lc12/c;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
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
.field private final a:Lc12/c;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lc12/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "notificationInitializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/push/a;->a:Lc12/c;

    iput-object p2, p0, Lcom/whoop/service/push/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/service/push/a;->a:Lc12/c;

    invoke-interface {v0, p1}, Lc12/c;->b(Landroid/content/Context;)Landroid/app/NotificationManager;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lx82/i;->w:Lx82/i$a;

    invoke-virtual {v1, p1, v0}, Lx82/i$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lcom/whoop/service/push/PushService;->O:Lcom/whoop/service/push/PushService$a;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/service/push/PushService$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    iget-object v2, p0, Lcom/whoop/service/push/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2, v0}, Lcom/whoop/service/push/PushService$a;->c(Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/app/NotificationManager;)V

    invoke-static {p1, v0}, Lcom/whoop/service/sync/WhoopSyncService;->f(Landroid/content/Context;Landroid/app/NotificationManager;)V

    invoke-static {p1, v0}, Lcom/whoop/realtime/service/b;->w(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->M:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;->b(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->H:Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lo92/f0;->P:Lo92/f0$a;

    invoke-virtual {v1, p1, v0}, Lo92/f0$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lo92/i;->O:Lo92/i$a;

    invoke-virtual {v1, p1, v0}, Lo92/i$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lo92/h;->L:Lo92/h$a;

    invoke-virtual {v1, p1, v0}, Lo92/h$a;->a(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker;->G:Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/whooplabs/workers/BtHrSubmissionWorker$a;->c(Landroid/content/Context;Landroid/app/NotificationManager;)V

    sget-object v1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->I:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;

    invoke-virtual {v1, p1, v0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;->c(Landroid/content/Context;Landroid/app/NotificationManager;)V

    :cond_0
    return-void
.end method
