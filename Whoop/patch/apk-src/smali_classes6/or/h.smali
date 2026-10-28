.class public final Lor/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/drawable/Drawable;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:I

.field public e:Landroid/view/View;

.field public f:Lcom/google/android/material/tabs/TabLayout;

.field public g:Lor/k;


# virtual methods
.method public final a(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lor/h;->c:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lor/h;->g:Lor/k;

    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    iput-object p1, p0, Lor/h;->b:Ljava/lang/CharSequence;

    iget-object p1, p0, Lor/h;->g:Lor/k;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lor/k;->e()V

    :cond_1
    return-void
.end method
