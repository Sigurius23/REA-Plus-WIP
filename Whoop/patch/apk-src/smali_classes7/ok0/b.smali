.class public final Lok0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkt0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lok0/b;",
        "Lkt0/b;",
        "Lst0/v;",
        "deviceType",
        "Llt0/j;",
        "revision",
        "<init>",
        "(Lst0/v;Llt0/j;)V",
        "Lxj0/b;",
        "a",
        "()Lxj0/b;",
        "Lzj0/h;",
        "response",
        "Lkt0/a;",
        "c",
        "(Lzj0/h;)Lkt0/a;",
        "Ljava/time/Clock;",
        "clock",
        "b",
        "(Ljava/time/Clock;)Lxj0/b;",
        "Lst0/v;",
        "Llt0/j;",
        "connectivity_release"
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
.field private final a:Lst0/v;

.field private final b:Llt0/j;


# direct methods
.method public constructor <init>(Lst0/v;Llt0/j;)V
    .locals 1

    const-string v0, "deviceType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "revision"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lok0/b;->a:Lst0/v;

    iput-object p2, p0, Lok0/b;->b:Llt0/j;

    return-void
.end method


# virtual methods
.method public a()Lxj0/b;
    .locals 3

    new-instance v0, Lxj0/p;

    iget-object v1, p0, Lok0/b;->b:Llt0/j;

    iget-object v2, p0, Lok0/b;->a:Lst0/v;

    invoke-direct {v0, v1, v2}, Lxj0/p;-><init>(Llt0/j;Lst0/v;)V

    return-object v0
.end method

.method public b(Ljava/time/Clock;)Lxj0/b;
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lok0/b;->a:Lst0/v;

    invoke-static {p1, v0}, Lok0/c;->a(Ljava/time/Clock;Lst0/v;)Lxj0/b;

    move-result-object p1

    return-object p1
.end method

.method public c(Lzj0/h;)Lkt0/a;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lok0/c;->b(Lzj0/h;)Lkt0/a;

    move-result-object p1

    return-object p1
.end method
