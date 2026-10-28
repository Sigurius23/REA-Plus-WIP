.class final Lom0/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lom0/c;->f(Lcom/whoop/cache/api/prefetch/PrefetchList;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.cache.api.prefetch.Prefetcher$prefetch$1"
    f = "Prefetcher.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lom0/c;

.field final synthetic F:Z

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/cache/api/prefetch/PrefetchList;


# direct methods
.method public constructor <init>(Lcom/whoop/cache/api/prefetch/PrefetchList;Lom0/c;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/cache/api/prefetch/PrefetchList;",
            "Lom0/c;",
            "Z",
            "Lq83/d<",
            "-",
            "Lom0/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lom0/c$b;->z:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iput-object p2, p0, Lom0/c$b;->E:Lom0/c;

    iput-boolean p3, p0, Lom0/c$b;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lom0/c$b;

    iget-object v1, p0, Lom0/c$b;->z:Lcom/whoop/cache/api/prefetch/PrefetchList;

    iget-object v2, p0, Lom0/c$b;->E:Lom0/c;

    iget-boolean v3, p0, Lom0/c$b;->F:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lom0/c$b;-><init>(Lcom/whoop/cache/api/prefetch/PrefetchList;Lom0/c;ZLq83/d;)V

    iput-object p1, v0, Lom0/c$b;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lom0/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lom0/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lom0/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lom0/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lom0/c$b;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lom0/c$b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lom0/c$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lom0/c$b;->z:Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-virtual {p1}, Lcom/whoop/cache/api/prefetch/PrefetchList;->getEntries()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v2, p0, Lom0/c$b;->E:Lom0/c;

    iget-boolean v4, p0, Lom0/c$b;->F:Z

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {p1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/cache/api/prefetch/PrefetchEntry;

    invoke-static {v2}, Lom0/c;->a(Lom0/c;)Lq83/j;

    move-result-object v8

    new-instance v9, Lom0/c$b$a;

    invoke-direct {v9, v2, v6, v4, v7}, Lom0/c$b$a;-><init>(Lom0/c;Lcom/whoop/cache/api/prefetch/PrefetchEntry;ZLq83/d;)V

    const/4 v6, 0x2

    invoke-static {v0, v8, v9, v6}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v7, p0, Lom0/c$b;->y:Ljava/lang/Object;

    iput-object v7, p0, Lom0/c$b;->w:Ljava/lang/Object;

    iput v3, p0, Lom0/c$b;->x:I

    invoke-static {v5, p0}, Lbc3/f0;->f(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
