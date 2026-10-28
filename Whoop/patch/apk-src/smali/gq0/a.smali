.class public final Lgq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u0014*\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lgq0/a;",
        "Lj02/g;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lnm0/e;",
        "cachedApiSource",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lhj0/d;",
        "applicationLifecycle",
        "Lod1/a0;",
        "userSessionManager",
        "Lyp0/a;",
        "communityAccessChecker",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnm0/e;Lwm0/a;Lhj0/d;Lod1/a0;Lyp0/a;Lbc3/c0;)V",
        "Lpm0/a;",
        "Lcom/whoop/community/data/network/BadgingResponse;",
        "",
        "d",
        "(Lpm0/a;)Z",
        "a",
        "Lyp0/a;",
        "Lec3/f2;",
        "b",
        "Lec3/f2;",
        "()Lec3/f2;",
        "showCommunityBadge",
        "community_release"
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
.field private final a:Lyp0/a;

.field private final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnm0/e;Lwm0/a;Lhj0/d;Lod1/a0;Lyp0/a;Lbc3/c0;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationLifecycle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityAccessChecker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p6, p0, Lgq0/a;->a:Lyp0/a;

    invoke-interface {p1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object p1

    new-instance p6, Lgq0/a$f;

    invoke-direct {p6, p1}, Lgq0/a$f;-><init>(Lec3/l;)V

    invoke-static {p6}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance p6, Lgq0/a$e;

    const/4 v0, 0x0

    invoke-direct {p6, v0, p2, p0}, Lgq0/a$e;-><init>(Lq83/d;Lnm0/e;Lgq0/a;)V

    invoke-static {p1, p6}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    sget-object p6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p7, p2, p6}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lgq0/a;->b:Lec3/f2;

    invoke-virtual {p4}, Lhj0/d;->d()Lec3/f2;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance p4, Lgq0/a$d;

    invoke-direct {p4, p1}, Lgq0/a$d;-><init>(Lec3/l;)V

    invoke-interface {p5}, Lod1/a0;->i()Lec3/t1;

    move-result-object p1

    const/4 p5, 0x2

    new-array p5, p5, [Lec3/l;

    const/4 p6, 0x0

    aput-object p4, p5, p6

    aput-object p1, p5, p2

    invoke-static {p5}, Lec3/v;->J([Lec3/l;)Lec3/h;

    move-result-object p1

    new-instance p2, Lgq0/a$a;

    invoke-direct {p2, p3, v0}, Lgq0/a$a;-><init>(Lwm0/a;Lq83/d;)V

    new-instance p3, Lec3/j1;

    invoke-direct {p3, p1, p2, p6}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {p3, p7}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method public static final synthetic b(Lgq0/a;)Lyp0/a;
    .locals 0

    iget-object p0, p0, Lgq0/a;->a:Lyp0/a;

    return-object p0
.end method

.method public static final synthetic c(Lgq0/a;Lpm0/a;)Z
    .locals 0

    invoke-direct {p0, p1}, Lgq0/a;->d(Lpm0/a;)Z

    move-result p0

    return p0
.end method

.method private final d(Lpm0/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/community/data/network/BadgingResponse;",
            ">;)Z"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$a;

    if-eqz v0, :cond_0

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/data/network/BadgingResponse;

    invoke-virtual {p1}, Lcom/whoop/community/data/network/BadgingResponse;->getShowCommunityBadge()Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lpm0/a$d;

    if-eqz v0, :cond_1

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/data/network/BadgingResponse;

    invoke-virtual {p1}, Lcom/whoop/community/data/network/BadgingResponse;->getShowCommunityBadge()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public a()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lgq0/a;->b:Lec3/f2;

    return-object v0
.end method
