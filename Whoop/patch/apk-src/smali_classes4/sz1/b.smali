.class public final Lsz1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lsz1/b;",
        "Lj02/k0;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Lj02/i0;",
        "native-store_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lj02/i0;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsz1/b;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Lsz1/b;->b:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lj02/i0;

    invoke-direct {p2}, Lj02/i0;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lsz1/b;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/i0;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 5

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$i3;

    if-eqz v0, :cond_5

    check-cast p1, Lj02/m0$i3;

    invoke-virtual {p1}, Lj02/m0$i3;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    const-string v0, "unknown_source"

    :cond_2
    iget-object v1, p0, Lsz1/b;->b:Lj02/i0;

    const-string v2, "android-app://com.whoop/nativeStore?source="

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$i3;->d()Leb/x0;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lj02/m0$i3;->e()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lsz1/b;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {p1, v1}, Lmz1/d;->c(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->e(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v1

    goto :goto_1

    :cond_3
    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->d(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v1

    :cond_4
    :goto_1
    new-instance p1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {p1, v0, v1, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object p1

    :cond_5
    instance-of v0, p1, Lj02/m0$u3;

    if-eqz v0, :cond_8

    check-cast p1, Lj02/m0$u3;

    invoke-virtual {p1}, Lj02/m0$u3;->c()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$u3;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-eqz v2, :cond_6

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "&sku="

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    goto :goto_2

    :cond_6
    move-object v2, v3

    :goto_2
    invoke-virtual {p1}, Lj02/m0$u3;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "&source="

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    move-object v3, p1

    :cond_7
    iget-object p1, p0, Lsz1/b;->b:Lj02/i0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/nativeShopPdp?slug="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    invoke-static {v0}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v0

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_8
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
