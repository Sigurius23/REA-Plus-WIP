.class public final Lb3/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/w0;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/Choreographer;Lb3/b1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb3/d1;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb3/d1;->x:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lb3/d1;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/w0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb3/d1;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/d1;->x:Ljava/lang/Object;

    .line 5
    new-instance p1, Leh/a;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Leh/a;-><init>(I)V

    iput-object p1, p0, Lb3/d1;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb3/d1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    iget v0, p0, Lb3/d1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb3/d1;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lp1/l1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp1/l1;

    iget v3, v0, Lp1/l1;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v0, Lp1/l1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp1/l1;

    invoke-direct {v0, p0, p2}, Lp1/l1;-><init>(Lb3/d1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp1/l1;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lp1/l1;->z:I

    if-eqz v4, :cond_3

    if-eq v4, v1, :cond_2

    if-ne v4, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lp1/l1;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lb3/d1;->y:Ljava/lang/Object;

    check-cast p2, Leh/a;

    iput-object p1, v0, Lp1/l1;->w:Lkotlin/jvm/functions/Function1;

    iput v1, v0, Lp1/l1;->z:I

    iget-object v4, p2, Leh/a;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-boolean v5, p2, Leh/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v4

    if-eqz v5, :cond_4

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    goto :goto_1

    :cond_4
    new-instance v4, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v4}, Lbc3/m;->s()V

    iget-object v1, p2, Leh/a;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v5, p2, Leh/a;->c:Ljava/io/Serializable;

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    new-instance v1, Landroidx/room/d;

    const/4 v5, 0x7

    invoke-direct {v1, v5, p2, v4}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_5

    goto :goto_1

    :cond_5
    sget-object p2, Ll83/a0;->a:Ll83/a0;

    :goto_1
    if-ne p2, v3, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p2, p0, Lb3/d1;->x:Ljava/lang/Object;

    check-cast p2, Lp1/w0;

    const/4 v1, 0x0

    iput-object v1, v0, Lp1/l1;->w:Lkotlin/jvm/functions/Function1;

    iput v2, v0, Lp1/l1;->z:I

    invoke-interface {p2, p1, v0}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_7

    :goto_3
    move-object p2, v3

    :cond_7
    :goto_4
    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v4

    throw p1

    :pswitch_0
    iget-object v0, p0, Lb3/d1;->y:Ljava/lang/Object;

    check-cast v0, Lb3/b1;

    new-instance v3, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    invoke-direct {v3, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v3}, Lbc3/m;->s()V

    new-instance p2, Lb3/c1;

    invoke-direct {p2, v3, p0, p1}, Lb3/c1;-><init>(Lbc3/m;Lb3/d1;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lb3/b1;->w:Landroid/view/Choreographer;

    iget-object v4, p0, Lb3/d1;->x:Ljava/lang/Object;

    check-cast v4, Landroid/view/Choreographer;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, v0, Lb3/b1;->y:Ljava/lang/Object;

    monitor-enter p1

    :try_start_2
    iget-object v4, v0, Lb3/b1;->E:Ljava/util/ArrayList;

    invoke-virtual {v4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v4, v0, Lb3/b1;->H:Z

    if-nez v4, :cond_8

    iput-boolean v1, v0, Lb3/b1;->H:Z

    iget-object v1, v0, Lb3/b1;->w:Landroid/view/Choreographer;

    iget-object v4, v0, Lb3/b1;->I:Lb3/a1;

    invoke-virtual {v1, v4}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p2

    goto :goto_6

    :cond_8
    :goto_5
    monitor-exit p1

    new-instance p1, Lb3/t0;

    invoke-direct {p1, v2, v0, p2}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    :goto_6
    monitor-exit p1

    throw p2

    :cond_9
    iget-object p1, p0, Lb3/d1;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/Choreographer;

    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Lb3/t0;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0, p2}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    :goto_7
    invoke-virtual {v3}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    iget v0, p0, Lb3/d1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    iget v0, p0, Lb3/d1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
