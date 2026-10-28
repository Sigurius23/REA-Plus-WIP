.class public final Lj53/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/c0;

.field public final b:Lec3/h2;

.field public final c:Lec3/r1;

.field public final d:Ll83/p;

.field public final e:Lec3/h2;

.field public final f:Lec3/h2;

.field public g:Ljava/lang/Object;

.field public final h:Lmc3/c;

.field public final i:Lec3/h2;

.field public final j:Lec3/h2;


# direct methods
.method public constructor <init>(Lhc3/d;Lt23/c0;Lec3/h2;Lec3/r1;Lj53/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj53/m;->a:Lt23/c0;

    iput-object p3, p0, Lj53/m;->b:Lec3/h2;

    iput-object p4, p0, Lj53/m;->c:Lec3/r1;

    const-string p2, "ParticipantSorting"

    invoke-static {p0, p2}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lj53/m;->d:Ll83/p;

    invoke-static {p5}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lj53/m;->e:Lec3/h2;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lj53/m;->f:Lec3/h2;

    sget-object p3, Lm83/y;->w:Lm83/y;

    iput-object p3, p0, Lj53/m;->g:Ljava/lang/Object;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p4

    iput-object p4, p0, Lj53/m;->h:Lmc3/c;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, p0, Lj53/m;->i:Lec3/h2;

    iput-object p3, p0, Lj53/m;->j:Lec3/h2;

    new-instance p3, Lj53/j;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p2, p4}, Lj53/j;-><init>(Lj53/m;Lq83/d;I)V

    const/4 p4, 0x3

    invoke-static {p1, p2, p2, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p3, Lj53/j;

    const/4 p5, 0x1

    invoke-direct {p3, p0, p2, p5}, Lj53/j;-><init>(Lj53/m;Lq83/d;I)V

    invoke-static {p1, p2, p2, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final a(Lj53/m;Lj53/k;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lj53/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj53/l;

    iget v1, v0, Lj53/l;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lj53/l;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lj53/l;

    invoke-direct {v0, p0, p2}, Lj53/l;-><init>(Lj53/m;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lj53/l;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lj53/l;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lj53/l;->y:Lmc3/c;

    iget-object p1, v0, Lj53/l;->x:Lj53/k;

    iget-object v0, v0, Lj53/l;->w:Lj53/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lj53/m;->h:Lmc3/c;

    iput-object p0, v0, Lj53/l;->w:Lj53/m;

    iput-object p1, v0, Lj53/l;->x:Lj53/k;

    iput-object p2, v0, Lj53/l;->y:Lmc3/c;

    iput v3, v0, Lj53/l;->F:I

    invoke-virtual {p2, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p1, Lj53/k;->d:Ljava/util/Comparator;

    if-nez v1, :cond_4

    iget-object v1, p1, Lj53/k;->c:Lj53/f;

    iget-object v2, p1, Lj53/k;->b:Ljava/util/Map;

    invoke-static {v1, v2}, Lj53/g;->a(Lj53/f;Ljava/util/Map;)Ljava/util/Comparator;

    move-result-object v1

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_4
    :goto_2
    iget-object v2, p0, Lj53/m;->g:Ljava/lang/Object;

    iget-object v3, p0, Lj53/m;->d:Ll83/p;

    iget-object p1, p1, Lj53/k;->a:Ljava/util/Map;

    invoke-static {v2, p1}, Lj53/m;->b(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt23/g2;

    iget-object v4, v4, Lt23/g2;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lj53/m;->g:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iput-object v2, p0, Lj53/m;->g:Ljava/lang/Object;

    iget-object p0, p0, Lj53/m;->i:Lec3/h2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb23/k;

    iget-object v1, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Published sorted participants (size="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v3, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb23/k;

    iget-object p1, p0, Lb23/k;->c:Lb23/e;

    iget-object v1, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-interface {p1, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string p1, "Sort produced same order, skipping emission"

    invoke-interface {p0, v2, v1, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p0

    :goto_5
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method

.method public static b(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 3

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/g2;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/g2;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    const-string p1, "<get-values>(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
