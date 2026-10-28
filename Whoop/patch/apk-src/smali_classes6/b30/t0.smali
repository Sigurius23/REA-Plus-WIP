.class public final synthetic Lb30/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb30/t0;->w:I

    iput-object p1, p0, Lb30/t0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    move-object/from16 v0, p0

    iget v1, v0, Lb30/t0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    sget-object v3, Lh20/q4;->a:Lh20/q4;

    const-string v4, "displayableSavedPaymentMethod"

    const/4 v6, 0x2

    iget-object v7, v0, Lb30/t0;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v10, v7

    check-cast v10, Ljava/util/List;

    move-object/from16 v11, p1

    check-cast v11, Landroidx/compose/foundation/lazy/a;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move-object/from16 v13, p3

    check-cast v13, Lf31/a;

    move-object/from16 v14, p4

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p5

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    invoke-static/range {v10 .. v15}, Lzc1/p6;->c(Ljava/util/List;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v7, Lu10/u;

    move-object/from16 v1, p1

    check-cast v1, Lh20/l;

    move-object/from16 v5, p2

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v5, p3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v6, p4

    check-cast v6, Lc93/m;

    move-object/from16 v8, p5

    check-cast v8, Lc93/m;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "<unused var>"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lh20/l;->c:Lh20/r4;

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, v7, Lu10/u;->e:Lk83/a;

    invoke-interface {v3}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu10/q;

    new-instance v4, Lu10/m;

    new-instance v5, Lu10/o;

    iget-object v6, v7, Lu10/u;->j:Lv03/b;

    invoke-virtual {v6}, Lv03/b;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu10/d;

    invoke-virtual {v6, v1}, Lu10/d;->a(Lh20/l;)Lb30/y0;

    move-result-object v1

    invoke-direct {v5, v1}, Lu10/o;-><init>(Lb30/y0;)V

    invoke-direct {v4, v5}, Lu10/m;-><init>(Lu10/o;)V

    invoke-virtual {v3, v4}, Lu10/q;->a(Lu10/j;)V

    :cond_0
    return-object v2

    :pswitch_1
    check-cast v7, Le30/c;

    iget-object v1, v7, Le30/c;->L:Lec3/h2;

    move-object/from16 v13, p1

    check-cast v13, Lh20/l;

    move-object/from16 v6, p2

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    move-object/from16 v6, p3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v10, p4

    check-cast v10, Lc93/m;

    move-object/from16 v11, p5

    check-cast v11, Lc93/m;

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "performRemove"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "updatePaymentMethodExecutor"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "setDefaultPaymentMethodExecutor"

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v13, Lh20/l;->c:Lh20/r4;

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, v7, Le30/c;->w:Lh20/x1;

    iget-object v4, v7, Le30/c;->Z:Lh20/f;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v14

    if-eqz v14, :cond_5

    check-cast v14, Lv00/c0;

    iget-object v14, v14, Lv00/c0;->w:Ly00/c8;

    invoke-interface {v14}, Ly00/c8;->q0()Z

    move-result v14

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv00/c0;

    iget-object v15, v7, Le30/c;->M:Lr20/d;

    const/16 v16, 0x0

    new-instance v8, Lr20/p;

    iget-object v5, v4, Lh20/f;->g:Ln53/e;

    iget-object v5, v5, Ln53/e;->y:Ll83/e;

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    move-object/from16 v23, v11

    move v11, v14

    new-instance v14, Lv00/j0;

    iget-object v9, v3, Lh20/x1;->P:Lh20/t1;

    invoke-direct {v14, v9}, Lv00/j0;-><init>(Lh20/t1;)V

    iget-object v3, v3, Lh20/x1;->J:Lh20/l1;

    move-object v9, v15

    iget-object v15, v3, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v3}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v3

    if-eqz v1, :cond_2

    iget-object v0, v1, Lv00/c0;->P:Lv00/p;

    if-eqz v0, :cond_2

    iget-boolean v0, v0, Lv00/p;->z:Z

    move-object/from16 v26, v2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const/16 v20, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    move/from16 v20, v16

    goto :goto_1

    :cond_2
    move-object/from16 v26, v2

    goto :goto_0

    :goto_1
    iget-object v0, v4, Lh20/f;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La30/a;

    if-eqz v0, :cond_3

    iget-object v0, v0, La30/a;->x:Ljava/lang/String;

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iget-object v2, v13, Lh20/l;->b:Ly00/o4;

    iget-object v2, v2, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    if-eqz v1, :cond_4

    iget-object v0, v1, Lv00/c0;->P:Lv00/p;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lv00/p;->E:Lv00/o;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lv00/o;->w:Lmy/b;

    if-eqz v0, :cond_4

    iget-object v1, v1, Lv00/c0;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lmy/b;->a(Ljava/lang/String;)Lzy/b;

    move-result-object v0

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    new-instance v27, Lb30/i0;

    iget-object v1, v7, Le30/c;->M:Lr20/d;

    const/16 v33, 0x0

    const/16 v34, 0xd

    const/16 v28, 0x0

    const-class v30, Lr20/d;

    const-string v31, "pop"

    const-string v32, "pop()V"

    move-object/from16 v29, v1

    invoke-direct/range {v27 .. v34}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v1, Lb30/y0;

    new-instance v2, Lh00/v;

    move-object/from16 v18, v0

    const/4 v0, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v0, v6, v4}, Lh00/v;-><init>(ILkotlin/jvm/functions/Function1;Lq83/d;)V

    new-instance v0, Lg1/x;

    invoke-direct {v0, v10, v4}, Lg1/x;-><init>(Lc93/m;Lq83/d;)V

    new-instance v4, Ld30/f;

    const/4 v6, 0x7

    invoke-direct {v4, v7, v6}, Ld30/f;-><init>(Le30/c;I)V

    move-object/from16 v22, v0

    move-object v10, v1

    move-object/from16 v21, v2

    move-object/from16 v16, v3

    move-object/from16 v24, v4

    move/from16 v17, v5

    move-object/from16 v25, v27

    invoke-direct/range {v10 .. v25}, Lb30/y0;-><init>(ZZLh20/l;Lux/a;Lh20/j1;Ljava/util/Set;ZLzy/b;ZZLc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    invoke-direct {v8, v10}, Lr20/p;-><init>(Lb30/y0;)V

    invoke-virtual {v9, v8}, Lr20/d;->e(Lr20/s;)V

    goto :goto_4

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object/from16 v26, v2

    :goto_4
    return-object v26

    :pswitch_2
    const/4 v4, 0x0

    const/16 v16, 0x0

    check-cast v7, Lh20/w0;

    iget-object v0, v7, Lh20/w0;->l0:Ll83/p;

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    move-object/from16 v20, p2

    check-cast v20, Ljava/lang/String;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v23

    move-object/from16 v2, p4

    check-cast v2, Lq20/y;

    move-object/from16 v3, p5

    check-cast v3, Lwz/d;

    const-string v5, "linkAccountInfo"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v7, Lh20/w0;->c0:Lh20/f0;

    iget-object v5, v5, Lh20/f0;->w:La30/f1;

    iget-object v5, v5, La30/f1;->E:Lv00/c0;

    iget-object v8, v5, Lv00/c0;->l0:La30/l0;

    if-eqz v8, :cond_7

    iget-object v8, v8, La30/l0;->w:Lwz/g0;

    goto :goto_5

    :cond_7
    move-object v8, v4

    :goto_5
    instance-of v9, v2, Lq20/m;

    if-eqz v9, :cond_8

    check-cast v2, Lq20/m;

    iget-object v2, v2, Lq20/m;->y:Lwz/u0;

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move/from16 v2, v16

    :goto_6
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sget-object v9, Lv00/s0;->z:Lv00/s0;

    invoke-interface {v1, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, 0x1

    goto :goto_7

    :cond_9
    move/from16 v1, v16

    :goto_7
    iget-boolean v9, v5, Lv00/c0;->Q:Z

    if-eqz v9, :cond_a

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget-object v9, Lv00/s0;->y:Lv00/s0;

    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v21, 0x1

    goto :goto_8

    :cond_a
    move/from16 v21, v16

    :goto_8
    invoke-virtual {v5}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v24

    sget-object v22, Lq20/a;->F:Lq20/a;

    iget-object v0, v5, Lv00/c0;->w:Ly00/c8;

    instance-of v0, v0, Ly00/g6;

    invoke-virtual {v5}, Lv00/c0;->S()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-ne v9, v10, :cond_b

    iget-object v9, v7, Le30/c;->Z:Lh20/f;

    iget-object v9, v9, Lh20/f;->c:Ln53/e;

    iget-object v9, v9, Ln53/e;->y:Ll83/e;

    check-cast v9, Lc93/a;

    invoke-interface {v9}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_b

    sget-object v9, Lv00/s0;->G:Lt83/b;

    :goto_9
    move-object/from16 v29, v9

    goto :goto_a

    :cond_b
    sget-object v9, Lv00/s0;->z:Lv00/s0;

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    goto :goto_9

    :goto_a
    iget-object v3, v3, Lwz/d;->w:Ld00/l;

    if-eqz v3, :cond_c

    iget-object v3, v3, Ld00/l;->y:Lcom/stripe/android/model/DisplayablePaymentDetails;

    move-object/from16 v30, v3

    goto :goto_b

    :cond_c
    move-object/from16 v30, v4

    :goto_b
    if-eqz v8, :cond_d

    iget-boolean v3, v8, Lwz/g0;->Z:Z

    const/4 v10, 0x1

    if-ne v3, v10, :cond_d

    if-nez v2, :cond_d

    const/16 v31, 0x1

    goto :goto_c

    :cond_d
    move/from16 v31, v16

    :goto_c
    iget-object v2, v5, Lv00/c0;->Y:Lux/b;

    iget-object v3, v5, Lv00/c0;->X:Lux/a;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v19

    new-instance v1, Lh20/u0;

    const/4 v10, 0x1

    invoke-direct {v1, v7, v10}, Lh20/u0;-><init>(Lh20/w0;I)V

    new-instance v4, Lh20/u0;

    invoke-direct {v4, v7, v6}, Lh20/u0;-><init>(Lh20/w0;I)V

    const/16 v34, 0x2000

    const/16 v25, 0x0

    move/from16 v28, v0

    move-object/from16 v26, v1

    move-object/from16 v32, v2

    move-object/from16 v33, v3

    move-object/from16 v27, v4

    invoke-static/range {v19 .. v34}, Lu00/e;->p(Ljava/lang/Boolean;Ljava/lang/String;ZLq20/a;ZLjava/util/List;Lsz/c0;Lc93/a;Lc93/a;ZLjava/util/List;Lcom/stripe/android/model/DisplayablePaymentDetails;ZLux/b;Lux/a;I)La30/n1;

    move-result-object v0

    return-object v0

    :pswitch_3
    const/4 v4, 0x0

    const/16 v16, 0x0

    check-cast v7, Lg40/f;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p3

    check-cast v2, Ll83/a0;

    move-object/from16 v2, p4

    check-cast v2, Ll83/a0;

    move-object/from16 v2, p5

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v3, "otherFields"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v7, Lg40/f;->c:Lg40/m;

    iget-boolean v5, v7, Lg40/f;->e:Z

    iget-boolean v8, v7, Lg40/f;->f:Z

    iget-object v9, v7, Lg40/f;->d:Lg40/i0;

    iget-object v10, v7, Lg40/f;->j:Lg40/c3;

    invoke-virtual {v3}, Lg40/m;->s()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v11

    sget-object v12, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-ne v11, v12, :cond_e

    const/4 v11, 0x1

    goto :goto_d

    :cond_e
    move/from16 v11, v16

    :goto_d
    if-nez v11, :cond_f

    move-object v13, v10

    goto :goto_e

    :cond_f
    move-object v13, v4

    :goto_e
    if-nez v8, :cond_10

    move-object v14, v9

    goto :goto_f

    :cond_10
    move-object v14, v4

    :goto_f
    iget-object v15, v7, Lg40/f;->k:Lx30/i;

    const/4 v4, 0x3

    new-array v4, v4, [Lg40/b3;

    aput-object v13, v4, v16

    const/16 v18, 0x1

    aput-object v14, v4, v18

    aput-object v15, v4, v6

    invoke-static {v4}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    if-nez v11, :cond_11

    move-object v13, v10

    goto :goto_10

    :cond_11
    const/4 v13, 0x0

    :goto_10
    if-nez v8, :cond_12

    move-object v14, v9

    goto :goto_11

    :cond_12
    const/4 v14, 0x0

    :goto_11
    new-array v15, v6, [Lg40/b3;

    aput-object v13, v15, v16

    aput-object v14, v15, v18

    invoke-static {v15}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v13, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v13

    instance-of v14, v3, Lg40/j;

    if-eqz v14, :cond_13

    move-object v1, v3

    check-cast v1, Lg40/j;

    invoke-static {v1, v0, v5}, Lkotlin/jvm/internal/j;->Q(Le40/c;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_14

    :goto_12
    const/16 v18, 0x1

    goto :goto_15

    :cond_13
    instance-of v4, v3, Lg40/k;

    if-eqz v4, :cond_15

    :cond_14
    move-object v4, v13

    goto :goto_12

    :cond_15
    if-nez v11, :cond_16

    goto :goto_13

    :cond_16
    const/4 v10, 0x0

    :goto_13
    if-nez v8, :cond_17

    goto :goto_14

    :cond_17
    const/4 v9, 0x0

    :goto_14
    new-array v4, v6, [Lg40/b3;

    aput-object v10, v4, v16

    const/16 v18, 0x1

    aput-object v9, v4, v18

    invoke-static {v4}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    :goto_15
    if-eqz v14, :cond_18

    move-object v1, v3

    check-cast v1, Lg40/j;

    invoke-static {v1, v0, v5}, Lkotlin/jvm/internal/j;->Q(Le40/c;Ljava/lang/String;Z)Z

    move-result v9

    goto :goto_16

    :cond_18
    instance-of v0, v3, Lg40/k;

    if-eqz v0, :cond_19

    move/from16 v9, v18

    goto :goto_16

    :cond_19
    move/from16 v9, v16

    :goto_16
    invoke-virtual {v3}, Lg40/m;->k()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v0

    if-eq v0, v12, :cond_1a

    iget-object v0, v7, Lg40/f;->i:Lg40/a1;

    goto :goto_17

    :cond_1a
    const/4 v0, 0x0

    :goto_17
    invoke-virtual {v3}, Lg40/m;->x()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v1

    if-eq v1, v12, :cond_1b

    iget-object v5, v7, Lg40/f;->l:Lg40/a2;

    goto :goto_18

    :cond_1b
    const/4 v5, 0x0

    :goto_18
    if-eqz v9, :cond_1e

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    if-eqz v0, :cond_1c

    invoke-virtual {v1, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1c
    if-eqz v5, :cond_1d

    invoke-virtual {v1, v5}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1d
    invoke-virtual {v1, v4}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    :goto_19
    move/from16 v1, v16

    goto :goto_1a

    :cond_1e
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    invoke-virtual {v1, v4}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    if-eqz v0, :cond_1f

    invoke-virtual {v1, v0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1f
    if-eqz v5, :cond_20

    invoke-virtual {v1, v5}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_20
    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    goto :goto_19

    :goto_1a
    invoke-virtual {v0, v1}, Ln83/c;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :goto_1b
    move-object v3, v1

    check-cast v3, Ln83/b;

    invoke-virtual {v3}, Ln83/b;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-virtual {v3}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg40/y2;

    invoke-interface {v3, v2}, Lg40/y2;->b(Z)V

    goto :goto_1b

    :cond_21
    return-object v0

    :pswitch_4
    const/4 v1, 0x0

    const/16 v18, 0x1

    check-cast v7, Lb30/y0;

    move-object/from16 v0, p1

    check-cast v0, Lzy/c;

    move-object/from16 v2, p2

    check-cast v2, Lb30/d6;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object/from16 v4, p4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object/from16 v5, p5

    check-cast v5, Lh20/a;

    const-string v6, "status"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v4, :cond_22

    if-eqz v5, :cond_23

    :cond_22
    sget-object v4, Lb30/d6;->x:Lb30/d6;

    if-ne v2, v4, :cond_23

    move/from16 v4, v18

    goto :goto_1c

    :cond_23
    move v4, v1

    :goto_1c
    iget-boolean v5, v7, Lb30/y0;->i:Z

    if-nez v5, :cond_25

    if-eqz v3, :cond_24

    goto :goto_1d

    :cond_24
    move v8, v1

    goto :goto_1e

    :cond_25
    :goto_1d
    move/from16 v8, v18

    :goto_1e
    new-instance v1, Lb30/c6;

    invoke-direct {v1, v0, v2, v8, v4}, Lb30/c6;-><init>(Lzy/c;Lb30/d6;ZZ)V

    return-object v1

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
