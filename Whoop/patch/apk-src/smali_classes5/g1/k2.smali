.class public final Lg1/k2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Li2/a1;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic I:F

.field public final synthetic J:Lx1/b;

.field public final synthetic w:Z

.field public final synthetic x:Lg1/s0;

.field public final synthetic y:Lx1/b;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(ZLg1/s0;Lx1/b;JLbc3/c0;Li2/a1;JJFLx1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/k2;->w:Z

    iput-object p2, p0, Lg1/k2;->x:Lg1/s0;

    iput-object p3, p0, Lg1/k2;->y:Lx1/b;

    iput-wide p4, p0, Lg1/k2;->z:J

    iput-object p6, p0, Lg1/k2;->E:Lbc3/c0;

    iput-object p7, p0, Lg1/k2;->F:Li2/a1;

    iput-wide p8, p0, Lg1/k2;->G:J

    iput-wide p10, p0, Lg1/k2;->H:J

    iput p12, p0, Lg1/k2;->I:F

    iput-object p13, p0, Lg1/k2;->J:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    move v4, v7

    :goto_1
    and-int/2addr v3, v6

    move-object v12, v2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    check-cast v1, Landroidx/compose/foundation/layout/c;

    iget-wide v2, v1, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v2, v3}, Ly3/a;->h(J)I

    move-result v2

    int-to-float v2, v2

    iget-wide v3, v1, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v1

    invoke-static {v3, v4}, Ly3/a;->h(J)I

    move-result v5

    if-le v1, v5, :cond_3

    move v1, v6

    goto :goto_2

    :cond_3
    move v1, v7

    :goto_2
    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v8

    invoke-interface {v5, v8}, Ly3/c;->e0(I)F

    move-result v16

    invoke-static {v3, v4}, Ly3/a;->h(J)I

    move-result v3

    invoke-interface {v5, v3}, Ly3/c;->e0(I)F

    move-result v17

    const/16 v18, 0x3

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-boolean v4, v0, Lg1/k2;->w:Z

    iget-object v5, v0, Lg1/k2;->x:Lg1/s0;

    if-eqz v4, :cond_4

    iget-object v8, v5, Lg1/s0;->b:Lg1/o2;

    const/4 v9, 0x0

    invoke-static {v13, v8, v9}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    :cond_4
    move-object v14, v13

    sget-object v8, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Ly3/m;->x:Ly3/m;

    if-ne v8, v9, :cond_5

    move/from16 v18, v6

    goto :goto_3

    :cond_5
    move/from16 v18, v7

    :goto_3
    iget-object v15, v5, Lg1/s0;->a:Lg1/a0;

    sget-object v16, Lh0/d2;->w:Lh0/d2;

    iget-boolean v8, v0, Lg1/k2;->w:Z

    const/16 v19, 0x30

    move/from16 v17, v8

    invoke-static/range {v14 .. v19}, Lcom/squareup/wire/n;->l(Landroidx/compose/ui/Modifier;Lg1/a0;Lh0/d2;ZZI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v10, v12, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v12, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget-object v9, v0, Lg1/k2;->y:Lx1/b;

    invoke-virtual {v9, v12, v8}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v4}, Lp1/q;->h(Z)Z

    move-result v8

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    iget-object v14, v0, Lg1/k2;->E:Lbc3/c0;

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_9

    if-ne v9, v15, :cond_a

    :cond_9
    new-instance v9, Lbm2/d0;

    const/4 v8, 0x4

    invoke-direct {v9, v4, v5, v14, v8}, Lbm2/d0;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v10, v9

    check-cast v10, Lc93/a;

    iget-object v4, v5, Lg1/s0;->a:Lg1/a0;

    iget-object v4, v4, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v4}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/t0;

    sget-object v8, Lg1/t0;->w:Lg1/t0;

    if-eq v4, v8, :cond_b

    move v11, v6

    goto :goto_5

    :cond_b
    move v11, v7

    :goto_5
    const/4 v13, 0x0

    iget-wide v8, v0, Lg1/k2;->z:J

    invoke-static/range {v8 .. v13}, Lg1/p2;->b(JLc93/a;ZLandroidx/compose/runtime/Composer;I)V

    invoke-static {v12, v7}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12, v2}, Lp1/q;->d(F)Z

    move-result v8

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_c

    if-ne v9, v15, :cond_d

    :cond_c
    new-instance v9, Lg1/i2;

    invoke-direct {v9, v5, v2, v1}, Lg1/i2;-><init>(Lg1/s0;FZ)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v9}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_e

    if-ne v3, v15, :cond_f

    :cond_e
    new-instance v3, Leg/j;

    const/16 v2, 0xe

    invoke-direct {v3, v5, v2}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_10

    if-ne v3, v15, :cond_11

    :cond_10
    new-instance v3, Lep1/g;

    const/16 v2, 0xc

    invoke-direct {v3, v4, v5, v14, v2}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v7, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v1, Lb30/l4;

    const/4 v2, 0x7

    iget-object v3, v0, Lg1/k2;->J:Lx1/b;

    invoke-direct {v1, v3, v2}, Lb30/l4;-><init>(Lx1/b;I)V

    const v2, 0x64d26854

    invoke-static {v2, v12, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    const/high16 v18, 0x180000

    const/16 v19, 0x10

    iget-object v9, v0, Lg1/k2;->F:Li2/a1;

    iget-wide v10, v0, Lg1/k2;->G:J

    move-object/from16 v17, v12

    iget-wide v12, v0, Lg1/k2;->H:J

    const/4 v14, 0x0

    iget v15, v0, Lg1/k2;->I:F

    invoke-static/range {v8 .. v19}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
