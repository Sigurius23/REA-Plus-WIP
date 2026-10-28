.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# instance fields
.field public final b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V
    .locals 1

    const-string v0, "workerScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-void
.end method


# virtual methods
.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getClassifierNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    instance-of v0, p1, Lr93/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    instance-of v0, p1, Lr93/w0;

    if-eqz v0, :cond_2

    check-cast p1, Lr93/w0;

    return-object p1

    :cond_2
    return-object p2
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 2

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->l:I

    iget v1, p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->b:I

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a:Ljava/util/List;

    invoke-direct {v1, v0, p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;-><init>(ILjava/util/List;)V

    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lr93/i;

    if-eqz v1, :cond_2

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object p1, p2

    :goto_2
    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->recordLookup(Lva3/h;Lz93/a;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Classes from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
