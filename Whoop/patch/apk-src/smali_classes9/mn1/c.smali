.class public abstract Lmn1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a=\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\u0008\u0000\u0010\u0010*\u0008\u0012\u0004\u0012\u00028\u00000\u0011H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ljn1/d$c;",
        "viewState",
        "Ln0/u;",
        "listState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Ljn1/b;",
        "Ll83/a0;",
        "onViewEvent",
        "o",
        "(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lj31/k;",
        "reorderableListState",
        "y",
        "(Lj31/k;Landroidx/compose/runtime/Composer;I)V",
        "T",
        "",
        "Lz1/p;",
        "B",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;",
        "",
        "shouldShowErrorText",
        "l",
        "(Ljn1/d$c;ZLandroidx/compose/runtime/Composer;I)V",
        "",
        "scaleFactor",
        "home-customization_release"
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
.method public static final synthetic A(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lmn1/c;->v(Lp1/t2;)F

    move-result p0

    return p0
.end method

.method private static final B(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lz1/p;"
        }
    .end annotation

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_0

    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lp1/x;->J(Ljava/util/Collection;)Lz1/p;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p2, Lz1/p;

    invoke-static {p0, p1}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lmn1/c$l;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p2, v0}, Lmn1/c$l;-><init>(Lp1/t2;Lz1/p;Lq83/d;)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/m;

    invoke-static {p1, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static synthetic a(ILe41/i;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lmn1/c;->u(ILe41/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILp1/c1;Lj31/d;Lj31/d;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->q(ILp1/t2;Lj31/d;Lj31/d;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lj31/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->z(Lj31/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lmn1/c;->x(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz1/p;ILkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmn1/c;->p(Lz1/p;ILkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljn1/d$c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmn1/c;->n(Ljn1/d$c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->t(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->w(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;Lz1/p;Ljn1/d$c;Lkotlin/jvm/functions/Function1;Lj31/k;ILn0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmn1/c;->r(Ljava/util/List;Lz1/p;Ljn1/d$c;Lkotlin/jvm/functions/Function1;Lj31/k;ILn0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->s(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljn1/d$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmn1/c;->m(Ljn1/d$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljn1/d$c;ZLandroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move/from16 v2, p1

    move/from16 v11, p3

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v1, -0x24d74822

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v8, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v3, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    :cond_6
    invoke-static {v6, v8, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljn1/d$c;->d()Ljn1/a;

    move-result-object v3

    invoke-virtual {v3}, Ljn1/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Ljn1/d$c;->d()Ljn1/a;

    move-result-object v6

    invoke-virtual {v6}, Ljn1/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v10, v7, 0x3

    or-int/2addr v7, v10

    invoke-static {v3, v6, v8, v7}, Lz51/i;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v3, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Ljn1/d$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v12

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v3, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->a()Lb91/a;

    move-result-object v32

    invoke-virtual {v3, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v14

    new-instance v3, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v3, v7}, Lw3/k;-><init>(I)V

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v36, v7, 0x12

    const v37, 0x2fdfa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object/from16 v24, v3

    move-object/from16 v34, v8

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/16 v3, 0xd

    const/4 v4, 0x0

    invoke-static {v4, v4, v3}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v3

    invoke-static {v4, v5}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v4

    new-instance v3, Lmn1/b;

    const/4 v7, 0x3

    invoke-direct {v3, v0, v7}, Lmn1/b;-><init>(Ljn1/d$c;I)V

    const v7, 0x26aff450

    invoke-static {v7, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    and-int/lit8 v1, v1, 0x70

    const v3, 0x180c06

    or-int/2addr v1, v3

    const/16 v10, 0x1a

    move-object v3, v9

    move v9, v1

    sget-object v1, Ll0/z;->a:Ll0/z;

    move-object v12, v3

    const/4 v3, 0x0

    move v13, v5

    const/4 v5, 0x0

    move v14, v6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v3, 0x400c000000000000L    # 3.5

    double-to-float v1, v3

    invoke-static {v1, v14, v12, v8, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v3, Lam0/b;

    const/16 v4, 0xc

    invoke-direct {v3, v0, v2, v11, v4}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final m(Ljn1/d$c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    move-object/from16 v0, p2

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lp1/q;

    iget-wide v3, v2, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    iget-object v8, v2, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_0

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_0
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v0, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v2, Lp1/q;->S:Z

    if-nez v4, :cond_1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v3, v2, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x1

    int-to-float v3, v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v0, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ljn1/d$c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v4, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->f()J

    move-result-wide v4

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v24, v6, 0x12

    const v25, 0x2fffa

    move v6, v1

    const/4 v1, 0x0

    move-object v7, v2

    move-object v0, v3

    move-wide v2, v4

    const-wide/16 v4, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    move v12, v10

    const-wide/16 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v27, v22

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v27

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Ljn1/d$c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lmn1/c;->l(Ljn1/d$c;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljn1/d$c;",
            "Ln0/u;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    move/from16 v11, p5

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "listState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v3, -0xc1ca268

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v11, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_1
    move v3, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_4

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v11, 0xc00

    const/16 v12, 0x800

    if-nez v7, :cond_8

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v12

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v3, v7

    :cond_8
    and-int/lit16 v7, v3, 0x493

    const/16 v9, 0x492

    const/4 v14, 0x0

    if-eq v7, v9, :cond_9

    const/4 v7, 0x1

    goto :goto_6

    :cond_9
    move v7, v14

    :goto_6
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    if-eqz v5, :cond_a

    sget-object v5, Lb2/t;->w:Lb2/t;

    move-object v15, v5

    goto :goto_7

    :cond_a
    move-object v15, v6

    :goto_7
    invoke-virtual {v1}, Ljn1/d$c;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1}, Ljn1/d$c;->g()Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v8, v14}, Lmn1/c;->B(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lz1/p;

    move-result-object v5

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    add-int/2addr v4, v7

    invoke-static {v5, v8}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8, v4}, Lp1/q;->e(I)Z

    move-result v10

    or-int/2addr v9, v10

    and-int/lit16 v10, v3, 0x1c00

    if-ne v10, v12, :cond_b

    const/16 v16, 0x1

    goto :goto_8

    :cond_b
    move/from16 v16, v14

    :goto_8
    or-int v9, v9, v16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_c

    if-ne v13, v14, :cond_d

    :cond_c
    new-instance v13, Lkl2/f;

    invoke-direct {v13, v4, v0, v5}, Lkl2/f;-><init>(ILkotlin/jvm/functions/Function1;Lz1/p;)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v13, Lc93/m;

    invoke-virtual {v8, v4}, Lp1/q;->e(I)Z

    move-result v9

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v9, v9, v17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_e

    if-ne v12, v14, :cond_f

    :cond_e
    new-instance v12, Lk71/i;

    invoke-direct {v12, v4, v7}, Lk71/i;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lc93/m;

    and-int/lit8 v9, v3, 0x70

    move v3, v10

    const/16 v10, 0x38

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move v11, v3

    move v0, v4

    move-object v4, v12

    move-object/from16 v12, v18

    move-object v3, v2

    move-object v2, v13

    move-object/from16 v13, v19

    invoke-static/range {v2 .. v10}, Lj31/l;->a(Lc93/m;Ln0/u;Lc93/m;Lc93/m;FLj31/b;Landroidx/compose/runtime/Composer;II)Lj31/k;

    move-result-object v5

    sget v2, Lj31/k;->t:I

    invoke-static {v5, v8, v2}, Lmn1/c;->y(Lj31/k;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5}, Lj31/k;->g0()Ln0/u;

    move-result-object v7

    invoke-static {v15, v5}, Lj31/h;->b(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    const/16 v3, 0x800

    if-ne v11, v3, :cond_10

    const/16 v16, 0x1

    goto :goto_9

    :cond_10
    const/16 v16, 0x0

    :goto_9
    or-int v2, v2, v16

    invoke-virtual {v8, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v8, v0}, Lp1/q;->e(I)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    if-ne v3, v14, :cond_12

    :cond_11
    move v6, v0

    new-instance v0, Lim1/z0;

    move-object/from16 v4, p3

    move-object v3, v1

    move-object v1, v12

    move-object v2, v13

    invoke-direct/range {v0 .. v6}, Lim1/z0;-><init>(Ljava/util/List;Lz1/p;Ljn1/d$c;Lkotlin/jvm/functions/Function1;Lj31/k;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :cond_12
    move-object/from16 v20, v3

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/16 v22, 0x6000

    const/16 v23, 0x1ec

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v13, v7

    move-object/from16 v21, v8

    move-object v12, v9

    move-object v5, v15

    move-object v15, v10

    invoke-static/range {v12 .. v23}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    goto :goto_a

    :cond_13
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lkw1/c;

    const/16 v7, 0xf

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final p(Lz1/p;ILkotlin/jvm/functions/Function1;Lj31/d;Lj31/d;)Ll83/a0;
    .locals 2

    const-string v0, "from"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Lj31/d;->c()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p3}, Lj31/d;->c()I

    move-result v1

    sub-int/2addr v1, p1

    invoke-virtual {p0, v1}, Lz1/p;->remove(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz1/p;->add(ILjava/lang/Object;)V

    new-instance p0, Ljn1/b$e;

    invoke-virtual {p3}, Lj31/d;->c()I

    move-result p3

    sub-int/2addr p3, p1

    invoke-virtual {p4}, Lj31/d;->c()I

    move-result p4

    sub-int/2addr p4, p1

    invoke-direct {p0, p3, p4}, Ljn1/b$e;-><init>(II)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(ILp1/t2;Lj31/d;Lj31/d;)Z
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lj31/d;->a()I

    move-result p3

    invoke-virtual {p2}, Lj31/d;->b()Ljava/lang/Object;

    add-int p2, p3, p0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz1/p;

    invoke-virtual {p1}, Lz1/p;->size()I

    move-result p1

    add-int/2addr p1, p0

    if-gt p2, p1, :cond_0

    if-lt p3, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final r(Ljava/util/List;Lz1/p;Ljn1/d$c;Lkotlin/jvm/functions/Function1;Lj31/k;ILn0/q;)Ll83/a0;
    .locals 8

    const-string v0, "$this$LazyColumn"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmn1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lmn1/b;-><init>(Ljn1/d$c;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, 0x3e31d023

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x0

    const/4 v3, 0x3

    invoke-static {p6, v0, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v4, Lmn1/c$d;

    invoke-direct {v4, p0}, Lmn1/c$d;-><init>(Ljava/util/List;)V

    new-instance v5, Lmn1/c$e;

    invoke-direct {v5, p0, p3}, Lmn1/c$e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const v6, 0x799532c4

    invoke-direct {p0, v5, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object v5, p6

    check-cast v5, Ln0/f;

    invoke-virtual {v5, v1, v0, v4, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    new-instance p0, Lmn1/b;

    const/4 v1, 0x1

    invoke-direct {p0, p2, v1}, Lmn1/b;-><init>(Ljn1/d$c;I)V

    new-instance v1, Lx1/b;

    const v4, 0x31ea210c

    invoke-direct {v1, p0, v2, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p6, v0, v1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    new-instance p0, Lm22/b;

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Lm22/b;-><init>(I)V

    invoke-virtual {p1}, Lz1/p;->size()I

    move-result v1

    new-instance v4, Lmn1/c$f;

    invoke-direct {v4, p0, p1}, Lmn1/c$f;-><init>(Lc93/m;Ljava/util/List;)V

    new-instance p0, Lmn1/c$g;

    invoke-direct {p0, p1}, Lmn1/c$g;-><init>(Ljava/util/List;)V

    new-instance v7, Lmn1/c$h;

    invoke-direct {v7, p1, p4, p5, p3}, Lmn1/c$h;-><init>(Ljava/util/List;Lj31/k;ILkotlin/jvm/functions/Function1;)V

    new-instance p1, Lx1/b;

    invoke-direct {p1, v7, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v5, v1, v4, p0, p1}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    new-instance p0, Lmn1/b;

    const/4 p1, 0x2

    invoke-direct {p0, p2, p1}, Lmn1/b;-><init>(Ljn1/d$c;I)V

    new-instance p1, Lx1/b;

    const p4, -0x47b81a15

    invoke-direct {p1, p0, v2, p4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p6, v0, p1, v3}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {p2}, Ljn1/d$c;->h()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-instance p2, Lmn1/c$i;

    invoke-direct {p2, p0}, Lmn1/c$i;-><init>(Ljava/util/List;)V

    new-instance p4, Lmn1/c$j;

    invoke-direct {p4, p0, p3}, Lmn1/c$j;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    invoke-direct {p0, p4, v2, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v5, p1, v0, p2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljn1/d$c;->f()Z

    move-result p1

    invoke-static {p0, p1, p2, v1}, Lmn1/c;->l(Ljn1/d$c;ZLandroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljn1/d$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget p0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v13, p0, 0x9

    const/16 v14, 0xf7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ILe41/i;)Ljava/lang/Object;
    .locals 0

    const-string p0, "tile"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le41/i;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lp1/t2;)F
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

.method private static final w(Ljn1/d$c;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, 0x4012000000000000L    # 4.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v4, v0, v1

    const/4 v6, 0x0

    const/16 v7, 0xd

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {p0}, Ljn1/d$c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget p0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p0, p0, 0x9

    or-int/lit8 v13, p0, 0x6

    const/16 v14, 0xf6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lmn1/c;->o(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lj31/k;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p1, Lp1/q;

    const v0, -0x4767296d

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p2

    goto :goto_2

    :cond_2
    move v0, p2

    :goto_2
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v3, v1, :cond_3

    move v1, v5

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq2/a;

    and-int/lit8 v3, v0, 0xe

    if-eq v3, v2, :cond_4

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_5

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move v4, v5

    :cond_5
    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Lmn1/c$k;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v1, v0}, Lmn1/c$k;-><init>(Lj31/k;Lq2/a;Lq83/d;)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    sget v0, Lj31/k;->t:I

    invoke-static {p0, v1, v2, p1}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, Lln1/h;

    invoke-direct {v0, p0, p2, v5}, Lln1/h;-><init>(Lj31/k;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final z(Lj31/k;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lmn1/c;->y(Lj31/k;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
