.class public final Loj/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic w:Lcom/amplitude/android/engagement/types/DebugStatus;

.field public final synthetic x:Loj/o;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/SimulationContext;

.field public final synthetic z:Lcom/amplitude/android/engagement/types/Nudge;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/DebugStatus;Loj/o;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/types/Nudge;Lc93/a;I)V
    .locals 0

    iput-object p1, p0, Loj/l;->w:Lcom/amplitude/android/engagement/types/DebugStatus;

    iput-object p2, p0, Loj/l;->x:Loj/o;

    iput-object p3, p0, Loj/l;->y:Lcom/amplitude/android/engagement/types/SimulationContext;

    iput-object p4, p0, Loj/l;->z:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p5, p0, Loj/l;->E:Lc93/a;

    iput p6, p0, Loj/l;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

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

    goto/16 :goto_12

    :cond_1
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, v0, Loj/l;->x:Loj/o;

    iget-object v10, v2, Loj/o;->a:Ljava/lang/String;

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x0

    invoke-static {v11, v12, v5, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move-object v14, v5

    check-cast v14, Lp1/q;

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_2

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-nez v13, :cond_3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    :cond_3
    invoke-static {v4, v14, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v5, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x7cd99ce0

    invoke-virtual {v14, v1}, Lp1/q;->f0(I)V

    sget-object v1, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    const/4 v13, 0x1

    iget-object v4, v0, Loj/l;->w:Lcom/amplitude/android/engagement/types/DebugStatus;

    if-eq v4, v1, :cond_b

    sget-object v1, Loj/n;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aget v1, v1, v17

    if-eq v1, v13, :cond_9

    const/4 v13, 0x2

    if-eq v1, v13, :cond_6

    const/4 v2, 0x3

    if-eq v1, v2, :cond_a

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    goto :goto_3

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_6
    iget-object v1, v0, Loj/l;->y:Lcom/amplitude/android/engagement/types/SimulationContext;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesSnoozedConditions()Z

    move-result v18

    if-nez v18, :cond_7

    const-string v1, "User has snoozed this"

    :goto_2
    move-object v2, v1

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesCooldown()Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "User has already interacted with this"

    goto :goto_2

    :cond_8
    iget-object v1, v2, Loj/o;->b:Ljava/lang/String;

    if-eqz v1, :cond_a

    goto :goto_2

    :cond_9
    const/4 v13, 0x2

    :cond_a
    :goto_3
    const/4 v2, 0x0

    :goto_4
    if-eqz v2, :cond_b

    new-instance v1, Lc4/e;

    const/4 v13, 0x6

    move-object/from16 v18, v2

    iget-object v2, v0, Loj/l;->E:Lc93/a;

    move-object/from16 v19, v3

    iget v3, v0, Loj/l;->F:I

    invoke-direct {v1, v2, v3, v13}, Lc4/e;-><init>(Ljava/lang/Object;II)V

    const v2, 0x7c00ba47

    invoke-static {v2, v5, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    move-object v2, v6

    const/16 v6, 0xc00

    move-object v3, v7

    const/4 v7, 0x4

    move-object v13, v3

    const/4 v3, 0x0

    move-object/from16 v16, v4

    move-object v4, v1

    move-object/from16 v1, v16

    move-object/from16 v23, v2

    move-object/from16 v2, v18

    move-object/from16 v22, v19

    const/16 v16, 0x0

    invoke-static/range {v1 .. v7}, Lbi/g;->g(Lcom/amplitude/android/engagement/types/DebugStatus;Ljava/lang/String;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_5
    const/4 v1, 0x0

    goto :goto_6

    :cond_b
    move-object/from16 v22, v3

    move-object/from16 v23, v6

    move-object v13, v7

    const/16 v16, 0x0

    goto :goto_5

    :goto_6
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    sget-wide v3, Luj/g;->i:J

    move-object/from16 v18, v5

    sget-wide v5, Luj/g;->d:J

    const/16 v20, 0x0

    const v21, 0x1fff2

    move v2, v1

    const-string v1, "Limit"

    move v7, v2

    const/4 v2, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    move-object/from16 v25, v9

    const-wide/16 v8, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object/from16 v27, v11

    move-object/from16 v28, v12

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move-object/from16 v30, v14

    const/4 v14, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    const/16 v33, 0x1

    const/16 v17, 0x0

    move/from16 v34, v19

    const/16 v19, 0xd86

    move-object/from16 v41, v24

    move-object/from16 v42, v25

    move-object/from16 v35, v26

    move-object/from16 v36, v27

    move-object/from16 v37, v28

    move-object/from16 v40, v29

    move-object/from16 v38, v30

    move-object/from16 v39, v31

    const/4 v0, 0x2

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-wide v1, v5

    move-object/from16 v5, v18

    sget v6, Luj/g;->a:F

    int-to-float v0, v0

    div-float v0, v6, v0

    move-object/from16 v7, v42

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v5, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v8, p0

    iget-object v9, v8, Loj/l;->z:Lcom/amplitude/android/engagement/types/Nudge;

    if-eqz v9, :cond_c

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/Nudge;->getLifecycleConfig()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->getStopShowingIfCompleted()Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_7

    :cond_c
    const/4 v10, 0x0

    :goto_7
    if-eqz v9, :cond_d

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/Nudge;->getLifecycleConfig()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-result-object v9

    if-eqz v9, :cond_d

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->getStopShowingIfDismissed()Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_8

    :cond_d
    const/4 v9, 0x0

    :goto_8
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x6

    if-nez v12, :cond_e

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    :cond_e
    move-object/from16 v12, v38

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto :goto_9

    :cond_f
    const v9, 0x7cd9a4fe

    move-object/from16 v12, v38

    invoke-virtual {v12, v9}, Lp1/q;->f0(I)V

    const-string v9, "No limits"

    const/4 v14, 0x0

    invoke-static {v9, v14, v5, v13}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-wide/from16 v17, v1

    move v1, v15

    const/4 v2, 0x1

    goto/16 :goto_11

    :goto_9
    const v13, 0x7cd9a188

    invoke-virtual {v12, v13}, Lp1/q;->f0(I)V

    sget-wide v14, Li2/x;->f:J

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    invoke-static {v7, v14, v15, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-wide/from16 v17, v1

    move-object/from16 v14, v36

    move-object/from16 v15, v37

    const/4 v1, 0x0

    invoke-static {v14, v15, v5, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    invoke-static {v5}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    move-object/from16 v15, v39

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v15, v40

    goto :goto_b

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v22

    invoke-static {v5, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v2, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    move-object/from16 v2, v23

    goto :goto_d

    :cond_12
    :goto_c
    move-object/from16 v1, v41

    goto :goto_e

    :goto_d
    invoke-static {v1, v12, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v5, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x52a8415b

    invoke-virtual {v12, v1}, Lp1/q;->f0(I)V

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    const-string v1, "Stop showing when completed"

    const/4 v2, 0x6

    const/4 v14, 0x0

    invoke-static {v1, v14, v5, v2}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :cond_13
    const/4 v1, 0x0

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    const v2, 0x7cd9a44f

    invoke-virtual {v12, v2}, Lp1/q;->f0(I)V

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    const-string v2, "Stop showing when dismissed"

    const/4 v9, 0x6

    const/4 v14, 0x0

    invoke-static {v2, v14, v5, v9}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    const/4 v2, 0x1

    goto :goto_10

    :cond_14
    const/4 v14, 0x0

    goto :goto_f

    :goto_10
    invoke-static {v12, v1, v2, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_11
    const v9, 0x1bfe04e

    invoke-virtual {v12, v9}, Lp1/q;->f0(I)V

    const-string v9, "No limit"

    move-object/from16 v10, v35

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v5, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v20, 0x0

    const v21, 0x1fff2

    move/from16 v19, v1

    const-string v1, "Cooldown"

    move/from16 v33, v2

    const/4 v2, 0x0

    move-object/from16 v42, v7

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object/from16 v35, v10

    const/4 v10, 0x0

    move-object/from16 v30, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move-wide/from16 v46, v17

    move-object/from16 v18, v5

    move-wide/from16 v5, v46

    const/16 v17, 0x0

    move/from16 v34, v19

    const/16 v19, 0xd86

    move-object/from16 v44, v30

    move-object/from16 v43, v35

    move-object/from16 v45, v42

    invoke-static/range {v1 .. v21}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    move-object/from16 v7, v45

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v10, v43

    const/4 v1, 0x0

    const/4 v14, 0x0

    invoke-static {v10, v14, v5, v1}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v12, v44

    :cond_15
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
