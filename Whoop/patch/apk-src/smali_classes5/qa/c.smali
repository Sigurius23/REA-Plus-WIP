.class public final Lqa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqa/e;


# static fields
.field public static final y:Lzr/p;


# instance fields
.field public final w:Lzr/g0;

.field public final x:[J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lzr/u0;->x:Lzr/u0;

    new-instance v1, Lqa/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lqa/b;-><init>(I)V

    new-instance v2, Lzr/p;

    invoke-direct {v2, v1, v0}, Lzr/p;-><init>(Lyr/e;Lzr/v0;)V

    sput-object v2, Lqa/c;->y:Lzr/p;

    return-void
.end method

.method public constructor <init>(Lzr/w0;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget v2, v1, Lzr/w0;->z:I

    const/4 v3, 0x2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v2, v9, :cond_5

    invoke-virtual {v1, v8}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v1

    invoke-virtual {v1}, Lzr/e0;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Lzr/e0;->hasNext()Z

    move-result v10

    if-nez v10, :cond_2

    check-cast v2, Lqa/a;

    iget-wide v10, v2, Lqa/a;->b:J

    iget-object v1, v2, Lqa/a;->a:Lzr/g0;

    iget-wide v12, v2, Lqa/a;->c:J

    cmp-long v2, v10, v6

    if-nez v2, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    move-wide v4, v10

    :goto_0
    cmp-long v2, v12, v6

    if-nez v2, :cond_1

    invoke-static {v1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    iput-object v1, v0, Lqa/c;->w:Lzr/g0;

    new-array v1, v9, [J

    aput-wide v4, v1, v8

    iput-object v1, v0, Lqa/c;->x:[J

    return-void

    :cond_1
    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    invoke-static {v1, v2}, Lzr/g0;->t(Ljava/lang/Object;Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    iput-object v1, v0, Lqa/c;->w:Lzr/g0;

    add-long/2addr v12, v4

    new-array v1, v3, [J

    aput-wide v4, v1, v8

    aput-wide v12, v1, v9

    iput-object v1, v0, Lqa/c;->x:[J

    return-void

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "expected one element but was: <"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    const/4 v2, 0x4

    if-ge v8, v2, :cond_3

    invoke-virtual {v1}, Lzr/e0;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lzr/e0;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lzr/e0;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, ", ..."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const/16 v1, 0x3e

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    mul-int/2addr v2, v3

    new-array v2, v2, [J

    iput-object v2, v0, Lqa/c;->x:[J

    const-wide v9, 0x7fffffffffffffffL

    invoke-static {v2, v9, v10}, Ljava/util/Arrays;->fill([JJ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    sget-object v3, Lqa/c;->y:Lzr/p;

    invoke-static {v3, v1}, Lzr/g0;->u(Lzr/v0;Ljava/util/AbstractCollection;)Lzr/w0;

    move-result-object v1

    move v3, v8

    :goto_2
    iget v9, v1, Lzr/w0;->z:I

    if-ge v8, v9, :cond_b

    invoke-virtual {v1, v8}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqa/a;

    iget-wide v10, v9, Lqa/a;->b:J

    iget-wide v12, v9, Lqa/a;->c:J

    iget-object v9, v9, Lqa/a;->a:Lzr/g0;

    cmp-long v14, v10, v6

    if-nez v14, :cond_6

    const-wide/16 v10, 0x0

    :cond_6
    add-long v14, v10, v12

    if-eqz v3, :cond_7

    iget-object v4, v0, Lqa/c;->x:[J

    add-int/lit8 v5, v3, -0x1

    aget-wide v16, v4, v5

    cmp-long v4, v16, v10

    if-gez v4, :cond_8

    :cond_7
    move-wide/from16 v16, v6

    goto :goto_3

    :cond_8
    if-nez v4, :cond_9

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzr/g0;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v2, v5, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-wide/from16 v16, v6

    goto :goto_4

    :cond_9
    const-string v4, "CuesWithTimingSubtitle"

    move-wide/from16 v16, v6

    const-string v6, "Truncating unsupported overlapping cues."

    invoke-static {v4, v6}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lqa/c;->x:[J

    aput-wide v10, v4, v5

    invoke-virtual {v2, v5, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :goto_3
    iget-object v4, v0, Lqa/c;->x:[J

    add-int/lit8 v5, v3, 0x1

    aput-wide v10, v4, v3

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v5

    :goto_4
    cmp-long v4, v12, v16

    if-eqz v4, :cond_a

    iget-object v4, v0, Lqa/c;->x:[J

    add-int/lit8 v5, v3, 0x1

    aput-wide v14, v4, v3

    sget-object v3, Lzr/w0;->E:Lzr/w0;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v5

    :cond_a
    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v6, v16

    goto :goto_2

    :cond_b
    invoke-static {v2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v1

    iput-object v1, v0, Lqa/c;->w:Lzr/g0;

    return-void
.end method


# virtual methods
.method public final b(J)I
    .locals 2

    iget-object v0, p0, Lqa/c;->x:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lx8/t;->a([JJZ)I

    move-result p1

    iget-object p2, p0, Lqa/c;->w:Lzr/g0;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final d(J)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lqa/c;->x:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lx8/t;->d([JJZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    sget-object p1, Lzr/g0;->x:Lzr/e0;

    sget-object p1, Lzr/w0;->E:Lzr/w0;

    return-object p1

    :cond_0
    iget-object p2, p0, Lqa/c;->w:Lzr/g0;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzr/g0;

    return-object p1
.end method

.method public final h(I)J
    .locals 2

    iget-object v0, p0, Lqa/c;->w:Lzr/g0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->d(Z)V

    iget-object v0, p0, Lqa/c;->x:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Lqa/c;->w:Lzr/g0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
