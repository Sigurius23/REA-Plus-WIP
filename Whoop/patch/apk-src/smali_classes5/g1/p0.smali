.class public abstract Lg1/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lg1/p0;->a:F

    const/16 v1, 0xa

    invoke-static {v1}, Lv63/c;->h(I)J

    const/4 v1, 0x6

    int-to-float v1, v1

    neg-float v1, v1

    sput v1, Lg1/p0;->b:F

    neg-float v0, v0

    sput v0, Lg1/p0;->c:F

    return-void
.end method

.method public static final a(ILandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;Lx1/b;Lx1/b;)V
    .locals 16

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const/16 v4, 0x36

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v6, 0x358cd4f8

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/16 v6, 0x20

    goto :goto_0

    :cond_0
    const/16 v6, 0x10

    :goto_0
    or-int v6, p0, v6

    and-int/lit16 v7, v6, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_1

    move v7, v10

    goto :goto_1

    :cond_1
    move v7, v9

    :goto_1
    and-int/2addr v6, v10

    invoke-virtual {v5, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_2

    sget-object v6, Lg1/d;->c:Lg1/d;

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Ly2/r0;

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-nez v14, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    :cond_4
    invoke-static {v7, v5, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v11, "anchor"

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v11}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, Lb2/e;->E:Lb2/m;

    invoke-static {v15, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-eqz v0, :cond_6

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v5, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    invoke-static {v9, v5, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v5, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v0, v5, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    const-string v9, "badge"

    invoke-static {v14, v9}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v10, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v5, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v11, v5, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v5, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v4, Lg1/o0;

    move/from16 v5, p0

    invoke-direct {v4, v2, v1, v3, v5}, Lg1/o0;-><init>(Lx1/b;Landroidx/compose/ui/Modifier;Lx1/b;I)V

    iput-object v4, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method
