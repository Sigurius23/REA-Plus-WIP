.class public final Landroidx/viewpager2/adapter/e;
.super Landroidx/recyclerview/widget/k1;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/viewpager2/adapter/e;->a:I

    iput-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget v0, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast v0, Lc33/c;

    invoke-virtual {v0}, Lc33/c;->f()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager2/adapter/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/viewpager2/adapter/g;->b(Z)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onItemRangeChanged(II)V
    .locals 0

    iget p1, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    iget-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    invoke-virtual {p1}, Lc33/c;->f()V

    return-void

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/e;->onChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onItemRangeChanged(IILjava/lang/Object;)V
    .locals 0

    iget p1, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch p1, :pswitch_data_0

    .line 3
    iget-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    invoke-virtual {p1}, Lc33/c;->f()V

    return-void

    .line 4
    :pswitch_0
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/e;->onChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onItemRangeInserted(II)V
    .locals 0

    iget p1, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    invoke-virtual {p1}, Lc33/c;->f()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/e;->onChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onItemRangeMoved(III)V
    .locals 0

    iget p1, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    invoke-virtual {p1}, Lc33/c;->f()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/e;->onChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onItemRangeRemoved(II)V
    .locals 0

    iget p1, p0, Landroidx/viewpager2/adapter/e;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Landroidx/viewpager2/adapter/e;->b:Ljava/lang/Object;

    check-cast p1, Lc33/c;

    invoke-virtual {p1}, Lc33/c;->f()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, Landroidx/viewpager2/adapter/e;->onChanged()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
