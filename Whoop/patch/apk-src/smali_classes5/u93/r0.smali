.class public final Lu93/r0;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# instance fields
.field public final b:Lr93/b0;

.field public final c:Lva3/e;


# direct methods
.method public constructor <init>(Lr93/b0;Lva3/e;)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93/r0;->b:Lr93/b0;

    iput-object p2, p0, Lu93/r0;->c:Lva3/e;

    return-void
.end method


# virtual methods
.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 8

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->h:I

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu93/r0;->c:Lva3/e;

    iget-object v1, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a:Ljava/util/List;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/d;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/d;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_1
    iget-object p1, p0, Lu93/r0;->b:Lr93/b0;

    invoke-interface {p1, v0, p2}, Lr93/b0;->f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lva3/e;

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->g()Lva3/h;

    move-result-object v3

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-boolean v4, v3, Lva3/h;->x:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v3}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v3

    invoke-interface {p1, v3}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object v3

    check-cast v3, Lu93/a0;

    iget-object v4, v3, Lu93/a0;->G:Lkb3/i;

    sget-object v6, Lu93/a0;->I:[Lj93/z;

    const/4 v7, 0x1

    aget-object v6, v6, v7

    invoke-static {v4, v6}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    invoke-static {v2, v5}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "subpackages of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu93/r0;->c:Lva3/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu93/r0;->b:Lr93/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
