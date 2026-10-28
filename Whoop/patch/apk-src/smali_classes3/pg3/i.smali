.class public final Lpg3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/h;


# instance fields
.field public final synthetic w:I

.field public final x:Lpg3/k;


# direct methods
.method public synthetic constructor <init>(Lpg3/k;I)V
    .locals 0

    iput p2, p0, Lpg3/i;->w:I

    iput-object p1, p0, Lpg3/i;->x:Lpg3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Lpg3/e;Lpg3/v0;)V
    .locals 1

    iget p1, p0, Lpg3/i;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lpg3/i;->x:Lpg3/k;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object p1, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    iget-object v0, p0, Lpg3/i;->x:Lpg3/k;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lpg3/v0;->b:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lretrofit2/HttpException;

    invoke-direct {p1, p2}, Lretrofit2/HttpException;-><init>(Lpg3/v0;)V

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Lpg3/e;Ljava/lang/Throwable;)V
    .locals 0

    iget p1, p0, Lpg3/i;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lpg3/i;->x:Lpg3/k;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void

    :pswitch_0
    iget-object p1, p0, Lpg3/i;->x:Lpg3/k;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
