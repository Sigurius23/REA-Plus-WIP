.class public abstract Lkg3/c;
.super Lmg3/a;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lkg3/c;

    invoke-virtual {p0}, Lkg3/c;->toEpochSecond()J

    move-result-wide v0

    invoke-virtual {p1}, Lkg3/c;->toEpochSecond()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->q(JJ)I

    move-result v0

    if-nez v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljg3/r;

    iget-object v1, v0, Ljg3/r;->F:Ljg3/e;

    iget-object v2, v1, Ljg3/e;->G:Ljg3/f;

    iget v2, v2, Ljg3/f;->I:I

    check-cast p1, Ljg3/r;

    iget-object v3, p1, Ljg3/r;->F:Ljg3/e;

    iget-object v4, v3, Ljg3/e;->G:Ljg3/f;

    iget v4, v4, Ljg3/f;->I:I

    sub-int/2addr v2, v4

    if-nez v2, :cond_1

    invoke-virtual {v1, v3}, Ljg3/e;->p0(Lkg3/b;)I

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, v0, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {v0}, Ljg3/o;->getId()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {p1}, Ljg3/o;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, v1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    iget-object p1, v3, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    :cond_0
    return p1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method public f(Lng3/m;)I
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

    move-object v0, p0

    check-cast v0, Ljg3/r;

    iget-object v0, v0, Ljg3/r;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->f(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    return p1

    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Field too large for an int: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-super {p0, p1}, Lce/w;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public g(Lng3/q;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_6

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->F:Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_2

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_2
    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_3

    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->G:Ljg3/p;

    return-object p1

    :cond_3
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_4

    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->F:Ljg3/e;

    iget-object p1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p1}, Ljg3/d;->toEpochDay()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_5

    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->F:Ljg3/e;

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    return-object p1

    :cond_5
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_0
    move-object p1, p0

    check-cast p1, Ljg3/r;

    iget-object p1, p1, Ljg3/r;->H:Ljg3/o;

    return-object p1
.end method

.method public final toEpochSecond()J
    .locals 6

    move-object v0, p0

    check-cast v0, Ljg3/r;

    iget-object v1, v0, Ljg3/r;->F:Ljg3/e;

    iget-object v2, v1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v2}, Ljg3/d;->toEpochDay()J

    move-result-wide v2

    const-wide/32 v4, 0x15180

    mul-long/2addr v2, v4

    iget-object v1, v1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->D0()I

    move-result v1

    int-to-long v4, v1

    add-long/2addr v2, v4

    iget-object v0, v0, Ljg3/r;->G:Ljg3/p;

    iget v0, v0, Ljg3/p;->x:I

    int-to-long v0, v0

    sub-long/2addr v2, v0

    return-wide v2
.end method
