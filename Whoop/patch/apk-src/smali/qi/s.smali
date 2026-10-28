.class public final synthetic Lqi/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lqi/s;->a:I

    iput-object p1, p0, Lqi/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget v0, p0, Lqi/s;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqi/s;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->w(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lqi/s;->b:Ljava/lang/Object;

    check-cast p1, Lqi/w;

    iget-object v0, p1, Lqi/w;->l0:Lqi/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lqi/a;->w:Lqi/a;

    :goto_0
    sget-object v1, Lqi/a;->x:Lqi/a;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lqi/w;->invalidateSelf()V

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lqi/w;->O:Lzi/c;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lqi/w;->x:Ldj/e;

    invoke-virtual {p1}, Ldj/e;->a()F

    move-result p1

    invoke-virtual {v0, p1}, Lzi/c;->p(F)V

    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
