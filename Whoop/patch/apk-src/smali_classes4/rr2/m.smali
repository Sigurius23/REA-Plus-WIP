.class public final Lrr2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrr2/l;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0003\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lrr2/m;",
        "Lrr2/l;",
        "<init>",
        "()V",
        "Lkotlin/Function1;",
        "Lio/sentry/b1;",
        "Ll83/a0;",
        "scopeCallback",
        "i",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/sentry/e;",
        "breadcrumb",
        "h",
        "(Lio/sentry/e;)V",
        "Lio/sentry/protocol/h0;",
        "user",
        "e",
        "(Lio/sentry/protocol/h0;)V",
        "",
        "tag",
        "value",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "b",
        "(Ljava/lang/String;)V",
        "",
        "throwable",
        "g",
        "(Ljava/lang/Throwable;)V",
        "a",
        "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V",
        "",
        "f",
        "()Ljava/lang/Boolean;",
        "crashedLastRun",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V
    .locals 0

    invoke-static {p0, p1}, Lrr2/m;->m(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V

    return-void
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V
    .locals 0

    invoke-static {p0, p1}, Lrr2/m;->n(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V

    return-void
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/location/a;

    const/16 v1, 0x8

    invoke-direct {v0, p2, v1}, Lcom/mapbox/common/location/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lio/sentry/g0;

    invoke-direct {v1}, Lio/sentry/g0;-><init>()V

    invoke-interface {p2, p1, v1, v0}, Lio/sentry/d1;->r(Ljava/lang/Throwable;Lio/sentry/g0;Lcom/mapbox/common/location/a;)Lio/sentry/protocol/v;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/sentry/o4;->h(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lio/sentry/o4;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge d(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
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

    invoke-super {p0, p1, p2}, Lrr2/l;->d(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public e(Lio/sentry/protocol/h0;)V
    .locals 0

    invoke-static {p1}, Lio/sentry/o4;->j(Lio/sentry/protocol/h0;)V

    return-void
.end method

.method public f()Ljava/lang/Boolean;
    .locals 1

    invoke-static {}, Lio/sentry/o4;->f()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lio/sentry/g0;

    invoke-direct {v1}, Lio/sentry/g0;-><init>()V

    invoke-interface {v0, p1, v1}, Lio/sentry/d1;->B(Ljava/lang/Throwable;Lio/sentry/g0;)Lio/sentry/protocol/v;

    return-void
.end method

.method public h(Lio/sentry/e;)V
    .locals 1

    const-string v0, "breadcrumb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/d1;->h(Lio/sentry/e;)V

    return-void
.end method

.method public i(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "scopeCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/repositories/c;

    const/16 v1, 0x19

    invoke-direct {v0, p1, v1}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object p1

    invoke-interface {p1, v0}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    return-void
.end method

.method public bridge j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
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

    invoke-super {p0, p1, p2, p3}, Lrr2/l;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
