.class public final Lis/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/a;


# static fields
.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

.field public static final h:Lat/b;


# instance fields
.field public final a:Ljavax/crypto/spec/SecretKeySpec;

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "7a806c"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lis/a;->c:[B

    const-string v0, "46bb91c3c5"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lis/a;->d:[B

    const-string v0, "36864200e0eaf5284d884a0e77d31646"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lis/a;->e:[B

    const-string v0, "bae8e37fc83441b16034566b"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lis/a;->f:[B

    const-string v0, "af60eb711bd85bc1e4d3e0a462e074eea428a8"

    invoke-static {v0}, Lse/a;->y(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lis/a;->g:[B

    new-instance v0, Lat/b;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lat/b;-><init>(I)V

    sput-object v0, Lis/a;->h:Lat/b;

    return-void
.end method

.method public constructor <init>([B[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lis/a;->b:[B

    array-length p2, p1

    invoke-static {p2}, Lat/c0;->a(I)V

    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {p2, p1, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object p2, p0, Lis/a;->a:Ljavax/crypto/spec/SecretKeySpec;

    return-void
.end method

.method public static c(Ljavax/crypto/Cipher;)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lis/a;->f:[B

    array-length v2, v1

    new-instance v3, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v4, 0x80

    invoke-direct {v3, v4, v1, v0, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    sget-object v2, Lis/a;->e:[B

    const-string v4, "AES"

    invoke-direct {v1, v2, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    sget-object v1, Lis/a;->d:[B

    invoke-virtual {p0, v1}, Ljavax/crypto/Cipher;->updateAAD([B)V

    sget-object v1, Lis/a;->g:[B

    array-length v2, v1

    invoke-virtual {p0, v1, v0, v2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p0

    sget-object v1, Lis/a;->c:[B

    invoke-static {p0, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method public static d(Lgs/r;)Lis/a;
    .locals 2

    new-instance v0, Lis/a;

    iget-object v1, p0, Lgs/r;->c:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    invoke-virtual {v1}, Lct/a;->b()[B

    move-result-object v1

    iget-object p0, p0, Lgs/r;->d:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lis/a;-><init>([B[B)V

    return-object v0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 7

    sget-object v0, Lis/a;->h:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljavax/crypto/Cipher;

    if-eqz v1, :cond_4

    array-length v0, p1

    const v2, 0x7fffffe3

    if-gt v0, v2, :cond_3

    array-length v0, p1

    add-int/lit8 v0, v0, 0x1c

    new-array v5, v0, [B

    const/16 v0, 0xc

    invoke-static {v0}, Lse/b;->W(I)[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v5, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v2

    new-instance v4, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v6, 0x80

    invoke-direct {v4, v6, v2, v3, v0}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    const/4 v0, 0x1

    iget-object v2, p0, Lis/a;->a:Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v1, v0, v2, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v0, p2

    if-eqz v0, :cond_0

    invoke-virtual {v1, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length v4, p1

    const/16 v6, 0xc

    const/4 v3, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    move-result p1

    array-length p2, v2

    add-int/lit8 p2, p2, 0x10

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lis/a;->b:[B

    array-length p2, p1

    if-nez p2, :cond_1

    return-object v5

    :cond_1
    filled-new-array {p1, v5}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    return-object p1

    :cond_2
    array-length p2, v2

    sub-int/2addr p1, p2

    new-instance p2, Ljava/security/GeneralSecurityException;

    const-string v0, "encryption failed; GCM tag must be 16 bytes, but got only "

    const-string v1, " bytes"

    invoke-static {p1, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext too long"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "AES GCM SIV cipher is not available or is invalid."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[B)[B
    .locals 2

    iget-object v0, p0, Lis/a;->b:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lis/a;->e([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lis/a;->e([B[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e([B[B)[B
    .locals 5

    sget-object v0, Lis/a;->h:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    if-eqz v0, :cond_2

    array-length v1, p1

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v2, 0x80

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-direct {v1, v2, p1, v3, v4}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    const/4 v2, 0x2

    iget-object v3, p0, Lis/a;->a:Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {v0, v2, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    if-eqz p2, :cond_0

    array-length v1, p2

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    :cond_0
    array-length p2, p1

    sub-int/2addr p2, v4

    invoke-virtual {v0, p1, v4, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "AES GCM SIV cipher is not available or is invalid."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
