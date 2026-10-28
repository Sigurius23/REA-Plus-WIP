.class public abstract Ljs2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a?\u0010\n\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a5\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a5\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\r\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lfs2/l;",
        "callState",
        "Lhs2/e$d;",
        "viewState",
        "Lfs2/m;",
        "videoCallUiProvider",
        "Lkotlin/Function1;",
        "Lhs2/a;",
        "Ll83/a0;",
        "onEvent",
        "E",
        "(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "o",
        "(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "s",
        "",
        "showPermissionsModal",
        "video-call_release"
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
.method private static final A(Lhs2/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lhs2/e$c;->b()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lhs2/a$e;

    invoke-direct {v0, p0}, Lhs2/a$e;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-static {p0, p1}, Ljs2/f;->v(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhs2/a$d;->a:Lhs2/a$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljs2/f;->s(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfs2/l;",
            "Lhs2/e$d;",
            "Lfs2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCallUiProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x37bc6016

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v1, v5, 0x30

    if-nez v1, :cond_5

    and-int/lit8 v1, v5, 0x40

    if-nez v1, :cond_3

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    :cond_3
    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_3
    if-eqz v1, :cond_4

    const/16 v1, 0x20

    goto :goto_4

    :cond_4
    const/16 v1, 0x10

    :goto_4
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v5, 0x180

    if-nez v1, :cond_8

    and-int/lit16 v1, v5, 0x200

    if-nez v1, :cond_6

    invoke-virtual {v9, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_5

    :cond_6
    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_5
    if-eqz v1, :cond_7

    const/16 v1, 0x100

    goto :goto_6

    :cond_7
    const/16 v1, 0x80

    :goto_6
    or-int/2addr v0, v1

    :cond_8
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_9

    or-int/lit16 v0, v0, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v2, v5, 0xc00

    if-nez v2, :cond_b

    invoke-virtual {v9, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x800

    goto :goto_7

    :cond_a
    const/16 v2, 0x400

    :goto_7
    or-int/2addr v0, v2

    :cond_b
    :goto_8
    and-int/lit16 v2, v0, 0x493

    const/16 v3, 0x492

    const/4 v4, 0x0

    if-eq v2, v3, :cond_c

    const/4 v2, 0x1

    goto :goto_9

    :cond_c
    move v2, v4

    :goto_9
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v9, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    if-eqz v1, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p3, v1, :cond_d

    new-instance p3, Ljp2/f;

    const/4 v1, 0x5

    invoke-direct {p3, v1}, Ljp2/f;-><init>(I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast p3, Lkotlin/jvm/functions/Function1;

    :cond_e
    move-object v8, p3

    instance-of p3, p0, Lfs2/l$a;

    if-eqz p3, :cond_f

    const p3, -0x3a2491ae

    invoke-virtual {v9, p3}, Lp1/q;->e0(I)V

    sget p3, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/models/modal/DialogModel;->$stable:I

    or-int/2addr p3, v1

    sget v1, Lc41/p2;->v:I

    or-int/2addr p3, v1

    sget v1, Lhy0/h0;->h:I

    or-int/2addr p3, v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v1, v0, 0xe

    or-int/2addr p3, v1

    and-int/lit8 v1, v0, 0x70

    or-int/2addr p3, v1

    and-int/lit16 v0, v0, 0x380

    or-int v10, p3, v0

    const/4 v11, 0x0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v6 .. v11}, Ljs2/f;->o(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    instance-of p3, p0, Lfs2/l$e;

    if-eqz p3, :cond_10

    const p3, -0x3a2483f2

    invoke-virtual {v9, p3}, Lp1/q;->e0(I)V

    sget p3, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/models/modal/DialogModel;->$stable:I

    or-int/2addr p3, v1

    sget v1, Lc41/p2;->v:I

    or-int/2addr p3, v1

    sget v1, Lhy0/h0;->h:I

    or-int/2addr p3, v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v1, v0, 0xe

    or-int/2addr p3, v1

    and-int/lit8 v1, v0, 0x70

    or-int/2addr p3, v1

    and-int/lit16 v0, v0, 0x380

    or-int v10, p3, v0

    const/4 v11, 0x0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v6 .. v11}, Ljs2/f;->s(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_10
    instance-of p3, p0, Lfs2/l$d;

    if-nez p3, :cond_12

    instance-of p3, p0, Lfs2/l$b;

    if-nez p3, :cond_12

    instance-of p3, p0, Lfs2/l$c;

    if-nez p3, :cond_12

    instance-of p3, p0, Lfs2/l$f;

    if-nez p3, :cond_12

    if-nez p0, :cond_11

    goto :goto_a

    :cond_11
    const p0, -0x3a24974e

    invoke-static {p0, v9, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_12
    :goto_a
    const p3, -0xa68b1aa

    invoke-virtual {v9, p3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_b
    move-object v4, v8

    goto :goto_c

    :cond_13
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, p3

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_14

    new-instance v0, Lg1/m3;

    const/16 v7, 0x17

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final F(Lhs2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ljs2/f;->E(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lhs2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->p(Lhs2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljs2/f;->r(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhs2/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljs2/f;->A(Lhs2/e$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljs2/f;->G(Lfs2/l;Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->q(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->w(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljs2/f;->B(Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroid/content/Context;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljs2/f;->y(Landroid/content/Context;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->x(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->C(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lhs2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->F(Lhs2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lhs2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljs2/f;->t(Lhs2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljs2/f;->D(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhs2/e$d;",
            "Lfs2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v3, -0x65cefa53

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v4, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v4

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v4, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_4

    :cond_4
    const/16 v5, 0x10

    :goto_4
    or-int/2addr v3, v5

    :cond_5
    and-int/lit8 v5, p5, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    move v8, v6

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    :goto_6
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_9

    move v8, v11

    goto :goto_7

    :cond_9
    move v8, v10

    :goto_7
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_12

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_a

    new-instance v5, Ljp2/f;

    const/4 v7, 0x6

    invoke-direct {v5, v7}, Ljp2/f;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v5, v7

    :goto_8
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v12, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_c

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    :cond_d
    invoke-static {v12, v0, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v7, v3, 0x380

    if-ne v7, v6, :cond_f

    move v10, v11

    :cond_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v10, :cond_10

    if-ne v6, v8, :cond_11

    :cond_10
    new-instance v6, Ljp1/l;

    const/16 v7, 0xa

    invoke-direct {v6, v5, v7}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lc93/a;

    invoke-virtual {v1}, Lhs2/e$d;->b()Lhs2/c;

    move-result-object v7

    sget v8, Lhy0/h0;->h:I

    shl-int/lit8 v8, v8, 0x3

    shl-int/lit8 v3, v3, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v8

    invoke-interface {v2, v6, v7, v0, v3}, Lfs2/m;->b(Lc93/a;Lhs2/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    move-object v3, v5

    goto :goto_a

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, v7

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Ljs2/d;

    const/4 v6, 0x1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljs2/d;-><init>(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final p(Lhs2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhs2/a$f;->a:Lhs2/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljs2/f;->o(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhs2/e$d;",
            "Lfs2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x298654be

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_4

    :cond_4
    const/16 v6, 0x10

    :goto_4
    or-int/2addr v0, v6

    :cond_5
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v9, v10, :cond_9

    move v9, v13

    goto :goto_7

    :cond_9
    move v9, v12

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_30

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_a

    new-instance v6, Ljp2/f;

    const/4 v8, 0x7

    invoke-direct {v6, v8}, Ljp2/f;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v6, v8

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_c

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lp1/c1;

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-static {v8}, Ljs2/f;->u(Lp1/c1;)Z

    move-result v14

    const/16 v38, 0x0

    if-eqz v14, :cond_14

    const v14, -0x473a5c0a

    invoke-virtual {v11, v14}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v14

    invoke-virtual {v14}, Lhs2/e$e;->e()Lcom/whoop/design/models/modal/DialogModel;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/design/models/modal/DialogModel;->getTitle()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v14}, Lcom/whoop/design/models/modal/DialogModel;->getDescription()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_d

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    goto :goto_9

    :cond_d
    move-object/from16 v16, v38

    :goto_9
    invoke-virtual {v14}, Lcom/whoop/design/models/modal/DialogModel;->getPrimaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v17

    if-eqz v17, :cond_e

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_e

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    goto :goto_a

    :cond_e
    move-object/from16 v17, v38

    :goto_a
    invoke-virtual {v14}, Lcom/whoop/design/models/modal/DialogModel;->getSecondaryButton()Lcom/whoop/design/models/modal/DialogButton;

    move-result-object v18

    if-eqz v18, :cond_f

    invoke-virtual/range {v18 .. v18}, Lcom/whoop/design/models/modal/DialogButton;->getTitle()Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_f

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    goto :goto_b

    :cond_f
    move-object/from16 v18, v38

    :goto_b
    invoke-virtual {v14}, Lcom/whoop/design/models/modal/DialogModel;->getShowCloseButton()Z

    move-result v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_10

    new-instance v5, Lg11/b;

    const/16 v7, 0x1c

    invoke-direct {v5, v7, v8}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v27, v5

    check-cast v27, Lc93/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_11

    new-instance v5, Lg11/b;

    const/16 v7, 0x1d

    invoke-direct {v5, v7, v8}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v28, v5

    check-cast v28, Lc93/a;

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_12

    if-ne v7, v9, :cond_13

    :cond_12
    new-instance v7, Lj11/q;

    const/16 v5, 0xd

    invoke-direct {v7, v5, v10, v8}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v29, v7

    check-cast v29, Lc93/a;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v5, 0x3

    shl-int/lit8 v10, v5, 0x6

    or-int/2addr v7, v10

    shl-int/lit8 v10, v5, 0x9

    or-int/2addr v7, v10

    shl-int/lit8 v5, v5, 0x1b

    or-int v34, v7, v5

    const/16 v36, 0xd80

    const v37, 0xe37edf1

    const/4 v5, 0x0

    move-object v7, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v33, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v22, v6

    move-object v6, v15

    const/4 v15, 0x0

    move-object/from16 v23, v7

    move-object/from16 v7, v16

    const/16 v16, 0x0

    move-object/from16 v24, v8

    move-object/from16 v8, v17

    move/from16 v17, v14

    move-object/from16 v14, v18

    const/16 v18, 0x0

    const/16 v25, 0x100

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move-object/from16 v31, v22

    const/16 v22, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v39, v25

    const/16 v25, 0x0

    move/from16 v40, v26

    const/16 v26, 0x0

    move/from16 v41, v30

    const/16 v30, 0x0

    move-object/from16 v42, v31

    const/16 v31, 0x0

    move-object/from16 v43, v32

    const/16 v32, 0x0

    move-object/from16 v44, v35

    const/high16 v35, 0x30000000

    move/from16 v4, v39

    move/from16 v3, v40

    move-object/from16 v1, v42

    move-object/from16 v2, v43

    invoke-static/range {v5 .. v37}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v11, v33

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    move-object v1, v6

    move-object/from16 v44, v8

    move-object v2, v9

    move v3, v12

    const/16 v4, 0x100

    const v5, -0x472c22c0

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_c
    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v11, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_15

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_d
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_17

    :cond_16
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v11, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v5

    invoke-virtual {v5}, Lhs2/e$e;->c()Lhs2/e$b;

    move-result-object v5

    invoke-virtual {v5}, Lhs2/e$b;->a()Lhs2/e$c;

    move-result-object v5

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v8

    invoke-virtual {v8}, Lhs2/e$e;->c()Lhs2/e$b;

    move-result-object v8

    invoke-virtual {v8}, Lhs2/e$b;->b()Ljava/lang/String;

    move-result-object v8

    const-string v13, ""

    if-eqz v8, :cond_19

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_18

    goto :goto_f

    :cond_18
    :goto_e
    move-object/from16 v17, v8

    goto :goto_10

    :cond_19
    :goto_f
    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    goto :goto_e

    :goto_10
    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v19

    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Lhs2/e$c;->c()Lgz0/m0;

    move-result-object v18

    if-eqz v18, :cond_1a

    invoke-virtual/range {v18 .. v18}, Lgz0/m0;->toWhoopIcon()I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    move-object/from16 v21, v18

    goto :goto_11

    :cond_1a
    move-object/from16 v21, v38

    :goto_11
    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Lhs2/e$c;->a()Ljava/lang/String;

    move-result-object v38

    :cond_1b
    if-nez v38, :cond_1c

    move-object/from16 v22, v13

    goto :goto_12

    :cond_1c
    move-object/from16 v22, v38

    :goto_12
    const v33, 0xffca

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v4, :cond_1d

    const/16 v17, 0x1

    goto :goto_13

    :cond_1d
    move/from16 v17, v3

    :goto_13
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v17, :cond_1e

    if-ne v3, v2, :cond_1f

    :cond_1e
    new-instance v3, Ljp1/l;

    const/16 v4, 0xb

    invoke-direct {v3, v1, v4}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v3, Lc93/a;

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v17, v0

    const/16 v0, 0x100

    if-ne v13, v0, :cond_20

    const/4 v0, 0x1

    goto :goto_14

    :cond_20
    const/4 v0, 0x0

    :goto_14
    or-int/2addr v0, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_21

    if-ne v4, v2, :cond_22

    :cond_21
    new-instance v4, Lj11/q;

    const/16 v0, 0xe

    invoke-direct {v4, v5, v1, v0}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v4, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v5, 0x3

    shl-int/2addr v0, v5

    move/from16 v18, v13

    const/16 v13, 0x25

    move/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 p3, v12

    move v12, v0

    move-object v0, v9

    move-object v9, v4

    move-object/from16 v4, p3

    move-object/from16 p3, v16

    move-object/from16 v16, v6

    move-object/from16 v6, p3

    move-object/from16 v31, v1

    move-object/from16 v46, v8

    move-object/from16 p3, v14

    move/from16 v47, v18

    move/from16 v14, v19

    move-object/from16 v1, v20

    move-object v8, v3

    move-object/from16 v3, v21

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v5

    invoke-virtual {v5}, Lhs2/e$e;->d()Lc41/p2;

    move-result-object v6

    const/16 v12, 0x8

    const/4 v13, 0x0

    if-nez v6, :cond_23

    const v5, -0x6586957e

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    move-object v8, v11

    move/from16 v19, v14

    const/4 v11, 0x2

    const/4 v14, 0x1

    :goto_15
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_16

    :cond_23
    const v5, -0x6586957d

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x4

    int-to-float v5, v5

    int-to-float v7, v12

    mul-float/2addr v5, v7

    const/4 v8, 0x2

    invoke-static {v15, v5, v13, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/4 v5, 0x1

    int-to-float v9, v5

    mul-float v22, v9, v7

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_24

    new-instance v9, Ljs2/e;

    const/4 v10, 0x0

    move-object/from16 v5, v44

    invoke-direct {v9, v10, v5}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v5, Lc41/p2;->v:I

    shl-int/2addr v5, v14

    or-int/lit16 v5, v5, 0x186

    const/4 v10, 0x0

    move-object/from16 v19, v9

    move v9, v5

    move-object v5, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v11

    move v11, v8

    move-object/from16 v8, v19

    move/from16 v19, v14

    const/4 v14, 0x1

    invoke-static/range {v5 .. v10}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    float-to-double v6, v5

    const-wide/16 v9, 0x0

    cmpl-double v6, v6, v9

    if-lez v6, :cond_25

    move v6, v14

    goto :goto_17

    :cond_25
    const/4 v6, 0x0

    :goto_17
    if-nez v6, :cond_26

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_26
    invoke-static {v5, v5, v14}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v5, v12

    mul-float v7, v5, v5

    invoke-static {v6, v7, v13, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_27

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_27
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v8, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_29

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_28

    goto :goto_1a

    :cond_28
    :goto_19
    move-object/from16 v7, p3

    goto :goto_1b

    :cond_29
    :goto_1a
    invoke-static {v10, v8, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v8, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->b()Lhs2/c;

    move-result-object v6

    invoke-virtual {v6}, Lhs2/c;->a()Lhs2/b;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->a()Z

    move-result v10

    sget v12, Lhy0/h0;->h:I

    shl-int/lit8 v13, v17, 0x3

    and-int/lit16 v13, v13, 0x380

    or-int/2addr v12, v13

    move-object/from16 v13, p1

    invoke-interface {v13, v6, v10, v8, v12}, Lfs2/m;->a(Lhs2/b;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v11, v11

    mul-float/2addr v11, v5

    const/4 v12, 0x6

    int-to-float v12, v12

    mul-float/2addr v12, v5

    invoke-static {v10, v12, v11, v12, v11}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->N:Lb2/k;

    const/16 v12, 0x30

    move-object/from16 v6, v16

    invoke-static {v6, v11, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_2a

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_2b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    :cond_2b
    invoke-static {v11, v8, v11, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v8, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v0

    invoke-virtual {v0}, Lhs2/e$e;->b()Ljava/lang/String;

    move-result-object v0

    sget v1, Lx81/d;->b:I

    move-object/from16 v3, v46

    invoke-virtual {v3, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v3, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->Q()Lb91/a;

    move-result-object v25

    new-instance v4, Lw3/k;

    move/from16 v9, v19

    invoke-direct {v4, v9}, Lw3/k;-><init>(I)V

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v29, v10, 0x12

    const v30, 0x2fdfa

    move-object v11, v8

    move-wide v7, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v21, v14

    move-object/from16 v16, v15

    const-wide/16 v14, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v22, v19

    const-wide/16 v18, 0x0

    const/16 v40, 0x0

    const/16 v20, 0x0

    move/from16 v45, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    move/from16 v33, v5

    move-object v5, v0

    move/from16 v0, v33

    move-object/from16 v33, v17

    move-object/from16 v17, v4

    move/from16 v4, v45

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v5

    invoke-virtual {v5}, Lhs2/e$e;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v13

    invoke-virtual {v3, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    int-to-float v1, v4

    mul-float v7, v1, v0

    const/4 v9, 0x0

    const/16 v10, 0xd

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v5, v33

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v3, v5

    move v1, v7

    new-instance v5, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v5, v9}, Lw3/k;-><init>(I)V

    const/16 v28, 0x30

    const v30, 0x2fdf8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v17, v5

    move-object v5, v12

    const/4 v12, 0x0

    move-wide v7, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    mul-float/2addr v5, v0

    const/4 v6, 0x5

    int-to-float v6, v6

    mul-float/2addr v6, v0

    invoke-static {v3, v5, v6, v5, v1}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->c()Lhs2/e$e;

    move-result-object v0

    invoke-virtual {v0}, Lhs2/e$e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lhs2/e$d;->a()Z

    move-result v6

    move/from16 v1, v47

    const/16 v3, 0x100

    if-ne v1, v3, :cond_2d

    move v12, v4

    goto :goto_1d

    :cond_2d
    move/from16 v12, v40

    :goto_1d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v12, :cond_2f

    if-ne v1, v2, :cond_2e

    goto :goto_1e

    :cond_2e
    move-object/from16 v3, v31

    goto :goto_1f

    :cond_2f
    :goto_1e
    new-instance v1, Ljp1/l;

    const/16 v2, 0xc

    move-object/from16 v3, v31

    invoke-direct {v1, v3, v2}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object/from16 v18, v1

    check-cast v18, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v1, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1fbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v11

    move-object v11, v0

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_30
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v8

    :goto_20
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_31

    new-instance v0, Ljs2/d;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljs2/d;-><init>(Lhs2/e$d;Lfs2/m;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method private static final t(Lhs2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;)Z
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

.method private static final v(Lp1/c1;Z)V
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

.method private static final w(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljs2/f;->v(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljs2/f;->v(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Landroid/content/Context;Lp1/c1;)Ll83/a0;
    .locals 3

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljs2/f;->v(Lp1/c1;Z)V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "package"

    invoke-static {v2, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhs2/a$f;->a:Lhs2/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
