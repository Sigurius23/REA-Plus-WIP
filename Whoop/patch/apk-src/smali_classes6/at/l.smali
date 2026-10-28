.class public final Lat/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/e;


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/p;->w:Lat/p;

    sget-object v2, Lns/b;->b:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/p;->x:Lat/p;

    sget-object v2, Lns/b;->c:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/p;->y:Lat/p;

    sget-object v2, Lns/b;->d:Lns/b;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/l;->a:Lwe/o;

    invoke-static {}, Lwe/o;->j()Lcom/google/crypto/tink/internal/f;

    move-result-object v0

    sget-object v1, Lat/r;->w:Lat/r;

    sget-object v2, Lns/d;->c:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/r;->x:Lat/r;

    sget-object v2, Lns/d;->b:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    sget-object v1, Lat/r;->y:Lat/r;

    sget-object v2, Lns/d;->d:Lns/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/crypto/tink/internal/f;->a(Ljava/lang/Enum;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/f;->b()Lwe/o;

    move-result-object v0

    sput-object v0, Lat/l;->b:Lwe/o;

    return-void
.end method

.method public static a(Lns/h;)Lat/l;
    .locals 5

    iget-object v0, p0, Lns/h;->b:Lns/f;

    iget-object v1, v0, Lns/f;->a:Lns/b;

    sget-object v2, Lat/l;->a:Lwe/o;

    invoke-virtual {v2, v1}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lat/p;

    iget-object v2, p0, Lns/h;->c:Ljava/security/spec/ECPoint;

    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v3

    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    invoke-static {v1, v3, v2}, Ls2/e;->B(Lat/p;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    iget-object v2, v0, Lns/f;->f:Lct/a;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lct/a;->b()[B

    :cond_0
    new-instance v2, Lat/l;

    iget-object v3, v0, Lns/f;->b:Lns/c;

    invoke-static {v3}, Lat/l;->c(Lns/c;)V

    sget-object v3, Lat/l;->b:Lwe/o;

    iget-object v4, v0, Lns/f;->c:Lns/d;

    invoke-virtual {v3, v4}, Lwe/o;->U(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v3

    check-cast v3, Lat/r;

    iget-object v0, v0, Lns/f;->e:Lfs/k;

    invoke-static {v0}, Lat/l;->b(Lfs/k;)V

    iget-object p0, p0, Lns/h;->e:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    return-object v2
.end method

.method public static b(Lfs/k;)V
    .locals 3

    instance-of v0, p0, Lgs/q;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p0, Lgs/k;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    instance-of v0, p0, Lls/d;

    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported parameters for Ecies: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Lns/c;)V
    .locals 3

    sget-object v0, Lns/c;->b:Lns/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lns/c;->c:Lns/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    sget-object v0, Lns/c;->d:Lns/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    sget-object v0, Lns/c;->e:Lns/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    sget-object v0, Lns/c;->f:Lns/c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hash unsupported for EciesAeadHkdf: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
