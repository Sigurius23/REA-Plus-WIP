.class public final Lb30/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILx1/b;Lx1/b;Lc93/m;Lg1/a4;Lc93/m;Lkotlin/jvm/functions/Function3;Lg1/i5;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/w;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb30/w;->x:I

    iput-object p2, p0, Lb30/w;->y:Ljava/lang/Object;

    iput-object p3, p0, Lb30/w;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/w;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/w;->F:Ljava/lang/Object;

    iput-object p6, p0, Lb30/w;->G:Ll83/e;

    iput-object p7, p0, Lb30/w;->H:Ljava/lang/Object;

    iput-object p8, p0, Lb30/w;->I:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg40/y2;Lb30/i1;Lb30/b1;ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/t2;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/w;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/w;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb30/w;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb30/w;->E:Ljava/lang/Object;

    iput p4, p0, Lb30/w;->x:I

    iput-object p5, p0, Lb30/w;->F:Ljava/lang/Object;

    iput-object p6, p0, Lb30/w;->H:Ljava/lang/Object;

    iput-object p7, p0, Lb30/w;->I:Ljava/lang/Object;

    iput-object p8, p0, Lb30/w;->G:Ll83/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lb30/w;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/2addr v2, v5

    move-object v11, v1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lb30/w;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lx1/b;

    iget-object v1, v0, Lb30/w;->z:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lx1/b;

    new-instance v1, Lb30/w2;

    iget-object v2, v0, Lb30/w;->H:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function3;

    iget-object v3, v0, Lb30/w;->I:Ljava/lang/Object;

    check-cast v3, Lg1/i5;

    const/16 v4, 0x8

    invoke-direct {v1, v4, v2, v3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x20811187

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    iget-object v1, v0, Lb30/w;->E:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/m;

    iget-object v1, v0, Lb30/w;->F:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lg1/a4;

    iget-object v1, v0, Lb30/w;->G:Ll83/e;

    move-object v10, v1

    check-cast v10, Lc93/m;

    const/16 v12, 0x6000

    iget v4, v0, Lb30/w;->x:I

    invoke-static/range {v4 .. v12}, Lg1/g5;->c(ILx1/b;Lx1/b;Lx1/b;Lc93/m;Ll0/b2;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    move-object v1, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_14

    :cond_3
    :goto_2
    iget-object v1, v0, Lb30/w;->y:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lg40/y2;

    iget-object v1, v0, Lb30/w;->z:Ljava/lang/Object;

    check-cast v1, Lb30/i1;

    iget-object v2, v0, Lb30/w;->E:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lb30/b1;

    iget-object v2, v0, Lb30/w;->F:Ljava/lang/Object;

    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lb30/w;->H:Ljava/lang/Object;

    move-object v12, v2

    check-cast v12, Lp1/c1;

    iget-object v2, v0, Lb30/w;->I:Ljava/lang/Object;

    move-object v13, v2

    check-cast v13, Lp1/t2;

    iget-object v2, v0, Lb30/w;->G:Ll83/e;

    move-object v14, v2

    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v2, v4, v7, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    invoke-static {v7}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v5, v7

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p1, v10

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move-object/from16 v16, v2

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v17, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_5
    move-object/from16 v17, v3

    :goto_4
    invoke-static {v4, v5, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x3e783824

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    if-nez v17, :cond_7

    move-object/from16 v18, v16

    move-object/from16 v16, v13

    move-object/from16 v13, v18

    move-object/from16 v19, v2

    move-object/from16 v21, v10

    move-object/from16 v18, v12

    move-object/from16 v20, v17

    move-object v10, v5

    move-object v12, v8

    move-object/from16 v17, v14

    move-object v14, v6

    :goto_5
    const/4 v2, 0x0

    goto :goto_6

    :cond_7
    move-object v3, v8

    const/16 v8, 0x6c06

    const/4 v9, 0x4

    move-object v4, v2

    const/4 v2, 0x1

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v19, v5

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v21, v16

    move-object/from16 v16, v13

    move-object/from16 v13, v21

    move-object/from16 v21, v10

    move-object/from16 v10, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v12

    move-object v12, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v14

    move-object/from16 v14, v20

    invoke-static/range {v2 .. v9}, Ls2/e;->g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v20, v3

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v3, v2, Ld40/n;->c:J

    invoke-static {v7}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v2

    iget v5, v2, Ld40/o;->c:F

    const/4 v8, 0x0

    const/16 v9, 0x9

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :goto_6
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    iget-object v2, v1, Lb30/i1;->a:Ljava/lang/String;

    iget-object v3, v11, Lb30/b1;->a:Lb30/q;

    iget-boolean v5, v11, Lb30/b1;->b:Z

    iget-object v4, v11, Lb30/b1;->c:Ljava/lang/Object;

    const/4 v6, 0x1

    if-nez v20, :cond_8

    move v8, v6

    :goto_7
    move-object v9, v10

    goto :goto_8

    :cond_8
    const/4 v8, 0x0

    goto :goto_7

    :goto_8
    const/4 v10, 0x0

    move/from16 v20, v6

    iget v6, v0, Lb30/w;->x:I

    move-object/from16 v22, v9

    move-object/from16 v0, v21

    move-object v9, v7

    move-object/from16 v7, p1

    move-object/from16 p1, v1

    move/from16 v1, v20

    invoke-static/range {v2 .. v10}, Ltx/f;->c(Ljava/lang/String;Lb30/q;Ljava/util/List;ZILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V

    move-object v7, v9

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v3, v2, Ld40/n;->c:J

    invoke-static {v7}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v2

    iget v5, v2, Ld40/o;->c:F

    const/4 v8, 0x0

    const/16 v9, 0x9

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x0

    invoke-static {v3, v4, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    invoke-static {v7}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    invoke-virtual/range {v22 .. v22}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, Lp1/q;->i0()V

    move-object/from16 v9, v22

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    invoke-virtual {v9, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v7, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_b

    :cond_a
    :goto_a
    move-object/from16 v4, v19

    goto :goto_c

    :cond_b
    :goto_b
    invoke-static {v4, v9, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v7, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "update_payment_method_expiry_date"

    invoke-static {v12, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    float-to-double v2, v10

    const-wide/16 v13, 0x0

    cmpl-double v2, v2, v13

    const-string v15, "invalid weight; must be greater than zero"

    if-lez v2, :cond_c

    goto :goto_d

    :cond_c
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v19, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v10, v19

    if-lez v3, :cond_d

    move/from16 v3, v19

    goto :goto_e

    :cond_d
    move v3, v10

    :goto_e
    invoke-direct {v2, v3, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, -0xf64fda6

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object/from16 v2, v18

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_e

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_f

    :cond_e
    new-instance v4, Laq1/d;

    const/4 v3, 0x3

    invoke-direct {v4, v3, v2}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-static {v0, v4}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget-object v3, v11, Lb30/b1;->d:Lb30/k1;

    const/4 v4, 0x0

    if-eqz v16, :cond_10

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    goto :goto_f

    :cond_10
    move-object v5, v4

    :goto_f
    const v6, -0xf64d81d

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    if-nez v5, :cond_11

    const/4 v5, 0x0

    goto :goto_12

    :cond_11
    const v4, 0x224df03d

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v6, v4, Ljava/util/Collection;

    if-eqz v6, :cond_13

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_13

    :cond_12
    move v4, v1

    :goto_10
    const/4 v5, 0x0

    goto :goto_11

    :cond_13
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_14
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    const/4 v4, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_12
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v18, v2

    move-object/from16 v5, v17

    move-object v2, v0

    invoke-static/range {v2 .. v8}, Lvp/c;->l(Landroidx/compose/ui/Modifier;Lb30/k1;ZLkotlin/jvm/functions/Function1;Lj0/i;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/f;

    iget v0, v0, Ly3/f;->w:F

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v2

    iget v2, v2, Ld40/o;->c:F

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v3, v0, Ld40/n;->c:J

    move-object/from16 v22, v9

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, v22

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v2, p1

    iget-object v2, v2, Lb30/i1;->d:Ly00/i;

    float-to-double v3, v10

    cmpl-double v3, v3, v13

    if-lez v3, :cond_15

    goto :goto_13

    :cond_15
    invoke-static {v15}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_13
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v10, v19

    if-lez v4, :cond_16

    move/from16 v10, v19

    :cond_16
    invoke-direct {v3, v10, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v5, 0x0

    invoke-static {v2, v3, v7, v5}, Ltx/f;->d(Ly00/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
