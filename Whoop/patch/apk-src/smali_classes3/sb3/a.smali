.class public abstract Lsb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lv2/c;Lu2/r;J)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    invoke-static {v1}, Lu2/d0;->c(Lu2/r;)Z

    move-result v4

    iget-wide v5, v1, Lu2/r;->b:J

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v4, :cond_0

    iget-object v4, v0, Lv2/c;->a:Lrm/j1;

    iget-object v11, v4, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v11, [Lv2/a;

    invoke-static {v11, v9}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iput v10, v4, Lrm/j1;->c:I

    iget-object v4, v0, Lv2/c;->b:Lrm/j1;

    iget-object v11, v4, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v11, [Lv2/a;

    invoke-static {v11, v9}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iput v10, v4, Lrm/j1;->c:I

    iput-wide v7, v0, Lv2/c;->c:J

    :cond_0
    invoke-static {v1}, Lu2/d0;->e(Lu2/r;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1}, Lu2/r;->c()Ljava/util/List;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    move v12, v10

    :goto_0
    if-ge v12, v11, :cond_1

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    const-wide v17, 0xffffffffL

    move-object/from16 v13, v16

    check-cast v13, Lu2/c;

    iget-wide v7, v13, Lu2/c;->a:J

    iget-wide v13, v13, Lu2/c;->c:J

    invoke-static {v13, v14, v2, v3}, Lh2/b;->h(JJ)J

    move-result-wide v13

    const/16 v16, 0x20

    iget-object v15, v0, Lv2/c;->a:Lrm/j1;

    move/from16 v19, v11

    shr-long v10, v13, v16

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-virtual {v15, v10, v7, v8}, Lrm/j1;->a(FJ)V

    iget-object v10, v0, Lv2/c;->b:Lrm/j1;

    and-long v13, v13, v17

    long-to-int v11, v13

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    invoke-virtual {v10, v11, v7, v8}, Lrm/j1;->a(FJ)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v11, v19

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    goto :goto_0

    :cond_1
    const/16 v16, 0x20

    const-wide v17, 0xffffffffL

    iget-wide v7, v1, Lu2/r;->l:J

    invoke-static {v7, v8, v2, v3}, Lh2/b;->h(JJ)J

    move-result-wide v2

    iget-object v4, v0, Lv2/c;->a:Lrm/j1;

    shr-long v7, v2, v16

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-virtual {v4, v7, v5, v6}, Lrm/j1;->a(FJ)V

    iget-object v4, v0, Lv2/c;->b:Lrm/j1;

    and-long v2, v2, v17

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {v4, v2, v5, v6}, Lrm/j1;->a(FJ)V

    :cond_2
    invoke-static {v1}, Lu2/d0;->e(Lu2/r;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-wide v1, v0, Lv2/c;->c:J

    sub-long v1, v5, v1

    const-wide/16 v3, 0x28

    cmp-long v1, v1, v3

    if-lez v1, :cond_3

    iget-object v1, v0, Lv2/c;->a:Lrm/j1;

    iget-object v2, v1, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v2, [Lv2/a;

    invoke-static {v2, v9}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    const/4 v2, 0x0

    iput v2, v1, Lrm/j1;->c:I

    iget-object v1, v0, Lv2/c;->b:Lrm/j1;

    iget-object v3, v1, Lrm/j1;->e:Ljava/lang/Object;

    check-cast v3, [Lv2/a;

    invoke-static {v3, v9}, Lm83/n;->q0([Ljava/lang/Object;Lhc3/x;)V

    iput v2, v1, Lrm/j1;->c:I

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lv2/c;->c:J

    :cond_3
    iput-wide v5, v0, Lv2/c;->c:J

    return-void
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x61

    if-gt v1, v0, :cond_1

    const/16 v1, 0x7b

    if-ge v0, v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, p0, v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final c(Ljava/util/List;)Luc3/l;
    .locals 3

    new-instance v0, Luc3/l;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luc3/l;

    invoke-static {v2, v0}, Lsb3/a;->d(Luc3/l;Luc3/l;)Luc3/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Lsb3/a;->e(Luc3/l;Ljava/util/List;)Luc3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Luc3/l;Luc3/l;)Luc3/l;
    .locals 3

    iget-object v0, p0, Luc3/l;->b:Ljava/util/List;

    iget-object v1, p0, Luc3/l;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Luc3/l;

    check-cast v1, Ljava/util/Collection;

    iget-object v0, p1, Luc3/l;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object p1, p1, Luc3/l;->b:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0

    :cond_0
    iget-object p0, p0, Luc3/l;->b:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luc3/l;

    invoke-static {v2, p1}, Lsb3/a;->d(Luc3/l;Luc3/l;)Luc3/l;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Luc3/l;

    invoke-direct {p0, v1, v0}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final e(Luc3/l;Ljava/util/List;)Luc3/l;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v1, p0, Luc3/l;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luc3/k;

    instance-of v5, v4, Luc3/f;

    if-eqz v5, :cond_1

    if-eqz v3, :cond_0

    check-cast v4, Luc3/f;

    iget-object v4, v4, Luc3/f;->a:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    check-cast v4, Luc3/f;

    iget-object v3, v4, Luc3/f;->a:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_0

    :cond_1
    instance-of v5, v4, Luc3/p;

    if-eqz v5, :cond_2

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    new-instance v5, Luc3/f;

    invoke-direct {v5, v3}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_3
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object p0, p0, Luc3/l;->b:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luc3/l;

    invoke-static {v2, p1}, Lsb3/a;->e(Luc3/l;Ljava/util/List;)Luc3/l;

    move-result-object v2

    iget-object v4, v2, Luc3/l;->a:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v2, Luc3/l;->b:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :cond_5
    check-cast v4, Ljava/util/List;

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_2
    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_8

    new-instance p0, Luc3/l;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-direct {p0, p1, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_8
    check-cast v1, Ljava/util/List;

    if-nez v3, :cond_9

    new-instance p0, Luc3/l;

    invoke-direct {p0, v0, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0

    :cond_9
    move-object p0, v1

    check-cast p0, Ljava/lang/Iterable;

    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_a

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_a

    goto/16 :goto_5

    :cond_a
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luc3/l;

    iget-object v2, v2, Luc3/l;->a:Ljava/util/List;

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luc3/k;

    if-eqz v2, :cond_b

    instance-of v2, v2, Luc3/f;

    const/4 v4, 0x1

    if-ne v2, v4, :cond_b

    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luc3/l;

    iget-object v2, v1, Luc3/l;->a:Ljava/util/List;

    iget-object v1, v1, Luc3/l;->b:Ljava/util/List;

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luc3/k;

    instance-of v6, v5, Luc3/f;

    if-eqz v6, :cond_c

    new-instance v6, Luc3/l;

    new-instance v7, Luc3/f;

    check-cast v5, Luc3/f;

    iget-object v5, v5, Luc3/f;->a:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v3, v5}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-direct {v7, v5}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v5, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v6, v2, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_4

    :cond_c
    if-nez v5, :cond_d

    new-instance v6, Luc3/l;

    new-instance v2, Luc3/f;

    invoke-direct {v2, v3}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v6, v2, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_4

    :cond_d
    new-instance v6, Luc3/l;

    new-instance v5, Luc3/f;

    invoke-direct {v5, v3}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v5, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v6, v2, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    :goto_4
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_e
    new-instance p0, Luc3/l;

    invoke-direct {p0, v0, p1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0

    :cond_f
    :goto_5
    new-instance p0, Luc3/f;

    invoke-direct {p0, v3}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p0, Luc3/l;

    invoke-direct {p0, v0, v1}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final f([F[F)F
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget v3, p0, v2

    aget v4, p1, v2

    mul-float/2addr v3, v4

    add-float/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static varargs g([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_7

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "-"

    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_0
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    array-length v8, v2

    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Class;

    array-length v9, v7

    array-length v10, v8

    if-ne v9, v10, :cond_6

    new-instance v9, Ljava/util/ArrayList;

    array-length v10, v7

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    array-length v10, v7

    move v11, v4

    move v12, v11

    :goto_1
    if-ge v11, v10, :cond_3

    aget-object v13, v7, v11

    add-int/lit8 v14, v12, 0x1

    aget-object v12, v8, v12

    invoke-static {v13}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-static {v12}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v4, 0x1

    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move v12, v14

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_5

    :cond_6
    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_7
    const/4 v6, 0x0

    :cond_8
    :goto_4
    if-eqz v6, :cond_9

    return-object v6

    :cond_9
    new-instance v0, Ljava/lang/NoSuchMethodException;

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p2

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    aget-object v5, p2, v3

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :cond_0
    if-eqz v4, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-array p2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    :try_start_0
    array-length v0, p2

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    int-to-double v0, v0

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_1
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    move-object v5, v0

    check-cast v5, Li93/i;

    iget-boolean v5, v5, Li93/i;->y:Z

    if-eqz v5, :cond_4

    move-object v5, v0

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-array v0, v2, [Ljava/lang/Class;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    new-instance v3, Lkotlin/jvm/internal/k0;

    const/4 v5, 0x3

    invoke-direct {v3, v5}, Lkotlin/jvm/internal/k0;-><init>(I)V

    iget-object v5, v3, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, p2}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    const-class p2, Landroidx/compose/runtime/Composer;

    invoke-virtual {v3, p2}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/Class;

    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    invoke-static {v1, p1, p2}, Lsb3/a;->g([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    array-length p2, p0

    move v0, v2

    :goto_3
    if-ge v0, p2, :cond_7

    aget-object v1, p0, v0

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x2d

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    move-object v4, v1

    :catch_1
    :cond_7
    return-object v4
.end method

.method public static final i(Lj93/d;Lva3/e;)Lwb3/l;
    .locals 4

    const-string v0, "mutableFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "readonlyKClass"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwb3/l;

    iget-object v1, p1, Lva3/e;->a:Lva3/f;

    iget-object v1, v1, Lva3/f;->a:Ljava/lang/String;

    new-instance v2, Lwb3/m;

    invoke-direct {v2, p0, p1}, Lwb3/m;-><init>(Lj93/d;Lva3/e;)V

    new-instance v3, Lwb3/m;

    invoke-direct {v3, p1, p0}, Lwb3/m;-><init>(Lva3/e;Lj93/d;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lwb3/l;-><init>(Lj93/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static final j(Lwe/g;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lwe/g;->k:Lwe/b0;

    instance-of v0, p0, Lwe/y;

    if-nez v0, :cond_1

    instance-of v0, p0, Lwe/z;

    if-nez v0, :cond_1

    instance-of p0, p0, Lwe/a0;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static varargs k(Ljava/lang/String;Ljava/lang/String;Lp1/q;[Ljava/lang/Object;)V
    .locals 5

    const-string v0, "Composable "

    const/16 v1, 0x2e

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    array-length v4, p3

    invoke-static {p3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, p1, v4}, Lsb3/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_0

    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {v4, v2, p2, p3}, Lsb3/a;->l(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    array-length v3, p3

    invoke-static {p3, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {v4, v0, p2, p3}, Lsb3/a;->l(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p2, Ljava/lang/NoSuchMethodException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not found"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to invoke Composable Method \'"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "PreviewLogger"

    invoke-static {p1, p0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw p2
.end method

.method public static varargs l(Ljava/lang/reflect/Method;Ljava/lang/Object;Landroidx/compose/runtime/Composer;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v3, v2

    const/4 v4, -0x1

    add-int/2addr v3, v4

    if-ltz v3, :cond_2

    :goto_0
    add-int/lit8 v5, v3, -0x1

    aget-object v6, v2, v3

    const-class v7, Landroidx/compose/runtime/Composer;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    if-gez v5, :cond_1

    goto :goto_1

    :cond_1
    move v3, v5

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v2, 0x1

    if-eqz p1, :cond_3

    move v3, v2

    goto :goto_2

    :cond_3
    move v3, v0

    :goto_2
    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    add-int/2addr v3, v4

    int-to-double v2, v3

    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    :goto_3
    add-int/lit8 v3, v4, 0x1

    add-int/2addr v2, v3

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-eq v5, v2, :cond_5

    int-to-double v6, v4

    const-wide/high16 v8, 0x403f000000000000L    # 31.0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v6

    double-to-int v6, v6

    goto :goto_4

    :cond_5
    move v6, v0

    :goto_4
    add-int/2addr v6, v2

    if-ne v6, v5, :cond_14

    new-array v6, v5, [Ljava/lang/Object;

    move v7, v0

    :goto_5
    if-ge v7, v5, :cond_13

    if-ltz v7, :cond_e

    if-ge v7, v4, :cond_e

    if-ltz v7, :cond_6

    array-length v8, p3

    if-ge v7, v8, :cond_6

    aget-object v8, p3, v7

    goto/16 :goto_7

    :cond_6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    aget-object v8, v8, v7

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_6

    :sswitch_0
    const-string v9, "short"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    goto/16 :goto_7

    :sswitch_1
    const-string v9, "float"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    goto/16 :goto_7

    :sswitch_2
    const-string v9, "boolean"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :sswitch_3
    const-string v9, "long"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_6

    :cond_a
    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_7

    :sswitch_4
    const-string v9, "char"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    goto :goto_7

    :sswitch_5
    const-string v9, "byte"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_6

    :cond_c
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    goto :goto_7

    :sswitch_6
    const-string v9, "int"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_6

    :sswitch_7
    const-string v9, "double"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :goto_6
    const/4 v8, 0x0

    goto :goto_7

    :cond_d
    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    goto :goto_7

    :cond_e
    if-ne v7, v4, :cond_f

    move-object v8, p2

    goto :goto_7

    :cond_f
    if-gt v3, v7, :cond_11

    if-ge v7, v2, :cond_11

    :cond_10
    move-object v8, v1

    goto :goto_7

    :cond_11
    if-gt v2, v7, :cond_12

    if-ge v7, v5, :cond_12

    const v8, 0x1fffff

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :goto_7
    aput-object v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_5

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unexpected index"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "params don\'t add up to total params"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_7
        0x197ef -> :sswitch_6
        0x2e6108 -> :sswitch_5
        0x2e9356 -> :sswitch_4
        0x32c67c -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public static final n(Lmf/l;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lmf/k;

    if-nez v0, :cond_0

    instance-of v0, p0, Lmf/n;

    if-eqz v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lmf/l;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0x100000

    cmp-long p0, v0, v2

    if-lez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final o(ILjava/lang/String;)Z
    .locals 0

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 p1, 0x41

    if-gt p1, p0, :cond_0

    const/16 p1, 0x5b

    if-ge p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final p([F[FI[F)V
    .locals 16

    move/from16 v0, p2

    if-nez v0, :cond_0

    const-string v1, "At least one point must be provided"

    invoke-static {v1}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x2

    if-lt v1, v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    :cond_1
    add-int/lit8 v2, v1, 0x1

    new-array v3, v2, [[F

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_2

    new-array v6, v0, [F

    aput-object v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move v5, v4

    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    if-ge v5, v0, :cond_4

    aget-object v7, v3, v4

    aput v6, v7, v5

    const/4 v6, 0x1

    :goto_2
    if-ge v6, v2, :cond_3

    add-int/lit8 v7, v6, -0x1

    aget-object v7, v3, v7

    aget v7, v7, v5

    aget v8, p0, v5

    mul-float/2addr v7, v8

    aget-object v8, v3, v6

    aput v7, v8, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    new-array v5, v2, [[F

    move v7, v4

    :goto_3
    if-ge v7, v2, :cond_5

    new-array v8, v0, [F

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_5
    new-array v7, v2, [[F

    move v8, v4

    :goto_4
    if-ge v8, v2, :cond_6

    new-array v9, v2, [F

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_6
    move v8, v4

    :goto_5
    if-ge v8, v2, :cond_d

    aget-object v9, v5, v8

    aget-object v10, v3, v8

    const-string v11, "<this>"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "destination"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v4, v9, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v10, v4

    :goto_6
    if-ge v10, v8, :cond_8

    aget-object v11, v5, v10

    invoke-static {v9, v11}, Lsb3/a;->f([F[F)F

    move-result v12

    move v13, v4

    :goto_7
    if-ge v13, v0, :cond_7

    aget v14, v9, v13

    aget v15, v11, v13

    mul-float/2addr v15, v12

    sub-float/2addr v14, v15

    aput v14, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_8
    invoke-static {v9, v9}, Lsb3/a;->f([F[F)F

    move-result v10

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    double-to-float v10, v10

    const v11, 0x358637bd    # 1.0E-6f

    cmpg-float v12, v10, v11

    if-gez v12, :cond_9

    move v10, v11

    :cond_9
    div-float v10, v6, v10

    move v11, v4

    :goto_8
    if-ge v11, v0, :cond_a

    aget v12, v9, v11

    mul-float/2addr v12, v10

    aput v12, v9, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_a
    aget-object v10, v7, v8

    move v11, v4

    :goto_9
    if-ge v11, v2, :cond_c

    if-ge v11, v8, :cond_b

    const/4 v12, 0x0

    goto :goto_a

    :cond_b
    aget-object v12, v3, v11

    invoke-static {v9, v12}, Lsb3/a;->f([F[F)F

    move-result v12

    :goto_a
    aput v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_c
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_d
    move v0, v1

    :goto_b
    const/4 v2, -0x1

    if-ge v2, v0, :cond_f

    aget-object v2, v5, v0

    move-object/from16 v3, p1

    invoke-static {v2, v3}, Lsb3/a;->f([F[F)F

    move-result v2

    aget-object v4, v7, v0

    add-int/lit8 v6, v0, 0x1

    if-gt v6, v1, :cond_e

    move v8, v1

    :goto_c
    aget v9, v4, v8

    aget v10, p3, v8

    mul-float/2addr v9, v10

    sub-float/2addr v2, v9

    if-eq v8, v6, :cond_e

    add-int/lit8 v8, v8, -0x1

    goto :goto_c

    :cond_e
    aget v4, v4, v0

    div-float/2addr v2, v4

    aput v2, p3, v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_b

    :cond_f
    return-void
.end method

.method public static q()Lvg/t;
    .locals 7

    sget-object v0, Lvg/t;->e:Lg93/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lg93/d;->x:Lg93/a;

    invoke-virtual {v0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    sget-wide v3, Lvg/t;->f:J

    not-long v3, v3

    and-long/2addr v1, v3

    sget-wide v3, Lvg/t;->g:J

    or-long/2addr v1, v3

    invoke-virtual {v0}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v3

    sget-wide v5, Lvg/t;->h:J

    not-long v5, v5

    and-long/2addr v3, v5

    sget-wide v5, Lvg/t;->i:J

    or-long/2addr v3, v5

    new-instance v0, Lvg/t;

    invoke-direct {v0, v1, v2, v3, v4}, Lvg/t;-><init>(JJ)V

    return-object v0
.end method

.method public static final r(Lvf/b;Lwe/o;Lwe/g;[BLmf/d;Lq83/j;)V
    .locals 10

    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "signer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "signature"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "coroutineContext"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lvf/b;->z:Lmf/l;

    instance-of v2, v1, Lmf/n;

    if-eqz v2, :cond_4

    new-instance p5, Lt9/u;

    instance-of v2, v1, Lmf/j;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    instance-of v2, v1, Lof/a;

    if-eqz v2, :cond_2

    check-cast v1, Lof/a;

    iget-object v1, v1, Lof/a;->a:[B

    array-length v2, v1

    new-instance v4, Lyf/i;

    invoke-direct {v4, v2}, Lyf/i;-><init>(I)V

    iget-object v5, v4, Lyf/i;->y:Lzf/d;

    iget v5, v5, Lzf/d;->c:I

    if-gt v2, v5, :cond_1

    iget-object v5, v4, Lyf/i;->x:Lyf/k;

    const/4 v6, 0x0

    invoke-virtual {v5, v1, v6, v2}, Lyf/k;->write([BII)V

    iget-object v1, v4, Lyf/i;->y:Lzf/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lzf/d;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    neg-int v6, v2

    invoke-virtual {v5, v1, v6}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndAdd(Ljava/lang/Object;I)I

    sget-object v5, Lzf/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v5, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndAdd(Ljava/lang/Object;I)I

    int-to-long v1, v2

    sget-object v5, Lyf/i;->K:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v5, v4, v1, v2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndAdd(Ljava/lang/Object;J)J

    invoke-virtual {v4}, Lyf/i;->s()Z

    invoke-virtual {v4, v3}, Lyf/i;->r(Ljava/lang/Throwable;)Z

    move-object v3, v4

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Initial contents overflow maximum channel capacity"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    check-cast v1, Lmf/n;

    iget-object v3, v1, Lmf/n;->b:Lt9/u;

    :goto_0
    if-eqz v3, :cond_3

    const-string v1, "signer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "previousSignature"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    iput-object v3, p5, Lt9/u;->w:Ljava/lang/Object;

    new-instance v4, Ld9/p;

    new-instance v5, Lty/c;

    const/16 v1, 0x12

    invoke-direct {v5, v3, v1}, Lty/c;-><init>(Ljava/lang/Object;I)V

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Ld9/p;-><init>(Lty/c;Lwe/o;Lwe/g;[BLmf/d;)V

    iput-object v4, p5, Lt9/u;->x:Ljava/lang/Object;

    new-instance p1, Lmf/n;

    invoke-direct {p1, v0, p5}, Lmf/n;-><init>(Ljava/lang/Long;Lt9/u;)V

    goto :goto_1

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    instance-of p1, v1, Lmf/k;

    if-eqz p1, :cond_5

    move-object p1, v1

    new-instance v1, Lwe/b;

    check-cast p1, Lmf/k;

    invoke-virtual {p1}, Lmf/k;->d()Lyf/u;

    move-result-object v2

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lwe/b;-><init>(Lyf/u;Lwe/o;Lwe/g;[BLmf/d;Lq83/j;)V

    new-instance p1, Lmf/o;

    invoke-direct {p1, v0, v1}, Lmf/o;-><init>(Ljava/lang/Long;Lyf/u;)V

    :goto_1
    iput-object p1, p0, Lvf/b;->z:Lmf/l;

    return-void

    :cond_5
    new-instance p0, Laws/smithy/kotlin/runtime/ClientException;

    const-string p1, "HttpBody type is not supported"

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final s(Lvf/b;)V
    .locals 4

    iget-object v0, p0, Lvf/b;->y:Lmf/c;

    const-string v1, "Content-Encoding"

    const-string v2, "aws-chunked"

    invoke-virtual {v0, v2, v1}, La2/a;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Transfer-Encoding"

    const-string v2, "chunked"

    invoke-virtual {v0, v2, v1}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, La2/a;->v(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2

    iget-object p0, p0, Lvf/b;->z:Lmf/l;

    invoke-virtual {p0}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v2, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    new-instance p0, Laws/smithy/kotlin/runtime/ClientException;

    const-string v0, "Expected \"Content-Length\" header or `body.contentLength` to be set for aws-chunked"

    invoke-direct {p0, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_2
    const-string p0, "X-Amz-Decoded-Content-Length"

    invoke-virtual {v0, v2, p0}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-void
.end method

.method public static final t(Lt23/u0;Lc43/v;)Ljava/lang/String;
    .locals 7

    sget-object v0, Lc43/v;->w:Lc43/v;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iget-object p0, p0, Lt23/u0;->a:Ln33/q;

    if-eqz p0, :cond_1

    iget-object p0, p0, Ln33/q;->a:Lorg/webrtc/RTCStatsReport;

    invoke-virtual {p0}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lt23/u0;->b:Ln33/q;

    if-eqz p0, :cond_1

    iget-object p0, p0, Ln33/q;->a:Lorg/webrtc/RTCStatsReport;

    invoke-virtual {p0}, Lorg/webrtc/RTCStatsReport;->getStatsMap()Ljava/util/Map;

    move-result-object v1

    :cond_1
    :goto_0
    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getTimestampUs()D

    move-result-wide v2

    const-string v4, "timestamp"

    invoke-virtual {v1, v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/RTCStats;

    invoke-virtual {v2}, Lorg/webrtc/RTCStats;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/RTCStats;

    invoke-virtual {v0}, Lorg/webrtc/RTCStats;->getMembers()Ljava/util/Map;

    move-result-object v0

    const-string v2, "getMembers(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    :try_start_0
    instance-of v4, v2, [Ljava/lang/Object;

    if-eqz v4, :cond_2

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    :goto_3
    move-object v2, v4

    goto :goto_5

    :catch_0
    move-exception v4

    goto :goto_4

    :cond_2
    instance-of v4, v2, Ljava/util/Map;

    if-eqz v4, :cond_3

    new-instance v4, Lorg/json/JSONObject;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_4
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "sendStats. Error for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " with "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "CallStatsReport"

    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, ""

    :cond_3
    :goto_5
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto/16 :goto_1

    :cond_5
    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final u(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x41

    if-gt v4, v3, :cond_0

    const/16 v4, 0x5b

    if-ge v3, v4, :cond_0

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final v(Lwf/a;[B)Lwf/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    new-instance v0, Lof/a;

    invoke-direct {v0, p1}, Lof/a;-><init>([B)V

    goto :goto_0

    :cond_0
    sget-object v0, Lmf/j;->a:Lmf/j;

    :goto_0
    iget-object p1, p0, Lwf/a;->a:Lmf/t;

    iget-object p0, p0, Lwf/a;->b:Lmf/h;

    new-instance v1, Lwf/a;

    invoke-direct {v1, p1, p0, v0}, Lwf/a;-><init>(Lmf/t;Lmf/h;Lmf/l;)V

    return-object v1
.end method

.method public static w(JI[CII)V
    .locals 5

    mul-int/lit8 p2, p2, 0x8

    rsub-int/lit8 p2, p2, 0x40

    mul-int/lit8 p5, p5, 0x2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p5, :cond_0

    add-int/lit8 p2, p2, -0x4

    shr-long v1, p0, p2

    const-wide/16 v3, 0xf

    and-long/2addr v1, v3

    add-int/lit8 v3, p4, 0x1

    sget-object v4, Lvg/t;->d:[C

    long-to-int v1, v1

    aget-char v1, v4, v1

    aput-char v1, p3, p4

    add-int/lit8 v0, v0, 0x1

    move p4, v3

    goto :goto_0

    :cond_0
    return-void
.end method
