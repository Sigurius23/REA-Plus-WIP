.class public final Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$a;,
        Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u000201B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\rR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0012\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0012\u001a\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0012\u001a\u0004\u0008(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroid/app/Notification;",
        "n",
        "()Landroid/app/Notification;",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lic/m;",
        "getForegroundInfo",
        "Ljs0/c;",
        "y",
        "Ll83/h;",
        "o",
        "()Ljs0/c;",
        "configRepo",
        "",
        "z",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lc12/c;",
        "E",
        "r",
        "()Lc12/c;",
        "notificationInitializer",
        "Lcom/whoop/whooplabs/a;",
        "F",
        "p",
        "()Lcom/whoop/whooplabs/a;",
        "dwlService",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "G",
        "q",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lkotlin/time/Duration;",
        "H",
        "J",
        "workerTimeout",
        "I",
        "a",
        "b",
        "whooplabs_release"
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
.field public static final I:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;

.field public static final J:I


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:J

.field private final y:Ll83/h;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->I:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->J:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->y:Ll83/h;

    const-string p2, "DWL_BTHR_PERIODIC_CHECK"

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->z:Ljava/lang/String;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$f;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$f;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->G:Ll83/h;

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->o()Ljs0/c;

    move-result-object p1

    sget-object p2, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$a;->a:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {p2}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object p2

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

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

    iput-wide p1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->H:J

    return-void

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic k(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Lcom/whoop/whooplabs/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->p()Lcom/whoop/whooplabs/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->q()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Ltr2/n;
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method private final n()Landroid/app/Notification;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->r()Lc12/c;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lyw2/e;->y:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lic/v;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lyw2/e;->x:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Luv0/b;->a:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setCategory(Ljava/lang/String;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget-object v1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->I:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;

    invoke-static {v1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;->a(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$b;)Lc12/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final o()Ljs0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs0/c;

    return-object v0
.end method

.method private final p()Lcom/whoop/whooplabs/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/a;

    return-object v0
.end method

.method private final q()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final r()Lc12/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc12/c;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->z:Ljava/lang/String;

    return-object v0
.end method

.method public getForegroundInfo(Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/16 v1, 0x6d

    if-lt p1, v0, :cond_0

    new-instance p1, Lic/m;

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->n()Landroid/app/Notification;

    move-result-object v0

    const/16 v2, 0x11

    invoke-direct {p1, v1, v0, v2}, Lic/m;-><init>(ILandroid/app/Notification;I)V

    return-object p1

    :cond_0
    new-instance p1, Lic/m;

    invoke-direct {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->n()Landroid/app/Notification;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lic/m;-><init>(ILandroid/app/Notification;)V

    return-object p1
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

    instance-of v0, p1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;

    iget v1, v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;

    invoke-direct {v0, p0, p1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;-><init>(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->e()Ljava/lang/String;

    move-result-object v2

    const-string v5, "Starting "

    const-string v6, " worker"

    invoke-static {v5, v2, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-wide v5, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->H:J

    new-instance p1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;-><init>(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;Lq83/d;)V

    iput v4, v0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$g;->y:I

    invoke-static {v5, v6, p1, v0}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ll83/a0;

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, " timeout, will retry on next scheduled run"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1
.end method
