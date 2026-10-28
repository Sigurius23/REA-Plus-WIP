.class public final Lcom/squareup/wire/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lne3/j;

.field public b:J

.field public c:J

.field public d:I

.field public e:I

.field public f:I

.field public g:J

.field public h:Lcom/squareup/wire/d;

.field public final i:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lne3/j;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/squareup/wire/r;->c:J

    const/4 p1, 0x2

    iput p1, p0, Lcom/squareup/wire/r;->e:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/squareup/wire/r;->f:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/squareup/wire/r;->g:J

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/squareup/wire/r;->i:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(ILcom/squareup/wire/d;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "fieldEncoding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/squareup/wire/s;

    iget v1, p0, Lcom/squareup/wire/r;->d:I

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lcom/squareup/wire/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/i;

    invoke-direct {v0, v1}, Lcom/squareup/wire/s;-><init>(Lne3/i;)V

    invoke-virtual {p2}, Lcom/squareup/wire/d;->a()Lcom/squareup/wire/q;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0, p1, p3}, Lcom/squareup/wire/q;->encodeWithTag(Lcom/squareup/wire/s;ILjava/lang/Object;)V

    return-void
.end method

.method public final b(I)V
    .locals 6

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x6

    if-ne v0, p1, :cond_0

    iput v1, p0, Lcom/squareup/wire/r;->e:I

    return-void

    :cond_0
    iget-wide v2, p0, Lcom/squareup/wire/r;->b:J

    iget-wide v4, p0, Lcom/squareup/wire/r;->c:J

    cmp-long p1, v2, v4

    if-gtz p1, :cond_2

    if-nez p1, :cond_1

    iget-wide v2, p0, Lcom/squareup/wire/r;->g:J

    iput-wide v2, p0, Lcom/squareup/wire/r;->c:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/squareup/wire/r;->g:J

    iput v1, p0, Lcom/squareup/wire/r;->e:I

    return-void

    :cond_1
    const/4 p1, 0x7

    iput p1, p0, Lcom/squareup/wire/r;->e:I

    return-void

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected to end at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/squareup/wire/r;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/squareup/wire/r;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()J
    .locals 4

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/squareup/wire/r;->c:J

    iget-wide v2, p0, Lcom/squareup/wire/r;->b:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v2, v0, v1}, Lne3/j;->g0(J)V

    const/4 v2, 0x6

    iput v2, p0, Lcom/squareup/wire/r;->e:I

    iget-wide v2, p0, Lcom/squareup/wire/r;->c:J

    iput-wide v2, p0, Lcom/squareup/wire/r;->b:J

    iget-wide v2, p0, Lcom/squareup/wire/r;->g:J

    iput-wide v2, p0, Lcom/squareup/wire/r;->c:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/squareup/wire/r;->g:J

    return-wide v0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected LENGTH_DELIMITED but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()J
    .locals 4

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/squareup/wire/r;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/squareup/wire/r;->d:I

    const/16 v1, 0x41

    if-gt v0, v1, :cond_1

    iget-object v1, p0, Lcom/squareup/wire/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v0, v2, :cond_0

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-wide v0, p0, Lcom/squareup/wire/r;->g:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/squareup/wire/r;->g:J

    const/4 v2, 0x6

    iput v2, p0, Lcom/squareup/wire/r;->e:I

    return-wide v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Wire recursion limit exceeded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call to beginMessage()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(J)Lne3/l;
    .locals 5

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    iget v0, p0, Lcom/squareup/wire/r;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/squareup/wire/r;->d:I

    if-ltz v0, :cond_3

    iget-wide v1, p0, Lcom/squareup/wire/r;->g:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_3

    iget-wide v1, p0, Lcom/squareup/wire/r;->b:J

    iget-wide v3, p0, Lcom/squareup/wire/r;->c:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected to end at "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/squareup/wire/r;->c:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " but was "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lcom/squareup/wire/r;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-wide p1, p0, Lcom/squareup/wire/r;->c:J

    iget-object p1, p0, Lcom/squareup/wire/r;->i:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/h;

    iget-wide v0, p1, Lne3/h;->x:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_2

    invoke-virtual {p1, v0, v1}, Lne3/h;->m0(J)Lne3/l;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lne3/l;->E:Lne3/l;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No corresponding call to beginMessage()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected call to endMessage()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()I
    .locals 7

    iget-object v0, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v3, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v3

    if-ltz v3, :cond_0

    return v3

    :cond_0
    and-int/lit8 v3, v3, 0x7f

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v4, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v4

    if-ltz v4, :cond_1

    shl-int/lit8 v0, v4, 0x7

    :goto_0
    or-int/2addr v0, v3

    return v0

    :cond_1
    and-int/lit8 v4, v4, 0x7f

    shl-int/lit8 v4, v4, 0x7

    or-int/2addr v3, v4

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v4, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v4

    if-ltz v4, :cond_2

    shl-int/lit8 v0, v4, 0xe

    goto :goto_0

    :cond_2
    and-int/lit8 v4, v4, 0x7f

    shl-int/lit8 v4, v4, 0xe

    or-int/2addr v3, v4

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v4, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v4

    if-ltz v4, :cond_3

    shl-int/lit8 v0, v4, 0x15

    goto :goto_0

    :cond_3
    and-int/lit8 v4, v4, 0x7f

    shl-int/lit8 v4, v4, 0x15

    or-int/2addr v3, v4

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v4, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v4

    shl-int/lit8 v5, v4, 0x1c

    or-int/2addr v3, v5

    if-gez v4, :cond_6

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x5

    if-ge v4, v5, :cond_5

    invoke-interface {v0, v1, v2}, Lne3/j;->g0(J)V

    iget-wide v5, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v5, v1

    iput-wide v5, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->readByte()B

    move-result v5

    if-ltz v5, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Malformed VARINT"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_2
    return v3
