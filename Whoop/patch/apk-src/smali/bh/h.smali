.class public final Lbh/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg1/n7;Ljava/util/Map;Lg1/x4;Ly3/c;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbh/h;->w:I

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    .line 1
    iput-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbh/h;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbh/h;->E:Ljava/lang/Object;

    iput-object p4, p0, Lbh/h;->F:Ljava/lang/Object;

    iput-object p5, p0, Lbh/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lgb/i;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lbh/h;->w:I

    .line 2
    iput-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbh/h;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbh/h;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbh/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lmh/j;Lbh/j;Lnh/h;Lbh/c;Landroid/graphics/Bitmap;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbh/h;->w:I

    .line 3
    iput-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbh/h;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbh/h;->E:Ljava/lang/Object;

    iput-object p4, p0, Lbh/h;->F:Ljava/lang/Object;

    iput-object p5, p0, Lbh/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lp1/y1;Lp1/x1;Lp1/w0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lbh/h;->w:I

    .line 4
    iput-object p1, p0, Lbh/h;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbh/h;->F:Ljava/lang/Object;

    iput-object p3, p0, Lbh/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    iget v0, p0, Lbh/h;->w:I

    iget-object v1, p0, Lbh/h;->G:Ljava/lang/Object;

    iget-object v2, p0, Lbh/h;->F:Ljava/lang/Object;

    iget-object v3, p0, Lbh/h;->E:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lbh/h;

    check-cast v3, Lp1/y1;

    check-cast v2, Lp1/x1;

    check-cast v1, Lp1/w0;

    invoke-direct {v0, v3, v2, v1, p2}, Lbh/h;-><init>(Lp1/y1;Lp1/x1;Lp1/w0;Lq83/d;)V

    iput-object p1, v0, Lbh/h;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v4, Lbh/h;

    iget-object v0, p0, Lbh/h;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lgb/i;

    move-object v6, v3

    check-cast v6, Lp1/c1;

    move-object v7, v2

    check-cast v7, Lp1/z0;

    move-object v8, v1

    check-cast v8, Lp1/c1;

    move-object v9, p2

    invoke-direct/range {v4 .. v9}, Lbh/h;-><init>(Lgb/i;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V

    iput-object p1, v4, Lbh/h;->y:Ljava/lang/Object;

    return-object v4

    :pswitch_1
    move-object v11, p2

    new-instance v5, Lbh/h;

    iget-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lg1/n7;

    iget-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/util/Map;

    move-object v8, v3

    check-cast v8, Lg1/x4;

    move-object v9, v2

    check-cast v9, Ly3/c;

    move-object v10, v1

    check-cast v10, Lc93/m;

    sget-object p1, Lg1/d7;->a:Ld0/i1;

    invoke-direct/range {v5 .. v11}, Lbh/h;-><init>(Lg1/n7;Ljava/util/Map;Lg1/x4;Ly3/c;Lc93/m;Lq83/d;)V

    return-object v5

    :pswitch_2
    move-object v11, p2

    new-instance v5, Lbh/h;

    iget-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lmh/j;

    iget-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lbh/j;

    move-object v8, v3

    check-cast v8, Lnh/h;

    move-object v9, v2

    check-cast v9, Lbh/c;

    move-object v10, v1

    check-cast v10, Landroid/graphics/Bitmap;

    invoke-direct/range {v5 .. v11}, Lbh/h;-><init>(Lmh/j;Lbh/j;Lnh/h;Lbh/c;Landroid/graphics/Bitmap;Lq83/d;)V

    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbh/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbh/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbh/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbh/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lec3/l;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbh/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbh/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbh/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbh/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbh/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbh/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbh/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbh/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbh/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lbh/h;->w:I

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lbh/h;->x:I

    if-eqz v5, :cond_1

    if-ne v5, v4, :cond_0

    iget-object v0, p0, Lbh/h;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvd1/c;

    iget-object v0, p0, Lbh/h;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lbc3/k1;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object p1

    iget-object v5, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v5, Lp1/y1;

    iget-object v6, v5, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v6

    :try_start_1
    iget-object v7, v5, Lp1/y1;->e:Ljava/lang/Throwable;

    if-nez v7, :cond_c

    iget-object v7, v5, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/w1;

    sget-object v8, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v7

    if-lez v7, :cond_b

    iget-object v7, v5, Lp1/y1;->d:Lbc3/k1;

    if-nez v7, :cond_a

    iput-object p1, v5, Lp1/y1;->d:Lbc3/k1;

    invoke-virtual {v5}, Lp1/y1;->w()Lbc3/k;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    monitor-exit v6

    iget-object v5, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v5, Lp1/y1;

    new-instance v6, Lc41/l3;

    const/16 v7, 0xb

    invoke-direct {v6, v5, v7}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    sget-object v5, Lz1/l;->a:Lz1/k;

    invoke-static {v5}, Lz1/l;->f(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    sget-object v5, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v5

    :try_start_2
    sget-object v7, Lz1/l;->h:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-static {v6, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    sput-object v7, Lz1/l;->h:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    monitor-exit v5

    new-instance v5, Lvd1/c;

    invoke-direct {v5, v6, v1}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Lp1/y1;->z:Lec3/h2;

    iget-object v1, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v1, Lp1/y1;

    iget-object v1, v1, Lp1/y1;->y:Lp1/v0;

    :cond_2
    sget-object v6, Lp1/y1;->z:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls1/e;

    move-object v8, v7

    check-cast v8, Lv1/b;

    sget-object v9, Lw1/b;->a:Lw1/b;

    iget-object v10, v8, Lv1/b;->y:Lu1/c;

    invoke-virtual {v10, v1}, Lu1/c;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v8}, Lm83/a;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_4

    new-instance v8, Lv1/a;

    invoke-direct {v8, v9, v9}, Lv1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v1, v8}, Lu1/c;->b(Ljava/lang/Object;Lv1/a;)Lu1/c;

    move-result-object v8

    new-instance v9, Lv1/b;

    invoke-direct {v9, v1, v1, v8}, Lv1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu1/c;)V

    move-object v8, v9

    goto :goto_0

    :cond_4
    iget-object v11, v8, Lv1/b;->x:Ljava/lang/Object;

    invoke-virtual {v10, v11}, Lu1/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v12, Lv1/a;

    new-instance v13, Lv1/a;

    iget-object v12, v12, Lv1/a;->a:Ljava/lang/Object;

    invoke-direct {v13, v12, v1}, Lv1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v11, v13}, Lu1/c;->b(Ljava/lang/Object;Lv1/a;)Lu1/c;

    move-result-object v10

    new-instance v12, Lv1/a;

    invoke-direct {v12, v11, v9}, Lv1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v1, v12}, Lu1/c;->b(Ljava/lang/Object;Lv1/a;)Lu1/c;

    move-result-object v9

    new-instance v10, Lv1/b;

    iget-object v8, v8, Lv1/b;->w:Ljava/lang/Object;

    invoke-direct {v10, v8, v1, v9}, Lv1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lu1/c;)V

    move-object v8, v10

    :goto_0
    if-eq v7, v8, :cond_5

    invoke-virtual {v6, v7, v8}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_5
    :try_start_3
    iget-object v1, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v1, Lp1/y1;

    iget-object v6, v1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v1}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    monitor-exit v6

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    :goto_1
    if-ge v3, v6, :cond_6

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/w;

    invoke-virtual {v7}, Lp1/w;->s()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, p1

    move-object p1, v0

    move-object v1, v5

    goto :goto_6

    :cond_6
    new-instance v1, La6/v;

    iget-object v3, p0, Lbh/h;->F:Ljava/lang/Object;

    check-cast v3, Lp1/x1;

    iget-object v6, p0, Lbh/h;->G:Ljava/lang/Object;

    check-cast v6, Lp1/w0;

    const/16 v7, 0x11

    invoke-direct {v1, v3, v6, v2, v7}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    iput-object v5, p0, Lbh/h;->y:Ljava/lang/Object;

    iput v4, p0, Lbh/h;->x:I

    invoke-static {v1, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne v1, v0, :cond_7

    goto :goto_4

    :cond_7
    move-object v3, p1

    move-object v1, v5

    :goto_2
    invoke-virtual {v1}, Lvd1/c;->a()V

    iget-object p1, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast p1, Lp1/y1;

    iget-object v1, p1, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_6
    iget-object v0, p1, Lp1/y1;->d:Lbc3/k1;

    if-ne v0, v3, :cond_8

    iput-object v2, p1, Lp1/y1;->d:Lbc3/k1;

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_8
    :goto_3
    invoke-virtual {p1}, Lp1/y1;->w()Lbc3/k;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v1

    sget-object p1, Lp1/y1;->z:Lec3/h2;

    iget-object p1, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast p1, Lp1/y1;

    iget-object p1, p1, Lp1/y1;->y:Lp1/v0;

    invoke-static {p1}, Lp1/v0;->b(Lp1/v0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :goto_5
    monitor-exit v1

    throw p1

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v6

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_6
    invoke-virtual {v1}, Lvd1/c;->a()V

    iget-object v0, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v0, Lp1/y1;

    iget-object v1, v0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_8
    iget-object v4, v0, Lp1/y1;->d:Lbc3/k1;

    if-ne v4, v3, :cond_9

    iput-object v2, v0, Lp1/y1;->d:Lbc3/k1;

    goto :goto_7

    :catchall_4
    move-exception v0

    move-object p1, v0

    goto :goto_8

    :cond_9
    :goto_7
    invoke-virtual {v0}, Lp1/y1;->w()Lbc3/k;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-exit v1

    sget-object v0, Lp1/y1;->z:Lec3/h2;

    iget-object v0, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v0, Lp1/y1;

    iget-object v0, v0, Lp1/y1;->y:Lp1/v0;

    invoke-static {v0}, Lp1/v0;->b(Lp1/v0;)V

    throw p1

    :goto_8
    monitor-exit v1

    throw p1

    :catchall_5
    move-exception v0

    move-object p1, v0

    monitor-exit v5

    throw p1

    :catchall_6
    move-exception v0

    move-object p1, v0

    goto :goto_9

    :cond_a
    :try_start_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer already running"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer shut down"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    throw v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :goto_9
    monitor-exit v6

    throw p1

    :pswitch_0
    iget-object v0, p0, Lbh/h;->F:Ljava/lang/Object;

    check-cast v0, Lp1/z0;

    iget-object v5, p0, Lbh/h;->G:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    iget-object v6, p0, Lbh/h;->z:Ljava/lang/Object;

    check-cast v6, Lgb/i;

    iget-object v7, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v7, Lp1/c1;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v9, p0, Lbh/h;->x:I

    if-eqz v9, :cond_e

    if-ne v9, v4, :cond_d

    iget-object v0, p0, Lbh/h;->y:Ljava/lang/Object;

    check-cast v0, Leb/q;

    :try_start_a
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_0

    goto :goto_a

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-le v9, v4, :cond_f

    const/4 v2, 0x0

    move-object v9, v0

    check-cast v9, Lp1/g1;

    invoke-virtual {v9, v2}, Lp1/g1;->y(F)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/q;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Leb/i1;->b()Leb/t;

    move-result-object v9

    invoke-virtual {v9, v2}, Leb/t;->g(Leb/q;)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x2

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Leb/q;

    invoke-virtual {v6}, Leb/i1;->b()Leb/t;

    move-result-object v10

    invoke-virtual {v10, v9}, Leb/t;->g(Leb/q;)V

    :cond_f
    :try_start_b
    new-instance v9, Lec3/f1;

    invoke-direct {v9, v7, v5, v0, v1}, Lec3/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v2, p0, Lbh/h;->y:Ljava/lang/Object;

    iput v4, p0, Lbh/h;->x:I

    invoke-interface {p1, v9, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_10

    goto :goto_c

    :cond_10
    move-object v0, v2

    :goto_a
    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v4, :cond_11

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v5, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6, v0, v3}, Lgb/i;->i(Leb/q;Z)V
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_0

    goto :goto_b

    :catch_0
    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v4, :cond_11

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v5, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_11
    :goto_b
    sget-object v8, Ll83/a0;->a:Ll83/a0;

    :goto_c
    return-object v8

    :pswitch_1
    iget-object v0, p0, Lbh/h;->F:Ljava/lang/Object;

    check-cast v0, Ly3/c;

    iget-object v1, p0, Lbh/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    iget-object v2, p0, Lbh/h;->y:Ljava/lang/Object;

    check-cast v2, Lg1/n7;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, p0, Lbh/h;->x:I

    if-eqz v6, :cond_13

    if-ne v6, v4, :cond_12

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_d

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v2, Lg1/n7;->i:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    iget-object v6, v2, Lg1/n7;->i:Lp1/k1;

    invoke-virtual {v6, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v6, p0, Lbh/h;->E:Ljava/lang/Object;

    check-cast v6, Lg1/x4;

    iget-object v7, v2, Lg1/n7;->o:Lp1/k1;

    invoke-virtual {v7, v6}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v6, p0, Lbh/h;->G:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    new-instance v7, Lg1/e7;

    invoke-direct {v7, v1, v6, v0, v3}, Lg1/e7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v3, v2, Lg1/n7;->m:Lp1/k1;

    invoke-virtual {v3, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget v3, Lg1/d7;->b:F

    invoke-interface {v0, v3}, Ly3/c;->q0(F)F

    move-result v0

    iget-object v3, v2, Lg1/n7;->n:Lp1/g1;

    invoke-virtual {v3, v0}, Lp1/g1;->y(F)V

    iput v4, p0, Lbh/h;->x:I

    invoke-virtual {v2, p1, v1, p0}, Lg1/n7;->b(Ljava/util/Map;Ljava/util/Map;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_14

    goto :goto_e

    :cond_14
    :goto_d
    sget-object v5, Ll83/a0;->a:Ll83/a0;

    :goto_e
    return-object v5

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbh/h;->x:I

    if-eqz v1, :cond_16

    if-ne v1, v4, :cond_15

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_15
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Lhh/k;

    iget-object p1, p0, Lbh/h;->y:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lmh/j;

    iget-object p1, p0, Lbh/h;->z:Ljava/lang/Object;

    check-cast p1, Lbh/j;

    iget-object v7, p1, Lbh/j;->i:Ljava/util/ArrayList;

    iget-object p1, p0, Lbh/h;->E:Ljava/lang/Object;

    move-object v10, p1

    check-cast v10, Lnh/h;

    iget-object p1, p0, Lbh/h;->F:Ljava/lang/Object;

    move-object v11, p1

    check-cast v11, Lbh/c;

    iget-object p1, p0, Lbh/h;->G:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    if-eqz p1, :cond_17

    move v12, v4

    goto :goto_f

    :cond_17
    move v12, v3

    :goto_f
    const/4 v8, 0x0

    move-object v9, v6

    invoke-direct/range {v5 .. v12}, Lhh/k;-><init>(Lmh/j;Ljava/util/List;ILmh/j;Lnh/h;Lbh/c;Z)V

    iput v4, p0, Lbh/h;->x:I

    invoke-virtual {v5, v6, p0}, Lhh/k;->b(Lmh/j;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_18

    move-object p1, v0

    :cond_18
    :goto_10
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
