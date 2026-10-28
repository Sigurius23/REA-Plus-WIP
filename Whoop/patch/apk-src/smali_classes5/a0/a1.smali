.class public final La0/a1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La0/a1;->w:I

    iput-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, La0/a1;->w:I

    const/4 v1, 0x0

    const-string v2, "it"

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-string v5, "listener"

    const-string v6, "(this)"

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/ArrayList;

    const-string v0, "mViews"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/t;

    iget-object v1, v0, Lio/sentry/android/replay/t;->x:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v0, v0, Lio/sentry/android/replay/t;->z:Lio/sentry/android/replay/r;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/r;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v7}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_0
    check-cast p1, Ljava/util/Date;

    const-string v0, "newTimestamp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/ReplayIntegration;

    iget-object v1, v0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    check-cast v2, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v2, v8

    check-cast v1, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v1, v2}, Lio/sentry/android/replay/capture/c;->k(I)V

    :goto_0
    iget-object v0, v0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast v0, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/c;->m(Ljava/util/Date;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_2

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lio/ktor/utils/io/jvm/javaio/b;

    iget-object v0, v0, Lio/ktor/utils/io/jvm/javaio/b;->b:Lio/ktor/utils/io/jvm/javaio/a;

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/jvm/javaio/a;->resumeWith(Ljava/lang/Object;)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Li63/a;->a(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lp0/u0;

    invoke-virtual {v0}, Lp0/u0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lx43/k;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Li53/j;

    check-cast v0, Li53/a;

    iget-object v0, v0, Li53/a;->a:Lv33/n;

    invoke-virtual {p1, v0}, Lx43/k;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, La13/e;

    const-string v0, "nps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Le43/g;

    iget-object v0, v0, Le43/g;->c:Le43/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v8, :cond_5

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0}, La13/c;->onPermissionRationale()V

    goto :goto_2

    :cond_4
    invoke-interface {v0}, La13/c;->onPermissionDenied()V

    goto :goto_2

    :cond_5
    invoke-interface {v0}, La13/c;->onPermissionGranted()V

    goto :goto_2

    :cond_6
    invoke-interface {v0}, La13/c;->onPermissionRequested()V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Lx43/k;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lg53/m;

    check-cast v0, Lg53/c;

    iget-object v0, v0, Lg53/c;->a:Lio/getstream/android/video/generated/models/ConnectedEvent;

    invoke-virtual {p1, v0}, Lx43/k;->c(Lio/getstream/android/video/generated/models/VideoEvent;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Lk2/c;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->a()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Lwp/h;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Leu/v;

    iget-object v0, v0, Leu/v;->F:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lx43/j;->o(Ljava/util/List;Lwp/h;)Leu/i0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast p1, Lup/c;

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    xor-int/2addr p1, v8

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Li2/g0;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lj4/k;

    iget v1, v0, Lj4/k;->d:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, v0, Lj4/k;->e:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_7
    iget v1, v0, Lj4/k;->d:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz v1, :cond_8

    move v1, v2

    goto :goto_3

    :cond_8
    iget v1, v0, Lj4/k;->d:F

    :goto_3
    iget v3, v0, Lj4/k;->e:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    iget v2, v0, Lj4/k;->e:F

    :goto_4
    invoke-static {v1, v2}, Li2/w0;->l(FF)J

    move-result-wide v1

    move-object v3, p1

    check-cast v3, Li2/x0;

    invoke-virtual {v3, v1, v2}, Li2/x0;->y(J)V

    :cond_a
    iget v1, v0, Lj4/k;->f:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_b

    iget v1, v0, Lj4/k;->f:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->k(F)V

    :cond_b
    iget v1, v0, Lj4/k;->g:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_c

    iget v1, v0, Lj4/k;->g:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->n(F)V

    :cond_c
    iget v1, v0, Lj4/k;->h:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_d

    iget v1, v0, Lj4/k;->h:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->o(F)V

    :cond_d
    iget v1, v0, Lj4/k;->i:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_e

    iget v1, v0, Lj4/k;->i:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->C(F)V

    :cond_e
    iget v1, v0, Lj4/k;->j:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_f

    iget v1, v0, Lj4/k;->j:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->E(F)V

    :cond_f
    iget v1, v0, Lj4/k;->k:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_10

    iget v1, v0, Lj4/k;->k:F

    move-object v2, p1

    check-cast v2, Li2/x0;

    invoke-virtual {v2, v1}, Li2/x0;->s(F)V

    :cond_10
    iget v1, v0, Lj4/k;->l:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_11

    iget v1, v0, Lj4/k;->m:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_14

    :cond_11
    iget v1, v0, Lj4/k;->l:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v1, :cond_12

    move v1, v2

    goto :goto_5

    :cond_12
    iget v1, v0, Lj4/k;->l:F

    :goto_5
    move-object v3, p1

    check-cast v3, Li2/x0;

    invoke-virtual {v3, v1}, Li2/x0;->p(F)V

    iget v1, v0, Lj4/k;->m:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_13

    goto :goto_6

    :cond_13
    iget v2, v0, Lj4/k;->m:F

    :goto_6
    invoke-virtual {v3, v2}, Li2/x0;->r(F)V

    :cond_14
    iget v1, v0, Lj4/k;->n:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_15

    iget v0, v0, Lj4/k;->n:F

    check-cast p1, Li2/x0;

    invoke-virtual {p1, v0}, Li2/x0;->a(F)V

    :cond_15
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    check-cast p1, Le2/f;

    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_16

    sget-object p1, La3/o2;->x:La3/o2;

    goto :goto_7

    :cond_16
    iget-object v0, p1, Le2/f;->P:Le2/f;

    if-eqz v0, :cond_17

    iget-object v1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v1, Le10/k0;

    new-instance v2, La0/a1;

    const/16 v3, 0x10

    invoke-direct {v2, v1, v3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Le4/a;->p(La3/p2;Lkotlin/jvm/functions/Function1;)V

    :cond_17
    iput-object v7, p1, Le2/f;->P:Le2/f;

    iput-object v7, p1, Le2/f;->O:Le2/f;

    sget-object p1, La3/o2;->w:La3/o2;

    :goto_7
    return-object p1

    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast p1, Lds/v;

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    move-object v7, p1

    check-cast v7, Lstream/video/sfu/models/Error;

    const-string p1, "error"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast p1, Lt23/c0;

    iget-object p1, p1, Lt23/c0;->p:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->h:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lt23/i2;

    if-eqz p1, :cond_18

    goto :goto_a

    :cond_18
    invoke-virtual {v7}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object p1

    sget-object v0, Ld33/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    move v0, v8

    const/4 v8, 0x0

    if-eq p1, v0, :cond_1b

    if-eq p1, v4, :cond_1a

    if-eq p1, v3, :cond_1a

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1a

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1a

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->E:Lb23/g;

    const-string v1, "Video:RtcSession"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_19

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v7}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v2

    invoke-virtual {v7}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onSfuApiError] Unhandled session-fatal error "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    :goto_8
    move-object v6, p1

    goto :goto_9

    :cond_1a
    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_REJOIN:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    goto :goto_8

    :cond_1b
    sget-object p1, Lstream/video/sfu/models/WebsocketReconnectStrategy;->WEBSOCKET_RECONNECT_STRATEGY_FAST:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    goto :goto_8

    :goto_9
    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lt23/c0;

    iget-object p1, v5, Lt23/c0;->n:Lhc3/d;

    new-instance v4, La1/h;

    const/16 v9, 0xb

    invoke-direct/range {v4 .. v9}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v8, v8, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_1c

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/o1;

    const-string v1, "IterableKeychain"

    const-string v2, "Migration failed"

    invoke-static {v1, v2, p1}, Ldt/b;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/o1;->a()V

    :cond_1c
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    move v0, v8

    iget-object v1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v1, Ld0/z1;

    iget-object v1, v1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ly3/c;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La3/n0;

    invoke-virtual {v0, p1}, La3/n0;->A0(Ly3/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    check-cast p1, Lq3/o;

    iget-object v0, p1, Lq3/o;->b:Ld1/p;

    if-eqz v0, :cond_1d

    invoke-virtual {p1, v0}, Lq3/o;->a(Ld1/p;)V

    iput-object v7, p1, Lq3/o;->b:Ld1/p;

    :cond_1d
    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Lb3/i2;

    iget-object v2, v0, Lb3/i2;->d:Lr1/c;

    iget-object v3, v2, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v2, Lr1/c;->y:I

    :goto_b
    if-ge v1, v4, :cond_1f

    aget-object v5, v3, v1

    check-cast v5, La3/r2;

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    goto :goto_c

    :cond_1e
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_1f
    const/4 v1, -0x1

    :goto_c
    if-ltz v1, :cond_20

    invoke-virtual {v2, v1}, Lr1/c;->l(I)Ljava/lang/Object;

    :cond_20
    iget p1, v2, Lr1/c;->y:I

    if-nez p1, :cond_21

    iget-object p1, v0, Lb3/i2;->b:Lav/b;

    invoke-virtual {p1}, Lav/b;->invoke()Ljava/lang/Object;

    :cond_21
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Li3/p;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/Resources;

    invoke-static {p1, v0}, Lb3/o0;->c(Li3/p;Landroid/content/res/Resources;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Li3/p;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La0/s;

    iget p1, p1, Li3/p;->g:I

    invoke-virtual {v0, p1}, La0/s;->a(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lbc3/c0;

    new-instance v0, Lb3/x0;

    iget-object v1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getTextInputService()Lq3/z;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Lb3/x0;-><init>(Landroid/view/View;Lq3/z;Lbc3/c0;)V

    return-object v0

    :pswitch_16
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/c2;

    invoke-virtual {p1, v7}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/l1;

    invoke-virtual {p1}, Lbc3/l1;->complete()Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, La3/b;

    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La3/a;

    invoke-interface {p1}, La3/b;->v()Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_10

    :cond_22
    invoke-interface {p1}, La3/b;->a()La3/a;

    move-result-object v1

    iget-boolean v1, v1, La3/a;->b:Z

    if-eqz v1, :cond_23

    invoke-interface {p1}, La3/b;->t()V

    :cond_23
    invoke-interface {p1}, La3/b;->a()La3/a;

    move-result-object v1

    iget-object v1, v1, La3/a;->i:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p1}, La3/b;->J()Landroidx/compose/ui/node/a;

    move-result-object v4

    invoke-static {v0, v3, v2, v4}, La3/a;->a(La3/a;Ly2/a;ILandroidx/compose/ui/node/NodeCoordinator;)V

    goto :goto_d

    :cond_24
    invoke-interface {p1}, La3/b;->J()Landroidx/compose/ui/node/a;

    move-result-object p1

    iget-object p1, p1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_e
    iget-object v1, v0, La3/a;->a:Ly2/j1;

    invoke-interface {v1}, La3/b;->J()Landroidx/compose/ui/node/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    invoke-virtual {v0, p1}, La3/a;->c(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/a;

    invoke-virtual {v0, p1, v2}, La3/a;->d(Landroidx/compose/ui/node/NodeCoordinator;Ly2/a;)I

    move-result v3

    invoke-static {v0, v2, v3, p1}, La3/a;->a(La3/a;Ly2/a;ILandroidx/compose/ui/node/NodeCoordinator;)V

    goto :goto_f

    :cond_25
    iget-object p1, p1, Landroidx/compose/ui/node/NodeCoordinator;->Q:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_e

    :cond_26
    :goto_10
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La0/w0;

    if-ne p1, v0, :cond_27

    goto :goto_11

    :cond_27
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_11
    return-object v6

    :pswitch_1b
    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La0/r0;

    if-ne p1, v0, :cond_28

    goto :goto_12

    :cond_28
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_12
    return-object v6

    :pswitch_1c
    iget-object v0, p0, La0/a1;->x:Ljava/lang/Object;

    check-cast v0, La0/q0;

    if-ne p1, v0, :cond_29

    goto :goto_13

    :cond_29
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    :goto_13
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
