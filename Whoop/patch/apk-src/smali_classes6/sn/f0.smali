.class public final Lsn/f0;
.super Lsn/h;
.source "SourceFile"


# static fields
.field public static final r:Lrm/k0;


# instance fields
.field public final k:[Lsn/a;

.field public final l:[Lrm/o1;

.field public final m:Ljava/util/ArrayList;

.field public final n:Lng3/n;

.field public o:I

.field public p:[[J

.field public q:Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lrm/e0;

    invoke-direct {v0}, Lrm/e0;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    new-instance v2, Lrm/k0;

    new-instance v4, Lrm/g0;

    invoke-direct {v4, v0}, Lrm/f0;-><init>(Lrm/e0;)V

    new-instance v5, Lrm/h0;

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const v12, -0x800001

    move-wide v8, v6

    move-wide v10, v6

    move v13, v12

    invoke-direct/range {v5 .. v13}, Lrm/h0;-><init>(JJJFF)V

    sget-object v7, Lrm/m0;->h0:Lrm/m0;

    const-string v3, "MergingMediaSource"

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lrm/k0;-><init>(Ljava/lang/String;Lrm/g0;Lrm/i0;Lrm/h0;Lrm/m0;)V

    sput-object v2, Lsn/f0;->r:Lrm/k0;

    return-void
.end method

.method public varargs constructor <init>([Lsn/a;)V
    .locals 2

    new-instance v0, Lng3/n;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    invoke-direct {p0}, Lsn/h;-><init>()V

    iput-object p1, p0, Lsn/f0;->k:[Lsn/a;

    iput-object v0, p0, Lsn/f0;->n:Lng3/n;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lsn/f0;->m:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lsn/f0;->o:I

    array-length p1, p1

    new-array p1, p1, [Lrm/o1;

    iput-object p1, p0, Lsn/f0;->l:[Lrm/o1;

    const/4 p1, 0x0

    new-array p1, p1, [[J

    iput-object p1, p0, Lsn/f0;->p:[[J

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p1, "expectedKeys"

    const/16 v0, 0x8

    invoke-static {v0, p1}, Lzr/q;->c(ILjava/lang/String;)V

    const/4 p1, 0x2

    const-string v1, "expectedValuesPerKey"

    invoke-static {p1, v1}, Lzr/q;->c(ILjava/lang/String;)V

    invoke-static {v0}, Lzr/u;->a(I)Lzr/u;

    move-result-object p1

    new-instance v0, Lzr/r0;

    invoke-direct {v0}, Lzr/r0;-><init>()V

    new-instance v1, Lzr/s0;

    invoke-direct {v1, p1}, Lzr/s0;-><init>(Ljava/util/Map;)V

    iput-object v0, v1, Lzr/s0;->F:Lzr/r0;

    return-void
.end method


# virtual methods
.method public final a(Lsn/v;Lko/o;J)Lsn/s;
    .locals 10

    iget-object v0, p0, Lsn/f0;->k:[Lsn/a;

    array-length v1, v0

    new-array v2, v1, [Lsn/s;

    iget-object v3, p0, Lsn/f0;->l:[Lrm/o1;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    iget-object v6, p1, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v5

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v6, v3, v4

    invoke-virtual {v6, v5}, Lrm/o1;->l(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p1, v6}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object v6

    aget-object v7, v0, v4

    iget-object v8, p0, Lsn/f0;->p:[[J

    aget-object v8, v8, v5

    aget-wide v8, v8, v4

    sub-long v8, p3, v8

    invoke-virtual {v7, v6, p2, v8, v9}, Lsn/a;->a(Lsn/v;Lko/o;J)Lsn/s;

    move-result-object v6

    aput-object v6, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lsn/e0;

    iget-object p2, p0, Lsn/f0;->p:[[J

    aget-object p2, p2, v5

    iget-object p3, p0, Lsn/f0;->n:Lng3/n;

    invoke-direct {p1, p3, p2, v2}, Lsn/e0;-><init>(Lng3/n;[J[Lsn/s;)V

    return-object p1
.end method

.method public final f()Lrm/k0;
    .locals 2

    iget-object v0, p0, Lsn/f0;->k:[Lsn/a;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lsn/a;->f()Lrm/k0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lsn/f0;->r:Lrm/k0;

    return-object v0
.end method

.method public final g()V
    .locals 1

    iget-object v0, p0, Lsn/f0;->q:Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;

    if-nez v0, :cond_0

    invoke-super {p0}, Lsn/h;->g()V

    return-void

    :cond_0
    throw v0
.end method

.method public final i(Lko/j0;)V
    .locals 2

    iput-object p1, p0, Lsn/h;->j:Lko/j0;

    const/4 p1, 0x0

    invoke-static {p1}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lsn/h;->i:Landroid/os/Handler;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lsn/f0;->k:[Lsn/a;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aget-object v0, v0, p1

    invoke-virtual {p0, v1, v0}, Lsn/h;->r(Ljava/lang/Object;Lsn/a;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final k(Lsn/s;)V
    .locals 4

    check-cast p1, Lsn/e0;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lsn/f0;->k:[Lsn/a;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    iget-object v2, p1, Lsn/e0;->w:[Lsn/s;

    aget-object v2, v2, v0

    instance-of v3, v2, Lsn/c0;

    if-eqz v3, :cond_0

    check-cast v2, Lsn/c0;

    iget-object v2, v2, Lsn/c0;->w:Lsn/s;

    :cond_0
    invoke-virtual {v1, v2}, Lsn/a;->k(Lsn/s;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final m()V
    .locals 2

    invoke-super {p0}, Lsn/h;->m()V

    iget-object v0, p0, Lsn/f0;->l:[Lrm/o1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    iput v0, p0, Lsn/f0;->o:I

    iput-object v1, p0, Lsn/f0;->q:Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;

    iget-object v0, p0, Lsn/f0;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lsn/f0;->k:[Lsn/a;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final p(Ljava/lang/Object;Lsn/v;)Lsn/v;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final q(Ljava/lang/Object;Lsn/a;Lrm/o1;)V
    .locals 6

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Lsn/f0;->q:Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lsn/f0;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p3}, Lrm/o1;->h()I

    move-result v0

    iput v0, p0, Lsn/f0;->o:I

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lrm/o1;->h()I

    move-result v0

    iget v1, p0, Lsn/f0;->o:I

    if-eq v0, v1, :cond_2

    new-instance p1, Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    iput-object p1, p0, Lsn/f0;->q:Lcom/google/android/exoplayer2/source/MergingMediaSource$IllegalMergeException;

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lsn/f0;->p:[[J

    array-length v0, v0

    const/4 v1, 0x0

    iget-object v2, p0, Lsn/f0;->l:[Lrm/o1;

    if-nez v0, :cond_3

    iget v0, p0, Lsn/f0;->o:I

    array-length v3, v2

    const/4 v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x1

    aput v3, v4, v5

    aput v0, v4, v1

    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    iput-object v0, p0, Lsn/f0;->p:[[J

    :cond_3
    iget-object v0, p0, Lsn/f0;->m:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput-object p3, v2, p1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    aget-object p1, v2, v1

    invoke-virtual {p0, p1}, Lsn/a;->j(Lrm/o1;)V

    :cond_4
    :goto_1
    return-void
.end method
