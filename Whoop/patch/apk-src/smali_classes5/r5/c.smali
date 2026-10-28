.class public final Lr5/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lr5/c;->w:I

    iput-object p2, p0, Lr5/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lr5/c;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lr5/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lz33/b;

    iget-object v1, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v1, Ly33/c;

    iget-object v1, v1, Ly33/c;->b:Lbc3/c0;

    iget-object v2, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-direct {v0, v1, v2}, Lz33/b;-><init>(Lbc3/c0;Landroid/net/ConnectivityManager;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    iget-object v1, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v1, Lb2/v;

    invoke-virtual {v0, v1}, Lu2/d;->d(Lb2/v;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    const-class v1, Lcom/squareup/wire/g;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/squareup/wire/g;

    iget-object v1, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-direct {v0, v1}, Lcom/squareup/wire/g;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "{\n      builderType.newInstance()\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/squareup/wire/j;

    :goto_0
    return-object v0

    :pswitch_2
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lt23/s0;

    iget-object v1, v0, Lt23/s0;->F:Lec3/h2;

    iget-object v2, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v2, Lt23/x2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Lt23/s0;->z0:Lt23/f;

    invoke-virtual {v0}, Lt23/f;->c()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lt23/c0;

    iget-object v1, v0, Lt23/c0;->T:Lbc3/c2;

    iget-object v2, v0, Lt23/c0;->c:Ljava/lang/String;

    iget-object v3, v0, Lt23/c0;->a:Lt23/b4;

    iget-object v4, v3, Lt23/b4;->U:Lt23/g1;

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v1, v0, Lt23/c0;->S:Lbc3/c2;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iget-object v1, v0, Lt23/c0;->K:Lv23/a;

    iget-object v1, v1, Lv23/a;->d:Lw23/p;

    iget-object v1, v1, Lw23/p;->g:Lw23/r;

    iget-object v6, v1, Lw23/r;->b:Lec3/r1;

    iget-object v6, v6, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw23/q;

    iget-object v6, v6, Lw23/q;->a:Lbc3/k1;

    if-eqz v6, :cond_3

    invoke-interface {v6, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_3
    iget-object v1, v1, Lw23/r;->a:Lec3/h2;

    :cond_4
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lw23/q;

    const/4 v12, 0x0

    const/16 v13, 0x1e

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lw23/q;->a(Lw23/q;Lbc3/k1;Lbc3/c2;Lbc3/c2;Lx23/f;Lx23/f;I)Lw23/q;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    iput-object v5, v0, Lt23/c0;->S:Lbc3/c2;

    iput-object v5, v0, Lt23/c0;->T:Lbc3/c2;

    iget-object v1, v0, Lt23/c0;->O:Lbc3/c2;

    if-eqz v1, :cond_5

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    iget-object v1, v0, Lt23/c0;->q:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz33/b;

    iget-object v6, v0, Lt23/c0;->N:Lf53/f;

    invoke-virtual {v1, v6}, Lz33/b;->e(Lf53/f;)V

    iget-object v1, v0, Lt23/c0;->U:Lbc3/c2;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iget-object v1, v0, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->g:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lt23/i2;->a:Lt23/i2;

    invoke-virtual {v1, v5, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v1

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v6, "[leave] #ringing; call_id = "

    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v8, v7, v6, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-boolean v1, v0, Lt23/c0;->B:Z

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lt23/c0;->g()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[leave] #ringing; Call already destroyed, ignoring"

    invoke-interface {v0, v3, v2, v1, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_5

    :cond_8
    const/4 v1, 0x1

    iput-boolean v1, v0, Lt23/c0;->B:Z

    iget-object v1, v0, Lt23/c0;->u:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/f3;

    iget-object v6, v1, Lt23/f3;->b:Lec3/h2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lt23/n1;->a:Lt23/n1;

    invoke-virtual {v6, v5, v7}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v1, v1, Lt23/f3;->d:Lec3/h2;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v5, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lt23/c0;->e()Lt23/e1;

    move-result-object v1

    invoke-virtual {v1}, Lt23/e1;->c()V

    invoke-virtual {v0}, Lt23/c0;->i()Lt23/a2;

    move-result-object v1

    invoke-static {v1}, Lt23/a2;->a(Lt23/a2;)V

    iget-object v1, v4, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/c0;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_1

    :cond_9
    move-object v1, v5

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v4, Lt23/g1;->f:Lec3/h2;

    iget-object v6, v4, Lt23/g1;->h:Lec3/h2;

    invoke-virtual {v4}, Lt23/g1;->a()Lb23/k;

    move-result-object v7

    iget-object v8, v7, Lb23/k;->c:Lb23/e;

    iget-object v9, v7, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v8, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v7, v7, Lb23/k;->b:Lb23/j;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt23/c0;

    if-eqz v8, :cond_a

    iget-object v8, v8, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_a
    move-object v8, v5

    :goto_2
    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v11, "[removeActiveCall] call.id == activeCall.value?.id :"

    invoke-static {v11, v8}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v10, v9, v8, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt23/c0;

    if-eqz v6, :cond_c

    iget-object v6, v6, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_3

    :cond_c
    move-object v6, v5

    :goto_3
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt23/c0;

    if-eqz v6, :cond_d

    invoke-virtual {v4, v6}, Lt23/g1;->c(Lt23/c0;)V

    :cond_d
    invoke-virtual {v1, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Lt23/g1;->d(Lt23/c0;)V

    :cond_e
    iget-object v1, v4, Lt23/g1;->g:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/c0;

    if-eqz v1, :cond_f

    iget-object v1, v1, Lt23/c0;->c:Ljava/lang/String;

    goto :goto_4

    :cond_f
    move-object v1, v5

    :goto_4
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v4, v0}, Lt23/g1;->d(Lt23/c0;)V

    :cond_10
    iget-object v1, v3, Lt23/b4;->w:Landroid/content/Context;

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lng3/o;

    const/16 v4, 0x10

    invoke-direct {v2, v4}, Lng3/o;-><init>(I)V

    iget-object v2, v3, Lt23/b4;->K:Lbi/p;

    iget-object v4, v0, Lt23/c0;->b:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lbi/p;->b(Ljava/lang/String;)Lj43/c;

    move-result-object v2

    invoke-static {v2, v1}, Lng3/o;->m(Lj43/c;Landroid/content/Context;)V

    invoke-virtual {v3, v0}, Lt23/b4;->t(Lt23/c0;)V

    iget-object v1, v0, Lt23/c0;->g:Lt23/b4;

    iget-object v1, v1, Lt23/b4;->x:Lbc3/c0;

    new-instance v2, Lp33/m;

    iget-object v3, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v3, Lt23/i0;

    const/4 v4, 0x6

    invoke-direct {v2, v3, v0, v5, v4}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v1, v5, v5, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_11
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v2, Lsv/d;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v0

    invoke-virtual {v2, v1, v0}, Lsv/d;->c(Ljava/lang/Object;F)V

    iget-object v0, v2, Lsv/d;->w:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_12

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Ls5/a;

    iget-object v1, v0, Ls5/a;->f:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_13

    iget-object v2, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v2, Lm5/c;

    new-instance v3, Lr5/b;

    const/16 v4, 0x9

    invoke-direct {v3, v4, v0, v2}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_13
    const-string v0, "executor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_6
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    iget-object v0, v0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Lrv/j;

    iget-object v1, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v1, Lrv/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lrv/j;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, v0, Lrv/j;->b:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lrv/j;->e:Landroid/hardware/Sensor;

    if-eqz v2, :cond_14

    invoke-virtual {v1, v0, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    goto :goto_6

    :cond_14
    iget-object v2, v0, Lrv/j;->f:Landroid/hardware/Sensor;

    invoke-virtual {v1, v0, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    iget-object v2, v0, Lrv/j;->g:Landroid/hardware/Sensor;

    invoke-virtual {v1, v0, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    :cond_15
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/location/DeviceLocationProvider;

    iget-object v1, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v1, Lrv/i;

    invoke-interface {v0, v1}, Lcom/mapbox/common/location/LocationProvider;->removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lrf3/c;

    iget-object v1, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v1, La3/p;

    iget-object v2, v0, Lrf3/c;->b:Ljava/util/HashMap;

    const/4 v3, 0x0

    if-nez v1, :cond_16

    goto :goto_7

    :cond_16
    iget-object v4, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v4, Lxf3/c;

    if-nez v4, :cond_17

    goto :goto_7

    :cond_17
    iget-object v3, v4, Lxf3/c;->b:Ljava/lang/String;

    :goto_7
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_18

    goto :goto_8

    :cond_18
    iget-object v2, v0, Lrf3/c;->b:Ljava/util/HashMap;

    iget-object v3, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v3, Lxf3/c;

    iget-object v3, v3, Lxf3/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lrf3/c;->a(La3/p;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lr5/c;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lr5/c;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/credentials/exceptions/GetCredentialUnknownException;

    new-instance v3, Lr5/b;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v0, v2}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
