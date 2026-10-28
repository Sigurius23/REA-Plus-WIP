.class public abstract Lzc1/q8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a\u000f\u0010\n\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Ll83/a0;",
        "q",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "title",
        "",
        "enabled",
        "w",
        "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V",
        "s",
        "l",
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
.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q8;->x(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q8;->u(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q8;->o(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q8;->y(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q8;->r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q8;->t(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q8;->n(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q8;->m(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/q8;->z(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q8;->p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/q8;->v(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v12, p0

    check-cast v12, Lp1/q;

    const v1, 0x694a5b4b

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v15, 0x1

    if-eqz p1, :cond_0

    move v1, v15

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v12, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v3, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Max Width"

    const/4 v3, 0x6

    invoke-static {v1, v12, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    int-to-float v1, v15

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v1, v4

    const-string v4, "1234567"

    move v5, v1

    invoke-static {v2, v5, v12, v4}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v9, Lny0/y0;->TextLarge:Lny0/y0;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_4

    new-instance v6, Lzc1/h7;

    const/4 v8, 0x7

    invoke-direct {v6, v8}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v6

    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v16, Lcom/whoop/design/util/TextResource;->$stable:I

    const/high16 v6, 0x36c30000

    or-int v13, v16, v6

    const/16 v14, 0x5e

    move-object v6, v2

    const/4 v2, 0x0

    move v8, v3

    const/4 v3, 0x0

    move-object v10, v4

    const/4 v4, 0x0

    move/from16 v17, v5

    move-object/from16 v18, v6

    const-wide/16 v5, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x1

    move/from16 v15, v17

    move-object/from16 v22, v18

    move-object/from16 v23, v19

    move-object/from16 v0, v21

    invoke-static/range {v1 .. v14}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v22

    invoke-static {v1, v15, v12, v0}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v17, "1234567 sub"

    move-object/from16 v18, v1

    move-object v1, v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v23

    if-ne v3, v4, :cond_5

    new-instance v3, Lzc1/h7;

    const/16 v5, 0x8

    invoke-direct {v3, v5}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v3, v16, 0x3

    or-int/2addr v13, v3

    const/16 v14, 0x5c

    const/4 v3, 0x0

    move-object/from16 v19, v4

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    move-object/from16 v24, v18

    move-object/from16 v25, v19

    invoke-static/range {v1 .. v14}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v24

    invoke-static {v1, v15, v12, v0}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v25

    if-ne v0, v4, :cond_6

    new-instance v0, Lzc1/h7;

    const/16 v4, 0x9

    invoke-direct {v0, v4}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v16, 0x6

    or-int/2addr v13, v0

    const/16 v14, 0x58

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    invoke-static/range {v1 .. v14}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_7
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x18

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final m(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q8;->l(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p0, Lp1/q;

    const v0, 0x73ed2796

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

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x4

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v5, v4

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, p0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, p0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v9, p0, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {p0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p0, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {p0, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, p0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {p0, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Text Enabled"

    const/4 v5, 0x6

    const/4 v6, 0x2

    invoke-static {v2, v1, p0, v5, v6}, Lzc1/q8;->w(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    mul-float/2addr v4, v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Numbers Enabled"

    invoke-static {v2, v1, p0, v5, v6}, Lzc1/q8;->s(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Text Disabled"

    const/16 v5, 0x36

    invoke-static {v2, v1, p0, v5, v1}, Lzc1/q8;->w(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Number Disabled"

    invoke-static {v2, v1, p0, v5, v1}, Lzc1/q8;->s(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {p0, v1}, Lzc1/q8;->l(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/t7;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lzc1/t7;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q8;->q(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v4, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x2330dd9c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :goto_3
    and-int/lit8 v6, v1, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_18

    if-eqz v3, :cond_6

    const/4 v12, 0x1

    goto :goto_5

    :cond_6
    move v12, v5

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_7

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_8

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lp1/c1;

    and-int/lit8 v7, v1, 0xe

    invoke-static {v4, v0, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    invoke-static {v13, v14, v0, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v0, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v13, v0, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 p1, v12

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v11, v9

    const-wide/16 v19, 0x0

    cmpl-double v11, v11, v19

    const-string v21, "invalid weight; must be greater than zero"

    if-lez v11, :cond_c

    goto :goto_7

    :cond_c
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v22, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v9, v22

    if-lez v12, :cond_d

    move/from16 v12, v22

    :goto_8
    const/4 v13, 0x1

    goto :goto_9

    :cond_d
    move v12, v9

    goto :goto_8

    :goto_9
    invoke-direct {v11, v12, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v12, Ll0/a1;->x:Ll0/a1;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->N:Lb2/k;

    move-object/from16 v17, v6

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    move/from16 v23, v1

    invoke-static {v6, v13, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 v24, v10

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_e

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v9, v0, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Small"

    const/4 v4, 0x6

    invoke-static {v1, v0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    int-to-float v9, v1

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v9, v10

    const-string v10, "1234567"

    move-object/from16 v11, v24

    invoke-static {v11, v9, v0, v10}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    move-object/from16 v24, v13

    sget-object v13, Lny0/y0;->NumberSmall:Lny0/y0;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/lang/Boolean;

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v25

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_11

    new-instance v1, Lzc1/e8;

    const/4 v4, 0x6

    invoke-direct {v1, v4, v3}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    const/high16 v4, 0x30c00000

    or-int/2addr v3, v4

    shl-int/lit8 v4, v23, 0xf

    const/high16 v23, 0x380000

    and-int v4, v4, v23

    or-int/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v18, 0x11e

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 v28, v9

    move-object/from16 v29, v10

    const-wide/16 v9, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p2

    move-object/from16 v33, v12

    move-object/from16 p2, v17

    move-object/from16 v35, v23

    move-object/from16 v34, v24

    move-object/from16 v32, v26

    move/from16 v36, v28

    move-object/from16 v37, v29

    move-object/from16 v31, v30

    const/4 v4, 0x1

    move/from16 v12, p1

    move/from16 v17, v3

    move-object/from16 v23, v5

    move-object/from16 v5, v16

    move-object/from16 v3, v27

    move-object/from16 v16, v0

    move-object v0, v11

    move/from16 v11, v25

    invoke-static/range {v5 .. v18}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v6, v9

    cmpl-double v6, v6, v19

    if-lez v6, :cond_12

    goto :goto_b

    :cond_12
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v9, v22

    if-lez v7, :cond_13

    move/from16 v7, v22

    goto :goto_c

    :cond_13
    move v7, v9

    :goto_c
    invoke-direct {v6, v7, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v7, v33

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v34

    move-object/from16 v8, v35

    const/16 v9, 0x30

    invoke-static {v8, v7, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v5, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    move-object/from16 v1, v31

    goto :goto_f

    :cond_16
    :goto_e
    move-object/from16 v1, v32

    goto :goto_10

    :goto_f
    invoke-static {v8, v5, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Large"

    const/4 v2, 0x6

    invoke-static {v1, v5, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v9, v36

    move-object/from16 v1, v37

    invoke-static {v0, v9, v5, v1}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v13, Lny0/y0;->NumberLarge:Lny0/y0;

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v23

    if-ne v1, v2, :cond_17

    new-instance v1, Lzc1/e8;

    const/4 v2, 0x7

    move-object/from16 v6, p2

    invoke-direct {v1, v2, v6}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v15, v1

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x11e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v5

    move-object v5, v0

    invoke-static/range {v5 .. v18}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    move v5, v12

    goto :goto_11

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lzc1/p8;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-direct/range {v0 .. v5}, Lzc1/p8;-><init>(IIILjava/lang/String;Z)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final t(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzc1/q8;->s(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V
    .locals 38

    move-object/from16 v4, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x379e9d00

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :goto_3
    and-int/lit8 v6, v1, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v0, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_18

    if-eqz v3, :cond_6

    const/4 v12, 0x1

    goto :goto_5

    :cond_6
    move v12, v5

    :goto_5
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_7

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_8

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lp1/c1;

    and-int/lit8 v7, v1, 0xe

    invoke-static {v4, v0, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Ll0/m;->a:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    invoke-static {v13, v14, v0, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v0, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v13, v0, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 p1, v12

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v11, v9

    const-wide/16 v19, 0x0

    cmpl-double v11, v11, v19

    const-string v21, "invalid weight; must be greater than zero"

    if-lez v11, :cond_c

    goto :goto_7

    :cond_c
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v22, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v9, v22

    if-lez v12, :cond_d

    move/from16 v12, v22

    :goto_8
    const/4 v13, 0x1

    goto :goto_9

    :cond_d
    move v12, v9

    goto :goto_8

    :goto_9
    invoke-direct {v11, v12, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v12, Ll0/a1;->x:Ll0/a1;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->N:Lb2/k;

    move-object/from16 v17, v6

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    move/from16 v23, v1

    invoke-static {v6, v13, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 v24, v10

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_e

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v0, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v9, v0, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v0, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Small"

    const/4 v4, 0x6

    invoke-static {v1, v0, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    int-to-float v9, v1

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v9, v10

    const-string v10, "Toggle Button"

    move-object/from16 v11, v24

    invoke-static {v11, v9, v0, v10}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    move-object/from16 v24, v13

    sget-object v13, Lny0/y0;->TextSmall:Lny0/y0;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/lang/Boolean;

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v25

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v5, :cond_11

    new-instance v1, Lzc1/e8;

    const/4 v4, 0x4

    invoke-direct {v1, v4, v3}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    const/high16 v4, 0x30c00000

    or-int/2addr v3, v4

    shl-int/lit8 v4, v23, 0xf

    const/high16 v23, 0x380000

    and-int v4, v4, v23

    or-int/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v18, 0x11e

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 v28, v9

    move-object/from16 v29, v10

    const-wide/16 v9, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 p2, v15

    move-object v15, v1

    move-object/from16 v1, p2

    move-object/from16 v33, v12

    move-object/from16 p2, v17

    move-object/from16 v35, v23

    move-object/from16 v34, v24

    move-object/from16 v32, v26

    move/from16 v36, v28

    move-object/from16 v37, v29

    move-object/from16 v31, v30

    const/4 v4, 0x1

    move/from16 v12, p1

    move/from16 v17, v3

    move-object/from16 v23, v5

    move-object/from16 v5, v16

    move-object/from16 v3, v27

    move-object/from16 v16, v0

    move-object v0, v11

    move/from16 v11, v25

    invoke-static/range {v5 .. v18}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v6, v9

    cmpl-double v6, v6, v19

    if-lez v6, :cond_12

    goto :goto_b

    :cond_12
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v9, v22

    if-lez v7, :cond_13

    move/from16 v7, v22

    goto :goto_c

    :cond_13
    move v7, v9

    :goto_c
    invoke-direct {v6, v7, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v7, v33

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v34

    move-object/from16 v8, v35

    const/16 v9, 0x30

    invoke-static {v8, v7, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v5, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    move-object/from16 v1, v31

    goto :goto_f

    :cond_16
    :goto_e
    move-object/from16 v1, v32

    goto :goto_10

    :goto_f
    invoke-static {v8, v5, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Large"

    const/4 v2, 0x6

    invoke-static {v1, v5, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v9, v36

    move-object/from16 v1, v37

    invoke-static {v0, v9, v5, v1}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v13, Lny0/y0;->TextLarge:Lny0/y0;

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v23

    if-ne v1, v2, :cond_17

    new-instance v1, Lzc1/e8;

    const/4 v2, 0x5

    move-object/from16 v6, p2

    invoke-direct {v1, v2, v6}, Lzc1/e8;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v15, v1

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x11e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v5

    move-object v5, v0

    invoke-static/range {v5 .. v18}, Lny0/x0;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;JZZLny0/y0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    move v5, v12

    goto :goto_11

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lzc1/p8;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    move/from16 v1, p3

    move/from16 v2, p4

    invoke-direct/range {v0 .. v5}, Lzc1/p8;-><init>(IIILjava/lang/String;Z)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final x(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzc1/q8;->w(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
