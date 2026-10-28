.class public final Lxe3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/BitSet;

.field public final b:Ljava/util/HashMap;

.field public final c:Lpg3/p;

.field public final d:Ljava/util/HashMap;

.field public e:Lab/l0;

.field public f:Z

.field public g:I

.field public h:Lxe3/d;

.field public i:Lxe3/c;


# direct methods
.method public constructor <init>(Lpg3/p;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lpg3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lye3/a;

    const/16 v3, 0x2a

    invoke-direct {v2, v3}, Lye3/a;-><init>(C)V

    new-instance v3, Lye3/a;

    const/16 v4, 0x5f

    invoke-direct {v3, v4}, Lye3/a;-><init>(C)V

    const/4 v4, 0x2

    new-array v5, v4, [Ldf3/a;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v1}, Lxe3/k;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    invoke-static {v0, v1}, Lxe3/k;->b(Ljava/lang/Iterable;Ljava/util/HashMap;)V

    iput-object v1, p0, Lxe3/k;->b:Ljava/util/HashMap;

    iput-object p1, p0, Lxe3/k;->c:Lpg3/p;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lxe3/k;->d:Ljava/util/HashMap;

    const/16 v0, 0x5c

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    new-instance v3, Lye3/c;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x60

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    new-instance v3, Lye3/d;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x26

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    new-instance v3, Lye3/e;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x3c

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    new-instance v3, Lye3/b;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lye3/f;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-array v4, v4, [Lye3/g;

    aput-object v3, v4, v6

    aput-object v5, v4, v2

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    :cond_1
    const/16 p1, 0x5b

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x5d

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x21

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0xa

    invoke-virtual {v1, p1}, Ljava/util/BitSet;->set(I)V

    iput-object v1, p0, Lxe3/k;->a:Ljava/util/BitSet;

    return-void
.end method

.method public static a(CLdf3/a;Ljava/util/HashMap;)V
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldf3/a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Delimiter processor conflict with delimiter char \'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/lang/Iterable;Ljava/util/HashMap;)V
    .locals 5

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldf3/a;

    invoke-interface {v0}, Ldf3/a;->d()C

    move-result v1

    invoke-interface {v0}, Ldf3/a;->b()C

    move-result v2

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldf3/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ldf3/a;->d()C

    move-result v3

    invoke-interface {v2}, Ldf3/a;->b()C

    move-result v4

    if-ne v3, v4, :cond_1

    instance-of v3, v2, Lxe3/q;

    if-eqz v3, :cond_0

    check-cast v2, Lxe3/q;

    goto :goto_1

    :cond_0
    new-instance v3, Lxe3/q;

    invoke-direct {v3, v1}, Lxe3/q;-><init>(C)V

    invoke-virtual {v3, v2}, Lxe3/q;->e(Ldf3/a;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v2, v0}, Lxe3/q;->e(Ldf3/a;)V

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1, v0, p1}, Lxe3/k;->a(CLdf3/a;Ljava/util/HashMap;)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v0, p1}, Lxe3/k;->a(CLdf3/a;Ljava/util/HashMap;)V

    invoke-static {v2, v0, p1}, Lxe3/k;->a(CLdf3/a;Ljava/util/HashMap;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static i(Laa3/u0;)Laf3/a0;
    .locals 2

    new-instance v0, Laf3/a0;

    invoke-virtual {p0}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf3/t;->h(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final c(Laf3/t;)V
    .locals 7

    iget-object v0, p1, Laf3/t;->b:Laf3/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Laf3/t;->c:Laf3/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v1

    move-object v4, v3

    move v5, v2

    :goto_0
    if-eqz v0, :cond_4

    instance-of v6, v0, Laf3/a0;

    if-eqz v6, :cond_2

    move-object v4, v0

    check-cast v4, Laf3/a0;

    if-nez v3, :cond_1

    move-object v3, v4

    :cond_1
    iget-object v6, v4, Laf3/a0;->g:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v5

    move v5, v6

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3, v4, v5}, Lxe3/k;->d(Laf3/a0;Laf3/a0;I)V

    invoke-virtual {p0, v0}, Lxe3/k;->c(Laf3/t;)V

    move-object v3, v1

    move-object v4, v3

    move v5, v2

    :goto_1
    if-ne v0, p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, v0, Laf3/t;->e:Laf3/t;

    goto :goto_0

    :cond_4
    :goto_2
    invoke-virtual {p0, v3, v4, v5}, Lxe3/k;->d(Laf3/a0;Laf3/a0;I)V

    return-void
.end method

.method public final d(Laf3/a0;Laf3/a0;I)V
    .locals 3

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    if-eq p1, p2, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object p3, p1, Laf3/a0;->g:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p3, p0, Lxe3/k;->f:Z

    if-eqz p3, :cond_0

    new-instance p3, Laa3/u0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Laf3/t;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p3, v1}, Laa3/u0;->g(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iget-object v1, p1, Laf3/t;->e:Laf3/t;

    iget-object p2, p2, Laf3/t;->e:Laf3/t;

    :goto_1
    if-eq v1, p2, :cond_2

    move-object v2, v1

    check-cast v2, Laf3/a0;

    iget-object v2, v2, Laf3/a0;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Laf3/t;->e()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Laa3/u0;->g(Ljava/util/List;)V

    :cond_1
    iget-object v2, v1, Laf3/t;->e:Laf3/t;

    invoke-virtual {v1}, Laf3/t;->j()V

    move-object v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Laf3/a0;->g:Ljava/lang/String;

    if-eqz p3, :cond_4

    iget-object p2, p3, Laa3/u0;->a:Ljava/util/ArrayList;

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_2
    invoke-virtual {p1, p2}, Laf3/t;->h(Ljava/util/List;)V

    :cond_4
    return-void
.end method

.method public final e(Laa3/u0;Laf3/t;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Lab/l0;

    move-object/from16 v3, p1

    iget-object v4, v3, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Lab/l0;-><init>(Ljava/util/List;)V

    iput-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v3}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iput-boolean v2, v0, Lxe3/k;->f:Z

    const/4 v2, 0x0

    iput v2, v0, Lxe3/k;->g:I

    const/4 v4, 0x0

    iput-object v4, v0, Lxe3/k;->h:Lxe3/d;

    iput-object v4, v0, Lxe3/k;->i:Lxe3/c;

    :goto_0
    iget-object v5, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v5}, Lab/l0;->l()C

    move-result v8

    if-eqz v8, :cond_45

    const/16 v5, 0xa

    if-eq v8, v5, :cond_43

    const/16 v6, 0x21

    const/16 v7, 0x5b

    if-eq v8, v6, :cond_40

    if-eq v8, v7, :cond_3e

    const/16 v6, 0x5d

    if-eq v8, v6, :cond_22

    iget-object v6, v0, Lxe3/k;->a:Ljava/util/BitSet;

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->get(I)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v0}, Lxe3/k;->f()Laf3/a0;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    :goto_1
    move v4, v2

    goto/16 :goto_26

    :cond_0
    iget-object v6, v0, Lxe3/k;->d:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_3

    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v7}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lye3/g;

    invoke-interface {v9, v0}, Lye3/g;->a(Lxe3/k;)Lpg3/p;

    move-result-object v9

    if-eqz v9, :cond_2

    iget-object v5, v9, Lpg3/p;->x:Ljava/lang/Object;

    check-cast v5, Laf3/t;

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    iget-object v8, v9, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v8, Lc9/k;

    invoke-virtual {v6, v8}, Lab/l0;->n(Lc9/k;)V

    iget-boolean v6, v0, Lxe3/k;->f:Z

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Laf3/t;->e()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6}, Lab/l0;->m()Lc9/k;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v6

    invoke-virtual {v6}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v5, v6}, Laf3/t;->h(Ljava/util/List;)V

    :cond_1
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto :goto_1

    :cond_2
    iget-object v9, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v9, v7}, Lab/l0;->n(Lc9/k;)V

    goto :goto_2

    :cond_3
    iget-object v6, v0, Lxe3/k;->b:Ljava/util/HashMap;

    invoke-static {v8}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldf3/a;

    if-eqz v6, :cond_21

    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    iget v9, v7, Lab/l0;->d:I

    if-lez v9, :cond_4

    add-int/lit8 v10, v9, -0x1

    iget-object v11, v7, Lab/l0;->f:Ljava/lang/Object;

    check-cast v11, Lbf3/d;

    iget-object v11, v11, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v11, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v12

    if-eqz v12, :cond_6

    if-lez v10, :cond_6

    iget-object v7, v7, Lab/l0;->f:Ljava/lang/Object;

    check-cast v7, Lbf3/d;

    iget-object v7, v7, Lbf3/d;->a:Ljava/lang/CharSequence;

    add-int/lit8 v9, v9, -0x2

    invoke-interface {v7, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-static {v7, v11}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v11

    goto :goto_3

    :cond_4
    iget v7, v7, Lab/l0;->c:I

    if-lez v7, :cond_5

    move v11, v5

    goto :goto_3

    :cond_5
    move v11, v2

    :cond_6
    :goto_3
    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v7}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    iget-object v9, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v9, v8}, Lab/l0;->g(C)I

    move-result v9

    invoke-interface {v6}, Ldf3/a;->c()I

    move-result v10

    if-ge v9, v10, :cond_7

    iget-object v5, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v5, v7}, Lab/l0;->n(Lc9/k;)V

    move-object v7, v4

    goto/16 :goto_14

    :cond_7
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iget-object v10, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v10, v7}, Lab/l0;->n(Lc9/k;)V

    :goto_4
    iget-object v10, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v10, v8}, Lab/l0;->j(C)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-object v10, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v10}, Lab/l0;->m()Lc9/k;

    move-result-object v12

    invoke-virtual {v10, v7, v12}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v7

    invoke-static {v7}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v7}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    goto :goto_4

    :cond_8
    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    iget v10, v7, Lab/l0;->d:I

    iget v12, v7, Lab/l0;->e:I

    if-ge v10, v12, :cond_9

    iget-object v5, v7, Lab/l0;->f:Ljava/lang/Object;

    check-cast v5, Lbf3/d;

    iget-object v5, v5, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v5, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_b

    iget v10, v7, Lab/l0;->d:I

    add-int/2addr v10, v3

    iget v12, v7, Lab/l0;->e:I

    if-ge v10, v12, :cond_b

    iget-object v7, v7, Lab/l0;->f:Ljava/lang/Object;

    check-cast v7, Lbf3/d;

    iget-object v7, v7, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v7, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-static {v5, v7}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v5

    goto :goto_5

    :cond_9
    iget v10, v7, Lab/l0;->c:I

    iget-object v7, v7, Lab/l0;->b:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v3

    if-ge v10, v7, :cond_a

    goto :goto_5

    :cond_a
    move v5, v2

    :cond_b
    :goto_5
    if-eqz v11, :cond_d

    invoke-static {v11}, Ls3/d;->k(I)Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_6

    :cond_c
    move v7, v2

    goto :goto_7

    :cond_d
    :goto_6
    move v7, v3

    :goto_7
    if-eqz v11, :cond_f

    invoke-static {v11}, Ls3/d;->l(I)Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_8

    :cond_e
    move v10, v2

    goto :goto_9

    :cond_f
    :goto_8
    move v10, v3

    :goto_9
    if-eqz v5, :cond_11

    invoke-static {v5}, Ls3/d;->k(I)Z

    move-result v11

    if-eqz v11, :cond_10

    goto :goto_a

    :cond_10
    move v11, v2

    goto :goto_b

    :cond_11
    :goto_a
    move v11, v3

    :goto_b
    if-eqz v5, :cond_13

    invoke-static {v5}, Ls3/d;->l(I)Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_c

    :cond_12
    move v5, v2

    goto :goto_d

    :cond_13
    :goto_c
    move v5, v3

    :goto_d
    if-nez v5, :cond_15

    if-eqz v11, :cond_14

    if-nez v10, :cond_14

    if-eqz v7, :cond_15

    :cond_14
    move v12, v3

    goto :goto_e

    :cond_15
    move v12, v2

    :goto_e
    if-nez v10, :cond_17

    if-eqz v7, :cond_16

    if-nez v5, :cond_16

    if-eqz v11, :cond_17

    :cond_16
    move v5, v3

    goto :goto_f

    :cond_17
    move v5, v2

    :goto_f
    const/16 v10, 0x5f

    if-ne v8, v10, :cond_1c

    if-eqz v12, :cond_19

    if-eqz v5, :cond_18

    if-eqz v7, :cond_19

    :cond_18
    move v6, v3

    goto :goto_10

    :cond_19
    move v6, v2

    :goto_10
    if-eqz v5, :cond_1b

    if-eqz v12, :cond_1a

    if-eqz v11, :cond_1b

    :cond_1a
    move v5, v3

    goto :goto_13

    :cond_1b
    move v5, v2

    goto :goto_13

    :cond_1c
    if-eqz v12, :cond_1d

    invoke-interface {v6}, Ldf3/a;->d()C

    move-result v7

    if-ne v8, v7, :cond_1d

    move v7, v3

    goto :goto_11

    :cond_1d
    move v7, v2

    :goto_11
    if-eqz v5, :cond_1e

    invoke-interface {v6}, Ldf3/a;->b()C

    move-result v5

    if-ne v8, v5, :cond_1e

    move v5, v3

    goto :goto_12

    :cond_1e
    move v5, v2

    :goto_12
    move v6, v7

    :goto_13
    new-instance v7, Ltp/i;

    invoke-direct {v7, v9, v6, v5}, Ltp/i;-><init>(Ljava/util/ArrayList;ZZ)V

    :goto_14
    if-nez v7, :cond_1f

    move-object v5, v4

    goto :goto_15

    :cond_1f
    iget-object v5, v7, Ltp/i;->a:Ljava/util/ArrayList;

    new-instance v6, Lxe3/d;

    iget-boolean v9, v7, Ltp/i;->c:Z

    iget-boolean v10, v7, Ltp/i;->b:Z

    iget-object v11, v0, Lxe3/k;->h:Lxe3/d;

    move-object v7, v5

    invoke-direct/range {v6 .. v11}, Lxe3/d;-><init>(Ljava/util/ArrayList;CZZLxe3/d;)V

    iput-object v6, v0, Lxe3/k;->h:Lxe3/d;

    iget-object v5, v6, Lxe3/d;->f:Lxe3/d;

    if-eqz v5, :cond_20

    iput-object v6, v5, Lxe3/d;->g:Lxe3/d;

    :cond_20
    move-object v5, v7

    :goto_15
    if-eqz v5, :cond_21

    goto/16 :goto_1

    :cond_21
    invoke-virtual {v0}, Lxe3/k;->f()Laf3/a0;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_1

    :cond_22
    iget-object v5, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v5}, Lab/l0;->m()Lc9/k;

    move-result-object v5

    iget-object v8, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v8}, Lab/l0;->i()V

    iget-object v8, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v8}, Lab/l0;->m()Lc9/k;

    move-result-object v8

    iget-object v9, v0, Lxe3/k;->i:Lxe3/c;

    if-nez v9, :cond_23

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6, v5, v8}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v5

    invoke-static {v5}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v5

    :goto_16
    move v4, v2

    goto/16 :goto_23

    :cond_23
    iget-object v10, v9, Lxe3/c;->a:Laf3/a0;

    iget-boolean v11, v9, Lxe3/c;->d:Z

    iget-boolean v12, v9, Lxe3/c;->g:Z

    if-nez v12, :cond_24

    iget-object v6, v9, Lxe3/c;->e:Lxe3/c;

    iput-object v6, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6, v5, v8}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v5

    invoke-static {v5}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v5

    goto :goto_16

    :cond_24
    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    const/16 v13, 0x28

    invoke-virtual {v12, v13}, Lab/l0;->j(C)Z

    move-result v12

    if-eqz v12, :cond_2e

    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v12}, Lab/l0;->o()I

    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v12}, Lab/l0;->l()C

    move-result v14

    invoke-virtual {v12}, Lab/l0;->m()Lc9/k;

    move-result-object v15

    invoke-static {v12}, Ls2/h;->l(Lab/l0;)Z

    move-result v16

    if-nez v16, :cond_25

    goto :goto_18

    :cond_25
    const/16 v4, 0x3c

    if-ne v14, v4, :cond_26

    invoke-virtual {v12}, Lab/l0;->m()Lc9/k;

    move-result-object v4

    invoke-virtual {v12, v15, v4}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v4

    invoke-virtual {v4}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v12

    sub-int/2addr v12, v3

    invoke-virtual {v4, v3, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_17

    :cond_26
    invoke-virtual {v12}, Lab/l0;->m()Lc9/k;

    move-result-object v4

    invoke-virtual {v12, v15, v4}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v4

    invoke-virtual {v4}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v4

    :goto_17
    invoke-static {v4}, Lze3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_18
    if-nez v4, :cond_27

    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v12, v8}, Lab/l0;->n(Lc9/k;)V

    const/4 v2, 0x0

    goto/16 :goto_1c

    :cond_27
    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v12}, Lab/l0;->o()I

    move-result v12

    const/16 v14, 0x29

    if-lt v12, v3, :cond_2d

    iget-object v12, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v12}, Lab/l0;->m()Lc9/k;

    move-result-object v15

    invoke-virtual {v12}, Lab/l0;->e()Z

    move-result v16

    if-nez v16, :cond_28

    goto :goto_19

    :cond_28
    invoke-virtual {v12}, Lab/l0;->l()C

    move-result v2

    const/16 v6, 0x22

    if-eq v2, v6, :cond_2a

    const/16 v6, 0x27

    if-eq v2, v6, :cond_2a

    if-eq v2, v13, :cond_29

    goto :goto_19

    :cond_29
    move v6, v14

    :cond_2a
    invoke-virtual {v12}, Lab/l0;->i()V

    invoke-static {v12, v6}, Ls2/h;->o(Lab/l0;C)Z

    move-result v2

    if-nez v2, :cond_2b

    goto :goto_19

    :cond_2b
    invoke-virtual {v12}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_2c

    :goto_19
    const/4 v2, 0x0

    goto :goto_1a

    :cond_2c
    invoke-virtual {v12}, Lab/l0;->i()V

    invoke-virtual {v12}, Lab/l0;->m()Lc9/k;

    move-result-object v2

    invoke-virtual {v12, v15, v2}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v3

    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lze3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1a
    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6}, Lab/l0;->o()I

    goto :goto_1b

    :cond_2d
    const/4 v2, 0x0

    :goto_1b
    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6, v14}, Lab/l0;->j(C)Z

    move-result v6

    if-nez v6, :cond_2f

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v8}, Lab/l0;->n(Lc9/k;)V

    :cond_2e
    const/4 v2, 0x0

    const/4 v4, 0x0

    :cond_2f
    :goto_1c
    if-nez v4, :cond_37

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v6, v7}, Lab/l0;->j(C)Z

    move-result v7

    if-nez v7, :cond_30

    :goto_1d
    const/4 v6, 0x0

    goto :goto_1e

    :cond_30
    invoke-virtual {v6}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    invoke-static {v6}, Ls2/h;->n(Lab/l0;)Z

    move-result v12

    if-nez v12, :cond_31

    goto :goto_1d

    :cond_31
    invoke-virtual {v6}, Lab/l0;->m()Lc9/k;

    move-result-object v12

    const/16 v13, 0x5d

    invoke-virtual {v6, v13}, Lab/l0;->j(C)Z

    move-result v13

    if-nez v13, :cond_32

    goto :goto_1d

    :cond_32
    invoke-virtual {v6, v7, v12}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v6

    invoke-virtual {v6}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v12, 0x3e7

    if-le v7, v12, :cond_33

    goto :goto_1d

    :cond_33
    :goto_1e
    if-nez v6, :cond_34

    iget-object v7, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v7, v8}, Lab/l0;->n(Lc9/k;)V

    :cond_34
    if-eqz v6, :cond_35

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_36

    :cond_35
    iget-boolean v7, v9, Lxe3/c;->h:Z

    if-nez v7, :cond_36

    iget-object v6, v0, Lxe3/k;->e:Lab/l0;

    iget-object v7, v9, Lxe3/c;->c:Lc9/k;

    invoke-virtual {v6, v7, v5}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v6

    invoke-virtual {v6}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v6

    :cond_36
    if-eqz v6, :cond_37

    iget-object v7, v0, Lxe3/k;->c:Lpg3/p;

    iget-object v7, v7, Lpg3/p;->y:Ljava/lang/Object;

    check-cast v7, Lbi/p;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Lze3/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, v7, Lbi/p;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Laf3/q;

    if-eqz v6, :cond_37

    iget-object v4, v6, Laf3/q;->h:Ljava/lang/String;

    iget-object v2, v6, Laf3/q;->i:Ljava/lang/String;

    :cond_37
    if-eqz v4, :cond_3d

    if-eqz v11, :cond_38

    new-instance v5, Laf3/n;

    invoke-direct {v5}, Laf3/t;-><init>()V

    iput-object v4, v5, Laf3/n;->g:Ljava/lang/String;

    iput-object v2, v5, Laf3/n;->h:Ljava/lang/String;

    goto :goto_1f

    :cond_38
    new-instance v5, Laf3/p;

    invoke-direct {v5, v4, v2}, Laf3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1f
    iget-object v2, v10, Laf3/t;->e:Laf3/t;

    :goto_20
    if-eqz v2, :cond_39

    iget-object v4, v2, Laf3/t;->e:Laf3/t;

    invoke-virtual {v5, v2}, Laf3/t;->c(Laf3/t;)V

    move-object v2, v4

    goto :goto_20

    :cond_39
    iget-boolean v2, v0, Lxe3/k;->f:Z

    if-eqz v2, :cond_3a

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    iget-object v4, v9, Lxe3/c;->b:Lc9/k;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v5, v2}, Laf3/t;->h(Ljava/util/List;)V

    :cond_3a
    iget-object v2, v9, Lxe3/c;->f:Lxe3/d;

    invoke-virtual {v0, v2}, Lxe3/k;->g(Lxe3/d;)V

    invoke-virtual {v0, v5}, Lxe3/k;->c(Laf3/t;)V

    invoke-virtual {v10}, Laf3/t;->j()V

    iget-object v2, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v2, v2, Lxe3/c;->e:Lxe3/c;

    iput-object v2, v0, Lxe3/k;->i:Lxe3/c;

    if-nez v11, :cond_3c

    :goto_21
    if-eqz v2, :cond_3c

    iget-boolean v4, v2, Lxe3/c;->d:Z

    if-nez v4, :cond_3b

    const/4 v4, 0x0

    iput-boolean v4, v2, Lxe3/c;->g:Z

    goto :goto_22

    :cond_3b
    const/4 v4, 0x0

    :goto_22
    iget-object v2, v2, Lxe3/c;->e:Lxe3/c;

    goto :goto_21

    :cond_3c
    const/4 v4, 0x0

    goto :goto_23

    :cond_3d
    const/4 v4, 0x0

    iget-object v2, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v2, v2, Lxe3/c;->e:Lxe3/c;

    iput-object v2, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v8}, Lab/l0;->n(Lc9/k;)V

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v5, v8}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-static {v2}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v5

    :goto_23
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto/16 :goto_26

    :cond_3e
    move v4, v2

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->i()V

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v8

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v7, v8}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-static {v2}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v6

    iget-object v9, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v10, v0, Lxe3/k;->h:Lxe3/d;

    new-instance v5, Lxe3/c;

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lxe3/c;-><init>(Laf3/a0;Lc9/k;Lc9/k;Lxe3/c;Lxe3/d;Z)V

    if-eqz v9, :cond_3f

    iput-boolean v3, v9, Lxe3/c;->h:Z

    :cond_3f
    iput-object v5, v0, Lxe3/k;->i:Lxe3/c;

    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto :goto_26

    :cond_40
    move v4, v2

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v10

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->i()V

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v7}, Lab/l0;->j(C)Z

    move-result v2

    if-eqz v2, :cond_42

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v11

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2, v10, v11}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-static {v2}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v9

    iget-object v12, v0, Lxe3/k;->i:Lxe3/c;

    iget-object v13, v0, Lxe3/k;->h:Lxe3/d;

    new-instance v8, Lxe3/c;

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lxe3/c;-><init>(Laf3/a0;Lc9/k;Lc9/k;Lxe3/c;Lxe3/d;Z)V

    if-eqz v12, :cond_41

    iput-boolean v3, v12, Lxe3/c;->h:Z

    :cond_41
    iput-object v8, v0, Lxe3/k;->i:Lxe3/c;

    goto :goto_24

    :cond_42
    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v5

    invoke-virtual {v2, v10, v5}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-static {v2}, Lxe3/k;->i(Laa3/u0;)Laf3/a0;

    move-result-object v9

    :goto_24
    invoke-static {v9}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto :goto_26

    :cond_43
    move v4, v2

    iget-object v2, v0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->i()V

    iget v2, v0, Lxe3/k;->g:I

    const/4 v5, 0x2

    if-lt v2, v5, :cond_44

    new-instance v2, Laf3/j;

    invoke-direct {v2}, Laf3/t;-><init>()V

    goto :goto_25

    :cond_44
    new-instance v2, Laf3/x;

    invoke-direct {v2}, Laf3/t;-><init>()V

    :goto_25
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    goto :goto_26

    :cond_45
    move v4, v2

    const/4 v5, 0x0

    :goto_26
    if-eqz v5, :cond_47

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_46

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Laf3/t;

    invoke-virtual {v1, v5}, Laf3/t;->c(Laf3/t;)V

    goto :goto_27

    :cond_46
    move v2, v4

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_47
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lxe3/k;->g(Lxe3/d;)V

    invoke-virtual {v0, v1}, Lxe3/k;->c(Laf3/t;)V

    return-void
