.class public final Lb3/t0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lb3/t0;->w:I

    iput-object p2, p0, Lb3/t0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lb3/t0;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lb3/t0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li63/n;

    const-string v0, "$this$buildHeaders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v0, Li63/o;

    new-instance v1, Lb2/r;

    const/16 v2, 0x8

    invoke-direct {v1, p1, v2}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lo63/m;->c(Lc93/m;)V

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lj63/d;

    invoke-virtual {v0}, Lj63/d;->c()Li63/m;

    move-result-object v0

    const-string v1, "stringValues"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb2/r;

    invoke-direct {v1, p1, v2}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lo63/m;->c(Lc93/m;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v0, p1

    check-cast v0, La3/t0;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Ly2/o1;

    iget-object v1, p1, Ly2/o1;->O:Ly2/q;

    iget-object v1, v1, Ly2/q;->H:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    if-lez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, v0, La3/t0;->w:Z

    iget-object v1, v0, La3/t0;->z:La3/w0;

    invoke-virtual {v1}, La3/w0;->L0()Ly2/y;

    move-result-object v2

    iget-wide v3, v0, La3/t0;->x:J

    const-wide v5, 0x7fffffff7fffffffL

    invoke-static {v3, v4, v5, v6}, Ly3/j;->b(JJ)Z

    move-result v3

    if-eqz v3, :cond_0

    const-wide/16 v3, 0x0

    invoke-interface {v2, v3, v4}, Ly2/y;->S(J)J

    move-result-wide v3

    invoke-static {v3, v4}, Lvo/b;->C(J)J

    move-result-wide v3

    iput-wide v3, v0, La3/t0;->x:J

    invoke-interface {v2}, Ly2/y;->n()J

    move-result-wide v3

    iput-wide v3, v0, La3/t0;->y:J

    :cond_0
    invoke-virtual {v1}, La3/w0;->N0()La3/n0;

    move-result-object v1

    invoke-virtual {v1}, La3/n0;->t()La3/r0;

    move-result-object v1

    invoke-virtual {v1}, La3/r0;->b()V

    invoke-interface {v2}, Ly2/y;->n()J

    move-result-wide v1

    iget-object v3, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v3, Ly2/q;

    iget-object v6, v3, Ly2/q;->G:La0/v0;

    const/16 v3, 0x20

    shr-long v3, v1, v3

    long-to-int v4, v3

    const-wide v7, 0xffffffffL

    and-long/2addr v1, v7

    long-to-int v5, v1

    sget-object v7, Landroidx/compose/ui/layout/c;->b:[Ly2/b2;

    array-length v8, v7

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v8, :cond_2

    aget-object v1, v7, v10

    invoke-virtual {v6, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v11, v2

    check-cast v11, Ly2/d2;

    move-object v12, v1

    check-cast v12, Ly2/c2;

    iget-object v1, v12, Ly2/c2;->c:Ly2/p;

    iget-wide v2, v11, Ly2/d2;->h:J

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/layout/c;->a(La3/t0;Ly2/p;JII)V

    iget-object v1, v11, Ly2/d2;->b:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v11, Ly2/d2;->f:Ly2/p;

    iget-wide v2, v11, Ly2/d2;->j:J

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/layout/c;->a(La3/t0;Ly2/p;JII)V

    iget-object v1, v11, Ly2/d2;->g:Ly2/p;

    iget-wide v2, v11, Ly2/d2;->k:J

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/layout/c;->a(La3/t0;Ly2/p;JII)V

    :cond_1
    iget-object v1, v12, Ly2/c2;->d:Ly2/p;

    iget-wide v2, v11, Ly2/d2;->i:J

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/layout/c;->a(La3/t0;Ly2/p;JII)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p1, Ly2/o1;->O:Ly2/q;

    iget-object v1, v1, Ly2/q;->I:La0/q0;

    invoke-virtual {v1}, La0/q0;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p1, Ly2/o1;->O:Ly2/q;

    iget-object v1, v1, Ly2/q;->I:La0/q0;

    iget-object v2, v1, La0/q0;->a:[Ljava/lang/Object;

    iget v1, v1, La0/q0;->b:I

    :goto_1
    if-ge v9, v1, :cond_3

    aget-object v3, v2, v9

    check-cast v3, Lp1/c1;

    iget-object v4, p1, Ly2/o1;->O:Ly2/q;

    iget-object v4, v4, Ly2/q;->J:Lz1/p;

    invoke-virtual {v4, v9}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/p;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-virtual {v4}, Ly2/p;->b()Ly2/o;

    move-result-object v5

    iget v6, v3, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    invoke-virtual {v0, v5, v6}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {v4}, Ly2/p;->d()Ly2/o;

    move-result-object v5

    iget v6, v3, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    invoke-virtual {v0, v5, v6}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {v4}, Ly2/p;->c()Ly2/o;

    move-result-object v5

    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    invoke-virtual {v0, v5, v6}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {v4}, Ly2/p;->a()Ly2/o;

    move-result-object v4

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v3, v3

    invoke-virtual {v0, v4, v3}, La3/t0;->a(Ly2/o;F)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lz53/b;

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lrf/p;

    invoke-virtual {v0, p1}, Lrf/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lij/i;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v1, Lij/f;

    const-string v2, "result"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lij/h;

    if-eqz v2, :cond_5

    check-cast p1, Lij/h;

    iget-object p1, p1, Lij/h;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, v2}, Lij/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, v1, Lij/f;->c:Lij/m;

    const-string v1, "onNativeMessage("

    const/16 v2, 0x29

    invoke-static {v2, v1, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lij/e;->w:Lij/e;

    invoke-virtual {v0, p1, v1}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lij/g;

    if-eqz v2, :cond_6

    check-cast p1, Lij/g;

    invoke-virtual {p1}, Lij/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lij/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    move-object v0, p1

    check-cast v0, Ly2/i1;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly2/j1;

    iget-object p1, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast p1, Li2/b1;

    iget-object v4, p1, Li2/b1;->f0:La3/m1;

    const/4 v5, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ly2/i1;->s(Ly2/i1;Ly2/j1;IILkotlin/jvm/functions/Function1;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    move-object v0, p1

    check-cast v0, Ly2/i1;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly2/j1;

    iget-object p1, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast p1, Li2/q;

    iget-object v4, p1, Li2/q;->O:Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ly2/i1;->s(Ly2/i1;Ly2/j1;IILkotlin/jvm/functions/Function1;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Lp1/t2;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lgb/i;

    new-instance v1, Lb3/s0;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p1, v0}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :pswitch_7
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Leb/u0;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    invoke-virtual {p1, v0}, Leb/u0;->O(Landroidx/lifecycle/g0;)V

    new-instance p1, Lgb/x;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_8
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    iget-object v1, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v1, Lc0/l0;

    iget-object v1, v1, Lc0/l0;->c:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Lb3/o;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast v1, Lb3/w3;

    iget-boolean v2, v1, Lb3/w3;->y:Z

    if-nez v2, :cond_8

    iget-object p1, p1, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    iput-object v0, v1, Lb3/w3;->E:Lc93/m;

    iget-object v2, v1, Lb3/w3;->z:Landroidx/lifecycle/x;

    if-nez v2, :cond_7

    iput-object p1, v1, Lb3/w3;->z:Landroidx/lifecycle/x;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    sget-object v2, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_8

    iget-object p1, v1, Lb3/w3;->x:Lp1/w;

    new-instance v2, Lb3/v3;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v0, v3}, Lb3/v3;-><init>(Lb3/w3;Lc93/m;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v3, 0x4f523a4f

    invoke-direct {v0, v2, v1, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p1, v0}, Lp1/w;->A(Lc93/m;)V

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Lb3/d1;

    iget-object p1, p1, Lb3/d1;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/Choreographer;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lb3/c1;

    invoke-virtual {p1, v0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Lb3/b1;

    iget-object v0, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v0, Lb3/c1;

    iget-object v1, p1, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object p1, p1, Lb3/b1;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    monitor-exit v1

    throw p1

    :pswitch_c
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v1, Lb3/v0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    new-instance v0, Lb3/s0;

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1, v1}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_d
    check-cast p1, Lp1/i0;

    iget-object p1, p0, Lb3/t0;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lb3/t0;->y:Ljava/lang/Object;

    check-cast v1, Lb3/u0;

    invoke-virtual {v0, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    new-instance v0, Lb3/s0;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
