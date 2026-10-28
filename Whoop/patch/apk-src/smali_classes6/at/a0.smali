.class public final Lat/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/n;


# static fields
.field public static final e:Lwe/o;


# instance fields
.field public final a:Ljava/security/interfaces/RSAPublicKey;

.field public final b:Lat/w;

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/w;->y:Lat/w;

    sget-object v2, Lws/o;->b:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->z:Lat/w;

    sget-object v2, Lws/o;->c:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->E:Lat/w;

    sget-object v2, Lws/o;->d:Lws/o;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/a0;->e:Lwe/o;

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Lat/w;[B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    invoke-static {v0}, Lih0/d0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lat/c0;->e(Lat/w;)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Lat/c0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lat/c0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lat/a0;->a:Ljava/security/interfaces/RSAPublicKey;

    iput-object p2, p0, Lat/a0;->b:Lat/w;

    iput-object p3, p0, Lat/a0;->c:[B

    iput-object p4, p0, Lat/a0;->d:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lws/s;)Lat/a0;
    .locals 5

    sget-object v0, Lat/u;->g:Lat/u;

    const-string v1, "RSA"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    iget-object v2, p0, Lws/s;->c:Ljava/math/BigInteger;

    iget-object v3, p0, Lws/s;->b:Lws/q;

    iget-object v4, v3, Lws/q;->b:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v4}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPublicKey;

    new-instance v1, Lat/a0;

    sget-object v2, Lat/a0;->e:Lwe/o;

    iget-object v4, v3, Lws/q;->d:Lws/o;

    invoke-virtual {v2, v4}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lat/w;

    iget-object p0, p0, Lws/s;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

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
    invoke-direct {v1, v0, v2, p0, v3}, Lat/a0;-><init>(Ljava/security/interfaces/RSAPublicKey;Lat/w;[B[B)V

    return-object v1
.end method


# virtual methods
.method public final b([B[B)V
    .locals 10

    iget-object v0, p0, Lat/a0;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    div-int/lit8 v2, v2, 0x8

    array-length v3, p1

    if-ne v2, v3, :cond_c

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_b

    invoke-virtual {p1, v1, v0}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object p1

    iget-object v0, p0, Lat/a0;->b:Lat/w;

    invoke-static {v0}, Lat/c0;->e(Lat/w;)V

    sget-object v1, Lat/u;->e:Lat/u;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    const-string v3, "SHA-512"

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported hash "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string v3, "SHA-384"

    goto :goto_0

    :cond_2
    const-string v3, "SHA-256"

    goto :goto_0

    :cond_3
    const-string v3, "SHA-224"

    goto :goto_0

    :cond_4
    const-string v3, "SHA-1"

    :goto_0
    iget-object v1, v1, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v3}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/MessageDigest;

    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_7

    if-eq v1, v3, :cond_6

    const/4 v5, 0x4

    if-ne v1, v5, :cond_5

    const-string v0, "3051300d060960864801650304020305000440"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported hash "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const-string v0, "3041300d060960864801650304020205000430"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_1

    :cond_7
    const-string v0, "3031300d060960864801650304020105000420"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    :goto_1
    array-length v1, v0

    array-length v5, p2

    add-int/2addr v1, v5

    add-int/lit8 v5, v1, 0xb

    if-lt v2, v5, :cond_a

    new-array v5, v2, [B

    const/4 v6, 0x0

    aput-byte v6, v5, v6

    const/4 v7, 0x1

    aput-byte v7, v5, v7

    move v7, v6

    :goto_2
    sub-int v8, v2, v1

    sub-int/2addr v8, v3

    if-ge v7, v8, :cond_8

    add-int/lit8 v8, v4, 0x1

    const/4 v9, -0x1

    aput-byte v9, v5, v4

    add-int/lit8 v7, v7, 0x1

    move v4, v8

    goto :goto_2

    :cond_8
    add-int/lit8 v1, v4, 0x1

    aput-byte v6, v5, v4

    array-length v2, v0

    invoke-static {v0, v6, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    add-int/2addr v1, v0

    array-length v0, p2

    invoke-static {p2, v6, v5, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1, v5}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p1

    if-eqz p1, :cond_9

    return-void

    :cond_9
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid signature"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "intended encoded message length too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "signature out of range"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid signature\'s length"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c([B[B)V
    .locals 3

    iget-object v0, p0, Lat/a0;->c:[B

    array-length v1, v0

    iget-object v2, p0, Lat/a0;->d:[B

    if-nez v1, :cond_0

    array-length v1, v2

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lat/a0;->b([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    array-length v1, v2

    if-eqz v1, :cond_1

    filled-new-array {p2, v2}, [[B

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p2

    :cond_1
    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lat/a0;->b([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
