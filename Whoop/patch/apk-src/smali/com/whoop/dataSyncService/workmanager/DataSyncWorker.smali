.class public final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;,
        Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002CDB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001a\u001a\u0004\u0008\u0019\u0010$R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u001a\u001a\u0004\u0008\u0013\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u001a\u001a\u0004\u0008,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010\u001a\u001a\u0004\u00081\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u0010\u001a\u001a\u0004\u00086\u00107R!\u0010>\u001a\u0008\u0012\u0004\u0012\u00020:098BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010\u001a\u001a\u0004\u0008<\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u00105\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroid/app/Notification;",
        "s",
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
        "Lmx0/a;",
        "z",
        "Ll83/h;",
        "u",
        "()Lmx0/a;",
        "dataFlowController",
        "Ljava/time/Clock;",
        "E",
        "Ljava/time/Clock;",
        "clock",
        "Lc12/c;",
        "F",
        "()Lc12/c;",
        "notificationInitializer",
        "Lmx0/c;",
        "G",
        "()Lmx0/c;",
        "highWatermarkHelper",
        "Ljx0/f;",
        "H",
        "w",
        "()Ljx0/f;",
        "dataSyncWorkDatabaseManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "I",
        "x",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljs0/c;",
        "J",
        "t",
        "()Ljs0/c;",
        "configRepo",
        "La6/g;",
        "Lf6/f;",
        "K",
        "v",
        "()La6/g;",
        "dataStorePreferences",
        "Lkotlin/time/Duration;",
        "L",
        "workerTimeout",
        "M",
        "b",
        "a",
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


# static fields
.field public static final M:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;

.field private static final N:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field

.field private static final O:Lc12/d;


# instance fields
.field private final E:Ljava/time/Clock;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Ll83/h;

