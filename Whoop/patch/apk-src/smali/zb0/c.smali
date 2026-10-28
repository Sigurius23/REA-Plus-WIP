.class public final Lzb0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lzb0/a;",
        "Lzb0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lzb0/c;",
        "Lod1/g;",
        "Lzb0/a;",
        "Lzb0/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "",
        "testId",
        "Lec3/l;",
        "h",
        "(Ljava/lang/String;)Lec3/l;",
        "g",
        "i",
        "Lzb0/a$b;",
        "action",
        "j",
        "(Lzb0/a$b;Lq83/d;)Ljava/lang/Object;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
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
.field private final a:Lnm0/e;

.field private final b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzb0/c;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lzb0/c;->b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 4
    iput-object p3, p0, Lzb0/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p4, p0, Lzb0/c;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "EditTestDetailsInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lzb0/c;-><init>(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lzb0/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lzb0/c;->h(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lzb0/c;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lzb0/c;->b:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic e(Lzb0/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lzb0/c;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lzb0/c;Lzb0/a$b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzb0/c;->j(Lzb0/a$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabs/domain/GetEditTestDetailsRequest;

    invoke-direct {v0, p1}, Lcom/whoop/advancedlabs/domain/GetEditTestDetailsRequest;-><init>(Ljava/lang/String;)V

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

    iget-object v1, p0, Lzb0/c;->a:Lnm0/e;

    new-instance v2, Lzb0/c$a;

    invoke-direct {v2, v3, v1}, Lzb0/c$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lzb0/c$b;

    invoke-direct {v1, v0, p1}, Lzb0/c$b;-><init>(Lec3/l;Ljava/lang/String;)V

    return-object v1
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

    iget-object v0, p0, Lzb0/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "advanced-labs-android-caching"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lzb0/c;->g(Ljava/lang/String;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lzb0/c;->i(Ljava/lang/String;)Lec3/l;

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

    new-instance v0, Lzb0/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lzb0/c$c;-><init>(Lzb0/c;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final j(Lzb0/a$b;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb0/a$b;",
            "Lq83/d<",
            "-",
            "Lzb0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lzb0/c$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzb0/c$f;

    iget v1, v0, Lzb0/c$f;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzb0/c$f;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lzb0/c$f;

    invoke-direct {v0, p0, p2}, Lzb0/c$f;-><init>(Lzb0/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lzb0/c$f;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lzb0/c$f;->F:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lzb0/c$f;->y:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;

    iget-object p1, v6, Lzb0/c$f;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lzb0/c$f;->w:Ljava/lang/Object;

    check-cast p1, Lzb0/a$b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lzb0/a$b;->a()Lorg/joda/time/LocalDateTime;

    move-result-object p2

    invoke-virtual {p2}, Lorg/joda/time/LocalDateTime;->toDateTime()Lorg/joda/time/DateTime;

    move-result-object p2

    sget-object v1, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {p2, v1}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p2

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZZ"

    invoke-virtual {p2, v1}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;

    invoke-virtual {p1}, Lzb0/a$b;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v1, v3, p2}, Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, v1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lzb0/c;->d:Ltr2/n;

    new-instance v5, Lzb0/c$g;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p1, p2, v4}, Lzb0/c$g;-><init>(Lzb0/c;Lzb0/a$b;Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;Lq83/d;)V

    iput-object v4, v6, Lzb0/c$f;->w:Ljava/lang/Object;

    iput-object v4, v6, Lzb0/c$f;->x:Ljava/lang/Object;

    iput-object v4, v6, Lzb0/c$f;->y:Ljava/lang/Object;

    iput v3, v6, Lzb0/c$f;->F:I

    const/4 v3, 0x0

    const-string v4, "Failed to save test details"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    sget-object p1, Lzb0/b$e;->a:Lzb0/b$e;

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lzb0/b$c;->a:Lzb0/b$c;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lzb0/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lzb0/c$d;-><init>(Lq83/d;Lzb0/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
