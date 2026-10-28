.class public final synthetic Lcom/google/crypto/tink/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lcom/google/crypto/tink/internal/s;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfs/k;)Lts/o;
    .locals 7

    iget v0, p0, Lcom/google/crypto/tink/internal/s;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lys/g;

    iget-object v0, p1, Lys/g;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lro/i;->A(I)Lro/i;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Lro/i;->E()I

    move-result v2

    if-ne v0, v2, :cond_0

    new-instance v0, Lys/e;

    invoke-direct {v0, p1, v1}, Lys/e;-><init>(Lys/g;Lro/i;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast p1, Lys/d;

    iget-object v0, p1, Lys/d;->a:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lro/i;->A(I)Lro/i;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Lro/i;->E()I

    move-result v2

    if-ne v0, v2, :cond_1

    new-instance v0, Lys/a;

    invoke-direct {v0, p1, v1}, Lys/a;-><init>(Lys/d;Lro/i;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    check-cast p1, Lws/x;

    sget-object v0, Lat/u;->f:Lat/u;

    invoke-virtual {v0}, Lat/u;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    new-instance v1, Ljava/security/spec/RSAKeyGenParameterSpec;

    iget v2, p1, Lws/x;->a:I

    new-instance v3, Ljava/math/BigInteger;

    iget-object v4, p1, Lws/x;->b:Ljava/math/BigInteger;

    invoke-virtual {v4}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    new-instance v2, Lq30/w0;

    const/16 v3, 0x18

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, p1}, Lq30/w0;->J(Lws/x;)V

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v2, p1}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lq30/w0;->l()Lws/z;

    move-result-object p1

    new-instance v1, Lm63/d;

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lm63/d;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lm63/d;->u(Lws/z;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeQ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->o(Lro/i;Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->r(Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentQ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->k(Lro/i;Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->j(Lro/i;)V

    invoke-virtual {v1}, Lm63/d;->c()Lws/y;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lws/q;

    sget-object v0, Lat/u;->f:Lat/u;

    invoke-virtual {v0}, Lat/u;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    new-instance v1, Ljava/security/spec/RSAKeyGenParameterSpec;

    iget v2, p1, Lws/q;->a:I

    new-instance v3, Ljava/math/BigInteger;

    iget-object v4, p1, Lws/q;->b:Ljava/math/BigInteger;

    invoke-virtual {v4}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    new-instance v2, Lq30/w0;

    const/16 v3, 0x17

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, p1}, Lq30/w0;->I(Lws/q;)V

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v2, p1}, Lq30/w0;->E(Ljava/math/BigInteger;)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v2}, Lq30/w0;->k()Lws/s;

    move-result-object p1

    new-instance v1, Lm63/d;

    const/16 v2, 0xb

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lm63/d;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lm63/d;->t(Lws/s;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeQ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->o(Lro/i;Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->r(Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentQ()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lm63/d;->k(Lro/i;Lro/i;)V

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm63/d;->j(Lro/i;)V

    invoke-virtual {v1}, Lm63/d;->a()Lws/r;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lws/h;

    invoke-static {}, Lat/m;->f()Lat/m;

    move-result-object v0

    iget-object p1, p1, Lws/h;->a:Lws/g;

    invoke-virtual {v0}, Lat/m;->e()[B

    move-result-object v1

    invoke-static {v1}, Lct/a;->a([B)Lct/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lws/k;->Y(Lws/g;Lct/a;Ljava/lang/Integer;)Lws/k;

    move-result-object p1

    invoke-virtual {v0}, Lat/m;->d()[B

    move-result-object v0

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-static {v0, v1}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lws/i;->Y(Lws/k;Lro/i;)Lws/i;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lws/c;

    iget-object v0, p1, Lws/c;->b:Lws/a;

    iget-object v0, v0, Lws/a;->b:Ljava/security/spec/ECParameterSpec;

    invoke-static {v0}, Ls2/e;->w(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    new-instance v2, Lq30/w0;

    const/16 v3, 0x16

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v2, p1}, Lq30/w0;->H(Lws/c;)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p1

    invoke-virtual {v2, p1}, Lq30/w0;->K(Ljava/security/spec/ECPoint;)V

    invoke-virtual {v2}, Lq30/w0;->j()Lws/e;

    move-result-object p1

    new-instance v1, Lpg3/p;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lpg3/p;-><init>(I)V

    invoke-virtual {v1, p1}, Lpg3/p;->k(Lws/e;)V

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lpg3/p;->j(Lro/i;)V

    invoke-virtual {v1}, Lpg3/p;->e()Lws/d;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lts/k;

    new-instance v0, Lt9/u;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt9/u;-><init>(I)V

    invoke-virtual {v0, p1}, Lt9/u;->g(Lts/k;)V

    iget p1, p1, Lts/k;->a:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt9/u;->e(Lro/i;)V

    invoke-virtual {v0}, Lt9/u;->a()Lts/i;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lts/h;

    invoke-static {p1}, Lts/f;->a(Lts/h;)V

    new-instance v0, Lso/q;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lso/q;-><init>(I)V

    invoke-virtual {v0, p1}, Lso/q;->h(Lts/h;)V

    iget p1, p1, Lts/h;->a:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lso/q;->f(Lro/i;)V

    invoke-virtual {v0}, Lso/q;->b()Lts/e;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lts/d;

    iget v0, p1, Lts/d;->a:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object v1

    invoke-virtual {v1}, Lro/i;->E()I

    move-result v2

    if-ne v0, v2, :cond_2

    new-instance v0, Lts/a;

    invoke-direct {v0, p1, v1}, Lts/a;-><init>(Lts/d;Lro/i;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size mismatch"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_8
    check-cast p1, Lqs/l;

    new-instance v0, Lq30/w0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v0, p1}, Lq30/w0;->G(Lqs/l;)V

    iget p1, p1, Lqs/l;->a:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq30/w0;->D(Lro/i;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v0}, Lq30/w0;->h()Lqs/h;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lqs/d;

    iget v0, p1, Lqs/d;->a:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    new-instance v1, Lq30/w0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lq30/w0;-><init>(IZ)V

    invoke-virtual {v1, p1}, Lq30/w0;->F(Lqs/d;)V

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lq30/w0;->B(Lro/i;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lq30/w0;->C(Ljava/lang/Integer;)V

    invoke-virtual {v1}, Lq30/w0;->g()Lqs/a;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_a
    check-cast p1, Lns/m;

    iget-object v0, p1, Lns/m;->a:Lns/k;

    sget-object v1, Lns/k;->G:Lns/k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    sget-object v2, Lfs/p;->a:Lfs/p;

    if-eqz v1, :cond_5

    invoke-static {}, Lse/h;->D()[B

    move-result-object v0

    invoke-static {v0, v2}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v1

    invoke-static {v0}, Lse/h;->R([B)[B

    move-result-object v0

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    move-result-object v0

    goto :goto_1

    :cond_5
    sget-object v1, Lns/k;->z:Lns/k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lns/k;->E:Lns/k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    sget-object v1, Lns/k;->F:Lns/k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_0

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Unknown KEM ID"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_0
    invoke-static {v0}, Los/d;->d(Lns/k;)Lat/p;

    move-result-object v1

    invoke-static {v1}, Ls2/e;->v(Lat/p;)Ljava/security/KeyPair;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v4

    check-cast v4, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v4}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v4

    invoke-static {v1, v4}, Ls2/e;->W(Lat/p;Ljava/security/spec/ECPoint;)[B

    move-result-object v1

    invoke-static {v1}, Lct/a;->a([B)Lct/a;

    move-result-object v1

    invoke-virtual {v3}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v3

    check-cast v3, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v3}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v0}, Los/d;->a(Lns/k;)I

    move-result v0

    invoke-static {v0, v3}, Lcom/google/crypto/tink/internal/a;->w(ILjava/math/BigInteger;)[B

    move-result-object v0

    invoke-static {v0, v2}, Lro/i;->r([BLfs/p;)Lro/i;

    move-result-object v0

    move-object v6, v1

    move-object v1, v0

    move-object v0, v6

    :goto_1
    const/4 v2, 0x0

    invoke-static {p1, v0, v2}, Lns/p;->Y(Lns/m;Lct/a;Ljava/lang/Integer;)Lns/p;

    move-result-object p1

    invoke-static {p1, v1}, Lns/n;->Y(Lns/p;Lro/i;)Lns/n;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lns/f;

    iget-object v0, p1, Lns/f;->a:Lns/b;

    sget-object v1, Lns/b;->b:Lns/b;

    if-ne v0, v1, :cond_8

    sget-object v0, Lcom/google/crypto/tink/internal/e;->a:Ljava/security/spec/ECParameterSpec;

    goto :goto_2

    :cond_8
    sget-object v1, Lns/b;->c:Lns/b;

    if-ne v0, v1, :cond_9

    sget-object v0, Lcom/google/crypto/tink/internal/e;->b:Ljava/security/spec/ECParameterSpec;

    goto :goto_2

    :cond_9
    sget-object v1, Lns/b;->d:Lns/b;

    if-ne v0, v1, :cond_a

    sget-object v0, Lcom/google/crypto/tink/internal/e;->c:Ljava/security/spec/ECParameterSpec;

    :goto_2
    invoke-static {v0}, Ls2/e;->w(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lns/h;->Z(Lns/f;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)Lns/h;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lro/i;->s(Ljava/math/BigInteger;)Lro/i;

    move-result-object v0

    invoke-static {p1, v0}, Lns/g;->Z(Lns/h;Lro/i;)Lns/g;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported curve type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_c
    check-cast p1, Lls/d;

    invoke-static {p1}, Lls/b;->a(Lls/d;)V

    new-instance v0, Lgm/r;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lgm/r;-><init>(I)V

    invoke-virtual {v0, p1}, Lgm/r;->U(Lls/d;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lgm/r;->P(Ljava/lang/Integer;)V

    iget p1, p1, Lls/d;->a:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgm/r;->Q(Lro/i;)V

    invoke-virtual {v0}, Lgm/r;->z()Lls/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lgs/k0;

    iget-object p1, p1, Lgs/k0;->a:Lgs/j;

    const/16 v0, 0x20

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lgs/i0;->Y(Lgs/j;Lro/i;Ljava/lang/Integer;)Lgs/i0;

    move-result-object p1

    return-object p1

    :pswitch_e
    const/4 v0, 0x0

    check-cast p1, Lgs/f0;

    invoke-static {p1, v0}, Lgs/e0;->Y(Lgs/f0;Ljava/lang/Integer;)Lgs/e0;

    move-result-object p1

    return-object p1

    :pswitch_f
    const/4 v0, 0x0

    check-cast p1, Lgs/c0;

    invoke-static {p1, v0}, Lgs/a0;->Y(Lgs/c0;Ljava/lang/Integer;)Lgs/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lgs/w;

    iget-object p1, p1, Lgs/w;->a:Lgs/j;

    const/16 v0, 0x20

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lgs/u;->Y(Lgs/j;Lro/i;Ljava/lang/Integer;)Lgs/u;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lgs/t;

    new-instance v0, Lgm/r;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lgm/r;-><init>(I)V

    invoke-virtual {v0, p1}, Lgm/r;->T(Lgs/t;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lgm/r;->P(Ljava/lang/Integer;)V

    iget p1, p1, Lgs/t;->a:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgm/r;->Q(Lro/i;)V

    invoke-virtual {v0}, Lgm/r;->y()Lgs/r;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lgs/q;

    iget v0, p1, Lgs/q;->a:I

    const/16 v1, 0x18

    if-eq v0, v1, :cond_b

    new-instance v1, Lgm/r;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lgm/r;-><init>(I)V

    invoke-virtual {v1, p1}, Lgm/r;->S(Lgs/q;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgm/r;->Q(Lro/i;)V

    invoke-virtual {v1}, Lgm/r;->x()Lgs/o;

    move-result-object p1

    return-object p1

    :cond_b
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    check-cast p1, Lgs/n;

    iget v0, p1, Lgs/n;->a:I

    const/16 v1, 0x18

    if-eq v0, v1, :cond_c

    new-instance v1, Lgm/r;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lgm/r;-><init>(I)V

    invoke-virtual {v1, p1}, Lgm/r;->R(Lgs/n;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lgm/r;->P(Ljava/lang/Integer;)V

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgm/r;->Q(Lro/i;)V

    invoke-virtual {v1}, Lgm/r;->w()Lgs/l;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "192 bit AES GCM Parameters are not valid"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_14
    check-cast p1, Lgs/k;

    iget v0, p1, Lgs/k;->a:I

    const/16 v1, 0x10

    if-eq v0, v1, :cond_e

    const/16 v1, 0x20

    if-ne v0, v1, :cond_d

    goto :goto_3

    :cond_d
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "AES key size must be 16 or 32 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_3
    new-instance v1, La00/g;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, La00/g;-><init>(I)V

    invoke-virtual {v1, p1}, La00/g;->K(Lgs/k;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, La00/g;->I(Ljava/lang/Integer;)V

    invoke-static {v0}, Lro/i;->A(I)Lro/i;

    move-result-object v0

    invoke-virtual {v1, v0}, La00/g;->D(Lro/i;)V

    iget p1, p1, Lgs/k;->b:I

    invoke-static {p1}, Lro/i;->A(I)Lro/i;

    move-result-object p1

    invoke-virtual {v1, p1}, La00/g;->H(Lro/i;)V

    invoke-virtual {v1}, La00/g;->f()Lgs/g;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/google/crypto/tink/internal/r;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/r;->a:Lcom/google/crypto/tink/internal/l0;

    iget-object p1, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lvs/p3;

    sget-object v0, Lcom/google/crypto/tink/internal/j;->d:Lcom/google/crypto/tink/internal/j;

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/j;->a(Ljava/lang/String;)Lcom/google/crypto/tink/internal/p;

    move-result-object v1

    invoke-virtual {p1}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v2

    iget-object v0, v0, Lcom/google/crypto/tink/internal/j;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Lvs/p3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/p;->b(Lcom/google/crypto/tink/shaded/protobuf/i;)Lvs/m3;

    move-result-object v0

    invoke-virtual {v0}, Lvs/m3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lvs/m3;->F()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v0}, Lvs/m3;->D()Lvs/l3;

    move-result-object v0

    invoke-virtual {p1}, Lvs/p3;->D()Lvs/h4;

    move-result-object p1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, p1, v3}, Lcom/google/crypto/tink/internal/k0;->m(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/i;Lvs/l3;Lvs/h4;Ljava/lang/Integer;)Lcom/google/crypto/tink/internal/k0;

    move-result-object p1

    new-instance v0, Lcom/google/crypto/tink/internal/q;

    invoke-direct {v0, p1}, Lcom/google/crypto/tink/internal/q;-><init>(Lcom/google/crypto/tink/internal/k0;)V

    return-object v0

    :cond_f
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Creating new keys is not allowed."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
