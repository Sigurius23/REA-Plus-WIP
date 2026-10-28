.class public abstract Lea2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u007f\u0010\u000c\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002$\u0010\u0007\u001a \u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00042,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a3\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0004H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017\u00b2\u0006\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClick",
        "onClearInteractorCache",
        "Lkotlin/Function1;",
        "",
        "Lcom/whoop/data/onboarding/OnboardingStatus;",
        "onLoadOnboardingStatuses",
        "Lkotlin/Function2;",
        "",
        "",
        "onUpdateOnboardingStatus",
        "l",
        "(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "featureType",
        "isCompleted",
        "onToggle",
        "A",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "onboardingStatuses",
        "isLoading",
        "searchQuery",
        "app_prodStandardRelease"
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
.method private static final A(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x8be3da0

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v14, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, v4, 0x30

    const/16 v5, 0x20

    if-nez v1, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v5

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v4, 0x180

    const/16 v6, 0x100

    if-nez v1, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v6

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v1, v7, :cond_6

    move v1, v9

    goto :goto_4

    :cond_6
    move v1, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v14, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v7, "_"

    const-string v10, " "

    invoke-static {v1, v7, v10, v8}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "toLowerCase(...)"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v11

    const-string v12, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "toUpperCase(...)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const-string v7, "substring(...)"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_7
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v14, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->W0()J

    move-result-wide v12

    const/16 v15, 0x8

    int-to-float v15, v15

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v7, v12, v13, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit16 v7, v0, 0x380

    if-ne v7, v6, :cond_8

    move v6, v9

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_9

    move v0, v9

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    or-int/2addr v0, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v5, v0, :cond_b

    :cond_a
    new-instance v5, Lbv2/b;

    const/4 v0, 0x1

    invoke-direct {v5, v3, v2, v0}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v20, v5

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v5, v9

    const v6, 0x3e99999a    # 0.3f

    if-eqz v2, :cond_c

    const v7, 0x728ede8d

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X()J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v6

    const/4 v8, 0x0

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    const/4 v8, 0x0

    const v7, 0x72904082

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->f()J

    move-result-wide v9

    invoke-static {v6, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v6

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    :goto_7
    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v0, v5, v6, v7, v8}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    new-instance v0, La31/c;

    const/4 v6, 0x2

    invoke-direct {v0, v2, v3, v1, v6}, La31/c;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x681cc2d0

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x76

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lar2/f;

    const/16 v5, 0xa

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 40

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p4, 0x1

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_e

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v4, v5, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v6, v9, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v12, v0

    const-wide/16 v14, 0x0

    cmpl-double v1, v12, v14

    if-lez v1, :cond_4

    goto :goto_2

    :cond_4
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v12, v9, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v9, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    invoke-static {v12, v9, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v16

    sget-object v12, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v9, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg1/h9;

    iget-object v13, v13, Lg1/h9;->i:Ll3/v0;

    const/4 v14, 0x4

    int-to-float v14, v14

    const/4 v15, 0x7

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v2, v18

    move-object/from16 v29, v19

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v30, v14

    const/16 v27, 0x0

    const v28, 0xfff8

    move-object v12, v8

    move-object/from16 v25, v9

    const-wide/16 v8, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object v14, v5

    move-object v5, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    move-object/from16 v18, v14

    const-wide/16 v13, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v21, v6

    move-wide/from16 v38, v16

    move-object/from16 v17, v7

    move-wide/from16 v6, v38

    const/16 v16, 0x0

    move-object/from16 v23, v17

    move-object/from16 v22, v18

    const-wide/16 v17, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x30

    move-object/from16 p3, v0

    move/from16 p4, v1

    move-object/from16 v0, v31

    move-object/from16 v37, v32

    move-object/from16 v3, v33

    move-object/from16 v36, v34

    move-object/from16 v1, v35

    move-object/from16 v31, v4

    move-object/from16 v4, p2

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v4, v3, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v9, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v9, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v31

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    move-object/from16 v0, v36

    goto :goto_6

    :cond_a
    :goto_5
    move-object/from16 v0, v37

    goto :goto_7

    :goto_6
    invoke-static {v4, v9, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz p0, :cond_b

    const v3, 0x4d0ca856    # 1.4749014E8f

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    move-object/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X()J

    move-result-wide v5

    const/4 v7, 0x0

    :goto_8
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_b
    move-object/from16 v3, p3

    move/from16 v4, p4

    const/4 v7, 0x0

    const v5, 0x4d0cac61    # 1.475067E8f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->f()J

    move-result-wide v5

    goto :goto_8

    :goto_9
    invoke-static/range {v30 .. v30}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v2, v5, v6, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v9, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    if-eqz p0, :cond_c

    const-string v0, "Completed"

    goto :goto_a

    :cond_c
    const-string v0, "Not Completed"

    :goto_a
    if-eqz p0, :cond_d

    const v1, 0x4d0cdaf6    # 1.476975E8f

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v1

    const/4 v7, 0x0

    :goto_b
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move-wide v6, v1

    move-object/from16 v1, v29

    goto :goto_c

    :cond_d
    const/4 v7, 0x0

    const v1, 0x4d0cdf01    # 1.4771406E8f

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->f()J

    move-result-wide v1

    goto :goto_b

    :goto_c
    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->l:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xfffa

    const/4 v5, 0x0

    move-object/from16 v25, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move/from16 v24, v4

    move-object v4, v0

    move/from16 v0, v24

    move-object/from16 v24, v1

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v25

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v3, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v6

    invoke-virtual {v3, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    invoke-virtual {v3, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f()J

    move-result-wide v11

    const-wide/16 v20, 0x0

    const/16 v23, 0x3e4

    const/4 v8, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v22, v9

    move-wide v9, v1

    invoke-static/range {v4 .. v23}, Ltx/f;->A(JJFJJFJJJJLandroidx/compose/runtime/Composer;I)Lg1/x1;

    move-result-object v8

    move-object/from16 v25, v22

    const/4 v10, 0x0

    const/16 v11, 0x1c

    const/4 v6, 0x0

    const/4 v7, 0x0

    move/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v9, v25

    invoke-static/range {v4 .. v11}, Lg1/r7;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/o7;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lea2/n;->A(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic E(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lea2/n;->l(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic F(Lp1/c1;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lea2/n;->m(Lp1/c1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(Lp1/c1;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lea2/n;->v(Lp1/c1;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic H(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lea2/n;->x(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic I(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lea2/n;->A(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static synthetic a(Lp1/c1;Lcom/whoop/data/onboarding/FeatureEducationType;Lcom/whoop/data/onboarding/FeatureEducationType;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lea2/n;->r(Lp1/c1;Lcom/whoop/data/onboarding/FeatureEducationType;Lcom/whoop/data/onboarding/FeatureEducationType;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lea2/n;->D(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lea2/n;->t(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lea2/n;->n(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lea2/n;->u(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lea2/n;->B(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lea2/n;->q(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lea2/n;->p(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/profile/view/edit/c;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lea2/n;->s(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic j(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lea2/n;->C(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/c1;Lp1/c1;Lc93/m;Lc93/a;Landroid/content/Context;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lea2/n;->o(Lp1/c1;Lp1/c1;Lc93/m;Lc93/a;Landroid/content/Context;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v5, p5

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x5e17f563

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    move-object/from16 v9, p0

    if-nez v0, :cond_1

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v5, 0x30

    if-nez v2, :cond_3

    move-object/from16 v2, p1

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    goto :goto_3

    :cond_3
    move-object/from16 v2, p1

    :goto_3
    and-int/lit16 v6, v5, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_5

    :cond_6
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    goto :goto_6

    :cond_7
    move-object/from16 v6, p3

    :goto_6
    and-int/lit16 v10, v0, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    if-eq v10, v11, :cond_8

    const/4 v10, 0x1

    goto :goto_7

    :cond_8
    move v10, v13

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_9

    sget-object v10, Lm83/y;->w:Lm83/y;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v11, :cond_a

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v11, :cond_b

    const-string v14, ""

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, Lp1/c1;

    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/content/Context;

    and-int/lit16 v4, v0, 0x380

    if-ne v4, v7, :cond_c

    const/4 v4, 0x1

    goto :goto_8

    :cond_c
    move v4, v13

    :goto_8
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_d

    if-ne v7, v11, :cond_e

    :cond_d
    new-instance v7, Lea2/n$a;

    const/4 v4, 0x0

    invoke-direct {v7, v3, v8, v10, v4}, Lea2/n$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lc93/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v12, v7, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v2, v12, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 v18, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-eqz v3, :cond_f

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v12, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v13, v12, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v30, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v1, "ONBOARDING STATUS DEBUG"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/w;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v33

    const v47, 0xfffa

    const/16 v48, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v30 .. v48}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v1, v1, 0x3

    shl-int/lit8 v2, v0, 0x9

    and-int/lit16 v2, v2, 0x1c00

    or-int v13, v1, v2

    const/16 v14, 0x35

    const/4 v6, 0x0

    move-object v1, v8

    const/4 v8, 0x0

    move-object v2, v10

    const/4 v10, 0x0

    move-object v3, v11

    const/4 v11, 0x0

    move-object/from16 p4, v3

    move-object v3, v1

    move-object v1, v2

    move-object/from16 v2, p4

    move-object/from16 p4, v15

    move-object/from16 v4, v18

    move-object v15, v7

    move-object/from16 v7, v30

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v6, "Search feature education types..."

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v6, 0x2

    int-to-float v9, v6

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v9, v10

    const/4 v11, 0x0

    invoke-static {v15, v9, v11, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v21, 0x0

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v22, v9

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_12

    new-instance v9, Laq1/d;

    const/16 v13, 0x1a

    invoke-direct {v9, v13, v4}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v13, 0x3

    or-int/lit8 v14, v14, 0x6

    shl-int/lit8 v13, v13, 0x6

    or-int v24, v14, v13

    const/16 v25, 0x6000

    const/16 v26, 0x3ff8

    move/from16 v13, v22

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move v14, v10

    move/from16 v16, v11

    const-wide/16 v10, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    const/16 v30, 0x20

    const/16 v17, 0x0

    move/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move-object/from16 v36, v1

    move-object/from16 v30, v4

    move-object/from16 v4, v35

    move-object/from16 v1, p4

    move-object/from16 p4, v3

    move/from16 v3, v32

    invoke-static/range {v6 .. v26}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v23

    invoke-static/range {p4 .. p4}, Lea2/n;->w(Lp1/c1;)Z

    move-result v6

    if-eqz v6, :cond_13

    const v0, 0x5670ed0e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v29, 0x0

    const v30, 0x1fff8

    const-string v6, "Loading onboarding statuses..."

    const-wide/16 v10, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x36

    invoke-static/range {v6 .. v30}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    goto/16 :goto_c

    :cond_13
    const v6, 0x56781dec

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v3, v6, v7}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v3

    const/4 v13, 0x1

    int-to-float v6, v13

    mul-float v6, v6, v33

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    and-int/lit16 v6, v0, 0x1c00

    const/16 v7, 0x800

    if-ne v6, v7, :cond_14

    move v6, v13

    goto :goto_a

    :cond_14
    const/4 v6, 0x0

    :goto_a
    and-int/lit8 v0, v0, 0x70

    const/16 v7, 0x20

    if-ne v0, v7, :cond_15

    move v0, v13

    goto :goto_b

    :cond_15
    const/4 v0, 0x0

    :goto_b
    or-int/2addr v0, v6

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_16

    if-ne v6, v2, :cond_17

    :cond_16
    new-instance v6, Lam2/r;

    move-object/from16 v10, p1

    move-object/from16 v9, p3

    move-object v11, v1

    move-object/from16 v8, v30

    move-object/from16 v7, v36

    invoke-direct/range {v6 .. v11}, Lam2/r;-><init>(Lp1/c1;Lp1/c1;Lc93/m;Lc93/a;Landroid/content/Context;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6186

    const/16 v17, 0x1ea

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v49, v13

    const/4 v13, 0x0

    move-object v8, v3

    move-object v9, v14

    move-object/from16 v15, v23

    move/from16 v0, v49

    move-object v14, v6

    move-object v6, v4

    invoke-static/range {v6 .. v17}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_18
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Le51/a;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Le51/a;-><init>(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final m(Lp1/c1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final n(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_0

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lea2/n;->z(Lp1/c1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lhy0/x0$a;

    if-eqz p1, :cond_1

    const-string p1, ""

    invoke-static {p0, p1}, Lea2/n;->z(Lp1/c1;Ljava/lang/String;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;Lp1/c1;Lc93/m;Lc93/a;Landroid/content/Context;Ln0/q;)Ll83/a0;
    .locals 16

    move-object/from16 v5, p0

    move-object/from16 v6, p5

    const-string v0, "$this$LazyColumn"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lea2/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v5}, Lea2/g;-><init>(ILp1/c1;)V

    new-instance v1, Lx1/b;

    const/4 v7, 0x1

    const v2, 0xc3c768e

    invoke-direct {v1, v0, v7, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-static {v6, v8, v1, v9}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v10, " "

    const-string v11, "_"

    const/4 v12, 0x0

    const-string v13, "toLowerCase(...)"

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11, v10, v12}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v11, v12}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4, v12}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_2
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/whoop/profile/view/edit/c;

    const/4 v2, 0x2

    invoke-direct {v0, v2, v5}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    new-instance v2, Lea2/l;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    sget-object v0, Lea2/n$c;->w:Lea2/n$c;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v14

    new-instance v15, Lea2/n$d;

    invoke-direct {v15, v0, v1}, Lea2/n$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lea2/n$e;

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lea2/n$e;-><init>(Ljava/util/List;Lc93/m;Lc93/a;Landroid/content/Context;Lp1/c1;)V

    new-instance v1, Lx1/b;

    const v2, 0x2fd4df92

    invoke-direct {v1, v0, v7, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v0, v6

    check-cast v0, Ln0/f;

    invoke-virtual {v0, v14, v8, v15, v1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v0

    array-length v1, v0

    move v2, v12

    :goto_2
    if-ge v2, v1, :cond_5

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v11, v10, v12}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v14, v12}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4, v12}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-instance v0, Lea2/g;

    const/4 v1, 0x2

    move-object/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lea2/g;-><init>(ILp1/c1;)V

    new-instance v1, Lx1/b;

    const v2, 0x4d50bc93    # 2.1887621E8f

    invoke-direct {v1, v0, v7, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v6, v8, v1, v9}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    :cond_6
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget p3, Lx81/d;->b:I

    invoke-virtual {p2, v9, p3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->W0()J

    move-result-wide p2

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-static {p1, p2, p3, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    new-instance p2, Lcom/whoop/profile/view/edit/c;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p0}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const p0, 0x79d280fe

    invoke-static {p0, v9, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0xc00000

    const/16 v11, 0x76

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v11}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    const/16 v0, 0x10

    int-to-float v0, v0

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v6, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v8, v4, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v4, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, Ll0/m;->g:Ll0/h;

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v12, v13, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v4, v11, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    :cond_5
    invoke-static {v13, v4, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v4, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v6, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v4, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    invoke-static {v1, v4, v1, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v4, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    sget-object v6, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/h9;

    iget-object v11, v6, Lg1/h9;->f:Ll3/v0;

    const/4 v6, 0x4

    int-to-float v9, v6

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v27, 0x0

    const v28, 0xfff8

    move-object/from16 v25, v4

    const-string v4, "Onboarding Status Overview"

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x36

    move-wide/from16 v30, v0

    move-object v0, v5

    move-object v5, v6

    move-wide/from16 v6, v30

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v25

    invoke-static/range {p0 .. p0}, Lea2/n;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    const/16 v29, 0x0

    if-eqz v5, :cond_a

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_a

    move v5, v3

    goto :goto_5

    :cond_a
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v3

    :cond_b
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {v6}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result v6

    if-eqz v6, :cond_b

    add-int/lit8 v5, v5, 0x1

    if-ltz v5, :cond_c

    goto :goto_4

    :cond_c
    invoke-static {}, Lwb3/f;->c0()V

    throw v29

    :cond_d
    :goto_5
    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v4

    array-length v4, v4

    const-string v6, " / "

    const-string v7, " total"

    const-string v8, "Completed: "

    invoke-static {v5, v4, v8, v6, v7}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    const v7, 0x3f4ccccd    # 0.8f

    invoke-static {v5, v1, v6, v7}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v6

    sget-object v5, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v1, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/h9;

    iget-object v5, v5, Lg1/h9;->j:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xfffa

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v1

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-static/range {p0 .. p0}, Lea2/n;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_e

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e

    move v5, v3

    goto :goto_7

    :cond_e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v3

    :cond_f
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {v6}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result v6

    if-eqz v6, :cond_f

    add-int/lit8 v5, v5, 0x1

    if-ltz v5, :cond_10

    goto :goto_6

    :cond_10
    invoke-static {}, Lwb3/f;->c0()V

    throw v29

    :cond_11
    :goto_7
    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v4

    array-length v4, v4

    if-lez v4, :cond_12

    int-to-float v5, v5

    int-to-float v4, v4

    div-float/2addr v5, v4

    goto :goto_8

    :cond_12
    const/4 v5, 0x0

    :goto_8
    const/16 v4, 0x3c

    int-to-float v4, v4

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X()J

    move-result-wide v7

    const v9, 0x3e4ccccd    # 0.2f

    invoke-static {v9, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    const/16 v9, 0x1e

    int-to-float v9, v9

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v0, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Lb2/e;->E:Lb2/m;

    invoke-static {v7, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_13

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_13
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v1, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_14

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_15

    :cond_14
    invoke-static {v7, v1, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x64

    int-to-float v0, v0

    mul-float/2addr v5, v0

    float-to-int v0, v5

    const-string v3, "%"

    invoke-static {v0, v3}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v1, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v6

    sget-object v3, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v1, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/h9;

    iget-object v3, v3, Lg1/h9;->l:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xfffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object v4, v0

    move-object/from16 v25, v1

    move-object/from16 v24, v3

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    invoke-static {v1, v2, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_a

    :cond_16
    move-object v1, v4

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lp1/c1;Lcom/whoop/data/onboarding/FeatureEducationType;Lcom/whoop/data/onboarding/FeatureEducationType;)I
    .locals 4

    invoke-static {p0}, Lea2/n;->m(Lp1/c1;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {v3}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v3

    if-ne v3, p1, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lcom/whoop/data/onboarding/OnboardingStatus;

    const/4 p1, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result v0

    goto :goto_1

    :cond_2
    move v0, p1

    :goto_1
    invoke-static {p0}, Lea2/n;->m(Lp1/c1;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/whoop/data/onboarding/OnboardingStatus;

    invoke-virtual {v3}, Lcom/whoop/data/onboarding/OnboardingStatus;->getType()Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v3

    if-ne v3, p2, :cond_3

    move-object v2, v1

    :cond_4
    check-cast v2, Lcom/whoop/data/onboarding/OnboardingStatus;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/data/onboarding/OnboardingStatus;->isCompleted()Z

    move-result p0

    goto :goto_2

    :cond_5
    move p0, p1

    :goto_2
    if-eqz v0, :cond_6

    if-nez p0, :cond_6

    const/4 p0, -0x1

    return p0

    :cond_6
    if-nez v0, :cond_7

    if-eqz p0, :cond_7

    const/4 p0, 0x1

    return p0

    :cond_7
    return p1
.end method

.method private static final s(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final t(Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x20

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lea2/n;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "No feature education types found matching \""

    const-string v2, "\""

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    const v5, 0x3f19999a    # 0.6f

    invoke-static {v1, v4, v2, v5}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v6

    sget-object v1, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v4, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/h9;

    iget-object v1, v1, Lg1/h9;->i:Ll3/v0;

    const/16 v27, 0x0

    const v28, 0xfffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v24, v1

    move-object/from16 v25, v4

    move-object v4, v0

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lea2/n;->l(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/util/List<",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final w(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final x(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final y(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final z(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
