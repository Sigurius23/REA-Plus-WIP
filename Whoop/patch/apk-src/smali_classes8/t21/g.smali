.class public abstract Lt21/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aG\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\n8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u001d\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lt21/h;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "P",
        "(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lt21/d;",
        "viewState",
        "Lkotlin/Function0;",
        "onAnimationFinished",
        "G",
        "(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "currentState",
        "A",
        "(Lt21/d;Landroidx/compose/runtime/Composer;I)V",
        "s",
        "(Lt21/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "milestonePillViewState",
        "Ly3/f;",
        "animatedHeight",
        "Li2/x;",
        "animatedBackgroundColor",
        "",
        "animatedBorderAlpha",
        "animatedLottieSize",
        "animatedIconPadding",
        "design_release"
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
.method private static final A(Lt21/d;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, -0x209722d9

    invoke-virtual {v3, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    if-eq v1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p1, v2

    invoke-virtual {v3, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lt21/d;->g()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lt21/a;->a:Lt21/a;

    invoke-virtual {p1}, Lt21/a;->d()F

    move-result p1

    :goto_3
    move v0, p1

    goto :goto_4

    :cond_3
    sget-object p1, Lt21/a;->a:Lt21/a;

    invoke-virtual {p1}, Lt21/a;->e()F

    move-result p1

    goto :goto_3

    :goto_4
    sget-object p1, Lt21/a;->a:Lt21/a;

    invoke-virtual {p1}, Lt21/a;->a()Ld0/l;

    move-result-object v1

    const/16 v4, 0x180

    const/16 v5, 0x8

    const-string v2, "lottie_size_animation"

    invoke-static/range {v0 .. v5}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v6

    invoke-virtual {p0}, Lt21/d;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lt21/a;->b()F

    move-result v0

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Lt21/a;->c()F

    move-result v0

    :goto_5
    invoke-virtual {p1}, Lt21/a;->a()Ld0/l;

    move-result-object v1

    const/16 v4, 0x180

    const/16 v5, 0x8

    const-string v2, "icon_padding_animation"

    invoke-static/range {v0 .. v5}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    invoke-virtual {p0}, Lt21/d;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_5

    new-instance v1, Lsz0/k;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lsz0/k;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v2, v1

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lfc0/c;

    const/4 v4, 0x7

    invoke-direct {v1, p0, p1, v6, v4}, Lfc0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, -0x79534556

    invoke-static {p1, v3, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x186180

    const/16 v9, 0x2a

    const/4 v1, 0x0

    move-object v7, v3

    const/4 v3, 0x0

    const-string v4, "MilestoneLottieDelayedSwitch"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lsl0/j2;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, v1}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final B(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final C(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final D(Lc0/q;)Lc0/l0;
    .locals 4

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {p0, p0, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    const/4 v2, 0x2

    invoke-static {p0, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object p0

    const/16 v3, 0x3e8

    invoke-static {v3, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {v0, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lt21/d;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 25

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->c()Li51/s;

    move-result-object v1

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    const/16 v9, 0x8

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-nez v1, :cond_0

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    const v2, 0x3eaf9696

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    move-object v1, v11

    goto :goto_0

    :cond_0
    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    const v2, 0x3eaf9697

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const-string v2, "MilestoneDynamicLottie"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v10

    int-to-float v4, v9

    mul-float/2addr v3, v4

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v4

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v6

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v7

    invoke-static {v2, v3, v6, v4, v7}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lt21/g;->B(Lp1/t2;)F

    move-result v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Li51/r;->d(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object v1, v8

    :goto_0
    if-nez v1, :cond_4

    move-object/from16 v1, p5

    check-cast v1, Lp1/q;

    const v2, 0x3eb60ee9

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->e()Lv41/r0;

    move-result-object v14

    if-nez v14, :cond_1

    const v2, 0x3eb60ee8

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_1
    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    if-eqz p4, :cond_2

    const-string v2, "MilestoneAnimatedLottie"

    goto :goto_1

    :cond_2
    const-string v2, "MilestoneStaticLottieImage"

    :goto_1
    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v10

    int-to-float v4, v9

    mul-float/2addr v3, v4

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v4

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v5

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v6

    invoke-static {v2, v3, v5, v4, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lt21/g;->B(Lp1/t2;)F

    move-result v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    if-eqz p4, :cond_3

    :goto_2
    move-object/from16 v21, v11

    goto :goto_3

    :cond_3
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    goto :goto_2

    :goto_3
    const/16 v23, 0x6000

    const/16 v24, 0xec

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v22, v1

    invoke-static/range {v13 .. v24}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    move-object v11, v8

    :goto_4
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    move-object v1, v11

    goto :goto_5

    :cond_4
    move-object/from16 v2, p5

    check-cast v2, Lp1/q;

    const v3, -0x71973ec1

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v12}, Lp1/q;->q(Z)V

    :goto_5
    if-nez v1, :cond_6

    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    const v1, 0x3ec129f3

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->d()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_5

    const v0, 0x3ec129f2

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_5
    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v13

    move-object/from16 v20, v5

    const-string v1, "MilestoneStaticImage"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v10

    int-to-float v2, v9

    mul-float/2addr v1, v2

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v2

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v3

    invoke-static/range {p1 .. p1}, Lt21/g;->C(Lp1/t2;)F

    move-result v4

    invoke-static {v0, v1, v3, v2, v4}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v21, 0x30

    const/16 v22, 0x78

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v13 .. v22}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    return-object v8

    :cond_6
    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x71973d04

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    return-object v8
.end method

.method private static final F(Lt21/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lt21/g;->A(Lt21/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lt21/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x6e00030c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :goto_4
    and-int/lit8 v8, p6, 0x8

    const/16 v9, 0x800

    if-eqz v8, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    move v12, v9

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v4, v12

    :goto_6
    and-int/lit16 v12, v4, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    if-eq v12, v14, :cond_b

    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v12, v15

    :goto_7
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v10, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_24

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v3, v14

    :cond_c
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_d

    new-instance v6, Lsz0/k;

    const/16 v7, 0x18

    invoke-direct {v6, v7}, Lsz0/k;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v12, v6

    goto :goto_8

    :cond_e
    move-object v12, v7

    :goto_8
    if-eqz v8, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_f

    new-instance v6, Lsr2/v;

    const/16 v7, 0x1a

    invoke-direct {v6, v7}, Lsr2/v;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lc93/a;

    goto :goto_9

    :cond_10
    move-object v6, v11

    :goto_9
    invoke-virtual {v2}, Lt21/d;->j()Z

    move-result v7

    if-nez v7, :cond_11

    invoke-virtual {v2}, Lt21/d;->i()Z

    move-result v7

    if-eqz v7, :cond_12

    :cond_11
    move-object/from16 v22, v6

    move-object v9, v10

    move-object v7, v12

    goto/16 :goto_16

    :cond_12
    invoke-virtual {v2}, Lt21/d;->g()Z

    move-result v7

    if-eqz v7, :cond_16

    const v7, 0x2ca26819

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lt21/d;->b()Ljava/lang/String;

    move-result-object v7

    and-int/lit16 v8, v4, 0x1c00

    if-ne v8, v9, :cond_13

    const/4 v8, 0x1

    goto :goto_a

    :cond_13
    move v8, v15

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_14

    if-ne v9, v0, :cond_15

    :cond_14
    new-instance v9, Lt21/g$a;

    const/4 v8, 0x0

    invoke-direct {v9, v6, v8}, Lt21/g$a;-><init>(Lc93/a;Lq83/d;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lc93/m;

    invoke-static {v10, v9, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_16
    const v7, 0x2ca50f8e

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v2}, Lt21/d;->g()Z

    move-result v7

    if-eqz v7, :cond_17

    sget-object v7, Lt21/a;->a:Lt21/a;

    invoke-virtual {v7}, Lt21/a;->f()F

    move-result v7

    goto :goto_c

    :cond_17
    sget-object v7, Lt21/a;->a:Lt21/a;

    invoke-virtual {v7}, Lt21/a;->g()F

    move-result v7

    :goto_c
    sget-object v8, Lt21/a;->a:Lt21/a;

    invoke-virtual {v8}, Lt21/a;->a()Ld0/l;

    move-result-object v8

    move-object v9, v10

    const/16 v10, 0x180

    const/16 v11, 0x8

    move-object/from16 v16, v6

    move v6, v7

    move-object v7, v8

    const-string v8, "milestone_pill_height_animation"

    move-object/from16 v22, v16

    invoke-static/range {v6 .. v11}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v16

    invoke-virtual {v2}, Lt21/d;->g()Z

    move-result v6

    if-eqz v6, :cond_18

    const v6, 0x2cac841d

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->v()J

    move-result-wide v6

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_18
    const v6, 0x2cad5845

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    const-wide v6, 0xff2e383cL

    invoke-static {v6, v7}, Li2/w0;->e(J)J

    move-result-wide v6

    :goto_d
    sget-object v8, Ld0/b0;->a:Ld0/v;

    const/16 v10, 0x12c

    move-object v11, v8

    invoke-static {v10, v15, v11, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v8

    move-object/from16 v17, v11

    const/16 v11, 0x180

    move-object/from16 v18, v12

    const/16 v12, 0x8

    move/from16 v19, v10

    move-object v10, v9

    const-string v9, "milestone_pill_background_color_animation"

    move-object/from16 v5, v17

    move-object/from16 p0, v18

    move/from16 v13, v19

    invoke-static/range {v6 .. v12}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v17

    move-object v9, v10

    invoke-virtual {v2}, Lt21/d;->g()Z

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_19

    move v6, v7

    goto :goto_e

    :cond_19
    const/4 v6, 0x0

    :goto_e
    invoke-static {v13, v15, v5, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/16 v11, 0xc00

    const/16 v12, 0x14

    const-string v8, "milestone_pill_border_alpha_animation"

    move-object v10, v9

    const/4 v9, 0x0

    move/from16 v23, v7

    move-object v7, v1

    move/from16 v1, v23

    invoke-static/range {v6 .. v12}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v5

    move-object v9, v10

    invoke-static/range {v16 .. v16}, Lt21/g;->K(Lp1/t2;)F

    move-result v6

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {v17 .. v17}, Lt21/g;->L(Lp1/t2;)J

    move-result-wide v7

    const/16 v10, 0x28

    invoke-static {v10}, Lt0/j;->b(I)Lt0/i;

    move-result-object v10

    invoke-static {v6, v7, v8, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v2}, Lt21/d;->g()Z

    move-result v7

    if-eqz v7, :cond_1a

    const v7, 0x2cb99c79

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lt21/d;->a()Ly81/e;

    move-result-object v7

    invoke-interface {v7, v9, v15}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v5}, Lt21/g;->M(Lp1/t2;)F

    move-result v5

    invoke-static {v14, v7, v8, v5}, Ljn2/c;->e(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1a
    const v5, 0x2cbd513e

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    move-object v5, v14

    :goto_f
    invoke-interface {v6, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit16 v6, v4, 0x380

    const/16 v7, 0x100

    if-ne v6, v7, :cond_1b

    const/4 v6, 0x1

    goto :goto_10

    :cond_1b
    move v6, v15

    :goto_10
    or-int/2addr v5, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1d

    if-ne v6, v0, :cond_1c

    goto :goto_11

    :cond_1c
    move-object/from16 v7, p0

    goto :goto_12

    :cond_1d
    :goto_11
    new-instance v6, Ls51/f;

    const/16 v0, 0xe

    move-object/from16 v7, p0

    invoke-direct {v6, v0, v2, v7}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_1e

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_13
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-nez v12, :cond_1f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_20

    :cond_1f
    invoke-static {v6, v9, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->K:Lb2/l;

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v12, v0, v9, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move/from16 p0, v13

    move-object/from16 v16, v14

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_21

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_21
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v9, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_22

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    :cond_22
    invoke-static {v12, v9, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v4, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v2, v9, v0}, Lt21/g;->A(Lt21/d;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    double-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v19, v1, v4

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    or-int/lit8 v0, v0, 0x30

    invoke-static {v2, v1, v9, v0, v15}, Lt21/g;->s(Lt21/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v22

    :goto_15
    move-object v1, v3

    move-object v3, v7

    goto :goto_18

    :goto_16
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, Lt21/f;

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v1, v3

    move-object/from16 v3, v18

    move-object/from16 v4, v22

    invoke-direct/range {v0 .. v7}, Lt21/f;-><init>(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;III)V

    :goto_17
    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_24
    move-object v9, v10

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v11

    goto :goto_15

    :goto_18
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, Lt21/f;

    const/4 v7, 0x1

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lt21/f;-><init>(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;III)V

    goto :goto_17

    :cond_25
    return-void
.end method

.method private static final H(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lt21/g;->G(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final L(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final M(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final N(Lt21/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lt21/d;->f()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lt21/g;->G(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final P(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lt21/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x72af5dae

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v11

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v9, 0x92

    const/4 v12, 0x0

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v12

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1b

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_a

    new-instance v5, Lsz0/k;

    const/16 v6, 0x13

    invoke-direct {v5, v6}, Lsz0/k;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_7

    :cond_b
    move-object v14, v6

    :goto_7
    new-instance v15, Lt21/d;

    const/16 v26, 0x3fe

    const/16 v27, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v15 .. v27}, Lt21/d;-><init>(ZZLjava/lang/String;Ly81/f;Lv41/r0;Lkd1/o;Li51/s;Ly81/e;ZLcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v5, 0x51c1188b

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v8, v6}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v5

    const-string v6, "safe-design-view-model-injection-android"

    invoke-interface {v5, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    const-class v6, Lt21/c;

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-nez v5, :cond_12

    const v5, -0x2a32dbfc

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_c

    const v5, -0x2a322beb

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v5, v9

    move-object v9, v10

    const/4 v7, 0x0

    goto :goto_a

    :cond_c
    const v5, -0x2a322bea

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v5

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_e

    if-ne v7, v1, :cond_d

    goto :goto_8

    :cond_d
    move-object v5, v9

    move-object v9, v10

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v5, Lld1/b;

    invoke-direct {v5, v15}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v5

    move-object/from16 v21, v9

    move-object/from16 v19, v10

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v7

    move-object/from16 v9, v19

    move-object/from16 v5, v21

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v7, Lld1/c;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v7, :cond_11

    const v6, -0x2a2a887e

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_f

    if-ne v6, v1, :cond_10

    :cond_f
    new-instance v6, Lld1/b;

    invoke-direct {v6, v15}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v7, v6

    check-cast v7, Lld1/b;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v5, -0x1a22aa39

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v13, v7

    goto :goto_e

    :cond_12
    move-object v5, v9

    move-object v9, v10

    const v7, -0x2a28ba09

    invoke-static {v8, v7, v12, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v7

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    instance-of v13, v10, Landroid/app/Application;

    if-eqz v13, :cond_13

    check-cast v10, Landroid/app/Application;

    move-object/from16 v17, v10

    goto :goto_d

    :cond_13
    const/16 v17, 0x0

    :goto_d
    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v8, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_14

    if-ne v13, v1, :cond_15

    :cond_14
    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v5

    move-object/from16 v19, v9

    move-object/from16 v16, v15

    move-object v15, v7

    invoke-static/range {v15 .. v20}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    move-object/from16 v15, v16

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v7, v13

    check-cast v7, Lld1/c;

    goto :goto_c

    :goto_e
    invoke-virtual {v13}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    move-object v6, v15

    const/4 v15, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-virtual {v2}, Lt21/h;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v9, v3, 0x70

    if-ne v9, v11, :cond_16

    const/4 v12, 0x1

    :cond_16
    or-int/2addr v7, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_17

    if-ne v9, v1, :cond_18

    :cond_17
    new-instance v9, Lt21/g$b;

    invoke-direct {v9, v13, v2, v15}, Lt21/g$b;-><init>(Lld1/c;Lt21/h;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v9, Lc93/m;

    invoke-static {v8, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lt21/g;->R(Lp1/t2;)Lt21/d;

    move-result-object v6

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_19

    if-ne v7, v1, :cond_1a

    :cond_19
    new-instance v7, Lh31/r;

    const/4 v1, 0x4

    invoke-direct {v7, v13, v1}, Lh31/r;-><init>(Lld1/c;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v7, Lc93/a;

    and-int/lit16 v10, v3, 0x38e

    const/4 v11, 0x0

    move-object v5, v0

    move-object v9, v8

    move-object v8, v7

    move-object v7, v14

    invoke-static/range {v5 .. v11}, Lt21/g;->G(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    move-object v1, v5

    move-object v3, v7

    goto :goto_f

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_f
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lt01/e;

    const/4 v6, 0x2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final Q(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lp1/t2;)Lt21/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lt21/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt21/d;

    return-object p0
.end method

.method private static final S(Lld1/c;)Ll83/a0;
    .locals 1

    sget-object v0, Lt21/b$a;->a:Lt21/b$a;

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt21/g;->P(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lt21/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt21/g;->z(Lt21/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(I)I
    .locals 0

    invoke-static {p0}, Lt21/g;->u(I)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lt21/g;->O(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lt21/g;->I()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lt21/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt21/g;->N(Lt21/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(I)I
    .locals 0

    invoke-static {p0}, Lt21/g;->v(I)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0}, Lt21/g;->D(Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lt21/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt21/g;->F(Lt21/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(I)I
    .locals 0

    invoke-static {p0}, Lt21/g;->w(I)I

    move-result p0

    return p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt21/g;->T(Landroidx/compose/ui/Modifier;Lt21/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lt21/g;->J(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt21/g;->Q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lt21/d;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt21/g;->y(Lt21/d;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lt21/d;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt21/g;->E(Lt21/d;Lp1/t2;Lp1/t2;Lc0/o;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(I)I
    .locals 0

    invoke-static {p0}, Lt21/g;->x(I)I

    move-result p0

    return p0
.end method

.method public static synthetic p(Lld1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt21/g;->S(Lld1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lt21/d;Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1}, Lt21/g;->t(Lt21/d;Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt21/g;->H(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lt21/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, -0x51a5dc3a

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    const/4 v10, 0x0

    if-eq v1, v2, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    move v1, v10

    :goto_4
    and-int/2addr p2, v3

    invoke-virtual {v7, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_a

    if-eqz v0, :cond_6

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_6
    invoke-virtual {p0}, Lt21/d;->b()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_7

    const p2, -0x74545250    # -6.612814E-32f

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v0, -0x7454524f

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {p2, v7, v10}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_8

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v1, p2, :cond_9

    :cond_8
    new-instance v1, Lrq0/x;

    const/16 p2, 0x10

    invoke-direct {v1, p0, p2}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v2, v1

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance p2, Lb01/o;

    const/4 v1, 0x4

    invoke-direct {p2, v1, p0, p1}, Lb01/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x1a2ae5de

    invoke-static {v1, v7, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x186000

    const/16 v9, 0x2a

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-string v4, "milestoneCountAnimation"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_5
    move-object v3, p1

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v0, Lqk2/i;

    const/16 v5, 0x1b

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final t(Lt21/d;Lc0/q;)Lc0/l0;
    .locals 2

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt21/d;->g()Z

    move-result p0

    if-eqz p0, :cond_3

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_1
    const/4 p1, 0x1

    const/4 v1, 0x0

    if-lt v0, p0, :cond_2

    new-instance p0, Lsz0/k;

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lsz0/k;-><init>(I)V

    invoke-static {v1, p0, p1}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object p0

    new-instance v0, Lsz0/k;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lsz0/k;-><init>(I)V

    invoke-static {p1, v0}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lsz0/k;

    const/16 v0, 0x16

    invoke-direct {p0, v0}, Lsz0/k;-><init>(I)V

    invoke-static {v1, p0, p1}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object p0

    new-instance v0, Lsz0/k;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lsz0/k;-><init>(I)V

    invoke-static {p1, v0}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lc0/c1;->a:Lc0/d1;

    sget-object p1, Lc0/e1;->a:Lc0/f1;

    invoke-static {p0, p1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final u(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final v(I)I
    .locals 0

    return p0
.end method

.method private static final w(I)I
    .locals 0

    return p0
.end method

.method private static final x(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final y(Lt21/d;Landroidx/compose/ui/Modifier;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$AnimatedContent"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textToDisplay"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->g()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x2615ffa7

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->a()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x26177df2

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lt21/d;->h()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lt21/d;->g()Z

    move-result v0

    const/4 v5, 0x6

    if-eqz v0, :cond_1

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v6, 0x26199a44

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->C()Lb91/a;

    move-result-object v5

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_1
    move-object/from16 v21, v5

    goto :goto_2

    :cond_1
    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v6, 0x261aa984

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->E()Lb91/a;

    move-result-object v5

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_1

    :goto_2
    shr-int/lit8 v0, p5, 0x3

    and-int/lit8 v24, v0, 0xe

    const/16 v25, 0x0

    const v26, 0x2fff8

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v2, p1

    move-object/from16 v23, p4

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lt21/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lt21/g;->s(Lt21/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
