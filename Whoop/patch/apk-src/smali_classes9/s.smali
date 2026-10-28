.class public final Ls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0x16

    iput v0, p0, Ls;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/BitmapFactory$Options;Ljava/io/InputStream;)V
    .locals 0

    const/16 p1, 0xd

    iput p1, p0, Ls;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ls;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Ls;->w:I

    iput-object p1, p0, Ls;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/k0;Llb3/q0;Z)V
    .locals 0

    const/16 p1, 0xc

    iput p1, p0, Ls;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ls;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ls;->w:I

    const/16 v1, 0xa

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lx93/n;

    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->isSynthetic()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getParameterTypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    if-nez p1, :cond_1

    move p1, v3

    goto :goto_0

    :cond_1
    move p1, v2

    goto :goto_0

    :cond_2
    const-string v1, "valueOf"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-nez p1, :cond_4

    :cond_3
    move v2, v3

    :cond_4
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lx6/d;

    iget-object v0, p1, Lx6/d;->z:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x5

    :try_start_0
    iput v1, p1, Lx6/d;->E:I

    iput-object v4, p1, Lx6/d;->G:Lbc3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lzd3/o;

    invoke-virtual {p1}, Lzd3/o;->cancel()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lhg/e;

    const-string v0, "$this$listField"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lud/c;

    iget-object v0, v0, Lud/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud/g;

    sget-object v2, Lvd/d;->w:Lvd/d;

    new-instance v3, Lhg/k;

    invoke-direct {v3, v1, v2}, Lhg/k;-><init>(Ljava/lang/Object;Lc93/m;)V

    invoke-interface {p1, v3}, Lhg/h;->j(Lhg/k;)V

    goto :goto_2

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/replay/video/d;

    invoke-virtual {p1}, Lio/sentry/android/replay/video/d;->j()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lu93/g;

    check-cast p1, Llb3/f1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Llb3/o;->e(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of v1, p1, Lr93/x0;

    if-eqz v1, :cond_6

    check-cast p1, Lr93/x0;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    move v2, v3

    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lu2/y;

    if-eqz v0, :cond_7

    iput-boolean p1, v0, Lu2/y;->y:Z

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Li2/l0;

    iget-object p1, p1, Li2/l0;->a:[F

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Ly2/y;

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {v0}, Ly2/q1;->h(Ly2/y;)Ly2/y;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Ly2/y;->Y(Ly2/y;[F)V

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Ly2/y;

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lu0/s0;

    invoke-virtual {v0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_9

    iput-object p1, v0, Lu0/p1;->c:Ly2/y;

    :cond_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lo93/h;

    check-cast p1, Lr93/b0;

    const-string v1, "module"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v0}, Lo93/h;->v()Llb3/c0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo93/h;->h(Llb3/y;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    check-cast p1, Ljava/lang/String;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lno/nordicsemi/android/ble/m0;

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/m0;->l()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    check-cast p1, Ldc3/t;

    invoke-virtual {p1, v4}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lr93/a1;

    check-cast p1, Lr93/c;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object p1

    check-cast v0, Lu93/w0;

    iget v0, v0, Lu93/w0;->G:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/a1;

    check-cast p1, Lu93/x0;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_d
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Llg3/q;

    sget-object v2, Lmb3/m;->w:Lmb3/m;

    check-cast p1, Lna3/b;

    const-string v5, "it"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p1, Lna3/b;->b:Lfa3/t;

    iget-object p1, p1, Lna3/b;->a:Lob3/g;

    iget-boolean v6, v0, Llg3/q;->c:Z

    if-eqz v6, :cond_b

    if-eqz p1, :cond_b

    const-string v6, "$receiver"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, p1, Llb3/y;

    if-eqz v6, :cond_a

    instance-of v6, p1, Lka3/h;

    if-ne v6, v3, :cond_b

    goto/16 :goto_5

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ClassicTypeSystemContext couldn\'t handle: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v1, p1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    if-eqz p1, :cond_e

    invoke-virtual {v2, p1}, Lmb3/m;->N(Lob3/g;)Lob3/l;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lmb3/g;->p(Lob3/l;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {p1}, Lmb3/g;->n(Lob3/g;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {v8, p1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lob3/k;

    check-cast p1, Lob3/m;

    invoke-static {v2, v1}, Lmb3/g;->r(Lmb3/b;Lob3/k;)Llb3/f1;

    move-result-object v1

    if-nez v1, :cond_c

    new-instance v1, Lna3/b;

    invoke-direct {v1, v4, v5, p1}, Lna3/b;-><init>(Lob3/g;Lfa3/t;Lob3/m;)V

    goto :goto_4

    :cond_c
    new-instance v3, Lna3/b;

    iget-object v9, v0, Llg3/q;->e:Ljava/lang/Object;

    check-cast v9, Lzt/q;

    iget-object v9, v9, Lzt/q;->x:Ljava/lang/Object;

    check-cast v9, Lia3/a;

    iget-object v9, v9, Lia3/a;->q:Lfa3/b;

    invoke-virtual {v1}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v10

    invoke-static {v9, v5, v10}, Lfa3/b;->b(Lfa3/b;Lfa3/t;Ls93/i;)Lfa3/t;

    move-result-object v9

    invoke-direct {v3, v1, v9, p1}, Lna3/b;-><init>(Lob3/g;Lfa3/t;Lob3/m;)V

    move-object v1, v3

    :goto_4
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_d
    move-object v4, v8

    :cond_e
    :goto_5
    return-object v4

    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/InputStream;

    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Llb3/q0;

    check-cast p1, Lmb3/f;

    const-string v1, "kotlinTypeRefiner"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    return-object v4

    :pswitch_10
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Llb3/x;

    check-cast p1, Lmb3/f;

    const-string v5, "kotlinTypeRefiner"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2, p1}, Llb3/y;->m0(Lmb3/f;)Llb3/y;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_7

    :cond_f
    if-nez v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, v0, Llb3/x;->w:Llb3/y;

    if-eqz v1, :cond_11

    invoke-virtual {v1, p1}, Llb3/y;->m0(Lmb3/f;)Llb3/y;

    move-result-object v4

    :cond_11
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1, v6}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    new-instance v1, Llb3/x;

    invoke-direct {v1, p1}, Llb3/x;-><init>(Ljava/util/AbstractCollection;)V

    iput-object v4, v1, Llb3/x;->w:Llb3/y;

    move-object v4, v1

    :goto_8
    if-nez v4, :cond_12

    goto :goto_9

    :cond_12
    move-object v0, v4

    :goto_9
    invoke-virtual {v0}, Llb3/x;->a()Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lj93/d;

    check-cast p1, Lj93/d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lva3/h;

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lz93/c;->E:Lz93/c;

    invoke-interface {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lja3/a;

    check-cast p1, Lx93/w;

    const-string v1, "m"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lja3/a;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p1}, Lx93/v;->b()Lx93/n;

    move-result-object v0

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-virtual {p1}, Lx93/v;->d()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v5, -0x69e9ad94

    if-eq v1, v5, :cond_1a

    const v5, -0x4d378041

    if-eq v1, v5, :cond_14

    const v4, 0x8cdac1b

    if-eq v1, v4, :cond_13

    goto :goto_b

    :cond_13
    const-string v1, "hashCode"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_b

    :cond_14
    const-string v1, "equals"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_b

    :cond_15
    invoke-virtual {p1}, Lx93/w;->m()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx93/c0;

    if-eqz p1, :cond_16

    iget-object p1, p1, Lx93/c0;->a:Lx93/a0;

    goto :goto_a

    :cond_16
    move-object p1, v4

    :goto_a
    instance-of v0, p1, Lx93/p;

    if-eqz v0, :cond_17

    move-object v4, p1

    check-cast v4, Lx93/p;

    :cond_17
    if-nez v4, :cond_18

    goto :goto_b

    :cond_18
    iget-object p1, v4, Lx93/p;->b:Lx93/r;

    instance-of v0, p1, Lx93/n;

    if-eqz v0, :cond_19

    check-cast p1, Lx93/n;

    invoke-virtual {p1}, Lx93/n;->c()Lva3/e;

    move-result-object p1

    if-eqz p1, :cond_19

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    iget-object p1, p1, Lva3/f;->a:Ljava/lang/String;

    const-string v0, "java.lang.Object"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_19

    move p1, v3

    goto :goto_c

    :cond_19
    :goto_b
    move p1, v2

    goto :goto_c

    :cond_1a
    const-string v1, "toString"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    :cond_1b
    invoke-virtual {p1}, Lx93/w;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    :goto_c
    if-eqz p1, :cond_1c

    move p1, v3

    goto :goto_d

    :cond_1c
    move p1, v2

    :goto_d
    if-nez p1, :cond_1d

    move v2, v3

    :cond_1d
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lhb3/h0;

    check-cast p1, Lqa3/w0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lhb3/h0;->a:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->d:Lsa3/h;

    invoke-static {p1, v0}, Ljc/x;->f0(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lds/w;

    invoke-virtual {p1, v2}, Lds/n;->cancel(Z)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    check-cast p1, Lr93/c;

    if-eqz p1, :cond_1e

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lga3/a;

    iget-object v0, v0, Lga3/a;->b:Lhb3/o;

    invoke-interface {v0, p1}, Lhb3/o;->a(Lr93/c;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1e
    const-string p1, "Argument for @NotNull parameter \'descriptor\' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_17
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lu93/q0;

    check-cast p1, Lr93/c;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lfa3/g0;->i:Ljava/util/LinkedHashMap;

    invoke-static {v0}, Lio/sentry/config/a;->p(Lr93/b;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Ls2/c;

    iget-object p1, p1, Ls2/c;->a:Landroid/view/KeyEvent;

    sget-object v0, Lu0/n0;->a:Lu0/y0;

    invoke-virtual {v0, p1}, Lu0/y0;->b(Landroid/view/KeyEvent;)Lu0/k0;

    move-result-object p1

    sget-object v0, Lu0/k0;->S:Lu0/k0;

    if-ne p1, v0, :cond_1f

    iget-object p1, p0, Ls;->x:Ljava/lang/Object;

    check-cast p1, Lf1/w0;

    invoke-virtual {p1}, Lf1/w0;->c()V

    move v2, v3

    :cond_1f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Llb3/y;

    check-cast p1, Lr93/b0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Lo93/j;

    check-cast p1, Lr93/b0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1, v0}, Lo93/h;->r(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Ls;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
