.class public final Ljb3/r;
.super Ljb3/q;
.source "SourceFile"


# instance fields
.field public final g:Lr93/g0;

.field public final h:Lqa3/g0;

.field public final i:Ljava/lang/String;

.field public final j:Lva3/e;


# direct methods
.method public constructor <init>(Lr93/g0;Lqa3/g0;Lsa3/f;Lsa3/a;Loa3/h;Lhb3/i;Ljava/lang/String;Lc93/a;)V
    .locals 8

    move-object v7, p7

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "components"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugName"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lsa3/h;

    iget-object v0, p2, Lqa3/g0;->G:Lqa3/c1;

    const-string v4, "getTypeTable(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v0}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v0, Lsa3/j;->b:Lsa3/j;

    iget-object v0, p2, Lqa3/g0;->H:Lqa3/j1;

    const-string v4, "getVersionRequirementTable(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lpf/c;->r(Lqa3/j1;)Lsa3/j;

    move-result-object v4

    move-object v1, p1

    move-object v2, p3

    move-object v5, p4

    move-object v6, p5

    move-object v0, p6

    invoke-virtual/range {v0 .. v6}, Lhb3/i;->a(Lr93/g0;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;Ljb3/j;)Lhb3/k;

    move-result-object v0

    iget-object v2, p2, Lqa3/g0;->z:Ljava/util/List;

    const-string v1, "getFunctionList(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p2, Lqa3/g0;->E:Ljava/util/List;

    const-string v1, "getPropertyList(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p2, Lqa3/g0;->F:Ljava/util/List;

    const-string v1, "getTypeAliasList(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p8

    move-object v1, v0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ljb3/q;-><init>(Lhb3/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lc93/a;)V

    iput-object p1, p0, Ljb3/r;->g:Lr93/g0;

    iput-object p2, p0, Ljb3/r;->h:Lqa3/g0;

    iput-object v7, p0, Ljb3/r;->i:Ljava/lang/String;

    move-object v1, p1

    check-cast v1, Lu93/g0;

    iget-object v1, v1, Lu93/g0;->F:Lva3/e;

    iput-object v1, p0, Ljb3/r;->j:Lva3/e;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method

.method public final e(Lva3/h;)Lva3/c;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lva3/c;

    iget-object v1, p0, Ljb3/r;->j:Lva3/e;

    invoke-direct {v0, v1, p1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljb3/r;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-super {p0, p1, p2}, Ljb3/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz93/c;->w:Lz93/c;

    invoke-virtual {p0, p1, p2}, Ljb3/q;->b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    iget-object p2, p0, Ljb3/q;->b:Lhb3/k;

    iget-object p2, p2, Lhb3/k;->a:Lhb3/i;

    iget-object p2, p2, Lhb3/i;->k:Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt93/c;

    iget-object v2, p0, Ljb3/r;->j:Lva3/e;

    invoke-interface {v1, v2}, Lt93/c;->a(Lva3/e;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final i()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final j(Lva3/h;)Z
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ljb3/q;->j(Lva3/h;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->k:Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt93/c;

    iget-object v2, p0, Ljb3/r;->j:Lva3/e;

    invoke-interface {v1, v2, p1}, Lt93/c;->b(Lva3/e;Lva3/h;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->i:Lz93/b;

    iget-object v1, p0, Ljb3/r;->g:Lr93/g0;

    invoke-static {v0, p2, v1, p1}, Lva3/b;->j(Lz93/b;Lz93/a;Lr93/g0;Lva3/h;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljb3/r;->i:Ljava/lang/String;

    return-object v0
.end method
