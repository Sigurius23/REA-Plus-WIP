.class public final synthetic Lcom/google/android/material/textfield/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/material/textfield/a0;->w:I

    iput-object p1, p0, Lcom/google/android/material/textfield/a0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/android/material/textfield/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/google/android/material/textfield/a0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/l;

    iget-object v1, v0, Lcom/google/android/material/textfield/l;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/l;->s(Z)V

    iput-boolean v1, v0, Lcom/google/android/material/textfield/l;->m:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/textfield/a0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/e;->s(Z)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/material/textfield/a0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->z:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
