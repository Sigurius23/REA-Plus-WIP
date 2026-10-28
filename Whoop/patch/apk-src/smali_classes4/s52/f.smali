.class public Ls52/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final i:Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lp92/f;

.field private final c:Lod1/f;

.field private final d:Landroid/app/NotificationManager;

.field private final e:Ltr2/n;

.field private final f:Lm02/a;

.field private final g:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final h:Lc12/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ls52/f;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lod1/f;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lc12/c;Lm02/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls52/f;->a:Landroid/content/Context;

    new-instance v0, Lp92/f;

    invoke-direct {v0, p1}, Lp92/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ls52/f;->b:Lp92/f;

    iput-object p2, p0, Ls52/f;->c:Lod1/f;

    const-string p2, "notification"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    iput-object p1, p0, Ls52/f;->d:Landroid/app/NotificationManager;

    iput-object p3, p0, Ls52/f;->e:Ltr2/n;

    iput-object p4, p0, Ls52/f;->g:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p5, p0, Ls52/f;->h:Lc12/c;

    iput-object p6, p0, Ls52/f;->f:Lm02/a;

    return-void
.end method

.method public static synthetic a(Lix/a;Lgx/a;Lod1/k;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls52/f;->c(Lix/a;Lgx/a;Lod1/k;)V

    return-void
.end method

.method public static synthetic b(Lix/a;Lgx/a;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls52/f;->d(Lix/a;Lgx/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static synthetic c(Lix/a;Lgx/a;Lod1/k;)V
    .locals 0

    invoke-static {p2}, Lcom/whoop/realtime/service/c;->g(Lod1/k;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lix/a;->b(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lgx/a;->a()V

    return-void
.end method

.method private static synthetic d(Lix/a;Lgx/a;Ljava/lang/Throwable;)V
    .locals 0

    const/4 p2, 0x5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0, p2}, Lix/a;->b(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lgx/a;->a()V

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 2

    const-class v0, Ly82/a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly82/a;

    invoke-interface {v0, p0}, Ly82/a;->a(Landroid/content/Context;)V

    return-void
.end method

.method private f(Lp92/a;I)V
    .locals 7

    iget-object v0, p0, Ls52/f;->a:Landroid/content/Context;

    invoke-static {v0}, Ls4/c;->getContextForLanguage(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lp92/a;->c()Lp92/e;

    move-result-object v1

    invoke-virtual {p1}, Lp92/a;->a()J

    move-result-wide v2

    invoke-static {v0, p2, v1, v2, v3}, Lcom/whoop/realtime/service/c;->c(Landroid/content/Context;ILp92/e;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lp92/a;->b()I

    move-result v2

    invoke-static {v2}, Lc12/a;->b(I)I

    move-result v2

    iget-object v3, p0, Ls52/f;->e:Ltr2/n;

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    const-string v5, "Sending user to AddActivityFragment android-app://com.whoop/editActivity/AddActivity"

    invoke-interface {v3, v5, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lp92/a;->c()Lp92/e;

    move-result-object v3

    invoke-virtual {v3}, Lp92/e;->c()J

    move-result-wide v3

    invoke-virtual {p1}, Lp92/a;->a()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lqp0/a;->d(JJ)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lor2/j;->a(Ljava/util/Map;)Landroid/os/Bundle;

    move-result-object p1

    iget-object v3, p0, Ls52/f;->f:Lm02/a;

    iget-object v4, p0, Ls52/f;->a:Landroid/content/Context;

    invoke-interface {v3, v4, p1}, Lm02/a;->c(Landroid/content/Context;Landroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object p1

    iget-object v3, p0, Ls52/f;->h:Lc12/c;

    iget-object v4, p0, Ls52/f;->a:Landroid/content/Context;

    invoke-interface {v3, v4}, Lc12/c;->a(Landroid/content/Context;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    invoke-static {v0, p2}, Lcom/whoop/realtime/service/c;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    new-instance v0, Landroidx/core/app/NotificationCompat$BigTextStyle;

    invoke-direct {v0}, Landroidx/core/app/NotificationCompat$BigTextStyle;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$BigTextStyle;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p1

    sget-object p2, Lc12/e;->c:Lc12/d;

    invoke-virtual {p2, p1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    iget-object p2, p0, Ls52/f;->d:Landroid/app/NotificationManager;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method private h(Lp92/a;)Z
    .locals 9

    iget-object v0, p0, Ls52/f;->e:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to sync activity from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lp92/a;->c()Lp92/e;

    move-result-object v2

    invoke-virtual {v2}, Lp92/e;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lp92/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    const-string v4, "RealTimeActivitySync"

    invoke-interface {v0, v4, v1, v3}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lp92/a;->c()Lp92/e;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lp92/e;->a()Llm2/b;

    move-result-object v3

    new-instance v4, Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lp92/e;->c()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance v5, Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lp92/a;->a()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance v6, Lix/a;

    invoke-direct {v6}, Lix/a;-><init>()V

    new-instance v7, Lgx/a;

    invoke-direct {v7}, Lgx/a;-><init>()V

    instance-of v8, v3, Llm2/d;

    if-eqz v8, :cond_0

    check-cast v3, Llm2/d;

    iget-object v8, p0, Ls52/f;->c:Lod1/f;

    invoke-virtual {v0}, Lp92/e;->f()Z

    move-result v0

    invoke-virtual {v3, v8, v4, v5, v0}, Llm2/d;->s(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;

    move-result-object v0

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v3

    iget-object v3, v3, Lkh3/a;->b:Leh3/e;

    invoke-virtual {v0, v3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v3, Ls52/e;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v6, v7}, Ls52/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ls52/e;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v6, v7}, Ls52/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v4}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls52/f;->c:Lod1/f;

    invoke-interface {v3, v0, v4, v5}, Llm2/b;->f(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;

    move-result-object v0

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v3

    iget-object v3, v3, Lkh3/a;->b:Leh3/e;

    invoke-virtual {v0, v3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v3, Ls52/f$a;

    invoke-direct {v3, p0, v6, v7}, Ls52/f$a;-><init>(Ls52/f;Lix/a;Lgx/a;)V

    invoke-virtual {v0, v3}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    :goto_0
    invoke-virtual {v7}, Lgx/a;->b()V

    invoke-virtual {v6}, Lix/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x5

    if-eq v0, v3, :cond_1

    iget-object v3, p0, Ls52/f;->e:Ltr2/n;

    const-string v4, "Activity Sync returned a failure. Removing and showing notification."

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v4, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Ls52/f;->b:Lp92/f;

    invoke-virtual {p1}, Lp92/a;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Lp92/f;->g(I)V

    invoke-direct {p0, p1, v0}, Ls52/f;->f(Lp92/a;I)V

    return v1

    :cond_1
    iget-object p1, p0, Ls52/f;->e:Ltr2/n;

    const-string v0, "Activity Sync returned a recoverable error. Saving for later."

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return v2

    :cond_2
    iget-object v0, p0, Ls52/f;->b:Lp92/f;

    invoke-virtual {p1}, Lp92/a;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Lp92/f;->g(I)V

    iget-object p1, p0, Ls52/f;->e:Ltr2/n;

    const-string v0, "Activity Sync completed"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_3
    iget-object v0, p0, Ls52/f;->b:Lp92/f;

    invoke-virtual {v0, p1}, Lp92/f;->h(Lp92/a;)V

    return v1
.end method


# virtual methods
.method public g()Z
    .locals 4

    sget-object v0, Ls52/f;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls52/f;->b:Lp92/f;

    invoke-virtual {v1}, Lp92/f;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp92/a;

    invoke-direct {p0, v3}, Ls52/f;->h(Lp92/a;)Z

    move-result v3

    and-int/2addr v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
