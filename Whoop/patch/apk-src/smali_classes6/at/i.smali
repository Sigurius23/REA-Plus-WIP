.class public final Lat/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/m;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:[B

.field public final e:Ljava/security/PrivateKey;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;Lat/w;Lat/q;[B[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lat/i;->a:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 20
    invoke-static {v0}, Lih0/d0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    iput-object p1, p0, Lat/i;->e:Ljava/security/PrivateKey;

    .line 22
    invoke-static {p2}, Lat/c0;->e(Lat/w;)V

    .line 23
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "withECDSA"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 24
    iput-object p1, p0, Lat/i;->b:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Lat/i;->f:Ljava/io/Serializable;

    .line 26
    iput-object p4, p0, Lat/i;->c:[B

    .line 27
    iput-object p5, p0, Lat/i;->d:[B

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lat/w;[B[B)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lat/i;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lih0/d0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p2}, Lat/c0;->e(Lat/w;)V

    .line 4
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Lat/c0;->c(I)V

    .line 5
    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lat/c0;->d(Ljava/math/BigInteger;)V

    .line 6
    iput-object p1, p0, Lat/i;->e:Ljava/security/PrivateKey;

    .line 7
    invoke-static {p2}, Lat/c0;->e(Lat/w;)V

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "withRSA"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 9
    iput-object p2, p0, Lat/i;->b:Ljava/lang/String;

    .line 10
    sget-object p2, Lat/u;->g:Lat/u;

    const-string v0, "RSA"

    .line 11
    iget-object p2, p2, Lat/u;->a:Lat/t;

    .line 12
    invoke-virtual {p2, v0}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    .line 13
    check-cast p2, Ljava/security/KeyFactory;

    .line 14
    new-instance v0, Ljava/security/spec/RSAPublicKeySpec;

    .line 15
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p2, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    iput-object p1, p0, Lat/i;->f:Ljava/io/Serializable;

    .line 16
    iput-object p3, p0, Lat/i;->c:[B

    .line 17
    iput-object p4, p0, Lat/i;->d:[B

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lws/d;)Lat/i;
    .locals 8

    sget-object v0, Lat/j;->f:Lwe/o;

    iget-object v1, p0, Lws/d;->b:Lws/e;

    iget-object v2, v1, Lws/e;->b:Lws/c;

    iget-object v2, v2, Lws/c;->c:Lws/b;

    invoke-virtual {v0, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lat/w;

    sget-object v0, Lat/j;->g:Lwe/o;

    iget-object v2, v1, Lws/e;->b:Lws/c;

    iget-object v2, v2, Lws/c;->a:Lws/b;

    invoke-virtual {v0, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lat/q;

    sget-object v0, Lat/j;->h:Lwe/o;

    iget-object v2, v1, Lws/e;->b:Lws/c;

    iget-object v3, v2, Lws/c;->b:Lws/a;

    invoke-virtual {v0, v3}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/p;

    iget-object v3, p0, Lws/d;->c:Lro/i;

    iget-object v3, v3, Lro/i;->x:Ljava/lang/Object;

    check-cast v3, Ljava/math/BigInteger;

    invoke-virtual {v3}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v3

    invoke-static {v0, v3}, Ls2/e;->A(Lat/p;[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v3

    move-object v0, v2

    new-instance v2, Lat/i;

    invoke-virtual {p0}, Lws/d;->X()Lgs/b;

    move-result-object p0

    invoke-virtual {p0}, Lgs/b;->V()Lct/a;

    move-result-object p0

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object v6

    iget-object p0, v0, Lws/c;->d:Lws/b;

    sget-object v0, Lws/b;->j:Lws/b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    new-array p0, p0, [B

    aput-byte v0, p0, v0

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    new-array p0, v0, [B

    goto :goto_0

    :goto_1
    invoke-direct/range {v2 .. v7}, Lat/i;-><init>(Ljava/security/interfaces/ECPrivateKey;Lat/w;Lat/q;[B[B)V

    invoke-static {v1}, Lat/j;->a(Lws/e;)Lat/j;

    move-result-object p0

    const/4 v0, 0x3

    :try_start_0
    new-array v1, v0, [B

    fill-array-data v1, :array_0

    invoke-virtual {v2, v1}, Lat/i;->e([B)[B

    move-result-object v1

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-virtual {p0, v1, v0}, Lat/j;->c([B[B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted."

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data
.end method

.method public static b(Lws/r;)Lat/i;
    .locals 11

    sget-object v0, Lat/u;->g:Lat/u;

    const-string v1, "RSA"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    iget-object v10, p0, Lws/r;->b:Lws/s;

    iget-object v2, v10, Lws/s;->c:Ljava/math/BigInteger;

    iget-object v3, v10, Lws/s;->b:Lws/q;

    iget-object v3, v3, Lws/q;->b:Ljava/math/BigInteger;

    iget-object v4, p0, Lws/r;->c:Lro/i;

    iget-object v4, v4, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Ljava/math/BigInteger;

    iget-object v5, p0, Lws/r;->d:Lro/i;

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ljava/math/BigInteger;

    iget-object v6, p0, Lws/r;->e:Lro/i;

    iget-object v6, v6, Lro/i;->x:Ljava/lang/Object;

    check-cast v6, Ljava/math/BigInteger;

    iget-object v7, p0, Lws/r;->f:Lro/i;

    iget-object v7, v7, Lro/i;->x:Ljava/lang/Object;

    check-cast v7, Ljava/math/BigInteger;

    iget-object v8, p0, Lws/r;->g:Lro/i;

    iget-object v8, v8, Lro/i;->x:Ljava/lang/Object;

    check-cast v8, Ljava/math/BigInteger;

    iget-object v9, p0, Lws/r;->h:Lro/i;

    iget-object v9, v9, Lro/i;->x:Ljava/lang/Object;

    check-cast v9, Ljava/math/BigInteger;

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    new-instance v1, Lat/i;

    sget-object v2, Lat/a0;->e:Lwe/o;

    iget-object v3, v10, Lws/s;->b:Lws/q;

    iget-object v3, v3, Lws/q;->d:Lws/o;

    invoke-virtual {v2, v3}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lat/w;

    invoke-virtual {p0}, Lws/r;->X()Lgs/b;

    move-result-object p0

    invoke-virtual {p0}, Lgs/b;->V()Lct/a;

    move-result-object p0

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    iget-object v3, v10, Lws/s;->b:Lws/q;

    iget-object v3, v3, Lws/q;->c:Lws/p;

    sget-object v4, Lws/p;->d:Lws/p;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    new-array v3, v3, [B

    aput-byte v4, v3, v4

    goto :goto_0

    :cond_0
    new-array v3, v4, [B

    :goto_0
    invoke-direct {v1, v0, v2, p0, v3}, Lat/i;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lat/w;[B[B)V

    invoke-static {v10}, Lat/a0;->a(Lws/s;)Lat/a0;

    move-result-object p0

    const/4 v0, 0x3

    :try_start_0
    new-array v2, v0, [B

    fill-array-data v2, :array_0

    invoke-virtual {v1, v2}, Lat/i;->e([B)[B

    move-result-object v2

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-virtual {p0, v2, v0}, Lat/a0;->c([B[B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted."

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data
.end method


# virtual methods
.method public c([B)[B
    .locals 9

    const-string v0, "AndroidOpenSSL"

    const-string v1, "Conscrypt"

    const-string v2, "GmsCore_OpenSSL"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lat/u;->b([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lat/u;->d:Lat/u;

    iget-object v2, p0, Lat/i;->b:Ljava/lang/String;

    iget-object v1, v1, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v2, v0}, Lat/t;->b(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Signature;

    iget-object v1, p0, Lat/i;->e:Ljava/security/PrivateKey;

    check-cast v1, Ljava/security/interfaces/ECPrivateKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object p1

    iget-object v0, p0, Lat/i;->f:Ljava/io/Serializable;

    check-cast v0, Lat/q;

    sget-object v2, Lat/q;->w:Lat/q;

    if-ne v0, v2, :cond_4

    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->s(Ljava/security/spec/EllipticCurve;)I

    move-result v0

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    invoke-static {p1}, Ls2/e;->P([B)Z

    move-result v2

    if-eqz v2, :cond_3

    new-array v2, v0, [B

    const/4 v3, 0x1

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x80

    if-lt v4, v5, :cond_0

    const/4 v4, 0x3

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    add-int/lit8 v5, v4, 0x1

    add-int/2addr v4, v1

    aget-byte v1, p1, v5

    aget-byte v5, p1, v4

    const/4 v6, 0x0

    if-nez v5, :cond_1

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    add-int v7, v4, v5

    div-int/lit8 v8, v0, 0x2

    sub-int/2addr v8, v1

    add-int/2addr v8, v5

    sub-int v5, v1, v5

    invoke-static {p1, v7, v2, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v3

    add-int/2addr v1, v4

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, p1, v1

    aget-byte v5, p1, v4

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    add-int/2addr v4, v3

    sub-int/2addr v0, v1

    add-int/2addr v0, v3

    sub-int/2addr v1, v3

    invoke-static {p1, v4, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Invalid DER encoding"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object p1
.end method

.method public d([B)[B
    .locals 4

    sget-object v0, Lat/u;->d:Lat/u;

    iget-object v1, v0, Lat/u;->a:Lat/t;

    iget-object v2, p0, Lat/i;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/Signature;

    iget-object v3, p0, Lat/i;->e:Ljava/security/PrivateKey;

    check-cast v3, Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {v1, v3}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v1}, Ljava/security/Signature;->sign()[B

    move-result-object v1

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v2}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Signature;

    iget-object v2, p0, Lat/i;->f:Ljava/io/Serializable;

    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0, v2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Security bug: RSA signature computation error"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e([B)[B
    .locals 2

    iget v0, p0, Lat/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat/i;->d:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lat/i;->d([B)[B

    move-result-object p1

    goto :goto_0

    :cond_0
    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lat/i;->d([B)[B

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lat/i;->c:[B

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lat/i;->d:[B

    array-length v1, v0

    if-nez v1, :cond_2

    invoke-virtual {p0, p1}, Lat/i;->c([B)[B

    move-result-object p1

    goto :goto_2

    :cond_2
    filled-new-array {p1, v0}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lat/i;->c([B)[B

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lat/i;->c:[B

    array-length v1, v0

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    :goto_3
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
