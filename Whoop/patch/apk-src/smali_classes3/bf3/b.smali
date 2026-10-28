.class public final Lbf3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lkr/e;

.field public final d:Ljava/util/ArrayList;

.field public final e:I


# direct methods
.method public constructor <init>(Lab/i0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lab/i0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lab/i0;->F:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    sget-object v2, Lxe3/g;->r:Ljava/util/LinkedHashSet;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    sget-object v3, Lxe3/g;->s:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lbf3/b;->a:Ljava/util/ArrayList;

    new-instance v0, Lkr/e;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    iput-object v0, p0, Lbf3/b;->c:Lkr/e;

    iget-object v0, p1, Lab/i0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lbf3/b;->d:Ljava/util/ArrayList;

    iget-object v0, p1, Lab/i0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lbf3/b;->b:Ljava/util/ArrayList;

    iget p1, p1, Lab/i0;->x:I

    iput p1, p0, Lbf3/b;->e:I

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lye3/a;

    const/16 v2, 0x2a

    invoke-direct {v1, v2}, Lye3/a;-><init>(C)V

    new-instance v2, Lye3/a;

    const/16 v3, 0x5f

    invoke-direct {v2, v3}, Lye3/a;-><init>(C)V

    const/4 v3, 0x2

    new-array v4, v3, [Ldf3/a;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, p1}, Lxe3/k;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    invoke-static {v0, p1}, Lxe3/k;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v2, 0x5c

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    new-instance v4, Lye3/c;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x60

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    new-instance v4, Lye3/d;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x26

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    new-instance v4, Lye3/e;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x3c

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    new-instance v4, Lye3/b;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lye3/f;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-array v3, v3, [Lye3/g;

    aput-object v4, v3, v5

    aput-object v6, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_2

    :cond_2
    const/16 p1, 0x5b

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x5d

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x21

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0xa

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Laf3/t;
    .locals 8

    if-eqz p1, :cond_8

    new-instance v0, Lxe3/g;

    iget-object v1, p0, Lbf3/b;->b:Ljava/util/ArrayList;

    iget v2, p0, Lbf3/b;->e:I

    iget-object v3, p0, Lbf3/b;->a:Ljava/util/ArrayList;

    iget-object v4, p0, Lbf3/b;->c:Lkr/e;

    invoke-direct {v0, v3, v4, v1, v2}, Lxe3/g;-><init>(Ljava/util/ArrayList;Lkr/e;Ljava/util/ArrayList;I)V

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    move v3, v1

    :goto_1
    const/4 v4, -0x1

    const/16 v5, 0xd

    const/16 v6, 0xa

    if-ge v3, v2, :cond_1

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-eq v7, v6, :cond_2

    if-eq v7, v5, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v4

    :cond_2
    if-eq v3, v4, :cond_3

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe3/g;->i(Ljava/lang/String;)V

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_0

    add-int/lit8 v3, v3, 0x2

    move v1, v3

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_5

    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxe3/g;->i(Ljava/lang/String;)V

    :cond_5
    iget-object p1, v0, Lxe3/g;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Lxe3/g;->f(I)V

    new-instance p1, Lpg3/p;

    const/16 v1, 0xd

    const/4 v2, 0x0

    iget-object v3, v0, Lxe3/g;->l:Ljava/util/List;

    iget-object v4, v0, Lxe3/g;->o:Lbi/p;

    invoke-direct {p1, v3, v4, v2, v1}, Lpg3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iget-object v1, v0, Lxe3/g;->k:Lkr/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lxe3/k;

    invoke-direct {v1, p1}, Lxe3/k;-><init>(Lpg3/p;)V

    iget-object p1, v0, Lxe3/g;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcf3/a;

    invoke-virtual {v2, v1}, Lcf3/a;->h(Lxe3/k;)V

    goto :goto_2

    :cond_6
    iget-object p1, v0, Lxe3/g;->n:Lxe3/e;

    iget-object p1, p1, Lxe3/e;->b:Laf3/a;

    check-cast p1, Laf3/g;

    iget-object v0, p0, Lbf3/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbf3/c;

    invoke-interface {v1, p1}, Lbf3/c;->a(Laf3/t;)Laf3/t;

    move-result-object p1

    goto :goto_3

    :cond_7
    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
