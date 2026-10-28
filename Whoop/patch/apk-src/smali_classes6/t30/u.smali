.class public final Lt30/u;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final w:Lcom/google/android/material/textfield/TextInputLayout;

.field public final x:Lcom/google/android/material/textfield/TextInputEditText;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d064f

    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object v0, p1

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    const v1, 0x7f0a0c62

    invoke-static {p1, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v2, :cond_0

    iput-object v0, p0, Lt30/u;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v2, p0, Lt30/u;->x:Lcom/google/android/material/textfield/TextInputEditText;

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getInfoLabel$3ds2sdk_release()Lcom/google/android/material/textfield/TextInputLayout;
    .locals 1

    iget-object v0, p0, Lt30/u;->w:Lcom/google/android/material/textfield/TextInputLayout;

    return-object v0
.end method

.method public final getTextEntryView$3ds2sdk_release()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    iget-object v0, p0, Lt30/u;->x:Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public getUserEntry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt30/u;->x:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt30/u;->x:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTextBoxCustomization(Lm30/i;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p1

    check-cast v0, Lm30/a;

    iget-object v1, v0, Lm30/a;->x:Ljava/lang/String;

    iget-object v2, p0, Lt30/u;->x:Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v1, :cond_1

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    iget v0, v0, Lm30/a;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v2, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_3
    check-cast p1, Lm30/f;

    iget v0, p1, Lm30/f;->F:I

    iget-object v2, p0, Lt30/u;->w:Lcom/google/android/material/textfield/TextInputLayout;

    if-ltz v0, :cond_4

    int-to-float v0, v0

    invoke-virtual {v2, v0, v0, v0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->z(FFFF)V

    :cond_4
    iget-object v0, p1, Lm30/f;->E:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v2, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColor(I)V

    :cond_5
    iget-object p1, p1, Lm30/f;->G:Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final setTextEntryLabel(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lt30/u;->w:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method
