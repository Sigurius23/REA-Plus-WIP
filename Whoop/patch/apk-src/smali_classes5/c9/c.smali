.class public final synthetic Lc9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/g;
.implements Lx8/f;
.implements Ld4/j;
.implements Lio/j;
.implements Lo23/a;
.implements Lio/getstream/chat/android/ui/feature/search/SearchInputView$SearchStartedListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;
.implements Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;
.implements Lio/sentry/b4;
.implements Lio/sentry/android/core/h1;
.implements Lio/sentry/e4;
.implements Lx8/d;
.implements Lom/a;
.implements Lnm/g;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lc9/c;->w:I

    iput-object p2, p0, Lc9/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc9/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lu8/n;)V
    .locals 3

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/h;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lu8/j0;

    check-cast p1, Lc9/b;

    new-instance v2, Lqg3/d;

    iget-object v0, v0, Lc9/h;->E:Landroid/util/SparseArray;

    invoke-direct {v2, p2, v0}, Lqg3/d;-><init>(Lu8/n;Landroid/util/SparseArray;)V

    check-cast p1, Lc9/l;

    invoke-virtual {p1, v1, v2}, Lc9/l;->k(Lu8/j0;Lqg3/d;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lg9/d;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Ll9/y;

    check-cast p1, Ll9/i0;

    iget v2, v0, Lg9/d;->a:I

    iget-object v0, v0, Lg9/d;->b:Ll9/c0;

    invoke-interface {p1, v2, v0, v1}, Ll9/i0;->d(ILl9/c0;Ll9/y;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lnm/i;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lgm/i;

    move-object v2, p1

    check-cast v2, Landroid/database/sqlite/SQLiteDatabase;

    iget-object p1, v0, Lnm/i;->z:Lnm/a;

    iget v3, p1, Lnm/a;->b:I

    invoke-virtual {v0, v2, v1, v3}, Lnm/i;->k(Landroid/database/sqlite/SQLiteDatabase;Lgm/i;I)Ljava/util/ArrayList;

    move-result-object v10

    invoke-static {}, Ldm/d;->values()[Ldm/d;

    move-result-object v3

    array-length v4, v3

    const/4 v11, 0x0

    move v5, v11

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    iget-object v7, v1, Lgm/i;->c:Ldm/d;

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    iget v7, p1, Lnm/a;->b:I

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v7, v8

    if-gtz v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, Lgm/i;->a()La33/d;

    move-result-object v8

    iget-object v9, v1, Lgm/i;->a:Ljava/lang/String;

    invoke-virtual {v8, v9}, La33/d;->Q(Ljava/lang/String;)V

    if-eqz v6, :cond_2

    iput-object v6, v8, La33/d;->z:Ljava/lang/Object;

    iget-object v6, v1, Lgm/i;->b:[B

    iput-object v6, v8, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {v8}, La33/d;->d()Lgm/i;

    move-result-object v6

    invoke-virtual {v0, v2, v6, v7}, Lnm/i;->k(Landroid/database/sqlite/SQLiteDatabase;Lgm/i;I)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null priority"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "event_id IN ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move v1, v11

    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v12, 0x1

    if-ge v1, v3, :cond_5

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnm/b;

    iget-wide v3, v3, Lnm/b;->a:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v12

    if-ge v1, v3, :cond_4

    const/16 v3, 0x2c

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "name"

    const-string v3, "value"

    const-string v4, "event_id"

    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v3, "event_metadata"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    :goto_4
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    new-instance v2, Lnm/h;

    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lnm/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnm/b;

    iget-wide v2, v1, Lnm/b;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    iget-object v4, v1, Lnm/b;->c:Lgm/h;

    invoke-virtual {v4}, Lgm/h;->c()La30/w0;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnm/h;

    iget-object v7, v6, Lnm/h;->a:Ljava/lang/String;

    iget-object v6, v6, Lnm/h;->b:Ljava/lang/String;

    invoke-virtual {v4, v7, v6}, La30/w0;->f(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_9
    iget-object v1, v1, Lnm/b;->b:Lgm/i;

    invoke-virtual {v4}, La30/w0;->m()Lgm/h;

    move-result-object v4

    new-instance v5, Lnm/b;

    invoke-direct {v5, v2, v3, v1, v4}, Lnm/b;-><init>(JLgm/i;Lgm/h;)V

    invoke-interface {v0, v5}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    return-object v10

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw p1
.end method

.method public b(ILsn/w0;[I)Lzr/w0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    iget v1, v0, Lc9/c;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lc9/c;->x:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lio/f;

    iget-object v1, v0, Lc9/c;->y:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v8

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    iget v1, v3, Lsn/w0;->w:I

    if-ge v4, v1, :cond_0

    new-instance v1, Lio/i;

    aget v6, p3, v4

    move/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lio/i;-><init>(ILsn/w0;ILio/f;ILjava/lang/String;)V

    invoke-virtual {v8, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lzr/d0;->f()Lzr/w0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lc9/c;->x:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lio/f;

    iget-object v1, v0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, [I

    aget v7, v1, p1

    iget v1, v5, Lio/w;->I:I

    iget v2, v5, Lio/w;->J:I

    iget-boolean v4, v5, Lio/w;->K:Z

    const v11, 0x7fffffff

    if-eq v1, v11, :cond_8

    if-ne v2, v11, :cond_1

    goto/16 :goto_6

    :cond_1
    move v8, v11

    const/4 v6, 0x0

    :goto_1
    iget v12, v3, Lsn/w0;->w:I

    if-ge v6, v12, :cond_7

    iget-object v12, v3, Lsn/w0;->y:[Lrm/c0;

    aget-object v12, v12, v6

    iget v13, v12, Lrm/c0;->Q:I

    iget v14, v12, Lrm/c0;->R:I

    if-lez v13, :cond_6

    if-lez v14, :cond_6

    if-eqz v4, :cond_4

    if-le v13, v14, :cond_2

    const/4 v15, 0x1

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    :goto_2
    if-le v1, v2, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    if-eq v15, v9, :cond_4

    move v9, v1

    move v15, v2

    goto :goto_4

    :cond_4
    move v15, v1

    move v9, v2

    :goto_4
    mul-int v10, v13, v9

    mul-int v11, v14, v15

    if-lt v10, v11, :cond_5

    new-instance v9, Landroid/graphics/Point;

    invoke-static {v11, v13}, Llo/y;->f(II)I

    move-result v10

    invoke-direct {v9, v15, v10}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_5

    :cond_5
    new-instance v11, Landroid/graphics/Point;

    invoke-static {v10, v14}, Llo/y;->f(II)I

    move-result v10

    invoke-direct {v11, v10, v9}, Landroid/graphics/Point;-><init>(II)V

    move-object v9, v11

    :goto_5
    iget v10, v12, Lrm/c0;->Q:I

    mul-int v11, v10, v14

    iget v12, v9, Landroid/graphics/Point;->x:I

    int-to-float v12, v12

    const v13, 0x3f7ae148    # 0.98f

    mul-float/2addr v12, v13

    float-to-int v12, v12

    if-lt v10, v12, :cond_6

    iget v9, v9, Landroid/graphics/Point;->y:I

    int-to-float v9, v9

    mul-float/2addr v9, v13

    float-to-int v9, v9

    if-lt v14, v9, :cond_6

    if-ge v11, v8, :cond_6

    move v8, v11

    :cond_6
    add-int/lit8 v6, v6, 0x1

    const v11, 0x7fffffff

    goto :goto_1

    :cond_7
    move v9, v8

    goto :goto_7

    :cond_8
    :goto_6
    const v9, 0x7fffffff

    :goto_7
    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v10

    const/4 v4, 0x0

    :goto_8
    iget v1, v3, Lsn/w0;->w:I

    if-ge v4, v1, :cond_d

    iget-object v1, v3, Lsn/w0;->y:[Lrm/c0;

    aget-object v1, v1, v4

    iget v2, v1, Lrm/c0;->Q:I

    const/4 v6, -0x1

    if-eq v2, v6, :cond_a

    iget v1, v1, Lrm/c0;->R:I

    if-ne v1, v6, :cond_9

    goto :goto_a

    :cond_9
    mul-int/2addr v2, v1

    :goto_9
    const v11, 0x7fffffff

    goto :goto_b

    :cond_a
    :goto_a
    move v2, v6

    goto :goto_9

    :goto_b
    if-eq v9, v11, :cond_c

    if-eq v2, v6, :cond_b

    if-gt v2, v9, :cond_b

    goto :goto_c

    :cond_b
    const/4 v8, 0x0

    goto :goto_d

    :cond_c
    :goto_c
    const/4 v8, 0x1

    :goto_d
    new-instance v1, Lio/l;

    aget v6, p3, v4

    move/from16 v2, p1

    invoke-direct/range {v1 .. v8}, Lio/l;-><init>(ILsn/w0;ILio/f;IIZ)V

    invoke-virtual {v10, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v3, p2

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lzr/d0;->f()Lzr/w0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ld4/i;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v3, Lic/p;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lic/p;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    sget-object v4, Lic/j;->w:Lic/j;

    iget-object v5, p1, Ld4/i;->c:Ld4/n;

    if-eqz v5, :cond_0

    invoke-virtual {v5, v3, v4}, Ld4/h;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    new-instance v3, Lic/q;

    const/4 v4, 0x1

    invoke-direct {v3, v2, p1, v1, v4}, Lic/q;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ld4/i;Lc93/a;I)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/o1;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lio/sentry/android/core/r0;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0, v1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public execute()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lc9/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lev/i;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    iget-object v3, v0, Lev/i;->i:Ljava/lang/Object;

    check-cast v3, Lnm/c;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    check-cast v3, Lnm/i;

    sget-object v6, Ljm/c;->G:Ljm/c;

    invoke-virtual {v3, v4, v5, v6, v2}, Lnm/i;->m(JLjm/c;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lev/i;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v0, v0, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Lnm/d;

    check-cast v0, Lnm/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DELETE FROM events WHERE _id in "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lnm/i;->x(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lnm/i;->b()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    :goto_1
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lio/sentry/n1;)V
    .locals 2

    iget v0, p0, Lc9/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/n1;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b1;

    if-ne p1, v0, :cond_0

    invoke-interface {v1}, Lio/sentry/b1;->E()V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/z6;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, v0, :cond_1

    invoke-interface {v1}, Lio/sentry/b1;->E()V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lio/sentry/b1;)V
    .locals 4

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/g;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/n1;

    new-instance v2, Lbc/i;

    const/4 v3, 0x7

    invoke-direct {v2, v0, p1, v1, v3}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p1, v2}, Lio/sentry/b1;->N(Lio/sentry/b4;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/a;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Ll9/y;

    check-cast p1, Lc9/b;

    check-cast p1, Lc9/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lc9/a;->d:Ll9/c0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lab/h0;

    iget-object v4, v1, Ll9/y;->g:Ljava/lang/Object;

    check-cast v4, Lu8/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v1, Ll9/y;->c:I

    iget-object v6, p1, Lc9/l;->c:Lc9/j;

    iget-object v0, v0, Lc9/a;->b:Lu8/o0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v6, v0, v2}, Lc9/j;->c(Lu8/o0;Ll9/c0;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    invoke-direct {v3, v4, v5, v0, v2}, Lab/h0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    iget v0, v1, Ll9/y;->b:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    iput-object v3, p1, Lc9/l;->r:Lab/h0;

    return-void

    :cond_2
    iput-object v3, p1, Lc9/l;->q:Lab/h0;

    return-void

    :cond_3
    iput-object v3, p1, Lc9/l;->p:Lab/h0;

    return-void
.end method

.method public onReactionClick(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lc9/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onResult(Ln23/h;)V
    .locals 12

    iget v0, p0, Lc9/c;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lo23/o;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lo23/a;

    const-string v2, "resultA"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lo23/o;->c:Lac3/a;

    iget-object v3, v0, Lo23/o;->d:Ljava/lang/Object;

    check-cast v3, Lo23/d;

    invoke-virtual {v2}, Lac3/a;->a()Z

    move-result v2

    if-nez v2, :cond_1

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_0

    new-instance v2, Lbc/i;

    const/16 v4, 0xd

    invoke-direct {v2, v0, p1, v1, v4}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v3, v2}, Lo23/d;->enqueue(Lo23/a;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_1

    check-cast p1, Ln23/f;

    new-instance v0, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-direct {v0, p1}, Ln23/f;-><init>(Ln23/e;)V

    invoke-interface {v3}, Lo23/d;->cancel()V

    invoke-interface {v1, v0}, Lo23/a;->onResult(Ln23/h;)V

    :cond_1
    :goto_0
    return-void

    :sswitch_0
    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo23/q;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo23/a;

    iget-object v0, v2, Lo23/q;->c:Lhc3/d;

    new-instance v1, Ln43/a;

    const/4 v6, 0x4

    const/4 v5, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :sswitch_1
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast p1, Lo23/o;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    const-string v1, "it"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lo23/o;->c:Lac3/a;

    invoke-virtual {v1}, Lac3/a;->a()Z

    move-result v1

    if-nez v1, :cond_2

    move-object v1, v3

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    iget-object p1, p1, Lo23/o;->d:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_3

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    new-instance v2, Ln23/g;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object v1, v2

    goto :goto_2

    :cond_3
    instance-of p1, v1, Ln23/f;

    if-eqz p1, :cond_4

    :goto_2
    invoke-interface {v0, v1}, Lo23/a;->onResult(Ln23/h;)V

    goto :goto_3

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_3
    return-void

    :sswitch_2
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast p1, Lo23/h;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    const-string v1, "it"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lo23/h;->d:Ljava/lang/Object;

    check-cast v1, Lac3/a;

    invoke-virtual {v1}, Lac3/a;->a()Z

    move-result v1

    if-nez v1, :cond_6

    move-object v1, v3

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_b

    instance-of v2, v1, Ln23/g;

    if-nez v2, :cond_8

    instance-of v3, v1, Ln23/f;

    if-eqz v3, :cond_7

    move-object v3, v1

    check-cast v3, Ln23/f;

    iget-object v3, v3, Ln23/f;->a:Ln23/e;

    new-instance v4, Ln23/f;

    invoke-direct {v4, v3}, Ln23/f;-><init>(Ln23/e;)V

    invoke-interface {v0, v4}, Lo23/a;->onResult(Ln23/h;)V

    goto :goto_5

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_5
    if-eqz v2, :cond_9

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    iget-object v2, p1, Lo23/h;->c:Ll83/e;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo23/d;

    iput-object v1, p1, Lo23/h;->e:Ljava/lang/Object;

    new-instance v2, Lio/sentry/internal/debugmeta/c;

    const/16 v3, 0x1b

    invoke-direct {v2, v3, v0, p1}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lo23/d;->enqueue(Lo23/a;)V

    goto :goto_6

    :cond_9
    instance-of p1, v1, Ln23/f;

    if-eqz p1, :cond_a

    goto :goto_6

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    :goto_6
    return-void

    :sswitch_3
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast p1, Lo23/k;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lo23/a;

    iget-object p1, p1, Lo23/k;->d:Lhc3/d;

    sget-object v1, Lp23/a;->a:Lbc3/w1;

    new-instance v2, Lo23/g;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v2, v0, v3, v5, v4}, Lo23/g;-><init>(Lo23/a;Ln23/h;Lq83/d;I)V

    const/4 v0, 0x2

    invoke-static {p1, v1, v5, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :sswitch_4
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lo23/k;

    iget-object p1, p0, Lc9/c;->y:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Lo23/a;

    iget-object p1, v7, Lo23/k;->d:Lhc3/d;

    new-instance v6, Ln43/a;

    const/4 v11, 0x3

    const/4 v10, 0x0

    move-object v8, v3

    invoke-direct/range {v6 .. v11}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {p1, v10, v10, v6, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :sswitch_5
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const-string v1, "result"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v3, Ln23/g;

    if-eqz v1, :cond_c

    move-object v0, v3

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_c
    instance-of p1, v3, Ln23/f;

    if-eqz p1, :cond_d

    move-object p1, v3

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    return-void

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :sswitch_6
    move-object v3, p1

    iget-object p1, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    iget-object v0, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1, v0, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->K(Lc93/a;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ln23/h;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_6
        0x17 -> :sswitch_5
        0x18 -> :sswitch_4
        0x19 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public onSearchStarted(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/search/SearchInputView;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;->D(Lio/getstream/chat/android/ui/feature/search/SearchInputView;Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;Ljava/lang/String;)V

    return-void
.end method

.method public onThreadEntered(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    iget-object v0, p0, Lc9/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;

    iget-object v1, p0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->v(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnEnterThreadListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    return p1
.end method
