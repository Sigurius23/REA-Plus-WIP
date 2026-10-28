.class public final synthetic Lf1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/w0;


# direct methods
.method public synthetic constructor <init>(Lf1/w0;I)V
    .locals 0

    iput p2, p0, Lf1/d0;->w:I

    iput-object p1, p0, Lf1/d0;->x:Lf1/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, Lf1/d0;->w:I

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const/4 v8, 0x0

    const/4 v9, 0x1

    iget-object v10, v0, Lf1/d0;->x:Lf1/w0;

    packed-switch v1, :pswitch_data_0

    iget-object v1, v10, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v10}, Lf1/w0;->k()Ly2/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object/from16 v19, v7

    goto/16 :goto_4

    :cond_0
    sget-object v3, La0/w;->a:La0/k0;

    new-instance v3, La0/k0;

    invoke-direct {v3}, La0/k0;-><init>()V

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v8

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf1/l;

    iget-wide v13, v12, Lf1/l;->a:J

    iget-object v15, v12, Lf1/l;->c:Le1/i;

    invoke-virtual {v15}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll3/r0;

    if-nez v15, :cond_1

    move-object/from16 v16, v2

    move/from16 v17, v4

    move/from16 v18, v5

    move-object/from16 v19, v7

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v6, v15, Ll3/r0;->a:Ll3/q0;

    iget-object v6, v6, Ll3/q0;->a:Ll3/g;

    iget-object v6, v6, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    move-object/from16 v16, v2

    new-instance v2, Lf1/u;

    move/from16 v17, v4

    new-instance v4, Lf1/t;

    move/from16 v18, v5

    invoke-virtual {v15, v8}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v5

    invoke-direct {v4, v5, v8, v13, v14}, Lf1/t;-><init>(Lw3/j;IJ)V

    new-instance v5, Lf1/t;

    move-object/from16 v19, v7

    add-int/lit8 v7, v6, -0x1

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v15, v7}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v7

    invoke-direct {v5, v7, v6, v13, v14}, Lf1/t;-><init>(Lw3/j;IJ)V

    invoke-direct {v2, v4, v5, v8}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    :goto_1
    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    if-nez v9, :cond_3

    move-object v9, v2

    :cond_3
    iget-wide v4, v12, Lf1/l;->a:J

    invoke-virtual {v3, v4, v5}, La0/k0;->c(J)I

    move-result v6

    iget-object v7, v3, La0/k0;->c:[Ljava/lang/Object;

    aget-object v11, v7, v6

    iget-object v11, v3, La0/k0;->b:[J

    aput-wide v4, v11, v6

    aput-object v2, v7, v6

    move-object v11, v2

    :goto_2
    add-int/lit8 v5, v18, 0x1

    move-object/from16 v2, v16

    move/from16 v4, v17

    move-object/from16 v7, v19

    goto :goto_0

    :cond_4
    move-object/from16 v19, v7

    iget v2, v3, La0/k0;->e:I

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    if-ne v9, v11, :cond_6

    goto :goto_3

    :cond_6
    new-instance v2, Lf1/u;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, v9, Lf1/u;->a:Lf1/t;

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, v11, Lf1/u;->b:Lf1/t;

    invoke-direct {v2, v4, v5, v8}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    move-object v9, v2

    :goto_3
    iget-object v1, v1, Lf1/b1;->k:Lp1/k1;

    invoke-virtual {v1, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v10, Lf1/w0;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v10, Lf1/w0;->t:Lf1/q0;

    :goto_4
    return-object v19

    :pswitch_0
    iget-boolean v1, v10, Lf1/w0;->x:Z

    if-eqz v1, :cond_7

    invoke-virtual {v10}, Lf1/w0;->h()Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    move v8, v9

    :cond_8
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_1
    move-object/from16 v19, v7

    invoke-virtual {v10}, Lf1/w0;->c()V

    return-object v19

    :pswitch_2
    move-object/from16 v19, v7

    iget-object v10, v0, Lf1/d0;->x:Lf1/w0;

    iput-boolean v9, v10, Lf1/w0;->x:Z

    invoke-virtual {v10}, Lf1/w0;->p()V

    iget-object v1, v10, Lf1/w0;->r:Lp1/k1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v10, Lf1/w0;->s:Lp1/k1;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean v1, v10, Lf1/w0;->u:Z

    if-eqz v1, :cond_e

    invoke-virtual {v10}, Lf1/w0;->i()Z

    move-result v1

    if-eqz v1, :cond_e

    new-instance v11, Lkotlin/jvm/internal/g0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v12, Lkotlin/jvm/internal/g0;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v13, Lkotlin/jvm/internal/f0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    iget-object v1, v10, Lf1/w0;->a:Lf1/b1;

    invoke-virtual {v10}, Lf1/w0;->k()Ly2/y;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_9
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf1/l;

    invoke-virtual {v1}, Lf1/b1;->a()La0/k0;

    move-result-object v14

    const-wide/16 v16, 0x0

    iget-wide v4, v6, Lf1/l;->a:J

    invoke-virtual {v14, v4, v5}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/u;

    if-eqz v4, :cond_9

    iget-object v5, v4, Lf1/u;->a:Lf1/t;

    iget v5, v5, Lf1/t;->b:I

    iget-object v4, v4, Lf1/u;->b:Lf1/t;

    iget v4, v4, Lf1/t;->b:I

    if-eq v5, v4, :cond_9

    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    move-result v3

    goto :goto_5

    :cond_a
    const-wide/16 v16, 0x0

    move v3, v7

    :goto_5
    if-eq v3, v7, :cond_d

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v8

    :goto_6
    if-ge v5, v4, :cond_d

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf1/l;

    invoke-virtual {v1}, Lf1/b1;->a()La0/k0;

    move-result-object v7

    iget-wide v14, v6, Lf1/l;->a:J

    invoke-virtual {v7, v14, v15}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf1/u;

    if-eqz v7, :cond_c

    invoke-virtual {v6}, Lf1/l;->e()Ll3/g;

    move-result-object v1

    iget-object v2, v7, Lf1/u;->a:Lf1/t;

    iget v2, v2, Lf1/t;->b:I

    iget-object v4, v7, Lf1/u;->b:Lf1/t;

    iget v4, v4, Lf1/t;->b:I

    invoke-static {v2, v4}, Lj93/l0;->f(II)J

    move-result-wide v14

    if-lt v5, v3, :cond_b

    goto :goto_7

    :cond_b
    move v9, v8

    :goto_7
    iget-wide v2, v6, Lf1/l;->a:J

    if-eqz v9, :cond_d

    iput-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v1, Ll3/u0;

    invoke-direct {v1, v14, v15}, Ll3/u0;-><init>(J)V

    iput-object v1, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-wide v2, v13, Lkotlin/jvm/internal/f0;->w:J

    goto :goto_8

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_d
    :goto_8
    iget-object v1, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v1, :cond_e

    iget-object v2, v12, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v2, :cond_e

    iget-wide v2, v13, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v2, v2, v16

    if-eqz v2, :cond_e

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_e

    iget-object v1, v10, Lf1/w0;->v:Lbc3/c0;

    if-eqz v1, :cond_e

    new-instance v9, Lb2/y;

    const/4 v14, 0x0

    const/4 v15, 0x5

    invoke-direct/range {v9 .. v15}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v1, v3, v3, v9, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_e
    iput-boolean v8, v10, Lf1/w0;->u:Z

    return-object v19

    :pswitch_3
    const/4 v3, 0x0

    const-wide/16 v16, 0x0

    iget-object v1, v10, Lf1/w0;->a:Lf1/b1;

    iget-object v2, v10, Lf1/w0;->m:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    invoke-virtual {v10}, Lf1/w0;->g()Lf1/u;

    move-result-object v2

    if-nez v2, :cond_f

    goto/16 :goto_13

    :cond_f
    iget-object v2, v10, Lf1/w0;->l:Ly2/y;

    if-nez v2, :cond_10

    goto/16 :goto_13

    :cond_10
    invoke-interface {v2}, Ly2/y;->g()Z

    move-result v4

    if-nez v4, :cond_11

    goto/16 :goto_13

    :cond_11
    invoke-virtual {v10}, Lf1/w0;->k()Ly2/y;

    move-result-object v4

    invoke-virtual {v1, v4}, Lf1/b1;->e(Ly2/y;)Ljava/util/ArrayList;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    move v7, v8

    :goto_9
    if-ge v7, v6, :cond_14

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf1/l;

    invoke-virtual {v1}, Lf1/b1;->a()La0/k0;

    move-result-object v11

    iget-wide v12, v10, Lf1/l;->a:J

    invoke-virtual {v11, v12, v13}, La0/k0;->e(J)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf1/u;

    if-eqz v11, :cond_12

    new-instance v12, Ll83/k;

    invoke-direct {v12, v10, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_12
    move-object v12, v3

    :goto_a
    if-eqz v12, :cond_13

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_15

    if-eq v1, v9, :cond_15

    invoke-static {v5}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    filled-new-array {v1, v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :cond_15
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_16

    goto/16 :goto_13

    :cond_16
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v1

    sget-object v4, Lf1/y0;->a:Lh2/c;

    if-eqz v1, :cond_17

    move-object v0, v4

    move-object v6, v0

    goto/16 :goto_12

    :cond_17
    move-object v1, v5

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v10, v8

    const/high16 v11, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v12, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v13, -0x800000    # Float.NEGATIVE_INFINITY

    const/high16 v14, -0x800000    # Float.NEGATIVE_INFINITY

    :goto_b
    if-ge v10, v1, :cond_1e

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll83/k;

    iget-object v3, v15, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lf1/l;

    iget-object v15, v15, Ll83/k;->x:Ljava/lang/Object;

    check-cast v15, Lf1/u;

    iget-object v6, v15, Lf1/u;->a:Lf1/t;

    iget v6, v6, Lf1/t;->b:I

    iget-object v15, v15, Lf1/u;->b:Lf1/t;

    iget v15, v15, Lf1/t;->b:I

    if-eq v6, v15, :cond_18

    invoke-virtual {v3}, Lf1/l;->d()Ly2/y;

    move-result-object v7

    if-nez v7, :cond_19

    :cond_18
    move/from16 v26, v1

    move-object v6, v4

    goto/16 :goto_11

    :cond_19
    move/from16 v20, v8

    invoke-static {v6, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-static {v6, v15}, Ljava/lang/Math;->max(II)I

    move-result v6

    sub-int/2addr v6, v9

    if-ne v8, v6, :cond_1a

    new-array v6, v9, [I

    aput v8, v6, v20

    goto :goto_c

    :cond_1a
    const/4 v15, 0x2

    new-array v15, v15, [I

    aput v8, v15, v20

    aput v6, v15, v9

    move-object v6, v15

    :goto_c
    array-length v8, v6

    move/from16 v15, v20

    const/high16 v21, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v22, 0x7f800000    # Float.POSITIVE_INFINITY

    const/high16 v23, -0x800000    # Float.NEGATIVE_INFINITY

    const/high16 v24, -0x800000    # Float.NEGATIVE_INFINITY

    :goto_d
    if-ge v15, v8, :cond_1d

    aget v9, v6, v15

    iget-object v0, v3, Lf1/l;->c:Le1/i;

    invoke-virtual {v0}, Le1/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/r0;

    sget-object v25, Lh2/c;->e:Lh2/c;

    if-nez v0, :cond_1b

    move/from16 v26, v1

    move-object/from16 v27, v3

    :goto_e
    move/from16 v3, v20

    :goto_f
    move-object/from16 v0, v25

    goto :goto_10

    :cond_1b
    move/from16 v26, v1

    iget-object v1, v0, Ll3/r0;->a:Ll3/q0;

    iget-object v1, v1, Ll3/q0;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    move-object/from16 v27, v3

    const/4 v3, 0x1

    if-ge v1, v3, :cond_1c

    goto :goto_e

    :cond_1c
    add-int/lit8 v1, v1, -0x1

    move/from16 v3, v20

    invoke-static {v9, v3, v1}, Le93/b;->n(III)I

    move-result v1

    invoke-virtual {v0, v1}, Ll3/r0;->b(I)Lh2/c;

    move-result-object v25

    goto :goto_f

    :goto_10
    iget v1, v0, Lh2/c;->a:F

    move/from16 v9, v21

    invoke-static {v9, v1}, Ljava/lang/Math;->min(FF)F

    move-result v21

    iget v1, v0, Lh2/c;->b:F

    move/from16 v9, v22

    invoke-static {v9, v1}, Ljava/lang/Math;->min(FF)F

    move-result v22

    iget v1, v0, Lh2/c;->c:F

    move/from16 v9, v23

    invoke-static {v9, v1}, Ljava/lang/Math;->max(FF)F

    move-result v23

    iget v0, v0, Lh2/c;->d:F

    move/from16 v1, v24

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v24

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    move/from16 v20, v3

    move/from16 v1, v26

    move-object/from16 v3, v27

    const/4 v9, 0x1

    goto :goto_d

    :cond_1d
    move/from16 v26, v1

    move/from16 v3, v20

    move/from16 v9, v21

    move/from16 v1, v24

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v8, v0

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    move-object v6, v4

    int-to-long v3, v0

    const/16 v0, 0x20

    shl-long/2addr v8, v0

    const-wide v21, 0xffffffffL

    and-long v3, v3, v21

    or-long/2addr v3, v8

    invoke-static/range {v23 .. v23}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move v15, v0

    int-to-long v0, v1

    shl-long/2addr v8, v15

    and-long v0, v0, v21

    or-long/2addr v0, v8

    invoke-interface {v2, v7, v3, v4}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v3

    invoke-interface {v2, v7, v0, v1}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    shr-long v7, v3, v15

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v11, v7}, Ljava/lang/Math;->min(FF)F

    move-result v11

    and-long v3, v3, v21

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v12, v3}, Ljava/lang/Math;->min(FF)F

    move-result v12

    shr-long v3, v0, v15

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v13, v3}, Ljava/lang/Math;->max(FF)F

    move-result v13

    and-long v0, v0, v21

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v14, v0}, Ljava/lang/Math;->max(FF)F

    move-result v14

    :goto_11
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v4, v6

    move/from16 v1, v26

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    goto/16 :goto_b

    :cond_1e
    move-object v6, v4

    new-instance v0, Lh2/c;

    invoke-direct {v0, v11, v12, v13, v14}, Lh2/c;-><init>(FFFF)V

    :goto_12
    invoke-virtual {v0, v6}, Lh2/c;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_13

    :cond_1f
    invoke-static {v2}, Lf1/y0;->z(Ly2/y;)Lh2/c;

    move-result-object v1

    invoke-virtual {v1, v0}, Lh2/c;->h(Lh2/c;)Lh2/c;

    move-result-object v0

    iget v1, v0, Lh2/c;->c:F

    iget v3, v0, Lh2/c;->a:F

    sub-float/2addr v1, v3

    const/4 v3, 0x0

    cmpg-float v1, v1, v3

    if-ltz v1, :cond_21

    iget v1, v0, Lh2/c;->d:F

    iget v4, v0, Lh2/c;->b:F

    sub-float/2addr v1, v4

    cmpg-float v1, v1, v3

    if-gez v1, :cond_20

    goto :goto_13

    :cond_20
    move-wide/from16 v4, v16

    invoke-interface {v2, v4, v5}, Ly2/y;->Z(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lh2/c;->l(J)Lh2/c;

    move-result-object v0

    iget v1, v0, Lh2/c;->d:F

    sget v2, Lf1/p0;->b:F

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    add-float/2addr v2, v1

    const/4 v1, 0x7

    invoke-static {v0, v3, v3, v2, v1}, Lh2/c;->b(Lh2/c;FFFI)Lh2/c;

    move-result-object v6

    goto :goto_14

    :cond_21
    :goto_13
    const/4 v6, 0x0

    :goto_14
    return-object v6

    :pswitch_4
    move-object/from16 v19, v7

    invoke-virtual {v10}, Lf1/w0;->j()V

    return-object v19

    :pswitch_5
    iget-object v0, v10, Lf1/w0;->q:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    if-eqz v0, :cond_22

    iget-wide v2, v0, Lh2/b;->a:J

    :cond_22
    new-instance v0, Lh2/b;

    invoke-direct {v0, v2, v3}, Lh2/b;-><init>(J)V

    return-object v0

    :pswitch_6
    iget-object v0, v10, Lf1/w0;->p:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/b;

    if-eqz v0, :cond_23

    iget-wide v2, v0, Lh2/b;->a:J

    :cond_23
    new-instance v0, Lh2/b;

    invoke-direct {v0, v2, v3}, Lh2/b;-><init>(J)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
