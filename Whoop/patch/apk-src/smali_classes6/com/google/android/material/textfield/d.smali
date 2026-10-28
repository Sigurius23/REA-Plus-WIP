.class public final Lcom/google/android/material/textfield/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/textfield/e;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/textfield/e;I)V
    .locals 0

    iput p2, p0, Lcom/google/android/material/textfield/d;->a:I

    iput-object p1, p0, Lcom/google/android/material/textfield/d;->b:Lcom/google/android/material/textfield/e;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/textfield/d;->b:Lcom/google/android/material/textfield/e;

    iget-object p1, p1, Lcom/google/android/material/textfield/r;->b:Lcom/google/android/material/textfield/q;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/q;->h(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lcom/google/android/material/textfield/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/textfield/d;->b:Lcom/google/android/material/textfield/e;

    iget-object p1, p1, Lcom/google/android/material/textfield/r;->b:Lcom/google/android/material/textfield/q;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/textfield/q;->h(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
