.class public final Lhw/e;
.super Ljw/g;
.source "SourceFile"

# interfaces
.implements Lgw/j;


# instance fields
.field public final g:Ljava/security/interfaces/RSAPublicKey;

.field public final h:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;)V
    .locals 4

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    sget-object v1, Ljw/g;->f:Ljava/util/Set;

    sget-object v2, Ljw/b;->a:Ljava/util/Set;

    const/4 v3, 0x0

    invoke-direct {p0, v1, v2, v3}, Ljw/a;-><init>(Ljava/util/Set;Ljava/util/Set;Ljavax/crypto/SecretKey;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lhw/e;->g:Ljava/security/interfaces/RSAPublicKey;

    iput-object v0, p0, Lhw/e;->h:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a(Lgw/k;[B[B)Lb30/m;
    .locals 8

    iget-object v0, p1, Lgw/c;->w:Lgw/a;

    check-cast v0, Lgw/i;

    if-eqz v0, :cond_8

    iget-object v1, p1, Lgw/k;->O:Lgw/f;

    invoke-virtual {p0, v1}, Ljw/a;->b(Lgw/f;)Ljavax/crypto/SecretKey;

    move-result-object v5

    sget-object v1, Lgw/i;->y:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v7, p0, Ljw/a;->c:Lmw/a;

    iget-object v2, p0, Lhw/e;->g:Ljava/security/interfaces/RSAPublicKey;

    if-eqz v1, :cond_1

    iget-object v0, v7, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/Provider;

    :try_start_0
    const-string v1, "RSA/ECB/PKCS1Padding"

    if-nez v0, :cond_0

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v1, v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v0

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    :goto_1
    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, v0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :goto_2
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Couldn\'t encrypt Content Encryption Key (CEK): "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_3
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    const-string p3, "RSA block size exception: The RSA key is too short, use a longer one"

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    sget-object v1, Lgw/i;->z:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lhw/e;->c()Lkw/a;

    move-result-object v0

    iget-object v1, v7, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/security/Provider;

    :try_start_1
    const-string v3, "RSA/ECB/OAEPWithSHA-1AndMGF1Padding"

    if-nez v1, :cond_2

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    goto :goto_4

    :cond_2
    invoke-static {v3, v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v1

    :goto_4
    iget v3, v0, Lkw/a;->a:I

    new-instance v4, Ljava/security/SecureRandom;

    invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, v3, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V

    sget-object v2, Lkw/a;->c:Lkw/a;

    if-ne v0, v2, :cond_3

    invoke-virtual {v1, v5}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B

    move-result-object v0

    goto :goto_5

    :catch_2
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :catch_3
    move-exception v0

    move-object p1, v0

    goto :goto_7

    :cond_3
    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :goto_5
    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    goto :goto_1

    :goto_6
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_7
    new-instance p2, Lcom/nimbusds/jose/JOSEException;

    const-string p3, "RSA block size exception: The RSA key is too short, try a longer one"

    invoke-direct {p2, p3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    sget-object v1, Lgw/i;->E:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lhw/e;->c()Lkw/a;

    move-result-object v0

    iget-object v1, v7, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/security/Provider;

    const/16 v3, 0x100

    invoke-static {v2, v5, v3, v0, v1}, Ljw/e;->d(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILkw/a;Ljava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    goto/16 :goto_1

    :cond_5
    sget-object v1, Lgw/i;->F:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Lhw/e;->c()Lkw/a;

    move-result-object v0

    iget-object v1, v7, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/security/Provider;

    const/16 v3, 0x180

    invoke-static {v2, v5, v3, v0, v1}, Ljw/e;->d(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILkw/a;Ljava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    goto/16 :goto_1

    :cond_6
    sget-object v1, Lgw/i;->G:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lhw/e;->c()Lkw/a;

    move-result-object v0

    iget-object v1, v7, Lla/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/security/Provider;

    const/16 v3, 0x200

    invoke-static {v2, v5, v3, v0, v1}, Ljw/e;->d(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILkw/a;Ljava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    goto/16 :goto_1

    :goto_8
    invoke-static/range {v2 .. v7}, Ljw/b;->c(Lgw/k;[B[BLjavax/crypto/SecretKey;Lxw/b;Lmw/a;)Lb30/m;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Ljw/g;->f:Ljava/util/Set;

    invoke-static {v0, p2}, Ljw/e;->l(Lgw/i;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "The algorithm \"alg\" header parameter must not be null"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lkw/a;
    .locals 2

    iget-object v0, p0, Lhw/e;->h:Ljava/util/Set;

    sget-object v1, Lkw/a;->d:Lkw/a;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lkw/a;->c:Lkw/a;

    return-object v0
.end method
