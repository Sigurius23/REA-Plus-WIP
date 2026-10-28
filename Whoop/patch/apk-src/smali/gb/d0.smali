.class public final Lgb/d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lgb/i;

.field public final synthetic w:Ld0/z1;

.field public final synthetic x:Leb/u0;

.field public final synthetic y:Ljava/util/Map;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public constructor <init>(Ld0/z1;Leb/u0;Ljava/util/Map;Lp1/t2;Lgb/i;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lgb/d0;->w:Ld0/z1;

    iput-object p2, p0, Lgb/d0;->x:Leb/u0;

    iput-object p3, p0, Lgb/d0;->y:Ljava/util/Map;

    iput-object p4, p0, Lgb/d0;->z:Lp1/t2;

    iput-object p5, p0, Lgb/d0;->E:Lgb/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lgb/d0;

    iget-object v4, p0, Lgb/d0;->z:Lp1/t2;

    iget-object v5, p0, Lgb/d0;->E:Lgb/i;

    iget-object v1, p0, Lgb/d0;->w:Ld0/z1;

    iget-object v2, p0, Lgb/d0;->x:Leb/u0;

    iget-object v3, p0, Lgb/d0;->y:Ljava/util/Map;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lgb/d0;-><init>(Ld0/z1;Leb/u0;Ljava/util/Map;Lp1/t2;Lgb/i;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lgb/d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgb/d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lgb/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgb/d0;->w:Ld0/z1;

    iget-object v0, p1, Ld0/z1;->a:Lal/a;

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    iget-object p1, p1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lgb/d0;->x:Leb/u0;

    invoke-virtual {v0}, Leb/a0;->h()Leb/q;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Leb/a0;->h()Leb/q;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, Lgb/d0;->z:Lp1/t2;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/q;

    iget-object v2, p0, Lgb/d0;->E:Lgb/i;

    invoke-virtual {v2}, Leb/i1;->b()Leb/t;

    move-result-object v2

    invoke-virtual {v2, v1}, Leb/t;->b(Leb/q;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v1, p0, Lgb/d0;->y:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/q;

    iget-object v5, v5, Leb/q;->F:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
