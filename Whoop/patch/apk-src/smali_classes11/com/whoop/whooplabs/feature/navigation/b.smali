.class public final Lcom/whoop/whooplabs/feature/navigation/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/whooplabs/feature/navigation/b;",
        "",
        "Leb/u0;",
        "composeNavController",
        "Leb/a0;",
        "fragmentNavController",
        "Lo02/d;",
        "baseNavReducer",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/u0;Leb/a0;Lo02/d;Lj02/o0;)V",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "navEvent",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/whooplabs/feature/navigation/c;)V",
        "a",
        "Leb/u0;",
        "b",
        "Leb/a0;",
        "Lj02/o0;",
        "d",
        "Lo02/d;",
        "navigationReducer",
        "whooplabs_release"
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
.field private final a:Leb/u0;

.field private final b:Leb/a0;

.field private final c:Lj02/o0;

.field private final d:Lo02/d;


# direct methods
.method public constructor <init>(Leb/u0;Leb/a0;Lo02/d;Lj02/o0;)V
    .locals 1

    const-string v0, "composeNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentNavController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseNavReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    iput-object p2, p0, Lcom/whoop/whooplabs/feature/navigation/b;->b:Leb/a0;

    iput-object p4, p0, Lcom/whoop/whooplabs/feature/navigation/b;->c:Lj02/o0;

    new-instance p1, Ljp2/f;

    const/16 p2, 0xf

    invoke-direct {p1, p2}, Ljp2/f;-><init>(I)V

    invoke-static {p3, p1}, Lo02/f;->a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->d:Lo02/d;

    return-void
.end method

.method public static synthetic a(Lo02/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/whooplabs/feature/navigation/b;->b(Lo02/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lo02/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$buildNavigationReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Lcom/whoop/whooplabs/feature/navigation/c;)V
    .locals 5

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$b;->a:Lcom/whoop/whooplabs/feature/navigation/c$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$g;->a:Lcom/whoop/whooplabs/feature/navigation/c$g;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$c;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$c;->a()I

    move-result p1

    invoke-virtual {v3, p1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$b;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_3
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$e;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$e;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$e;->a()I

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$e;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;->a(ILjava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_4
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$f;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$f;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$f;->a()I

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$f;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$e;->a(ILjava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_5
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$i;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$g;

    invoke-virtual {v3}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination;->getBaseRoute$whooplabs_release()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v4}, Leb/a0;->B(Leb/a0;Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->d:Lo02/d;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$i;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$i;->a()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v3

    invoke-interface {v0, v3}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v3, v0, Lj02/m0$x5;

    if-eqz v3, :cond_8

    check-cast v0, Lj02/m0$x5;

    invoke-virtual {v0}, Lj02/m0$x5;->c()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0}, Lj02/m0$x5;->d()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0}, Lj02/m0$x5;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_6

    if-eqz v3, :cond_6

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v4, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v4, p1, v3}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$d;->a(ILjava/lang/Integer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_6
    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$a;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$a;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v3, p1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$a;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_7
    if-eqz v0, :cond_9

    iget-object p1, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;

    invoke-virtual {v3, v0}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_8
    instance-of v0, v0, Lj02/m0;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->c:Lj02/o0;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$i;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    :cond_9
    return-void

    :cond_a
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$d;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->a:Leb/u0;

    sget-object v3, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$c;->a:Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$c;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$d;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$d;->a()I

    move-result p1

    invoke-virtual {v3, p1}, Lcom/whoop/whooplabs/feature/navigation/WhoopLabsNavHostDestination$c;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_b
    instance-of v0, p1, Lcom/whoop/whooplabs/feature/navigation/c$h;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/whooplabs/feature/navigation/b;->c:Lj02/o0;

    new-instance v1, Lj02/m0$g1;

    check-cast p1, Lcom/whoop/whooplabs/feature/navigation/c$h;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/feature/navigation/c$h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj02/m0$g1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
