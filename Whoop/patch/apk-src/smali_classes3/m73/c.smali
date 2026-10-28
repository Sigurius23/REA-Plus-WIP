.class public final Lm73/c;
.super Ll73/f;
.source "SourceFile"


# instance fields
.field public final w:Landroid/os/Handler;

.field public volatile x:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm73/c;->w:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;
    .locals 3

    sget-object v0, Lq73/d;->w:Lq73/d;

    if-eqz p4, :cond_2

    iget-boolean v1, p0, Lm73/c;->x:Z

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lm73/d;

    iget-object v2, p0, Lm73/c;->w:Landroid/os/Handler;

    invoke-direct {v1, v2, p1}, Lm73/d;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    iput-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v2, p0, Lm73/c;->w:Landroid/os/Handler;

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    invoke-virtual {v2, p1, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-boolean p1, p0, Lm73/c;->x:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm73/c;->w:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "unit == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm73/c;->x:Z

    iget-object v0, p0, Lm73/c;->w:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lm73/c;->x:Z

    return v0
.end method
