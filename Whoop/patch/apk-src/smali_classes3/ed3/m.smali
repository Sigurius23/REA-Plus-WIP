.class public Led3/m;
.super Landroidx/glance/appwidget/protobuf/l;
.source "SourceFile"

# interfaces
.implements Lzc3/d;
.implements Lzc3/b;


# instance fields
.field public final c:Ldd3/a;

.field public final d:Led3/o;

.field public final e:Lyc3/g;

.field public final f:[I

.field public g:Ljava/util/HashMap;

.field public h:Ljava/util/HashMap;

.field public i:Z

.field public final j:Lkotlinx/serialization/internal/ElementMarker;


# direct methods
.method public constructor <init>(Ldd3/a;Led3/o;Lyc3/g;)V
    .locals 8

    const-string v0, "descriptor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Landroidx/glance/appwidget/protobuf/l;-><init>(I)V

    iput-object p1, p0, Led3/m;->c:Ldd3/a;

    iput-object p2, p0, Led3/m;->d:Led3/o;

    iput-object p3, p0, Led3/m;->e:Lyc3/g;

    new-instance p1, Lkotlinx/serialization/internal/ElementMarker;

    new-instance v0, Landroidx/room/v0;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x2

    const-class v3, Led3/m;

    const-string v4, "readIfAbsent"

    const-string v5, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/v0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {p1, p3, v0}, Lkotlinx/serialization/internal/ElementMarker;-><init>(Lyc3/g;Lc93/m;)V

    iput-object p1, v2, Led3/m;->j:Lkotlinx/serialization/internal/ElementMarker;

    invoke-interface {p3}, Lyc3/g;->getElementsCount()I

    move-result p1

    const/16 p2, 0x20

    if-ge p1, p2, :cond_3

    add-int/lit8 p2, p1, 0x1

    new-array v0, p2, [I

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, p2, :cond_0

    const/4 v4, -0x1

    aput v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_1
    if-ge p2, p1, :cond_2

    invoke-static {p3, p2, v1}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result v3

    if-gt v3, p1, :cond_1

    const/4 v4, -0x2

    if-eq v3, v4, :cond_1

    aput p2, v0, v3

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p3, p1}, Led3/m;->U(Lyc3/g;I)V

    return-void

    :cond_2
    iput-object v0, v2, Led3/m;->f:[I

    return-void

    :cond_3
    invoke-virtual {p0, p3, p1}, Led3/m;->U(Lyc3/g;I)V

    return-void
.end method


# virtual methods
.method public final K(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lyc3/l;->c:Lyc3/l;

    const-string v1, "deserializer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    instance-of v1, p1, Lkotlinx/serialization/internal/MapLikeSerializer;

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2}, Led3/m;->S(Lwc3/b;Ljava/lang/Object;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v1

    sget-object v2, Lkotlinx/serialization/internal/ByteArraySerializer;->INSTANCE:Lkotlinx/serialization/internal/ByteArraySerializer;

    invoke-interface {v2}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast p2, [B

    invoke-virtual {p0, p2}, Led3/m;->R([B)[B

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, p1, Lkotlinx/serialization/internal/AbstractCollectionSerializer;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/internal/AbstractCollectionSerializer;

    invoke-virtual {v1, p0, p2}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->merge(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1, p0}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v1

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v3

    iget-object v4, p0, Led3/m;->e:Lyc3/g;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "Error while decoding "

    if-nez v3, :cond_7

    invoke-interface {v4}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v3

    sget-object v6, Lyc3/l;->b:Lyc3/l;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-wide/32 v6, 0x7fffffff

    if-eqz v3, :cond_4

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-interface {v3}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding index "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    and-long/2addr v1, v6

    long-to-int v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " in repeated field of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_4
    :goto_1
    invoke-interface {v4}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    and-long v0, v1, v6

    long-to-int v0, v0

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v1, v0, 0x2

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_5

    const-string v0, "key"

    goto :goto_2

    :cond_5
    const-string v0, "value"

    :goto_2
    const-string v2, " of index "

    const-string v3, " in map field of "

    invoke-static {v1, v5, v0, v2, v3}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " at proto number "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-long/2addr v1, v6

    long-to-int p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v4}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_3
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    invoke-direct {v0, p1, p2}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v0
.end method

.method public final L(J)Z
    .locals 1

    invoke-virtual {p0, p1, p2}, Led3/m;->O(J)I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    new-instance p2, Lkotlinx/serialization/SerializationException;

    const-string v0, "Unexpected boolean value: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final M(J)D
    .locals 5

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/m;->d:Led3/o;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {v1}, Led3/o;->p()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-virtual {v1}, Led3/o;->k()D

    move-result-wide p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding proto number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v3, 0x7fffffff

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public final N(J)F
    .locals 5

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/m;->d:Led3/o;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {v1}, Led3/o;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v1}, Led3/o;->l()F

    move-result p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding proto number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v3, 0x7fffffff

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public final O(J)I
    .locals 5

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/m;->d:Led3/o;

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {v1, v0}, Led3/o;->c(Ldd3/b;)I

    move-result p1

    return p1

    :cond_0
    invoke-static {p1, p2}, Luf/c0;->S(J)Ldd3/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Led3/o;->m(Ldd3/b;)I

    move-result p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding proto number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v3, 0x7fffffff

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public final P(J)J
    .locals 5

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/m;->d:Led3/o;

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {v1, v0}, Led3/o;->d(Ldd3/b;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {p1, p2}, Luf/c0;->S(J)Ldd3/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Led3/o;->o(Ldd3/b;)J

    move-result-wide p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding proto number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v3, 0x7fffffff

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public Q(J)Ljava/lang/String;
    .locals 6

    const-wide/16 v0, 0x4c2c

    cmp-long v0, p1, v0

    iget-object v1, p0, Led3/m;->d:Led3/o;

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Ldd3/b;->x:Ldd3/b;

    invoke-virtual {v1, v0}, Led3/o;->c(Ldd3/b;)I

    move-result v0

    invoke-static {v0}, Led3/o;->b(I)V

    iget-object v1, v1, Led3/o;->e:Ljava/lang/Object;

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
    invoke-virtual {v1}, Led3/o;->q()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error while decoding proto number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v3, 0x7fffffff

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " of "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public final R([B)[B
    .locals 6

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v0

    const-wide/16 v2, 0x4c2c

    cmp-long v2, v0, v2

    iget-object v3, p0, Led3/m;->d:Led3/o;

    if-nez v2, :cond_0

    :try_start_0
    invoke-virtual {v3}, Led3/o;->j()[B

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Led3/o;->i()[B

    move-result-object v0
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1, v0}, Lm83/n;->F0([B[B)[B

    move-result-object p1

    return-object p1

    :goto_1
    new-instance v2, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error while decoding proto number "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/32 v4, 0x7fffffff

    and-long/2addr v0, v4

    long-to-int v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " of "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, p1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v2
.end method

.method public final S(Lwc3/b;Ljava/lang/Object;)Ljava/util/LinkedHashMap;
    .locals 2

    const-string v0, "null cannot be cast to non-null type kotlinx.serialization.internal.MapLikeSerializer<kotlin.Any?, kotlin.Any?, T of kotlinx.serialization.protobuf.internal.ProtobufDecoder.deserializeMap, *>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkotlinx/serialization/internal/MapLikeSerializer;

    invoke-virtual {p1}, Lkotlinx/serialization/internal/MapLikeSerializer;->getKeySerializer()Lwc3/c;

    move-result-object v0

    invoke-virtual {p1}, Lkotlinx/serialization/internal/MapLikeSerializer;->getValueSerializer()Lwc3/c;

    move-result-object p1

    invoke-static {v0, p1}, Lxc3/a;->b(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/MapEntrySerializer;

    move-result-object p1

    instance-of v0, p2, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    :cond_1
    new-instance p2, Lkotlinx/serialization/internal/LinkedHashSetSerializer;

    invoke-direct {p2, p1}, Lkotlinx/serialization/internal/LinkedHashSetSerializer;-><init>(Lwc3/c;)V

    invoke-virtual {p2, p0, v1}, Lkotlinx/serialization/internal/AbstractCollectionSerializer;->merge(Lzc3/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    const/16 p2, 0xa

    invoke-static {p1, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v0, 0x10

    if-ge p2, v0, :cond_2

    move p2, v0

    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public T(Lyc3/g;I)J
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide p1

    return-wide p1
.end method

.method public final U(Lyc3/g;I)V
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, p2, v1}, Ljava/util/HashMap;-><init>(IF)V

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, p2, :cond_3

    invoke-static {p1, v3, v2}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result v5

    const/4 v6, -0x2

    if-ne v5, v6, :cond_2

    invoke-interface {p1, v3}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v5

    iget-object v6, p0, Led3/m;->c:Ldd3/a;

    iget-object v6, v6, Ldd3/a;->a:Lcd3/f;

    invoke-static {v5, v6}, Luf/c0;->N(Lyc3/g;Lcd3/f;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lyc3/g;

    invoke-static {v7, v2}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide v7

    const-wide/32 v9, 0x7fffffff

    and-long/2addr v7, v9

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_2
    invoke-static {p1, v3, v2}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-lez v4, :cond_4

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, v4, v1}, Ljava/util/HashMap;-><init>(IF)V

    iput-object p1, p0, Led3/m;->h:Ljava/util/HashMap;

    :cond_4
    iput-object v0, p0, Led3/m;->g:Ljava/util/HashMap;

    return-void
.end method

.method public beginStructure(Lyc3/g;)Lzc3/b;
    .locals 13

    iget-object v1, p0, Led3/m;->e:Lyc3/g;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/32 v2, 0x7fffffff

    :try_start_0
    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v4, Lyc3/l;->b:Lyc3/l;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v7, p0, Led3/m;->c:Ldd3/a;

    const/4 v6, 0x1

    const-wide/16 v8, 0x4c2c

    move-wide v9, v8

    iget-object v8, p0, Led3/m;->d:Led3/o;

    if-eqz v5, :cond_2

    move-wide v11, v9

    :try_start_1
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v9

    invoke-interface {v1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    cmp-long v0, v9, v11

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v8, v9, v10}, Lug/m;->k(Led3/o;J)Led3/o;

    move-result-object v8

    invoke-virtual {v8}, Led3/o;->r()I

    move v4, v6

    new-instance v6, Led3/q;

    sget-object v0, Ldd3/b;->x:Ldd3/b;
    :try_end_1
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_1 .. :try_end_1} :catch_1

    int-to-long v9, v4

    move-object v11, p1

    :try_start_2
    invoke-direct/range {v6 .. v11}, Led3/q;-><init>(Ldd3/a;Led3/o;JLyc3/g;)V
    :try_end_2
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto/16 :goto_4

    :catch_1
    move-exception v0

    :goto_1
    move-object v11, p1

    goto :goto_0

    :cond_0
    move-object v11, p1

    :try_start_3
    iget-object p1, v8, Led3/o;->f:Ljava/lang/Object;

    check-cast p1, Led3/l;
    :try_end_3
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    sget-object v0, Led3/l;->G:Led3/l;
    :try_end_4
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_4 .. :try_end_4} :catch_2

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :try_start_5
    invoke-interface {v11, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-static {p1}, Luf/c0;->a0(Lyc3/g;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Led3/o;

    invoke-virtual {v8}, Led3/o;->e()Led3/a;

    move-result-object v0

    invoke-direct {p1, v0}, Led3/o;-><init>(Led3/a;)V

    new-instance v0, Led3/j;

    invoke-direct {v0, v7, p1, v11}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V
    :try_end_5
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_5 .. :try_end_5} :catch_0

    return-object v0

    :cond_1
    :try_start_6
    new-instance v6, Led3/q;

    invoke-direct/range {v6 .. v11}, Led3/q;-><init>(Ldd3/a;Led3/o;JLyc3/g;)V
    :try_end_6
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_6 .. :try_end_6} :catch_2

    return-object v6

    :catch_2
    move-exception v0

    move-object p1, v11

    goto :goto_0

    :catch_3
    move-exception v0

    move-object p1, v11

    goto :goto_1

    :cond_2
    move v4, v6

    move-wide v11, v9

    :try_start_7
    sget-object v5, Lyc3/l;->a:Lyc3/l;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Lyc3/l;->d:Lyc3/l;

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    instance-of v5, v0, Lyc3/d;

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    sget-object v4, Lyc3/l;->c:Lyc3/l;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v6, Led3/c;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v4

    cmp-long v0, v4, v11

    if-nez v0, :cond_4

    invoke-virtual {v8}, Led3/o;->f()Led3/a;

    move-result-object v0

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Led3/o;->e()Led3/a;

    move-result-object v0

    :goto_2
    new-instance v8, Led3/o;

    invoke-direct {v8, v0}, Led3/o;-><init>(Led3/a;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v9
    :try_end_7
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_7 .. :try_end_7} :catch_1

    move-object v11, p1

    :try_start_8
    invoke-direct/range {v6 .. v11}, Led3/c;-><init>(Ldd3/a;Led3/o;JLyc3/g;)V
    :try_end_8
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_8 .. :try_end_8} :catch_2

    return-object v6

    :cond_5
    :try_start_9
    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v4, "Primitives are not supported at top-level"

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_3
    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v5

    cmp-long v0, v5, v11

    if-nez v0, :cond_7

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    return-object p0

    :cond_7
    invoke-static {v5, v6}, Luf/c0;->Z(J)Z

    move-result v0

    if-eqz v0, :cond_9

    and-long v9, v5, v2

    long-to-int v0, v9

    sub-int/2addr v0, v4

    iget-object v4, p0, Led3/m;->h:Ljava/util/HashMap;

    if-eqz v4, :cond_8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-wide v9, 0xfffffff00000000L

    and-long v4, v5, v9

    int-to-long v9, v0

    or-long v5, v4, v9

    :cond_8
    move-wide v9, v5

    new-instance v6, Led3/i;
    :try_end_9
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_9 .. :try_end_9} :catch_1

    move-object v11, p1

    :try_start_a
    invoke-direct/range {v6 .. v11}, Led3/i;-><init>(Ldd3/a;Led3/o;JLyc3/g;)V

    return-object v6

    :cond_9
    move-object v11, p1

    new-instance p1, Led3/m;

    invoke-static {v8, v5, v6}, Lug/m;->k(Led3/o;J)Led3/o;

    move-result-object v0

    invoke-direct {p1, v7, v0, v11}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V
    :try_end_a
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_a .. :try_end_a} :catch_0

    return-object p1

    :goto_4
    new-instance v0, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Fail to begin structure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v11}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " at proto number "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->i()J

    move-result-wide v5

    and-long v1, v5, v2

    long-to-int v1, v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v0
.end method

.method public final decodeBoolean()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->L(J)Z

    move-result v0

    return v0
.end method

.method public final decodeBooleanElement(Lyc3/g;I)Z
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->L(J)Z

    move-result p1

    return p1
.end method

.method public final decodeByte()B
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->O(J)I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public final decodeByteElement(Lyc3/g;I)B
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->O(J)I

    move-result p1

    int-to-byte p1, p1

    return p1
.end method

.method public final decodeChar()C
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->O(J)I

    move-result v0

    int-to-char v0, v0

    return v0
.end method

.method public final decodeCharElement(Lyc3/g;I)C
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->O(J)I

    move-result p1

    int-to-char p1, p1

    return p1
.end method

.method public final decodeCollectionSize(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method public final decodeDouble()D
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->M(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final decodeDoubleElement(Lyc3/g;I)D
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->M(J)D

    move-result-wide p1

    return-wide p1
.end method

.method public decodeElementIndex(Lyc3/g;)I
    .locals 7

    iget-object v0, p0, Led3/m;->d:Led3/o;

    const-string v1, "descriptor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    :try_start_0
    invoke-virtual {v0}, Led3/o;->r()I

    move-result v1
    :try_end_0
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Led3/m;->j:Lkotlinx/serialization/internal/ElementMarker;

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    :try_start_1
    invoke-virtual {v2}, Lkotlinx/serialization/internal/ElementMarker;->nextUnmarkedIndex()I

    move-result p1

    return p1

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    if-eqz v1, :cond_6

    iget-object v4, p0, Led3/m;->f:[I

    if-eqz v4, :cond_2

    if-ltz v1, :cond_1

    array-length v5, v4

    if-ge v1, v5, :cond_1

    aget v4, v4, v1

    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_1

    :cond_2
    iget-object v4, p0, Led3/m;->g:Ljava/util/HashMap;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_3
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    :goto_1
    if-ne v4, v3, :cond_4

    invoke-virtual {v0}, Led3/o;->s()V

    goto :goto_0

    :cond_4
    invoke-static {p1, v4}, Luf/c0;->K(Lyc3/g;I)J

    move-result-wide v5

    invoke-static {v5, v6}, Luf/c0;->Z(J)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Led3/m;->h:Ljava/util/HashMap;

    if-eqz v0, :cond_5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    :cond_5
    invoke-virtual {v2, v4}, Lkotlinx/serialization/internal/ElementMarker;->mark(I)V

    return v4

    :cond_6
    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0 is not allowed as the protobuf field number in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", the input bytes may have been corrupted"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    new-instance v1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Fail to get element index for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw v1
.end method

.method public final decodeEnum(Lyc3/g;)I
    .locals 5

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->O(J)I

    move-result v0

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    if-ltz v0, :cond_0

    invoke-static {p1, v0, v2}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result v1

    if-ne v1, v0, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-static {p1, v3, v2}, Luf/c0;->L(Lyc3/g;IZ)I

    move-result v4

    if-ne v4, v0, :cond_1

    return v3

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " is not among valid "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Led3/m;->e:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " enum proto numbers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;-><init>(Ljava/lang/String;Lkotlinx/serialization/protobuf/internal/ProtobufDecodingException;)V

    throw p1
.end method

.method public final decodeFloat()F
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->N(J)F

    move-result v0

    return v0
.end method

.method public final decodeFloatElement(Lyc3/g;I)F
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->N(J)F

    move-result p1

    return p1
.end method

.method public final decodeInline(Lyc3/g;)Lzc3/d;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->n()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    return-object p0
.end method

.method public final decodeInlineElement(Lyc3/g;I)Lzc3/d;
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide v0

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    const-string p2, "inlineDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    return-object p0
.end method

.method public final decodeInt()I
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->O(J)I

    move-result v0

    return v0
.end method

.method public final decodeIntElement(Lyc3/g;I)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->O(J)I

    move-result p1

    return p1
.end method

.method public final decodeLong()J
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->P(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final decodeLongElement(Lyc3/g;I)J
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->P(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final decodeNotNullMark()Z
    .locals 1

    iget-boolean v0, p0, Led3/m;->i:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final decodeNull()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    iget-boolean p1, p0, Led3/m;->i:Z

    if-nez p1, :cond_0

    invoke-virtual {p0, p3, p4}, Led3/m;->K(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final decodeSequentially()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Landroidx/glance/appwidget/protobuf/l;->r(J)V

    invoke-virtual {p0, p3, p4}, Led3/m;->K(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;
    .locals 1

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Led3/m;->K(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final decodeShort()S
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->O(J)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public final decodeShortElement(Lyc3/g;I)S
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->O(J)I

    move-result p1

    int-to-short p1, p1

    return p1
.end method

.method public final decodeString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/glance/appwidget/protobuf/l;->o()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Led3/m;->Q(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final decodeStringElement(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Led3/m;->T(Lyc3/g;I)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Led3/m;->Q(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Led3/m;->c:Ldd3/a;

    iget-object v0, v0, Ldd3/a;->a:Lcd3/f;

    return-object v0
.end method
