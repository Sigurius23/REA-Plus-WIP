.class public final Lnm0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ3\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\u0008\u0000\u0010\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00018\u00002\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J(\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018JI\u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00100\u001a\"\u0004\u0008\u0000\u0010\u000c2\u0006\u0010\u0019\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u000e0\u001a2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001a\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lnm0/d;",
        "",
        "Lqm0/a;",
        "cacheDecoder",
        "Lxm0/b;",
        "cacheUpdater",
        "Lvm0/g;",
        "cacheReporter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lqm0/a;Lxm0/b;Lvm0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "ResponseT",
        "cachedData",
        "Lxm0/a;",
        "apiStreamResult",
        "Lpm0/a;",
        "d",
        "(Ljava/lang/Object;Lxm0/a;)Lpm0/a;",
        "Lmm0/b;",
        "entry",
        "Ls63/a;",
        "type",
        "e",
        "(Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;",
        "responseTypeInfo",
        "Lec3/l;",
        "apiStreamResultFlow",
        "Lym0/b;",
        "cacheStreamResultFlow",
        "c",
        "(Ls63/a;Lec3/l;Lec3/l;)Lec3/l;",
        "a",
        "Lqm0/a;",
        "b",
        "Lxm0/b;",
        "Lvm0/g;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "cache_release"
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
.field private final a:Lqm0/a;

.field private final b:Lxm0/b;

.field private final c:Lvm0/g;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lqm0/a;Lxm0/b;Lvm0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "cacheDecoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheUpdater"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm0/d;->a:Lqm0/a;

    iput-object p2, p0, Lnm0/d;->b:Lxm0/b;

    iput-object p3, p0, Lnm0/d;->c:Lvm0/g;

    iput-object p4, p0, Lnm0/d;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static final synthetic a(Lnm0/d;Ljava/lang/Object;Lxm0/a;)Lpm0/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lnm0/d;->d(Ljava/lang/Object;Lxm0/a;)Lpm0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lnm0/d;Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lnm0/d;->e(Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/Object;Lxm0/a;)Lpm0/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(TResponseT;",
            "Lxm0/a<",
            "TResponseT;>;)",
            "Lpm0/a<",
            "TResponseT;>;"
        }
    .end annotation

    instance-of v0, p2, Lxm0/a$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p2, Lpm0/a$a$b;

    invoke-direct {p2, p1}, Lpm0/a$a$b;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_0
    new-instance p1, Lpm0/a$e;

    invoke-direct {p1, v1}, Lpm0/a$e;-><init>(I)V

    return-object p1

    :cond_1
    instance-of v0, p2, Lxm0/a$a;

    if-eqz v0, :cond_6

    instance-of v0, p2, Lxm0/a$a$b;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lxm0/a$a$b;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lxm0/a$a$b;->b()I

    move-result v1

    :cond_3
    if-eqz p1, :cond_4

    new-instance v0, Lpm0/a$d;

    check-cast p2, Lxm0/a$a;

    invoke-virtual {p2}, Lxm0/a$a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, v1, p1}, Lpm0/a$d;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    return-object v0

    :cond_4
    instance-of p1, p2, Lxm0/a$a$a;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lnm0/d;->c:Lvm0/g;

    invoke-interface {p1}, Lvm0/g;->e()V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lnm0/d;->c:Lvm0/g;

    invoke-interface {p1, v1}, Lvm0/g;->g(I)V

    :goto_1
    new-instance p1, Lpm0/a$c;

    check-cast p2, Lxm0/a$a;

    invoke-virtual {p2}, Lxm0/a$a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1}, Lpm0/a$c;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_6
    instance-of p1, p2, Lxm0/a$c;

    if-eqz p1, :cond_7

    new-instance p1, Lpm0/a$a$a;

    check-cast p2, Lxm0/a$c;

    invoke-virtual {p2}, Lxm0/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p1, p2}, Lpm0/a$a$a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unaccounted ApiStreamResult: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final e(Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lmm0/b;",
            "Ls63/a;",
            "Lq83/d<",
            "-TResponseT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lnm0/d$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lnm0/d$c;

    iget v1, v0, Lnm0/d$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnm0/d$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnm0/d$c;

    invoke-direct {v0, p0, p3}, Lnm0/d$c;-><init>(Lnm0/d;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lnm0/d$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnm0/d$c;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnm0/d$c;->y:Ljava/lang/Object;

    check-cast p1, Lkotlinx/serialization/SerializationException;

    iget-object p1, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    check-cast p1, Ls63/a;

    iget-object p1, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    check-cast p1, Lmm0/b;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    check-cast p1, Ls63/a;

    iget-object p1, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    check-cast p1, Lmm0/b;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_3
    iget-object p1, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    check-cast p1, Ls63/a;

    iget-object p1, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    check-cast p1, Lmm0/b;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_4
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lnm0/d;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "bff-cache-persistence"

    invoke-interface {p3, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_6

    iget-object p3, p0, Lnm0/d;->a:Lqm0/a;

    invoke-virtual {p1}, Lmm0/b;->a()Lne3/l;

    move-result-object p1

    iget-object p2, p2, Ls63/a;->b:Ljava/lang/reflect/Type;

    iput-object v6, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    iput v5, v0, Lnm0/d$c;->F:I

    invoke-virtual {p3, p1, p2, v0}, Lqm0/a;->b(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    return-object p1

    :cond_6
    :try_start_1
    iget-object p3, p0, Lnm0/d;->a:Lqm0/a;

    invoke-virtual {p1}, Lmm0/b;->a()Lne3/l;

    move-result-object v2

    iget-object p2, p2, Ls63/a;->b:Ljava/lang/reflect/Type;

    iput-object p1, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    iput v4, v0, Lnm0/d$c;->F:I

    invoke-virtual {p3, v2, p2, v0}, Lqm0/a;->b(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_7
    return-object p1

    :goto_1
    iget-object p3, p0, Lnm0/d;->c:Lvm0/g;

    invoke-virtual {p1}, Lmm0/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2, p2}, Lvm0/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p2, p0, Lnm0/d;->b:Lxm0/b;

    invoke-virtual {p1}, Lmm0/b;->d()Ljava/lang/String;

    move-result-object p1

    iput-object v6, v0, Lnm0/d$c;->w:Ljava/lang/Object;

    iput-object v6, v0, Lnm0/d$c;->x:Ljava/lang/Object;

    iput-object v6, v0, Lnm0/d$c;->y:Ljava/lang/Object;

    iput v3, v0, Lnm0/d$c;->F:I

    invoke-virtual {p2, p1, v0}, Lxm0/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    :goto_3
    return-object v6
.end method


# virtual methods
.method public final c(Ls63/a;Lec3/l;Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Ls63/a;",
            "Lec3/l;",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "responseTypeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiStreamResultFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheStreamResultFlow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p0, p1}, Lnm0/d$a;-><init>(Lq83/d;Lec3/l;Lnm0/d;Ls63/a;)V

    invoke-static {p3, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
