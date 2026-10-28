.class public Lcom/whoop/realtime/service/RealTimeActivityService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/service/RealTimeActivityService$a;
    }
.end annotation


# static fields
.field public static E:Ljava/lang/String; = "RealTimeActivityService"

.field private static final F:Lc12/d;


# instance fields
.field private final w:Lp92/i;

.field private x:Lp92/h;

.field private y:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final z:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->HIGH:Lc12/b;

    const-string v2, "06000_RealTimeActivities"

    sget v3, Lk52/f;->W:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc12/d;->k(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->l(Z)Lc12/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc12/d;->j(Z)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/realtime/service/RealTimeActivityService;->F:Lc12/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ls52/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lp92/i;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp92/i;

    iput-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->w:Lp92/i;

    sget-object v0, Lcom/whoop/realtime/service/RealTimeActivityService;->E:Ljava/lang/String;

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    return-void
.end method

.method public static synthetic a(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)Luf3/a;
    .locals 0

    invoke-direct {p1, p0}, Lcom/whoop/realtime/service/RealTimeActivityService;->l(Lp92/e;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/service/RealTimeActivityService;->k()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/service/RealTimeActivityService;->j()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private g(Lp92/e;)Z
    .locals 2

    invoke-virtual {p1}, Lp92/e;->f()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    const-string p1, "android.permission.FOREGROUND_SERVICE_LOCATION"

    invoke-virtual {p0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    const-string p1, "android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE"

    invoke-virtual {p0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {p0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public static h(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    sget-object v0, Lcom/whoop/realtime/service/RealTimeActivityService;->F:Lc12/d;

    invoke-virtual {v0, p1, p0}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    return-void
.end method

.method private i()Z
    .locals 5

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget-object v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget v3, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v4, 0x64

    if-ne v3, v4, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method private static synthetic j()Luf3/a;
    .locals 1

    const/16 v0, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic k()Luf3/a;
    .locals 1

    const/16 v0, 0x37

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private synthetic l(Lp92/e;)Luf3/a;
    .locals 0

    invoke-virtual {p1}, Lp92/e;->b()Lcom/whoop/data/repositories/RestingHeartRate;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p1

    return-object p1
.end method

.method private m(Ljava/lang/String;)V
    .locals 8

    const-string v0, "reason:"

    :try_start_0
    const-class v1, Liy1/c;

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    new-instance v2, Ljy1/a;

    const-string v4, "realtime_service_start_failure"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lq63/c;->r(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;)V

    invoke-interface {v1, v2}, Liy1/c;->b(Ljy1/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to log metric: realtime_service_start_failure"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private n(Lp92/e;)I
    .locals 0

    invoke-virtual {p1}, Lp92/e;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    return p1

    :cond_0
    const/16 p1, 0x10

    return p1
.end method


# virtual methods
.method public d(Llh3/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh3/b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "STRAINCOACH RealTimeActivityService connect straincontroller subject"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->y:Llh3/b;

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    const-string v0, "STRAINCOACH RealTimeActivityService emit strainController!"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->y:Llh3/b;

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public e(Lp92/e;)Landroid/app/Notification;
    .locals 9

    new-instance v0, Ls51/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls51/p;-><init>(I)V

    const-class v1, Lp92/i;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp92/i;

    invoke-static {p0, v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->F0(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->u(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {p1}, Lp92/e;->e()Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->w(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {p1}, Lp92/e;->d()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->A(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->s()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->f()Landroid/content/Intent;

    move-result-object v1

    invoke-static {p0}, Ls4/c;->getContextForLanguage(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object v4

    invoke-interface {v4, v3}, Llm2/b;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lk52/f;->o:I

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->F0(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->u(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {p1}, Lp92/e;->e()Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->w(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {p1}, Lp92/e;->d()D

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->A(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->s()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->r()Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->f()Landroid/content/Intent;

    move-result-object v0

    const/16 v6, 0x17

    const/high16 v7, 0x4000000

    invoke-static {p0, v6, v0, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    new-instance v6, Landroidx/core/app/NotificationCompat$Action;

    sget v8, Lk52/c;->e:I

    invoke-direct {v6, v8, v5, v0}, Landroidx/core/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    const-class v0, Lc12/c;

    invoke-static {v0, v2, v2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc12/c;

    invoke-interface {v0, p0}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/16 v2, 0x14

    invoke-static {p0, v2, v1, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lk52/f;->s:I

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lk52/f;->r:I

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOngoing(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget-object v2, Lcom/whoop/realtime/service/RealTimeActivityService;->F:Lc12/d;

    invoke-virtual {v2, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object p1

    instance-of p1, p1, Llm2/d;

    if-eqz p1, :cond_0

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, Lk52/g;->e:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v3, Lk52/a;->a:I

    invoke-virtual {v2, v3, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->data:I

    const/16 v1, 0x320

    const/16 v2, 0xbb8

    invoke-virtual {v0, p1, v1, v2}, Landroidx/core/app/NotificationCompat$Builder;->setLights(III)Landroidx/core/app/NotificationCompat$Builder;

    :cond_0
    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    return-object p1
.end method

.method public f()Lp92/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    return-object v0
.end method

.method public o(Lp92/e;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->g(Lp92/e;)Z

    move-result v1

    const-string v3, "RealTimeActivityService"

    if-nez v1, :cond_0

    const-string p1, "missing_permissions"

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->m(Ljava/lang/String;)V

    invoke-static {v3}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    const-string v0, "Cannot start service: missing required permissions"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/service/RealTimeActivityService;->i()Z

    move-result v1

    if-nez v1, :cond_1

    const-string p1, "app_not_in_foreground"

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->m(Ljava/lang/String;)V

    invoke-static {v3}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    const-string v0, "Cannot start service: app is not in foreground"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/whoop/realtime/service/RealTimeActivityService;

    invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const/16 v1, 0x1d

    const/16 v3, 0x14

    if-lt v0, v1, :cond_2

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->n(Lp92/e;)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->e(Lp92/e;)Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->e(Lp92/e;)Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object v0

    instance-of v0, v0, Llm2/d;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    if-nez v0, :cond_3

    new-instance v0, Ls51/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0, p1}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lp92/h;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp92/h;

    iput-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    invoke-virtual {p1}, Lp92/h;->c0()V

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->y:Llh3/b;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    const-string v0, "STRAINCOACH RealTimeActivityService emit strainController on startup!"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->y:Llh3/b;

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_3
    iget-object p1, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->w:Lp92/i;

    invoke-virtual {p1}, Lp92/i;->a()V

    :cond_4
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    new-instance p1, Lcom/whoop/realtime/service/RealTimeActivityService$a;

    invoke-direct {p1, p0}, Lcom/whoop/realtime/service/RealTimeActivityService$a;-><init>(Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-object p1
.end method

.method public p()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->w:Lp92/i;

    invoke-virtual {v0}, Lp92/i;->b()V

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->x:Lp92/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/h;->h0()V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    iget-object v0, p0, Lcom/whoop/realtime/service/RealTimeActivityService;->z:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "STRAINCOACH RealTimeActivityService stopping"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
