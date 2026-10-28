.class public final Lns/n;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lns/p;

.field public final c:Lro/i;


# direct methods
.method public constructor <init>(Lns/p;Lro/i;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lns/n;->b:Lns/p;

    iput-object p2, p0, Lns/n;->c:Lro/i;

    return-void
.end method

.method public static Y(Lns/p;Lro/i;)Lns/n;
    .locals 9

    iget-object v0, p0, Lns/p;->b:Lns/m;

    iget-object v0, v0, Lns/m;->a:Lns/k;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Lro/i;->E()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Encoded private key byte length for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " must be %d, not "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lns/k;->G:Lns/k;

    sget-object v6, Lns/k;->F:Lns/k;

    sget-object v7, Lns/k;->E:Lns/k;

    sget-object v8, Lns/k;->z:Lns/k;

    if-ne v0, v8, :cond_1

    if-ne v3, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-ne v0, v7, :cond_3

    const/16 v1, 0x30

    if-ne v3, v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    if-ne v0, v6, :cond_5

    const/16 v1, 0x42

    if-ne v3, v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    if-ne v0, v5, :cond_10

    if-ne v3, v1, :cond_f

    :goto_0
    iget-object v1, p0, Lns/p;->c:Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    sget-object v2, Lfs/p;->a:Lfs/p;

    invoke-virtual {p1, v2}, Lro/i;->F(Lfs/p;)[B

    move-result-object v2

    const-string v3, "Invalid private key for public key."

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_9

    if-ne v0, v6, :cond_6

    goto :goto_1

    :cond_6
    if-ne v0, v5, :cond_8

    invoke-static {v2}, Lse/h;->R([B)[B

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to validate key pair for "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    :goto_1
    if-ne v0, v8, :cond_a

    invoke-static {}, Ls2/e;->E()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_2

    :cond_a
    if-ne v0, v7, :cond_b

    invoke-static {}, Ls2/e;->F()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    goto :goto_2

    :cond_b
    if-ne v0, v6, :cond_e

    invoke-static {}, Ls2/e;->G()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    :goto_2
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->signum()I

    move-result v5

    if-lez v5, :cond_d

    invoke-virtual {v2, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-gez v4, :cond_d

    invoke-static {v2, v0}, Lcom/google/crypto/tink/internal/e;->g(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {v0, v1}, Ls2/e;->V(Ljava/security/spec/EllipticCurve;[B)Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_3
    new-instance v0, Lns/n;

    invoke-direct {v0, p0, p1}, Lns/n;-><init>(Lns/p;Lro/i;)V

    return-object v0

    :cond_c
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Invalid private key."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to determine NIST curve params for "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_f
    new-instance p0, Ljava/security/GeneralSecurityException;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unable to validate private key length for "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final W()Lgs/b;
    .locals 1

    iget-object v0, p0, Lns/n;->b:Lns/p;

    return-object v0
.end method
