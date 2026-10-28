.class public final synthetic Lbu/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt/e;
.implements Lio/sentry/y1;
.implements Lio/sentry/e4;
.implements Lio/sentry/b4;
.implements Lio/sentry/z3;
.implements Lp73/b;
.implements Lio/sentry/n4;
.implements Lcq/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbu/d;->w:I

    iput-object p2, p0, Lbu/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbu/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzt/j;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/16 v0, 0x9

    iput v0, p0, Lbu/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbu/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbu/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v0, Lzt/j;

    iget-object v1, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lzt/j;->b:Ljava/lang/Object;

    check-cast v2, La0/g;

    invoke-virtual {v2, v1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Lp92/f;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    check-cast p1, Li92/h;

    invoke-static {v0, v1, p1}, Lcom/whoop/realtime/service/b;->d(Lp92/f;Landroid/content/Context;Li92/h;)V

    return-void
.end method

.method public b(Lio/sentry/q6;)V
    .locals 2

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lyq1/a;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, v1, p1}, Lyq1/a;->b(Landroid/content/Context;Lyq1/a;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method

.method public c(La3/p;)V
    .locals 4

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/b1;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    iget-object p1, p1, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    iget-boolean v2, p1, Lio/sentry/c;->f:Z

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lio/sentry/b1;->G()La3/p;

    move-result-object v2

    invoke-interface {v0}, Lio/sentry/b1;->s()Lio/sentry/protocol/v;

    move-result-object v0

    iget-object v2, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/protocol/v;

    invoke-virtual {v2}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sentry-trace_id"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/q6;->retrieveParsedDsn()Lio/sentry/y;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/y;->b:Ljava/lang/String;

    const-string v3, "sentry-public_key"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sentry-release"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sentry-environment"

    invoke-virtual {p1, v3, v2}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v2, v0}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "sentry-replay_id"

    invoke-virtual {p1, v2, v0}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1}, Lio/sentry/q6;->getEffectiveOrgId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sentry-org_id"

    invoke-virtual {p1, v1, v0}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sentry-transaction"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p1, Lio/sentry/c;->f:Z

    if-eqz v0, :cond_1

    iput-object v1, p1, Lio/sentry/c;->c:Ljava/lang/Double;

    :cond_1
    const-string v0, "sentry-sampled"

    invoke-virtual {p1, v0, v1}, Lio/sentry/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Lio/sentry/c;->f:Z

    :cond_2
    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/e2;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/g2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v1}, Lio/sentry/g2;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/g2;->nextDouble()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    invoke-virtual {v1}, Lio/sentry/g2;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbu/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lgt/b;

    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v1, Lgt/b;->f:Lgt/e;

    invoke-interface {v0, p1}, Lgt/e;->f(Laa3/i1;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lb23/h;

    const-class v2, Landroid/content/Context;

    invoke-virtual {p1, v2}, Laa3/i1;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iget v1, v1, Lb23/h;->w:I

    packed-switch v1, :pswitch_data_1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.type.television"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p1, "tv"

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.type.watch"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p1, "watch"

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.type.automotive"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p1, "auto"

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v1, "android.hardware.type.embedded"

    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "embedded"

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->minSdkVersion:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v1, Lbu/a;

    invoke-direct {v1, v0, p1}, Lbu/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x6
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public g(Lio/sentry/n1;)V
    .locals 2

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/g;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b1;

    iget-object v0, v0, Lio/sentry/android/core/internal/gestures/g;->E:Lio/sentry/n1;

    if-ne p1, v0, :cond_0

    invoke-interface {v1}, Lio/sentry/b1;->E()V

    :cond_0
    return-void
.end method

.method public h(Lio/sentry/b1;)V
    .locals 4

    iget v0, p0, Lbu/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    new-instance v2, Lbu/d;

    const/4 v3, 0x6

    invoke-direct {v2, v3, p1, v1}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/sentry/b1;->M(Lio/sentry/z3;)La3/p;

    move-result-object p1

    iput-object p1, v0, Laj/d;->w:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lbu/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object v1, p0, Lbu/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/n1;

    new-instance v2, Lio/sentry/android/core/f;

    invoke-direct {v2, v0, p1, v1}, Lio/sentry/android/core/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v2}, Lio/sentry/b1;->N(Lio/sentry/b4;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
