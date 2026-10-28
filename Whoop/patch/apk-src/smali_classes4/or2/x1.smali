.class public interface abstract Lor2/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/x1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008f\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lor2/x1;",
        "",
        "",
        "bytes",
        "Ljava/util/UUID;",
        "b",
        "([B)Ljava/util/UUID;",
        "c",
        "(Ljava/util/UUID;)[B",
        "a",
        "()Ljava/util/UUID;",
        "",
        "name",
        "d",
        "(Ljava/lang/String;)Ljava/util/UUID;",
        "e",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lor2/x1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lor2/x1$a;->a:Lor2/x1$a;

    sput-object v0, Lor2/x1;->a:Lor2/x1$a;

    return-void
.end method

.method private b([B)Ljava/util/UUID;
    .locals 8

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    :goto_0
    const/16 v5, 0x8

    if-ge v2, v5, :cond_0

    shl-long/2addr v3, v5

    aget-byte v5, p1, v2

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_1
    const/16 v6, 0x10

    if-ge v2, v6, :cond_1

    shl-long/2addr v0, v5

    aget-byte v6, p1, v2

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    or-long/2addr v0, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/util/UUID;

    invoke-direct {p1, v3, v4, v0, v1}, Ljava/util/UUID;-><init>(JJ)V

    return-object p1
.end method

.method private c(Ljava/util/UUID;)[B
    .locals 10

    const/16 v0, 0x10

    new-array v1, v0, [B

    invoke-virtual {p1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v4

    const/4 p1, 0x0

    :goto_0
    const-wide/16 v6, 0xff

    const/16 v8, 0x8

    if-ge p1, v8, :cond_0

    rsub-int/lit8 v9, p1, 0x7

    mul-int/2addr v9, v8

    shr-long v8, v2, v9

    and-long/2addr v6, v8

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v8

    :goto_1
    if-ge p1, v0, :cond_1

    rsub-int/lit8 v2, p1, 0xf

    mul-int/2addr v2, v8

    shr-long v2, v4, v2

    and-long/2addr v2, v6

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method


# virtual methods
.method public abstract a()Ljava/util/UUID;
.end method

.method public d(Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "SHA-1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lor2/x1$a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-direct {p0, v1}, Lor2/x1;->c(Ljava/util/UUID;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const/4 v0, 0x6

    aget-byte v1, p1, v0

    and-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    or-int/lit8 v1, v1, 0x50

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    const/16 v0, 0x8

    aget-byte v1, p1, v0

    and-int/lit8 v1, v1, 0x3f

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    or-int/lit8 v1, v1, -0x80

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    invoke-direct {p0, p1}, Lor2/x1;->b([B)Ljava/util/UUID;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot generate UUID v5 without SHA-1"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public e(Ljava/lang/String;)Ljava/util/UUID;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "SHA-512"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lor2/x1$a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-direct {p0, v1}, Lor2/x1;->c(Ljava/util/UUID;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const/4 v0, 0x6

    aget-byte v1, p1, v0

    and-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    or-int/lit8 v1, v1, -0x80

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    const/16 v0, 0x8

    aget-byte v1, p1, v0

    and-int/lit8 v1, v1, 0x3f

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    or-int/lit8 v1, v1, -0x80

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    invoke-direct {p0, p1}, Lor2/x1;->b([B)Ljava/util/UUID;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot generate UUID v8 without SHA-512"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
