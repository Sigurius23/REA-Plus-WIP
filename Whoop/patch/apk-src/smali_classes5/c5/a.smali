.class public final Lc5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILhc/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc5/a;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc5/a;->x:I

    .line 4
    iput-object p2, p0, Lc5/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Lc5/a;->w:I

    iput-object p1, p0, Lc5/a;->y:Ljava/lang/Object;

    iput p2, p0, Lc5/a;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Lc5/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc5/a;->y:Ljava/lang/Object;

    check-cast v0, Lto/v;

    iget v1, p0, Lc5/a;->x:I

    invoke-virtual {v0, v1}, Lto/v;->b(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc5/a;->y:Ljava/lang/Object;

    check-cast v0, Lib/c0;

    iget-object v1, v0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lib/n;->y:Lib/m;

    iget v1, v1, Lib/m;->a:I

    iget-object v2, v0, Lib/c0;->L:Lib/a0;

    invoke-virtual {v2}, Lib/j;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lib/n;->d()V

    goto :goto_0

    :cond_1
    iget v2, p0, Lc5/a;->x:I

    mul-int v5, v2, v1

    iget-object v2, v0, Lib/n;->z:Lib/r;

    invoke-virtual {v2}, Lib/r;->size()I

    move-result v2

    sub-int/2addr v2, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    iget-object v3, v0, Lib/c0;->L:Lib/a0;

    iget-object v7, v0, Lib/n;->w:Ljava/util/concurrent/Executor;

    iget-object v8, v0, Lib/c0;->M:Lib/e;

    const/4 v4, 0x3

    invoke-virtual/range {v3 .. v8}, Lib/a0;->h(IIILjava/util/concurrent/Executor;Lib/k;)V

    :goto_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lc5/a;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Lc5/a;->x:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lc5/a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/datepicker/m;

    iget-object v0, v0, Lcom/google/android/material/datepicker/m;->H:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Lc5/a;->x:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lc5/a;->y:Ljava/lang/Object;

    check-cast v0, Lty/c;

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lu4/b;

    if-eqz v0, :cond_2

    iget v1, p0, Lc5/a;->x:I

    invoke-virtual {v0, v1}, Lu4/b;->j(I)V

    :cond_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
