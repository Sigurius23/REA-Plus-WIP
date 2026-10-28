.class public abstract Lwg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    :try_start_0
    new-instance v0, Lwg/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lwg/a;-><init>(I)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/String;

    array-length v1, p0

    new-array v2, v1, [C

    const/4 v3, 0x0

    :goto_0
    if-eq v3, v1, :cond_0

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    int-to-char v4, v4

    aput-char v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static b([B)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    array-length v3, p0

    const/16 v4, 0xc0

    const/16 v5, 0xe0

    const/16 v6, 0xf0

    if-ge v1, v3, :cond_3

    add-int/lit8 v3, v2, 0x1

    aget-byte v7, p0, v1

    and-int/lit16 v8, v7, 0xf0

    if-ne v8, v6, :cond_0

    add-int/lit8 v2, v2, 0x2

    add-int/lit8 v1, v1, 0x4

    goto :goto_0

    :cond_0
    and-int/lit16 v2, v7, 0xe0

    if-ne v2, v5, :cond_1

    add-int/lit8 v1, v1, 0x3

    :goto_1
    move v2, v3

    goto :goto_0

    :cond_1
    and-int/lit16 v2, v7, 0xc0

    if-ne v2, v4, :cond_2

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    new-array v1, v2, [C

    move v2, v0

    :goto_2
    array-length v3, p0

    if-ge v0, v3, :cond_8

    aget-byte v3, p0, v0

    and-int/lit16 v7, v3, 0xf0

    if-ne v7, v6, :cond_4

    and-int/lit8 v3, v3, 0x3

    shl-int/lit8 v3, v3, 0x12

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, p0, v7

    and-int/lit8 v7, v7, 0x3f

    shl-int/lit8 v7, v7, 0xc

    or-int/2addr v3, v7

    add-int/lit8 v7, v0, 0x2

    aget-byte v7, p0, v7

    and-int/lit8 v7, v7, 0x3f

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v3, v7

    add-int/lit8 v7, v0, 0x3

    aget-byte v7, p0, v7

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v3, v7

    const/high16 v7, 0x10000

    sub-int/2addr v3, v7

    shr-int/lit8 v7, v3, 0xa

    const v8, 0xd800

    or-int/2addr v7, v8

    int-to-char v7, v7

    and-int/lit16 v3, v3, 0x3ff

    const v8, 0xdc00

    or-int/2addr v3, v8

    int-to-char v3, v3

    add-int/lit8 v8, v2, 0x1

    aput-char v7, v1, v2

    add-int/lit8 v0, v0, 0x4

    move v2, v8

    goto :goto_4

    :cond_4
    and-int/lit16 v7, v3, 0xe0

    if-ne v7, v5, :cond_5

    and-int/lit8 v3, v3, 0xf

    shl-int/lit8 v3, v3, 0xc

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, p0, v7

    and-int/lit8 v7, v7, 0x3f

    shl-int/lit8 v7, v7, 0x6

    or-int/2addr v3, v7

    add-int/lit8 v7, v0, 0x2

    aget-byte v7, p0, v7

    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v3, v7

    int-to-char v3, v3

    add-int/lit8 v0, v0, 0x3

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v3, 0xd0

    const/16 v8, 0xd0

    if-ne v7, v8, :cond_6

    and-int/lit8 v3, v3, 0x1f

    shl-int/lit8 v3, v3, 0x6

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, p0, v7

    :goto_3
    and-int/lit8 v7, v7, 0x3f

    or-int/2addr v3, v7

    int-to-char v3, v3

    add-int/lit8 v0, v0, 0x2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v3, 0xc0

    if-ne v7, v4, :cond_7

    and-int/lit8 v3, v3, 0x1f

    shl-int/lit8 v3, v3, 0x6

    add-int/lit8 v7, v0, 0x1

    aget-byte v7, p0, v7

    goto :goto_3

    :cond_7
    and-int/lit16 v3, v3, 0xff

    int-to-char v3, v3

    add-int/lit8 v0, v0, 0x1

    :goto_4
    add-int/lit8 v7, v2, 0x1

    aput-char v3, v1, v2

    move v2, v7

    goto/16 :goto_2

    :cond_8
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method
