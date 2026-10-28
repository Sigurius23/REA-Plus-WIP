.class public final Ljg3/h;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic H:I


# instance fields
.field public final F:I

.field public final G:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg3/o;

    invoke-direct {v0}, Llg3/o;-><init>()V

    const-string v1, "--"

    invoke-virtual {v0, v1}, Llg3/o;->d(Ljava/lang/String;)V

    sget-object v1, Lng3/a;->Z:Lng3/a;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Llg3/o;->g(Lng3/m;I)V

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Llg3/o;->c(C)V

    sget-object v1, Lng3/a;->U:Lng3/a;

    invoke-virtual {v0, v1, v2}, Llg3/o;->g(Lng3/m;I)V

    invoke-virtual {v0}, Llg3/o;->k()Llg3/b;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljg3/h;->F:I

    iput p2, p0, Ljg3/h;->G:I

    return-void
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

    const/16 v1, 0x40

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lng3/a;->U:Lng3/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Ljg3/h;

    iget v0, p0, Ljg3/h;->F:I

    iget v1, p1, Ljg3/h;->F:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ljg3/h;->G:I

    iget p1, p1, Ljg3/h;->G:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 4

    sget-object v0, Lng3/a;->Z:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-interface {p1}, Lng3/m;->range()Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lng3/a;->U:Lng3/a;

    if-ne p1, v0, :cond_3

    iget p1, p0, Ljg3/h;->F:I

    invoke-static {p1}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_1

    const/16 v0, 0x1f

    goto :goto_0

    :cond_1
    const/16 v0, 0x1e

    goto :goto_0

    :cond_2
    const/16 v0, 0x1c

    :goto_0
    int-to-long v0, v0

    invoke-static {p1}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object p1

    invoke-virtual {p1}, Ljg3/g;->n()I

    move-result p1

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Lng3/s;->d(JJ)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-super {p0, p1}, Lce/w;->d(Lng3/m;)Lng3/s;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 5

    invoke-static {p1}, Lkg3/d;->a(Lng3/k;)Lkg3/d;

    move-result-object v0

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {v0, v1}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->Z:Lng3/a;

    iget v1, p0, Ljg3/h;->F:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    sget-object v0, Lng3/a;->U:Lng3/a;

    invoke-interface {p1, v0}, Lng3/k;->d(Lng3/m;)Lng3/s;

    move-result-object v1

    iget-wide v1, v1, Lng3/s;->z:J

    iget v3, p0, Ljg3/h;->G:I

    int-to-long v3, v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Adjustment only supported on ISO date-time"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/h;

    iget v1, p0, Ljg3/h;->F:I

    iget v3, p1, Ljg3/h;->F:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ljg3/h;->G:I

    iget p1, p1, Ljg3/h;->G:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 3

    invoke-virtual {p0, p1}, Ljg3/h;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/h;->h(Lng3/m;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_0

    sget-object p1, Lkg3/e;->w:Lkg3/e;

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Lce/w;->g(Lng3/q;)Ljava/lang/Object;

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

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1

    const/16 v1, 0x17

    if-ne v0, v1, :cond_0

    iget p1, p0, Ljg3/h;->F:I

    :goto_0
    int-to-long v0, p1

    return-wide v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget p1, p0, Ljg3/h;->G:I

    goto :goto_0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Ljg3/h;->F:I

    shl-int/lit8 v0, v0, 0x6

    iget v1, p0, Ljg3/h;->G:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "--"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ljg3/h;->F:I

    if-ge v2, v1, :cond_0

    const-string v3, "0"

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget v2, p0, Ljg3/h;->G:I

    if-ge v2, v1, :cond_1

    const-string v1, "-0"

    goto :goto_1

    :cond_1
    const-string v1, "-"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
