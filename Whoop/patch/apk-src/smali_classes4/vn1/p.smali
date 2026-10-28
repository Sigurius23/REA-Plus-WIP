.class public abstract Lvn1/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u008b\u0001\u0010\u0010\u001a\u00020\u00082\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u001a\u0008\u0002\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00080\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00082\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0019\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001d\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lm91/n;",
        "",
        "card",
        "nextCard",
        "",
        "stackSize",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function2;",
        "Lvn1/a;",
        "onReadCard",
        "Lvn1/i;",
        "notificationCardDismissAnimation",
        "changeNotificationCardDismissAnimation",
        "n",
        "(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "l",
        "(Lm91/n;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "A",
        "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;",
        "",
        "animate",
        "Ly3/f;",
        "animatedPadding",
        "home-notifications-center_release"
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
.method public static final A(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "$this$cardStackModifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1e

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lve0/d;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lve0/d;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Lsz0/p1;

    const/4 v1, 0x4

    invoke-direct {v0, p1, p2, v1}, Lsz0/p1;-><init>(JI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Li2/g0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Li2/x0;

    invoke-virtual {p0}, Li2/x0;->getDensity()F

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Li2/x0;->getDensity()F

    move-result v1

    mul-float/2addr v1, v0

    invoke-virtual {p0, v1}, Li2/x0;->E(F)V

    const v0, 0x3f6b851f    # 0.92f

    invoke-virtual {p0, v0}, Li2/x0;->p(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(JLk2/c;)Ll83/a0;
    .locals 12

    const-string v1, "$this$drawWithContent"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->getDensity()F

    const/4 v2, 0x3

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, La3/p0;->q0(F)F

    move-result v2

    invoke-virtual {v1}, La3/p0;->a()V

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/16 v5, 0x20

    shl-long/2addr v3, v5

    const-wide v5, 0xffffffffL

    and-long/2addr v1, v5

    or-long v7, v3, v1

    const/4 v10, 0x0

    const/16 v11, 0xf6

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    move-wide v1, p0

    move-object v0, p2

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a(Lvn1/i;Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1}, Lvn1/p;->v(Lvn1/i;Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvn1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvn1/p;->r(Lvn1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lvn1/p;->w(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvn1/p;->p(Ljava/lang/String;Lvn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/m;Lm91/n;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvn1/p;->x(Lc93/m;Lm91/n;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvn1/p;->y(Lm91/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvn1/p;->B(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lm91/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvn1/p;->m(Lm91/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(JLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvn1/p;->C(JLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvn1/p;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lvn1/p;->q(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lm91/n;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/n<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "nextCard"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x612dfb1f

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v2, 0x0

    const/4 v8, 0x1

    if-eq v1, v0, :cond_2

    move v0, v8

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->p()J

    move-result-wide v0

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v0, v1}, Lvn1/p;->A(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_3

    invoke-virtual {v5, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v5, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v6, p1, 0xe

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v1, p0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance p1, Lsl0/j2;

    const/16 v0, 0x18

    invoke-direct {p1, v1, p2, v0}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final m(Lm91/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lvn1/p;->l(Lm91/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/n<",
            "Ljava/lang/String;",
            ">;",
            "Lm91/n<",
            "Ljava/lang/String;",
            ">;I",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Lvn1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v10, p2

    move/from16 v11, p8

    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    const v1, -0x444df6c

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v7, v10}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :cond_6
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v6, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v1, v9

    :goto_6
    and-int/lit8 v9, p9, 0x10

    if-eqz v9, :cond_b

    or-int/lit16 v1, v1, 0x6000

    :cond_a
    move-object/from16 v12, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v12, v11, 0x6000

    if-nez v12, :cond_a

    move-object/from16 v12, p4

    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_7

    :cond_c
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v1, v13

    :goto_8
    and-int/lit8 v13, p9, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_d

    :goto_9
    or-int/2addr v1, v14

    goto :goto_b

    :cond_d
    and-int/2addr v14, v11

    if-nez v14, :cond_10

    if-nez p5, :cond_e

    const/4 v14, -0x1

    goto :goto_a

    :cond_e
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    :goto_a
    invoke-virtual {v7, v14}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x10000

    goto :goto_9

    :cond_10
    :goto_b
    and-int/lit8 v14, p9, 0x40

    const/high16 v16, 0x180000

    if-eqz v14, :cond_11

    or-int v1, v1, v16

    move-object/from16 v15, p6

    goto :goto_d

    :cond_11
    and-int v16, v11, v16

    move-object/from16 v15, p6

    if-nez v16, :cond_13

    invoke-virtual {v7, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v17, 0x80000

    :goto_c
    or-int v1, v1, v17

    :cond_13
    :goto_d
    const v17, 0x92493

    and-int v8, v1, v17

    const v2, 0x92492

    move/from16 v19, v9

    const/4 v9, 0x0

    if-eq v8, v2, :cond_14

    const/4 v2, 0x1

    goto :goto_e

    :cond_14
    move v2, v9

    :goto_e
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v7, v8, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_2e

    const/4 v8, 0x0

    if-eqz v3, :cond_15

    move-object v12, v8

    goto :goto_f

    :cond_15
    move-object v12, v4

    :goto_f
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_16

    new-instance v3, Lvb1/a;

    const/4 v4, 0x5

    invoke-direct {v3, v4}, Lvb1/a;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, v3

    :cond_17
    if-eqz v19, :cond_19

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_18

    new-instance v3, Lvk1/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lvk1/a;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lc93/m;

    goto :goto_10

    :cond_19
    move-object/from16 v3, p4

    :goto_10
    if-eqz v13, :cond_1a

    sget-object v4, Lvn1/i;->FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT:Lvn1/i;

    move-object v13, v4

    goto :goto_11

    :cond_1a
    move-object/from16 v13, p5

    :goto_11
    if-eqz v14, :cond_1c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1b

    new-instance v4, Lvb1/a;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lvb1/a;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v14, v4

    goto :goto_12

    :cond_1c
    move-object v14, v15

    :goto_12
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1d

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v15, v4

    check-cast v15, Lp1/c1;

    invoke-static {v15}, Lvn1/p;->s(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_1e

    int-to-float v4, v9

    const/4 v5, 0x4

    :goto_13
    int-to-float v5, v5

    mul-float/2addr v4, v5

    goto :goto_14

    :cond_1e
    const/4 v5, 0x4

    const/4 v4, 0x3

    int-to-float v4, v4

    goto :goto_13

    :goto_14
    const/16 v5, 0x1f4

    move/from16 v17, v1

    const/4 v1, 0x6

    invoke-static {v5, v9, v8, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/16 v5, 0x1b0

    move-object/from16 v19, v6

    const/16 v6, 0x8

    move-object/from16 v20, v3

    const-string v3, "animate_padding"

    move-object v9, v2

    move-object/from16 v22, v19

    move-object/from16 v23, v20

    move-object v2, v1

    move v1, v4

    move-object v4, v7

    move/from16 v7, v17

    invoke-static/range {v1 .. v6}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-int/lit16 v3, v7, 0x380

    const/16 v5, 0x100

    if-ne v3, v5, :cond_1f

    const/4 v3, 0x1

    goto :goto_15

    :cond_1f
    const/4 v3, 0x0

    :goto_15
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_20

    if-ne v5, v9, :cond_21

    :cond_20
    new-instance v5, Lvn1/p$a;

    invoke-direct {v5, v10, v15, v8}, Lvn1/p$a;-><init>(ILp1/c1;Lq83/d;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v5, Lc93/m;

    invoke-static {v4, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x70000

    and-int/2addr v2, v7

    const/high16 v3, 0x20000

    if-ne v2, v3, :cond_22

    const/4 v5, 0x1

    goto :goto_16

    :cond_22
    const/4 v5, 0x0

    :goto_16
    const/high16 v6, 0x380000

    and-int/2addr v6, v7

    const/high16 v7, 0x100000

    if-ne v6, v7, :cond_23

    const/4 v6, 0x1

    goto :goto_17

    :cond_23
    const/4 v6, 0x0

    :goto_17
    or-int/2addr v5, v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_24

    if-ne v6, v9, :cond_25

    :cond_24
    new-instance v6, Lvn1/p$b;

    invoke-direct {v6, v13, v14, v8}, Lvn1/p$b;-><init>(Lvn1/i;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v6, Lc93/m;

    invoke-static {v4, v6, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lvn1/p;->u(Lp1/t2;)F

    move-result v19

    const/16 v20, 0x7

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->H:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_26

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_26
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_18
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_27

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    :cond_27
    invoke-static {v6, v4, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v12, :cond_29

    const v1, 0x16b9da7

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move-object v1, v13

    move-object/from16 v25, v14

    goto :goto_19

    :cond_29
    const v1, 0x16b9da8

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lvn1/e;->a:Lvn1/e;

    invoke-virtual {v1}, Lvn1/e;->b()Lc93/n;

    move-result-object v18

    const v20, 0x186000

    const/16 v21, 0x2e

    move-object v1, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object v5, v15

    const/4 v15, 0x0

    const-string v16, "animate_card"

    const/16 v17, 0x0

    move-object/from16 v19, v4

    move-object/from16 v25, v5

    invoke-static/range {v12 .. v21}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    :goto_19
    if-nez v0, :cond_2a

    const v2, 0x16faab3

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    move-object v15, v1

    move-object v7, v4

    move-object/from16 v13, v22

    move-object/from16 v14, v23

    :goto_1a
    const/4 v0, 0x1

    goto :goto_1c

    :cond_2a
    const v5, 0x16faab4

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    if-ne v2, v3, :cond_2b

    const/4 v2, 0x1

    goto :goto_1b

    :cond_2b
    move v2, v6

    :goto_1b
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2c

    if-ne v3, v9, :cond_2d

    :cond_2c
    new-instance v3, Lrf/p;

    const/4 v2, 0x5

    invoke-direct {v3, v1, v2}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object v2, v3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lvn1/o;

    move-object/from16 v13, v22

    move-object/from16 v14, v23

    invoke-direct {v3, v0, v14, v13}, Lvn1/o;-><init>(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;)V

    const v5, -0x1d744285

    invoke-static {v5, v4, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const v8, 0x186000

    const/16 v9, 0x2a

    move-object v5, v1

    const/4 v1, 0x0

    move/from16 v24, v6

    move-object v6, v3

    const/4 v3, 0x0

    move-object v7, v4

    const-string v4, "animated_dismiss"

    move-object v15, v5

    const/4 v5, 0x0

    move/from16 v10, v24

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1c
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object/from16 v19, v7

    move-object v2, v12

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move-object/from16 v7, v25

    goto :goto_1d

    :cond_2e
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object v2, v4

    move-object v4, v6

    move-object/from16 v19, v7

    move-object v7, v15

    move-object/from16 v6, p5

    :goto_1d
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2f

    new-instance v0, Lvn1/n;

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v9, p9

    move v8, v11

    invoke-direct/range {v0 .. v9}, Lvn1/n;-><init>(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/lang/String;Lvn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lvn1/p;->n(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lvn1/i;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;)Z
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

.method private static final t(Lp1/c1;Z)V
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

.method private static final u(Lp1/t2;)F
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

.method private static final v(Lvn1/i;Lc0/q;)Lc0/l0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvn1/j;->a:Lvn1/j;

    invoke-virtual {v0, p1, p0}, Lvn1/j;->a(Lc0/q;Lvn1/i;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string p6, "$this$AnimatedContent"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "animatedCard"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    invoke-interface {p4}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p0}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    move-object v5, p5

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v5, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p0, p3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p0, :cond_0

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p3, p0, :cond_1

    :cond_0
    new-instance p3, Lk80/d;

    const/16 p0, 0xb

    invoke-direct {p3, p0, p1, p4}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v2, p3

    check-cast v2, Lc93/a;

    new-instance p0, Lbp0/q;

    const/4 p1, 0x5

    invoke-direct {p0, p1, p4, p2}, Lbp0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x5218c71b

    invoke-static {p1, v5, p0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0x8

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lvn1/s;->g(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lc93/m;Lm91/n;)Ll83/a0;
    .locals 1

    invoke-interface {p1}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvn1/a;->SWIPE:Lvn1/a;

    invoke-interface {p0, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lm91/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic z(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lvn1/p;->t(Lp1/c1;Z)V

    return-void
.end method
