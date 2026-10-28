.class public final Lja3/w;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/a0;


# direct methods
.method public synthetic constructor <init>(Lja3/a0;I)V
    .locals 0

    iput p2, p0, Lja3/w;->w:I

    iput-object p1, p0, Lja3/w;->x:Lja3/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lja3/w;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->o:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    const/4 v1, 0x0

    iget-object v2, p0, Lja3/w;->x:Lja3/a0;

    invoke-virtual {v2, v0, v1}, Lja3/a0;->a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/w;->x:Lja3/a0;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->q:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    invoke-virtual {v0, v1}, Lja3/a0;->h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->p:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    const/4 v1, 0x0

    iget-object v2, p0, Lja3/w;->x:Lja3/a0;

    invoke-virtual {v2, v0, v1}, Lja3/a0;->b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lja3/w;->x:Lja3/a0;

    invoke-virtual {v0}, Lja3/a0;->d()Lja3/c;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->m:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "kindFilter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a:Ljava/util/List;

    sget-object v2, Lz93/c;->z:Lz93/c;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    sget v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->l:I

    invoke-virtual {v0, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v4

    iget-object v5, p0, Lja3/w;->x:Lja3/a0;

    sget-object v6, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->w:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;

    if-eqz v4, :cond_0

    invoke-virtual {v5, v0, v6}, Lja3/a0;->a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lva3/h;

    invoke-virtual {v6, v7}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v7

    invoke-static {v3, v7}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->i:I

    invoke-virtual {v0, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v5, v0, v6}, Lja3/a0;->b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lva3/h;

    invoke-virtual {v6, v7}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v7, v2}, Lja3/a0;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_1
    sget v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->j:I

    invoke-virtual {v0, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v5, v0}, Lja3/a0;->h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lva3/h;

    invoke-virtual {v6, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v1, v2}, Lja3/a0;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_2
    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
