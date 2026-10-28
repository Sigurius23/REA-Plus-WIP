.class public abstract Lyw1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\rH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0017\u00b2\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Luw1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lww1/c;",
        "Ll83/a0;",
        "onEvent",
        "G",
        "(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Luw1/c$c;",
        "o",
        "(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "nameText",
        "Lkotlin/Function0;",
        "onRemove",
        "onCancel",
        "I",
        "(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "hasViewScreenFPHAlreadySent",
        "Lc41/r4;",
        "selectedProfileViewState",
        "allowSheetDismiss",
        "membership_release"
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
.method private static final A(Lp1/c1;)Lc41/r4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lc41/r4;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc41/r4;

    return-object p0
.end method

.method private static final B(Lp1/c1;Lc41/r4;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lc41/r4;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final C(Lp1/c1;)Z
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

.method private static final D(Lp1/c1;Z)V
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

.method private static final E(Lp1/c1;Lg1/z3;)Z
    .locals 1

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg1/z3;->w:Lg1/z3;

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Lyw1/i;->C(Lp1/c1;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;Lc41/r4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lg1/y3;",
            "Lc41/r4;",
            ")V"
        }
    .end annotation

    sget-object v0, Lww1/i;->a:Lww1/i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p5}, Lyw1/i;->B(Lp1/c1;Lc41/r4;)V

    const/4 p0, 0x0

    invoke-static {p3, p0}, Lyw1/i;->D(Lp1/c1;Z)V

    new-instance p0, Lyw1/i$h;

    const/4 p2, 0x0

    invoke-direct {p0, p4, p2}, Lyw1/i$h;-><init>(Lg1/y3;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p1, p2, p2, p0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final G(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luw1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x2967e8e2

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Luw1/c;->a()Luw1/c$b;

    move-result-object v1

    if-eqz v1, :cond_5

    const v1, -0x73134958

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Luw1/c;->a()Luw1/c$b;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p1, p2, v0}, Lyw1/d;->i(Luw1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Luw1/c;->c()Luw1/c$c;

    move-result-object v1

    if-eqz v1, :cond_6

    const v1, -0x73102ff0

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v0, 0x70

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p0, p1, p2, v0}, Lyw1/h;->f(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Luw1/c;->c()Luw1/c$c;

    move-result-object v0

    invoke-static {v0, p1, p2, v1}, Lyw1/i;->o(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const v0, -0x730c0c9c

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lyw1/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lyw1/f;-><init>(Luw1/c;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final H(Luw1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyw1/i;->G(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 81
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x7dcb3df6

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    move-object/from16 v0, p0

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v6, v1

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_1
    move-object/from16 v0, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v6, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x1

    if-eq v7, v11, :cond_6

    move v7, v13

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v9, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    int-to-float v7, v13

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v15, v7, v11

    int-to-float v1, v1

    mul-float v18, v1, v11

    const/16 v19, 0x2

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/16 v16, 0x0

    move/from16 v17, v15

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v79, v15

    move-object v15, v14

    move/from16 v14, v79

    sget-object v5, Lb2/e;->N:Lb2/k;

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v12, v12

    const/16 v13, 0x36

    invoke-static {v12, v11, v5, v9, v13}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v11

    move v12, v14

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v19, v6

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_7

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v9, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    invoke-static {v13, v9, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    mul-float/2addr v1, v1

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    invoke-static {v10, v13}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lx81/d;->a:Lx81/d;

    move/from16 v31, v1

    sget v1, Lx81/d;->b:I

    invoke-virtual {v13, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    move-object/from16 v23, v8

    invoke-virtual/range {v22 .. v22}, Ly81/i;->M()J

    move-result-wide v7

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v7, v8, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object/from16 v16, v11

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v25, v12

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v12, v23

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v9, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v16

    invoke-static {v9, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v10, v9, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v25 .. v25}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v7, 0x36

    invoke-static {v3, v5, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v9, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v5, v9, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v9, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lpv1/b;->b:I

    invoke-static {v9, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v3

    invoke-virtual {v13, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v10

    move-object/from16 v23, v12

    sget-object v12, Lp3/r;->I:Lp3/r;

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2ffda

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v16, v8

    move-object/from16 v27, v9

    move-wide/from16 v79, v10

    move-object v11, v7

    move-wide/from16 v7, v79

    const-wide/16 v9, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    const/16 v34, 0x1

    const/16 v17, 0x0

    move-object/from16 v36, v18

    move/from16 v35, v19

    const-wide/16 v18, 0x0

    const/16 v37, 0x20

    const/16 v20, 0x0

    const/16 v38, 0x100

    const/16 v21, 0x0

    const/16 v39, 0x0

    const/16 v22, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    const/high16 v41, 0x3f800000    # 1.0f

    const/16 v24, 0x0

    move-object/from16 v42, v26

    const/16 v26, 0x0

    move-object/from16 v43, v28

    const/high16 v28, 0x30000

    move-object/from16 p3, v0

    move/from16 v45, v25

    move-object/from16 v50, v32

    move-object/from16 v48, v33

    move/from16 v44, v35

    move-object/from16 v46, v36

    move-object/from16 v47, v40

    move-object/from16 v49, v43

    const/4 v0, 0x2

    move-object/from16 v25, v3

    move-object/from16 v3, v42

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_10

    const v5, -0x5198e85d

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget v5, Lpv1/b;->k:I

    filled-new-array/range {p0 .. p0}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6, v9}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v28, 0x0

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

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    const/4 v10, 0x0

    const v5, -0x51950366

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_9
    const/16 v16, 0x0

    const/16 v17, 0xff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v27, v9

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, v27

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v6, Lpv1/b;->j:I

    const/4 v12, 0x0

    invoke-direct {v5, v6, v12, v0, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v58, Lny0/p;->FAMILY_PLAN:Lny0/p;

    sget-object v6, Ly81/f;->TRANSPARENT:Ly81/f;

    invoke-static {v6}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v54

    sget-object v55, Ly81/f;->ACCENT_ALERT:Ly81/f;

    sget-object v62, Lny0/g;->STANDARD:Lny0/g;

    new-instance v51, Lny0/h;

    const v77, 0x1ffbbb2

    const/16 v78, 0x0

    const/16 v53, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x1

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    move-object/from16 v52, v5

    invoke-direct/range {v51 .. v78}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v13, v44

    and-int/lit8 v5, v13, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_11

    const/4 v5, 0x1

    goto :goto_a

    :cond_11
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_12

    if-ne v6, v14, :cond_13

    :cond_12
    new-instance v6, Ly71/e;

    const/16 v5, 0x8

    invoke-direct {v6, v2, v5}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v8, v6

    check-cast v8, Lc93/a;

    sget v5, Lny0/h;->z:I

    shl-int/lit8 v10, v5, 0x3

    const/4 v11, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v6, v51

    invoke-static/range {v5 .. v11}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x1

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    move-object/from16 v6, v50

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {v31 .. v31}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->M()J

    move-result-wide v6

    invoke-static {v5, v6, v7, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v7, v45

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_14

    move-object/from16 v11, v46

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v7, v47

    goto :goto_c

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v9, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v48

    invoke-static {v9, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    move-object/from16 v3, v49

    goto :goto_e

    :cond_16
    :goto_d
    move-object/from16 v3, p3

    goto :goto_f

    :goto_e
    invoke-static {v5, v9, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v9, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lpv1/b;->a:I

    invoke-direct {v1, v3, v12, v0, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v55, Ly81/f;->STRAIN:Ly81/f;

    new-instance v51, Lny0/h;

    const v77, 0x1ffbbb6

    const/16 v78, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x1

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    move-object/from16 v52, v1

    invoke-direct/range {v51 .. v78}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v13, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_17

    move v12, v15

    goto :goto_10

    :cond_17
    move v12, v4

    :goto_10
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_19

    if-ne v0, v14, :cond_18

    goto :goto_11

    :cond_18
    move-object/from16 v3, p2

    goto :goto_12

    :cond_19
    :goto_11
    new-instance v0, Ly71/e;

    const/16 v1, 0x9

    move-object/from16 v3, p2

    invoke-direct {v0, v3, v1}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object v8, v0

    check-cast v8, Lc93/a;

    const/4 v11, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v6, v51

    invoke-static/range {v5 .. v11}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1a
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lt20/o;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt20/o;-><init>(Ljava/lang/String;Lc93/a;Lc93/a;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final J(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lyw1/i;->I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic M(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lyw1/i;->q(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic N(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyw1/i;->z(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic O(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lyw1/i;->D(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic P(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;Lc41/r4;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lyw1/i;->F(Lkotlin/jvm/functions/Function1;Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;Lc41/r4;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyw1/i;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyw1/i;->v(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lg1/z3;)Z
    .locals 0

    invoke-static {p0, p1}, Lyw1/i;->E(Lp1/c1;Lg1/z3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyw1/i;->K(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyw1/i;->x(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Luw1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyw1/i;->H(Luw1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyw1/i;->J(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyw1/i;->u(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyw1/i;->s(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Luw1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyw1/i;->y(Luw1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyw1/i;->L(Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyw1/i;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Lp1/c1;
    .locals 1

    invoke-static {}, Lyw1/i;->p()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;)Lbc3/k1;
    .locals 0

    invoke-static {p0, p2, p3, p1}, Lyw1/i;->r(Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)Lbc3/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luw1/c$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p3

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, -0xcf5f18

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, v0, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-eq v3, v5, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v13, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v5, v9, :cond_5

    new-instance v5, Lyo0/c;

    const/16 v10, 0xf

    invoke-direct {v5, v10}, Lyo0/c;-><init>(I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lc93/a;

    const/16 v10, 0x30

    invoke-static {v3, v5, v13, v10}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_6

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v5

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lbc3/c0;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-ne v10, v9, :cond_7

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_8

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v12, Lp1/c1;

    sget-object v14, Lg1/z3;->w:Lg1/z3;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v9, :cond_9

    new-instance v15, Lyb0/e;

    const/4 v6, 0x7

    invoke-direct {v15, v6, v12}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v15, Lkotlin/jvm/functions/Function1;

    move-object v6, v9

    move-object v9, v14

    const/16 v14, 0xd86

    move-object/from16 v16, v11

    move-object v11, v15

    const/4 v15, 0x2

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x1

    move-object/from16 v25, v6

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    invoke-static/range {v9 .. v15}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v11

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v4, :cond_a

    const/16 v16, 0x1

    goto :goto_4

    :cond_a
    const/16 v16, 0x0

    :goto_4
    or-int v0, v9, v16

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_b

    move-object/from16 v0, v25

    if-ne v4, v0, :cond_c

    goto :goto_5

    :cond_b
    move-object/from16 v0, v25

    :goto_5
    new-instance v4, Lyw1/i$a;

    const/4 v9, 0x0

    invoke-direct {v4, v2, v1, v3, v9}, Lyw1/i$a;-><init>(Lkotlin/jvm/functions/Function1;Luw1/c$c;Lp1/c1;Lq83/d;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lc93/m;

    invoke-static {v13, v4, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_d

    if-ne v4, v0, :cond_e

    :cond_d
    new-instance v4, Lcom/whoop/profile/view/edit/e;

    invoke-direct {v4, v5, v11, v6, v7}, Lcom/whoop/profile/view/edit/e;-><init>(Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lc93/a;

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v15

    sget-wide v9, Li2/x;->b:J

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v19

    sget-wide v17, Li2/x;->m:J

    new-instance v0, Lyw1/e;

    invoke-direct {v0, v2, v4, v6}, Lyw1/e;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)V

    const v3, 0x228a8016

    invoke-static {v3, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    new-instance v0, Lat2/b0;

    move-object v12, v7

    const/16 v7, 0xc

    move-object v3, v5

    move-object v5, v6

    move-object v4, v11

    move-object v6, v12

    invoke-direct/range {v0 .. v7}, Lat2/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x28f0880f

    invoke-static {v3, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v21

    const v23, 0x36c00206

    const/16 v24, 0x3a

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v24}, Landroidx/compose/material/c;->a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v22

    goto :goto_6

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v3, Lyf1/e;

    const/16 v4, 0x9

    invoke-direct {v3, v1, v2, v8, v4}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final p()Lp1/c1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final q(Lp1/c1;)Z
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

.method private static final r(Lbc3/c0;Lp1/c1;Lp1/c1;Lg1/y3;)Lbc3/k1;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lyw1/i;->B(Lp1/c1;Lc41/r4;)V

    const/4 p1, 0x1

    invoke-static {p2, p1}, Lyw1/i;->D(Lp1/c1;Z)V

    new-instance p1, Lyw1/i$d;

    invoke-direct {p1, p3, p2, v0}, Lyw1/i$d;-><init>(Lg1/y3;Lp1/c1;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p0, v0, v0, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 5

    const-string v0, "$this$sheetContent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p5, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    and-int/2addr p5, v2

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p5, p3}, Lp1/q;->U(IZ)Z

    move-result p3

    sget-object p5, Ll83/a0;->a:Ll83/a0;

    if-eqz p3, :cond_9

    invoke-static {p2}, Lyw1/i;->A(Lp1/c1;)Lc41/r4;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lc41/r4;->k()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lc41/r4;->m()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lc41/r4;->f()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    :goto_1
    return-object p5

    :cond_4
    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p3, p4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_5

    if-ne v3, v4, :cond_6

    :cond_5
    new-instance v3, Lnw0/e;

    invoke-direct {v3, p0, v0, p2, p1}, Lnw0/e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc93/a;)V

    invoke-virtual {p4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/a;

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_7

    if-ne p2, v4, :cond_8

    :cond_7
    new-instance p2, Ly71/e;

    const/16 p0, 0xa

    invoke-direct {p2, p1, p0}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {p4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast p2, Lc93/a;

    invoke-static {p3, v3, p2, p4, v1}, Lyw1/i;->I(Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    return-object p5

    :cond_9
    invoke-virtual {p4}, Lp1/q;->X()V

    return-object p5
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lc93/a;)Ll83/a0;
    .locals 1

    new-instance v0, Lww1/d$d;

    invoke-direct {v0, p1, p2}, Lww1/d$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 38

    move-object/from16 v2, p1

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x0

    const/4 v8, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p7, 0x1

    move-object/from16 v15, p6

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v0, v4}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v8

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v6, v9, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v9, v15, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v15, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lih0/d0;->C(Lx81/d;)I

    move-result v13

    sget v14, Lvu1/h;->e:I

    invoke-static {v14, v15, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Luw1/c$c;->a()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const v33, 0xfff2

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

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

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_4

    if-ne v14, v8, :cond_5

    :cond_4
    new-instance v14, Lyk2/i;

    const/4 v13, 0x7

    invoke-direct {v14, v2, v13}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v14, Lc93/a;

    sget v13, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v13, v13, 0x3

    const/16 v17, 0x35

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v10

    move-object/from16 v10, v16

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v22, v12

    move-object v12, v14

    const/4 v14, 0x0

    move-object/from16 v37, v18

    move-object/from16 v3, v19

    move-object/from16 v36, v20

    move-object/from16 v35, v22

    invoke-static/range {v9 .. v17}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v15, v3}, Lp1/q;->l(Lc93/a;)V

    :goto_2
    move-object/from16 v3, v35

    goto :goto_3

    :cond_6
    invoke-virtual {v15}, Lp1/q;->s0()V

    goto :goto_2

    :goto_3
    invoke-static {v15, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    move-object/from16 v1, v36

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v1, v37

    goto :goto_6

    :goto_5
    invoke-static {v9, v15, v9, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v15, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x2

    int-to-float v3, v1

    mul-float/2addr v3, v7

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v0, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v15}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v0

    iget-object v0, v0, Ll0/c2;->e:Ll0/b;

    invoke-static {v0, v15}, Ll0/f;->e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;

    move-result-object v0

    invoke-virtual {v0}, Ll0/x0;->a()F

    move-result v13

    const/4 v14, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lx81/d;->b:I

    invoke-virtual {v5, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v3

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v3, v4, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr v7, v0

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    move-object/from16 v1, p0

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    move-object/from16 v3, p2

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    move-object/from16 v4, p3

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_9

    if-ne v5, v8, :cond_a

    :cond_9
    new-instance v0, Lam2/b;

    const/16 v7, 0x15

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_a
    move-object/from16 v17, v5

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x6000

    const/16 v20, 0x1ee

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v20}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v18

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lww1/e$d;->a:Lww1/e$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Luw1/c$c;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 12

    move-object/from16 v0, p6

    const-string v1, "$this$LazyColumn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Luw1/c$c;->b()Ljava/util/List;

    move-result-object v3

    sget-object v1, Lyw1/i$e;->w:Lyw1/i$e;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    new-instance v11, Lyw1/i$f;

    invoke-direct {v11, v1, v3}, Lyw1/i$f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v2, Lyw1/i$g;

    move-object v7, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v2 .. v9}, Lyw1/i$g;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Luw1/c$c;Lp1/c1;Lp1/c1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x2fd4df92

    invoke-direct {p0, v2, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object p1, v0

    check-cast p1, Ln0/f;

    const/4 p2, 0x0

    invoke-virtual {p1, v10, p2, v11, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Luw1/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyw1/i;->o(Luw1/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;Z)V
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
