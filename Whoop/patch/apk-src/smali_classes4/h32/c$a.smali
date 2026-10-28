.class final Lh32/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh32/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\'\u0012\u001e\u0010\u0005\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0086@\u00a2\u0006\u0004\u0008\t\u0010\nR,\u0010\u0005\u001a\u001a\u0008\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lh32/c$a;",
        "",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "",
        "keyProvider",
        "<init>",
        "(Lh32/c;Lkotlin/jvm/functions/Function1;)V",
        "Lux/j0;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;",
        "Lmc3/a;",
        "b",
        "Lmc3/a;",
        "mutex",
        "c",
        "Lux/j0;",
        "cache",
        "payments_release"
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
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final b:Lmc3/a;

.field private c:Lux/j0;

.field final synthetic d:Lh32/c;


# direct methods
.method public constructor <init>(Lh32/c;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "keyProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh32/c$a;->d:Lh32/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh32/c$a;->a:Lkotlin/jvm/functions/Function1;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lh32/c$a;->b:Lmc3/a;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lux/j0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lh32/c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh32/c$a$a;

    iget v1, v0, Lh32/c$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh32/c$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh32/c$a$a;

    invoke-direct {v0, p0, p1}, Lh32/c$a$a;-><init>(Lh32/c$a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lh32/c$a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh32/c$a$a;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v1, v0, Lh32/c$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lh32/c;

    iget-object v0, v0, Lh32/c$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lh32/c$a$a;->y:I

    iget-object v5, v0, Lh32/c$a$a;->x:Ljava/lang/Object;

    check-cast v5, Lh32/c;

    iget-object v7, v0, Lh32/c$a$a;->w:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    move v5, v2

    move-object v2, p1

    move-object p1, v7

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh32/c$a;->b:Lmc3/a;

    iget-object v2, p0, Lh32/c$a;->d:Lh32/c;

    iput-object p1, v0, Lh32/c$a$a;->w:Ljava/lang/Object;

    iput-object v2, v0, Lh32/c$a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lh32/c$a$a;->y:I

    iput v5, v0, Lh32/c$a$a;->G:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto :goto_2

    :cond_4
    move v5, v3

    :goto_1
    :try_start_1
    iget-object v7, p0, Lh32/c$a;->c:Lux/j0;

    if-nez v7, :cond_7

    iget-object v7, p0, Lh32/c$a;->a:Lkotlin/jvm/functions/Function1;

    iput-object p1, v0, Lh32/c$a$a;->w:Ljava/lang/Object;

    iput-object v2, v0, Lh32/c$a$a;->x:Ljava/lang/Object;

    iput v5, v0, Lh32/c$a$a;->y:I

    iput v3, v0, Lh32/c$a$a;->z:I

    iput v4, v0, Lh32/c$a$a;->G:I

    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v1, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v2

    :goto_3
    :try_start_2
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {v1}, Lh32/c;->f(Lh32/c;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lux/j0;

    iput-object v1, p0, Lh32/c$a;->c:Lux/j0;

    move-object v7, p1

    check-cast v7, Lux/j0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v0

    goto :goto_4

    :cond_6
    move-object p1, v0

    move-object v7, v6

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto :goto_5

    :cond_7
    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v7

    :goto_5
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
