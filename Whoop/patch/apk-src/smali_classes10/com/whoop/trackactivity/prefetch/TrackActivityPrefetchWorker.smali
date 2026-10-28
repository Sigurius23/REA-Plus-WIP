.class public final Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;
.super Lcom/whoop/metrics/worker/BaseReportingWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0014\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0014\u001a\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;",
        "Lcom/whoop/metrics/worker/BaseReportingWorker;",
        "Lof3/a;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lic/u;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "y",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "uniqueWorkName",
        "Lnm0/a;",
        "z",
        "Ll83/h;",
        "k",
        "()Lnm0/a;",
        "apiClientRequester",
        "Lz92/a;",
        "E",
        "n",
        "()Lz92/a;",
        "userInfoAccessor",
        "Lom0/c;",
        "F",
        "m",
        "()Lom0/c;",
        "prefetcher",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "G",
        "l",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "H",
        "a",
        "track-activity_release"
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
.field private static final H:Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;

.field public static final I:I


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final y:Ljava/lang/String;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->H:Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->I:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/metrics/worker/BaseReportingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    const-string p1, "TrackActivityPrefetchWorker"

    iput-object p1, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->y:Ljava/lang/String;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance p2, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$b;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->z:Ll83/h;

    new-instance p2, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$c;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$c;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->E:Ll83/h;

    new-instance p2, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$d;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$d;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->F:Ll83/h;

    new-instance p2, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$e;

    invoke-direct {p2, p0, v0, v0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$e;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->G:Ll83/h;

    return-void
.end method

.method private final k()Lnm0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnm0/a;

    return-object v0
.end method

.method private final l()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final m()Lom0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lom0/c;

    return-object v0
.end method

.method private final n()Lz92/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/a;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->y:Ljava/lang/String;

    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lic/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;

    iget v1, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;

    invoke-direct {v0, p0, p1}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;-><init>(Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v0, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/cache/api/prefetch/PrefetchRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->l()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v2, "start-activity-prefetch"

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "start-activity-prefetch disabled, skipping already-scheduled run"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {p0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->n()Lz92/a;

    move-result-object p1

    iput v4, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->E:I

    invoke-interface {p1, v0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    new-instance v2, Lcom/whoop/cache/api/prefetch/PrefetchRequest;

    const-string v4, "userId"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const-string v7, "core-details-bff/v1/track-activity/prefetch"

    invoke-direct {v2, v7, v4}, Lcom/whoop/cache/api/prefetch/PrefetchRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->k()Lnm0/a;

    move-result-object v4

    new-instance v7, La6/u;

    const/4 v8, 0x1

    invoke-direct {v7, v2, v8}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-class v2, Ll83/a0;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v8

    invoke-static {v8}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v9

    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v8, v9}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v2

    invoke-virtual {v4, v7, v2}, Lnm0/a;->a(Lec3/l;Ls63/a;)Lec3/l;

    move-result-object v2

    iput-object v3, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->x:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->w:I

    iput v5, v0, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$f;->E:I

    invoke-static {v2, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p1, Lu02/g;

    instance-of v0, p1, Lu02/e;

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object v0

    check-cast p1, Lu02/e;

    invoke-virtual {p1}, Lu02/e;->a()Lu02/d;

    move-result-object p1

    invoke-virtual {p1}, Lu02/d;->a()Ljava/lang/Throwable;

    move-result-object p1

    new-array v1, v6, [Lqr2/a$a;

    const-string v2, "Failed to fetch track-activity prefetch list"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lic/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :cond_7
    instance-of v0, p1, Lu02/h;

    if-eqz v0, :cond_8

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    check-cast p1, Lu02/h;

    invoke-virtual {p1}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne3/l;

    invoke-virtual {v0, p1}, Lne3/h;->l1(Lne3/l;)V

    sget-object p1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p1}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/whoop/cache/api/prefetch/PrefetchList;->Companion:Lcom/whoop/cache/api/prefetch/PrefetchList$a;

    invoke-virtual {v1}, Lcom/whoop/cache/api/prefetch/PrefetchList$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-direct {p0}, Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;->m()Lom0/c;

    move-result-object v0

    invoke-static {v0, p1, v6, v5, v3}, Lom0/c;->g(Lom0/c;Lcom/whoop/cache/api/prefetch/PrefetchList;ZILjava/lang/Object;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    invoke-virtual {p0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->c()Ltr2/n;

    move-result-object p1

    const-string v0, "No signed-in user, skipping prefetch warm-up"

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {}, Lic/u;->b()Lic/t;

    move-result-object p1

    return-object p1
.end method
