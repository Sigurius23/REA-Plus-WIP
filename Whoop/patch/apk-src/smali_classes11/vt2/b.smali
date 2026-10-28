.class public final Lvt2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lvt2/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "navigationReducer",
        "Lls2/b;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Lj02/o0;Lo02/d;Lls2/b;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "Lvt2/a$b;",
        "event",
        "b",
        "(Lvt2/a$b;)V",
        "Lvt2/a;",
        "c",
        "(Lvt2/a;)V",
        "Lj02/m0;",
        "navigationScreen",
        "d",
        "(Lj02/m0;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "Lo02/d;",
        "Lls2/b;",
        "weekly-plan_release"
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

.field private final c:Lo02/d;

.field private final d:Lls2/b;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lo02/d;Lls2/b;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvt2/b;->a:Leb/a0;

    iput-object p2, p0, Lvt2/b;->b:Lj02/o0;

    iput-object p3, p0, Lvt2/b;->c:Lo02/d;

    iput-object p4, p0, Lvt2/b;->d:Lls2/b;

    return-void
.end method

.method private final a()V
    .locals 3

    iget-object v0, p0, Lvt2/b;->d:Lls2/b;

    new-instance v1, Lls2/a$j;

    const-string v2, "Dismiss"

    invoke-direct {v1, v2}, Lls2/a$j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lls2/b;->q(Lls2/a;)V

    iget-object v0, p0, Lvt2/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    return-void
.end method

.method private final b(Lvt2/a$b;)V
    .locals 3

    iget-object v0, p0, Lvt2/b;->c:Lo02/d;

    invoke-virtual {p1}, Lvt2/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v1, v0, Lj02/m0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lj02/m0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {p0, v0}, Lvt2/b;->d(Lj02/m0;)V

    if-eqz v0, :cond_3

    iget-object v1, p0, Lvt2/b;->a:Leb/a0;

    invoke-virtual {v1}, Leb/a0;->z()Z

    instance-of v1, v0, Lj02/m0$s5;

    if-eqz v1, :cond_1

    move-object v2, v0

    check-cast v2, Lj02/m0$s5;

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lj02/m0$s5;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lvt2/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lvt2/b;->b:Lj02/o0;

    invoke-virtual {p1}, Lvt2/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    iget-object v0, p0, Lvt2/b;->b:Lj02/o0;

    invoke-virtual {p1}, Lvt2/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    :cond_3
    return-void
.end method


# virtual methods
.method public final c(Lvt2/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvt2/a$a;->a:Lvt2/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lvt2/b;->a()V

    return-void

    :cond_0
    instance-of v0, p1, Lvt2/a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lvt2/a$b;

    invoke-direct {p0, p1}, Lvt2/b;->b(Lvt2/a$b;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final d(Lj02/m0;)V
    .locals 2

    instance-of v0, p1, Lj02/m0$s5;

    if-eqz v0, :cond_0

    check-cast p1, Lj02/m0$s5;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lj02/m0$s5;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvt2/b;->d:Lls2/b;

    new-instance v0, Lls2/a$j;

    const-string v1, "Change My Plan"

    invoke-direct {v0, v1}, Lls2/a$j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lls2/b;->q(Lls2/a;)V

    return-void

    :cond_1
    iget-object p1, p0, Lvt2/b;->d:Lls2/b;

    new-instance v0, Lls2/a$j;

    const-string v1, "Continue Plan"

    invoke-direct {v0, v1}, Lls2/a$j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lls2/b;->q(Lls2/a;)V

    :cond_2
    return-void
.end method
