.class public final Lif2/b;
.super Ln12/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lif2/b;",
        "Ln12/a;",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lor2/y;",
        "externalLinkNavigator",
        "<init>",
        "(Landroidx/fragment/app/m0;Lor2/y;)V",
        "Lif2/a;",
        "navEvent",
        "Ll83/a0;",
        "g",
        "(Lif2/a;)V",
        "c",
        "Landroidx/fragment/app/m0;",
        "getFragment",
        "()Landroidx/fragment/app/m0;",
        "d",
        "Lor2/y;",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "sleep-coach_release"
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
.field private final c:Landroidx/fragment/app/m0;

.field private final d:Lor2/y;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lor2/y;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln12/a;-><init>(Landroidx/fragment/app/m0;)V

    iput-object p1, p0, Lif2/b;->c:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lif2/b;->d:Lor2/y;

    return-void
.end method


# virtual methods
.method public final g(Lif2/a;)V
    .locals 7

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lif2/a$b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lif2/b;->d:Lor2/y;

    iget-object v0, p0, Lif2/b;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    const-string v0, "requireActivity(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lif2/a$b;

    invoke-virtual {p1}, Lif2/a$b;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lif2/a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lif2/a$a;

    invoke-virtual {p1}, Lif2/a$a;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ln12/a;->f()Lor2/s;

    move-result-object p1

    invoke-virtual {p1}, Lor2/s;->i()Z

    invoke-virtual {p0}, Ln12/a;->f()Lor2/s;

    move-result-object p1

    const-string v0, "whoop://com.whoop/sleepCoachFragment/?entryPoint=deeplink&clickType="

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Lor2/s;->d(Landroid/net/Uri;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ln12/a;->e()Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
