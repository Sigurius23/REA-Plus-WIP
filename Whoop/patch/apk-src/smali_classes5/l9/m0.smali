.class public final Ll9/m0;
.super Ll9/j;
.source "SourceFile"


# static fields
.field public static final s:Lu8/x;


# instance fields
.field public final k:[Ll9/a;

.field public final l:Ljava/util/ArrayList;

.field public final m:[Lu8/o0;

.field public final n:Ljava/util/ArrayList;

.field public final o:Lg73/a;

.field public p:I

.field public q:[[J

.field public r:Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lt9/s;

    invoke-direct {v0}, Lt9/s;-><init>()V

    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    new-instance v1, Lf9/t;

    invoke-direct {v1}, Lf9/t;-><init>()V

    sget-object v8, Lu8/v;->a:Lu8/v;

    new-instance v2, Lu8/x;

    new-instance v4, Lu8/s;

    invoke-direct {v4, v0}, Lu8/r;-><init>(Lt9/s;)V

    new-instance v6, Lu8/t;

    invoke-direct {v6, v1}, Lu8/t;-><init>(Lf9/t;)V

    sget-object v7, Lu8/a0;->B:Lu8/a0;

    const-string v3, "MergingMediaSource"

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lu8/x;-><init>(Ljava/lang/String;Lu8/s;Lu8/u;Lu8/t;Lu8/a0;Lu8/v;)V

    sput-object v2, Ll9/m0;->s:Lu8/x;

    return-void
.end method

.method public varargs constructor <init>([Ll9/a;)V
    .locals 4

    new-instance v0, Lg73/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    invoke-direct {p0}, Ll9/j;-><init>()V

    iput-object p1, p0, Ll9/m0;->k:[Ll9/a;

    iput-object v0, p0, Ll9/m0;->o:Lg73/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll9/m0;->n:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Ll9/m0;->p:I

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll9/m0;->l:Ljava/util/ArrayList;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Ll9/m0;->l:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    array-length p1, p1

    new-array p1, p1, [Lu8/o0;

    iput-object p1, p0, Ll9/m0;->m:[Lu8/o0;

    new-array p1, v0, [[J

    iput-object p1, p0, Ll9/m0;->q:[[J

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
.method public final a(Ll9/c0;Lko/o;J)Ll9/a0;
    .locals 10

    iget-object v0, p0, Ll9/m0;->k:[Ll9/a;

    array-length v1, v0

    new-array v2, v1, [Ll9/a0;

    iget-object v3, p0, Ll9/m0;->m:[Lu8/o0;

    const/4 v4, 0x0

    aget-object v5, v3, v4

    iget-object v6, p1, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v5, v6}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v5

    :goto_0
    if-ge v4, v1, :cond_0

    aget-object v6, v3, v4

    invoke-virtual {v6, v5}, Lu8/o0;->l(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p1, v6}, Ll9/c0;->a(Ljava/lang/Object;)Ll9/c0;

    move-result-object v6

    aget-object v7, v0, v4

    iget-object v8, p0, Ll9/m0;->q:[[J

    aget-object v8, v8, v5

    aget-wide v8, v8, v4

    sub-long v8, p3, v8

    invoke-virtual {v7, v6, p2, v8, v9}, Ll9/a;->a(Ll9/c0;Lko/o;J)Ll9/a0;

    move-result-object v7

    aput-object v7, v2, v4

    iget-object v7, p0, Ll9/m0;->l:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    new-instance v8, Ll9/l0;

    aget-object v9, v2, v4

    invoke-direct {v8, v6, v9}, Ll9/l0;-><init>(Ll9/c0;Ll9/a0;)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ll9/k0;

    iget-object p2, p0, Ll9/m0;->q:[[J

    aget-object p2, p2, v5

    iget-object p3, p0, Ll9/m0;->o:Lg73/a;

    invoke-direct {p1, p3, p2, v2}, Ll9/k0;-><init>(Lg73/a;[J[Ll9/a0;)V

    return-object p1
.end method

.method public final g()Lu8/x;
    .locals 2

    iget-object v0, p0, Ll9/m0;->k:[Ll9/a;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll9/a;->g()Lu8/x;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ll9/m0;->s:Lu8/x;

    return-object v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Ll9/m0;->r:Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;

    if-nez v0, :cond_0

    invoke-super {p0}, Ll9/j;->i()V

    return-void

    :cond_0
    throw v0
.end method

.method public final k(Lz8/n;)V
    .locals 2

    iput-object p1, p0, Ll9/j;->j:Lz8/n;

    const/4 p1, 0x0

    invoke-static {p1}, Lx8/t;->m(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Ll9/j;->i:Landroid/os/Handler;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ll9/m0;->k:[Ll9/a;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aget-object v0, v0, p1

    invoke-virtual {p0, v1, v0}, Ll9/j;->w(Ljava/lang/Object;Ll9/a;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(Ll9/a0;)V
    .locals 7

    move-object v0, p1

    check-cast v0, Ll9/k0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Ll9/m0;->k:[Ll9/a;

    array-length v4, v3

    if-ge v2, v4, :cond_3

    iget-object v4, p0, Ll9/m0;->l:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    move v5, v1

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll9/l0;

    iget-object v6, v6, Ll9/l0;->b:Ll9/a0;

    invoke-virtual {v6, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    aget-object v3, v3, v2

    iget-object v4, v0, Ll9/k0;->w:[Ll9/a0;

    iget-object v5, v0, Ll9/k0;->x:[Z

    aget-boolean v5, v5, v2

    if-eqz v5, :cond_2

    aget-object v4, v4, v2

    check-cast v4, Ll9/f1;

    iget-object v4, v4, Ll9/f1;->w:Ll9/a0;

    goto :goto_3

    :cond_2
    aget-object v4, v4, v2

    :goto_3
    invoke-virtual {v3, v4}, Ll9/a;->m(Ll9/a0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final o()V
    .locals 2

    invoke-super {p0}, Ll9/j;->o()V

    iget-object v0, p0, Ll9/m0;->m:[Lu8/o0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, -0x1

    iput v0, p0, Ll9/m0;->p:I

    iput-object v1, p0, Ll9/m0;->r:Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;

    iget-object v0, p0, Ll9/m0;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Ll9/m0;->k:[Ll9/a;

    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final r(Lu8/x;)V
    .locals 2

    iget-object v0, p0, Ll9/m0;->k:[Ll9/a;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Ll9/a;->r(Lu8/x;)V

    return-void
.end method

.method public final s(Ljava/lang/Object;Ll9/c0;)Ll9/c0;
    .locals 4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ll9/m0;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll9/l0;

    iget-object v3, v3, Ll9/l0;->a:Ll9/c0;

    invoke-virtual {v3, p2}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll9/l0;

    iget-object p1, p1, Ll9/l0;->a:Ll9/c0;

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final v(Ljava/lang/Object;Ll9/a;Lu8/o0;)V
    .locals 6

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Ll9/m0;->r:Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Ll9/m0;->p:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p3}, Lu8/o0;->h()I

    move-result v0

    iput v0, p0, Ll9/m0;->p:I

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lu8/o0;->h()I

    move-result v0

    iget v1, p0, Ll9/m0;->p:I

    if-eq v0, v1, :cond_2

    new-instance p1, Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    iput-object p1, p0, Ll9/m0;->r:Landroidx/media3/exoplayer/source/MergingMediaSource$IllegalMergeException;

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Ll9/m0;->q:[[J

    array-length v0, v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll9/m0;->m:[Lu8/o0;

    if-nez v0, :cond_3

    iget v0, p0, Ll9/m0;->p:I

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

    iput-object v0, p0, Ll9/m0;->q:[[J

    :cond_3
    iget-object v0, p0, Ll9/m0;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    aput-object p3, v2, p1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    aget-object p1, v2, v1

    invoke-virtual {p0, p1}, Ll9/a;->l(Lu8/o0;)V

    :cond_4
    :goto_1
    return-void
.end method
