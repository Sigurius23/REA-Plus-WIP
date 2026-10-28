.class public abstract Lvm2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lj02/m0;",
        "other",
        "",
        "b",
        "(Lj02/m0;Lj02/m0;)Z",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "a",
        "(Lj02/m0;)Lcom/whoop/navigation/models/ApiRequest;",
        "app_prodStandardRelease"
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
.method private static final a(Lj02/m0;)Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    instance-of v0, p0, Lj02/m0$m1;

    if-eqz v0, :cond_0

    check-cast p0, Lj02/m0$m1;

    invoke-virtual {p0}, Lj02/m0$m1;->l()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lj02/m0$e5;

    if-eqz v0, :cond_1

    check-cast p0, Lj02/m0$e5;

    invoke-virtual {p0}, Lj02/m0$e5;->j()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lj02/m0;Lj02/m0;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lvm2/n;->a(Lj02/m0;)Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v0

    invoke-static {p1}, Lvm2/n;->a(Lj02/m0;)Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->getMethod()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object p0

    invoke-virtual {v1}, Lcom/whoop/navigation/models/ApiRequest;->getMethod()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return v3

    :cond_0
    return v2

    :cond_1
    instance-of v0, p0, Lj02/m0$i3;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lj02/m0$i3;

    if-eqz v0, :cond_2

    check-cast p0, Lj02/m0$i3;

    invoke-virtual {p0}, Lj02/m0$i3;->e()Ljava/lang/String;

    move-result-object p0

    check-cast p1, Lj02/m0$i3;

    invoke-virtual {p1}, Lj02/m0$i3;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return v3

    :cond_3
    return v2
.end method
