.class public abstract Lrc/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/net/NetworkRequest;)[I
    .locals 1

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/net/NetworkRequest;->getCapabilities()[I

    move-result-object p0

    const-string v0, "getCapabilities(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static b(Landroid/net/NetworkRequest;)[I
    .locals 1

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/net/NetworkRequest;->getTransportTypes()[I

    move-result-object p0

    const-string v0, "getTransportTypes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
