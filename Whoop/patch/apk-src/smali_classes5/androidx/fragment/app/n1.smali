.class public final Landroidx/fragment/app/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/k1;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final synthetic c:Landroidx/fragment/app/o1;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/o1;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Landroidx/fragment/app/n1;->a:I

    iput-object p1, p0, Landroidx/fragment/app/n1;->c:Landroidx/fragment/app/o1;

    iput-object p2, p0, Landroidx/fragment/app/n1;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Landroidx/fragment/app/n1;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, v0, Landroidx/fragment/app/n1;->c:Landroidx/fragment/app/o1;

    const/4 v4, -0x1

    iget-object v5, v0, Landroidx/fragment/app/n1;->b:Ljava/lang/String;

    const/4 v6, 0x1

    invoke-virtual {v3, v4, v5, v6}, Landroidx/fragment/app/o1;->C(ILjava/lang/String;Z)I

    move-result v4

    if-gez v4, :cond_0

    const/4 v6, 0x0

    goto/16 :goto_a

    :cond_0
    move v7, v4

    :goto_0
    iget-object v8, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const-string v9, "saveBackStack(\""

    const/4 v10, 0x0

    if-ge v7, v8, :cond_2

    iget-object v8, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    iget-boolean v11, v8, Landroidx/fragment/app/c2;->r:Z

    if-eqz v11, :cond_1

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " that did not use setReorderingAllowed(true)."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Landroidx/fragment/app/o1;->l0(Ljava/lang/RuntimeException;)V

    throw v10

    :cond_2
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    move v8, v4

    :goto_1
    iget-object v11, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v8, v11, :cond_c

    iget-object v11, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/a;

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12}, Ljava/util/HashSet;-><init>()V

    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    iget-object v14, v11, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/fragment/app/b2;

    move-object/from16 v16, v10

    iget-object v10, v15, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    if-nez v10, :cond_3

    move-object/from16 v10, v16

    goto :goto_2

    :cond_3
    iget-boolean v6, v15, Landroidx/fragment/app/b2;->c:Z

    move/from16 v18, v6

    const/4 v6, 0x2

    if-eqz v18, :cond_4

    move/from16 v18, v8

    iget v8, v15, Landroidx/fragment/app/b2;->a:I

    move-object/from16 v19, v14

    const/4 v14, 0x1

    if-eq v8, v14, :cond_5

    if-eq v8, v6, :cond_5

    const/16 v14, 0x8

    if-ne v8, v14, :cond_6

    goto :goto_3

    :cond_4
    move/from16 v18, v8

    move-object/from16 v19, v14

    :cond_5
    :goto_3
    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_6
    iget v8, v15, Landroidx/fragment/app/b2;->a:I

    const/4 v14, 0x1

    if-eq v8, v14, :cond_7

    if-ne v8, v6, :cond_8

    :cond_7
    invoke-virtual {v13, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object/from16 v10, v16

    move/from16 v8, v18

    move-object/from16 v14, v19

    const/4 v6, 0x1

    goto :goto_2

    :cond_9
    move/from16 v18, v8

    move-object/from16 v16, v10

    invoke-virtual {v12, v13}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {v12}, Ljava/util/HashSet;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_b

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"

    invoke-static {v9, v5, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/util/HashSet;->size()I

    move-result v4

    const/4 v14, 0x1

    if-ne v4, v14, :cond_a

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    :cond_a
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "s "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_4
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " in "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " that were previously added to the FragmentManager through a separate FragmentTransaction."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Landroidx/fragment/app/o1;->l0(Ljava/lang/RuntimeException;)V

    throw v16

    :cond_b
    add-int/lit8 v8, v18, 0x1

    move-object/from16 v10, v16

    const/4 v6, 0x1

    goto/16 :goto_1

    :cond_c
    move-object/from16 v16, v10

    new-instance v6, Ljava/util/ArrayDeque;

    invoke-direct {v6, v7}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_11

    invoke-virtual {v6}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/m0;

    iget-boolean v10, v8, Landroidx/fragment/app/m0;->mRetainInstance:Z

    if-eqz v10, :cond_f

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\") must not contain retained fragments. Found "

    invoke-static {v9, v5, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "direct reference to retained "

    goto :goto_5

    :cond_e
    const-string v4, "retained child "

    :goto_5
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "fragment "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Landroidx/fragment/app/o1;->l0(Ljava/lang/RuntimeException;)V

    throw v16

    :cond_f
    iget-object v8, v8, Landroidx/fragment/app/m0;->mChildFragmentManager:Landroidx/fragment/app/o1;

    iget-object v8, v8, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v8}, Landroidx/fragment/app/a2;->e()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_10
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/m0;

    if-eqz v10, :cond_10

    invoke-virtual {v6, v10}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_6

    :cond_11
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/m0;

    iget-object v8, v8, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    iget-object v8, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    sub-int/2addr v8, v4

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    move v8, v4

    :goto_8
    iget-object v9, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_13

    move-object/from16 v9, v16

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_13
    new-instance v8, Landroidx/fragment/app/c;

    invoke-direct {v8, v6, v7}, Landroidx/fragment/app/c;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v6, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/16 v17, 0x1

    add-int/lit8 v6, v6, -0x1

    :goto_9
    if-lt v6, v4, :cond_14

    iget-object v9, v3, Landroidx/fragment/app/o1;->d:Ljava/util/ArrayList;

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/a;

    new-instance v10, Landroidx/fragment/app/a;

    invoke-direct {v10, v9}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/a;)V

    invoke-virtual {v10}, Landroidx/fragment/app/a;->i()V

    new-instance v11, Landroidx/fragment/app/b;

    invoke-direct {v11, v10}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    sub-int v10, v6, v4

    invoke-virtual {v7, v10, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v14, 0x1

    iput-boolean v14, v9, Landroidx/fragment/app/a;->w:Z

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, -0x1

    goto :goto_9

    :cond_14
    const/4 v14, 0x1

    iget-object v1, v3, Landroidx/fragment/app/o1;->l:Ljava/util/Map;

    invoke-interface {v1, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v6, v14

    :goto_a
    return v6

    :pswitch_0
    iget-object v3, v0, Landroidx/fragment/app/n1;->c:Landroidx/fragment/app/o1;

    iget-object v4, v3, Landroidx/fragment/app/o1;->l:Ljava/util/Map;

    iget-object v5, v0, Landroidx/fragment/app/n1;->b:Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/c;

    const/4 v5, 0x0

    if-nez v4, :cond_15

    goto/16 :goto_11

    :cond_15
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_16
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    iget-boolean v9, v8, Landroidx/fragment/app/a;->w:Z

    if-eqz v9, :cond_16

    iget-object v8, v8, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_17
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/b2;

    iget-object v9, v9, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    if-eqz v9, :cond_17

    iget-object v10, v9, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_18
    new-instance v7, Ljava/util/HashMap;

    iget-object v8, v4, Landroidx/fragment/app/c;->w:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(I)V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_19
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/m0;

    if-eqz v10, :cond_1a

    iget-object v9, v10, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    invoke-virtual {v7, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_1a
    iget-object v10, v3, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    const/4 v11, 0x0

    invoke-virtual {v10, v11, v9}, Landroidx/fragment/app/a2;->i(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_19

    iget-object v10, v3, Landroidx/fragment/app/o1;->x:Landroidx/fragment/app/x0;

    iget-object v10, v10, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/r0;

    invoke-virtual {v10}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v10

    const-string v11, "state"

    invoke-virtual {v9, v11}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/x1;

    invoke-virtual {v3}, Landroidx/fragment/app/o1;->J()Landroidx/fragment/app/w0;

    move-result-object v12

    invoke-virtual {v11, v12, v10}, Landroidx/fragment/app/x1;->b(Landroidx/fragment/app/w0;Ljava/lang/ClassLoader;)Landroidx/fragment/app/m0;

    move-result-object v11

    iput-object v9, v11, Landroidx/fragment/app/m0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v12, "savedInstanceState"

    invoke-virtual {v9, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v13

    if-nez v13, :cond_1b

    iget-object v13, v11, Landroidx/fragment/app/m0;->mSavedFragmentState:Landroid/os/Bundle;

    new-instance v14, Landroid/os/Bundle;

    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v13, v12, v14}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1b
    const-string v12, "arguments"

    invoke-virtual {v9, v12}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v9

    if-eqz v9, :cond_1c

    invoke-virtual {v9, v10}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_1c
    invoke-virtual {v11, v9}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    iget-object v9, v11, Landroidx/fragment/app/m0;->mWho:Ljava/lang/String;

    invoke-virtual {v7, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_1d
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v4, Landroidx/fragment/app/c;->x:Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/b;

    iget-object v9, v8, Landroidx/fragment/app/b;->x:Ljava/util/ArrayList;

    new-instance v10, Landroidx/fragment/app/a;

    invoke-direct {v10, v3}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    invoke-virtual {v8, v10}, Landroidx/fragment/app/b;->b(Landroidx/fragment/app/a;)V

    move v11, v5

    :goto_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v11, v12, :cond_20

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_1f

    invoke-virtual {v7, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/fragment/app/m0;

    if-eqz v13, :cond_1e

    iget-object v12, v10, Landroidx/fragment/app/c2;->c:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/b2;

    iput-object v13, v12, Landroidx/fragment/app/b2;->b:Landroidx/fragment/app/m0;

    goto :goto_f

    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Restoring FragmentTransaction "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v8, Landroidx/fragment/app/b;->F:Ljava/lang/String;

    const-string v4, " failed due to missing saved state for Fragment ("

    const-string v5, ")"

    invoke-static {v2, v3, v4, v12, v5}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    :goto_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_20
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_21
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/a;

    invoke-virtual {v4, v1, v2}, Landroidx/fragment/app/a;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    const/4 v5, 0x1

    goto :goto_10

    :cond_22
    :goto_11
    return v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
