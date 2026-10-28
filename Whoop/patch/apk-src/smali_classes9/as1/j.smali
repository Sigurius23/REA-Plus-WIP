.class public final synthetic Las1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Las1/j;->w:I

    iput-object p1, p0, Las1/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget v1, v0, Las1/j;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object/from16 v2, p1

    check-cast v2, Lc0/o;

    move-object/from16 v3, p2

    check-cast v3, Lti0/a;

    move-object/from16 v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lyi0/d;->g(Lkotlin/jvm/functions/Function1;Lc0/o;Lti0/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Lt20/w;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v6, v1, Lt20/w;->w:Lt20/v;

    iget-object v1, v1, Lt20/w;->F:Lh20/l1;

    iget-boolean v6, v6, Lt20/v;->a:Z

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    move v3, v8

    goto :goto_0

    :cond_1
    move v3, v7

    :goto_0
    if-nez v4, :cond_2

    iget-object v2, v1, Lh20/l1;->x:Lh20/k1;

    sget-object v4, Lh20/k1;->y:Lh20/k1;

    if-eq v2, v4, :cond_3

    :cond_2
    if-nez v5, :cond_4

    iget-object v1, v1, Lh20/l1;->z:Lh20/j1;

    sget-object v2, Lh20/j1;->y:Lh20/j1;

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    move v1, v7

    goto :goto_2

    :cond_4
    :goto_1
    move v1, v8

    :goto_2
    if-eqz v3, :cond_5

    if-eqz v1, :cond_5

    move v7, v8

    :cond_5
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Lii0/a;

    move-object/from16 v2, p1

    check-cast v2, Lc0/o;

    move-object/from16 v3, p2

    check-cast v3, Leb/q;

    move-object/from16 v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lrm2/e;->F(Lii0/a;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    move-object/from16 v2, p1

    check-cast v2, Lc0/o;

    move-object/from16 v3, p2

    check-cast v3, Leb/q;

    move-object/from16 v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lrm2/e;->L(Leb/u0;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Lp41/d;

    move-object/from16 v2, p1

    check-cast v2, Lc0/o;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lp41/c;->b(Lp41/d;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lh20/k4;

    iget-object v1, v4, Lh20/k4;->c0:Lh20/w3;

    move-object/from16 v10, p1

    check-cast v10, Ljava/lang/Boolean;

    move-object/from16 v11, p2

    check-cast v11, Ljava/lang/String;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object/from16 v13, p4

    check-cast v13, Lv00/c0;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v13, :cond_6

    iget-boolean v5, v13, Lv00/c0;->Q:Z

    if-ne v5, v3, :cond_6

    move v14, v3

    goto :goto_3

    :cond_6
    move v14, v2

    :goto_3
    const/4 v15, 0x0

    if-eqz v13, :cond_7

    invoke-virtual {v13}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v2

    goto :goto_4

    :cond_7
    move-object v2, v15

    :goto_4
    sget-object v5, Lm83/y;->w:Lm83/y;

    if-nez v2, :cond_8

    move-object/from16 v16, v5

    goto :goto_5

    :cond_8
    move-object/from16 v16, v2

    :goto_5
    iget-object v2, v1, Lh20/w3;->x:Lh20/x1;

    iget-object v6, v2, Lh20/x1;->y:Lh20/h2;

    iget-object v7, v2, Lh20/x1;->J:Lh20/l1;

    if-eqz v6, :cond_a

    iget-object v8, v6, Lh20/h2;->y:Ljava/lang/String;

    if-nez v8, :cond_b

    iget-object v8, v4, Le30/c;->L:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lv00/c0;

    if-eqz v8, :cond_9

    iget-object v8, v8, Lv00/c0;->w:Ly00/c8;

    goto :goto_6

    :cond_9
    move-object v8, v15

    :goto_6
    instance-of v8, v8, Ly00/g6;

    if-eqz v8, :cond_b

    iget-object v2, v4, Lh20/k4;->e0:Lqy/d;

    const-string v3, "GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent"

    invoke-virtual {v2, v3}, Lqy/d;->d(Ljava/lang/String;)V

    :cond_a
    move-object/from16 v17, v15

    goto :goto_c

    :cond_b
    new-instance v17, Lsz/c0;

    iget-object v8, v6, Lh20/h2;->w:Lh20/g2;

    sget-object v9, Lh20/g4;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    if-ne v8, v3, :cond_c

    sget-object v3, Lsz/g;->x:Lsz/g;

    :goto_7
    move-object/from16 v18, v3

    goto :goto_8

    :cond_c
    sget-object v3, Lsz/g;->y:Lsz/g;

    goto :goto_7

    :goto_8
    iget-object v3, v6, Lh20/h2;->x:Ljava/lang/String;

    iget-object v6, v4, Le30/c;->w:Lh20/x1;

    iget-object v6, v6, Lh20/x1;->w:Ljava/lang/String;

    invoke-virtual {v7}, Lh20/l1;->f()Z

    move-result v21

    invoke-virtual {v7}, Lh20/l1;->k()Lsz/b0;

    move-result-object v22

    iget-object v2, v2, Lh20/x1;->y:Lh20/h2;

    if-eqz v2, :cond_e

    iget-object v2, v2, Lh20/h2;->G:Ljava/util/List;

    if-nez v2, :cond_d

    goto :goto_a

    :cond_d
    move-object/from16 v23, v2

    :goto_9
    move-object/from16 v19, v3

    move-object/from16 v20, v6

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v23, v5

    goto :goto_9

    :goto_b
    invoke-direct/range {v17 .. v23}, Lsz/c0;-><init>(Lsz/g;Ljava/lang/String;Ljava/lang/String;ZLsz/b0;Ljava/util/List;)V

    :goto_c
    iget-object v1, v1, Lh20/w3;->x:Lh20/x1;

    iget-object v1, v1, Lh20/x1;->y:Lh20/h2;

    if-eqz v1, :cond_f

    iget-object v1, v1, Lh20/h2;->F:Lh20/e2;

    goto :goto_d

    :cond_f
    move-object v1, v15

    :goto_d
    invoke-static {v1}, Lkotlin/jvm/internal/j;->A(Lh20/e2;)Lq20/a;

    move-result-object v1

    new-instance v2, Lb30/i0;

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v3, 0x0

    const-class v5, Lh20/k4;

    const-string v6, "checkoutWithGooglePay"

    const-string v7, "checkoutWithGooglePay()V"

    invoke-direct/range {v2 .. v9}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move/from16 v18, v12

    move-object v12, v2

    new-instance v2, Lb30/i0;

    const/16 v9, 0xc

    const-class v5, Lh20/k4;

    const-string v6, "checkoutWithLink"

    const-string v7, "checkoutWithLink()V"

    invoke-direct/range {v2 .. v9}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    if-eqz v13, :cond_10

    iget-object v15, v13, Lv00/c0;->w:Ly00/c8;

    :cond_10
    instance-of v3, v15, Ly00/g6;

    sget-object v15, Lv00/s0;->G:Lt83/b;

    if-eqz v13, :cond_11

    iget-object v4, v13, Lv00/c0;->Y:Lux/b;

    if-nez v4, :cond_12

    :cond_11
    sget-object v4, Lux/h;->w:Lux/h;

    :cond_12
    if-eqz v13, :cond_14

    iget-object v5, v13, Lv00/c0;->X:Lux/a;

    if-nez v5, :cond_13

    goto :goto_f

    :cond_13
    :goto_e
    move-object/from16 v19, v5

    move-object v6, v11

    move-object/from16 v11, v17

    goto :goto_10

    :cond_14
    :goto_f
    sget-object v5, Lux/f;->w:Lux/f;

    goto :goto_e

    :goto_10
    const/16 v17, 0x0

    const/16 v20, 0x3800

    move-object v5, v10

    move-object/from16 v10, v16

    const/16 v16, 0x0

    move-object v8, v1

    move-object v13, v2

    move v7, v14

    move/from16 v9, v18

    move v14, v3

    move-object/from16 v18, v4

    invoke-static/range {v5 .. v20}, Lu00/e;->p(Ljava/lang/Boolean;Ljava/lang/String;ZLq20/a;ZLjava/util/List;Lsz/c0;Lc93/a;Lc93/a;ZLjava/util/List;Lcom/stripe/android/model/DisplayablePaymentDetails;ZLux/b;Lux/a;I)La30/n1;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lf1/w0;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move-object/from16 v3, p2

    check-cast v3, Ly2/y;

    move-object/from16 v4, p3

    check-cast v4, Lh2/b;

    move-object/from16 v8, p4

    check-cast v8, Lf1/v;

    invoke-interface {v3}, Ly2/y;->n()J

    move-result-wide v5

    const/16 v7, 0x20

    shr-long v9, v5, v7

    long-to-int v9, v9

    int-to-float v9, v9

    const-wide v10, 0xffffffffL

    and-long/2addr v5, v10

    long-to-int v5, v5

    int-to-float v5, v5

    iget-wide v12, v4, Lh2/b;->a:J

    shr-long v14, v12, v7

    long-to-int v4, v14

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    const/4 v14, 0x0

    cmpg-float v15, v14, v6

    if-gtz v15, :cond_15

    cmpg-float v6, v6, v9

    if-gtz v6, :cond_15

    move/from16 p2, v7

    move-object/from16 p1, v8

    and-long v7, v12, v10

    long-to-int v6, v7

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpg-float v7, v14, v6

    if-gtz v7, :cond_16

    cmpg-float v6, v6, v5

    if-gtz v6, :cond_16

    goto :goto_13

    :cond_15
    move/from16 p2, v7

    move-object/from16 p1, v8

    :cond_16
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpg-float v6, v6, v14

    if-gez v6, :cond_17

    move v9, v14

    goto :goto_11

    :cond_17
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpl-float v6, v6, v9

    if-lez v6, :cond_18

    goto :goto_11

    :cond_18
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    :goto_11
    and-long v6, v12, v10

    long-to-int v4, v6

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpg-float v6, v6, v14

    if-gez v6, :cond_19

    move v5, v14

    goto :goto_12

    :cond_19
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    cmpl-float v6, v6, v5

    if-lez v6, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    :goto_12
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v6, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long v6, v6, p2

    and-long/2addr v4, v10

    or-long v12, v6, v4

    :goto_13
    invoke-virtual {v2, v3, v12, v13}, Lf1/w0;->b(Ly2/y;J)J

    move-result-wide v3

    const-wide v5, 0x7fffffff7fffffffL

    and-long/2addr v5, v3

    const-wide v7, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v5, v5, v7

    if-eqz v5, :cond_1b

    invoke-virtual {v2, v1}, Lf1/w0;->l(Z)V

    const/4 v1, 0x0

    iput-object v1, v2, Lf1/w0;->t:Lf1/q0;

    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    const/4 v7, 0x0

    move-object/from16 v8, p1

    invoke-virtual/range {v2 .. v8}, Lf1/w0;->o(JJZLf1/v;)Z

    iget-object v1, v2, Lf1/w0;->h:Lg2/s;

    invoke-static {v1}, Lg2/s;->c(Lg2/s;)V

    const/4 v1, 0x0

    iput-boolean v1, v2, Lf1/w0;->x:Z

    invoke-virtual {v2}, Lf1/w0;->p()V

    const/4 v1, 0x1

    iput-boolean v1, v2, Lf1/w0;->u:Z

    :cond_1b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_6
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, La33/d;

    move-object/from16 v2, p1

    check-cast v2, Lr20/s;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v4, p3

    check-cast v4, Lq20/y;

    move-object/from16 v5, p4

    check-cast v5, Lb30/p3;

    const-string v6, "screen"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v6, v2, Lr20/r;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v6, :cond_1c

    instance-of v6, v2, Lr20/f;

    if-nez v6, :cond_1c

    instance-of v6, v2, Lr20/g;

    if-eqz v6, :cond_1d

    :cond_1c
    if-eqz v3, :cond_1d

    move v11, v8

    goto :goto_14

    :cond_1d
    move v11, v7

    :goto_14
    if-nez v5, :cond_23

    iget-object v5, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v5, Lh20/x1;

    iget-object v5, v5, Lh20/x1;->I:Ljava/lang/String;

    if-eqz v5, :cond_1e

    invoke-static {v5}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object v5

    :goto_15
    move-object v10, v5

    goto :goto_16

    :cond_1e
    const v5, 0x7f140feb

    invoke-static {v5}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_15

    :goto_16
    iget-object v5, v1, La33/d;->y:Ljava/lang/Object;

    move-object v12, v5

    check-cast v12, Lc93/a;

    if-eqz v3, :cond_1f

    if-eqz v4, :cond_1f

    move v14, v8

    goto :goto_17

    :cond_1f
    move v14, v7

    :goto_17
    new-instance v9, Lb30/p3;

    new-instance v13, Le30/f;

    const/4 v3, 0x0

    invoke-direct {v13, v11, v1, v3}, Le30/f;-><init>(ZLa33/d;I)V

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lb30/p3;-><init>(Lzy/c;ZLc93/a;Lc93/a;ZZ)V

    if-eqz v4, :cond_20

    invoke-virtual {v4}, Lq20/y;->b()Z

    move-result v1

    if-ne v1, v8, :cond_20

    invoke-interface {v2}, Lr20/s;->s()Z

    move-result v1

    if-eqz v1, :cond_20

    move v7, v8

    :cond_20
    invoke-interface {v2}, Lr20/s;->T()Z

    move-result v1

    if-nez v1, :cond_22

    if-eqz v7, :cond_21

    goto :goto_18

    :cond_21
    const/4 v5, 0x0

    goto :goto_19

    :cond_22
    :goto_18
    move-object v5, v9

    :cond_23
    :goto_19
    return-object v5

    :pswitch_7
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Le30/d;

    move-object/from16 v2, p1

    check-cast v2, La30/a;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/Boolean;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object/from16 v5, p4

    check-cast v5, Lv00/p;

    sget-object v6, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_24

    iget-object v7, v2, La30/a;->w:Ljava/util/List;

    move-object v8, v7

    goto :goto_1a

    :cond_24
    move-object v8, v6

    :goto_1a
    const/4 v7, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_25

    iget-boolean v5, v5, Lv00/p;->z:Z

    if-ne v5, v7, :cond_25

    if-eqz v2, :cond_25

    iget-object v2, v2, La30/a;->x:Ljava/lang/String;

    move-object v13, v2

    goto :goto_1b

    :cond_25
    move-object v13, v9

    :goto_1b
    iget-boolean v2, v1, Le30/d;->f:Z

    if-nez v3, :cond_26

    goto :goto_1e

    :cond_26
    const/4 v5, 0x0

    if-eqz v4, :cond_27

    if-eqz v2, :cond_27

    move v9, v7

    goto :goto_1c

    :cond_27
    move v9, v5

    :goto_1c
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_28

    if-eqz v2, :cond_28

    move v10, v7

    goto :goto_1d

    :cond_28
    move v10, v5

    :goto_1d
    iget-object v11, v1, Le30/d;->e:Ld30/g;

    iget-object v1, v1, Le30/d;->g:Lh02/n0;

    invoke-virtual {v1}, Lh02/n0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-static/range {v8 .. v13}, Lse/b;->A(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    :goto_1e
    if-nez v9, :cond_29

    goto :goto_1f

    :cond_29
    move-object v6, v9

    :goto_1f
    return-object v6

    :pswitch_8
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Ld30/u;

    move-object/from16 v2, p1

    check-cast v2, Ljava/util/List;

    move-object/from16 v3, p2

    check-cast v3, Lh20/l;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const-string v6, "paymentMethods"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_2a

    sget-object v1, Ld30/o0;->w:Ld30/o0;

    goto :goto_21

    :cond_2a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_2e

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2b

    sget-object v1, Ld30/o0;->y:Ld30/o0;

    goto :goto_21

    :cond_2b
    invoke-virtual {v3, v5}, Lh20/l;->d(Z)Z

    move-result v1

    if-ne v1, v2, :cond_2c

    goto :goto_20

    :cond_2c
    if-eqz v4, :cond_2d

    :goto_20
    sget-object v1, Ld30/o0;->x:Ld30/o0;

    goto :goto_21

    :cond_2d
    sget-object v1, Ld30/o0;->w:Ld30/o0;

    goto :goto_21

    :cond_2e
    sget-object v1, Ld30/o0;->w:Ld30/o0;

    :goto_21
    return-object v1

    :pswitch_9
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Ld1/j;

    move-object/from16 v2, p1

    check-cast v2, Lb30/z0;

    move-object/from16 v3, p2

    check-cast v3, Le10/b0;

    move-object/from16 v4, p3

    check-cast v4, Ls00/c;

    move-object/from16 v5, p4

    check-cast v5, Lwz/d;

    const-string v6, "confirmationState"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "linkEmbeddedState"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v4, Ls00/c;->w:Ls00/g;

    const-string v4, "linkAccountInfo"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lm83/y;->w:Lm83/y;

    if-eqz v2, :cond_33

    iget-object v6, v2, Lb30/z0;->c:Lmy/a;

    iget-object v6, v6, Lmy/a;->U:Lh20/q3;

    if-eqz v6, :cond_2f

    iget-object v6, v6, Lh20/q3;->x:Lh20/n3;

    if-eqz v6, :cond_2f

    iget-object v6, v6, Lh20/n3;->x:Ljava/util/Map;

    if-nez v6, :cond_30

    :cond_2f
    sget-object v6, Lm83/z;->w:Lm83/z;

    :cond_30
    sget-object v7, Lv00/s0;->G:Lt83/b;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_31
    :goto_22
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_34

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lv00/s0;

    invoke-static {v10}, Luf/c0;->O(Lv00/s0;)Lh20/o3;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh20/p3;

    if-eqz v10, :cond_32

    sget-object v11, Lh20/p3;->w:Lh20/p3;

    if-ne v10, v11, :cond_31

    :cond_32
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_33
    move-object v8, v4

    :cond_34
    if-eqz v2, :cond_45

    iget-object v7, v2, Lb30/z0;->c:Lmy/a;

    iget-object v9, v2, Lb30/z0;->b:Lv00/c0;

    iget-object v10, v9, Lv00/c0;->F:Ljava/util/List;

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_35
    :goto_23
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_45

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lv00/s0;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_41

    const/4 v13, 0x1

    if-eq v12, v13, :cond_38

    const/4 v13, 0x2

    if-ne v12, v13, :cond_37

    sget-object v12, Lb30/p6;->a:Lb30/p6;

    sget-object v13, Lv00/s0;->E:Lv00/s0;

    invoke-interface {v8, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_36

    goto/16 :goto_2d

    :cond_36
    const/4 v12, 0x0

    goto/16 :goto_2d

    :cond_37
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_38
    iget-object v12, v9, Lv00/c0;->l0:La30/l0;

    if-eqz v12, :cond_39

    iget-object v12, v12, La30/l0;->w:Lwz/g0;

    goto :goto_24

    :cond_39
    const/4 v12, 0x0

    :goto_24
    new-instance v14, Lb30/o6;

    const/4 v15, 0x0

    if-eqz v12, :cond_3a

    iget-boolean v12, v12, Lwz/g0;->Z:Z

    if-ne v12, v13, :cond_3a

    goto :goto_25

    :cond_3a
    move v13, v15

    :goto_25
    iget-object v12, v2, Lb30/z0;->a:Ljava/lang/String;

    iget-object v15, v5, Lwz/d;->w:Ld00/l;

    if-eqz v15, :cond_3b

    iget-object v15, v15, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    goto :goto_26

    :cond_3b
    const/4 v15, 0x0

    :goto_26
    if-eqz v15, :cond_3c

    invoke-static {v15, v13}, Ls2/e;->f0(Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lq00/o;

    move-result-object v13

    goto :goto_27

    :cond_3c
    const/4 v13, 0x0

    :goto_27
    if-eqz v13, :cond_3d

    new-instance v12, Lh00/q;

    invoke-direct {v12, v13}, Lh00/q;-><init>(Lq00/o;)V

    goto :goto_28

    :cond_3d
    if-eqz v12, :cond_3e

    new-instance v13, Lh00/r;

    invoke-direct {v13, v12}, Lh00/r;-><init>(Ljava/lang/String;)V

    move-object v12, v13

    goto :goto_28

    :cond_3e
    sget-object v12, Lh00/p;->a:Lh00/p;

    :goto_28
    iget-object v13, v7, Lmy/a;->U:Lh20/q3;

    if-eqz v13, :cond_3f

    iget-object v13, v13, Lh20/q3;->y:Lh20/o1;

    if-eqz v13, :cond_3f

    iget-object v13, v13, Lh20/o1;->w:Lh20/n1;

    if-nez v13, :cond_40

    :cond_3f
    sget-object v13, Lh20/n1;->w:Lh20/n1;

    :cond_40
    invoke-direct {v14, v12, v13}, Lb30/o6;-><init>(Lse/h;Lh20/n1;)V

    instance-of v12, v3, Ls00/f;

    if-eqz v12, :cond_36

    sget-object v12, Lv00/s0;->z:Lv00/s0;

    invoke-interface {v8, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_36

    move-object v12, v14

    goto :goto_2d

    :cond_41
    iget-object v12, v7, Lmy/a;->y:Lh20/h2;

    if-eqz v12, :cond_42

    iget-object v12, v12, Lh20/h2;->F:Lh20/e2;

    move-object v14, v12

    goto :goto_29

    :cond_42
    const/4 v14, 0x0

    :goto_29
    new-instance v12, Lv00/j0;

    iget-object v13, v7, Lmy/a;->N:Lh20/t1;

    invoke-direct {v12, v13}, Lv00/j0;-><init>(Lh20/t1;)V

    iget-object v13, v9, Lv00/c0;->Y:Lux/b;

    iget-object v15, v7, Lmy/a;->I:Lh20/l1;

    iget-object v6, v7, Lmy/a;->y:Lh20/h2;

    if-eqz v6, :cond_43

    iget-object v6, v6, Lh20/h2;->G:Ljava/util/List;

    goto :goto_2a

    :cond_43
    const/4 v6, 0x0

    :goto_2a
    if-nez v6, :cond_44

    move-object/from16 v18, v4

    :goto_2b
    move-object/from16 v17, v13

    goto :goto_2c

    :cond_44
    move-object/from16 v18, v6

    goto :goto_2b

    :goto_2c
    new-instance v13, Lb30/n6;

    move-object/from16 v16, v12

    invoke-direct/range {v13 .. v18}, Lb30/n6;-><init>(Lh20/e2;Lh20/l1;Lv00/j0;Lux/b;Ljava/util/List;)V

    sget-object v6, Lv00/s0;->y:Lv00/s0;

    invoke-interface {v8, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_36

    move-object v12, v13

    :goto_2d
    if-eqz v12, :cond_35

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_23

    :cond_45
    if-eqz v2, :cond_47

    instance-of v2, v3, Ls00/e;

    if-eqz v2, :cond_46

    move-object v6, v3

    check-cast v6, Ls00/e;

    goto :goto_2e

    :cond_46
    const/4 v6, 0x0

    :goto_2e
    if-eqz v6, :cond_47

    iget-object v2, v6, Ls00/e;->w:Lp00/q;

    if-eqz v2, :cond_47

    iget-object v1, v1, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ls00/b;

    check-cast v1, Ls00/a;

    iget-object v1, v1, Ls00/a;->d:Lg40/o1;

    const-string v2, "otpElement"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lv00/s0;->z:Lv00/s0;

    invoke-interface {v8, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    :cond_47
    new-instance v1, Lb30/f4;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1

    :pswitch_a
    iget-object v1, v0, Las1/j;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Long;

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, p3

    check-cast v4, Lyr1/b;

    move-object/from16 v5, p4

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->D(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Ljava/lang/Long;Ljava/lang/String;Lyr1/b;Z)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
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
