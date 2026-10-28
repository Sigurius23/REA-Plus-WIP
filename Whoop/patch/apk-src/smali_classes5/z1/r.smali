.class public final Lz1/r;
.super Lz1/b0;
.source "SourceFile"


# instance fields
.field public c:Ls1/d;

.field public d:I


# direct methods
.method public constructor <init>(JLs1/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b0;-><init>(J)V

    iput-object p3, p0, Lz1/r;->c:Ls1/d;

    return-void
.end method


# virtual methods
.method public final a(Lz1/b0;)V
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lz1/r;

    sget-object v0, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lz1/r;->c:Ls1/d;

    iput-object v1, p0, Lz1/r;->c:Ls1/d;

    iget p1, p1, Lz1/r;->d:I

    iput p1, p0, Lz1/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b(J)Lz1/b0;
    .locals 2

    new-instance v0, Lz1/r;

    iget-object v1, p0, Lz1/r;->c:Ls1/d;

    invoke-direct {v0, p1, p2, v1}, Lz1/r;-><init>(JLs1/d;)V

    return-object v0
.end method
