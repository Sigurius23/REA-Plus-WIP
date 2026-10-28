.class public final Lgs/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/a;


# static fields
.field public static final d:[B

.field public static final e:Ljava/util/Set;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lfs/k;

.field public final c:Lps/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lgs/y;->d:[B

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lgs/y;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lvs/p3;Lps/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgs/y;->e:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lgs/y;->a:Ljava/lang/String;

    invoke-static {p1}, Lvs/p3;->H(Lvs/p3;)Lvs/o3;

    move-result-object p1

    sget-object v0, Lvs/h4;->E:Lvs/h4;

    invoke-virtual {p1, v0}, Lvs/o3;->g(Lvs/h4;)V

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object p1

    check-cast p1, Lvs/p3;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->e()[B

    move-result-object p1

    invoke-static {p1}, Lfs/b;->b([B)Lfs/k;

    move-result-object p1

    iput-object p1, p0, Lgs/y;->b:Lfs/k;

    iput-object p2, p0, Lgs/y;->c:Lps/b;

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported DEK key type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Only Tink AEAD key types are supported."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static c(Lgs/d;Lps/b;)Lgs/y;
    .locals 1

    :try_start_0
    invoke-static {p0}, Lfs/b;->c(Lfs/k;)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->a()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Lvs/p3;->I([BLcom/google/crypto/tink/shaded/protobuf/p;)Lvs/p3;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lgs/y;

    invoke-direct {v0, p0, p1}, Lgs/y;-><init>(Lvs/p3;Lps/b;)V

    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 4

    sget-object v0, Lcom/google/crypto/tink/internal/t;->b:Lcom/google/crypto/tink/internal/t;

    iget-object v1, p0, Lgs/y;->b:Lfs/k;

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/t;->b(Lfs/k;)Lts/o;

    move-result-object v0

    sget-object v1, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/z;->g(Lts/o;)Lcom/google/crypto/tink/internal/n0;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/k0;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->g()[B

    move-result-object v1

    iget-object v2, p0, Lgs/y;->c:Lps/b;

    sget-object v3, Lgs/y;->d:[B

    invoke-virtual {v2, v1, v3}, Lps/b;->a([B[B)[B

    move-result-object v1

    sget-object v2, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    const-class v3, Lfs/a;

    invoke-virtual {v2, v0, v3}, Lcom/google/crypto/tink/internal/y;->b(Lts/o;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/a;

    invoke-interface {v0, p1, p2}, Lfs/a;->a([B[B)[B

    move-result-object p1

    array-length p2, v1

    add-int/lit8 p2, p2, 0x4

    array-length v0, p1

    add-int/2addr p2, v0

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    array-length v0, v1

    invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1
.end method

.method public final b([B[B)[B
    .locals 6

    const-string v0, "invalid ciphertext"

    :try_start_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    if-lez v2, :cond_0

    array-length p1, p1

    add-int/lit8 p1, p1, -0x4

    if-gt v2, p1, :cond_0

    new-array p1, v2, [B

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lgs/y;->c:Lps/b;

    sget-object v4, Lgs/y;->d:[B

    invoke-virtual {v1, p1, v4}, Lps/b;->b([B[B)[B

    move-result-object p1

    iget-object v1, p0, Lgs/y;->a:Ljava/lang/String;

    sget-object v4, Lcom/google/crypto/tink/shaded/protobuf/i;->x:Lcom/google/crypto/tink/shaded/protobuf/h;

    array-length v4, p1

    invoke-static {p1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/i;->d([BII)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    sget-object v4, Lvs/h4;->E:Lvs/h4;

    const/4 v5, 0x0

    invoke-static {v1, p1, v3, v4, v5}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    sget-object v1, Lcom/google/crypto/tink/internal/z;->b:Lcom/google/crypto/tink/internal/z;

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/z;->a(Lcom/google/crypto/tink/internal/k0;)Lts/o;

    move-result-object p1

    sget-object v1, Lcom/google/crypto/tink/internal/y;->b:Lcom/google/crypto/tink/internal/y;

    const-class v3, Lfs/a;

    invoke-virtual {v1, p1, v3}, Lcom/google/crypto/tink/internal/y;->b(Lts/o;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfs/a;

    invoke-interface {p1, v2, p2}, Lfs/a;->b([B[B)[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p2, Ljava/security/GeneralSecurityException;

    invoke-direct {p2, v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
