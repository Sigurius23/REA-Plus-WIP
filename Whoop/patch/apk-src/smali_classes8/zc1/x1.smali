.class public abstract Lzc1/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001aA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0002\u001a\u000f\u0010\u0011\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0002\u001a\u000f\u0010\u0012\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0002\u001a\u000f\u0010\u0013\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0002\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0002\u00a8\u0006\u0015"
    }
    d2 = {
        "Ll83/a0;",
        "q",
        "(Landroidx/compose/runtime/Composer;I)V",
        "s",
        "",
        "date",
        "day",
        "dayOfMonth",
        "Lh11/g;",
        "style",
        "",
        "showDot",
        "isSelected",
        "Lh11/h;",
        "H",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZ)Lh11/h;",
        "y",
        "B",
        "n",
        "v",
        "E",
        "design-showcase_release"
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
.method private static final A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->y(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x793c724

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Feb 9th - Mar 9, 2022"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lzc1/w1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6000

    or-int v15, v1, v2

    const/16 v16, 0x180

    const/16 v17, 0xf07

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final C(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->B(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x33968bc0

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Feb 9th - Mar 9, 2022"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lz72/f;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lz72/f;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6030

    or-int v15, v1, v2

    const/16 v16, 0x180

    const/16 v17, 0xf05

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final F(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->E(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZ)Lh11/h;
    .locals 17

    new-instance v0, Lh11/h;

    new-instance v1, Lh11/a;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lh11/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v15, 0x3f62

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v5, p0

    move-object/from16 v4, p3

    move/from16 v8, p4

    move/from16 v3, p5

    invoke-direct/range {v0 .. v16}, Lh11/h;-><init>(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZILjava/lang/Object;)Lh11/h;
    .locals 6

    and-int/lit8 p6, p6, 0x20

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-static/range {v0 .. v5}, Lzc1/x1;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZ)Lh11/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->t(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->z(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->G(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->F(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->C(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/x1;->w(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/x1;->A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x2625c75e

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Feb 9th - Mar 9, 2022"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lzc1/w1;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lzc1/w1;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6000

    or-int v15, v1, v2

    const/16 v16, 0x180

    const/16 v17, 0xf07

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0xc

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->n(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p0, Lp1/q;

    const v0, -0x67b7029c

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, p0, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, p0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v8, p0, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p0, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p0, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, p0, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, p0, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Date Selector"

    const/4 v3, 0x6

    invoke-static {v2, p0, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2, v2, v5, p0}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v2, "Enabled"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->y(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Forward Enabled"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->B(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Backward Enabled"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->n(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Disabled"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->v(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "Loading"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->E(Landroidx/compose/runtime/Composer;I)V

    const-string v2, "With Date Strip"

    invoke-static {v2, p0, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lzc1/x1;->s(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/w0;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lzc1/w0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->q(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x6f76cd32

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Wed, Aug 26"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Li11/g;

    sget-object v9, Lh11/g;->COMPLETED_JOURNAL:Lh11/g;

    const/16 v12, 0x20

    const/4 v13, 0x0

    const-string v6, "2026-08-24"

    const-string v7, "Mon"

    const-string v8, "24"

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lzc1/x1;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZILjava/lang/Object;)Lh11/h;

    move-result-object v1

    sget-object v18, Lh11/g;->INCOMPLETE_JOURNAL:Lh11/g;

    const/16 v21, 0x20

    const/16 v22, 0x0

    const-string v15, "2026-08-25"

    const-string v16, "Tue"

    const-string v17, "25"

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lzc1/x1;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZILjava/lang/Object;)Lh11/h;

    move-result-object v2

    const/4 v11, 0x1

    const-string v6, "2026-08-26"

    const-string v7, "Wed"

    const-string v8, "26"

    invoke-static/range {v6 .. v11}, Lzc1/x1;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZ)Lh11/h;

    move-result-object v3

    sget-object v9, Lh11/g;->INVALID:Lh11/g;

    const-string v6, "2026-08-27"

    const-string v7, "Thu"

    const-string v8, "27"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lzc1/x1;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZILjava/lang/Object;)Lh11/h;

    move-result-object v15

    const-string v6, "2026-08-28"

    const-string v7, "Fri"

    const-string v8, "28"

    invoke-static/range {v6 .. v13}, Lzc1/x1;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh11/g;ZZILjava/lang/Object;)Lh11/h;

    move-result-object v6

    filled-new-array {v1, v2, v3, v15, v6}, [Lh11/h;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    sget-object v7, Lgz0/m0;->ANNUAL_REPORT:Lgz0/m0;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Li11/g;-><init>(Ljava/util/List;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lz72/f;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lz72/f;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6000

    or-int v15, v1, v2

    sget v1, Li11/g;->e:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit16 v1, v1, 0x180

    const/16 v17, 0x707

    move/from16 v16, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v12, v5

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final t(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->s(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x49f2e4

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Feb 9th - Mar 9, 2022"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lz72/f;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lz72/f;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6000

    or-int v15, v1, v2

    const/16 v16, 0x180

    const/16 v17, 0xf07

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0xe

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final w(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/x1;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v0, p1

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, 0x7a8f695b

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v14, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Feb 9th - Mar 9, 2022"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    new-instance v1, Lz72/f;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lz72/f;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x9

    const v2, 0xdb6000

    or-int v15, v1, v2

    const/16 v16, 0x180

    const/16 v17, 0xf07

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v17}, Li11/e;->q(Landroidx/compose/ui/Modifier;ZLl0/i;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lzc1/w0;

    const/16 v3, 0xf

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final z(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
