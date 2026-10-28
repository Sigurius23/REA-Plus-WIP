.class public final Ljg3/p;
.super Ljg3/o;
.source "SourceFile"

# interfaces
.implements Lng3/k;
.implements Lng3/l;
.implements Ljava/lang/Comparable;


# static fields
.field public static final E:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final F:Ljg3/p;

.field public static final G:Ljg3/p;

.field public static final H:Ljg3/p;

.field public static final z:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final x:I

.field public final transient y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x10

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    sput-object v0, Ljg3/p;->z:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    sput-object v0, Ljg3/p;->E:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v0

    sput-object v0, Ljg3/p;->F:Ljg3/p;

    const v0, -0xfd20

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v0

    sput-object v0, Ljg3/p;->G:Ljg3/p;

    const v0, 0xfd20

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v0

    sput-object v0, Ljg3/p;->H:Ljg3/p;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    invoke-direct {p0}, Ljg3/o;-><init>()V

    iput p1, p0, Ljg3/p;->x:I

    if-nez p1, :cond_0

    const-string p1, "Z"

    goto :goto_3

    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit16 v2, v0, 0xe10

    div-int/lit8 v3, v0, 0x3c

    rem-int/lit8 v3, v3, 0x3c

    if-gez p1, :cond_1

    const-string p1, "-"

    goto :goto_0

    :cond_1
    const-string p1, "+"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    if-ge v2, p1, :cond_2

    const-string v4, "0"

    goto :goto_1

    :cond_2
    const-string v4, ""

    :goto_1
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ":"

    const-string v4, ":0"

    if-ge v3, p1, :cond_3

    move-object v5, v4

    goto :goto_2

    :cond_3
    move-object v5, v2

    :goto_2
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    rem-int/lit8 v0, v0, 0x3c

    if-eqz v0, :cond_5

    if-ge v0, p1, :cond_4

    move-object v2, v4

    :cond_4
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_3
    iput-object p1, p0, Ljg3/p;->y:Ljava/lang/String;

    return-void
.end method

