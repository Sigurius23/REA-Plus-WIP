.class public abstract Ljk0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "",
        "",
        "a",
        "(I)Ljava/lang/String;",
        "connectivity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(I)Ljava/lang/String;
    .locals 2

    const-string v0, "]"

    if-eqz p0, :cond_9

    const/16 v1, 0xd

    if-eq p0, v1, :cond_8

    const/16 v1, 0xf

    if-eq p0, v1, :cond_7

    const/16 v1, 0x8f

    if-eq p0, v1, :cond_6

    const/16 v1, 0x101

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x5

    if-eq p0, v1, :cond_2

    const/4 v1, 0x6

    if-eq p0, v1, :cond_1

    const/4 v1, 0x7

    if-eq p0, v1, :cond_0

    const-string v1, "Unknown status: ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v1, "GATT_INVALID_OFFSET ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v1, "GATT_REQUEST_NOT_SUPPORTED ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string v1, "GATT_INSUFFICIENT_AUTHENTICATION ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v1, "GATT_WRITE_NOT_PERMITTED ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const-string v1, "GATT_READ_NOT_PERMITTED ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string v1, "GATT_FAILURE ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const-string v1, "GATT_CONNECTION_CONGESTED ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const-string v1, "GATT_INSUFFICIENT_ENCRYPTION ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    const-string v1, "GATT_INVALID_ATTRIBUTE_LENGTH ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    const-string v1, "GATT_SUCCESS ["

    invoke-static {p0, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
