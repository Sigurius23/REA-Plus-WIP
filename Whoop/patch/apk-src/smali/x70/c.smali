.class public final Lx70/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010#R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010%R\u0014\u0010\'\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lx70/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lo02/d;",
        "baseNavReducer",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/navigation/e;)V",
        "",
        "startScreen",
        "source",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "e",
        "()V",
        "Lm91/u;",
        "c",
        "(Lm91/u;)V",
        "Ly70/a$j;",
        "event",
        "g",
        "(Ly70/a$j;)V",
        "a",
        "Lj02/o0;",
        "Leb/a0;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ltr2/n;",
        "Lo02/d;",
        "navigationReducer",
        "activation_release"
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

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final d:Ltr2/n;

.field private final e:Lo02/d;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseNavReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx70/c;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lx70/c;->b:Leb/a0;

    .line 4
    iput-object p4, p0, Lx70/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 5
    iput-object p5, p0, Lx70/c;->d:Ltr2/n;

    .line 6
    new-instance p1, Lwz/h1;

    const/16 p2, 0x1a

    invoke-direct {p1, p2}, Lwz/h1;-><init>(I)V

    invoke-static {p3, p1}, Lo02/f;->a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;

    move-result-object p1

    iput-object p1, p0, Lx70/c;->e:Lo02/d;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "OrderConfirmationNavigationRouter"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lx70/c;-><init>(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-void
.end method

.method public static synthetic a(Lo02/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lx70/c;->f(Lo02/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lcom/whoop/navigation/e;)V
    .locals 6

    iget-object v0, p0, Lx70/c;->e:Lo02/d;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v0, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    sget-object v0, Lj02/m0$j3;->b:Lj02/m0$j3;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lx70/c;->a:Lj02/o0;

    new-instance v0, Lj02/m0$d;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v2, "DEVICE_EDUCATION"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_0
    iget-object v0, p0, Lx70/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method private final c(Lm91/u;)V
    .locals 3

    iget-object v0, p0, Lx70/c;->d:Ltr2/n;

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

.method private final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lx70/c;->a:Lj02/o0;

    new-instance v1, Lj02/m0$d;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method private final e()V
    .locals 8

    iget-object v0, p0, Lx70/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "pop-to-home-graph"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lx70/c;->b:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->k()Leb/r0;

    move-result-object v1

    if-eqz v0, :cond_0

    iget v1, v1, Leb/n0;->H:I

    goto :goto_0

    :cond_0
    iget v1, v1, Leb/r0;->M:I

    :goto_0
    iget-object v2, p0, Lx70/c;->d:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "POP_TO_HOME_GRAPH enabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", popUpToId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lx70/c;->a:Lj02/o0;

    new-instance v2, Lj02/m0$d;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "START_SCREEN"

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method private static final f(Lo02/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$buildNavigationReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final g(Ly70/a$j;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ly70/a$c;

    if-eqz v0, :cond_0

    check-cast p1, Ly70/a$c;

    invoke-virtual {p1}, Ly70/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lx70/c;->b(Lcom/whoop/navigation/e;)V

    return-void

    :cond_0
    instance-of v0, p1, Ly70/a$g;

    if-eqz v0, :cond_1

    check-cast p1, Ly70/a$g;

    invoke-virtual {p1}, Ly70/a$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ly70/a$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lx70/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Ly70/a$b;

    if-eqz v0, :cond_2

    check-cast p1, Ly70/a$b;

    invoke-virtual {p1}, Ly70/a$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lx70/c;->c(Lm91/u;)V

    return-void

    :cond_2
    instance-of v0, p1, Ly70/a$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lx70/c;->a:Lj02/o0;

    check-cast p1, Ly70/a$d;

    invoke-virtual {p1}, Ly70/a$d;->a()Lj02/m0;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_3
    instance-of v0, p1, Ly70/a$f;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lx70/c;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_4
    instance-of p1, p1, Ly70/a$h;

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lx70/c;->e()V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
