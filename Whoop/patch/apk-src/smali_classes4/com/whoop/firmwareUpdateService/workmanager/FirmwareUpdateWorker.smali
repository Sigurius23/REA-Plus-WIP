.class public final Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001c\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001c\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u001c\u001a\u0004\u0008,\u0010-\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroid/app/Notification;",
        "l",
        "()Landroid/app/Notification;",
        "",
        "q",
        "()Z",
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
        "Lrg1/b;",
        "z",
        "Ll83/h;",
        "m",
        "()Lrg1/b;",
        "firmwareUpdateManager",
        "Lc12/c;",
        "E",
        "n",
        "()Lc12/c;",
        "notificationInitializer",
        "Lci2/b;",
        "F",
        "p",
        "()Lci2/b;",
        "whoopStrapProvider",
        "Ly42/j;",
        "G",
        "o",
        "()Ly42/j;",
        "puffinManager",
        "H",
        "a",
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


# static fields
.field public static final H:Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;

.field private static final I:Lc12/d;


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->H:Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$a;

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->MEDIUM:Lc12/b;

    const-string v2, "00200_Alerts"

    sget v3, Lig1/a;->a:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    const-string v1, "setVibrationEnabled(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->I:Lc12/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "FirmwareUpdateWorker"

    iput-object p1, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$f;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$f;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->G:Ll83/h;

    return-void
.end method

.method public static final synthetic k()Lc12/d;
    .locals 1

    sget-object v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->I:Lc12/d;

    return-object v0
.end method

.method private final l()Landroid/app/Notification;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->n()Lc12/c;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lig1/a;->a:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lig1/a;->b:I

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

    sget-object v1, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->I:Lc12/d;

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final m()Lrg1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrg1/b;

    return-object v0
.end method

.method private final n()Lc12/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc12/c;

    return-object v0
.end method

.method private final o()Ly42/j;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly42/j;

    return-object v0
.end method

.method private final p()Lci2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    return-object v0
.end method

.method private final q()Z
    .locals 1

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->p()Lci2/b;

    move-result-object v0

    invoke-interface {v0}, Lci2/b;->a()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
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

    instance-of v0, p1, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;

    iget v1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;-><init>(Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->y:I

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

    iput v4, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->y:I

    invoke-virtual {p0, v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput v3, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$b;->y:I

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

    iget-object v0, p0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->y:Ljava/lang/String;

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

    const/16 v0, 0x6f

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->l()Landroid/app/Notification;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lic/m;-><init>(ILandroid/app/Notification;)V

    return-object p1
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p1, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;

    iget v1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;

    invoke-direct {v0, p0, p1}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;-><init>(Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->F:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v0, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :catch_2
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean v2, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->y:Z

    iget-object v5, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->x:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iget-object v7, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object p1

    const-string v2, "whoopDeviceSerialized"

    invoke-virtual {p1, v2}, Lic/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lic/v;->getInputData()Lic/g;

    move-result-object v2

    const-string v7, "userAcceptanceRequired"

    invoke-virtual {v2, v7, v5}, Lic/g;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz p1, :cond_8

    :try_start_2
    invoke-static {p1}, Lvg1/a;->a(Ljava/lang/String;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v7

    sget-object v8, Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;->PUFFIN:Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    if-eq v7, v8, :cond_4

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->q()Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Strap is not connected. Cancelling FW Update job"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;->getDeviceName()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;

    move-result-object v7

    if-ne v7, v8, :cond_5

    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->o()Ly42/j;

    move-result-object v7

    invoke-virtual {v7}, Ly42/j;->d()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Puffin is not connected. Cancelling FW Update job"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1

    :cond_5
    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->m()Lrg1/b;

    move-result-object v7

    invoke-interface {v7, p1}, Lrg1/b;->e(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)Lec3/l;

    move-result-object v7

    iput-object v4, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->w:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->x:Ljava/lang/Object;

    iput-boolean v2, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->y:Z

    iput v5, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->F:I

    invoke-static {v7, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto :goto_2

    :cond_6
    move-object v5, p1

    :goto_1
    invoke-direct {p0}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker;->m()Lrg1/b;

    move-result-object p1

    invoke-interface {p1, v5, v2}, Lrg1/b;->a(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Z)Lec3/l;

    move-result-object p1

    new-instance v5, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$g;

    invoke-direct {v5, p1}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$g;-><init>(Lec3/l;)V

    new-instance p1, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$h;

    invoke-direct {p1, v5}, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$h;-><init>(Lec3/l;)V

    iput-object v4, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->w:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->x:Ljava/lang/Object;

    iput-boolean v2, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->y:Z

    iput v3, v0, Lcom/whoop/firmwareUpdateService/workmanager/FirmwareUpdateWorker$i;->F:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    check-cast p1, Lic/u;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_2
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const-string v1, "Something went wrong in FW Update Worker"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    goto :goto_7

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const-string v1, "Could not decode string to WhoopFwDevice"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    goto :goto_7

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    const-string v1, "Something went wrong deserializing string to WhoopFwDevice class"

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    :goto_7
    return-object p1

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "Input data passed to FW Update Worker is null! FW Update worker cannot kick off without whoop device info"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lic/r;

    invoke-direct {p1}, Lic/r;-><init>()V

    return-object p1
.end method
