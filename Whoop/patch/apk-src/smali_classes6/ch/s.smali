.class public final Lch/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Lch/s;->w:I

    iput-object p1, p0, Lch/s;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch/s;->z:Ljava/lang/Object;

    iput-object p3, p0, Lch/s;->E:Ljava/lang/Object;

    iput-object p4, p0, Lch/s;->x:Ljava/lang/Object;

    iput-object p5, p0, Lch/s;->F:Ljava/lang/Object;

    iput-object p6, p0, Lch/s;->G:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm00/a;Lg2/i;Lc93/a;Lc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lch/s;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/s;->y:Ljava/lang/Object;

    iput-object p2, p0, Lch/s;->z:Ljava/lang/Object;

    iput-object p3, p0, Lch/s;->E:Ljava/lang/Object;

    iput-object p4, p0, Lch/s;->F:Ljava/lang/Object;

    iput-object p5, p0, Lch/s;->x:Ljava/lang/Object;

    iput-object p6, p0, Lch/s;->G:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, Lch/s;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, v0, Lch/s;->G:Ljava/lang/Object;

    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lch/s;->F:Ljava/lang/Object;

    move-object v12, v4

    check-cast v12, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lch/s;->x:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lch/s;->y:Ljava/lang/Object;

    move-object v13, v5

    check-cast v13, Ly00/c0;

    iget-object v5, v0, Lch/s;->E:Ljava/lang/Object;

    move-object v15, v5

    check-cast v15, Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lch/s;->z:Ljava/lang/Object;

    move-object v14, v5

    check-cast v14, Lbc3/c0;

    const-string v5, "$this$showBottomSheetContent"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v3, 0x11

    const/16 v3, 0x10

    if-ne v1, v3, :cond_1

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_1
    :goto_0
    sget-object v1, Lb2/t;->w:Lb2/t;

    const-string v3, "wallet_screen_menu_sheet_tag"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v3, v0, Lch/s;->y:Ljava/lang/Object;

    check-cast v3, Ly00/c0;

    check-cast v2, Lp1/q;

    const v5, 0x5388b6c8

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_2

    if-ne v6, v7, :cond_3

    :cond_2
    move-object/from16 v17, v13

    goto :goto_1

    :cond_3
    move-object v9, v13

    goto :goto_2

    :goto_1
    new-instance v13, Lq00/d0;

    const/16 v18, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v13 .. v18}, Lq00/d0;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;I)V

    move-object/from16 v9, v17

    invoke-virtual {v2, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v13

    :goto_2
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    const v5, 0x5388dac4

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    if-ne v6, v7, :cond_5

    :cond_4
    move-object/from16 v17, v9

    goto :goto_3

    :cond_5
    move-object v13, v9

    goto :goto_4

    :goto_3
    new-instance v9, Lq00/d0;

    move-object v6, v14

    const/4 v14, 0x1

    move-object v10, v6

    move-object v11, v15

    move-object/from16 v13, v17

    invoke-direct/range {v9 .. v14}, Lq00/d0;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;I)V

    move-object v14, v10

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v9

    :goto_4
    move-object/from16 v19, v6

    check-cast v19, Lc93/a;

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    const v5, 0x5388fe44

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    if-ne v6, v7, :cond_7

    :cond_6
    new-instance v5, Lq00/d0;

    const/4 v10, 0x2

    move-object v9, v13

    move-object v6, v14

    move-object v7, v15

    invoke-direct/range {v5 .. v10}, Lq00/d0;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v5

    :cond_7
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    const/16 v22, 0x6

    move-object/from16 v16, v1

    move-object/from16 v21, v2

    move-object/from16 v17, v3

    invoke-static/range {v16 .. v22}, Lse/g;->n(Landroidx/compose/ui/Modifier;Ly00/c0;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Ll0/y;

    move-object/from16 v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, Lch/s;->E:Ljava/lang/Object;

    move-object v12, v3

    check-cast v12, Lc93/a;

    iget-object v3, v0, Lch/s;->z:Ljava/lang/Object;

    move-object v13, v3

    check-cast v13, Lg2/i;

    iget-object v3, v0, Lch/s;->y:Ljava/lang/Object;

    move-object v14, v3

    check-cast v14, Lm00/a;

    const-string v3, "$this$ScrollableTopLevelColumn"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_9

    move-object v3, v9

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/4 v3, 0x4

    goto :goto_6

    :cond_8
    const/4 v3, 0x2

    :goto_6
    or-int/2addr v1, v3

    :cond_9
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_b

    move-object v3, v9

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_b
    :goto_7
    new-instance v3, Lg1/f;

    iget-object v4, v0, Lch/s;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lch/s;->G:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v6, 0x9

    invoke-direct {v3, v4, v14, v5, v6}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, -0x7a0e62c8

    invoke-static {v4, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x30

    const/4 v5, 0x0

    const/4 v15, 0x1

    invoke-static {v5, v3, v9, v4, v15}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-object v3, v14, Lm00/a;->g:Lzy/c;

    const/4 v4, 0x0

    if-eqz v3, :cond_c

    move v3, v15

    goto :goto_8

    :cond_c
    move v3, v4

    :goto_8
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v7, Lb30/o4;

    const/16 v8, 0xa

    invoke-direct {v7, v14, v8}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v8, 0x587efcbb

    invoke-static {v8, v9, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    and-int/lit8 v1, v1, 0xe

    const v7, 0x180180

    or-int v10, v1, v7

    const/16 v11, 0x1c

    move v1, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move-object/from16 v1, v16

    invoke-static/range {v2 .. v11}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/16 v2, 0x10

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    iget-object v1, v14, Lm00/a;->d:Lzy/c;

    invoke-static {v1, v9}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v18

    iget-object v1, v14, Lm00/a;->c:Lh00/o0;

    check-cast v9, Lp1/q;

    const v2, 0x29f53444

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_e

    :cond_d
    new-instance v3, Li20/b1;

    const/4 v2, 0x2

    invoke-direct {v3, v13, v12, v2}, Li20/b1;-><init>(Lg2/i;Lc93/a;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v20, v3

    check-cast v20, Lc93/a;

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    iget-object v2, v0, Lch/s;->F:Ljava/lang/Object;

    move-object/from16 v22, v2

    check-cast v22, Lc93/a;

    const/16 v24, 0x6006

    const/16 v25, 0xc0

    const/16 v21, 0x1

    move-object/from16 v19, v1

    move-object/from16 v23, v9

    invoke-static/range {v17 .. v25}, Lh00/n0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lh00/o0;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_1
    move-object/from16 v3, p1

    check-cast v3, Ll0/v;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0xe

    if-nez v4, :cond_10

    move-object v4, v1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    const/4 v4, 0x4

    goto :goto_a

    :cond_f
    const/4 v4, 0x2

    :goto_a
    or-int/2addr v2, v4

    :cond_10
    and-int/lit8 v2, v2, 0x5b

    const/16 v4, 0x12

    if-ne v2, v4, :cond_12

    move-object v2, v1

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_b

    :cond_11
    invoke-virtual {v2}, Lp1/q;->X()V

    goto :goto_c

    :cond_12
    :goto_b
    iget-object v2, v0, Lch/s;->y:Ljava/lang/Object;

    check-cast v2, Lnh/i;

    check-cast v2, Lch/p;

    move-object v4, v3

    check-cast v4, Landroidx/compose/foundation/layout/c;

    iget-wide v4, v4, Landroidx/compose/foundation/layout/c;->b:J

    iget-object v2, v2, Lch/p;->w:Lec3/h2;

    new-instance v6, Ly3/a;

    invoke-direct {v6, v4, v5}, Ly3/a;-><init>(J)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v6}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v2, v0, Lch/s;->z:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Lx1/b;

    new-instance v2, Lch/r;

    iget-object v4, v0, Lch/s;->E:Ljava/lang/Object;

    check-cast v4, Lcoil/compose/AsyncImagePainter;

    iget-object v5, v0, Lch/s;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lch/s;->F:Ljava/lang/Object;

    check-cast v6, Lb2/h;

    iget-object v7, v0, Lch/s;->G:Ljava/lang/Object;

    check-cast v7, Ly2/k;

    invoke-direct/range {v2 .. v7}, Lch/r;-><init>(Ll0/u;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Lb2/h;Ly2/k;)V

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v8, v2, v1, v3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_c
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
