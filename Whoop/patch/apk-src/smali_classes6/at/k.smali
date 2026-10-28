.class public final Lat/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/d;


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

.method public static a(Lcom/google/crypto/tink/internal/q;)Lat/k;
    .locals 4

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

    const-class v1, Lfs/d;

    invoke-static {v0, v1}, Lfs/o;->a(Lvs/m3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfs/d;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    check-cast v0, Lvs/h4;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_3

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unknown output prefix type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object p0, p0, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    :cond_3
    :goto_1
    new-instance p0, Lat/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-object p0
.end method

.method public static b(Lns/g;)Lat/k;
    .locals 4

    sget-object v0, Lat/l;->a:Lwe/o;

    iget-object v1, p0, Lns/g;->b:Lns/h;

    iget-object v2, v1, Lns/h;->b:Lns/f;

    iget-object v2, v2, Lns/f;->a:Lns/b;

    invoke-virtual {v0, v2}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lat/p;

    iget-object v2, p0, Lns/g;->c:Lro/i;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/math/BigInteger;

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->v(Ljava/math/BigInteger;)[B

    move-result-object v2

    invoke-static {v0, v2}, Ls2/e;->A(Lat/p;[B)Ljava/security/interfaces/ECPrivateKey;

    iget-object v0, v1, Lns/h;->b:Lns/f;

    iget-object v1, v0, Lns/f;->f:Lct/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lct/a;->b()[B

    :cond_0
    new-instance v1, Lat/k;

    iget-object v2, v0, Lns/f;->b:Lns/c;

    invoke-static {v2}, Lat/l;->c(Lns/c;)V

    sget-object v2, Lat/l;->b:Lwe/o;

    iget-object v3, v0, Lns/f;->c:Lns/d;

    invoke-virtual {v2, v3}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lat/r;

    iget-object v0, v0, Lns/f;->e:Lfs/k;

    invoke-static {v0}, Lat/l;->b(Lfs/k;)V

    invoke-virtual {p0}, Lns/g;->W()Lgs/b;

    move-result-object p0

    invoke-virtual {p0}, Lgs/b;->V()Lct/a;

    move-result-object p0

    invoke-virtual {p0}, Lct/a;->b()[B

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    return-object v1
.end method

.method public static c(Lns/n;)Lat/k;
    .locals 8

    iget-object v0, p0, Lns/n;->b:Lns/p;

    iget-object v1, v0, Lns/p;->b:Lns/m;

    iget-object v2, v1, Lns/m;->a:Lns/k;

    invoke-static {v2}, Lns/s;->e(Lns/k;)V

    iget-object v3, v1, Lns/m;->b:Lns/j;

    invoke-static {v3}, Lns/s;->d(Lns/j;)V

    iget-object v1, v1, Lns/m;->c:Lns/i;

    invoke-static {v1}, Lns/s;->c(Lns/i;)V

    sget-object v1, Lns/k;->G:Lns/k;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "Unrecognized HPKE KEM identifier"

    sget-object v5, Lns/k;->F:Lns/k;

    sget-object v6, Lns/k;->E:Lns/k;

    sget-object v7, Lns/k;->z:Lns/k;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    :goto_0
    iget-object v2, p0, Lns/n;->c:Lro/i;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Lct/a;

    iget-object v3, v0, Lns/p;->b:Lns/m;

    iget-object v3, v3, Lns/m;->a:Lns/k;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v2}, Lct/a;->b()[B

    move-result-object v0

    invoke-static {v0}, Lse/h;->R([B)[B

    move-result-object v1

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    invoke-static {v1}, Lct/a;->a([B)Lct/a;

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_1
    invoke-virtual {v2}, Lct/a;->b()[B

    move-result-object v1

    iget-object v0, v0, Lns/p;->c:Lct/a;

    invoke-virtual {v0}, Lct/a;->b()[B

    move-result-object v0

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lat/p;->w:Lat/p;

    goto :goto_2

    :cond_6
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lat/p;->x:Lat/p;

    goto :goto_2

    :cond_7
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v2, Lat/p;->y:Lat/p;

    :goto_2
    invoke-static {v2}, Ls2/e;->z(Lat/p;)Ljava/security/spec/ECParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-static {v4, v0}, Ls2/e;->V(Ljava/security/spec/EllipticCurve;[B)Ljava/security/spec/ECPoint;

    move-result-object v4

    new-instance v5, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v5, v4, v3}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    sget-object v3, Lat/u;->g:Lat/u;

    const-string v4, "EC"

    iget-object v3, v3, Lat/u;->a:Lat/t;

    invoke-virtual {v3, v4}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/KeyFactory;

    invoke-virtual {v3, v5}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v3

    check-cast v3, Ljava/security/interfaces/ECPublicKey;

    invoke-static {v2, v1}, Ls2/e;->A(Lat/p;[B)Ljava/security/interfaces/ECPrivateKey;

    move-result-object v2

    :try_start_0
    invoke-interface {v3}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v4

    invoke-interface {v2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/google/crypto/tink/internal/e;->f(Ljava/security/spec/ECParameterSpec;Ljava/security/spec/ECParameterSpec;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v3

    invoke-interface {v2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v2

    invoke-static {v3, v2}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    invoke-static {v1}, Lct/a;->a([B)Lct/a;

    invoke-static {v0}, Lct/a;->a([B)Lct/a;

    :goto_3
    new-instance v0, Lat/k;

    invoke-virtual {p0}, Lns/n;->W()Lgs/b;

    move-result-object p0

    invoke-virtual {p0}, Lgs/b;->V()Lct/a;

    move-result-object p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lct/a;->b()[B

    return-object v0

    :cond_8
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid public key spec"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized NIST HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
