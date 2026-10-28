.class public final Lat/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/m;


# direct methods
.method public constructor <init>(La33/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, La33/d;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/crypto/tink/internal/w;->b:Lcom/google/crypto/tink/internal/w;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/w;->a()Lcom/google/crypto/tink/internal/v;

    move-result-object v0

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->i(La33/d;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public static a(Lcom/google/crypto/tink/internal/q;)Lat/n;
    .locals 2

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

    const-class v1, Lfs/m;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/m;

    new-instance v0, Lat/n;

    invoke-static {p0}, Lat/o;->c(Lcom/google/crypto/tink/internal/k0;)[B

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast p0, Lvs/h4;

    sget-object v1, Lvs/h4;->z:Lvs/h4;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static b(Lws/i;)Lat/n;
    .locals 3

    new-instance v0, Lat/n;

    iget-object v1, p0, Lws/i;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    invoke-virtual {p0}, Lws/i;->X()Lgs/b;

    move-result-object v2

    invoke-virtual {v2}, Lgs/b;->V()Lct/a;

    move-result-object v2

    invoke-virtual {v2}, Lct/a;->b()[B

    iget-object p0, p0, Lws/i;->b:Lws/k;

    iget-object p0, p0, Lws/k;->b:Lws/h;

    iget-object p0, p0, Lws/h;->a:Lws/g;

    sget-object v2, Lws/g;->d:Lws/g;

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 p0, 0x1

    invoke-static {p0}, Lih0/d0;->a(I)Z

    move-result p0

    if-eqz p0, :cond_1

    array-length p0, v1

    const/16 v2, 0x20

    if-ne p0, v2, :cond_0

    invoke-static {v1}, Lcom/google/crypto/tink/internal/a;->h([B)[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->p([B)[B

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Given private key\'s length is not 32"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use Ed25519 in FIPS-mode."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lws/y;)Lat/n;
    .locals 11

    sget-object v0, Lat/u;->g:Lat/u;

    const-string v1, "RSA"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    iget-object v10, p0, Lws/y;->b:Lws/z;

    iget-object v2, v10, Lws/z;->c:Ljava/math/BigInteger;

    iget-object v3, v10, Lws/z;->b:Lws/x;

    iget-object v3, v3, Lws/x;->b:Ljava/math/BigInteger;

    iget-object v4, p0, Lws/y;->c:Lro/i;

    iget-object v4, v4, Lro/i;->x:Ljava/lang/Object;

    check-cast v4, Ljava/math/BigInteger;

    iget-object v5, p0, Lws/y;->d:Lro/i;

    iget-object v5, v5, Lro/i;->x:Ljava/lang/Object;

    check-cast v5, Ljava/math/BigInteger;

    iget-object v6, p0, Lws/y;->e:Lro/i;

    iget-object v6, v6, Lro/i;->x:Ljava/lang/Object;

    check-cast v6, Ljava/math/BigInteger;

    iget-object v7, p0, Lws/y;->f:Lro/i;

    iget-object v7, v7, Lro/i;->x:Ljava/lang/Object;

    check-cast v7, Ljava/math/BigInteger;

    iget-object v8, p0, Lws/y;->g:Lro/i;

    iget-object v8, v8, Lro/i;->x:Ljava/lang/Object;

    check-cast v8, Ljava/math/BigInteger;

    iget-object v9, p0, Lws/y;->h:Lro/i;

    iget-object v9, v9, Lro/i;->x:Ljava/lang/Object;

    check-cast v9, Ljava/math/BigInteger;

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    iget-object v1, v10, Lws/z;->b:Lws/x;

    new-instance v2, Lat/n;

    sget-object v3, Lat/b0;->a:Lwe/o;

    iget-object v4, v1, Lws/x;->d:Lws/v;

    invoke-virtual {v3, v4}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v4

    check-cast v4, Lat/w;

    iget-object v5, v1, Lws/x;->e:Lws/v;

    invoke-virtual {v3, v5}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Lat/w;

    iget v1, v1, Lws/x;->f:I

    invoke-virtual {p0}, Lws/y;->X()Lgs/b;

    move-result-object p0

    invoke-virtual {p0}, Lgs/b;->V()Lct/a;

    move-result-object p0

    invoke-virtual {p0}, Lct/a;->b()[B

    iget-object p0, v10, Lws/z;->b:Lws/x;

    iget-object p0, p0, Lws/x;->c:Lws/w;

    sget-object v1, Lws/w;->d:Lws/w;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 p0, 0x2

    invoke-static {p0}, Lih0/d0;->b(I)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v4}, Lat/c0;->e(Lat/w;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    invoke-static {p0}, Lat/c0;->c(I)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lat/c0;->d(Ljava/math/BigInteger;)V

    sget-object p0, Lat/u;->g:Lat/u;

    const-string v1, "RSA"

    iget-object p0, p0, Lat/u;->a:Lat/t;

    invoke-virtual {p0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-direct {v1, v3, v0}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/RSAPublicKey;

    return-object v2

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
