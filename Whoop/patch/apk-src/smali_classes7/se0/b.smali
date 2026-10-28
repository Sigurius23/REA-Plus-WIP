.class public final Lse0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lse0/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Leb/a0;Lj02/o0;Lj02/i0;)V",
        "",
        "a",
        "()Ljava/lang/String;",
        "Lse0/a;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lse0/a;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "c",
        "Lj02/i0;",
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Lj02/i0;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lse0/b;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lse0/b;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lse0/b;->c:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lse0/b;-><init>(Leb/a0;Lj02/o0;Lj02/i0;)V

    return-void
.end method

.method private final a()Ljava/lang/String;
    .locals 1

    const-string v0, "android-app://com.whoop/onboardingStoriesFragmentRedesign/GALLERI_ONBOARDING"

    return-object v0
.end method


# virtual methods
.method public final b(Lse0/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lse0/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lse0/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lse0/a$b;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lse0/b;->c:Lj02/i0;

    invoke-direct {p0}, Lse0/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lse0/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_1
    instance-of v0, p1, Lse0/a$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lse0/b;->b:Lj02/o0;

    check-cast p1, Lse0/a$c;

    invoke-virtual {p1}, Lse0/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
