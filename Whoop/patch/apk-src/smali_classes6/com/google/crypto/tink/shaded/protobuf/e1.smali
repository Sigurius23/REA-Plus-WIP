.class public final Lcom/google/crypto/tink/shaded/protobuf/e1;
.super Lcom/google/crypto/tink/shaded/protobuf/c1;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/d1;
    .locals 2

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/d1;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/d1;->f:Lcom/google/crypto/tink/shaded/protobuf/d1;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/d1;->c()Lcom/google/crypto/tink/shaded/protobuf/d1;

    move-result-object v0

    iput-object v0, p1, Lcom/google/crypto/tink/shaded/protobuf/x;->unknownFields:Lcom/google/crypto/tink/shaded/protobuf/d1;

    :cond_0
    return-object v0
.end method
