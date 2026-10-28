.class public final Lat/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/a;


# instance fields
.field public final synthetic a:I

.field public final b:[B

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[B[B)V
    .locals 1

    iput p1, p0, Lat/e;->a:I

    packed-switch p1, :pswitch_data_0

    .line 1
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lhs/j;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p1, p2, v0}, Lhs/j;-><init>([BI)V

    .line 4
    iput-object p1, p0, Lat/e;->c:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lat/e;->b:[B

    return-void

    .line 6
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    .line 7
    invoke-static {p1}, Lih0/d0;->a(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    invoke-static {}, Lat/e;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    array-length p1, p2

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    .line 10
    iput-object p2, p0, Lat/e;->b:[B

    .line 11
    iput-object p3, p0, Lat/e;->c:Ljava/lang/Object;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/security/InvalidKeyException;

    const-string p2, "The key length in bytes must be 32."

    invoke-direct {p1, p2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "JCE does not support algorithm: ChaCha20-Poly1305"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ChaCha20Poly1305 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Lhs/j;

    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p2, v0}, Lhs/j;-><init>([BI)V

    .line 18
    iput-object p1, p0, Lat/e;->c:Ljava/lang/Object;

    .line 19
    iput-object p3, p0, Lat/e;->b:[B

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lfs/a;[B)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lat/e;->a:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lat/e;->c:Ljava/lang/Object;

    .line 28
    array-length p1, p2

    if-eqz p1, :cond_1

    array-length p1, p2

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "identifier has an invalid length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_1
    :goto_0
    iput-object p2, p0, Lat/e;->b:[B

    return-void
.end method

.method public constructor <init>([BLct/a;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lat/e;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 21
    invoke-static {v0}, Lih0/d0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    array-length v0, p1

    invoke-static {v0}, Lat/c0;->a(I)V

    .line 23
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    .line 24
    invoke-virtual {p2}, Lct/a;->b()[B

    move-result-object p1

    iput-object p1, p0, Lat/e;->b:[B

    return-void

    .line 25
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lcom/google/crypto/tink/internal/q;)Lat/e;
    .locals 6

    iget-object p0, p0, Lcom/google/crypto/tink/internal/q;->a:Lcom/google/crypto/tink/internal/k0;

    invoke-static {p0}, Lcom/google/crypto/tink/internal/q;->V(Lcom/google/crypto/tink/internal/k0;)V

    invoke-static {}, Lvs/m3;->G()Lvs/k3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lvs/k3;->h(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/i;

    invoke-virtual {v0, v1}, Lvs/k3;->i(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v1, Lvs/l3;

    invoke-virtual {v0, v1}, Lvs/k3;->g(Lvs/l3;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b()Lcom/google/crypto/tink/shaded/protobuf/x;

    move-result-object v0

    check-cast v0, Lvs/m3;

    const-class v1, Lfs/a;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/a;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v1, Lvs/h4;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v2, v4, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_1

    const/4 v4, 0x4

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "unknown output prefix type "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-array p0, v5, [B

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    :goto_1
    new-instance v1, Lat/e;

    invoke-direct {v1, v0, p0}, Lat/e;-><init>(Lfs/a;[B)V

    return-object v1
.end method

.method public static d(Lfs/a;Lct/a;)Lat/e;
    .locals 1

    new-instance v0, Lat/e;

    invoke-virtual {p1}, Lct/a;->b()[B

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lat/e;-><init>(Lfs/a;[B)V

    return-object v0
.end method

.method public static e(Lgs/o;)Lat/e;
    .locals 3

    iget-object v0, p0, Lgs/o;->b:Lgs/q;

    iget v1, v0, Lgs/q;->b:I

    const/16 v2, 0xc

    if-ne v1, v2, :cond_1

    iget v1, v0, Lgs/q;->c:I

    const/16 v2, 0x10

    if-ne v1, v2, :cond_0

    new-instance v0, Lat/e;

    iget-object v1, p0, Lgs/o;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object p0, p0, Lgs/o;->d:Lct/a;

    invoke-direct {v0, v1, p0}, Lat/e;-><init>([BLct/a;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected tag Size 16, got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lgs/q;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected IV Size 12, got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lgs/q;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Lgs/u;)Lat/e;
    .locals 3

    new-instance v0, Lat/e;

    iget-object v1, p0, Lgs/u;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object p0, p0, Lgs/u;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p0}, Lat/e;-><init>(I[B[B)V

    return-object v0
.end method

.method public static g(Lgs/i0;)Lat/e;
    .locals 3

    new-instance v0, Lat/e;

    iget-object v1, p0, Lgs/i0;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object p0, p0, Lgs/i0;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1, p0}, Lat/e;-><init>(I[B[B)V

    return-object v0
.end method

.method public static h(Lgs/i0;)Lat/e;
    .locals 3

    new-instance v0, Lat/e;

    iget-object v1, p0, Lgs/i0;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object p0, p0, Lgs/i0;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1, p0}, Lat/e;-><init>(I[B[B)V

    return-object v0
.end method

.method public static i()Z
    .locals 1

    sget-object v0, Lhs/e;->f:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 12

    iget v0, p0, Lat/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz p1, :cond_3

    const/16 v1, 0x18

    invoke-static {v1}, Lse/b;->W(I)[B

    move-result-object v2

    iget-object v3, p0, Lat/e;->b:[B

    invoke-static {v3, v2}, Lhs/g;->a([B[B)[B

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v5, "ChaCha20"

    invoke-direct {v4, v3, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    const/16 v5, 0xc

    new-array v5, v5, [B

    const/4 v6, 0x4

    const/16 v7, 0x8

    const/16 v8, 0x10

    invoke-static {v2, v8, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {v3, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    sget-object v5, Lhs/e;->f:Lat/b;

    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljavax/crypto/Cipher;

    const/4 v5, 0x1

    invoke-virtual {v6, v5, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v3, p2

    if-eqz v3, :cond_0

    invoke-virtual {v6, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, p1

    invoke-virtual {v6, p2}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result p2

    array-length v3, v0

    const v4, 0x7fffffe7

    sub-int/2addr v4, v3

    if-gt p2, v4, :cond_2

    array-length v3, v0

    add-int/2addr v3, v1

    add-int/2addr v3, p2

    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v10

    const/4 v3, 0x0

    array-length v4, v0

    invoke-static {v2, v3, v10, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v9, p1

    array-length v0, v0

    add-int/lit8 v11, v0, 0x18

    const/4 v8, 0x0

    move-object v7, p1

    invoke-virtual/range {v6 .. v11}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    if-ne p1, p2, :cond_1

    return-object v10

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "not enough data written"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "plaintext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    move-object v1, p1

    iget-object p1, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast p1, Lfs/a;

    iget-object v0, p0, Lat/e;->b:[B

    array-length v2, v0

    if-nez v2, :cond_4

    invoke-interface {p1, v1, p2}, Lfs/a;->a([B[B)[B

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-interface {p1, v1, p2}, Lfs/a;->a([B[B)[B

    move-result-object p1

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_1
    move-object v1, p1

    array-length p1, v1

    add-int/lit8 p1, p1, 0x28

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v0, 0x18

    invoke-static {v0}, Lse/b;->W(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v2, Lhs/j;

    invoke-virtual {v2, p1, v0, v1, p2}, Lb3/b;->l(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iget-object p2, p0, Lat/e;->b:[B

    array-length v0, p2

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    filled-new-array {p2, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_2
    move-object v1, p1

    array-length p1, v1

    add-int/lit8 p1, p1, 0x1c

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v0, 0xc

    invoke-static {v0}, Lse/b;->W(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v2, Lhs/j;

    invoke-virtual {v2, p1, v0, v1, p2}, Lb3/b;->l(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    iget-object p2, p0, Lat/e;->b:[B

    array-length v0, p2

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    filled-new-array {p2, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_3
    move-object v1, p1

    if-eqz v1, :cond_a

    const/16 p1, 0xc

    invoke-static {p1}, Lse/b;->W(I)[B

    move-result-object v0

    invoke-static {v0}, Lhs/h;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v2

    sget-object v3, Lhs/h;->a:Lat/b;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljavax/crypto/Cipher;

    iget-object v4, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v4, Ljavax/crypto/spec/SecretKeySpec;

    const/4 v5, 0x1

    invoke-virtual {v3, v5, v4, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_7

    array-length v2, p2

    if-eqz v2, :cond_7

    invoke-virtual {v3, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_7
    array-length p2, v1

    invoke-virtual {v3, p2}, Ljavax/crypto/Cipher;->getOutputSize(I)I

    move-result p2

    iget-object v2, p0, Lat/e;->b:[B

    array-length v4, v2

    const v5, 0x7ffffff3

    sub-int/2addr v5, v4

    if-gt p2, v5, :cond_9

    array-length v4, v2

    add-int/2addr v4, p1

    add-int/2addr v4, p2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    const/4 v5, 0x0

    array-length v6, v2

    invoke-static {v0, v5, v4, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v3

    array-length v3, v1

    array-length v2, v2

    add-int/lit8 v5, v2, 0xc

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    if-ne p1, p2, :cond_8

    return-object v4

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "not enough data written"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "plaintext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b([B[B)[B
    .locals 9

    iget v0, p0, Lat/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz p1, :cond_3

    array-length v1, p1

    array-length v2, v0

    add-int/lit8 v2, v2, 0x28

    if-lt v1, v2, :cond_2

    invoke-static {v0, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x18

    new-array v2, v1, [B

    array-length v3, v0

    const/4 v4, 0x0

    invoke-static {p1, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, p0, Lat/e;->b:[B

    invoke-static {v3, v2}, Lhs/g;->a([B[B)[B

    move-result-object v3

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v5, "ChaCha20"

    invoke-direct {v4, v3, v5}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    const/16 v5, 0xc

    new-array v5, v5, [B

    const/4 v6, 0x4

    const/16 v7, 0x8

    const/16 v8, 0x10

    invoke-static {v2, v8, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {v3, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    sget-object v2, Lhs/e;->f:Lat/b;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljavax/crypto/Cipher;

    const/4 v5, 0x2

    invoke-virtual {v2, v5, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v3, p2

    if-eqz v3, :cond_0

    invoke-virtual {v2, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, v0

    add-int/2addr p2, v1

    array-length v3, p1

    array-length v0, v0

    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    invoke-virtual {v2, p1, p2, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ciphertext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v0, Lfs/a;

    iget-object v1, p0, Lat/e;->b:[B

    array-length v2, v1

    if-nez v2, :cond_4

    invoke-interface {v0, p1, p2}, Lfs/a;->b([B[B)[B

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {v1, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x5

    array-length v2, p1

    invoke-static {p1, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lfs/a;->b([B[B)[B

    move-result-object p1

    :goto_0
    return-object p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "wrong prefix"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v0, p0, Lat/e;->b:[B

    array-length v1, v0

    if-nez v1, :cond_6

    invoke-virtual {p0, p1, p2}, Lat/e;->k([B[B)[B

    move-result-object p1

    goto :goto_1

    :cond_6
    invoke-static {v0, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_7

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lat/e;->k([B[B)[B

    move-result-object p1

    :goto_1
    return-object p1

    :cond_7
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    iget-object v0, p0, Lat/e;->b:[B

    array-length v1, v0

    if-nez v1, :cond_8

    invoke-virtual {p0, p1, p2}, Lat/e;->j([B[B)[B

    move-result-object p1

    goto :goto_2

    :cond_8
    invoke-static {v0, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_9

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lat/e;->j([B[B)[B

    move-result-object p1

    :goto_2
    return-object p1

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    if-eqz p1, :cond_d

    array-length v0, p1

    iget-object v1, p0, Lat/e;->b:[B

    array-length v2, v1

    add-int/lit8 v2, v2, 0x1c

    if-lt v0, v2, :cond_c

    invoke-static {v1, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 v0, 0xc

    new-array v2, v0, [B

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {p1, v3, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Lhs/h;->a([B)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v2

    sget-object v3, Lhs/h;->a:Lat/b;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljavax/crypto/Cipher;

    iget-object v4, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v4, Ljavax/crypto/spec/SecretKeySpec;

    const/4 v5, 0x2

    invoke-virtual {v3, v5, v4, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_a

    array-length v2, p2

    if-eqz v2, :cond_a

    invoke-virtual {v3, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_a
    array-length p2, v1

    add-int/2addr p2, v0

    array-length v2, p1

    array-length v1, v1

    sub-int/2addr v2, v1

    sub-int/2addr v2, v0

    invoke-virtual {v3, p1, p2, v2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ciphertext is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j([B[B)[B
    .locals 3

    array-length v0, p1

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v2, p1

    sub-int/2addr v2, v0

    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v0, Lhs/j;

    invoke-virtual {v0, p1, v1, p2}, Lb3/b;->k(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k([B[B)[B
    .locals 3

    array-length v0, p1

    const/16 v1, 0x28

    if-lt v0, v1, :cond_0

    const/16 v0, 0x18

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    array-length v2, p1

    sub-int/2addr v2, v0

    invoke-static {p1, v0, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Lat/e;->c:Ljava/lang/Object;

    check-cast v0, Lhs/j;

    invoke-virtual {v0, p1, v1, p2}, Lb3/b;->k(Ljava/nio/ByteBuffer;[B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
