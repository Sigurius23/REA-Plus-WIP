.class public final Lcom/google/android/material/textfield/f;
.super Lcom/google/android/material/textfield/r;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/q;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/material/textfield/f;->e:I

    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/r;-><init>(Lcom/google/android/material/textfield/q;)V

    return-void
.end method


# virtual methods
.method public q()V
    .locals 2

    iget v0, p0, Lcom/google/android/material/textfield/f;->e:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/textfield/r;->b:Lcom/google/android/material/textfield/q;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/material/textfield/q;->O:Landroid/view/View$OnLongClickListener;

    iget-object v0, v0, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-static {v0, v1}, Ls2/e;->e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
