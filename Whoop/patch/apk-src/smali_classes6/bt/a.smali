.class public final Lbt/a;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public E:I

.field public final synthetic F:Lbt/b;

.field public final w:[B

.field public x:Ljavax/crypto/Mac;

.field public y:[B

.field public z:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lbt/b;[B)V
    .locals 0

    iput-object p1, p0, Lbt/a;->F:Lbt/b;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lbt/a;->E:I

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lbt/a;->w:[B

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    iget-object v0, p0, Lbt/a;->F:Lbt/b;

    :try_start_0
    sget-object v1, Lat/u;->c:Lat/u;

    iget-object v2, v0, Lbt/b;->a:Lat/w;

    invoke-static {v2}, Lbt/b;->a(Lat/w;)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v2}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljavax/crypto/Mac;

    iput-object v1, p0, Lbt/a;->x:Ljavax/crypto/Mac;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Lbt/b;->c:[B

    if-eqz v2, :cond_1

    array-length v2, v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, v0, Lbt/b;->c:[B

    iget-object v4, v0, Lbt/b;->a:Lat/w;

    invoke-static {v4}, Lbt/b;->a(Lat/w;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    invoke-virtual {v3}, Ljavax/crypto/Mac;->getMacLength()I

    move-result v3

    new-array v3, v3, [B

    iget-object v4, v0, Lbt/b;->a:Lat/w;

    invoke-static {v4}, Lbt/b;->a(Lat/w;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v1, v2}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    :goto_1
    iget-object v1, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    iget-object v0, v0, Lbt/b;->b:[B

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update([B)V

    iget-object v0, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    iput-object v0, p0, Lbt/a;->y:[B

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    iput v0, p0, Lbt/a;->E:I

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Creating HMac failed"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v2, p0, Lbt/a;->y:[B

    iget-object v3, p0, Lbt/a;->F:Lbt/b;

    iget-object v3, v3, Lbt/b;->a:Lat/w;

    invoke-static {v3}, Lbt/b;->a(Lat/w;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    iget-object v0, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    iget-object v0, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    iget-object v1, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update(Ljava/nio/ByteBuffer;)V

    iget-object v0, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    iget-object v1, p0, Lbt/a;->w:[B

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->update([B)V

    iget v0, p0, Lbt/a;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lbt/a;->E:I

    iget-object v1, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    int-to-byte v0, v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->update(B)V

    iget-object v0, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    invoke-virtual {v0}, Ljavax/crypto/Mac;->doFinal()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 1
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p0, v1, v2, v0}, Lbt/a;->read([BII)I

    move-result v3

    if-ne v3, v0, :cond_0

    .line 3
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0

    :cond_0
    const/4 v0, -0x1

    if-ne v3, v0, :cond_1

    return v3

    .line 4
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Reading failed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 5
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lbt/a;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 3

    .line 6
    :try_start_0
    iget v0, p0, Lbt/a;->E:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 7
    invoke-virtual {p0}, Lbt/a;->b()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p3, :cond_3

    .line 8
    iget-object v1, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_2

    .line 9
    iget v1, p0, Lbt/a;->E:I

    const/16 v2, 0xff

    if-ne v1, v2, :cond_1

    goto :goto_2

    .line 10
    :cond_1
    invoke-virtual {p0}, Lbt/a;->h()V

    :cond_2
    sub-int v1, p3, v0

    .line 11
    iget-object v2, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 12
    iget-object v2, p0, Lbt/a;->z:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, p1, p2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p2, v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_3
    :goto_2
    return v0

    :goto_3
    const/4 p2, 0x0

    .line 13
    iput-object p2, p0, Lbt/a;->x:Ljavax/crypto/Mac;

    .line 14
    new-instance p2, Ljava/io/IOException;

    const-string p3, "HkdfInputStream failed"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
