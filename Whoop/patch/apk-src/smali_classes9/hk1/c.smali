.class public final Lhk1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lhk1/c;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Ldk1/b;",
        "analyticsHelper",
        "",
        "source",
        "<init>",
        "(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;)V",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lhk1/a;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lhk1/a;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "c",
        "Lj02/i0;",
        "d",
        "Ldk1/b;",
        "e",
        "Ljava/lang/String;",
        "healthspan_release"
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Lj02/i0;

.field private final d:Ldk1/b;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhk1/c;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lhk1/c;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lhk1/c;->c:Lj02/i0;

    .line 5
    iput-object p4, p0, Lhk1/c;->d:Ldk1/b;

    .line 6
    iput-object p5, p0, Lhk1/c;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 7
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    .line 8
    const-string p5, "healthspan"

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lhk1/c;-><init>(Leb/a0;Lj02/o0;Lj02/i0;Ldk1/b;Ljava/lang/String;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "android-app://com.whoop/onboardingStoriesFragmentRedesign/HEALTHSPAN_ONBOARDING?entryPoint="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final b(Lhk1/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhk1/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lhk1/c;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lhk1/a$b;

    if-eqz v0, :cond_5

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lhk1/a$b;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lhk1/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v2, v0, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    :cond_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getNoPlanShowMetricSelection()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lhk1/c;->d:Ldk1/b;

    sget-object v1, Ldk1/a$b;->a:Ldk1/a$b;

    invoke-virtual {v0, v1}, Ldk1/b;->l(Ldk1/a;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lhk1/c;->d:Ldk1/b;

    sget-object v1, Ldk1/a$d;->a:Ldk1/a$d;

    invoke-virtual {v0, v1}, Ldk1/b;->l(Ldk1/a;)V

    :cond_4
    :goto_1
    iget-object v0, p0, Lhk1/c;->b:Lj02/o0;

    check-cast p1, Lhk1/a$b;

    invoke-virtual {p1}, Lhk1/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_5
    instance-of p1, p1, Lhk1/a$c;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lhk1/c;->d:Ldk1/b;

    new-instance v0, Ldk1/a$h;

    iget-object v1, p0, Lhk1/c;->e:Ljava/lang/String;

    invoke-direct {v0, v1}, Ldk1/a$h;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ldk1/b;->l(Ldk1/a;)V

    iget-object p1, p0, Lhk1/c;->c:Lj02/i0;

    iget-object v0, p0, Lhk1/c;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Lhk1/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lhk1/c;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
