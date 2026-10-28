.class public final Loj/x;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Loj/g;

.field public final synthetic F:Loj/g;

.field public final synthetic w:Lcom/amplitude/android/engagement/types/DebugStatus;

.field public final synthetic x:Lcom/amplitude/android/engagement/types/SimulationContext;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic z:Ll83/q;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/types/Nudge;Ll83/q;Loj/g;Loj/g;)V
    .locals 0

    iput-object p1, p0, Loj/x;->w:Lcom/amplitude/android/engagement/types/DebugStatus;

    iput-object p2, p0, Loj/x;->x:Lcom/amplitude/android/engagement/types/SimulationContext;

    iput-object p3, p0, Loj/x;->y:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p4, p0, Loj/x;->z:Ll83/q;

    iput-object p5, p0, Loj/x;->E:Loj/g;

    iput-object p6, p0, Loj/x;->F:Loj/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    const/4 v8, 0x2

    if-ne v1, v8, :cond_1

    move-object v1, v5

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_1b

    :cond_1
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v2, v3, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v3

    move-object v11, v5

    check-cast v11, Lp1/q;

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_2

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v3, v11, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v5, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x305a0dd2

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    const-string v22, ""

    const/4 v12, 0x4

    const/16 v13, 0x8

    const/4 v14, 0x1

    const/4 v15, 0x0

    iget-object v2, v0, Loj/x;->w:Lcom/amplitude/android/engagement/types/DebugStatus;

    iget-object v3, v0, Loj/x;->x:Lcom/amplitude/android/engagement/types/SimulationContext;

    iget-object v4, v0, Loj/x;->y:Lcom/amplitude/android/engagement/types/Nudge;

    if-eq v2, v1, :cond_d

    sget-object v1, Loj/v;->a:Ljava/lang/Object;

    const-string v1, "status"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Loj/u;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v1, v1, v6

    if-eq v1, v14, :cond_5

    if-eq v1, v8, :cond_9

    const/4 v6, 0x3

    if-eq v1, v6, :cond_7

    if-ne v1, v12, :cond_6

    :cond_5
    move-object v6, v15

    goto :goto_3

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    invoke-static {v4}, Loj/v;->a(Lcom/amplitude/android/engagement/types/Nudge;)Ll83/q;

    move-result-object v1

    new-instance v6, Ll83/k;

    iget-object v1, v1, Ll83/q;->y:Ljava/lang/Object;

    if-eqz v1, :cond_8

    move v7, v14

    goto :goto_2

    :cond_8
    move v7, v10

    :goto_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {v6, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_9
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesPageTargeting()Z

    move-result v1

    if-nez v1, :cond_a

    new-instance v6, Ll83/k;

    const-string v1, "Screen targeting failed"

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesPinnedElement()Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v6, Ll83/k;

    const-string v1, "Pin target element not visible on this screen"

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_b
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getShouldTemporarilyHide()Z

    move-result v1

    if-ne v1, v14, :cond_5

    new-instance v6, Ll83/k;

    const-string v1, "Temporarily hidden"

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v6, v1, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-eqz v6, :cond_d

    iget-object v1, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_c

    move-object/from16 v1, v22

    :cond_c
    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    new-instance v7, Loj/w;

    iget-object v8, v0, Loj/x;->E:Loj/g;

    iget-object v12, v0, Loj/x;->F:Loj/g;

    invoke-direct {v7, v2, v4, v8, v12}, Loj/w;-><init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/Nudge;Loj/g;Loj/g;)V

    const v8, 0x63bb9e1b

    invoke-static {v8, v5, v7}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    move-object v8, v3

    move v3, v6

    const/16 v6, 0xc00

    move-object v12, v4

    move-object v4, v7

    const/4 v7, 0x0

    move-object/from16 v23, v2

    move-object v2, v1

    move-object/from16 v1, v23

    move-object/from16 v23, v8

    move-object/from16 v24, v12

    invoke-static/range {v1 .. v7}, Lbi/g;->g(Lcom/amplitude/android/engagement/types/DebugStatus;Ljava/lang/String;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    int-to-float v1, v13

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_4

    :cond_d
    move-object/from16 v23, v3

    move-object/from16 v24, v4

    :goto_4
    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    const-string v1, "Trigger"

    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object v12, v9

    const-wide/16 v8, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v17, v11

    move-object/from16 v19, v12

    const-wide/16 v11, 0x0

    move/from16 v25, v13

    const/4 v13, 0x0

    move/from16 v26, v14

    const/4 v14, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move/from16 v28, v16

    const/16 v16, 0x0

    move-object/from16 v29, v17

    const/16 v17, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0xd86

    move-object/from16 v32, v29

    const/4 v0, 0x2

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-wide v1, v5

    move-object/from16 v5, v18

    sget v6, Luj/g;->a:F

    int-to-float v0, v0

    div-float/2addr v6, v0

    move-object/from16 v7, v30

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v5, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v8, p0

    iget-object v9, v8, Loj/x;->z:Ll83/q;

    iget-object v10, v9, Ll83/q;->w:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v10, v11, v5, v12}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    iget-object v9, v9, Ll83/q;->x:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    const v10, -0x305a0579    # -5.5693184E9f

    move-object/from16 v13, v32

    invoke-virtual {v13, v10}, Lp1/q;->f0(I)V

    if-nez v9, :cond_e

    goto :goto_5

    :cond_e
    invoke-static {v9, v11, v5, v12}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    if-eqz v24, :cond_f

    invoke-virtual/range {v24 .. v24}, Lcom/amplitude/android/engagement/types/Nudge;->getPageTargeting()Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    move-result-object v15

    move-object/from16 v25, v15

    goto :goto_6

    :cond_f
    move-object/from16 v25, v11

    :goto_6
    const v9, -0x305a04e2

    invoke-virtual {v13, v9}, Lp1/q;->f0(I)V

    const/16 v9, 0x20

    if-nez v25, :cond_10

    move/from16 v26, v0

    move-object/from16 v41, v7

    move v0, v9

    move-object v3, v11

    move-object v1, v13

    goto/16 :goto_f

    :cond_10
    const/16 v10, 0x8

    int-to-float v14, v10

    invoke-static {v14, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {v5, v14}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v20, 0x0

    const v21, 0x1fff2

    move-object/from16 v18, v5

    move-wide/from16 v44, v1

    move v2, v6

    move-wide/from16 v5, v44

    const-string v1, "Screen Conditions"

    move v14, v2

    const/4 v2, 0x0

    move-object/from16 v30, v7

    const/4 v7, 0x0

    move v15, v9

    const-wide/16 v8, 0x0

    move/from16 v33, v10

    const/4 v10, 0x0

    move-object/from16 v31, v11

    move/from16 v16, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v35, v16

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move/from16 v27, v19

    const/16 v19, 0xd86

    move/from16 v36, v26

    move/from16 v26, v0

    move/from16 v0, v36

    move-object/from16 v36, v30

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v25 .. v25}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->getConfigs()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_11

    const v0, 0x3205bdf

    move-object/from16 v2, v29

    invoke-virtual {v2, v0}, Lp1/q;->f0(I)V

    const-string v0, "On all screens"

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v4, v5, v3}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move v12, v0

    move-object/from16 v41, v1

    move-object v1, v2

    move-object v3, v4

    const/16 v0, 0x20

    goto/16 :goto_f

    :cond_11
    move-object/from16 v2, v29

    const/4 v0, 0x0

    const/4 v4, 0x0

    const v3, 0x3205c35

    invoke-virtual {v2, v3}, Lp1/q;->f0(I)V

    invoke-virtual/range {v25 .. v25}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->getConfigs()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_12
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/amplitude/android/engagement/types/TargetingConfig;

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/TargetingConfig;->isExclude()Z

    move-result v8

    if-nez v8, :cond_12

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_13
    invoke-virtual/range {v25 .. v25}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->getConfigs()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/amplitude/android/engagement/types/TargetingConfig;

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/TargetingConfig;->isExclude()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_15
    const v3, 0x3205cfb

    invoke-virtual {v2, v3}, Lp1/q;->f0(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_18

    move-object/from16 v31, v4

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    move-object v8, v6

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    move-object/from16 v30, v1

    const-string v1, "Include on screens where"

    move-object/from16 v29, v2

    const/4 v2, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v8

    move-object v11, v9

    const-wide/16 v8, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v14, v11

    move-object v13, v12

    const-wide/16 v11, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0xd86

    move-object/from16 v38, v29

    move-object/from16 v39, v30

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amplitude/android/engagement/types/TargetingConfig;

    sget-object v3, Loj/v;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_16

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    :cond_16
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v5, v0}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_17
    const/4 v4, 0x0

    move-object/from16 v1, v38

    :goto_a
    const/16 v3, 0x20

    goto :goto_b

    :cond_18
    move-object/from16 v39, v1

    move-object/from16 v25, v6

    move-object/from16 v27, v7

    move-object v1, v2

    goto :goto_a

    :goto_b
    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1c

    const v2, 0x3205fe9

    invoke-virtual {v1, v2}, Lp1/q;->f0(I)V

    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_19

    const/4 v2, 0x4

    int-to-float v2, v2

    move-object/from16 v6, v39

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_c

    :cond_19
    move-object/from16 v6, v39

    :goto_c
    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move v15, v3

    move-object/from16 v31, v4

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    move-object/from16 v30, v6

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    move-object/from16 v29, v1

    const-string v1, "Exclude on screens where"

    const/4 v2, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v37, v19

    const/16 v19, 0xd86

    move-object/from16 v40, v29

    move-object/from16 v41, v30

    move/from16 v0, v37

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amplitude/android/engagement/types/TargetingConfig;

    sget-object v3, Loj/v;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1a

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    :cond_1a
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v12, 0x0

    invoke-static {v2, v3, v5, v12}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_1b
    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object/from16 v1, v40

    goto :goto_e

    :cond_1c
    move v12, v0

    move v0, v3

    move-object v3, v4

    move-object/from16 v41, v39

    :goto_e
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    if-eqz v24, :cond_1d

    invoke-virtual/range {v24 .. v24}, Lcom/amplitude/android/engagement/types/Nudge;->getTemporarilyHideTargeting()Lcom/amplitude/android/engagement/types/PageTargetingConfig;

    move-result-object v15

    move-object/from16 v25, v15

    goto :goto_10

    :cond_1d
    move-object/from16 v25, v3

    :goto_10
    const v2, -0x3059fbc4

    invoke-virtual {v1, v2}, Lp1/q;->f0(I)V

    if-nez v25, :cond_1e

    move-object/from16 v0, v41

    const/4 v12, 0x0

    goto/16 :goto_15

    :cond_1e
    invoke-virtual/range {v25 .. v25}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->getConfigs()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_22

    const/16 v2, 0x8

    int-to-float v4, v2

    move-object/from16 v6, v41

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v5, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v31, v3

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    move-object/from16 v30, v6

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    move-object/from16 v29, v1

    const-string v1, "Temporarily hide if"

    move/from16 v33, v2

    const/4 v2, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0xd86

    move-object/from16 v42, v29

    move-object/from16 v0, v30

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    sget v1, Luj/g;->a:F

    div-float v1, v1, v26

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v25 .. v25}, Lcom/amplitude/android/engagement/types/PageTargetingConfig;->getConfigs()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/amplitude/android/engagement/types/TargetingConfig;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->isExclude()Z

    move-result v3

    if-eqz v3, :cond_1f

    const-string v3, "\u220c"

    goto :goto_12

    :cond_1f
    const-string v3, "\u220b"

    :goto_12
    sget-object v4, Loj/v;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_20

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getMatchType()Lcom/amplitude/android/engagement/types/MatchType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    :cond_20
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x20

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/TargetingConfig;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v12, 0x0

    invoke-static {v2, v3, v5, v12}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_11

    :cond_21
    const/4 v3, 0x0

    :goto_13
    const/4 v12, 0x0

    goto :goto_14

    :cond_22
    move-object/from16 v42, v1

    move-object/from16 v0, v41

    goto :goto_13

    :goto_14
    move-object/from16 v1, v42

    :goto_15
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    const v2, -0x30194081

    invoke-virtual {v1, v2}, Lp1/q;->f0(I)V

    if-eqz v23, :cond_25

    invoke-virtual/range {v23 .. v23}, Lcom/amplitude/android/engagement/types/SimulationContext;->isAnchorableStep()Z

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_25

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v31, v3

    move/from16 v34, v4

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    move-object/from16 v29, v1

    const-string v1, "Pin target element"

    const/4 v2, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0xd86

    move-object/from16 v43, v29

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    sget v1, Luj/g;->a:F

    div-float v1, v1, v26

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v23 .. v23}, Lcom/amplitude/android/engagement/types/SimulationContext;->getCurrentStepIndex()I

    move-result v0

    if-eqz v24, :cond_24

    invoke-virtual/range {v24 .. v24}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_24

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amplitude/android/engagement/types/NudgeStep;

    if-eqz v0, :cond_24

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v0

    if-eqz v0, :cond_24

    instance-of v1, v0, Lcom/amplitude/android/engagement/types/PinFormFactor;

    if-eqz v1, :cond_23

    check-cast v0, Lcom/amplitude/android/engagement/types/PinFormFactor;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/PinFormFactor;->getAnchorSelector()Lcom/amplitude/android/engagement/types/ElementSelector;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/ElementSelector;->getSelector()Ljava/lang/String;

    move-result-object v15

    goto :goto_16

    :cond_23
    const/4 v15, 0x0

    :goto_16
    if-eqz v15, :cond_24

    :goto_17
    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_18

    :cond_24
    move-object/from16 v15, v22

    goto :goto_17

    :goto_18
    invoke-static {v15, v3, v5, v12}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_19
    move-object/from16 v1, v43

    goto :goto_1a

    :cond_25
    move-object/from16 v43, v1

    const/4 v12, 0x0

    goto :goto_19

    :goto_1a
    invoke-virtual {v1, v12}, Lp1/q;->q(Z)V

    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    :goto_1b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