.end method

.method public final g()I
    .locals 7

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x7

    const/4 v2, 0x2

    if-ne v0, v1, :cond_0

    iput v2, p0, Lcom/squareup/wire/r;->e:I

    iget v0, p0, Lcom/squareup/wire/r;->f:I

    return v0

    :cond_0
    const/4 v1, 0x6

    if-ne v0, v1, :cond_c

    :goto_0
    iget-wide v0, p0, Lcom/squareup/wire/r;->b:J

    iget-wide v3, p0, Lcom/squareup/wire/r;->c:J

    cmp-long v0, v0, v3

    if-gez v0, :cond_b

    iget-object v0, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v0}, Lne3/j;->o()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-virtual {p0}, Lcom/squareup/wire/r;->f()I

    move-result v0

    if-eqz v0, :cond_a

    shr-int/lit8 v1, v0, 0x3

    iput v1, p0, Lcom/squareup/wire/r;->f:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_9

    const/4 v3, 0x1

    if-eq v0, v3, :cond_8

    if-eq v0, v2, :cond_4

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    sget-object v0, Lcom/squareup/wire/d;->E:Lcom/squareup/wire/d;

    iput-object v0, p0, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    iput v2, p0, Lcom/squareup/wire/r;->e:I

    return v1

    :cond_1
    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Unexpected field encoding: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected end group"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {p0, v1}, Lcom/squareup/wire/r;->n(I)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/squareup/wire/d;->z:Lcom/squareup/wire/d;

    iput-object v0, p0, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    iput v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {p0}, Lcom/squareup/wire/r;->f()I

    move-result v0

    if-ltz v0, :cond_7

    iget-wide v1, p0, Lcom/squareup/wire/r;->g:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_6

    iget-wide v1, p0, Lcom/squareup/wire/r;->c:J

    iput-wide v1, p0, Lcom/squareup/wire/r;->g:J

    iget-wide v3, p0, Lcom/squareup/wire/r;->b:J

    int-to-long v5, v0

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/squareup/wire/r;->c:J

    cmp-long v0, v3, v1

    if-gtz v0, :cond_5

    iget v0, p0, Lcom/squareup/wire/r;->f:I

    return v0

    :cond_5
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_7
    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Negative length: "

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    sget-object v0, Lcom/squareup/wire/d;->y:Lcom/squareup/wire/d;

    iput-object v0, p0, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    iput v3, p0, Lcom/squareup/wire/r;->e:I

    return v1

    :cond_9
    sget-object v0, Lcom/squareup/wire/d;->x:Lcom/squareup/wire/d;

    iput-object v0, p0, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/wire/r;->e:I

    return v1

    :cond_a
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Unexpected tag 0"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    const/4 v0, -0x1

    return v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call to nextTag()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()I
    .locals 6

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected FIXED32 or LENGTH_DELIMITED but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const-wide/16 v2, 0x4

    iget-object v0, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v0, v2, v3}, Lne3/j;->g0(J)V

    iget-wide v2, p0, Lcom/squareup/wire/r;->b:J

    const/4 v4, 0x4

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->Q0()I

    move-result v0

    invoke-virtual {p0, v1}, Lcom/squareup/wire/r;->b(I)V

    return v0
