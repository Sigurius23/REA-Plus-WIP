.class public final Lt30/q;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public final w:Lm30/h;

.field public final x:Ll83/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm30/h;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lt30/q;->w:Lm30/h;

    new-instance p1, Lsc0/c;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/q;->x:Ll83/p;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    iget-object v0, p0, Lt30/q;->x:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk30/c;

    iget-object v1, v1, Lk30/c;->a:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk30/c;

    iget-object v0, v0, Lk30/c;->b:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    iget-object v1, p0, Lt30/q;->w:Lm30/h;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lm30/h;->F:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method
