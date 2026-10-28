.class public final Lat/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/n;


# static fields
.field public static final f:Lwe/o;

.field public static final g:Lwe/o;

.field public static final h:Lwe/o;


# instance fields
.field public final a:Ljava/security/interfaces/ECPublicKey;

.field public final b:Ljava/lang/String;

.field public final c:Lat/q;

.field public final d:[B

.field public final e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/w;->y:Lat/w;

    sget-object v2, Lws/b;->c:Lws/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->z:Lat/w;

    sget-object v2, Lws/b;->d:Lws/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->E:Lat/w;

    sget-object v2, Lws/b;->e:Lws/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/j;->f:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/q;->w:Lat/q;

    sget-object v2, Lws/b;->f:Lws/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/q;->x:Lat/q;

    sget-object v2, Lws/b;->g:Lws/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/j;->g:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/p;->w:Lat/p;

    sget-object v2, Lws/a;->c:Lws/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/p;->x:Lat/p;

    sget-object v2, Lws/a;->d:Lws/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/p;->y:Lat/p;

    sget-object v2, Lws/a;->e:Lws/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/j;->h:Lwe/o;

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPublicKey;Lat/w;Lat/q;[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    invoke-static {v0}, Lih0/d0;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-interface {p1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    invoke-static {p2}, Lat/c0;->e(Lat/w;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "withECDSA"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lat/j;->b:Ljava/lang/String;

    iput-object p1, p0, Lat/j;->a:Ljava/security/interfaces/ECPublicKey;

    iput-object p3, p0, Lat/j;->c:Lat/q;

    iput-object p4, p0, Lat/j;->d:[B

    iput-object p5, p0, Lat/j;->e:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use ECDSA in FIPS-mode, as BoringCrypto is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static a(Lws/e;)Lat/j;
    .locals 9

    iget-object v0, p0, Lws/e;->b:Lws/c;

    iget-object v0, v0, Lws/c;->b:Lws/a;

    sget-object v1, Lat/j;->h:Lwe/o;

    invoke-virtual {v1, v0}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/p;

    iget-object v1, p0, Lws/e;->c:Ljava/security/spec/ECPoint;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    invoke-static {v0, v2, v1}, Ls2/e;->B(Lat/p;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v4

    new-instance v3, Lat/j;

    iget-object v0, p0, Lws/e;->b:Lws/c;

    iget-object v1, v0, Lws/c;->c:Lws/b;

    sget-object v2, Lat/j;->f:Lwe/o;

    invoke-virtual {v2, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lat/w;

    sget-object v1, Lat/j;->g:Lwe/o;

    iget-object v2, v0, Lws/c;->a:Lws/b;

    invoke-virtual {v1, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lat/q;

    iget-object p0, p0, Lws/e;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object v7

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
    move-object v8, p0

    goto :goto_1

    :cond_0
    new-array p0, v0, [B

    goto :goto_0

    :goto_1
    invoke-direct/range {v3 .. v8}, Lat/j;-><init>(Ljava/security/interfaces/ECPublicKey;Lat/w;Lat/q;[B[B)V

    return-object v3
.end method


# virtual methods
.method public final b([B[B)V
    .locals 9

    iget-object v0, p0, Lat/j;->c:Lat/q;

    sget-object v1, Lat/q;->w:Lat/q;

    const/4 v2, 0x0

    iget-object v3, p0, Lat/j;->a:Ljava/security/interfaces/ECPublicKey;

    const-string v4, "Invalid signature"

    if-ne v0, v1, :cond_3

    invoke-interface {v3}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    array-length v1, p1

    invoke-static {v0}, Ls2/e;->s(Ljava/security/spec/EllipticCurve;)I

    move-result v0

    const/4 v5, 0x2

    mul-int/2addr v0, v5

    if-ne v1, v0, :cond_2

    array-length v0, p1

    rem-int/2addr v0, v5

    if-nez v0, :cond_1

    array-length v0, p1

    if-eqz v0, :cond_1

    array-length v0, p1

    const/16 v1, 0x84

    if-gt v0, v1, :cond_1

    array-length v0, p1

    div-int/2addr v0, v5

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Ls2/e;->g0([B)[B

    move-result-object v0

    array-length v1, p1

    div-int/2addr v1, v5

    array-length v6, p1

    invoke-static {p1, v1, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {p1}, Ls2/e;->g0([B)[B

    move-result-object p1

    array-length v1, v0

    add-int/lit8 v1, v1, 0x4

    array-length v6, p1

    add-int/2addr v1, v6

    const/16 v6, 0x80

    const/16 v7, 0x30

    const/4 v8, 0x1

    if-lt v1, v6, :cond_0

    add-int/lit8 v6, v1, 0x3

    new-array v6, v6, [B

    aput-byte v7, v6, v2

    const/16 v7, -0x7f

    aput-byte v7, v6, v8

    int-to-byte v1, v1

    aput-byte v1, v6, v5

    const/4 v1, 0x3

    goto :goto_0

    :cond_0
    add-int/lit8 v6, v1, 0x2

    new-array v6, v6, [B

    aput-byte v7, v6, v2

    int-to-byte v1, v1

    aput-byte v1, v6, v8

    move v1, v5

    :goto_0
    add-int/lit8 v7, v1, 0x1

    aput-byte v5, v6, v1

    add-int/2addr v1, v5

    array-length v8, v0

    int-to-byte v8, v8

    aput-byte v8, v6, v7

    array-length v7, v0

    invoke-static {v0, v2, v6, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    add-int/2addr v1, v0

    add-int/lit8 v0, v1, 0x1

    aput-byte v5, v6, v1

    add-int/2addr v1, v5

    array-length v5, p1

    int-to-byte v5, v5

    aput-byte v5, v6, v0

    array-length v0, p1

    invoke-static {p1, v2, v6, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v6

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid IEEE_P1363 encoding"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-static {p1}, Ls2/e;->P([B)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "AndroidOpenSSL"

    const-string v1, "Conscrypt"

    const-string v5, "GmsCore_OpenSSL"

    filled-new-array {v5, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lat/u;->b([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lat/u;->d:Lat/u;

    iget-object v5, p0, Lat/j;->b:Ljava/lang/String;

    iget-object v1, v1, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v5, v0}, Lat/t;->b(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Signature;

    invoke-virtual {v0, v3}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-eqz v2, :cond_4

    return-void

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c([B[B)V
    .locals 3

    iget-object v0, p0, Lat/j;->d:[B

    array-length v1, v0

    iget-object v2, p0, Lat/j;->e:[B

    if-nez v1, :cond_0

    array-length v1, v2

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lat/j;->b([B[B)V

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

    invoke-virtual {p0, p1, p2}, Lat/j;->b([B[B)V

    return-void

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
