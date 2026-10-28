.class public final Log3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final E:I

.field public final F:I

.field public final G:Ljg3/p;

.field public final H:Ljg3/p;

.field public final I:Ljg3/p;

.field public final w:Ljg3/g;

.field public final x:B

.field public final y:Ljg3/a;

.field public final z:Ljg3/f;


# direct methods
.method public constructor <init>(Ljg3/g;ILjg3/a;Ljg3/f;IILjg3/p;Ljg3/p;Ljg3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Log3/f;->w:Ljg3/g;

    int-to-byte p1, p2

    iput-byte p1, p0, Log3/f;->x:B

    iput-object p3, p0, Log3/f;->y:Ljg3/a;

    iput-object p4, p0, Log3/f;->z:Ljg3/f;

    iput p5, p0, Log3/f;->E:I

    iput p6, p0, Log3/f;->F:I

    iput-object p7, p0, Log3/f;->G:Ljg3/p;

    iput-object p8, p0, Log3/f;->H:Ljg3/p;

    iput-object p9, p0, Log3/f;->I:Ljg3/p;

    return-void
.end method

.method public static a(Ljava/io/DataInput;)Log3/f;
    .locals 12

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v0

    ushr-int/lit8 v1, v0, 0x1c

    invoke-static {v1}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object v3

    const/high16 v1, 0xfc00000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x16

    add-int/lit8 v4, v1, -0x20

    const/high16 v1, 0x380000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x13

    if-nez v1, :cond_0

    const/4 v1, 0x0

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ljg3/a;->l(I)Ljg3/a;

    move-result-object v1

    goto :goto_0

    :goto_1
    const v1, 0x7c000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0xe

    const/4 v2, 0x3

    invoke-static {v2}, Le4/p;->f(I)[I

    move-result-object v6

    and-int/lit16 v7, v0, 0x3000

    ushr-int/lit8 v7, v7, 0xc

    aget v8, v6, v7

    and-int/lit16 v6, v0, 0xff0

    ushr-int/lit8 v6, v6, 0x4

    and-int/lit8 v7, v0, 0xc

    ushr-int/lit8 v7, v7, 0x2

    and-int/2addr v0, v2

    const/16 v9, 0x1f

    if-ne v1, v9, :cond_1

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v1

    goto :goto_2

    :cond_1
    mul-int/lit16 v1, v1, 0xe10

    :goto_2
    const/16 v10, 0xff

    if-ne v6, v10, :cond_2

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v6

    :goto_3
    invoke-static {v6}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v6

    goto :goto_4

    :cond_2
    add-int/lit8 v6, v6, -0x80

    mul-int/lit16 v6, v6, 0x384

    goto :goto_3

    :goto_4
    iget v10, v6, Ljg3/p;->x:I

    if-ne v7, v2, :cond_3

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result v7

    :goto_5
    invoke-static {v7}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v7

    goto :goto_6

    :cond_3
    mul-int/lit16 v7, v7, 0x708

    add-int/2addr v7, v10

    goto :goto_5

    :goto_6
    if-ne v0, v2, :cond_4

    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-static {p0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p0

    :goto_7
    move-object v11, p0

    goto :goto_8

    :cond_4
    mul-int/lit16 v0, v0, 0x708

    add-int/2addr v0, v10

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p0

    goto :goto_7

    :goto_8
    const/16 p0, -0x1c

    if-lt v4, p0, :cond_6

    if-gt v4, v9, :cond_6

    if-eqz v4, :cond_6

    const p0, 0x15180

    rem-int v0, v1, p0

    add-int/2addr v0, p0

    rem-int/2addr v0, p0

    int-to-long v9, v0

    invoke-static {v9, v10}, Ljg3/f;->v0(J)Ljg3/f;

    move-result-object v0

    if-ltz v1, :cond_5

    div-int/2addr v1, p0

    goto :goto_9

    :cond_5
    add-int/lit8 v1, v1, 0x1

    div-int/2addr v1, p0

    add-int/lit8 v1, v1, -0x1

    :goto_9
    new-instance v2, Log3/f;

    move-object v9, v6

    move-object v10, v7

    move-object v6, v0

    move v7, v1

    invoke-direct/range {v2 .. v11}, Log3/f;-><init>(Ljg3/g;ILjg3/a;Ljg3/f;IILjg3/p;Ljg3/p;Ljg3/p;)V

    return-object v2

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Day of month indicator must be between -28 and 31 inclusive excluding zero"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Log3/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Log3/a;-><init>(BLjava/io/Serializable;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Log3/f;

    if-eqz v0, :cond_1

    check-cast p1, Log3/f;

    iget-object v0, p0, Log3/f;->w:Ljg3/g;

    iget-object v1, p1, Log3/f;->w:Ljg3/g;

    if-ne v0, v1, :cond_1

    iget-byte v0, p0, Log3/f;->x:B

    iget-byte v1, p1, Log3/f;->x:B

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Log3/f;->y:Ljg3/a;

    iget-object v1, p1, Log3/f;->y:Ljg3/a;

    if-ne v0, v1, :cond_1

    iget v0, p0, Log3/f;->F:I

    iget v1, p1, Log3/f;->F:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Log3/f;->E:I

    iget v1, p1, Log3/f;->E:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Log3/f;->z:Ljg3/f;

    iget-object v1, p1, Log3/f;->z:Ljg3/f;

    invoke-virtual {v0, v1}, Ljg3/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Log3/f;->G:Ljg3/p;

    iget-object v1, p1, Log3/f;->G:Ljg3/p;

    invoke-virtual {v0, v1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Log3/f;->H:Ljg3/p;

    iget-object v1, p1, Log3/f;->H:Ljg3/p;

    invoke-virtual {v0, v1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Log3/f;->I:Ljg3/p;

    iget-object p1, p1, Log3/f;->I:Ljg3/p;

    invoke-virtual {v0, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Log3/f;->z:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->D0()I

    move-result v0

    iget v1, p0, Log3/f;->E:I

    add-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0xf

    iget-object v1, p0, Log3/f;->w:Ljg3/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    shl-int/lit8 v1, v1, 0xb

    add-int/2addr v0, v1

    iget-byte v1, p0, Log3/f;->x:B

    add-int/lit8 v1, v1, 0x20

    shl-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    iget-object v1, p0, Log3/f;->y:Ljg3/a;

    if-nez v1, :cond_0

    const/4 v1, 0x7

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    :goto_0
    shl-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Log3/f;->F:I

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Log3/f;->G:Ljg3/p;

    iget v0, v0, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/f;->H:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/f;->I:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TransitionRule["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Log3/f;->I:Ljg3/p;

    iget v2, v1, Ljg3/p;->x:I

    iget-object v3, p0, Log3/f;->H:Ljg3/p;

    iget v4, v3, Ljg3/p;->x:I

    sub-int/2addr v2, v4

    if-lez v2, :cond_0

    const-string v2, "Gap "

    goto :goto_0

    :cond_0
    const-string v2, "Overlap "

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    iget-object v2, p0, Log3/f;->w:Ljg3/g;

    iget-byte v3, p0, Log3/f;->x:B

    iget-object v4, p0, Log3/f;->y:Ljg3/a;

    if-eqz v4, :cond_3

    const/4 v5, -0x1

    if-ne v3, v5, :cond_1

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on or before last day of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    if-gez v3, :cond_2

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on or before last day minus "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v1, v3

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " on or after "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, " at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Log3/f;->z:Ljg3/f;

    iget v2, p0, Log3/f;->E:I

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljg3/f;->D0()I

    move-result v1

    const/16 v3, 0x3c

    div-int/2addr v1, v3

    mul-int/lit16 v2, v2, 0x5a0

    add-int/2addr v2, v1

    int-to-long v1, v2

    const-wide/16 v4, 0x3c

    invoke-static {v1, v2, v4, v5}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v4

    const-wide/16 v6, 0xa

    cmp-long v8, v4, v6

    const/4 v9, 0x0

    if-gez v8, :cond_5

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v3, v1, v2}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v1

    int-to-long v1, v1

    cmp-long v3, v1, v6

    if-gez v3, :cond_6

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_6
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :goto_2
    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    iget v2, p0, Log3/f;->F:I

    if-eq v2, v1, :cond_9

    const/4 v1, 0x2

    if-eq v2, v1, :cond_8

    const/4 v1, 0x3

    if-eq v2, v1, :cond_7

    const-string v1, "null"

    goto :goto_3

    :cond_7
    const-string v1, "STANDARD"

    goto :goto_3

    :cond_8
    const-string v1, "WALL"

    goto :goto_3

    :cond_9
    const-string v1, "UTC"

    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", standard offset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Log3/f;->G:Ljg3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 14

    iget-object v0, p0, Log3/f;->z:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->D0()I

    move-result v1

    iget v2, p0, Log3/f;->E:I

    const v3, 0x15180

    mul-int/2addr v2, v3

    add-int/2addr v2, v1

    iget-object v1, p0, Log3/f;->G:Ljg3/p;

    iget v1, v1, Ljg3/p;->x:I

    iget-object v4, p0, Log3/f;->H:Ljg3/p;

    iget v4, v4, Ljg3/p;->x:I

    sub-int v5, v4, v1

    iget-object v6, p0, Log3/f;->I:Ljg3/p;

    iget v6, v6, Ljg3/p;->x:I

    sub-int v7, v6, v1

    rem-int/lit16 v8, v2, 0xe10

    const/16 v9, 0x1f

    if-nez v8, :cond_1

    if-gt v2, v3, :cond_1

    if-ne v2, v3, :cond_0

    const/16 v0, 0x18

    goto :goto_0

    :cond_0
    iget-byte v0, v0, Ljg3/f;->F:B

    goto :goto_0

    :cond_1
    move v0, v9

    :goto_0
    rem-int/lit16 v3, v1, 0x384

    const/16 v8, 0xff

    if-nez v3, :cond_2

    div-int/lit16 v3, v1, 0x384

    add-int/lit16 v3, v3, 0x80

    goto :goto_1

    :cond_2
    move v3, v8

    :goto_1
    const/4 v10, 0x3

    const/16 v11, 0x708

    const/16 v12, 0xe10

    if-eqz v5, :cond_4

    if-eq v5, v11, :cond_4

    if-ne v5, v12, :cond_3

    goto :goto_2

    :cond_3
    move v5, v10

    goto :goto_3

    :cond_4
    :goto_2
    div-int/2addr v5, v11

    :goto_3
    if-eqz v7, :cond_6

    if-eq v7, v11, :cond_6

    if-ne v7, v12, :cond_5

    goto :goto_4

    :cond_5
    move v7, v10

    goto :goto_5

    :cond_6
    :goto_4
    div-int/2addr v7, v11

    :goto_5
    iget-object v11, p0, Log3/f;->y:Ljg3/a;

    if-nez v11, :cond_7

    const/4 v11, 0x0

    goto :goto_6

    :cond_7
    invoke-virtual {v11}, Ljg3/a;->k()I

    move-result v11

    :goto_6
    iget-object v12, p0, Log3/f;->w:Ljg3/g;

    invoke-virtual {v12}, Ljg3/g;->l()I

    move-result v12

    shl-int/lit8 v12, v12, 0x1c

    iget-byte v13, p0, Log3/f;->x:B

    add-int/lit8 v13, v13, 0x20

    shl-int/lit8 v13, v13, 0x16

    add-int/2addr v12, v13

    shl-int/lit8 v11, v11, 0x13

    add-int/2addr v12, v11

    shl-int/lit8 v11, v0, 0xe

    add-int/2addr v12, v11

    iget v11, p0, Log3/f;->F:I

    invoke-static {v11}, Le4/p;->e(I)I

    move-result v11

    shl-int/lit8 v11, v11, 0xc

    add-int/2addr v12, v11

    shl-int/lit8 v11, v3, 0x4

    add-int/2addr v12, v11

    shl-int/lit8 v11, v5, 0x2

    add-int/2addr v12, v11

    add-int/2addr v12, v7

    invoke-interface {p1, v12}, Ljava/io/DataOutput;->writeInt(I)V

    if-ne v0, v9, :cond_8

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_8
    if-ne v3, v8, :cond_9

    invoke-interface {p1, v1}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_9
    if-ne v5, v10, :cond_a

    invoke-interface {p1, v4}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_a
    if-ne v7, v10, :cond_b

    invoke-interface {p1, v6}, Ljava/io/DataOutput;->writeInt(I)V

    :cond_b
    return-void
.end method
