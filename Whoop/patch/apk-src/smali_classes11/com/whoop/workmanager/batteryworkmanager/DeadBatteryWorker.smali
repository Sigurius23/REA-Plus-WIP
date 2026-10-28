.class public final Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
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
        "Lsu0/a;",
        "z",
        "Ll83/h;",
        "k",
        "()Lsu0/a;",
        "deadBatteryAnalyticsHelper",
        "Lo92/h;",
        "E",
        "m",
        "()Lo92/h;",
        "deadBatteryPushNotification",
        "Lsu0/c;",
        "F",
        "l",
        "()Lsu0/c;",
        "deadBatteryNotificationStateManager",
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "DeadBatteryConfirmationWork"

    iput-object p1, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$b;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->F:Ll83/h;

    return-void
.end method

.method private final k()Lsu0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu0/a;

    return-object v0
.end method

.method private final l()Lsu0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsu0/c;

    return-object v0
.end method

.method private final m()Lo92/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo92/h;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->y:Ljava/lang/String;

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

    instance-of v0, p1, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;

    iget v1, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;

    invoke-direct {v0, p0, p1}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;-><init>(Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object p1, p1, Lic/g;->a:Ljava/util/HashMap;

    const-string v4, "batteryLevel"

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v4, p1, Ljava/lang/Integer;

    if-eqz v4, :cond_3

    move-object v2, p1

    :cond_3
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    const-string v5, "DeadBatteryWorker"

    const-string v6, "Battery silence timeout reached. Sending dead battery notification."

    invoke-interface {v2, v5, v6, v4}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->k()Lsu0/a;

    move-result-object v2

    invoke-virtual {v2, p1}, Lsu0/a;->a(I)V

    invoke-direct {p0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->m()Lo92/h;

    move-result-object v2

    new-instance v4, Lm92/f;

    sget-object v5, Lm83/z;->w:Lm83/z;

    invoke-direct {v4, v5}, Lm92/f;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "getApplicationContext(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Lo92/h;->a(Lm92/f;Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker;->l()Lsu0/c;

    move-result-object v2

    iput p1, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->w:I

    iput v3, v0, Lcom/whoop/workmanager/batteryworkmanager/DeadBatteryWorker$d;->z:I

    invoke-virtual {v2, v0}, Lsu0/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1
.end method
