.class public abstract Landroidx/glance/appwidget/protobuf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lm83/m;

    invoke-direct {p1}, Lm83/m;-><init>()V

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x8

    new-array p1, p1, [J

    iput-object p1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    const/4 p1, -0x1

    iput p1, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public static g(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method public static h(J)J
    .locals 4

    const/4 v0, 0x1

    ushr-long v0, p0, v0

    const-wide/16 v2, 0x1

    and-long/2addr p0, v2

    neg-long p0, p0

    xor-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public abstract A()J
.end method

.method public abstract B()I
.end method

.method public abstract C()J
.end method

.method public abstract D()I
.end method

.method public abstract E()J
.end method

.method public abstract F()Ljava/lang/String;
.end method

.method public abstract G()Ljava/lang/String;
.end method

.method public abstract H()I
.end method

.method public abstract I()I
.end method

.method public abstract J()J
.end method

.method public d(I[B)Ljava/nio/ByteBuffer;
    .locals 4

    invoke-static {p2}, Lhs/g;->e([B)[I

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Landroidx/glance/appwidget/protobuf/l;->f([II)[I

    move-result-object p1

    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    invoke-static {p2}, Lhs/g;->d([I)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    aget v2, p1, v1

    aget v3, p2, v1

    add-int/2addr v2, v3

    aput v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0x40

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, p1, v0, v2}, Ljava/nio/IntBuffer;->put([III)Ljava/nio/IntBuffer;

    return-object p2
.end method

.method public abstract e(I)V
.end method

.method public abstract f([II)[I
.end method

.method public i()J
    .locals 2

    iget v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x4c2c

    return-wide v0

    :cond_0
    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v1, [J

    aget-wide v0, v1, v0

    return-wide v0
.end method

.method public abstract j()I
.end method

.method public abstract k()Z
.end method

.method public abstract l()I
.end method

.method public abstract m(I)V
.end method

.method public n()J
    .locals 3

    iget v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v1, [J

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    aget-wide v0, v1, v0

    return-wide v0

    :cond_0
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "No tag in stack for requested element"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()J
    .locals 3

    iget v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-wide/16 v0, 0x4c2c

    return-wide v0

    :cond_0
    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v1, [J

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    aget-wide v0, v1, v0

    return-wide v0
.end method

.method public p([BLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V
    .locals 6

    array-length v0, p1

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->l()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    div-int/lit8 v1, v0, 0x40

    add-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    iget v4, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    add-int/2addr v4, v3

    invoke-virtual {p0, v4, p1}, Landroidx/glance/appwidget/protobuf/l;->d(I[B)Ljava/nio/ByteBuffer;

    move-result-object v4

    const/16 v5, 0x40

    if-ne v3, v1, :cond_0

    rem-int/lit8 v5, v0, 0x40

    invoke-static {p2, p3, v4, v5}, Lkotlin/jvm/internal/j;->T(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    goto :goto_1

    :cond_0
    invoke-static {p2, p3, v4, v5}, Lkotlin/jvm/internal/j;->T(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "The nonce length (in bytes) must be "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->l()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract q(I)I
.end method

.method public r(J)V
    .locals 3

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/glance/appwidget/protobuf/l;->a:I

    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v1, [J

    array-length v2, v1

    if-lt v0, v2, :cond_1

    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v1, [J

    aput-wide p1, v1, v0

    return-void
.end method

.method public abstract s()Z
.end method

.method public abstract t()Landroidx/glance/appwidget/protobuf/h;
.end method

.method public abstract u()D
.end method

.method public abstract v()I
.end method

.method public abstract w()I
.end method

.method public abstract x()J
.end method

.method public abstract y()F
.end method

.method public abstract z()I
.end method
