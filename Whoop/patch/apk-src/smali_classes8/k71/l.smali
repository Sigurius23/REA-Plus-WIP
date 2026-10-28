.class public abstract Lk71/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0002\u001a\u000f\u0010\u0008\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\u0002\u001a\u000f\u0010\t\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\t\u0010\u0002\u001a\u000f\u0010\n\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u0002\u001a\u000f\u0010\u000b\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u0002\u001a\u0019\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Ll83/a0;",
        "G",
        "(Landroidx/compose/runtime/Composer;I)V",
        "I",
        "C",
        "w",
        "A",
        "y",
        "m",
        "o",
        "q",
        "u",
        "",
        "useLongText",
        "s",
        "(ZLandroidx/compose/runtime/Composer;II)V",
        "E",
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
.method public static final A(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x3365762c    # -8.102262E7f

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v7, Lcom/whoop/util/TrendKey;->RECOVERY:Lcom/whoop/util/TrendKey;

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/c;->d()I

    move-result v3

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v4, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Graphing Card - One Legend"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lk71/d;

    sget-object v3, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-static {v3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v12

    const-string v3, "HIGH RECOVERY"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v15, Ln21/i;->CIRCLE:Ln21/i;

    const/16 v17, 0x14

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    new-instance v6, Lk71/m;

    const v30, 0x7fef66

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v6

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x16

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->A(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x697c827d

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v7, Lcom/whoop/util/TrendKey;->RECOVERY:Lcom/whoop/util/TrendKey;

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/c;->d()I

    move-result v3

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v4, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Graphing Card"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    new-instance v6, Lk71/m;

    const v30, 0x7fef76

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v6

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x12

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->C(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x21e29c76

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lk71/l$a;

    invoke-direct {v1}, Lk71/l$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lhy0/e0;

    const/16 v1, 0x11

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->E(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final G(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, -0x7dbe5989

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

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v0

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v1}, Lk71/l;->C(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->w(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->y(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->A(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->m(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->o(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v1}, Lk71/l;->w(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lhy0/e0;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final H(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->G(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final I(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, 0x31d2983a

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v3, v1

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lk71/l;->q(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p0, v0}, Lk71/l;->u(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, p0, v0, v1}, Lk71/l;->s(ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lhy0/e0;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final J(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->I(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->H(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->z(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lk71/l;->t(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->D(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->J(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lk71/l;->F(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x2daf5c04

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v7, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    const-string v2, "85%+ SLEEP PERFORMANCE "

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    const-string v1, "Average at least 85%+ Sleep Performance to complete this goal."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const-string v1, "85%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v21, Lk71/c;->ENABLED:Lk71/c;

    new-instance v2, Lk71/m;

    const v30, 0x7e3f76

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x18

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final n(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x37892f5d

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v7, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    const-string v2, "85%+ SLEEP PERFORMANCE "

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    const-string v1, "Average at least 85%+ Sleep Performance to complete this goal."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const-string v1, "82%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v21, Lk71/c;->DISABLED:Lk71/c;

    new-instance v2, Lk71/m;

    const v30, 0x7e3f76

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x1a

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final p(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->o(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final q(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x2f80f91a

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lk71/m;

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "IA AND ICONS"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    new-instance v1, Ly71/g;

    sget-object v3, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v4, 0x2

    invoke-direct {v1, v3, v7, v4, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v20, Lgz0/m0;->EDUCATION:Lgz0/m0;

    const v30, 0x7fcf76

    const/16 v31, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

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

    move-object/from16 v19, v1

    move-object v7, v6

    move-object v6, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x1b

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final r(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->q(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(ZLandroidx/compose/runtime/Composer;II)V
    .locals 36

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x5185a5d6

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move/from16 v4, p0

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v7, v5, 0x3

    const/4 v8, 0x0

    if-eq v7, v3, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    move v7, v8

    :goto_2
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v6, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_6

    if-eqz v2, :cond_4

    move v4, v8

    :cond_4
    if-eqz v4, :cond_5

    const-string v2, "Zone 1 Long Text"

    const-string v7, "Zone 2 Long Text"

    const-string v9, "Zone 3 Long Text"

    goto :goto_3

    :cond_5
    const-string v2, "Zone 1"

    const-string v7, "Zone 2"

    const-string v9, "Zone 3"

    :goto_3
    sget-object v11, Lcom/whoop/util/TrendKey;->RECOVERY:Lcom/whoop/util/TrendKey;

    new-instance v10, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/c;->d()I

    move-result v12

    const/4 v13, 0x0

    invoke-direct {v10, v12, v13, v3, v13}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Graph Card - Multi HR Legend"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v15, Lk71/d;

    sget-object v3, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    invoke-static {v3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v16

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v22, Ln21/i;->SQUARE:Ln21/i;

    const/16 v21, 0x14

    move-object/from16 v19, v22

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v18, Lk71/d;

    sget-object v2, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    invoke-static {v2}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v2

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v24, 0x14

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v19

    move-object/from16 v19, v2

    invoke-direct/range {v18 .. v25}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v18

    move-object/from16 v19, v22

    new-instance v18, Lk71/d;

    sget-object v3, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    invoke-static {v3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v3

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    move-object/from16 v19, v3

    invoke-direct/range {v18 .. v25}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    filled-new-array {v15, v2, v3}, [Lk71/d;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v6, v8}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v18

    new-instance v3, Lk71/m;

    const v34, 0x7fef36

    const/16 v35, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v23, v10

    move-object v10, v3

    invoke-direct/range {v10 .. v35}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shl-int/lit8 v2, v5, 0x6

    and-int/lit16 v7, v2, 0x380

    const/16 v8, 0x9

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lk71/k;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v0, v1, v5}, Lk71/k;-><init>(ZIII)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final t(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lk71/l;->s(ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final u(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x56c65ba0

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lk71/m;

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "IA NO ICON"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    const v30, 0x7fff76

    const/16 v31, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object v7, v6

    move-object v6, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x17

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final v(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->u(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x2671e308    # -5.0001623E15f

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v7, Lcom/whoop/util/TrendKey;->RECOVERY:Lcom/whoop/util/TrendKey;

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/c;->d()I

    move-result v3

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v4, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Graphing Card - No Body With Legend"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lk71/d;

    sget-object v3, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    invoke-static {v3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v12

    const-string v3, "HIGH RECOVERY"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v15, Ln21/i;->CIRCLE:Ln21/i;

    const/16 v17, 0x14

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lk71/d;

    sget-object v3, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    invoke-static {v3}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v3

    const-string v4, "LOW RECOVERY"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v20, 0x14

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v15

    move-object v15, v3

    invoke-direct/range {v14 .. v21}, Lk71/d;-><init>(Li91/a;Lcom/whoop/design/util/TextResource;Li91/a;Ln21/i;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v1

    new-instance v6, Lk71/m;

    const v30, 0x7fef46

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v2

    move-object v12, v14

    move-object v14, v1

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v6

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x13

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final x(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->w(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x4d0701fd

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Graphing Card - No Body No Caret"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/c;->d()I

    move-result v3

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v4, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v1}, Ld71/e;->k(Landroidx/compose/runtime/Composer;I)Lj71/c;

    move-result-object v14

    sget-object v7, Lcom/whoop/util/TrendKey;->NONE:Lcom/whoop/util/TrendKey;

    new-instance v6, Lk71/m;

    const v30, 0x7fef76

    const/16 v31, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v19, v2

    invoke-direct/range {v6 .. v31}, Lk71/m;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v6

    const/4 v6, 0x0

    const/16 v7, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lk71/j;->u(Landroidx/compose/ui/Modifier;Lk71/m;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lhy0/e0;

    const/16 v3, 0x19

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final z(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lk71/l;->y(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
