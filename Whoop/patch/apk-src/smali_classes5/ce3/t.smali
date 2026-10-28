.class public final Lce3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public E:I

.field public F:I

.field public final w:Lne3/j;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lne3/j;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/t;->w:Lne3/j;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Lce3/t;->E:I

    const-wide/16 v1, -0x1

    iget-object v3, p0, Lce3/t;->w:Lne3/j;

    if-nez v0, :cond_4

    iget v0, p0, Lce3/t;->F:I

    int-to-long v4, v0

    invoke-interface {v3, v4, v5}, Lne3/j;->skip(J)V

    const/4 v0, 0x0

    iput v0, p0, Lce3/t;->F:I

    iget v0, p0, Lce3/t;->y:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lce3/t;->z:I

    invoke-static {v3}, Lwd3/f;->o(Lne3/j;)I

    move-result v1

    iput v1, p0, Lce3/t;->E:I

    iput v1, p0, Lce3/t;->x:I

    invoke-interface {v3}, Lne3/j;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v3}, Lne3/j;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    iput v2, p0, Lce3/t;->y:I

    sget-object v2, Lce3/u;->z:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lce3/g;->a:Lne3/l;

    iget v4, p0, Lce3/t;->z:I

    iget v5, p0, Lce3/t;->x:I

    iget v6, p0, Lce3/t;->y:I

    const/4 v7, 0x1

    invoke-static {v4, v5, v1, v6, v7}, Lce3/g;->b(IIIIZ)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v3}, Lne3/j;->readInt()I

    move-result v2

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    iput v2, p0, Lce3/t;->z:I

    const/16 v3, 0x9

    if-ne v1, v3, :cond_3

    if-ne v2, v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TYPE_CONTINUATION streamId changed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, " != TYPE_CONTINUATION"

    invoke-static {v1, p2}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_5

    :goto_1
    return-wide v1

    :cond_5
    iget p3, p0, Lce3/t;->E:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lce3/t;->E:I

    return-wide p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lce3/t;->w:Lne3/j;

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method
