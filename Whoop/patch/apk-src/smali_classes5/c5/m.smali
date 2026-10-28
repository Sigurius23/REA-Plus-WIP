.class public final Lc5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc5/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lso/a;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lc5/m;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc5/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc5/m;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/iterable/iterableapi/c2;Ljava/lang/String;ILcom/iterable/iterableapi/p;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lc5/m;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc5/m;->y:Ljava/lang/Object;

    iput-object p4, p0, Lc5/m;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lc5/m;->w:I

    iput-object p1, p0, Lc5/m;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc5/m;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc5/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lc5/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc5/m;->x:Ljava/lang/Object;

    check-cast v0, Lto/h;

    iget-object v1, p0, Lc5/m;->z:Ljava/lang/Object;

    check-cast v1, Lab/h0;

    iget v2, v1, Lab/h0;->x:I

    if-lez v2, :cond_1

    iget-object v2, v1, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lc5/m;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lto/h;->d(Landroid/os/Bundle;)V

    :cond_1
    iget v2, v1, Lab/h0;->x:I

    const/4 v3, 0x2

    if-lt v2, v3, :cond_2

    invoke-virtual {v0}, Lto/h;->h()V

    :cond_2
    iget v2, v1, Lab/h0;->x:I

    const/4 v3, 0x3

    if-lt v2, v3, :cond_3

    invoke-virtual {v0}, Lto/h;->f()V

    :cond_3
    iget v2, v1, Lab/h0;->x:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_4

    invoke-virtual {v0}, Lto/h;->i()V

    :cond_4
    iget v1, v1, Lab/h0;->x:I

    const/4 v2, 0x5

    if-lt v1, v2, :cond_5

    invoke-virtual {v0}, Lto/h;->e()V

    :cond_5
    return-void

    :pswitch_0
    iget-object v0, p0, Lc5/m;->y:Ljava/lang/Object;

    check-cast v0, Lso/a;

    invoke-virtual {v0}, Lso/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object v0

    goto :goto_1

    :cond_6
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Lso/a;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "google.message_id"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lso/a;->f()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v2, "google.product_id"

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_7
    iget-object v0, p0, Lc5/m;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v2, "supports_message_handled"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v0}, Lso/o;->b(Landroid/content/Context;)Lso/o;

    move-result-object v0

    new-instance v2, Lso/n;

    monitor-enter v0

    :try_start_0
    iget v3, v0, Lso/o;->a:I

    add-int/lit8 v4, v3, 0x1

    iput v4, v0, Lso/o;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v1, v4}, Lso/n;-><init>(IILandroid/os/Bundle;I)V

    invoke-virtual {v0, v2}, Lso/o;->c(Lso/n;)Lcq/u;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lc5/m;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Lso/i;->w:Lso/i;

    new-instance v3, Lq30/u0;

    const/16 v4, 0x12

    invoke-direct {v3, v1, v4}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2, v3}, Lcq/u;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcq/d;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :pswitch_1
    iget-object v0, p0, Lc5/m;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v1, p0, Lc5/m;->z:Ljava/lang/Object;

    check-cast v1, Llq/g;

    iget-object v2, p0, Lc5/m;->y:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_9

    iget-object v3, v1, Llq/g;->d:Landroid/widget/OverScroller;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v1, Llq/g;->d:Landroid/widget/OverScroller;

    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Llq/g;->M(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_8
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->S(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    iget-boolean v1, v2, Lcom/google/android/material/appbar/AppBarLayout;->L:Z

    if-eqz v1, :cond_9

    invoke-static {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->P(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    :cond_9
    :goto_2
    return-void

    :pswitch_2
    iget-object v0, p0, Lc5/m;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/c2;

    iget-object v1, p0, Lc5/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lc5/m;->z:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/p;

    check-cast v0, Lcom/iterable/iterableapi/n2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/n2;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/iterable/iterableapi/z1;

    sget-object v4, Lcom/iterable/iterableapi/n2;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/iterable/iterableapi/e0;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v2, Lcom/iterable/iterableapi/p;->a:Z

    iget-object v1, v2, Lcom/iterable/iterableapi/p;->d:Lorg/json/JSONObject;

    if-eqz v0, :cond_a

    if-eqz v3, :cond_b

    invoke-virtual {v3, v1}, Lcom/iterable/iterableapi/z1;->a(Lorg/json/JSONObject;)V

    goto :goto_3

    :cond_a
    if-eqz v5, :cond_b

    iget-object v0, v2, Lcom/iterable/iterableapi/p;->e:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Lcom/iterable/iterableapi/e0;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    :cond_b
    :goto_3
    return-void

    :pswitch_3
    :try_start_2
    iget-object v0, p0, Lc5/m;->x:Ljava/lang/Object;

    check-cast v0, Lc5/e;

    invoke-virtual {v0}, Lc5/e;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    const/4 v0, 0x0

    :goto_4
    iget-object v1, p0, Lc5/m;->y:Ljava/lang/Object;

    check-cast v1, Lc5/f;

    iget-object v2, p0, Lc5/m;->z:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    new-instance v3, Lds/s;

    const/4 v4, 0x4

    invoke-direct {v3, v4, v1, v0}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
