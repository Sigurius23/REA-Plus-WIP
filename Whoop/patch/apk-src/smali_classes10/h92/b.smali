.class public abstract Lh92/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/domain/model/WhoopUri;",
        "",
        "d",
        "(Lcom/whoop/domain/model/WhoopUri;)Z",
        "isPasswordReset",
        "c",
        "isNewPasswordReset",
        "feature_release"
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
.method public static final synthetic a(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 0

    invoke-static {p0}, Lh92/b;->c(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 0

    invoke-static {p0}, Lh92/b;->d(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 2

    invoke-interface {p0}, Lcom/whoop/domain/model/WhoopUri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lcom/whoop/domain/model/WhoopUri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    const-string v0, "reset-password-v2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-ne p0, v1, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final d(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 1

    invoke-interface {p0}, Lcom/whoop/domain/model/WhoopUri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const-string v0, "password_reset"

    invoke-static {p0, v0}, Lor2/o1;->a(Ljava/lang/Iterable;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method
