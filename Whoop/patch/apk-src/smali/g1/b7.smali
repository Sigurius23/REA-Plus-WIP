.class public final Lg1/b7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lx1/b;

.field public final synthetic w:Ljava/util/Set;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lg1/a2;

.field public final synthetic z:Lkotlin/jvm/functions/Function3;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lg1/a2;Lkotlin/jvm/functions/Function3;Lx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b7;->w:Ljava/util/Set;

    iput-object p2, p0, Lg1/b7;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lg1/b7;->y:Lg1/a2;

    iput-object p4, p0, Lg1/b7;->z:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lg1/b7;->E:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    move-object v5, v2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    :cond_1
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_2
    move v5, v8

    :goto_1
    and-int/2addr v3, v7

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    check-cast v1, Landroidx/compose/foundation/layout/c;

    iget-wide v5, v1, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v5, v6}, Ly3/a;->i(J)I

    move-result v1

    int-to-float v1, v1

    sget-object v3, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Ly3/m;->x:Ly3/m;

    if-ne v3, v5, :cond_3

    move v13, v7

    goto :goto_2

    :cond_3
    move v13, v8

    :goto_2
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-object v5, Lg1/b2;->w:Lg1/b2;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v11

    sget-object v3, Lg1/z1;->w:Lg1/z1;

    iget-object v6, v0, Lg1/b7;->w:Ljava/util/Set;

    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    sget-object v10, Lg1/b2;->x:Lg1/b2;

    invoke-interface {v11, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object v9, Lg1/z1;->x:Lg1/z1;

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    neg-float v10, v1

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    sget-object v12, Lg1/b2;->y:Lg1/b2;

    invoke-interface {v11, v10, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v10, v0, Lg1/b7;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_6

    if-ne v14, v15, :cond_7

    :cond_6
    new-instance v14, Lg1/a7;

    invoke-direct {v14, v10, v8}, Lg1/a7;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v2, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v14, Lc93/m;

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    const/high16 v10, 0x41a00000    # 20.0f

    const/high16 v12, 0x41200000    # 10.0f

    if-eqz v9, :cond_8

    move v9, v12

    goto :goto_3

    :cond_8
    move v9, v10

    :goto_3
    invoke-interface {v6, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v10, v12

    :cond_9
    sget-object v3, Lh0/d2;->w:Lh0/d2;

    iget-object v3, v0, Lg1/b7;->y:Lg1/a2;

    iget-object v6, v3, Lg1/n7;->c:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_a

    move v12, v7

    :goto_4
    move-object v5, v15

    goto :goto_5

    :cond_a
    move v12, v8

    goto :goto_4

    :goto_5
    new-instance v15, Lg1/x4;

    invoke-direct {v15, v1, v9, v10}, Lg1/x4;-><init>(FFF)V

    iget-object v10, v0, Lg1/b7;->y:Lg1/a2;

    const/16 v16, 0x120

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static/range {v9 .. v16}, Lj93/l0;->c0(Landroidx/compose/ui/Modifier;Lg1/n7;Ljava/util/Map;ZZLc93/m;Lg1/x4;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v2, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-nez v14, :cond_c

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_d

    :cond_c
    invoke-static {v10, v2, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v2, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v9}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, Ll0/m;->a:Ll0/e;

    sget-object v15, Lb2/e;->J:Lb2/l;

    invoke-static {v14, v15, v2, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    move-object/from16 v16, v9

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2}, Lp1/q;->i0()V

    move-object/from16 p3, v14

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v2, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-nez v7, :cond_f

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    :cond_f
    invoke-static {v8, v2, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v2, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, v0, Lg1/b7;->z:Lkotlin/jvm/functions/Function3;

    sget-object v7, Ll0/t1;->a:Ll0/t1;

    invoke-interface {v1, v7, v2, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_11

    if-ne v8, v5, :cond_12

    :cond_11
    new-instance v8, La6/i;

    const/16 v1, 0xd

    invoke-direct {v8, v3, v1}, La6/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v9, v16

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v3, p3

    const/4 v5, 0x0

    invoke-static {v3, v15, v2, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_13
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v2, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v2, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v5, v2, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v2, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v1, v0, Lg1/b7;->E:Lx1/b;

    invoke-virtual {v1, v7, v2, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_16
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
