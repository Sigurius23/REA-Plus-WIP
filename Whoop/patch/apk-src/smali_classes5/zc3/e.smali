.class public interface abstract Lzc3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract beginCollection(Lyc3/g;I)Lzc3/c;
.end method

.method public abstract beginStructure(Lyc3/g;)Lzc3/c;
.end method

.method public abstract encodeBoolean(Z)V
.end method

.method public abstract encodeByte(B)V
.end method

.method public abstract encodeChar(C)V
.end method

.method public abstract encodeDouble(D)V
.end method

.method public abstract encodeEnum(Lyc3/g;I)V
.end method

.method public abstract encodeFloat(F)V
.end method

.method public abstract encodeInline(Lyc3/g;)Lzc3/e;
.end method

.method public abstract encodeInt(I)V
.end method

.method public abstract encodeLong(J)V
.end method

.method public abstract encodeNotNullMark()V
.end method

.method public abstract encodeNull()V
.end method

.method public encodeNullableSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->isNullable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0, p1, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    invoke-interface {p0}, Lzc3/e;->encodeNull()V

    return-void

    :cond_1
    invoke-interface {p0}, Lzc3/e;->encodeNotNullMark()V

    invoke-interface {p0, p1, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
.end method

.method public abstract encodeShort(S)V
.end method

.method public abstract encodeString(Ljava/lang/String;)V
.end method

.method public abstract getSerializersModule()Lcd3/f;
.end method
