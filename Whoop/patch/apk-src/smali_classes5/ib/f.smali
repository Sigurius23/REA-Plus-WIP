.class public final Lib/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lib/g;


# direct methods
.method public synthetic constructor <init>(Lib/g;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lib/f;->w:I

    iput-object p1, p0, Lib/f;->z:Lib/g;

    iput p2, p0, Lib/f;->x:I

    iput-object p3, p0, Lib/f;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Lib/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lib/f;->z:Lib/g;

    iget-object v1, v0, Lib/g;->L:Lib/d;

    iget-object v2, v0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    check-cast v2, Lib/t;

    iget-object v2, v2, Lib/t;->c:Lib/a0;

    invoke-virtual {v2}, Lib/j;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lib/n;->d()V

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lib/n;->y:Lib/m;

    iget v6, v2, Lib/m;->a:I

    iget-object v7, v0, Lib/n;->w:Ljava/util/concurrent/Executor;

    iget-object v8, v0, Lib/g;->Q:Lib/e;

    check-cast v1, Lib/t;

    iget v0, p0, Lib/f;->x:I

    add-int/lit8 v5, v0, 0x1

    iget-object v3, v1, Lib/t;->c:Lib/a0;

    const/4 v4, 0x1

    invoke-virtual/range {v3 .. v8}, Lib/a0;->h(IIILjava/util/concurrent/Executor;Lib/k;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lib/f;->z:Lib/g;

    iget-object v1, v0, Lib/g;->L:Lib/d;

    iget-object v2, v0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v1

    check-cast v2, Lib/t;

    iget-object v2, v2, Lib/t;->c:Lib/a0;

    invoke-virtual {v2}, Lib/j;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lib/n;->d()V

    goto :goto_1

    :cond_3
    iget-object v2, v0, Lib/n;->y:Lib/m;

    iget v2, v2, Lib/m;->a:I

    iget-object v7, v0, Lib/n;->w:Ljava/util/concurrent/Executor;

    iget-object v8, v0, Lib/g;->Q:Lib/e;

    check-cast v1, Lib/t;

    iget v0, p0, Lib/f;->x:I

    add-int/lit8 v5, v0, -0x1

    if-gez v5, :cond_4

    iget-object v3, v1, Lib/t;->c:Lib/a0;

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Lib/a0;->h(IIILjava/util/concurrent/Executor;Lib/k;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v6

    add-int/lit8 v5, v5, 0x1

    iget-object v3, v1, Lib/t;->c:Lib/a0;

    const/4 v4, 0x2

    invoke-virtual/range {v3 .. v8}, Lib/a0;->h(IIILjava/util/concurrent/Executor;Lib/k;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
