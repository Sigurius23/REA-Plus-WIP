.class Lq52/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq52/f;-><init>(JJLbh3/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lbh3/b;

.field final synthetic x:Lq52/f;


# direct methods
.method public constructor <init>(Lq52/f;Lbh3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lq52/f$a;->x:Lq52/f;

    iput-object p2, p0, Lq52/f$a;->w:Lbh3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lq52/f$a;->x:Lq52/f;

    invoke-static {v0}, Lq52/f;->a(Lq52/f;)Landroid/os/Handler;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq52/f$a;->x:Lq52/f;

    invoke-static {v1}, Lq52/f;->b(Lq52/f;)Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lq52/f$a;->x:Lq52/f;

    invoke-static {v1}, Lq52/f;->c(Lq52/f;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-ltz v3, :cond_1

    iget-object v3, p0, Lq52/f$a;->w:Lbh3/b;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v1}, Lbh3/b;->b(Ljava/lang/Object;)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
