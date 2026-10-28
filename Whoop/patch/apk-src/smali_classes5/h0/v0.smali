.class public final Lh0/v0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ll83/e;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh0/v0;->x:I

    .line 1
    iput-object p1, p0, Lh0/v0;->G:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lh0/v0;->H:Ll83/e;

    iput-object p3, p0, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lh0/v0;->I:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V
    .locals 0

    .line 2
    iput p6, p0, Lh0/v0;->x:I

    iput-object p1, p0, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lh0/v0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lh0/v0;->H:Ll83/e;

    iput-object p4, p0, Lh0/v0;->I:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Lh0/v0;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lh0/v0;

    iget-object v0, p0, Lh0/v0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lh0/v0;->H:Ll83/e;

    move-object v3, v0

    check-cast v3, Ls83/i;

    iget-object v0, p0, Lh0/v0;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lh0/h2;

    iget-object v4, p0, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lh0/v0;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lh0/h2;Lq83/d;)V

    iput-object p1, v1, Lh0/v0;->E:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v7, p2

    new-instance v2, Lh0/v0;

    iget-object p2, p0, Lh0/v0;->G:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lc93/m;

    iget-object p2, p0, Lh0/v0;->H:Ll83/e;

    move-object v5, p2

    check-cast v5, Lc93/a;

    iget-object p2, p0, Lh0/v0;->I:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lgw1/a;

    const/4 v8, 0x1

    iget-object v3, p0, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v2 .. v8}, Lh0/v0;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V

    iput-object p1, v2, Lh0/v0;->E:Ljava/lang/Object;

    return-object v2

    :pswitch_1
    move-object v7, p2

    new-instance v2, Lh0/v0;

    iget-object p2, p0, Lh0/v0;->G:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lc93/m;

    iget-object p2, p0, Lh0/v0;->H:Ll83/e;

    move-object v5, p2

    check-cast v5, Lc93/a;

    iget-object p2, p0, Lh0/v0;->I:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    iget-object v3, p0, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v2 .. v8}, Lh0/v0;-><init>(Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/a;Lc93/a;Lq83/d;I)V

    iput-object p1, v2, Lh0/v0;->E:Ljava/lang/Object;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/v0;->x:I

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh0/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lh0/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v5, p0

    iget v0, v5, Lh0/v0;->x:I

    iget-object v6, v5, Lh0/v0;->I:Ljava/lang/Object;

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v5, Lh0/v0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v9, v5, Lh0/v0;->H:Ll83/e;

    const/4 v10, 0x3

    const/4 v1, 0x0

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v11, 0x0

    iget-object v3, v5, Lh0/v0;->G:Ljava/lang/Object;

    const/4 v12, 0x2

    const/4 v13, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v3, Lbc3/c0;

    check-cast v6, Lh0/h2;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v4, v5, Lh0/v0;->z:I

    if-eqz v4, :cond_2

    if-eq v4, v13, :cond_1

    if-ne v4, v12, :cond_0

    iget-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v5, Lh0/v0;->y:Ljava/lang/Object;

    check-cast v2, Lbc3/c2;

    iget-object v4, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v5, Lh0/v0;->E:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Lu2/b;

    sget-object v2, Lh0/o3;->a:Lh0/d3;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v14, Lh0/j3;

    invoke-direct {v14, v6, v11, v1}, Lh0/j3;-><init>(Lh0/h2;Lq83/d;I)V

    invoke-static {v3, v11, v2, v14, v13}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v2

    iput-object v4, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v2, v5, Lh0/v0;->y:Ljava/lang/Object;

    iput v13, v5, Lh0/v0;->z:I

    invoke-static {v4, v5, v10}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->a()V

    check-cast v9, Ls83/i;

    sget-object v14, Lh0/o3;->a:Lh0/d3;

    if-eq v9, v14, :cond_4

    new-instance v14, Lg20/p;

    invoke-direct {v14, v9, v6, v10, v11}, Lg20/p;-><init>(Lkotlin/jvm/functions/Function3;Lh0/h2;Lu2/r;Lq83/d;)V

    invoke-static {v3, v2, v14}, Lh0/o3;->h(Lbc3/c0;Lbc3/k1;Lc93/m;)Lbc3/c2;

    :cond_4
    iput-object v2, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v11, v5, Lh0/v0;->y:Ljava/lang/Object;

    iput v12, v5, Lh0/v0;->z:I

    sget-object v9, Lu2/l;->x:Lu2/l;

    invoke-static {v4, v9, v5}, Lh0/o3;->j(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_5

    :goto_1
    move-object v7, v0

    goto :goto_3

    :cond_5
    move-object v0, v2

    :goto_2
    check-cast v4, Lu2/r;

    if-nez v4, :cond_6

    new-instance v2, Lh0/i3;

    invoke-direct {v2, v6, v11, v1}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    invoke-static {v3, v0, v2}, Lh0/o3;->h(Lbc3/c0;Lbc3/k1;Lc93/m;)Lbc3/c2;

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Lu2/r;->a()V

    new-instance v1, Lh0/i3;

    invoke-direct {v1, v6, v11, v13}, Lh0/i3;-><init>(Lh0/h2;Lq83/d;I)V

    invoke-static {v3, v0, v1}, Lh0/o3;->h(Lbc3/c0;Lbc3/k1;Lc93/m;)Lbc3/c2;

    iget-wide v0, v4, Lu2/r;->c:J

    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    return-object v7

    :pswitch_0
    move-object v6, v3

    check-cast v6, Lc93/m;

    sget-object v14, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lh0/v0;->z:I

    if-eqz v0, :cond_a

    if-eq v0, v13, :cond_9

    if-eq v0, v12, :cond_8

    if-ne v0, v10, :cond_7

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_7

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v0, v5, Lh0/v0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_5

    :cond_9
    iget-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_4

    :cond_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    iput-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput v13, v5, Lh0/v0;->z:I

    invoke-static {v0, v5, v12}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_b

    goto :goto_6

    :cond_b
    :goto_4
    check-cast v1, Lu2/r;

    new-instance v15, Lkotlin/jvm/internal/d0;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iget-wide v2, v1, Lu2/r;->a:J

    iget v1, v1, Lu2/r;->i:I

    new-instance v4, Lh0/u0;

    invoke-direct {v4, v15, v13}, Lh0/u0;-><init>(Lkotlin/jvm/internal/d0;I)V

    iput-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v15, v5, Lh0/v0;->y:Ljava/lang/Object;

    iput v12, v5, Lh0/v0;->z:I

    move-wide/from16 v16, v2

    move v3, v1

    move-wide/from16 v1, v16

    invoke-static/range {v0 .. v5}, Lh0/z0;->e(Lu2/b;JILh0/u0;Ls83/a;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_c

    goto :goto_6

    :cond_c
    move-object v2, v0

    move-object v0, v15

    :goto_5
    check-cast v1, Lu2/r;

    if-eqz v1, :cond_f

    iget-wide v3, v1, Lu2/r;->c:J

    new-instance v13, Lh2/b;

    invoke-direct {v13, v3, v4}, Lh2/b;-><init>(J)V

    invoke-interface {v8, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v0, Lkotlin/jvm/internal/d0;->w:F

    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v6, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, v1, Lu2/r;->a:J

    new-instance v3, Ld30/d1;

    invoke-direct {v3, v12, v6}, Ld30/d1;-><init>(ILc93/m;)V

    iput-object v11, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v11, v5, Lh0/v0;->y:Ljava/lang/Object;

    iput v10, v5, Lh0/v0;->z:I

    invoke-static {v2, v0, v1, v3, v5}, Lh0/z0;->n(Lu2/b;JLd30/d1;Ls83/a;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_d

    :goto_6
    move-object v7, v14

    goto :goto_8

    :cond_d
    :goto_7
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_e

    check-cast v9, Lc93/a;

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_8

    :cond_e
    sget v0, Lh0/z0;->a:F

    :cond_f
    :goto_8
    return-object v7

    :pswitch_1
    move-object v14, v3

    check-cast v14, Lc93/m;

    sget-object v15, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lh0/v0;->z:I

    if-eqz v0, :cond_13

    if-eq v0, v13, :cond_12

    if-eq v0, v12, :cond_11

    if-ne v0, v10, :cond_10

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_c

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    iget-object v0, v5, Lh0/v0;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget-object v1, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v1, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_a

    :cond_12
    iget-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_9

    :cond_13
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    iput-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput v13, v5, Lh0/v0;->z:I

    invoke-static {v0, v5, v12}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_14

    goto :goto_b

    :cond_14
    :goto_9
    check-cast v2, Lu2/r;

    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iget-wide v10, v2, Lu2/r;->a:J

    iget v2, v2, Lu2/r;->i:I

    new-instance v4, Lh0/u0;

    invoke-direct {v4, v3, v1}, Lh0/u0;-><init>(Lkotlin/jvm/internal/d0;I)V

    iput-object v0, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v3, v5, Lh0/v0;->y:Ljava/lang/Object;

    iput v12, v5, Lh0/v0;->z:I

    move-object/from16 v16, v3

    move v3, v2

    move-wide v1, v10

    move-object/from16 v10, v16

    invoke-static/range {v0 .. v5}, Lh0/z0;->c(Lu2/b;JILh0/u0;Ls83/a;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_15

    goto :goto_b

    :cond_15
    move-object v2, v0

    move-object v0, v10

    :goto_a
    check-cast v1, Lu2/r;

    if-eqz v1, :cond_18

    iget-wide v3, v1, Lu2/r;->c:J

    new-instance v10, Lh2/b;

    invoke-direct {v10, v3, v4}, Lh2/b;-><init>(J)V

    invoke-interface {v8, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v0, Lkotlin/jvm/internal/d0;->w:F

    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v14, v1, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, v1, Lu2/r;->a:J

    new-instance v3, Ld30/d1;

    invoke-direct {v3, v13, v14}, Ld30/d1;-><init>(ILc93/m;)V

    const/4 v4, 0x0

    iput-object v4, v5, Lh0/v0;->E:Ljava/lang/Object;

    iput-object v4, v5, Lh0/v0;->y:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, v5, Lh0/v0;->z:I

    invoke-static {v2, v0, v1, v3, v5}, Lh0/z0;->k(Lu2/b;JLd30/d1;Ls83/a;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_16

    :goto_b
    move-object v7, v15

    goto :goto_d

    :cond_16
    :goto_c
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_17

    check-cast v9, Lc93/a;

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_d

    :cond_17
    check-cast v6, Lc93/a;

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_18
    :goto_d
    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
