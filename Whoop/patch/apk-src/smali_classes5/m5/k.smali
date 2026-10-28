.class public final Lm5/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm5/k;->w:I

    iput-object p1, p0, Lm5/k;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly33/e;Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0x12

    iput p1, p0, Lm5/k;->w:I

    .line 2
    iput-object p2, p0, Lm5/k;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lm5/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lj63/d;

    check-cast v0, Lj63/c;

    invoke-virtual {v0}, Lj63/c;->d()Lio/ktor/utils/io/q;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    iget-object v1, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v1, Ly33/e;

    iget-object v2, v1, Ly33/e;->c:Lud3/l0;

    invoke-virtual {v0, v2}, Lpg3/x0;->e(Lud3/l0;)V

    new-instance v2, Lug3/c;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lug3/c;-><init>(I)V

    invoke-virtual {v0, v2}, Lpg3/x0;->b(Lpg3/m;)V

    iget-object v1, v1, Ly33/e;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Lz33/b;

    invoke-static {}, Lc53/c;->a()Lc53/a;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lup/d;->h(Lc53/a;Lq83/j;I)Lc53/a;

    move-result-object v1

    iget-object v2, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    const-string v3, "connectivity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-direct {v0, v1, v2}, Lz33/b;-><init>(Lbc3/c0;Landroid/net/ConnectivityManager;)V

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Ly2/f1;

    iget-object v1, v0, Ly2/f1;->P:Ly2/w;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly2/w;->a:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj3/c;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, v0, Ly2/f1;->V:Lj3/c;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iput-object v1, v0, Ly2/f1;->V:Lj3/c;

    iget-object v2, v0, Ly2/f1;->U:Lj3/c;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2, v1}, Ly2/f1;->X0(Lj3/c;Lj3/c;)V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Ly2/f0;

    iget-object v1, v0, Ly2/f0;->g:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, v0, Ly2/f0;->c:Lp1/w;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lp1/w;->l()V

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lxf3/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lxf3/c;->i:Z

    iget-object v2, v0, Lxf3/c;->b:Ljava/lang/String;

    iget-object v3, v0, Lxf3/c;->g:Ljava/util/ArrayList;

    const/4 v4, 0x0

    iput-object v4, v0, Lxf3/c;->f:Ljava/lang/Object;

    iget-object v0, v0, Lxf3/c;->d:Lnf3/a;

    iget-object v4, v0, Lnf3/a;->c:Lq83/g;

    invoke-virtual {v4, v1}, Lq83/g;->D(I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lnf3/a;->c:Lq83/g;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "closing scope:\'"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x27

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lq83/g;->C(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lwf3/a;->a:Lnf3/a;

    iget-object v1, v1, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lrf3/c;

    if-eqz v5, :cond_4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrf3/c;

    iget-object v3, v3, Lrf3/c;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    iget-object v0, v0, Lwf3/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_7
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :pswitch_5
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lx03/b;

    iget-object v1, v0, Lx03/b;->a:Ln0/u;

    invoke-virtual {v1}, Ln0/u;->h()Ln0/n;

    move-result-object v1

    iget-object v1, v1, Ln0/n;->k:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v1

    sget-object v2, Lx03/a;->w:Lx03/a;

    invoke-static {v1, v2}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v1

    iget-object v2, v1, Lxb3/s;->a:Lxb3/i;

    invoke-interface {v2}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_8
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v1, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lx03/c;

    iget-object v6, v5, Lx03/c;->a:Ln0/g;

    check-cast v6, Ln0/o;

    iget v6, v6, Ln0/o;->o:I

    iget-object v7, v0, Lx03/b;->b:Lc93/m;

    invoke-interface {v7, v0, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    if-gt v6, v5, :cond_8

    move-object v3, v4

    goto :goto_3

    :cond_9
    check-cast v3, Lx03/c;

    return-object v3

    :pswitch_6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v1, Lxu/a;

    new-instance v2, Lyu/a;

    iget-object v3, v1, Lxu/a;->d:Ljava/lang/String;

    const-string v4, "id"

    invoke-direct {v2, v4, v3}, Lyu/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lyu/a;

    const-string v3, "line"

    const-string v4, "type"

    invoke-direct {v2, v4, v3}, Lyu/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v1, Lxu/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_a

    new-instance v2, Lyu/a;

    const-string v3, "source"

    invoke-direct {v2, v3, v1}, Lyu/a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    return-object v0

    :pswitch_7
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lw7/a;

    invoke-virtual {v0}, Lw7/a;->b()Landroidx/health/platform/client/proto/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    move-object v1, v0

    check-cast v1, Landroidx/health/platform/client/proto/u0;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/health/platform/client/proto/u0;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result v1

    new-array v2, v1, [B

    new-instance v3, Landroidx/health/platform/client/proto/k;

    invoke-direct {v3, v2, v1}, Landroidx/health/platform/client/proto/k;-><init>([BI)V

    invoke-virtual {v0, v3}, Landroidx/health/platform/client/proto/a;->c(Landroidx/health/platform/client/proto/k;)V

    iget v3, v3, Landroidx/health/platform/client/proto/k;->f:I

    sub-int/2addr v1, v3

    if-nez v1, :cond_b

    return-object v2

    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Did not write as much data as expected."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Serializing "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to a byte array threw an IOException (should never happen)."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :pswitch_8
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lv23/a;

    iget-object v1, v0, Lv23/a;->g:Ld33/c;

    iget-object v1, v1, Ld33/c;->a:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Lv23/a;->f:Lio/sentry/android/replay/video/d;

    iget-object v1, v0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    if-eqz v1, :cond_c

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_c
    iput-object v2, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Ltx/c;

    check-cast v0, Ltx/b;

    iget-object v1, v0, Ltx/b;->j:Ljava/lang/String;

    iget-object v2, v0, Ltx/b;->c:Ljava/lang/ClassLoader;

    iget-object v3, v0, Ltx/b;->i:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_d

    sget-object v0, Lcom/squareup/wire/q;->Companion:Lcom/squareup/wire/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v2}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v0

    new-instance v1, Lcom/squareup/wire/i;

    invoke-direct {v1, v3, v0}, Lcom/squareup/wire/i;-><init>(Lcom/squareup/wire/q;Lcom/squareup/wire/q;)V

    goto :goto_4

    :cond_d
    sget-object v3, Lcom/squareup/wire/q;->Companion:Lcom/squareup/wire/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lcom/squareup/wire/p;->b(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/squareup/wire/q;

    move-result-object v1

    iget-object v0, v0, Ltx/b;->d:Lcom/squareup/wire/z;

    invoke-virtual {v1, v0}, Lcom/squareup/wire/q;->withLabel$wire_runtime(Lcom/squareup/wire/z;)Lcom/squareup/wire/q;

    move-result-object v1

    const-string v0, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    return-object v1

    :pswitch_a
    invoke-static {}, Landroidx/health/platform/client/proto/j0;->u()Landroidx/health/platform/client/proto/i0;

    move-result-object v0

    iget-object v1, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v1, Lt7/c;

    iget v2, v1, Lt7/c;->x:I

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v3, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v3, Landroidx/health/platform/client/proto/j0;

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/j0;->p(Landroidx/health/platform/client/proto/j0;I)V

    iget-object v1, v1, Lt7/c;->y:Ljava/lang/String;

    if-eqz v1, :cond_e

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object v2, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast v2, Landroidx/health/platform/client/proto/j0;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/j0;->q(Landroidx/health/platform/client/proto/j0;Ljava/lang/String;)V

    :cond_e
    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/j0;

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lt23/g2;

    iget-object v1, v0, Lt23/g2;->c:Lq30/u0;

    iget-object v0, v0, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "sessionId"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v1, Lt23/s0;

    iget-object v1, v1, Lt23/s0;->b:Lt23/c0;

    iget-object v1, v1, Lt23/c0;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lt23/a2;

    iget-object v1, v0, Lt23/a2;->j:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    sget-object v3, Lt23/n1;->a:Lt23/n1;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, v0, Lt23/a2;->a:Lt23/x1;

    sget-object v1, Lt23/l0;->O:Lt23/l0;

    invoke-virtual {v0, v1}, Lt23/x1;->d(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lt23/x1;

    iget-object v0, v0, Lt23/x1;->f:Lt23/a2;

    iget-object v0, v0, Lt23/a2;->r:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lstream/video/sfu/models/AudioBitrateProfile;

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Ls5/a;

    iget-object v1, v0, Ls5/a;->f:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_f

    new-instance v2, Llr/e;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_f
    const-string v0, "executor"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_f
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    invoke-virtual {v0}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Llr/e;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "|- create scope - id:\'connectStrapScopeId\' q:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v1, Lvf3/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lnf3/a;

    iget-object v0, v0, Lnf3/a;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->e()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Lmj/n;

    invoke-virtual {v0}, Lmj/n;->invoke()Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lm5/k;->x:Ljava/lang/Object;

    check-cast v0, Leu/f;

    new-instance v1, Landroidx/credentials/exceptions/GetCredentialUnsupportedException;

    const-string v2, "Your device doesn\'t support credential manager"

    invoke-direct {v1, v2}, Landroidx/credentials/exceptions/GetCredentialUnsupportedException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Leu/f;->a(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
