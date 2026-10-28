.class public final Luo/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final w:I

.field public final synthetic x:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/a0;->x:Luo/c;

    iput p2, p0, Luo/a0;->w:I

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object p1, p0, Luo/a0;->x:Luo/c;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Luo/c;->r()V

    return-void

    :cond_0
    iget-object v0, p1, Luo/c;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "com.google.android.gms.common.internal.IGmsServiceBroker"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Luo/v;

    if-eqz v2, :cond_1

    check-cast v1, Luo/v;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance v1, Luo/v;

    invoke-direct {v1, p2}, Luo/v;-><init>(Landroid/os/IBinder;)V

    :goto_0
    iput-object v1, p1, Luo/c;->h:Luo/v;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Luo/a0;->x:Luo/c;

    iget p2, p0, Luo/a0;->w:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Luo/c0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Luo/c0;-><init>(Luo/c;ILandroid/os/Bundle;)V

    iget-object p1, p1, Luo/c;->e:Luo/y;

    const/4 v1, 0x7

    const/4 v2, -0x1

    invoke-virtual {p1, v1, p2, v2, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object p1, p0, Luo/a0;->x:Luo/c;

    iget-object v0, p1, Luo/c;->g:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p1, Luo/c;->h:Luo/v;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Luo/a0;->x:Luo/c;

    iget v0, p0, Luo/a0;->w:I

    iget-object p1, p1, Luo/c;->e:Luo/y;

    const/4 v1, 0x6

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
