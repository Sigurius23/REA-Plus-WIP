.class public final Ljg3/f;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Lng3/j;
.implements Lng3/l;
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# static fields
.field public static final J:Ljg3/f;

.field public static final K:Ljg3/f;

.field public static final L:[Ljg3/f;


# instance fields
.field public final F:B

.field public final G:B

.field public final H:B

.field public final I:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x18

    new-array v0, v0, [Ljg3/f;

    sput-object v0, Ljg3/f;->L:[Ljg3/f;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Ljg3/f;->L:[Ljg3/f;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    new-instance v3, Ljg3/f;

    invoke-direct {v3, v1, v0, v0, v0}, Ljg3/f;-><init>(IIII)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    aget-object v0, v2, v0

    const/16 v1, 0xc

    aget-object v1, v2, v1

    sput-object v0, Ljg3/f;->J:Ljg3/f;

    new-instance v0, Ljg3/f;

    const/16 v1, 0x17

    const v2, 0x3b9ac9ff

    const/16 v3, 0x3b

    invoke-direct {v0, v1, v3, v3, v2}, Ljg3/f;-><init>(IIII)V

    sput-object v0, Ljg3/f;->K:Ljg3/f;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    int-to-byte p1, p1

    iput-byte p1, p0, Ljg3/f;->F:B

    int-to-byte p1, p2

    iput-byte p1, p0, Ljg3/f;->G:B

    int-to-byte p1, p3

    iput-byte p1, p0, Ljg3/f;->H:B

    iput p4, p0, Ljg3/f;->I:I

    return-void
.end method

.method public static B0(Ljava/io/DataInput;)Ljg3/f;
    .locals 5

    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    not-int v0, v0

    move p0, v1

    move v2, p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v2

    if-gez v2, :cond_1

    not-int p0, v2

    move v2, v1

    move v1, p0

    move p0, v2

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/io/DataInput;->readByte()B

    move-result v3

    if-gez v3, :cond_2

    not-int p0, v3

    move v4, v2

    move v2, v1

    move v1, v4

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v1

    move p0, v2

    move v2, v1

    move v1, p0

    move p0, v3

    :goto_0
    invoke-static {v0, v1, p0, v2}, Ljg3/f;->t0(IIII)Ljg3/f;

    move-result-object p0

    return-object p0
.end method

.method public static p0(IIII)Ljg3/f;
    .locals 1

    or-int v0, p1, p2

    or-int/2addr v0, p3

    if-nez v0, :cond_0

    sget-object p1, Ljg3/f;->L:[Ljg3/f;

    aget-object p0, p1, p0

    return-object p0

    :cond_0
    new-instance v0, Ljg3/f;

    invoke-direct {v0, p0, p1, p2, p3}, Ljg3/f;-><init>(IIII)V

    return-object v0
.end method

.method public static q0(Lng3/k;)Ljg3/f;
    .locals 3

    sget-object v0, Lng3/p;->g:Lng3/n;

    invoke-interface {p0, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg3/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain LocalTime from TemporalAccessor: "

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

.method public static s0(II)Ljg3/f;
    .locals 3

    sget-object v0, Lng3/a;->O:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    if-nez p1, :cond_0

    sget-object p1, Ljg3/f;->L:[Ljg3/f;

    aget-object p0, p1, p0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->K:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    new-instance v0, Ljg3/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1, v1}, Ljg3/f;-><init>(IIII)V

    return-object v0
.end method

.method public static t0(IIII)Ljg3/f;
    .locals 3

    sget-object v0, Lng3/a;->O:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->K:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->I:Lng3/a;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->y:Lng3/a;

    int-to-long v1, p3

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    invoke-static {p0, p1, p2, p3}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p0

    return-object p0
.end method

.method public static u0(J)Ljg3/f;
    .locals 7

    sget-object v0, Lng3/a;->z:Lng3/a;

    invoke-virtual {v0, p0, p1}, Lng3/a;->f(J)V

    const-wide v0, 0x34630b8a000L

    div-long v2, p0, v0

    long-to-int v2, v2

    int-to-long v3, v2

    mul-long/2addr v3, v0

    sub-long/2addr p0, v3

    const-wide v0, 0xdf8475800L

    div-long v3, p0, v0

    long-to-int v3, v3

    int-to-long v4, v3

    mul-long/2addr v4, v0

    sub-long/2addr p0, v4

    const-wide/32 v0, 0x3b9aca00

    div-long v4, p0, v0

    long-to-int v4, v4

    int-to-long v5, v4

    mul-long/2addr v5, v0

    sub-long/2addr p0, v5

    long-to-int p0, p0

    invoke-static {v2, v3, v4, p0}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p0

    return-object p0
.end method

.method public static v0(J)Ljg3/f;
    .locals 4

    sget-object v0, Lng3/a;->J:Lng3/a;

    invoke-virtual {v0, p0, p1}, Lng3/a;->f(J)V

    const-wide/16 v0, 0xe10

    div-long v0, p0, v0

    long-to-int v0, v0

    mul-int/lit16 v1, v0, 0xe10

    int-to-long v1, v1

    sub-long/2addr p0, v1

    const-wide/16 v1, 0x3c

    div-long v1, p0, v1

    long-to-int v1, v1

    mul-int/lit8 v2, v1, 0x3c

    int-to-long v2, v2

    sub-long/2addr p0, v2

    long-to-int p0, p0

    const/4 p1, 0x0

    invoke-static {v0, v1, p0, p1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p0

    return-object p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljg3/l;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ljg3/l;-><init>(Ljava/lang/Object;B)V

    return-object v0
.end method


# virtual methods
.method public final A0(J)Ljg3/f;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-byte v0, p0, Ljg3/f;->F:B

    mul-int/lit16 v0, v0, 0xe10

    iget-byte v1, p0, Ljg3/f;->G:B

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v1, v0

    iget-byte v0, p0, Ljg3/f;->H:B

    add-int/2addr v1, v0

    const-wide/32 v2, 0x15180

    rem-long/2addr p1, v2

    long-to-int p1, p1

    add-int/2addr p1, v1

    const p2, 0x15180

    add-int/2addr p1, p2

    rem-int/2addr p1, p2

    if-ne v1, p1, :cond_1

    :goto_0
    return-object p0

    :cond_1
    div-int/lit16 p2, p1, 0xe10

    div-int/lit8 v0, p1, 0x3c

    rem-int/lit8 v0, v0, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    iget v1, p0, Ljg3/f;->I:I

    invoke-static {p2, v0, p1, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final C0()J
    .locals 6

    iget-byte v0, p0, Ljg3/f;->F:B

    int-to-long v0, v0

    const-wide v2, 0x34630b8a000L

    mul-long/2addr v0, v2

    iget-byte v2, p0, Ljg3/f;->G:B

    int-to-long v2, v2

    const-wide v4, 0xdf8475800L

    mul-long/2addr v2, v4

    add-long/2addr v2, v0

    iget-byte v0, p0, Ljg3/f;->H:B

    int-to-long v0, v0

    const-wide/32 v4, 0x3b9aca00

    mul-long/2addr v0, v4

    add-long/2addr v0, v2

    iget v2, p0, Ljg3/f;->I:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final D0()I
    .locals 2

    iget-byte v0, p0, Ljg3/f;->F:B

    mul-int/lit16 v0, v0, 0xe10

    iget-byte v1, p0, Ljg3/f;->G:B

    mul-int/lit8 v1, v1, 0x3c

    add-int/2addr v1, v0

    iget-byte v0, p0, Ljg3/f;->H:B

    add-int/2addr v1, v0

    return v1
.end method

.method public final E0(JLng3/m;)Ljg3/f;
    .locals 9

    instance-of v0, p3, Lng3/a;

    if-eqz v0, :cond_6

    move-object v0, p3

    check-cast v0, Lng3/a;

    invoke-virtual {v0, p1, p2}, Lng3/a;->f(J)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ljg3/f;->I:I

    iget-byte v2, p0, Ljg3/f;->H:B

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0xc

    iget-byte v7, p0, Ljg3/f;->G:B

    iget-byte v8, p0, Ljg3/f;->F:B

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string p2, "Unsupported field: "

    invoke-static {p2, p3}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    div-int/lit8 v8, v8, 0xc

    int-to-long v0, v8

    sub-long/2addr p1, v0

    mul-long/2addr p1, v5

    invoke-virtual {p0, p1, p2}, Ljg3/f;->x0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-wide/16 v5, 0x18

    cmp-long p3, p1, v5

    if-nez p3, :cond_0

    move-wide p1, v3

    :cond_0
    long-to-int p1, p1

    if-ne v8, p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p2, Lng3/a;->O:Lng3/a;

    int-to-long v3, p1

    invoke-virtual {p2, v3, v4}, Lng3/a;->f(J)V

    invoke-static {p1, v7, v2, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_2
    long-to-int p1, p1

    if-ne v8, p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p2, Lng3/a;->O:Lng3/a;

    int-to-long v3, p1

    invoke-virtual {p2, v3, v4}, Lng3/a;->f(J)V

    invoke-static {p1, v7, v2, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_3
    cmp-long p3, p1, v5

    if-nez p3, :cond_3

    move-wide p1, v3

    :cond_3
    rem-int/lit8 v8, v8, 0xc

    int-to-long v0, v8

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->x0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_4
    rem-int/lit8 v8, v8, 0xc

    int-to-long v0, v8

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->x0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_5
    mul-int/lit8 v8, v8, 0x3c

    add-int/2addr v8, v7

    int-to-long v0, v8

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->y0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_6
    long-to-int p1, p1

    if-ne v7, p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p2, Lng3/a;->K:Lng3/a;

    int-to-long v3, p1

    invoke-virtual {p2, v3, v4}, Lng3/a;->f(J)V

    invoke-static {v8, p1, v2, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p0}, Ljg3/f;->D0()I

    move-result p3

    int-to-long v0, p3

    sub-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->A0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_8
    long-to-int p1, p1

    if-ne v2, p1, :cond_5

    :goto_0
    return-object p0

    :cond_5
    sget-object p2, Lng3/a;->I:Lng3/a;

    int-to-long v2, p1

    invoke-virtual {p2, v2, v3}, Lng3/a;->f(J)V

    invoke-static {v8, v7, p1, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_9
    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    invoke-static {p1, p2}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_a
    long-to-int p1, p1

    const p2, 0xf4240

    mul-int/2addr p1, p2

    invoke-virtual {p0, p1}, Ljg3/f;->G0(I)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_b
    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    invoke-static {p1, p2}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_c
    long-to-int p1, p1

    mul-int/lit16 p1, p1, 0x3e8

    invoke-virtual {p0, p1}, Ljg3/f;->G0(I)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-static {p1, p2}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_e
    long-to-int p1, p1

    invoke-virtual {p0, p1}, Ljg3/f;->G0(I)Ljg3/f;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-interface {p3, p0, p1, p2}, Lng3/m;->c(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/f;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G0(I)Ljg3/f;
    .locals 3

    iget v0, p0, Ljg3/f;->I:I

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object v0, Lng3/a;->y:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    iget-byte v0, p0, Ljg3/f;->G:B

    iget-byte v1, p0, Ljg3/f;->H:B

    iget-byte v2, p0, Ljg3/f;->F:B

    invoke-static {v2, v0, v1, p1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final H0(Ljava/io/DataOutput;)V
    .locals 4

    iget-byte v0, p0, Ljg3/f;->H:B

    iget-byte v1, p0, Ljg3/f;->F:B

    iget-byte v2, p0, Ljg3/f;->G:B

    iget v3, p0, Ljg3/f;->I:I

    if-nez v3, :cond_2

    if-nez v0, :cond_1

    if-nez v2, :cond_0

    not-int v0, v1

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :cond_0
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    not-int v0, v2

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :cond_1
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    not-int v0, v0

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :cond_2
    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    return-void
.end method

.method public final a(Lng3/m;)Z
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    check-cast p1, Lng3/a;

    invoke-virtual {p1}, Lng3/a;->g()Z

    move-result p1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lng3/m;->b(Lng3/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic b(JLng3/m;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/f;->E0(JLng3/m;)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLng3/r;)Lng3/j;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljg3/f;->w0(JLng3/r;)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljg3/f;

    invoke-virtual {p0, p1}, Ljg3/f;->o0(Ljg3/f;)I

    move-result p1

    return p1
.end method

.method public final e(Lng3/j;)Lng3/j;
    .locals 3

    sget-object v0, Lng3/a;->z:Lng3/a;

    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v1

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
    instance-of v1, p1, Ljg3/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ljg3/f;

    iget-byte v1, p0, Ljg3/f;->F:B

    iget-byte v3, p1, Ljg3/f;->F:B

    if-ne v1, v3, :cond_1

    iget-byte v1, p0, Ljg3/f;->G:B

    iget-byte v3, p1, Ljg3/f;->G:B

    if-ne v1, v3, :cond_1

    iget-byte v1, p0, Ljg3/f;->H:B

    iget-byte v3, p1, Ljg3/f;->H:B

    if-ne v1, v3, :cond_1

    iget v1, p0, Ljg3/f;->I:I

    iget p1, p1, Ljg3/f;->I:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f(Lng3/m;)I
    .locals 1

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ljg3/f;->r0(Lng3/m;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Lce/w;->f(Lng3/m;)I

    move-result p1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_0

    sget-object p1, Lng3/b;->x:Lng3/b;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_1

    return-object p0

    :cond_1
    sget-object v0, Lng3/p;->b:Lg73/d;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-eq p1, v0, :cond_3

    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 4

    instance-of v0, p1, Lng3/a;

    if-eqz v0, :cond_2

    sget-object v0, Lng3/a;->z:Lng3/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-object v0, Lng3/a;->F:Lng3/a;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    return-wide v0

    :cond_1
    invoke-virtual {p0, p1}, Ljg3/f;->r0(Lng3/m;)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_2
    invoke-interface {p1, p0}, Lng3/m;->e(Lng3/k;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public final i(JLng3/r;)Lng3/j;
    .locals 2

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    invoke-virtual {p0, p1, p2, p3}, Ljg3/f;->w0(JLng3/r;)Ljg3/f;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1, p3}, Ljg3/f;->w0(JLng3/r;)Ljg3/f;

    move-result-object p1

    return-object p1

    :cond_0
    neg-long p1, p1

    invoke-virtual {p0, p1, p2, p3}, Ljg3/f;->w0(JLng3/r;)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljg3/d;)Lng3/j;
    .locals 0

    invoke-virtual {p1, p0}, Ljg3/d;->e(Lng3/j;)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/f;

    return-object p1
.end method

.method public final o0(Ljg3/f;)I
    .locals 5

    iget-byte v0, p1, Ljg3/f;->F:B

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    iget-byte v4, p0, Ljg3/f;->F:B

    if-ge v4, v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    if-le v4, v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    if-nez v0, :cond_8

    iget-byte v0, p1, Ljg3/f;->G:B

    iget-byte v4, p0, Ljg3/f;->G:B

    if-ge v4, v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    if-le v4, v0, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-nez v0, :cond_8

    iget-byte v0, p1, Ljg3/f;->H:B

    iget-byte v4, p0, Ljg3/f;->H:B

    if-ge v4, v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    if-le v4, v0, :cond_5

    move v0, v2

    goto :goto_2

    :cond_5
    move v0, v1

    :goto_2
    if-nez v0, :cond_8

    iget p1, p1, Ljg3/f;->I:I

    iget v0, p0, Ljg3/f;->I:I

    if-ge v0, p1, :cond_6

    return v3

    :cond_6
    if-le v0, p1, :cond_7

    return v2

    :cond_7
    return v1

    :cond_8
    return v0
.end method

.method public final r0(Lng3/m;)I
    .locals 6

    move-object v0, p1

    check-cast v0, Lng3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v1, "Field too large for an int: "

    iget-byte v2, p0, Ljg3/f;->G:B

    iget v3, p0, Ljg3/f;->I:I

    const/16 v4, 0xc

    iget-byte v5, p0, Ljg3/f;->F:B

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    const-string v1, "Unsupported field: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    div-int/2addr v5, v4

    return v5

    :pswitch_1
    if-nez v5, :cond_0

    const/16 p1, 0x18

    return p1

    :cond_0
    :pswitch_2
    return v5

    :pswitch_3
    rem-int/2addr v5, v4

    rem-int/lit8 p1, v5, 0xc

    if-nez p1, :cond_1

    return v4

    :cond_1
    return v5

    :pswitch_4
    rem-int/2addr v5, v4

    return v5

    :pswitch_5
    mul-int/lit8 v5, v5, 0x3c

    add-int/2addr v5, v2

    return v5

    :pswitch_6
    return v2

    :pswitch_7
    invoke-virtual {p0}, Ljg3/f;->D0()I

    move-result p1

    return p1

    :pswitch_8
    iget-byte p1, p0, Ljg3/f;->H:B

    return p1

    :pswitch_9
    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    long-to-int p1, v0

    return p1

    :pswitch_a
    const p1, 0xf4240

    div-int/2addr v3, p1

    return v3

    :pswitch_b
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_c
    div-int/lit16 v3, v3, 0x3e8

    return v3

    :pswitch_d
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_e
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-byte v1, p0, Ljg3/f;->F:B

    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    const-string v3, "0"

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    const-string v3, ":0"

    iget-byte v4, p0, Ljg3/f;->G:B

    if-ge v4, v2, :cond_1

    move-object v5, v3

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-byte v4, p0, Ljg3/f;->H:B

    iget v5, p0, Ljg3/f;->I:I

    if-gtz v4, :cond_2

    if-lez v5, :cond_6

    :cond_2
    if-ge v4, v2, :cond_3

    move-object v1, v3

    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-lez v5, :cond_6

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v1, 0xf4240

    rem-int v2, v5, v1

    const/4 v3, 0x1

    if-nez v2, :cond_4

    div-int/2addr v5, v1

    add-int/lit16 v5, v5, 0x3e8

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    rem-int/lit16 v2, v5, 0x3e8

    if-nez v2, :cond_5

    div-int/lit16 v5, v5, 0x3e8

    add-int/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    const v1, 0x3b9aca00

    add-int/2addr v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w0(JLng3/r;)Ljg3/f;
    .locals 2

    instance-of v0, p3, Lng3/b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lng3/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lorg/threeten/bp/temporal/UnsupportedTemporalTypeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported unit: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const-wide/16 v0, 0x2

    rem-long/2addr p1, v0

    const-wide/16 v0, 0xc

    mul-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->x0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ljg3/f;->x0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ljg3/f;->y0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Ljg3/f;->A0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_4
    const-wide/32 v0, 0x5265c00

    rem-long/2addr p1, v0

    const-wide/32 v0, 0xf4240

    mul-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->z0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_5
    const-wide v0, 0x141dd76000L

    rem-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    mul-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Ljg3/f;->z0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Ljg3/f;->z0(J)Ljg3/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p3, p0, p1, p2}, Lng3/r;->a(Lng3/j;J)Lng3/j;

    move-result-object p1

    check-cast p1, Ljg3/f;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final x0(J)Ljg3/f;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, 0x18

    rem-long/2addr p1, v0

    long-to-int p1, p1

    iget-byte p2, p0, Ljg3/f;->F:B

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, 0x18

    rem-int/lit8 p1, p1, 0x18

    iget-byte p2, p0, Ljg3/f;->H:B

    iget v0, p0, Ljg3/f;->I:I

    iget-byte v1, p0, Ljg3/f;->G:B

    invoke-static {p1, v1, p2, v0}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final y0(J)Ljg3/f;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-byte v0, p0, Ljg3/f;->F:B

    mul-int/lit8 v0, v0, 0x3c

    iget-byte v1, p0, Ljg3/f;->G:B

    add-int/2addr v0, v1

    const-wide/16 v1, 0x5a0

    rem-long/2addr p1, v1

    long-to-int p1, p1

    add-int/2addr p1, v0

    add-int/lit16 p1, p1, 0x5a0

    rem-int/lit16 p1, p1, 0x5a0

    if-ne v0, p1, :cond_1

    :goto_0
    return-object p0

    :cond_1
    div-int/lit8 p2, p1, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    iget-byte v0, p0, Ljg3/f;->H:B

    iget v1, p0, Ljg3/f;->I:I

    invoke-static {p2, p1, v0, v1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1
.end method

.method public final z0(J)Ljg3/f;
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljg3/f;->C0()J

    move-result-wide v0

    const-wide v2, 0x4e94914f0000L

    rem-long/2addr p1, v2

    add-long/2addr p1, v0

    add-long/2addr p1, v2

    rem-long/2addr p1, v2

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    :goto_0
    return-object p0

    :cond_1
    const-wide v0, 0x34630b8a000L

    div-long v0, p1, v0

    long-to-int v0, v0

    const-wide v1, 0xdf8475800L

    div-long v1, p1, v1

    const-wide/16 v3, 0x3c

    rem-long/2addr v1, v3

    long-to-int v1, v1

    const-wide/32 v5, 0x3b9aca00

    div-long v7, p1, v5

    rem-long/2addr v7, v3

    long-to-int v2, v7

    rem-long/2addr p1, v5

    long-to-int p1, p1

    invoke-static {v0, v1, v2, p1}, Ljg3/f;->p0(IIII)Ljg3/f;

    move-result-object p1

    return-object p1
.end method
