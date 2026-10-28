.class public final Lml0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J#\u0010\u000c\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lml0/b;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "args",
        "a",
        "(Ljava/util/Map;)Ljava/lang/String;",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "Lj02/i0;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "bot_release"
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
.field private final a:Lj02/i0;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lml0/b;->a:Lj02/i0;

    .line 3
    iput-object p2, p0, Lml0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 4
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lml0/b;-><init>(Lj02/i0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method private final a(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    sget-object p1, Lad3/c;->d:Lad3/b;

    sget-object v2, Lkotlinx/serialization/json/JsonElement;->Companion:Lad3/l;

    invoke-virtual {v2}, Lad3/l;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/j;

    invoke-virtual {p1, v2, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v1
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 13

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$z;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lml0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "whoop-coach-tool-calling-mobile"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lj02/j0$c;

    iget-object v0, p0, Lml0/b;->a:Lj02/i0;

    const-string v1, "android-app://com.whoop/whoop-coach"

    invoke-virtual {v0, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v0

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object v1

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {p1, v0, v1, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object p1

    :cond_0
    check-cast p1, Lj02/m0$z;

    invoke-virtual {p1}, Lj02/m0$z;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$z;->e()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-static {v1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj02/m0$z;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lj02/m0$z;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$z;->j()Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    if-nez v4, :cond_1

    move-object v4, v5

    :cond_1
    invoke-virtual {p1}, Lj02/m0$z;->k()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    move-object v6, v5

    :cond_2
    invoke-virtual {p1}, Lj02/m0$z;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lj02/m0$z;->f()Z

    move-result v8

    invoke-virtual {p1}, Lj02/m0$z;->i()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lj02/m0$z;->h()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_0

    :cond_3
    move-object v5, v10

    :goto_0
    invoke-virtual {p1}, Lj02/m0$z;->b()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0, p1}, Lml0/b;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-string v10, "&hint="

    const-string v11, "&contextualMessage="

    const-string v12, "android-app://com.whoop/ai-coach?suggestion="

    invoke-static {v12, v0, v10, v1, v11}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&conversationIdSeed="

    const-string v10, "&sourcePillar="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&sourceType="

    const-string v2, "&includeInitialMessage="

    invoke-static {v0, v4, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "&sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v7, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "&presetQuestion="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "&args="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "&source="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lml0/b;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    new-instance v0, Lj02/j0$c;

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object v1

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v0, p1, v1, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v0

    :cond_6
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
