.class public final Lji0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/r;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0010\u001a\u00020\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lji0/g;",
        "Lj02/r;",
        "Lji0/f;",
        "config",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V",
        "",
        "d",
        "()Z",
        "",
        "Lcom/whoop/appconfiguration/TabConfiguration;",
        "tabs",
        "c",
        "(Ljava/util/List;)Z",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Lec3/l;",
        "b",
        "Lec3/l;",
        "suppressHomeFetchNoDeviceFlow",
        "Lec3/f2;",
        "Lec3/f2;",
        "isAvailable",
        "()Lec3/f2;",
        "app-configuration_release"
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

.field private final b:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final c:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V
    .locals 4

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lji0/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {p2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object p2

    new-instance v0, Lji0/g$b;

    invoke-direct {v0, p2}, Lji0/g$b;-><init>(Lec3/l;)V

    new-instance p2, Lji0/g$c;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v1}, Lji0/g$c;-><init>(Lji0/g;Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, p2, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p2

    iput-object p2, p0, Lji0/g;->b:Lec3/l;

    invoke-interface {p1}, Lji0/f;->d()Lec3/f2;

    move-result-object v0

    new-instance v2, Lji0/g$a;

    invoke-direct {v2, p0, v1}, Lji0/g$a;-><init>(Lji0/g;Lq83/d;)V

    new-instance v1, Lec3/l1;

    const/4 v3, 0x1

    invoke-direct {v1, p2, v0, v2, v3}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p2

    invoke-direct {p0}, Lji0/g;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lji0/f;->d()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lji0/g;->c(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    invoke-static {p2, p3, v0, p1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lji0/g;->c:Lec3/f2;

    return-void
.end method

.method public static final synthetic a(Lji0/g;Ljava/util/List;)Z
    .locals 0

    invoke-direct {p0, p1}, Lji0/g;->c(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lji0/g;)Z
    .locals 0

    invoke-direct {p0}, Lji0/g;->d()Z

    move-result p0

    return p0
.end method

.method private final c(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/appconfiguration/TabConfiguration;",
            ">;)Z"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v0}, Lcom/whoop/appconfiguration/TabConfiguration;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    sget-object v2, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method private final d()Z
    .locals 2

    iget-object v0, p0, Lji0/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "suppress-home-fetch-no-device-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public isAvailable()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lji0/g;->c:Lec3/f2;

    return-object v0
.end method