.end method

.method public final i()J
    .locals 6

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected FIXED64 or LENGTH_DELIMITED but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const-wide/16 v2, 0x8

    iget-object v0, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v0, v2, v3}, Lne3/j;->g0(J)V

    iget-wide v2, p0, Lcom/squareup/wire/r;->b:J

    const/16 v4, 0x8

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0}, Lne3/j;->e0()J

    move-result-wide v2

    invoke-virtual {p0, v1}, Lcom/squareup/wire/r;->b(I)V

    return-wide v2
.end method

.method public final j(I)V
    .locals 2

    iget-object v0, p0, Lcom/squareup/wire/r;->h:Lcom/squareup/wire/d;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/squareup/wire/d;->a()Lcom/squareup/wire/q;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/squareup/wire/q;->decode(Lcom/squareup/wire/r;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/squareup/wire/r;->a(ILcom/squareup/wire/d;Ljava/lang/Object;)V

    return-void
.end method

.method public final k()I
    .locals 3

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected VARINT or LENGTH_DELIMITED but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/wire/r;->f()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/squareup/wire/r;->b(I)V

    return v0
.end method

.method public final l()J
    .locals 9

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected VARINT or LENGTH_DELIMITED but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move v3, v0

    :goto_1
    const/16 v4, 0x40

    if-ge v3, v4, :cond_3

    iget-object v4, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    const-wide/16 v5, 0x1

    invoke-interface {v4, v5, v6}, Lne3/j;->g0(J)V

    iget-wide v7, p0, Lcom/squareup/wire/r;->b:J

    add-long/2addr v7, v5

    iput-wide v7, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v4}, Lne3/j;->readByte()B

    move-result v4

    and-int/lit8 v5, v4, 0x7f

    int-to-long v5, v5

    shl-long/2addr v5, v3

    or-long/2addr v1, v5

    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_2

    invoke-virtual {p0, v0}, Lcom/squareup/wire/r;->b(I)V

    return-wide v1

    :cond_2
    add-int/lit8 v3, v3, 0x7

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "WireInput encountered a malformed varint"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()V
    .locals 3

    iget v0, p0, Lcom/squareup/wire/r;->e:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/squareup/wire/r;->h()I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected call to skip()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/squareup/wire/r;->c()J

    move-result-wide v0

    iget-object v2, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v2, v0, v1}, Lne3/j;->skip(J)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/squareup/wire/r;->i()J

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/squareup/wire/r;->l()J

    return-void
.end method

.method public final n(I)V
    .locals 6

    :goto_0
    iget-wide v0, p0, Lcom/squareup/wire/r;->b:J

    iget-wide v2, p0, Lcom/squareup/wire/r;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_8

    iget-object v0, p0, Lcom/squareup/wire/r;->a:Lne3/j;

    invoke-interface {v0}, Lne3/j;->o()Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p0}, Lcom/squareup/wire/r;->f()I

    move-result v1

    if-eqz v1, :cond_7

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v1, v1, 0x7

    if-eqz v1, :cond_6

    const/4 v3, 0x1

    if-eq v1, v3, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v0, 0x3

    if-eq v1, v0, :cond_3

    const/4 v0, 0x4

    if-eq v1, v0, :cond_1

    const/4 v0, 0x5

    if-ne v1, v0, :cond_0

    iput v0, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {p0}, Lcom/squareup/wire/r;->h()I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Unexpected field encoding: "

    invoke-static {v1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ne v2, p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Unexpected end group"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0, v2}, Lcom/squareup/wire/r;->n(I)V

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/squareup/wire/r;->f()I

    move-result v1

    iget-wide v2, p0, Lcom/squareup/wire/r;->b:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/squareup/wire/r;->b:J

    invoke-interface {v0, v4, v5}, Lne3/j;->skip(J)V

    goto :goto_0

    :cond_5
    iput v3, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {p0}, Lcom/squareup/wire/r;->i()J

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    iput v0, p0, Lcom/squareup/wire/r;->e:I

    invoke-virtual {p0}, Lcom/squareup/wire/r;->l()J

    goto :goto_0

    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Unexpected tag 0"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method
