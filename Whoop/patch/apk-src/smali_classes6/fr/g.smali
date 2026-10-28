.class public final Lfr/g;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfr/h;


# direct methods
.method public synthetic constructor <init>(Lfr/h;I)V
    .locals 0

    iput p2, p0, Lfr/g;->a:I

    iput-object p1, p0, Lfr/g;->b:Lfr/h;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget v0, p0, Lfr/g;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lfr/g;->b:Lfr/h;

    invoke-virtual {p1}, Lfr/h;->f()V

    iget-object v0, p1, Lfr/h;->k:Lfr/c;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb3/b;->b:Ljava/lang/Object;

    check-cast p1, Lfr/p;

    invoke-virtual {v0, p1}, Lfr/c;->a(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    iget v0, p0, Lfr/g;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    return-void

    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    iget-object p1, p0, Lfr/g;->b:Lfr/h;

    iget v0, p1, Lfr/h;->h:I

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p1, Lfr/h;->g:Lfr/i;

    iget-object v1, v1, Lfr/e;->c:[I

    array-length v1, v1

    rem-int/2addr v0, v1

    iput v0, p1, Lfr/h;->h:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
