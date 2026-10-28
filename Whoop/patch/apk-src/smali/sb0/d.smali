.class public final Lsb0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lsb0/b;",
        "Lsb0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00032\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lsb0/d;",
        "Lod1/g;",
        "Lsb0/b;",
        "Lsb0/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lnm0/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lec3/l;",
        "Lsb0/e;",
        "k",
        "()Lec3/l;",
        "previousState",
        "action",
        "g",
        "(Lsb0/c;Lsb0/b;)Lsb0/c;",
        "",
        "manualRefresh",
        "i",
        "(Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
        "cacheResult",
        "h",
        "(Lpm0/a$c;)Lsb0/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Ltr2/n;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
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
.field private final a:Lnm0/e;

.field private final b:Ltr2/n;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lnm0/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsb0/d;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lsb0/d;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lsb0/d;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "AdvancedLabsInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lsb0/d;-><init>(Lnm0/e;Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method public static final synthetic c(Lsb0/d;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lsb0/d;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method

.method public static final synthetic d(Lsb0/d;Lsb0/c;Lsb0/b;)Lsb0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lsb0/d;->g(Lsb0/c;Lsb0/b;)Lsb0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lsb0/d;Lpm0/a$c;)Lsb0/c;
    .locals 0

    invoke-direct {p0, p1}, Lsb0/d;->h(Lpm0/a$c;)Lsb0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lsb0/d;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lsb0/d;->k()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lsb0/c;Lsb0/b;)Lsb0/c;
    .locals 9

    instance-of v0, p2, Lsb0/b$a;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p2, Lsb0/b$c;

    if-eqz v0, :cond_1

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lsb0/c;->b(Lsb0/c;Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILjava/lang/Object;)Lsb0/c;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, p1

    instance-of p1, p2, Lsb0/b$d;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lsb0/d;->b:Ltr2/n;

    check-cast p2, Lsb0/b$d;

    invoke-virtual {p2}, Lsb0/b$d;->a()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v2, Lsb0/a$d;->a:Lsb0/a$d;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lsb0/c;->b(Lsb0/c;Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILjava/lang/Object;)Lsb0/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p2, Lsb0/b$e;

    if-eqz p1, :cond_3

    check-cast p2, Lsb0/b$e;

    invoke-virtual {p2}, Lsb0/b$e;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lsb0/c;->b(Lsb0/c;Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILjava/lang/Object;)Lsb0/c;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method

.method private final h(Lpm0/a$c;)Lsb0/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;",
            ">;)",
            "Lsb0/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lsb0/c;

    sget-object v2, Lsb0/a$d;->a:Lsb0/a$d;

    const/16 v6, 0x1d

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lsb0/c;-><init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Lsb0/c;

    sget-object v3, Lsb0/a$c;->a:Lsb0/a$c;

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lsb0/c;-><init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final i(Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabs/domain/GetAdvancedLabsRequest;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/domain/GetAdvancedLabsRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "AdvancedLabsScope"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lsb0/d;->a:Lnm0/e;

    new-instance v2, Lsb0/d$e;

    invoke-direct {v2, v3, v1}, Lsb0/d$e;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lsb0/d$f;

    invoke-direct {v1, v0, p1, p0}, Lsb0/d$f;-><init>(Lec3/l;ZLsb0/d;)V

    return-object v1
.end method

.method public static synthetic j(Lsb0/d;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lsb0/d;->i(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final k()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lsb0/d;->j(Lsb0/d;ZILjava/lang/Object;)Lec3/l;

    move-result-object v0

    new-instance v1, Lsb0/d$g;

    invoke-direct {v1, v2}, Lsb0/d$g;-><init>(Lq83/d;)V

    invoke-static {v0, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    new-instance v0, Lsb0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lsb0/d$a;-><init>(Lq83/d;Lsb0/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lsb0/c;

    sget-object v4, Lsb0/a$b;->a:Lsb0/a$b;

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lsb0/c;-><init>(Ljava/lang/String;Lsb0/a;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsResponse;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lsb0/d$d;

    invoke-direct {v0, p0, v1}, Lsb0/d$d;-><init>(Lsb0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
