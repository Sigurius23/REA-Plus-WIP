.class public final Landroidx/room/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Landroidx/room/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Landroidx/room/b0;->w:I

    iput-object p1, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget v0, p0, Landroidx/room/b0;->w:I

    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lxr/b;

    iget-object v2, v0, Lxr/b;->b:Lxr/t;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lsr/c;

    invoke-direct {p1, p0, p2}, Lsr/c;-><init>(Landroidx/room/b0;Landroid/os/IBinder;)V

    invoke-virtual {v0}, Lxr/b;->a()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lvr/i;

    iget-object v2, v0, Lvr/i;->b:Ldb/j0;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ldb/j0;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lur/e;

    invoke-direct {p1, p0, p2}, Lur/e;-><init>(Landroidx/room/b0;Landroid/os/IBinder;)V

    invoke-virtual {v0}, Lvr/i;->a()Landroid/os/Handler;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    sget v0, Le/a;->f:I

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Le/b;->d:Ljava/lang/String;

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p2

    if-eqz p2, :cond_1

    instance-of v0, p2, Le/b;

    if-eqz v0, :cond_1

    check-cast p2, Le/b;

    :cond_1
    :goto_0
    const-string p2, "componentName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Custom Tabs Service connected before an applicationcontext has been provided."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/room/c0;

    sget v0, Landroidx/room/d0;->g:I

    sget-object v0, Landroidx/room/q;->c:Ljava/lang/String;

    invoke-interface {p2, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_3

    instance-of v1, v0, Landroidx/room/q;

    if-eqz v1, :cond_3

    check-cast v0, Landroidx/room/q;

    goto :goto_1

    :cond_3
    new-instance v0, Landroidx/room/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p2, v0, Landroidx/room/p;->f:Landroid/os/IBinder;

    :goto_1
    iput-object v0, p1, Landroidx/room/c0;->g:Landroidx/room/q;

    :try_start_0
    iget-object p2, p1, Landroidx/room/c0;->j:Landroidx/room/z;

    iget-object v1, p1, Landroidx/room/c0;->a:Ljava/lang/String;

    invoke-interface {v0, p2, v1}, Landroidx/room/q;->H(Landroidx/room/o;Ljava/lang/String;)I

    move-result p2

    iput p2, p1, Landroidx/room/c0;->f:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, "ROOM"

    const-string v0, "Cannot register multi-instance invalidation callback"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget v0, p0, Landroidx/room/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lxr/b;

    iget-object v1, v0, Lxr/b;->b:Lxr/t;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v1, v2, p1}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lxr/a;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lxr/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Lxr/b;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lvr/i;

    iget-object v1, v0, Lvr/i;->b:Ldb/j0;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v1, v2, p1}, Ldb/j0;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lvr/h;

    const/4 v1, 0x1

    invoke-direct {p1, p0, v1}, Lvr/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0}, Lvr/i;->a()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_1
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_2
    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/room/c0;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/room/c0;->g:Landroidx/room/q;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
