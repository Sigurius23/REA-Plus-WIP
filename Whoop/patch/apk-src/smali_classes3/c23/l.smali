.class public final Lc23/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Landroid/widget/OverScroller;

.field public x:I

.field public y:I

.field public final synthetic z:Lc23/o;


# direct methods
.method public constructor <init>(Lc23/o;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc23/l;->z:Lc23/o;

    new-instance p1, Landroid/widget/OverScroller;

    invoke-direct {p1, p2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lc23/l;->w:Landroid/widget/OverScroller;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lc23/l;->w:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    iget-object v2, p0, Lc23/l;->z:Lc23/o;

    iget-object v3, v2, Lc23/o;->M:Landroid/graphics/Matrix;

    iget v4, p0, Lc23/l;->x:I

    sub-int/2addr v4, v1

    int-to-float v4, v4

    iget v5, p0, Lc23/l;->y:I

    sub-int/2addr v5, v0

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v2}, Lc23/o;->a()V

    iput v1, p0, Lc23/l;->x:I

    iput v0, p0, Lc23/l;->y:I

    iget-object v0, v2, Lc23/o;->w:Lio/getstream/photoview/PhotoView;

    const-wide/16 v1, 0x10

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method
