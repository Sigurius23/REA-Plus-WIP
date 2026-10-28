.class public final Ljg3/r;
.super Lkg3/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final F:Ljg3/e;

.field public final G:Ljg3/p;

.field public final H:Ljg3/o;


# direct methods
.method public constructor <init>(Ljg3/e;Ljg3/o;Ljg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg3/r;->F:Ljg3/e;

    iput-object p3, p0, Ljg3/r;->G:Ljg3/p;

    iput-object p2, p0, Ljg3/r;->H:Ljg3/o;

    return-void
.end method

.method public static o0(JILjg3/o;)Ljg3/r;
    .locals 3

    invoke-virtual {p3}, Ljg3/o;->k()Log3/h;

    move-result-object v0

    int-to-long v1, p2

    invoke-static {p0, p1, v1, v2}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object p0

    new-instance p1, Ljg3/r;

    invoke-direct {p1, p0, p3, v0}, Ljg3/r;-><init>(Ljg3/e;Ljg3/o;Ljg3/p;)V

    return-object p1
.end method

.method public static p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;
    .locals 5

    const-string v0, "localDateTime"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zone"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljg3/p;

    if-eqz v0, :cond_0

    new-instance p2, Ljg3/r;

    move-object v0, p1

    check-cast v0, Ljg3/p;

    invoke-direct {p2, p0, p1, v0}, Ljg3/r;-><init>(Ljg3/e;Ljg3/o;Ljg3/p;)V

    return-object p2

    :cond_0
    invoke-virtual {p1}, Ljg3/o;->k()Log3/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Log3/h;->c(Ljg3/e;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljg3/p;

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Log3/h;->b(Ljg3/e;)Log3/e;

    move-result-object p2

    iget-object v0, p2, Log3/e;->y:Ljg3/p;

    iget v0, v0, Ljg3/p;->x:I

    iget-object v1, p2, Log3/e;->x:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {v4, v0, v1}, Ljg3/b;->a(IJ)Ljg3/b;

    move-result-object v0

    iget-wide v0, v0, Ljg3/b;->w:J

    invoke-virtual {p0, v0, v1}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object p0

    iget-object p2, p2, Log3/e;->y:Ljg3/p;

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {v1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "offset"

    invoke-static {p2, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljg3/p;

    :goto_0
    new-instance v0, Ljg3/r;

    invoke-direct {v0, p0, p1, p2}, Ljg3/r;-><init>(Ljg3/e;Ljg3/o;Ljg3/p;)V

    return-object v0
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    new-instance v0, Ljava/io/InvalidObjectException;

    const-string v1, "Deserialization via serialization delegate"

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final b(JLng3/m;)Lng3/j;
    .locals 6

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_3

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1c

    iget-object v3, p0, Ljg3/r;->H:Ljg3/o;

    iget-object v4, p0, Ljg3/r;->F:Ljg3/e;

    if-eq v1, v2, :cond_2

    const/16 v2, 0x1d

    iget-object v5, p0, Ljg3/r;->G:Ljg3/p;

    if-eq v1, v2, :cond_0

    invoke-virtual {v4, p1, p2, p3}, Ljg3/e;->y0(JLng3/m;)Ljg3/e;

    move-result-object p1

    invoke-static {p1, v3, v5}, Ljg3/r;->p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {p3, p1, p2, v0}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    invoke-static {p1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v3}, Ljg3/o;->k()Log3/h;

    move-result-object p2

    invoke-virtual {p2, v4, p1}, Log3/h;->d(Ljg3/e;Ljg3/p;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljg3/r;

    invoke-direct {p2, v4, v3, p1}, Ljg3/r;-><init>(Ljg3/e;Ljg3/o;Ljg3/p;)V

    return-object p2

    :cond_1
    return-object p0

    :cond_2
    iget-object p3, v4, Ljg3/e;->G:Ljg3/f;

    iget p3, p3, Ljg3/f;->I:I

    invoke-static {p1, p2, p3, v3}, Ljg3/r;->o0(JILjg3/o;)Ljg3/r;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/r;

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/r;->q0(JLng3/r;)Ljg3/r;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    sget-object v0, Lng3/a;->e0:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    check-cast p1, Lng3/a;

    iget-object p1, p1, Lng3/a;->x:Lng3/s;

    return-object p1

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/r;

    iget-object v1, p0, Ljg3/r;->F:Ljg3/e;

    iget-object v3, p1, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v1, v3}, Ljg3/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ljg3/r;->G:Ljg3/p;

    iget-object v3, p1, Ljg3/r;->G:Ljg3/p;

    invoke-virtual {v1, v3}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ljg3/r;->H:Ljg3/o;

    iget-object p1, p1, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {v1, p1}, Ljg3/o;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 2

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1d

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->f(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Ljg3/r;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    return p1

    :cond_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Field too large for an int: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-super {p0, p1}, Lkg3/c;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ljg3/r;->F:Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lkg3/c;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1d

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object p1, p0, Ljg3/r;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v0, p1

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lkg3/c;->toEpochSecond()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v0}, Ljg3/e;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljg3/r;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {v1}, Ljg3/o;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/r;->q0(JLng3/r;)Ljg3/r;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/r;->q0(JLng3/r;)Ljg3/r;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/r;->q0(JLng3/r;)Ljg3/r;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 2

    iget-object v0, p0, Ljg3/r;->F:Ljg3/e;

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-static {p1, v0}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p1

    iget-object v0, p0, Ljg3/r;->H:Ljg3/o;

    iget-object v1, p0, Ljg3/r;->G:Ljg3/p;

    invoke-static {p1, v0, v1}, Ljg3/r;->p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;

    move-result-object p1

    return-object p1
.end method

.method public final q0(JLng3/r;)Ljg3/r;
    .locals 5

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Lng3/b;

    sget-object v1, Lng3/b;->y:Lng3/b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    iget-object v2, p0, Ljg3/r;->G:Ljg3/p;

    iget-object v3, p0, Ljg3/r;->H:Ljg3/o;

    iget-object v4, p0, Ljg3/r;->F:Ljg3/e;

    if-ltz v1, :cond_0

    sget-object v1, Lng3/b;->G:Lng3/b;

    if-eq v0, v1, :cond_0

    invoke-virtual {v4, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    invoke-static {p1, v3, v2}, Ljg3/r;->p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v4, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    const-string p2, "localDateTime"

    invoke-static {p1, p2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "offset"

    invoke-static {v2, p2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "zone"

    invoke-static {v3, p2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide p2

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    iget p1, p1, Ljg3/f;->I:I

    invoke-static {p2, p3, p1, v3}, Ljg3/r;->o0(JILjg3/o;)Ljg3/r;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/r;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v1}, Ljg3/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljg3/r;->G:Ljg3/p;

    iget-object v2, v1, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ljg3/r;->H:Ljg3/o;

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5b

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljg3/o;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
