.class public final synthetic Ld30/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Ld30/r;->w:I

    iput-object p1, p0, Ld30/r;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld30/r;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld30/r;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    move-object/from16 v0, p0

    iget v1, v0, Ld30/r;->w:I

    const/4 v2, 0x3

    const/4 v5, 0x0

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    iget-object v7, v0, Ld30/r;->z:Ljava/lang/Object;

    iget-object v8, v0, Ld30/r;->y:Ljava/lang/Object;

    iget-object v9, v0, Ld30/r;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lny0/h;

    check-cast v7, Lgg0/c$c;

    invoke-static {v9, v8, v7}, Lig0/g;->f(Lkotlin/jvm/functions/Function1;Lny0/h;Lgg0/c$c;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v9, Lgg0/c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lny0/h;

    invoke-static {v9, v8, v7}, Lig0/f;->d(Lgg0/c;Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    check-cast v9, Ljava/lang/String;

    check-cast v8, Ljava/lang/String;

    check-cast v7, Ll83/h;

    invoke-static {v9, v8, v7}, Lid2/t;->b(Ljava/lang/String;Ljava/lang/String;Ll83/h;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v9, Li20/j1;

    check-cast v8, Lp1/c1;

    check-cast v7, Lp1/t2;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v9, Li20/j1;->M:Lec3/h2;

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8, v5, v10}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v8, Li20/b;

    if-eqz v1, :cond_0

    sget-object v10, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v10

    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll40/a;

    if-eqz v10, :cond_0

    iget-object v10, v10, Ll40/a;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v10, v5

    :goto_0
    new-instance v11, Lh20/x0;

    if-eqz v1, :cond_1

    sget-object v12, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    invoke-interface {v1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll40/a;

    if-eqz v12, :cond_1

    iget-object v12, v12, Ll40/a;->a:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v12, v5

    :goto_1
    if-eqz v1, :cond_2

    sget-object v13, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v13

    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll40/a;

    if-eqz v13, :cond_2

    iget-object v13, v13, Ll40/a;->a:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object v13, v5

    :goto_2
    if-eqz v1, :cond_3

    sget-object v14, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v14

    invoke-interface {v1, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll40/a;

    if-eqz v14, :cond_3

    iget-object v14, v14, Ll40/a;->a:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v14, v5

    :goto_3
    if-eqz v1, :cond_4

    sget-object v15, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v15

    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll40/a;

    if-eqz v15, :cond_4

    iget-object v15, v15, Ll40/a;->a:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object v15, v5

    :goto_4
    if-eqz v1, :cond_5

    sget-object v16, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll40/a;

    if-eqz v3, :cond_5

    iget-object v3, v3, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v16, v3

    goto :goto_5

    :cond_5
    move-object/from16 v16, v5

    :goto_5
    if-eqz v1, :cond_6

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll40/a;

    if-eqz v3, :cond_6

    iget-object v3, v3, Ll40/a;->a:Ljava/lang/String;

    move-object/from16 v17, v3

    goto :goto_6

    :cond_6
    move-object/from16 v17, v5

    :goto_6
    invoke-direct/range {v11 .. v17}, Lh20/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v17

    if-eqz v1, :cond_7

    sget-object v17, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v17, 0x1

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll40/a;

    if-eqz v1, :cond_8

    iget-object v1, v1, Ll40/a;->a:Ljava/lang/String;

    goto :goto_7

    :cond_7
    const/16 v17, 0x1

    :cond_8
    move-object v1, v5

    :goto_7
    invoke-direct {v8, v10, v11, v1, v7}, Li20/b;-><init>(Ljava/lang/String;Lh20/x0;Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v1, v9, Li20/j1;->J:Lec3/h2;

    if-eqz v13, :cond_1d

    iget-object v4, v9, Li20/j1;->y:Lj20/c;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li20/b;

    if-eqz v7, :cond_9

    iget-object v7, v7, Li20/b;->x:Lh20/x0;

    if-eqz v7, :cond_9

    iget-object v7, v7, Lh20/x0;->y:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object v7, v5

    :goto_8
    if-eqz v7, :cond_a

    move/from16 v7, v17

    goto :goto_9

    :cond_a
    const/4 v7, 0x0

    :goto_9
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li20/b;

    if-eqz v1, :cond_b

    iget-object v1, v1, Li20/b;->x:Lh20/x0;

    goto :goto_a

    :cond_b
    move-object v1, v5

    :goto_a
    const-string v10, ""

    if-nez v12, :cond_c

    move-object v12, v10

    :cond_c
    if-eqz v1, :cond_d

    iget-object v11, v1, Lh20/x0;->w:Ljava/lang/String;

    if-nez v11, :cond_e

    :cond_d
    move-object v11, v10

    :cond_e
    invoke-static {v12, v11}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    if-eqz v1, :cond_f

    iget-object v12, v1, Lh20/x0;->x:Ljava/lang/String;

    if-nez v12, :cond_10

    :cond_f
    move-object v12, v10

    :cond_10
    invoke-static {v13, v12}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    add-int/2addr v12, v11

    if-nez v14, :cond_11

    move-object v14, v10

    :cond_11
    if-eqz v1, :cond_12

    iget-object v11, v1, Lh20/x0;->y:Ljava/lang/String;

    if-nez v11, :cond_13

    :cond_12
    move-object v11, v10

    :cond_13
    invoke-static {v14, v11}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    add-int/2addr v11, v12

    if-nez v15, :cond_14

    move-object v15, v10

    :cond_14
    if-eqz v1, :cond_15

    iget-object v12, v1, Lh20/x0;->z:Ljava/lang/String;

    if-nez v12, :cond_16

    :cond_15
    move-object v12, v10

    :cond_16
    invoke-static {v15, v12}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    add-int/2addr v12, v11

    if-nez v16, :cond_17

    move-object v11, v10

    goto :goto_b

    :cond_17
    move-object/from16 v11, v16

    :goto_b
    if-eqz v1, :cond_18

    iget-object v14, v1, Lh20/x0;->E:Ljava/lang/String;

    if-nez v14, :cond_19

    :cond_18
    move-object v14, v10

    :cond_19
    invoke-static {v11, v14}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    add-int/2addr v11, v12

    if-nez v3, :cond_1a

    move-object v3, v10

    :cond_1a
    if-eqz v1, :cond_1c

    iget-object v1, v1, Lh20/x0;->F:Ljava/lang/String;

    if-nez v1, :cond_1b

    goto :goto_c

    :cond_1b
    move-object v10, v1

    :cond_1c
    :goto_c
    invoke-static {v3, v10}, Li20/l1;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lj20/a;

    invoke-direct {v3, v13, v7, v1}, Lj20/a;-><init>(Ljava/lang/String;ZLjava/lang/Integer;)V

    iget-object v1, v4, Lj20/c;->c:Lq83/j;

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    new-instance v7, Landroidx/room/e;

    const/16 v10, 0x10

    invoke-direct {v7, v4, v3, v5, v10}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v5, v5, v7, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1d
    iget-object v1, v9, Li20/j1;->x:Li20/k1;

    new-instance v2, Li20/u;

    invoke-direct {v2, v8}, Li20/u;-><init>(Li20/b;)V

    iget-object v1, v1, Li20/k1;->b:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_1e

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    return-object v6

    :pswitch_3
    check-cast v9, Lbc3/c0;

    check-cast v8, Lh40/k;

    check-cast v7, Lcom/stripe/android/shoppay/ShopPayActivity;

    sget v1, Lcom/stripe/android/shoppay/ShopPayActivity;->E:I

    new-instance v1, Lh20/i0;

    const/4 v3, 0x6

    invoke-direct {v1, v8, v7, v5, v3}, Lh20/i0;-><init>(Lh40/k;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v9, v5, v5, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v6

    :pswitch_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lh02/l0;

    check-cast v7, Lh02/i0;

    invoke-static {v9, v8, v7}, Lh02/h0;->j(Lkotlin/jvm/functions/Function1;Lh02/l0;Lh02/i0;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lh02/l;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Lh02/n;->a(Lkotlin/jvm/functions/Function1;Lh02/l;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lny0/h;

    check-cast v7, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    invoke-static {v9, v8, v7}, Lh02/j;->g(Lkotlin/jvm/functions/Function1;Lny0/h;Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v9, Lbc3/c0;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    new-instance v1, Ld30/o;

    const/16 v3, 0x1c

    invoke-direct {v1, v8, v7, v5, v3}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v9, v5, v5, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v6

    :pswitch_8
    const/16 v17, 0x1

    check-cast v9, Lh0/w;

    check-cast v8, Lh0/d4;

    check-cast v7, Lh0/s;

    iget-object v1, v9, Lh0/w;->S:Lad3/z;

    :goto_d
    iget-object v2, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v2, Lr1/c;

    iget v3, v2, Lr1/c;->y:I

    if-eqz v3, :cond_21

    if-eqz v3, :cond_20

    add-int/lit8 v3, v3, -0x1

    iget-object v2, v2, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v2, v2, v3

    check-cast v2, Lh0/v;

    iget-object v2, v2, Lh0/v;->a:Lr0/e;

    invoke-virtual {v2}, Lr0/e;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/c;

    if-nez v2, :cond_1f

    move/from16 v2, v17

    goto :goto_e

    :cond_1f
    iget-wide v3, v9, Lh0/w;->W:J

    invoke-virtual {v9, v2, v3, v4}, Lh0/w;->Z0(Lh2/c;J)Z

    move-result v2

    :goto_e
    if-eqz v2, :cond_21

    iget-object v2, v1, Lad3/z;->x:Ljava/lang/Object;

    check-cast v2, Lr1/c;

    iget v3, v2, Lr1/c;->y:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh0/v;

    iget-object v2, v2, Lh0/v;->b:Lbc3/m;

    invoke-virtual {v2, v6}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_d

    :cond_20
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "MutableVector is empty."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    iget-boolean v1, v9, Lh0/w;->U:Z

    if-eqz v1, :cond_23

    invoke-virtual {v9}, Lh0/w;->Y0()Lh2/c;

    move-result-object v1

    if-eqz v1, :cond_22

    iget-wide v2, v9, Lh0/w;->W:J

    invoke-virtual {v9, v1, v2, v3}, Lh0/w;->Z0(Lh2/c;J)Z

    move-result v1

    move/from16 v2, v17

    if-ne v1, v2, :cond_22

    const/4 v4, 0x1

    goto :goto_f

    :cond_22
    const/4 v4, 0x0

    :goto_f
    if-eqz v4, :cond_23

    const/4 v1, 0x0

    iput-boolean v1, v9, Lh0/w;->U:Z

    :cond_23
    invoke-static {v9, v7}, Lh0/w;->X0(Lh0/w;Lh0/s;)F

    move-result v1

    iput v1, v8, Lh0/d4;->e:F

    return-object v6

    :pswitch_9
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lft1/c$g;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8, v7}, Lgt1/b;->c(Lkotlin/jvm/functions/Function1;Lft1/c$g;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_a
    check-cast v9, Lep2/c$d;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Ljava/lang/String;

    invoke-static {v9, v8, v7}, Lgp2/e;->h(Lep2/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_b
    check-cast v9, Lh20/r3;

    check-cast v8, Lh20/u2;

    check-cast v7, Lh20/x1;

    invoke-static {v9, v8, v7}, Lg32/o;->b(Lh20/r3;Lh20/u2;Lh20/x1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_c
    check-cast v9, Le32/e;

    check-cast v8, Lg32/m;

    check-cast v7, Lc93/a;

    invoke-static {v9, v8, v7}, Lg32/k;->m(Le32/e;Lg32/m;Lc93/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lfy2/b$b;

    check-cast v7, Lfy2/d;

    invoke-static {v9, v8, v7}, Lfy2/a;->c(Lkotlin/jvm/functions/Function1;Lfy2/b$b;Lfy2/d;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_e
    check-cast v9, Lc93/a;

    check-cast v8, Landroid/content/Context;

    check-cast v7, Ljava/lang/String;

    invoke-static {v9, v8, v7}, Lfg2/f;->c(Lc93/a;Landroid/content/Context;Ljava/lang/String;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_f
    check-cast v9, Ltr2/n;

    check-cast v8, Lec2/c;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Lfc2/b;->d(Ltr2/n;Lec2/c;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lda0/d$a;

    invoke-static {v9, v8, v7}, Lfa0/c;->b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lda0/d$a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_11
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lg2/i;

    check-cast v7, Lc93/a;

    invoke-static {v9, v8, v7}, Lev2/u;->F(Lkotlin/jvm/functions/Function1;Lg2/i;Lc93/a;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcp1/r;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Lep1/w;->c(Lkotlin/jvm/functions/Function1;Lcp1/r;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_13
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcp1/h;

    check-cast v7, Lz1/p;

    invoke-static {v9, v8, v7}, Lep1/i;->e(Lkotlin/jvm/functions/Function1;Lcp1/h;Lz1/p;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_14
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lcp1/g;

    check-cast v7, Lz1/p;

    invoke-static {v9, v8, v7}, Lep1/h;->j(Lkotlin/jvm/functions/Function1;Lcp1/g;Lz1/p;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_15
    check-cast v9, Lcp1/e;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8, v7}, Lep1/d;->b(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_16
    check-cast v9, Lbo0/c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v8, v7}, Leo0/g;->r(Lbo0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_17
    check-cast v9, Lkotlin/jvm/functions/Function1;

    check-cast v8, Lc93/a;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Leg2/i;->h(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_18
    check-cast v9, Le90/d;

    check-cast v8, Lp1/c1;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Le90/g;->d(Le90/d;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_19
    check-cast v9, Lt81/r;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lp1/c1;

    invoke-static {v9, v8, v7}, Ldk2/j;->g(Lt81/r;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1a
    check-cast v9, Lg80/c;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    check-cast v7, Lcom/whoop/activation/iajf/domain/SignUpSource;

    invoke-static {v9, v8, v7}, Ld80/e;->j(Lg80/c;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1b
    check-cast v9, Lp1/c1;

    check-cast v8, Ld30/h;

    check-cast v7, Lh20/l;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld30/x;

    iget-boolean v1, v1, Ld30/x;->c:Z

    if-eqz v1, :cond_24

    new-instance v1, Ld30/a0;

    invoke-direct {v1, v7}, Ld30/a0;-><init>(Lh20/l;)V

    invoke-virtual {v8, v1}, Ld30/h;->a(Lds/p;)V

    goto :goto_10

    :cond_24
    new-instance v1, Ld30/y;

    invoke-direct {v1, v7}, Ld30/y;-><init>(Lh20/l;)V

    invoke-virtual {v8, v1}, Ld30/h;->a(Lds/p;)V

    :goto_10
    return-object v6

    :pswitch_1c
    check-cast v9, Le30/c;

    check-cast v8, Lv00/c0;

    check-cast v7, Lh20/f;

    iget-object v1, v9, Le30/c;->a0:Lh20/z4;

    const-string v3, "paymentMethodMetadata"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "customerStateHolder"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "savedPaymentMethodMutator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ld30/h;

    iget-object v4, v7, Lh20/f;->c:Ln53/e;

    iget-object v7, v9, Le30/c;->P:Lec3/r1;

    iget-object v10, v1, Lh20/z4;->q:Lec3/h2;

    iget-object v11, v1, Lh20/z4;->o:Ln53/e;

    new-instance v18, Lb30/i0;

    const/16 v24, 0x0

    const/16 v25, 0x5

    const/16 v19, 0x0

    const-class v21, Lh20/z4;

    const-string v22, "toggleEditing"

    const-string v23, "toggleEditing()V"

    move-object/from16 v20, v1

    invoke-direct/range {v18 .. v25}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v12, Ld30/f;

    const/4 v13, 0x0

    invoke-direct {v12, v9, v13}, Ld30/f;-><init>(Le30/c;I)V

    new-instance v14, Ld30/g;

    invoke-direct {v14, v1, v13}, Ld30/g;-><init>(Lh20/z4;I)V

    new-instance v13, Ld30/f;

    const/4 v15, 0x1

    invoke-direct {v13, v9, v15}, Ld30/f;-><init>(Le30/c;I)V

    iget-object v1, v1, Lh20/z4;->m:Ln53/e;

    move-object/from16 v28, v1

    move-object/from16 v19, v4

    move-object/from16 v21, v7

    move-object/from16 v20, v8

    move-object/from16 v22, v10

    move-object/from16 v23, v11

    move-object/from16 v25, v12

    move-object/from16 v27, v13

    move-object/from16 v26, v14

    move-object/from16 v24, v18

    move-object/from16 v18, v3

    invoke-direct/range {v18 .. v28}, Ld30/h;-><init>(Ln53/e;Lv00/c0;Lec3/r1;Lec3/h2;Ln53/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln53/e;)V

    move-object/from16 v1, v18

    new-instance v3, Lr20/k;

    invoke-direct {v3, v1}, Lr20/k;-><init>(Ld30/h;)V

    iget-object v1, v9, Le30/c;->M:Lr20/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lqt2/e;

    const/4 v7, 0x7

    invoke-direct {v4, v7, v1, v3}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v1, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    if-nez v3, :cond_25

    iget-object v3, v1, Lr20/d;->a:Lbc3/c0;

    new-instance v7, Lr20/c;

    invoke-direct {v7, v4, v1, v5}, Lr20/c;-><init>(Lc93/a;Lr20/d;Lq83/d;)V

    invoke-static {v3, v5, v5, v7, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_25
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
