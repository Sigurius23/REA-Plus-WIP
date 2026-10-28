.class public final Ls40/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Ls40/z;->a:I

    iput-object p1, p0, Ls40/z;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final c(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method private final d(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget p1, p0, Ls40/z;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ls40/z;->b:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/z;->b:Landroid/view/View;

    check-cast p1, Ls40/a0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :pswitch_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    iget p1, p0, Ls40/z;->a:I

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    iget p1, p0, Ls40/z;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ls40/z;->b:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ls40/z;->b:Landroid/view/View;

    check-cast p1, Ls40/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ls40/z;->b:Landroid/view/View;

    check-cast p1, Ls40/a0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
