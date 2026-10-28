.class public abstract Ld62/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u001d\u0010\u0018\u001a\u00020\u00062\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ld62/i;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "x",
        "(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "showArrow",
        "r",
        "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V",
        "t",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lhy0/c2;",
        "items",
        "F",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "recovery-impacts-mini-arch_release"
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
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Ll0/m;->c:Ll0/g;

    sget-object v0, Lb2/e;->M:Lb2/k;

    invoke-static {p2, v0, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v8, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v0, v8, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lgz0/m0;->ADVICE:Lgz0/m0;

    invoke-static {v8, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget p0, Le62/a;->c:I

    invoke-static {v8, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget p0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p1, p0, 0x3

    or-int/lit8 p1, p1, 0x6

    shl-int/lit8 p0, p0, 0x6

    or-int v9, p1, p0

    const/16 v10, 0x8

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Ld62/g;->r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Ll0/m;->c:Ll0/g;

    sget-object v0, Lb2/e;->M:Lb2/k;

    invoke-static {p2, v0, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v8, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v8, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v0, v8, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lgz0/m0;->ADVICE:Lgz0/m0;

    invoke-static {v8, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget p0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p0, p0, 0x3

    or-int/lit16 v9, p0, 0xc06

    const/4 v10, 0x4

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static/range {v4 .. v10}, Ld62/g;->r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v8, v1}, Ld62/g;->t(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Ld62/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ld62/h;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ld62/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v9, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, -0x2b029d4a

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->c()Lgz0/m0;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ld62/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ld62/h;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v0, 0x3

    shl-int/lit8 v0, v0, 0x6

    or-int v10, v3, v0

    const/16 v11, 0x8

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Ld62/g;->r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_4

    :cond_4
    const v0, -0x2afe8023

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->c()Lgz0/m0;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ld62/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v10, v0, 0x3

    const/16 v11, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Ld62/g;->r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_5

    const v5, -0x2afb36e6

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v5, v5

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v9, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v9, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    const v0, -0x2af5c633

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual/range {p0 .. p0}, Ld62/h;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    const v0, -0x2af4d8fa

    invoke-static {v9, v0, v4, v3, v9}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Ld62/h;->e()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v9, v2}, Ld62/g;->F(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    const v0, -0x2af26613

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ld62/g;->x(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lhy0/c2;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    check-cast p1, Lp1/q;

    const v0, 0x38735188

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_2

    move v1, v4

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_4

    :cond_3
    new-instance v1, Ld62/e;

    const/4 v0, 0x1

    invoke-direct {v1, p0, v0}, Ld62/e;-><init>(Ljava/util/List;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lc93/m;

    const/4 v0, 0x0

    invoke-static {v0, v1, p1, v3, v4}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lbm0/o;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final G(Ljava/util/List;Ly2/v1;Ly3/a;)Ly2/s0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$SubcomposeLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    int-to-float v3, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-interface {v1, v3}, Ly3/c;->F(F)I

    move-result v4

    invoke-interface {v1, v3}, Ly3/c;->F(F)I

    move-result v3

    move-object/from16 v5, p2

    iget-wide v5, v5, Ly3/a;->a:J

    invoke-static {v5, v6}, Ly3/a;->i(J)I

    move-result v7

    move-object v8, v0

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v8, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lhy0/c2;

    invoke-virtual {v10}, Lhy0/c2;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "item-"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lci0/a;

    const/16 v13, 0x10

    invoke-direct {v12, v10, v13}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Lx1/b;

    const v13, -0x4842ddef

    invoke-direct {v10, v12, v2, v13}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-interface {v1, v11, v10}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly2/q0;

    invoke-interface {v10, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v8, Ld62/e;

    const/4 v10, 0x0

    invoke-direct {v8, v0, v10}, Ld62/e;-><init>(Ljava/util/List;I)V

    new-instance v10, Lx1/b;

    const v11, 0x5ee0462d

    invoke-direct {v10, v8, v2, v11}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v8, "overflow"

    invoke-interface {v1, v8, v10}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    invoke-interface {v8, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v13, 0x0

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const/4 v15, 0x2

    if-eqz v14, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly2/j1;

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_1

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    move/from16 v16, v4

    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v17

    if-eqz v17, :cond_2

    const/4 v12, 0x0

    goto :goto_3

    :cond_2
    iget v12, v8, Ly2/j1;->w:I

    :goto_3
    iget v2, v14, Ly2/j1;->w:I

    add-int/2addr v2, v13

    add-int/2addr v2, v12

    add-int v2, v2, v16

    if-le v2, v7, :cond_4

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    filled-new-array {v14}, [Ly2/j1;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v11

    iget v13, v14, Ly2/j1;->w:I

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v15, :cond_3

    goto :goto_5

    :cond_3
    :goto_4
    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v2, v14, Ly2/j1;->w:I

    add-int v2, v2, v16

    add-int/2addr v13, v2

    goto :goto_4

    :cond_5
    :goto_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v2, v15, :cond_6

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-static {v10}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    if-lez v0, :cond_9

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v2, v15, :cond_9

    const/4 v2, 0x1

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    move-object v2, v9

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v11, 0x0

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly2/j1;

    iget v12, v12, Ly2/j1;->w:I

    add-int/2addr v11, v12

    goto :goto_6

    :cond_7
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    const/16 v17, 0x1

    add-int/lit8 v2, v2, -0x1

    mul-int/2addr v2, v4

    add-int/2addr v2, v11

    :goto_7
    move-object v11, v9

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_8

    add-int v11, v2, v4

    iget v12, v8, Ly2/j1;->w:I

    add-int/2addr v11, v12

    if-le v11, v7, :cond_8

    invoke-static {v9}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    invoke-interface {v9, v11}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly2/j1;

    iget v11, v11, Ly2/j1;->w:I

    add-int/2addr v11, v4

    sub-int/2addr v2, v11

    goto :goto_7

    :cond_8
    new-instance v2, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v8, 0xc

    invoke-direct {v2, v0, v8}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    new-instance v0, Lx1/b;

    const v8, -0x4c714ce0

    const/4 v11, 0x1

    invoke-direct {v0, v2, v11, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v2, "actual-overflow"

    invoke-interface {v1, v2, v0}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    invoke-interface {v0, v5, v6}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_a

    const/4 v5, 0x0

    goto :goto_a

    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/j1;

    iget v6, v6, Ly2/j1;->x:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :cond_b
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/j1;

    iget v8, v8, Ly2/j1;->x:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_b

    move-object v6, v8

    goto :goto_9

    :cond_c
    move-object v5, v6

    :goto_a
    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_b

    :cond_d
    const/4 v5, 0x0

    :goto_b
    add-int/2addr v2, v5

    goto :goto_8

    :cond_e
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v17, 0x1

    add-int/lit8 v0, v0, -0x1

    mul-int/2addr v0, v3

    add-int/2addr v0, v2

    new-instance v2, Ld62/f;

    const/4 v5, 0x0

    invoke-direct {v2, v10, v3, v4, v5}, Ld62/f;-><init>(Ljava/lang/Object;III)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-interface {v1, v7, v0, v3, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0
.end method

.method private static final H(Lhy0/c2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->h()Z

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->p()Lhy0/b2;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->f()Lgz0/m0;

    move-result-object v8

    const/4 v3, 0x3

    int-to-float v3, v3

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v12, v3, v7

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->h()Z

    move-result v3

    xor-int/lit8 v14, v3, 0x1

    invoke-virtual/range {p0 .. p0}, Lhy0/c2;->k()I

    move-result v15

    int-to-float v2, v2

    mul-float v9, v2, v7

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float/2addr v2, v7

    int-to-float v1, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v2, v1, v2, v1}, Ll0/l1;-><init>(FFFF)V

    const/high16 v1, 0x36030000

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v20, v2, v1

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit16 v1, v1, 0x180

    const/16 v22, 0x40c8

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x0

    move/from16 v21, v1

    move-object/from16 v19, v4

    move-object v4, v0

    invoke-static/range {v4 .. v22}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v19, v4

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final I(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Le62/a;->b:I

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3, v4}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v17

    sget-object v6, Lhy0/b2;->NO_CHANGE:Lhy0/b2;

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v9, v2, v3

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v2, v7

    mul-float/2addr v2, v3

    int-to-float v1, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v2, v1, v2, v1}, Ll0/l1;-><init>(FFFF)V

    const v1, 0x30c301b0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v20, v2, v1

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit8 v21, v1, 0x30

    const/16 v22, 0x5558

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v4

    move-object v4, v0

    invoke-static/range {v4 .. v22}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v19, v4

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Le62/a;->b:I

    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3, v4}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v17

    sget-object v6, Lhy0/b2;->NEUTRAL_CONCERN:Lhy0/b2;

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v9, v2, v3

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v2, v7

    mul-float/2addr v2, v3

    int-to-float v1, v1

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    new-instance v13, Ll0/l1;

    invoke-direct {v13, v2, v1, v2, v1}, Ll0/l1;-><init>(FFFF)V

    const v1, 0x30c301b0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int v20, v2, v1

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x9

    or-int/lit16 v1, v1, 0x1b0

    const/16 v22, 0x4558

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x1

    const/16 v18, 0x0

    move/from16 v21, v1

    move-object/from16 v19, v4

    move-object v4, v0

    invoke-static/range {v4 .. v22}, Lhy0/z1;->e(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;FLhy0/s0;ZFLl0/k1;ZIILb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v19, v4

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K(Ljava/util/List;IILy2/i1;)Ll83/a0;
    .locals 7

    const-string v0, "$this$layout"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v3, 0x0

    goto :goto_2

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    iget v4, v4, Ly2/j1;->x:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/j1;

    iget v5, v5, Ly2/j1;->x:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_1

    move-object v4, v5

    goto :goto_1

    :cond_2
    move-object v3, v4

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v0

    :goto_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v0

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/j1;

    invoke-static {v5, v4, v1, p3}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v5, v5, Ly2/j1;->w:I

    add-int/2addr v5, p2

    add-int/2addr v4, v5

    goto :goto_4

    :cond_4
    add-int/2addr v3, p1

    add-int/2addr v1, v3

    goto :goto_0

    :cond_5
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ld62/g;->F(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->I(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/ArrayList;IILy2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld62/g;->K(Ljava/util/List;IILy2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ld62/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld62/g;->C(Lkotlin/jvm/functions/Function1;Ld62/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->J(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhy0/c2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->H(Lhy0/c2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ld62/g;->s(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld62/g;->y(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->A(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;Ly2/v1;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->G(Ljava/util/List;Ly2/v1;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ld62/g;->E(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld62/g;->v(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n()Ll83/a0;
    .locals 1

    invoke-static {}, Ld62/g;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld62/g;->L(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ld62/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld62/g;->D(Ld62/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ld62/g;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v1, 0x4b4119c5    # 1.2655045E7f

    invoke-virtual {v11, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v11, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, v5, 0x40

    if-nez v4, :cond_2

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_2
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v1, v4

    :cond_4
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, p6, 0x4

    if-nez v4, :cond_6

    and-int/lit16 v4, v5, 0x200

    if-nez v4, :cond_5

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_4

    :cond_5
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_4
    if-eqz v4, :cond_6

    const/16 v4, 0x100

    goto :goto_5

    :cond_6
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v1, v4

    :cond_7
    and-int/lit8 v4, p6, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    :cond_8
    move/from16 v6, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_8

    move/from16 v6, p3

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x800

    goto :goto_6

    :cond_a
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v1, v7

    :goto_7
    and-int/lit16 v7, v1, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_b

    const/4 v7, 0x1

    goto :goto_8

    :cond_b
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v7, v5, 0x1

    if-eqz v7, :cond_e

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_d

    and-int/lit16 v1, v1, -0x381

    :cond_d
    move v4, v1

    move v1, v6

    goto :goto_a

    :cond_e
    :goto_9
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_f

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/lit16 v1, v1, -0x381

    :cond_f
    if-eqz v4, :cond_d

    move v4, v1

    const/4 v1, 0x1

    :goto_a
    invoke-virtual {v11}, Lp1/q;->r()V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->g:Ll0/h;

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v9, v10, v11, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    move/from16 p2, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v32, v0

    move/from16 v33, v1

    float-to-double v0, v6

    const-wide/16 v18, 0x0

    cmpl-double v0, v0, v18

    if-lez v0, :cond_13

    const/4 v0, 0x1

    goto :goto_c

    :cond_13
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_14

    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v1, 0x1

    invoke-direct {v0, v6, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v6, v1

    const/16 v8, 0x8

    int-to-float v8, v8

    const/16 v12, 0x36

    invoke-static {v6, v8, v10, v11, v12}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v6

    iget-wide v1, v11, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v11, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v1, v11, v1, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v11, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v18

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float v15, v8, v8

    invoke-static {v15, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x1b0

    move-object v10, v13

    const/4 v13, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move/from16 p3, v1

    move-object v5, v9

    move-object v1, v10

    move/from16 p4, v15

    move-wide/from16 v9, v18

    move-object/from16 v15, v20

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x0

    invoke-static {v6, v7, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_18

    invoke-virtual {v11, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v7, v11, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v11, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v3, p2, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v3, v1

    move-object/from16 v4, p1

    invoke-static {v4, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v30, v3, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move/from16 v16, v8

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move/from16 v3, v16

    const-wide/16 v15, 0x0

    const/4 v5, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v21, v20

    const-wide/16 v19, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v34, v29

    const/16 v29, 0x0

    move v5, v3

    move-object/from16 v35, v34

    move/from16 v3, p4

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-static/range {v32 .. v32}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const v6, 0x498ddb4

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    shr-int/lit8 v6, p2, 0x6

    and-int/lit8 v6, v6, 0xe

    or-int/2addr v1, v6

    move-object/from16 v6, v32

    invoke-static {v6, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v8

    const/16 v29, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object v6, v1

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v1, 0x1

    goto :goto_10

    :cond_1b
    const v1, 0x49c1d7f

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    if-eqz v33, :cond_1c

    const v6, -0x7ade0ef3

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/w;->s()I

    move-result v6

    move/from16 v7, p3

    invoke-static {v6, v11, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v9

    move-object/from16 v15, v35

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1c
    const v0, -0x7ad9fa27

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, v32

    move/from16 v4, v33

    goto :goto_12

    :cond_1d
    move-object v4, v2

    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v0

    move v4, v6

    :goto_12
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Law0/h;

    const/4 v7, 0x5

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final s(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ld62/g;->r(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, 0x4ec2f69b    # 1.6354707E9f

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v12, 0x1

    if-eqz p1, :cond_0

    move v0, v12

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x10

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p0

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v9, v5, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v9, p0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v2, v9, v2, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v9, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p0, 0x6

    int-to-float p0, p0

    mul-float/2addr p0, v3

    invoke-static {p0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p0, v2, :cond_4

    new-instance p0, Lcu2/l;

    const/16 v3, 0x18

    invoke-direct {p0, v3}, Lcu2/l;-><init>(I)V

    invoke-virtual {v9, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v5, p0

    check-cast v5, Lc93/a;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v2, :cond_5

    new-instance p0, Ld11/h;

    const/16 v2, 0x9

    invoke-direct {p0, v2}, Ld11/h;-><init>(I)V

    invoke-virtual {v9, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, p0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const v10, 0x1b0006

    const/16 v11, 0x19c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ld62/g;->t(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Landroidx/compose/ui/Modifier;Ld62/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ld62/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x3d61d7b

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

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

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    if-nez v5, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v6

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_8

    move v8, v11

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v14, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v15, v0

    goto :goto_6

    :cond_9
    move-object v15, v1

    :goto_6
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_a

    new-instance v1, Ld11/h;

    const/16 v5, 0x8

    invoke-direct {v1, v5}, Ld11/h;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v1, v7

    :goto_7
    sget v5, Le62/a;->a:I

    instance-of v7, v2, Ld62/i$a;

    if-eqz v7, :cond_f

    const v7, 0x71d52823

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v3, v3, 0x380

    if-ne v3, v6, :cond_c

    goto :goto_8

    :cond_c
    move v11, v10

    :goto_8
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v11, :cond_d

    if-ne v3, v0, :cond_e

    :cond_d
    new-instance v3, Lcom/whoop/profile/view/i;

    const/16 v0, 0x8

    invoke-direct {v3, v1, v0}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v19, v3

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v17, v15

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v7

    new-instance v3, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v6, 0xd

    invoke-direct {v3, v5, v6}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    const v5, 0x4e60eb73    # 9.433817E8f

    invoke-static {v5, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7a

    const/4 v6, 0x0

    const/4 v9, 0x0

    move v3, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    move v0, v3

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_f
    move v7, v10

    move-object/from16 v17, v15

    instance-of v8, v2, Ld62/i$b;

    if-eqz v8, :cond_10

    const v0, 0x71e02924

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v14, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v8

    new-instance v0, Lcom/whoop/profile/view/edit/preview/a;

    const/16 v3, 0xe

    invoke-direct {v0, v5, v3}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    const v3, -0x2b47bb56

    invoke-static {v3, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7b

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v0, v7

    move-wide v7, v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_10
    instance-of v5, v2, Ld62/i$c;

    if-eqz v5, :cond_14

    const v5, 0x71eab034

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    move-object v5, v2

    check-cast v5, Ld62/i$c;

    invoke-virtual {v5}, Ld62/i$c;->a()Lm91/u;

    move-result-object v5

    const-string v8, "null cannot be cast to non-null type com.whoop.recoveryimpacts.view.RecoveryInsightsTileState"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ld62/h;

    and-int/lit16 v3, v3, 0x380

    if-ne v3, v6, :cond_11

    move v10, v11

    goto :goto_9

    :cond_11
    move v10, v7

    :goto_9
    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_12

    if-ne v6, v0, :cond_13

    :cond_12
    new-instance v6, Ld30/l;

    const/4 v0, 0x5

    invoke-direct {v6, v0, v1, v5}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v19, v6

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    move-object/from16 v15, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v17, v15

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v8

    new-instance v3, Lci0/a;

    const/16 v6, 0x11

    invoke-direct {v3, v5, v6}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    const v5, -0x1fc7d5d5

    invoke-static {v5, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7a

    const/4 v6, 0x0

    move v3, v7

    move-wide v7, v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v0

    move v0, v3

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_a
    move-object v3, v1

    move-object/from16 v1, v17

    goto :goto_b

    :cond_14
    move v0, v7

    const v1, 0x66c4d08a

    invoke-static {v1, v14, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_15
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v7

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lc41/d1;

    const/16 v6, 0x17

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final y(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
