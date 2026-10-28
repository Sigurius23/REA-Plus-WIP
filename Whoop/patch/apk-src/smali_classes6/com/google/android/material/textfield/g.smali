.class public final Lcom/google/android/material/textfield/g;
.super Lkr/f;
.source "SourceFile"


# instance fields
.field public final s:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/g;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lkr/f;-><init>(Lkr/f;)V

    .line 4
    iget-object p1, p1, Lcom/google/android/material/textfield/g;->s:Landroid/graphics/RectF;

    iput-object p1, p0, Lcom/google/android/material/textfield/g;->s:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lkr/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkr/f;-><init>(Lkr/k;)V

    .line 2
    iput-object p2, p0, Lcom/google/android/material/textfield/g;->s:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lcom/google/android/material/textfield/h;

    invoke-direct {v0, p0}, Lkr/g;-><init>(Lkr/f;)V

    iput-object p0, v0, Lcom/google/android/material/textfield/h;->Y:Lcom/google/android/material/textfield/g;

    invoke-virtual {v0}, Lkr/g;->invalidateSelf()V

    return-object v0
.end method
