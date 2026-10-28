.class public abstract Los/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Los/d;->c(II)V

    const/4 v0, 0x2

    invoke-static {v1, v0}, Los/d;->c(II)V

    const/16 v2, 0x20

    invoke-static {v0, v2}, Los/d;->c(II)V

    const/16 v2, 0x10

    invoke-static {v0, v2}, Los/d;->c(II)V

    const/16 v2, 0x11

    invoke-static {v0, v2}, Los/d;->c(II)V

    const/16 v2, 0x12

    invoke-static {v0, v2}, Los/d;->c(II)V

    invoke-static {v0, v1}, Los/d;->c(II)V

    invoke-static {v0, v0}, Los/d;->c(II)V

    const/4 v2, 0x3

    invoke-static {v0, v2}, Los/d;->c(II)V

    invoke-static {v0, v1}, Los/d;->c(II)V

    invoke-static {v0, v0}, Los/d;->c(II)V

    invoke-static {v0, v2}, Los/d;->c(II)V

    sget-object v0, Lcom/google/crypto/tink/internal/r0;->a:Ljava/nio/charset/Charset;

    const-string v1, "KEM"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v1, "HPKE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v1, "HPKE-v1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    return-void
.end method

.method public static a(Lns/k;)I
    .locals 2

    sget-object v0, Lns/k;->G:Lns/k;

    const/16 v1, 0x20

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lns/k;->z:Lns/k;

    if-ne p0, v0, :cond_1

    return v1

    :cond_1
    sget-object v0, Lns/k;->E:Lns/k;

    if-ne p0, v0, :cond_2

    const/16 p0, 0x30

    return p0

    :cond_2
    sget-object v0, Lns/k;->F:Lns/k;

    if-ne p0, v0, :cond_3

    const/16 p0, 0x42

    return p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lns/k;)I
    .locals 1

    sget-object v0, Lns/k;->G:Lns/k;

    if-ne p0, v0, :cond_0

    const/16 p0, 0x20

    return p0

    :cond_0
    sget-object v0, Lns/k;->z:Lns/k;

    if-ne p0, v0, :cond_1

    const/16 p0, 0x41

    return p0

    :cond_1
    sget-object v0, Lns/k;->E:Lns/k;

    if-ne p0, v0, :cond_2

    const/16 p0, 0x61

    return p0

    :cond_2
    sget-object v0, Lns/k;->F:Lns/k;

    if-ne p0, v0, :cond_3

    const/16 p0, 0x85

    return p0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(II)V
    .locals 4

    const/4 v0, 0x4

    if-gt p0, v0, :cond_3

    if-ltz p0, :cond_3

    if-ltz p1, :cond_2

    const/4 v1, 0x1

    if-ge p0, v0, :cond_0

    mul-int/lit8 v0, p0, 0x8

    shl-int v0, v1, v0

    if-ge p1, v0, :cond_2

    :cond_0
    new-array v0, p0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_1

    sub-int v3, p0, v2

    sub-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x8

    shr-int v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "value too large"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "capacity must be between 0 and 4"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lns/k;)Lat/p;
    .locals 1

    sget-object v0, Lns/k;->z:Lns/k;

    if-ne p0, v0, :cond_0

    sget-object p0, Lat/p;->w:Lat/p;

    return-object p0

    :cond_0
    sget-object v0, Lns/k;->E:Lns/k;

    if-ne p0, v0, :cond_1

    sget-object p0, Lat/p;->x:Lat/p;

    return-object p0

    :cond_1
    sget-object v0, Lns/k;->F:Lns/k;

    if-ne p0, v0, :cond_2

    sget-object p0, Lat/p;->y:Lat/p;

    return-object p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unrecognized NIST HPKE KEM identifier"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
