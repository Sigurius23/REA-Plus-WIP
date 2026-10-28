.class public final Li40/f;
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

.field public final synthetic J:Lx1/b;

.field public final synthetic K:Z

.field public final synthetic L:Ll0/l1;

.field public final synthetic M:Z

.field public final synthetic w:Lc93/m;

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lg1/e8;


# direct methods
.method public constructor <init>(Lc93/m;Lc93/m;Ljava/lang/String;Lg1/e8;ZZLj0/i;Lc93/m;Lc93/m;Li2/a1;Lx1/b;ZLl0/l1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li40/f;->w:Lc93/m;

    iput-object p2, p0, Li40/f;->x:Lc93/m;

    iput-object p3, p0, Li40/f;->y:Ljava/lang/String;

    iput-object p4, p0, Li40/f;->z:Lg1/e8;

    iput-boolean p5, p0, Li40/f;->E:Z

    iput-boolean p6, p0, Li40/f;->F:Z

    iput-object p8, p0, Li40/f;->G:Lc93/m;

    iput-object p9, p0, Li40/f;->H:Lc93/m;

    iput-object p10, p0, Li40/f;->I:Li2/a1;

    iput-object p11, p0, Li40/f;->J:Lx1/b;

    iput-boolean p12, p0, Li40/f;->K:Z

    iput-object p13, p0, Li40/f;->L:Ll0/l1;

    iput-boolean p14, p0, Li40/f;->M:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

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
    move v12, v7

    and-int/lit16 v6, v12, 0x2493

    const/16 v7, 0x2492

    if-ne v6, v7, :cond_9

    move-object v6, v3

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_9
    :goto_5
    move-object v13, v3

    check-cast v13, Lp1/q;

    const v3, -0x367c29e7    # -1080003.1f

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    iget-object v6, v0, Li40/f;->w:Lc93/m;

    if-nez v6, :cond_a

    move v3, v9

    move-object v4, v14

    goto :goto_6

    :cond_a
    move v3, v9

    move-wide v8, v1

    new-instance v2, Lg1/k8;

    const/4 v10, 0x1

    iget-boolean v7, v0, Li40/f;->M:Z

    invoke-direct/range {v2 .. v10}, Lg1/k8;-><init>(FJLc93/m;ZJI)V

    const v1, -0x194fe078

    invoke-static {v1, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    move-object v4, v1

    :goto_6
    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    const v2, -0x367bd218    # -1082813.0f

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    iget-boolean v2, v0, Li40/f;->E:Z

    iget-object v5, v0, Li40/f;->x:Lc93/m;

    iget-object v6, v0, Li40/f;->z:Lg1/e8;

    if-eqz v5, :cond_b

    iget-object v7, v0, Li40/f;->y:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_b

    const/4 v7, 0x0

    cmpl-float v7, v11, v7

    if-lez v7, :cond_b

    new-instance v7, Lg1/m8;

    const/4 v8, 0x1

    move/from16 p4, v2

    move-object/from16 p5, v5

    move-object/from16 p3, v6

    move-object/from16 p1, v7

    move/from16 p6, v8

    move/from16 p2, v11

    invoke-direct/range {p1 .. p6}, Lg1/m8;-><init>(FLg1/e8;ZLc93/m;I)V

    move-object/from16 v2, p1

    move/from16 v5, p4

    const v7, 0x9343e0e

    invoke-static {v7, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    goto :goto_7

    :cond_b
    move v5, v2

    move-object v2, v14

    :goto_7
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    check-cast v6, Lg1/y1;

    iget-boolean v7, v0, Li40/f;->F:Z

    invoke-virtual {v6, v5, v7, v13}, Lg1/y1;->d(ZZLp1/q;)Lp1/c1;

    move-result-object v8

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/x;

    iget-wide v8, v8, Li2/x;->a:J

    const v10, -0x367b77ad

    invoke-virtual {v13, v10}, Lp1/q;->e0(I)V

    iget-object v10, v0, Li40/f;->G:Lc93/m;

    if-nez v10, :cond_c

    move-object v8, v14

    goto :goto_8

    :cond_c
    new-instance v11, Lg1/l8;

    const/4 v15, 0x2

    invoke-direct {v11, v8, v9, v10, v15}, Lg1/l8;-><init>(JLc93/m;I)V

    const v8, 0x2a03f0da

    invoke-static {v8, v13, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    :goto_8
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v5, v7, v13}, Lg1/y1;->f(ZZLp1/q;)Lp1/c1;

    move-result-object v5

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v9, v5, Li2/x;->a:J

    const v5, -0x367b51ac

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    iget-object v5, v0, Li40/f;->H:Lc93/m;

    if-nez v5, :cond_d

    :goto_9
    move-object v7, v14

    goto :goto_a

    :cond_d
    new-instance v7, Lg1/l8;

    const/4 v11, 0x3

    invoke-direct {v7, v9, v10, v5, v11}, Lg1/l8;-><init>(JLc93/m;I)V

    const v5, -0x67d673be

    invoke-static {v5, v13, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    goto :goto_9

    :goto_a
    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v13}, Lg1/y1;->a(Lp1/q;)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/x;

    iget-wide v5, v1, Li2/x;->a:J

    iget-object v1, v0, Li40/f;->I:Li2/a1;

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v5, v6, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v5, v12, 0x15

    const/high16 v6, 0x1c00000

    and-int v12, v5, v6

    move v9, v3

    iget-object v3, v0, Li40/f;->J:Lx1/b;

    move-object v6, v8

    iget-boolean v8, v0, Li40/f;->K:Z

    iget-object v10, v0, Li40/f;->L:Ll0/l1;

    move-object v5, v2

    move-object v11, v13

    move-object v2, v1

    invoke-static/range {v2 .. v12}, Li40/j;->a(Landroidx/compose/ui/Modifier;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/l1;Landroidx/compose/runtime/Composer;I)V

    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
