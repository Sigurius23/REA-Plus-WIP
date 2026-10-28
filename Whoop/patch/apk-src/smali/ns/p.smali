.class public final Lns/p;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lns/m;

.field public final c:Lct/a;

.field public final d:Lct/a;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lns/m;Lct/a;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lns/p;->b:Lns/m;

    iput-object p2, p0, Lns/p;->c:Lct/a;

    iput-object p3, p0, Lns/p;->d:Lct/a;

    iput-object p4, p0, Lns/p;->e:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lns/m;Lct/a;Ljava/lang/Integer;)Lns/p;
    .locals 9

    iget-object v0, p0, Lns/m;->d:Lns/l;

    sget-object v1, Lns/l;->d:Lns/l;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "\'idRequirement\' must be non-null for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " variant."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "\'idRequirement\' must be null for NO_PREFIX variant."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    iget-object v2, p0, Lns/m;->a:Lns/k;

    iget-object v3, p1, Lct/a;->a:[B

    array-length v3, v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Encoded public key byte length for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " must be %d, not "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lns/k;->F:Lns/k;

    sget-object v6, Lns/k;->E:Lns/k;

    sget-object v7, Lns/k;->z:Lns/k;

    if-ne v2, v7, :cond_5

    const/16 v8, 0x41

    if-ne v3, v8, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    if-ne v2, v6, :cond_7

    const/16 v8, 0x61

    if-ne v3, v8, :cond_6

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    if-ne v2, v5, :cond_9

    const/16 v8, 0x85

    if-ne v3, v8, :cond_8

    goto :goto_2

    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    sget-object v8, Lns/k;->G:Lns/k;

    if-ne v2, v8, :cond_14

    const/16 v8, 0x20

    if-ne v3, v8, :cond_13

    :goto_2
    if-eq v2, v7, :cond_a

    if-eq v2, v6, :cond_a

    if-ne v2, v5, :cond_d

    :cond_a
    if-ne v2, v7, :cond_b

    invoke-static {}, Ls2/e;->E()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v2

    goto :goto_3

    :cond_b
    if-ne v2, v6, :cond_c

    invoke-static {}, Ls2/e;->F()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v2

    goto :goto_3

    :cond_c
    if-ne v2, v5, :cond_12

    invoke-static {}, Ls2/e;->G()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v2

    :goto_3
    invoke-virtual {p1}, Lct/a;->b()[B

    move-result-object v3

    invoke-static {v2, v3}, Ls2/e;->V(Ljava/security/spec/EllipticCurve;[B)Ljava/security/spec/ECPoint;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    :cond_d
    if-ne v0, v1, :cond_e

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    goto :goto_4

    :cond_e
    if-eqz p2, :cond_11

    sget-object v1, Lns/l;->c:Lns/l;

    if-ne v0, v1, :cond_f

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_4

    :cond_f
    sget-object v1, Lns/l;->b:Lns/l;

    if-ne v0, v1, :cond_10

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    :goto_4
    new-instance v1, Lns/p;

    invoke-direct {v1, p0, p1, v0, p2}, Lns/p;-><init>(Lns/m;Lct/a;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unknown HpkeParameters.Variant: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "idRequirement must be non-null for HpkeParameters.Variant "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_12
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unable to determine NIST curve type for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unable to validate public key length for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final V()Lct/a;
    .locals 1

    iget-object v0, p0, Lns/p;->d:Lct/a;

    return-object v0
.end method

.method public final z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lns/p;->e:Ljava/lang/Integer;

    return-object v0
.end method
