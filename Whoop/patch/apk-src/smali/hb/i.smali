.class public final Lhb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Leb/t;

.field public final synthetic b:Lhb/f;


# direct methods
.method public constructor <init>(Leb/t;Lhb/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/i;->a:Leb/t;

    iput-object p2, p0, Lhb/i;->b:Lhb/f;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/m0;Z)V
    .locals 12

    iget-object v0, p0, Lhb/i;->b:Lhb/f;

    iget-object v1, v0, Lhb/f;->g:Ljava/util/ArrayList;

    const-string v2, "fragment"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lhb/i;->a:Leb/t;

    iget-object v3, v2, Leb/t;->e:Lec3/r1;

    iget-object v3, v3, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    iget-object v4, v2, Leb/t;->f:Lec3/r1;

    iget-object v4, v4, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Leb/q;

    iget-object v6, v6, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    check-cast v4, Leb/q;

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->isRemoving()Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v3

    goto :goto_1

    :cond_2
    move v7, v6

    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ll83/k;

    iget-object v10, v10, Ll83/k;->w:Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    move-object v5, v9

    :cond_4
    check-cast v5, Ll83/k;

    if-eqz v5, :cond_5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_5
    const-string v1, "OnBackStackChangedCommitted for fragment "

    const-string v8, "FragmentNavigator"

    if-nez v7, :cond_6

    invoke-static {}, Lhb/f;->n()Z

    move-result v9

    if-eqz v9, :cond_6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " associated with entry "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    if-eqz v5, :cond_7

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-ne v5, v3, :cond_7

    goto :goto_2

    :cond_7
    move v3, v6

    :goto_2
    if-nez p2, :cond_9

    if-nez v3, :cond_9

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string p2, "The fragment "

    const-string v0, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."

    invoke-static {p1, p2, v0}, Ld;->l(Landroidx/fragment/app/m0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    :goto_3
    if-eqz v4, :cond_b

    invoke-virtual {v0, p1, v4, v2}, Lhb/f;->l(Landroidx/fragment/app/m0;Leb/q;Leb/t;)V

    if-eqz v7, :cond_b

    invoke-static {}, Lhb/f;->n()Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " popping associated entry "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " via system back"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v8, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    invoke-virtual {v2, v4, v6}, Leb/t;->f(Leb/q;Z)V

    :cond_b
    return-void
.end method

.method public final b(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_3

    iget-object p2, p0, Lhb/i;->a:Leb/t;

    iget-object v0, p2, Leb/t;->e:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Leb/q;

    iget-object v2, v2, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getTag()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Leb/q;

    invoke-static {}, Lhb/f;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "OnBackStackChangedStarted for fragment "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " associated with entry "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentNavigator"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p2, v1}, Leb/t;->g(Leb/q;)V

    :cond_3
    return-void
.end method
