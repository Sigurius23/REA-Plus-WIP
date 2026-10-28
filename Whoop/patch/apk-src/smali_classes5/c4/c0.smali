.class public final Lc4/c0;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc4/c0;->a:I

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 2

    iget v0, p0, Lc4/c0;->a:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p1, Ll2/l;

    if-eqz v0, :cond_0

    check-cast p1, Ll2/l;

    iget-object p1, p1, Ll2/l;->E:Landroid/graphics/Outline;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->set(Landroid/graphics/Outline;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v1, v0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v1, v0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void

    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v1, v0, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
