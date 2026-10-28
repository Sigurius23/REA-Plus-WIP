.class public final Lzk/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzk/z;
.implements Lul/b;


# static fields
.field public static final E:Ls/m2;


# instance fields
.field public final w:Lul/d;

.field public x:Lzk/z;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz40/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x14

    invoke-static {v1, v0}, Lul/c;->a(ILul/a;)Ls/m2;

    move-result-object v0

    sput-object v0, Lzk/y;->E:Ls/m2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lul/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzk/y;->w:Lul/d;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/y;->w:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/y;->z:Z

    iget-boolean v0, p0, Lzk/y;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lzk/y;->x:Lzk/z;

    invoke-interface {v0}, Lzk/z;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lzk/y;->x:Lzk/z;

    sget-object v0, Lzk/y;->E:Ls/m2;

    invoke-virtual {v0, p0}, Ls/m2;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b()Lul/d;
    .locals 1

    iget-object v0, p0, Lzk/y;->w:Lul/d;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lzk/y;->x:Lzk/z;

    invoke-interface {v0}, Lzk/z;->c()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/y;->w:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-boolean v0, p0, Lzk/y;->y:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzk/y;->y:Z

    iget-boolean v0, p0, Lzk/y;->z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzk/y;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzk/y;->x:Lzk/z;

    invoke-interface {v0}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lzk/y;->x:Lzk/z;

    invoke-interface {v0}, Lzk/z;->getSize()I

    move-result v0

    return v0
.end method
