.class public final Lns/g;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lns/h;

.field public final c:Lro/i;

.field public final d:Lro/i;


# direct methods
.method public constructor <init>(Lns/h;Lro/i;Lro/i;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lns/g;->b:Lns/h;

    iput-object p2, p0, Lns/g;->c:Lro/i;

    iput-object p3, p0, Lns/g;->d:Lro/i;

    return-void
.end method

.method public static Y(Lns/h;Lro/i;)Lns/g;
    .locals 4

    iget-object v0, p0, Lns/h;->d:Lct/a;

    if-eqz v0, :cond_2

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->F(Lfs/p;)[B

    move-result-object v1

    invoke-virtual {v0}, Lct/a;->b()[B

    move-result-object v0

    array-length v2, v1

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1

    invoke-static {v1}, Lse/h;->R([B)[B

    move-result-object v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lns/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lns/g;-><init>(Lns/h;Lro/i;Lro/i;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Invalid private key for public key."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Private key bytes length for X25519 curve must be 32"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "ECIES private key for X25519 curve cannot be constructed with NIST-curve public key"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Z(Lns/h;Lro/i;)Lns/g;
    .locals 6

    iget-object v0, p0, Lns/h;->c:Ljava/security/spec/ECPoint;

    if-eqz v0, :cond_2

    sget-object v1, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v1}, Lro/i;->u(Lfs/p;)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lns/h;->b:Lns/f;

    iget-object v2, v2, Lns/f;->a:Lns/b;

    invoke-static {v2}, Lns/g;->a0(Lns/b;)Ljava/security/spec/ECParameterSpec;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v1}, Ljava/math/BigInteger;->signum()I

    move-result v4

    const-string v5, "Invalid private value"

    if-lez v4, :cond_1

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_1

    invoke-static {v2}, Lns/g;->a0(Lns/b;)Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/crypto/tink/internal/e;->g(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lns/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lns/g;-><init>(Lns/h;Lro/i;Lro/i;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "ECIES private key for NIST curve cannot be constructed with X25519-curve public key"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a0(Lns/b;)Ljava/security/spec/ECParameterSpec;
    .locals 3

    sget-object v0, Lns/b;->b:Lns/b;

    if-ne p0, v0, :cond_0

    invoke-static {}, Ls2/e;->E()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lns/b;->c:Lns/b;

    if-ne p0, v0, :cond_1

    invoke-static {}, Ls2/e;->F()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lns/b;->d:Lns/b;

    if-ne p0, v0, :cond_2

    invoke-static {}, Ls2/e;->G()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to determine NIST curve type for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final W()Lgs/b;
    .locals 1

    iget-object v0, p0, Lns/g;->b:Lns/h;

    return-object v0
.end method
