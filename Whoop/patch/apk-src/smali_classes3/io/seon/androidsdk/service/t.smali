.class public final synthetic Lio/seon/androidsdk/service/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/u;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/u;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/t;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/t;->b:Lio/seon/androidsdk/service/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lio/seon/androidsdk/service/t;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, v1, Lio/seon/androidsdk/service/t;->b:Lio/seon/androidsdk/service/u;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/seon/androidsdk/service/u;->z:Ljava/lang/String;

    sget-object v3, Lio/seon/androidsdk/service/u;->s:[Ljava/lang/String;

    :try_start_0
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    array-length v7, v3

    move v8, v2

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v3, v8

    invoke-virtual {v5, v9}, Lio/seon/androidsdk/service/u;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-virtual {v10}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v6, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Lio/seon/androidsdk/service/u;->i()Ljava/util/LinkedHashMap;

    move-result-object v5

    if-eqz v5, :cond_3

    array-length v7, v3

    :goto_1
    if-ge v2, v7, :cond_3

    aget-object v8, v3, v2

    invoke-interface {v5, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v6

    :catchall_0
    :goto_2
    return-object v4

    :pswitch_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    new-instance v0, Ljava/io/File;

    sget-object v2, Lio/seon/androidsdk/service/u;->Q:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_6

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/FileReader;

    invoke-direct {v5, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :goto_3
    :try_start_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    goto :goto_4

    :cond_6
    :try_start_3
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-eqz v2, :cond_7

    goto :goto_7

    :cond_7
    move-object v4, v0

    goto :goto_7

    :goto_4
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2

    :cond_8
    :goto_6
    sget-object v0, Lio/seon/androidsdk/service/u;->T:Ljava/lang/String;

    invoke-static {v0, v4}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :goto_7
    return-object v4

    :pswitch_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v3, v5, Lio/seon/androidsdk/service/u;->e:Landroid/content/Context;

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    sget-object v5, Lio/seon/androidsdk/service/u;->v:[Ljava/lang/String;

    array-length v6, v5

    move v7, v2

    :goto_8
    if-ge v7, v6, :cond_11

    aget-object v8, v5, v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    const/16 v9, 0xe

    :try_start_7
    invoke-virtual {v3, v8, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v9

    iget-object v9, v9, Landroid/content/pm/PackageInfo;->services:[Landroid/content/pm/ServiceInfo;

    if-nez v9, :cond_9

    goto/16 :goto_d

    :cond_9
    array-length v10, v9

    move v11, v2

    :goto_9
    if-ge v11, v10, :cond_10

    aget-object v12, v9, v11

    iget-object v12, v12, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    if-nez v12, :cond_a

    goto/16 :goto_c

    :cond_a
    const/16 v13, 0x24

    invoke-virtual {v12, v13}, Ljava/lang/String;->indexOf(I)I

    move-result v13

    if-lez v13, :cond_b

    invoke-virtual {v12, v2, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    goto :goto_a

    :cond_b
    move-object v13, v12

    :goto_a
    sget-object v14, Lio/seon/androidsdk/service/u;->u:[Ljava/lang/String;

    array-length v15, v14
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move v4, v2

    :goto_b
    const-string v2, "/"

    if-ge v4, v15, :cond_d

    :try_start_8
    aget-object v1, v14, v4

    invoke-virtual {v12, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, p0

    goto :goto_b

    :cond_d
    invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lio/seon/androidsdk/service/u;->B:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_e

    sget-object v4, Lio/seon/androidsdk/service/u;->C:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_e

    sget-object v4, Lio/seon/androidsdk/service/u;->D:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_e

    sget-object v4, Lio/seon/androidsdk/service/u;->E:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :cond_f
    :goto_c
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v4, 0x0

    goto/16 :goto_9

    :catchall_4
    :cond_10
    :goto_d
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v4, 0x0

    goto/16 :goto_8

    :cond_11
    :try_start_9
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_e

    :cond_12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-object v4, v1

    goto :goto_f

    :catchall_5
    :goto_e
    const/4 v4, 0x0

    :goto_f
    return-object v4

    :pswitch_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_a
    iget-object v0, v5, Lio/seon/androidsdk/service/u;->e:Landroid/content/Context;

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/u;->t:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_10
    if-ge v4, v3, :cond_14

    aget-object v5, v2, v4

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v7

    if-eqz v7, :cond_13

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    if-eqz v0, :cond_15

    goto :goto_11

    :cond_15
    move-object v4, v1

    goto :goto_12

    :catchall_6
    :goto_11
    const/4 v4, 0x0

    :goto_12
    return-object v4

    :pswitch_3
    move-object v1, v4

    iput-object v1, v5, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lio/seon/androidsdk/service/u;->q:[Ljava/lang/String;

    array-length v2, v1

    const/4 v4, 0x0

    :goto_13
    if-ge v4, v2, :cond_17

    aget-object v6, v1, v4

    invoke-virtual {v5, v6}, Lio/seon/androidsdk/service/u;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_16

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v5, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    if-nez v6, :cond_16

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iput-object v6, v5, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    :cond_17
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual {v5}, Lio/seon/androidsdk/service/u;->i()Ljava/util/LinkedHashMap;

    move-result-object v2

    if-eqz v2, :cond_19

    array-length v4, v1

    const/4 v6, 0x0

    :goto_14
    if-ge v6, v4, :cond_19

    aget-object v7, v1, v6

    invoke-interface {v2, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v5, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    if-nez v7, :cond_18

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v5, Lio/seon/androidsdk/service/u;->f:Ljava/lang/Integer;

    :cond_18
    add-int/lit8 v6, v6, 0x1

    goto :goto_14

    :cond_19
    return-object v0

    :pswitch_4
    move-object v1, v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_b
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/u;->l:Ljava/lang/String;

    sget-object v4, Lio/seon/androidsdk/service/u;->m:Ljava/lang/String;

    sget-object v6, Lio/seon/androidsdk/service/u;->n:Ljava/lang/String;

    sget-object v7, Lio/seon/androidsdk/service/u;->o:Ljava/lang/String;

    sget-object v8, Lio/seon/androidsdk/service/u;->p:Ljava/lang/String;

    filled-new-array {v2, v4, v6, v7, v8}, [Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    :goto_15
    const/4 v6, 0x5

    if-ge v4, v6, :cond_1c

    aget-object v6, v2, v4

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v8, Lio/seon/androidsdk/service/u;->k:Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    :try_start_c
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v8, v5, Lio/seon/androidsdk/service/u;->e:Landroid/content/Context;

    sget-object v10, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v8

    if-eqz v8, :cond_1a

    move v8, v3

    goto :goto_16

    :cond_1a
    const/4 v8, 0x0

    :goto_16
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    goto :goto_17

    :catchall_7
    move-object v8, v1

    :goto_17
    :try_start_d
    invoke-virtual {v7, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    add-int/lit8 v4, v4, 0x1

    goto :goto_15

    :cond_1c
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-eqz v2, :cond_1d

    goto :goto_18

    :cond_1d
    move-object v4, v0

    goto :goto_19

    :catchall_8
    :goto_18
    move-object v4, v1

    :goto_19
    return-object v4

    :pswitch_5
    move-object v1, v4

    sget-object v0, Lio/seon/androidsdk/service/u;->A:Ljava/lang/String;

    :try_start_e
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v3, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    if-eqz v3, :cond_1e

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1e

    sget-object v4, Lio/seon/androidsdk/service/u;->K:Ljava/lang/String;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    sget-object v3, Landroid/os/Build;->BOARD:Ljava/lang/String;

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Lio/seon/androidsdk/service/u;->L:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1f
    invoke-virtual {v5}, Lio/seon/androidsdk/service/u;->i()Ljava/util/LinkedHashMap;

    move-result-object v0

    if-eqz v0, :cond_24

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_20
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_22

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Lio/seon/androidsdk/service/u;->F:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v7, v3

    goto :goto_1b

    :cond_21
    sget-object v7, Lio/seon/androidsdk/service/u;->G:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v7, v4

    :goto_1b
    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1a

    :cond_22
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_23

    sget-object v0, Lio/seon/androidsdk/service/u;->M:Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/seon/androidsdk/service/u;->N:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    sget-object v0, Lio/seon/androidsdk/service/u;->O:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lio/seon/androidsdk/service/u;->P:Ljava/lang/String;

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_24
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    if-eqz v0, :cond_25

    goto :goto_1c

    :cond_25
    move-object v4, v2

    goto :goto_1d

    :catchall_9
    :goto_1c
    move-object v4, v1

    :goto_1d
    return-object v4

    :pswitch_6
    move-object v1, v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_f
    iget-object v0, v5, Lio/seon/androidsdk/service/u;->e:Landroid/content/Context;

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sget-object v2, Lio/seon/androidsdk/service/u;->k:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual {v0, v2, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iget v4, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v5, v4, 0x1

    if-nez v5, :cond_27

    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_26

    goto :goto_1e

    :cond_26
    const/16 v16, 0x0

    goto :goto_1f

    :cond_27
    :goto_1e
    move/from16 v16, v3

    :goto_1f
    sget-object v3, Lio/seon/androidsdk/service/u;->I:Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lio/seon/androidsdk/service/u;->J:Ljava/lang/String;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_f
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move-object v4, v2

    goto :goto_20

    :catch_0
    :catchall_a
    move-object v4, v1

    :goto_20
    return-object v4

    :pswitch_7
    move-object v1, v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lio/seon/androidsdk/service/u;->v:[Ljava/lang/String;

    array-length v4, v2

    const/4 v6, 0x0

    :goto_21
    if-ge v6, v4, :cond_2a

    aget-object v7, v2, v6

    :try_start_10
    iget-object v8, v5, Lio/seon/androidsdk/service/u;->e:Landroid/content/Context;

    sget-object v9, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8
    :try_end_10
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_10 .. :try_end_10} :catch_1
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    const/4 v10, 0x0

    :try_start_11
    invoke-virtual {v8, v7, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v8

    if-eqz v8, :cond_28

    move v8, v3

    goto :goto_22

    :cond_28
    move v8, v10

    :goto_22
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8
    :try_end_11
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    goto :goto_25

    :catchall_b
    const/4 v10, 0x0

    goto :goto_23

    :catch_1
    const/4 v10, 0x0

    goto :goto_24

    :catchall_c
    :goto_23
    move-object v8, v1

    goto :goto_25

    :catch_2
    :goto_24
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_25
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v9, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    add-int/lit8 v6, v6, 0x1

    goto :goto_21

    :cond_2a
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2b

    move-object v4, v1

    goto :goto_26

    :cond_2b
    move-object v4, v0

    :goto_26
    return-object v4

    :pswitch_8
    move v10, v2

    move-object v1, v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v3, Lio/seon/androidsdk/service/u;->x:[Ljava/lang/String;

    array-length v4, v3

    move v6, v10

    :goto_27
    if-ge v6, v4, :cond_32

    aget-object v5, v3, v6

    :try_start_12
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_30

    invoke-virtual {v0}, Ljava/io/File;->canRead()Z

    move-result v7

    if-nez v7, :cond_2c

    goto :goto_2c

    :cond_2c
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/io/BufferedReader;

    new-instance v9, Ljava/io/FileReader;

    invoke-direct {v9, v0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_f

    :cond_2d
    :try_start_13
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    sget-object v9, Lio/seon/androidsdk/service/u;->y:[Ljava/lang/String;

    array-length v11, v9

    move v12, v10

    :goto_28
    if-ge v12, v11, :cond_2d

    aget-object v13, v9, v12

    invoke-virtual {v13}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2e

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2e

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    goto :goto_29

    :catchall_d
    move-exception v0

    move-object v7, v0

    goto :goto_2a

    :cond_2e
    :goto_29
    add-int/lit8 v12, v12, 0x1

    goto :goto_28

    :cond_2f
    :try_start_14
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    goto :goto_2d

    :goto_2a
    :try_start_15
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    goto :goto_2b

    :catchall_e
    move-exception v0

    :try_start_16
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2b
    throw v7
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    :catchall_f
    :cond_30
    :goto_2c
    move-object v7, v1

    :goto_2d
    if-eqz v7, :cond_31

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_31

    invoke-interface {v2, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_31
    add-int/lit8 v6, v6, 0x1

    goto :goto_27

    :cond_32
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_33

    move-object v4, v1

    goto :goto_2e

    :cond_33
    move-object v4, v2

    :goto_2e
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
