.class public abstract Ljw/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[B

.field public static final c:[B

.field public static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Ljw/e;->a:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Ljw/e;->b:[B

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    sput-object v0, Ljw/e;->c:[B

    const/16 v0, 0x9

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    sput-object v0, Ljw/e;->d:[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x45t
        0x6et
        0x63t
        0x72t
        0x79t
        0x70t
        0x74t
        0x69t
        0x6ft
        0x6et
    .end array-data

    nop

    :array_3
    .array-data 1
        0x49t
        0x6et
        0x74t
        0x65t
        0x67t
        0x72t
        0x69t
        0x74t
        0x79t
    .end array-data
.end method

.method public static a(Ljava/lang/String;Ljavax/crypto/SecretKey;[BLjava/security/Provider;)[B
    .locals 0

    if-eqz p3, :cond_0

    :try_start_0
    invoke-static {p0, p3}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p0

    :goto_0
    invoke-virtual {p0, p1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0, p2}, Ljavax/crypto/Mac;->update([B)V

    invoke-virtual {p0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Invalid HMAC key: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Unsupported HMAC algorithm: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ljavax/crypto/spec/SecretKeySpec;Z[BLjava/security/Provider;)Ljavax/crypto/Cipher;
    .locals 2

    :try_start_0
    const-string v0, "AES/CBC/PKCS5Padding"

    if-nez p3, :cond_0

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-static {v0, p3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object p3

    :goto_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    const-string v1, "AES"

    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    new-instance p0, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {p0, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p3, p1, v0, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    return-object p3

    :cond_1
    const/4 p1, 0x2

    invoke-virtual {p3, p1, v0, p0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static c(Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPrivateKey;)Ljavax/crypto/spec/SecretKeySpec;
    .locals 2

    const-string v0, "ECDH"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0, p1}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p0, p1}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;
    :try_end_1
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance p0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0}, Ljavax/crypto/KeyAgreement;->generateSecret()[B

    move-result-object p1

    const-string v0, "AES"

    invoke-direct {p0, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid key for ECDH key agreement: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Couldn\'t get an ECDH key agreement instance: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static d(Ljava/security/interfaces/RSAPublicKey;Ljavax/crypto/SecretKey;ILkw/a;Ljava/security/Provider;)[B
    .locals 7

    const/16 v0, 0x100

    if-ne v0, p2, :cond_0

    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "RSA/ECB/OAEPWithSHA-256AndMGF1Padding"

    const-string v2, "SHA-256"

    goto :goto_0

    :cond_0
    const/16 v0, 0x180

    if-ne v0, p2, :cond_1

    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA384:Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "RSA/ECB/OAEPWithSHA-384AndMGF1Padding"

    const-string v2, "SHA-384"

    goto :goto_0

    :cond_1
    const/16 v0, 0x200

    if-ne v0, p2, :cond_5

    sget-object v0, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    const-string v1, "RSA/ECB/OAEPWithSHA-512AndMGF1Padding"

    const-string v2, "SHA-512"

    :goto_0
    :try_start_0
    const-string v3, "OAEP"

    if-nez p4, :cond_2

    invoke-static {v3}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    move-result-object v3

    goto :goto_1

    :cond_2
    invoke-static {v3, p4}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/AlgorithmParameters;

    move-result-object v3

    :goto_1
    new-instance v4, Ljavax/crypto/spec/OAEPParameterSpec;

    const-string v5, "MGF1"

    sget-object v6, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    invoke-direct {v4, v2, v5, v0, v6}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    invoke-virtual {v3, v4}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    if-nez p4, :cond_3

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p4

    goto :goto_2

    :cond_3
    invoke-static {v1, p4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object p4

    :goto_2
    iget v0, p3, Lkw/a;->a:I

    invoke-virtual {p4, v0, p0, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/AlgorithmParameters;)V

    sget-object p0, Lkw/a;->c:Lkw/a;

    if-ne p3, p0, :cond_4

    invoke-virtual {p4, p1}, Ljavax/crypto/Cipher;->wrap(Ljava/security/Key;)[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    invoke-virtual {p4, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :goto_3
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p3, "Encryption failed due to invalid RSA key for SHA-"

    const-string p4, ": The RSA key may be too short, use a longer key"

    invoke-static {p2, p3, p4}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_5
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "Unsupported SHA-2 bit size: "

    invoke-static {p2, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e([BLgw/m;)V
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_7

    aget-byte v3, p0, v2

    if-eqz v3, :cond_6

    invoke-static {p1}, Lnw/a;->a(Lgw/m;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_5

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnw/a;

    invoke-static {v0}, Lnw/c;->a(Lnw/a;)Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {p1}, Ljw/e;->g(Lgw/m;)I

    move-result v0

    invoke-static {p1}, Ljw/e;->g(Lgw/m;)I

    move-result p1

    array-length v4, p0

    if-ne p1, v4, :cond_3

    div-int/lit8 v0, v0, 0x2

    invoke-static {p0, v1, v0}, Lrv/n;->l([BII)[B

    move-result-object p1

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-static {p0, v0, v0}, Lrv/n;->l([BII)[B

    move-result-object p0

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v3, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    sget-object p0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {p1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v2

    if-lt v2, v3, :cond_1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v2

    if-lt v2, v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "R or S mod N != 0 check failed"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "S and R must not exceed N"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "S and R must not be 0"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "Illegal signature length"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported curve: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported JWS algorithm: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_7
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string p1, "Blank signature"

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Ljavax/crypto/SecretKey;Lgw/f;[B[B)Ljavax/crypto/spec/SecretKeySpec;
    .locals 3

    const-string v0, "SHA-"

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    sget-object v2, Ljw/e;->a:[B

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-interface {p0}, Ljava/security/Key;->getEncoded()[B

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/io/OutputStream;->write([B)V

    array-length p0, p0

    mul-int/lit8 p0, p0, 0x8

    invoke-static {p0}, Ls2/a;->A(I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    iget-object p1, p1, Lgw/a;->w:Ljava/lang/String;

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    sget-object p1, Ljw/e;->b:[B

    if-eqz p2, :cond_0

    :try_start_1
    array-length v2, p2

    invoke-static {v2}, Ls2/a;->A(I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    :goto_0
    if-eqz p3, :cond_1

    array-length p1, p3

    invoke-static {p1}, Ls2/a;->A(I)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1, p3}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V

    :goto_1
    sget-object p1, Ljw/e;->d:[B

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    :try_start_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_0

    new-instance p3, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const-string p2, "HMACSHA"

    invoke-static {p0, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, p1, p0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p3

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static g(Lgw/m;)I
    .locals 2

    sget-object v0, Lgw/m;->I:Lgw/m;

    invoke-virtual {p0, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x40

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lgw/m;->J:Lgw/m;

    invoke-virtual {p0, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    sget-object v0, Lgw/m;->K:Lgw/m;

    invoke-virtual {p0, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x60

    return p0

    :cond_2
    sget-object v0, Lgw/m;->L:Lgw/m;

    invoke-virtual {p0, v0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 p0, 0x84

    return p0

    :cond_3
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    sget-object v1, Ljw/d;->d:Ljava/util/Set;

    invoke-static {p0, v1}, Ljw/e;->m(Lgw/m;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(Ljava/lang/String;Ljava/security/Provider;Ljava/security/spec/PSSParameterSpec;)Ljava/security/Signature;
    .locals 1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p0, p1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    if-eqz p2, :cond_1

    :try_start_1
    invoke-virtual {p0, p2}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid RSASSA-PSS salt length parameter: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    return-object p0

    :catch_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Ljava/util/Collection;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    array-length v2, p0

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_2

    const-string v2, " or "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j([B)[B
    .locals 12

    :try_start_0
    array-length v0, p0

    const/4 v1, 0x2

    div-int/2addr v0, v1

    move v2, v0

    :goto_0
    if-lez v2, :cond_0

    sub-int v3, v0, v2

    aget-byte v3, p0, v3

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    sub-int v3, v0, v2

    aget-byte v4, p0, v3

    if-gez v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    move v5, v0

    :goto_2
    if-lez v5, :cond_2

    mul-int/lit8 v6, v0, 0x2

    sub-int/2addr v6, v5

    aget-byte v6, p0, v6

    if-nez v6, :cond_2

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_2
    mul-int/2addr v0, v1

    sub-int/2addr v0, v5

    aget-byte v6, p0, v0

    if-gez v6, :cond_3

    add-int/lit8 v6, v5, 0x1

    goto :goto_3

    :cond_3
    move v6, v5

    :goto_3
    add-int/lit8 v7, v4, 0x4

    add-int/2addr v7, v6

    const/16 v8, 0xff

    if-gt v7, v8, :cond_5

    const/16 v8, 0x80

    const/4 v9, 0x1

    if-ge v7, v8, :cond_4

    add-int/lit8 v8, v4, 0x6

    add-int/2addr v8, v6

    new-array v8, v8, [B

    goto :goto_4

    :cond_4
    add-int/lit8 v8, v4, 0x7

    add-int/2addr v8, v6

    new-array v8, v8, [B

    const/16 v10, -0x7f

    aput-byte v10, v8, v9

    move v9, v1

    :goto_4
    const/4 v10, 0x0

    const/16 v11, 0x30

    aput-byte v11, v8, v10

    add-int/lit8 v10, v9, 0x1

    int-to-byte v7, v7

    aput-byte v7, v8, v9

    add-int/lit8 v7, v9, 0x2

    aput-byte v1, v8, v10

    add-int/lit8 v9, v9, 0x3

    int-to-byte v10, v4

    aput-byte v10, v8, v7

    add-int/2addr v9, v4

    sub-int v4, v9, v2

    invoke-static {p0, v3, v8, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v9, 0x1

    aput-byte v1, v8, v9

    add-int/2addr v9, v1

    int-to-byte v1, v6

    aput-byte v1, v8, v2

    add-int/2addr v9, v6

    sub-int/2addr v9, v5

    invoke-static {p0, v0, v8, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v8

    :cond_5
    new-instance p0, Lcom/nimbusds/jose/JOSEException;

    const-string v0, "Invalid ECDSA signature format"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    instance-of v0, p0, Lcom/nimbusds/jose/JOSEException;

    if-eqz v0, :cond_6

    throw p0

    :cond_6
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static k(Lgw/f;Ljava/util/Collection;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported JWE encryption method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", must be "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljw/e;->i(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static l(Lgw/i;Ljava/util/Collection;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported JWE algorithm "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", must be "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljw/e;->i(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lgw/m;Ljava/util/Collection;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported JWS algorithm "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", must be "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljw/e;->i(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