.end method

.method public final f()Laf3/a0;
    .locals 6

    iget-object v0, p0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v0}, Lab/l0;->m()Lc9/k;

    move-result-object v0

    iget-object v1, p0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v1}, Lab/l0;->i()V

    :goto_0
    iget-object v1, p0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v1}, Lab/l0;->l()C

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lxe3/k;->a:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v1}, Lab/l0;->i()V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Lxe3/k;->e:Lab/l0;

    invoke-virtual {v2}, Lab/l0;->m()Lc9/k;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v0

    invoke-virtual {v0}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-ne v1, v3, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_2
    if-ltz v1, :cond_3

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x20

    if-eq v3, v5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_3
    const/4 v1, -0x1

    :goto_3
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    iput v3, p0, Lxe3/k;->g:I

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_4
    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v2, v1, v4}, Ls3/d;->s(Ljava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_5
    :goto_4
    new-instance v1, Laf3/a0;

    invoke-direct {v1, v2}, Laf3/a0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Laa3/u0;->o()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v0}, Laf3/t;->h(Ljava/util/List;)V

    return-object v1
.end method

.method public final g(Lxe3/d;)V
    .locals 12

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lxe3/k;->h:Lxe3/d;

    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v1, Lxe3/d;->f:Lxe3/d;

    if-eq v2, p1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz v1, :cond_c

    iget-object v2, v1, Lxe3/d;->a:Ljava/util/ArrayList;

    iget-char v3, v1, Lxe3/d;->b:C

    iget-object v4, p0, Lxe3/k;->b:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldf3/a;

    iget-boolean v5, v1, Lxe3/d;->e:Z

    if-eqz v5, :cond_b

    if-nez v4, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-interface {v4}, Ldf3/a;->d()C

    move-result v5

    iget-object v6, v1, Lxe3/d;->f:Lxe3/d;

    const/4 v7, 0x0

    move v8, v7

    move v9, v8

    :goto_2
    const/4 v10, 0x1

    if-eqz v6, :cond_4

    if-eq v6, p1, :cond_4

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eq v6, v11, :cond_4

    iget-boolean v11, v6, Lxe3/d;->d:Z

    if-eqz v11, :cond_3

    iget-char v11, v6, Lxe3/d;->b:C

    if-ne v11, v5, :cond_3

    invoke-interface {v4, v6, v1}, Ldf3/a;->a(Lxe3/d;Lxe3/d;)I

    move-result v8

    if-lez v8, :cond_2

    move v4, v10

    move v9, v4

    goto :goto_3

    :cond_2
    move v9, v10

    :cond_3
    iget-object v6, v6, Lxe3/d;->f:Lxe3/d;

    goto :goto_2

    :cond_4
    move v4, v7

    :goto_3
    if-nez v4, :cond_6

    if-nez v9, :cond_5

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    iget-object v3, v1, Lxe3/d;->f:Lxe3/d;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v2, v1, Lxe3/d;->d:Z

    if-nez v2, :cond_5

    invoke-virtual {p0, v1}, Lxe3/k;->h(Lxe3/d;)V

    :cond_5
    iget-object v1, v1, Lxe3/d;->g:Lxe3/d;

    goto :goto_1

    :cond_6
    move v3, v7

    :goto_4
    if-ge v3, v8, :cond_7

    iget-object v4, v6, Lxe3/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v10

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf3/a0;

    invoke-virtual {v4}, Laf3/t;->j()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_7
    move v3, v7

    :goto_5
    if-ge v3, v8, :cond_8

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laf3/a0;

    invoke-virtual {v4}, Laf3/t;->j()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_8
    iget-object v3, v1, Lxe3/d;->f:Lxe3/d;

    :goto_6
    if-eqz v3, :cond_9

    if-eq v3, v6, :cond_9

    iget-object v4, v3, Lxe3/d;->f:Lxe3/d;

    invoke-virtual {p0, v3}, Lxe3/k;->h(Lxe3/d;)V

    move-object v3, v4

    goto :goto_6

    :cond_9
    iget-object v3, v6, Lxe3/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {p0, v6}, Lxe3/k;->h(Lxe3/d;)V

    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lxe3/d;->g:Lxe3/d;

    invoke-virtual {p0, v1}, Lxe3/k;->h(Lxe3/d;)V

    move-object v1, v2

    goto/16 :goto_1

    :cond_b
    :goto_7
    iget-object v1, v1, Lxe3/d;->g:Lxe3/d;

    goto/16 :goto_1

    :cond_c
    :goto_8
    iget-object v0, p0, Lxe3/k;->h:Lxe3/d;

    if-eqz v0, :cond_d

    if-eq v0, p1, :cond_d

    invoke-virtual {p0, v0}, Lxe3/k;->h(Lxe3/d;)V

    goto :goto_8

    :cond_d
    return-void
.end method

.method public final h(Lxe3/d;)V
    .locals 2

    iget-object v0, p1, Lxe3/d;->f:Lxe3/d;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lxe3/d;->g:Lxe3/d;

    iput-object v1, v0, Lxe3/d;->g:Lxe3/d;

    :cond_0
    iget-object p1, p1, Lxe3/d;->g:Lxe3/d;

    if-nez p1, :cond_1

    iput-object v0, p0, Lxe3/k;->h:Lxe3/d;

    return-void

    :cond_1
    iput-object v0, p1, Lxe3/d;->f:Lxe3/d;

    return-void
.end method
