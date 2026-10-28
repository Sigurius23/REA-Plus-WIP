.class public final Lqi0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000c*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lqi0/d;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Ltr2/n;)V",
        "Lj02/s;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lj02/s;)V",
        "Lm91/u;",
        "a",
        "(Lm91/u;)V",
        "Lri0/b$n;",
        "c",
        "(Lri0/b$n;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "Ltr2/n;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:I = 0x8


# instance fields
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqi0/d;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lqi0/d;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lqi0/d;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "GenericNavigationRouter"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lqi0/d;-><init>(Lj02/o0;Leb/a0;Ltr2/n;)V

    return-void
.end method

.method private final a(Lm91/u;)V
    .locals 3

    iget-object v0, p0, Lqi0/d;->c:Ltr2/n;

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

.method private final b(Lj02/s;)V
    .locals 3

    invoke-virtual {p1}, Lj02/s;->b()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqi0/d;->b:Leb/a0;

    invoke-virtual {p1}, Lj02/s;->c()Lj02/v;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/whoop/navigation/d;->f(Leb/a0;Lj02/v;Ltr2/n;ILjava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lqi0/d;->b:Leb/a0;

    invoke-virtual {p1}, Lj02/s;->b()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v1

    invoke-virtual {p1}, Lj02/s;->a()Ljava/lang/Integer;

    move-result-object p1

    iget-object v2, p0, Lqi0/d;->c:Ltr2/n;

    invoke-static {v0, v1, p1, v2}, Lcom/whoop/navigation/d;->d(Leb/a0;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Ltr2/n;)Z

    return-void
.end method


# virtual methods
.method public final c(Lri0/b$n;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lri0/b$c;

    if-eqz v0, :cond_1

    check-cast p1, Lri0/b$c;

    invoke-virtual {p1}, Lri0/b$c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqi0/d;->a:Lj02/o0;

    invoke-virtual {p1}, Lri0/b$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->d(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    iget-object v0, p0, Lqi0/d;->a:Lj02/o0;

    invoke-virtual {p1}, Lri0/b$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Lri0/b$b;

    if-eqz v0, :cond_2

    check-cast p1, Lri0/b$b;

    invoke-virtual {p1}, Lri0/b$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lqi0/d;->a(Lm91/u;)V

    return-void

    :cond_2
    instance-of v0, p1, Lri0/b$h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lqi0/d;->b:Leb/a0;

    check-cast p1, Lri0/b$h;

    invoke-virtual {p1}, Lri0/b$h;->a()Lj02/s;

    move-result-object p1

    invoke-virtual {p1}, Lj02/s;->c()Lj02/v;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/whoop/navigation/d;->f(Leb/a0;Lj02/v;Ltr2/n;ILjava/lang/Object;)Z

    return-void

    :cond_3
    instance-of v0, p1, Lri0/b$q;

    if-eqz v0, :cond_4

    check-cast p1, Lri0/b$q;

    invoke-virtual {p1}, Lri0/b$q;->a()Lj02/s;

    move-result-object p1

    invoke-direct {p0, p1}, Lqi0/d;->b(Lj02/s;)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
