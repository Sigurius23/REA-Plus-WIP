.class public final Le00/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le00/c;->w:I

    .line 1
    iput-object p1, p0, Le00/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Le00/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Le00/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Le00/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Le00/c;->I:Ljava/lang/Object;

    iput-object p6, p0, Le00/c;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lf0/z0;Lg1/j3;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Le00/c;->w:I

    .line 2
    iput-object p1, p0, Le00/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Le00/c;->H:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Le00/c;->I:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lf0/z0;Lm1/a0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Le00/c;->w:I

    .line 3
    iput-object p1, p0, Le00/c;->G:Ljava/lang/Object;

    iput-object p2, p0, Le00/c;->H:Ljava/lang/Object;

    check-cast p3, Ls83/i;

    iput-object p3, p0, Le00/c;->I:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 4
    iput p9, p0, Le00/c;->w:I

    iput-object p1, p0, Le00/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Le00/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Le00/c;->E:Ljava/lang/Object;

    iput-object p4, p0, Le00/c;->F:Ljava/lang/Object;

    iput-object p5, p0, Le00/c;->G:Ljava/lang/Object;

    iput-object p6, p0, Le00/c;->H:Ljava/lang/Object;

    iput-object p7, p0, Le00/c;->I:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    iget v0, p0, Le00/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Le00/c;

    iget-object p1, p0, Le00/c;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lxh/f;

    iget-object p1, p0, Le00/c;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lfi/i;

    iget-object v4, p0, Le00/c;->E:Ljava/lang/Object;

    iget-object p1, p0, Le00/c;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lfi/o;

    iget-object p1, p0, Le00/c;->G:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lrh/f;

    iget-object p1, p0, Le00/c;->H:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lai/b;

    iget-object p1, p0, Le00/c;->I:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lxh/h;

    const/4 v10, 0x5

    move-object v9, p2

    invoke-direct/range {v1 .. v10}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v9, p2

    new-instance v2, Le00/c;

    iget-object p1, p0, Le00/c;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lxh/f;

    iget-object p1, p0, Le00/c;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lkotlin/jvm/internal/g0;

    iget-object p1, p0, Le00/c;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object p1, p0, Le00/c;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lfi/i;

    iget-object p1, p0, Le00/c;->H:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lkotlin/jvm/internal/g0;

    iget-object p1, p0, Le00/c;->I:Ljava/lang/Object;

    check-cast p1, Lrh/f;

    const/4 v11, 0x4

    iget-object v7, p0, Le00/c;->G:Ljava/lang/Object;

    move-object v10, v9

    move-object v9, p1

    invoke-direct/range {v2 .. v11}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v9, p2

    new-instance p2, Le00/c;

    iget-object v0, p0, Le00/c;->G:Ljava/lang/Object;

    check-cast v0, Lf0/z0;

    iget-object v1, p0, Le00/c;->H:Ljava/lang/Object;

    check-cast v1, Lm1/a0;

    iget-object v2, p0, Le00/c;->I:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    invoke-direct {p2, v0, v1, v2, v9}, Le00/c;-><init>(Lf0/z0;Lm1/a0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, p2, Le00/c;->F:Ljava/lang/Object;

    return-object p2

    :pswitch_2
    move-object v9, p2

    new-instance p2, Le00/c;

    iget-object v0, p0, Le00/c;->G:Ljava/lang/Object;

    check-cast v0, Lf0/z0;

    iget-object v1, p0, Le00/c;->H:Ljava/lang/Object;

    check-cast v1, Lg1/j3;

    iget-object v2, p0, Le00/c;->I:Ljava/lang/Object;

    check-cast v2, Ls83/i;

    invoke-direct {p2, v0, v1, v2, v9}, Le00/c;-><init>(Lf0/z0;Lg1/j3;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, p2, Le00/c;->F:Ljava/lang/Object;

    return-object p2

    :pswitch_3
    move-object v9, p2

    new-instance v2, Le00/c;

    iget-object p2, p0, Le00/c;->y:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Le00/w;

    iget-object p2, p0, Le00/c;->z:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    iget-object p2, p0, Le00/c;->E:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    iget-object p2, p0, Le00/c;->F:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    iget-object p2, p0, Le00/c;->I:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Ljava/util/List;

    iget-object p2, p0, Le00/c;->G:Ljava/lang/Object;

    move-object v8, p2

    check-cast v8, Ljava/lang/String;

    invoke-direct/range {v2 .. v9}, Le00/c;-><init>(Le00/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v2, Le00/c;->H:Ljava/lang/Object;

    return-object v2

    :pswitch_4
    move-object v9, p2

    new-instance v2, Le00/c;

    iget-object p1, p0, Le00/c;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Le00/w;

    iget-object p1, p0, Le00/c;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Le00/c;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Le00/c;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object p1, p0, Le00/c;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    iget-object p1, p0, Le00/c;->H:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    iget-object p1, p0, Le00/c;->I:Ljava/lang/Object;

    check-cast p1, Ly00/l0;

    const/4 v11, 0x0

    move-object v10, v9

    move-object v9, p1

    invoke-direct/range {v2 .. v11}, Le00/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le00/c;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Le00/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le00/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le00/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v5, p0

    iget v0, v5, Le00/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le00/c;->x:I

    const/4 v7, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v7, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v0, Lxh/f;

    iget-object v1, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v1, Lfi/i;

    iget-object v2, v5, Le00/c;->E:Ljava/lang/Object;

    iget-object v3, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v3, Lfi/o;

    iget-object v4, v5, Le00/c;->G:Ljava/lang/Object;

    check-cast v4, Lrh/f;

    iput v7, v5, Le00/c;->x:I

    invoke-static/range {v0 .. v5}, Lxh/f;->b(Lxh/f;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    goto/16 :goto_8

    :cond_2
    :goto_0
    check-cast v0, Lxh/a;

    iget-object v1, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v1, Lxh/f;

    iget-object v1, v1, Lxh/f;->b:Lki/a;

    monitor-enter v1

    :try_start_0
    iget-object v2, v1, Lki/a;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrh/t;

    if-eqz v2, :cond_3

    iget-object v3, v1, Lki/a;->x:Landroid/content/Context;

    if-nez v3, :cond_4

    iget-object v2, v2, Lrh/t;->a:Lrh/q;

    iget-object v2, v2, Lrh/q;->a:Landroid/content/Context;

    iput-object v2, v1, Lki/a;->x:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_3
    invoke-virtual {v1}, Lki/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_1
    monitor-exit v1

    iget-object v1, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v1, Lxh/f;

    iget-object v1, v1, Lxh/f;->d:Lai/e;

    iget-object v2, v5, Le00/c;->H:Ljava/lang/Object;

    move-object v9, v2

    check-cast v9, Lai/b;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v2, Lfi/i;

    const/4 v3, 0x0

    if-eqz v9, :cond_6

    iget-object v2, v2, Lfi/i;->j:Lfi/b;

    iget-boolean v2, v2, Lfi/b;->x:Z

    if-eqz v2, :cond_6

    iget-object v2, v0, Lxh/a;->a:Lrh/j;

    invoke-interface {v2}, Lrh/j;->a()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    iget-object v1, v1, Lai/e;->a:Lrh/t;

    iget-object v1, v1, Lrh/t;->a:Lrh/q;

    iget-object v1, v1, Lrh/q;->c:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lai/d;

    if-nez v1, :cond_7

    :cond_6
    :goto_2
    move v1, v3

    goto :goto_4

    :cond_7
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v4, "coil#is_sampled"

    iget-boolean v6, v0, Lxh/a;->b:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v2, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lxh/a;->d:Ljava/lang/String;

    if-eqz v4, :cond_8

    const-string v6, "coil#disk_cache_key"

    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v10, v0, Lxh/a;->a:Lrh/j;

    invoke-static {v2}, Lx43/j;->W(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v11

    check-cast v1, Lai/f;

    const-string v2, "Image size must be non-negative: "

    iget-object v4, v1, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-interface {v10}, Lrh/j;->getSize()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    cmp-long v6, v12, v14

    if-ltz v6, :cond_9

    iget-object v8, v1, Lai/f;->a:Lai/k;

    invoke-interface/range {v8 .. v13}, Lai/k;->g(Lai/b;Lrh/j;Ljava/util/Map;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v4

    move v1, v7

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_9
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    monitor-exit v4

    throw v0

    :goto_4
    iget-object v9, v0, Lxh/a;->a:Lrh/j;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lfi/i;

    iget-object v11, v0, Lxh/a;->c:Lsh/h;

    iget-object v2, v5, Le00/c;->H:Ljava/lang/Object;

    check-cast v2, Lai/b;

    if-eqz v1, :cond_a

    :goto_5
    move-object v12, v2

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    goto :goto_5

    :goto_6
    iget-object v13, v0, Lxh/a;->d:Ljava/lang/String;

    iget-boolean v14, v0, Lxh/a;->b:Z

    iget-object v0, v5, Le00/c;->I:Ljava/lang/Object;

    check-cast v0, Lxh/h;

    instance-of v1, v0, Lxh/k;

    if-eqz v1, :cond_b

    check-cast v0, Lxh/k;

    iget-boolean v0, v0, Lxh/k;->g:Z

    if-eqz v0, :cond_b

    move v15, v7

    goto :goto_7

    :cond_b
    move v15, v3

    :goto_7
    new-instance v8, Lfi/q;

    invoke-direct/range {v8 .. v15}, Lfi/q;-><init>(Lrh/j;Lfi/i;Lsh/h;Lai/b;Ljava/lang/String;ZZ)V

    move-object v6, v8

    :goto_8
    return-object v6

    :goto_9
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :pswitch_0
    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le00/c;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_d

    if-ne v0, v1, :cond_c

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_a

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v0, Lxh/f;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Luh/h;

    iget-object v3, v5, Le00/c;->E:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/g0;

    iget-object v3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Lrh/d;

    iget-object v4, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v4, Lfi/i;

    move-object v6, v2

    move-object v2, v3

    move-object v3, v4

    iget-object v4, v5, Le00/c;->G:Ljava/lang/Object;

    iget-object v7, v5, Le00/c;->H:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/g0;

    iget-object v7, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v7, Lfi/o;

    iget-object v9, v5, Le00/c;->I:Ljava/lang/Object;

    check-cast v9, Lrh/f;

    iput v1, v5, Le00/c;->x:I

    move-object v1, v7

    move-object v7, v5

    move-object v5, v1

    move-object v1, v6

    move-object v6, v9

    invoke-static/range {v0 .. v7}, Lxh/f;->a(Lxh/f;Luh/h;Lrh/d;Lfi/i;Ljava/lang/Object;Lfi/o;Lrh/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v7

    if-ne v0, v8, :cond_e

    move-object v0, v8

    :cond_e
    :goto_a
    return-object v0

    :pswitch_1
    iget-object v0, v5, Le00/c;->H:Ljava/lang/Object;

    check-cast v0, Lm1/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le00/c;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_11

    if-eq v2, v4, :cond_10

    if-ne v2, v3, :cond_f

    iget-object v0, v5, Le00/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm1/a0;

    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmc3/a;

    iget-object v0, v5, Le00/c;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lm1/z;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v0, p1

    goto/16 :goto_f

    :catchall_2
    move-exception v0

    goto/16 :goto_12

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    iget-object v0, v5, Le00/c;->E:Ljava/lang/Object;

    check-cast v0, Lm1/a0;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v4, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v7, Lm1/z;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v2

    :goto_b
    move-object v2, v0

    goto :goto_e

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    new-instance v7, Lm1/z;

    iget-object v8, v5, Le00/c;->G:Ljava/lang/Object;

    check-cast v8, Lf0/z0;

    invoke-interface {v2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v2

    sget-object v9, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v9}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Lbc3/k1;

    invoke-direct {v7, v8, v2}, Lm1/z;-><init>(Lf0/z0;Lbc3/k1;)V

    iget-object v2, v0, Lm1/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_c
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm1/z;

    if-eqz v8, :cond_13

    iget-object v9, v7, Lm1/z;->a:Lf0/z0;

    iget-object v10, v8, Lm1/z;->a:Lf0/z0;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-ltz v9, :cond_12

    goto :goto_d

    :cond_12
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Current mutation had a higher priority"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    :goto_d
    invoke-virtual {v2, v8, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    if-eqz v8, :cond_14

    iget-object v2, v8, Lm1/z;->b:Lbc3/k1;

    invoke-interface {v2, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_14
    iget-object v2, v0, Lm1/a0;->b:Lmc3/c;

    iget-object v8, v5, Le00/c;->I:Ljava/lang/Object;

    check-cast v8, Ls83/i;

    iput-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    iput-object v2, v5, Le00/c;->y:Ljava/lang/Object;

    iput-object v8, v5, Le00/c;->z:Ljava/lang/Object;

    iput-object v0, v5, Le00/c;->E:Ljava/lang/Object;

    iput v4, v5, Le00/c;->x:I

    invoke-virtual {v2, v5}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_15

    goto :goto_11

    :cond_15
    move-object v4, v2

    goto :goto_b

    :goto_e
    :try_start_5
    iput-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    iput-object v4, v5, Le00/c;->y:Ljava/lang/Object;

    iput-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    iput-object v6, v5, Le00/c;->E:Ljava/lang/Object;

    iput v3, v5, Le00/c;->x:I

    invoke-interface {v8, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-ne v0, v1, :cond_16

    goto :goto_11

    :cond_16
    move-object v1, v2

    move-object v2, v4

    move-object v3, v7

    :goto_f
    :try_start_6
    iget-object v1, v1, Lm1/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_17
    invoke-virtual {v1, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_10

    :cond_18
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eq v4, v3, :cond_17

    :goto_10
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_11
    return-object v1

    :catchall_3
    move-exception v0

    goto :goto_14

    :catchall_4
    move-exception v0

    move-object v1, v2

    move-object v2, v4

    move-object v3, v7

    :goto_12
    :try_start_7
    iget-object v1, v1, Lm1/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_13
    invoke-virtual {v1, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_19

    goto :goto_13

    :cond_19
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_14
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_1a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v9

    if-eq v9, v8, :cond_13

    goto/16 :goto_c

    :pswitch_2
    iget-object v0, v5, Le00/c;->H:Ljava/lang/Object;

    check-cast v0, Lg1/j3;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le00/c;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_1d

    if-eq v2, v4, :cond_1c

    if-ne v2, v3, :cond_1b

    iget-object v0, v5, Le00/c;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lg1/j3;

    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmc3/a;

    iget-object v0, v5, Le00/c;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lg1/i3;

    :try_start_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 v0, p1

    goto/16 :goto_19

    :catchall_5
    move-exception v0

    goto/16 :goto_1c

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    iget-object v0, v5, Le00/c;->E:Ljava/lang/Object;

    check-cast v0, Lg1/j3;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v4, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v7, Lg1/i3;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v2

    :goto_15
    move-object v2, v0

    goto :goto_18

    :cond_1d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    new-instance v7, Lg1/i3;

    iget-object v8, v5, Le00/c;->G:Ljava/lang/Object;

    check-cast v8, Lf0/z0;

    invoke-interface {v2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v2

    sget-object v9, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v9}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Lbc3/k1;

    invoke-direct {v7, v8, v2}, Lg1/i3;-><init>(Lf0/z0;Lbc3/k1;)V

    iget-object v2, v0, Lg1/j3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_16
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/i3;

    if-eqz v8, :cond_1f

    iget-object v9, v7, Lg1/i3;->a:Lf0/z0;

    iget-object v10, v8, Lg1/i3;->a:Lf0/z0;

    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v9

    if-ltz v9, :cond_1e

    goto :goto_17

    :cond_1e
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Current mutation had a higher priority"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    :goto_17
    invoke-virtual {v2, v8, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_26

    if-eqz v8, :cond_20

    iget-object v2, v8, Lg1/i3;->b:Lbc3/k1;

    invoke-interface {v2, v6}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_20
    iget-object v2, v0, Lg1/j3;->b:Lmc3/c;

    iget-object v8, v5, Le00/c;->I:Ljava/lang/Object;

    check-cast v8, Ls83/i;

    iput-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    iput-object v2, v5, Le00/c;->y:Ljava/lang/Object;

    iput-object v8, v5, Le00/c;->z:Ljava/lang/Object;

    iput-object v0, v5, Le00/c;->E:Ljava/lang/Object;

    iput v4, v5, Le00/c;->x:I

    invoke-virtual {v2, v5}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_21

    goto :goto_1b

    :cond_21
    move-object v4, v2

    goto :goto_15

    :goto_18
    :try_start_9
    iput-object v7, v5, Le00/c;->F:Ljava/lang/Object;

    iput-object v4, v5, Le00/c;->y:Ljava/lang/Object;

    iput-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    iput-object v6, v5, Le00/c;->E:Ljava/lang/Object;

    iput v3, v5, Le00/c;->x:I

    invoke-interface {v8, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    if-ne v0, v1, :cond_22

    goto :goto_1b

    :cond_22
    move-object v1, v2

    move-object v2, v4

    move-object v3, v7

    :goto_19
    :try_start_a
    iget-object v1, v1, Lg1/j3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_23
    invoke-virtual {v1, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    goto :goto_1a

    :cond_24
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    if-eq v4, v3, :cond_23

    :goto_1a
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_1b
    return-object v1

    :catchall_6
    move-exception v0

    goto :goto_1e

    :catchall_7
    move-exception v0

    move-object v1, v2

    move-object v2, v4

    move-object v3, v7

    :goto_1c
    :try_start_b
    iget-object v1, v1, Lg1/j3;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_1d
    invoke-virtual {v1, v3, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_25

    goto :goto_1d

    :cond_25
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :goto_1e
    invoke-interface {v2, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_26
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v9

    if-eq v9, v8, :cond_1f

    goto/16 :goto_16

    :pswitch_3
    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Le00/c;->x:I

    const/4 v1, 0x1

    if-eqz v0, :cond_28

    if-ne v0, v1, :cond_27

    :try_start_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    move-object/from16 v0, p1

    goto :goto_1f

    :catchall_8
    move-exception v0

    goto :goto_20

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Le00/c;->H:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v0, Le00/w;

    iget-object v2, v5, Le00/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Le00/c;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->F:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, v5, Le00/c;->G:Ljava/lang/Object;

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    :try_start_d
    iget-object v6, v0, Le00/w;->e:Lg30/g;

    iget-object v8, v0, Le00/w;->a:Lb10/d;

    iget-object v8, v8, Lb10/d;->w:Ljava/lang/String;

    invoke-virtual {v0}, Le00/w;->b()Lyy/f;

    move-result-object v0

    iput v1, v5, Le00/c;->x:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    const/4 v5, 0x0

    move-object v1, v6

    move-object v6, v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v8

    move-object/from16 v8, p0

    :try_start_e
    invoke-virtual/range {v0 .. v8}, Lg30/g;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLyy/f;Ljava/lang/String;Ls83/i;)Ljava/lang/Object;

    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    move-object v5, v8

    if-ne v0, v9, :cond_29

    goto :goto_22

    :cond_29
    :goto_1f
    if-eqz v0, :cond_2a

    :try_start_f
    check-cast v0, Lcom/stripe/android/model/ConsumerSessionLookup;

    goto :goto_21

    :cond_2a
    const-string v0, "Required value was null."

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :catchall_9
    move-exception v0

    move-object v5, v8

    :goto_20
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_21
    new-instance v9, Ll83/n;

    invoke-direct {v9, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_22
    return-object v9

    :pswitch_4
    iget-object v0, v5, Le00/c;->y:Ljava/lang/Object;

    check-cast v0, Le00/w;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v5, Le00/c;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2c

    if-ne v2, v3, :cond_2b

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_23

    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Le00/w;->e:Lg30/g;

    iget-object v12, v0, Le00/w;->g:Ljava/util/Locale;

    iget-object v4, v0, Le00/w;->a:Lb10/d;

    iget-object v15, v4, Lb10/d;->w:Ljava/lang/String;

    new-instance v6, Ly00/k6;

    iget-object v4, v5, Le00/c;->z:Ljava/lang/Object;

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->E:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->F:Ljava/lang/Object;

    move-object v9, v4

    check-cast v9, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->G:Ljava/lang/Object;

    move-object v10, v4

    check-cast v10, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->H:Ljava/lang/Object;

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    iget-object v4, v5, Le00/c;->I:Ljava/lang/Object;

    move-object/from16 v16, v4

    check-cast v16, Ly00/l0;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v18}, Ly00/k6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ly00/l0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Le00/w;->b()Lyy/f;

    move-result-object v0

    iput v3, v5, Le00/c;->x:I

    invoke-virtual {v2, v6, v0, v5}, Lg30/g;->j(Ly00/k6;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2d

    goto :goto_24

    :cond_2d
    :goto_23
    new-instance v1, Ll83/n;

    invoke-direct {v1, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_24
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
