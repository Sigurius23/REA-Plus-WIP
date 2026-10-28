.class public abstract Lz1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz1/q;->a:Ljava/lang/Object;

    return-void
.end method

.method public static final a(II)V
    .locals 3

    if-ltz p0, :cond_0

    if-ge p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "index ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ") is out of bound of [0, "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Lz1/w;ILt1/c;Z)Z
    .locals 2

    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lz1/w;->d:I

    if-ne v1, p1, :cond_1

    iput-object p2, p0, Lz1/w;->c:Lt1/c;

    const/4 p1, 0x1

    if-eqz p3, :cond_0

    iget p2, p0, Lz1/w;->e:I

    add-int/2addr p2, p1

    iput p2, p0, Lz1/w;->e:I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    add-int/2addr v1, p1

    iput v1, p0, Lz1/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    monitor-exit v0

    return p1

    :goto_2
    monitor-exit v0

    throw p0
.end method

.method public static final c([JJ)I
    .locals 5

    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    aget-wide v3, p0, v2

    cmp-long v3, p1, v3

    if-lez v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-gez v3, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method public static final e(Lz1/p;)Lz1/w;
    .locals 2

    iget-object v0, p0, Lz1/p;->w:Lz1/w;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lz1/l;->t(Lz1/b0;Lz1/z;)Lz1/b0;

    move-result-object p0

    check-cast p0, Lz1/w;

    return-object p0
.end method

.method public static final f(Lz1/p;)I
    .locals 1

    iget-object p0, p0, Lz1/p;->w:Lz1/w;

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object p0

    check-cast p0, Lz1/w;

    iget p0, p0, Lz1/w;->e:I

    return p0
.end method

.method public static final g(Lz1/p;Lkotlin/jvm/functions/Function1;)Z
    .locals 7

    :cond_0
    sget-object v0, Lz1/q;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    iget v2, v1, Lz1/w;->d:I

    iget-object v1, v1, Lz1/w;->c:Lt1/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lt1/c;->g()Lt1/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lt1/f;->d()Lt1/c;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lz1/p;->w:Lz1/w;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    invoke-static {v1, p0, v5}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/w;

    const/4 v6, 0x1

    invoke-static {v1, v2, v0, v6}, Lz1/q;->b(Lz1/w;ILt1/c;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    invoke-static {v5, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0

    :cond_1
    :goto_0
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public abstract d()V
.end method
