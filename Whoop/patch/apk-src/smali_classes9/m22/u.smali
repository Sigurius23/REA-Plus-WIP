.class public abstract Lm22/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u001a?\u0010\u0005\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a+\u0010\t\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000c\u001a\u000f\u0010\u000e\u001a\u00020\u0001H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\u001a+\u0010\u000f\u001a\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClicked",
        "onRetryClicked",
        "onNeedMoreHelpClicked",
        "v",
        "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "B",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "n",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "p",
        "(Landroidx/compose/runtime/Composer;I)V",
        "t",
        "r",
        "l",
        "pairing-ui_release"
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
.method private static final A(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lm22/u;->v(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move/from16 v9, p2

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v0, 0x1b311f0e

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, v0, 0x3

    if-eq v2, v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lyb0/f;->a(Lx81/d;)I

    move-result v1

    sget v2, Lgy0/f;->K:I

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    sget v2, La22/b;->w:I

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const v27, 0xfff2

    const/16 v28, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v10 .. v28}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v10

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v2, v2, 0x3

    shl-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x1c00

    or-int v7, v2, v0

    const/16 v8, 0x35

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lch0/t;

    const/16 v2, 0xb

    invoke-direct {v1, v9, v2, v3}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final C(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lm22/u;->B(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm22/u;->z(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm22/u;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm22/u;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/u;->w()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm22/u;->o(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm22/u;->s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/u;->y()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/u;->x()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm22/u;->C(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm22/u;->m(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lm22/u;->A(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, 0x47801a6d

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    move/from16 v18, v1

    and-int/lit8 v1, v18, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v3, v18, 0x1

    invoke-virtual {v14, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v3, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v3, v14, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, La22/b;->y:I

    invoke-static {v14, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v19, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v19, 0x12

    shl-int/lit8 v3, v18, 0x9

    and-int/lit16 v3, v3, 0x1c00

    const/16 v17, 0x1fbf

    const/4 v0, 0x0

    move-object v5, v6

    move-object v6, v1

    const/4 v1, 0x0

    move v7, v2

    const/4 v2, 0x0

    move/from16 v16, v3

    const/4 v3, 0x0

    move v8, v4

    const/4 v4, 0x0

    move-object v9, v5

    const/4 v5, 0x0

    move v10, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v23, v22

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v15, v13

    const/4 v0, 0x3

    int-to-float v1, v0

    const/4 v7, 0x4

    int-to-float v2, v7

    move-object/from16 v12, v23

    invoke-static {v1, v2, v12, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v1, La22/b;->x:I

    invoke-static {v14, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    shl-int/lit8 v12, v19, 0x6

    shr-int/lit8 v0, v18, 0x3

    and-int/lit8 v13, v0, 0xe

    move-object v11, v14

    const/16 v14, 0x3fb

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v0, v10

    move-object v14, v11

    const/4 v8, 0x1

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v15, v13

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, Lam2/g;

    const/16 v3, 0xc

    move/from16 v4, p3

    invoke-direct {v2, v15, v0, v4, v3}, Lam2/g;-><init>(Lc93/a;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final m(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm22/u;->l(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x66e7e371

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v7, v2, 0x30

    const/16 v8, 0x10

    if-nez v7, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    move v7, v8

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit8 v7, v4, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x0

    if-eq v7, v9, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    move v7, v11

    :goto_3
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v3, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_8

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v12, 0x3

    int-to-float v12, v12

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v13, v12

    const/4 v14, 0x0

    invoke-static {v7, v13, v14, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v13, v3, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v3, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-nez v10, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    :cond_6
    invoke-static {v13, v3, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v3, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v5, v6

    invoke-static {v12, v5, v9, v3}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v3, v11}, Lm22/u;->p(Landroidx/compose/runtime/Composer;I)V

    int-to-float v6, v8

    mul-float/2addr v6, v5

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v3, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v3, v11}, Lm22/u;->t(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v3, v11}, Lm22/u;->r(Landroidx/compose/runtime/Composer;I)V

    const/16 v6, 0xc

    int-to-float v6, v6

    invoke-static {v6, v5, v9, v3}, Ld;->w(FFLb2/t;Lp1/q;)V

    and-int/lit8 v4, v4, 0x7e

    invoke-static {v0, v1, v3, v4}, Lm22/u;->l(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x6

    int-to-float v4, v4

    const/4 v6, 0x1

    invoke-static {v4, v5, v9, v3, v6}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v4, Lam2/g;

    const/16 v5, 0xb

    invoke-direct {v4, v0, v1, v2, v5}, Lam2/g;-><init>(Lc93/a;Lc93/a;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final o(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm22/u;->n(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, -0x20908da4

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, La22/b;->A:I

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v21

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v25, v7, 0x12

    const v26, 0x2fffa

    move v7, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v9, v3

    move v10, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v0, v28

    move/from16 v30, v29

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v11, v1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v11, v8, v12, v1}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v1, La22/a;->d:I

    invoke-static {v1, v8, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    const/4 v4, 0x0

    sget-object v5, Ly2/j;->d:Ly2/b1;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, La22/b;->z:I

    invoke-static {v8, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v15, v27

    move/from16 v10, v30

    invoke-virtual {v15, v8, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v15, v8, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v8

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lk71/a0;

    const/16 v2, 0x1d

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lk71/a0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lm22/u;->p(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, 0x2d04dc14

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, La22/b;->C:I

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v21

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v25, v7, 0x12

    const v26, 0x2fffa

    move v7, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v9, v3

    move v10, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v0, v28

    move/from16 v30, v29

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v11, v1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v11, v8, v12, v1}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v1, La22/a;->e:I

    invoke-static {v1, v8, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    const/4 v4, 0x0

    sget-object v5, Ly2/j;->d:Ly2/b1;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, La22/b;->B:I

    invoke-static {v8, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v15, v27

    move/from16 v10, v30

    invoke-virtual {v15, v8, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v15, v8, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v8

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lk71/a0;

    const/16 v2, 0x1c

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lk71/a0;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final s(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lm22/u;->r(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v8, p0

    check-cast v8, Lp1/q;

    const v1, -0x43a30cbe

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, La22/b;->E:I

    invoke-static {v8, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v21

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v25, v7, 0x12

    const v26, 0x2fffa

    move v7, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object v9, v3

    move v10, v4

    move-wide v3, v5

    const-wide/16 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v0, v28

    move/from16 v30, v29

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v11, v1, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v11, v8, v12, v1}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v1, La22/a;->f:I

    invoke-static {v1, v8, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    const/4 v4, 0x0

    sget-object v5, Ly2/j;->d:Ly2/b1;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v0, La22/b;->D:I

    invoke-static {v8, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v15, v27

    move/from16 v10, v30

    invoke-virtual {v15, v8, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v15, v8, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v8

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lm22/t;

    const/4 v2, 0x0

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lm22/t;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lm22/u;->t(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    check-cast p3, Lp1/q;

    const v0, -0xd98c7d

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-virtual {p3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_2
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_5

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, p4, 0x180

    if-nez v5, :cond_8

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v2, v5

    :cond_8
    :goto_5
    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_9

    move v5, v8

    goto :goto_6

    :cond_9
    move v5, v7

    :goto_6
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {p3, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_16

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_b

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v5, :cond_a

    new-instance p0, Lm22/m;

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lm22/m;-><init>(I)V

    invoke-virtual {p3, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p0, Lc93/a;

    :cond_b
    if-eqz v3, :cond_d

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_c

    new-instance p1, Lm22/m;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lm22/m;-><init>(I)V

    invoke-virtual {p3, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast p1, Lc93/a;

    :cond_d
    if-eqz v4, :cond_f

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v5, :cond_e

    new-instance p2, Lm22/m;

    const/4 v0, 0x5

    invoke-direct {p2, v0}, Lm22/m;-><init>(I)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast p2, Lc93/a;

    :cond_f
    and-int/lit8 v0, v2, 0xe

    if-ne v0, v1, :cond_10

    move v3, v8

    goto :goto_7

    :cond_10
    move v3, v7

    :goto_7
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_11

    if-ne v4, v5, :cond_12

    :cond_11
    new-instance v4, Llq2/k;

    const/4 v3, 0x7

    invoke-direct {v4, p0, v3}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {p3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lc93/a;

    invoke-static {v4, v7, p3, v7, v8}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, p3, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->o()J

    move-result-wide v3

    sget-object v5, Li2/w0;->a:Li2/v0;

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x1f4

    int-to-float v4, v4

    int-to-float v1, v1

    mul-float/2addr v4, v1

    const/4 v1, 0x0

    invoke-static {v3, v1, v4, v8}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, p3, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    const/16 v4, 0xe

    invoke-static {v1, v3, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, p3, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-eqz v7, :cond_13

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_13
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_8
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p3, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p3, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p3, Lp1/q;->S:Z

    if-nez v5, :cond_14

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :cond_14
    invoke-static {v4, p3, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p3, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, p3, v0}, Lm22/u;->B(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v0, v2, 0x3

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, p3, v0}, Lm22/u;->n(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v8}, Lp1/q;->q(Z)V

    :goto_9
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    goto :goto_a

    :cond_16
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_17

    new-instance v1, Lat2/c;

    const/4 v7, 0x3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v7}, Lat2/c;-><init>(Lc93/a;Lc93/a;Lc93/a;III)V

    iput-object v1, p0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final w()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
