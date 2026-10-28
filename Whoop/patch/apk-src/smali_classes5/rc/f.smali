.class public abstract Lrc/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xf

    const/16 v1, 0xe

    const/16 v2, 0xd

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lrc/f;->a:[I

    return-void
.end method

.method public static a([I[I)Lrc/e;
    .locals 12

    new-instance v0, Lrc/e;

    new-instance v1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    array-length v2, p0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x5

    const/16 v6, 0x27

    if-ge v4, v2, :cond_1

    aget v7, p0, v4

    :try_start_0
    invoke-virtual {v1, v7}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v8

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v9

    sget-object v10, Lrc/e;->b:Ljava/lang/String;

    sget-object v10, Lrc/e;->b:Ljava/lang/String;

    const-string v11, "Ignoring adding capability \'"

    invoke-static {v11, v7, v6}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v6

    iget v7, v9, Lic/w;->a:I

    if-gt v7, v5, :cond_0

    invoke-static {v10, v6, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_2
    const/4 v4, 0x3

    if-ge v2, v4, :cond_3

    sget-object v4, Lrc/f;->a:[I

    aget v4, v4, v2

    invoke-static {p0, v4}, Lm83/n;->Z([II)Z

    move-result v7

    if-nez v7, :cond_2

    :try_start_1
    invoke-virtual {v1, v4}, Landroid/net/NetworkRequest$Builder;->removeCapability(I)Landroid/net/NetworkRequest$Builder;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v7

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v8

    sget-object v9, Lrc/e;->b:Ljava/lang/String;

    sget-object v9, Lrc/e;->b:Ljava/lang/String;

    const-string v10, "Ignoring removing default capability \'"

    invoke-static {v10, v4, v6}, Lr80/c;->o(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v4

    iget v8, v8, Lic/w;->a:I

    if-gt v8, v5, :cond_2

    invoke-static {v9, v4, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    array-length p0, p1

    :goto_4
    if-ge v3, p0, :cond_4

    aget v2, p1, v3

    invoke-virtual {v1, v2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    return-object v0
.end method

.method public static final b(Landroid/net/NetworkRequest;)[I
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lrc/d;->a(Landroid/net/NetworkRequest;)[I

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0x1e

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget v4, v1, v3

    invoke-virtual {p0, v4}, Landroid/net/NetworkRequest;->hasCapability(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object p0

    return-object p0

    :array_0
    .array-data 4
        0x11
        0x5
        0x2
        0xa
        0x1d
        0x13
        0x3
        0x20
        0x7
        0x4
        0xc
        0x24
        0x17
        0x0
        0x21
        0x14
        0xb
        0xd
        0x12
        0x15
        0xf
        0x23
        0x22
        0x8
        0x1
        0x19
        0xe
        0x10
        0x6
        0x9
    .end array-data
.end method

.method public static final c(Landroid/net/NetworkRequest;)[I
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lrc/d;->b(Landroid/net/NetworkRequest;)[I

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v0, 0xa

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget v4, v1, v3

    invoke-virtual {p0, v4}, Landroid/net/NetworkRequest;->hasTransport(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object p0

    return-object p0

    :array_0
    .array-data 4
        0x2
        0x0
        0x3
        0x6
        0xa
        0x9
        0x8
        0x4
        0x1
        0x5
    .end array-data
.end method
