.class public final Lch3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lch3/q;->w:I

    iput-object p2, p0, Lch3/q;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch3/q;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lch3/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/s;

    new-instance v0, Ldx/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldx/a;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Ldx/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, v0}, Ldx/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lmh3/b;

    invoke-direct {v2, v1}, Lmh3/b;-><init>(Lbh3/a;)V

    invoke-virtual {p1, v2}, Lxg3/s;->c(Lxg3/t;)V

    iget-object p1, p0, Lch3/q;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object v1, p0, Lch3/q;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/IntentFilter;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    return-void

    :pswitch_0
    check-cast p1, Lxg3/s;

    :try_start_0
    iget-object v0, p0, Lch3/q;->y:Ljava/lang/Object;

    check-cast v0, Lxg3/f;

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->c()Ljh3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg3/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0}, Lxg3/s;->d()V

    iget-object v1, p0, Lch3/q;->x:Ljava/lang/Object;

    check-cast v1, Lxg3/e;

    invoke-interface {v1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-interface {p1, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
