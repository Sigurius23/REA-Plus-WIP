.class public final Lp9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/l;


# static fields
.field public static final E:Lbb/f;

.field public static final z:Lbb/f;


# instance fields
.field public final w:Lq9/a;

.field public x:Lp9/h;

.field public y:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbb/f;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v2, v3, v4, v1}, Lbb/f;-><init>(IJB)V

    sput-object v0, Lp9/k;->z:Lbb/f;

    new-instance v0, Lbb/f;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lbb/f;-><init>(IJB)V

    sput-object v0, Lp9/k;->E:Lbb/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "ExoPlayer:Loader:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    sget v0, Lx8/t;->a:I

    .line 3
    new-instance v0, Lk33/a;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lk33/a;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 4
    new-instance v0, Llive/hms/video/factories/c;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llive/hms/video/factories/c;-><init>(I)V

    .line 5
    new-instance v1, Lq9/a;

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v1, p1, v0}, Lq9/a;-><init>(Ljava/util/concurrent/ExecutorService;Llive/hms/video/factories/c;)V

    .line 6
    invoke-direct {p0, v1}, Lp9/k;-><init>(Lq9/a;)V

    return-void
.end method

.method public constructor <init>(Lq9/a;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lp9/k;->w:Lq9/a;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lp9/k;->x:Lp9/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lp9/j;)V
    .locals 3

    iget-object v0, p0, Lp9/k;->x:Lp9/h;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp9/h;->a(Z)V

    :cond_0
    iget-object v0, p0, Lp9/k;->w:Lq9/a;

    if-eqz p1, :cond_1

    new-instance v1, Lbq/b;

    const/16 v2, 0x14

    invoke-direct {v1, p1, v2}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lq9/a;->execute(Ljava/lang/Runnable;)V

    :cond_1
    iget-object p1, v0, Lq9/a;->x:Llive/hms/video/factories/c;

    iget-object v0, v0, Lq9/a;->w:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0}, Llive/hms/video/factories/c;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lp9/k;->y:Ljava/io/IOException;

    if-nez v0, :cond_2

    iget-object v0, p0, Lp9/k;->x:Lp9/h;

    if-eqz v0, :cond_1

    iget v1, v0, Lp9/h;->w:I

    iget-object v2, v0, Lp9/h;->E:Ljava/io/IOException;

    if-eqz v2, :cond_1

    iget v0, v0, Lp9/h;->F:I

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    throw v2

    :cond_1
    :goto_0
    return-void

    :cond_2
    throw v0
.end method

.method public final d(Lp9/i;Lp9/g;I)V
    .locals 8

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lva3/g;->j(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/k;->y:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    new-instance v0, Lp9/h;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lp9/h;-><init>(Lp9/k;Landroid/os/Looper;Lp9/i;Lp9/g;IJ)V

    iget-object p1, v1, Lp9/k;->x:Lp9/h;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lva3/g;->i(Z)V

    iput-object v0, v1, Lp9/k;->x:Lp9/h;

    invoke-virtual {v0}, Lp9/h;->b()V

    return-void
.end method
