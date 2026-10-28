.class public final Lxg3/l;
.super Lxg3/r;
.source "SourceFile"


# instance fields
.field public final synthetic x:Lbh3/b;

.field public final synthetic y:Lbh3/b;


# direct methods
.method public constructor <init>(Lbh3/b;Lbh3/b;)V
    .locals 0

    iput-object p1, p0, Lxg3/l;->x:Lbh3/b;

    iput-object p2, p0, Lxg3/l;->y:Lbh3/b;

    invoke-direct {p0}, Lxg3/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxg3/l;->x:Lbh3/b;

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lxg3/r;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lxg3/r;->b()V

    throw p1
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lxg3/l;->y:Lbh3/b;

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lxg3/r;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lxg3/r;->b()V

    throw p1
.end method
