.class public final Lxg3/m;
.super Lxg3/r;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lxg3/n;


# direct methods
.method public constructor <init>(Lxg3/n;)V
    .locals 0

    iput-object p1, p0, Lxg3/m;->x:Lxg3/n;

    invoke-direct {p0}, Lxg3/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lxg3/m;->x:Lxg3/n;

    iget-object v1, v0, Lxg3/n;->x:Lxg3/j;

    :try_start_0
    iget-object v0, v0, Lxg3/n;->w:Lxg3/r;

    invoke-virtual {v0, p1}, Lxg3/r;->d(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Lxg3/t;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v1}, Lxg3/t;->b()V

    throw p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lxg3/m;->x:Lxg3/n;

    :try_start_0
    iget-object v1, v0, Lxg3/n;->w:Lxg3/r;

    invoke-virtual {v1, p1}, Lxg3/r;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, v0, Lxg3/n;->x:Lxg3/j;

    invoke-interface {p1}, Lxg3/t;->b()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, v0, Lxg3/n;->x:Lxg3/j;

    invoke-interface {v0}, Lxg3/t;->b()V

    throw p1
.end method
