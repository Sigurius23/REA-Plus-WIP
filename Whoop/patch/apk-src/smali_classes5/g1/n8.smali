.class public final Lg1/n8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:Li2/a1;

.field public final synthetic J:Lg1/b9;

.field public final synthetic K:Lc93/m;

.field public final synthetic L:Z

.field public final synthetic M:Ll0/k1;

.field public final synthetic N:Z

.field public final synthetic O:Lc93/m;

.field public final synthetic w:Lc93/m;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lg1/e8;


# direct methods
.method public constructor <init>(Lc93/m;Lc93/m;Ljava/lang/String;Lg1/e8;ZZLj0/i;Lc93/m;Lc93/m;Li2/a1;Lg1/b9;Lc93/m;ZLl0/k1;ZLc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/n8;->w:Lc93/m;

    iput-object p2, p0, Lg1/n8;->x:Lc93/m;

    iput-object p3, p0, Lg1/n8;->y:Ljava/lang/String;

    iput-object p4, p0, Lg1/n8;->z:Lg1/e8;

    iput-boolean p5, p0, Lg1/n8;->E:Z

    iput-boolean p6, p0, Lg1/n8;->F:Z

    iput-object p8, p0, Lg1/n8;->G:Lc93/m;

    iput-object p9, p0, Lg1/n8;->H:Lc93/m;

    iput-object p10, p0, Lg1/n8;->I:Li2/a1;

    iput-object p11, p0, Lg1/n8;->J:Lg1/b9;

    iput-object p12, p0, Lg1/n8;->K:Lc93/m;

    iput-boolean p13, p0, Lg1/n8;->L:Z

    iput-object p14, p0, Lg1/n8;->M:Ll0/k1;

    iput-boolean p15, p0, Lg1/n8;->N:Z

    move-object/from16 p1, p16

    iput-object p1, p0, Lg1/n8;->O:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v9

    move-object/from16 v1, p2

    check-cast v1, Li2/x;

    iget-wide v1, v1, Li2/x;->a:J

    move-object/from16 v3, p3

    check-cast v3, Li2/x;

    iget-wide v4, v3, Li2/x;->a:J

    move-object/from16 v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v11

    move-object/from16 v3, p5

    check-cast v3, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    move-object v7, v3

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v9}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    move-object v8, v3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v1, v2}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    move-object v8, v3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v5}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v6, v6, 0xc00

    if-nez v6, :cond_7

    move-object v6, v3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v11}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v7, v6

    :cond_7
    move v13, v7

    and-int/lit16 v6, v13, 0x2493

    const/16 v7, 0x2492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v6, v7, :cond_8

    move v6, v14

    goto :goto_5

    :cond_8
    move v6, v15

    :goto_5
    and-int/lit8 v7, v13, 0x1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    const/16 v16, 0x0

    iget-object v6, v0, Lg1/n8;->w:Lc93/m;

    if-nez v6, :cond_9

    const v1, 0x3acf916d

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v15}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object/from16 v4, v16

    goto :goto_6

    :cond_9
    const v7, 0x3acf916e

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    move-wide/from16 v17, v1

    move-object v1, v3

    move v3, v9

    move-wide/from16 v8, v17

    new-instance v2, Lg1/k8;

    const/4 v10, 0x0

    iget-boolean v7, v0, Lg1/n8;->N:Z

    invoke-direct/range {v2 .. v10}, Lg1/k8;-><init>(FJLc93/m;ZJI)V

    move v9, v3

    const v3, 0x2b1ea823

    invoke-static {v3, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    move-object v4, v2

    :goto_6
    iget-boolean v2, v0, Lg1/n8;->E:Z

    iget-object v3, v0, Lg1/n8;->x:Lc93/m;

    iget-object v5, v0, Lg1/n8;->z:Lg1/e8;

    if-eqz v3, :cond_a

    iget-object v6, v0, Lg1/n8;->y:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_a

    const/4 v6, 0x0

    cmpl-float v6, v11, v6

    if-lez v6, :cond_a

    const v6, 0x3ade9875

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    new-instance v6, Lg1/m8;

    const/4 v7, 0x0

    move/from16 p4, v2

    move-object/from16 p5, v3

    move-object/from16 p3, v5

    move-object/from16 p1, v6

    move/from16 p6, v7

    move/from16 p2, v11

    invoke-direct/range {p1 .. p6}, Lg1/m8;-><init>(FLg1/e8;ZLc93/m;I)V

    move-object/from16 v2, p1

    move/from16 v3, p4

    const v6, -0x196f0557

    invoke-static {v6, v1, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    move v3, v2

    const v2, 0x3ae51c66

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    move-object/from16 v2, v16

    :goto_7
    check-cast v5, Lg1/y1;

    iget-boolean v6, v0, Lg1/n8;->F:Z

    invoke-virtual {v5, v3, v6, v1}, Lg1/y1;->d(ZZLp1/q;)Lp1/c1;

    move-result-object v7

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v7, v7, Li2/x;->a:J

    iget-object v10, v0, Lg1/n8;->G:Lc93/m;

    if-nez v10, :cond_b

    const v7, 0x3ae7fdbd

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    move-object/from16 v7, v16

    goto :goto_8

    :cond_b
    const v11, 0x3ae7fdbe

    invoke-virtual {v1, v11}, Lp1/q;->e0(I)V

    new-instance v11, Lg1/l8;

    const/4 v12, 0x0

    invoke-direct {v11, v7, v8, v10, v12}, Lg1/l8;-><init>(JLc93/m;I)V

    const v7, -0x12e66a8b

    invoke-static {v7, v1, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v5, v3, v6, v1}, Lg1/y1;->f(ZZLp1/q;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v10, v3, Li2/x;->a:J

    iget-object v3, v0, Lg1/n8;->H:Lc93/m;

    if-nez v3, :cond_c

    const v3, 0x3aec78dc    # 0.001804139f

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    :goto_9
    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    const v6, 0x3aec78dd

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    new-instance v6, Lg1/l8;

    const/4 v8, 0x1

    invoke-direct {v6, v10, v11, v3, v8}, Lg1/l8;-><init>(JLc93/m;I)V

    const v3, 0xfab60dd

    invoke-static {v3, v1, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    goto :goto_9

    :goto_a
    invoke-virtual {v5, v1}, Lg1/y1;->a(Lp1/q;)Lp1/c1;

    move-result-object v3

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v5, v3, Li2/x;->a:J

    iget-object v3, v0, Lg1/n8;->I:Li2/a1;

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v5, v6, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    iget-object v5, v0, Lg1/n8;->J:Lg1/b9;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/high16 v6, 0x1c00000

    if-eqz v5, :cond_12

    if-ne v5, v14, :cond_11

    const v5, 0x3af99b46

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v5, v8, :cond_d

    new-instance v5, Lh2/e;

    const-wide/16 v10, 0x0

    invoke-direct {v5, v10, v11}, Lh2/e;-><init>(J)V

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lp1/c1;

    new-instance v10, Lg1/f;

    iget-object v11, v0, Lg1/n8;->M:Ll0/k1;

    iget-object v12, v0, Lg1/n8;->O:Lc93/m;

    invoke-direct {v10, v5, v11, v12}, Lg1/f;-><init>(Lp1/c1;Ll0/k1;Lc93/m;)V

    const v11, -0x4206dcde

    invoke-static {v11, v1, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    and-int/lit8 v10, v13, 0xe

    const/4 v12, 0x4

    if-ne v10, v12, :cond_e

    goto :goto_b

    :cond_e
    move v14, v15

    :goto_b
    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v14, :cond_f

    if-ne v10, v8, :cond_10

    :cond_f
    new-instance v10, Lc51/a;

    const/4 v8, 0x1

    invoke-direct {v10, v9, v5, v8}, Lc51/a;-><init>(FLp1/c1;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v5, v13, 0x15

    and-int/2addr v5, v6

    const/high16 v6, 0x30000000

    or-int v14, v5, v6

    move-object v5, v2

    move-object v2, v3

    iget-object v3, v0, Lg1/n8;->K:Lc93/m;

    iget-boolean v8, v0, Lg1/n8;->L:Z

    iget-object v12, v0, Lg1/n8;->M:Ll0/k1;

    move-object v6, v5

    move-object v5, v4

    move-object v4, v6

    move-object v13, v1

    move-object v6, v7

    move-object/from16 v7, v16

    invoke-static/range {v2 .. v14}, Lg1/j4;->c(Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;ZFLkotlin/jvm/functions/Function1;Lx1/b;Ll0/k1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    const v2, 0x7583a322

    invoke-static {v2, v1, v15}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v1

    throw v1

    :cond_12
    move-object v5, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v7

    move-object/from16 v7, v16

    const v8, 0x3af0c028

    invoke-virtual {v1, v8}, Lp1/q;->e0(I)V

    shl-int/lit8 v8, v13, 0x15

    and-int v12, v8, v3

    iget-object v3, v0, Lg1/n8;->K:Lc93/m;

    iget-boolean v8, v0, Lg1/n8;->L:Z

    iget-object v10, v0, Lg1/n8;->M:Ll0/k1;

    move-object v11, v1

    invoke-static/range {v2 .. v12}, Lg1/u8;->c(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/k1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_13
    move-object v1, v3

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_c
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
