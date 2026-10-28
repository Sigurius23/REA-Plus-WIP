.class public final Log3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# instance fields
.field public w:B

.field public x:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(BLjava/io/Serializable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Log3/a;->w:B

    iput-object p2, p0, Log3/a;->x:Ljava/io/Serializable;

    return-void
.end method

.method public static a(Ljava/io/DataInput;)J
    .locals 4

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v0

    const/16 v1, 0xff

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v2

    and-int/2addr v2, v1

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result p0

    and-int/2addr p0, v1

    shl-int/lit8 v0, v0, 0x10

    shl-int/lit8 v1, v2, 0x8

    add-int/2addr v0, v1

    add-int/2addr v0, p0

    int-to-long v0, v0

    const-wide/16 v2, 0x384

    mul-long/2addr v0, v2

    const-wide v2, 0x110bc5000L

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public static b(BLjava/io/DataInput;)Ljava/io/Serializable;
    .locals 8

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Log3/f;->a(Ljava/io/DataInput;)Log3/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/StreamCorruptedException;

    const-string p1, "Unknown serialized type"

    invoke-direct {p0, p1}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Log3/a;->a(Ljava/io/DataInput;)J

    move-result-wide v0

    invoke-static {p1}, Log3/a;->c(Ljava/io/DataInput;)Ljg3/p;

    move-result-object p0

    invoke-static {p1}, Log3/a;->c(Ljava/io/DataInput;)Ljg3/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Log3/e;

    invoke-direct {v2, v0, v1, p0, p1}, Log3/e;-><init>(JLjg3/p;Ljg3/p;)V

    return-object v2

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Offsets must not be equal"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    new-array v2, p0, [J

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, p0, :cond_4

    invoke-static {p1}, Log3/a;->a(Ljava/io/DataInput;)J

    move-result-wide v4

    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    add-int/2addr p0, v0

    new-array v3, p0, [Ljg3/p;

    move v4, v1

    :goto_1
    if-ge v4, p0, :cond_5

    invoke-static {p1}, Log3/a;->c(Ljava/io/DataInput;)Ljg3/p;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    new-array v4, p0, [J

    move v5, v1

    :goto_2
    if-ge v5, p0, :cond_6

    invoke-static {p1}, Log3/a;->a(Ljava/io/DataInput;)J

    move-result-wide v6

    aput-wide v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    add-int/2addr p0, v0

    new-array v5, p0, [Ljg3/p;

    move v0, v1

    :goto_3
    if-ge v0, p0, :cond_7

    invoke-static {p1}, Log3/a;->c(Ljava/io/DataInput;)Ljg3/p;

    move-result-object v6

    aput-object v6, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p0

    new-array v6, p0, [Log3/f;

    :goto_4
    if-ge v1, p0, :cond_8

    invoke-static {p1}, Log3/f;->a(Ljava/io/DataInput;)Log3/f;

    move-result-object v0

    aput-object v0, v6, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    new-instance v1, Log3/b;

    invoke-direct/range {v1 .. v6}, Log3/b;-><init>([J[Ljg3/p;[J[Ljg3/p;[Log3/f;)V

    return-object v1
.end method

.method public static c(Ljava/io/DataInput;)Ljg3/p;
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

.method public static d(JLjava/io/ObjectOutput;)V
    .locals 8

    const-wide v0, -0x110bc5000L

    cmp-long v0, p0, v0

    const/16 v1, 0xff

    if-ltz v0, :cond_0

    const-wide v2, 0x26cb5db00L

    cmp-long v0, p0, v2

    if-gez v0, :cond_0

    const-wide/16 v2, 0x384

    rem-long v4, p0, v2

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-nez v0, :cond_0

    const-wide v4, 0x110bc5000L

    add-long/2addr p0, v4

    div-long/2addr p0, v2

    long-to-int p0, p0

    ushr-int/lit8 p1, p0, 0x10

    and-int/2addr p1, v1

    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    ushr-int/lit8 p1, p0, 0x8

    and-int/2addr p1, v1

    invoke-interface {p2, p1}, Ljava/io/DataOutput;->writeByte(I)V

    and-int/2addr p0, v1

    invoke-interface {p2, p0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :cond_0
    invoke-interface {p2, v1}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-interface {p2, p0, p1}, Ljava/io/DataOutput;->writeLong(J)V

    return-void
.end method

.method public static e(Ljg3/p;Ljava/io/ObjectOutput;)V
    .locals 2

    iget p0, p0, Ljg3/p;->x:I

    rem-int/lit16 v0, p0, 0x384

    const/16 v1, 0x7f

    if-nez v0, :cond_0

    div-int/lit16 v0, p0, 0x384

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    if-ne v0, v1, :cond_1

    invoke-interface {p1, p0}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_1
    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Log3/a;->x:Ljava/io/Serializable;

    return-object v0
.end method


# virtual methods
.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    iput-byte v0, p0, Log3/a;->w:B

    invoke-static {v0, p1}, Log3/a;->b(BLjava/io/DataInput;)Ljava/io/Serializable;

    move-result-object p1

    iput-object p1, p0, Log3/a;->x:Ljava/io/Serializable;

    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 9

    iget-byte v0, p0, Log3/a;->w:B

    iget-object v1, p0, Log3/a;->x:Ljava/io/Serializable;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    check-cast v1, Log3/f;

    invoke-virtual {v1, p1}, Log3/f;->writeExternal(Ljava/io/ObjectOutput;)V

    return-void

    :cond_0
    new-instance p1, Ljava/io/InvalidClassException;

    const-string v0, "Unknown serialized type"

    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast v1, Log3/e;

    iget-object v0, v1, Log3/e;->x:Ljg3/p;

    iget-object v2, v1, Log3/e;->w:Ljg3/e;

    invoke-virtual {v2, v0}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v2

    invoke-static {v2, v3, p1}, Log3/a;->d(JLjava/io/ObjectOutput;)V

    invoke-static {v0, p1}, Log3/a;->e(Ljg3/p;Ljava/io/ObjectOutput;)V

    iget-object v0, v1, Log3/e;->y:Ljg3/p;

    invoke-static {v0, p1}, Log3/a;->e(Ljg3/p;Ljava/io/ObjectOutput;)V

    return-void

    :cond_2
    check-cast v1, Log3/b;

    iget-object v0, v1, Log3/b;->F:[Log3/f;

    iget-object v2, v1, Log3/b;->y:[J

    iget-object v3, v1, Log3/b;->w:[J

    array-length v4, v3

    invoke-interface {p1, v4}, Ljava/io/DataOutput;->writeInt(I)V

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_3

    aget-wide v7, v3, v6

    invoke-static {v7, v8, p1}, Log3/a;->d(JLjava/io/ObjectOutput;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object v3, v1, Log3/b;->x:[Ljg3/p;

    array-length v4, v3

    move v6, v5

    :goto_1
    if-ge v6, v4, :cond_4

    aget-object v7, v3, v6

    invoke-static {v7, p1}, Log3/a;->e(Ljg3/p;Ljava/io/ObjectOutput;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    array-length v3, v2

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    array-length v3, v2

    move v4, v5

    :goto_2
    if-ge v4, v3, :cond_5

    aget-wide v6, v2, v4

    invoke-static {v6, v7, p1}, Log3/a;->d(JLjava/io/ObjectOutput;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    iget-object v1, v1, Log3/b;->E:[Ljg3/p;

    array-length v2, v1

    move v3, v5

    :goto_3
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-static {v4, p1}, Log3/a;->e(Ljg3/p;Ljava/io/ObjectOutput;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    array-length v1, v0

    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    array-length v1, v0

    :goto_4
    if-ge v5, v1, :cond_7

    aget-object v2, v0, v5

    invoke-virtual {v2, p1}, Log3/f;->writeExternal(Ljava/io/ObjectOutput;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_7
    return-void
.end method
