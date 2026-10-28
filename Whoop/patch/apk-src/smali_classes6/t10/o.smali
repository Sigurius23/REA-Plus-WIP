.class public abstract Lt10/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls10/c;

.field public static final b:Ls10/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ls10/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Lt10/o;->a:Ls10/c;

    new-instance v0, Ls10/c;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Lt10/o;->b:Ls10/c;

    return-void
.end method

.method public static final a(Lt10/j;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, -0x155a60c2

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v0, v0, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v0, p0, Lt10/j;->f:Lzy/c;

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v0, p1}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    int-to-float v1, v1

    const/4 v3, 0x1

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    invoke-static {v4, v5, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1, p1, v2}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lt10/l;

    invoke-direct {v0, p0, p2, v2}, Lt10/l;-><init>(Lt10/j;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final b(Lt10/j;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x5aa2dede

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    and-int/lit16 v4, v0, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_4

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_4
    :goto_3
    sget-object v4, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_5

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v7, v9, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON"

    invoke-static {v5, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v4, p0, Lt10/j;->a:Lzy/c;

    invoke-static {v4, v9}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v4

    iget-boolean v3, p0, Lt10/j;->e:Z

    move-object v2, v4

    iget-boolean v4, p0, Lt10/j;->b:Z

    iget-object v6, p0, Lt10/j;->c:Lb30/g4;

    shl-int/lit8 v0, v0, 0xc

    const/high16 v7, 0x70000

    and-int/2addr v7, v0

    or-int/lit16 v7, v7, 0xc00

    const/high16 v8, 0x380000

    and-int/2addr v0, v8

    or-int v10, v7, v0

    const/4 v11, 0x0

    move-object v7, p1

    move-object v8, p2

    invoke-static/range {v2 .. v11}, Lb30/c4;->d(Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lb30/g4;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_8

    new-instance v0, Ljp1/k;

    const/16 v5, 0x16

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final c(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    const-string v0, "onDismissed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x2b976d79

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, p1

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {v5}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v0, v0, Ld40/n;->h:J

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v2, Ld40/p;->f:Ld40/g;

    iget v7, v2, Ld40/g;->a:F

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->z:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v5, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7, v5, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v5, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x117f06f3

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    if-nez p0, :cond_7

    invoke-static {v5, v6}, Lb30/g3;->d(Landroidx/compose/runtime/Composer;I)V

    :cond_7
    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    sget-object v2, Lb2/e;->F:Lb2/m;

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v3, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lg40/w0;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lg40/w0;-><init>(JI)V

    const v0, 0x2cfcea97

    invoke-static {v0, v5, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    shr-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0xe

    or-int/lit16 v6, p2, 0x6180

    const/16 v7, 0x8

    const/4 v3, 0x1

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x1

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p2, Lt10/k;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v1, p3, v0}, Lt10/k;-><init>(ZLc93/a;II)V

    iput-object p2, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final d(Ld30/v;Lk20/a;Lc93/a;Lc93/a;Lt10/j;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "interactor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onProcessingCompleted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismissed"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p6

    check-cast v7, Lp1/q;

    const v0, -0x680c6196

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    invoke-virtual {v7, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x800

    goto :goto_3

    :cond_3
    const/16 v1, 0x400

    :goto_3
    or-int/2addr v0, v1

    invoke-virtual {v7, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x4000

    goto :goto_4

    :cond_4
    const/16 v1, 0x2000

    :goto_4
    or-int/2addr v0, v1

    invoke-virtual {v7, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/high16 v1, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v1, 0x10000

    :goto_5
    or-int v8, v0, v1

    const v0, 0x12493

    and-int/2addr v0, v8

    const v1, 0x12492

    if-ne v0, v1, :cond_7

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    goto :goto_7

    :cond_7
    :goto_6
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v7, v1}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v1

    iget-object v2, p0, Ld30/v;->l:Ln53/e;

    invoke-static {v2, v7, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld30/g1;

    iget-boolean v2, v2, Ld30/g1;->b:Z

    invoke-static {v2, v7, v0}, Lds/p;->a(ZLandroidx/compose/runtime/Composer;I)V

    new-instance v0, Lt10/m;

    move-object v2, p0

    move-object v6, p2

    move-object v5, p3

    move-object v4, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v6}, Lt10/m;-><init>(Lf0/r1;Ld30/v;Lc93/a;Lt10/j;Lc93/a;Lc93/a;)V

    const v1, 0x7591dc8a

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    invoke-static {p1, v0, v7, v1}, Lio/sentry/config/a;->e(Lk20/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_8

    new-instance v0, Lat2/b0;

    const/16 v8, 0x9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lat2/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final e(Lt10/j;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x5e55b29a

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    const/4 v9, 0x1

    if-ne p1, v0, :cond_2

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, Lt10/j;->g:Lzy/c;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p1, v6}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v1

    const/16 p1, 0x8

    int-to-float p1, p1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v0, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v7, 0x0

    const/16 v8, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lt10/l;

    invoke-direct {v0, p0, p2, v9}, Lt10/l;-><init>(Lt10/j;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method
