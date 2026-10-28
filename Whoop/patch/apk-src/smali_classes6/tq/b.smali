.class public final Ltq/b;
.super Landroidx/appcompat/widget/AppCompatCheckBox;
.source "SourceFile"


# static fields
.field public static final b0:[I

.field public static final c0:[I

.field public static final d0:[[I

.field public static final e0:I


# instance fields
.field public final E:Ljava/util/LinkedHashSet;

.field public final F:Ljava/util/LinkedHashSet;

.field public G:Landroid/content/res/ColorStateList;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Ljava/lang/CharSequence;

.field public L:Landroid/graphics/drawable/Drawable;

.field public M:Landroid/graphics/drawable/Drawable;

.field public N:Z

.field public O:Landroid/content/res/ColorStateList;

.field public P:Landroid/content/res/ColorStateList;

.field public Q:Landroid/graphics/PorterDuff$Mode;

.field public R:I

.field public S:[I

.field public T:Z

.field public U:Ljava/lang/CharSequence;

.field public V:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public final W:Lcc/f;

.field public final a0:Lfr/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const v0, 0x7f040601

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ltq/b;->b0:[I

    const v0, 0x7f040600

    filled-new-array {v0}, [I

    move-result-object v1

    sput-object v1, Ltq/b;->c0:[I

    const v1, 0x101009e

    filled-new-array {v1, v0}, [I

    move-result-object v0

    const v2, 0x10100a0

    filled-new-array {v1, v2}, [I

    move-result-object v3

    const v4, -0x10100a0

    filled-new-array {v1, v4}, [I

    move-result-object v1

    const v5, -0x101009e

    filled-new-array {v5, v2}, [I

    move-result-object v2

    filled-new-array {v5, v4}, [I

    move-result-object v4

    filled-new-array {v0, v3, v1, v2, v4}, [[I

    move-result-object v0

    sput-object v0, Ltq/b;->d0:[[I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "drawable"

    const-string v2, "android"

    const-string v3, "btn_check_material_anim"

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    sput v0, Ltq/b;->e0:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    const v0, 0x7f1505dd

    const v4, 0x7f0400f2

    invoke-static {p1, p2, v4, v0}, Lqr/a;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, v4}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ltq/b;->E:Ljava/util/LinkedHashSet;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ltq/b;->F:Ljava/util/LinkedHashSet;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Lcc/f;

    const/4 v7, 0x0

    invoke-direct {v0, p1, v7}, Lcc/f;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v2, Lu4/k;->a:Ljava/lang/ThreadLocal;

    const v2, 0x7f08064e

    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v1, v0, Lcc/f;->F:Lcc/c;

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    new-instance v1, Lar/a;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v2

    const/4 v8, 0x1

    invoke-direct {v1, v2, v8}, Lar/a;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Ltq/b;->W:Lcc/f;

    new-instance p1, Lfr/c;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lfr/c;-><init>(Landroid/view/View;I)V

    iput-object p1, p0, Ltq/b;->a0:Lfr/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Ltq/b;->getButtonDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ltq/b;->getSuperButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ll5/m;->setSupportButtonTintList(Landroid/content/res/ColorStateList;)V

    new-array v6, v7, [I

    const v5, 0x7f1505dd

    invoke-static {v1, p2, v4, v5}, Lcr/m;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v3, Ljq/a;->y:[I

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcr/m;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    new-instance p2, Ls/m2;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-direct {p2, v1, v2}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    invoke-virtual {p2, v0}, Ls/m2;->j(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const v0, 0x7f0402d7

    invoke-static {v1, v0, v7}, Lio/sentry/config/a;->W(Landroid/content/Context;IZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    invoke-virtual {v2, v8, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    sget v4, Ltq/b;->e0:I

    if-ne v0, v4, :cond_0

    if-nez v3, :cond_0

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    const p1, 0x7f08064d

    invoke-static {v1, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    iput-boolean v8, p0, Ltq/b;->N:Z

    iget-object p1, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_0

    const p1, 0x7f08064f

    invoke-static {v1, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    :cond_0
    const/4 p1, 0x3

    invoke-static {v1, p2, p1}, Lkotlin/jvm/internal/j;->B(Landroid/content/Context;Ls/m2;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    const/4 p1, 0x4

    const/4 v0, -0x1

    invoke-virtual {v2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lcr/m;->h(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->Q:Landroid/graphics/PorterDuff$Mode;

    const/16 p1, 0xa

    invoke-virtual {v2, p1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ltq/b;->H:Z

    const/4 p1, 0x6

    invoke-virtual {v2, p1, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ltq/b;->I:Z

    const/16 p1, 0x9

    invoke-virtual {v2, p1, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Ltq/b;->J:Z

    const/16 p1, 0x8

    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ltq/b;->K:Ljava/lang/CharSequence;

    const/4 p1, 0x7

    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2, p1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-virtual {p0, p1}, Ltq/b;->setCheckedState(I)V

    :cond_1
    invoke-virtual {p2}, Ls/m2;->r()V

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method private getButtonStateDescription()Ljava/lang/String;
    .locals 2

    iget v0, p0, Ltq/b;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1408d4

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1408d6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1408d5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .locals 7

    iget-object v0, p0, Ltq/b;->G:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const v0, 0x7f04013e

    invoke-static {p0, v0}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v0

    const v1, 0x7f040141

    invoke-static {p0, v1}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v1

    const v2, 0x7f040168

    invoke-static {p0, v2}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v2

    const v3, 0x7f040151

    invoke-static {p0, v3}, Lrj/o;->u(Landroid/view/View;I)I

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2, v1}, Lrj/o;->x(FII)I

    move-result v1

    invoke-static {v4, v2, v0}, Lrj/o;->x(FII)I

    move-result v0

    const v4, 0x3f0a3d71    # 0.54f

    invoke-static {v4, v2, v3}, Lrj/o;->x(FII)I

    move-result v4

    const v5, 0x3ec28f5c    # 0.38f

    invoke-static {v5, v2, v3}, Lrj/o;->x(FII)I

    move-result v6

    invoke-static {v5, v2, v3}, Lrj/o;->x(FII)I

    move-result v2

    filled-new-array {v1, v0, v4, v6, v2}, [I

    move-result-object v0

    new-instance v1, Landroid/content/res/ColorStateList;

    sget-object v2, Ltq/b;->d0:[[I

    invoke-direct {v1, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object v1, p0, Ltq/b;->G:Landroid/content/res/ColorStateList;

    :cond_0
    iget-object v0, p0, Ltq/b;->G:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method private getSuperButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Landroid/widget/CompoundButton;->getButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-interface {p0}, Ll5/m;->getSupportButtonTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->getButtonTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    :goto_0
    iput-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Ltq/b;->Q:Landroid/graphics/PorterDuff$Mode;

    if-nez v0, :cond_2

    move-object v0, v3

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_3
    :goto_1
    iput-object v0, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    iget-boolean v0, p0, Ltq/b;->N:Z

    if-nez v0, :cond_4

    goto/16 :goto_4

    :cond_4
    iget-object v0, p0, Ltq/b;->W:Lcc/f;

    if-eqz v0, :cond_10

    iget-object v1, v0, Lcc/f;->x:Lcc/d;

    iget-object v2, p0, Ltq/b;->a0:Lfr/c;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    iget-object v4, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_7

    check-cast v4, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-object v5, v2, Lfr/c;->a:Lcc/b;

    if-nez v5, :cond_6

    new-instance v5, Lcc/b;

    invoke-direct {v5, v2}, Lcc/b;-><init>(Lfr/c;)V

    iput-object v5, v2, Lfr/c;->a:Lcc/b;

    :cond_6
    iget-object v5, v2, Lfr/c;->a:Lcc/b;

    invoke-static {v4, v5}, Lcc/e;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_7
    iget-object v4, v0, Lcc/f;->E:Ljava/util/ArrayList;

    if-nez v4, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcc/f;->E:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_9

    iget-object v4, v0, Lcc/f;->z:Lar/d;

    if-eqz v4, :cond_9

    iget-object v5, v1, Lcc/d;->b:Landroid/animation/AnimatorSet;

    invoke-virtual {v5, v4}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v3, v0, Lcc/f;->z:Lar/d;

    :cond_9
    :goto_2
    if-nez v2, :cond_a

    goto :goto_3

    :cond_a
    iget-object v3, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_c

    check-cast v3, Landroid/graphics/drawable/AnimatedVectorDrawable;

    iget-object v1, v2, Lfr/c;->a:Lcc/b;

    if-nez v1, :cond_b

    new-instance v1, Lcc/b;

    invoke-direct {v1, v2}, Lcc/b;-><init>(Lfr/c;)V

    iput-object v1, v2, Lfr/c;->a:Lcc/b;

    :cond_b
    iget-object v1, v2, Lfr/c;->a:Lcc/b;

    invoke-static {v3, v1}, Lcc/e;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_c
    iget-object v3, v0, Lcc/f;->E:Ljava/util/ArrayList;

    if-nez v3, :cond_d

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Lcc/f;->E:Ljava/util/ArrayList;

    :cond_d
    iget-object v3, v0, Lcc/f;->E:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_3

    :cond_e
    iget-object v3, v0, Lcc/f;->E:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcc/f;->z:Lar/d;

    if-nez v2, :cond_f

    new-instance v2, Lar/d;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lar/d;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lcc/f;->z:Lar/d;

    :cond_f
    iget-object v1, v1, Lcc/d;->b:Landroid/animation/AnimatorSet;

    iget-object v2, v0, Lcc/f;->z:Lar/d;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_10
    :goto_3
    iget-object v1, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    instance-of v2, v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    if-eqz v2, :cond_11

    if-eqz v0, :cond_11

    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    const v2, 0x7f0a025d

    const v3, 0x7f0a0ce6

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    iget-object v1, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    const v2, 0x7f0a07a9

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    :cond_11
    :goto_4
    iget-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_12

    iget-object v1, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_12

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_12
    iget-object v0, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_13

    iget-object v1, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_13

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_13
    iget-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_14

    move-object v0, v1

    goto :goto_8

    :cond_14
    if-nez v1, :cond_15

    goto :goto_8

    :cond_15
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_16

    goto :goto_5

    :cond_16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    :goto_5
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    if-eq v4, v3, :cond_17

    goto :goto_6

    :cond_17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    :goto_6
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    if-gt v2, v3, :cond_18

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-gt v4, v3, :cond_18

    goto :goto_7

    :cond_18
    int-to-float v2, v2

    int-to-float v3, v4

    div-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_19

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v4, v3

    div-float/2addr v4, v2

    float-to-int v4, v4

    move v2, v3

    goto :goto_7

    :cond_19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    int-to-float v3, v4

    mul-float/2addr v2, v3

    float-to-int v2, v2

    :goto_7
    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    filled-new-array {v0, v1}, [Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0, v2, v4}, Landroid/graphics/drawable/LayerDrawable;->setLayerSize(III)V

    const/16 v1, 0x11

    invoke-virtual {v3, v0, v1}, Landroid/graphics/drawable/LayerDrawable;->setLayerGravity(II)V

    move-object v0, v3

    :goto_8
    invoke-super {p0, v0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    return-void
.end method

.method public getButtonDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getButtonIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getButtonIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getButtonIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ltq/b;->Q:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getCheckedState()I
    .locals 1

    iget v0, p0, Ltq/b;->R:I

    return v0
.end method

.method public getErrorAccessibilityLabel()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ltq/b;->K:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final isChecked()Z
    .locals 2

    iget v0, p0, Ltq/b;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Ltq/b;->H:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    iget-object v0, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ltq/b;->setUseMaterialThemeColors(Z)V

    :cond_0
    return-void
.end method

.method public final onCreateDrawableState(I)[I
    .locals 3

    const/4 v0, 0x2

    add-int/2addr p1, v0

    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, Ltq/b;->getCheckedState()I

    move-result v1

    if-ne v1, v0, :cond_0

    sget-object v0, Ltq/b;->b0:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :cond_0
    iget-boolean v0, p0, Ltq/b;->J:Z

    if-eqz v0, :cond_1

    sget-object v0, Ltq/b;->c0:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :cond_1
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    const v2, 0x10100a0

    if-ge v0, v1, :cond_4

    aget v1, p1, v0

    if-ne v1, v2, :cond_2

    move-object v1, p1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    aput v2, v1, v0

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    array-length v0, p1

    add-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    array-length v0, p1

    aput v2, v1, v0

    :goto_1
    iput-object v1, p0, Ltq/b;->S:[I

    return-object p1
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    iget-boolean v0, p0, Ltq/b;->I:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ltq/b;->getButtonDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    mul-int/2addr v2, v1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    int-to-float v3, v2

    const/4 v4, 0x0

    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget v1, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v2

    iget v3, p1, Landroid/graphics/Rect;->top:I

    iget v4, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0, v1, v3, v4, p1}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    :cond_1
    return-void

    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ltq/b;->J:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltq/b;->K:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Ltq/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Ltq/a;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget p1, p1, Ltq/a;->w:I

    invoke-virtual {p0, p1}, Ltq/b;->setCheckedState(I)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ltq/a;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Ltq/b;->getCheckedState()I

    move-result v0

    iput v0, v1, Ltq/a;->w:I

    return-object v1
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltq/b;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ltq/b;->L:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Ltq/b;->N:Z

    .line 4
    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Ltq/b;->M:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setButtonIconDrawableResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltq/b;->setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ltq/b;->P:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setButtonIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ltq/b;->Q:Landroid/graphics/PorterDuff$Mode;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ltq/b;->Q:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Ltq/b;->O:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-interface {p0, p1}, Ll5/m;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0}, Ltq/b;->a()V

    return-void
.end method

.method public setCenterIfNoTextEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Ltq/b;->I:Z

    return-void
.end method

.method public setChecked(Z)V
    .locals 0

    invoke-virtual {p0, p1}, Ltq/b;->setCheckedState(I)V

    return-void
.end method

.method public setCheckedState(I)V
    .locals 3

    iget v0, p0, Ltq/b;->R:I

    if-eq v0, p1, :cond_7

    iput p1, p0, Ltq/b;->R:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-super {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt p1, v2, :cond_1

    iget-object p1, p0, Ltq/b;->U:Ljava/lang/CharSequence;

    if-nez p1, :cond_1

    invoke-direct {p0}, Ltq/b;->getButtonStateDescription()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    :cond_1
    iget-boolean p1, p0, Ltq/b;->T:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Ltq/b;->T:Z

    iget-object p1, p0, Ltq/b;->F:Ljava/util/LinkedHashSet;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    iget p1, p0, Ltq/b;->R:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    iget-object p1, p0, Ltq/b;->V:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ltq/b;->isChecked()Z

    move-result v1

    invoke-interface {p1, p0, v1}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-class v1, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/autofill/AutofillManager;

    if-eqz p1, :cond_6

    invoke-virtual {p1, p0}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;)V

    :cond_6
    iput-boolean v0, p0, Ltq/b;->T:Z

    :cond_7
    :goto_2
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Ltq/b;->K:Ljava/lang/CharSequence;

    return-void
.end method

.method public setErrorAccessibilityLabelResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Ltq/b;->setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setErrorShown(Z)V
    .locals 1

    iget-boolean v0, p0, Ltq/b;->J:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Ltq/b;->J:Z

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    iget-object p1, p0, Ltq/b;->E:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    iput-object p1, p0, Ltq/b;->V:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-void
.end method

.method public setStateDescription(Ljava/lang/CharSequence;)V
    .locals 2

    iput-object p1, p0, Ltq/b;->U:Ljava/lang/CharSequence;

    if-nez p1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    if-nez p1, :cond_0

    invoke-direct {p0}, Ltq/b;->getButtonStateDescription()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setUseMaterialThemeColors(Z)V
    .locals 0

    iput-boolean p1, p0, Ltq/b;->H:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ltq/b;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltq/b;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ltq/b;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final toggle()V
    .locals 1

    invoke-virtual {p0}, Ltq/b;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ltq/b;->setChecked(Z)V

    return-void
.end method
