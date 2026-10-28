.class public final Loo2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0019R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001bR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Loo2/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "navHostController",
        "Lho2/a;",
        "analyticsHelper",
        "Lo02/d;",
        "baseNavReducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Leb/a0;Lho2/a;Lo02/d;Ltr2/n;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "b",
        "(Lm91/u;)V",
        "Lpo2/a$s;",
        "event",
        "d",
        "(Lpo2/a$s;)V",
        "a",
        "Lj02/o0;",
        "Leb/a0;",
        "c",
        "Lho2/a;",
        "e",
        "Ltr2/n;",
        "f",
        "Lo02/d;",
        "navigationReducer",
        "universal-checkout_release"
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

.field private final c:Leb/a0;

.field private final d:Lho2/a;

.field private final e:Ltr2/n;

.field private final f:Lo02/d;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Leb/a0;Lho2/a;Lo02/d;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navHostController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseNavReducer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Loo2/c;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Loo2/c;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Loo2/c;->c:Leb/a0;

    .line 5
    iput-object p4, p0, Loo2/c;->d:Lho2/a;

    .line 6
    iput-object p6, p0, Loo2/c;->e:Ltr2/n;

    .line 7
    new-instance p1, Lo72/e;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lo72/e;-><init>(I)V

    invoke-static {p5, p1}, Lo02/f;->a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;

    move-result-object p1

    iput-object p1, p0, Loo2/c;->f:Lo02/d;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Leb/a0;Lho2/a;Lo02/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 8
    sget-object p6, Ltr2/n;->a:Ltr2/n$a;

    const-string p7, "UniversalCheckoutNavigationRouter"

    invoke-virtual {p6, p7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Loo2/c;-><init>(Lj02/o0;Leb/a0;Leb/a0;Lho2/a;Lo02/d;Ltr2/n;)V

    return-void
.end method

.method public static synthetic a(Lo02/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loo2/c;->c(Lo02/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lm91/u;)V
    .locals 3

    iget-object v0, p0, Loo2/c;->e:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "itemClicked "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final c(Lo02/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$buildNavigationReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final d(Lpo2/a$s;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpo2/a$d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Loo2/c;->f:Lo02/d;

    check-cast p1, Lpo2/a$d;

    invoke-virtual {p1}, Lpo2/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj02/m0;

    instance-of v1, v0, Lj02/m0$m5;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

    iget-object v3, p0, Loo2/c;->c:Leb/a0;

    check-cast v0, Lj02/m0$m5;

    invoke-virtual {v0}, Lj02/m0$m5;->b()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->g(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;Leb/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v1, v0, Lj02/m0$n5;

    if-eqz v1, :cond_1

    sget-object p1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;

    iget-object v1, p0, Loo2/c;->c:Leb/a0;

    check-cast v0, Lj02/m0$n5;

    invoke-virtual {v0}, Lj02/m0$n5;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$e;->e(Leb/a0;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Loo2/c;->a:Lj02/o0;

    invoke-virtual {p1}, Lpo2/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lpo2/a$x;

    if-eqz v0, :cond_3

    iget-object v0, p0, Loo2/c;->a:Lj02/o0;

    check-cast p1, Lpo2/a$x;

    invoke-virtual {p1}, Lpo2/a$x;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->d(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_3
    instance-of v0, p1, Lpo2/a$b;

    if-eqz v0, :cond_4

    check-cast p1, Lpo2/a$b;

    invoke-virtual {p1}, Lpo2/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Loo2/c;->b(Lm91/u;)V

    return-void

    :cond_4
    instance-of v0, p1, Lpo2/a$m;

    if-eqz v0, :cond_6

    sget-object p1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;

    iget-object v0, p0, Loo2/c;->b:Leb/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$a;->a(Leb/a0;)Lpo2/a$a;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, p0, Loo2/c;->d:Lho2/a;

    invoke-virtual {v0, p1}, Lho2/a;->a(Lpo2/a$a;)V

    :cond_5
    return-void

    :cond_6
    instance-of v0, p1, Lpo2/a$q;

    if-eqz v0, :cond_7

    sget-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;

    iget-object v1, p0, Loo2/c;->c:Leb/a0;

    check-cast p1, Lpo2/a$q;

    invoke-virtual {p1}, Lpo2/a$q;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$c;->g(Leb/a0;Ljava/lang/String;)V

    return-void

    :cond_7
    instance-of v0, p1, Lpo2/a$p;

    if-eqz v0, :cond_8

    iget-object v0, p0, Loo2/c;->d:Lho2/a;

    new-instance v1, Lpo2/a$z;

    check-cast p1, Lpo2/a$p;

    invoke-virtual {p1}, Lpo2/a$p;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpo2/a$p;->a()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lpo2/a$z;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lho2/a;->a(Lpo2/a$a;)V

    sget-object v0, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b;

    iget-object v1, p0, Loo2/c;->c:Leb/a0;

    invoke-virtual {p1}, Lpo2/a$p;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$b;->d(Leb/a0;Ljava/lang/String;)V

    return-void

    :cond_8
    instance-of v0, p1, Lpo2/a$r;

    if-eqz v0, :cond_9

    sget-object v1, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->a:Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;

    iget-object v2, p0, Loo2/c;->c:Leb/a0;

    check-cast p1, Lpo2/a$r;

    invoke-virtual {p1}, Lpo2/a$r;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;->g(Lcom/whoop/universalcheckout/features/UniversalCheckoutDestination$d;Leb/a0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
