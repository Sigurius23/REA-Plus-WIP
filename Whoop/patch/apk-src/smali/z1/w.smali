.class public final Lz1/w;
.super Lz1/b0;
.source "SourceFile"


# instance fields
.field public c:Lt1/c;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(JLt1/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/b0;-><init>(J)V

    iput-object p3, p0, Lz1/w;->c:Lt1/c;

    return-void
.end method


# virtual methods
.method public final a(Lz1/b0;)V
    .locals 2

    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lz1/w;

    iget-object v1, v1, Lz1/w;->c:Lt1/c;

    iput-object v1, p0, Lz1/w;->c:Lt1/c;

    move-object v1, p1

    check-cast v1, Lz1/w;

    iget v1, v1, Lz1/w;->d:I

    iput v1, p0, Lz1/w;->d:I

    check-cast p1, Lz1/w;

    iget p1, p1, Lz1/w;->e:I

    iput p1, p0, Lz1/w;->e:I
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

    new-instance v0, Lz1/w;

    iget-object v1, p0, Lz1/w;->c:Lt1/c;

    invoke-direct {v0, p1, p2, v1}, Lz1/w;-><init>(JLt1/c;)V

    return-object v0
.end method
