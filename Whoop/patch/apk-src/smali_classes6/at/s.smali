.class public final Lat/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs/a;


# instance fields
.field public final a:Lat/c;

.field public final b:Lat/z;

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(Lat/c;Lat/z;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lat/s;->a:Lat/c;

    iput-object p2, p0, Lat/s;->b:Lat/z;

    iput p3, p0, Lat/s;->c:I

    iput-object p4, p0, Lat/s;->d:[B

    return-void
.end method

.method public static c(Lgs/g;)Lat/s;
    .locals 9

    new-instance v0, Lat/s;

    new-instance v1, Lat/c;

    iget-object v2, p0, Lgs/g;->c:Lro/i;

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Lct/a;

    invoke-virtual {v2}, Lct/a;->b()[B

    move-result-object v2

    iget-object v3, p0, Lgs/g;->b:Lgs/k;

    iget v4, v3, Lgs/k;->c:I

    invoke-direct {v1, v2, v4}, Lat/c;-><init>([BI)V

    new-instance v2, Lat/z;

    new-instance v4, Lat/y;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "HMAC"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v3, Lgs/k;->f:Lgs/j;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v8, p0, Lgs/g;->d:Lro/i;

    iget-object v8, v8, Lro/i;->x:Ljava/lang/Object;

    check-cast v8, Lct/a;

    invoke-virtual {v8}, Lct/a;->b()[B

    move-result-object v8

    invoke-direct {v7, v8, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {v4, v5, v7}, Lat/y;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    iget v3, v3, Lgs/k;->d:I

    invoke-direct {v2, v4, v3}, Lat/z;-><init>(Lat/y;I)V

    iget-object p0, p0, Lgs/g;->e:Lct/a;

    invoke-virtual {p0}, Lct/a;->b()[B

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lat/s;-><init>(Lat/c;Lat/z;I[B)V

    return-object v0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 9

    array-length v0, p1

    iget-object v1, p0, Lat/s;->a:Lat/c;

    iget v2, v1, Lat/c;->b:I

    const v3, 0x7fffffff

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_1

    array-length v0, p1

    add-int/2addr v0, v2

    new-array v5, v0, [B

    invoke-static {v2}, Lse/b;->W(I)[B

    move-result-object v7

    const/4 v0, 0x0

    invoke-static {v7, v0, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, p1

    iget v6, v1, Lat/c;->b:I

    const/4 v8, 0x1

    const/4 v3, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lat/c;->a([BII[BI[BZ)V

    if-nez p2, :cond_0

    new-array p2, v0, [B

    :cond_0
    const/16 p1, 0x8

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    array-length v1, p2

    int-to-long v1, v1

    const-wide/16 v3, 0x8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    filled-new-array {p2, v5, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    iget-object p2, p0, Lat/s;->b:Lat/z;

    invoke-virtual {p2, p1}, Lat/z;->a([B)[B

    move-result-object p1

    iget-object p2, p0, Lat/s;->d:[B

    filled-new-array {p2, v5, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "plaintext length can not exceed "

    invoke-static {v3, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[B)[B
    .locals 12

    array-length v0, p1

    iget-object v1, p0, Lat/s;->d:[B

    array-length v2, v1

    iget v3, p0, Lat/s;->c:I

    add-int/2addr v2, v3

    if-lt v0, v2, :cond_4

    invoke-static {v1, p1}, Lcom/google/crypto/tink/internal/r0;->a([B[B)Z

    move-result v0

    if-eqz v0, :cond_3

    array-length v0, v1

    array-length v1, p1

    sub-int/2addr v1, v3

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    array-length v0, p1

    sub-int/2addr v0, v3

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-array p2, v0, [B

    :cond_0
    const/16 v1, 0x8

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v3, p2

    int-to-long v3, v3

    const-wide/16 v6, 0x8

    mul-long/2addr v3, v6

    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    filled-new-array {p2, v5, v1}, [[B

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/j;->w([[B)[B

    move-result-object p2

    iget-object v1, p0, Lat/s;->b:Lat/z;

    invoke-virtual {v1, p2}, Lat/z;->a([B)[B

    move-result-object p2

    invoke-static {p2, p1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    array-length p1, v5

    iget-object v4, p0, Lat/s;->a:Lat/c;

    iget p2, v4, Lat/c;->b:I

    if-lt p1, p2, :cond_1

    new-array v10, p2, [B

    invoke-static {v5, v0, v10, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, v5

    iget v6, v4, Lat/c;->b:I

    sub-int/2addr p1, v6

    new-array v8, p1, [B

    array-length p1, v5

    sub-int v7, p1, v6

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v4 .. v11}, Lat/c;->a([BII[BI[BZ)V

    return-object v8

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid MAC"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (OutputPrefix mismatch)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Decryption failed (ciphertext too short)."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
