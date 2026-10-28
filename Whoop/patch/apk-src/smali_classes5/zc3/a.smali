.class public abstract Lzc3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzc3/e;
.implements Lzc3/c;


# virtual methods
.method public beginCollection(Lyc3/g;I)Lzc3/c;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    return-object p1
.end method

.method public beginStructure(Lyc3/g;)Lzc3/c;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public encodeBoolean(Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeBooleanElement(Lyc3/g;IZ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeBoolean(Z)V

    :cond_0
    return-void
.end method

.method public encodeByte(B)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeByteElement(Lyc3/g;IB)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeByte(B)V

    :cond_0
    return-void
.end method

.method public encodeChar(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeCharElement(Lyc3/g;IC)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeChar(C)V

    :cond_0
    return-void
.end method

.method public encodeDouble(D)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeDoubleElement(Lyc3/g;ID)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lzc3/a;->encodeDouble(D)V

    :cond_0
    return-void
.end method

.method public encodeElement(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public encodeEnum(Lyc3/g;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public encodeFloat(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeFloatElement(Lyc3/g;IF)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeFloat(F)V

    :cond_0
    return-void
.end method

.method public encodeInline(Lyc3/g;)Lzc3/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final encodeInlineElement(Lyc3/g;I)Lzc3/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lkotlinx/serialization/internal/NoOpEncoder;->INSTANCE:Lkotlinx/serialization/internal/NoOpEncoder;

    return-object p1
.end method

.method public encodeInt(I)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeIntElement(Lyc3/g;II)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeInt(I)V

    :cond_0
    return-void
.end method

.method public encodeLong(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeLongElement(Lyc3/g;IJ)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lzc3/a;->encodeLong(J)V

    :cond_0
    return-void
.end method

.method public encodeNotNullMark()V
    .locals 0

    return-void
.end method

.method public encodeNull()V
    .locals 2

    new-instance v0, Lkotlinx/serialization/SerializationException;

    const-string v1, "\'null\' is not supported by default"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyc3/g;",
            "I",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lzc3/a;->encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lzc3/e;->encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lyc3/g;",
            "I",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3, p4}, Lzc3/a;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwc3/j;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method

.method public encodeShort(S)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeShortElement(Lyc3/g;IS)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeShort(S)V

    :cond_0
    return-void
.end method

.method public encodeString(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzc3/a;->encodeValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeStringElement(Lyc3/g;ILjava/lang/String;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lzc3/a;->encodeElement(Lyc3/g;I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Lzc3/a;->encodeString(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public encodeValue(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/SerializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Non-serializable "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported by "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " encoder"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public shouldEncodeElementDefault(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
