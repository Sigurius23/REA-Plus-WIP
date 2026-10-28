.class public Lcom/whoop/ui/WhoopSwitch;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# instance fields
.field w:Landroidx/appcompat/widget/SwitchCompat;

.field x:Landroid/widget/TextView;

.field y:Landroid/widget/TextView;

.field private z:Lbh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lvu1/j;->J0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/WhoopSwitch;->b(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/ui/WhoopSwitch;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/WhoopSwitch;->c()V

    return-void
.end method

.method private b(Landroid/content/res/TypedArray;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lvu1/g;->g:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lvu1/e;->v:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/SwitchCompat;

    iput-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    sget v0, Lvu1/e;->w:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->x:Landroid/widget/TextView;

    sget v0, Lvu1/e;->x:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->y:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    if-eqz p1, :cond_5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    if-ge v1, v2, :cond_5

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    sget v3, Lvu1/j;->L0:I

    if-ne v2, v3, :cond_0

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iget-object v3, p0, Lcom/whoop/ui/WhoopSwitch;->x:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v3, p0, Lcom/whoop/ui/WhoopSwitch;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_1

    :cond_0
    sget v3, Lvu1/j;->M0:I

    if-ne v2, v3, :cond_1

    iget-object v3, p0, Lcom/whoop/ui/WhoopSwitch;->x:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    sget v3, Lvu1/j;->N0:I

    if-ne v2, v3, :cond_2

    iget-object v3, p0, Lcom/whoop/ui/WhoopSwitch;->y:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    sget v3, Lvu1/j;->O0:I

    if-ne v2, v3, :cond_3

    const/4 v3, -0x1

    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/whoop/ui/WhoopSwitch;->setThumbColor(I)V

    goto :goto_1

    :cond_3
    sget v3, Lvu1/j;->K0:I

    if-ne v2, v3, :cond_4

    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    new-instance v0, Lcom/whoop/ui/WhoopSwitch$a;

    invoke-direct {v0, p0}, Lcom/whoop/ui/WhoopSwitch$a;-><init>(Lcom/whoop/ui/WhoopSwitch;)V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopSwitch;->c()V

    return-void
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->y:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->x:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->x:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->z:Lbh3/b;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lbh3/b;->b(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public isChecked()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public setChecked(Z)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopSwitch;->c()V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public setOnCheckedChangeListener(Lbh3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/WhoopSwitch;->z:Lbh3/b;

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setThumbColor(I)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SwitchCompat;->getThumbDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    shr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v2, p1, 0x8

    and-int/lit16 v2, v2, 0xff

    and-int/lit16 p1, p1, 0xff

    add-int/lit8 v0, v0, -0x1e

    const/4 v3, 0x0

    if-gez v0, :cond_0

    move v0, v3

    :cond_0
    add-int/lit8 v2, v2, -0x1e

    if-gez v2, :cond_1

    move v2, v3

    :cond_1
    add-int/lit8 p1, p1, -0x1e

    if-gez p1, :cond_2

    goto :goto_0

    :cond_2
    move v3, p1

    :goto_0
    invoke-static {v0, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SwitchCompat;->getTrackDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public toggle()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/WhoopSwitch;->w:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0}, Landroidx/appcompat/widget/SwitchCompat;->toggle()V

    invoke-direct {p0}, Lcom/whoop/ui/WhoopSwitch;->c()V

    return-void
.end method
