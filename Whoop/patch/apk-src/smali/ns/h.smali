.class public final Lns/h;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lns/f;

.field public final c:Ljava/security/spec/ECPoint;

.field public final d:Lct/a;

.field public final e:Lct/a;

.field public final f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lns/f;Ljava/security/spec/ECPoint;Lct/a;Lct/a;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lns/h;->b:Lns/f;

    iput-object p2, p0, Lns/h;->c:Ljava/security/spec/ECPoint;

    iput-object p3, p0, Lns/h;->d:Lct/a;

    iput-object p4, p0, Lns/h;->e:Lct/a;

    iput-object p5, p0, Lns/h;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static Y(Lns/f;Lct/a;Ljava/lang/Integer;)Lns/h;
    .locals 9

    iget-object v0, p0, Lns/f;->a:Lns/b;

    iget-object v1, p0, Lns/f;->d:Lns/e;

    sget-object v2, Lns/b;->e:Lns/b;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1, p2}, Lns/h;->b0(Lns/e;Ljava/lang/Integer;)V

    iget-object v0, p1, Lct/a;->a:[B

    array-length v0, v0

    const/16 v2, 0x20

    if-ne v0, v2, :cond_0

    invoke-static {v1, p2}, Lns/h;->a0(Lns/e;Ljava/lang/Integer;)Lct/a;

    move-result-object v7

    new-instance v3, Lns/h;

    const/4 v5, 0x0

    move-object v4, p0

    move-object v6, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lns/h;-><init>(Lns/f;Ljava/security/spec/ECPoint;Lct/a;Lct/a;Ljava/lang/Integer;)V

    return-object v3

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Encoded public point byte length for X25519 curve must be 32"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "createForCurveX25519 may only be called with parameters for curve X25519"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Z(Lns/f;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)Lns/h;
    .locals 8

    iget-object v0, p0, Lns/f;->a:Lns/b;

    iget-object v1, p0, Lns/f;->d:Lns/e;

    sget-object v2, Lns/b;->e:Lns/b;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v1, p2}, Lns/h;->b0(Lns/e;Ljava/lang/Integer;)V

    sget-object v2, Lns/b;->b:Lns/b;

    if-ne v0, v2, :cond_0

    invoke-static {}, Ls2/e;->E()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v2, Lns/b;->c:Lns/b;

    if-ne v0, v2, :cond_1

    invoke-static {}, Ls2/e;->F()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v2, Lns/b;->d:Lns/b;

    if-ne v0, v2, :cond_2

    invoke-static {}, Ls2/e;->G()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    invoke-static {v1, p2}, Lns/h;->a0(Lns/e;Ljava/lang/Integer;)Lct/a;

    move-result-object v6

    new-instance v2, Lns/h;

    const/4 v5, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lns/h;-><init>(Lns/f;Ljava/security/spec/ECPoint;Lct/a;Lct/a;Ljava/lang/Integer;)V

    return-object v2

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unable to determine NIST curve type for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "createForNistCurve may only be called with parameters for NIST curve"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a0(Lns/e;Ljava/lang/Integer;)Lct/a;
    .locals 2

    sget-object v0, Lns/e;->d:Lns/e;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    return-object p0

    :cond_0
    if-eqz p1, :cond_3

    sget-object v0, Lns/e;->c:Lns/e;

    if-ne p0, v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lns/e;->b:Lns/e;

    if-ne p0, v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown EciesParameters.Variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "idRequirement must be non-null for EciesParameters.Variant: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b0(Lns/e;Ljava/lang/Integer;)V
    .locals 2

    sget-object v0, Lns/e;->d:Lns/e;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'idRequirement\' must be non-null for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " variant."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "\'idRequirement\' must be null for NO_PREFIX variant."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final V()Lct/a;
    .locals 1

    iget-object v0, p0, Lns/h;->e:Lct/a;

    return-object v0
.end method

.method public final z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lns/h;->f:Ljava/lang/Integer;

    return-object v0
.end method
