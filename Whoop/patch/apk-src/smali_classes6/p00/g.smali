.class public final Lp00/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lg2/s;

.field public final synthetic F:Lc93/a;

.field public final synthetic w:Lp00/q;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lg40/o1;


# direct methods
.method public constructor <init>(Lp00/q;Lc93/a;Lc93/a;Lg40/o1;Lg2/s;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp00/g;->w:Lp00/q;

    iput-object p2, p0, Lp00/g;->x:Lc93/a;

    iput-object p3, p0, Lp00/g;->y:Lc93/a;

    iput-object p4, p0, Lp00/g;->z:Lg40/o1;

    iput-object p5, p0, Lp00/g;->E:Lg2/s;

    iput-object p6, p0, Lp00/g;->F:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/y;

    move-object/from16 v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-string v3, "$this$VerificationBodyContainer"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    move-object v3, v8

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v2, v3

    :cond_1
    move/from16 v27, v2

    and-int/lit8 v2, v27, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    move-object v2, v8

    check-cast v2, Lp1/q;

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_3
    :goto_1
    iget-object v2, v0, Lp00/g;->w:Lp00/q;

    iget-boolean v3, v2, Lp00/q;->H:Z

    iget-boolean v4, v2, Lp00/q;->w:Z

    const/4 v5, 0x0

    invoke-static {v3, v8, v5}, Lp00/h;->e(ZLandroidx/compose/runtime/Composer;I)V

    const/16 v3, 0x8

    int-to-float v3, v3

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-object v3, v2, Lp00/q;->F:Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const v7, 0x7f141046

    invoke-static {v7, v3, v8}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "verification_subtitle"

    invoke-static {v6, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v9, v8

    check-cast v9, Lp1/q;

    const v10, -0x548d6062

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v9, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg00/e;

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    iget-object v10, v10, Lg00/e;->b:Ll3/v0;

    const v11, -0x1a6f7841

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v9, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg00/b;

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    iget-wide v11, v11, Lg00/b;->o:J

    new-instance v14, Lw3/k;

    const/4 v13, 0x3

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v26, 0xfdf8

    move-object v13, v2

    move-object v2, v3

    move-object v15, v6

    move-object v3, v7

    const-wide/16 v6, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v22, v10

    const/4 v10, 0x0

    move/from16 v17, v4

    move/from16 v18, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v21, v15

    move-object/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v24

    const/16 v24, 0x30

    move-object/from16 p1, v1

    move-object/from16 v34, v30

    move-object/from16 v1, v31

    move/from16 v33, v32

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    const/16 v2, 0x18

    int-to-float v11, v2

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v2, Ld40/m;->w:Ld40/m;

    new-instance v3, Lg1/f;

    iget-object v4, v0, Lp00/g;->E:Lg2/s;

    const/16 v5, 0xb

    iget-object v6, v0, Lp00/g;->z:Lg40/o1;

    move-object/from16 v13, v29

    invoke-direct {v3, v13, v6, v4, v5}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v4, 0x78cc8c8a

    invoke-static {v4, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x36

    const/4 v5, 0x0

    invoke-static {v2, v3, v8, v4, v5}, Lg00/a;->a(Ld40/m;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    iget-object v2, v13, Lp00/q;->y:Lzy/c;

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    move v2, v5

    :goto_2
    new-instance v3, Lb30/o4;

    const/16 v4, 0xb

    invoke-direct {v3, v13, v4}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    const v4, -0x3dab7059

    invoke-static {v4, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    and-int/lit8 v3, v27, 0xe

    const/high16 v4, 0x180000

    or-int v9, v3, v4

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    move/from16 v28, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v15, v1

    move/from16 v12, v28

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-boolean v1, v13, Lp00/q;->z:Z

    iget-object v2, v0, Lp00/g;->x:Lc93/a;

    move/from16 v3, v33

    invoke-static {v3, v1, v2, v8, v12}, Lp00/h;->d(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    iget-object v1, v13, Lp00/q;->K:Lcom/stripe/android/model/ConsentUi$ConsentSection;

    const v2, -0x2bb59e42

    move-object/from16 v4, v34

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v1, v8, v12}, Lp00/h;->b(Lcom/stripe/android/model/ConsentUi$ConsentSection;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x36b23005

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    iget-object v2, v0, Lp00/g;->F:Lc93/a;

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_7

    :cond_6
    new-instance v6, Lj00/n;

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-direct {v6, v2, v7, v5}, Lj00/n;-><init>(Lc93/a;Lq83/d;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lc93/m;

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    invoke-static {v8, v6, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    const v1, -0x2bb58799

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    iget-boolean v1, v13, Lp00/q;->I:Z

    if-eqz v1, :cond_8

    invoke-static {v11, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    iget-object v1, v13, Lp00/q;->G:Ljava/lang/String;

    iget-object v2, v0, Lp00/g;->y:Lc93/a;

    invoke-static {v1, v3, v2, v8, v12}, Lp00/h;->a(Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :cond_8
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
