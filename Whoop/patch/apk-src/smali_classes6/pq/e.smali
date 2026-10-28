.class public final Lpq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Le73/b;


# direct methods
.method public constructor <init>(Le73/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpq/e;->w:Le73/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lpq/e;->w:Le73/b;

    iput-boolean v0, v1, Le73/b;->b:Z

    iget-object v0, v1, Le73/b;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:Lw5/d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lw5/d;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    iget v0, v1, Le73/b;->d:I

    invoke-virtual {v1, v0}, Le73/b;->i(I)V

    return-void

    :cond_0
    iget v2, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    iget v1, v1, Le73/b;->d:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X(I)V

    :cond_1
    return-void
.end method
