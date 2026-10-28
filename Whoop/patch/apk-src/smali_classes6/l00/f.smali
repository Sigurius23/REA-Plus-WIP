.class public abstract Ll00/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/model/ConsentUi$Icon;

    const-string v1, "https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--lock-primary-3x.png"

    invoke-direct {v0, v1}, Lcom/stripe/android/model/ConsentUi$Icon;-><init>(Ljava/lang/String;)V

    new-instance v4, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    new-instance v1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    const-string v2, "Account"

    const-string v3, "View and manage your name, email, phone, and shipping addresses"

    invoke-direct {v1, v0, v2, v3}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;-><init>(Lcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    const-string v3, "Wallet"

    const-string v5, "View and manage your cards and bank accounts"

    invoke-direct {v2, v0, v3, v5}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;-><init>(Lcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    const-string v5, "Identity"

    const-string v6, "View your identity information (date of birth, address, <a href=\'\'>ID documents</a>)"

    invoke-direct {v3, v0, v5, v6}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;-><init>(Lcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v1, v2, v3}, [Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "Powdur will have access to:"

    invoke-direct {v4, v1, v0}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;-><init>(Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lcom/stripe/android/model/ConsentUi$ConsentPane;

    const-string v6, "Cancel"

    const-string v7, "Continue"

    const-string v3, "Connect Powdur with Link"

    const-string v5, "Lorem ipsum <a href=\'\'>dolor</a> sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/model/ConsentUi$ConsentPane;-><init>(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Ll00/a;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x59fa9e29

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    const/16 v6, 0x10

    const/16 v7, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    if-ne v8, v9, :cond_9

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lp1/q;->X()V

    goto/16 :goto_9

    :cond_9
    :goto_6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    const v9, -0x1a6f7841

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v8, :cond_b

    if-ne v8, v11, :cond_a

    const v8, -0x6b7d321b

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    iget-wide v12, v8, Lg00/b;->i:J

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v0, -0x6b7d42ea

    invoke-static {v0, v14, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_b
    const v8, -0x6b7d3ad8

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    iget-wide v12, v8, Lg00/b;->c:J

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_d

    if-ne v8, v11, :cond_c

    const v8, -0x6b7d1c19

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    iget-wide v8, v8, Lg00/b;->s:J

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v0, -0x6b7d2c8b

    invoke-static {v0, v14, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_d
    const v8, -0x6b7d247b

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v14, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg00/b;

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    iget-wide v8, v8, Lg00/b;->n:J

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    :goto_8
    const v11, -0x45773cff

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lg00/g;->d:Lp1/u2;

    invoke-virtual {v14, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg00/c;

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    iget-object v10, v11, Lg00/c;->b:Lt0/i;

    invoke-static {v4, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v12, v13, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v7, v7

    int-to-float v6, v6

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v7, v6, v7, v6}, Ll0/l1;-><init>(FFFF)V

    new-instance v6, Lj00/z;

    invoke-direct {v6, v2, v8, v9}, Lj00/z;-><init>(Ljava/lang/String;J)V

    const v7, -0x7ea36f86

    invoke-static {v7, v14, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    const/high16 v6, 0x36000000

    or-int v15, v0, v6

    const/16 v16, 0xfc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v6, v3

    invoke-static/range {v6 .. v16}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lj41/a;

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lj41/a;-><init>(Ll00/a;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move/from16 v6, p5

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v0, 0x59fdd1cc

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    move-object/from16 v7, p1

    if-nez v3, :cond_3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v6, 0x180

    move-object/from16 v8, p2

    if-nez v3, :cond_5

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v6, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    move v9, v0

    and-int/lit16 v0, v9, 0x493

    const/16 v3, 0x492

    if-ne v0, v3, :cond_9

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_9
    :goto_5
    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v3, v5, v4, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x26effc6c

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    const-string v13, "invalid weight; must be greater than zero"

    const-wide/16 v14, 0x0

    const/4 v0, 0x1

    if-eqz v1, :cond_f

    if-eqz v2, :cond_f

    move/from16 p4, v11

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    float-to-double v11, v10

    cmpl-double v3, v11, v14

    if-lez v3, :cond_d

    goto :goto_7

    :cond_d
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v10, v16

    if-lez v5, :cond_e

    move/from16 v5, v16

    goto :goto_8

    :cond_e
    move v5, v10

    :goto_8
    invoke-direct {v3, v5, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move v5, v0

    sget-object v0, Ll00/a;->w:Ll00/a;

    shl-int/lit8 v11, v9, 0x3

    and-int/lit8 v11, v11, 0x70

    or-int/lit8 v11, v11, 0x6

    shr-int/lit8 v12, v9, 0x3

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v11, v12

    move/from16 v17, v11

    move v11, v5

    move/from16 v5, v17

    invoke-static/range {v0 .. v5}, Ll00/f;->a(Ll00/a;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_f
    move/from16 p4, v11

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    move v11, v0

    :goto_9
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    float-to-double v0, v10

    cmpl-double v0, v0, v14

    if-lez v0, :cond_10

    goto :goto_a

    :cond_10
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v0, v10, v16

    if-lez v0, :cond_11

    move/from16 v10, v16

    :cond_11
    invoke-direct {v3, v10, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Ll00/a;->x:Ll00/a;

    and-int/lit8 v1, v9, 0x70

    or-int/lit8 v1, v1, 0x6

    and-int/lit16 v2, v9, 0x380

    or-int v5, v1, v2

    move-object v1, v7

    move-object v2, v8

    invoke-static/range {v0 .. v5}, Ll00/f;->a(Ll00/a;Ljava/lang/String;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lj41/a;

    const/16 v6, 0x1c

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lj41/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, -0x58e11cd4

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    const/16 p1, 0x12

    int-to-float p1, p1

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const p1, 0x7f0807bb

    const/4 v0, 0x0

    invoke-static {p1, v7, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object p1

    const v1, -0x1a6f7841

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v7, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    iget-wide v0, v1, Lg00/b;->u:J

    new-instance v6, Li2/p;

    const/4 v3, 0x5

    invoke-direct {v6, v0, v1, v3}, Li2/p;-><init>(JI)V

    const/16 v8, 0x30

    const/16 v9, 0x38

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lb30/v3;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, v1}, Lb30/v3;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, -0x486f2c80

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, p0

    goto :goto_2

    :cond_2
    :goto_1
    const v0, 0x7f0807dc

    const/4 v1, 0x0

    invoke-static {v0, v7, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    shl-int/lit8 p1, p1, 0x6

    and-int/lit16 p1, p1, 0x380

    or-int/lit8 v8, p1, 0x30

    const/16 v9, 0x78

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, Lb30/v3;

    const/4 v0, 0x5

    invoke-direct {p1, v2, p2, v0}, Lb30/v3;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v13, p2

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v1, 0x2c95b8f5

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v13

    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_2

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    const v2, -0x1a6f7841

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/b;

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    iget-wide v4, v2, Lg00/b;->o:J

    const v2, -0x548d6062

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/e;

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    iget-object v14, v2, Lg00/e;->f:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xff7fff

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x3

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v14 .. v28}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v2

    and-int/lit8 v11, v1, 0xe

    const/16 v12, 0x1e6

    const/4 v1, 0x0

    move-wide v3, v4

    move-object v5, v2

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v12}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lb30/z;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v13, v3}, Lb30/z;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final f(Lzy/c;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, -0x6860cf9c

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    int-to-float p1, p1

    const v1, -0x1a6f7841

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    iget-wide v1, v1, Lg00/b;->A:J

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, p1, v1, v2, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/16 v1, 0x10

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->a:Ll0/e;

    invoke-static {p0, v4}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0xc00

    const/4 v6, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lkotlin/jvm/internal/j;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ls2/e;Ll0/i;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Ll00/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Ll00/c;-><init>(Lzy/c;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v14, p2

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v1, 0x8c1db6d

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    sget-object v2, Li00/a;->a:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm40/w;

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x38

    int-to-float v4, v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, -0x1a6f7841

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/b;

    const/4 v15, 0x0

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    iget-wide v6, v6, Lg00/b;->c:J

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v6, v7, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-nez v0, :cond_4

    const v1, 0x374d47f2

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-static {v3, v10, v15}, Ll00/f;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    const v6, 0x374e3abd

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    new-instance v6, Landroidx/compose/ui/graphics/painter/ColorPainter;

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Lg00/b;->y:J

    invoke-direct {v6, v4, v5}, Landroidx/compose/ui/graphics/painter/ColorPainter;-><init>(J)V

    new-instance v4, Ll00/d;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v3}, Ll00/d;-><init>(ILandroidx/compose/ui/Modifier;)V

    const v5, -0x5b4ac530

    invoke-static {v5, v10, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    new-instance v4, Ll00/d;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v3}, Ll00/d;-><init>(ILandroidx/compose/ui/Modifier;)V

    const v5, -0x49a111c4

    invoke-static {v5, v10, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    and-int/lit8 v1, v1, 0xe

    const v4, 0x300001c0

    or-int v11, v1, v4

    const/4 v12, 0x6

    const/16 v13, 0x1b0

    move-object v1, v2

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v13}, Lds/q;->i(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lcp0/a;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v14, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final h(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzy/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    const-string v0, "userEmail"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pane"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAllowClick"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    const v0, -0x41bf0bcc

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/16 v7, 0x20

    goto :goto_1

    :cond_1
    const/16 v7, 0x10

    :goto_1
    or-int/2addr v0, v7

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v0, v7

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x800

    goto :goto_3

    :cond_3
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v0, v7

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x4000

    goto :goto_4

    :cond_4
    const/16 v7, 0x2000

    :goto_4
    or-int/2addr v0, v7

    move-object/from16 v7, p5

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/high16 v10, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v10, 0x10000

    :goto_5
    or-int/2addr v0, v10

    const v10, 0x12493

    and-int/2addr v10, v0

    const v11, 0x12492

    if-ne v10, v11, :cond_7

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_7
    :goto_6
    sget-object v10, Lh00/c0;->a:Lp1/b0;

    invoke-virtual {v9, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lh00/b0;

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v11, v9, v12}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v13

    invoke-virtual {v13}, Lf0/r1;->c()Z

    move-result v14

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    const v15, -0x872639e

    invoke-virtual {v9, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v15, :cond_8

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v8, v15, :cond_9

    :cond_8
    new-instance v8, Ll00/e;

    const/4 v15, 0x0

    invoke-direct {v8, v10, v13, v15}, Ll00/e;-><init>(Lh00/b0;Lf0/r1;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lc93/m;

    invoke-virtual {v9, v11}, Lp1/q;->q(Z)V

    invoke-static {v9, v8, v14}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v10, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v9}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v10

    iget-object v10, v10, Ll0/c2;->e:Ll0/b;

    invoke-static {v10, v9}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v10

    invoke-virtual {v10}, Ll0/x0;->a()F

    move-result v19

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v6, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v20, v0

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-eqz v0, :cond_a

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v11, v9, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v10, v5

    const-wide/16 v21, 0x0

    cmpl-double v10, v10, v21

    if-lez v10, :cond_d

    goto :goto_8

    :cond_d
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v10, v5, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v5, 0x14

    int-to-float v5, v5

    const/4 v11, 0x0

    const/4 v7, 0x2

    invoke-static {v10, v5, v11, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v7, 0xe

    invoke-static {v10, v13, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lb2/e;->N:Lb2/k;

    move/from16 v21, v7

    const/16 v7, 0x30

    invoke-static {v15, v13, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move-object/from16 v23, v8

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v24, v13

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    move-object/from16 v13, v23

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    move-object/from16 v13, v23

    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v7, v9, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v7, v20, 0xe

    invoke-static {v1, v9, v7}, Ll00/f;->g(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/16 v7, 0x10

    int-to-float v7, v7

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v9, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->getTitle()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static {v8, v9, v10}, Ll00/f;->l(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/16 v8, 0x18

    int-to-float v11, v8

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v9, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v8, v20, 0x3

    and-int/lit8 v8, v8, 0xe

    invoke-static {v2, v9, v8}, Ll00/f;->m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v9, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->getScopesSection()Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;

    move-result-object v8

    const/4 v10, 0x0

    invoke-static {v8, v9, v10}, Ll00/f;->k(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Landroidx/compose/runtime/Composer;I)V

    const/16 v8, 0x8

    int-to-float v8, v8

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v9, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v8, -0x691a640

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    if-nez v4, :cond_11

    goto :goto_a

    :cond_11
    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v9, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v4, v9, v10}, Ll00/f;->f(Lzy/c;Landroidx/compose/runtime/Composer;I)V

    :goto_a
    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v1, 0x2

    const/4 v10, 0x0

    invoke-static {v8, v5, v10, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v5, v24

    const/16 v8, 0x30

    invoke-static {v15, v5, v9, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move v15, v11

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_12

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v8, v9, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v9, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->getDisclaimer()Ljava/lang/String;

    move-result-object v0

    const v1, -0x6917bc2

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    if-nez v0, :cond_15

    const/4 v10, 0x0

    goto :goto_c

    :cond_15
    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v10, 0x0

    invoke-static {v0, v9, v10}, Ll00/f;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_c
    invoke-static {v9, v10, v14, v7, v9}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->getDenyButtonLabel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/model/ConsentUi$ConsentPane;->getAllowButtonLabel()Ljava/lang/String;

    move-result-object v6

    shr-int/lit8 v0, v20, 0x6

    and-int/lit16 v10, v0, 0x1f80

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    invoke-static/range {v5 .. v10}, Ll00/f;->b(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v8, 0x1

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_16

    new-instance v0, Lat2/b0;

    const/4 v8, 0x3

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lat2/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final i(Ll00/i;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p0

    move/from16 v8, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v0, -0x5e84dd11

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_2
    :goto_1
    iget-object v0, v2, Ll00/i;->E:Lec3/h2;

    const/4 v9, 0x0

    invoke-static {v0, v15, v9}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll00/j;

    iget-object v11, v1, Ll00/j;->d:Lcom/stripe/android/model/ConsentUi$ConsentPane;

    if-nez v11, :cond_3

    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Ll00/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v8, v3}, Ll00/b;-><init>(Ll00/i;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_3
    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll00/j;

    iget-object v10, v1, Ll00/j;->c:Ljava/lang/String;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll00/j;

    iget-object v12, v1, Ll00/j;->b:Ljava/lang/String;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll00/j;

    iget-object v13, v0, Ll00/j;->e:Lzy/c;

    const v0, -0x872a16a

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_4

    if-ne v1, v14, :cond_5

    :cond_4
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x15

    const/4 v1, 0x0

    const-class v3, Ll00/i;

    const-string v4, "onAllowClick"

    const-string v5, "onAllowClick()V"

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_5
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    const v0, -0x8729b8b

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_6

    if-ne v1, v14, :cond_7

    :cond_6
    new-instance v0, Lb30/i0;

    const/4 v6, 0x0

    const/16 v7, 0x16

    const/4 v1, 0x0

    const-class v3, Ll00/i;

    const-string v4, "onDenyClick"

    const-string v5, "onDenyClick()V"

    invoke-direct/range {v0 .. v7}, Lb30/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_7
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object v14, v1

    check-cast v14, Lc93/a;

    move-object/from16 v1, v16

    const/16 v16, 0x0

    move-object v9, v10

    move-object v10, v12

    move-object v12, v13

    move-object v13, v1

    invoke-static/range {v9 .. v16}, Ll00/f;->h(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzy/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Ll00/b;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v8, v3}, Ll00/b;-><init>(Ll00/i;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final j(Lm40/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p2

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v1, -0x55ceb826

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v1, p0

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p5, v2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v2, v5

    move-object/from16 v5, p3

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v2, v6

    and-int/lit16 v6, v2, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_5

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_5
    :goto_4
    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x0

    invoke-static {v6, v7, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v7, v10, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v3

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v3

    move-object/from16 v16, v11

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v7, 0xa

    int-to-float v7, v7

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v3, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v8, 0x24

    int-to-float v8, v8

    invoke-static {v8, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v10}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v8

    iget-wide v11, v8, Lg00/b;->c:J

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v11, v12, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v7, 0x7f0807dc

    const/4 v8, 0x0

    invoke-static {v7, v10, v8}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    invoke-static {v10}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v11

    iget-wide v11, v11, Lg00/b;->u:J

    new-instance v5, Li2/p;

    const/4 v8, 0x5

    invoke-direct {v5, v11, v12, v8}, Li2/p;-><init>(JI)V

    new-instance v8, Ll00/d;

    const/4 v11, 0x2

    invoke-direct {v8, v11, v3}, Ll00/d;-><init>(ILandroidx/compose/ui/Modifier;)V

    const v11, -0x59084da9

    invoke-static {v11, v10, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    new-instance v11, Ll00/d;

    const/4 v12, 0x3

    invoke-direct {v11, v12, v3}, Ll00/d;-><init>(ILandroidx/compose/ui/Modifier;)V

    const v12, 0x768b976b

    invoke-static {v12, v10, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v12, v2, 0x3

    and-int/lit8 v12, v12, 0xe

    const v16, 0x360001c0

    or-int v12, v12, v16

    shl-int/lit8 v16, v2, 0x3

    and-int/lit8 v16, v16, 0x70

    or-int v12, v12, v16

    move-object/from16 v16, v13

    const/4 v13, 0x6

    move-object/from16 v17, v14

    const/16 v14, 0x90

    const/4 v4, 0x0

    move-object/from16 v18, v6

    move-object v6, v7

    const/4 v7, 0x0

    move-object/from16 v19, v9

    move-object v9, v8

    const/4 v8, 0x1

    move-object v0, v11

    move-object v11, v10

    move-object v10, v0

    move/from16 v25, v2

    move-object/from16 v0, v16

    move-object/from16 v26, v18

    move-object/from16 v27, v19

    move-object v2, v1

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v14}, Lds/q;->i(Ljava/lang/String;Lm40/w;Landroidx/compose/ui/Modifier;Ly2/k;Li2/y;Ln2/a;Lb2/h;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v11

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_9

    goto :goto_6

    :cond_9
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    invoke-direct {v3, v1, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v1, 0x10

    int-to-float v4, v1

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v0, v17

    goto :goto_8

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v10, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v26

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    move-object/from16 v0, v27

    goto :goto_a

    :cond_c
    :goto_9
    move-object/from16 v0, v16

    goto :goto_b

    :goto_a
    invoke-static {v4, v10, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v10, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x29c9a780

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    if-eqz p2, :cond_d

    invoke-static {v10}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v0

    iget-object v0, v0, Lg00/e;->e:Ll3/v0;

    invoke-static {v10}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v1

    iget-wide v3, v1, Lg00/b;->m:J

    shr-int/lit8 v1, v25, 0x6

    and-int/lit8 v22, v1, 0xe

    const/16 v23, 0x0

    const v24, 0xfffa

    const/4 v1, 0x0

    move v6, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v12, v9

    move-object v11, v10

    const-wide/16 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v20, v0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    const/4 v15, 0x0

    :cond_d
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-static {v10}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v0

    iget-object v5, v0, Lg00/e;->d:Ll3/v0;

    invoke-static {v10}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v0

    iget-wide v3, v0, Lg00/b;->o:J

    shr-int/lit8 v0, v25, 0x9

    and-int/lit8 v11, v0, 0xe

    const/16 v12, 0x1e6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v0, p3

    invoke-static/range {v0 .. v12}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lat2/u;

    const/16 v6, 0x11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final k(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x20ad5531

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    sget-object v2, Li00/a;->a:Lp1/u2;

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, Lm40/w;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    move-object v4, v3

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v5, v2

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->getHeader()Ljava/lang/String;

    move-result-object v2

    const v7, -0x548d6062

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v6, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/e;

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    iget-object v7, v7, Lg00/e;->d:Ll3/v0;

    const v9, -0x1a6f7841

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    sget-object v10, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v6, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg00/b;

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    iget-wide v11, v11, Lg00/b;->o:J

    const/16 v25, 0x0

    const v26, 0xfff8

    move-object/from16 v23, v6

    move-object/from16 v22, v7

    const-wide/16 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v17, v4

    move/from16 v16, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x30

    move-object/from16 v0, v30

    move-object/from16 v1, v32

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v23

    const/16 v2, 0x10

    int-to-float v2, v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v8, 0x1

    int-to-float v3, v8

    const v14, -0x1a6f7841

    invoke-virtual {v6, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    const/4 v13, 0x0

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    iget-wide v4, v0, Lg00/b;->A:J

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-static {v1, v3, v4, v5, v0}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    invoke-static {v1, v2, v6, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_3

    invoke-virtual {v6, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x256ffcd9

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;->getScopes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;->getIcon()Lcom/stripe/android/model/ConsentUi$Icon;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsentUi$Icon;->getDefault()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;->getHeader()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;->getDescription()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x8

    move-object/from16 v2, v27

    invoke-static/range {v2 .. v7}, Ll00/f;->j(Lm40/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_6
    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lkk1/b;

    const/4 v2, 0x5

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lkk1/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final l(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, -0x4041daea

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    and-int/lit8 v4, v2, 0x3

    if-ne v4, v3, :cond_2

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v21, v1

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v4, -0x548d6062

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/e;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    iget-object v4, v4, Lg00/e;->a:Ll3/v0;

    const v6, -0x1a6f7841

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg00/b;

    invoke-virtual {v1, v5}, Lp1/q;->q(Z)V

    iget-wide v5, v6, Lg00/b;->m:J

    new-instance v12, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v12, v7}, Lw3/k;-><init>(I)V

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v22, v2, 0x30

    const/16 v23, 0x0

    const v24, 0xfdf8

    move-object/from16 v21, v1

    move-object v1, v3

    move-object/from16 v20, v4

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_2
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lb30/z;

    const/4 v3, 0x7

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lb30/z;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lp1/q;

    const v2, 0x5c52ead8

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    if-ne v4, v3, :cond_3

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_2
    const/4 v3, 0x1

    int-to-float v4, v3

    const v5, -0x1a6f7841

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    sget-object v6, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/b;

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-wide v9, v7, Lg00/b;->A:J

    sget-object v7, Lt0/j;->a:Lt0/i;

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v4, v9, v10, v7}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v7, v1, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v12, v1, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v1, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v1, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v9, v1, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v1, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0xc

    int-to-float v4, v4

    const/16 v7, 0xa

    int-to-float v7, v7

    invoke-static {v11, v4, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v7, -0x548d6062

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v1, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/e;

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-object v7, v7, Lg00/e;->d:Ll3/v0;

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/b;

    invoke-virtual {v1, v8}, Lp1/q;->q(Z)V

    iget-wide v5, v5, Lg00/b;->m:J

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v22, v2, 0x30

    const/16 v23, 0x0

    const v24, 0xfff8

    move-wide/from16 v26, v5

    move v6, v3

    move-wide/from16 v2, v26

    move-object/from16 v21, v1

    move-object v1, v4

    const-wide/16 v4, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v21

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_7

    new-instance v2, Lcp0/a;

    const/16 v3, 0x10

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, Lcp0/a;-><init>(Ljava/lang/String;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method
