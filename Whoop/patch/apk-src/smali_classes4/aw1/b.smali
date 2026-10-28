.class public final Law1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Law1/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lwv1/b;",
        "analyticsHelper",
        "Lvv1/a;",
        "coordinator",
        "<init>",
        "(Leb/a0;Lj02/o0;Lwv1/b;Lvv1/a;)V",
        "Law1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Law1/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Lwv1/b;",
        "d",
        "Lvv1/a;",
        "membership_release"
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

.field private final c:Lwv1/b;

.field private final d:Lvv1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lwv1/b;Lvv1/a;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Law1/b;->a:Leb/a0;

    iput-object p2, p0, Law1/b;->b:Lj02/o0;

    iput-object p3, p0, Law1/b;->c:Lwv1/b;

    iput-object p4, p0, Law1/b;->d:Lvv1/a;

    return-void
.end method


# virtual methods
.method public final a(Law1/a;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Law1/a$a;->a:Law1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Law1/b;->c:Lwv1/b;

    new-instance v0, Lwv1/a$b;

    invoke-direct {v0, v2, v2, v1, v2}, Lwv1/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lwv1/b;->a(Lwv1/a;)V

    iget-object p1, p0, Law1/b;->d:Lvv1/a;

    invoke-virtual {p1}, Lvv1/a;->q()Lbc3/k1;

    iget-object p1, p0, Law1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Law1/a$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Law1/b;->c:Lwv1/b;

    new-instance v3, Lwv1/a$a;

    invoke-direct {v3, v2, v2, v1, v2}, Lwv1/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lwv1/b;->a(Lwv1/a;)V

    iget-object v0, p0, Law1/b;->b:Lj02/o0;

    check-cast p1, Law1/a$b;

    invoke-virtual {p1}, Law1/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
