.class public final Led3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    iput p1, p0, Led3/o;->a:I

    packed-switch p1, :pswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Len/e;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Len/e;-><init>(I)V

    iput-object p1, p0, Led3/o;->e:Ljava/lang/Object;

    .line 6
    new-instance p1, Led3/a;

    const v0, 0xfe01

    new-array v0, v0, [B

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v0, v3, v1, v2}, Led3/a;-><init>([BIIZ)V

    iput-object p1, p0, Led3/o;->f:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Led3/o;->b:I

    return-void

    .line 8
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Len/e;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Len/e;-><init>(I)V

    iput-object p1, p0, Led3/o;->e:Ljava/lang/Object;

    .line 10
    new-instance p1, Lx8/n;

    const v0, 0xfe01

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lx8/n;-><init>([BI)V

    iput-object p1, p0, Led3/o;->f:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 11
    iput p1, p0, Led3/o;->b:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Led3/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Led3/o;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Led3/o;->e:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Led3/o;->b:I

    .line 3
    sget-object p1, Led3/l;->z:Led3/l;

    iput-object p1, p0, Led3/o;->f:Ljava/lang/Object;

    return-void
.end method

.method public static b(I)V
    .locals 2

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    const-string v1, "Unexpected negative length: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v0
.end method


# virtual methods
.method public a(I)I
    .locals 5

    iget v0, p0, Led3/o;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    iput v0, p0, Led3/o;->c:I

    :cond_0
    iget v1, p0, Led3/o;->c:I

    add-int v2, p1, v1

    iget-object v3, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v3, Len/e;

    iget v4, v3, Len/e;->c:I

    if-ge v2, v4, :cond_1

    iget-object v3, v3, Len/e;->f:[I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Led3/o;->c:I

    aget v1, v3, v2

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_0

    :cond_1
    return v0

    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Led3/o;->c:I

    :cond_2
    iget v1, p0, Led3/o;->c:I

    add-int v2, p1, v1

    iget-object v3, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v3, Len/e;

    iget v4, v3, Len/e;->c:I

    if-ge v2, v4, :cond_3

    iget-object v3, v3, Len/e;->f:[I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Led3/o;->c:I

    aget v1, v3, v2

    add-int/2addr v0, v1

    const/16 v2, 0xff

    if-eq v1, v2, :cond_2

    :cond_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ldd3/b;)I
    .locals 8

    iget-object v0, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v0, Led3/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq p1, v3, :cond_1

    if-ne p1, v2, :cond_0

    invoke-virtual {p0}, Led3/o;->n()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget p1, v0, Led3/a;->c:I

    iget v4, v0, Led3/a;->b:I

    if-eq p1, v4, :cond_6

    iget-object v5, v0, Led3/a;->a:[B

    add-int/lit8 v6, p1, 0x1

    aget-byte v7, v5, p1

    if-ltz v7, :cond_2

    iput v6, v0, Led3/a;->c:I

    goto :goto_1

    :cond_2
    sub-int/2addr v4, p1

    if-le v4, v3, :cond_3

    add-int/2addr p1, v2

    aget-byte v2, v5, v6

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v2, v7

    if-gez v2, :cond_3

    iput p1, v0, Led3/a;->c:I

    xor-int/lit8 v7, v2, -0x80

    goto :goto_1

    :cond_3
    move p1, v1

    :goto_0
    const/16 v2, 0x20

    if-ge v1, v2, :cond_5

    invoke-virtual {v0}, Led3/a;->e()I

    move-result v2

    and-int/lit8 v4, v2, 0x7f

    shl-int/2addr v4, v1

    or-int/2addr p1, v4

    and-int/lit16 v2, v2, 0x80

    if-nez v2, :cond_4

    move v7, p1

    :goto_1
    shl-int/lit8 p1, v7, 0x1f

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v7

    shr-int/2addr p1, v3

    const/high16 v0, -0x80000000

    and-int/2addr v0, v7

    xor-int/2addr p1, v0

    return p1

    :cond_4
    add-int/lit8 v1, v1, 0x7

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Input stream is malformed: Varint too long (exceeded 32 bits)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lkotlinx/serialization/SerializationException;

    const-string v0, "Unexpected EOF"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {v0, v1}, Led3/a;->G(Z)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method

.method public d(Ldd3/b;)J
    .locals 6

    iget-object v0, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v0, Led3/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Led3/o;->p()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {v0, v1}, Led3/a;->G(Z)J

    move-result-wide v0

    const/16 p1, 0x3f

    shl-long v3, v0, p1

    shr-long/2addr v3, p1

    xor-long/2addr v3, v0

    shr-long v2, v3, v2

    const-wide/high16 v4, -0x8000000000000000L

    and-long/2addr v0, v4

    xor-long/2addr v0, v2

    return-wide v0

    :cond_2
    invoke-virtual {v0, v1}, Led3/a;->G(Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Led3/a;
    .locals 4

    sget-object v0, Led3/l;->G:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Led3/o;->f()Led3/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected wire type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public f()Led3/a;
    .locals 7

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->c(Ldd3/b;)I

    move-result v0

    invoke-static {v0}, Led3/o;->b(I)V

    iget-object v1, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Led3/a;

    invoke-virtual {v1, v0}, Led3/a;->c(I)V

    new-instance v2, Led3/a;

    iget-object v3, v1, Led3/a;->a:[B

    iget v4, v1, Led3/a;->c:I

    add-int/2addr v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Led3/a;-><init>([BIIZ)V

    iget v3, v1, Led3/a;->c:I

    iput v3, v2, Led3/a;->c:I

    iget v3, v1, Led3/a;->c:I

    add-int/2addr v3, v0

    iput v3, v1, Led3/a;->c:I

    return-object v2
.end method

.method public g(Lt9/o;)Z
    .locals 8

    iget-object v0, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v0, Len/e;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Lx8/n;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-static {v4}, Lva3/g;->i(Z)V

    iget-boolean v4, p0, Led3/o;->d:Z

    if-eqz v4, :cond_1

    iput-boolean v3, p0, Led3/o;->d:Z

    invoke-virtual {v1, v3}, Lx8/n;->C(I)V

    :cond_1
    :goto_1
    iget-boolean v4, p0, Led3/o;->d:Z

    if-nez v4, :cond_9

    iget v4, p0, Led3/o;->b:I

    if-gez v4, :cond_5

    const-wide/16 v4, -0x1

    invoke-virtual {v0, p1, v4, v5}, Len/e;->c(Lt9/o;J)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0, p1, v2}, Len/e;->a(Lt9/o;Z)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    iget v4, v0, Len/e;->d:I

    iget v5, v0, Len/e;->a:I

    and-int/2addr v5, v2

    if-ne v5, v2, :cond_3

    iget v5, v1, Lx8/n;->c:I

    if-nez v5, :cond_3

    invoke-virtual {p0, v3}, Led3/o;->a(I)I

    move-result v5

    add-int/2addr v4, v5

    iget v5, p0, Led3/o;->c:I

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    :try_start_0
    invoke-interface {p1, v4}, Lt9/o;->n(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v5, p0, Led3/o;->b:I

    goto :goto_4

    :catch_0
    :cond_4
    :goto_3
    return v3

    :cond_5
    :goto_4
    iget v4, p0, Led3/o;->b:I

    invoke-virtual {p0, v4}, Led3/o;->a(I)I

    move-result v4

    iget v5, p0, Led3/o;->b:I

    iget v6, p0, Led3/o;->c:I

    add-int/2addr v5, v6

    if-lez v4, :cond_7

    iget v6, v1, Lx8/n;->c:I

    add-int/2addr v6, v4

    invoke-virtual {v1, v6}, Lx8/n;->b(I)V

    iget-object v6, v1, Lx8/n;->a:[B

    iget v7, v1, Lx8/n;->c:I

    :try_start_1
    invoke-interface {p1, v6, v7, v4}, Lt9/o;->readFully([BII)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    iget v6, v1, Lx8/n;->c:I

    add-int/2addr v6, v4

    invoke-virtual {v1, v6}, Lx8/n;->E(I)V

    iget-object v4, v0, Len/e;->f:[I

    add-int/lit8 v6, v5, -0x1

    aget v4, v4, v6

    const/16 v6, 0xff

    if-eq v4, v6, :cond_6

    move v4, v2

    goto :goto_5

    :cond_6
    move v4, v3

    :goto_5
    iput-boolean v4, p0, Led3/o;->d:Z

    goto :goto_6

    :catch_1
    return v3

    :cond_7
    :goto_6
    iget v4, v0, Len/e;->c:I

    if-ne v5, v4, :cond_8

    const/4 v5, -0x1

    :cond_8
    iput v5, p0, Led3/o;->b:I

    goto :goto_1

    :cond_9
    return v2
.end method

.method public h(Lwm/j;)Z
    .locals 8

    iget-object v0, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v0, Len/e;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-static {v4}, Llo/a;->i(Z)V

    iget-boolean v4, p0, Led3/o;->d:Z

    if-eqz v4, :cond_1

    iput-boolean v3, p0, Led3/o;->d:Z

    invoke-virtual {v1, v3}, Led3/a;->H(I)V

    :cond_1
    :goto_1
    iget-boolean v4, p0, Led3/o;->d:Z

    if-nez v4, :cond_9

    iget v4, p0, Led3/o;->b:I

    if-gez v4, :cond_5

    const-wide/16 v4, -0x1

    invoke-virtual {v0, p1, v4, v5}, Len/e;->d(Lwm/j;J)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v0, p1, v2}, Len/e;->b(Lwm/j;Z)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    iget v4, v0, Len/e;->d:I

    iget v5, v0, Len/e;->a:I

    and-int/2addr v5, v2

    if-ne v5, v2, :cond_3

    iget v5, v1, Led3/a;->c:I

    if-nez v5, :cond_3

    invoke-virtual {p0, v3}, Led3/o;->a(I)I

    move-result v5

    add-int/2addr v4, v5

    iget v5, p0, Led3/o;->c:I

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    :try_start_0
    invoke-interface {p1, v4}, Lwm/j;->n(I)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iput v5, p0, Led3/o;->b:I

    goto :goto_4

    :catch_0
    :cond_4
    :goto_3
    return v3

    :cond_5
    :goto_4
    iget v4, p0, Led3/o;->b:I

    invoke-virtual {p0, v4}, Led3/o;->a(I)I

    move-result v4

    iget v5, p0, Led3/o;->b:I

    iget v6, p0, Led3/o;->c:I

    add-int/2addr v5, v6

    if-lez v4, :cond_7

    iget v6, v1, Led3/a;->c:I

    add-int/2addr v6, v4

    invoke-virtual {v1, v6}, Led3/a;->b(I)V

    iget-object v6, v1, Led3/a;->a:[B

    iget v7, v1, Led3/a;->c:I

    :try_start_1
    invoke-interface {p1, v6, v7, v4}, Lwm/j;->readFully([BII)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1

    iget v6, v1, Led3/a;->c:I

    add-int/2addr v6, v4

    invoke-virtual {v1, v6}, Led3/a;->J(I)V

    iget-object v4, v0, Len/e;->f:[I

    add-int/lit8 v6, v5, -0x1

    aget v4, v4, v6

    const/16 v6, 0xff

    if-eq v4, v6, :cond_6

    move v4, v2

    goto :goto_5

    :cond_6
    move v4, v3

    :goto_5
    iput-boolean v4, p0, Led3/o;->d:Z

    goto :goto_6

    :catch_1
    return v3

    :cond_7
    :goto_6
    iget v4, v0, Len/e;->c:I

    if-ne v5, v4, :cond_8

    const/4 v5, -0x1

    :cond_8
    iput v5, p0, Led3/o;->b:I

    goto :goto_1

    :cond_9
    return v2
.end method

.method public i()[B
    .locals 4

    sget-object v0, Led3/l;->G:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Led3/o;->j()[B

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected wire type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public j()[B
    .locals 7

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->c(Ldd3/b;)I

    move-result v0

    invoke-static {v0}, Led3/o;->b(I)V

    iget-object v1, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Led3/a;

    invoke-virtual {v1, v0}, Led3/a;->c(I)V

    new-array v2, v0, [B

    iget v3, v1, Led3/a;->b:I

    iget v4, v1, Led3/a;->c:I

    sub-int/2addr v3, v4

    if-ge v3, v0, :cond_0

    move v0, v3

    :cond_0
    iget-object v3, v1, Led3/a;->a:[B

    const/4 v5, 0x0

    add-int v6, v4, v0

    invoke-static {v5, v4, v6, v3, v2}, Lm83/n;->c0(III[B[B)V

    iget v3, v1, Led3/a;->c:I

    add-int/2addr v3, v0

    iput v3, v1, Led3/a;->c:I

    return-object v2
.end method

.method public k()D
    .locals 4

    sget-object v0, Led3/l;->F:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Led3/o;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected wire type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public l()F
    .locals 4

    sget-object v0, Led3/l;->H:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_0

    invoke-virtual {p0}, Led3/o;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0

    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected wire type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public m(Ldd3/b;)I
    .locals 3

    sget-object v0, Ldd3/b;->z:Ldd3/b;

    if-ne p1, v0, :cond_0

    sget-object v0, Led3/l;->H:Led3/l;

    goto :goto_0

    :cond_0
    sget-object v0, Led3/l;->E:Led3/l;

    :goto_0
    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_1

    invoke-virtual {p0, p1}, Led3/o;->c(Ldd3/b;)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected wire type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw p1
.end method

.method public n()I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v2, Led3/a;

    invoke-virtual {v2}, Led3/a;->e()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    mul-int/lit8 v3, v0, 0x8

    shl-int/2addr v2, v3

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public o(Ldd3/b;)J
    .locals 3

    sget-object v0, Ldd3/b;->z:Ldd3/b;

    if-ne p1, v0, :cond_0

    sget-object v0, Led3/l;->F:Led3/l;

    goto :goto_0

    :cond_0
    sget-object v0, Led3/l;->E:Led3/l;

    :goto_0
    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_1

    invoke-virtual {p0, p1}, Led3/o;->d(Ldd3/b;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance p1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected wire type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw p1
.end method

.method public p()J
    .locals 6

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v3, Led3/a;

    invoke-virtual {v3}, Led3/a;->e()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    mul-int/lit8 v5, v2, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public q()Ljava/lang/String;
    .locals 6

    sget-object v0, Led3/l;->G:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_0

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->c(Ldd3/b;)I

    move-result v0

    invoke-static {v0}, Led3/o;->b(I)V

    iget-object v1, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Led3/a;

    iget-object v2, v1, Led3/a;->a:[B

    iget v3, v1, Led3/a;->c:I

    add-int v4, v3, v0

    const/4 v5, 0x4

    invoke-static {v3, v4, v5, v2}, Lyb3/y;->C(III[B)Ljava/lang/String;

    move-result-object v2

    iget v3, v1, Led3/a;->c:I

    add-int/2addr v3, v0

    iput v3, v1, Led3/a;->c:I

    return-object v2

    :cond_0
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected wire type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public r()I
    .locals 2

    iget-boolean v0, p0, Led3/o;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Led3/o;->d:Z

    iget v0, p0, Led3/o;->b:I

    shl-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    iget v1, v1, Led3/l;->w:I

    or-int/2addr v0, v1

    iget v1, p0, Led3/o;->c:I

    invoke-virtual {p0, v1}, Led3/o;->t(I)I

    move-result v1

    iput v0, p0, Led3/o;->c:I

    return v1

    :cond_0
    iget v0, p0, Led3/o;->b:I

    shl-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    iget v1, v1, Led3/l;->w:I

    or-int/2addr v0, v1

    iput v0, p0, Led3/o;->c:I

    iget-object v0, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v0, Led3/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Led3/a;->G(Z)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Led3/o;->t(I)I

    move-result v0

    return v0
.end method

.method public s()V
    .locals 5

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object v0, Ldd3/b;->z:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->m(Ldd3/b;)I

    return-void

    :cond_0
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported start group or end group wire type: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v3, Led3/l;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v0

    :cond_1
    sget-object v0, Led3/l;->G:Led3/l;

    iget-object v1, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v1, Led3/l;

    if-ne v1, v0, :cond_2

    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->c(Ldd3/b;)I

    move-result v0

    invoke-static {v0}, Led3/o;->b(I)V

    iget-object v1, p0, Led3/o;->e:Ljava/lang/Object;

    check-cast v1, Led3/a;

    invoke-virtual {v1, v0}, Led3/a;->c(I)V

    iget v2, v1, Led3/a;->c:I

    add-int/2addr v2, v0

    iput v2, v1, Led3/a;->c:I

    return-void

    :cond_2
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected wire type "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but found "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/o;->f:Ljava/lang/Object;

    check-cast v0, Led3/l;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1

    :cond_3
    sget-object v0, Ldd3/b;->z:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->o(Ldd3/b;)J

    return-void

    :cond_4
    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {p0, v0}, Led3/o;->m(Ldd3/b;)I

    return-void
.end method

.method public t(I)I
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    iput v0, p0, Led3/o;->b:I

    sget-object p1, Led3/l;->z:Led3/l;

    iput-object p1, p0, Led3/o;->f:Ljava/lang/Object;

    return v0

    :cond_0
    ushr-int/lit8 v0, p1, 0x3

    iput v0, p0, Led3/o;->b:I

    sget-object v0, Led3/l;->x:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Led3/l;->y:[Led3/l;

    and-int/lit8 p1, p1, 0x7

    aget-object p1, v0, p1

    iput-object p1, p0, Led3/o;->f:Ljava/lang/Object;

    iget p1, p0, Led3/o;->b:I

    return p1
.end method
