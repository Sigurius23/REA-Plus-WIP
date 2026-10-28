.class public final Lmj/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lmj/a;

.field public final synthetic F:Landroid/content/res/Configuration;

.field public final synthetic G:Z

.field public final synthetic H:Lbc3/c0;

.field public final synthetic I:Lp1/a1;

.field public final synthetic J:Lcom/amplitude/android/engagement/a;

.field public final synthetic w:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic x:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final synthetic y:Lq0/b;

.field public final synthetic z:Lmj/n;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lq0/b;Lmj/n;Lmj/a;Landroid/content/res/Configuration;ZILbc3/c0;Lp1/a1;Lcom/amplitude/android/engagement/a;)V
    .locals 0

    iput-object p1, p0, Lmj/c;->w:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Lmj/c;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p3, p0, Lmj/c;->y:Lq0/b;

    iput-object p4, p0, Lmj/c;->z:Lmj/n;

    iput-object p5, p0, Lmj/c;->E:Lmj/a;

    iput-object p6, p0, Lmj/c;->F:Landroid/content/res/Configuration;

    iput-boolean p7, p0, Lmj/c;->G:Z

    iput-object p9, p0, Lmj/c;->H:Lbc3/c0;

    iput-object p10, p0, Lmj/c;->I:Lp1/a1;

    iput-object p11, p0, Lmj/c;->J:Lcom/amplitude/android/engagement/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    and-int/lit8 v1, v1, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    move-object v1, v12

    check-cast v1, Lp1/q;

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_1
    :goto_0
    new-instance v14, Lsj/l;

    iget-object v1, v0, Lmj/c;->y:Lq0/b;

    invoke-virtual {v1}, Lq0/y;->k()I

    move-result v2

    iget-object v8, v0, Lmj/c;->w:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v9, v0, Lmj/c;->x:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v10, v0, Lmj/c;->z:Lmj/n;

    invoke-direct {v14, v8, v9, v2, v10}, Lsj/l;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V

    move-object v2, v1

    new-instance v1, Ld0;

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v4, v2

    iget-object v2, v0, Lmj/c;->E:Lmj/a;

    iget-object v3, v0, Lmj/c;->H:Lbc3/c0;

    iget-object v5, v0, Lmj/c;->I:Lp1/a1;

    invoke-direct/range {v1 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v3, v2

    move-object v2, v4

    invoke-static {v12, v1, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v1

    iget-object v1, v1, Luj/m;->R:Ljava/lang/Float;

    move-object v15, v12

    check-cast v15, Lp1/q;

    iget-object v3, v0, Lmj/c;->F:Landroid/content/res/Configuration;

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x1

    if-nez v4, :cond_2

    if-ne v5, v6, :cond_5

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_1

    :cond_3
    iget v1, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v1, v1

    const v4, 0x3f733333    # 0.95f

    mul-float/2addr v1, v4

    :goto_1
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    if-ne v4, v11, :cond_4

    iget v3, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v3, v3

    const v4, 0x3f333333    # 0.7f

    mul-float/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    :cond_4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v9}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v3

    instance-of v4, v3, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    if-eqz v4, :cond_6

    check-cast v3, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    const/4 v4, 0x0

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/ModalFormFactor;->getCanClickOutsideToClose()Z

    move-result v3

    goto :goto_3

    :cond_7
    move v3, v4

    :goto_3
    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 p1, v12

    sget-wide v11, Li2/x;->b:J

    const v5, 0x3ecccccd    # 0.4f

    invoke-static {v5, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v11, v12, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    iget-boolean v7, v0, Lmj/c;->G:Z

    if-eqz v7, :cond_8

    if-eqz v3, :cond_8

    const/16 v20, 0x1

    goto :goto_4

    :cond_8
    move/from16 v20, v4

    :goto_4
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_9

    invoke-static {v15}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v3

    :cond_9
    move-object/from16 v18, v3

    check-cast v18, Lj0/i;

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_a

    if-ne v11, v6, :cond_b

    :cond_a
    new-instance v11, Lm5/k;

    const/4 v3, 0x1

    invoke-direct {v11, v10, v3}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v22, v11

    check-cast v22, Lc93/a;

    const/16 v23, 0x18

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v11

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    move/from16 v17, v7

    move-object/from16 v7, p1

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v15, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    move-object/from16 v19, v2

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_6

    :cond_d
    move-object/from16 v20, v8

    :goto_6
    invoke-static {v11, v15, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x4ac0377a    # 6298557.0f

    invoke-virtual {v15, v3}, Lp1/q;->f0(I)V

    if-nez v17, :cond_f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_7

    :cond_f
    const/16 v3, 0x1e0

    int-to-float v3, v3

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x3

    const/4 v8, 0x0

    invoke-static {v1, v8, v3}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v8, v1, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_7
    invoke-static {v1}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz v17, :cond_10

    invoke-static {v7}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v3

    iget v3, v3, Luj/m;->L:F

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v1, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_10
    const/4 v3, 0x0

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    invoke-static {v7}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v8

    move-object v11, v4

    iget-wide v3, v8, Luj/m;->w:J

    invoke-static {v1, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v3, v4, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    invoke-static {v7}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_11

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v7, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v4, v15, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    new-instance v2, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v2, v1}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x40

    const/4 v3, 0x0

    invoke-virtual {v14, v1, v2, v7, v3}, Lsj/l;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {v19 .. v19}, Lq0/y;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-instance v1, Ld0;

    const/4 v6, 0x0

    move-object v12, v7

    const/4 v7, 0x3

    iget-object v3, v0, Lmj/c;->I:Lp1/a1;

    iget-object v4, v0, Lmj/c;->J:Lcom/amplitude/android/engagement/a;

    move-object/from16 v2, v19

    move-object/from16 v5, v20

    invoke-direct/range {v1 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v12, v1, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    const-wide/16 v8, 0x0

    cmpl-double v1, v6, v8

    if-lez v1, :cond_14

    :goto_9
    move-object v4, v2

    goto :goto_a

    :cond_14
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_9

    :goto_a
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v3, v1

    if-lez v6, :cond_15

    move v9, v1

    :goto_b
    const/4 v1, 0x1

    goto :goto_c

    :cond_15
    move v9, v3

    goto :goto_b

    :goto_c
    invoke-direct {v2, v9, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    new-instance v3, Lc2/c;

    const/4 v6, 0x1

    invoke-direct {v3, v6, v5, v10}, Lc2/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x773d794d

    invoke-static {v5, v12, v3}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    move-object v3, v13

    const/4 v13, 0x0

    move-object v5, v3

    const/4 v3, 0x0

    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v0, v16

    move-object/from16 v1, v19

    invoke-static/range {v1 .. v13}, Ldp/d;->e(Lq0/b;Landroidx/compose/ui/Modifier;Ll0/k1;Lq0/e;FLb2/g;Lh0/p3;ZLt2/a;Li0/n;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0x8

    invoke-virtual {v14, v12, v1}, Lsj/l;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v12}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget v2, v2, Luj/m;->M:F

    int-to-float v1, v1

    add-float/2addr v2, v1

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v1, 0x1

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
