.class public final Landroidx/viewpager2/adapter/d;
.super Lhc/h;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Landroidx/viewpager2/adapter/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager2/adapter/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/viewpager2/adapter/d;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 2

    iget v0, p0, Landroidx/viewpager2/adapter/d;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc/h;

    invoke-virtual {v1, p1}, Lhc/h;->onPageScrollStateChanged(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_0
    iget-object p1, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/viewpager2/adapter/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/viewpager2/adapter/g;->b(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    iget v0, p0, Landroidx/viewpager2/adapter/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lhc/h;->onPageScrolled(IFI)V

    return-void

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc/h;

    invoke-virtual {v1, p1, p2, p3}, Lhc/h;->onPageScrolled(IFI)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-void

    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Adding and removing callbacks during dispatch to callbacks is not supported"

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onPageSelected(I)V
    .locals 2

    iget v0, p0, Landroidx/viewpager2/adapter/d;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc/h;

    invoke-virtual {v1, p1}, Lhc/h;->onPageSelected(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_0
    iget-object p1, p0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/viewpager2/adapter/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/viewpager2/adapter/g;->b(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
