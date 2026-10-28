.class public final Ll62/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ll62/e;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lj/d;",
        "Ll62/g;",
        "activityResultLauncher",
        "Lh62/b;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Lj02/o0;Lj/d;Lh62/b;)V",
        "Ll62/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Ll62/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Lj/d;",
        "d",
        "Lh62/b;",
        "refer-a-friend_release"
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

.field private final c:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final d:Lh62/b;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lj/d;Lh62/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lj02/o0;",
            "Lj/d;",
            "Lh62/b;",
            ")V"
        }
    .end annotation

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll62/e;->a:Leb/a0;

    iput-object p2, p0, Ll62/e;->b:Lj02/o0;

    iput-object p3, p0, Ll62/e;->c:Lj/d;

    iput-object p4, p0, Ll62/e;->d:Lh62/b;

    return-void
.end method


# virtual methods
.method public final a(Ll62/a;)V
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ll62/a$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ll62/e;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Ll62/a$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll62/e;->b:Lj02/o0;

    check-cast p1, Ll62/a$b;

    invoke-virtual {p1}, Ll62/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Ll62/a$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll62/e;->d:Lh62/b;

    new-instance v1, Lh62/a$j;

    check-cast p1, Ll62/a$c;

    invoke-virtual {p1}, Ll62/a$c;->d()Lh62/b$a$a;

    move-result-object v4

    invoke-virtual {p1}, Ll62/a$c;->b()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x13

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lh62/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;Lh62/b$a$a;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Onboarding"

    invoke-virtual {v0, v1, v2}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    iget-object v0, p0, Ll62/e;->c:Lj/d;

    if-eqz v0, :cond_2

    new-instance v1, Ll62/g;

    invoke-virtual {p1}, Ll62/a$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll62/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ll62/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
