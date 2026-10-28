.class public final synthetic Lvd1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp73/b;
.implements Lud3/z;
.implements Lio/sentry/d6;
.implements Lcq/f;
.implements Lcq/d;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lvd1/c;->w:I

    iput-object p1, p0, Lvd1/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget v0, p0, Lvd1/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lz1/l;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lz1/l;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_0
    iget-object v0, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v0, Lx30/j1;

    sget-object v1, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    sget-object v2, Lz1/l;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->b1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    sput-object v0, Lz1/l;->i:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    invoke-static {}, Lz1/l;->a()V

    return-void

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v0, Lvd1/b;

    invoke-static {v0, p1}, Lvd1/d;->l(Lvd1/b;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lzd3/o;)Lud3/a0;
    .locals 0

    iget-object p1, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast p1, Lud3/a0;

    return-object p1
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    check-cast p1, Lzt/w;

    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Leh/a;

    invoke-virtual {v0}, Leh/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzt/w;->h:Lzt/u;

    invoke-virtual {v0}, Lzt/u;->a()Lzt/t;

    move-result-object v0

    if-eqz v0, :cond_0

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p1, Lzt/w;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lzt/w;->f(J)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    return-void
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget p1, p0, Lvd1/c;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void

    :pswitch_0
    iget-object p1, p0, Lvd1/c;->x:Ljava/lang/Object;

    check-cast p1, Lzt/b0;

    iget-object p1, p1, Lzt/b0;->b:Lcq/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
