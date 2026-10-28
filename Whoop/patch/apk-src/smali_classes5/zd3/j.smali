.class public final Lzd3/j;
.super Lyd3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lzd3/v;

.field public final synthetic f:Lzd3/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzd3/v;Lzd3/k;)V
    .locals 0

    iput-object p2, p0, Lzd3/j;->e:Lzd3/v;

    iput-object p3, p0, Lzd3/j;->f:Lzd3/k;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget-object v0, p0, Lzd3/j;->e:Lzd3/v;

    :try_start_0
    invoke-interface {v0}, Lzd3/v;->g()Lzd3/u;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    new-instance v2, Lzd3/u;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v1, v4}, Lzd3/u;-><init>(Lzd3/v;Lzd3/c;Ljava/lang/Throwable;I)V

    move-object v1, v2

    :goto_0
    iget-object v2, p0, Lzd3/j;->f:Lzd3/k;

    iget-object v3, v2, Lzd3/k;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v2, Lzd3/k;->F:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingDeque;->put(Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
