.class public final Lbv1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lbv1/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lo02/d;",
        "baseNavReducer",
        "Ltr2/n;",
        "logger",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Lj02/o0;Leb/a0;Lo02/d;Ltr2/n;Lj02/i0;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "c",
        "(Lm91/u;)V",
        "Lj02/m0;",
        "navigationScreen",
        "b",
        "(Lj02/m0;)V",
        "Lcv1/a$i;",
        "event",
        "e",
        "(Lcv1/a$i;)V",
        "a",
        "Lj02/o0;",
        "Leb/a0;",
        "Ltr2/n;",
        "d",
        "Lj02/i0;",
        "Lo02/d;",
        "navigationReducer",
        "limited-time-offer_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Ltr2/n;

.field private final d:Lj02/i0;

.field private final e:Lo02/d;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lo02/d;Ltr2/n;Lj02/i0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseNavReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbv1/c;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lbv1/c;->b:Leb/a0;

    .line 4
    iput-object p4, p0, Lbv1/c;->c:Ltr2/n;

    .line 5
    iput-object p5, p0, Lbv1/c;->d:Lj02/i0;

    .line 6
    new-instance p1, Lbs1/n;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, Lbs1/n;-><init>(I)V

    invoke-static {p3, p1}, Lo02/f;->a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;

    move-result-object p1

    iput-object p1, p0, Lbv1/c;->e:Lo02/d;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lo02/d;Ltr2/n;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    .line 7
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "LimitedTimeOfferNavigationRouter"

    invoke-virtual {p4, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 8
    new-instance p5, Lj02/i0;

    invoke-direct {p5}, Lj02/i0;-><init>()V

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lbv1/c;-><init>(Lj02/o0;Leb/a0;Lo02/d;Ltr2/n;Lj02/i0;)V

    return-void
.end method

.method public static synthetic a(Lo02/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbv1/c;->d(Lo02/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lj02/m0;)V
    .locals 7

    instance-of v0, p1, Lj02/m0$k0;

    if-eqz v0, :cond_3

    check-cast p1, Lj02/m0$k0;

    invoke-virtual {p1}, Lj02/m0$k0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$k0;->d()Ljava/util/Map;

    move-result-object v1

    const-string v2, "sku"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj02/m0$k0;->d()Ljava/util/Map;

    move-result-object v3

    const-string v4, "promo_code"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1

    move-object v3, v2

    :cond_1
    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$k0;->d()Ljava/util/Map;

    move-result-object p1

    const-string v4, "new_tier"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, p1

    :goto_0
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lbv1/c;->d:Lj02/i0;

    const-string v4, "&sku="

    const-string v5, "&promoCode="

    const-string v6, "android-app://com.whoop/extensions?isFromLto=true&path="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&newTier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lbv1/c;->b:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_3
    iget-object v0, p0, Lbv1/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method private final c(Lm91/u;)V
    .locals 3

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbv1/c;->e:Lo02/d;

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v0, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-direct {p0, p1}, Lbv1/c;->b(Lj02/m0;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbv1/c;->c:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unhandled ItemViewState for app-driven navigation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final d(Lo02/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$buildNavigationReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final e(Lcv1/a$i;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcv1/a$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbv1/c;->a:Lj02/o0;

    check-cast p1, Lcv1/a$c;

    invoke-virtual {p1}, Lcv1/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lcv1/a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcv1/a$b;

    invoke-virtual {p1}, Lcv1/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lbv1/c;->c(Lm91/u;)V

    return-void

    :cond_1
    instance-of p1, p1, Lcv1/a$e;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lbv1/c;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
