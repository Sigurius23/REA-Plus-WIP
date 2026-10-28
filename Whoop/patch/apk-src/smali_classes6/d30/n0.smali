.class public final Ld30/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx1/b;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld30/n0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/n0;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Ld30/n0;->x:Z

    return-void
.end method

.method public constructor <init>(ZLh20/z0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld30/n0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ld30/n0;->x:Z

    iput-object p2, p0, Ld30/n0;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    iget v1, v0, Ld30/n0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    sget-object v4, Lb2/t;->w:Lb2/t;

    iget-object v5, v0, Ld30/n0;->y:Ljava/lang/Object;

    const/4 v6, 0x0

    iget-boolean v7, v0, Ld30/n0;->x:Z

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p3

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x11

    const/16 v10, 0x10

    const/4 v11, 0x1

    if-eq v9, v10, :cond_0

    move v9, v11

    goto :goto_0

    :cond_0
    move v9, v6

    :goto_0
    and-int/2addr v8, v11

    move-object v15, v1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v8, v9}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    check-cast v5, Lx1/b;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v15, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Ll1/g;->d:F

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v15, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v1, Lm1/e0;->f:Lo2/e;

    if-eqz v1, :cond_1

    :goto_1
    move-object v10, v1

    goto :goto_2

    :cond_1
    new-instance v16, Lo2/d;

    const/16 v25, 0x0

    const/16 v26, 0xe0

    const-string v17, "Filled.ArrowDropDown"

    const/high16 v18, 0x41c00000    # 24.0f

    const/high16 v19, 0x41c00000    # 24.0f

    const/high16 v20, 0x41c00000    # 24.0f

    const/high16 v21, 0x41c00000    # 24.0f

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v1, v16

    sget v5, Lo2/f0;->a:I

    new-instance v5, Li2/c1;

    sget-wide v8, Li2/x;->b:J

    invoke-direct {v5, v8, v9}, Li2/c1;-><init>(J)V

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0x20

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v9, Lo2/m;

    const/high16 v10, 0x40e00000    # 7.0f

    const/high16 v11, 0x41200000    # 10.0f

    invoke-direct {v9, v10, v11}, Lo2/m;-><init>(FF)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Lo2/t;

    const/high16 v10, 0x40a00000    # 5.0f

    invoke-direct {v9, v10, v10}, Lo2/t;-><init>(FF)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Lo2/t;

    const/high16 v11, -0x3f600000    # -5.0f

    invoke-direct {v9, v10, v11}, Lo2/t;-><init>(FF)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v9, Lo2/i;->c:Lo2/i;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v8, v5}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v1}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lm1/e0;->f:Lo2/e;

    goto :goto_1

    :goto_2
    if-eqz v7, :cond_2

    const v1, 0x59f760c7

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    const v1, 0x7f1407dc

    invoke-static {v15, v1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    :goto_3
    move-object v11, v1

    goto :goto_4

    :cond_2
    const v1, 0x59f8d106

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    const v1, 0x7f1407e0

    invoke-static {v15, v1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v15, v6}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    if-eqz v7, :cond_3

    const/high16 v3, 0x43340000    # 180.0f

    :cond_3
    invoke-static {v3, v4}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v16, 0x0

    const/16 v17, 0x8

    const-wide/16 v13, 0x0

    invoke-static/range {v10 .. v17}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_4
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ll0/s1;

    move-object/from16 v13, p2

    check-cast v13, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p3

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    check-cast v5, Lh20/z0;

    const-string v9, "$this$RowButtonWithEndIconOuterContent"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v9, v8, 0x6

    const/4 v10, 0x2

    if-nez v9, :cond_6

    move-object v9, v13

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v9, 0x4

    goto :goto_6

    :cond_5
    move v9, v10

    :goto_6
    or-int/2addr v8, v9

    :cond_6
    and-int/lit8 v8, v8, 0x13

    const/16 v9, 0x12

    if-ne v8, v9, :cond_8

    move-object v8, v13

    check-cast v8, Lp1/q;

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_9

    :cond_8
    :goto_7
    if-eqz v7, :cond_a

    const v7, 0x7f0807c0

    invoke-static {v7, v13, v6}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v8

    sget-object v6, Lb2/e;->K:Lb2/l;

    invoke-interface {v1, v4, v6}, Ll0/s1;->a(Landroidx/compose/ui/Modifier;Lb2/l;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    iget v1, v5, Lh20/z0;->F:F

    const/16 v18, 0x0

    const/16 v19, 0xb

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v17, v1

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x3

    int-to-float v4, v4

    invoke-static {v1, v4, v3, v10}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v13}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v5, Lh20/z0;->J:Lh20/y0;

    goto :goto_8

    :cond_9
    iget-object v1, v5, Lh20/z0;->I:Lh20/y0;

    :goto_8
    iget v1, v1, Lh20/y0;->x:I

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v11

    const/16 v14, 0x30

    const/4 v15, 0x0

    const/4 v9, 0x0

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :cond_a
    :goto_9
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
