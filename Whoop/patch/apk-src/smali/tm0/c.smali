.class public final Ltm0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltm0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ltm0/c;",
        "Ltm0/a;",
        "Lmm0/a;",
        "bffCache",
        "Lvm0/g;",
        "cacheReporter",
        "<init>",
        "(Lmm0/a;Lvm0/g;)V",
        "Ll83/a0;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lmm0/a;",
        "b",
        "Lvm0/g;",
        "cache_release"
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
.field private final a:Lmm0/a;

.field private final b:Lvm0/g;


# direct methods
.method public constructor <init>(Lmm0/a;Lvm0/g;)V
    .locals 1

    const-string v0, "bffCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm0/c;->a:Lmm0/a;

    iput-object p2, p0, Ltm0/c;->b:Lvm0/g;

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ltm0/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ltm0/c$a;

    iget v1, v0, Ltm0/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltm0/c$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltm0/c$a;

    invoke-direct {v0, p0, p1}, Ltm0/c$a;-><init>(Ltm0/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ltm0/c$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltm0/c$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ltm0/c;->a:Lmm0/a;

    iput v4, v0, Ltm0/c$a;->y:I

    invoke-interface {p1, v0}, Lmm0/a;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Ltm0/c;->b:Lvm0/g;

    sget-object v2, Lvm0/f;->NUKE:Lvm0/f;

    invoke-interface {p1, v2}, Lvm0/g;->f(Lvm0/f;)V

    iget-object p1, p0, Ltm0/c;->b:Lvm0/g;

    iput v3, v0, Ltm0/c$a;->y:I

    invoke-interface {p1, v0}, Lvm0/g;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
