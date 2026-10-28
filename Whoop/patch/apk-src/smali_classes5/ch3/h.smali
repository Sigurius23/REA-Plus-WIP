.class public final Lch3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch3/h;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lch3/h;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfk/a;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lch3/h;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Lch3/h;->z:Ljava/lang/Object;

    .line 9
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    iput-boolean p1, p0, Lch3/h;->y:Z

    if-nez p1, :cond_1

    .line 12
    const-string p1, "No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode"

    .line 13
    invoke-interface {p2, p1}, Lfk/a;->warn(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public constructor <init>(Lfa3/v;Ldc3/s;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lch3/h;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lch3/h;->x:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lch3/h;->z:Ljava/lang/Object;

    .line 5
    iget-boolean p1, p1, Lfa3/v;->d:Z

    if-nez p1, :cond_1

    .line 6
    sget-object p1, Lfa3/r;->a:Lva3/e;

    .line 7
    invoke-virtual {p2, p1}, Ldc3/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lfa3/b0;->x:Lfa3/b0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lch3/h;->y:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lch3/j;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lch3/h;->w:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lch3/h;->x:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lch3/h;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcq/p;)V
    .locals 2

    iget-object v0, p0, Lch3/h;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lch3/h;->z:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lch3/h;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lch3/h;->y:Z

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lch3/h;->y:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    iget-object v1, p0, Lch3/h;->x:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcq/p;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lch3/h;->y:Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0, p1}, Lcq/p;->a(Lcom/google/android/gms/tasks/Task;)V

    goto :goto_0

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    :try_start_3
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public request(J)V
    .locals 2

    iget-boolean v0, p0, Lch3/h;->y:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/h;->y:Z

    iget-object p1, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast p1, Lch3/j;

    iget-object p2, p0, Lch3/h;->x:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lch3/j;->j(Ljava/lang/Object;)V

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lch3/j;->i(J)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lch3/h;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JavaTypeEnhancementState(jsr305="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lch3/h;->x:Ljava/lang/Object;

    check-cast v1, Lfa3/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", getReportLevelForAnnotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lch3/h;->z:Ljava/lang/Object;

    check-cast v1, Ldc3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
