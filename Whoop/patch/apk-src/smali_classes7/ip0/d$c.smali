.class public final Lip0/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip0/d;->v(Landroid/view/View;ILip0/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "ip0/d$c",
        "Landroid/view/View$OnLayoutChangeListener;",
        "Landroid/view/View;",
        "view",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "oldLeft",
        "oldTop",
        "oldRight",
        "oldBottom",
        "Ll83/a0;",
        "onLayoutChange",
        "(Landroid/view/View;IIIIIIII)V",
        "core-ktx_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Landroid/view/View;

.field final synthetic x:Lip0/a;

.field final synthetic y:Lip0/d;


# direct methods
.method public constructor <init>(Landroid/view/View;Lip0/a;Lip0/d;)V
    .locals 0

    iput-object p1, p0, Lip0/d$c;->w:Landroid/view/View;

    iput-object p2, p0, Lip0/d$c;->x:Lip0/a;

    iput-object p3, p0, Lip0/d$c;->y:Lip0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 p1, 0x2

    new-array p2, p1, [I

    iget-object p3, p0, Lip0/d$c;->w:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p3, p0, Lip0/d$c;->x:Lip0/a;

    sget-object p4, Lip0/a;->BOTTOM:Lip0/a;

    const/4 p5, 0x0

    const/4 p6, 0x1

    if-eq p3, p4, :cond_1

    sget-object p7, Lip0/a;->TOP:Lip0/a;

    if-ne p3, p7, :cond_0

    goto :goto_1

    :cond_0
    aget p3, p2, p6

    iget-object p7, p0, Lip0/d$c;->w:Landroid/view/View;

    invoke-virtual {p7}, Landroid/view/View;->getHeight()I

    move-result p7

    div-int/2addr p7, p1

    :goto_0
    add-int/2addr p7, p3

    goto :goto_2

    :cond_1
    :goto_1
    aget p3, p2, p5

    iget-object p7, p0, Lip0/d$c;->w:Landroid/view/View;

    invoke-virtual {p7}, Landroid/view/View;->getWidth()I

    move-result p7

    div-int/2addr p7, p1

    goto :goto_0

    :goto_2
    iget-object p3, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p3}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p3

    iget-object p3, p3, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p3, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p3, p0, Lip0/d$c;->x:Lip0/a;

    if-eq p3, p4, :cond_3

    sget-object p4, Lip0/a;->TOP:Lip0/a;

    if-ne p3, p4, :cond_2

    goto :goto_4

    :cond_2
    aget p2, p2, p6

    iget-object p3, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p3}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p3

    iget-object p3, p3, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    div-int/2addr p3, p1

    :goto_3
    add-int/2addr p3, p2

    goto :goto_5

    :cond_3
    :goto_4
    aget p2, p2, p5

    iget-object p3, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p3}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p3

    iget-object p3, p3, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    div-int/2addr p3, p1

    goto :goto_3

    :goto_5
    sub-int/2addr p7, p3

    iget-object p2, p0, Lip0/d$c;->x:Lip0/a;

    const/4 p3, -0x1

    if-nez p2, :cond_4

    move p2, p3

    goto :goto_6

    :cond_4
    sget-object p4, Lip0/d$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, p4, p2

    :goto_6
    if-eq p2, p3, :cond_9

    if-eq p2, p6, :cond_8

    if-eq p2, p1, :cond_7

    const/4 p3, 0x3

    if-eq p2, p3, :cond_6

    const/4 p3, 0x4

    if-ne p2, p3, :cond_5

    iget-object p2, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p2}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p2

    iget-object p2, p2, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    const/high16 p3, 0x43870000    # 270.0f

    invoke-virtual {p2, p3}, Landroid/view/View;->setRotation(F)V

    iget-object p2, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p2}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p2

    iget-object p2, p2, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p3

    iget-object p4, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p4}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p4

    iget-object p4, p4, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result p4

    div-int/2addr p4, p1

    int-to-float p1, p4

    sub-float/2addr p3, p1

    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    int-to-float p3, p7

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    iget-object p2, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p2}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p2

    iget-object p2, p2, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    const/high16 p3, 0x42b40000    # 90.0f

    invoke-virtual {p2, p3}, Landroid/view/View;->setRotation(F)V

    iget-object p2, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p2}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p2

    iget-object p2, p2, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    move-result p3

    iget-object p4, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p4}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p4

    invoke-virtual {p4}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4}, Landroid/view/View;->getWidth()I

    move-result p4

    iget-object p5, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p5}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p5

    iget-object p5, p5, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    move-result p5

    div-int/2addr p5, p1

    sub-int/2addr p4, p5

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->d(Lip0/d;)I

    move-result p1

    sub-int/2addr p4, p1

    int-to-float p1, p4

    add-float/2addr p3, p1

    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    int-to-float p3, p7

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void

    :cond_7
    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p2

    int-to-float p3, p7

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    return-void

    :cond_8
    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    const/high16 p2, 0x43340000    # 180.0f

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p2

    int-to-float p3, p7

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p1}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p1

    iget-object p1, p1, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p2

    iget-object p3, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p3}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p3

    iget-object p4, p0, Lip0/d$c;->y:Lip0/d;

    invoke-static {p4}, Lip0/d;->c(Lip0/d;)Lgf2/u;

    move-result-object p4

    iget-object p4, p4, Lgf2/u;->e:Lcom/whoop/ui/views/ColoredImageView;

    invoke-virtual {p4}, Landroid/view/View;->getHeight()I

    move-result p4

    sub-int/2addr p3, p4

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_9
    return-void
.end method
