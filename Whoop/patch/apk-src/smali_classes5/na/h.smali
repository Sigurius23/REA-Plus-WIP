.class public final Lna/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# static fields
.field public static final K:[B

.field public static final L:Lu8/p;


# instance fields
.field public A:Lna/g;

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Z

.field public G:Lt9/q;

.field public H:[Lt9/k0;

.field public I:[Lt9/k0;

.field public J:Z

.field public final a:Lqa/j;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:Lx8/n;

.field public final f:Lx8/n;

.field public final g:Lx8/n;

.field public final h:[B

.field public final i:Lx8/n;

.field public final j:Lea/b;

.field public final k:Lx8/n;

.field public final l:Ljava/util/ArrayDeque;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Lre/g;

.field public final o:Lt9/k0;

.field public p:Lzr/w0;

.field public q:I

.field public r:I

.field public s:J

.field public t:I

.field public u:Lx8/n;

.field public v:J

.field public w:I

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lna/h;->K:[B

    new-instance v0, Lu8/o;

    invoke-direct {v0}, Lu8/o;-><init>()V

    const-string v1, "application/x-emsg"

    invoke-static {v1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lu8/o;->m:Ljava/lang/String;

    new-instance v1, Lu8/p;

    invoke-direct {v1, v0}, Lu8/p;-><init>(Lu8/o;)V

    sput-object v1, Lna/h;->L:Lu8/p;

    return-void

    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(Lqa/j;I)V
    .locals 2

    .line 1
    sget-object v0, Lzr/g0;->x:Lzr/e0;

    .line 2
    sget-object v0, Lzr/w0;->E:Lzr/w0;

    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, p2, v0, v1}, Lna/h;-><init>(Lqa/j;ILjava/util/List;Le9/o;)V

    return-void
.end method

.method public constructor <init>(Lqa/j;ILjava/util/List;Le9/o;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lna/h;->a:Lqa/j;

    .line 6
    iput p2, p0, Lna/h;->b:I

    .line 7
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lna/h;->c:Ljava/util/List;

    .line 8
    iput-object p4, p0, Lna/h;->o:Lt9/k0;

    .line 9
    new-instance p1, Lea/b;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lea/b;-><init>(I)V

    iput-object p1, p0, Lna/h;->j:Lea/b;

    .line 10
    new-instance p1, Lx8/n;

    const/16 p3, 0x10

    invoke-direct {p1, p3}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lna/h;->k:Lx8/n;

    .line 11
    new-instance p1, Lx8/n;

    sget-object p4, Ly8/n;->a:[B

    invoke-direct {p1, p4}, Lx8/n;-><init>([B)V

    iput-object p1, p0, Lna/h;->e:Lx8/n;

    .line 12
    new-instance p1, Lx8/n;

    const/4 p4, 0x6

    invoke-direct {p1, p4}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lna/h;->f:Lx8/n;

    .line 13
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lna/h;->g:Lx8/n;

    .line 14
    new-array p1, p3, [B

    iput-object p1, p0, Lna/h;->h:[B

    .line 15
    new-instance p3, Lx8/n;

    invoke-direct {p3, p1}, Lx8/n;-><init>([B)V

    iput-object p3, p0, Lna/h;->i:Lx8/n;

    .line 16
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lna/h;->l:Ljava/util/ArrayDeque;

    .line 17
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lna/h;->m:Ljava/util/ArrayDeque;

    .line 18
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lna/h;->d:Landroid/util/SparseArray;

    .line 19
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 20
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 21
    iput-object p1, p0, Lna/h;->p:Lzr/w0;

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    iput-wide p3, p0, Lna/h;->y:J

    .line 23
    iput-wide p3, p0, Lna/h;->x:J

    .line 24
    iput-wide p3, p0, Lna/h;->z:J

    .line 25
    sget-object p1, Lt9/q;->u:Lt9/p;

    iput-object p1, p0, Lna/h;->G:Lt9/q;

    .line 26
    new-array p1, p2, [Lt9/k0;

    iput-object p1, p0, Lna/h;->H:[Lt9/k0;

    .line 27
    new-array p1, p2, [Lt9/k0;

    iput-object p1, p0, Lna/h;->I:[Lt9/k0;

    .line 28
    new-instance p1, Lre/g;

    new-instance p2, Lna/e;

    invoke-direct {p2, p0}, Lna/e;-><init>(Lna/h;)V

    invoke-direct {p1, p2}, Lre/g;-><init>(Ly8/r;)V

    iput-object p1, p0, Lna/h;->n:Lre/g;

    return-void
.end method

.method public static a(Ljava/util/List;)Lu8/l;
    .locals 9

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v1

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_4

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly8/d;

    iget v6, v5, La9/a;->x:I

    const v7, 0x70737368    # 3.013775E29f

    if-ne v6, v7, :cond_3

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iget-object v5, v5, Ly8/d;->y:Lx8/n;

    iget-object v5, v5, Lx8/n;->a:[B

    invoke-static {v5}, Lna/n;->j([B)Ldn/n;

    move-result-object v6

    if-nez v6, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    iget-object v6, v6, Ldn/n;->a:Ljava/util/UUID;

    :goto_1
    if-nez v6, :cond_2

    const-string v5, "FragmentedMp4Extractor"

    const-string v6, "Skipped pssh atom (failed to extract uuid)"

    invoke-static {v5, v6}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance v7, Lu8/k;

    const-string v8, "video/mp4"

    invoke-direct {v7, v6, v1, v8, v5}, Lu8/k;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    if-nez v4, :cond_5

    return-object v1

    :cond_5
    new-instance p0, Lu8/l;

    new-array v0, v2, [Lu8/k;

    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu8/k;

    invoke-direct {p0, v1, v2, v0}, Lu8/l;-><init>(Ljava/lang/String;Z[Lu8/k;)V

    return-object p0
.end method

.method public static c(Lx8/n;ILdn/s;)V
    .locals 5

    add-int/lit8 p1, p1, 0x8

    invoke-virtual {p0, p1}, Lx8/n;->F(I)V

    invoke-virtual {p0}, Lx8/n;->g()I

    move-result p1

    sget-object v0, Lna/c;->a:[B

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    and-int/lit8 p1, p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    invoke-virtual {p0}, Lx8/n;->x()I

    move-result v2

    if-nez v2, :cond_1

    iget-object p0, p2, Ldn/s;->k:[Z

    iget p1, p2, Ldn/s;->d:I

    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    return-void

    :cond_1
    iget v3, p2, Ldn/s;->d:I

    iget-object v4, p2, Ldn/s;->q:Ljava/lang/Object;

    check-cast v4, Lx8/n;

    if-ne v2, v3, :cond_2

    iget-object v3, p2, Ldn/s;->k:[Z

    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    invoke-virtual {p0}, Lx8/n;->a()I

    move-result p1

    invoke-virtual {v4, p1}, Lx8/n;->C(I)V

    iput-boolean v1, p2, Ldn/s;->j:Z

    iput-boolean v1, p2, Ldn/s;->l:Z

    iget-object p1, v4, Lx8/n;->a:[B

    iget v1, v4, Lx8/n;->c:I

    invoke-virtual {p0, p1, v0, v1}, Lx8/n;->e([BII)V

    invoke-virtual {v4, v0}, Lx8/n;->F(I)V

    iput-boolean v0, p2, Ldn/s;->l:Z

    return-void

    :cond_2
    const-string p0, "Senc sample count "

    const-string p1, " is different from fragment sample count"

    invoke-static {v2, p0, p1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    iget p1, p2, Ldn/s;->d:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p0

    throw p0

    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    invoke-static {p0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final b(JJ)V
    .locals 3

    iget-object p1, p0, Lna/h;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lna/g;

    invoke-virtual {v2}, Lna/g;->f()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lna/h;->m:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput v0, p0, Lna/h;->w:I

    iget-object p1, p0, Lna/h;->n:Lre/g;

    iget-object p1, p1, Lre/g;->e:Ljava/io/Serializable;

    check-cast p1, Ljava/util/PriorityQueue;

    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    iput-wide p3, p0, Lna/h;->x:J

    iget-object p1, p0, Lna/h;->l:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    iput v0, p0, Lna/h;->q:I

    iput v0, p0, Lna/h;->t:I

    return-void
.end method

.method public final d(J)V
    .locals 52

    move-object/from16 v0, p0

    :cond_0
    :goto_0
    iget-object v1, v0, Lna/h;->l:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_57

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly8/c;

    iget-wide v4, v2, Ly8/c;->y:J

    cmp-long v2, v4, p1

    if-nez v2, :cond_57

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ly8/c;

    iget v2, v4, La9/a;->x:I

    iget-object v5, v4, Ly8/c;->E:Ljava/util/ArrayList;

    iget-object v6, v4, Ly8/c;->z:Ljava/util/ArrayList;

    const v7, 0x6d6f6f76

    iget v8, v0, Lna/h;->b:I

    const/16 v10, 0xc

    iget-object v15, v0, Lna/h;->d:Landroid/util/SparseArray;

    if-ne v2, v7, :cond_b

    move v7, v8

    invoke-static {v6}, Lna/h;->a(Ljava/util/List;)Lu8/l;

    move-result-object v8

    const v1, 0x6d766578

    invoke-virtual {v4, v1}, Ly8/c;->o(I)Ly8/c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, v1, Ly8/c;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    if-ge v6, v5, :cond_4

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly8/d;

    iget v3, v11, La9/a;->x:I

    iget-object v11, v11, Ly8/d;->y:Lx8/n;

    const/16 v17, 0x1

    const v12, 0x74726578

    if-ne v3, v12, :cond_1

    invoke-virtual {v11, v10}, Lx8/n;->F(I)V

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v3

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v12

    add-int/lit8 v12, v12, -0x1

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v10

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v9

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v18, v1

    new-instance v1, Lna/d;

    invoke-direct {v1, v12, v10, v9, v11}, Lna/d;-><init>(IIII)V

    invoke-static {v3, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lna/d;

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_1
    move-object/from16 v18, v1

    const v1, 0x6d656864

    if-ne v3, v1, :cond_3

    const/16 v1, 0x8

    invoke-virtual {v11, v1}, Lx8/n;->F(I)V

    invoke-virtual {v11}, Lx8/n;->g()I

    move-result v1

    invoke-static {v1}, Lna/c;->c(I)I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v11}, Lx8/n;->v()J

    move-result-wide v9

    goto :goto_2

    :cond_2
    invoke-virtual {v11}, Lx8/n;->y()J

    move-result-wide v9

    :goto_2
    move-wide v13, v9

    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, v18

    const/16 v10, 0xc

    goto :goto_1

    :cond_4
    const/16 v17, 0x1

    new-instance v5, Lt9/x;

    invoke-direct {v5}, Lt9/x;-><init>()V

    and-int/lit8 v1, v7, 0x10

    if-eqz v1, :cond_5

    move/from16 v9, v17

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    new-instance v11, Lna/e;

    invoke-direct {v11, v0}, Lna/e;-><init>(Lna/h;)V

    const/4 v10, 0x0

    move-wide v6, v13

    invoke-static/range {v4 .. v11}, Lna/c;->g(Ly8/c;Lt9/x;JLu8/l;ZZLyr/e;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-nez v4, :cond_8

    invoke-static {v1}, Lna/n;->c(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v3, :cond_7

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lna/q;

    iget-object v7, v6, Lna/q;->a:Lna/o;

    iget-object v8, v0, Lna/h;->G:Lt9/q;

    iget v9, v7, Lna/o;->b:I

    iget v10, v7, Lna/o;->a:I

    invoke-interface {v8, v5, v9}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Lna/g;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v11

    move/from16 v12, v17

    if-ne v11, v12, :cond_6

    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lna/d;

    goto :goto_6

    :cond_6
    invoke-virtual {v2, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lna/d;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_6
    invoke-direct {v9, v8, v6, v12, v4}, Lna/g;-><init>(Lt9/k0;Lna/q;Lna/d;Ljava/lang/String;)V

    invoke-virtual {v15, v10, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-wide v8, v0, Lna/h;->y:J

    iget-wide v6, v7, Lna/o;->e:J

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iput-wide v6, v0, Lna/h;->y:J

    add-int/lit8 v5, v5, 0x1

    const/16 v17, 0x1

    goto :goto_5

    :cond_7
    iget-object v1, v0, Lna/h;->G:Lt9/q;

    invoke-interface {v1}, Lt9/q;->l()V

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-ne v4, v3, :cond_9

    const/4 v4, 0x1

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    :goto_7
    invoke-static {v4}, Lva3/g;->i(Z)V

    const/4 v4, 0x0

    :goto_8
    if-ge v4, v3, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lna/q;

    iget-object v6, v5, Lna/q;->a:Lna/o;

    iget v7, v6, Lna/o;->a:I

    invoke-virtual {v15, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lna/g;

    iget v6, v6, Lna/o;->a:I

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v8

    const/4 v12, 0x1

    if-ne v8, v12, :cond_a

    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lna/d;

    goto :goto_9

    :cond_a
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lna/d;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_9
    invoke-virtual {v7, v5, v6}, Lna/g;->e(Lna/q;Lna/d;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_b
    move v7, v8

    const v3, 0x6d6f6f66

    if-ne v2, v3, :cond_56

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v11, 0x0

    :goto_a
    if-ge v11, v1, :cond_50

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly8/c;

    iget v4, v3, La9/a;->x:I

    const v8, 0x74726166

    if-ne v4, v8, :cond_4f

    const v4, 0x74666864

    invoke-virtual {v3, v4}, Ly8/c;->p(I)Ly8/d;

    move-result-object v4

    iget-object v8, v3, Ly8/c;->z:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, Ly8/d;->y:Lx8/n;

    const/16 v9, 0x8

    invoke-virtual {v4, v9}, Lx8/n;->F(I)V

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v9

    sget-object v10, Lna/c;->a:[B

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v10

    invoke-virtual {v15, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lna/g;

    if-nez v10, :cond_c

    move/from16 v21, v1

    const/4 v10, 0x0

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_10

    :cond_c
    iget-object v12, v10, Lna/g;->b:Ldn/s;

    and-int/lit8 v18, v9, 0x1

    if-eqz v18, :cond_d

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual {v4}, Lx8/n;->y()J

    move-result-wide v13

    iput-wide v13, v12, Ldn/s;->a:J

    iput-wide v13, v12, Ldn/s;->b:J

    goto :goto_b

    :cond_d
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    :goto_b
    iget-object v13, v10, Lna/g;->e:Lna/d;

    and-int/lit8 v14, v9, 0x2

    if-eqz v14, :cond_e

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v14

    const/16 v17, 0x1

    add-int/lit8 v14, v14, -0x1

    goto :goto_c

    :cond_e
    iget v14, v13, Lna/d;->a:I

    :goto_c
    and-int/lit8 v20, v9, 0x8

    if-eqz v20, :cond_f

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v20

    move/from16 v2, v20

    goto :goto_d

    :cond_f
    iget v2, v13, Lna/d;->b:I

    :goto_d
    and-int/lit8 v21, v9, 0x10

    if-eqz v21, :cond_10

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v21

    move/from16 v51, v21

    move/from16 v21, v1

    move/from16 v1, v51

    goto :goto_e

    :cond_10
    move/from16 v21, v1

    iget v1, v13, Lna/d;->c:I

    :goto_e
    and-int/lit8 v9, v9, 0x20

    if-eqz v9, :cond_11

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v4

    goto :goto_f

    :cond_11
    iget v4, v13, Lna/d;->d:I

    :goto_f
    new-instance v9, Lna/d;

    invoke-direct {v9, v14, v2, v1, v4}, Lna/d;-><init>(IIII)V

    iput-object v9, v12, Ldn/s;->o:Ljava/lang/Object;

    :goto_10
    if-nez v10, :cond_13

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v49, v7

    move/from16 v46, v11

    const/4 v12, 0x1

    const/16 v13, 0xc

    :cond_12
    const/16 v9, 0x8

    goto/16 :goto_37

    :cond_13
    iget-object v1, v10, Lna/g;->b:Ldn/s;

    iget-wide v12, v1, Ldn/s;->m:J

    iget-boolean v2, v1, Ldn/s;->n:Z

    invoke-virtual {v10}, Lna/g;->f()V

    const/4 v4, 0x1

    iput-boolean v4, v10, Lna/g;->m:Z

    const v9, 0x74666474

    invoke-virtual {v3, v9}, Ly8/c;->p(I)Ly8/d;

    move-result-object v9

    if-eqz v9, :cond_15

    and-int/lit8 v14, v7, 0x2

    if-nez v14, :cond_15

    iget-object v2, v9, Ly8/d;->y:Lx8/n;

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->g()I

    move-result v9

    invoke-static {v9}, Lna/c;->c(I)I

    move-result v9

    if-ne v9, v4, :cond_14

    invoke-virtual {v2}, Lx8/n;->y()J

    move-result-wide v12

    goto :goto_11

    :cond_14
    invoke-virtual {v2}, Lx8/n;->v()J

    move-result-wide v12

    :goto_11
    iput-wide v12, v1, Ldn/s;->m:J

    iput-boolean v4, v1, Ldn/s;->n:Z

    goto :goto_12

    :cond_15
    iput-wide v12, v1, Ldn/s;->m:J

    iput-boolean v2, v1, Ldn/s;->n:Z

    :goto_12
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_13
    const v13, 0x7472756e

    if-ge v4, v2, :cond_17

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly8/d;

    move/from16 v22, v4

    iget v4, v14, La9/a;->x:I

    if-ne v4, v13, :cond_16

    iget-object v4, v14, Ly8/d;->y:Lx8/n;

    const/16 v13, 0xc

    invoke-virtual {v4, v13}, Lx8/n;->F(I)V

    invoke-virtual {v4}, Lx8/n;->x()I

    move-result v4

    if-lez v4, :cond_16

    add-int/2addr v12, v4

    add-int/lit8 v9, v9, 0x1

    :cond_16
    add-int/lit8 v4, v22, 0x1

    goto :goto_13

    :cond_17
    const/4 v4, 0x0

    iput v4, v10, Lna/g;->h:I

    iput v4, v10, Lna/g;->g:I

    iput v4, v10, Lna/g;->f:I

    iput v9, v1, Ldn/s;->c:I

    iput v12, v1, Ldn/s;->d:I

    iget-object v4, v1, Ldn/s;->f:[I

    array-length v4, v4

    if-ge v4, v9, :cond_18

    new-array v4, v9, [J

    iput-object v4, v1, Ldn/s;->e:[J

    new-array v4, v9, [I

    iput-object v4, v1, Ldn/s;->f:[I

    :cond_18
    iget-object v4, v1, Ldn/s;->g:[I

    array-length v4, v4

    if-ge v4, v12, :cond_19

    mul-int/lit8 v12, v12, 0x7d

    div-int/lit8 v12, v12, 0x64

    new-array v4, v12, [I

    iput-object v4, v1, Ldn/s;->g:[I

    new-array v4, v12, [J

    iput-object v4, v1, Ldn/s;->h:[J

    new-array v4, v12, [Z

    iput-object v4, v1, Ldn/s;->i:[Z

    new-array v4, v12, [Z

    iput-object v4, v1, Ldn/s;->k:[Z

    :cond_19
    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_14
    const-wide/16 v22, 0x0

    const/16 v24, 0x10

    if-ge v4, v2, :cond_31

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v14, v25

    check-cast v14, Ly8/d;

    move/from16 v25, v2

    iget v2, v14, La9/a;->x:I

    if-ne v2, v13, :cond_30

    add-int/lit8 v2, v9, 0x1

    iget-object v14, v14, Ly8/d;->y:Lx8/n;

    const/16 v13, 0x8

    invoke-virtual {v14, v13}, Lx8/n;->F(I)V

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v13

    sget-object v27, Lna/c;->a:[B

    move/from16 v27, v2

    iget-object v2, v10, Lna/g;->d:Lna/q;

    iget-object v2, v2, Lna/q;->a:Lna/o;

    move/from16 v28, v4

    iget-object v4, v1, Ldn/s;->o:Ljava/lang/Object;

    check-cast v4, Lna/d;

    sget v29, Lx8/t;->a:I

    move-object/from16 v29, v5

    iget-object v5, v1, Ldn/s;->f:[I

    invoke-virtual {v14}, Lx8/n;->x()I

    move-result v30

    aput v30, v5, v9

    iget-object v5, v1, Ldn/s;->e:[J

    move-object/from16 v31, v5

    move-object/from16 v30, v6

    iget-wide v5, v1, Ldn/s;->a:J

    aput-wide v5, v31, v9

    and-int/lit8 v32, v13, 0x1

    if-eqz v32, :cond_1a

    move-wide/from16 v32, v5

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v5

    int-to-long v5, v5

    add-long v5, v32, v5

    aput-wide v5, v31, v9

    :cond_1a
    and-int/lit8 v5, v13, 0x4

    if-eqz v5, :cond_1b

    const/4 v5, 0x1

    goto :goto_15

    :cond_1b
    const/4 v5, 0x0

    :goto_15
    iget v6, v4, Lna/d;->d:I

    if-eqz v5, :cond_1c

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v6

    :cond_1c
    move/from16 v31, v5

    and-int/lit16 v5, v13, 0x100

    if-eqz v5, :cond_1d

    const/4 v5, 0x1

    goto :goto_16

    :cond_1d
    const/4 v5, 0x0

    :goto_16
    move/from16 v32, v5

    and-int/lit16 v5, v13, 0x200

    if-eqz v5, :cond_1e

    const/4 v5, 0x1

    goto :goto_17

    :cond_1e
    const/4 v5, 0x0

    :goto_17
    move/from16 v33, v5

    and-int/lit16 v5, v13, 0x400

    if-eqz v5, :cond_1f

    const/4 v5, 0x1

    goto :goto_18

    :cond_1f
    const/4 v5, 0x0

    :goto_18
    and-int/lit16 v13, v13, 0x800

    if-eqz v13, :cond_20

    const/4 v13, 0x1

    :goto_19
    move/from16 v34, v5

    goto :goto_1a

    :cond_20
    const/4 v13, 0x0

    goto :goto_19

    :goto_1a
    iget-object v5, v2, Lna/o;->i:[J

    move/from16 v35, v6

    iget-object v6, v2, Lna/o;->j:[J

    if-eqz v5, :cond_23

    move-object/from16 v36, v6

    array-length v6, v5

    move-object/from16 v37, v5

    const/4 v5, 0x1

    if-ne v6, v5, :cond_23

    if-nez v36, :cond_21

    goto :goto_1c

    :cond_21
    const/16 v16, 0x0

    aget-wide v38, v37, v16

    cmp-long v5, v38, v22

    if-nez v5, :cond_22

    goto :goto_1b

    :cond_22
    iget-wide v5, v2, Lna/o;->d:J

    sget-object v44, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v40, 0xf4240

    move-wide/from16 v42, v5

    invoke-static/range {v38 .. v44}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    aget-wide v40, v36, v16

    const-wide/32 v42, 0xf4240

    move-wide/from16 v37, v5

    iget-wide v5, v2, Lna/o;->c:J

    move-object/from16 v46, v44

    move-wide/from16 v44, v5

    invoke-static/range {v40 .. v46}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    add-long v5, v37, v5

    move-wide/from16 v37, v5

    iget-wide v5, v2, Lna/o;->e:J

    cmp-long v5, v37, v5

    if-ltz v5, :cond_23

    :goto_1b
    aget-wide v22, v36, v16

    :cond_23
    :goto_1c
    iget-object v5, v1, Ldn/s;->g:[I

    iget-object v6, v1, Ldn/s;->h:[J

    move-object/from16 v36, v5

    iget-object v5, v1, Ldn/s;->i:[Z

    move-object/from16 v37, v5

    iget v5, v2, Lna/o;->b:I

    move-object/from16 v38, v6

    const/4 v6, 0x2

    if-ne v5, v6, :cond_24

    and-int/lit8 v5, v7, 0x1

    if-eqz v5, :cond_24

    const/4 v5, 0x1

    goto :goto_1d

    :cond_24
    const/4 v5, 0x0

    :goto_1d
    iget-object v6, v1, Ldn/s;->f:[I

    aget v6, v6, v9

    add-int/2addr v6, v12

    move/from16 v46, v11

    move/from16 v26, v12

    iget-wide v11, v2, Lna/o;->c:J

    move-wide/from16 v43, v11

    iget-wide v11, v1, Ldn/s;->m:J

    move/from16 v2, v26

    :goto_1e
    if-ge v2, v6, :cond_2f

    if-eqz v32, :cond_25

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v9

    :goto_1f
    move/from16 v26, v2

    goto :goto_20

    :cond_25
    iget v9, v4, Lna/d;->b:I

    goto :goto_1f

    :goto_20
    const-string v2, "Unexpected negative value: "

    if-ltz v9, :cond_2e

    if-eqz v33, :cond_26

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v39

    move/from16 v47, v5

    move/from16 v5, v39

    goto :goto_21

    :cond_26
    move/from16 v47, v5

    iget v5, v4, Lna/d;->c:I

    :goto_21
    if-ltz v5, :cond_2d

    if-eqz v34, :cond_27

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v2

    goto :goto_22

    :cond_27
    if-nez v26, :cond_28

    if-eqz v31, :cond_28

    move/from16 v2, v35

    goto :goto_22

    :cond_28
    iget v2, v4, Lna/d;->d:I

    :goto_22
    if-eqz v13, :cond_29

    invoke-virtual {v14}, Lx8/n;->g()I

    move-result v39

    move/from16 v48, v2

    move/from16 v2, v39

    :goto_23
    move/from16 v50, v6

    move/from16 v49, v7

    goto :goto_24

    :cond_29
    move/from16 v48, v2

    const/4 v2, 0x0

    goto :goto_23

    :goto_24
    int-to-long v6, v2

    add-long/2addr v6, v11

    sub-long v39, v6, v22

    const-wide/32 v41, 0xf4240

    sget-object v45, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-static/range {v39 .. v45}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    aput-wide v6, v38, v26

    iget-boolean v2, v1, Ldn/s;->n:Z

    if-nez v2, :cond_2a

    iget-object v2, v10, Lna/g;->d:Lna/q;

    move-wide/from16 v39, v6

    iget-wide v6, v2, Lna/q;->h:J

    add-long v6, v39, v6

    aput-wide v6, v38, v26

    :cond_2a
    aput v5, v36, v26

    shr-int/lit8 v2, v48, 0x10

    const/16 v17, 0x1

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_2c

    if-eqz v47, :cond_2b

    if-nez v26, :cond_2c

    :cond_2b
    const/4 v2, 0x1

    goto :goto_25

    :cond_2c
    const/4 v2, 0x0

    :goto_25
    aput-boolean v2, v37, v26

    int-to-long v5, v9

    add-long/2addr v11, v5

    add-int/lit8 v2, v26, 0x1

    move/from16 v5, v47

    move/from16 v7, v49

    move/from16 v6, v50

    goto/16 :goto_1e

    :cond_2d
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_2e
    const/4 v3, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_2f
    move/from16 v50, v6

    move/from16 v49, v7

    iput-wide v11, v1, Ldn/s;->m:J

    move/from16 v9, v27

    move/from16 v12, v50

    goto :goto_26

    :cond_30
    move/from16 v28, v4

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v49, v7

    move/from16 v46, v11

    move/from16 v26, v12

    :goto_26
    add-int/lit8 v4, v28, 0x1

    move/from16 v2, v25

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move/from16 v11, v46

    move/from16 v7, v49

    const v13, 0x7472756e

    goto/16 :goto_14

    :cond_31
    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v49, v7

    move/from16 v46, v11

    iget-object v2, v10, Lna/g;->d:Lna/q;

    iget-object v2, v2, Lna/q;->a:Lna/o;

    iget-object v4, v1, Ldn/s;->o:Ljava/lang/Object;

    check-cast v4, Lna/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v4, Lna/d;->a:I

    iget-object v2, v2, Lna/o;->l:[Lna/p;

    aget-object v2, v2, v4

    const v4, 0x7361697a

    invoke-virtual {v3, v4}, Ly8/c;->p(I)Ly8/d;

    move-result-object v4

    if-eqz v4, :cond_38

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, Ly8/d;->y:Lx8/n;

    iget v5, v2, Lna/p;->d:I

    const/16 v9, 0x8

    invoke-virtual {v4, v9}, Lx8/n;->F(I)V

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v6

    sget-object v7, Lna/c;->a:[B

    const/4 v12, 0x1

    and-int/2addr v6, v12

    if-ne v6, v12, :cond_32

    invoke-virtual {v4, v9}, Lx8/n;->G(I)V

    :cond_32
    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v6

    invoke-virtual {v4}, Lx8/n;->x()I

    move-result v7

    iget v9, v1, Ldn/s;->d:I

    if-gt v7, v9, :cond_37

    if-nez v6, :cond_35

    iget-object v6, v1, Ldn/s;->k:[Z

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_27
    if-ge v9, v7, :cond_34

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v11

    add-int/2addr v10, v11

    if-le v11, v5, :cond_33

    const/4 v11, 0x1

    goto :goto_28

    :cond_33
    const/4 v11, 0x0

    :goto_28
    aput-boolean v11, v6, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_27

    :cond_34
    const/4 v11, 0x0

    goto :goto_2a

    :cond_35
    if-le v6, v5, :cond_36

    const/4 v4, 0x1

    goto :goto_29

    :cond_36
    const/4 v4, 0x0

    :goto_29
    mul-int v10, v6, v7

    iget-object v5, v1, Ldn/s;->k:[Z

    const/4 v11, 0x0

    invoke-static {v5, v11, v7, v4}, Ljava/util/Arrays;->fill([ZIIZ)V

    :goto_2a
    iget-object v4, v1, Ldn/s;->k:[Z

    iget v5, v1, Ldn/s;->d:I

    invoke-static {v4, v7, v5, v11}, Ljava/util/Arrays;->fill([ZIIZ)V

    if-lez v10, :cond_38

    iget-object v4, v1, Ldn/s;->q:Ljava/lang/Object;

    check-cast v4, Lx8/n;

    invoke-virtual {v4, v10}, Lx8/n;->C(I)V

    const/4 v12, 0x1

    iput-boolean v12, v1, Ldn/s;->j:Z

    iput-boolean v12, v1, Ldn/s;->l:Z

    goto :goto_2b

    :cond_37
    const-string v2, "Saiz sample count "

    const-string v3, " is greater than fragment sample count"

    invoke-static {v7, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v1, v1, Ldn/s;->d:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_38
    :goto_2b
    const v4, 0x7361696f

    invoke-virtual {v3, v4}, Ly8/c;->p(I)Ly8/d;

    move-result-object v4

    if-eqz v4, :cond_3b

    iget-object v4, v4, Ly8/d;->y:Lx8/n;

    const/16 v9, 0x8

    invoke-virtual {v4, v9}, Lx8/n;->F(I)V

    invoke-virtual {v4}, Lx8/n;->g()I

    move-result v5

    sget-object v6, Lna/c;->a:[B

    and-int/lit8 v6, v5, 0x1

    const/4 v12, 0x1

    if-ne v6, v12, :cond_39

    invoke-virtual {v4, v9}, Lx8/n;->G(I)V

    :cond_39
    invoke-virtual {v4}, Lx8/n;->x()I

    move-result v6

    if-ne v6, v12, :cond_3c

    invoke-static {v5}, Lna/c;->c(I)I

    move-result v5

    iget-wide v6, v1, Ldn/s;->b:J

    if-nez v5, :cond_3a

    invoke-virtual {v4}, Lx8/n;->v()J

    move-result-wide v4

    goto :goto_2c

    :cond_3a
    invoke-virtual {v4}, Lx8/n;->y()J

    move-result-wide v4

    :goto_2c
    add-long/2addr v6, v4

    iput-wide v6, v1, Ldn/s;->b:J

    :cond_3b
    const/4 v4, 0x0

    goto :goto_2d

    :cond_3c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected saio entry count: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v4, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :goto_2d
    const v5, 0x73656e63

    invoke-virtual {v3, v5}, Ly8/c;->p(I)Ly8/d;

    move-result-object v3

    if-eqz v3, :cond_3d

    iget-object v3, v3, Ly8/d;->y:Lx8/n;

    const/4 v11, 0x0

    invoke-static {v3, v11, v1}, Lna/h;->c(Lx8/n;ILdn/s;)V

    :cond_3d
    if-eqz v2, :cond_3e

    iget-object v3, v2, Lna/p;->b:Ljava/lang/String;

    move-object/from16 v33, v3

    goto :goto_2e

    :cond_3e
    move-object/from16 v33, v4

    :goto_2e
    move-object v2, v4

    move-object v3, v2

    const/4 v5, 0x0

    :goto_2f
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_41

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly8/d;

    iget-object v7, v6, Ly8/d;->y:Lx8/n;

    iget v6, v6, La9/a;->x:I

    const v9, 0x73626770

    const v10, 0x73656967

    if-ne v6, v9, :cond_3f

    const/16 v13, 0xc

    invoke-virtual {v7, v13}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v6

    if-ne v6, v10, :cond_40

    move-object v3, v7

    goto :goto_30

    :cond_3f
    const/16 v13, 0xc

    const v9, 0x73677064

    if-ne v6, v9, :cond_40

    invoke-virtual {v7, v13}, Lx8/n;->F(I)V

    invoke-virtual {v7}, Lx8/n;->g()I

    move-result v6

    if-ne v6, v10, :cond_40

    move-object v2, v7

    :cond_40
    :goto_30
    add-int/lit8 v5, v5, 0x1

    goto :goto_2f

    :cond_41
    const/16 v13, 0xc

    if-eqz v3, :cond_42

    if-nez v2, :cond_43

    :cond_42
    :goto_31
    const/4 v12, 0x1

    goto/16 :goto_34

    :cond_43
    const/16 v9, 0x8

    invoke-virtual {v3, v9}, Lx8/n;->F(I)V

    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v5

    invoke-static {v5}, Lna/c;->c(I)I

    move-result v5

    const/4 v6, 0x4

    invoke-virtual {v3, v6}, Lx8/n;->G(I)V

    const/4 v12, 0x1

    if-ne v5, v12, :cond_44

    invoke-virtual {v3, v6}, Lx8/n;->G(I)V

    :cond_44
    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v3

    if-ne v3, v12, :cond_4c

    invoke-virtual {v2, v9}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->g()I

    move-result v3

    invoke-static {v3}, Lna/c;->c(I)I

    move-result v3

    invoke-virtual {v2, v6}, Lx8/n;->G(I)V

    if-ne v3, v12, :cond_46

    invoke-virtual {v2}, Lx8/n;->v()J

    move-result-wide v9

    cmp-long v3, v9, v22

    if-eqz v3, :cond_45

    goto :goto_32

    :cond_45
    const-string v1, "Variable length description in sgpd found (unsupported)"

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_46
    const/4 v5, 0x2

    if-lt v3, v5, :cond_47

    invoke-virtual {v2, v6}, Lx8/n;->G(I)V

    :cond_47
    :goto_32
    invoke-virtual {v2}, Lx8/n;->v()J

    move-result-wide v9

    const-wide/16 v11, 0x1

    cmp-long v3, v9, v11

    if-nez v3, :cond_4b

    const/4 v12, 0x1

    invoke-virtual {v2, v12}, Lx8/n;->G(I)V

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v3

    and-int/lit16 v5, v3, 0xf0

    shr-int/lit8 v36, v5, 0x4

    and-int/lit8 v37, v3, 0xf

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v3

    if-ne v3, v12, :cond_48

    const/16 v32, 0x1

    goto :goto_33

    :cond_48
    const/16 v32, 0x0

    :goto_33
    if-nez v32, :cond_49

    goto :goto_31

    :cond_49
    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v34

    move/from16 v3, v24

    new-array v5, v3, [B

    const/4 v11, 0x0

    invoke-virtual {v2, v5, v11, v3}, Lx8/n;->e([BII)V

    if-nez v34, :cond_4a

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v3

    new-array v4, v3, [B

    invoke-virtual {v2, v4, v11, v3}, Lx8/n;->e([BII)V

    :cond_4a
    move-object/from16 v38, v4

    const/4 v12, 0x1

    iput-boolean v12, v1, Ldn/s;->j:Z

    new-instance v31, Lna/p;

    move-object/from16 v35, v5

    invoke-direct/range {v31 .. v38}, Lna/p;-><init>(ZLjava/lang/String;I[BII[B)V

    move-object/from16 v2, v31

    iput-object v2, v1, Ldn/s;->p:Ljava/lang/Object;

    goto :goto_34

    :cond_4b
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_4c
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :goto_34
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v11, 0x0

    :goto_35
    if-ge v11, v2, :cond_12

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly8/d;

    iget v4, v3, La9/a;->x:I

    const v5, 0x75756964

    if-ne v4, v5, :cond_4e

    iget-object v3, v3, Ly8/d;->y:Lx8/n;

    const/16 v9, 0x8

    invoke-virtual {v3, v9}, Lx8/n;->F(I)V

    iget-object v4, v0, Lna/h;->h:[B

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-virtual {v3, v4, v5, v6}, Lx8/n;->e([BII)V

    sget-object v5, Lna/h;->K:[B

    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-nez v4, :cond_4d

    goto :goto_36

    :cond_4d
    invoke-static {v3, v6, v1}, Lna/h;->c(Lx8/n;ILdn/s;)V

    goto :goto_36

    :cond_4e
    const/16 v6, 0x10

    const/16 v9, 0x8

    :goto_36
    add-int/lit8 v11, v11, 0x1

    goto :goto_35

    :cond_4f
    move/from16 v21, v1

    move-object/from16 v29, v5

    move-object/from16 v30, v6

    move/from16 v49, v7

    move/from16 v46, v11

    const/16 v9, 0x8

    const/4 v12, 0x1

    const/16 v13, 0xc

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    :goto_37
    add-int/lit8 v11, v46, 0x1

    move/from16 v1, v21

    move-object/from16 v5, v29

    move-object/from16 v6, v30

    move/from16 v7, v49

    goto/16 :goto_a

    :cond_50
    move-object/from16 v30, v6

    const/4 v4, 0x0

    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    invoke-static/range {v30 .. v30}, Lna/h;->a(Ljava/util/List;)Lu8/l;

    move-result-object v1

    if-eqz v1, :cond_52

    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v11, 0x0

    :goto_38
    if-ge v11, v2, :cond_52

    invoke-virtual {v15, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lna/g;

    iget-object v5, v3, Lna/g;->d:Lna/q;

    iget-object v5, v5, Lna/q;->a:Lna/o;

    iget-object v6, v3, Lna/g;->b:Ldn/s;

    iget-object v6, v6, Ldn/s;->o:Ljava/lang/Object;

    check-cast v6, Lna/d;

    sget v7, Lx8/t;->a:I

    iget v6, v6, Lna/d;->a:I

    iget-object v5, v5, Lna/o;->l:[Lna/p;

    aget-object v5, v5, v6

    if-eqz v5, :cond_51

    iget-object v5, v5, Lna/p;->b:Ljava/lang/String;

    goto :goto_39

    :cond_51
    move-object v5, v4

    :goto_39
    invoke-virtual {v1, v5}, Lu8/l;->b(Ljava/lang/String;)Lu8/l;

    move-result-object v5

    iget-object v6, v3, Lna/g;->d:Lna/q;

    iget-object v6, v6, Lna/q;->a:Lna/o;

    iget-object v6, v6, Lna/o;->g:Lu8/p;

    invoke-virtual {v6}, Lu8/p;->a()Lu8/o;

    move-result-object v6

    iget-object v7, v3, Lna/g;->j:Ljava/lang/String;

    invoke-static {v7}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lu8/o;->l:Ljava/lang/String;

    iput-object v5, v6, Lu8/o;->q:Lu8/l;

    new-instance v5, Lu8/p;

    invoke-direct {v5, v6}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v3, v3, Lna/g;->a:Lt9/k0;

    invoke-interface {v3, v5}, Lt9/k0;->a(Lu8/p;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_38

    :cond_52
    iget-wide v1, v0, Lna/h;->x:J

    cmp-long v1, v1, v18

    if-eqz v1, :cond_0

    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_3a
    if-ge v3, v1, :cond_55

    invoke-virtual {v15, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lna/g;

    iget-wide v4, v0, Lna/h;->x:J

    iget v6, v2, Lna/g;->f:I

    :goto_3b
    iget-object v7, v2, Lna/g;->b:Ldn/s;

    iget v8, v7, Ldn/s;->d:I

    if-ge v6, v8, :cond_54

    iget-object v8, v7, Ldn/s;->h:[J

    aget-wide v8, v8, v6

    cmp-long v8, v8, v4

    if-gtz v8, :cond_54

    iget-object v7, v7, Ldn/s;->i:[Z

    aget-boolean v7, v7, v6

    if-eqz v7, :cond_53

    iput v6, v2, Lna/g;->i:I

    :cond_53
    add-int/lit8 v6, v6, 0x1

    goto :goto_3b

    :cond_54
    add-int/lit8 v3, v3, 0x1

    goto :goto_3a

    :cond_55
    move-wide/from16 v2, v18

    iput-wide v2, v0, Lna/h;->x:J

    goto/16 :goto_0

    :cond_56
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly8/c;

    iget-object v1, v1, Ly8/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_57
    const/4 v11, 0x0

    iput v11, v0, Lna/h;->q:I

    iput v11, v0, Lna/h;->t:I

    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 6

    iget v0, p0, Lna/h;->b:I

    and-int/lit8 v1, v0, 0x20

    if-nez v1, :cond_0

    new-instance v1, Lb9/b;

    iget-object v2, p0, Lna/h;->a:Lqa/j;

    invoke-direct {v1, p1, v2}, Lb9/b;-><init>(Lt9/q;Lqa/j;)V

    move-object p1, v1

    :cond_0
    iput-object p1, p0, Lna/h;->G:Lt9/q;

    const/4 v1, 0x0

    iput v1, p0, Lna/h;->q:I

    iput v1, p0, Lna/h;->t:I

    const/4 v2, 0x2

    new-array v2, v2, [Lt9/k0;

    iput-object v2, p0, Lna/h;->H:[Lt9/k0;

    iget-object v3, p0, Lna/h;->o:Lt9/k0;

    if-eqz v3, :cond_1

    aput-object v3, v2, v1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    and-int/lit8 v0, v0, 0x4

    const/16 v4, 0x64

    if-eqz v0, :cond_2

    add-int/lit8 v0, v3, 0x1

    const/4 v5, 0x5

    invoke-interface {p1, v4, v5}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    aput-object p1, v2, v3

    const/16 v4, 0x65

    move v3, v0

    :cond_2
    iget-object p1, p0, Lna/h;->H:[Lt9/k0;

    invoke-static {v3, p1}, Lx8/t;->L(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lt9/k0;

    iput-object p1, p0, Lna/h;->H:[Lt9/k0;

    array-length v0, p1

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    sget-object v5, Lna/h;->L:Lu8/p;

    invoke-interface {v3, v5}, Lt9/k0;->a(Lu8/p;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lna/h;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lt9/k0;

    iput-object v0, p0, Lna/h;->I:[Lt9/k0;

    :goto_2
    iget-object v0, p0, Lna/h;->I:[Lt9/k0;

    array-length v0, v0

    if-ge v1, v0, :cond_4

    iget-object v0, p0, Lna/h;->G:Lt9/q;

    add-int/lit8 v2, v4, 0x1

    const/4 v3, 0x3

    invoke-interface {v0, v4, v3}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu8/p;

    invoke-interface {v0, v3}, Lt9/k0;->a(Lu8/p;)V

    iget-object v3, p0, Lna/h;->I:[Lt9/k0;

    aput-object v0, v3, v1

    add-int/lit8 v1, v1, 0x1

    move v4, v2

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lna/n;->l(Lt9/o;ZZ)Lt9/i0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v2

    goto :goto_0

    :cond_0
    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    :goto_0
    iput-object v2, p0, Lna/h;->p:Lzr/w0;

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :goto_0
    iget v2, v0, Lna/h;->q:I

    const v4, 0x73696478

    iget-object v5, v0, Lna/h;->l:Ljava/util/ArrayDeque;

    iget-object v7, v0, Lna/h;->n:Lre/g;

    iget-object v8, v0, Lna/h;->d:Landroid/util/SparseArray;

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v2, :cond_42

    iget-object v14, v0, Lna/h;->m:Ljava/util/ArrayDeque;

    const-string v15, "FragmentedMp4Extractor"

    if-eq v2, v12, :cond_33

    if-eq v2, v11, :cond_2e

    iget-object v2, v0, Lna/h;->A:Lna/g;

    if-nez v2, :cond_9

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v2

    move-object v5, v10

    move/from16 v18, v11

    move v11, v13

    const-wide v16, 0x7fffffffffffffffL

    :goto_1
    if-ge v11, v2, :cond_4

    invoke-virtual {v8, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v6, v19

    check-cast v6, Lna/g;

    iget-boolean v3, v6, Lna/g;->m:Z

    const/16 v21, 0x8

    iget-object v9, v6, Lna/g;->b:Ldn/s;

    move/from16 v22, v12

    if-nez v3, :cond_0

    iget v12, v6, Lna/g;->f:I

    iget-object v4, v6, Lna/g;->d:Lna/q;

    iget v4, v4, Lna/q;->b:I

    if-eq v12, v4, :cond_3

    :cond_0
    if-eqz v3, :cond_1

    iget v4, v6, Lna/g;->h:I

    iget v12, v9, Ldn/s;->c:I

    if-ne v4, v12, :cond_1

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    iget-object v3, v6, Lna/g;->d:Lna/q;

    iget-object v3, v3, Lna/q;->c:[J

    iget v4, v6, Lna/g;->f:I

    aget-wide v3, v3, v4

    goto :goto_2

    :cond_2
    iget-object v3, v9, Ldn/s;->e:[J

    iget v4, v6, Lna/g;->h:I

    aget-wide v3, v3, v4

    :goto_2
    cmp-long v9, v3, v16

    if-gez v9, :cond_3

    move-wide/from16 v16, v3

    move-object v5, v6

    :cond_3
    :goto_3
    add-int/lit8 v11, v11, 0x1

    move/from16 v12, v22

    goto :goto_1

    :cond_4
    move/from16 v22, v12

    const/16 v21, 0x8

    if-nez v5, :cond_6

    iget-wide v2, v0, Lna/h;->v:J

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v2, v2

    if-ltz v2, :cond_5

    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    iput v13, v0, Lna/h;->q:I

    iput v13, v0, Lna/h;->t:I

    goto/16 :goto_0

    :cond_5
    const-string v1, "Offset to end of mdat was negative."

    invoke-static {v10, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_6
    iget-boolean v2, v5, Lna/g;->m:Z

    if-nez v2, :cond_7

    iget-object v2, v5, Lna/g;->d:Lna/q;

    iget-object v2, v2, Lna/q;->c:[J

    iget v3, v5, Lna/g;->f:I

    aget-wide v2, v2, v3

    goto :goto_4

    :cond_7
    iget-object v2, v5, Lna/g;->b:Ldn/s;

    iget-object v2, v2, Ldn/s;->e:[J

    iget v3, v5, Lna/g;->h:I

    aget-wide v2, v2, v3

    :goto_4
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v8

    sub-long/2addr v2, v8

    long-to-int v2, v2

    if-gez v2, :cond_8

    const-string v2, "Ignoring negative offset to sample data."

    invoke-static {v15, v2}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v13

    :cond_8
    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    iput-object v5, v0, Lna/h;->A:Lna/g;

    move-object v2, v5

    goto :goto_5

    :cond_9
    move/from16 v18, v11

    move/from16 v22, v12

    const/16 v21, 0x8

    :goto_5
    iget-object v3, v2, Lna/g;->a:Lt9/k0;

    iget-object v4, v2, Lna/g;->b:Ldn/s;

    iget v5, v0, Lna/h;->q:I

    const/4 v6, 0x6

    const-string v8, "video/hevc"

    const-string v9, "video/avc"

    const/4 v11, 0x3

    if-ne v5, v11, :cond_14

    iget-boolean v5, v2, Lna/g;->m:Z

    if-nez v5, :cond_a

    iget-object v5, v2, Lna/g;->d:Lna/q;

    iget-object v5, v5, Lna/q;->d:[I

    iget v11, v2, Lna/g;->f:I

    aget v5, v5, v11

    goto :goto_6

    :cond_a
    iget-object v5, v4, Ldn/s;->g:[I

    iget v11, v2, Lna/g;->f:I

    aget v5, v5, v11

    :goto_6
    iput v5, v0, Lna/h;->B:I

    iget-object v5, v2, Lna/g;->d:Lna/q;

    iget-object v5, v5, Lna/q;->a:Lna/o;

    iget-object v5, v5, Lna/o;->g:Lu8/p;

    iget-object v11, v5, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v11, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    iget v12, v0, Lna/h;->b:I

    if-eqz v11, :cond_c

    and-int/lit8 v5, v12, 0x40

    if-eqz v5, :cond_b

    :goto_7
    move/from16 v5, v22

    goto :goto_8

    :cond_b
    move v5, v13

    goto :goto_8

    :cond_c
    iget-object v5, v5, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    and-int/lit16 v5, v12, 0x80

    if-eqz v5, :cond_b

    goto :goto_7

    :goto_8
    xor-int/lit8 v5, v5, 0x1

    iput-boolean v5, v0, Lna/h;->E:Z

    iget v5, v2, Lna/g;->f:I

    iget v11, v2, Lna/g;->i:I

    if-ge v5, v11, :cond_11

    iget v3, v0, Lna/h;->B:I

    invoke-interface {v1, v3}, Lt9/o;->n(I)V

    invoke-virtual {v2}, Lna/g;->b()Lna/p;

    move-result-object v1

    if-nez v1, :cond_d

    goto :goto_9

    :cond_d
    iget-object v3, v4, Ldn/s;->q:Ljava/lang/Object;

    check-cast v3, Lx8/n;

    iget v1, v1, Lna/p;->d:I

    if-eqz v1, :cond_e

    invoke-virtual {v3, v1}, Lx8/n;->G(I)V

    :cond_e
    iget v1, v2, Lna/g;->f:I

    iget-boolean v5, v4, Ldn/s;->j:Z

    if-eqz v5, :cond_f

    iget-object v4, v4, Ldn/s;->k:[Z

    aget-boolean v1, v4, v1

    if-eqz v1, :cond_f

    invoke-virtual {v3}, Lx8/n;->z()I

    move-result v1

    mul-int/2addr v1, v6

    invoke-virtual {v3, v1}, Lx8/n;->G(I)V

    :cond_f
    :goto_9
    invoke-virtual {v2}, Lna/g;->c()Z

    move-result v1

    if-nez v1, :cond_10

    iput-object v10, v0, Lna/h;->A:Lna/g;

    :cond_10
    const/4 v11, 0x3

    iput v11, v0, Lna/h;->q:I

    return v13

    :cond_11
    iget-object v5, v2, Lna/g;->d:Lna/q;

    iget-object v5, v5, Lna/q;->a:Lna/o;

    iget v5, v5, Lna/o;->h:I

    move/from16 v11, v22

    if-ne v5, v11, :cond_12

    iget v5, v0, Lna/h;->B:I

    add-int/lit8 v5, v5, -0x8

    iput v5, v0, Lna/h;->B:I

    move/from16 v5, v21

    invoke-interface {v1, v5}, Lt9/o;->n(I)V

    :cond_12
    iget-object v5, v2, Lna/g;->d:Lna/q;

    iget-object v5, v5, Lna/q;->a:Lna/o;

    iget-object v5, v5, Lna/o;->g:Lu8/p;

    iget-object v5, v5, Lu8/p;->n:Ljava/lang/String;

    const-string v11, "audio/ac4"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    iget v5, v0, Lna/h;->B:I

    const/4 v11, 0x7

    invoke-virtual {v2, v5, v11}, Lna/g;->d(II)I

    move-result v5

    iput v5, v0, Lna/h;->C:I

    iget v5, v0, Lna/h;->B:I

    iget-object v12, v0, Lna/h;->i:Lx8/n;

    invoke-static {v5, v12}, Lt9/a;->g(ILx8/n;)V

    invoke-interface {v3, v12, v11, v13}, Lt9/k0;->d(Lx8/n;II)V

    iget v5, v0, Lna/h;->C:I

    add-int/2addr v5, v11

    iput v5, v0, Lna/h;->C:I

    goto :goto_a

    :cond_13
    iget v5, v0, Lna/h;->B:I

    invoke-virtual {v2, v5, v13}, Lna/g;->d(II)I

    move-result v5

    iput v5, v0, Lna/h;->C:I

    :goto_a
    iget v5, v0, Lna/h;->B:I

    iget v11, v0, Lna/h;->C:I

    add-int/2addr v5, v11

    iput v5, v0, Lna/h;->B:I

    const/4 v5, 0x4

    iput v5, v0, Lna/h;->q:I

    iput v13, v0, Lna/h;->D:I

    :cond_14
    iget-object v5, v2, Lna/g;->d:Lna/q;

    iget-object v11, v5, Lna/q;->a:Lna/o;

    iget-boolean v12, v2, Lna/g;->m:Z

    if-nez v12, :cond_15

    iget-object v4, v5, Lna/q;->f:[J

    iget v5, v2, Lna/g;->f:I

    aget-wide v4, v4, v5

    goto :goto_b

    :cond_15
    iget v5, v2, Lna/g;->f:I

    iget-object v4, v4, Ldn/s;->h:[J

    aget-wide v4, v4, v5

    :goto_b
    iget v12, v11, Lna/o;->k:I

    iget-object v11, v11, Lna/o;->g:Lu8/p;

    if-eqz v12, :cond_26

    iget-object v15, v0, Lna/h;->f:Lx8/n;

    iget-object v10, v15, Lx8/n;->a:[B

    aput-byte v13, v10, v13

    const/16 v22, 0x1

    aput-byte v13, v10, v22

    aput-byte v13, v10, v18

    rsub-int/lit8 v6, v12, 0x4

    :goto_c
    iget v13, v0, Lna/h;->C:I

    move-object/from16 v17, v2

    iget v2, v0, Lna/h;->B:I

    if-ge v13, v2, :cond_27

    iget v2, v0, Lna/h;->D:I

    if-nez v2, :cond_20

    iget-object v2, v0, Lna/h;->I:[Lt9/k0;

    array-length v2, v2

    if-gtz v2, :cond_16

    iget-boolean v2, v0, Lna/h;->E:Z

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v11}, Ly8/n;->e(Lu8/p;)I

    move-result v2

    add-int v13, v12, v2

    move/from16 v18, v2

    iget v2, v0, Lna/h;->B:I

    move/from16 v21, v2

    iget v2, v0, Lna/h;->C:I

    sub-int v2, v21, v2

    if-gt v13, v2, :cond_17

    move/from16 v2, v18

    goto :goto_d

    :cond_17
    const/4 v2, 0x0

    :goto_d
    add-int v13, v12, v2

    invoke-interface {v1, v10, v6, v13}, Lt9/o;->readFully([BII)V

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lx8/n;->F(I)V

    invoke-virtual {v15}, Lx8/n;->g()I

    move-result v18

    if-ltz v18, :cond_1f

    sub-int v13, v18, v2

    iput v13, v0, Lna/h;->D:I

    iget-object v13, v0, Lna/h;->e:Lx8/n;

    move/from16 v18, v6

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lx8/n;->F(I)V

    move/from16 v21, v12

    const/4 v12, 0x4

    invoke-interface {v3, v13, v12, v6}, Lt9/k0;->d(Lx8/n;II)V

    iget v6, v0, Lna/h;->C:I

    add-int/2addr v6, v12

    iput v6, v0, Lna/h;->C:I

    iget v6, v0, Lna/h;->B:I

    add-int v6, v6, v18

    iput v6, v0, Lna/h;->B:I

    iget-object v6, v0, Lna/h;->I:[Lt9/k0;

    array-length v6, v6

    if-lez v6, :cond_1c

    if-lez v2, :cond_1c

    aget-byte v6, v10, v12

    iget-object v12, v11, Lu8/p;->n:Ljava/lang/String;

    iget-object v13, v11, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v12, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_19

    invoke-static {v13, v9}, Lu8/d0;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_18

    goto :goto_e

    :cond_18
    move/from16 v23, v6

    const/4 v6, 0x6

    goto :goto_f

    :cond_19
    :goto_e
    and-int/lit8 v12, v6, 0x1f

    move/from16 v23, v6

    const/4 v6, 0x6

    if-eq v12, v6, :cond_1b

    :goto_f
    iget-object v12, v11, Lu8/p;->n:Ljava/lang/String;

    invoke-static {v12, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-static {v13, v8}, Lu8/d0;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1d

    :cond_1a
    and-int/lit8 v12, v23, 0x7e

    const/16 v22, 0x1

    shr-int/lit8 v12, v12, 0x1

    const/16 v13, 0x27

    if-ne v12, v13, :cond_1d

    :cond_1b
    const/4 v12, 0x1

    goto :goto_10

    :cond_1c
    const/4 v6, 0x6

    :cond_1d
    const/4 v12, 0x0

    :goto_10
    iput-boolean v12, v0, Lna/h;->F:Z

    const/4 v13, 0x0

    invoke-interface {v3, v15, v2, v13}, Lt9/k0;->d(Lx8/n;II)V

    iget v12, v0, Lna/h;->C:I

    add-int/2addr v12, v2

    iput v12, v0, Lna/h;->C:I

    if-lez v2, :cond_1e

    iget-boolean v12, v0, Lna/h;->E:Z

    if-nez v12, :cond_1e

    invoke-static {v10, v2, v11}, Ly8/n;->d([BILu8/p;)Z

    move-result v2

    if-eqz v2, :cond_1e

    const/4 v2, 0x1

    iput-boolean v2, v0, Lna/h;->E:Z

    :cond_1e
    :goto_11
    move-object/from16 v2, v17

    move/from16 v6, v18

    move/from16 v12, v21

    goto/16 :goto_c

    :cond_1f
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_20
    move/from16 v18, v6

    move/from16 v21, v12

    const/4 v6, 0x6

    iget-boolean v12, v0, Lna/h;->F:Z

    if-eqz v12, :cond_25

    iget-object v12, v0, Lna/h;->g:Lx8/n;

    invoke-virtual {v12, v2}, Lx8/n;->C(I)V

    iget-object v2, v12, Lx8/n;->a:[B

    iget v13, v0, Lna/h;->D:I

    const/4 v6, 0x0

    invoke-interface {v1, v2, v6, v13}, Lt9/o;->readFully([BII)V

    iget v2, v0, Lna/h;->D:I

    invoke-interface {v3, v12, v2, v6}, Lt9/k0;->d(Lx8/n;II)V

    iget v2, v0, Lna/h;->D:I

    iget-object v13, v12, Lx8/n;->a:[B

    move/from16 v23, v2

    iget v2, v12, Lx8/n;->c:I

    invoke-static {v2, v13}, Ly8/n;->n(I[B)I

    move-result v2

    invoke-virtual {v12, v6}, Lx8/n;->F(I)V

    invoke-virtual {v12, v2}, Lx8/n;->E(I)V

    iget v2, v11, Lu8/p;->p:I

    const/4 v13, -0x1

    if-ne v2, v13, :cond_21

    iget v2, v7, Lre/g;->a:I

    if-eqz v2, :cond_23

    iput v6, v7, Lre/g;->a:I

    invoke-virtual {v7, v6}, Lre/g;->b(I)V

    goto :goto_13

    :cond_21
    iget v6, v7, Lre/g;->a:I

    if-eq v6, v2, :cond_23

    if-ltz v2, :cond_22

    const/4 v6, 0x1

    goto :goto_12

    :cond_22
    const/4 v6, 0x0

    :goto_12
    invoke-static {v6}, Lva3/g;->i(Z)V

    iput v2, v7, Lre/g;->a:I

    invoke-virtual {v7, v2}, Lre/g;->b(I)V

    :cond_23
    :goto_13
    invoke-virtual {v7, v4, v5, v12}, Lre/g;->a(JLx8/n;)V

    invoke-virtual/range {v17 .. v17}, Lna/g;->a()I

    move-result v2

    const/16 v19, 0x4

    and-int/lit8 v2, v2, 0x4

    const/4 v13, 0x0

    if-eqz v2, :cond_24

    invoke-virtual {v7, v13}, Lre/g;->b(I)V

    :cond_24
    move/from16 v2, v23

    goto :goto_14

    :cond_25
    const/4 v13, 0x0

    invoke-interface {v3, v1, v2, v13}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v2

    :goto_14
    iget v6, v0, Lna/h;->C:I

    add-int/2addr v6, v2

    iput v6, v0, Lna/h;->C:I

    iget v6, v0, Lna/h;->D:I

    sub-int/2addr v6, v2

    iput v6, v0, Lna/h;->D:I

    goto/16 :goto_11

    :cond_26
    move-object/from16 v17, v2

    :goto_15
    iget v2, v0, Lna/h;->C:I

    iget v6, v0, Lna/h;->B:I

    if-ge v2, v6, :cond_27

    sub-int/2addr v6, v2

    const/4 v13, 0x0

    invoke-interface {v3, v1, v6, v13}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v2

    iget v6, v0, Lna/h;->C:I

    add-int/2addr v6, v2

    iput v6, v0, Lna/h;->C:I

    goto :goto_15

    :cond_27
    invoke-virtual/range {v17 .. v17}, Lna/g;->a()I

    move-result v1

    iget-boolean v2, v0, Lna/h;->E:Z

    if-nez v2, :cond_28

    const/high16 v2, 0x4000000

    or-int/2addr v1, v2

    :cond_28
    move/from16 v26, v1

    invoke-virtual/range {v17 .. v17}, Lna/g;->b()Lna/p;

    move-result-object v1

    if-eqz v1, :cond_29

    iget-object v1, v1, Lna/p;->c:Lt9/j0;

    move-object/from16 v29, v1

    goto :goto_16

    :cond_29
    const/16 v29, 0x0

    :goto_16
    iget v1, v0, Lna/h;->B:I

    const/16 v28, 0x0

    move/from16 v27, v1

    move-object/from16 v23, v3

    move-wide/from16 v24, v4

    invoke-interface/range {v23 .. v29}, Lt9/k0;->b(JIIILt9/j0;)V

    :cond_2a
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2c

    invoke-virtual {v14}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lna/f;

    iget v2, v0, Lna/h;->w:I

    iget v3, v1, Lna/f;->c:I

    sub-int/2addr v2, v3

    iput v2, v0, Lna/h;->w:I

    iget-wide v2, v1, Lna/f;->a:J

    iget-boolean v4, v1, Lna/f;->b:Z

    if-eqz v4, :cond_2b

    add-long v2, v2, v24

    :cond_2b
    move-wide v5, v2

    iget-object v2, v0, Lna/h;->H:[Lt9/k0;

    array-length v3, v2

    const/4 v11, 0x0

    :goto_17
    if-ge v11, v3, :cond_2a

    aget-object v4, v2, v11

    iget v8, v1, Lna/f;->c:I

    iget v9, v0, Lna/h;->w:I

    const/4 v10, 0x0

    const/4 v7, 0x1

    invoke-interface/range {v4 .. v10}, Lt9/k0;->b(JIIILt9/j0;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_17

    :cond_2c
    invoke-virtual/range {v17 .. v17}, Lna/g;->c()Z

    move-result v1

    if-nez v1, :cond_2d

    const/4 v2, 0x0

    iput-object v2, v0, Lna/h;->A:Lna/g;

    :cond_2d
    const/4 v11, 0x3

    iput v11, v0, Lna/h;->q:I

    const/16 v31, 0x0

    return v31

    :cond_2e
    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    const/4 v6, 0x0

    :goto_18
    if-ge v6, v2, :cond_30

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lna/g;

    iget-object v7, v7, Lna/g;->b:Ldn/s;

    iget-boolean v9, v7, Ldn/s;->l:Z

    if-eqz v9, :cond_2f

    iget-wide v9, v7, Ldn/s;->b:J

    cmp-long v7, v9, v4

    if-gez v7, :cond_2f

    invoke-virtual {v8, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lna/g;

    move-wide v4, v9

    :cond_2f
    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    :cond_30
    if-nez v3, :cond_31

    const/4 v11, 0x3

    iput v11, v0, Lna/h;->q:I

    goto/16 :goto_0

    :cond_31
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v6

    sub-long/2addr v4, v6

    long-to-int v2, v4

    if-ltz v2, :cond_32

    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    iget-object v2, v3, Lna/g;->b:Ldn/s;

    iget-object v3, v2, Ldn/s;->q:Ljava/lang/Object;

    check-cast v3, Lx8/n;

    iget-object v4, v3, Lx8/n;->a:[B

    iget v5, v3, Lx8/n;->c:I

    const/4 v13, 0x0

    invoke-interface {v1, v4, v13, v5}, Lt9/o;->readFully([BII)V

    invoke-virtual {v3, v13}, Lx8/n;->F(I)V

    iput-boolean v13, v2, Ldn/s;->l:Z

    goto/16 :goto_0

    :cond_32
    const-string v1, "Offset to encryption data was negative."

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_33
    move/from16 v18, v11

    iget-wide v2, v0, Lna/h;->s:J

    iget v6, v0, Lna/h;->t:I

    int-to-long v6, v6

    sub-long/2addr v2, v6

    long-to-int v2, v2

    iget-object v3, v0, Lna/h;->u:Lx8/n;

    if-eqz v3, :cond_40

    iget-object v6, v3, Lx8/n;->a:[B

    const/16 v7, 0x8

    invoke-interface {v1, v6, v7, v2}, Lt9/o;->readFully([BII)V

    new-instance v2, Ly8/d;

    iget v6, v0, Lna/h;->r:I

    invoke-direct {v2, v6, v3}, Ly8/d;-><init>(ILx8/n;)V

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v7

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_34

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly8/c;

    iget-object v3, v3, Ly8/c;->z:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :cond_34
    if-ne v6, v4, :cond_38

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Lx8/n;->F(I)V

    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v2

    invoke-static {v2}, Lna/c;->c(I)I

    move-result v2

    const/4 v5, 0x4

    invoke-virtual {v3, v5}, Lx8/n;->G(I)V

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v13

    if-nez v2, :cond_35

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v4

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v9

    :goto_19
    add-long/2addr v9, v7

    move-wide/from16 v32, v9

    move-wide v9, v4

    move-wide/from16 v4, v32

    goto :goto_1a

    :cond_35
    invoke-virtual {v3}, Lx8/n;->y()J

    move-result-wide v4

    invoke-virtual {v3}, Lx8/n;->y()J

    move-result-wide v9

    goto :goto_19

    :goto_1a
    sget v2, Lx8/t;->a:I

    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v11, 0xf4240

    invoke-static/range {v9 .. v15}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    move/from16 v2, v18

    invoke-virtual {v3, v2}, Lx8/n;->G(I)V

    invoke-virtual {v3}, Lx8/n;->z()I

    move-result v2

    new-array v8, v2, [I

    new-array v11, v2, [J

    new-array v12, v2, [J

    new-array v15, v2, [J

    move-wide/from16 v17, v6

    move-object/from16 v16, v11

    const/4 v11, 0x0

    :goto_1b
    if-ge v11, v2, :cond_37

    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v20

    const/high16 v21, -0x80000000

    and-int v21, v20, v21

    if-nez v21, :cond_36

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v23

    const v21, 0x7fffffff

    and-int v20, v20, v21

    aput v20, v8, v11

    aput-wide v4, v16, v11

    aput-wide v17, v15, v11

    add-long v9, v9, v23

    move/from16 v31, v11

    move-object/from16 v17, v12

    const-wide/32 v11, 0xf4240

    move-object/from16 v18, v15

    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    move/from16 p2, v2

    move-object/from16 v2, v16

    move-wide/from16 v32, v4

    move-object/from16 v4, v17

    move-wide/from16 v16, v32

    move-object/from16 v5, v18

    invoke-static/range {v9 .. v15}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    aget-wide v20, v5, v31

    sub-long v20, v11, v20

    aput-wide v20, v4, v31

    const/4 v15, 0x4

    invoke-virtual {v3, v15}, Lx8/n;->G(I)V

    aget v15, v8, v31

    move-wide/from16 v20, v6

    int-to-long v6, v15

    add-long v6, v16, v6

    add-int/lit8 v15, v31, 0x1

    move-object/from16 v16, v2

    move-wide/from16 v17, v11

    move v11, v15

    move/from16 v2, p2

    move-object v12, v4

    move-object v15, v5

    move-wide v4, v6

    move-wide/from16 v6, v20

    goto :goto_1b

    :cond_36
    const-string v1, "Unhandled indirect reference"

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_37
    move-wide/from16 v20, v6

    move-object v4, v12

    move-object v5, v15

    move-object/from16 v2, v16

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v6, Lt9/i;

    invoke-direct {v6, v8, v2, v4, v5}, Lt9/i;-><init>([I[J[J[J)V

    invoke-static {v3, v6}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v0, Lna/h;->z:J

    iget-object v3, v0, Lna/h;->G:Lt9/q;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lt9/e0;

    invoke-interface {v3, v2}, Lt9/q;->v(Lt9/e0;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lna/h;->J:Z

    goto/16 :goto_21

    :cond_38
    const v2, 0x656d7367

    if-ne v6, v2, :cond_41

    iget-object v2, v0, Lna/h;->H:[Lt9/k0;

    array-length v2, v2

    if-nez v2, :cond_39

    goto/16 :goto_21

    :cond_39
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Lx8/n;->F(I)V

    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v2

    invoke-static {v2}, Lna/c;->c(I)I

    move-result v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_3b

    const/4 v11, 0x1

    if-eq v2, v11, :cond_3a

    const-string v3, "Skipping unsupported emsg version: "

    invoke-static {v2, v3, v15}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_21

    :cond_3a
    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v10

    invoke-virtual {v3}, Lx8/n;->y()J

    move-result-wide v6

    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v8, 0xf4240

    invoke-static/range {v6 .. v12}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v15

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    invoke-static/range {v6 .. v12}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v8

    invoke-virtual {v3}, Lx8/n;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lx8/n;->o()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v26, v6

    move-wide/from16 v28, v8

    move-wide v8, v15

    move-wide v6, v4

    :goto_1c
    move-object/from16 v24, v2

    move-object/from16 v25, v10

    goto :goto_1e

    :cond_3b
    invoke-virtual {v3}, Lx8/n;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lx8/n;->o()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v19

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v15

    sget-object v21, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v17, 0xf4240

    invoke-static/range {v15 .. v21}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    iget-wide v8, v0, Lna/h;->z:J

    cmp-long v11, v8, v4

    if-eqz v11, :cond_3c

    add-long/2addr v8, v6

    goto :goto_1d

    :cond_3c
    move-wide v8, v4

    :goto_1d
    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v15

    const-wide/16 v17, 0x3e8

    invoke-static/range {v15 .. v21}, Lx8/t;->Q(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v15

    move-wide/from16 v26, v11

    move-wide/from16 v28, v15

    goto :goto_1c

    :goto_1e
    invoke-virtual {v3}, Lx8/n;->a()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v3}, Lx8/n;->a()I

    move-result v10

    const/4 v13, 0x0

    invoke-virtual {v3, v2, v13, v10}, Lx8/n;->e([BII)V

    new-instance v23, Lea/a;

    move-object/from16 v30, v2

    invoke-direct/range {v23 .. v30}, Lea/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    move-object/from16 v2, v23

    new-instance v3, Lx8/n;

    iget-object v10, v0, Lna/h;->j:Lea/b;

    invoke-virtual {v10, v2}, Lea/b;->a(Lea/a;)[B

    move-result-object v2

    invoke-direct {v3, v2}, Lx8/n;-><init>([B)V

    invoke-virtual {v3}, Lx8/n;->a()I

    move-result v2

    iget-object v10, v0, Lna/h;->H:[Lt9/k0;

    array-length v11, v10

    const/4 v12, 0x0

    :goto_1f
    if-ge v12, v11, :cond_3d

    aget-object v13, v10, v12

    const/4 v15, 0x0

    invoke-virtual {v3, v15}, Lx8/n;->F(I)V

    invoke-interface {v13, v3, v2, v15}, Lt9/k0;->d(Lx8/n;II)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_1f

    :cond_3d
    cmp-long v3, v8, v4

    if-nez v3, :cond_3e

    new-instance v3, Lna/f;

    const/4 v11, 0x1

    invoke-direct {v3, v2, v6, v7, v11}, Lna/f;-><init>(IJZ)V

    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lna/h;->w:I

    add-int/2addr v3, v2

    iput v3, v0, Lna/h;->w:I

    goto :goto_21

    :cond_3e
    invoke-virtual {v14}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3f

    new-instance v3, Lna/f;

    const/4 v13, 0x0

    invoke-direct {v3, v2, v8, v9, v13}, Lna/f;-><init>(IJZ)V

    invoke-virtual {v14, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lna/h;->w:I

    add-int/2addr v3, v2

    iput v3, v0, Lna/h;->w:I

    goto :goto_21

    :cond_3f
    iget-object v3, v0, Lna/h;->H:[Lt9/k0;

    array-length v4, v3

    const/4 v13, 0x0

    :goto_20
    if-ge v13, v4, :cond_41

    aget-object v15, v3, v13

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x1

    move/from16 v19, v2

    move-wide/from16 v16, v8

    invoke-interface/range {v15 .. v21}, Lt9/k0;->b(JIIILt9/j0;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_20

    :cond_40
    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    :cond_41
    :goto_21
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lna/h;->d(J)V

    goto/16 :goto_0

    :cond_42
    iget v2, v0, Lna/h;->t:I

    iget-object v3, v0, Lna/h;->k:Lx8/n;

    if-nez v2, :cond_44

    iget-object v2, v3, Lx8/n;->a:[B

    const/16 v6, 0x8

    const/4 v11, 0x1

    const/4 v13, 0x0

    invoke-interface {v1, v2, v13, v6, v11}, Lt9/o;->f([BIIZ)Z

    move-result v2

    if-nez v2, :cond_43

    invoke-virtual {v7, v13}, Lre/g;->b(I)V

    const/16 v20, -0x1

    return v20

    :cond_43
    iput v6, v0, Lna/h;->t:I

    invoke-virtual {v3, v13}, Lx8/n;->F(I)V

    invoke-virtual {v3}, Lx8/n;->v()J

    move-result-wide v6

    iput-wide v6, v0, Lna/h;->s:J

    invoke-virtual {v3}, Lx8/n;->g()I

    move-result v2

    iput v2, v0, Lna/h;->r:I

    :cond_44
    iget-wide v6, v0, Lna/h;->s:J

    const-wide/16 v9, 0x1

    cmp-long v2, v6, v9

    if-nez v2, :cond_45

    iget-object v2, v3, Lx8/n;->a:[B

    const/16 v6, 0x8

    invoke-interface {v1, v2, v6, v6}, Lt9/o;->readFully([BII)V

    iget v2, v0, Lna/h;->t:I

    add-int/2addr v2, v6

    iput v2, v0, Lna/h;->t:I

    invoke-virtual {v3}, Lx8/n;->y()J

    move-result-wide v6

    iput-wide v6, v0, Lna/h;->s:J

    goto :goto_22

    :cond_45
    const-wide/16 v9, 0x0

    cmp-long v2, v6, v9

    if-nez v2, :cond_47

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v6

    const-wide/16 v9, -0x1

    cmp-long v2, v6, v9

    if-nez v2, :cond_46

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_46

    invoke-virtual {v5}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly8/c;

    iget-wide v6, v2, Ly8/c;->y:J

    :cond_46
    cmp-long v2, v6, v9

    if-eqz v2, :cond_47

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v9

    sub-long/2addr v6, v9

    iget v2, v0, Lna/h;->t:I

    int-to-long v9, v2

    add-long/2addr v6, v9

    iput-wide v6, v0, Lna/h;->s:J

    :cond_47
    :goto_22
    iget-wide v6, v0, Lna/h;->s:J

    iget v2, v0, Lna/h;->t:I

    int-to-long v9, v2

    cmp-long v2, v6, v9

    if-ltz v2, :cond_54

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v6

    iget v2, v0, Lna/h;->t:I

    int-to-long v9, v2

    sub-long/2addr v6, v9

    iget v2, v0, Lna/h;->r:I

    const v9, 0x6d646174

    const v10, 0x6d6f6f66

    if-eq v2, v10, :cond_48

    if-ne v2, v9, :cond_49

    :cond_48
    iget-boolean v2, v0, Lna/h;->J:Z

    if-nez v2, :cond_49

    iget-object v2, v0, Lna/h;->G:Lt9/q;

    new-instance v11, Lt9/t;

    iget-wide v12, v0, Lna/h;->y:J

    invoke-direct {v11, v12, v13, v6, v7}, Lt9/t;-><init>(JJ)V

    invoke-interface {v2, v11}, Lt9/q;->v(Lt9/e0;)V

    const/4 v11, 0x1

    iput-boolean v11, v0, Lna/h;->J:Z

    :cond_49
    iget v2, v0, Lna/h;->r:I

    if-ne v2, v10, :cond_4a

    invoke-virtual {v8}, Landroid/util/SparseArray;->size()I

    move-result v2

    const/4 v11, 0x0

    :goto_23
    if-ge v11, v2, :cond_4a

    invoke-virtual {v8, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lna/g;

    iget-object v12, v12, Lna/g;->b:Ldn/s;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-wide v6, v12, Ldn/s;->b:J

    iput-wide v6, v12, Ldn/s;->a:J

    add-int/lit8 v11, v11, 0x1

    goto :goto_23

    :cond_4a
    iget v2, v0, Lna/h;->r:I

    if-ne v2, v9, :cond_4b

    const/4 v8, 0x0

    iput-object v8, v0, Lna/h;->A:Lna/g;

    iget-wide v2, v0, Lna/h;->s:J

    add-long/2addr v6, v2

    iput-wide v6, v0, Lna/h;->v:J

    const/4 v2, 0x2

    iput v2, v0, Lna/h;->q:I

    goto/16 :goto_0

    :cond_4b
    const v6, 0x6d6f6f76

    if-eq v2, v6, :cond_52

    const v6, 0x7472616b

    if-eq v2, v6, :cond_52

    const v6, 0x6d646961

    if-eq v2, v6, :cond_52

    const v6, 0x6d696e66

    if-eq v2, v6, :cond_52

    const v6, 0x7374626c

    if-eq v2, v6, :cond_52

    if-eq v2, v10, :cond_52

    const v6, 0x74726166

    if-eq v2, v6, :cond_52

    const v6, 0x6d766578

    if-eq v2, v6, :cond_52

    const v6, 0x65647473

    if-ne v2, v6, :cond_4c

    goto/16 :goto_25

    :cond_4c
    const v5, 0x68646c72    # 4.3148E24f

    const-wide/32 v6, 0x7fffffff

    if-eq v2, v5, :cond_4f

    const v5, 0x6d646864

    if-eq v2, v5, :cond_4f

    const v5, 0x6d766864

    if-eq v2, v5, :cond_4f

    if-eq v2, v4, :cond_4f

    const v4, 0x73747364

    if-eq v2, v4, :cond_4f

    const v4, 0x73747473

    if-eq v2, v4, :cond_4f

    const v4, 0x63747473

    if-eq v2, v4, :cond_4f

    const v4, 0x73747363

    if-eq v2, v4, :cond_4f

    const v4, 0x7374737a

    if-eq v2, v4, :cond_4f

    const v4, 0x73747a32

    if-eq v2, v4, :cond_4f

    const v4, 0x7374636f

    if-eq v2, v4, :cond_4f

    const v4, 0x636f3634

    if-eq v2, v4, :cond_4f

    const v4, 0x73747373

    if-eq v2, v4, :cond_4f

    const v4, 0x74666474

    if-eq v2, v4, :cond_4f

    const v4, 0x74666864

    if-eq v2, v4, :cond_4f

    const v4, 0x746b6864

    if-eq v2, v4, :cond_4f

    const v4, 0x74726578

    if-eq v2, v4, :cond_4f

    const v4, 0x7472756e

    if-eq v2, v4, :cond_4f

    const v4, 0x70737368    # 3.013775E29f

    if-eq v2, v4, :cond_4f

    const v4, 0x7361697a

    if-eq v2, v4, :cond_4f

    const v4, 0x7361696f

    if-eq v2, v4, :cond_4f

    const v4, 0x73656e63

    if-eq v2, v4, :cond_4f

    const v4, 0x75756964

    if-eq v2, v4, :cond_4f

    const v4, 0x73626770

    if-eq v2, v4, :cond_4f

    const v4, 0x73677064

    if-eq v2, v4, :cond_4f

    const v4, 0x656c7374

    if-eq v2, v4, :cond_4f

    const v4, 0x6d656864

    if-eq v2, v4, :cond_4f

    const v4, 0x656d7367

    if-ne v2, v4, :cond_4d

    goto :goto_24

    :cond_4d
    iget-wide v2, v0, Lna/h;->s:J

    cmp-long v2, v2, v6

    if-gtz v2, :cond_4e

    const/4 v2, 0x0

    iput-object v2, v0, Lna/h;->u:Lx8/n;

    const/4 v11, 0x1

    iput v11, v0, Lna/h;->q:I

    goto/16 :goto_0

    :cond_4e
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_4f
    :goto_24
    iget v2, v0, Lna/h;->t:I

    const/16 v5, 0x8

    if-ne v2, v5, :cond_51

    iget-wide v8, v0, Lna/h;->s:J

    cmp-long v2, v8, v6

    if-gtz v2, :cond_50

    new-instance v2, Lx8/n;

    iget-wide v6, v0, Lna/h;->s:J

    long-to-int v4, v6

    invoke-direct {v2, v4}, Lx8/n;-><init>(I)V

    iget-object v3, v3, Lx8/n;->a:[B

    iget-object v4, v2, Lx8/n;->a:[B

    const/4 v13, 0x0

    invoke-static {v3, v13, v4, v13, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lna/h;->u:Lx8/n;

    const/4 v11, 0x1

    iput v11, v0, Lna/h;->q:I

    goto/16 :goto_0

    :cond_50
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_51
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1

    :cond_52
    :goto_25
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v2

    iget-wide v6, v0, Lna/h;->s:J

    add-long/2addr v2, v6

    const-wide/16 v6, 0x8

    sub-long/2addr v2, v6

    new-instance v4, Ly8/c;

    iget v6, v0, Lna/h;->r:I

    invoke-direct {v4, v6, v2, v3}, Ly8/c;-><init>(IJ)V

    invoke-virtual {v5, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v4, v0, Lna/h;->s:J

    iget v6, v0, Lna/h;->t:I

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-nez v4, :cond_53

    invoke-virtual {v0, v2, v3}, Lna/h;->d(J)V

    goto/16 :goto_0

    :cond_53
    const/4 v13, 0x0

    iput v13, v0, Lna/h;->q:I

    iput v13, v0, Lna/h;->t:I

    goto/16 :goto_0

    :cond_54
    const-string v1, "Atom size less than header length (unsupported)."

    invoke-static {v1}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object v1

    throw v1
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lna/h;->p:Lzr/w0;

    return-object v0
.end method

.method public final release()V
    .locals 0

    return-void
.end method
