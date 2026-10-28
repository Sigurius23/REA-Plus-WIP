.class public Lcom/whoop/service/sync/WhoopSyncService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/sync/WhoopSyncService$b;,
        Lcom/whoop/service/sync/WhoopSyncService$a;
    }
.end annotation


# static fields
.field private static final J:Lc12/d;


# instance fields
.field private E:Z

.field private F:Z

.field private G:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private H:Landroid/app/Notification;

.field private I:Ltr2/n;

.field final w:Lca2/m;

.field private final x:Lx82/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx82/e$a<",
            "Lcom/whoop/service/sync/WhoopSyncService;",
            ">;"
        }
    .end annotation
.end field

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lc12/d;

    sget-object v1, Lc12/b;->LOW:Lc12/b;

    const-string v2, "05000_DataSyncing"

    sget v3, Lhi0/j;->o:I

    invoke-direct {v0, v1, v2, v3}, Lc12/d;-><init>(Lc12/b;Ljava/lang/String;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc12/d;->k(Z)Lc12/d;

    move-result-object v0

    sput-object v0, Lcom/whoop/service/sync/WhoopSyncService;->J:Lc12/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const-class v0, Lca2/m;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lca2/m;

    iput-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->w:Lca2/m;

    new-instance v0, Lx82/e$a;

    invoke-direct {v0, p0}, Lx82/e$a;-><init>(Landroid/app/Service;)V

    iput-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->x:Lx82/e$a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->G:Ljava/util/HashSet;

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/service/sync/WhoopSyncService;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/service/sync/WhoopSyncService;->y:Z

    return p0
.end method

.method public static b(Landroid/content/Context;)Lcom/whoop/service/sync/WhoopSyncService$b;
    .locals 7

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whoop/service/sync/WhoopSyncService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v1, Lcom/whoop/service/sync/WhoopSyncService$b;

    invoke-direct {v1, p0}, Lcom/whoop/service/sync/WhoopSyncService$b;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v1

    :cond_0
    new-instance v3, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v4

    invoke-virtual {v4}, Le50/b;->d()Ltr2/n;

    move-result-object v4

    const-string v5, "WhoopSyncService"

    invoke-direct {v3, v4, v5}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    const-string v4, "Binding to service failed"

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v3, v4, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v1}, Lx82/e;->a()Landroid/app/Service;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string p0, "Binding to service failed, but connection seems fine"

    new-array v0, v5, [Lqr2/a$a;

    invoke-interface {v3, p0, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_1
    invoke-virtual {v1, p0}, Lx82/e;->b(Landroid/content/Context;)V

    new-instance v1, Lcom/whoop/service/sync/WhoopSyncService$b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/whoop/service/sync/WhoopSyncService$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Binding to service failed, but retry succeeded"

    new-array v0, v5, [Lqr2/a$a;

    invoke-interface {v3, p0, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_2
    const-string v0, "Service rebind failed, failing everything"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v3, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v1, p0}, Lx82/e;->b(Landroid/content/Context;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private c()V
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Starting as foreground"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->H:Landroid/app/Notification;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Landroid/app/Notification;->when:J

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/16 v2, 0x46

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->H:Landroid/app/Notification;

    const/16 v1, 0x10

    invoke-virtual {p0, v2, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->H:Landroid/app/Notification;

    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->F:Z

    return-void
.end method

.method private d(Z)V
    .locals 3

    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->F:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->z:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->E:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->G:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->z:Z

    const/4 v0, 0x0

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->E:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const-string v1, "Stopping foreground"

    new-array v2, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/app/Service;->stopForeground(Z)V

    iput-boolean v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->F:Z

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const-string v1, "Not stopping foreground"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    sget-object v0, Lcom/whoop/service/sync/WhoopSyncService;->J:Lc12/d;

    invoke-virtual {v0, p1, p0}, Lc12/d;->e(Landroid/app/NotificationManager;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public e()Ltr2/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->I:Ltr2/n;

    return-object v0
.end method

.method public g(Ljava/lang/String;)I
    .locals 5

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object v0

    const-string v1, "performing action "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x2

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "btForeground"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_1
    const-string v0, "stopBackground"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_2
    const-string v0, "uploadForeground"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_3
    const-string v0, "uploadStopForeground"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move v4, v1

    goto :goto_0

    :sswitch_4
    const-string v0, "btStopForeground"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move v4, v3

    goto :goto_0

    :sswitch_5
    const-string v0, "background"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    move v4, v2

    :goto_0
    packed-switch v4, :pswitch_data_0

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object v0

    const-string v3, "performAction(): Unrecognized action: "

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :pswitch_0
    iput-boolean v3, p0, Lcom/whoop/service/sync/WhoopSyncService;->z:Z

    invoke-direct {p0}, Lcom/whoop/service/sync/WhoopSyncService;->c()V

    return v3

    :pswitch_1
    iget-boolean p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->z:Z

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const-string v0, "Tried to stop background, but service is foregrounded... "

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const-string v0, "Stopping background"

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-boolean v2, p0, Lcom/whoop/service/sync/WhoopSyncService;->y:Z

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :goto_1
    return v1

    :pswitch_2
    iput-boolean v3, p0, Lcom/whoop/service/sync/WhoopSyncService;->E:Z

    invoke-direct {p0}, Lcom/whoop/service/sync/WhoopSyncService;->c()V

    return v3

    :pswitch_3
    iput-boolean v2, p0, Lcom/whoop/service/sync/WhoopSyncService;->E:Z

    invoke-direct {p0, v2}, Lcom/whoop/service/sync/WhoopSyncService;->d(Z)V

    return v1

    :pswitch_4
    iput-boolean v2, p0, Lcom/whoop/service/sync/WhoopSyncService;->z:Z

    invoke-direct {p0, v3}, Lcom/whoop/service/sync/WhoopSyncService;->d(Z)V

    return v1

    :pswitch_5
    iput-boolean v3, p0, Lcom/whoop/service/sync/WhoopSyncService;->y:Z

    return v3

    :sswitch_data_0
    .sparse-switch
        -0x4f67aad2 -> :sswitch_5
        -0x39466c29 -> :sswitch_4
        0x6257746 -> :sswitch_3
        0x1cc98624 -> :sswitch_2
        0x2b7f9ed0 -> :sswitch_1
        0x56bc9335 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onBind()"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->x:Lx82/e$a;

    return-object p1
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "WhoopSyncService"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->I:Ltr2/n;

    const-class v0, Lc12/c;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc12/c;

    invoke-interface {v0, p0}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lhi0/j;->w:I

    invoke-static {p0, v1}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lhi0/j;->v:I

    invoke-static {p0, v1}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setOnlyAlertOnce(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-static {p0}, Lor2/d1;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x4000000

    const/16 v3, 0x46

    invoke-static {p0, v3, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget-object v1, Lcom/whoop/service/sync/WhoopSyncService;->J:Lc12/d;

    invoke-virtual {v1, v0}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/sync/WhoopSyncService;->H:Landroid/app/Notification;

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onDestroy()"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p2

    sget-object p3, Lqr2/a$a;->IO:Lqr2/a$a;

    filled-new-array {p3}, [Lqr2/a$a;

    move-result-object v0

    const-string v1, "onStartCommand(): Starting up"

    invoke-interface {p2, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    filled-new-array {p3}, [Lqr2/a$a;

    move-result-object p2

    const-string p3, "onStartCommand(): Service restarted by system, assuming background"

    invoke-interface {p1, p3, p2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Landroid/content/Intent;

    const-string p2, "background"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/whoop/service/sync/WhoopSyncService;->g(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string p3, "No action specified"

    invoke-interface {p1, p3, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x2

    return p1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/service/sync/WhoopSyncService;->e()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onTaskRemoved()"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/whoop/service/sync/WhoopSyncService;->w:Lca2/m;

    invoke-virtual {p1}, Lca2/m;->a()V

    const-class p1, Lu92/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu92/b;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lu92/b;->A(Z)V

    invoke-virtual {p1}, Lu92/b;->y()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lu92/b;->z(J)V

    return-void
.end method
