.class public final Llx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Llx/c;


# direct methods
.method public synthetic constructor <init>(Llx/c;III)V
    .locals 0

    iput p4, p0, Llx/b;->w:I

    iput-object p1, p0, Llx/b;->z:Llx/c;

    iput p2, p0, Llx/b;->x:I

    iput p3, p0, Llx/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Llx/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llx/b;->z:Llx/c;

    iget-object v0, v0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/b;

    iget v1, p0, Llx/b;->x:I

    iget v2, p0, Llx/b;->y:I

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeRemoved(II)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llx/b;->z:Llx/c;

    iget-object v0, v0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/b;

    iget v1, p0, Llx/b;->x:I

    iget v2, p0, Llx/b;->y:I

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeInserted(II)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llx/b;->z:Llx/c;

    iget-object v0, v0, Llx/c;->b:Ljava/lang/Object;

    check-cast v0, Lmx/b;

    iget v1, p0, Llx/b;->x:I

    iget v2, p0, Llx/b;->y:I

    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeChanged(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
