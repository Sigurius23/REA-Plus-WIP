.class public abstract Lb30/c4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x6

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v0, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v0

    const/16 v4, 0x5a

    const/4 v5, 0x4

    invoke-static {v1, v4, v3, v5}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    invoke-static {v1, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object v0

    sput-object v0, Lb30/c4;->a:Lc0/l0;

    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x72da1f3a

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x20

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x13

    const/16 v0, 0x12

    if-ne p1, v0, :cond_2

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    sget-object p1, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v4, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const v0, 0x78355575

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v0, v7, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v0

    check-cast v8, Lp1/c1;

    const v0, 0x78355ea2

    const/4 v9, 0x0

    invoke-static {v0, v4, v9}, Lr;->h(ILp1/q;Z)Ljava/lang/Object;

    move-result-object v0

    const/4 v10, 0x0

    if-ne v0, v7, :cond_5

    if-eqz p1, :cond_4

    move v0, v10

    goto :goto_2

    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_2
    invoke-static {v0, v4}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v0

    :cond_5
    move-object v11, v0

    check-cast v11, Lp1/z0;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    move-object v0, v11

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const v1, 0x78358890

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_6

    new-instance v1, Laq1/d;

    const/4 v2, 0x5

    invoke-direct {v1, v2, v8}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    const/16 v5, 0x6c00

    const/4 v6, 0x6

    const/4 v1, 0x0

    const-string v2, "CheckmarkAnimation"

    invoke-static/range {v0 .. v6}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    invoke-static {p0, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_a

    const p1, -0x71807e37

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    const p1, 0x7835ac29

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v7, :cond_7

    new-instance p1, La20/b;

    const/16 v3, 0xa

    invoke-direct {p1, v11, v2, v3}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p1, Lc93/m;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, p1, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc93/a;

    const v5, 0x7835c1e8

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    if-ne v6, v7, :cond_9

    :cond_8
    new-instance v6, Le;

    const/16 v5, 0x15

    invoke-direct {v6, v8, v1, v2, v5}, Le;-><init>(Lp1/t2;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lc93/m;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    invoke-static {p1, v3, v6, v4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_a
    const p1, -0x717aec56

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc93/a;

    const v3, 0x7835dddc

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    if-ne v5, v7, :cond_c

    :cond_b
    new-instance v5, La13/h;

    const/4 v3, 0x4

    invoke-direct {v5, v1, v2, v3}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/m;

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    invoke-static {v4, v5, p1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    :goto_3
    new-instance p1, Lb2/m;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-direct {p1, v0, v10}, Lb2/m;-><init>(FF)V

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-virtual {v0, v1, p1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1, v4, v9}, Lb30/c4;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lb30/y3;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1, p0}, Lb30/y3;-><init>(IILc93/a;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final b(Ljava/lang/String;Lb30/g4;ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p5

    check-cast v6, Lp1/q;

    const v0, -0x4cc47cfc

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p6

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    invoke-virtual {v6, p2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    invoke-virtual {v6, p3}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x800

    goto :goto_3

    :cond_3
    const/16 v3, 0x400

    :goto_3
    or-int/2addr v0, v3

    invoke-virtual {v6, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x4000

    goto :goto_4

    :cond_4
    const/16 v7, 0x2000

    :goto_4
    or-int/2addr v7, v0

    and-int/lit16 v0, v7, 0x2493

    const/16 v8, 0x2492

    if-ne v0, v8, :cond_6

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_6

    :cond_6
    :goto_5
    new-instance v0, Lb30/z3;

    move-object v4, p0

    move-object v3, p1

    move v1, p2

    move v5, p3

    move-object v2, p4

    invoke-direct/range {v0 .. v5}, Lb30/z3;-><init>(ZLc93/a;Lb30/g4;Ljava/lang/String;Z)V

    const v3, 0xf33227f

    invoke-static {v3, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v3, v7, 0x3

    and-int/lit8 v4, v3, 0xe

    or-int/lit16 v4, v4, 0x180

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v4

    invoke-static {p1, p2, v0, v6, v3}, Lb30/c4;->c(Lb30/g4;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_7

    new-instance v0, Lb30/x3;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lb30/x3;-><init>(Ljava/lang/String;Lb30/g4;ZZLc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final c(Lb30/g4;ZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p3

    check-cast v7, Lp1/q;

    const p3, -0x1d149c8

    invoke-virtual {v7, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    if-nez p3, :cond_2

    and-int/lit8 p3, p4, 0x8

    if-nez p3, :cond_0

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    :goto_0
    if-eqz p3, :cond_1

    const/4 p3, 0x4

    goto :goto_1

    :cond_1
    const/4 p3, 0x2

    :goto_1
    or-int/2addr p3, p4

    goto :goto_2

    :cond_2
    move p3, p4

    :goto_2
    and-int/lit8 v0, p4, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v7, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p3, v0

    :cond_4
    and-int/lit16 v0, p4, 0x180

    if-nez v0, :cond_6

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x100

    goto :goto_4

    :cond_5
    const/16 v0, 0x80

    :goto_4
    or-int/2addr p3, v0

    :cond_6
    and-int/lit16 v0, p3, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_8

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_7

    :cond_8
    :goto_5
    instance-of v0, p0, Lb30/d4;

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/a1;->x:Ll0/a1;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v10, 0x0

    if-eqz p1, :cond_c

    const v2, -0x1857ae97

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_9

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v0, v7, p3}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p3, 0x1

    invoke-virtual {v7, p3}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    const p3, -0x18562984

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const p3, -0x4b1b7e2f

    invoke-virtual {v7, p3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p3, v2, :cond_d

    new-instance p3, Lb01/f;

    const/16 v2, 0x14

    invoke-direct {p3, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {v7, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    new-instance p3, Lb30/a4;

    const/4 v3, 0x0

    invoke-direct {p3, p2, v3}, Lb30/a4;-><init>(Ljava/lang/Object;I)V

    const v3, 0x4364d331

    invoke-static {v3, v7, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x1861b0

    const/16 v9, 0x28

    const/4 v3, 0x0

    const-string v4, "ContentAnimation"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_e

    new-instance v0, Lar2/f;

    const/4 v5, 0x2

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final d(Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lb30/g4;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move-object/from16 v8, p0

    move/from16 v3, p2

    move-object/from16 v0, p4

    move-object/from16 v7, p6

    move/from16 v13, p8

    const-string v1, "label"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p7

    check-cast v1, Lp1/q;

    const v2, 0x151e5a

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v13, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v13

    goto :goto_1

    :cond_1
    move v2, v13

    :goto_1
    and-int/lit8 v5, v13, 0x30

    move/from16 v11, p1

    if-nez v5, :cond_3

    invoke-virtual {v1, v11}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v13, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v1, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0xc00

    :cond_6
    move-object/from16 v6, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v13, 0xc00

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit16 v9, v13, 0x6000

    if-nez v9, :cond_b

    and-int/lit8 v9, p9, 0x10

    if-nez v9, :cond_a

    const v9, 0x8000

    and-int/2addr v9, v13

    if-nez v9, :cond_9

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_6

    :cond_9
    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_6
    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_7

    :cond_a
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v2, v9

    :cond_b
    and-int/lit8 v9, p9, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_d

    or-int/2addr v2, v10

    :cond_c
    move-object/from16 v10, p5

    goto :goto_9

    :cond_d
    and-int/2addr v10, v13

    if-nez v10, :cond_c

    move-object/from16 v10, p5

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v2, v12

    :goto_9
    const/high16 v12, 0x180000

    and-int/2addr v12, v13

    if-nez v12, :cond_10

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v12, 0x80000

    :goto_a
    or-int/2addr v2, v12

    :cond_10
    const v12, 0x92493

    and-int/2addr v2, v12

    const v12, 0x92492

    if-ne v2, v12, :cond_12

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_b

    :cond_11
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v5, v0

    move-object v14, v1

    move-object v4, v6

    move-object v6, v10

    goto/16 :goto_18

    :cond_12
    :goto_b
    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v2, v13, 0x1

    sget-object v12, Lp1/l;->a:Lp1/v0;

    const/4 v14, 0x0

    if-eqz v2, :cond_15

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_13

    goto :goto_c

    :cond_13
    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_14
    move-object v9, v0

    goto :goto_d

    :cond_15
    :goto_c
    if-eqz v5, :cond_16

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v6, v2

    :cond_16
    and-int/lit8 v2, p9, 0x10

    if-eqz v2, :cond_17

    new-instance v0, Lb30/e4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_17
    if-eqz v9, :cond_14

    const v2, -0x657d7582

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_18

    new-instance v2, Lb1/h;

    const/4 v5, 0x4

    invoke-direct {v2, v5}, Lb1/h;-><init>(I)V

    invoke-virtual {v1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v2, Lc93/a;

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    move-object v9, v0

    move-object v10, v2

    :goto_d
    invoke-virtual {v1}, Lp1/q;->r()V

    instance-of v0, v9, Lb30/d4;

    const v2, 0x4aeffbb9    # 7863772.5f

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    const v5, 0x11999b55

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    const/high16 v4, 0x3f800000    # 1.0f

    if-nez v5, :cond_19

    if-ne v15, v12, :cond_1a

    :cond_19
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v5, "animator_duration_scale"

    invoke-static {v2, v5, v4}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-virtual {v1, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    sget-object v5, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v1, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_1c

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-gtz v2, :cond_1b

    goto :goto_e

    :cond_1b
    move v2, v14

    goto :goto_f

    :cond_1c
    :goto_e
    const/4 v2, 0x1

    :goto_f
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    invoke-static {v1}, Le4/a;->x(Landroidx/compose/runtime/Composer;)Lb30/t3;

    move-result-object v5

    invoke-static {v1}, Le4/a;->C(Landroidx/compose/runtime/Composer;)Lb30/h4;

    move-result-object v3

    const v15, -0x657d5112

    invoke-virtual {v1, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v0}, Lp1/q;->h(Z)Z

    move-result v15

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v15, :cond_1d

    if-ne v4, v12, :cond_1f

    :cond_1d
    if-eqz v0, :cond_1e

    iget-wide v14, v5, Lb30/t3;->c:J

    goto :goto_10

    :cond_1e
    iget-wide v14, v5, Lb30/t3;->a:J

    :goto_10
    new-instance v4, Li2/x;

    invoke-direct {v4, v14, v15}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v4, Li2/x;

    iget-wide v14, v4, Li2/x;->a:J

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    const v4, -0x657d3681

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_20

    move/from16 p4, v2

    move-wide/from16 v21, v14

    move-object v14, v1

    move-wide/from16 v1, v21

    goto :goto_11

    :cond_20
    const/16 v4, 0x64

    sget-object v12, Ld0/b0;->c:Lb23/h;

    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-static {v4, v0, v12, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v16

    const/16 v19, 0x180

    const/16 v20, 0x8

    const-string v17, "BackgroundAnimation"

    invoke-static/range {v14 .. v20}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v1

    move-object/from16 v14, v18

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    move/from16 p4, v2

    iget-wide v1, v1, Li2/x;->a:J

    :goto_11
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    sget-object v4, Lg1/j1;->a:Lp1/b0;

    if-eqz p2, :cond_23

    const v12, -0x657d07a0

    invoke-virtual {v14, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v14, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Li2/x;

    move-wide/from16 v16, v1

    iget-wide v0, v12, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    const-wide/high16 v18, 0x3fe0000000000000L    # 0.5

    if-eqz v2, :cond_21

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpl-double v0, v0, v18

    if-lez v0, :cond_22

    goto :goto_12

    :cond_21
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    move-result v0

    float-to-double v0, v0

    cmpg-double v0, v0, v18

    if-gez v0, :cond_22

    :goto_12
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_13
    const/4 v15, 0x0

    goto :goto_14

    :cond_22
    const v0, 0x3f5eb852    # 0.87f

    goto :goto_13

    :goto_14
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_23
    move-wide/from16 v16, v1

    const v0, -0x657d04bc

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v14, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    :goto_15
    const/4 v15, 0x0

    goto :goto_16

    :cond_24
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    goto :goto_15

    :goto_16
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    const v0, 0x3ec28f5c    # 0.38f

    :goto_17
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v15

    new-instance v0, Lb30/b4;

    move/from16 v4, p2

    move-object v1, v6

    move-object v2, v7

    move-object v12, v10

    move-wide/from16 v6, v16

    move/from16 v10, p4

    invoke-direct/range {v0 .. v12}, Lb30/b4;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;Lb30/h4;ZLb30/t3;JLjava/lang/String;Lb30/g4;ZZLc93/a;)V

    const v2, 0x1157c31a

    invoke-static {v2, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v15, v0, v14, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v1

    move-object v5, v9

    move-object v6, v12

    :goto_18
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_25

    new-instance v0, Lb30/w3;

    const/4 v10, 0x0

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v7, p6

    move/from16 v9, p9

    move v8, v13

    invoke-direct/range {v0 .. v10}, Lb30/w3;-><init>(Ljava/lang/Object;ZZLandroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/a;Ll83/e;III)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method public static final e(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p1, Lp1/q;

    const v0, 0x52b1ee0f

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_2

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_3

    :cond_2
    :goto_1
    const v2, -0x1ac69a88

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_5

    :cond_4
    new-instance v1, La31/e;

    const/4 v0, 0x3

    invoke-direct {v1, p0, v0}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lc93/a;

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    invoke-static {v1, p1}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget-object v1, Lb2/e;->E:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p1, v2}, Lb30/c4;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lb30/y3;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1, p0}, Lb30/y3;-><init>(IILc93/a;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final f(Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    sget-object v3, Lb2/e;->F:Lb2/m;

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v4, -0xb57c1ab

    invoke-virtual {v8, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x20

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int v4, p4, v4

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v4, v5

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x800

    goto :goto_2

    :cond_2
    const/16 v5, 0x400

    :goto_2
    or-int/2addr v4, v5

    and-int/lit16 v5, v4, 0x493

    const/16 v6, 0x492

    if-ne v5, v6, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    move v3, v2

    goto/16 :goto_5

    :cond_4
    :goto_3
    invoke-static {v8}, Le4/a;->x(Landroidx/compose/runtime/Composer;)Lb30/t3;

    move-result-object v5

    const v6, 0x44c28a8a

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    const v6, -0x48290a34

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ld40/p;->e:Ld40/k;

    sget-object v7, Lb30/i4;->c:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb30/j4;

    const v9, 0x3cb0c8fa

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/16 v11, 0xe

    if-nez v9, :cond_5

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v10, v9, :cond_9

    :cond_5
    iget-object v9, v7, Lb30/j4;->a:Lp3/i;

    if-nez v9, :cond_7

    iget-object v9, v6, Ld40/k;->d:Ld40/l;

    iget-object v9, v9, Ld40/l;->a:Ljava/lang/Integer;

    const/4 v10, 0x0

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-static {v9, v10, v11}, Lhg3/i;->b(ILp3/r;I)Lp3/x;

    move-result-object v9

    filled-new-array {v9}, [Lp3/x;

    move-result-object v9

    invoke-static {v9}, Le93/b;->d([Lp3/x;)Lp3/l;

    move-result-object v9

    goto :goto_4

    :cond_6
    move-object v9, v10

    :cond_7
    :goto_4
    iget-wide v12, v7, Lb30/j4;->b:J

    sget-object v7, Ly3/o;->b:[Ly3/p;

    const-wide v14, 0xff00000000L

    and-long/2addr v14, v12

    const-wide/16 v16, 0x0

    cmp-long v7, v14, v16

    if-nez v7, :cond_8

    iget-object v6, v6, Ld40/k;->d:Ld40/l;

    iget-wide v12, v6, Ld40/l;->b:J

    :cond_8
    new-instance v10, Lb30/j4;

    invoke-direct {v10, v9, v12, v13}, Lb30/j4;-><init>(Lp3/i;J)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lb30/j4;

    const/4 v6, 0x0

    invoke-static {v8, v6, v6, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    iget-object v7, v10, Lb30/j4;->a:Lp3/i;

    if-nez v7, :cond_a

    sget-object v7, Lp3/i;->w:Lp3/f;

    :cond_a
    move-object/from16 v19, v7

    iget-wide v9, v10, Lb30/j4;->b:J

    sget-object v17, Lp3/r;->G:Lp3/r;

    new-instance v12, Ll3/v0;

    const-wide/16 v25, 0x0

    const v27, 0xffffd9

    const-wide/16 v13, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-wide v15, v9

    invoke-direct/range {v12 .. v27}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    iget-wide v9, v5, Lb30/t3;->b:J

    sget-object v5, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v8, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    sget-object v5, Lb2/e;->E:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-virtual {v7, v13, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v22, v4, 0xe

    const/16 v23, 0x0

    const v24, 0xfff8

    move-object v1, v5

    const-wide/16 v4, 0x0

    move v11, v6

    const/4 v6, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object v15, v3

    move-wide v2, v9

    const-wide/16 v9, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    move-object/from16 v17, v14

    const-wide/16 v13, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v25, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v19

    const/16 v19, 0x0

    move-object/from16 v30, v26

    move-object/from16 v31, v27

    move-object/from16 v29, v28

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, p1

    move-object/from16 v8, v21

    if-eqz v1, :cond_b

    const v4, 0x79ab72e2

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    move-object/from16 v15, v29

    move-object/from16 v14, v30

    move-object/from16 v4, v31

    invoke-virtual {v14, v4, v15}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-wide v4, v2

    invoke-static/range {v4 .. v9}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move/from16 v3, p2

    goto :goto_5

    :cond_b
    move-wide v5, v2

    move-object/from16 v15, v29

    move-object/from16 v14, v30

    move-object/from16 v4, v31

    const/4 v2, 0x0

    move/from16 v3, p2

    if-eqz v3, :cond_c

    const v7, 0x79ade16d

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    const v7, 0x7f08080c

    invoke-static {v7, v8, v2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    invoke-virtual {v14, v4, v15}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x30

    const/4 v11, 0x0

    move-object/from16 v21, v8

    move-wide/from16 v32, v5

    move-object v6, v4

    move-object v4, v7

    move-wide/from16 v7, v32

    const/4 v5, 0x0

    move-object/from16 v9, v21

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_c
    const v4, 0x79b28b2b

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v4, Lb30/l6;

    move/from16 v5, p4

    invoke-direct {v4, v0, v1, v3, v5}, Lb30/l6;-><init>(Ljava/lang/String;ZZI)V

    iput-object v4, v2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x26d359e1

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    if-ne v1, v0, :cond_2

    invoke-virtual {v5}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, p0

    goto :goto_2

    :cond_2
    :goto_1
    const v0, 0x7f08080b

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    invoke-static {v5}, Le4/a;->x(Landroidx/compose/runtime/Composer;)Lb30/t3;

    move-result-object v1

    iget-wide v3, v1, Lb30/t3;->d:J

    shl-int/lit8 p1, p1, 0x6

    and-int/lit16 p1, p1, 0x380

    or-int/lit8 v6, p1, 0x30

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object v2, p0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance p1, Lb30/v3;

    const/4 v0, 0x0

    invoke-direct {p1, v2, p2, v0}, Lb30/v3;-><init>(Landroidx/compose/ui/Modifier;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method
