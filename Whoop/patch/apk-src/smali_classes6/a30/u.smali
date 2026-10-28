.class public final La30/u;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Z

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La30/a0;Lmy/a;ZLy00/u1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La30/u;->w:I

    .line 1
    iput-object p1, p0, La30/u;->z:Ljava/lang/Object;

    iput-object p2, p0, La30/u;->E:Ljava/lang/Object;

    iput-boolean p3, p0, La30/u;->y:Z

    iput-object p4, p0, La30/u;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld0/e;ZLd0/e2;Lc93/a;Lq83/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La30/u;->w:I

    .line 2
    iput-object p1, p0, La30/u;->z:Ljava/lang/Object;

    iput-boolean p2, p0, La30/u;->y:Z

    iput-object p3, p0, La30/u;->E:Ljava/lang/Object;

    iput-object p4, p0, La30/u;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La30/u;->w:I

    .line 3
    iput-object p1, p0, La30/u;->z:Ljava/lang/Object;

    iput-object p2, p0, La30/u;->E:Ljava/lang/Object;

    iput-object p3, p0, La30/u;->F:Ljava/lang/Object;

    iput-boolean p4, p0, La30/u;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La30/u;->w:I

    .line 4
    iput-object p1, p0, La30/u;->E:Ljava/lang/Object;

    iput-object p2, p0, La30/u;->F:Ljava/lang/Object;

    iput-boolean p3, p0, La30/u;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 5
    iput p5, p0, La30/u;->w:I

    iput-object p1, p0, La30/u;->E:Ljava/lang/Object;

    iput-boolean p2, p0, La30/u;->y:Z

    iput-object p3, p0, La30/u;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(ZLp0/t;Ld0/c0;Ll2/c;Lq83/d;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, La30/u;->w:I

    .line 6
    iput-boolean p1, p0, La30/u;->y:Z

    iput-object p2, p0, La30/u;->z:Ljava/lang/Object;

    iput-object p3, p0, La30/u;->E:Ljava/lang/Object;

    iput-object p4, p0, La30/u;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, La30/u;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, La30/u;

    iget-object p1, p0, La30/u;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lp1/c1;

    iget-object p1, p0, La30/u;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lj0/i;

    const/4 v6, 0x6

    iget-boolean v3, p0, La30/u;->y:Z

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, La30/u;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v7, p2

    new-instance v2, La30/u;

    iget-object p1, p0, La30/u;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp0/t;

    iget-object p1, p0, La30/u;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld0/c0;

    iget-object p1, p0, La30/u;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ll2/c;

    iget-boolean v3, p0, La30/u;->y:Z

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(ZLp0/t;Ld0/c0;Ll2/c;Lq83/d;)V

    return-object v2

    :pswitch_1
    move-object v7, p2

    new-instance v2, La30/u;

    iget-object p1, p0, La30/u;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld0/e;

    iget-object p1, p0, La30/u;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ld0/e2;

    iget-object p1, p0, La30/u;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lc93/a;

    iget-boolean v4, p0, La30/u;->y:Z

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(Ld0/e;ZLd0/e2;Lc93/a;Lq83/d;)V

    return-object v2

    :pswitch_2
    move-object v7, p2

    new-instance v2, La30/u;

    iget-object p1, p0, La30/u;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ld33/h1;

    iget-object p1, p0, La30/u;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/util/List;

    iget-object p1, p0, La30/u;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/util/List;

    iget-boolean v6, p0, La30/u;->y:Z

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V

    return-object v2

    :pswitch_3
    move-object v7, p2

    new-instance p2, La30/u;

    iget-object v0, p0, La30/u;->E:Ljava/lang/Object;

    check-cast v0, Ld33/h1;

    iget-object v1, p0, La30/u;->F:Ljava/lang/Object;

    check-cast v1, Lstream/video/sfu/models/TrackType;

    iget-boolean v2, p0, La30/u;->y:Z

    invoke-direct {p2, v0, v1, v2, v7}, La30/u;-><init>(Ld33/h1;Lstream/video/sfu/models/TrackType;ZLq83/d;)V

    iput-object p1, p2, La30/u;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v7, p2

    new-instance v2, La30/u;

    iget-object p2, p0, La30/u;->E:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Landroidx/room/z0;

    iget-object p2, p0, La30/u;->F:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, [Ljava/lang/String;

    move-object v6, v7

    const/4 v7, 0x1

    iget-boolean v4, p0, La30/u;->y:Z

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, La30/u;->z:Ljava/lang/Object;

    return-object v2

    :pswitch_5
    move-object v7, p2

    new-instance v2, La30/u;

    iget-object p1, p0, La30/u;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, La30/a0;

    iget-object p1, p0, La30/u;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lmy/a;

    iget-object p1, p0, La30/u;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ly00/u1;

    iget-boolean v5, p0, La30/u;->y:Z

    invoke-direct/range {v2 .. v7}, La30/u;-><init>(La30/a0;Lmy/a;ZLy00/u1;Lq83/d;)V

    return-object v2

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La30/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/room/x1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v4, p0

    iget v0, v4, La30/u;->w:I

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-boolean v7, v4, La30/u;->y:Z

    iget-object v8, v4, La30/u;->F:Ljava/lang/Object;

    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v10, 0x1

    iget-object v11, v4, La30/u;->E:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v11, Lp1/c1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, La30/u;->x:I

    if-eqz v1, :cond_1

    if-ne v1, v10, :cond_0

    iget-object v0, v4, La30/u;->z:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Lp1/c1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj0/l;

    if-eqz v1, :cond_4

    check-cast v8, Lj0/i;

    if-eqz v7, :cond_2

    new-instance v2, Lj0/m;

    invoke-direct {v2, v1}, Lj0/m;-><init>(Lj0/l;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lj0/k;

    invoke-direct {v2, v1}, Lj0/k;-><init>(Lj0/l;)V

    :goto_0
    if-eqz v8, :cond_3

    iput-object v11, v4, La30/u;->z:Ljava/lang/Object;

    iput v10, v4, La30/u;->x:I

    check-cast v8, Lj0/j;

    invoke-virtual {v8, v2, v4}, Lj0/j;->a(Lj0/h;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    move-object v6, v0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-interface {v11, v5}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-object v6

    :pswitch_0
    iget-object v0, v4, La30/u;->z:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lp0/t;

    sget-object v13, Lr83/a;->w:Lr83/a;

    iget v0, v4, La30/u;->x:I

    const/4 v14, 0x0

    if-eqz v0, :cond_7

    if-eq v0, v10, :cond_6

    if-ne v0, v3, :cond_5

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v0, p1

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v7, :cond_8

    :try_start_2
    iget-object v0, v12, Lp0/t;->p:Ld0/e;

    new-instance v5, Ljava/lang/Float;

    invoke-direct {v5, v2}, Ljava/lang/Float;-><init>(F)V

    iput v10, v4, La30/u;->x:I

    invoke-virtual {v0, v5, v4}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v0, v12, Lp0/t;->p:Ld0/e;

    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    check-cast v11, Ld0/c0;

    check-cast v8, Ll2/c;

    new-instance v1, Lp0/s;

    invoke-direct {v1, v8, v12, v14}, Lp0/s;-><init>(Ll2/c;Lp0/t;I)V

    iput v3, v4, La30/u;->x:I

    const/4 v5, 0x4

    move-object v3, v1

    move-object v1, v2

    move-object v2, v11

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_9

    :goto_4
    move-object v6, v13

    goto :goto_6

    :cond_9
    :goto_5
    check-cast v0, Ld0/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v0, Lp0/t;->t:I

    invoke-virtual {v12, v14}, Lp0/t;->j(Z)V

    :goto_6
    return-object v6

    :goto_7
    sget v1, Lp0/t;->t:I

    invoke-virtual {v12, v14}, Lp0/t;->j(Z)V

    throw v0

    :pswitch_1
    sget-object v12, Lr83/a;->w:Lr83/a;

    iget v0, v4, La30/u;->x:I

    if-eqz v0, :cond_b

    if-ne v0, v10, :cond_a

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v0, Ld0/e;

    if-eqz v7, :cond_c

    goto :goto_8

    :cond_c
    move v1, v2

    :goto_8
    new-instance v2, Ljava/lang/Float;

    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    check-cast v11, Ld0/e2;

    iput v10, v4, La30/u;->x:I

    const/4 v3, 0x0

    const/16 v5, 0xc

    move-object v1, v2

    move-object v2, v11

    invoke-static/range {v0 .. v5}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_d

    move-object v6, v12

    goto :goto_a

    :cond_d
    :goto_9
    check-cast v8, Lc93/a;

    invoke-interface {v8}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_a
    return-object v6

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, La30/u;->x:I

    if-eqz v1, :cond_f

    if-ne v1, v10, :cond_e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    check-cast v0, Ll83/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_b

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    move-object v13, v1

    check-cast v13, Ld33/h1;

    iget-object v1, v13, Ld33/h1;->l:Ln53/x1;

    new-instance v12, Ld33/u0;

    move-object v14, v11

    check-cast v14, Ljava/util/List;

    move-object v15, v8

    check-cast v15, Ljava/util/List;

    iget-boolean v2, v4, La30/u;->y:Z

    const/16 v17, 0x0

    move/from16 v16, v2

    invoke-direct/range {v12 .. v17}, Ld33/u0;-><init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V

    iput v10, v4, La30/u;->x:I

    const-string v2, "setVideoSubscriptions"

    invoke-virtual {v1, v2, v12, v4}, Ln53/x1;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_10

    move-object v6, v0

    :cond_10
    :goto_b
    return-object v6

    :pswitch_3
    check-cast v11, Ld33/h1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, La30/u;->x:I

    if-eqz v1, :cond_13

    if-eq v1, v10, :cond_12

    if-ne v1, v3, :cond_11

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_e

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_c

    :cond_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    new-instance v12, Lstream/video/sfu/signal/UpdateMuteStatesRequest;

    iget-object v13, v11, Ld33/h1;->c:Ljava/lang/String;

    new-instance v14, Lstream/video/sfu/signal/TrackMuteState;

    move-object v15, v8

    check-cast v15, Lstream/video/sfu/models/TrackType;

    xor-int/lit8 v16, v7, 0x1

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lstream/video/sfu/signal/TrackMuteState;-><init>(Lstream/video/sfu/models/TrackType;ZLne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v16, 0x4

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lstream/video/sfu/signal/UpdateMuteStatesRequest;-><init>(Ljava/lang/String;Ljava/util/List;Lne3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    iput v10, v4, La30/u;->x:I

    invoke-static {v11, v12, v4}, Ld33/h1;->h(Ld33/h1;Lstream/video/sfu/signal/UpdateMuteStatesRequest;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    check-cast v2, Ln23/h;

    invoke-virtual {v2}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/signal/UpdateMuteStatesResponse;

    invoke-virtual {v2}, Lstream/video/sfu/signal/UpdateMuteStatesResponse;->getError()Lstream/video/sfu/models/Error;

    move-result-object v7

    if-nez v7, :cond_16

    iput-object v5, v4, La30/u;->z:Ljava/lang/Object;

    iput v3, v4, La30/u;->x:I

    invoke-interface {v1, v2, v4}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_15

    :goto_d
    move-object v6, v0

    :cond_15
    :goto_e
    return-object v6

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v7}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Mute state update failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_4
    check-cast v11, Landroidx/room/z0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, La30/u;->x:I

    packed-switch v1, :pswitch_data_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_6
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_13

    :pswitch_7
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_12

    :pswitch_8
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_11

    :pswitch_9
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :pswitch_a
    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_f

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/room/x1;

    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    iput v10, v4, La30/u;->x:I

    invoke-interface {v1, v4}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v2

    if-ne v2, v0, :cond_17

    goto :goto_14

    :cond_17
    :goto_f
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_18

    invoke-virtual {v11}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v2

    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    iput v3, v4, La30/u;->x:I

    invoke-virtual {v2, v4}, Landroidx/room/v;->d(Ls83/i;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_18

    goto :goto_14

    :cond_18
    :goto_10
    sget-object v2, Landroidx/room/w1;->x:Landroidx/room/w1;

    new-instance v3, Landroidx/room/x0;

    check-cast v8, [Ljava/lang/String;

    invoke-direct {v3, v7, v8, v5}, Landroidx/room/x0;-><init>(Z[Ljava/lang/String;Lq83/d;)V

    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v4, La30/u;->x:I

    invoke-interface {v1, v2, v3, v4}, Landroidx/room/x1;->b(Landroidx/room/w1;Lc93/m;Ls83/i;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_19

    goto :goto_14

    :cond_19
    :goto_11
    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v4, La30/u;->x:I

    invoke-interface {v1, v4}, Landroidx/room/x1;->a(Lq83/d;)Ljava/lang/Boolean;

    move-result-object v2

    if-ne v2, v0, :cond_1a

    goto :goto_14

    :cond_1a
    :goto_12
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1d

    iput-object v1, v4, La30/u;->z:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v4, La30/u;->x:I

    const-string v2, "PRAGMA wal_checkpoint(FULL)"

    invoke-static {v1, v2, v4}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1b

    goto :goto_14

    :cond_1b
    :goto_13
    iput-object v5, v4, La30/u;->z:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v4, La30/u;->x:I

    const-string v2, "VACUUM"

    invoke-static {v1, v2, v4}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_1c

    :goto_14
    move-object v6, v0

    goto :goto_16

    :cond_1c
    :goto_15
    invoke-virtual {v11}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    iget-object v1, v0, Landroidx/room/v;->c:Landroidx/room/i2;

    iget-object v2, v0, Landroidx/room/v;->f:Landroidx/room/r;

    iget-object v0, v0, Landroidx/room/v;->g:Landroidx/room/r;

    invoke-virtual {v1, v2, v0}, Landroidx/room/i2;->e(Lc93/a;Lc93/a;)V

    :cond_1d
    :goto_16
    return-object v6

    :pswitch_c
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, La30/u;->x:I

    if-eqz v1, :cond_1f

    if-ne v1, v10, :cond_1e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_18

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v4, La30/u;->z:Ljava/lang/Object;

    check-cast v1, La30/a0;

    check-cast v11, Lmy/a;

    check-cast v8, Ly00/u1;

    iput v10, v4, La30/u;->x:I

    invoke-virtual {v8}, Ly00/u1;->b()Z

    move-result v2

    iget-object v3, v11, Lmy/a;->x:Lh20/c2;

    iget-object v1, v1, La30/a0;->a:Lh20/h;

    if-eqz v3, :cond_20

    iget-object v3, v3, Lh20/c2;->w:Ljava/lang/String;

    goto :goto_17

    :cond_20
    move-object v3, v5

    :goto_17
    new-instance v6, La00/g;

    iget-object v8, v1, Lh20/h;->a:Landroid/content/Context;

    iget-object v1, v1, Lh20/h;->b:Lq83/j;

    invoke-direct {v6, v8, v3, v1}, La00/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lq83/j;)V

    new-instance v3, Lh20/i;

    invoke-direct {v3, v6, v7, v2, v5}, Lh20/i;-><init>(La00/g;ZZLq83/d;)V

    invoke-static {v1, v3, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_21

    goto :goto_18

    :cond_21
    move-object v0, v1

    :goto_18
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method
