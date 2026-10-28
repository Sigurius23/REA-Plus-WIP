.class public final Lor2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lor2/f;",
        "",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "<init>",
        "(Lor2/y;Lcom/whoop/data/repositories/FeatureFlagRepository;)V",
        "",
        "url",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lor2/y;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "c",
        "feature_release"
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
.field public static final c:Lor2/f$a;

.field public static final d:I

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lor2/y;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lor2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lor2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lor2/f;->c:Lor2/f$a;

    const/16 v0, 0x8

    sput v0, Lor2/f;->d:I

    const-string v0, "app.dev.whoop.com"

    const-string v1, "app.qa.whoop.com"

    const-string v2, "app.whoop.com"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lor2/f;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lor2/y;Lcom/whoop/data/repositories/FeatureFlagRepository;)V
    .locals 1

    const-string v0, "externalLinkNavigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/f;->a:Lor2/y;

    iput-object p2, p0, Lor2/f;->b:Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lor2/f;->b:Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-string v2, "generate-authenticated-url-in-authenticated-web-view-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lor2/f;->e:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/login-token.html"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "/"

    if-eqz v1, :cond_2

    const-string v1, "for"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lor2/f;->a:Lor2/y;

    invoke-virtual {v1, v0}, Lor2/y;->d(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    return-object v0

    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v3, ""

    if-eqz v1, :cond_3

    invoke-static {v1, v2}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_1
    invoke-virtual {v0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const-string v2, "?"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v3, v0

    :cond_5
    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lor2/f;->a:Lor2/y;

    invoke-virtual {v1, v0}, Lor2/y;->d(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    return-object v0

    :cond_7
    :goto_3
    return-object p1
.end method
