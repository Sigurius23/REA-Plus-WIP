.class public final Lm73/e;
.super Ll73/g;
.source "SourceFile"


# instance fields
.field public final a:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm73/e;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a()Ll73/f;
    .locals 2

    new-instance v0, Lm73/c;

    iget-object v1, p0, Lm73/e;->a:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lm73/c;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method public final b(Lu73/a;)Ln73/b;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    if-eqz v0, :cond_0

    new-instance v1, Lm73/d;

    iget-object v2, p0, Lm73/e;->a:Landroid/os/Handler;

    invoke-direct {v1, v2, p1}, Lm73/d;-><init>(Landroid/os/Handler;Ljava/lang/Runnable;)V

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;Ljava/lang/Runnable;)Landroid/os/Message;

    move-result-object p1

    const-wide/16 v3, 0x5

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    invoke-virtual {v2, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "unit == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