.field private final L:J

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->M:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$a;

    const-string v0, "DATA_SYNC_WORKER_LAST_WORK_TIME"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->N:Lf6/d;

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->MEDIUM:Lc12/b;

    const-string v2, "00200_Alerts"

    sget v3, Ldx0/e;->a:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    const-string v1, "setVibrationEnabled(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->O:Lc12/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "DataSyncWorker"

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$d;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->z:Ll83/h;

    new-instance p2, Lvf3/c;

    const-string v1, "WORKER_CLOCK"

    invoke-direct {p2, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v1

    iget-object v1, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v1, v1, Lwf3/a;->d:Lxf3/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/time/Clock;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v0, v3, p2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/time/Clock;

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->E:Ljava/time/Clock;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$f;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$f;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->G:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$g;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$g;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->H:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$h;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$h;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->I:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$i;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$i;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->J:Ll83/h;

    new-instance p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$j;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$j;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->K:Ll83/h;

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->t()Ljs0/c;

    move-result-object p1

    sget-object p2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$b;->a:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$b;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {p2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object p2

    const-class v3, Ljava/lang/Long;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_0

    :cond_0
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    goto :goto_0

    :cond_3
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_4
    const-class v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_5
    move-object v0, p2

    :cond_6
    :goto_0
    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_8

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    sget-object v0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, v0}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->L:J

    return-void

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic k(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->E:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)La6/g;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->v()La6/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ljx0/f;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->w()Ljx0/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->x()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Lmx0/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->y()Lmx0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p()Lf6/d;
    .locals 1

    sget-object v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->N:Lf6/d;

    return-object v0
.end method

.method public static final synthetic q(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;)Ltr2/n;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->O:Lc12/d;

    return-object v0
.end method

.method private final s()Landroid/app/Notification;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->z()Lc12/c;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Ldx0/e;->a:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Ldx0/e;->b:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget-object v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->O:Lc12/d;

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final t()Ljs0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs0/c;

    return-object v0
.end method

.method private final u()Lmx0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmx0/a;

    return-object v0
.end method

.method private final v()La6/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La6/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    return-object v0
.end method

.method private final w()Ljx0/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljx0/f;

    return-object v0
.end method

.method private final x()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final y()Lmx0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmx0/c;

    return-object v0
.end method

.method private final z()Lc12/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->F:Ll83/h;

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

    instance-of v0, p1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;

    iget v1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->y:I

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

    iput v4, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->y:I

    invoke-virtual {p0, v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$c;->y:I

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

    iget-object v0, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public getForegroundInfo(Lq83/d;)Ljava/lang/Object;
    .locals 2
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

    new-instance p1, Lic/m;

    const/16 v0, 0x6e

    invoke-direct {p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->s()Landroid/app/Notification;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lic/m;-><init>(ILandroid/app/Notification;)V

    return-object p1
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 30
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;

    iget v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;

    invoke-direct {v2, v0, v1}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->G:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v10, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->F:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-object v3, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->E:Ljava/lang/Object;

    check-cast v3, Ljx0/a;

    iget-object v2, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    check-cast v2, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->y:J

    iget-wide v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iget-wide v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iget-object v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->F:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-object v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->E:Ljava/lang/Object;

    check-cast v12, Ljx0/a;

    iget-object v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    check-cast v13, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_3
    iget-wide v8, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iget-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iget-object v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    check-cast v4, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v7, v8

    :goto_1
    move-wide v9, v12

    goto/16 :goto_6

    :cond_4
    iget-wide v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iget-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iget-object v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    check-cast v4, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_5
    iget-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->E:Ljava/time/Clock;

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v12

    invoke-direct {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->v()La6/g;

    move-result-object v1

    invoke-interface {v1}, La6/g;->getData()Lec3/l;

    move-result-object v1

    iput-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iput v10, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    invoke-static {v1, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_b

    :cond_7
    :goto_2
    check-cast v1, Lf6/f;

    sget-object v4, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->N:Lf6/d;

    invoke-virtual {v1, v4}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    move-wide/from16 v14, v16

    :goto_3
    const-wide/16 v16, 0x0

    goto :goto_4

    :cond_8
    const-wide/16 v14, 0x0

    goto :goto_3

    :goto_4
    cmp-long v1, v14, v16

    if-lez v1, :cond_9

    sub-long v16, v12, v14

    const v1, 0xea60

    int-to-long v6, v1

    div-long v6, v16, v6

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    const-string v10, "Time elapsed since last work call: "

    const-string v4, " minutes"

    invoke-static {v6, v7, v10, v4}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v1, v4, v6}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_9
    invoke-direct {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->v()La6/g;

    move-result-object v1

    new-instance v4, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$m;

    invoke-direct {v4, v12, v13, v11}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$m;-><init>(JLq83/d;)V

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    iput-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iput-wide v14, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iput v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    invoke-static {v1, v4, v2}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    goto/16 :goto_b

    :cond_a
    move-wide v9, v14

    :goto_5
    invoke-direct {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->w()Ljx0/f;

    move-result-object v1

    invoke-virtual {v0}, Lic/v;->getId()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v6, "toString(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    iput-wide v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iput-wide v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iput v8, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    invoke-virtual {v1, v4, v2}, Ljx0/f;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto/16 :goto_b

    :cond_b
    move-wide v7, v9

    goto/16 :goto_1

    :goto_6
    move-object v12, v1

    check-cast v12, Ljx0/a;

    if-eqz v12, :cond_c

    invoke-virtual {v12}, Ljx0/a;->f()J

    move-result-wide v13

    :goto_7
    move-wide/from16 v19, v13

    goto :goto_8

    :cond_c
    iget-object v1, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->E:Ljava/time/Clock;

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v13

    goto :goto_7

    :goto_8
    sget-object v1, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->Companion:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

    if-eqz v12, :cond_d

    invoke-virtual {v12}, Ljx0/a;->e()Ljava/lang/String;

    move-result-object v4

    goto :goto_9

    :cond_d
    move-object v4, v11

    :goto_9
    invoke-virtual {v1, v4}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;->valueOfOrDefault(Ljava/lang/String;)Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v1

    const-string v4, "Sending WM job - sync event to strap"

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v1, v4, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->u()Lmx0/a;

    move-result-object v1

    invoke-virtual {v1}, Lmx0/a;->d()Lec3/o1;

    move-result-object v1

    new-instance v4, Lkx0/c$a;

    new-instance v17, Ldt0/c;

    const/16 v28, 0x3c

    const/16 v29, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    invoke-direct/range {v17 .. v29}, Ldt0/c;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v17

    move-wide/from16 v13, v19

    invoke-direct {v4, v5}, Lkx0/c$a;-><init>(Ldt0/c;)V

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    iput-object v12, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->E:Ljava/lang/Object;

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->F:Ljava/lang/Object;

    iput-wide v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iput-wide v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iput-wide v13, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->y:J

    const/4 v5, 0x4

    iput v5, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    invoke-interface {v1, v4, v2}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    goto :goto_b

    :cond_e
    move-wide v4, v13

    :goto_a
    invoke-direct {v0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->u()Lmx0/a;

    move-result-object v1

    invoke-virtual {v1}, Lmx0/a;->e()Lec3/l;

    move-result-object v1

    new-instance v6, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;

    invoke-direct {v6, v0, v11}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$n;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    new-instance v13, Lec3/j1;

    const/4 v14, 0x0

    invoke-direct {v13, v1, v6, v14}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    new-instance v1, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k;

    invoke-direct {v1, v13, v0, v12}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$k;-><init>(Lec3/l;Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Ljx0/a;)V

    iget-wide v12, v0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->L:J

    invoke-static {v1, v12, v13}, Lec3/v;->O(Lec3/l;J)La6/u;

    move-result-object v1

    new-instance v6, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;

    invoke-direct {v6, v0, v11}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$o;-><init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V

    new-instance v12, Lec3/a0;

    invoke-direct {v12, v1, v6}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->z:Ljava/lang/Object;

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->E:Ljava/lang/Object;

    iput-object v11, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->F:Ljava/lang/Object;

    iput-wide v9, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->w:J

    iput-wide v7, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->x:J

    iput-wide v4, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->y:J

    const/4 v1, 0x5

    iput v1, v2, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    invoke-static {v12, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_f

    :goto_b
    return-object v3

    :cond_f
    return-object v1
.end method
