.class public final Lrr2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrr2/c;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J+\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ5\u0010 \u001a\u00020\u000e2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001e0\u0018H\u0016\u00a2\u0006\u0004\u0008 \u0010!J-\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00162\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0018H\u0016\u00a2\u0006\u0004\u0008#\u0010\u001bJ!\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0016\u00a2\u0006\u0004\u0008(\u0010)J+\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020$2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0018H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008/\u00100J)\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u00162\u0010\u0010\u0019\u001a\u000c\u0012\u0004\u0012\u00020\u0016\u0012\u0002\u0008\u00030\u0018H\u0016\u00a2\u0006\u0004\u00082\u0010\u001bJ\u001f\u00104\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u00086\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lrr2/o;",
        "Lrr2/c;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lrr2/l;",
        "sentryClient",
        "Ll83/h;",
        "Lyu0/b;",
        "dataBacklogReporter",
        "Lze1/c;",
        "lifecycleScopeProvider",
        "Lq83/j;",
        "ioContext",
        "<init>",
        "(Lrr2/l;Ll83/h;Lze1/c;Lq83/j;)V",
        "Ll83/a0;",
        "A",
        "()V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "a",
        "",
        "message",
        "",
        "metadata",
        "l",
        "(Ljava/lang/String;Ljava/util/Map;)V",
        "from",
        "to",
        "",
        "additionalData",
        "n",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "tag",
        "r",
        "",
        "thr",
        "g",
        "(Ljava/lang/Throwable;Ljava/lang/String;)V",
        "p",
        "(Ljava/lang/Throwable;)V",
        "throwable",
        "tags",
        "o",
        "(Ljava/lang/Throwable;Ljava/util/Map;)V",
        "userId",
        "d",
        "(Ljava/lang/String;)V",
        "section",
        "j",
        "value",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "b",
        "w",
        "Lrr2/l;",
        "x",
        "Ll83/h;",
        "y",
        "Lze1/c;",
        "z",
        "Lq83/j;",
        "Ltr2/n;",
        "E",
        "Ltr2/n;",
        "log",
        "app_prodStandardRelease"
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
.field private final E:Ltr2/n;

.field private final w:Lrr2/l;

.field private final x:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final y:Lze1/c;

.field private final z:Lq83/j;


# direct methods
.method public constructor <init>(Lrr2/l;Ll83/h;Lze1/c;Lq83/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrr2/l;",
            "Ll83/h;",
            "Lze1/c;",
            "Lq83/j;",
            ")V"
        }
    .end annotation

    const-string v0, "sentryClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataBacklogReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleScopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrr2/o;->w:Lrr2/l;

    .line 3
    iput-object p2, p0, Lrr2/o;->x:Ll83/h;

    .line 4
    iput-object p3, p0, Lrr2/o;->y:Lze1/c;

    .line 5
    iput-object p4, p0, Lrr2/o;->z:Lq83/j;

    .line 6
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "SentryReporter"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lrr2/o;->E:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Lrr2/l;Ll83/h;Lze1/c;Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 7
    new-instance p3, Lze1/c;

    invoke-direct {p3}, Lze1/c;-><init>()V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 8
    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    .line 9
    sget-object p4, Lkc3/d;->w:Lkc3/d;

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lrr2/o;-><init>(Lrr2/l;Ll83/h;Lze1/c;Lq83/j;)V

    return-void
.end method

.method private final A()V
    .locals 4

    new-instance v0, Ll83/k;

    const-string v1, "version"

    const-string v2, "v2"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "changelog"

    const-string v3, "Sample rate is now configurable via config service."

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lrr2/o;->w:Lrr2/l;

    new-instance v2, Lk80/e;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lk80/e;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lrr2/l;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final B(Ljava/util/Map;Ljava/lang/String;Lio/sentry/b1;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoop sentry engine"

    invoke-interface {p2, p0, v0}, Lio/sentry/b1;->J(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "whoop.sentry.version"

    invoke-interface {p2, p0, p1}, Lio/sentry/b1;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Lio/sentry/b1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Ljava/lang/String;Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, p0}, Lio/sentry/b1;->J(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic t(Ljava/lang/String;Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrr2/o;->D(Ljava/lang/String;Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;
    .locals 1

    const-string v0, "v2"

    invoke-static {p0, v0, p1}, Lrr2/o;->B(Ljava/util/Map;Ljava/lang/String;Lio/sentry/b1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrr2/o;->C(Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lrr2/o;)Ll83/h;
    .locals 0

    iget-object p0, p0, Lrr2/o;->x:Ll83/h;

    return-object p0
.end method

.method public static final synthetic y(Lrr2/o;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lrr2/o;->E:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic z(Lrr2/o;)Lrr2/l;
    .locals 0

    iget-object p0, p0, Lrr2/o;->w:Lrr2/l;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lrr2/o;->A()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {v0, p1}, Lrr2/l;->b(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {v0, p1, p2}, Lrr2/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/protocol/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    iget-object p1, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {p1, v0}, Lrr2/l;->e(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    const-string p2, "thr"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    const-string v0, "section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    new-instance v1, Lp3/b0;

    const/16 v2, 0x8

    invoke-direct {v1, v2, p1, p2}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lrr2/l;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/sentry/e;

    invoke-direct {v0}, Lio/sentry/e;-><init>()V

    iput-object p1, v0, Lio/sentry/e;->z:Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {p1, v0}, Lrr2/l;->h(Lio/sentry/e;)V

    return-void
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "to"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {v0, p1, p2, p3}, Lrr2/l;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    new-instance v1, Lrr2/n;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lrr2/n;-><init>(Ljava/util/Map;I)V

    invoke-interface {v0, p1, v1}, Lrr2/l;->a(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->y:Lze1/c;

    invoke-virtual {v0, p1}, Lze1/c;->a(Landroidx/lifecycle/g0;)Lbc3/c0;

    move-result-object p1

    iget-object v0, p0, Lrr2/o;->z:Lq83/j;

    new-instance v1, Lrr2/o$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lrr2/o$a;-><init>(Lrr2/o;Lq83/d;)V

    const/4 v3, 0x2

    invoke-static {p1, v0, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public p(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "thr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {v0, p1}, Lrr2/l;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method public r(Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrr2/o;->w:Lrr2/l;

    invoke-interface {v0, p1, p2}, Lrr2/l;->d(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
