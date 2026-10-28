.class public final Lh00/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lh00/o0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Lc93/a;Lh00/o0;ZLc93/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/m0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lh00/m0;->x:Lc93/a;

    iput-object p3, p0, Lh00/m0;->y:Lh00/o0;

    iput-boolean p4, p0, Lh00/m0;->z:Z

    iput-object p5, p0, Lh00/m0;->E:Lc93/a;

    iput-object p6, p0, Lh00/m0;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v6

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v3

    move-object v13, v6

    check-cast v13, Lp1/q;

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    iget-object v5, v0, Lh00/m0;->w:Landroidx/compose/ui/Modifier;

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_2

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v3, v13, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Lce/w;->Q(Landroidx/compose/runtime/Composer;)Lg00/c;

    move-result-object v1

    iget v1, v1, Lg00/c;->d:F

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v3, "PrimaryButtonTag"

    invoke-static {v1, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v1, Lh00/o0;->x:Lh00/o0;

    iget-object v15, v0, Lh00/m0;->y:Lh00/o0;

    if-ne v15, v1, :cond_5

    const/16 v16, 0x1

    goto :goto_2

    :cond_5
    move/from16 v16, v2

    :goto_2
    int-to-float v1, v2

    const/16 v7, 0x6db6

    const/4 v8, 0x0

    move v2, v1

    move v3, v1

    move v4, v1

    move v5, v1

    invoke-static/range {v1 .. v8}, Lg1/v0;->b(FFFFFLandroidx/compose/runtime/Composer;II)Lg1/q1;

    move-result-object v17

    invoke-static {v6}, Lce/w;->Q(Landroidx/compose/runtime/Composer;)Lg00/c;

    move-result-object v1

    iget-object v1, v1, Lg00/c;->c:Lt0/i;

    invoke-static {v6}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v2

    iget-wide v2, v2, Lg00/b;->k:J

    invoke-static {v6}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v4

    iget-wide v4, v4, Lg00/b;->t:J

    invoke-static {v6}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v7

    iget-wide v7, v7, Lg00/b;->k:J

    invoke-static {v6}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v9

    iget-wide v9, v9, Lg00/b;->t:J

    sget-object v11, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v13, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Li2/x;

    move-object/from16 p2, v15

    iget-wide v14, v11, Li2/x;->a:J

    sget-object v11, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v13, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg1/c1;

    invoke-virtual {v11}, Lg1/c1;->i()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-static {v14, v15}, Li2/w0;->x(J)F

    goto :goto_3

    :cond_6
    invoke-static {v14, v15}, Li2/w0;->x(J)F

    :goto_3
    const v11, 0x3ec28f5c    # 0.38f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    move-object v11, v1

    move-wide v1, v2

    move-wide v3, v4

    move-wide/from16 v18, v9

    move-object v9, v6

    move-wide v5, v7

    move-wide/from16 v7, v18

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    invoke-static/range {v1 .. v11}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    move-object v6, v9

    new-instance v1, Ld30/b0;

    const/4 v2, 0x3

    iget-object v3, v0, Lh00/m0;->F:Ljava/lang/String;

    move-object/from16 v15, p2

    invoke-direct {v1, v2, v15, v3}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, -0x77955afa

    invoke-static {v2, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/high16 v11, 0x30000000

    move-object v2, v12

    const/16 v12, 0x148

    iget-object v1, v0, Lh00/m0;->x:Lc93/a;

    move-object v10, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v5, v14

    move/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    const/4 v1, 0x6

    iget-boolean v2, v0, Lh00/m0;->z:Z

    iget-object v3, v0, Lh00/m0;->E:Lc93/a;

    invoke-static {v15, v2, v3, v6, v1}, Lh00/n0;->a(Lh00/o0;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
