.class public final Ldb/b0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldb/x;

.field public final synthetic c:Ldb/c0;


# direct methods
.method public synthetic constructor <init>(Ldb/c0;Ldb/x;I)V
    .locals 0

    iput p3, p0, Ldb/b0;->a:I

    iput-object p1, p0, Ldb/b0;->c:Ldb/c0;

    iput-object p2, p0, Ldb/b0;->b:Ldb/x;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget p1, p0, Ldb/b0;->a:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x2

    iget-object v0, p0, Ldb/b0;->c:Ldb/c0;

    invoke-virtual {v0, p1}, Ldb/c0;->k(I)V

    iget-boolean p1, v0, Ldb/c0;->v:Z

    if-eqz p1, :cond_0

    iget-object p1, v0, Ldb/c0;->y:Ljava/lang/Runnable;

    check-cast p1, Ldb/y;

    iget-object v1, p0, Ldb/b0;->b:Ldb/x;

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    iput-boolean p1, v0, Ldb/c0;->v:Z

    :cond_0
    return-void

    :pswitch_0
    const/4 p1, 0x2

    iget-object v0, p0, Ldb/b0;->c:Ldb/c0;

    invoke-virtual {v0, p1}, Ldb/c0;->k(I)V

    iget-boolean p1, v0, Ldb/c0;->v:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Ldb/c0;->y:Ljava/lang/Runnable;

    check-cast p1, Ldb/y;

    iget-object v1, p0, Ldb/b0;->b:Ldb/x;

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    iput-boolean p1, v0, Ldb/c0;->v:Z

    :cond_1
    return-void

    :pswitch_1
    const/4 p1, 0x1

    iget-object v0, p0, Ldb/b0;->c:Ldb/c0;

    invoke-virtual {v0, p1}, Ldb/c0;->k(I)V

    iget-boolean p1, v0, Ldb/c0;->v:Z

    if-eqz p1, :cond_2

    iget-object p1, v0, Ldb/c0;->y:Ljava/lang/Runnable;

    check-cast p1, Ldb/y;

    iget-object v1, p0, Ldb/b0;->b:Ldb/x;

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    iput-boolean p1, v0, Ldb/c0;->v:Z

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget p1, p0, Ldb/b0;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ldb/b0;->c:Ldb/c0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ldb/c0;->k(I)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ldb/b0;->c:Ldb/c0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ldb/c0;->k(I)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ldb/b0;->c:Ldb/c0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ldb/c0;->k(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
