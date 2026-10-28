.class public final Llg3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# static fields
.field public static volatile x:Ljava/util/AbstractMap$SimpleImmutableEntry;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llg3/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(ZLjava/lang/String;Ljava/util/Set;)Ljg3/o;
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {p1}, Ljg3/o;->l(Ljava/lang/String;)Ljg3/o;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Ljg3/o;->l(Ljava/lang/String;)Ljg3/o;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Llg3/q;Ljava/lang/CharSequence;II)I
    .locals 3

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Llg3/q;

    invoke-direct {v0, p0}, Llg3/q;-><init>(Llg3/q;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p3, v1, :cond_0

    invoke-interface {p1, p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x5a

    invoke-virtual {p0, v1, v2}, Llg3/q;->a(CC)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Ljg3/p;->F:Ljg3/p;

    invoke-static {p2, p1}, Ljg3/o;->m(Ljava/lang/String;Ljg3/p;)Ljg3/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Llg3/q;->j(Ljg3/o;)V

    return p3

    :cond_0
    sget-object v1, Llg3/j;->z:Llg3/j;

    invoke-virtual {v1, v0, p1, p3}, Llg3/j;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result p1

    if-gez p1, :cond_1

    sget-object p1, Ljg3/p;->F:Ljg3/p;

    invoke-static {p2, p1}, Ljg3/o;->m(Ljava/lang/String;Ljg3/p;)Ljg3/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Llg3/q;->j(Ljg3/o;)V

    return p3

    :cond_1
    sget-object p3, Lng3/a;->f0:Lng3/a;

    invoke-virtual {v0, p3}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int p3, v0

    invoke-static {p3}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object p3

    invoke-static {p2, p3}, Ljg3/o;->m(Ljava/lang/String;Ljg3/p;)Ljg3/o;

    move-result-object p2

    invoke-virtual {p0, p2}, Llg3/q;->j(Ljg3/o;)V

    return p1
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move/from16 v6, p3

    iget v3, v1, Llg3/h;->w:I

    const/16 v4, 0x5a

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x54

    packed-switch v3, :pswitch_data_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-gt v6, v3, :cond_12

    if-ne v6, v3, :cond_1

    :cond_0
    not-int v0, v6

    goto/16 :goto_7

    :cond_1
    invoke-interface/range {p2 .. p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v10, 0x2b

    if-eq v9, v10, :cond_10

    const/16 v10, 0x2d

    if-ne v9, v10, :cond_2

    goto/16 :goto_6

    :cond_2
    add-int/lit8 v10, v6, 0x2

    if-lt v3, v10, :cond_5

    add-int/lit8 v11, v6, 0x1

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    const/16 v12, 0x55

    invoke-virtual {v2, v9, v12}, Llg3/q;->a(CC)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v2, v11, v8}, Llg3/q;->a(CC)Z

    move-result v12

    if-eqz v12, :cond_4

    add-int/lit8 v4, v6, 0x3

    if-lt v3, v4, :cond_3

    invoke-interface {v0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v5, 0x43

    invoke-virtual {v2, v3, v5}, Llg3/q;->a(CC)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2, v0, v6, v4}, Llg3/h;->d(Llg3/q;Ljava/lang/CharSequence;II)I

    move-result v0

    goto/16 :goto_7

    :cond_3
    invoke-static {v2, v0, v6, v10}, Llg3/h;->d(Llg3/q;Ljava/lang/CharSequence;II)I

    move-result v0

    goto/16 :goto_7

    :cond_4
    const/16 v12, 0x47

    invoke-virtual {v2, v9, v12}, Llg3/q;->a(CC)Z

    move-result v12

    if-eqz v12, :cond_5

    add-int/lit8 v12, v6, 0x3

    if-lt v3, v12, :cond_5

    const/16 v13, 0x4d

    invoke-virtual {v2, v11, v13}, Llg3/q;->a(CC)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v0, v10}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    invoke-virtual {v2, v10, v8}, Llg3/q;->a(CC)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-static {v2, v0, v6, v12}, Llg3/h;->d(Llg3/q;Ljava/lang/CharSequence;II)I

    move-result v0

    goto/16 :goto_7

    :cond_5
    sget-object v8, Log3/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v10

    sget-object v11, Llg3/h;->x:Ljava/util/AbstractMap$SimpleImmutableEntry;

    if-eqz v11, :cond_6

    invoke-virtual {v11}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eq v12, v10, :cond_a

    :cond_6
    monitor-enter p0

    :try_start_0
    sget-object v11, Llg3/h;->x:Ljava/util/AbstractMap$SimpleImmutableEntry;

    if-eqz v11, :cond_7

    invoke-virtual {v11}, Ljava/util/AbstractMap$SimpleImmutableEntry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-eq v12, v10, :cond_9

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_7
    :goto_0
    new-instance v11, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget-object v13, Llg3/o;->g:Lb2/d;

    invoke-static {v12, v13}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v13, Llg3/n;

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    invoke-direct {v13, v5}, Llg3/n;-><init>(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v13, v12}, Llg3/n;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    invoke-direct {v11, v10, v13}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v11, Llg3/h;->x:Ljava/util/AbstractMap$SimpleImmutableEntry;

    :cond_9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llg3/n;

    const/4 v10, 0x0

    move-object v11, v10

    :goto_2
    if-eqz v5, :cond_d

    iget v12, v5, Llg3/n;->a:I

    add-int/2addr v12, v6

    if-le v12, v3, :cond_b

    goto :goto_4

    :cond_b
    invoke-interface {v0, v6, v12}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v11

    iget-boolean v12, v2, Llg3/q;->b:Z

    if-eqz v12, :cond_c

    iget-object v5, v5, Llg3/n;->b:Ljava/util/HashMap;

    invoke-virtual {v5, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llg3/n;

    goto :goto_3

    :cond_c
    iget-object v5, v5, Llg3/n;->c:Ljava/util/HashMap;

    invoke-virtual {v11}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llg3/n;

    :goto_3
    move-object/from16 v16, v11

    move-object v11, v10

    move-object/from16 v10, v16

    goto :goto_2

    :cond_d
    :goto_4
    iget-boolean v0, v2, Llg3/q;->b:Z

    invoke-static {v0, v10, v8}, Llg3/h;->c(ZLjava/lang/String;Ljava/util/Set;)Ljg3/o;

    move-result-object v0

    if-nez v0, :cond_f

    iget-boolean v0, v2, Llg3/q;->b:Z

    invoke-static {v0, v11, v8}, Llg3/h;->c(ZLjava/lang/String;Ljava/util/Set;)Ljg3/o;

    move-result-object v0

    if-nez v0, :cond_e

    invoke-virtual {v2, v9, v4}, Llg3/q;->a(CC)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljg3/p;->F:Ljg3/p;

    invoke-virtual {v2, v0}, Llg3/q;->j(Ljg3/o;)V

    add-int/lit8 v0, v6, 0x1

    goto :goto_7

    :cond_e
    move-object v10, v11

    :cond_f
    invoke-virtual {v2, v0}, Llg3/q;->j(Ljg3/o;)V

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v6

    goto :goto_7

    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_10
    :goto_6
    new-instance v3, Llg3/q;

    invoke-direct {v3, v2}, Llg3/q;-><init>(Llg3/q;)V

    sget-object v4, Llg3/j;->z:Llg3/j;

    invoke-virtual {v4, v3, v0, v6}, Llg3/j;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result v0

    if-gez v0, :cond_11

    goto :goto_7

    :cond_11
    sget-object v4, Lng3/a;->f0:Lng3/a;

    invoke-virtual {v3, v4}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-static {v3}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v3

    invoke-virtual {v2, v3}, Llg3/q;->j(Ljg3/o;)V

    :goto_7
    return v0

    :cond_12
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v3, Llg3/q;

    invoke-direct {v3, v2}, Llg3/q;-><init>(Llg3/q;)V

    new-instance v9, Llg3/o;

    invoke-direct {v9}, Llg3/o;-><init>()V

    sget-object v10, Llg3/b;->f:Llg3/b;

    invoke-virtual {v9, v10}, Llg3/o;->a(Llg3/b;)V

    invoke-virtual {v9, v8}, Llg3/o;->c(C)V

    sget-object v8, Lng3/a;->O:Lng3/a;

    const/4 v10, 0x2

    invoke-virtual {v9, v8, v10}, Llg3/o;->g(Lng3/m;I)V

    const/16 v11, 0x3a

    invoke-virtual {v9, v11}, Llg3/o;->c(C)V

    sget-object v12, Lng3/a;->K:Lng3/a;

    invoke-virtual {v9, v12, v10}, Llg3/o;->g(Lng3/m;I)V

    invoke-virtual {v9, v11}, Llg3/o;->c(C)V

    sget-object v11, Lng3/a;->I:Lng3/a;

    invoke-virtual {v9, v11, v10}, Llg3/o;->g(Lng3/m;I)V

    sget-object v10, Lng3/a;->y:Lng3/a;

    new-instance v13, Llg3/g;

    invoke-direct {v13, v10}, Llg3/g;-><init>(Lng3/m;)V

    invoke-virtual {v9, v13}, Llg3/o;->b(Llg3/f;)I

    invoke-virtual {v9, v4}, Llg3/o;->c(C)V

    invoke-virtual {v9}, Llg3/o;->k()Llg3/b;

    move-result-object v4

    iget-object v4, v4, Llg3/b;->a:Llg3/e;

    iget-boolean v9, v4, Llg3/e;->x:Z

    if-nez v9, :cond_13

    goto :goto_8

    :cond_13
    new-instance v9, Llg3/e;

    iget-object v4, v4, Llg3/e;->w:[Llg3/f;

    invoke-direct {v9, v4, v5}, Llg3/e;-><init>([Llg3/f;Z)V

    move-object v4, v9

    :goto_8
    invoke-virtual {v4, v3, v0, v6}, Llg3/e;->a(Llg3/q;Ljava/lang/CharSequence;I)I

    move-result v0

    if-gez v0, :cond_14

    goto/16 :goto_c

    :cond_14
    sget-object v4, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v3, v4}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    sget-object v4, Lng3/a;->Z:Lng3/a;

    invoke-virtual {v3, v4}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->intValue()I

    move-result v4

    sget-object v9, Lng3/a;->U:Lng3/a;

    invoke-virtual {v3, v9}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Long;->intValue()I

    move-result v9

    invoke-virtual {v3, v8}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Long;->intValue()I

    move-result v8

    invoke-virtual {v3, v12}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Long;->intValue()I

    move-result v12

    invoke-virtual {v3, v11}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v3, v10}, Llg3/q;->h(Lng3/m;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v11, :cond_15

    invoke-virtual {v11}, Ljava/lang/Long;->intValue()I

    move-result v11

    goto :goto_9

    :cond_15
    move v11, v5

    :goto_9
    if-eqz v3, :cond_16

    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    move-result v3

    move v15, v3

    goto :goto_a

    :cond_16
    move v15, v5

    :goto_a
    long-to-int v3, v13

    rem-int/lit16 v3, v3, 0x2710

    const/16 v5, 0x18

    if-ne v8, v5, :cond_17

    if-nez v12, :cond_17

    if-nez v11, :cond_17

    if-nez v15, :cond_17

    const/4 v8, 0x0

    goto :goto_b

    :cond_17
    const/16 v5, 0x17

    if-ne v8, v5, :cond_18

    const/16 v5, 0x3b

    if-ne v12, v5, :cond_18

    const/16 v5, 0x3c

    if-ne v11, v5, :cond_18

    invoke-virtual {v2}, Llg3/q;->c()Llg3/p;

    move-result-object v5

    iput-boolean v7, v5, Llg3/p;->H:Z

    const/4 v7, 0x0

    const/16 v11, 0x3b

    goto :goto_b

    :cond_18
    const/4 v7, 0x0

    :goto_b
    :try_start_2
    sget-object v5, Ljg3/e;->H:Ljg3/e;

    invoke-static {v3, v4, v9}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v8, v12, v11, v4}, Ljg3/f;->t0(IIII)Ljg3/f;

    move-result-object v4

    new-instance v5, Ljg3/e;

    invoke-direct {v5, v3, v4}, Ljg3/e;-><init>(Ljg3/d;Ljg3/f;)V

    int-to-long v7, v7

    invoke-virtual {v3, v7, v8}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v3

    invoke-virtual {v5, v3, v4}, Ljg3/e;->z0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v3

    sget-object v4, Ljg3/p;->F:Ljg3/p;

    invoke-virtual {v3, v4}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v3

    const-wide/16 v7, 0x2710

    div-long/2addr v13, v7

    const-wide v7, 0x497968bd80L

    invoke-static {v13, v14, v7, v8}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v7
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    add-long v4, v3, v7

    sget-object v3, Lng3/a;->e0:Lng3/a;

    move v7, v0

    invoke-virtual/range {v2 .. v7}, Llg3/q;->k(Lng3/m;JII)I

    move-result v7

    int-to-long v4, v15

    move-object/from16 v2, p1

    move/from16 v6, p3

    move-object v3, v10

    invoke-virtual/range {v2 .. v7}, Llg3/q;->k(Lng3/m;JII)I

    move-result v0

    goto :goto_c

    :catch_0
    not-int v0, v6

    :goto_c
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget v3, v1, Llg3/h;->w:I

    packed-switch v3, :pswitch_data_0

    sget-object v3, Llg3/o;->f:Lg73/a;

    iget-object v4, v0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v4, Lng3/k;

    invoke-interface {v4, v3}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    iget v0, v0, Lab/h0;->x:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to extract value: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v3, Ljg3/o;

    if-nez v3, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljg3/o;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    :goto_1
    return v0

    :pswitch_0
    sget-object v3, Lng3/a;->e0:Lng3/a;

    invoke-virtual {v0, v3}, Lab/h0;->r(Lng3/m;)Ljava/lang/Long;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-object v0, v0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Lng3/k;

    sget-object v7, Lng3/a;->y:Lng3/a;

    invoke-interface {v0, v7}, Lng3/k;->a(Lng3/m;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v0, v7}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :cond_3
    const/4 v0, 0x0

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v3, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v10, v11, v7}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    const-wide v6, -0xe79747c00L

    cmp-long v6, v8, v6

    const-string v7, ":00"

    const-wide/16 v10, 0x1

    const-wide v12, 0xe79747c00L

    const-wide v14, 0x497968bd80L

    move-wide/from16 v16, v4

    const/4 v4, 0x1

    if-ltz v6, :cond_6

    const-wide v5, 0x3afff44180L

    sub-long/2addr v8, v5

    invoke-static {v8, v9, v14, v15}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v5

    add-long/2addr v5, v10

    rem-long/2addr v8, v14

    add-long/2addr v8, v14

    rem-long/2addr v8, v14

    sub-long/2addr v8, v12

    sget-object v10, Ljg3/p;->F:Ljg3/p;

    invoke-static {v8, v9, v0, v10}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object v0

    cmp-long v8, v5, v16

    if-lez v8, :cond_5

    const/16 v8, 0x2b

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    iget-byte v0, v0, Ljg3/f;->H:B

    if-nez v0, :cond_a

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    add-long/2addr v8, v12

    div-long v5, v8, v14

    rem-long/2addr v8, v14

    sub-long v12, v8, v12

    sget-object v14, Ljg3/p;->F:Ljg3/p;

    invoke-static {v12, v13, v0, v14}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v13, v0, Ljg3/e;->G:Ljg3/f;

    iget-byte v13, v13, Ljg3/f;->H:B

    if-nez v13, :cond_7

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    cmp-long v7, v5, v16

    if-gez v7, :cond_a

    iget-object v0, v0, Ljg3/e;->F:Ljg3/d;

    iget v0, v0, Ljg3/d;->F:I

    const/16 v7, -0x2710

    if-ne v0, v7, :cond_8

    add-int/lit8 v0, v12, 0x2

    sub-long/2addr v5, v10

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v12, v0, v5}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_8
    cmp-long v0, v8, v16

    if-nez v0, :cond_9

    invoke-virtual {v2, v12, v5, v6}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    add-int/2addr v12, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-virtual {v2, v12, v5, v6}, Ljava/lang/StringBuilder;->insert(IJ)Ljava/lang/StringBuilder;

    :cond_a
    :goto_2
    if-eqz v3, :cond_d

    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const v0, 0xf4240

    rem-int v5, v3, v0

    if-nez v5, :cond_b

    div-int/2addr v3, v0

    add-int/lit16 v3, v3, 0x3e8

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_b
    rem-int/lit16 v5, v3, 0x3e8

    if-nez v5, :cond_c

    div-int/lit16 v3, v3, 0x3e8

    add-int/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_c
    const v0, 0x3b9aca00

    add-int/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_d
    :goto_3
    const/16 v0, 0x5a

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v0, v4

    :goto_4
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Llg3/h;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "ZoneRegionId()"

    return-object v0

    :pswitch_0
    const-string v0, "Instant()"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
