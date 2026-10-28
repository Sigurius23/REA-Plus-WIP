.class public Lcom/google/android/material/tabs/TabItem;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/CharSequence;

.field public final x:Landroid/graphics/drawable/Drawable;

.field public final y:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Ljq/a;->L:[I

    invoke-static {p1, p2, v0}, Ls/m2;->p(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ls/m2;

    move-result-object p1

    iget-object p2, p1, Ls/m2;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/res/TypedArray;

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/tabs/TabItem;->w:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls/m2;->j(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/tabs/TabItem;->x:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/google/android/material/tabs/TabItem;->y:I

    invoke-virtual {p1}, Ls/m2;->r()V

    return-void
.end method
