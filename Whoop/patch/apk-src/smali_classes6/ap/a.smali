.class public final Lap/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lap/a;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljp/d;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Ljp/d;-><init>(Landroid/os/Looper;I)V

    iput-object v0, p0, Lap/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lap/a;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lap/a;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 3

    iget v0, p0, Lap/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lap/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, Lbq/b;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lap/a;->x:Ljava/lang/Object;

    check-cast v0, Ljp/d;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
