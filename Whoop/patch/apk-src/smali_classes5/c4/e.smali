.class public final Lc4/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc4/e;->w:I

    iput-object p1, p0, Lc4/e;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, Lc4/e;->w:I

    iput-object p1, p0, Lc4/e;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 53

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget v2, v0, Lc4/e;->w:I

    const-string v3, "builder"

    const/4 v4, 0x0

    const v5, -0x1896950d

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    iget-object v10, v0, Lc4/e;->x:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v3, v1, 0x3

    if-eq v3, v7, :cond_0

    move v3, v8

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    and-int/2addr v1, v8

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    check-cast v10, Ljava/util/List;

    move-object v1, v10

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v6

    :goto_1
    if-ge v3, v1, :cond_5

    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc93/m;

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->c:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_2
    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v5, v2, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v2, v5}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lp1/q;->X()V

    :cond_5
    return-object v9

    :pswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lcom/squareup/wire/j;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/reflect/Field;

    invoke-virtual {v10, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v9

    :pswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/squareup/wire/j;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/reflect/Method;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v10, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-object v9

    :pswitch_2
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_7

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_4

    :cond_7
    :goto_3
    check-cast v10, Lx1/b;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v2, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    return-object v9

    :pswitch_3
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_9

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_6

    :cond_9
    :goto_5
    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getPrompt()Ljava/lang/String;

    move-result-object v11

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v4, v2, v8}, Luj/m;->a(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v27

    const/16 v30, 0x0

    const v31, 0xfffe

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v2

    invoke-static/range {v11 .. v31}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_6
    return-object v9

    :pswitch_4
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_b

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_8

    :cond_b
    :goto_7
    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyTextMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyTextMeta;->getPrompt()Ljava/lang/String;

    move-result-object v32

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v4, v2, v8}, Luj/m;->a(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v48

    const/16 v51, 0x0

    const v52, 0xfffe

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    move-object/from16 v49, v2

    invoke-static/range {v32 .. v52}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_8
    return-object v9

    :pswitch_5
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_d

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v1}, Lp1/q;->X()V

    goto :goto_a

    :cond_d
    :goto_9
    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_e

    const-string v10, ""

    :cond_e
    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v5}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v4, v2, v8}, Luj/m;->a(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v26

    const/16 v29, 0x0

    const v30, 0xfffe

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v2

    invoke-static/range {v10 .. v30}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_a
    return-object v9

    :pswitch_6
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    if-ne v1, v7, :cond_10

    move-object v1, v2

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_e

    :cond_10
    :goto_b
    move-object v3, v10

    check-cast v3, Lc93/a;

    sget-object v1, Le4/a;->a:Lo2/e;

    if-eqz v1, :cond_11

    :goto_c
    move-object v4, v1

    goto/16 :goto_d

    :cond_11
    new-instance v10, Lo2/d;

    const/16 v18, 0x0

    const/16 v20, 0x60

    const-string v11, "Filled.Undo"

    const/high16 v12, 0x41c00000    # 24.0f

    const/high16 v13, 0x41c00000    # 24.0f

    const/high16 v14, 0x41c00000    # 24.0f

    const/high16 v15, 0x41c00000    # 24.0f

    const-wide/16 v16, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v10 .. v20}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v4, Li2/x;->b:J

    invoke-direct {v1, v4, v5}, Li2/c1;-><init>(J)V

    new-instance v11, Laa3/u0;

    const/4 v4, 0x5

    invoke-direct {v11, v4}, Laa3/u0;-><init>(I)V

    const/high16 v4, 0x41480000    # 12.5f

    const/high16 v5, 0x41000000    # 8.0f

    invoke-virtual {v11, v4, v5}, Laa3/u0;->t(FF)V

    const v16, -0x3f233333    # -6.9f

    const v17, 0x40266666    # 2.6f

    const v12, -0x3fd66666    # -2.65f

    const/4 v13, 0x0

    const v14, -0x3f5e6666    # -5.05f

    const v15, 0x3f7d70a4    # 0.99f

    invoke-virtual/range {v11 .. v17}, Laa3/u0;->k(FFFFFF)V

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v5, 0x40e00000    # 7.0f

    invoke-virtual {v11, v4, v5}, Laa3/u0;->r(FF)V

    const/high16 v4, 0x41100000    # 9.0f

    invoke-virtual {v11, v4}, Laa3/u0;->v(F)V

    invoke-virtual {v11, v4}, Laa3/u0;->q(F)V

    const v4, -0x3f9851ec    # -3.62f

    invoke-virtual {v11, v4, v4}, Laa3/u0;->s(FF)V

    const v16, 0x40a3d70a    # 5.12f

    const v17, -0x400f5c29    # -1.88f

    const v12, 0x3fb1eb85    # 1.39f

    const v13, -0x406b851f    # -1.16f

    const v14, 0x404a3d71    # 3.16f

    const v15, -0x400f5c29    # -1.88f

    invoke-virtual/range {v11 .. v17}, Laa3/u0;->k(FFFFFF)V

    const v16, 0x40f33333    # 7.6f

    const/high16 v17, 0x40b00000    # 5.5f

    const v12, 0x40628f5c    # 3.54f

    const/4 v13, 0x0

    const v14, 0x40d1999a    # 6.55f

    const v15, 0x4013d70a    # 2.31f

    invoke-virtual/range {v11 .. v17}, Laa3/u0;->k(FFFFFF)V

    const v4, 0x4017ae14    # 2.37f

    const v5, -0x40b851ec    # -0.78f

    invoke-virtual {v11, v4, v5}, Laa3/u0;->s(FF)V

    const/high16 v16, 0x41480000    # 12.5f

    const/high16 v17, 0x41000000    # 8.0f

    const v12, 0x41a8a3d7    # 21.08f

    const v13, 0x41307ae1    # 11.03f

    const v14, 0x41893333    # 17.15f

    const/high16 v15, 0x41000000    # 8.0f

    invoke-virtual/range {v11 .. v17}, Laa3/u0;->j(FFFFFF)V

    invoke-virtual {v11}, Laa3/u0;->i()V

    iget-object v4, v11, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-static {v10, v4, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v10}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Le4/a;->a:Lo2/e;

    goto/16 :goto_c

    :goto_d
    const/4 v6, 0x0

    const/16 v8, 0x180

    const-string v5, "Reset User History"

    move-object v7, v2

    invoke-static/range {v3 .. v8}, Lvp/c;->b(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_e
    return-object v9

    :pswitch_7
    move-object/from16 v2, p1

    check-cast v2, Lu2/r;

    check-cast v1, Lh2/b;

    iget-wide v3, v1, Lh2/b;->a:J

    const-string v1, "change"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lu2/r;->a()V

    check-cast v10, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v10}, Landroid/view/View;->getX()F

    move-result v1

    invoke-static {v3, v4}, Lh2/b;->e(J)F

    move-result v2

    add-float/2addr v2, v1

    invoke-virtual {v10, v2}, Landroid/view/View;->setX(F)V

    invoke-virtual {v10}, Landroid/view/View;->getY()F

    move-result v1

    invoke-static {v3, v4}, Lh2/b;->f(J)F

    move-result v2

    add-float/2addr v2, v1

    invoke-virtual {v10, v2}, Landroid/view/View;->setY(F)V

    return-object v9

    :pswitch_8
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    check-cast v10, Lup/c;

    const/16 v1, 0x9

    invoke-static {v10, v2, v1}, Lx30/s0;->e(Lup/c;Landroidx/compose/runtime/Composer;I)V

    return-object v9

    :pswitch_9
    move-object/from16 v2, p1

    check-cast v2, Lio/getstream/video/android/core/model/IceCandidate;

    check-cast v1, Lc43/v;

    const-string v3, "candidate"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "<anonymous parameter 1>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Landroidx/room/v0;

    sget-object v1, Lc43/v;->x:Lc43/v;

    invoke-virtual {v10, v2, v1}, Landroidx/room/v0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v9

    :pswitch_a
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    check-cast v10, Lc4/f0;

    invoke-static {v8}, Lp1/x;->L(I)I

    move-result v1

    invoke-virtual {v10, v2, v1}, Lc4/f0;->a(Landroidx/compose/runtime/Composer;I)V

    return-object v9

    :pswitch_b
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    check-cast v10, Lc4/z;

    invoke-static {v8}, Lp1/x;->L(I)I

    move-result v1

    invoke-virtual {v10, v2, v1}, Lc4/z;->a(Landroidx/compose/runtime/Composer;I)V

    return-object v9

    :pswitch_c
    move-object/from16 v2, p1

    check-cast v2, Landroidx/compose/runtime/Composer;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v3, v1, 0x3

    if-eq v3, v7, :cond_12

    move v3, v8

    goto :goto_f

    :cond_12
    move v3, v6

    :goto_f
    and-int/2addr v1, v8

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_13

    sget-object v1, Lc4/d;->x:Lc4/d;

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    check-cast v10, Lp1/c1;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc93/m;

    invoke-static {v1, v3, v2, v6}, Lse/b;->t(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_10

    :cond_14
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_10
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
