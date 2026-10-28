.class public final synthetic Lrq0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lrq0/t0;


# direct methods
.method public synthetic constructor <init>(Lrq0/t0;I)V
    .locals 0

    iput p2, p0, Lrq0/p0;->a:I

    iput-object p1, p0, Lrq0/p0;->b:Lrq0/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget v0, p0, Lrq0/p0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/p0;->b:Lrq0/t0;

    invoke-static {v0, p1}, Lrq0/t0;->E(Lrq0/t0;Landroid/animation/ValueAnimator;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/p0;->b:Lrq0/t0;

    invoke-static {v0, p1}, Lrq0/t0;->I(Lrq0/t0;Landroid/animation/ValueAnimator;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
