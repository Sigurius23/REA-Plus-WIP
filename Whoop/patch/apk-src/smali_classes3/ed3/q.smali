.class public final Led3/q;
.super Led3/m;
.source "SourceFile"


# instance fields
.field public k:I

.field public final l:J


# direct methods
.method public constructor <init>(Ldd3/a;Led3/o;JLyc3/g;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p5}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V

    const/4 p1, -0x1

    iput p1, p0, Led3/q;->k:I

    const-wide/16 v0, 0x4c2c

    cmp-long p1, p3, v0

    if-nez p1, :cond_1

    sget-object p1, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p2, p1}, Led3/o;->c(Ldd3/b;)I

    move-result p1

    if-ltz p1, :cond_0

    int-to-long p1, p1

    neg-long p3, p1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Expected positive length for "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", but got "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    iput-wide p3, p0, Led3/q;->l:J

    return-void
.end method


# virtual methods
.method public final T(Lyc3/g;I)J
    .locals 2

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 p1, 0x0

    iget-wide v0, p0, Led3/q;->l:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 p1, 0x4c2c

    return-wide p1
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Led3/q;->l:J

    cmp-long p1, v2, v0

    const/4 v0, -0x1

    iget-object v1, p0, Led3/m;->d:Led3/o;

    const/4 v4, 0x1

    if-lez p1, :cond_2

    iget p1, p0, Led3/q;->k:I

    if-ne p1, v0, :cond_0

    iget p1, v1, Led3/o;->b:I

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Led3/o;->r()I

    move-result p1

    :goto_0
    const-wide/32 v5, 0x7fffffff

    and-long/2addr v2, v5

    long-to-int v2, v2

    if-ne p1, v2, :cond_1

    iget p1, p0, Led3/q;->k:I

    add-int/2addr p1, v4

    iput p1, p0, Led3/q;->k:I

    return p1

    :cond_1
    iput-boolean v4, v1, Led3/o;->d:Z

    iget p1, v1, Led3/o;->b:I

    shl-int/lit8 p1, p1, 0x3

    iget-object v2, v1, Led3/o;->f:Ljava/lang/Object;

    check-cast v2, Led3/l;

    iget v2, v2, Led3/l;->w:I

    or-int/2addr p1, v2

    iget v2, v1, Led3/o;->c:I

    invoke-virtual {v1, v2}, Led3/o;->t(I)I

    iput p1, v1, Led3/o;->c:I

    return v0

    :cond_2
    neg-long v2, v2

    iget p1, p0, Led3/q;->k:I

    add-int/2addr p1, v4

    iput p1, p0, Led3/q;->k:I

    int-to-long v4, p1

    cmp-long v2, v4, v2

    if-eqz v2, :cond_4

    iget-boolean v2, v1, Led3/o;->d:Z

    if-nez v2, :cond_3

    iget-object v1, v1, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Led3/a;

    iget v2, v1, Led3/a;->b:I

    iget v1, v1, Led3/a;->c:I

    sub-int/2addr v2, v1

    if-nez v2, :cond_3

    return v0

    :cond_3
    return p1

    :cond_4
    return v0
.end method
