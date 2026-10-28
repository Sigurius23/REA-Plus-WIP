.class public abstract Lcom/google/crypto/tink/shaded/protobuf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/io/Serializable;


# static fields
.field public static final x:Lcom/google/crypto/tink/shaded/protobuf/h;

.field public static final y:Lcom/google/crypto/tink/shaded/protobuf/g;


# instance fields
.field public w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/b0;->b:[B

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/h;-><init>([B)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lqt/e;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/e;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/e;-><init>()V

    :goto_0
    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->y:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-void
.end method

.method public static c(III)I
    .locals 3

    sub-int v0, p1, p0

    or-int v1, p0, p1

    or-int/2addr v1, v0

    sub-int v2, p2, p1

    or-int/2addr v1, v2

    if-gez v1, :cond_2

    if-ltz p0, :cond_1

    if-ge p1, p0, :cond_0

    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Beginning index larger than ending index: "

    const-string v1, ", "

    invoke-static {p0, p1, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "End index: "

    const-string v1, " >= "

    invoke-static {p1, p2, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Beginning index: "

    const-string v0, " < 0"

    invoke-static {p0, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return v0
.end method

.method public static d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 2

    add-int v0, p1, p2

    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(III)I

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/h;

    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/i;->y:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-interface {v1, p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/g;->a([BII)[B

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/h;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public abstract a(I)B
.end method

.method public abstract e(I[B)V
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract f(I)B
.end method

.method public final g()[B
    .locals 2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/b0;->b:[B

    return-object v0

    :cond_0
    new-array v1, v0, [B

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->e(I[B)V

    return-object v1
.end method

.method public final hashCode()I
    .locals 6

    iget v0, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->w:I

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    move-object v1, p0

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->j()I

    move-result v2

    move v4, v0

    move v3, v2

    :goto_0
    add-int v5, v2, v0

    if-ge v3, v5, :cond_0

    mul-int/lit8 v4, v4, 0x1f

    iget-object v5, v1, Lcom/google/crypto/tink/shaded/protobuf/h;->z:[B

    aget-byte v5, v5, v3

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v4, :cond_1

    const/4 v4, 0x1

    :cond_1
    iput v4, p0, Lcom/google/crypto/tink/shaded/protobuf/i;->w:I

    return v4

    :cond_2
    return v0
.end method

.method public abstract size()I
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v2

    const/16 v3, 0x32

    if-gt v2, v3, :cond_0

    invoke-static {p0}, Lse/g;->v(Lcom/google/crypto/tink/shaded/protobuf/i;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object v3, p0

    check-cast v3, Lcom/google/crypto/tink/shaded/protobuf/h;

    const/4 v4, 0x0

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v5

    const/16 v6, 0x2f

    invoke-static {v4, v6, v5}, Lcom/google/crypto/tink/shaded/protobuf/i;->c(III)I

    move-result v4

    if-nez v4, :cond_1

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_0

    :cond_1
    new-instance v5, Lcom/google/crypto/tink/shaded/protobuf/f;

    iget-object v6, v3, Lcom/google/crypto/tink/shaded/protobuf/h;->z:[B

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/h;->j()I

    move-result v3

    invoke-direct {v5, v6, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/f;-><init>([BII)V

    move-object v3, v5

    :goto_0
    invoke-static {v3}, Lse/g;->v(Lcom/google/crypto/tink/shaded/protobuf/i;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "..."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    const-string v3, " size="

    const-string v4, " contents=\""

    const-string v5, "<ByteString@"

    invoke-static {v1, v5, v0, v3, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\">"

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
