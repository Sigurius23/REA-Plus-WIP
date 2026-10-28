.class public final synthetic Landroidx/profileinstaller/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/profileinstaller/a;->w:I

    iput-object p1, p0, Landroidx/profileinstaller/a;->y:Ljava/lang/Object;

    iput p2, p0, Landroidx/profileinstaller/a;->x:I

    iput-object p3, p0, Landroidx/profileinstaller/a;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Parcelable;II)V
    .locals 0

    .line 2
    iput p4, p0, Landroidx/profileinstaller/a;->w:I

    iput-object p1, p0, Landroidx/profileinstaller/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/profileinstaller/a;->z:Ljava/lang/Object;

    iput p3, p0, Landroidx/profileinstaller/a;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Landroidx/profileinstaller/a;->w:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    iget-object v3, p0, Landroidx/profileinstaller/a;->z:Ljava/lang/Object;

    iget v4, p0, Landroidx/profileinstaller/a;->x:I

    iget-object v5, p0, Landroidx/profileinstaller/a;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v5, Ljava/util/concurrent/CopyOnWriteArraySet;

    check-cast v3, Lx8/f;

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx8/h;

    iget-boolean v6, v5, Lx8/h;->d:Z

    if-nez v6, :cond_0

    if-eq v4, v2, :cond_1

    iget-object v6, v5, Lx8/h;->b:Llo/e;

    invoke-virtual {v6, v4}, Llo/e;->a(I)V

    :cond_1
    iput-boolean v1, v5, Lx8/h;->c:Z

    iget-object v5, v5, Lx8/h;->a:Ljava/lang/Object;

    invoke-interface {v3, v5}, Lx8/f;->invoke(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void

    :pswitch_0
    check-cast v5, Ltd3/c;

    check-cast v3, Landroid/bluetooth/le/ScanResult;

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v0

    check-cast v0, Ltd3/f;

    invoke-virtual {v0, v3}, Ltd3/f;->e(Landroid/bluetooth/le/ScanResult;)Ltd3/m;

    move-result-object v0

    iget-object v1, v5, Ltd3/c;->b:Ltd3/d;

    invoke-virtual {v1, v4, v0}, Ltd3/a;->a(ILtd3/m;)V

    return-void

    :pswitch_1
    check-cast v5, Lno/nordicsemi/android/ble/k0;

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, v5, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    if-eqz v0, :cond_3

    :try_start_0
    invoke-interface {v0, v3, v4}, Lmd3/c;->c(Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    const-string v1, "k0"

    const-string v2, "Exception in Fail callback"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_1
    return-void

    :pswitch_2
    check-cast v5, Ljava/util/concurrent/CopyOnWriteArraySet;

    check-cast v3, Llo/h;

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llo/j;

    iget-boolean v6, v5, Llo/j;->d:Z

    if-nez v6, :cond_4

    if-eq v4, v2, :cond_5

    iget-object v6, v5, Llo/j;->b:Llo/e;

    invoke-virtual {v6, v4}, Llo/e;->a(I)V

    :cond_5
    iput-boolean v1, v5, Llo/j;->c:Z

    iget-object v5, v5, Llo/j;->a:Ljava/lang/Object;

    invoke-interface {v3, v5}, Llo/h;->invoke(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    return-void

    :pswitch_3
    check-cast v5, Lg/j;

    check-cast v3, Landroid/content/IntentSender$SendIntentException;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v5, v4, v1, v0}, Lj/j;->a(IILandroid/content/Intent;)Z

    return-void

    :pswitch_4
    check-cast v5, Lg/j;

    check-cast v3, Lk/a;

    iget-object v0, v3, Lk/a;->a:Ljava/lang/Object;

    iget-object v1, v5, Lj/j;->a:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    iget-object v2, v5, Lj/j;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj/f;

    if-eqz v2, :cond_8

    iget-object v3, v2, Lj/f;->a:Lj/b;

    goto :goto_3

    :cond_8
    const/4 v3, 0x0

    :goto_3
    if-nez v3, :cond_9

    iget-object v2, v5, Lj/j;->g:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v2, v5, Lj/j;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    iget-object v2, v2, Lj/f;->a:Lj/b;

    const-string v3, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v5, Lj/j;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v2, v0}, Lj/b;->a(Ljava/lang/Object;)V

    :cond_a
    :goto_4
    return-void

    :pswitch_5
    check-cast v5, Landroidx/profileinstaller/DeviceProfileWriter;

    invoke-static {v5, v4, v3}, Landroidx/profileinstaller/DeviceProfileWriter;->a(Landroidx/profileinstaller/DeviceProfileWriter;ILjava/lang/Object;)V

    return-void

    nop

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
