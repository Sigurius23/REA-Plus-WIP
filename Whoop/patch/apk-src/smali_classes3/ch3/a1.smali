.class public final Lch3/a1;
.super Lxg3/r;
.source "SourceFile"


# instance fields
.field public final x:Lxg3/r;

.field public final y:Lbh3/g;

.field public z:Z


# direct methods
.method public constructor <init>(Lxg3/r;Lbh3/g;)V
    .locals 0

    invoke-direct {p0}, Lxg3/r;-><init>()V

    iput-object p1, p0, Lch3/a1;->x:Lxg3/r;

    iput-object p2, p0, Lch3/a1;->y:Lbh3/g;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lch3/a1;->z:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/a1;->z:Z

    iget-object v0, p0, Lch3/a1;->x:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lch3/a1;->y:Lbh3/g;

    invoke-interface {v0, p1}, Lbh3/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lch3/a1;->x:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->e(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/r;->b()V

    invoke-static {p1, v0}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {p0, v0}, Lch3/a1;->d(Ljava/lang/Throwable;)V

    return-void
.end method
