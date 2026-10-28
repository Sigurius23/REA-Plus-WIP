.class public final Leh3/j;
.super Lxg3/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Leh3/j;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Leh3/j;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgh3/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Leh3/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Leh3/j;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lxg3/j;
    .locals 2

    iget v0, p0, Leh3/j;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lzg3/b;

    iget-object v1, p0, Leh3/j;->b:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-direct {v0, v1}, Lzg3/b;-><init>(Landroid/os/Handler;)V

    return-object v0

    :pswitch_0
    new-instance v0, Leh3/k;

    iget-object v1, p0, Leh3/j;->b:Ljava/lang/Object;

    check-cast v1, Lgh3/i;

    invoke-direct {v0, v1}, Leh3/k;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
