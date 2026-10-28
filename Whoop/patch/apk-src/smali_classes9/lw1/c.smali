.class public abstract Llw1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;",
        "details",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;",
        "item",
        "h",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;",
        "f",
        "(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V",
        "membership_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Llw1/c;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llw1/c;->g(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llw1/c;->i(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    const-string v0, "details"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, 0x7504651d

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v13, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_10

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v4

    goto :goto_4

    :cond_6
    move-object v0, v3

    :goto_4
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v13, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    :cond_8
    invoke-static {v5, v13, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v3, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v18, v3, v5

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v14, v4

    move-object v4, v3

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getTitle()Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->q()Lb91/a;

    move-result-object v11

    invoke-virtual {v9, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->q()Lb91/a;

    move-result-object v12

    invoke-virtual {v12}, Lb91/a;->d()Ll3/v0;

    move-result-object v19

    const/16 v32, 0x0

    const v33, 0xff7fff

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x3

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v19 .. v33}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v12

    const/4 v15, 0x0

    invoke-static {v11, v12, v15, v1, v15}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v23

    invoke-virtual {v9, v13, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v9

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v27, v1, 0x12

    const v28, 0x2fff8

    move v1, v7

    move v6, v8

    const-wide/16 v7, 0x0

    move v11, v6

    move-wide/from16 v34, v9

    move v10, v5

    move-wide/from16 v5, v34

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    move-object/from16 v25, v13

    const-wide/16 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    move-object/from16 v21, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x30

    move-object/from16 v2, v29

    move-object/from16 v29, v0

    move-object v0, v2

    move v2, v1

    move/from16 v1, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v25

    const v3, -0x44d28068

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getLineItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;

    invoke-static {v4, v13, v2}, Llw1/c;->h(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_a
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v1, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x6

    const/16 v15, 0xfe

    move v11, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move/from16 v31, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move/from16 v1, v31

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getSubtotal()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;

    move-result-object v3

    if-nez v3, :cond_b

    const v3, -0x557ab2c2

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    :goto_7
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    const v4, -0x557ab2c1

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v2}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getTax()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;

    move-result-object v3

    if-nez v3, :cond_c

    const v3, -0x5579f102

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    :goto_9
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    const v4, -0x5579f101

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v2}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getDiscount()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;

    move-result-object v3

    if-nez v3, :cond_d

    const v3, -0x55791be2

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    :goto_b
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_d
    const v4, -0x55791be1

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v2}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getTrialDepositRefund()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;

    move-result-object v3

    if-nez v3, :cond_e

    const v3, -0x55782002

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    :goto_d
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_e
    const v4, -0x55782001

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v2}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;->getTotal()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;

    move-result-object v3

    if-nez v3, :cond_f

    const v3, -0x55775682

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    :goto_f
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_f
    const v4, -0x55775681

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v3, v13, v2}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    goto :goto_f

    :goto_10
    int-to-float v2, v1

    mul-float v16, v2, v32

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object v14, v0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v14, 0x6

    const/16 v15, 0xfe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_11

    :cond_10
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v3

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Llq2/c;

    const/4 v5, 0x2

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Llw1/c;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x352a50da

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    if-eq v5, v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v3, v6

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v11, v3, v5

    const/4 v12, 0x7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x6

    invoke-static {v5, v7, v2, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v2, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v2, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v2, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v2, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-nez v8, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v7, v2, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v2, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;->getLabel()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v2, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->n()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->H()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v26, v10, 0x12

    const v27, 0x2fff8

    move v11, v6

    move v10, v7

    const-wide/16 v6, 0x0

    move-object/from16 v24, v2

    move-object v2, v3

    move-object v3, v4

    move-wide/from16 v31, v8

    move-object v9, v5

    move-wide/from16 v4, v31

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move v15, v11

    move-object v14, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x30

    move/from16 v1, v28

    move-object/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;->getAmount()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->n()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    move-object v2, v4

    move-wide v4, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v15, 0x1

    invoke-virtual {v2, v15}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Llw1/b;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Llw1/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final g(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Llw1/c;->f(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x28b741ba

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v4, :cond_2

    move v4, v11

    goto :goto_2

    :cond_2
    move v4, v10

    :goto_2
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v4, v5, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->getIcon()Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/extensions/domain/models/NativeOrderIcon;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    move v6, v10

    :goto_4
    const/4 v8, 0x0

    if-ge v6, v5, :cond_7

    aget-object v9, v4, v6

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    move-object v9, v8

    :goto_5
    if-eqz v9, :cond_8

    invoke-virtual {v9}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :cond_8
    if-nez v8, :cond_9

    const v2, 0x4bd3c9ce    # 2.7759516E7f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v2, 0x4bd3c9cf    # 2.7759518E7f

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v16, v4, v5

    const/16 v17, 0x0

    const/16 v18, 0xb

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v5, 0x401e000000000000L    # 7.5

    double-to-float v5, v5

    int-to-float v3, v3

    mul-float/2addr v5, v3

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_6
    float-to-double v2, v12

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_a

    goto :goto_7

    :cond_a
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v12, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->getTitle()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->n()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->H()J

    move-result-wide v5

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v26, v8, 0x12

    const v27, 0x2fff8

    move v8, v4

    move-wide v4, v5

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v15, v11

    move v14, v12

    const-wide/16 v11, 0x0

    move-object/from16 v16, v3

    move-object v3, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x30

    move-object/from16 v0, v28

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->n()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->H()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move/from16 v29, v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;->getAmount()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->n()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Llw1/b;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Llw1/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Llw1/c;->h(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
