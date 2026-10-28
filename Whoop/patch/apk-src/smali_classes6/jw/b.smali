.class public abstract Ljw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lgw/f;->z:Lgw/f;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v2, Lgw/f;->E:Lgw/f;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v3, Lgw/f;->F:Lgw/f;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v4, Lgw/f;->I:Lgw/f;

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v5, Lgw/f;->J:Lgw/f;

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v6, Lgw/f;->K:Lgw/f;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v7, Lgw/f;->G:Lgw/f;

    invoke-interface {v0, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v8, Lgw/f;->H:Lgw/f;

    invoke-interface {v0, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v9, Lgw/f;->L:Lgw/f;

    invoke-interface {v0, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljw/b;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v10, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/16 v1, 0x80

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x100

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v12}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x180

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v13}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x200

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v14}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ljw/b;->b:Ljava/util/Map;

    return-void
.end method

.method public static a(Ljavax/crypto/SecretKey;Lgw/f;)V
    .locals 4

    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    array-length p0, p0
    :try_end_0
    .catch Lcom/nimbusds/jose/util/IntegerOverflowException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, p0

    const-wide/16 v2, 0x8

    mul-long/2addr v0, v2

    long-to-int p0, v0

    int-to-long v2, p0

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p1, Lgw/f;->y:I

    if-ne v0, p0, :cond_2

    :goto_1
    return-void

    :cond_2
    new-instance p0, Lcom/nimbusds/jose/KeyLengthException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The Content Encryption Key (CEK) length for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " must be "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lgw/f;->y:I

    const-string v1, " bits"

    invoke-static {v0, p1, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :try_start_1
    new-instance p0, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {p0}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw p0
    :try_end_1
    .catch Lcom/nimbusds/jose/util/IntegerOverflowException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The Content Encryption Key (CEK) is too long: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lgw/k;[BLxw/b;Lxw/b;Lxw/b;Ljavax/crypto/SecretKey;Lmw/a;)[B
    .locals 15

    move-object/from16 v0, p1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lgw/c;->a()Lxw/b;

    move-result-object v0

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    move-object v0, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-static/range {v0 .. v6}, Ljw/b;->b(Lgw/k;[BLxw/b;Lxw/b;Lxw/b;Ljavax/crypto/SecretKey;Lmw/a;)[B

    move-result-object p0

    return-object p0

    :cond_0
    move-object/from16 v5, p5

    move-object/from16 v6, p6

    iget-object v2, p0, Lgw/k;->O:Lgw/f;

    invoke-static {v5, v2}, Ljw/b;->a(Ljavax/crypto/SecretKey;Lgw/f;)V

    sget-object v3, Lgw/f;->z:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "AES"

    const/4 v7, 0x0

    if-nez v3, :cond_b

    sget-object v3, Lgw/f;->E:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    sget-object v3, Lgw/f;->F:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    :cond_1
    sget-object v3, Lgw/f;->I:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    sget-object v3, Lgw/f;->J:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    sget-object v3, Lgw/f;->K:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    sget-object v3, Lgw/f;->G:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Lgw/f;->H:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    sget-object v3, Lgw/f;->L:Lgw/f;

    invoke-virtual {v2, v3}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual/range {p2 .. p2}, Lxw/a;->a()[B

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lxw/a;->a()[B

    move-result-object v3

    invoke-virtual/range {p4 .. p4}, Lxw/a;->a()[B

    move-result-object v4

    :try_start_0
    new-instance v6, Lat/e;

    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v5

    new-array v7, v7, [B

    const/4 v8, 0x2

    invoke-direct {v6, v8, v5, v7}, Lat/e;-><init>(I[B[B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    filled-new-array {v2, v3, v4}, [[B

    move-result-object v2

    invoke-static {v2}, Lrv/n;->h([[B)[B

    move-result-object v2

    :try_start_1
    invoke-virtual {v6, v2, v0}, Lat/e;->b([B[B)[B

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "XChaCha20Poly1305 decryption failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid XChaCha20Poly1305 key: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    sget-object v0, Ljw/b;->a:Ljava/util/Set;

    invoke-static {v2, v0}, Ljw/e;->k(Lgw/f;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_0
    iget-object v0, p0, Lgw/c;->E:Ljava/util/Map;

    const-string v3, "epu"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v4, :cond_6

    new-instance v4, Lxw/b;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3}, Lxw/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lxw/a;->a()[B

    move-result-object v3

    goto :goto_1

    :cond_6
    move-object v3, v6

    :goto_1
    const-string v4, "epv"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v7, v7, Ljava/lang/String;

    if-eqz v7, :cond_7

    new-instance v7, Lxw/b;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v7, v0}, Lxw/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lxw/a;->a()[B

    move-result-object v0

    goto :goto_2

    :cond_7
    move-object v0, v6

    :goto_2
    invoke-static {v5, v2, v3, v0}, Ljw/e;->f(Ljavax/crypto/SecretKey;Lgw/f;[B[B)Ljavax/crypto/spec/SecretKeySpec;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lgw/c;->a()Lxw/b;

    move-result-object p0

    iget-object p0, p0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    throw v6

    :cond_8
    :goto_3
    invoke-virtual/range {p2 .. p2}, Lxw/a;->a()[B

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lxw/a;->a()[B

    move-result-object v3

    invoke-virtual/range {p4 .. p4}, Lxw/a;->a()[B

    move-result-object v7

    iget-object v6, v6, Lla/b;->x:Ljava/lang/Object;

    check-cast v6, Ljava/security/Provider;

    invoke-interface {v5}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move-object v4, v5

    goto :goto_4

    :cond_9
    new-instance v4, Lxw/e;

    invoke-direct {v4, v5}, Lxw/e;-><init>(Ljavax/crypto/SecretKey;)V

    :goto_4
    const-string v5, "AES/GCM/NoPadding"

    if-eqz v6, :cond_a

    :try_start_2
    invoke-static {v5, v6}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v5

    goto :goto_5

    :cond_a
    invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    :goto_5
    new-instance v6, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v8, 0x80

    invoke-direct {v6, v8, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    const/4 v2, 0x2

    invoke-virtual {v5, v2, v4, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_3

    invoke-virtual {v5, v0}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :try_start_3
    filled-new-array {v3, v7}, [[B

    move-result-object v0

    invoke-static {v0}, Lrv/n;->h([[B)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljavax/crypto/BadPaddingException; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_9

    :catch_2
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AES/GCM/NoPadding decryption failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t create AES/GCM/NoPadding cipher: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_b
    :goto_6
    invoke-virtual/range {p2 .. p2}, Lxw/a;->a()[B

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lxw/a;->a()[B

    move-result-object v3

    invoke-virtual/range {p4 .. p4}, Lxw/a;->a()[B

    move-result-object v8

    iget-object v6, v6, Lla/b;->x:Ljava/lang/Object;

    check-cast v6, Ljava/security/Provider;

    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v5

    array-length v9, v5

    const/16 v10, 0x20

    if-ne v9, v10, :cond_c

    new-instance v9, Ljavax/crypto/spec/SecretKeySpec;

    const-string v10, "HMACSHA256"

    const/16 v11, 0x10

    invoke-direct {v9, v5, v7, v11, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v10, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v10, v5, v11, v11, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    :goto_7
    move v14, v11

    move-object v11, v10

    move v10, v14

    goto :goto_8

    :cond_c
    array-length v9, v5

    const/16 v11, 0x30

    if-ne v9, v11, :cond_d

    new-instance v9, Ljavax/crypto/spec/SecretKeySpec;

    const-string v10, "HMACSHA384"

    const/16 v11, 0x18

    invoke-direct {v9, v5, v7, v11, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v10, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v10, v5, v11, v11, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    goto :goto_7

    :cond_d
    array-length v9, v5

    const/16 v11, 0x40

    if-ne v9, v11, :cond_12

    new-instance v9, Ljavax/crypto/spec/SecretKeySpec;

    const-string v11, "HMACSHA512"

    invoke-direct {v9, v5, v7, v10, v11}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v11, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v11, v5, v10, v10, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    :goto_8
    array-length v4, v0

    int-to-long v4, v4

    const-wide/16 v12, 0x8

    mul-long/2addr v4, v12

    long-to-int v12, v4

    int-to-long v12, v12

    cmp-long v4, v12, v4

    if-nez v4, :cond_11

    const/16 v4, 0x8

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4, v12, v13}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    array-length v5, v0

    array-length v12, v2

    add-int/2addr v5, v12

    array-length v12, v3

    add-int/2addr v5, v12

    array-length v12, v4

    add-int/2addr v5, v12

    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-interface {v9}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v9, v0, v6}, Ljw/e;->a(Ljava/lang/String;Ljavax/crypto/SecretKey;[BLjava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0, v8}, Lvd/f;->h([B[B)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v11, v7, v2, v6}, Ljw/e;->b(Ljavax/crypto/spec/SecretKeySpec;Z[BLjava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v0

    :try_start_4
    invoke-virtual {v0, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    :goto_9
    iget-object p0, p0, Lgw/k;->Q:Lgw/d;

    if-nez p0, :cond_e

    return-object v0

    :cond_e
    sget-object v1, Lgw/d;->x:Lgw/d;

    invoke-virtual {p0, v1}, Lgw/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :try_start_5
    invoke-static {v0}, Ls/s;->h([B)[B

    move-result-object p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    return-object p0

    :catch_4
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t decompress plain text: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported compression algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_5
    move-exception v0

    move-object p0, v0

    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_10
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string v0, "MAC check failed"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    new-instance p0, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {p0}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw p0

    :cond_12
    new-instance p0, Lcom/nimbusds/jose/KeyLengthException;

    const-string v0, "Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lgw/k;[B[BLjavax/crypto/SecretKey;Lxw/b;Lmw/a;)Lb30/m;
    .locals 18

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lgw/c;->a()Lxw/b;

    move-result-object v0

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Ljw/b;->c(Lgw/k;[B[BLjavax/crypto/SecretKey;Lxw/b;Lmw/a;)Lb30/m;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v1, p0

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    iget-object v2, v1, Lgw/k;->O:Lgw/f;

    invoke-static {v3, v2}, Ljw/b;->a(Ljavax/crypto/SecretKey;Lgw/f;)V

    iget-object v4, v1, Lgw/k;->Q:Lgw/d;

    const/16 v6, 0x8

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    goto :goto_0

    :cond_1
    sget-object v9, Lgw/d;->x:Lgw/d;

    invoke-virtual {v4, v9}, Lgw/d;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    :try_start_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9

    :try_start_1
    new-instance v9, Ljava/util/zip/Deflater;

    invoke-direct {v9, v6, v7}, Ljava/util/zip/Deflater;-><init>(IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance v10, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v10, v4, v9}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v11, p1

    :try_start_3
    invoke-virtual {v10, v11}, Ljava/io/OutputStream;->write([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v10}, Ljava/util/zip/DeflaterOutputStream;->close()V

    invoke-virtual {v9}, Ljava/util/zip/Deflater;->end()V

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9

    :goto_0
    sget-object v9, Lgw/f;->z:Lgw/f;

    invoke-virtual {v2, v9}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "AES"

    const-wide/16 v11, 0x8

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/16 v15, 0x10

    if-nez v9, :cond_2

    sget-object v9, Lgw/f;->E:Lgw/f;

    invoke-virtual {v2, v9}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    sget-object v9, Lgw/f;->F:Lgw/f;

    invoke-virtual {v2, v9}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    :cond_2
    move-object/from16 v8, p4

    move-wide/from16 v16, v11

    goto/16 :goto_a

    :cond_3
    sget-object v6, Lgw/f;->I:Lgw/f;

    invoke-virtual {v2, v6}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    sget-object v6, Lgw/f;->J:Lgw/f;

    invoke-virtual {v2, v6}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    sget-object v6, Lgw/f;->K:Lgw/f;

    invoke-virtual {v2, v6}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    :cond_4
    move-object/from16 v8, p4

    goto/16 :goto_5

    :cond_5
    sget-object v6, Lgw/f;->G:Lgw/f;

    invoke-virtual {v2, v6}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    sget-object v6, Lgw/f;->H:Lgw/f;

    invoke-virtual {v2, v6}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_1

    :cond_6
    sget-object v5, Lgw/f;->L:Lgw/f;

    invoke-virtual {v2, v5}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    :try_start_5
    invoke-interface {v3}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    new-instance v3, Lhs/j;

    const/4 v5, 0x1

    invoke-direct {v3, v2, v5}, Lhs/j;-><init>([BI)V
    :try_end_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    array-length v2, v4

    add-int/lit8 v2, v2, 0x28

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v13}, Lse/b;->W(I)[B

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2, v5, v4, v0}, Lb3/b;->l(Ljava/nio/ByteBuffer;[B[B[B)V

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0
    :try_end_6
    .catch Ljava/security/GeneralSecurityException; {:try_start_6 .. :try_end_6} :catch_0

    array-length v2, v0

    add-int/lit8 v3, v2, -0x10

    invoke-static {v0, v14, v13}, Lrv/n;->l([BII)[B

    move-result-object v4

    add-int/lit8 v2, v2, -0x28

    invoke-static {v0, v13, v2}, Lrv/n;->l([BII)[B

    move-result-object v2

    invoke-static {v0, v3, v15}, Lrv/n;->l([BII)[B

    move-result-object v0

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v3, v2, v0}, Lio/sentry/internal/debugmeta/c;-><init>([B[B)V

    move-object/from16 v8, p4

    goto/16 :goto_c

    :catch_0
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t encrypt with XChaCha20Poly1305: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid XChaCha20Poly1305 key: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_7
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    sget-object v1, Ljw/b;->a:Ljava/util/Set;

    invoke-static {v2, v1}, Ljw/e;->k(Lgw/f;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_1
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    new-array v6, v15, [B

    invoke-virtual {v0, v6}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v0, v5, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/Provider;

    iget-object v5, v1, Lgw/c;->E:Ljava/util/Map;

    const-string v9, "epu"

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    instance-of v10, v10, Ljava/lang/String;

    if-eqz v10, :cond_9

    new-instance v10, Lxw/b;

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-direct {v10, v9}, Lxw/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lxw/a;->a()[B

    move-result-object v9

    goto :goto_2

    :cond_9
    move-object v9, v8

    :goto_2
    const-string v10, "epv"

    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v11, v11, Ljava/lang/String;

    if-eqz v11, :cond_a

    new-instance v8, Lxw/b;

    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v8, v5}, Lxw/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Lxw/a;->a()[B

    move-result-object v8

    :cond_a
    const-string v5, "SHA-"

    new-instance v10, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v10}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_7
    sget-object v11, Ljw/e;->a:[B

    invoke-virtual {v10, v11}, Ljava/io/OutputStream;->write([B)V

    invoke-interface {v3}, Ljava/security/Key;->getEncoded()[B

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/io/OutputStream;->write([B)V

    array-length v11, v11

    mul-int/lit8 v11, v11, 0x8

    div-int/lit8 v12, v11, 0x2

    invoke-static {v12}, Ls2/a;->A(I)[B

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V

    iget-object v12, v2, Lgw/a;->w:Ljava/lang/String;

    sget-object v13, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v12, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    sget-object v12, Ljw/e;->b:[B

    if-eqz v9, :cond_b

    :try_start_8
    array-length v13, v9

    invoke-static {v13}, Ls2/a;->A(I)[B

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v10, v9}, Ljava/io/OutputStream;->write([B)V

    goto :goto_3

    :cond_b
    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V

    :goto_3
    if-eqz v8, :cond_c

    array-length v12, v8

    invoke-static {v12}, Ls2/a;->A(I)[B

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v10, v8}, Ljava/io/OutputStream;->write([B)V

    goto :goto_4

    :cond_c
    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V

    :goto_4
    sget-object v12, Ljw/e;->c:[B

    invoke-virtual {v10, v12}, Ljava/io/OutputStream;->write([B)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    invoke-virtual {v10}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v10

    :try_start_9
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v5
    :try_end_9
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_9 .. :try_end_9} :catch_3

    invoke-virtual {v5, v10}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    array-length v10, v5

    div-int/lit8 v10, v10, 0x2

    new-array v11, v10, [B

    const/4 v12, 0x0

    invoke-static {v5, v12, v11, v12, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v10, "AES"

    invoke-direct {v5, v11, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-static {v5, v7, v6, v0}, Ljw/e;->b(Ljavax/crypto/spec/SecretKeySpec;Z[BLjava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v5

    :try_start_a
    invoke-virtual {v5, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    invoke-static {v3, v2, v9, v8}, Ljw/e;->f(Ljavax/crypto/SecretKey;Lgw/f;[B[B)Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lgw/c;->a()Lxw/b;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, p4

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Lxw/b;->c([B)Lxw/b;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lxw/b;->c([B)Lxw/b;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v2}, Ljavax/crypto/spec/SecretKeySpec;->getAlgorithm()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2, v3, v0}, Ljw/e;->a(Ljava/lang/String;Ljavax/crypto/SecretKey;[BLjava/security/Provider;)[B

    move-result-object v0

    new-instance v3, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v3, v4, v0}, Lio/sentry/internal/debugmeta/c;-><init>([B[B)V

    move-object v4, v6

    goto/16 :goto_c

    :catch_2
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_5
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    const/16 v6, 0xc

    new-array v6, v6, [B

    invoke-virtual {v2, v6}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v2, v5, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/security/Provider;

    invoke-interface {v3}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_6

    :cond_d
    new-instance v5, Lxw/e;

    invoke-direct {v5, v3}, Lxw/e;-><init>(Ljavax/crypto/SecretKey;)V

    move-object v3, v5

    :goto_6
    const-string v5, "AES/GCM/NoPadding"

    if-eqz v2, :cond_e

    :try_start_b
    invoke-static {v5, v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v2

    goto :goto_7

    :cond_e
    invoke-static {v5}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    :goto_7
    new-instance v5, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v9, 0x80

    invoke-direct {v5, v9, v6}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    invoke-virtual {v2, v7, v3, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_b
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/security/InvalidKeyException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_b .. :try_end_b} :catch_7

    invoke-virtual {v2, v0}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :try_start_c
    invoke-virtual {v2, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_c
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljavax/crypto/BadPaddingException; {:try_start_c .. :try_end_c} :catch_6

    array-length v3, v0

    sub-int/2addr v3, v15

    invoke-static {v0, v14, v3}, Lrv/n;->l([BII)[B

    move-result-object v4

    invoke-static {v0, v3, v15}, Lrv/n;->l([BII)[B

    move-result-object v0

    invoke-virtual {v2}, Ljavax/crypto/Cipher;->getParameters()Ljava/security/AlgorithmParameters;

    move-result-object v2

    if-eqz v2, :cond_15

    :try_start_d
    const-class v3, Ljavax/crypto/spec/GCMParameterSpec;

    invoke-virtual {v2, v3}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v2

    check-cast v2, Ljavax/crypto/spec/GCMParameterSpec;
    :try_end_d
    .catch Ljava/security/spec/InvalidParameterSpecException; {:try_start_d .. :try_end_d} :catch_5

    invoke-virtual {v2}, Ljavax/crypto/spec/GCMParameterSpec;->getIV()[B

    move-result-object v3

    invoke-virtual {v2}, Ljavax/crypto/spec/GCMParameterSpec;->getTLen()I

    move-result v2

    if-nez v3, :cond_f

    move-wide/from16 v16, v11

    move v7, v14

    goto :goto_8

    :cond_f
    array-length v5, v3

    int-to-long v5, v5

    mul-long/2addr v5, v11

    long-to-int v7, v5

    move-wide/from16 v16, v11

    int-to-long v11, v7

    cmp-long v5, v11, v5

    if-nez v5, :cond_14

    :goto_8
    const/16 v5, 0x60

    if-ne v7, v5, :cond_11

    if-ne v2, v9, :cond_10

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v4, v0}, Lio/sentry/internal/debugmeta/c;-><init>([B[B)V

    move-object v4, v3

    move-object v3, v2

    goto/16 :goto_c

    :cond_10
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Authentication tag length of %d bits is required, got %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v3, :cond_13

    array-length v2, v3

    int-to-long v2, v2

    mul-long v2, v2, v16

    long-to-int v14, v2

    int-to-long v4, v14

    cmp-long v2, v4, v2

    if-nez v2, :cond_12

    goto :goto_9

    :cond_12
    new-instance v0, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {v0}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw v0

    :cond_13
    :goto_9
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "IV length of %d bits is required, got %d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {v0}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw v0

    :catch_5
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_15
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    const-string v1, "AES GCM ciphers are expected to make use of algorithm parameters"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_6
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t encrypt with AES/GCM/NoPadding: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_7
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t create AES/GCM/NoPadding cipher: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_a
    new-instance v2, Ljava/security/SecureRandom;

    invoke-direct {v2}, Ljava/security/SecureRandom;-><init>()V

    new-array v9, v15, [B

    invoke-virtual {v2, v9}, Ljava/security/SecureRandom;->nextBytes([B)V

    iget-object v2, v5, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Ljava/security/Provider;

    invoke-interface {v3}, Ljava/security/Key;->getEncoded()[B

    move-result-object v3

    array-length v5, v3

    const/16 v11, 0x20

    if-ne v5, v11, :cond_16

    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v11, "HMACSHA256"

    invoke-direct {v5, v3, v14, v15, v11}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v11, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v11, v3, v15, v15, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    move v13, v15

    goto :goto_b

    :cond_16
    array-length v5, v3

    const/16 v12, 0x30

    if-ne v5, v12, :cond_17

    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v11, "HMACSHA384"

    invoke-direct {v5, v3, v14, v13, v11}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v11, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v11, v3, v13, v13, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    goto :goto_b

    :cond_17
    array-length v5, v3

    const/16 v12, 0x40

    if-ne v5, v12, :cond_19

    new-instance v5, Ljavax/crypto/spec/SecretKeySpec;

    const-string v12, "HMACSHA512"

    invoke-direct {v5, v3, v14, v11, v12}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    new-instance v12, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v12, v3, v11, v11, v10}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BIILjava/lang/String;)V

    move v13, v11

    move-object v11, v12

    :goto_b
    invoke-static {v11, v7, v9, v2}, Ljw/e;->b(Ljavax/crypto/spec/SecretKeySpec;Z[BLjava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object v3

    :try_start_e
    invoke-virtual {v3, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v3
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_8

    array-length v4, v0

    int-to-long v10, v4

    mul-long v10, v10, v16

    long-to-int v4, v10

    move v12, v6

    int-to-long v6, v4

    cmp-long v4, v6, v10

    if-nez v4, :cond_18

    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4, v6, v7}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    array-length v6, v0

    add-int/2addr v6, v15

    array-length v7, v3

    add-int/2addr v6, v7

    array-length v7, v4

    add-int/2addr v6, v7

    invoke-static {v6}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-interface {v5}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5, v0, v2}, Ljw/e;->a(Ljava/lang/String;Ljavax/crypto/SecretKey;[BLjava/security/Provider;)[B

    move-result-object v0

    invoke-static {v0, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v3, v0}, Lio/sentry/internal/debugmeta/c;-><init>([B[B)V

    move-object v3, v2

    move-object v4, v9

    :goto_c
    new-instance v0, Lb30/m;

    invoke-static {v4}, Lxw/b;->c([B)Lxw/b;

    move-result-object v2

    iget-object v4, v3, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v4, [B

    invoke-static {v4}, Lxw/b;->c([B)Lxw/b;

    move-result-object v4

    iget-object v3, v3, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v3, [B

    invoke-static {v3}, Lxw/b;->c([B)Lxw/b;

    move-result-object v5

    const/4 v6, 0x5

    move-object v3, v2

    move-object v2, v8

    invoke-direct/range {v0 .. v6}, Lb30/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v0

    :cond_18
    new-instance v0, Lcom/nimbusds/jose/util/IntegerOverflowException;

    invoke-direct {v0}, Lcom/nimbusds/jose/util/IntegerOverflowException;-><init>()V

    throw v0

    :catch_8
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_19
    new-instance v0, Lcom/nimbusds/jose/KeyLengthException;

    const-string v1, "Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object v8, v10

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object v9, v8

    :goto_d
    if-eqz v8, :cond_1a

    :try_start_f
    invoke-virtual {v8}, Ljava/util/zip/DeflaterOutputStream;->close()V

    :cond_1a
    if-eqz v9, :cond_1b

    invoke-virtual {v9}, Ljava/util/zip/Deflater;->end()V

    :cond_1b
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_9

    :catch_9
    move-exception v0

    new-instance v1, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Couldn\'t compress plain text: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1c
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported compression algorithm: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
