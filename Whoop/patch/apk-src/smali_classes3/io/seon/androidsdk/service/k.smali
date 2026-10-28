.class public abstract Lio/seon/androidsdk/service/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:I

.field public static final b:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v4, "is_rooted"

    const-string v5, "media_drm_id"

    const-string v0, "android_id"

    const-string v1, "app_guid"

    const-string v2, "gsf_id"

    const-string v3, "is_emulator"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/k;->b:[Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)F
    .locals 10

    sget-object v0, Lio/seon/androidsdk/service/b0;->n:Lbu/c;

    const-string v1, "power"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/PowerManager;

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x3

    const/4 v6, 0x1

    if-ge v4, v2, :cond_2

    aget-object v7, v1, v4

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "getMaximumScreenBrightnessSetting"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v7, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {v7, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float p0, p0

    return p0

    :catch_0
    move-exception v6

    invoke-virtual {v0, v5, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v2, v1

    :goto_1
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "BRIGHTNESS_ON"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_1
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    move-result p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return p0

    :catch_1
    move-exception v4

    invoke-virtual {v0, v5, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    const/high16 p0, 0x437f0000    # 255.0f

    return p0
.end method

.method public static b([B)Ld/h1;
    .locals 2

    new-instance v0, Ld/g0;

    invoke-direct {v0, p0}, Ld/g0;-><init>([B)V

    :try_start_0
    invoke-virtual {v0}, Ld/g0;->i()Ld/b1;

    move-result-object p0

    check-cast p0, Ld/l;

    iget-object p0, p0, Ld/x0;->a:[B

    new-instance v1, Ld/g0;

    invoke-direct {v1, p0}, Ld/g0;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Ld/g0;->i()Ld/b1;

    move-result-object p0

    check-cast p0, Ld/h1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static c(Ljava/util/List;)Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;
    .locals 6

    const/4 v0, 0x1

    invoke-static {v0, p0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_0
    if-ltz v2, :cond_0

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-virtual {v3}, Ljava/security/cert/X509Certificate;->checkValidity()V

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V

    add-int/lit8 v2, v2, -0x1

    move-object v1, v3

    goto :goto_0

    :cond_0
    const-string v1, "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAr7bHgiuxpwHsK7Qui8xUFmOr75gvMsd/dTEDDJdSSxtf6An7xyqpRR90PL2abxM1dEqlXnf2tqw1Ne4Xwl5jlRfdnJLmN0pTy/4lj4/7tv0Sk3iiKkypnEUtR6WfMgH0QZfKHM1+di+y9TFRtv6y//0rb+T+W8a9nsNL/ggjnar86461qO0rOs2cXjp3kOG1FEJ5MVmFmBGtnrKpa73XpXyTqRxB/M0n1n/W9nGqC4FSYa04T6N5RIZGBN2z2MT5IKGbFlbC8UrW0DxW7AYImQQcHtGl/m00QLVWutHQoVJYnFPlXTcHYvASLu+RhhsbDmxMgJJ0mcDpvsC4PjvB+TxywElgS70vE0XmLD+OJtvsBslHZvPBKCOdT0MS+tgSOIfga+z1Z1g7+DVagf7quvmag8jfPioyKvxnK/EgsTUVi2ghzq8wm27ud/mIM7AY2qEORR8Go3TVB4HzWQgpZrt3i5MIlCaY504LzSRiigHCzAPlHws+W0rB5N+er5/2pJKnfBSDiCiFAVtCLOZ7gLiMm0jhO2B6tUXHI/+MRPjy02i59lINMRRev56GKtcd9qO/0kUJWdZTdA2XoS82ixPvZtXQpUpuL12ab+9EaDK8Z4RHJYYfCT3Q5vNAXaiWQ+8PTWm2QgBR/bkwSWc+NpUFgNPN9PvQi8WEg5UmAGMCAwEAAQ=="

    invoke-static {v1}, Lxg/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAEI9ojcU7fPlsFCjxy6IRqzgeOoK0b+YsV9FPQywiyw8EQRTkJ9u3qwfnI4DGoSLlBqClTXJfgfCcZvs60FikNMHnu4fkRzObfgDkU2KNXezT9/RQ+XvNslxPHrHCowhGr"

    invoke-static {v2}, Lxg/a;->a(Ljava/lang/String;)[B

    move-result-object v2

    const-string v3, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE7l1ex+HA220Dpn7mthvsTWpdamguD/9/SQ59dx9EIm29sa/6FsvHrcV30lacqrewLVQBXT5DKyqO107sSHVBpA=="

    invoke-static {v3}, Lxg/a;->a(Ljava/lang/String;)[B

    move-result-object v3

    const-string v4, "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEgyDuy2d0i9oygI9czIibKoJiU0RDEvCfxItNTQAjbynZ6bC1ygeeiX/Ymn9XY3jYR5iu2IGjkr8ZtRJ3wrhZ5A=="

    invoke-static {v4}, Lxg/a;->a(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v0, p0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/cert/X509Certificate;

    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v5

    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v5

    invoke-static {v1, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v2, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {v3, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;->AOSP_SW:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    return-object p0

    :cond_2
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p0, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;->HUAWEI_HW:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    return-object p0

    :cond_3
    :try_start_0
    const-string v1, "unknown-key"

    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Pub key hash: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/cert/X509Certificate;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v4, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p0

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    invoke-static {p0}, Lxg/a;->b([B)[B

    move-result-object p0

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, p0, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p0, "SHA-256"

    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    const-string v4, "%064x"

    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v0, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v4, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :try_start_2
    const-string p0, ""

    :goto_1
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    sget-object p0, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;->UNKNOWN:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    return-object p0

    :cond_4
    :goto_2
    sget-object p0, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;->GOOGLE_HW:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    return-object p0
.end method

.method public static d()Lio/seon/androidsdk/service/d1;
    .locals 14

    const-string v0, " - "

    const-string v1, "CERT_ERR: "

    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lio/seon/androidsdk/service/k;->f()[Ljava/security/cert/X509Certificate;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lio/seon/androidsdk/service/k;->c(Ljava/util/List;)Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_2
    sget-object v6, Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;->INVALID_CHAIN:Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v6

    :goto_0
    array-length v5, v3

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, v7

    move-object v10, v9

    :goto_1
    if-ltz v5, :cond_2

    aget-object v11, v3, v5

    invoke-virtual {v11}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v12

    const/16 v13, 0x10

    invoke-virtual {v12, v13}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v8, :cond_1

    const-string v12, "1.3.6.1.4.1.11129.2.1.17"

    invoke-interface {v11, v12}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v12

    if-eqz v12, :cond_0

    invoke-static {v12}, Lio/seon/androidsdk/service/k;->b([B)Ld/h1;

    move-result-object v8

    new-instance v9, Lio/seon/androidsdk/service/d1;

    invoke-direct {v9, v8, v1, v10}, Lio/seon/androidsdk/service/d1;-><init>(Ld/h1;Lio/seon/androidsdk/service/AttestationGenerator$RootCertIssuer;Ld/l;)V

    iget-object v8, v9, Lio/seon/androidsdk/service/d1;->k:Ljava/util/ArrayList;

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move v8, v6

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_5

    :cond_0
    const-string v12, "1.3.6.1.4.1.11129.2.1.30"

    invoke-interface {v11, v12}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v11, :cond_1

    :try_start_3
    new-instance v10, Ld/g0;

    invoke-direct {v10, v11}, Ld/g0;-><init>([B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :try_start_4
    invoke-virtual {v10}, Ld/g0;->i()Ld/b1;

    move-result-object v11

    check-cast v11, Ld/l;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    move-object v10, v11

    goto :goto_3

    :catchall_0
    move-exception v11

    :try_start_6
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v10

    :try_start_7
    invoke-virtual {v11, v10}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v11
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :catch_2
    move-object v10, v7

    :cond_1
    :goto_3
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_2
    if-eqz v9, :cond_3

    :try_start_8
    iput-object v2, v9, Lio/seon/androidsdk/service/d1;->i:Ljava/util/ArrayList;

    array-length v1, v3

    sub-int/2addr v1, v6

    aget-object v1, v3, v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    :try_start_9
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    invoke-interface {v1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lxg/a;->b([B)[B

    move-result-object v1

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    const-string v2, "%064x"

    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v6, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    goto :goto_4

    :catch_3
    :try_start_a
    const-string v1, ""

    :goto_4
    iput-object v1, v9, Lio/seon/androidsdk/service/d1;->j:Ljava/lang/String;

    return-object v9

    :cond_3
    new-instance v1, Lio/seon/androidsdk/service/d1;

    const-string v2, "EXTENSION_NOT_FOUND"

    invoke-direct {v1, v2}, Lio/seon/androidsdk/service/d1;-><init>(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    return-object v1

    :goto_5
    new-instance v2, Lio/seon/androidsdk/service/d1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "ERR: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lio/seon/androidsdk/service/d1;-><init>(Ljava/lang/String;)V

    return-object v2
.end method

.method public static e(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 5

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lio/seon/androidsdk/service/k;->b:[Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x6

    if-ge v2, v3, :cond_1

    aget-object v3, v1, v2

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    const-string v3, "null"

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/util/zip/CRC32;

    invoke-direct {p0}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/zip/CRC32;->update([B)V

    invoke-virtual {p0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const-string p0, ""

    return-object p0
.end method

.method public static f()[Ljava/security/cert/X509Certificate;
    .locals 9

    const-string v0, "AndroidKeyStore"

    invoke-static {v0}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    const-string v2, "EC"

    invoke-static {v2, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    const-wide/32 v6, 0xf4240

    add-long/2addr v4, v6

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    new-instance v4, Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    const-wide/32 v7, 0x3b8b87c0

    add-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    new-instance v5, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v6, 0x4

    const-string v7, "cert0"

    invoke-direct {v5, v7, v6}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    new-instance v6, Ljava/security/spec/ECGenParameterSpec;

    const-string v8, "secp256r1"

    invoke-direct {v6, v8}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAlgorithmParameterSpec(Ljava/security/spec/AlgorithmParameterSpec;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityStart(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityForOriginationEnd(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityForConsumptionEnd(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAttestationChallenge([B)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v2

    const-string v3, "NONE"

    const-string v4, "SHA-256"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    invoke-virtual {v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    new-instance v3, Lio/seon/androidsdk/service/j;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lio/seon/androidsdk/service/j;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-interface {v0, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPair;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    invoke-virtual {v1, v7}, Ljava/security/KeyStore;->getCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;

    move-result-object v0

    array-length v1, v0

    new-array v2, v1, [Ljava/security/cert/X509Certificate;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    check-cast v4, Ljava/security/cert/X509Certificate;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :try_start_1
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    const-string v1, "KEYGEN_TIMED_OUT"

    invoke-direct {v0, v1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    throw v0
.end method
