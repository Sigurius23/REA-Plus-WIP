.class Lq52/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq52/d;->a(Landroid/view/View;IIFFLq52/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:F

.field final synthetic G:F

.field private w:I

.field private x:I

.field final synthetic y:Lq52/d$c;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lq52/d$c;IIFF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lq52/d$a;->y:Lq52/d$c;

    iput p2, p0, Lq52/d$a;->z:I

    iput p3, p0, Lq52/d$a;->E:I

    iput p4, p0, Lq52/d$a;->F:F

    iput p5, p0, Lq52/d$a;->G:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lq52/d$a;->w:I

    iput p1, p0, Lq52/d$a;->x:I

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget p2, p0, Lq52/d$a;->w:I

    if-ne p4, p2, :cond_0

    iget p2, p0, Lq52/d$a;->x:I

    if-eq p5, p2, :cond_1

    :cond_0
    iget-object p2, p0, Lq52/d$a;->y:Lq52/d$c;

    invoke-interface {p2, p4, p5}, Lq52/d$c;->a(II)F

    move-result p2

    new-instance p3, Landroid/graphics/drawable/GradientDrawable;

    sget-object p6, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    iget p7, p0, Lq52/d$a;->z:I

    iget p8, p0, Lq52/d$a;->E:I

    filled-new-array {p7, p8}, [I

    move-result-object p7

    invoke-direct {p3, p6, p7}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    const/4 p6, 0x1

    invoke-virtual {p3, p6}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    invoke-virtual {p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    iget p2, p0, Lq52/d$a;->F:F

    iget p6, p0, Lq52/d$a;->G:F

    invoke-virtual {p3, p2, p6}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iput p4, p0, Lq52/d$a;->w:I

    iput p5, p0, Lq52/d$a;->x:I

    return-void
.end method
