.class public final Lh0/s0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Lkotlin/jvm/internal/f0;

.field public F:Lan/d;

.field public G:Lu2/r;

.field public H:Z

.field public I:F

.field public J:I

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:Lkotlin/jvm/internal/f0;

.field public final synthetic N:Lh0/d2;

.field public final synthetic O:Lkotlin/jvm/functions/Function3;

.field public final synthetic P:Lc93/m;

.field public final synthetic Q:Lc93/a;

.field public final synthetic R:Lkotlin/jvm/functions/Function1;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Lkotlin/jvm/internal/f0;Lh0/d2;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/s0;->L:Lc93/a;

    iput-object p2, p0, Lh0/s0;->M:Lkotlin/jvm/internal/f0;

    iput-object p3, p0, Lh0/s0;->N:Lh0/d2;

    iput-object p4, p0, Lh0/s0;->O:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lh0/s0;->P:Lc93/m;

    iput-object p6, p0, Lh0/s0;->Q:Lc93/a;

    iput-object p7, p0, Lh0/s0;->R:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    new-instance v0, Lh0/s0;

    iget-object v6, p0, Lh0/s0;->Q:Lc93/a;

    iget-object v7, p0, Lh0/s0;->R:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lh0/s0;->L:Lc93/a;

    iget-object v2, p0, Lh0/s0;->M:Lkotlin/jvm/internal/f0;

    iget-object v3, p0, Lh0/s0;->N:Lh0/d2;

    iget-object v4, p0, Lh0/s0;->O:Lkotlin/jvm/functions/Function3;

    iget-object v5, p0, Lh0/s0;->P:Lc93/m;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lh0/s0;-><init>(Lc93/a;Lkotlin/jvm/internal/f0;Lh0/d2;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lh0/s0;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh0/s0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/s0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/s0;->J:I

    iget-object v7, v0, Lh0/s0;->N:Lh0/d2;

    const-wide/16 v8, 0x0

    iget-object v10, v0, Lh0/s0;->M:Lkotlin/jvm/internal/f0;

    const/4 v11, 0x0

    const/4 v12, 0x1

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v2, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iget-object v3, v0, Lh0/s0;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    iget-object v4, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v4, Lh0/d2;

    iget-object v5, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    iget-object v6, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    const/4 v15, 0x0

    goto/16 :goto_25

    :pswitch_1
    iget v2, v0, Lh0/s0;->I:F

    iget-object v14, v0, Lh0/s0;->G:Lu2/r;

    iget-object v15, v0, Lh0/s0;->F:Lan/d;

    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    iget-object v3, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iget-object v4, v0, Lh0/s0;->z:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/f0;

    const-wide v18, 0x7fffffff7fffffffL

    iget-object v5, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v5, Lu2/b;

    iget-object v6, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v6, Lu2/r;

    iget-object v13, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v13, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v3

    move-object v3, v6

    move-object/from16 v20, v7

    move-object v6, v5

    move-object v5, v4

    move-object v4, v13

    move-wide v12, v8

    move-object v8, v15

    goto/16 :goto_20

    :pswitch_2
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget v2, v0, Lh0/s0;->I:F

    iget-object v3, v0, Lh0/s0;->F:Lan/d;

    iget-object v4, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iget-object v5, v0, Lh0/s0;->z:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/f0;

    iget-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    iget-object v13, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v13, Lu2/r;

    iget-object v14, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v14, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    move-object v8, v3

    move-object v11, v4

    move-object v3, v13

    move-object v4, v14

    goto/16 :goto_19

    :pswitch_3
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget-object v2, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v3, Lu2/r;

    iget-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto/16 :goto_11

    :pswitch_4
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget v2, v0, Lh0/s0;->I:F

    iget-object v3, v0, Lh0/s0;->G:Lu2/r;

    iget-object v4, v0, Lh0/s0;->F:Lan/d;

    iget-object v5, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iget-object v6, v0, Lh0/s0;->z:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/f0;

    iget-object v13, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v13, Lu2/b;

    iget-object v14, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v14, Lu2/r;

    iget-object v15, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v15, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v23, v4

    move v4, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v13

    move-object v13, v5

    move-object v5, v14

    move-object v14, v6

    move-object/from16 v6, v23

    goto/16 :goto_b

    :pswitch_5
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget v2, v0, Lh0/s0;->I:F

    iget-object v3, v0, Lh0/s0;->F:Lan/d;

    iget-object v4, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iget-object v5, v0, Lh0/s0;->z:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/f0;

    iget-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    iget-object v13, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v13, Lu2/r;

    iget-object v14, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v14, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v3

    move v3, v2

    move-object v2, v15

    move-object v15, v13

    move-object v13, v4

    move-object v4, v14

    move-object v14, v5

    move-object v5, v15

    move-object/from16 v15, p1

    goto/16 :goto_5

    :pswitch_6
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget-boolean v2, v0, Lh0/s0;->H:Z

    iget-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    check-cast v3, Lu2/r;

    iget-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_1

    :pswitch_7
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    iget-object v2, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    :cond_0
    move-object v4, v2

    goto :goto_0

    :pswitch_8
    const-wide v16, 0x7fc000007fc00000L    # 2.247117487993712E307

    const-wide v18, 0x7fffffff7fffffffL

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lh0/s0;->K:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    sget-object v3, Lu2/l;->w:Lu2/l;

    iput-object v2, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput v12, v0, Lh0/s0;->J:I

    invoke-static {v2, v11, v3, v0}, Lh0/o3;->b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_0

    goto/16 :goto_24

    :goto_0
    check-cast v3, Lu2/r;

    iget-object v2, v0, Lh0/s0;->L:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lu2/r;->a()V

    :cond_1
    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-boolean v2, v0, Lh0/s0;->H:Z

    const/4 v5, 0x2

    iput v5, v0, Lh0/s0;->J:I

    invoke-static {v4, v0, v5}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_2

    goto/16 :goto_24

    :cond_2
    :goto_1
    check-cast v5, Lu2/r;

    iput-wide v8, v10, Lkotlin/jvm/internal/f0;->w:J

    if-eqz v2, :cond_13

    :goto_2
    iget-wide v2, v5, Lu2/r;->a:J

    iget v6, v5, Lu2/r;->i:I

    move-object v13, v4

    check-cast v13, Lu2/g0;

    iget-object v14, v13, Lu2/g0;->F:Lu2/h0;

    iget-object v14, v14, Lu2/h0;->T:Lu2/k;

    invoke-static {v14, v2, v3}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v14

    if-eqz v14, :cond_3

    :goto_3
    const/4 v8, 0x0

    goto/16 :goto_c

    :cond_3
    invoke-virtual {v13}, Lu2/g0;->f()Lb3/j3;

    move-result-object v13

    invoke-static {v13, v6}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v6

    new-instance v13, Lkotlin/jvm/internal/f0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    iput-wide v2, v13, Lkotlin/jvm/internal/f0;->w:J

    new-instance v2, Lan/d;

    const/16 v3, 0x8

    invoke-direct {v2, v7, v8, v9, v3}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    move v3, v6

    move-object v14, v10

    move-object v6, v4

    :goto_4
    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v5, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    iput-object v14, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v13, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iput-object v2, v0, Lh0/s0;->F:Lan/d;

    const/4 v15, 0x0

    iput-object v15, v0, Lh0/s0;->G:Lu2/r;

    iput v3, v0, Lh0/s0;->I:F

    const/4 v15, 0x3

    iput v15, v0, Lh0/s0;->J:I

    invoke-static {v6, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v1, :cond_4

    goto/16 :goto_24

    :cond_4
    :goto_5
    check-cast v15, Lu2/k;

    iget-object v12, v15, Lu2/k;->a:Ljava/lang/Object;

    move-object/from16 v20, v12

    check-cast v20, Ljava/util/Collection;

    invoke-interface/range {v20 .. v20}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v8, 0x0

    :goto_6
    if-ge v8, v11, :cond_6

    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move/from16 v20, v8

    move-object v8, v9

    check-cast v8, Lu2/r;

    move-object/from16 p1, v9

    iget-wide v8, v8, Lu2/r;->a:J

    move/from16 v22, v11

    move-object/from16 v21, v12

    iget-wide v11, v13, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v8, v9, v11, v12}, Lu2/q;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_5

    move-object/from16 v8, p1

    goto :goto_7

    :cond_5
    add-int/lit8 v8, v20, 0x1

    move-object/from16 v12, v21

    move/from16 v11, v22

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    :goto_7
    check-cast v8, Lu2/r;

    if-nez v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {v8}, Lu2/d0;->e(Lu2/r;)Z

    move-result v9

    if-eqz v9, :cond_c

    iget-object v8, v15, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v11, 0x0

    :goto_8
    if-ge v11, v9, :cond_a

    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Lu2/r;

    iget-boolean v15, v15, Lu2/r;->d:Z

    if-eqz v15, :cond_9

    goto :goto_9

    :cond_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_a
    const/4 v12, 0x0

    :goto_9
    check-cast v12, Lu2/r;

    if-nez v12, :cond_b

    goto/16 :goto_3

    :cond_b
    iget-wide v8, v12, Lu2/r;->a:J

    iput-wide v8, v13, Lkotlin/jvm/internal/f0;->w:J

    goto :goto_a

    :cond_c
    invoke-virtual {v2, v8, v3}, Lan/d;->E(Lu2/r;F)J

    move-result-wide v11

    and-long v21, v11, v18

    cmp-long v9, v21, v16

    if-eqz v9, :cond_e

    invoke-virtual {v8}, Lu2/r;->a()V

    iput-wide v11, v14, Lkotlin/jvm/internal/f0;->w:J

    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_c

    :cond_d
    const-wide/16 v8, 0x0

    iput-wide v8, v2, Lan/d;->x:J

    :goto_a
    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    goto/16 :goto_4

    :cond_e
    sget-object v9, Lu2/l;->y:Lu2/l;

    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v5, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    iput-object v14, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v13, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iput-object v2, v0, Lh0/s0;->F:Lan/d;

    iput-object v8, v0, Lh0/s0;->G:Lu2/r;

    iput v3, v0, Lh0/s0;->I:F

    const/4 v11, 0x4

    iput v11, v0, Lh0/s0;->J:I

    check-cast v6, Lu2/g0;

    invoke-virtual {v6, v9, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_f

    goto/16 :goto_24

    :cond_f
    move-object v15, v4

    move v4, v3

    move-object v3, v8

    :goto_b
    invoke-virtual {v3}, Lu2/r;->l()Z

    move-result v3

    if-eqz v3, :cond_12

    move-object v4, v15

    goto/16 :goto_3

    :goto_c
    if-eqz v8, :cond_11

    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_d

    :cond_10
    const-wide/16 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    goto/16 :goto_2

    :cond_11
    :goto_d
    move-object v3, v8

    goto :goto_e

    :cond_12
    move v3, v4

    move-object v4, v15

    goto :goto_a

    :cond_13
    :goto_e
    if-nez v3, :cond_2a

    move-object v2, v4

    check-cast v2, Lu2/g0;

    iget-object v2, v2, Lu2/g0;->F:Lu2/h0;

    iget-object v2, v2, Lu2/h0;->T:Lu2/k;

    iget-object v2, v2, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_f
    if-ge v8, v6, :cond_2a

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    iget-boolean v9, v9, Lu2/r;->d:Z

    if-eqz v9, :cond_29

    move-object v2, v3

    move-object v3, v5

    :goto_10
    sget-object v5, Lu2/l;->y:Lu2/l;

    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v2, v0, Lh0/s0;->y:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v15, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iput-object v15, v0, Lh0/s0;->F:Lan/d;

    iput-object v15, v0, Lh0/s0;->G:Lu2/r;

    const/4 v6, 0x5

    iput v6, v0, Lh0/s0;->J:I

    check-cast v4, Lu2/g0;

    invoke-virtual {v4, v5, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_14

    goto/16 :goto_24

    :cond_14
    :goto_11
    check-cast v5, Lu2/k;

    iget-object v5, v5, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_12
    if-ge v8, v6, :cond_17

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    invoke-virtual {v9}, Lu2/r;->l()Z

    move-result v9

    if-eqz v9, :cond_16

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_13
    if-ge v8, v6, :cond_17

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    iget-boolean v9, v9, Lu2/r;->d:Z

    if-eqz v9, :cond_15

    goto :goto_10

    :cond_15
    add-int/lit8 v8, v8, 0x1

    goto :goto_13

    :cond_16
    add-int/lit8 v8, v8, 0x1

    goto :goto_12

    :cond_17
    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_14
    if-ge v8, v6, :cond_28

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    iget-boolean v9, v9, Lu2/r;->d:Z

    if-eqz v9, :cond_27

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    if-eqz v2, :cond_18

    iget-wide v8, v2, Lu2/r;->c:J

    goto :goto_15

    :cond_18
    const-wide/16 v8, 0x0

    :goto_15
    iget-wide v5, v3, Lu2/r;->c:J

    invoke-static {v8, v9, v5, v6}, Lh2/b;->g(JJ)J

    move-result-wide v5

    iget-wide v8, v3, Lu2/r;->a:J

    iget v2, v3, Lu2/r;->i:I

    move-object v11, v4

    check-cast v11, Lu2/g0;

    iget-object v12, v11, Lu2/g0;->F:Lu2/h0;

    iget-object v12, v12, Lu2/h0;->T:Lu2/k;

    invoke-static {v12, v8, v9}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v12

    if-eqz v12, :cond_19

    move-object v5, v3

    move-object/from16 v20, v7

    :goto_16
    const/4 v3, 0x0

    :goto_17
    const-wide/16 v12, 0x0

    goto/16 :goto_21

    :cond_19
    invoke-virtual {v11}, Lu2/g0;->f()Lb3/j3;

    move-result-object v11

    invoke-static {v11, v2}, Lh0/z0;->m(Lb3/j3;I)F

    move-result v2

    new-instance v11, Lkotlin/jvm/internal/f0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput-wide v8, v11, Lkotlin/jvm/internal/f0;->w:J

    new-instance v8, Lan/d;

    const/16 v9, 0x8

    invoke-direct {v8, v7, v5, v6, v9}, Lan/d;-><init>(Ljava/lang/Object;JI)V

    move-object v6, v4

    move-object v5, v10

    :goto_18
    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    iput-object v5, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v11, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iput-object v8, v0, Lh0/s0;->F:Lan/d;

    const/4 v15, 0x0

    iput-object v15, v0, Lh0/s0;->G:Lu2/r;

    iput v2, v0, Lh0/s0;->I:F

    const/4 v9, 0x6

    iput v9, v0, Lh0/s0;->J:I

    invoke-static {v6, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_1a

    goto/16 :goto_24

    :cond_1a
    :goto_19
    check-cast v9, Lu2/k;

    iget-object v12, v9, Lu2/k;->a:Ljava/lang/Object;

    move-object v13, v12

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_1a
    if-ge v14, v13, :cond_1c

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v20, v7

    move-object v7, v15

    check-cast v7, Lu2/r;

    move-object/from16 v21, v12

    move/from16 p1, v13

    iget-wide v12, v7, Lu2/r;->a:J

    move v7, v14

    move-object/from16 v22, v15

    iget-wide v14, v11, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v12, v13, v14, v15}, Lu2/q;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_1b

    move-object/from16 v15, v22

    goto :goto_1b

    :cond_1b
    add-int/lit8 v14, v7, 0x1

    move/from16 v13, p1

    move-object/from16 v7, v20

    move-object/from16 v12, v21

    goto :goto_1a

    :cond_1c
    move-object/from16 v20, v7

    const/4 v15, 0x0

    :goto_1b
    move-object v14, v15

    check-cast v14, Lu2/r;

    if-nez v14, :cond_1d

    :goto_1c
    move-object v5, v3

    goto :goto_16

    :cond_1d
    invoke-virtual {v14}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_1e

    goto :goto_1c

    :cond_1e
    invoke-static {v14}, Lu2/d0;->e(Lu2/r;)Z

    move-result v7

    if-eqz v7, :cond_22

    iget-object v7, v9, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v12, 0x0

    :goto_1d
    if-ge v12, v9, :cond_20

    invoke-interface {v7, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    move-object v13, v15

    check-cast v13, Lu2/r;

    iget-boolean v13, v13, Lu2/r;->d:Z

    if-eqz v13, :cond_1f

    goto :goto_1e

    :cond_1f
    add-int/lit8 v12, v12, 0x1

    goto :goto_1d

    :cond_20
    const/4 v15, 0x0

    :goto_1e
    check-cast v15, Lu2/r;

    if-nez v15, :cond_21

    goto :goto_1c

    :cond_21
    iget-wide v12, v15, Lu2/r;->a:J

    iput-wide v12, v11, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v12, 0x0

    goto :goto_1f

    :cond_22
    invoke-virtual {v8, v14, v2}, Lan/d;->E(Lu2/r;F)J

    move-result-wide v12

    and-long v12, v12, v18

    cmp-long v7, v12, v16

    if-eqz v7, :cond_25

    invoke-virtual {v14}, Lu2/r;->a()V

    const/4 v7, 0x0

    invoke-static {v14, v7}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v12

    iput-wide v12, v5, Lkotlin/jvm/internal/f0;->w:J

    invoke-virtual {v14}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_23

    move-object v5, v3

    move-object v3, v14

    goto/16 :goto_17

    :cond_23
    const-wide/16 v12, 0x0

    iput-wide v12, v8, Lan/d;->x:J

    :cond_24
    :goto_1f
    move-object/from16 v7, v20

    goto/16 :goto_18

    :cond_25
    const-wide/16 v12, 0x0

    sget-object v7, Lu2/l;->y:Lu2/l;

    iput-object v4, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v3, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v6, v0, Lh0/s0;->y:Ljava/lang/Object;

    iput-object v5, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v11, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    iput-object v8, v0, Lh0/s0;->F:Lan/d;

    iput-object v14, v0, Lh0/s0;->G:Lu2/r;

    iput v2, v0, Lh0/s0;->I:F

    const/4 v9, 0x7

    iput v9, v0, Lh0/s0;->J:I

    check-cast v6, Lu2/g0;

    invoke-virtual {v6, v7, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_26

    goto/16 :goto_24

    :cond_26
    :goto_20
    invoke-virtual {v14}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_24

    move-object v5, v3

    const/4 v3, 0x0

    :goto_21
    move-object/from16 v7, v20

    goto/16 :goto_e

    :cond_27
    move-object/from16 v20, v7

    const-wide/16 v12, 0x0

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_14

    :cond_28
    move-object v5, v3

    move-object v3, v2

    goto/16 :goto_e

    :cond_29
    move-object/from16 v20, v7

    const-wide/16 v12, 0x0

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_f

    :cond_2a
    if-eqz v3, :cond_3b

    iget-wide v6, v10, Lkotlin/jvm/internal/f0;->w:J

    new-instance v2, Lh2/b;

    invoke-direct {v2, v6, v7}, Lh2/b;-><init>(J)V

    iget-object v6, v0, Lh0/s0;->O:Lkotlin/jvm/functions/Function3;

    invoke-interface {v6, v5, v3, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v5, v10, Lkotlin/jvm/internal/f0;->w:J

    new-instance v2, Lh2/b;

    invoke-direct {v2, v5, v6}, Lh2/b;-><init>(J)V

    iget-object v5, v0, Lh0/s0;->P:Lc93/m;

    invoke-interface {v5, v3, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v2, v3, Lu2/r;->a:J

    move-object v6, v4

    check-cast v6, Lu2/g0;

    iget-object v6, v6, Lu2/g0;->F:Lu2/h0;

    iget-object v6, v6, Lu2/h0;->T:Lu2/k;

    invoke-static {v6, v2, v3}, Lh0/z0;->l(Lu2/k;J)Z

    move-result v6

    if-eqz v6, :cond_2b

    const/4 v13, 0x0

    goto/16 :goto_2f

    :cond_2b
    const/4 v15, 0x0

    :goto_22
    new-instance v6, Lkotlin/jvm/internal/f0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-wide v2, v6, Lkotlin/jvm/internal/f0;->w:J

    move-object v3, v4

    move-object v2, v6

    move-object v6, v3

    move-object v4, v15

    :goto_23
    iput-object v6, v0, Lh0/s0;->K:Ljava/lang/Object;

    iput-object v5, v0, Lh0/s0;->x:Ljava/lang/Object;

    iput-object v4, v0, Lh0/s0;->y:Ljava/lang/Object;

    iput-object v3, v0, Lh0/s0;->z:Ljava/lang/Object;

    iput-object v2, v0, Lh0/s0;->E:Lkotlin/jvm/internal/f0;

    const/4 v15, 0x0

    iput-object v15, v0, Lh0/s0;->F:Lan/d;

    iput-object v15, v0, Lh0/s0;->G:Lu2/r;

    const/16 v7, 0x8

    iput v7, v0, Lh0/s0;->J:I

    invoke-static {v3, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_2c

    :goto_24
    return-object v1

    :cond_2c
    :goto_25
    check-cast v7, Lu2/k;

    iget-object v8, v7, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_26
    if-ge v10, v9, :cond_2e

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lu2/r;

    iget-wide v12, v12, Lu2/r;->a:J

    move-object v14, v8

    move/from16 p1, v9

    iget-wide v8, v2, Lkotlin/jvm/internal/f0;->w:J

    invoke-static {v12, v13, v8, v9}, Lu2/q;->a(JJ)Z

    move-result v8

    if-eqz v8, :cond_2d

    goto :goto_27

    :cond_2d
    add-int/lit8 v10, v10, 0x1

    move/from16 v9, p1

    move-object v8, v14

    goto :goto_26

    :cond_2e
    move-object v11, v15

    :goto_27
    move-object v8, v11

    check-cast v8, Lu2/r;

    if-nez v8, :cond_2f

    move-object v8, v15

    :goto_28
    const/4 v7, 0x1

    goto :goto_2d

    :cond_2f
    invoke-static {v8}, Lu2/d0;->e(Lu2/r;)Z

    move-result v9

    if-eqz v9, :cond_33

    iget-object v7, v7, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_29
    if-ge v10, v9, :cond_31

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lu2/r;

    iget-boolean v12, v12, Lu2/r;->d:Z

    if-eqz v12, :cond_30

    goto :goto_2a

    :cond_30
    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_31
    move-object v11, v15

    :goto_2a
    check-cast v11, Lu2/r;

    if-nez v11, :cond_32

    goto :goto_28

    :cond_32
    iget-wide v7, v11, Lu2/r;->a:J

    iput-wide v7, v2, Lkotlin/jvm/internal/f0;->w:J

    const/4 v7, 0x1

    goto :goto_23

    :cond_33
    const/4 v7, 0x1

    invoke-static {v8, v7}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v9

    if-nez v4, :cond_34

    invoke-static {v9, v10}, Lh2/b;->d(J)F

    move-result v9

    goto :goto_2c

    :cond_34
    sget-object v11, Lh0/d2;->w:Lh0/d2;

    if-ne v4, v11, :cond_35

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    :goto_2b
    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    goto :goto_2c

    :cond_35
    const/16 v11, 0x20

    shr-long/2addr v9, v11

    goto :goto_2b

    :goto_2c
    const/4 v10, 0x0

    cmpg-float v9, v9, v10

    if-nez v9, :cond_36

    goto/16 :goto_23

    :cond_36
    :goto_2d
    if-nez v8, :cond_37

    :goto_2e
    move-object v13, v15

    goto :goto_2f

    :cond_37
    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v2

    if-eqz v2, :cond_38

    goto :goto_2e

    :cond_38
    invoke-static {v8}, Lu2/d0;->e(Lu2/r;)Z

    move-result v2

    if-eqz v2, :cond_3a

    move-object v13, v8

    :goto_2f
    if-nez v13, :cond_39

    iget-object v1, v0, Lh0/s0;->Q:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_30

    :cond_39
    iget-object v1, v0, Lh0/s0;->R:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_30

    :cond_3a
    const/4 v2, 0x0

    invoke-static {v8, v2}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v9

    new-instance v3, Lh2/b;

    invoke-direct {v3, v9, v10}, Lh2/b;-><init>(J)V

    invoke-interface {v5, v8, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lu2/r;->a()V

    iget-wide v8, v8, Lu2/r;->a:J

    move-object v15, v4

    move-object v4, v6

    move-wide v2, v8

    goto/16 :goto_22

    :cond_3b
    :goto_30
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
