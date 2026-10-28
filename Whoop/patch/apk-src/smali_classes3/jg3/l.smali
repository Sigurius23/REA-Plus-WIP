.class public final Ljg3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Externalizable;


# instance fields
.field public w:B

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-byte p2, p0, Ljg3/l;->w:B

    .line 4
    iput-object p1, p0, Ljg3/l;->x:Ljava/lang/Object;

    return-void
.end method

.method public static a(BLjava/io/DataInput;)Ljava/io/Serializable;
    .locals 4

    const/16 v0, 0x40

    if-eq p0, v0, :cond_b

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    new-instance p0, Ljava/io/StreamCorruptedException;

    const-string p1, "Unknown serialized type"

    invoke-direct {p0, p1}, Ljava/io/StreamCorruptedException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    sget-object p0, Ljg3/i;->H:Lg73/a;

    sget-object p0, Ljg3/d;->I:Ljg3/d;

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    invoke-static {p0, v0, v1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    invoke-static {p1}, Ljg3/f;->B0(Ljava/io/DataInput;)Ljg3/f;

    move-result-object v0

    invoke-static {p0, v0}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p0

    invoke-static {p1}, Ljg3/p;->t(Ljava/io/DataInput;)Ljg3/p;

    move-result-object p1

    new-instance v0, Ljg3/i;

    invoke-direct {v0, p0, p1}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V

    return-object v0

    :pswitch_1
    sget p0, Ljg3/n;->H:I

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    sget-object v0, Lng3/a;->Z:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    new-instance v0, Ljg3/n;

    invoke-direct {v0, p0, p1}, Ljg3/n;-><init>(II)V

    return-object v0

    :pswitch_2
    sget p0, Ljg3/m;->G:I

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-static {p0}, Ljg3/m;->o0(I)Ljg3/m;

    move-result-object p0

    return-object p0

    :pswitch_3
    sget p0, Ljg3/j;->H:I

    invoke-static {p1}, Ljg3/f;->B0(Ljava/io/DataInput;)Ljg3/f;

    move-result-object p0

    invoke-static {p1}, Ljg3/p;->t(Ljava/io/DataInput;)Ljg3/p;

    move-result-object p1

    new-instance v0, Ljg3/j;

    invoke-direct {v0, p0, p1}, Ljg3/j;-><init>(Ljg3/f;Ljg3/p;)V

    return-object v0

    :pswitch_4
    invoke-static {p1}, Ljg3/p;->t(Ljava/io/DataInput;)Ljg3/p;

    move-result-object p0

    return-object p0

    :pswitch_5
    sget-object p0, Ljg3/q;->z:Ljava/util/regex/Pattern;

    invoke-interface {p1}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Z"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "+"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "-"

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    const-string p1, "UTC"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "GMT"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "UT"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "UTC+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    const-string v0, "GMT+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "UTC-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "GMT-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "UT+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "UT-"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {p0, v1}, Ljg3/q;->o(Ljava/lang/String;Z)Ljg3/q;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljg3/p;->p(Ljava/lang/String;)Ljg3/p;

    move-result-object p0

    iget v0, p0, Ljg3/p;->x:I

    if-nez v0, :cond_4

    new-instance v0, Ljg3/q;

    new-instance v1, Log3/g;

    invoke-direct {v1, p0}, Log3/g;-><init>(Ljg3/p;)V

    invoke-direct {v0, p1, v1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object v0

    :cond_4
    new-instance v0, Ljg3/q;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Log3/g;

    invoke-direct {v1, p0}, Log3/g;-><init>(Ljg3/p;)V

    invoke-direct {v0, p1, v1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object v0

    :cond_5
    :goto_1
    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg3/p;->p(Ljava/lang/String;)Ljg3/p;

    move-result-object v0

    iget v2, v0, Ljg3/p;->x:I

    if-nez v2, :cond_6

    new-instance v2, Ljg3/q;

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Log3/g;

    invoke-direct {p1, v0}, Log3/g;-><init>(Ljg3/p;)V

    invoke-direct {v2, p0, p1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object v2

    :cond_6
    new-instance v2, Ljg3/q;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, v0, Ljg3/p;->y:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Log3/g;

    invoke-direct {p1, v0}, Log3/g;-><init>(Ljg3/p;)V

    invoke-direct {v2, p0, p1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object v2

    :cond_7
    :goto_2
    new-instance p1, Ljg3/q;

    sget-object v0, Ljg3/p;->F:Ljg3/p;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Log3/g;

    invoke-direct {v1, v0}, Log3/g;-><init>(Ljg3/p;)V

    invoke-direct {p1, p0, v1}, Ljg3/q;-><init>(Ljava/lang/String;Log3/h;)V

    return-object p1

    :cond_8
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    const-string v0, "Invalid ID for region-based ZoneId, invalid format: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_6
    sget-object p0, Ljg3/e;->H:Ljg3/e;

    sget-object p0, Ljg3/d;->I:Ljg3/d;

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    invoke-static {p0, v0, v1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    invoke-static {p1}, Ljg3/f;->B0(Ljava/io/DataInput;)Ljg3/f;

    move-result-object v0

    invoke-static {p0, v0}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p0

    invoke-static {p1}, Ljg3/p;->t(Ljava/io/DataInput;)Ljg3/p;

    move-result-object v0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    invoke-static {v1, p1}, Ljg3/l;->a(BLjava/io/DataInput;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljg3/o;

    const-string v1, "zone"

    invoke-static {p1, v1}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p1, Ljg3/p;

    if-eqz v1, :cond_a

    invoke-virtual {v0, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_3

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ZoneId must match ZoneOffset"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    :goto_3
    new-instance v1, Ljg3/r;

    invoke-direct {v1, p0, p1, v0}, Ljg3/r;-><init>(Ljg3/e;Ljg3/o;Ljg3/p;)V

    return-object v1

    :pswitch_7
    invoke-static {p1}, Ljg3/f;->B0(Ljava/io/DataInput;)Ljg3/f;

    move-result-object p0

    return-object p0

    :pswitch_8
    sget-object p0, Ljg3/e;->H:Ljg3/e;

    sget-object p0, Ljg3/d;->I:Ljg3/d;

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v1

    invoke-static {p0, v0, v1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    invoke-static {p1}, Ljg3/f;->B0(Ljava/io/DataInput;)Ljg3/f;

    move-result-object p1

    invoke-static {p0, p1}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object p0

    return-object p0

    :pswitch_9
    sget-object p0, Ljg3/d;->I:Ljg3/d;

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    invoke-static {p0, v0, p1}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object p0

    return-object p0

    :pswitch_a
    sget-object p0, Ljg3/c;->H:Ljg3/c;

    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long p0, p0

    invoke-static {v0, v1, p0, p1}, Ljg3/c;->q0(JJ)Ljg3/c;

    move-result-object p0

    return-object p0

    :pswitch_b
    sget-object p0, Ljg3/b;->y:Ljg3/b;

    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v0

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result p0

    int-to-long p0, p0

    const-wide/32 v2, 0x3b9aca00

    invoke-static {p0, p1, v2, v3}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v0

    const v2, 0x3b9aca00

    invoke-static {v2, p0, p1}, Lcom/squareup/wire/n;->B(IJ)I

    move-result p0

    invoke-static {p0, v0, v1}, Ljg3/b;->a(IJ)Ljg3/b;

    move-result-object p0

    return-object p0

    :cond_b
    sget p0, Ljg3/h;->H:I

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p0

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result p1

    invoke-static {p0}, Ljg3/g;->o(I)Ljg3/g;

    move-result-object p0

    const-string v0, "month"

    invoke-static {p0, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lng3/a;->U:Lng3/a;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lng3/a;->f(J)V

    invoke-virtual {p0}, Ljg3/g;->n()I

    move-result v0

    if-gt p1, v0, :cond_c

    new-instance v0, Ljg3/h;

    invoke-virtual {p0}, Ljg3/g;->l()I

    move-result p0

    invoke-direct {v0, p0, p1}, Ljg3/h;-><init>(II)V

    return-object v0

    :cond_c
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Illegal value for DayOfMonth field, value "

    const-string v2, " is not valid for month "

    invoke-static {p1, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljg3/l;->x:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final readExternal(Ljava/io/ObjectInput;)V
    .locals 1

    invoke-interface {p1}, Ljava/io/DataInput;->readByte()B

    move-result v0

    iput-byte v0, p0, Ljg3/l;->w:B

    invoke-static {v0, p1}, Ljg3/l;->a(BLjava/io/DataInput;)Ljava/io/Serializable;

    move-result-object p1

    iput-object p1, p0, Ljg3/l;->x:Ljava/lang/Object;

    return-void
.end method

.method public final writeExternal(Ljava/io/ObjectOutput;)V
    .locals 4

    iget-byte v0, p0, Ljg3/l;->w:B

    iget-object v1, p0, Ljg3/l;->x:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    const/16 v2, 0x40

    if-eq v0, v2, :cond_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    new-instance p1, Ljava/io/InvalidClassException;

    const-string v0, "Unknown serialized type"

    invoke-direct {p1, v0}, Ljava/io/InvalidClassException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast v1, Ljg3/i;

    iget-object v0, v1, Ljg3/i;->F:Ljg3/e;

    iget-object v2, v0, Ljg3/e;->F:Ljg3/d;

    iget v3, v2, Ljg3/d;->F:I

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    iget-short v3, v2, Ljg3/d;->G:S

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeByte(I)V

    iget-short v2, v2, Ljg3/d;->H:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->H0(Ljava/io/DataOutput;)V

    iget-object v0, v1, Ljg3/i;->G:Ljg3/p;

    invoke-virtual {v0, p1}, Ljg3/p;->u(Ljava/io/DataOutput;)V

    return-void

    :pswitch_1
    check-cast v1, Ljg3/n;

    iget v0, v1, Ljg3/n;->F:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    iget v0, v1, Ljg3/n;->G:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :pswitch_2
    check-cast v1, Ljg3/m;

    iget v0, v1, Ljg3/m;->F:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    :pswitch_3
    check-cast v1, Ljg3/j;

    iget-object v0, v1, Ljg3/j;->F:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->H0(Ljava/io/DataOutput;)V

    iget-object v0, v1, Ljg3/j;->G:Ljg3/p;

    invoke-virtual {v0, p1}, Ljg3/p;->u(Ljava/io/DataOutput;)V

    return-void

    :pswitch_4
    check-cast v1, Ljg3/p;

    invoke-virtual {v1, p1}, Ljg3/p;->u(Ljava/io/DataOutput;)V

    return-void

    :pswitch_5
    check-cast v1, Ljg3/q;

    iget-object v0, v1, Ljg3/q;->x:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    return-void

    :pswitch_6
    check-cast v1, Ljg3/r;

    iget-object v0, v1, Ljg3/r;->F:Ljg3/e;

    iget-object v2, v0, Ljg3/e;->F:Ljg3/d;

    iget v3, v2, Ljg3/d;->F:I

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeInt(I)V

    iget-short v3, v2, Ljg3/d;->G:S

    invoke-interface {p1, v3}, Ljava/io/DataOutput;->writeByte(I)V

    iget-short v2, v2, Ljg3/d;->H:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->H0(Ljava/io/DataOutput;)V

    iget-object v0, v1, Ljg3/r;->G:Ljg3/p;

    invoke-virtual {v0, p1}, Ljg3/p;->u(Ljava/io/DataOutput;)V

    iget-object v0, v1, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {v0, p1}, Ljg3/o;->n(Ljava/io/ObjectOutput;)V

    return-void

    :pswitch_7
    check-cast v1, Ljg3/f;

    invoke-virtual {v1, p1}, Ljg3/f;->H0(Ljava/io/DataOutput;)V

    return-void

    :pswitch_8
    check-cast v1, Ljg3/e;

    iget-object v0, v1, Ljg3/e;->F:Ljg3/d;

    iget v2, v0, Ljg3/d;->F:I

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeInt(I)V

    iget-short v2, v0, Ljg3/d;->G:S

    invoke-interface {p1, v2}, Ljava/io/DataOutput;->writeByte(I)V

    iget-short v0, v0, Ljg3/d;->H:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    iget-object v0, v1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->H0(Ljava/io/DataOutput;)V

    return-void

    :pswitch_9
    check-cast v1, Ljg3/d;

    iget v0, v1, Ljg3/d;->F:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    iget-short v0, v1, Ljg3/d;->G:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    iget-short v0, v1, Ljg3/d;->H:S

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :pswitch_a
    check-cast v1, Ljg3/c;

    iget-wide v2, v1, Ljg3/c;->F:J

    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    iget v0, v1, Ljg3/c;->G:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    :pswitch_b
    check-cast v1, Ljg3/b;

    iget-wide v2, v1, Ljg3/b;->w:J

    invoke-interface {p1, v2, v3}, Ljava/io/DataOutput;->writeLong(J)V

    iget v0, v1, Ljg3/b;->x:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeInt(I)V

    return-void

    :cond_0
    check-cast v1, Ljg3/h;

    iget v0, v1, Ljg3/h;->F:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    iget v0, v1, Ljg3/h;->G:I

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeByte(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
