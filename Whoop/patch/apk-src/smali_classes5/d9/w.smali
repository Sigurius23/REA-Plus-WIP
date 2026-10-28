.class public final Ld9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld9/x;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld9/w;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/w;->d:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ld9/w;->b:Landroid/os/Handler;

    .line 6
    new-instance p1, Ld9/v;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ld9/v;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld9/w;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltm/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld9/w;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/w;->d:Ljava/lang/Object;

    .line 2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Ld9/w;->b:Landroid/os/Handler;

    .line 3
    new-instance p1, Ld9/v;

    invoke-direct {p1, p0, v0}, Ld9/v;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld9/w;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Landroid/media/AudioTrack;)V
    .locals 1

    iget v0, p0, Ld9/w;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld9/w;->c:Ljava/lang/Object;

    check-cast v0, Ld9/v;

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->unregisterStreamEventCallback(Landroid/media/AudioTrack$StreamEventCallback;)V

    iget-object p1, p0, Ld9/w;->b:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ld9/w;->c:Ljava/lang/Object;

    check-cast v0, Ld9/v;

    invoke-virtual {p1, v0}, Landroid/media/AudioTrack;->unregisterStreamEventCallback(Landroid/media/AudioTrack$StreamEventCallback;)V

    iget-object p1, p0, Ld9/w;->b:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