.method public static o(Lng3/k;)Ljg3/p;
    .locals 3

    sget-object v0, Lng3/p;->e:Lng3/n;

    invoke-interface {p0, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg3/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain ZoneOffset from TemporalAccessor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Ljava/lang/String;)Ljg3/p;
    .locals 7

    const-string v0, "offsetId"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljg3/p;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg3/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v4, 0x5

    if-eq v0, v4, :cond_4

    const/4 v5, 0x6

    const/4 v6, 0x4

    if-eq v0, v5, :cond_3

    const/4 v5, 0x7

    if-eq v0, v5, :cond_2

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    invoke-static {v2, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v0

    invoke-static {v6, p0, v2}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v1

    invoke-static {v5, p0, v2}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v2

    goto :goto_1

    :cond_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Invalid ID for ZoneOffset, invalid format: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v0

    invoke-static {v1, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v1

    invoke-static {v4, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v2

    goto :goto_1

    :cond_3
    invoke-static {v2, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v0

    invoke-static {v6, p0, v2}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v1

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_4
    invoke-static {v2, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v0

    invoke-static {v1, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v1

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_6
    invoke-static {v2, p0, v3}, Ljg3/p;->s(ILjava/lang/String;Z)I

    move-result v0

    move v1, v3

    move v2, v1

    :goto_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2b

    const/16 v5, 0x2d

    if-eq v3, v4, :cond_8

    if-ne v3, v5, :cond_7

    goto :goto_2

    :cond_7
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Invalid ID for ZoneOffset, plus/minus not found when expected: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_2
    if-ne v3, v5, :cond_9

    neg-int p0, v0

    neg-int v0, v1

    neg-int v1, v2

    invoke-static {p0, v0, v1}, Ljg3/p;->q(III)Ljg3/p;

    move-result-object p0

    return-object p0

    :cond_9
    invoke-static {v0, v1, v2}, Ljg3/p;->q(III)Ljg3/p;

    move-result-object p0

    return-object p0
.end method

.method public static q(III)Ljg3/p;
    .locals 4

    const/16 v0, -0x12

    if-lt p0, v0, :cond_b

    const/16 v0, 0x12

    if-gt p0, v0, :cond_b

    if-lez p0, :cond_1

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Zone offset minutes and seconds must be positive because hours is positive"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-gez p0, :cond_3

    if-gtz p1, :cond_2

    if-gtz p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Zone offset minutes and seconds must be negative because hours is negative"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    if-lez p1, :cond_4

    if-ltz p2, :cond_5

    :cond_4
    if-gez p1, :cond_6

    if-gtz p2, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Zone offset minutes and seconds must have the same sign"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const-string v2, " is not in the range 0 to 59"

    const/16 v3, 0x3b

    if-gt v1, v3, :cond_a

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gt v1, v3, :cond_9

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-ne v1, v0, :cond_8

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-gtz v0, :cond_7

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    if-gtz v0, :cond_7

    goto :goto_1

    :cond_7
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string p1, "Zone offset not in valid range: -18:00 to +18:00"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_1
    mul-int/lit16 p0, p0, 0xe10

    mul-int/lit8 p1, p1, 0x3c

    add-int/2addr p1, p0

    add-int/2addr p1, p2

    invoke-static {p1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p0

    return-object p0

    :cond_9
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Zone offset seconds not in valid range: abs(value) "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Zone offset minutes not in valid range: abs(value) "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string p2, "Zone offset hours not in valid range: value "

    const-string v0, " is not in the range -18 to 18"

    invoke-static {p0, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static r(I)Ljg3/p;
    .locals 3

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const v1, 0xfd20

    if-gt v0, v1, :cond_2

    rem-int/lit16 v0, p0, 0x384

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljg3/p;->z:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljg3/p;

    if-nez v2, :cond_0

    new-instance v2, Ljg3/p;

    invoke-direct {v2, p0}, Ljg3/p;-><init>(I)V

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljg3/p;

    sget-object v0, Ljg3/p;->E:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v0, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_0
    return-object v2

    :cond_1
    new-instance v0, Ljg3/p;

    invoke-direct {v0, p0}, Ljg3/p;-><init>(I)V

    return-object v0

    :cond_2
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Zone offset not in valid range: -18:00 to +18:00"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
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

.method public static s(ILjava/lang/String;Z)I
    .locals 2

    if-eqz p2, :cond_1

    add-int/lit8 p2, p0, -0x1

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v0, 0x3a

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid ID for ZoneOffset, colon not found when expected: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v0, 0x30

    if-lt p2, v0, :cond_2

    const/16 v1, 0x39

    if-gt p2, v1, :cond_2

    if-lt p0, v0, :cond_2

    if-gt p0, v1, :cond_2

    sub-int/2addr p2, v0

    mul-int/lit8 p2, p2, 0xa

    sub-int/2addr p0, v0

    add-int/2addr p0, p2

    return p0

    :cond_2
    new-instance p0, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid ID for ZoneOffset, non numeric characters found: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static t(Ljava/io/DataInput;)Ljg3/p;
    .locals 2

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-static {p0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p0

    return-object p0

    :cond_0
    mul-int/lit16 v0, v0, 0x384

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p0

    return-object p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    iget v0, p0, Ljg3/p;->x:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public final d(Lng3/m;)Lng3/s;
    .locals 2

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-interface {p1}, Lng3/m;->range()Lng3/s;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->a(Lng3/k;)Lng3/s;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->f0:Lng3/a;

    iget v1, p0, Ljg3/p;->x:I

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Lng3/j;->b(JLng3/m;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg3/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/p;

    iget p1, p1, Ljg3/p;->x:I

    iget v1, p0, Ljg3/p;->x:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 3

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    iget p1, p0, Ljg3/p;->x:I

    return p1

    :cond_0
    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Ljg3/p;->d(Lng3/m;)Lng3/s;

    move-result-object v0

    invoke-virtual {p0, p1}, Ljg3/p;->h(Lng3/m;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Lng3/s;->a(JLng3/m;)I

    move-result p1

    return p1

    :cond_1
    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->g:Lng3/n;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_2

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljg3/p;->y:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Lng3/m;)J
    .locals 2

    sget-object v0, Lng3/a;->f0:Lng3/a;

    if-ne p1, v0, :cond_0

    iget p1, p0, Ljg3/p;->x:I

    int-to-long v0, p1

    return-wide v0

    :cond_0
    instance-of v0, p1, Lng3/a;

    if-nez v0, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ljg3/p;->x:I

    return v0
.end method

.method public final k()Log3/h;
    .locals 1

    new-instance v0, Log3/g;

    invoke-direct {v0, p0}, Log3/g;-><init>(Ljg3/p;)V

    return-object v0
.end method

.method public final n(Ljava/io/ObjectOutput;)V
    .locals 1

    const/16 v0, 0x8

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-virtual {p0, p1}, Ljg3/p;->u(Ljava/io/DataOutput;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljg3/p;->y:Ljava/lang/String;

    return-object v0
.end method

.method public final u(Ljava/io/DataOutput;)V
    .locals 3

    iget v0, p0, Ljg3/p;->x:I

    rem-int/lit16 v1, v0, 0x384

    const/16 v2, 0x7f

    if-nez v1, :cond_0

    div-int/lit16 v1, v0, 0x384

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    if-ne v1, v2, :cond_1

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_1
    return-void
.end method
