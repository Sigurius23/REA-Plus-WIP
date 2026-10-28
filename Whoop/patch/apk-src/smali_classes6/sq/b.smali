.class public final Lsq/b;
.super La9/a;
.source "SourceFile"


# instance fields
.field public final synthetic y:I

.field public final synthetic z:Lcom/google/android/material/carousel/CarouselLayoutManager;


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V
    .locals 0

    iput p2, p0, Lsq/b;->y:I

    packed-switch p2, :pswitch_data_0

    iput-object p1, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    const/4 p1, 0x2

    const/4 p2, 0x1

    invoke-direct {p0, p2, p1}, La9/a;-><init>(II)V

    return-void

    :pswitch_0
    iput-object p1, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, La9/a;-><init>(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final g()I
    .locals 2

    iget v0, p0, Lsq/b;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    :pswitch_0
    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lsq/b;->y:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()I
    .locals 2

    iget v0, p0, Lsq/b;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    sub-int/2addr v1, v0

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l()I
    .locals 2

    iget v0, p0, Lsq/b;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lsq/b;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsq/b;->z:Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
