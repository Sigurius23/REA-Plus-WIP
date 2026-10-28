.class public final Lhw/f;
.super Ljw/h;
.source "SourceFile"

# interfaces
.implements Lgw/q;


# instance fields
.field public final e:Lhm/d;

.field public final f:Ljava/security/interfaces/RSAPublicKey;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;)V
    .locals 2

    sget-object v0, Ljw/h;->d:Ljava/util/Set;

    invoke-direct {p0, v0}, Lb3/b;-><init>(Ljava/util/Set;)V

    new-instance v0, Lhm/d;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lhm/d;-><init>(I)V

    iput-object v0, p0, Lhw/f;->e:Lhm/d;

    iput-object p1, p0, Lhw/f;->f:Ljava/security/interfaces/RSAPublicKey;

    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object p1, v0, Lhm/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Lgw/n;[BLxw/b;)Z
    .locals 12

    iget-object v0, p0, Lhw/f;->e:Lhm/d;

    invoke-virtual {v0, p1}, Lhm/d;->k(Lgw/c;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object p1, p1, Lgw/c;->w:Lgw/a;

    check-cast p1, Lgw/m;

    iget-object v0, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v0, Lla/b;

    iget-object v0, v0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/Provider;

    sget-object v2, Lgw/m;->F:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const-string v2, "SHA256withRSA"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object v2, Lgw/m;->G:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "SHA384withRSA"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    :cond_2
    sget-object v2, Lgw/m;->H:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "SHA512withRSA"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_3

    goto/16 :goto_1

    :cond_3
    sget-object v2, Lgw/m;->M:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "RSASSA-PSS"

    if-eqz v4, :cond_4

    new-instance v6, Ljava/security/spec/PSSParameterSpec;

    sget-object v9, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    const/16 v10, 0x20

    const/4 v11, 0x1

    const-string v7, "SHA-256"

    const-string v8, "MGF1"

    invoke-direct/range {v6 .. v11}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-static {v5, v0, v6}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_4

    :goto_0
    move-object v2, v4

    goto/16 :goto_1

    :cond_4
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "SHA256withRSA/PSS"

    invoke-static {v4, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string v2, "SHA256withRSAandMGF1"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_6

    goto/16 :goto_1

    :cond_6
    sget-object v2, Lgw/m;->N:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    new-instance v6, Ljava/security/spec/PSSParameterSpec;

    sget-object v9, Ljava/security/spec/MGF1ParameterSpec;->SHA384:Ljava/security/spec/MGF1ParameterSpec;

    const/16 v10, 0x30

    const/4 v11, 0x1

    const-string v7, "SHA-384"

    const-string v8, "MGF1"

    invoke-direct/range {v6 .. v11}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-static {v5, v0, v6}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const-string v4, "SHA384withRSA/PSS"

    invoke-static {v4, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "SHA384withRSAandMGF1"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_9

    goto :goto_1

    :cond_9
    sget-object v2, Lgw/m;->O:Lgw/m;

    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    new-instance v6, Ljava/security/spec/PSSParameterSpec;

    sget-object v9, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    const/16 v10, 0x40

    const/4 v11, 0x1

    const-string v7, "SHA-512"

    const-string v8, "MGF1"

    invoke-direct/range {v6 .. v11}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    invoke-static {v5, v0, v6}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_a

    goto :goto_0

    :cond_a
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    const-string v4, "SHA512withRSA/PSS"

    invoke-static {v4, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v4

    if-eqz v4, :cond_b

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1, v2}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-string v2, "SHA512withRSAandMGF1"

    invoke-static {v2, v0, v3}, Ljw/e;->h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;

    move-result-object v2

    if-eqz v2, :cond_c

    :goto_1
    :try_start_0
    iget-object p1, p0, Lhw/f;->f:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v2, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v2, p2}, Ljava/security/Signature;->update([B)V

    invoke-virtual {p3}, Lxw/a;->a()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_1
    .catch Ljava/security/SignatureException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :catch_0
    return v1

    :catch_1
    move-exception v0

    move-object p1, v0

    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Invalid public RSA key: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_c
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    sget-object p3, Ljw/h;->d:Ljava/util/Set;

    invoke-static {p1, p3}, Ljw/e;->m(Lgw/m;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2
.end method
