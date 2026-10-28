.class public final Loj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/io/Serializable;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lp1/c1;ZLcom/amplitude/android/engagement/a;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Loj/h;->w:I

    .line 1
    iput-object p1, p0, Loj/h;->F:Ljava/io/Serializable;

    iput-object p2, p0, Loj/h;->x:Ljava/lang/Object;

    iput-object p3, p0, Loj/h;->G:Ljava/lang/Object;

    iput-object p4, p0, Loj/h;->y:Ljava/lang/Object;

    iput-boolean p5, p0, Loj/h;->z:Z

    iput-object p6, p0, Loj/h;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;ZLb2/z;ILcom/amplitude/android/engagement/a;Lp1/c1;Lc93/a;)V
    .locals 0

    const/4 p4, 0x0

    iput p4, p0, Loj/h;->w:I

    .line 2
    iput-object p1, p0, Loj/h;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Loj/h;->z:Z

    iput-object p3, p0, Loj/h;->F:Ljava/io/Serializable;

    iput-object p5, p0, Loj/h;->E:Ljava/lang/Object;

    iput-object p6, p0, Loj/h;->y:Ljava/lang/Object;

    iput-object p7, p0, Loj/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    const/4 p7, 0x2

    iput p7, p0, Loj/h;->w:I

    .line 3
    iput-boolean p1, p0, Loj/h;->z:Z

    iput-object p2, p0, Loj/h;->x:Ljava/lang/Object;

    iput-object p3, p0, Loj/h;->F:Ljava/io/Serializable;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Loj/h;->E:Ljava/lang/Object;

    iput-object p5, p0, Loj/h;->y:Ljava/lang/Object;

    iput-object p6, p0, Loj/h;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 60

    move-object/from16 v0, p0

    iget v1, v0, Loj/h;->w:I

    packed-switch v1, :pswitch_data_0

    move-object/from16 v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    iget-object v1, v0, Loj/h;->x:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, v0, Loj/h;->F:Ljava/io/Serializable;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, v0, Loj/h;->E:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/internal/m;

    iget-object v1, v0, Loj/h;->y:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Luj/i;

    iget-object v1, v0, Loj/h;->G:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x181

    invoke-static {v1}, Lp1/x;->L(I)I

    move-result v9

    iget-boolean v2, v0, Loj/h;->z:Z

    invoke-static/range {v2 .. v9}, Lrj/o;->b(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_0
    move-object/from16 v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    const/4 v9, 0x2

    if-ne v1, v9, :cond_1

    move-object v1, v7

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_1e

    :cond_1
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v3, v0, Loj/h;->F:Ljava/io/Serializable;

    check-cast v3, Lcom/amplitude/android/engagement/types/DebugStatus;

    iget-object v4, v0, Loj/h;->x:Ljava/lang/Object;

    move-object/from16 v23, v4

    check-cast v23, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v4, v0, Loj/h;->G:Ljava/lang/Object;

    move-object/from16 v24, v4

    check-cast v24, Lcom/amplitude/android/engagement/types/SimulationContext;

    iget-object v4, v0, Loj/h;->y:Ljava/lang/Object;

    move-object v11, v4

    check-cast v11, Lp1/c1;

    iget-object v4, v0, Loj/h;->E:Ljava/lang/Object;

    move-object v12, v4

    check-cast v12, Lcom/amplitude/android/engagement/a;

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v13, v14, v7, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    invoke-static {v7}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v5

    move-object v6, v7

    check-cast v6, Lp1/q;

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v15, v6, Lp1/q;->S:Z

    if-eqz v15, :cond_2

    invoke-virtual {v6, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-nez v9, :cond_3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v17, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_3
    move-object/from16 v17, v4

    :goto_2
    invoke-static {v5, v6, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v7, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x3720e4

    invoke-virtual {v6, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    const/4 v5, 0x1

    move-object/from16 v18, v9

    if-eq v3, v2, :cond_8

    const-string v2, "status"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Loj/s;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aget v2, v2, v19

    const/4 v9, 0x2

    if-eq v2, v5, :cond_5

    if-eq v2, v9, :cond_7

    const/4 v4, 0x3

    if-eq v2, v4, :cond_5

    const/4 v4, 0x4

    if-ne v2, v4, :cond_6

    :cond_5
    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    const-string v2, "Throttle limit reached"

    :goto_3
    if-eqz v2, :cond_8

    move-object v4, v6

    move-object v6, v7

    const/4 v7, 0x0

    move-object/from16 v20, v8

    const/16 v8, 0xc

    move-object/from16 v21, v4

    const/4 v4, 0x0

    move/from16 v22, v5

    const/4 v5, 0x0

    move-object v9, v3

    move-object v3, v2

    move-object v2, v9

    move-object/from16 v26, v17

    move-object/from16 v27, v20

    move-object/from16 v9, v21

    move-object/from16 v17, v11

    const/16 v11, 0x8

    invoke-static/range {v2 .. v8}, Lbi/g;->g(Lcom/amplitude/android/engagement/types/DebugStatus;Ljava/lang/String;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v11

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v6, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_4
    const/4 v2, 0x0

    goto :goto_5

    :cond_8
    move-object v9, v6

    move-object v6, v7

    move-object/from16 v27, v8

    move-object/from16 v26, v17

    move-object/from16 v17, v11

    const/16 v11, 0x8

    goto :goto_4

    :goto_5
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    sget-wide v4, Luj/g;->i:J

    move-object/from16 v19, v6

    const/4 v3, 0x0

    sget-wide v6, Luj/g;->d:J

    const/16 v21, 0x0

    const v22, 0x1fff2

    move v8, v2

    const-string v2, "Throttle"

    move-object/from16 v20, v3

    const/4 v3, 0x0

    move/from16 v28, v8

    const/4 v8, 0x0

    move-object/from16 v29, v9

    move-object/from16 v30, v10

    const-wide/16 v9, 0x0

    move/from16 v31, v11

    const/4 v11, 0x0

    move-object/from16 v32, v12

    move-object/from16 v33, v13

    const-wide/16 v12, 0x0

    move-object/from16 v34, v14

    const/4 v14, 0x0

    move-object/from16 v35, v15

    const/4 v15, 0x0

    const/16 v36, 0x2

    const/16 v16, 0x0

    move-object/from16 v37, v17

    const/16 v17, 0x0

    move-object/from16 v38, v18

    const/16 v18, 0x0

    move-object/from16 v39, v20

    const/16 v20, 0xd86

    move-object/from16 p2, v1

    move-object/from16 v0, v29

    move-object/from16 v46, v30

    move-object/from16 v41, v32

    move-object/from16 v42, v33

    move-object/from16 v43, v34

    move-object/from16 v44, v35

    move/from16 v1, v36

    move-object/from16 v40, v37

    move-object/from16 v45, v38

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-wide v2, v6

    move-object/from16 v6, v19

    sget v7, Luj/g;->a:F

    int-to-float v8, v1

    div-float/2addr v7, v8

    move-object/from16 v8, v46

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v6, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    if-eqz v23, :cond_9

    invoke-virtual/range {v23 .. v23}, Lcom/amplitude/android/engagement/types/Nudge;->getType()Lcom/amplitude/android/engagement/types/NudgeType;

    move-result-object v9

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    :goto_6
    if-eqz v9, :cond_a

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_7
    const-string v10, "SURVEY"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v24, :cond_b

    invoke-virtual/range {v24 .. v24}, Lcom/amplitude/android/engagement/types/SimulationContext;->getSurveyThrottleLimit()Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move-result-object v7

    goto :goto_8

    :cond_b
    const/4 v7, 0x0

    goto :goto_8

    :cond_c
    if-eqz v24, :cond_b

    invoke-virtual/range {v24 .. v24}, Lcom/amplitude/android/engagement/types/SimulationContext;->getGuideThrottleLimit()Lcom/amplitude/android/engagement/types/ThrottleLimit;

    move-result-object v7

    :goto_8
    if-eqz v9, :cond_d

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_9
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    const-string v9, "Survey"

    goto :goto_a

    :cond_e
    const-string v9, "Guide"

    :goto_a
    if-eqz v7, :cond_f

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/ThrottleLimit;->getEnabled()Ljava/lang/Boolean;

    move-result-object v10

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    goto :goto_b

    :cond_f
    const/4 v15, 0x0

    :goto_b
    if-eqz v15, :cond_12

    const v10, 0x372503

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/ThrottleLimit;->getMax()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_10

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    goto :goto_c

    :cond_10
    const/4 v10, 0x1

    :goto_c
    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/ThrottleLimit;->getPeriod()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_11

    const-string v7, "unknown"

    :cond_11
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v10, 0x20

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "s per "

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v7, v10, v6, v9}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_12
    const/4 v9, 0x0

    const/4 v10, 0x0

    const v7, 0x3725c7

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    const-string v7, "No limit"

    const/4 v11, 0x6

    invoke-static {v7, v10, v6, v11}, Lbp/b;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    :goto_d
    const/16 v7, 0xc

    int-to-float v7, v7

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v6, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v9, v11, :cond_13

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_13
    check-cast v9, Lj0/i;

    move-object/from16 v12, v40

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_14

    if-ne v14, v11, :cond_15

    :cond_14
    new-instance v14, Lmj/e;

    const/4 v13, 0x4

    invoke-direct {v14, v13, v12}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v15, v14

    check-cast v15, Lc93/a;

    const/16 v16, 0x1c

    move-object/from16 v17, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v58, v11

    move-object v11, v9

    move-object/from16 v9, v58

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    move-object/from16 v15, p2

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_e
    move-object/from16 v1, v44

    goto :goto_f

    :cond_16
    move-object/from16 v15, p2

    invoke-virtual {v0}, Lp1/q;->s0()V

    goto :goto_e

    :goto_f
    invoke-static {v6, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v26

    invoke-static {v6, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move-wide/from16 v18, v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :goto_10
    move-object/from16 v2, v27

    goto :goto_12

    :cond_17
    move-object/from16 v2, v27

    :goto_11
    move-object/from16 v3, v45

    goto :goto_13

    :cond_18
    move-wide/from16 v18, v2

    goto :goto_10

    :goto_12
    invoke-static {v12, v0, v12, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v6, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v14, Ll0/m;->a:Ll0/e;

    move-wide/from16 v20, v4

    const/16 v4, 0x30

    invoke-static {v14, v10, v6, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    move/from16 v16, v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v30, v8

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_19
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v6, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_1a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    :cond_1a
    invoke-static {v4, v0, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v6, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    const-wide/16 v4, 0x0

    cmpl-double v4, v7, v4

    if-lez v4, :cond_1c

    const/4 v4, 0x1

    goto :goto_15

    :cond_1c
    const/4 v4, 0x0

    :goto_15
    if-nez v4, :cond_1d

    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_1d
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    invoke-direct {v4, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v5, 0x30

    invoke-static {v14, v10, v6, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_1e

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v6, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_1f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    :cond_1f
    invoke-static {v8, v0, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v6, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Lp3/r;->G:Lp3/r;

    move-wide/from16 v4, v20

    const/16 v21, 0x0

    const v22, 0x1ffd2

    move-object/from16 v20, v2

    const-string v2, "Ignore Throttle limits"

    move-object/from16 v45, v3

    const/4 v3, 0x0

    move-object v12, v9

    const-wide/16 v9, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    move-object/from16 v26, v13

    const-wide/16 v12, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v25, v15

    const/4 v15, 0x0

    move/from16 v27, v16

    const/16 v16, 0x0

    move-object/from16 v37, v17

    const/16 v17, 0x0

    move/from16 v29, v7

    move-wide/from16 v58, v18

    move-object/from16 v19, v6

    move-wide/from16 v6, v58

    const/16 v18, 0x0

    move-object/from16 v31, v20

    const v20, 0x30d86

    move-object/from16 v29, v0

    move-object/from16 v35, v1

    move-object/from16 v53, v23

    move-object/from16 v52, v24

    move-object/from16 v47, v25

    move-object/from16 v48, v26

    move/from16 v51, v27

    move-object/from16 v0, v30

    move-object/from16 v49, v31

    move-object/from16 v1, v37

    move-object/from16 v50, v45

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v19

    const/16 v11, 0x8

    int-to-float v10, v11

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v6, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v11, v29

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_21

    move-object/from16 v9, v53

    if-ne v3, v9, :cond_22

    :cond_21
    new-instance v3, Lmj/e;

    const/4 v2, 0x5

    invoke-direct {v3, v2, v1}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object v2, v3

    check-cast v2, Lc93/a;

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v19, v6

    sget-object v6, Loj/c;->a:Lx1/b;

    const v8, 0x30030

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v7, v19

    invoke-static/range {v2 .. v8}, Ll1/k3;->f(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    new-instance v3, Lj43/a;

    const/4 v2, 0x4

    move-object/from16 v4, v41

    invoke-direct {v3, v4, v2}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    const/4 v8, 0x0

    const/16 v9, 0x7c

    move-object/from16 v13, p0

    iget-boolean v2, v13, Loj/h;->z:Z

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Landroidx/compose/material3/d;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl1/d4;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    const v2, 0x372e96

    invoke-virtual {v11, v2}, Lp1/q;->f0(I)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_29

    const/16 v1, -0x32

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v12}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0x10

    int-to-float v3, v3

    const/4 v9, 0x2

    invoke-static {v1, v3, v2, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v4, v42

    move-object/from16 v5, v43

    const/4 v8, 0x0

    invoke-static {v4, v5, v6, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_23

    move-object/from16 v15, v47

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v8, v35

    goto :goto_18

    :cond_23
    move-object/from16 v15, v47

    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v6, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v48

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_24

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_25

    :cond_24
    move-object/from16 v7, v49

    goto :goto_1a

    :cond_25
    move-object/from16 v7, v49

    :goto_19
    move-object/from16 v5, v50

    goto :goto_1b

    :goto_1a
    invoke-static {v5, v11, v5, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v6, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v1, v10

    sget-wide v9, Luj/g;->t:J

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v14

    invoke-static {v0, v9, v10, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move/from16 v2, v51

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v14, v52

    const/4 v12, 0x0

    invoke-static {v14, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    invoke-static {v6}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v12

    move/from16 p2, v1

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v16, v3

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_26

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_26
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v6, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_27

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    :cond_27
    invoke-static {v12, v11, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v6, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-wide v4, Luj/g;->k:J

    move-object/from16 v19, v6

    sget-wide v6, Luj/g;->c:J

    const/16 v21, 0x0

    const/16 v29, 0x1

    const v22, 0x1fff2

    const-string v2, "Throttle limits won\'t be enforced while testing"

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-wide v14, v9

    const-wide/16 v9, 0x0

    move-object v1, v11

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    move-wide/from16 v17, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move-wide/from16 v23, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v25, v20

    const/16 v20, 0xd86

    move/from16 v54, p2

    move-object/from16 v30, v0

    move-wide/from16 v56, v23

    move/from16 v55, v25

    move/from16 v0, v29

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v19

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move-object/from16 v8, v30

    move/from16 v2, v54

    move/from16 v3, v55

    invoke-static {v8, v3, v2}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x28

    int-to-float v3, v3

    const/4 v4, 0x0

    const/4 v9, 0x2

    invoke-static {v2, v3, v4, v9}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Lt0/f;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    move-wide/from16 v14, v56

    invoke-static {v2, v14, v15, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v8, 0x0

    invoke-static {v2, v6, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_29
    move-object v1, v11

    move v0, v12

    const/4 v8, 0x0

    :goto_1d
    invoke-static {v1, v8, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_1e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    move-object v13, v0

    iget-object v0, v13, Loj/h;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/amplitude/android/engagement/a;

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v13, Loj/h;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    and-int/lit8 v1, v1, 0xb

    const/4 v4, 0x2

    if-ne v1, v4, :cond_2b

    move-object v1, v0

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_2a

    goto :goto_1f

    :cond_2a
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_20

    :cond_2b
    :goto_1f
    iget-object v1, v13, Loj/h;->x:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/amplitude/android/engagement/types/SimulationContext;

    iget-object v1, v13, Loj/h;->F:Ljava/io/Serializable;

    check-cast v1, Lb2/z;

    move-object v11, v0

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_2c

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v6, v0, :cond_2d

    :cond_2c
    new-instance v6, Loj/f;

    const/4 v0, 0x0

    invoke-direct {v6, v1, v0}, Loj/f;-><init>(Lb2/z;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object v7, v6

    check-cast v7, Lc93/a;

    const/16 v9, 0x48

    iget-boolean v6, v13, Loj/h;->z:Z

    move-object v8, v11

    invoke-static/range {v4 .. v9}, Lo73/a;->f(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v10, 0x0

    const/4 v12, 0x7

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v12}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    iget-object v0, v13, Loj/h;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/amplitude/android/engagement/types/SimulationContext;

    new-instance v8, Loj/g;

    iget-object v0, v13, Loj/h;->G:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    const/4 v1, 0x0

    invoke-direct {v8, v3, v0, v1}, Loj/g;-><init>(Lcom/amplitude/android/engagement/a;Lc93/a;I)V

    new-instance v9, Loj/g;

    const/4 v1, 0x1

    invoke-direct {v9, v3, v0, v1}, Loj/g;-><init>(Lcom/amplitude/android/engagement/a;Lc93/a;I)V

    move-object v5, v11

    const/16 v11, 0x48

    move-object v10, v5

    invoke-static/range {v6 .. v11}, Lcom/squareup/wire/n;->g(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Loj/g;Loj/g;Landroidx/compose/runtime/Composer;I)V

    move-object v11, v10

    const/4 v10, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v12}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    iget-object v0, v13, Loj/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/amplitude/android/engagement/types/SimulationContext;

    iget-boolean v4, v13, Loj/h;->z:Z

    const/16 v6, 0x248

    move-object v5, v11

    invoke-static/range {v1 .. v6}, Lce/w;->q(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/a;ZLandroidx/compose/runtime/Composer;I)V

    :goto_20
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
