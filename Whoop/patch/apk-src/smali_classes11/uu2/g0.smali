.class public abstract Luu2/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001aE\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkd1/o;",
        "image",
        "",
        "videoUrl",
        "imageContentDescription",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onPlayVideo",
        "f",
        "(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "icon",
        "n",
        "(ILandroidx/compose/runtime/Composer;II)V",
        "",
        "isPressed",
        "imageModifier",
        "weightlifting_release"
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
.method public static synthetic a(IILp1/c1;Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luu2/g0;->l(IILp1/c1;Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Luu2/g0;->m(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Luu2/g0;->o(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLkd1/o;FLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Luu2/g0;->h(ZLkd1/o;FLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkd1/o;FLjava/lang/String;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Luu2/g0;->i(Lkd1/o;FLjava/lang/String;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnusedBoxWithConstraintsScope"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkd1/o;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v10, p4

    move/from16 v0, p6

    const-string v1, "onPlayVideo"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, -0x26f937e1

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v0, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_9

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_5

    :cond_8
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_9
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_b

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x4000

    goto :goto_6

    :cond_a
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    and-int/lit16 v7, v6, 0x2493

    const/16 v8, 0x2492

    const/4 v13, 0x0

    const/4 v9, 0x1

    if-eq v7, v8, :cond_c

    move v7, v9

    goto :goto_7

    :cond_c
    move v7, v13

    :goto_7
    and-int/2addr v6, v9

    invoke-virtual {v12, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_d

    move-object v1, v5

    goto :goto_8

    :cond_d
    move-object/from16 v1, p0

    :goto_8
    if-eqz v3, :cond_f

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_9

    :cond_e
    move v9, v13

    :cond_f
    :goto_9
    xor-int/lit8 v14, v9, 0x1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_10

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_10
    check-cast v6, Lj0/i;

    const/4 v7, 0x6

    invoke-static {v6, v12, v7}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v7

    invoke-static {v7}, Luu2/g0;->g(Lp1/t2;)Z

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v7, :cond_11

    if-nez v9, :cond_11

    const/high16 v7, 0x3f000000    # 0.5f

    move v15, v7

    goto :goto_a

    :cond_11
    move v15, v8

    :goto_a
    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v8, 0x3ff33333    # 1.9f

    invoke-static {v7, v13, v8}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-nez v9, :cond_12

    new-instance v9, Li3/i;

    invoke-direct {v9, v13}, Li3/i;-><init>(I)V

    const/16 v11, 0xc

    move-object v8, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v13, v16

    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_b

    :cond_12
    move-object v13, v7

    :goto_b
    invoke-interface {v13, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->t()J

    move-result-wide v8

    const/4 v10, 0x0

    int-to-float v10, v10

    mul-float/2addr v10, v7

    new-instance v7, Luu2/f0;

    invoke-direct {v7, v14, v2, v15, v4}, Luu2/f0;-><init>(ZLkd1/o;FLjava/lang/String;)V

    const v11, -0x264c84fe

    invoke-static {v11, v12, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/high16 v13, 0x1b0000

    const/16 v14, 0x18

    move-wide v7, v8

    const/4 v9, 0x0

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v1, p0

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Lj81/e;

    const/16 v8, 0x1d

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lj81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final g(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final h(ZLkd1/o;FLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 35

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v8, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v6, v8, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v0, Lcom/whoop/bot/settings/g;

    const/4 v6, 0x2

    move-object/from16 v7, p1

    move/from16 v9, p2

    move-object/from16 v10, p3

    invoke-direct {v0, v7, v9, v10, v6}, Lcom/whoop/bot/settings/g;-><init>(Ljava/lang/Object;FLjava/lang/Object;I)V

    const v6, -0x76d7ae22

    invoke-static {v6, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0xc06

    const/4 v10, 0x6

    move-object v0, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    if-eqz p0, :cond_a

    const v4, -0x116ee5e8

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb2/e;->y:Lb2/m;

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v5, v1, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v9, 0x0

    const/16 v10, 0x9

    const/16 v16, 0x0

    move/from16 v17, v6

    move-object/from16 p0, v4

    move/from16 p2, v6

    move/from16 p4, v9

    move/from16 p5, v10

    move/from16 p1, v16

    move/from16 p3, v17

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v30, p2

    const-wide/high16 v9, 0x3fc0000000000000L    # 0.125

    double-to-float v6, v9

    mul-float/2addr v6, v7

    sget-wide v9, Li2/x;->f:J

    const v2, 0x3e4ccccd    # 0.2f

    move-object/from16 p4, v1

    invoke-static {v2, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v1

    move-object/from16 p0, v5

    int-to-float v5, v3

    mul-float/2addr v5, v7

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v4, v6, v1, v2, v3}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-wide v2, Li2/x;->b:J

    const v4, 0x3dcccccd    # 0.1f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    mul-float/2addr v2, v7

    invoke-static {v1, v5, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v8, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v3, v8, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v8, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lcu2/h;->p1:I

    invoke-static {v8, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->M()Lb91/a;

    move-result-object v24

    move-object v1, v13

    move-object v2, v14

    const/16 v31, 0x0

    invoke-static/range {v31 .. v31}, Lv63/c;->h(I)J

    move-result-wide v13

    const v3, 0x3f333333    # 0.7f

    invoke-static {v3, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v6

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v28, v3, 0x12

    const v29, 0x2ff7a

    const/4 v5, 0x0

    move-object/from16 v26, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-object v3, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    move-object/from16 v19, v18

    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v25, v22

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v33, v27

    const v27, 0xc00180

    move-object/from16 v34, v2

    move-object v2, v1

    move-object/from16 v1, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v32

    move-object/from16 v32, v0

    move-object/from16 v0, p0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    sget-object v4, Lb2/e;->G:Lb2/m;

    move-object/from16 v5, p4

    invoke-virtual {v0, v5, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move/from16 v7, v30

    move-object/from16 p0, v0

    move/from16 p3, v4

    move/from16 p5, v5

    move/from16 p2, v6

    move/from16 p4, v7

    move/from16 p1, v30

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v8, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v33

    invoke-static {v8, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    move-object/from16 v1, v34

    goto :goto_5

    :cond_9
    :goto_4
    move-object/from16 v1, v32

    goto :goto_6

    :goto_5
    invoke-static {v4, v8, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v8, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v3, v8, v3, v4}, Luu2/g0;->n(ILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    move v4, v3

    move v3, v2

    const v0, -0x115d09a6

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkd1/o;FLjava/lang/String;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p3

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p5, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p5

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v5

    :goto_2
    and-int/2addr v1, v4

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v3

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v13, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->c()F

    move-result v0

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_3

    const/16 v1, 0xf

    int-to-float v1, v1

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lp1/c1;

    if-nez p0, :cond_4

    const v0, 0x2b1402cb

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    :goto_3
    move-object v6, v0

    goto :goto_4

    :cond_4
    const v4, -0x1fa4840a

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->e(I)Z

    move-result v4

    invoke-virtual {v13, v0}, Lp1/q;->e(I)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_5

    if-ne v6, v3, :cond_6

    :cond_5
    new-instance v6, Lp21/d;

    const/4 v3, 0x1

    invoke-direct {v6, v2, v0, v1, v3}, Lp21/d;-><init>(IILp1/c1;I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x1

    const/4 v7, 0x0

    move-object/from16 v6, p0

    move-object v9, v13

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    if-nez v6, :cond_7

    const v0, 0x2b18ccde

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v0, 0x2b18ccdf

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-static {v1}, Luu2/g0;->j(Lp1/c1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, p1

    invoke-static {v1, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v14, 0x6000

    const/16 v15, 0x68

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->a:Ly2/b1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lp1/c1;)Landroidx/compose/ui/Modifier;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/Modifier;

    return-object p0
.end method

.method private static final k(Lp1/c1;Landroidx/compose/ui/Modifier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroidx/compose/ui/Modifier;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(IILp1/c1;Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p0, p1}, Lmh/h;->d(II)V

    new-instance p0, Lph/a;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lph/a;-><init>(II)V

    iput-object p0, p3, Lmh/h;->j:Lph/e;

    new-instance p0, Luu2/g0$a;

    invoke-direct {p0, p2}, Luu2/g0$a;-><init>(Lp1/c1;)V

    iput-object p0, p3, Lmh/h;->e:Lmh/i;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Luu2/g0;->f(Landroidx/compose/ui/Modifier;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(ILandroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x45d725d

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v5, p0}, Lp1/q;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x0

    const/4 v8, 0x1

    if-eq v2, v0, :cond_2

    move v0, v8

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v5, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_5

    :goto_3
    and-int/lit8 p1, p1, -0xf

    goto :goto_5

    :cond_4
    :goto_4
    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_5

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object p0

    invoke-virtual {p0}, Lgz0/w;->u()I

    move-result p0

    goto :goto_3

    :cond_5
    :goto_5
    invoke-virtual {v5}, Lp1/q;->r()V

    int-to-float v0, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-wide v6, Li2/x;->f:J

    int-to-float v4, v8

    invoke-static {v0, v4, v1, v6, v7}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->E:Lb2/m;

    invoke-static {v4, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v4, v5, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shl-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0x70

    or-int/lit8 p1, p1, 0x6

    invoke-static {p0, v5, p1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget p1, Lgy0/f;->H1:I

    invoke-static {v5, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p1

    const-wide/high16 v3, 0x3ffa000000000000L    # 1.625

    double-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide v3, 0xff121212L

    invoke-static {v3, v4}, Li2/w0;->e(J)J

    move-result-wide v3

    const/16 v6, 0xd80

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lid2/q;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, p3, v1}, Lid2/q;-><init>(IIII)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final o(IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Luu2/g0;->n(ILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic p(Lp1/c1;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-static {p0, p1}, Luu2/g0;->k(Lp1/c1;Landroidx/compose/ui/Modifier;)V

    return-void
.end method
