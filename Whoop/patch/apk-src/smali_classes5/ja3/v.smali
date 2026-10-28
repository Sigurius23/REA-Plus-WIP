.class public final Lja3/v;
.super Lja3/e0;
.source "SourceFile"


# instance fields
.field public final n:Lx93/x;

.field public final o:Lja3/q;

.field public final p:Lkb3/h;

.field public final q:Landroidx/lifecycle/h2;


# direct methods
.method public constructor <init>(Lzt/q;Lx93/x;Lja3/q;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lja3/a0;-><init>(Lzt/q;Lja3/o;)V

    iput-object p2, p0, Lja3/v;->n:Lx93/x;

    iput-object p3, p0, Lja3/v;->o:Lja3/q;

    iget-object p2, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Lia3/a;

    iget-object p2, p2, Lia3/a;->a:Lkb3/n;

    new-instance p3, Lce3/p;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p3, p1, p0, v1, v0}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    move-object v0, p2

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/h;

    invoke-direct {v1, v0, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/v;->p:Lkb3/h;

    new-instance p3, Lja3/l;

    const/4 v0, 0x1

    invoke-direct {p3, v0, p0, p1}, Lja3/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p2, Lkb3/k;

    invoke-virtual {p2, p3}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lja3/v;->q:Landroidx/lifecycle/h2;

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 1

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->e:I

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_0
    iget-object p1, p0, Lja3/v;->p:Lkb3/h;

    invoke-virtual {p1}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    iget-object p1, p0, Lja3/v;->n:Lx93/x;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    return-object p1
.end method

.method public final b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final d()Lja3/c;
    .locals 1

    sget-object v0, Lja3/b;->a:Lja3/b;

    return-object v0
.end method

.method public final f(Ljava/util/LinkedHashSet;Lva3/h;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lja3/v;->o(Lva3/h;Lx93/n;)Lr93/e;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 4

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->l:I

    sget v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->e:I

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object p1, p0, Lja3/a0;->d:Lkb3/c;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr93/k;

    instance-of v3, v2, Lr93/e;

    if-eqz v3, :cond_1

    check-cast v2, Lr93/e;

    invoke-interface {v2}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 0

    const-string p2, "name"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final j()Lr93/k;
    .locals 1

    iget-object v0, p0, Lja3/v;->o:Lja3/q;

    return-object v0
.end method

.method public final o(Lva3/h;Lx93/n;)Lr93/e;
    .locals 2

    sget-object v0, Lva3/j;->a:Lva3/h;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-boolean v0, p1, Lva3/h;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lja3/v;->p:Lkb3/h;

    invoke-virtual {v0}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez p2, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lja3/r;

    invoke-direct {v0, p1, p2}, Lja3/r;-><init>(Lva3/h;Lx93/n;)V

    iget-object p1, p0, Lja3/v;->q:Landroidx/lifecycle/h2;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/e;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
