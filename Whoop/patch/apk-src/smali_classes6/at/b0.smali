.class public final Lat/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/n;


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/w;->y:Lat/w;

    sget-object v2, Lws/v;->b:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->z:Lat/w;

    sget-object v2, Lws/v;->c:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/w;->E:Lat/w;

    sget-object v2, Lws/v;->d:Lws/v;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/b0;->a:Lwe/o;

    return-void
.end method

.method public static a(Lws/z;)Lat/b0;
    .locals 6

    sget-object v0, Lat/u;->g:Lat/u;

    const-string v1, "RSA"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    iget-object v2, p0, Lws/z;->c:Ljava/math/BigInteger;

    iget-object v3, p0, Lws/z;->b:Lws/x;

    iget-object v4, v3, Lws/x;->b:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v4}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPublicKey;

    new-instance v1, Lat/b0;

    iget-object v2, v3, Lws/x;->d:Lws/v;

    sget-object v4, Lat/b0;->a:Lwe/o;

    invoke-virtual {v4, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lat/w;

    iget-object v5, v3, Lws/x;->e:Lws/v;

    invoke-virtual {v4, v5}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v4

    check-cast v4, Lat/w;

    iget v4, v3, Lws/x;->f:I

    iget-object p0, p0, Lws/z;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    iget-object p0, v3, Lws/x;->c:Lws/w;

    sget-object v3, Lws/w;->d:Lws/w;

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 p0, 0x2

    invoke-static {p0}, Lih0/d0;->b(I)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v2}, Lat/c0;->e(Lat/w;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    invoke-static {p0}, Lat/c0;->c(I)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lat/c0;->d(Ljava/math/BigInteger;)V

    return-object v1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
