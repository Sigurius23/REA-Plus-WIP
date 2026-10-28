.class final Lh32/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh32/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lh32/c$c;",
        "",
        "<init>",
        "(Lh32/c;)V",
        "",
        "country",
        "Lux/j0;",
        "a",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "b",
        "Ljava/lang/String;",
        "cachedCountry",
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
.field private final a:Lmc3/a;

.field private b:Ljava/lang/String;

.field private c:Lux/j0;

.field final synthetic d:Lh32/c;


# direct methods
.method public constructor <init>(Lh32/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lh32/c$c;->d:Lh32/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lh32/c$c;->a:Lmc3/a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lux/j0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lh32/c$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh32/c$c$a;

    iget v1, v0, Lh32/c$c$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh32/c$c$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh32/c$c$a;

    invoke-direct {v0, p0, p2}, Lh32/c$c$a;-><init>(Lh32/c$c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh32/c$c$a;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh32/c$c$a;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lh32/c$c$a;->y:Ljava/lang/Object;

    check-cast p1, Lh32/c;

    iget-object v1, v0, Lh32/c$c$a;->x:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    iget-object v0, v0, Lh32/c$c$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lh32/c$c$a;->z:I

    iget-object v2, v0, Lh32/c$c$a;->y:Ljava/lang/Object;

    check-cast v2, Lh32/c;

    iget-object v5, v0, Lh32/c$c$a;->x:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    iget-object v7, v0, Lh32/c$c$a;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move p2, p1

    move-object p1, v7

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lh32/c$c;->a:Lmc3/a;

    iget-object v2, p0, Lh32/c$c;->d:Lh32/c;

    iput-object p1, v0, Lh32/c$c$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lh32/c$c$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Lh32/c$c$a;->y:Ljava/lang/Object;

    iput v3, v0, Lh32/c$c$a;->z:I

    iput v5, v0, Lh32/c$c$a;->H:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, p2

    move p2, v3

    :goto_1
    :try_start_1
    iget-object v7, p0, Lh32/c$c;->c:Lux/j0;

    if-eqz v7, :cond_6

    iget-object v8, p0, Lh32/c$c;->b:Ljava/lang/String;

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    move-object v7, v6

    :goto_2
    if-nez v7, :cond_9

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v1, v5

    goto :goto_7

    :cond_6
    :goto_3
    iput-object p1, v0, Lh32/c$c$a;->w:Ljava/lang/Object;

    iput-object v5, v0, Lh32/c$c$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Lh32/c$c$a;->y:Ljava/lang/Object;

    iput p2, v0, Lh32/c$c$a;->z:I

    iput v3, v0, Lh32/c$c$a;->E:I

    iput v4, v0, Lh32/c$c$a;->H:I

    invoke-static {v2, p1, v0}, Lh32/c;->h(Lh32/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p2, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    move-object v0, p1

    move-object p1, v2

    move-object v1, v5

    :goto_5
    :try_start_2
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_8

    invoke-static {p1}, Lh32/c;->f(Lh32/c;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lux/j0;

    iput-object p2, p0, Lh32/c$c;->c:Lux/j0;

    iput-object v0, p0, Lh32/c$c;->b:Ljava/lang/String;

    move-object v7, p1

    check-cast v7, Lux/j0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v5, v1

    goto :goto_6

    :cond_8
    move-object v5, v1

    move-object v7, v6

    :cond_9
    :goto_6
    invoke-interface {v5, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v7

    :goto_7
    invoke-interface {v1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
