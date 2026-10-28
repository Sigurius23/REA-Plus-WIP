.class public final La8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final w:Landroid/content/Context;

.field public final x:Landroid/os/Handler;

.field public final y:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La8/b;->y:Ljava/util/HashMap;

    iput-object p1, p0, La8/b;->w:Landroid/content/Context;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, La8/b;->x:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 11

    iget v0, p1, Landroid/os/Message;->what:I

    const-wide/16 v1, 0x3a98

    const/4 v3, 0x6

    const-string v4, "ServiceConnection"

    iget-object v5, p0, La8/b;->x:Landroid/os/Handler;

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Received unknown message: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ConnectionManager"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, La8/f;

    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, La8/f;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, La8/f;->E:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, La8/f;->e()V

    return v6

    :cond_1
    invoke-virtual {v5, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-virtual {v5, v3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v5, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_2
    :goto_0
    return v6

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, La8/a;

    iget v0, p1, La8/a;->a:I

    packed-switch v0, :pswitch_data_1

    iget-object v0, p1, La8/a;->b:Ljava/lang/Object;

    check-cast v0, Lv7/b;

    iget-object v0, v0, Lv7/b;->a:Lqg3/d;

    goto :goto_1

    :pswitch_4
    iget-object v0, p1, La8/a;->b:Ljava/lang/Object;

    check-cast v0, Lqg3/d;

    :goto_1
    invoke-virtual {v0}, Lqg3/d;->q()Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, La8/b;->y:Ljava/util/HashMap;

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La8/f;

    if-nez v8, :cond_3

    new-instance v8, La8/f;

    new-instance v9, La8/d;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, La8/d;-><init>(I)V

    iget-object v10, p0, La8/b;->w:Landroid/content/Context;

    invoke-direct {v8, v10, v0, v9, p0}, La8/f;-><init>(Landroid/content/Context;Lqg3/d;La8/d;La8/b;)V

    invoke-virtual {v7, v4, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, v8, La8/f;->G:Landroid/os/IBinder;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8, p1}, La8/f;->c(La8/a;)V

    goto :goto_2

    :cond_4
    iget-object v0, v8, La8/f;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8}, La8/f;->b()V

    :goto_2
    invoke-virtual {v5, v3, v8}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-virtual {v5, v3, v8}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v5, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return v6

    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, La8/f;

    iget-object v0, p1, La8/f;->y:Lqg3/d;

    iget-object v1, p1, La8/f;->E:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "No listeners registered, service HealthData is not automatically reconnected."

    invoke-static {v4, p1}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_5
    iget v1, p1, La8/f;->I:I

    add-int/2addr v1, v6

    iput v1, p1, La8/f;->I:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Listeners for service HealthData are registered, reconnecting."

    invoke-static {v4, v0}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, La8/f;->b()V

    return v6

    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, La8/f;

    iget-object v0, p1, La8/f;->E:Ljava/util/HashMap;

    iget-object v7, p1, La8/f;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Re-registering listener: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v9}, Lx43/j;->r(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La8/a;

    invoke-virtual {p1, v8}, La8/f;->c(La8/a;)V

    goto :goto_3

    :cond_6
    iget-object v0, p1, La8/f;->y:Lqg3/d;

    iget-object v0, v0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, La8/a;

    invoke-virtual {v7, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La8/a;

    invoke-virtual {v7, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-virtual {p1, v4}, La8/f;->c(La8/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v5, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-virtual {v5, v3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v5, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method
