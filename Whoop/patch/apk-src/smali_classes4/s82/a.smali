.class public final Ls82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0087@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\u0008\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Ls82/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Li92/c;",
        "installationUuidProvider",
        "Ltr2/n;",
        "logger",
        "Lkotlin/Function0;",
        "Lio/seon/androidsdk/service/c;",
        "seonBuilderFactory",
        "<init>",
        "(Landroid/content/Context;Li92/c;Ltr2/n;Lc93/a;)V",
        "",
        "sessionId",
        "h",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "i",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "l",
        "Ll83/a0;",
        "m",
        "k",
        "a",
        "Landroid/content/Context;",
        "b",
        "Li92/c;",
        "c",
        "Ltr2/n;",
        "d",
        "Lc93/a;",
        "Lio/seon/androidsdk/service/b;",
        "e",
        "Lio/seon/androidsdk/service/b;",
        "seon",
        "seon_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Li92/c;

.field private final c:Ltr2/n;

.field private final d:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final e:Lio/seon/androidsdk/service/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li92/c;Ltr2/n;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Li92/c;",
            "Ltr2/n;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "installationUuidProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "seonBuilderFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls82/a;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ls82/a;->b:Li92/c;

    .line 4
    iput-object p3, p0, Ls82/a;->c:Ltr2/n;

    .line 5
    iput-object p4, p0, Ls82/a;->d:Lc93/a;

    .line 6
    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/seon/androidsdk/service/c;

    .line 7
    iput-object p1, p2, Lio/seon/androidsdk/service/c;->a:Landroid/content/Context;

    .line 8
    invoke-virtual {p2}, Lio/seon/androidsdk/service/c;->a()Lio/seon/androidsdk/service/f;

    move-result-object p1

    iput-object p1, p0, Ls82/a;->e:Lio/seon/androidsdk/service/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li92/c;Ltr2/n;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 9
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "SeonManager"

    invoke-virtual {p3, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 10
    new-instance p4, Ls52/d;

    const/4 p5, 0x1

    invoke-direct {p4, p5}, Ls52/d;-><init>(I)V

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Ls82/a;-><init>(Landroid/content/Context;Li92/c;Ltr2/n;Lc93/a;)V

    return-void
.end method

.method public static synthetic a()Lio/seon/androidsdk/service/c;
    .locals 1

    invoke-static {}, Ls82/a;->b()Lio/seon/androidsdk/service/c;

    move-result-object v0

    return-object v0
.end method

.method private static final b()Lio/seon/androidsdk/service/c;
    .locals 3

    new-instance v0, Lio/seon/androidsdk/service/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lio/sentry/hints/j;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lio/sentry/hints/j;-><init>(I)V

    iput-object v1, v0, Lio/seon/androidsdk/service/c;->b:Lio/sentry/hints/j;

    return-object v0
.end method

.method public static final synthetic c(Ls82/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ls82/a;->h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ls82/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ls82/a;->i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ls82/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ls82/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(Ls82/a;)Lio/seon/androidsdk/service/b;
    .locals 0

    iget-object p0, p0, Ls82/a;->e:Lio/seon/androidsdk/service/b;

    return-object p0
.end method

.method public static final synthetic g(Ls82/a;)Lc93/a;
    .locals 0

    iget-object p0, p0, Ls82/a;->d:Lc93/a;

    return-object p0
.end method

.method private final h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-static {p0}, Ls82/a;->g(Ls82/a;)Lc93/a;

    move-result-object p2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/seon/androidsdk/service/c;

    invoke-static {p0}, Ls82/a;->e(Ls82/a;)Landroid/content/Context;

    move-result-object v1

    iput-object v1, p2, Lio/seon/androidsdk/service/c;->a:Landroid/content/Context;

    iput-object p1, p2, Lio/seon/androidsdk/service/c;->c:Ljava/lang/String;

    invoke-virtual {p2}, Lio/seon/androidsdk/service/c;->a()Lio/seon/androidsdk/service/f;

    move-result-object p1

    new-instance p2, Ls82/a$a;

    invoke-direct {p2, v0}, Ls82/a$a;-><init>(Lbc3/k;)V

    iget-object v1, p1, Lio/seon/androidsdk/service/f;->a:Lio/seon/androidsdk/service/i1;

    iget-object p1, p1, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2, v2}, Lio/seon/androidsdk/service/i1;->e(Ljava/lang/String;Lio/seon/androidsdk/service/d;Ljava/lang/Boolean;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method private final i(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-static {p0}, Ls82/a;->f(Ls82/a;)Lio/seon/androidsdk/service/b;

    move-result-object p2

    check-cast p2, Lio/seon/androidsdk/service/f;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "[^a-zA-Z0-9-._~]"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    invoke-static {p0}, Ls82/a;->f(Ls82/a;)Lio/seon/androidsdk/service/b;

    move-result-object p1

    new-instance p2, Ls82/a$b;

    invoke-direct {p2, v0}, Ls82/a$b;-><init>(Lbc3/k;)V

    check-cast p1, Lio/seon/androidsdk/service/f;

    iget-object v1, p1, Lio/seon/androidsdk/service/f;->a:Lio/seon/androidsdk/service/i1;

    iget-object p1, p1, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2, v2}, Lio/seon/androidsdk/service/i1;->e(Ljava/lang/String;Lio/seon/androidsdk/service/d;Ljava/lang/Boolean;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method


# virtual methods
.method public final j(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Ll83/c;
    .end annotation

    instance-of v0, p1, Ls82/a$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls82/a$c;

    iget v1, v0, Ls82/a$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ls82/a$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ls82/a$c;

    invoke-direct {v0, p0, p1}, Ls82/a$c;-><init>(Ls82/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ls82/a$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ls82/a$c;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ls82/a$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Ls82/a;->b:Li92/c;

    iput v4, v0, Ls82/a$c;->z:I

    invoke-virtual {p1, v0}, Li92/c;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/String;

    new-instance v2, Ls82/a$d;

    invoke-direct {v2, p0, p1, v6}, Ls82/a$d;-><init>(Ls82/a;Ljava/lang/String;Lq83/d;)V

    iput-object v6, v0, Ls82/a$c;->w:Ljava/lang/Object;

    iput v3, v0, Ls82/a$c;->z:I

    const-wide/16 v3, 0x2710

    invoke-static {v3, v4, v2, v0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_6

    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon fingerprint generation returned null"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_6
    return-object p1

    :goto_4
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Failed to generate Seon fingerprint"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_7

    :goto_5
    throw p1

    :goto_6
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon fingerprint generation timed out"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_7
    return-object v6
.end method

.method public final k(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ls82/a$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls82/a$e;

    iget v1, v0, Ls82/a$e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ls82/a$e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ls82/a$e;

    invoke-direct {v0, p0, p1}, Ls82/a$e;-><init>(Ls82/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ls82/a$e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ls82/a$e;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput v4, v0, Ls82/a$e;->w:I

    iput v3, v0, Ls82/a$e;->z:I

    new-instance p1, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    new-instance v0, Ls82/a$f;

    invoke-direct {v0, p1}, Ls82/a$f;-><init>(Lbc3/k;)V

    invoke-static {p0}, Ls82/a;->f(Ls82/a;)Lio/seon/androidsdk/service/b;

    move-result-object v2

    check-cast v2, Lio/seon/androidsdk/service/f;

    invoke-virtual {v2, v0}, Lio/seon/androidsdk/service/f;->d(Lio/seon/androidsdk/service/d;)V

    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Unexpected error stopping Seon behaviour monitoring"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Failed to stop Seon behaviour monitoring"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    const/4 p1, 0x0

    return-object p1

    :goto_5
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon getSeonFingerprintWithMonitoring cancelled"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    throw p1
.end method

.method public final l(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ls82/a$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls82/a$g;

    iget v1, v0, Ls82/a$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ls82/a$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ls82/a$g;

    invoke-direct {v0, p0, p1}, Ls82/a$g;-><init>(Ls82/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ls82/a$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ls82/a$g;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ls82/a$g;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Ls82/a;->b:Li92/c;

    iput v4, v0, Ls82/a$g;->z:I

    invoke-virtual {p1, v0}, Li92/c;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/String;

    new-instance v2, Ls82/a$h;

    invoke-direct {v2, p0, p1, v6}, Ls82/a$h;-><init>(Ls82/a;Ljava/lang/String;Lq83/d;)V

    iput-object v6, v0, Ls82/a$g;->w:Ljava/lang/Object;

    iput v3, v0, Ls82/a$g;->z:I

    const-wide/16 v3, 0x2710

    invoke-static {v3, v4, v2, v0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_6

    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon fingerprint generation returned null"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_2
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_6
    return-object p1

    :goto_4
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Failed to generate Seon fingerprint"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_7

    :goto_5
    throw p1

    :goto_6
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon fingerprint generation timed out"

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_7
    return-object v6
.end method

.method public final m(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ls82/a$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ls82/a$i;

    iget v1, v0, Ls82/a$i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ls82/a$i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ls82/a$i;

    invoke-direct {v0, p0, p1}, Ls82/a$i;-><init>(Ls82/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ls82/a$i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ls82/a$i;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Ls82/a$i;->w:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/b;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ls82/a;->e:Lio/seon/androidsdk/service/b;

    iget-object v2, p0, Ls82/a;->b:Li92/c;

    iput-object p1, v0, Ls82/a$i;->w:Ljava/lang/Object;

    iput v3, v0, Ls82/a$i;->z:I

    invoke-virtual {v2, v0}, Li92/c;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_1
    check-cast p1, Ljava/lang/String;

    check-cast v0, Lio/seon/androidsdk/service/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "[^a-zA-Z0-9-._~]"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lio/seon/androidsdk/service/f;->d:Ljava/lang/String;

    iget-object p1, p0, Ls82/a;->e:Lio/seon/androidsdk/service/b;

    check-cast p1, Lio/seon/androidsdk/service/f;

    invoke-virtual {p1}, Lio/seon/androidsdk/service/f;->c()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lio/seon/androidsdk/exception/BehaviouralMonitoringException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_2
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Unexpected error starting Seon behaviour monitoring"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Failed to start Seon behaviour monitoring"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_5
    iget-object v0, p0, Ls82/a;->c:Ltr2/n;

    const-string v1, "Seon startMonitoring cancelled"

    new-array v2, v4, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    throw p1
.end method
