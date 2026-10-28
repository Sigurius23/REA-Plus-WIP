.class public Lcom/google/android/material/textfield/TextInputLayout;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field private static final c1:I = 0x7f150503

.field private static final d1:[[I


# instance fields
.field private final A0:Landroid/graphics/RectF;

.field private B0:Landroid/graphics/Typeface;

.field private C0:Landroid/graphics/drawable/Drawable;

.field private D0:I

.field private E:Ljava/lang/CharSequence;

.field private final E0:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/google/android/material/textfield/g0;",
            ">;"
        }
    .end annotation
.end field

.field private F:I

.field private F0:Landroid/graphics/drawable/Drawable;

.field private G:I

.field private G0:I

.field private H:I

.field private H0:Landroid/graphics/drawable/Drawable;

.field private I:I

.field private I0:Landroid/content/res/ColorStateList;

.field private final J:Lcom/google/android/material/textfield/u;

.field private J0:Landroid/content/res/ColorStateList;

.field K:Z

.field private K0:I

.field private L:I

.field private L0:I

.field private M:Z

.field private M0:I

.field private N:Lcom/google/android/material/textfield/f0;

.field private N0:Landroid/content/res/ColorStateList;

.field private O:Landroid/widget/TextView;

.field private O0:I

.field private P:I

.field private P0:I

.field private Q:I

.field private Q0:I

.field private R:Ljava/lang/CharSequence;

.field private R0:I

.field private S:Z

.field private S0:I

.field private T:Landroid/widget/TextView;

.field T0:I

.field private U:Landroid/content/res/ColorStateList;

.field private U0:Z

.field private V:I

.field final V0:Lcr/c;

.field private W:Lbc/h;

.field private W0:Z

.field private X0:Z

.field private Y0:Landroid/animation/ValueAnimator;

.field private Z0:Z

.field private a0:Lbc/h;

.field private a1:Z

.field private b0:Landroid/content/res/ColorStateList;

.field private b1:Z

.field private c0:Landroid/content/res/ColorStateList;

.field private d0:Landroid/content/res/ColorStateList;

.field private e0:Landroid/content/res/ColorStateList;

.field private f0:Z

.field private g0:Ljava/lang/CharSequence;

.field private h0:Z

.field private i0:Lkr/g;

.field private j0:Lkr/g;

.field private k0:Landroid/graphics/drawable/StateListDrawable;

.field private l0:Z

.field private m0:Lkr/g;

.field private n0:Lkr/g;

.field private o0:Lkr/k;

.field private p0:Z

.field private final q0:I

.field private r0:I

.field private s0:I

.field private t0:I

.field private u0:I

.field private v0:I

.field private final w:Landroid/widget/FrameLayout;

.field private w0:I

.field private final x:Lcom/google/android/material/textfield/z;

.field private x0:I

.field private final y:Lcom/google/android/material/textfield/q;

.field private final y0:Landroid/graphics/Rect;

.field z:Landroid/widget/EditText;

.field private final z0:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x10100a7

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [I

    filled-new-array {v0, v1}, [[I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/textfield/TextInputLayout;->d1:[[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040aca

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v4, p3

    .line 2
    sget v5, Lcom/google/android/material/textfield/TextInputLayout;->c1:I

    move-object/from16 v1, p1

    invoke-static {v1, v2, v4, v5}, Lqr/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v7, -0x1

    .line 3
    iput v7, v0, Lcom/google/android/material/textfield/TextInputLayout;->F:I

    .line 4
    iput v7, v0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    .line 5
    iput v7, v0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    .line 6
    iput v7, v0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    .line 7
    new-instance v1, Lcom/google/android/material/textfield/u;

    invoke-direct {v1, v0}, Lcom/google/android/material/textfield/u;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    .line 8
    new-instance v1, Lc9/g;

    const/16 v8, 0x9

    invoke-direct {v1, v8}, Lc9/g;-><init>(I)V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lcom/google/android/material/textfield/f0;

    .line 9
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/graphics/Rect;

    .line 10
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->z0:Landroid/graphics/Rect;

    .line 11
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    .line 12
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:Ljava/util/LinkedHashSet;

    .line 13
    new-instance v1, Lcr/c;

    invoke-direct {v1, v0}, Lcr/c;-><init>(Landroid/view/ViewGroup;)V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    const/4 v9, 0x0

    .line 14
    iput-boolean v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->b1:Z

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v10, 0x1

    .line 16
    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 17
    invoke-virtual {v0, v9}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 18
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 19
    new-instance v11, Landroid/widget/FrameLayout;

    invoke-direct {v11, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    .line 20
    invoke-virtual {v11, v10}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 21
    sget-object v6, Lkq/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 22
    iput-object v6, v1, Lcr/c;->W:Landroid/animation/TimeInterpolator;

    .line 23
    invoke-virtual {v1, v9}, Lcr/c;->i(Z)V

    .line 24
    iput-object v6, v1, Lcr/c;->V:Landroid/animation/TimeInterpolator;

    .line 25
    invoke-virtual {v1, v9}, Lcr/c;->i(Z)V

    const v6, 0x800033

    .line 26
    invoke-virtual {v1, v6}, Lcr/c;->l(I)V

    const/16 v12, 0x16

    const/16 v13, 0x14

    const/16 v14, 0x28

    const/16 v15, 0x2d

    const/16 v1, 0x31

    .line 27
    filled-new-array {v12, v13, v14, v15, v1}, [I

    move-result-object v6

    .line 28
    invoke-static {v3, v2, v4, v5}, Lcr/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    move/from16 v16, v1

    move-object v1, v3

    .line 29
    sget-object v3, Ljq/a;->P:[I

    move/from16 v13, v16

    invoke-static/range {v1 .. v6}, Lcr/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 30
    new-instance v6, Ls/m2;

    .line 31
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-direct {v6, v1, v3}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 32
    new-instance v12, Lcom/google/android/material/textfield/z;

    invoke-direct {v12, v0, v6}, Lcom/google/android/material/textfield/z;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ls/m2;)V

    iput-object v12, v0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    const/16 v15, 0x30

    .line 33
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 34
    iput-boolean v15, v0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    const/4 v15, 0x4

    .line 35
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v15

    .line 36
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    const/16 v15, 0x2f

    .line 37
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 38
    iput-boolean v15, v0, Lcom/google/android/material/textfield/TextInputLayout;->X0:Z

    const/16 v15, 0x2a

    .line 39
    invoke-virtual {v3, v15, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    .line 40
    iput-boolean v15, v0, Lcom/google/android/material/textfield/TextInputLayout;->W0:Z

    const/4 v15, 0x6

    .line 41
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_0

    .line 42
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    .line 43
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    goto :goto_0

    :cond_0
    const/4 v15, 0x3

    .line 44
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_1

    .line 45
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v15

    .line 46
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    :cond_1
    :goto_0
    const/4 v15, 0x5

    .line 47
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    const/4 v14, 0x2

    if-eqz v17, :cond_2

    .line 48
    invoke-virtual {v3, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    .line 49
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v3, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 51
    invoke-virtual {v3, v14, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v15

    .line 52
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 53
    :cond_3
    :goto_1
    invoke-static {v1, v2, v4, v5}, Lkr/k;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lkr/j;

    move-result-object v2

    invoke-virtual {v2}, Lkr/j;->a()Lkr/k;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    .line 54
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0703a7

    .line 55
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->q0:I

    .line 56
    invoke-virtual {v3, v8, v9}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    .line 57
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    .line 58
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0703a8

    .line 59
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/16 v4, 0x10

    .line 60
    invoke-virtual {v3, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 61
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    .line 62
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0703a9

    .line 63
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    const/16 v4, 0x11

    .line 64
    invoke-virtual {v3, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    .line 65
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    .line 66
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    const/16 v2, 0xd

    const/high16 v4, -0x40800000    # -1.0f

    .line 67
    invoke-virtual {v3, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/16 v5, 0xc

    .line 68
    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    const/16 v8, 0xa

    .line 69
    invoke-virtual {v3, v8, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    const/16 v15, 0xb

    .line 70
    invoke-virtual {v3, v15, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    .line 71
    iget-object v15, v0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {v15}, Lkr/k;->e()Lkr/j;

    move-result-object v15

    const/16 v17, 0x0

    cmpl-float v18, v2, v17

    if-ltz v18, :cond_4

    .line 72
    new-instance v14, Lkr/a;

    invoke-direct {v14, v2}, Lkr/a;-><init>(F)V

    iput-object v14, v15, Lkr/j;->e:Ljava/lang/Object;

    :cond_4
    cmpl-float v2, v5, v17

    if-ltz v2, :cond_5

    .line 73
    new-instance v2, Lkr/a;

    invoke-direct {v2, v5}, Lkr/a;-><init>(F)V

    iput-object v2, v15, Lkr/j;->f:Ljava/lang/Object;

    :cond_5
    cmpl-float v2, v8, v17

    if-ltz v2, :cond_6

    .line 74
    invoke-virtual {v15, v8}, Lkr/j;->d(F)V

    :cond_6
    cmpl-float v2, v4, v17

    if-ltz v2, :cond_7

    .line 75
    invoke-virtual {v15, v4}, Lkr/j;->c(F)V

    .line 76
    :cond_7
    invoke-virtual {v15}, Lkr/j;->a()Lkr/k;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    const/4 v2, 0x7

    .line 77
    invoke-static {v1, v6, v2}, Lkotlin/jvm/internal/j;->B(Landroid/content/Context;Ls/m2;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 78
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v4

    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    .line 79
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 80
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v4

    const v5, 0x1010367

    const v8, -0x101009e

    if-eqz v4, :cond_8

    .line 81
    filled-new-array {v8}, [I

    move-result-object v4

    .line 82
    invoke-virtual {v2, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v4

    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->P0:I

    const v4, 0x101009c

    const v8, 0x101009e

    .line 83
    filled-new-array {v4, v8}, [I

    move-result-object v4

    .line 84
    invoke-virtual {v2, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v4

    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    .line 85
    filled-new-array {v5, v8}, [I

    move-result-object v4

    .line 86
    invoke-virtual {v2, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    goto :goto_2

    .line 87
    :cond_8
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    const v2, 0x7f0603be

    .line 88
    invoke-static {v1, v2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 89
    filled-new-array {v8}, [I

    move-result-object v4

    .line 90
    invoke-virtual {v2, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v4

    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->P0:I

    .line 91
    filled-new-array {v5}, [I

    move-result-object v4

    .line 92
    invoke-virtual {v2, v4, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    goto :goto_2

    .line 93
    :cond_9
    iput v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 94
    iput v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    .line 95
    iput v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->P0:I

    .line 96
    iput v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    .line 97
    iput v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    .line 98
    :goto_2
    invoke-virtual {v3, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 99
    invoke-virtual {v6, v10}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    :cond_a
    const/16 v2, 0xe

    .line 100
    invoke-static {v1, v6, v2}, Lkotlin/jvm/internal/j;->B(Landroid/content/Context;Ls/m2;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    .line 101
    invoke-virtual {v3, v2, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 102
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    const v2, 0x7f0603d9

    .line 103
    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->K0:I

    const v2, 0x7f0603da

    .line 104
    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->S0:I

    const v2, 0x7f0603dd

    .line 105
    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->L0:I

    if-eqz v4, :cond_b

    .line 106
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V

    :cond_b
    const/16 v2, 0xf

    .line 107
    invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 108
    invoke-static {v1, v6, v2}, Lkotlin/jvm/internal/j;->B(Landroid/content/Context;Ls/m2;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 109
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V

    .line 110
    :cond_c
    invoke-virtual {v3, v13, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eq v1, v7, :cond_d

    .line 111
    invoke-virtual {v3, v13, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 112
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextAppearance(I)V

    :cond_d
    const/16 v1, 0x18

    .line 113
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Landroid/content/res/ColorStateList;

    const/16 v1, 0x19

    .line 114
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Landroid/content/res/ColorStateList;

    const/16 v1, 0x28

    .line 115
    invoke-virtual {v3, v1, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    const/16 v2, 0x23

    .line 116
    invoke-virtual {v3, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    const/16 v4, 0x22

    .line 117
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    const/16 v5, 0x24

    .line 118
    invoke-virtual {v3, v5, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    const/16 v8, 0x2d

    .line 119
    invoke-virtual {v3, v8, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    const/16 v13, 0x2c

    .line 120
    invoke-virtual {v3, v13, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v13

    const/16 v14, 0x2b

    .line 121
    invoke-virtual {v3, v14}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v14

    const/16 v15, 0x39

    .line 122
    invoke-virtual {v3, v15, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    const/16 v10, 0x38

    .line 123
    invoke-virtual {v3, v10}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v10

    const/16 v7, 0x12

    .line 124
    invoke-virtual {v3, v7, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    const/16 v9, 0x13

    move-object/from16 p2, v14

    const/4 v14, -0x1

    .line 125
    invoke-virtual {v3, v9, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    .line 126
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterMaxLength(I)V

    const/4 v9, 0x0

    const/16 v14, 0x16

    .line 127
    invoke-virtual {v3, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    .line 128
    iput v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->Q:I

    const/16 v14, 0x14

    .line 129
    invoke-virtual {v3, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    .line 130
    iput v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->P:I

    const/16 v14, 0x8

    .line 131
    invoke-virtual {v3, v14, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v14

    .line 132
    invoke-virtual {v0, v14}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    .line 133
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorContentDescription(Ljava/lang/CharSequence;)V

    .line 134
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorAccessibilityLiveRegion(I)V

    .line 135
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->P:I

    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextAppearance(I)V

    .line 136
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextTextAppearance(I)V

    .line 137
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextAppearance(I)V

    .line 138
    iget v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->Q:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextAppearance(I)V

    .line 139
    invoke-virtual {v0, v10}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 140
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    const/16 v1, 0x29

    .line 141
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 142
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextColor(Landroid/content/res/ColorStateList;)V

    :cond_e
    const/16 v1, 0x2e

    .line 143
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 144
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextColor(Landroid/content/res/ColorStateList;)V

    :cond_f
    const/16 v1, 0x32

    .line 145
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 146
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_10
    const/16 v1, 0x17

    .line 147
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 148
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextColor(Landroid/content/res/ColorStateList;)V

    :cond_11
    const/16 v1, 0x15

    .line 149
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 150
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V

    :cond_12
    const/16 v1, 0x3a

    .line 152
    invoke-virtual {v3, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 153
    invoke-virtual {v6, v1}, Ls/m2;->h(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 154
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    .line 155
    :cond_13
    new-instance v1, Lcom/google/android/material/textfield/q;

    invoke-direct {v1, v0, v6}, Lcom/google/android/material/textfield/q;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ls/m2;)V

    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    const/4 v2, 0x1

    const/4 v9, 0x0

    .line 156
    invoke-virtual {v3, v9, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    .line 157
    invoke-virtual {v6}, Ls/m2;->r()V

    .line 158
    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    const/4 v4, 0x2

    .line 159
    invoke-virtual {v0, v4}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 160
    invoke-static {v0, v2}, Lh5/k0;->b(Landroid/view/View;I)V

    .line 161
    invoke-virtual {v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 162
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 163
    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 164
    invoke-virtual {v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 165
    invoke-virtual {v0, v13}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 166
    invoke-virtual {v0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 167
    invoke-virtual {v0, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterEnabled(Z)V

    move-object/from16 v1, p2

    .line 168
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a1:Z

    return p0
.end method

.method public static synthetic b(Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    return p0
.end method

.method public static synthetic c(Lcom/google/android/material/textfield/TextInputLayout;Landroid/text/Editable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->L(Landroid/text/Editable;)V

    return-void
.end method

.method public static synthetic d(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/q;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    return-object p0
.end method

.method public static synthetic e(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/z;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    return-object p0
.end method

.method public static synthetic f(Lcom/google/android/material/textfield/TextInputLayout;)Lcom/google/android/material/textfield/u;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    return-object p0
.end method

.method private getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;
    .locals 10

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    instance-of v1, v0, Landroid/widget/AutoCompleteTextView;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    const v1, 0x7f04013f

    invoke-static {v0, v1}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v0

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    const v4, 0x3dcccccd    # 0.1f

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    sget-object v6, Lcom/google/android/material/textfield/TextInputLayout;->d1:[[I

    const-string v7, "TextInputLayout"

    const v8, 0x7f040168

    invoke-static {v1, v8, v7}, Lio/sentry/config/a;->X(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object v7

    iget v8, v7, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_1

    invoke-static {v1, v8}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    goto :goto_0

    :cond_1
    iget v1, v7, Landroid/util/TypedValue;->data:I

    :goto_0
    new-instance v7, Lkr/g;

    iget-object v8, v5, Lkr/g;->w:Lkr/f;

    iget-object v8, v8, Lkr/f;->a:Lkr/k;

    invoke-direct {v7, v8}, Lkr/g;-><init>(Lkr/k;)V

    invoke-static {v4, v0, v1}, Lrj/o;->x(FII)I

    move-result v0

    const/4 v4, 0x0

    filled-new-array {v0, v4}, [I

    move-result-object v8

    new-instance v9, Landroid/content/res/ColorStateList;

    invoke-direct {v9, v6, v8}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {v7, v9}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v7, v1}, Lkr/g;->setTint(I)V

    filled-new-array {v0, v1}, [I

    move-result-object v0

    new-instance v1, Landroid/content/res/ColorStateList;

    invoke-direct {v1, v6, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Lkr/g;

    iget-object v6, v5, Lkr/g;->w:Lkr/f;

    iget-object v6, v6, Lkr/f;->a:Lkr/k;

    invoke-direct {v0, v6}, Lkr/g;-><init>(Lkr/k;)V

    const/4 v6, -0x1

    invoke-virtual {v0, v6}, Lkr/g;->setTint(I)V

    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {v6, v1, v7, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    new-array v0, v3, [Landroid/graphics/drawable/Drawable;

    aput-object v6, v0, v4

    aput-object v5, v0, v2

    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    return-object v1

    :cond_2
    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    sget-object v3, Lcom/google/android/material/textfield/TextInputLayout;->d1:[[I

    invoke-static {v4, v0, v2}, Lrj/o;->x(FII)I

    move-result v0

    filled-new-array {v0, v2}, [I

    move-result-object v0

    new-instance v2, Landroid/content/res/ColorStateList;

    invoke-direct {v2, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {v0, v2, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    return-object v0
.end method

.method private getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:Landroid/graphics/drawable/StateListDrawable;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:Landroid/graphics/drawable/StateListDrawable;

    const v1, 0x10100aa

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:Landroid/graphics/drawable/StateListDrawable;

    const/4 v1, 0x0

    new-array v2, v1, [I

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->m(Z)Lkr/g;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:Landroid/graphics/drawable/StateListDrawable;

    return-object v0
.end method

.method private getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:Lkr/g;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->m(Z)Lkr/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:Lkr/g;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:Lkr/g;

    return-object v0
.end method

.method private setEditText(Landroid/widget/EditText;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez v0, :cond_f

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEndIconMode()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    instance-of v0, p1, Lcom/google/android/material/textfield/TextInputEditText;

    if-nez v0, :cond_0

    const-string v0, "TextInputLayout"

    const-string v1, "EditText added is not a TextInputEditText. Please switch to using that class instead."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    :goto_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    if-eq v0, v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    :goto_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:Z

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->v()V

    new-instance v1, Lcom/google/android/material/textfield/e0;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/e0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setTextInputAccessibilityDelegate(Lcom/google/android/material/textfield/e0;)V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcr/c;->m(Landroid/graphics/Typeface;)Z

    move-result v3

    invoke-virtual {v1, v2}, Lcr/c;->o(Landroid/graphics/Typeface;)Z

    move-result v2

    if-nez v3, :cond_3

    if-eqz v2, :cond_4

    :cond_3
    invoke-virtual {v1, v0}, Lcr/c;->i(Z)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    move-result v2

    iget v3, v1, Lcr/c;->l:F

    cmpl-float v3, v3, v2

    if-eqz v3, :cond_5

    iput v2, v1, Lcr/c;->l:F

    invoke-virtual {v1, v0}, Lcr/c;->i(Z)V

    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getLetterSpacing()F

    move-result v3

    iget v4, v2, Lcr/c;->g0:F

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_6

    iput v3, v2, Lcr/c;->g0:F

    invoke-virtual {v2, v0}, Lcr/c;->i(Z)V

    :cond_6
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getGravity()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    and-int/lit8 v4, v2, -0x71

    or-int/lit8 v4, v4, 0x30

    invoke-virtual {v3, v4}, Lcr/c;->l(I)V

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget v4, v3, Lcr/c;->j:I

    if-eq v4, v2, :cond_7

    iput v2, v3, Lcr/c;->j:I

    invoke-virtual {v3, v0}, Lcr/c;->i(Z)V

    :cond_7
    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    move-result v2

    iput v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->T0:I

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    new-instance v3, Lcom/google/android/material/textfield/b0;

    invoke-direct {v3, p0, p1}, Lcom/google/android/material/textfield/b0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/EditText;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    if-nez v2, :cond_8

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    :cond_8
    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_9
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    :cond_a
    const/16 v2, 0x1d

    if-lt v1, v2, :cond_b

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->E()V

    :cond_b
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->C(Landroid/text/Editable;)V

    :cond_c
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->G()V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/u;->b()V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:Ljava/util/LinkedHashSet;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/g0;

    check-cast v2, Lcom/google/android/material/textfield/n;

    invoke-virtual {v2, p0}, Lcom/google/android/material/textfield/n;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    goto :goto_2

    :cond_d
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/q;->m()V

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_e

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_e
    invoke-virtual {p0, v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->K(ZZ)V

    return-void

    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "We already have an EditText, can only have one"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private setHintInternal(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    if-eqz p1, :cond_0

    iget-object v1, v0, Lcr/c;->G:Ljava/lang/CharSequence;

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    iput-object p1, v0, Lcr/c;->G:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    iput-object p1, v0, Lcr/c;->H:Ljava/lang/CharSequence;

    iget-object v1, v0, Lcr/c;->K:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    iput-object p1, v0, Lcr/c;->K:Landroid/graphics/Bitmap;

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcr/c;->i(Z)V

    :cond_2
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    :cond_3
    return-void
.end method

.method private setPlaceholderTextEnabled(Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    :cond_3
    :goto_0
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    return-void
.end method

.method public static x(Landroid/view/ViewGroup;Z)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2, p1}, Lcom/google/android/material/textfield/TextInputLayout;->x(Landroid/view/ViewGroup;Z)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public A(Landroid/widget/TextView;I)V
    .locals 1

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v0, -0xff01

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    :goto_0
    const p2, 0x7f1502f3

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f0600cc

    invoke-static {p2, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public B()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget v1, v0, Lcom/google/android/material/textfield/u;->o:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->p:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public C(Landroid/text/Editable;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lcom/google/android/material/textfield/f0;

    check-cast v0, Lc9/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {p1, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    goto :goto_4

    :cond_1
    if-le p1, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    iget v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    iget-boolean v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v6, :cond_3

    const v6, 0x7f1402a6

    goto :goto_2

    :cond_3
    const v6, 0x7f1402a5

    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v7, v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eq v1, v2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    :cond_4
    invoke-static {}, Lf5/b;->c()Lf5/b;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {p1, v6}, [Ljava/lang/Object;

    move-result-object p1

    const v6, 0x7f1402a7

    invoke-virtual {v5, v6, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lf5/f;->a:Lcom/iterable/iterableapi/g1;

    if-nez p1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v2, p1}, Lf5/b;->d(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_3
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eq v1, p1, :cond_6

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->G()V

    :cond_6
    return-void
.end method

.method public final D()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:I

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:I

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->A(Landroid/widget/TextView;I)V

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_2
    return-void
.end method

.method public final E()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f04013e

    invoke-static {v0, v1}, Lio/sentry/config/a;->V(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget v2, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v2, :cond_2

    invoke-static {v0, v2}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget v0, v1, Landroid/util/TypedValue;->data:I

    if-eqz v0, :cond_3

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/widget/EditText;->getTextCursorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getTextCursorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v2, :cond_6

    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v2, :cond_6

    :cond_5
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_6

    move-object v0, v2

    :cond_6
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public F()Z
    .locals 10

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getStartIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v0, v6

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_2

    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    if-eq v6, v0, :cond_3

    :cond_2
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iput-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/graphics/drawable/Drawable;

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    invoke-virtual {v6, v1, v1, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v6, v0, v1

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/graphics/drawable/Drawable;

    if-eq v6, v7, :cond_5

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    aget-object v8, v0, v5

    aget-object v9, v0, v3

    aget-object v0, v0, v4

    invoke-virtual {v6, v7, v8, v9, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    aget-object v7, v0, v5

    aget-object v8, v0, v3

    aget-object v0, v0, v4

    invoke-virtual {v6, v2, v7, v8, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:Landroid/graphics/drawable/Drawable;

    :goto_0
    move v0, v5

    goto :goto_1

    :cond_5
    move v0, v1

    :goto_1
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v6}, Lcom/google/android/material/textfield/q;->e()Z

    move-result v6

    if-nez v6, :cond_7

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget v6, v6, Lcom/google/android/material/textfield/q;->I:I

    if-eqz v6, :cond_6

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v6, v6, Lcom/google/android/material/textfield/q;->P:Ljava/lang/CharSequence;

    if-eqz v6, :cond_d

    :cond_7
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    if-lez v6, :cond_d

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v6, v6, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    sub-int/2addr v6, v7

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v7}, Lcom/google/android/material/textfield/q;->e()Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v2, v7, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    goto :goto_2

    :cond_8
    iget v8, v7, Lcom/google/android/material/textfield/q;->I:I

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Lcom/google/android/material/textfield/q;->d()Z

    move-result v8

    if-eqz v8, :cond_9

    iget-object v2, v7, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    :cond_9
    :goto_2
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v2

    add-int v6, v2, v7

    :cond_a
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    if-eqz v7, :cond_b

    iget v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    if-eq v8, v6, :cond_b

    iput v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    invoke-virtual {v7, v1, v1, v6, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    aget-object v1, v2, v1

    aget-object v3, v2, v5

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    aget-object v2, v2, v4

    invoke-virtual {v0, v1, v3, v6, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return v5

    :cond_b
    if-nez v7, :cond_c

    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iput-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    iput v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:I

    invoke-virtual {v7, v1, v1, v6, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_c
    aget-object v3, v2, v3

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    if-eq v3, v6, :cond_f

    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    aget-object v1, v2, v1

    aget-object v3, v2, v5

    aget-object v2, v2, v4

    invoke-virtual {v0, v1, v3, v6, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return v5

    :cond_d
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_f

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v6

    aget-object v3, v6, v3

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    if-ne v3, v7, :cond_e

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    aget-object v1, v6, v1

    aget-object v3, v6, v5

    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Landroid/graphics/drawable/Drawable;

    aget-object v4, v6, v4

    invoke-virtual {v0, v1, v3, v7, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    :cond_e
    move v5, v0

    :goto_3
    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:Landroid/graphics/drawable/Drawable;

    return v5

    :cond_f
    return v0
.end method

.method public G()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_4

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Ls/e1;->a:[I

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, Ls/p;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_2
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, Ls/p;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->refreshDrawableState()V

    :cond_4
    :goto_0
    return-void
.end method

.method public H()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final I()V
    .locals 3

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()I

    move-result v1

    iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    if-eq v1, v2, :cond_0

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public J(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;->K(ZZ)V

    return-void
.end method

.method public final K(ZZ)V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    if-eqz v5, :cond_2

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v6, v5}, Lcr/c;->j(Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 v5, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_3

    const v6, -0x101009e

    filled-new-array {v6}, [I

    move-result-object v6

    iget v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->S0:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    goto :goto_2

    :cond_3
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S0:I

    :goto_2
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcr/c;->j(Landroid/content/res/ColorStateList;)V

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v6, v6, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v6

    goto :goto_3

    :cond_5
    move-object v6, v5

    :goto_3
    invoke-virtual {v0, v6}, Lcr/c;->j(Landroid/content/res/ColorStateList;)V

    goto :goto_4

    :cond_6
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcr/c;->j(Landroid/content/res/ColorStateList;)V

    goto :goto_4

    :cond_7
    if-eqz v4, :cond_8

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_8

    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v7, v6, Lcr/c;->o:Landroid/content/res/ColorStateList;

    if-eq v7, v0, :cond_8

    iput-object v0, v6, Lcr/c;->o:Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v2}, Lcr/c;->i(Z)V

    :cond_8
    :goto_4
    if-nez v1, :cond_f

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W0:Z

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v4, :cond_9

    goto :goto_6

    :cond_9
    if-nez p2, :cond_a

    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-nez p2, :cond_10

    :cond_a
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_b

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_b
    const/4 p2, 0x0

    if-eqz p1, :cond_c

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->X0:Z

    if-eqz p1, :cond_c

    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->h(F)V

    goto :goto_5

    :cond_c
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {p1, p2}, Lcr/c;->p(F)V

    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    check-cast p1, Lcom/google/android/material/textfield/h;

    iget-object p1, p1, Lcom/google/android/material/textfield/h;->Y:Lcom/google/android/material/textfield/g;

    iget-object p1, p1, Lcom/google/android/material/textfield/g;->s:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_d

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    check-cast p1, Lcom/google/android/material/textfield/h;

    invoke-virtual {p1, p2, p2, p2, p2}, Lcom/google/android/material/textfield/h;->w(FFFF)V

    :cond_d
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz p1, :cond_e

    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-eqz p2, :cond_e

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Lbc/h;

    invoke-static {p1, p2}, Lbc/a0;->a(Landroid/view/ViewGroup;Lbc/w;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iput-boolean v3, p1, Lcom/google/android/material/textfield/z;->J:Z

    invoke-virtual {p1}, Lcom/google/android/material/textfield/z;->e()V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-boolean v3, p1, Lcom/google/android/material/textfield/q;->R:Z

    invoke-virtual {p1}, Lcom/google/android/material/textfield/q;->n()V

    return-void

    :cond_f
    :goto_6
    if-nez p2, :cond_11

    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-eqz p2, :cond_10

    goto :goto_7

    :cond_10
    return-void

    :cond_11
    :goto_7
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    if-eqz p2, :cond_12

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_12

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_12
    const/high16 p2, 0x3f800000    # 1.0f

    if-eqz p1, :cond_13

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->X0:Z

    if-eqz p1, :cond_13

    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->h(F)V

    goto :goto_8

    :cond_13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {p1, p2}, Lcr/c;->p(F)V

    :goto_8
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    :cond_14
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez p1, :cond_15

    goto :goto_9

    :cond_15
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    :goto_9
    invoke-virtual {p0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->L(Landroid/text/Editable;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iput-boolean v2, p1, Lcom/google/android/material/textfield/z;->J:Z

    invoke-virtual {p1}, Lcom/google/android/material/textfield/z;->e()V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-boolean v2, p1, Lcom/google/android/material/textfield/q;->R:Z

    invoke-virtual {p1}, Lcom/google/android/material/textfield/q;->n()V

    return-void
.end method

.method public final L(Landroid/text/Editable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lcom/google/android/material/textfield/f0;

    check-cast v0, Lc9/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Ljava/lang/CharSequence;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Ljava/lang/CharSequence;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Lbc/h;

    invoke-static {p1, v1}, Lbc/a0;->a(Landroid/view/ViewGroup;Lbc/w;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Lbc/h;

    invoke-static {p1, v0}, Lbc/a0;->a(Landroid/view/ViewGroup;Lbc/w;)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final M(ZZ)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    const v2, 0x1010367

    const v3, 0x101009e

    filled-new-array {v2, v3}, [I

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    const v4, 0x10102fe

    filled-new-array {v4, v3}, [I

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    if-eqz p1, :cond_0

    iput v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    return-void

    :cond_0
    if-eqz p2, :cond_1

    iput v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    return-void

    :cond_1
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    return-void
.end method

.method public N()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    if-eqz v0, :cond_16

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v2

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isHovered()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->isHovered()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    move v1, v2

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v3

    if-nez v3, :cond_5

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->S0:I

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    if-eqz v3, :cond_6

    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->M(ZZ)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    move-result v3

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    goto :goto_2

    :cond_7
    iget-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v3, :cond_9

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v3, :cond_9

    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_8

    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->M(ZZ)V

    goto :goto_2

    :cond_8
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v3

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    goto :goto_2

    :cond_9
    if-eqz v0, :cond_a

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    goto :goto_2

    :cond_a
    if-eqz v1, :cond_b

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:I

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    goto :goto_2

    :cond_b
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:I

    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    :goto_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v3, v4, :cond_c

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->E()V

    :cond_c
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v4, v3, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v5, v3, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v6, v3, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/q;->l()V

    iget-object v7, v3, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v8, v3, Lcom/google/android/material/textfield/q;->z:Landroid/content/res/ColorStateList;

    invoke-static {v6, v7, v8}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    iget-object v7, v3, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    invoke-static {v6, v5, v7}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    invoke-virtual {v3}, Lcom/google/android/material/textfield/q;->b()Lcom/google/android/material/textfield/r;

    move-result-object v6

    instance-of v6, v6, Lcom/google/android/material/textfield/l;

    if-eqz v6, :cond_e

    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    invoke-virtual {v5, v3}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    :cond_d
    iget-object v6, v3, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    iget-object v3, v3, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v4, v5, v6, v3}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_e
    :goto_3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->y()V

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_11

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v4

    if-eqz v4, :cond_f

    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    goto :goto_4

    :cond_f
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    :goto_4
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    if-eq v4, v3, :cond_11

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result v3

    if-eqz v3, :cond_11

    iget-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-nez v3, :cond_11

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    check-cast v3, Lcom/google/android/material/textfield/h;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v4, v4}, Lcom/google/android/material/textfield/h;->w(FFFF)V

    :cond_10
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    :cond_11
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-ne v3, v2, :cond_15

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_12

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P0:I

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    goto :goto_5

    :cond_12
    if-eqz v1, :cond_13

    if-nez v0, :cond_13

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    goto :goto_5

    :cond_13
    if-eqz v0, :cond_14

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    goto :goto_5

    :cond_14
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    :cond_15
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    :cond_16
    :goto_6
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    instance-of v0, p1, Landroid/widget/EditText;

    if-eqz v0, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p2, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    iget v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    and-int/lit8 v0, v0, -0x71

    or-int/lit8 v0, v0, 0x10

    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->I()V

    check-cast p1, Landroid/widget/EditText;

    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEditText(Landroid/widget/EditText;)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/View;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    throw p1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;)V

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->onProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/ViewStructure;->setChildCount(I)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroid/view/View;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-ne v0, v3, :cond_2

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a1:Z

    invoke-super {p0, p1}, Landroid/view/View;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a1:Z

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0, p1}, Lcr/c;->d(Landroid/graphics/Canvas;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lkr/g;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget v2, v2, Lcr/c;->b:F

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    iget v4, v1, Landroid/graphics/Rect;->left:I

    invoke-static {v2, v3, v4}, Lkq/a;->c(FII)I

    move-result v4

    iput v4, v0, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    invoke-static {v2, v3, v1}, Lkq/a;->c(FII)I

    move-result v1

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    invoke-virtual {v0, p1}, Lkr/g;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public drawableStateChanged()V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Z0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Z0:Z

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iput-object v1, v2, Lcr/c;->R:[I

    iget-object v1, v2, Lcr/c;->o:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, v2, Lcr/c;->n:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    invoke-virtual {v2, v3}, Lcr/c;->i(Z)V

    move v1, v0

    goto :goto_0

    :cond_3
    move v1, v3

    :goto_0
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v2, :cond_5

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    move v0, v3

    :goto_1
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->G()V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_6
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->Z0:Z

    return-void
.end method

.method public g(Lcom/google/android/material/textfield/g0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/material/textfield/n;

    invoke-virtual {p1, p0}, Lcom/google/android/material/textfield/n;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_0
    return-void
.end method

.method public getBaseline()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :cond_0
    invoke-super {p0}, Landroid/widget/LinearLayout;->getBaseline()I

    move-result v0

    return v0
.end method

.method public getBoxBackground()Lkr/g;
    .locals 2

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    return-object v0
.end method

.method public getBoxBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    return v0
.end method

.method public getBoxBackgroundMode()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    return v0
.end method

.method public getBoxCollapsedPaddingTop()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    return v0
.end method

.method public getBoxCornerRadiusBottomEnd()F
    .locals 2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->h:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->g:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public getBoxCornerRadiusBottomStart()F
    .locals 2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->g:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->h:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public getBoxCornerRadiusTopEnd()F
    .locals 2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->e:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->f:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public getBoxCornerRadiusTopStart()F
    .locals 2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->f:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v0, v0, Lkr/k;->e:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v0, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public getBoxStrokeColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    return v0
.end method

.method public getBoxStrokeErrorColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getBoxStrokeWidth()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    return v0
.end method

.method public getBoxStrokeWidthFocused()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    return v0
.end method

.method public getCounterMaxLength()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    return v0
.end method

.method public getCounterOverflowDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCounterOverflowTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCounterTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCursorColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCursorErrorColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getDefaultHintTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    return-object v0
.end method

.method public getEndIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getEndIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getEndIconMinSize()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget v0, v0, Lcom/google/android/material/textfield/q;->M:I

    return v0
.end method

.method public getEndIconMode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget v0, v0, Lcom/google/android/material/textfield/q;->I:I

    return v0
.end method

.method public getEndIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->N:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    return-object v0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-boolean v1, v0, Lcom/google/android/material/textfield/u;->q:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->p:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getErrorAccessibilityLiveRegion()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget v0, v0, Lcom/google/android/material/textfield/u;->t:I

    return v0
.end method

.method public getErrorContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->s:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getErrorCurrentTextColors()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getErrorIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getHelperText()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-boolean v1, v0, Lcom/google/android/material/textfield/u;->x:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->w:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHelperTextCurrentTextColor()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getHintCollapsedTextHeight()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0}, Lcr/c;->e()F

    move-result v0

    return v0
.end method

.method public final getHintCurrentCollapsedTextColor()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v1, v0, Lcr/c;->o:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Lcr/c;->f(Landroid/content/res/ColorStateList;)I

    move-result v0

    return v0
.end method

.method public getHintTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getLengthCounter()Lcom/google/android/material/textfield/f0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lcom/google/android/material/textfield/f0;

    return-object v0
.end method

.method public getMaxEms()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    return v0
.end method

.method public getMinEms()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    return v0
.end method

.method public getPasswordVisibilityToggleContentDescription()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getPasswordVisibilityToggleDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getPlaceholderText()Ljava/lang/CharSequence;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPlaceholderTextAppearance()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:I

    return v0
.end method

.method public getPlaceholderTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getPrefixText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->y:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getPrefixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->x:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getPrefixTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->x:Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method public getShapeAppearanceModel()Lkr/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    return-object v0
.end method

.method public getStartIconContentDescription()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getStartIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getStartIconMinSize()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget v0, v0, Lcom/google/android/material/textfield/z;->G:I

    return v0
.end method

.method public getStartIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->H:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public getSuffixText()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->P:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getSuffixTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSuffixTextView()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    return-object v0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public h(F)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget v0, v0, Lcr/c;->b:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_1

    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f04049a

    sget-object v3, Lkq/a;->b:Lh8/a;

    invoke-static {v1, v2, v3}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f040490

    const/16 v3, 0xa7

    invoke-static {v1, v2, v3}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/google/android/material/textfield/d0;

    invoke-direct {v1, p0}, Lcom/google/android/material/textfield/d0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget v1, v1, Lcr/c;->b:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x1

    aput p1, v2, v1

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Y0:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lkr/g;->w:Lkr/f;

    iget-object v1, v1, Lkr/f;->a:Lkr/k;

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    if-eq v1, v2, :cond_1

    invoke-virtual {v0, v2}, Lkr/g;->setShapeAppearanceModel(Lkr/k;)V

    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v1, 0x2

    const/4 v2, -0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    if-le v0, v2, :cond_2

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    if-eqz v1, :cond_2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Lkr/g;->s(F)V

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v3, v0}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    :cond_2
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f040168

    invoke-static {v1, v3, v0}, Lrj/o;->t(Landroid/content/Context;II)I

    move-result v0

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    invoke-static {v1, v0}, Lv4/a;->e(II)I

    move-result v0

    :cond_3
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    if-eqz v0, :cond_7

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    if-le v1, v2, :cond_6

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_5

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    goto :goto_0

    :cond_5
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:I

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->H()V

    return-void
.end method

.method public final j()I
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-eqz v0, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0}, Lcr/c;->e()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    :goto_0
    float-to-int v0, v0

    return v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0}, Lcr/c;->e()F

    move-result v0

    goto :goto_0
.end method

.method public final k()Lbc/h;
    .locals 4

    new-instance v0, Lbc/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc/h;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f040492

    const/16 v3, 0x57

    invoke-static {v1, v2, v3}, Lvp/c;->k0(Landroid/content/Context;II)I

    move-result v1

    int-to-long v1, v1

    iput-wide v1, v0, Lbc/w;->y:J

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f04049c

    sget-object v3, Lkq/a;->a:Landroid/view/animation/LinearInterpolator;

    invoke-static {v1, v2, v3}, Lvp/c;->l0(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object v1

    iput-object v1, v0, Lbc/w;->z:Landroid/animation/TimeInterpolator;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    instance-of v0, v0, Lcom/google/android/material/textfield/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m(Z)Lkr/g;
    .locals 16

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07038d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    int-to-float v1, v1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    instance-of v4, v3, Lcom/google/android/material/textfield/x;

    if-eqz v4, :cond_1

    check-cast v3, Lcom/google/android/material/textfield/x;

    invoke-virtual {v3}, Lcom/google/android/material/textfield/x;->getPopupElevation()F

    move-result v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0701ac

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    int-to-float v3, v3

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07034e

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/i;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lkr/i;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    invoke-direct {v11, v10}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    invoke-direct {v12, v10}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/e;

    invoke-direct {v13, v10}, Lkr/e;-><init>(I)V

    new-instance v14, Lkr/a;

    invoke-direct {v14, v2}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/a;

    invoke-direct {v15, v2}, Lkr/a;-><init>(F)V

    new-instance v2, Lkr/a;

    invoke-direct {v2, v1}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v1}, Lkr/a;-><init>(F)V

    new-instance v1, Lkr/k;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v5, v1, Lkr/k;->a:Lse/a;

    iput-object v6, v1, Lkr/k;->b:Lse/a;

    iput-object v7, v1, Lkr/k;->c:Lse/a;

    iput-object v8, v1, Lkr/k;->d:Lse/a;

    iput-object v14, v1, Lkr/k;->e:Lkr/c;

    iput-object v15, v1, Lkr/k;->f:Lkr/c;

    iput-object v10, v1, Lkr/k;->g:Lkr/c;

    iput-object v2, v1, Lkr/k;->h:Lkr/c;

    iput-object v9, v1, Lkr/k;->i:Lkr/e;

    iput-object v11, v1, Lkr/k;->j:Lkr/e;

    iput-object v12, v1, Lkr/k;->k:Lkr/e;

    iput-object v13, v1, Lkr/k;->l:Lkr/e;

    iget-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    instance-of v5, v2, Lcom/google/android/material/textfield/x;

    if-eqz v5, :cond_2

    check-cast v2, Lcom/google/android/material/textfield/x;

    invoke-virtual {v2}, Lcom/google/android/material/textfield/x;->getDropDownBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    if-nez v2, :cond_4

    sget-object v2, Lkr/g;->X:Landroid/graphics/Paint;

    const-class v2, Lkr/g;

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const v6, 0x7f040168

    invoke-static {v5, v6, v2}, Lio/sentry/config/a;->X(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object v2

    iget v6, v2, Landroid/util/TypedValue;->resourceId:I

    if-eqz v6, :cond_3

    invoke-static {v5, v6}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    goto :goto_3

    :cond_3
    iget v2, v2, Landroid/util/TypedValue;->data:I

    :goto_3
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :cond_4
    new-instance v6, Lkr/g;

    invoke-direct {v6}, Lkr/g;-><init>()V

    invoke-virtual {v6, v5}, Lkr/g;->k(Landroid/content/Context;)V

    invoke-virtual {v6, v2}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v6, v3}, Lkr/g;->l(F)V

    invoke-virtual {v6, v1}, Lkr/g;->setShapeAppearanceModel(Lkr/k;)V

    iget-object v1, v6, Lkr/g;->w:Lkr/f;

    iget-object v2, v1, Lkr/f;->h:Landroid/graphics/Rect;

    if-nez v2, :cond_5

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v1, Lkr/f;->h:Landroid/graphics/Rect;

    :cond_5
    iget-object v1, v6, Lkr/g;->w:Lkr/f;

    iget-object v1, v1, Lkr/f;->h:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4, v2, v4}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {v6}, Lkr/g;->invalidateSelf()V

    return-object v6
.end method

.method public final n(IZ)I
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {p2}, Lcom/google/android/material/textfield/z;->a()I

    move-result p2

    :goto_0
    add-int/2addr p2, p1

    return p2

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getSuffixText()Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {p2}, Lcom/google/android/material/textfield/q;->c()I

    move-result p2

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result p2

    goto :goto_0
.end method

.method public final o(IZ)I
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getSuffixText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {p2}, Lcom/google/android/material/textfield/q;->c()I

    move-result p2

    :goto_0
    sub-int/2addr p1, p2

    return p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {p2}, Lcom/google/android/material/textfield/z;->a()I

    move-result p2

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result p2

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0, p1}, Lcr/c;->h(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onGlobalLayout()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b1:Z

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    if-ge v2, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    const/4 v0, 0x1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->F()Z

    move-result v1

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    new-instance v1, Lcom/google/android/material/textfield/a0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/material/textfield/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p2, :cond_c

    iget-object p3, p1, Lcom/google/android/material/textfield/TextInputLayout;->y0:Landroid/graphics/Rect;

    invoke-static {p0, p2, p3}, Lcr/d;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    if-eqz p2, :cond_0

    iget p4, p3, Landroid/graphics/Rect;->bottom:I

    iget p5, p1, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    sub-int p5, p4, p5

    iget v0, p3, Landroid/graphics/Rect;->left:I

    iget v1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2, v0, p5, v1, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    if-eqz p2, :cond_1

    iget p4, p3, Landroid/graphics/Rect;->bottom:I

    iget p5, p1, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    sub-int p5, p4, p5

    iget v0, p3, Landroid/graphics/Rect;->left:I

    iget v1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p2, v0, p5, v1, p4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_1
    iget-boolean p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz p2, :cond_c

    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p4}, Landroid/widget/TextView;->getTextSize()F

    move-result p4

    iget p5, p2, Lcr/c;->l:F

    cmpl-float p5, p5, p4

    const/4 v0, 0x0

    if-eqz p5, :cond_2

    iput p4, p2, Lcr/c;->l:F

    invoke-virtual {p2, v0}, Lcr/c;->i(Z)V

    :cond_2
    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/TextView;->getGravity()I

    move-result p2

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    and-int/lit8 p5, p2, -0x71

    or-int/lit8 p5, p5, 0x30

    invoke-virtual {p4, p5}, Lcr/c;->l(I)V

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget p5, p4, Lcr/c;->j:I

    if-eq p5, p2, :cond_3

    iput p2, p4, Lcr/c;->j:I

    invoke-virtual {p4, v0}, Lcr/c;->i(Z)V

    :cond_3
    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p4, :cond_b

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->z0:Landroid/graphics/Rect;

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result p5

    iget v1, p3, Landroid/graphics/Rect;->bottom:I

    iput v1, p4, Landroid/graphics/Rect;->bottom:I

    iget v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    iget v1, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0, v1, p5}, Lcom/google/android/material/textfield/TextInputLayout;->n(IZ)I

    move-result v1

    iput v1, p4, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iput v1, p4, Landroid/graphics/Rect;->top:I

    iget v1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, v1, p5}, Lcom/google/android/material/textfield/TextInputLayout;->o(IZ)I

    move-result p5

    iput p5, p4, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_4
    iget p5, p3, Landroid/graphics/Rect;->left:I

    iget-object v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, p5

    iput v1, p4, Landroid/graphics/Rect;->left:I

    iget p5, p3, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()I

    move-result v1

    sub-int/2addr p5, v1

    iput p5, p4, Landroid/graphics/Rect;->top:I

    iget p5, p3, Landroid/graphics/Rect;->right:I

    iget-object v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr p5, v1

    iput p5, p4, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_5
    iget v1, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0, v1, p5}, Lcom/google/android/material/textfield/TextInputLayout;->n(IZ)I

    move-result v1

    iput v1, p4, Landroid/graphics/Rect;->left:I

    iget v1, p3, Landroid/graphics/Rect;->top:I

    iget v3, p1, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    add-int/2addr v1, v3

    iput v1, p4, Landroid/graphics/Rect;->top:I

    iget v1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, v1, p5}, Lcom/google/android/material/textfield/TextInputLayout;->o(IZ)I

    move-result p5

    iput p5, p4, Landroid/graphics/Rect;->right:I

    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p5, p4, Landroid/graphics/Rect;->left:I

    iget v1, p4, Landroid/graphics/Rect;->top:I

    iget v3, p4, Landroid/graphics/Rect;->right:I

    iget p4, p4, Landroid/graphics/Rect;->bottom:I

    iget-object v4, p2, Lcr/c;->h:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    if-ne v5, p5, :cond_6

    iget v5, v4, Landroid/graphics/Rect;->top:I

    if-ne v5, v1, :cond_6

    iget v5, v4, Landroid/graphics/Rect;->right:I

    if-ne v5, v3, :cond_6

    iget v5, v4, Landroid/graphics/Rect;->bottom:I

    if-ne v5, p4, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v4, p5, v1, v3, p4}, Landroid/graphics/Rect;->set(IIII)V

    iput-boolean v2, p2, Lcr/c;->S:Z

    :goto_1
    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p4, :cond_a

    iget-object p4, p1, Lcom/google/android/material/textfield/TextInputLayout;->z0:Landroid/graphics/Rect;

    iget-object p5, p2, Lcr/c;->U:Landroid/text/TextPaint;

    iget v1, p2, Lcr/c;->l:F

    invoke-virtual {p5, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p2, Lcr/c;->z:Landroid/graphics/Typeface;

    invoke-virtual {p5, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v1, p2, Lcr/c;->g0:F

    invoke-virtual {p5, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    invoke-virtual {p5}, Landroid/graphics/Paint;->ascent()F

    move-result p5

    neg-float p5, p5

    iget v1, p3, Landroid/graphics/Rect;->left:I

    iget-object v3, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result v3

    add-int/2addr v3, v1

    iput v3, p4, Landroid/graphics/Rect;->left:I

    iget v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-ne v1, v2, :cond_7

    iget-object v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMinLines()I

    move-result v1

    if-gt v1, v2, :cond_7

    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, p5, v3

    sub-float/2addr v1, v3

    float-to-int v1, v1

    goto :goto_2

    :cond_7
    iget v1, p3, Landroid/graphics/Rect;->top:I

    iget-object v3, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v3

    add-int/2addr v1, v3

    :goto_2
    iput v1, p4, Landroid/graphics/Rect;->top:I

    iget v1, p3, Landroid/graphics/Rect;->right:I

    iget-object v3, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result v3

    sub-int/2addr v1, v3

    iput v1, p4, Landroid/graphics/Rect;->right:I

    iget v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-ne v1, v2, :cond_8

    iget-object v1, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMinLines()I

    move-result v1

    if-gt v1, v2, :cond_8

    iget p3, p4, Landroid/graphics/Rect;->top:I

    int-to-float p3, p3

    add-float/2addr p3, p5

    float-to-int p3, p3

    goto :goto_3

    :cond_8
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    iget-object p5, p1, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p5}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result p5

    sub-int/2addr p3, p5

    :goto_3
    iput p3, p4, Landroid/graphics/Rect;->bottom:I

    iget p5, p4, Landroid/graphics/Rect;->left:I

    iget v1, p4, Landroid/graphics/Rect;->top:I

    iget p4, p4, Landroid/graphics/Rect;->right:I

    iget-object v3, p2, Lcr/c;->g:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    if-ne v4, p5, :cond_9

    iget v4, v3, Landroid/graphics/Rect;->top:I

    if-ne v4, v1, :cond_9

    iget v4, v3, Landroid/graphics/Rect;->right:I

    if-ne v4, p4, :cond_9

    iget v4, v3, Landroid/graphics/Rect;->bottom:I

    if-ne v4, p3, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v3, p5, v1, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    iput-boolean v2, p2, Lcr/c;->S:Z

    :goto_4
    iget-object p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {p2, v0}, Lcr/c;->i(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result p2

    if-eqz p2, :cond_c

    iget-boolean p2, p1, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    if-nez p2, :cond_c

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->w()V

    return-void

    :cond_a
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2}, Ljava/lang/IllegalStateException;-><init>()V

    throw p2

    :cond_b
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2}, Ljava/lang/IllegalStateException;-><init>()V

    throw p2

    :cond_c
    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b1:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b1:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/TextView;->getGravity()I

    move-result p1

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    move-result p2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v2

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/q;->m()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lcom/google/android/material/textfield/h0;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/material/textfield/h0;

    invoke-virtual {p1}, Lv5/b;->b()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p1, Lcom/google/android/material/textfield/h0;->y:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-boolean p1, p1, Lcom/google/android/material/textfield/h0;->z:Z

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/material/textfield/c0;

    invoke-direct {p1, p0}, Lcom/google/android/material/textfield/c0;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 13

    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRtlPropertiesChanged(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Z

    if-eq v0, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object p1, p1, Lkr/k;->e:Lkr/c;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {p1, v1}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result p1

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v1, v1, Lkr/k;->f:Lkr/c;

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v1, v2}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v2, v2, Lkr/k;->h:Lkr/c;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v2, v3}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v3, v3, Lkr/k;->g:Lkr/c;

    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    invoke-interface {v3, v4}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result v3

    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v5, v4, Lkr/k;->a:Lse/a;

    iget-object v6, v4, Lkr/k;->b:Lse/a;

    iget-object v7, v4, Lkr/k;->d:Lse/a;

    iget-object v4, v4, Lkr/k;->c:Lse/a;

    new-instance v8, Lkr/e;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lkr/e;-><init>(I)V

    new-instance v9, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/a;

    invoke-direct {v12, v1}, Lkr/a;-><init>(F)V

    new-instance v1, Lkr/a;

    invoke-direct {v1, p1}, Lkr/a;-><init>(F)V

    new-instance p1, Lkr/a;

    invoke-direct {p1, v3}, Lkr/a;-><init>(F)V

    new-instance v3, Lkr/a;

    invoke-direct {v3, v2}, Lkr/a;-><init>(F)V

    new-instance v2, Lkr/k;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v6, v2, Lkr/k;->a:Lse/a;

    iput-object v5, v2, Lkr/k;->b:Lse/a;

    iput-object v7, v2, Lkr/k;->c:Lse/a;

    iput-object v4, v2, Lkr/k;->d:Lse/a;

    iput-object v12, v2, Lkr/k;->e:Lkr/c;

    iput-object v1, v2, Lkr/k;->f:Lkr/c;

    iput-object v3, v2, Lkr/k;->g:Lkr/c;

    iput-object p1, v2, Lkr/k;->h:Lkr/c;

    iput-object v8, v2, Lkr/k;->i:Lkr/e;

    iput-object v9, v2, Lkr/k;->j:Lkr/e;

    iput-object v10, v2, Lkr/k;->k:Lkr/e;

    iput-object v11, v2, Lkr/k;->l:Lkr/e;

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Z

    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setShapeAppearanceModel(Lkr/k;)V

    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lcom/google/android/material/textfield/h0;

    invoke-direct {v1, v0}, Lv5/b;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, v1, Lcom/google/android/material/textfield/h0;->y:Ljava/lang/CharSequence;

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget v2, v0, Lcom/google/android/material/textfield/q;->I:I

    if-eqz v2, :cond_1

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-boolean v0, v0, Lcom/google/android/material/internal/CheckableImageButton;->z:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v1, Lcom/google/android/material/textfield/h0;->z:Z

    return-object v1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/q;->d()Z

    move-result v0

    return v0
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-boolean v0, v0, Lcom/google/android/material/textfield/u;->q:Z

    return v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-boolean v0, v0, Lcom/google/android/material/textfield/u;->x:Z

    return v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    return v0
.end method

.method public setBoxBackgroundColor(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    :cond_0
    return-void
.end method

.method public setBoxBackgroundColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    return-void
.end method

.method public setBoxBackgroundColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O0:I

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    const v0, -0x101009e

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P0:I

    const v0, 0x101009c

    const v2, 0x101009e

    filled-new-array {v0, v2}, [I

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q0:I

    const v0, 0x1010367

    filled-new-array {v0, v2}, [I

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R0:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    return-void
.end method

.method public setBoxBackgroundMode(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->v()V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBoxCollapsedPaddingTop(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    return-void
.end method

.method public setBoxCornerFamily(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {v0}, Lkr/k;->e()Lkr/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v1, v1, Lkr/k;->e:Lkr/c;

    invoke-static {p1}, Lse/b;->z(I)Lse/a;

    move-result-object v2

    iput-object v2, v0, Lkr/j;->a:Ljava/lang/Object;

    iput-object v1, v0, Lkr/j;->e:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v1, v1, Lkr/k;->f:Lkr/c;

    invoke-static {p1}, Lse/b;->z(I)Lse/a;

    move-result-object v2

    iput-object v2, v0, Lkr/j;->b:Ljava/lang/Object;

    iput-object v1, v0, Lkr/j;->f:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v1, v1, Lkr/k;->h:Lkr/c;

    invoke-static {p1}, Lse/b;->z(I)Lse/a;

    move-result-object v2

    iput-object v2, v0, Lkr/j;->d:Ljava/lang/Object;

    iput-object v1, v0, Lkr/j;->h:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    iget-object v1, v1, Lkr/k;->g:Lkr/c;

    invoke-static {p1}, Lse/b;->z(I)Lse/a;

    move-result-object p1

    iput-object p1, v0, Lkr/j;->c:Ljava/lang/Object;

    iput-object v1, v0, Lkr/j;->g:Ljava/lang/Object;

    invoke-virtual {v0}, Lkr/j;->a()Lkr/k;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    return-void
.end method

.method public setBoxStrokeColor(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    :cond_0
    return-void
.end method

.method public setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:I

    const v0, -0x101009e

    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S0:I

    const v0, 0x1010367

    const v2, 0x101009e

    filled-new-array {v0, v2}, [I

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:I

    const v0, 0x101009c

    filled-new-array {v0, v2}, [I

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:I

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    return-void
.end method

.method public setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->N0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    :cond_0
    return-void
.end method

.method public setBoxStrokeWidth(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    return-void
.end method

.method public setBoxStrokeWidthFocused(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    return-void
.end method

.method public setBoxStrokeWidthFocusedResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidthFocused(I)V

    return-void
.end method

.method public setBoxStrokeWidthResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidth(I)V

    return-void
.end method

.method public setCounterEnabled(Z)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Z

    if-eq v0, p1, :cond_4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    new-instance v2, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    const v3, 0x7f0a0c6f

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:Landroid/graphics/Typeface;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v0}, Lcom/google/android/material/textfield/u;->a(Landroid/widget/TextView;I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0703aa

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    :goto_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->C(Landroid/text/Editable;)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v0}, Lcom/google/android/material/textfield/u;->g(Landroid/widget/TextView;I)V

    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    :cond_3
    :goto_1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Z

    :cond_4
    return-void
.end method

.method public setCounterMaxLength(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    if-eq v0, p1, :cond_2

    if-lez p1, :cond_0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:I

    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->C(Landroid/text/Editable;)V

    :cond_2
    return-void
.end method

.method public setCounterOverflowTextAppearance(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    :cond_0
    return-void
.end method

.method public setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    :cond_0
    return-void
.end method

.method public setCounterTextAppearance(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:I

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    :cond_0
    return-void
.end method

.method public setCounterTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->D()V

    :cond_0
    return-void
.end method

.method public setCursorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->E()V

    :cond_0
    return-void
.end method

.method public setCursorErrorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_2

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->B()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->E()V

    :cond_2
    return-void
.end method

.method public setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->x(Landroid/view/ViewGroup;Z)V

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setEndIconActivated(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setActivated(Z)V

    return-void
.end method

.method public setEndIconCheckable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    return-void
.end method

.method public setEndIconContentDescription(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_1

    .line 6
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public setEndIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    .line 8
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setEndIconDrawable(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 5
    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    iget-object v3, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v3}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 7
    iget-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, p1}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 8
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    .line 9
    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v2, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    .line 11
    iget-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    iget-object v3, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v3}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 12
    iget-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, p1}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setEndIconMinSize(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-ltz p1, :cond_1

    iget v1, v0, Lcom/google/android/material/textfield/q;->M:I

    if-eq p1, v1, :cond_0

    iput p1, v0, Lcom/google/android/material/textfield/q;->M:I

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumHeight(I)V

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "endIconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEndIconMode(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/q;->g(I)V

    return-void
.end method

.method public setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->O:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v0}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setEndIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->O:Landroid/view/View$OnLongClickListener;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-static {v0, p1}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setEndIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->N:Landroid/widget/ImageView$ScaleType;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setEndIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v0}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setEndIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, v0, p1}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setEndIconVisible(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/q;->h(Z)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-boolean v0, v0, Lcom/google/android/material/textfield/u;->q:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->c()V

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->p:Ljava/lang/CharSequence;

    iget-object v2, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v2, v0, Lcom/google/android/material/textfield/u;->n:I

    if-eq v2, v1, :cond_2

    iput v1, v0, Lcom/google/android/material/textfield/u;->o:I

    :cond_2
    iget v1, v0, Lcom/google/android/material/textfield/u;->o:I

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v3, p1}, Lcom/google/android/material/textfield/u;->h(Landroidx/appcompat/widget/AppCompatTextView;Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-virtual {v0, v2, v1, p1}, Lcom/google/android/material/textfield/u;->i(IIZ)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/u;->f()V

    return-void
.end method

.method public setErrorAccessibilityLiveRegion(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput p1, v0, Lcom/google/android/material/textfield/u;->t:I

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    :cond_0
    return-void
.end method

.method public setErrorContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->s:Ljava/lang/CharSequence;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setErrorEnabled(Z)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->h:Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v2, v0, Lcom/google/android/material/textfield/u;->q:Z

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->c()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v4, v0, Lcom/google/android/material/textfield/u;->g:Landroid/content/Context;

    invoke-direct {v1, v4, v3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    const v3, 0x7f0a0c70

    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v3, 0x5

    invoke-virtual {v1, v3}, Landroid/view/View;->setTextAlignment(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->B:Landroid/graphics/Typeface;

    if-eqz v1, :cond_1

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    iget v1, v0, Lcom/google/android/material/textfield/u;->u:I

    iput v1, v0, Lcom/google/android/material/textfield/u;->u:I

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lcom/google/android/material/textfield/u;->h:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v4, v3, v1}, Lcom/google/android/material/textfield/TextInputLayout;->A(Landroid/widget/TextView;I)V

    :cond_2
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->v:Landroid/content/res/ColorStateList;

    iput-object v1, v0, Lcom/google/android/material/textfield/u;->v:Landroid/content/res/ColorStateList;

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v3, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->s:Ljava/lang/CharSequence;

    iput-object v1, v0, Lcom/google/android/material/textfield/u;->s:Ljava/lang/CharSequence;

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    iget v1, v0, Lcom/google/android/material/textfield/u;->t:I

    iput v1, v0, Lcom/google/android/material/textfield/u;->t:I

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v3, :cond_5

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    :cond_5
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/textfield/u;->a(Landroid/widget/TextView;I)V

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->f()V

    iget-object v4, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v4, v2}, Lcom/google/android/material/textfield/u;->g(Landroid/widget/TextView;I)V

    iput-object v3, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->G()V

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    :goto_0
    iput-boolean p1, v0, Lcom/google/android/material/textfield/u;->q:Z

    return-void
.end method

.method public setErrorIconDrawable(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/q;->i(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget-object p1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->z:Landroid/content/res/ColorStateList;

    invoke-static {p1, v1, v0}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/q;->i(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setErrorIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->F:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v0}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setErrorIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->F:Landroid/view/View$OnLongClickListener;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-static {v0, p1}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setErrorIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->z:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->z:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->E:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v0}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setErrorIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->E:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->E:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->y:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->z:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, v0, p1}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setErrorTextAppearance(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput p1, v0, Lcom/google/android/material/textfield/u;->u:I

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->h:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->A(Landroid/widget/TextView;I)V

    :cond_0
    return-void
.end method

.method public setErrorTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->v:Landroid/content/res/ColorStateList;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setExpandedHintEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W0:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->W0:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    :cond_0
    return-void
.end method

.method public setHelperText(Ljava/lang/CharSequence;)V
    .locals 4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->c()V

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->w:Ljava/lang/CharSequence;

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v1, v0, Lcom/google/android/material/textfield/u;->n:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    iput v2, v0, Lcom/google/android/material/textfield/u;->o:I

    :cond_3
    iget v2, v0, Lcom/google/android/material/textfield/u;->o:I

    iget-object v3, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v3, p1}, Lcom/google/android/material/textfield/u;->h(Landroidx/appcompat/widget/AppCompatTextView;Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/google/android/material/textfield/u;->i(IIZ)V

    return-void
.end method

.method public setHelperTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->A:Landroid/content/res/ColorStateList;

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setHelperTextEnabled(Z)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->h:Lcom/google/android/material/textfield/TextInputLayout;

    iget-boolean v2, v0, Lcom/google/android/material/textfield/u;->x:Z

    if-ne v2, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->c()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p1, :cond_4

    new-instance v1, Landroidx/appcompat/widget/AppCompatTextView;

    iget-object v4, v0, Lcom/google/android/material/textfield/u;->g:Landroid/content/Context;

    invoke-direct {v1, v4, v2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    const v2, 0x7f0a0c71

    invoke-virtual {v1, v2}, Landroid/view/View;->setId(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Landroid/view/View;->setTextAlignment(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->B:Landroid/graphics/Typeface;

    if-eqz v1, :cond_1

    iget-object v2, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    iget v1, v0, Lcom/google/android/material/textfield/u;->z:I

    iput v1, v0, Lcom/google/android/material/textfield/u;->z:I

    iget-object v2, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextAppearance(I)V

    :cond_2
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->A:Landroid/content/res/ColorStateList;

    iput-object v1, v0, Lcom/google/android/material/textfield/u;->A:Landroid/content/res/ColorStateList;

    iget-object v2, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v2, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_3
    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/material/textfield/u;->a(Landroid/widget/TextView;I)V

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v2, Lcom/google/android/material/textfield/t;

    invoke-direct {v2, v0}, Lcom/google/android/material/textfield/t;-><init>(Lcom/google/android/material/textfield/u;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/material/textfield/u;->c()V

    iget v4, v0, Lcom/google/android/material/textfield/u;->n:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_5

    const/4 v5, 0x0

    iput v5, v0, Lcom/google/android/material/textfield/u;->o:I

    :cond_5
    iget v5, v0, Lcom/google/android/material/textfield/u;->o:I

    iget-object v6, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    const-string v7, ""

    invoke-virtual {v0, v6, v7}, Lcom/google/android/material/textfield/u;->h(Landroidx/appcompat/widget/AppCompatTextView;Ljava/lang/CharSequence;)Z

    move-result v6

    invoke-virtual {v0, v4, v5, v6}, Lcom/google/android/material/textfield/u;->i(IIZ)V

    iget-object v4, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, v4, v3}, Lcom/google/android/material/textfield/u;->g(Landroid/widget/TextView;I)V

    iput-object v2, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->G()V

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    :goto_0
    iput-boolean p1, v0, Lcom/google/android/material/textfield/u;->x:Z

    return-void
.end method

.method public setHelperTextTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iput p1, v0, Lcom/google/android/material/textfield/u;->z:I

    iget-object v0, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    :cond_0
    return-void
.end method

.method public setHint(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    const/16 p1, 0x800

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
    return-void
.end method

.method public setHintAnimationEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->X0:Z

    return-void
.end method

.method public setHintEnabled(Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eq p1, v0, :cond_4

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    :cond_3
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->I()V

    :cond_4
    return-void
.end method

.method public setHintTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0, p1}, Lcr/c;->k(I)V

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object p1, p1, Lcr/c;->o:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->I()V

    :cond_0
    return-void
.end method

.method public setHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Landroid/content/res/ColorStateList;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v2, v0, Lcr/c;->o:Landroid/content/res/ColorStateList;

    if-eq v2, p1, :cond_0

    iput-object p1, v0, Lcr/c;->o:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Lcr/c;->i(Z)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Landroid/content/res/ColorStateList;

    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz p1, :cond_1

    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->J(Z)V

    :cond_1
    return-void
.end method

.method public setLengthCounter(Lcom/google/android/material/textfield/f0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Lcom/google/android/material/textfield/f0;

    return-void
.end method

.method public setMaxEms(I)V
    .locals 2

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxEms(I)V

    :cond_0
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 2

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V

    :cond_0
    return-void
.end method

.method public setMaxWidthResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    return-void
.end method

.method public setMinEms(I)V
    .locals 2

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinEms(I)V

    :cond_0
    return-void
.end method

.method public setMinWidth(I)V
    .locals 2

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinWidth(I)V

    :cond_0
    return-void
.end method

.method public setMinWidthResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 3
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(Ljava/lang/CharSequence;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    .line 6
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    .line 6
    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleEnabled(Z)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    if-eqz p1, :cond_0

    iget v1, v0, Lcom/google/android/material/textfield/q;->I:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/q;->g(I)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/q;->g(I)V

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setPasswordVisibilityToggleTintList(Landroid/content/res/ColorStateList;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v0}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setPasswordVisibilityToggleTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iput-object p1, v0, Lcom/google/android/material/textfield/q;->L:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->K:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, v0, p1}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setPlaceholderText(Ljava/lang/CharSequence;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    const v2, 0x7f0a0c72

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->k()Lbc/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Lbc/h;

    const-wide/16 v2, 0x43

    iput-wide v2, v0, Lbc/w;->x:J

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->k()Lbc/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Lbc/h;

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:I

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    :cond_2
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Ljava/lang/CharSequence;

    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    :goto_1
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->L(Landroid/text/Editable;)V

    return-void
.end method

.method public setPlaceholderTextAppearance(I)V
    .locals 1

    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:I

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    :cond_0
    return-void
.end method

.method public setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setPrefixText(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    iput-object v1, v0, Lcom/google/android/material/textfield/z;->y:Ljava/lang/CharSequence;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->x:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/google/android/material/textfield/z;->e()V

    return-void
.end method

.method public setPrefixTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->x:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    return-void
.end method

.method public setPrefixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->x:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setShapeAppearanceModel(Lkr/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->a:Lkr/k;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    :cond_0
    return-void
.end method

.method public setStartIconCheckable(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    return-void
.end method

.method public setStartIconContentDescription(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setStartIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    .line 3
    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    invoke-virtual {v0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-eq v1, p1, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setStartIconDrawable(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/z;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStartIconMinSize(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    if-ltz p1, :cond_1

    iget v1, v0, Lcom/google/android/material/textfield/z;->G:I

    if-eq p1, v1, :cond_0

    iput p1, v0, Lcom/google/android/material/textfield/z;->G:I

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "startIconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->I:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v0}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iput-object p1, v0, Lcom/google/android/material/textfield/z;->I:Landroid/view/View$OnLongClickListener;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-static {v0, p1}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setStartIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iput-object p1, v0, Lcom/google/android/material/textfield/z;->H:Landroid/widget/ImageView$ScaleType;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    return-void
.end method

.method public setStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->E:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/z;->E:Landroid/content/res/ColorStateList;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->F:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2, p1, v0}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setStartIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->F:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, Lcom/google/android/material/textfield/z;->F:Landroid/graphics/PorterDuff$Mode;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->E:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, v0, p1}, Ls2/e;->m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setStartIconVisible(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/z;->c(Z)V

    return-void
.end method

.method public setSuffixText(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    iput-object v1, v0, Lcom/google/android/material/textfield/q;->P:Ljava/lang/CharSequence;

    iget-object v1, v0, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/google/android/material/textfield/q;->n()V

    return-void
.end method

.method public setSuffixTextAppearance(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    return-void
.end method

.method public setSuffixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:Lcom/google/android/material/textfield/q;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->Q:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTextInputAccessibilityDelegate(Lcom/google/android/material/textfield/e0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:Landroid/graphics/Typeface;

    if-eq p1, v0, :cond_4

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    invoke-virtual {v0, p1}, Lcr/c;->m(Landroid/graphics/Typeface;)Z

    move-result v1

    invoke-virtual {v0, p1}, Lcr/c;->o(Landroid/graphics/Typeface;)Z

    move-result v2

    if-nez v1, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcr/c;->i(Z)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Lcom/google/android/material/textfield/u;

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->B:Landroid/graphics/Typeface;

    if-eq p1, v1, :cond_3

    iput-object p1, v0, Lcom/google/android/material/textfield/u;->B:Landroid/graphics/Typeface;

    iget-object v1, v0, Lcom/google/android/material/textfield/u;->r:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_2
    iget-object v0, v0, Lcom/google/android/material/textfield/u;->y:Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/widget/TextView;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_4
    return-void
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U0:Z

    return v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Z

    return v0
.end method

.method public final v()V
    .locals 8

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    instance-of v0, v0, Lcom/google/android/material/textfield/h;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    sget v4, Lcom/google/android/material/textfield/h;->Z:I

    new-instance v4, Lcom/google/android/material/textfield/g;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkr/k;

    invoke-direct {v0}, Lkr/k;-><init>()V

    :goto_0
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    invoke-direct {v4, v0, v5}, Lcom/google/android/material/textfield/g;-><init>(Lkr/k;Landroid/graphics/RectF;)V

    new-instance v0, Lcom/google/android/material/textfield/h;

    invoke-direct {v0, v4}, Lkr/g;-><init>(Lkr/f;)V

    iput-object v4, v0, Lcom/google/android/material/textfield/h;->Y:Lcom/google/android/material/textfield/g;

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    goto :goto_1

    :cond_1
    new-instance v0, Lkr/g;

    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-direct {v0, v4}, Lkr/g;-><init>(Lkr/k;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    :goto_1
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const-string v3, " is illegal; only @BoxBackgroundMode constants are supported."

    invoke-static {v1, v2, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lkr/g;

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-direct {v0, v3}, Lkr/g;-><init>(Lkr/k;)V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    new-instance v0, Lkr/g;

    invoke-direct {v0}, Lkr/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    new-instance v0, Lkr/g;

    invoke-direct {v0}, Lkr/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    goto :goto_2

    :cond_4
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Lkr/g;

    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Lkr/g;

    :goto_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->H()V

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->N()V

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v0, v2, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0702ac

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/j;->M(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f0702ab

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:I

    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    if-eqz v0, :cond_9

    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-eq v0, v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v0, v0, v3

    if-ltz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702aa

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingEnd()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0702a9

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/j;->M(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0702a8

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v5}, Landroid/view/View;->getPaddingEnd()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0702a7

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    :cond_9
    :goto_4
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->I()V

    :cond_a
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    instance-of v3, v0, Landroid/widget/AutoCompleteTextView;

    if-nez v3, :cond_b

    goto :goto_5

    :cond_b
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-nez v3, :cond_d

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:I

    if-ne v3, v1, :cond_c

    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_c
    if-ne v3, v2, :cond_d

    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_d
    :goto_5
    return-void
.end method

.method public final w()V
    .locals 12

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->l()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_a

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/graphics/RectF;

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V0:Lcr/c;

    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/TextView;->getGravity()I

    move-result v3

    iget-object v4, v1, Lcr/c;->G:Ljava/lang/CharSequence;

    invoke-virtual {v1, v4}, Lcr/c;->b(Ljava/lang/CharSequence;)Z

    move-result v4

    iput-boolean v4, v1, Lcr/c;->I:Z

    iget-object v5, v1, Lcr/c;->h:Landroid/graphics/Rect;

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v7, 0x1

    const/4 v8, 0x5

    const v9, 0x800005

    const/16 v10, 0x11

    if-eq v3, v10, :cond_6

    and-int/lit8 v11, v3, 0x7

    if-ne v11, v7, :cond_1

    goto :goto_3

    :cond_1
    and-int v11, v3, v9

    if-eq v11, v9, :cond_4

    and-int/lit8 v11, v3, 0x5

    if-ne v11, v8, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v4, :cond_3

    iget v4, v5, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    iget v11, v1, Lcr/c;->j0:F

    :goto_0
    sub-float/2addr v4, v11

    goto :goto_4

    :cond_3
    iget v4, v5, Landroid/graphics/Rect;->left:I

    :goto_1
    int-to-float v4, v4

    goto :goto_4

    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    iget v4, v5, Landroid/graphics/Rect;->left:I

    goto :goto_1

    :cond_5
    iget v4, v5, Landroid/graphics/Rect;->right:I

    int-to-float v4, v4

    iget v11, v1, Lcr/c;->j0:F

    goto :goto_0

    :cond_6
    :goto_3
    int-to-float v4, v2

    div-float/2addr v4, v6

    iget v11, v1, Lcr/c;->j0:F

    div-float/2addr v11, v6

    goto :goto_0

    :goto_4
    iget v11, v5, Landroid/graphics/Rect;->left:I

    int-to-float v11, v11

    invoke-static {v4, v11}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iput v4, v0, Landroid/graphics/RectF;->left:F

    iget v11, v5, Landroid/graphics/Rect;->top:I

    int-to-float v11, v11

    iput v11, v0, Landroid/graphics/RectF;->top:F

    if-eq v3, v10, :cond_c

    and-int/lit8 v10, v3, 0x7

    if-ne v10, v7, :cond_7

    goto :goto_8

    :cond_7
    and-int v2, v3, v9

    if-eq v2, v9, :cond_a

    and-int/lit8 v2, v3, 0x5

    if-ne v2, v8, :cond_8

    goto :goto_7

    :cond_8
    iget-boolean v2, v1, Lcr/c;->I:Z

    if-eqz v2, :cond_9

    iget v2, v5, Landroid/graphics/Rect;->right:I

    :goto_5
    int-to-float v2, v2

    goto :goto_9

    :cond_9
    iget v2, v1, Lcr/c;->j0:F

    :goto_6
    add-float/2addr v2, v4

    goto :goto_9

    :cond_a
    :goto_7
    iget-boolean v2, v1, Lcr/c;->I:Z

    if-eqz v2, :cond_b

    iget v2, v1, Lcr/c;->j0:F

    goto :goto_6

    :cond_b
    iget v2, v5, Landroid/graphics/Rect;->right:I

    goto :goto_5

    :cond_c
    :goto_8
    int-to-float v2, v2

    div-float/2addr v2, v6

    iget v3, v1, Lcr/c;->j0:F

    div-float/2addr v3, v6

    add-float/2addr v2, v3

    :goto_9
    iget v3, v5, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iput v2, v0, Landroid/graphics/RectF;->right:F

    iget v2, v5, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {v1}, Lcr/c;->e()F

    move-result v1

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-lez v1, :cond_e

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_d

    goto :goto_a

    :cond_d
    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:I

    int-to-float v2, v2

    sub-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->left:F

    iget v1, v0, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v3, v6

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    int-to-float v3, v3

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->offset(FF)V

    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    check-cast v1, Lcom/google/android/material/textfield/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/material/textfield/h;->w(FFFF)V

    :cond_e
    :goto_a
    return-void
.end method

.method public y()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Lcom/google/android/material/textfield/z;

    iget-object v1, v0, Lcom/google/android/material/textfield/z;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v2, v0, Lcom/google/android/material/textfield/z;->z:Lcom/google/android/material/internal/CheckableImageButton;

    iget-object v0, v0, Lcom/google/android/material/textfield/z;->E:Landroid/content/res/ColorStateList;

    invoke-static {v1, v2, v0}, Ls2/e;->X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public z(FFFF)V
    .locals 2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Z

    if-eqz v0, :cond_0

    move v1, p2

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    if-eqz v0, :cond_2

    move p2, p4

    goto :goto_2

    :cond_2
    move p2, p3

    :goto_2
    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move p3, p4

    :goto_3
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    if-eqz p4, :cond_5

    invoke-virtual {p4}, Lkr/g;->i()F

    move-result p4

    cmpl-float p4, p4, v1

    if-nez p4, :cond_5

    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    iget-object v0, p4, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->a:Lkr/k;

    iget-object v0, v0, Lkr/k;->f:Lkr/c;

    invoke-virtual {p4}, Lkr/g;->h()Landroid/graphics/RectF;

    move-result-object p4

    invoke-interface {v0, p4}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    cmpl-float p4, p4, p1

    if-nez p4, :cond_5

    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    iget-object v0, p4, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->a:Lkr/k;

    iget-object v0, v0, Lkr/k;->h:Lkr/c;

    invoke-virtual {p4}, Lkr/g;->h()Landroid/graphics/RectF;

    move-result-object p4

    invoke-interface {v0, p4}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    cmpl-float p4, p4, p2

    if-nez p4, :cond_5

    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:Lkr/g;

    iget-object v0, p4, Lkr/g;->w:Lkr/f;

    iget-object v0, v0, Lkr/f;->a:Lkr/k;

    iget-object v0, v0, Lkr/k;->g:Lkr/c;

    invoke-virtual {p4}, Lkr/g;->h()Landroid/graphics/RectF;

    move-result-object p4

    invoke-interface {v0, p4}, Lkr/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    cmpl-float p4, p4, p3

    if-eqz p4, :cond_4

    goto :goto_4

    :cond_4
    return-void

    :cond_5
    :goto_4
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {p4}, Lkr/k;->e()Lkr/j;

    move-result-object p4

    new-instance v0, Lkr/a;

    invoke-direct {v0, v1}, Lkr/a;-><init>(F)V

    iput-object v0, p4, Lkr/j;->e:Ljava/lang/Object;

    new-instance v0, Lkr/a;

    invoke-direct {v0, p1}, Lkr/a;-><init>(F)V

    iput-object v0, p4, Lkr/j;->f:Ljava/lang/Object;

    invoke-virtual {p4, p2}, Lkr/j;->c(F)V

    invoke-virtual {p4, p3}, Lkr/j;->d(F)V

    invoke-virtual {p4}, Lkr/j;->a()Lkr/k;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Lkr/k;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    return-void
.end method
