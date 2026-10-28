.class public final Ldb/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public final B:Ljava/lang/Runnable;

.field public final C:Ljava/lang/Runnable;

.field public final D:Landroid/view/View$OnLayoutChangeListener;

.field public final synthetic a:I

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/ViewGroup;

.field public final d:Landroid/view/ViewGroup;

.field public final e:Landroid/view/ViewGroup;

.field public final f:Landroid/view/ViewGroup;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/view/ViewGroup;

.field public final j:Landroid/view/View;

.field public final k:Landroid/view/View;

.field public final l:Landroid/animation/AnimatorSet;

.field public final m:Landroid/animation/AnimatorSet;

.field public final n:Landroid/animation/AnimatorSet;

.field public final o:Landroid/animation/AnimatorSet;

.field public final p:Landroid/animation/AnimatorSet;

.field public final q:Landroid/animation/ValueAnimator;

.field public final r:Landroid/animation/ValueAnimator;

.field public final s:Ljava/util/ArrayList;

.field public t:I

.field public u:Z

.field public v:Z

.field public w:Z

.field public final x:Landroid/widget/FrameLayout;

.field public final y:Ljava/lang/Runnable;

.field public final z:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ldb/x;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    iput v2, v0, Ldb/c0;->a:I

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    .line 3
    new-instance v3, Ldb/y;

    invoke-direct {v3, v0, v2}, Ldb/y;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->y:Ljava/lang/Runnable;

    .line 4
    new-instance v3, Ldb/y;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v4}, Ldb/y;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->z:Ljava/lang/Runnable;

    .line 5
    new-instance v3, Ldb/y;

    const/4 v5, 0x4

    invoke-direct {v3, v0, v5}, Ldb/y;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->A:Ljava/lang/Runnable;

    .line 6
    new-instance v3, Ldb/y;

    const/4 v6, 0x5

    invoke-direct {v3, v0, v6}, Ldb/y;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->B:Ljava/lang/Runnable;

    .line 7
    new-instance v3, Ldb/y;

    const/4 v7, 0x6

    invoke-direct {v3, v0, v7}, Ldb/y;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->C:Ljava/lang/Runnable;

    .line 8
    new-instance v3, Ldb/k;

    const/4 v7, 0x1

    invoke-direct {v3, v0, v7}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    iput-object v3, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    .line 9
    iput-boolean v7, v0, Ldb/c0;->w:Z

    .line 10
    iput v2, v0, Ldb/c0;->t:I

    .line 11
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ldb/c0;->s:Ljava/util/ArrayList;

    const v3, 0x7f0a045a

    .line 12
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v0, Ldb/c0;->b:Landroid/view/View;

    const v3, 0x7f0a0455

    .line 13
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->c:Landroid/view/ViewGroup;

    const v3, 0x7f0a0465

    .line 14
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->e:Landroid/view/ViewGroup;

    const v3, 0x7f0a0453

    .line 15
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->d:Landroid/view/ViewGroup;

    const v8, 0x7f0a047e

    .line 16
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup;

    iput-object v8, v0, Ldb/c0;->i:Landroid/view/ViewGroup;

    const v8, 0x7f0a0471

    .line 17
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    iput-object v8, v0, Ldb/c0;->j:Landroid/view/View;

    const v9, 0x7f0a0452

    .line 18
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->f:Landroid/view/ViewGroup;

    const v9, 0x7f0a045d

    .line 19
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->g:Landroid/view/ViewGroup;

    const v9, 0x7f0a045e

    .line 20
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->h:Landroid/view/ViewGroup;

    const v9, 0x7f0a0469

    .line 21
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, v0, Ldb/c0;->k:Landroid/view/View;

    const v10, 0x7f0a0468

    .line 22
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    if-eqz v9, :cond_0

    if-eqz v10, :cond_0

    .line 23
    new-instance v11, Lb30/k3;

    const/4 v12, 0x7

    invoke-direct {v11, v0, v12}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    new-instance v9, Lb30/k3;

    invoke-direct {v9, v0, v12}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const/4 v9, 0x2

    .line 25
    new-array v10, v9, [F

    fill-array-data v10, :array_0

    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v10

    .line 26
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 27
    new-instance v11, Ldb/z;

    invoke-direct {v11, v0, v4}, Ldb/z;-><init>(Ldb/c0;I)V

    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 28
    new-instance v11, Ldb/a0;

    invoke-direct {v11, v0, v2}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v10, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 29
    new-array v11, v9, [F

    fill-array-data v11, :array_1

    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v11

    .line 30
    new-instance v12, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v12}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 31
    new-instance v12, Ldb/z;

    invoke-direct {v12, v0, v2}, Ldb/z;-><init>(Ldb/c0;I)V

    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 32
    new-instance v12, Ldb/a0;

    invoke-direct {v12, v0, v7}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v11, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f0700d8

    .line 34
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    const v15, 0x7f0700dd

    .line 35
    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v15

    sub-float/2addr v14, v15

    .line 36
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    .line 37
    new-instance v13, Landroid/animation/AnimatorSet;

    invoke-direct {v13}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v13, v0, Ldb/c0;->l:Landroid/animation/AnimatorSet;

    const-wide/16 v5, 0xfa

    .line 38
    invoke-virtual {v13, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 39
    new-instance v15, Ldb/b0;

    invoke-direct {v15, v0, v1, v2}, Ldb/b0;-><init>(Ldb/c0;Ldb/x;I)V

    invoke-virtual {v13, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 40
    invoke-virtual {v13, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    const/4 v13, 0x0

    .line 41
    invoke-static {v8, v13, v14}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 42
    invoke-static {v3, v13, v14}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 43
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v2, v0, Ldb/c0;->m:Landroid/animation/AnimatorSet;

    .line 44
    invoke-virtual {v2, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 45
    new-instance v15, Ldb/b0;

    invoke-direct {v15, v0, v1, v7}, Ldb/b0;-><init>(Ldb/c0;Ldb/x;I)V

    invoke-virtual {v2, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 46
    invoke-static {v8, v14, v12}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    .line 47
    invoke-static {v3, v14, v12}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v2, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 48
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v2, v0, Ldb/c0;->n:Landroid/animation/AnimatorSet;

    .line 49
    invoke-virtual {v2, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 50
    new-instance v15, Ldb/b0;

    invoke-direct {v15, v0, v1, v9}, Ldb/b0;-><init>(Ldb/c0;Ldb/x;I)V

    invoke-virtual {v2, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 51
    invoke-virtual {v2, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 52
    invoke-static {v8, v13, v12}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 53
    invoke-static {v3, v13, v12}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 54
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, v0, Ldb/c0;->o:Landroid/animation/AnimatorSet;

    .line 55
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 56
    new-instance v2, Ldb/a0;

    invoke-direct {v2, v0, v9}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 57
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 58
    invoke-static {v8, v14, v13}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 59
    invoke-static {v3, v14, v13}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 60
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, v0, Ldb/c0;->p:Landroid/animation/AnimatorSet;

    .line 61
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 62
    new-instance v2, Ldb/a0;

    invoke-direct {v2, v0, v4}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 63
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 64
    invoke-static {v8, v12, v13}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 65
    invoke-static {v3, v12, v13}, Ldb/c0;->e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 66
    new-array v1, v9, [F

    fill-array-data v1, :array_2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, v0, Ldb/c0;->q:Landroid/animation/ValueAnimator;

    .line 67
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 68
    new-instance v2, Ldb/z;

    invoke-direct {v2, v0, v7}, Ldb/z;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 69
    new-instance v2, Ldb/a0;

    const/4 v15, 0x4

    invoke-direct {v2, v0, v15}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 70
    new-array v1, v9, [F

    fill-array-data v1, :array_3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, v0, Ldb/c0;->r:Landroid/animation/ValueAnimator;

    .line 71
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 72
    new-instance v2, Ldb/z;

    invoke-direct {v2, v0, v9}, Ldb/z;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 73
    new-instance v2, Ldb/a0;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Ldb/a0;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public constructor <init>(Ljo/s;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    iput v2, v0, Ldb/c0;->a:I

    .line 74
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    .line 76
    new-instance v3, Ljo/t;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Ljo/t;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->y:Ljava/lang/Runnable;

    .line 77
    new-instance v3, Ljo/t;

    const/4 v5, 0x3

    invoke-direct {v3, v0, v5}, Ljo/t;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->z:Ljava/lang/Runnable;

    .line 78
    new-instance v3, Ljo/t;

    const/4 v6, 0x4

    invoke-direct {v3, v0, v6}, Ljo/t;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->A:Ljava/lang/Runnable;

    .line 79
    new-instance v3, Ljo/t;

    const/4 v7, 0x5

    invoke-direct {v3, v0, v7}, Ljo/t;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->B:Ljava/lang/Runnable;

    .line 80
    new-instance v3, Ljo/t;

    const/4 v8, 0x6

    invoke-direct {v3, v0, v8}, Ljo/t;-><init>(Ldb/c0;I)V

    iput-object v3, v0, Ldb/c0;->C:Ljava/lang/Runnable;

    .line 81
    new-instance v3, Ldb/k;

    invoke-direct {v3, v0, v6}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    iput-object v3, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    .line 82
    iput-boolean v2, v0, Ldb/c0;->w:Z

    .line 83
    iput v4, v0, Ldb/c0;->t:I

    .line 84
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ldb/c0;->s:Ljava/util/ArrayList;

    const v3, 0x7f0a045a

    .line 85
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v0, Ldb/c0;->b:Landroid/view/View;

    const v3, 0x7f0a0455

    .line 86
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->c:Landroid/view/ViewGroup;

    const v3, 0x7f0a0465

    .line 87
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->e:Landroid/view/ViewGroup;

    const v3, 0x7f0a0453

    .line 88
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, v0, Ldb/c0;->d:Landroid/view/ViewGroup;

    const v8, 0x7f0a047e

    .line 89
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup;

    iput-object v8, v0, Ldb/c0;->i:Landroid/view/ViewGroup;

    const v8, 0x7f0a0471

    .line 90
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    iput-object v8, v0, Ldb/c0;->j:Landroid/view/View;

    const v9, 0x7f0a0452

    .line 91
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->f:Landroid/view/ViewGroup;

    const v9, 0x7f0a045d

    .line 92
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->g:Landroid/view/ViewGroup;

    const v9, 0x7f0a045e

    .line 93
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iput-object v9, v0, Ldb/c0;->h:Landroid/view/ViewGroup;

    const v9, 0x7f0a0469

    .line 94
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, v0, Ldb/c0;->k:Landroid/view/View;

    const v10, 0x7f0a0468

    .line 95
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    if-eqz v9, :cond_0

    if-eqz v10, :cond_0

    .line 96
    new-instance v11, Ljo/j;

    invoke-direct {v11, v0, v5}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    new-instance v9, Ljo/j;

    invoke-direct {v9, v0, v5}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const/4 v9, 0x2

    .line 98
    new-array v10, v9, [F

    fill-array-data v10, :array_0

    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v10

    .line 99
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 100
    new-instance v11, Ljo/u;

    invoke-direct {v11, v0, v5}, Ljo/u;-><init>(Ldb/c0;I)V

    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 101
    new-instance v11, Ljo/v;

    invoke-direct {v11, v0, v4}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v10, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 102
    new-array v11, v9, [F

    fill-array-data v11, :array_1

    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v11

    .line 103
    new-instance v12, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v12}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 104
    new-instance v12, Ljo/u;

    invoke-direct {v12, v0, v4}, Ljo/u;-><init>(Ldb/c0;I)V

    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 105
    new-instance v12, Ljo/v;

    invoke-direct {v12, v0, v2}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v11, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 106
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    const v13, 0x7f0700d8

    .line 107
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    const v15, 0x7f0700dd

    .line 108
    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v15

    sub-float/2addr v14, v15

    .line 109
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    .line 110
    new-instance v13, Landroid/animation/AnimatorSet;

    invoke-direct {v13}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v13, v0, Ldb/c0;->l:Landroid/animation/AnimatorSet;

    const-wide/16 v6, 0xfa

    .line 111
    invoke-virtual {v13, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 112
    new-instance v15, Ljo/w;

    invoke-direct {v15, v0, v1, v4}, Ljo/w;-><init>(Ldb/c0;Ljo/s;I)V

    invoke-virtual {v13, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 113
    invoke-virtual {v13, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    const/4 v13, 0x0

    .line 114
    invoke-static {v8, v13, v14}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v4, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    .line 115
    invoke-static {v3, v13, v14}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v4, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 116
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v4, v0, Ldb/c0;->m:Landroid/animation/AnimatorSet;

    .line 117
    invoke-virtual {v4, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 118
    new-instance v15, Ljo/w;

    invoke-direct {v15, v0, v1, v2}, Ljo/w;-><init>(Ldb/c0;Ljo/s;I)V

    invoke-virtual {v4, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 119
    invoke-static {v8, v14, v12}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v4, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    .line 120
    invoke-static {v3, v14, v12}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v15

    invoke-virtual {v4, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 121
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v4, v0, Ldb/c0;->n:Landroid/animation/AnimatorSet;

    .line 122
    invoke-virtual {v4, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 123
    new-instance v15, Ljo/w;

    invoke-direct {v15, v0, v1, v9}, Ljo/w;-><init>(Ldb/c0;Ljo/s;I)V

    invoke-virtual {v4, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 124
    invoke-virtual {v4, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 125
    invoke-static {v8, v13, v12}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 126
    invoke-static {v3, v13, v12}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 127
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, v0, Ldb/c0;->o:Landroid/animation/AnimatorSet;

    .line 128
    invoke-virtual {v1, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 129
    new-instance v4, Ljo/v;

    invoke-direct {v4, v0, v9}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 130
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 131
    invoke-static {v8, v14, v13}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 132
    invoke-static {v3, v14, v13}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 133
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v1, v0, Ldb/c0;->p:Landroid/animation/AnimatorSet;

    .line 134
    invoke-virtual {v1, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 135
    new-instance v4, Ljo/v;

    invoke-direct {v4, v0, v5}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 136
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 137
    invoke-static {v8, v12, v13}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 138
    invoke-static {v3, v12, v13}, Ldb/c0;->f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 139
    new-array v1, v9, [F

    fill-array-data v1, :array_2

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, v0, Ldb/c0;->q:Landroid/animation/ValueAnimator;

    .line 140
    invoke-virtual {v1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 141
    new-instance v3, Ljo/u;

    invoke-direct {v3, v0, v2}, Ljo/u;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 142
    new-instance v2, Ljo/v;

    const/4 v15, 0x4

    invoke-direct {v2, v0, v15}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 143
    new-array v1, v9, [F

    fill-array-data v1, :array_3

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, v0, Ldb/c0;->r:Landroid/animation/ValueAnimator;

    .line 144
    invoke-virtual {v1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 145
    new-instance v2, Ljo/u;

    invoke-direct {v2, v0, v9}, Ljo/u;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 146
    new-instance v2, Ljo/v;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Ljo/v;-><init>(Ldb/c0;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static c(Landroid/view/View;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_1

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p0

    add-int/2addr v1, v0

    return v1

    :cond_1
    return v0
.end method

.method public static d(Landroid/view/View;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_1

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p0

    add-int/2addr v1, v0

    return v1

    :cond_1
    return v0
.end method

.method public static e(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    const-string p1, "translationY"

    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    const-string p1, "translationY"

    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    const v0, 0x7f0a0453

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0470

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0467

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0474

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0475

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a045f

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0460

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static m(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    const v0, 0x7f0a0453

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0470

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0467

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0474

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0475

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a045f

    if-eq p0, v0, :cond_1

    const v0, 0x7f0a0460

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(F)V
    .locals 4

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    const/high16 v0, 0x3f800000    # 1.0f

    iget-object v1, p0, Ldb/c0;->h:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float v3, v0, p1

    mul-float/2addr v3, v2

    float-to-int v2, v3

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    :cond_0
    iget-object v1, p0, Ldb/c0;->i:Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    sub-float v2, v0, p1

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    iget-object v1, p0, Ldb/c0;->f:Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    sub-float/2addr v0, p1

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    return-void

    :pswitch_0
    const/high16 v0, 0x3f800000    # 1.0f

    iget-object v1, p0, Ldb/c0;->h:Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float v3, v0, p1

    mul-float/2addr v3, v2

    float-to-int v2, v3

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    :cond_3
    iget-object v1, p0, Ldb/c0;->i:Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    sub-float v2, v0, p1

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_4
    iget-object v1, p0, Ldb/c0;->f:Landroid/view/ViewGroup;

    if-eqz v1, :cond_5

    sub-float/2addr v0, p1

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/view/View;)Z
    .locals 1

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Ldb/c0;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Ldb/c0;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Runnable;J)V
    .locals 2

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void

    :pswitch_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()V
    .locals 2

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    iget-object v1, p0, Ldb/c0;->C:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->z:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->B:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->A:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    iget-object v1, p0, Ldb/c0;->C:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->z:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->B:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, p0, Ldb/c0;->A:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()V
    .locals 4

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ldb/c0;->t:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ldb/c0;->h()V

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    invoke-virtual {v0}, Ljo/s;->getShowTimeoutMs()I

    move-result v0

    if-lez v0, :cond_3

    iget-boolean v1, p0, Ldb/c0;->w:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ldb/c0;->C:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_1
    iget v1, p0, Ldb/c0;->t:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v0, p0, Ldb/c0;->A:Ljava/lang/Runnable;

    check-cast v0, Ljo/t;

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ldb/c0;->B:Ljava/lang/Runnable;

    check-cast v1, Ljo/t;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    :cond_3
    :goto_0
    return-void

    :pswitch_0
    iget v0, p0, Ldb/c0;->t:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Ldb/c0;->h()V

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    invoke-virtual {v0}, Ldb/x;->getShowTimeoutMs()I

    move-result v0

    if-lez v0, :cond_7

    iget-boolean v1, p0, Ldb/c0;->w:Z

    if-nez v1, :cond_5

    iget-object v1, p0, Ldb/c0;->C:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    goto :goto_1

    :cond_5
    iget v1, p0, Ldb/c0;->t:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Ldb/c0;->A:Ljava/lang/Runnable;

    check-cast v0, Ldb/y;

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    goto :goto_1

    :cond_6
    iget-object v1, p0, Ldb/c0;->B:Ljava/lang/Runnable;

    check-cast v1, Ldb/y;

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Ldb/c0;->g(Ljava/lang/Runnable;J)V

    :cond_7
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 1

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ldb/c0;->s:Ljava/util/ArrayList;

    if-nez p2, :cond_1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-boolean p2, p0, Ldb/c0;->u:Z

    if-eqz p2, :cond_2

    invoke-static {p1}, Ldb/c0;->m(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    return-void

    :pswitch_0
    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v0, p0, Ldb/c0;->s:Ljava/util/ArrayList;

    if-nez p2, :cond_4

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    iget-boolean p2, p0, Ldb/c0;->u:Z

    if-eqz p2, :cond_5

    invoke-static {p1}, Ldb/c0;->l(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_5

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I)V
    .locals 3

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ljo/s;

    iget v1, p0, Ldb/c0;->t:I

    iput p1, p0, Ldb/c0;->t:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    if-ne v1, v2, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    if-eq v1, p1, :cond_2

    iget-object p1, v0, Ljo/s;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljo/r;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    check-cast v1, Ljo/x;

    iget-object v1, v1, Ljo/x;->y:Lcom/google/android/exoplayer2/ui/StyledPlayerView;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/ui/StyledPlayerView;->j()V

    goto :goto_1

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, p0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    iget v1, p0, Ldb/c0;->t:I

    iput p1, p0, Ldb/c0;->t:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_3

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    if-ne v1, v2, :cond_4

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_2
    if-eq v1, p1, :cond_5

    iget-object p1, v0, Ldb/x;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldb/w;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    check-cast v1, Ldb/e0;

    iget-object v1, v1, Ldb/e0;->y:Landroidx/media3/ui/PlayerView;

    invoke-virtual {v1}, Landroidx/media3/ui/PlayerView;->m()V

    goto :goto_3

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()V
    .locals 3

    iget v0, p0, Ldb/c0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Ldb/c0;->w:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ldb/c0;->k(I)V

    invoke-virtual {p0}, Ldb/c0;->i()V

    goto :goto_1

    :cond_0
    iget v0, p0, Ldb/c0;->t:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Ldb/c0;->v:Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ldb/c0;->p:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ldb/c0;->o:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :goto_0
    invoke-virtual {p0}, Ldb/c0;->i()V

    :cond_4
    :goto_1
    return-void

    :pswitch_0
    iget-boolean v0, p0, Ldb/c0;->w:Z

    if-nez v0, :cond_5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ldb/c0;->k(I)V

    invoke-virtual {p0}, Ldb/c0;->i()V

    goto :goto_3

    :cond_5
    iget v0, p0, Ldb/c0;->t:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v2, 0x2

    if-eq v0, v2, :cond_7

    const/4 v2, 0x3

    if-eq v0, v2, :cond_6

    const/4 v1, 0x4

    if-eq v0, v1, :cond_9

    goto :goto_2

    :cond_6
    iput-boolean v1, p0, Ldb/c0;->v:Z

    goto :goto_2

    :cond_7
    iget-object v0, p0, Ldb/c0;->p:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_2

    :cond_8
    iget-object v0, p0, Ldb/c0;->o:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :goto_2
    invoke-virtual {p0}, Ldb/c0;->i()V

    :cond_9
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
