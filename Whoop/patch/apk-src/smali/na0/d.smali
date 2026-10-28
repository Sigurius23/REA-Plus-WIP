.class public final Lna0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lna0/b;",
        "Lna0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lna0/d;",
        "Lod1/g;",
        "Lna0/b;",
        "Lna0/c;",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "state",
        "action",
        "j",
        "(Lna0/c;Lna0/b;)Lna0/c;",
        "",
        "testId",
        "Lec3/l;",
        "h",
        "(Ljava/lang/String;)Lec3/l;",
        "g",
        "i",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "b",
        "Lnm0/e;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "d",
        "Ltr2/n;",
        "advanced-labs_release"
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
.field private final a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final b:Lnm0/e;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lna0/d;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 3
    iput-object p2, p0, Lna0/d;->b:Lnm0/e;

    .line 4
    iput-object p3, p0, Lna0/d;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p4, p0, Lna0/d;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ActionPlanInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lna0/d;-><init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lnm0/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lna0/d;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lna0/d;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lna0/d;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lna0/d;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic e(Lna0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lna0/d;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lna0/d;Lna0/c;Lna0/b;)Lna0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lna0/d;->j(Lna0/c;Lna0/b;)Lna0/c;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabs/domain/GetActionPlanRequest;

    invoke-direct {v0, p1}, Lcom/whoop/advancedlabs/domain/GetActionPlanRequest;-><init>(Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "AdvancedLabsScope"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object v0, p0, Lna0/d;->b:Lnm0/e;

    new-instance v1, Lna0/d$a;

    invoke-direct {v1, v2, v0}, Lna0/d$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lna0/d$b;

    invoke-direct {v0, p1}, Lna0/d$b;-><init>(Lec3/l;)V

    return-object v0
.end method

.method private final h(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lna0/d;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "advanced-labs-android-caching"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lna0/d;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lna0/d;->i(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final i(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lna0/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lna0/d$c;-><init>(Lna0/d;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final j(Lna0/c;Lna0/b;)Lna0/c;
    .locals 1

    instance-of v0, p2, Lna0/b$c;

    if-eqz v0, :cond_2

    instance-of p2, p1, Lna0/c$c;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Lna0/c$c;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p2, 0x1

    invoke-static {p1, v0, p2, p2, v0}, Lna0/c$c;->b(Lna0/c$c;Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;ZILjava/lang/Object;)Lna0/c$c;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lna0/c$b;->a:Lna0/c$b;

    return-object p1

    :cond_2
    instance-of v0, p2, Lna0/b$a;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lna0/d;->d:Ltr2/n;

    check-cast p2, Lna0/b$a;

    invoke-virtual {p2}, Lna0/b$a;->a()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lna0/c$a;->a:Lna0/c$a;

    :cond_3
    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lna0/d$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lna0/d$e;-><init>(Lec3/l;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v0, Lna0/f;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lna0/f;-><init>(Ljava/lang/String;Lna0/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lna0/d$f;

    invoke-direct {v2, v1}, Lna0/d$f;-><init>(Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v3, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object v0

    new-instance v2, Lna0/d$d;

    invoke-direct {v2, v1, p0}, Lna0/d$d;-><init>(Lq83/d;Lna0/d;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    sget-object v2, Lna0/c$b;->a:Lna0/c$b;

    new-instance v3, Lna0/d$g;

    invoke-direct {v3, p0, v1}, Lna0/d$g;-><init>(Lna0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, v0, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
