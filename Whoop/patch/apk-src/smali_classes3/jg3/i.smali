.class public final Ljg3/i;
.super Lmg3/a;
.source "SourceFile"

# interfaces
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final H:Lg73/a;


# instance fields
.field public final F:Ljg3/e;

.field public final G:Ljg3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljg3/e;->H:Ljg3/e;

    sget-object v1, Ljg3/p;->H:Ljg3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljg3/i;

    invoke-direct {v2, v0, v1}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V

    sget-object v0, Ljg3/e;->I:Ljg3/e;

    sget-object v1, Ljg3/p;->G:Ljg3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljg3/i;

    invoke-direct {v2, v0, v1}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V

    new-instance v0, Lg73/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    sput-object v0, Ljg3/i;->H:Lg73/a;

    return-void
.end method

.method public constructor <init>(Ljg3/e;Ljg3/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "dateTime"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljg3/i;->F:Ljg3/e;

    const-string p1, "offset"

    invoke-static {p2, p1}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ljg3/i;->G:Ljg3/p;

    return-void
.end method

.method public static p0()Ljg3/i;
    .locals 6

    sget-object v0, Ljg3/o;->w:Ljava/util/Map;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljg3/o;->w:Ljava/util/Map;

    const-string v2, "zoneId"

    invoke-static {v0, v2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "aliasMap"

    invoke-static {v1, v2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    invoke-static {v0}, Ljg3/o;->l(Ljava/lang/String;)Ljg3/o;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Ljg3/c;->H:Ljg3/c;

    const-wide/16 v3, 0x3e8

    invoke-static {v1, v2, v3, v4}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v3

    const/16 v5, 0x3e8

    invoke-static {v5, v1, v2}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v1

    const v2, 0xf4240

    mul-int/2addr v1, v2

    invoke-static {v1, v3, v4}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v1

    invoke-virtual {v0}, Ljg3/o;->k()Log3/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object v0

    invoke-static {v1, v0}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v0

    return-object v0
.end method

.method public static q0(Ljg3/c;Ljg3/o;)Ljg3/i;
    .locals 2

    const-string v0, "instant"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zone"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljg3/o;->k()Log3/h;

    move-result-object p1

    invoke-virtual {p1, p0}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object p1

    iget-wide v0, p0, Ljg3/c;->F:J

    iget p0, p0, Ljg3/c;->G:I

    invoke-static {v0, v1, p0, p1}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object p0

    new-instance v0, Ljg3/i;

    invoke-direct {v0, p0, p1}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V

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

    const/16 v1, 0x45

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
    .locals 5

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_2

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x1c

    iget-object v3, p0, Ljg3/i;->G:Ljg3/p;

    iget-object v4, p0, Ljg3/i;->F:Ljg3/e;

    if-eq v1, v2, :cond_1

    const/16 v2, 0x1d

    if-eq v1, v2, :cond_0

    invoke-virtual {v4, p1, p2, p3}, Ljg3/e;->y0(JLng3/m;)Ljg3/e;

    move-result-object p1

    invoke-virtual {p0, p1, v3}, Ljg3/i;->s0(Ljg3/e;Ljg3/p;)Ljg3/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, v0, Lng3/a;->x:Lng3/s;

    invoke-virtual {p3, p1, p2, v0}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    invoke-static {p1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p1

    invoke-virtual {p0, v4, p1}, Ljg3/i;->s0(Ljg3/e;Ljg3/p;)Ljg3/i;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p3, v4, Ljg3/e;->G:Ljg3/f;

    iget p3, p3, Ljg3/f;->I:I

    int-to-long v0, p3

    invoke-static {p1, p2, v0, v1}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p1

    invoke-static {p1, v3}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/i;

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/i;->r0(JLng3/r;)Ljg3/i;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljg3/i;

    invoke-virtual {p0, p1}, Ljg3/i;->o0(Ljg3/i;)I

    move-result p1

    return p1
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
    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

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

.method public final e(Lng3/j;)Lng3/j;
    .locals 4

    sget-object v0, Lng3/a;->W:Lng3/a;

    iget-object v1, p0, Ljg3/i;->F:Ljg3/e;

    iget-object v2, v1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v2}, Ljg3/d;->toEpochDay()J

    move-result-wide v2

    invoke-interface {p1, v2, v3, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->z:Lng3/a;

    iget-object v1, v1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v1}, Ljg3/f;->C0()J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->f0:Lng3/a;

    iget-object v1, p0, Ljg3/i;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/i;

    iget-object v1, p0, Ljg3/i;->F:Ljg3/e;

    iget-object v3, p1, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v1, v3}, Ljg3/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ljg3/i;->G:Ljg3/p;

    iget-object p1, p1, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v1, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

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

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->f(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Ljg3/i;->G:Ljg3/p;

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
    invoke-super {p0, p1}, Lce/w;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_1

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->e:Lng3/n;

    if-eq p1, v0, :cond_6

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Lng3/p;->f:Lng3/o;

    iget-object v1, p0, Ljg3/i;->F:Ljg3/e;

    if-ne p1, v0, :cond_3

    iget-object p1, v1, Ljg3/e;->F:Ljg3/d;

    return-object p1

    :cond_3
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_4

    iget-object p1, v1, Ljg3/e;->G:Ljg3/f;

    return-object p1

    :cond_4
    sget-object v0, Lng3/p;->a:Lg73/a;

    if-ne p1, v0, :cond_5

    const/4 p1, 0x0

    return-object p1

    :cond_5
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_0
    iget-object p1, p0, Ljg3/i;->G:Ljg3/p;

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

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v0, p1}, Ljg3/e;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object p1, p0, Ljg3/i;->G:Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v0, p1

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Ljg3/i;->toEpochSecond()J

    move-result-wide v0

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v0}, Ljg3/e;->hashCode()I

    move-result v0

    iget-object v1, p0, Ljg3/i;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/i;->r0(JLng3/r;)Ljg3/i;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/i;->r0(JLng3/r;)Ljg3/i;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/i;->r0(JLng3/r;)Ljg3/i;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 2

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    iget-object v1, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1, v1}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p1

    iget-object v0, p0, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {p0, p1, v0}, Ljg3/i;->s0(Ljg3/e;Ljg3/p;)Ljg3/i;

    move-result-object p1

    return-object p1
