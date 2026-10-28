.class public final Lcom/google/android/gms/wallet/button/PayButton;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public w:Landroid/view/View$OnClickListener;

.field public final x:Le10/k0;

.field public y:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->b()Le10/k0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/wallet/button/PayButton;->x:Le10/k0;

    sget-object v2, Ldq/q;->a:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {p2, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    iget-object v1, v1, Le10/k0;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput v0, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    iput v2, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iput p2, v1, Lcom/google/android/gms/wallet/button/ButtonOptions;->w:I

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/wallet/button/PayButton;->a(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/wallet/button/ButtonOptions;)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget v0, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->x:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const v0, 0x7f1501e1

    goto :goto_0

    :cond_0
    const v0, 0x7f1501e0

    :goto_0
    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v0, Leq/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v3, 0x7f0d035d

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f0a09d3

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget p1, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->y:I

    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    iget v4, v4, Landroid/util/TypedValue;->data:I

    const v5, 0x7f0404eb

    filled-new-array {v5}, [I

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v6, :cond_1

    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    :cond_1
    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    check-cast v4, Landroid/graphics/drawable/GradientDrawable;

    int-to-float p1, p1

    invoke-virtual {v4, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    iget p1, p1, Landroid/util/TypedValue;->data:I

    const v6, 0x7f0404ed

    filled-new-array {v6}, [I

    move-result-object v6

    invoke-virtual {v3, p1, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    invoke-direct {v3, p1, v4, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f14053c

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/google/android/gms/wallet/button/PayButton;->y:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->y:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/button/PayButton;->w:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/wallet/button/PayButton;->y:Landroid/view/View;

    if-ne p1, v1, :cond_0

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->w:Landroid/view/View$OnClickListener;

    return-void
.end method
