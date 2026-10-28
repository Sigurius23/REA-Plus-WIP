.class public final Lcom/google/crypto/tink/shaded/protobuf/h1;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/e0;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final w:Lcom/google/crypto/tink/shaded/protobuf/d0;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    return-void
.end method


# virtual methods
.method public final T0(Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    iget-object v0, v0, Lcom/google/crypto/tink/shaded/protobuf/d0;->x:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/d0;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/g1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/g1;->w:Ljava/util/Iterator;

    return-object v0
.end method

.method public final k()Lcom/google/crypto/tink/shaded/protobuf/e0;
    .locals 0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/f1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    invoke-virtual {v1, p1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/f1;->w:Ljava/util/ListIterator;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    iget-object v0, v0, Lcom/google/crypto/tink/shaded/protobuf/d0;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final x(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/h1;->w:Lcom/google/crypto/tink/shaded/protobuf/d0;

    iget-object v0, v0, Lcom/google/crypto/tink/shaded/protobuf/d0;->x:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