.end method

.method public final o0(Ljg3/i;)I
    .locals 7

    iget-object v0, p1, Ljg3/i;->G:Ljg3/p;

    iget-object v1, p1, Ljg3/i;->F:Ljg3/e;

    iget-object v2, p0, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v2, v0}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Ljg3/i;->F:Ljg3/e;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v1}, Ljg3/e;->p0(Lkg3/b;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ljg3/i;->toEpochSecond()J

    move-result-wide v3

    invoke-virtual {p1}, Ljg3/i;->toEpochSecond()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Lcom/squareup/wire/n;->q(JJ)I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v2, Ljg3/e;->G:Ljg3/f;

    iget p1, p1, Ljg3/f;->I:I

    iget-object v0, v1, Ljg3/e;->G:Ljg3/f;

    iget v0, v0, Ljg3/f;->I:I

    sub-int/2addr p1, v0

    if-nez p1, :cond_1

    invoke-virtual {v2, v1}, Ljg3/e;->p0(Lkg3/b;)I

    move-result p1

    :cond_1
    return p1
.end method

.method public final r0(JLng3/r;)Ljg3/i;
    .locals 1

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v0, p1, p2, p3}, Ljg3/e;->v0(JLng3/r;)Ljg3/e;

    move-result-object p1

    iget-object p2, p0, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {p0, p1, p2}, Ljg3/i;->s0(Ljg3/e;Ljg3/p;)Ljg3/i;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/i;

    return-object p1
.end method

.method public final s0(Ljg3/e;Ljg3/p;)Ljg3/i;
    .locals 1

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v0, p2}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljg3/i;

    invoke-direct {v0, p1, p2}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V

    return-object v0
.end method

.method public final toEpochSecond()J
    .locals 2

    iget-object v0, p0, Ljg3/i;->F:Ljg3/e;

    iget-object v1, p0, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v0, v1}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ljg3/i;->F:Ljg3/e;

    invoke-virtual {v1}, Ljg3/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ljg3/i;->G:Ljg3/p;

    iget-object v1, v1, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
