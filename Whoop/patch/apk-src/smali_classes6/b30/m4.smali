.class public final Lb30/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;ZLc93/a;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/m4;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/m4;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/m4;->x:Z

    iput-object p3, p0, Lb30/m4;->E:Ljava/lang/Object;

    iput-boolean p4, p0, Lb30/m4;->y:Z

    return-void
.end method

.method public constructor <init>(ZLandroidx/compose/ui/Modifier;ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/m4;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/m4;->x:Z

    iput-object p2, p0, Lb30/m4;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lb30/m4;->y:Z

    iput-object p4, p0, Lb30/m4;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    move-object/from16 v0, p0

    iget v1, v0, Lb30/m4;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v3, v0, Lb30/m4;->E:Ljava/lang/Object;

    iget-object v4, v0, Lb30/m4;->z:Ljava/lang/Object;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    and-int/lit8 v9, v8, 0x3

    if-eq v9, v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    and-int/2addr v8, v7

    move-object v14, v1

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    move-object v9, v4

    check-cast v9, Lc93/a;

    check-cast v3, Lc93/a;

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    invoke-static {v1, v4, v14, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v14, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lm1/e0;->b:Lo2/e;

    const v4, -0x404b851f    # -1.41f

    const/high16 v5, -0x3f400000    # -6.0f

    const/high16 v6, 0x41400000    # 12.0f

    const v8, 0x4184b852    # 16.59f

    const/16 v10, 0x20

    const/high16 v11, 0x40c00000    # 6.0f

    if-eqz v1, :cond_4

    :goto_2
    move-object v10, v1

    goto/16 :goto_3

    :cond_4
    new-instance v15, Lo2/d;

    const/16 v23, 0x0

    const/16 v25, 0x60

    const-string v16, "AutoMirrored.Filled.KeyboardArrowLeft"

    const/high16 v17, 0x41c00000    # 24.0f

    const/high16 v18, 0x41c00000    # 24.0f

    const/high16 v19, 0x41c00000    # 24.0f

    const/high16 v20, 0x41c00000    # 24.0f

    const-wide/16 v21, 0x0

    const/16 v24, 0x1

    invoke-direct/range {v15 .. v25}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v12, Li2/x;->b:J

    invoke-direct {v1, v12, v13}, Li2/c1;-><init>(J)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v10}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v13, Lo2/m;

    const v10, 0x41768f5c    # 15.41f

    invoke-direct {v13, v10, v8}, Lo2/m;-><init>(FF)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, Lo2/l;

    const v13, 0x412d47ae    # 10.83f

    invoke-direct {v10, v13, v6}, Lo2/l;-><init>(FF)V

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, Lo2/t;

    const v13, 0x40928f5c    # 4.58f

    const v7, -0x3f6d1eb8    # -4.59f

    invoke-direct {v10, v13, v7}, Lo2/t;-><init>(FF)V

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lo2/l;

    const/high16 v10, 0x41600000    # 14.0f

    invoke-direct {v7, v10, v11}, Lo2/l;-><init>(FF)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lo2/t;

    invoke-direct {v7, v5, v11}, Lo2/t;-><init>(FF)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lo2/t;

    invoke-direct {v7, v11, v11}, Lo2/t;-><init>(FF)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lo2/t;

    const v10, 0x3fb47ae1    # 1.41f

    invoke-direct {v7, v10, v4}, Lo2/t;-><init>(FF)V

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v7, Lo2/i;->c:Lo2/i;

    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v15, v12, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v15}, Lo2/d;->b()Lo2/e;

    move-result-object v1

    sput-object v1, Lm1/e0;->b:Lo2/e;

    goto :goto_2

    :goto_3
    const v1, 0x7f1407df

    invoke-static {v14, v1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    const/16 v16, 0x8

    const/4 v12, 0x0

    iget-boolean v13, v0, Lb30/m4;->x:Z

    move v7, v11

    move-object v11, v1

    const/16 v1, 0x20

    invoke-static/range {v9 .. v16}, Ll1/f1;->h(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v9, Lm1/e0;->c:Lo2/e;

    if-eqz v9, :cond_5

    :goto_4
    move-object v10, v9

    goto :goto_5

    :cond_5
    new-instance v18, Lo2/d;

    const/16 v26, 0x0

    const/16 v28, 0x60

    const-string v19, "AutoMirrored.Filled.KeyboardArrowRight"

    const/high16 v20, 0x41c00000    # 24.0f

    const/high16 v21, 0x41c00000    # 24.0f

    const/high16 v22, 0x41c00000    # 24.0f

    const/high16 v23, 0x41c00000    # 24.0f

    const-wide/16 v24, 0x0

    const/16 v27, 0x1

    invoke-direct/range {v18 .. v28}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v9, v18

    sget v10, Lo2/f0;->a:I

    new-instance v10, Li2/c1;

    sget-wide v11, Li2/x;->b:J

    invoke-direct {v10, v11, v12}, Li2/c1;-><init>(J)V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lo2/m;

    const v12, 0x410970a4    # 8.59f

    invoke-direct {v1, v12, v8}, Lo2/m;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/l;

    const v8, 0x4152b852    # 13.17f

    invoke-direct {v1, v8, v6}, Lo2/l;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/l;

    const v6, 0x40ed1eb8    # 7.41f

    invoke-direct {v1, v12, v6}, Lo2/l;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/l;

    const/high16 v6, 0x41200000    # 10.0f

    invoke-direct {v1, v6, v7}, Lo2/l;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/t;

    invoke-direct {v1, v7, v7}, Lo2/t;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/t;

    invoke-direct {v1, v5, v7}, Lo2/t;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lo2/t;

    invoke-direct {v1, v4, v4}, Lo2/t;-><init>(FF)V

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lo2/i;->c:Lo2/i;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9, v11, v10}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v9}, Lo2/d;->b()Lo2/e;

    move-result-object v9

    sput-object v9, Lm1/e0;->c:Lo2/e;

    goto :goto_4

    :goto_5
    const v1, 0x7f1407de

    invoke-static {v14, v1}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const/4 v15, 0x0

    const/16 v16, 0x8

    const/4 v12, 0x0

    iget-boolean v13, v0, Lb30/m4;->y:Z

    move-object v9, v3

    invoke-static/range {v9 .. v16}, Ll1/f1;->h(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    return-object v2

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v7, p2

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    and-int/lit8 v7, v7, 0x3

    if-ne v7, v5, :cond_8

    move-object v5, v1

    check-cast v5, Lp1/q;

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    goto/16 :goto_10

    :cond_8
    :goto_7
    iget-boolean v5, v0, Lb30/m4;->x:Z

    if-eqz v5, :cond_9

    move-object v7, v1

    check-cast v7, Lp1/q;

    const v8, 0x6e63c8bb

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    sget-object v8, Ld40/q;->e:Ld40/k;

    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    invoke-static {v8, v9}, Ld40/r;->n(Ld40/k;Landroid/content/Context;)I

    move-result v8

    invoke-static {v8}, Li2/w0;->c(I)J

    move-result-wide v8

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_9
    move-object v7, v1

    check-cast v7, Lp1/q;

    const v8, 0x6e663195

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v8

    iget-wide v8, v8, Ld40/n;->b:J

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_8
    if-eqz v5, :cond_a

    move-object v7, v1

    check-cast v7, Lp1/q;

    const v10, 0x6e67eeb9

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    sget-object v10, Ld40/q;->e:Ld40/k;

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-static {v10, v11}, Ld40/r;->i(Ld40/k;Landroid/content/Context;)I

    move-result v10

    invoke-static {v10}, Li2/w0;->c(I)J

    move-result-wide v10

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_9
    move-wide/from16 v20, v10

    goto :goto_a

    :cond_a
    move-object v7, v1

    check-cast v7, Lp1/q;

    const v10, 0x6e6a5e99

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    invoke-static {v7}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v10

    iget-wide v10, v10, Ld40/n;->d:J

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    sget-object v7, Lg1/m5;->a:Lp1/u2;

    move-object v10, v1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/l5;

    iget-object v7, v7, Lg1/l5;->b:Lt0/i;

    check-cast v4, Landroidx/compose/ui/Modifier;

    invoke-static {v4, v8, v9, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v7, 0x4

    iget-boolean v8, v0, Lb30/m4;->y:Z

    if-eqz v8, :cond_b

    int-to-float v9, v7

    goto :goto_b

    :cond_b
    const/4 v9, 0x6

    int-to-float v9, v9

    :goto_b
    if-eqz v8, :cond_c

    int-to-float v7, v6

    goto :goto_c

    :cond_c
    int-to-float v7, v7

    :goto_c
    invoke-static {v4, v9, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    check-cast v3, Ljava/lang/String;

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    invoke-static {v1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v8

    move-object v9, v1

    check-cast v9, Lp1/q;

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v1, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v8, v9, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v1, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x6701c9e9

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    if-eqz v5, :cond_11

    const v4, -0x5abdd3eb

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    const-string v4, "Get "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_10
    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_e
    move-object/from16 v18, v3

    goto :goto_f

    :cond_11
    const v4, -0x5abb586b

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const v4, 0x7f141071

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3, v9}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    sget-object v3, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v9, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v3, v3, Lg1/h9;->l:Ll3/v0;

    sget-object v4, Ld40/q;->d:Ld40/s;

    iget-wide v4, v4, Ld40/s;->f:J

    const/16 v35, 0x0

    const v36, 0xfffffd

    const-wide/16 v23, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v22, v3

    move-wide/from16 v25, v4

    invoke-static/range {v22 .. v36}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v38

    const/16 v41, 0x0

    const v42, 0xfffa

    const/16 v19, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    move-object/from16 v39, v1

    invoke-static/range {v18 .. v42}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_10
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
