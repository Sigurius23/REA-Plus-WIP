.class public final Landroidx/constraintlayout/widget/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/c;


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/e;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Landroidx/constraintlayout/widget/e;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static c(III)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_2

    const/high16 v0, -0x80000000

    if-eq p0, v0, :cond_1

    if-nez p0, :cond_2

    :cond_1
    if-ne p2, p1, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lm4/e;Ln4/b;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    goto/16 :goto_14

    :cond_0
    iget-object v3, v1, Lm4/e;->L:Lm4/d;

    iget-object v4, v1, Lm4/e;->J:Lm4/d;

    iget v5, v1, Lm4/e;->h0:I

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-ne v5, v6, :cond_1

    iput v7, v2, Ln4/b;->e:I

    iput v7, v2, Ln4/b;->f:I

    iput v7, v2, Ln4/b;->g:I

    return-void

    :cond_1
    iget-object v5, v1, Lm4/e;->U:Lm4/f;

    if-nez v5, :cond_2

    goto/16 :goto_14

    :cond_2
    iget-object v5, v0, Landroidx/constraintlayout/widget/e;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$000(Landroidx/constraintlayout/widget/ConstraintLayout;)Lf4/d;

    iget v6, v2, Ln4/b;->a:I

    iget v8, v2, Ln4/b;->b:I

    iget v9, v2, Ln4/b;->c:I

    iget v10, v2, Ln4/b;->d:I

    iget v11, v0, Landroidx/constraintlayout/widget/e;->b:I

    iget v12, v0, Landroidx/constraintlayout/widget/e;->c:I

    add-int/2addr v11, v12

    iget v12, v0, Landroidx/constraintlayout/widget/e;->d:I

    iget-object v13, v1, Lm4/e;->g0:Ljava/lang/Object;

    check-cast v13, Landroid/view/View;

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v14

    const/4 v15, 0x1

    const/4 v7, 0x2

    if-eqz v14, :cond_e

    if-eq v14, v15, :cond_d

    if-eq v14, v7, :cond_6

    const/4 v9, 0x3

    if-eq v14, v9, :cond_3

    const/4 v9, 0x0

    goto/16 :goto_5

    :cond_3
    iget v9, v0, Landroidx/constraintlayout/widget/e;->f:I

    if-eqz v4, :cond_4

    iget v14, v4, Lm4/d;->g:I

    goto :goto_0

    :cond_4
    const/4 v14, 0x0

    :goto_0
    if-eqz v3, :cond_5

    iget v7, v3, Lm4/d;->g:I

    add-int/2addr v14, v7

    :cond_5
    add-int/2addr v12, v14

    const/4 v7, -0x1

    invoke-static {v9, v12, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v9

    goto :goto_5

    :cond_6
    iget v7, v0, Landroidx/constraintlayout/widget/e;->f:I

    const/4 v9, -0x2

    invoke-static {v7, v12, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    iget v9, v1, Lm4/e;->s:I

    if-ne v9, v15, :cond_7

    move v9, v15

    goto :goto_1

    :cond_7
    const/4 v9, 0x0

    :goto_1
    iget v12, v2, Ln4/b;->j:I

    const/4 v14, 0x2

    if-eq v12, v15, :cond_8

    if-ne v12, v14, :cond_b

    :cond_8
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v12

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v15

    if-ne v12, v15, :cond_9

    const/4 v12, 0x1

    goto :goto_2

    :cond_9
    const/4 v12, 0x0

    :goto_2
    iget v15, v2, Ln4/b;->j:I

    if-eq v15, v14, :cond_c

    if-eqz v9, :cond_c

    if-eqz v9, :cond_a

    if-nez v12, :cond_c

    :cond_a
    invoke-virtual {v1}, Lm4/e;->B()Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    move v9, v7

    goto :goto_5

    :cond_c
    :goto_4
    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v7

    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v7, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_3

    :cond_d
    const/high16 v14, 0x40000000    # 2.0f

    iget v7, v0, Landroidx/constraintlayout/widget/e;->f:I

    const/4 v9, -0x2

    invoke-static {v7, v12, v9}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    goto :goto_3

    :cond_e
    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_3

    :goto_5
    invoke-static {v8}, Le4/p;->e(I)I

    move-result v7

    if-eqz v7, :cond_1a

    const/4 v12, 0x1

    if-eq v7, v12, :cond_19

    const/4 v14, 0x2

    if-eq v7, v14, :cond_12

    const/4 v10, 0x3

    if-eq v7, v10, :cond_f

    const/4 v4, 0x0

    goto/16 :goto_b

    :cond_f
    iget v7, v0, Landroidx/constraintlayout/widget/e;->g:I

    if-eqz v4, :cond_10

    iget-object v4, v1, Lm4/e;->K:Lm4/d;

    iget v4, v4, Lm4/d;->g:I

    goto :goto_6

    :cond_10
    const/4 v4, 0x0

    :goto_6
    if-eqz v3, :cond_11

    iget-object v3, v1, Lm4/e;->M:Lm4/d;

    iget v3, v3, Lm4/d;->g:I

    add-int/2addr v4, v3

    :cond_11
    add-int/2addr v11, v4

    const/4 v3, -0x1

    invoke-static {v7, v11, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v4

    goto :goto_b

    :cond_12
    iget v3, v0, Landroidx/constraintlayout/widget/e;->g:I

    const/4 v4, -0x2

    invoke-static {v3, v11, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    iget v4, v1, Lm4/e;->t:I

    const/4 v12, 0x1

    if-ne v4, v12, :cond_13

    move v4, v12

    goto :goto_7

    :cond_13
    const/4 v4, 0x0

    :goto_7
    iget v7, v2, Ln4/b;->j:I

    const/4 v14, 0x2

    if-eq v7, v12, :cond_14

    if-ne v7, v14, :cond_17

    :cond_14
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v10

    if-ne v7, v10, :cond_15

    const/4 v7, 0x1

    goto :goto_8

    :cond_15
    const/4 v7, 0x0

    :goto_8
    iget v10, v2, Ln4/b;->j:I

    if-eq v10, v14, :cond_18

    if-eqz v4, :cond_18

    if-eqz v4, :cond_16

    if-nez v7, :cond_18

    :cond_16
    invoke-virtual {v1}, Lm4/e;->C()Z

    move-result v4

    if-eqz v4, :cond_17

    goto :goto_a

    :cond_17
    :goto_9
    move v4, v3

    goto :goto_b

    :cond_18
    :goto_a
    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v3

    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v3, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    goto :goto_9

    :cond_19
    const/high16 v14, 0x40000000    # 2.0f

    iget v3, v0, Landroidx/constraintlayout/widget/e;->g:I

    const/4 v4, -0x2

    invoke-static {v3, v11, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    goto :goto_9

    :cond_1a
    const/high16 v14, 0x40000000    # 2.0f

    invoke-static {v10, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    goto :goto_9

    :goto_b
    iget-object v3, v1, Lm4/e;->U:Lm4/f;

    if-eqz v3, :cond_1b

    invoke-static {v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$100(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    move-result v7

    const/16 v10, 0x100

    invoke-static {v7, v10}, Lm4/k;->c(II)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v10

    if-ne v7, v10, :cond_1b

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v3}, Lm4/e;->r()I

    move-result v10

    if-ge v7, v10, :cond_1b

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v10

    if-ne v7, v10, :cond_1b

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    invoke-virtual {v3}, Lm4/e;->l()I

    move-result v3

    if-ge v7, v3, :cond_1b

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v3

    iget v7, v1, Lm4/e;->b0:I

    if-ne v3, v7, :cond_1b

    invoke-virtual {v1}, Lm4/e;->A()Z

    move-result v3

    if-nez v3, :cond_1b

    iget v3, v1, Lm4/e;->H:I

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v7

    invoke-static {v3, v9, v7}, Landroidx/constraintlayout/widget/e;->c(III)Z

    move-result v3

    if-eqz v3, :cond_1b

    iget v3, v1, Lm4/e;->I:I

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v7

    invoke-static {v3, v4, v7}, Landroidx/constraintlayout/widget/e;->c(III)Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-virtual {v1}, Lm4/e;->r()I

    move-result v3

    iput v3, v2, Ln4/b;->e:I

    invoke-virtual {v1}, Lm4/e;->l()I

    move-result v3

    iput v3, v2, Ln4/b;->f:I

    iget v1, v1, Lm4/e;->b0:I

    iput v1, v2, Ln4/b;->g:I

    return-void

    :cond_1b
    const/4 v10, 0x3

    if-ne v6, v10, :cond_1c

    const/4 v3, 0x1

    goto :goto_c

    :cond_1c
    const/4 v3, 0x0

    :goto_c
    if-ne v8, v10, :cond_1d

    const/4 v7, 0x1

    goto :goto_d

    :cond_1d
    const/4 v7, 0x0

    :goto_d
    const/4 v10, 0x4

    const/4 v12, 0x1

    if-eq v8, v10, :cond_1f

    if-ne v8, v12, :cond_1e

    goto :goto_e

    :cond_1e
    const/4 v8, 0x0

    goto :goto_f

    :cond_1f
    :goto_e
    move v8, v12

    :goto_f
    if-eq v6, v10, :cond_21

    if-ne v6, v12, :cond_20

    goto :goto_10

    :cond_20
    const/4 v12, 0x0

    goto :goto_11

    :cond_21
    :goto_10
    const/4 v12, 0x1

    :goto_11
    const/4 v6, 0x0

    if-eqz v3, :cond_22

    iget v10, v1, Lm4/e;->X:F

    cmpl-float v10, v10, v6

    if-lez v10, :cond_22

    const/4 v10, 0x1

    goto :goto_12

    :cond_22
    const/4 v10, 0x0

    :goto_12
    if-eqz v7, :cond_23

    iget v11, v1, Lm4/e;->X:F

    cmpl-float v6, v11, v6

    if-lez v6, :cond_23

    const/4 v6, 0x1

    goto :goto_13

    :cond_23
    const/4 v6, 0x0

    :goto_13
    if-nez v13, :cond_24

    :goto_14
    return-void

    :cond_24
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroidx/constraintlayout/widget/d;

    iget v14, v2, Ln4/b;->j:I

    const/4 v15, 0x1

    if-eq v14, v15, :cond_26

    const/4 v15, 0x2

    if-eq v14, v15, :cond_26

    if-eqz v3, :cond_26

    iget v3, v1, Lm4/e;->s:I

    if-nez v3, :cond_26

    if-eqz v7, :cond_26

    iget v3, v1, Lm4/e;->t:I

    if-eqz v3, :cond_25

    goto :goto_15

    :cond_25
    move-object/from16 v17, v5

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v7, -0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    goto/16 :goto_1e

    :cond_26
    :goto_15
    instance-of v3, v13, Landroidx/constraintlayout/widget/u;

    if-eqz v3, :cond_27

    instance-of v3, v1, Lm4/l;

    if-eqz v3, :cond_27

    move-object v3, v1

    check-cast v3, Lm4/l;

    move-object v7, v13

    check-cast v7, Landroidx/constraintlayout/widget/u;

    invoke-virtual {v7, v3, v9, v4}, Landroidx/constraintlayout/widget/u;->l(Lm4/l;II)V

    goto :goto_16

    :cond_27
    invoke-virtual {v13, v9, v4}, Landroid/view/View;->measure(II)V

    :goto_16
    iput v9, v1, Lm4/e;->H:I

    iput v4, v1, Lm4/e;->I:I

    const/4 v3, 0x0

    iput-boolean v3, v1, Lm4/e;->g:Z

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v14

    iget v15, v1, Lm4/e;->v:I

    if-lez v15, :cond_28

    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    move-result v15

    goto :goto_17

    :cond_28
    move v15, v3

    :goto_17
    iget v0, v1, Lm4/e;->w:I

    if-lez v0, :cond_29

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    :cond_29
    iget v0, v1, Lm4/e;->y:I

    if-lez v0, :cond_2a

    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_18
    move/from16 v16, v4

    goto :goto_19

    :cond_2a
    move v0, v7

    goto :goto_18

    :goto_19
    iget v4, v1, Lm4/e;->z:I

    if-lez v4, :cond_2b

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_2b
    invoke-static {v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$100(Landroidx/constraintlayout/widget/ConstraintLayout;)I

    move-result v4

    move-object/from16 v17, v5

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lm4/k;->c(II)Z

    move-result v4

    if-nez v4, :cond_2d

    const/high16 v4, 0x3f000000    # 0.5f

    if-eqz v10, :cond_2c

    if-eqz v8, :cond_2c

    iget v5, v1, Lm4/e;->X:F

    int-to-float v6, v0

    mul-float/2addr v6, v5

    add-float/2addr v6, v4

    float-to-int v4, v6

    move v15, v4

    goto :goto_1a

    :cond_2c
    if-eqz v6, :cond_2d

    if-eqz v12, :cond_2d

    iget v0, v1, Lm4/e;->X:F

    int-to-float v5, v15

    div-float/2addr v5, v0

    add-float/2addr v5, v4

    float-to-int v0, v5

    :cond_2d
    :goto_1a
    if-ne v3, v15, :cond_2f

    if-eq v7, v0, :cond_2e

    goto :goto_1c

    :cond_2e
    const/4 v3, 0x0

    :goto_1b
    const/4 v7, -0x1

    goto :goto_1e

    :cond_2f
    :goto_1c
    const/high16 v14, 0x40000000    # 2.0f

    if-eq v3, v15, :cond_30

    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    :cond_30
    if-eq v7, v0, :cond_31

    invoke-static {v0, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    goto :goto_1d

    :cond_31
    move/from16 v4, v16

    :goto_1d
    invoke-virtual {v13, v9, v4}, Landroid/view/View;->measure(II)V

    iput v9, v1, Lm4/e;->H:I

    iput v4, v1, Lm4/e;->I:I

    const/4 v3, 0x0

    iput-boolean v3, v1, Lm4/e;->g:Z

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v13}, Landroid/view/View;->getBaseline()I

    move-result v5

    move v15, v0

    move v0, v4

    move v14, v5

    goto :goto_1b

    :goto_1e
    if-eq v14, v7, :cond_32

    const/4 v12, 0x1

    goto :goto_1f

    :cond_32
    move v12, v3

    :goto_1f
    iget v4, v2, Ln4/b;->c:I

    if-ne v15, v4, :cond_34

    iget v4, v2, Ln4/b;->d:I

    if-eq v0, v4, :cond_33

    goto :goto_20

    :cond_33
    move v7, v3

    goto :goto_21

    :cond_34
    :goto_20
    const/4 v7, 0x1

    :goto_21
    iput-boolean v7, v2, Ln4/b;->i:Z

    iget-boolean v3, v11, Landroidx/constraintlayout/widget/d;->c0:Z

    if-eqz v3, :cond_35

    const/4 v12, 0x1

    :cond_35
    if-eqz v12, :cond_36

    const/4 v7, -0x1

    if-eq v14, v7, :cond_36

    iget v1, v1, Lm4/e;->b0:I

    if-eq v1, v14, :cond_36

    const/4 v5, 0x1

    iput-boolean v5, v2, Ln4/b;->i:Z

    :cond_36
    iput v15, v2, Ln4/b;->e:I

    iput v0, v2, Ln4/b;->f:I

    iput-boolean v12, v2, Ln4/b;->h:Z

    iput v14, v2, Ln4/b;->g:I

    invoke-static/range {v17 .. v17}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$000(Landroidx/constraintlayout/widget/ConstraintLayout;)Lf4/d;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Landroidx/constraintlayout/widget/e;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$200(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    :goto_1
    if-ge v2, v1, :cond_1

    invoke-static {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$200(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
