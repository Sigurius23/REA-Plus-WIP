.class final Lm91/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm91/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic x:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp1/t2;Lz1/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lz1/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lm91/c$a$a;->w:Lp1/t2;

    iput-object p2, p0, Lm91/c$a$a;->x:Lz1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "TK;+TV;>;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p2, p0, Lm91/c$a$a;->w:Lp1/t2;

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    invoke-static {p2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    iget-object v0, p0, Lm91/c$a$a;->x:Lz1/p;

    iget-object v1, p0, Lm91/c$a$a;->w:Lp1/t2;

    invoke-virtual {v0}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    :goto_0
    move-object v2, v0

    check-cast v2, Ln83/b;

    invoke-virtual {v2}, Ln83/b;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/a;

    invoke-virtual {v2}, Lm91/a;->f()Lm91/e0;

    move-result-object v3

    sget-object v4, Lm91/e0;->Invisible:Lm91/e0;

    if-eq v3, v4, :cond_0

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    if-nez v3, :cond_1

    new-instance v3, Lm91/a;

    invoke-virtual {v2}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lm91/a;->d()Lm91/u;

    move-result-object v2

    sget-object v5, Lm91/e0;->Exiting:Lm91/e0;

    invoke-direct {v3, v4, v2, v5}, Lm91/a;-><init>(Ljava/lang/Object;Lm91/u;Lm91/e0;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lm91/a;

    invoke-virtual {v2}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2}, Lm91/a;->f()Lm91/e0;

    move-result-object v2

    invoke-direct {v4, v5, v3, v2}, Lm91/a;-><init>(Ljava/lang/Object;Lm91/u;Lm91/e0;)V

    move-object v3, v4

    :goto_1
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    new-instance v3, Lm91/a;

    sget-object v4, Lm91/e0;->Entering:Lm91/e0;

    invoke-direct {v3, v2, v1, v4}, Lm91/a;-><init>(Ljava/lang/Object;Lm91/u;Lm91/e0;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, Lm91/c$a$a;->x:Lz1/p;

    invoke-virtual {p2}, Lz1/p;->clear()V

    iget-object p2, p0, Lm91/c$a$a;->x:Lz1/p;

    invoke-virtual {p2, p1}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Lm91/c$a$a;->b(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
