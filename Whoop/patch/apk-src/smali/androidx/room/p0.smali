.class public final Landroidx/room/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public f:Ljava/util/concurrent/Executor;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljc/p;

.field public i:Z

.field public final j:Landroidx/room/s0;

.field public final k:J

.field public final l:Landroidx/room/t0;

.field public final m:Ljava/util/LinkedHashSet;

.field public final n:Ljava/util/LinkedHashSet;

.field public final o:Ljava/util/ArrayList;

.field public p:Z

.field public q:Z

.field public r:Z

.field public final s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->e:Ljava/util/ArrayList;

    sget-object v0, Landroidx/room/s0;->w:Landroidx/room/s0;

    iput-object v0, p0, Landroidx/room/p0;->j:Landroidx/room/s0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroidx/room/p0;->k:J

    new-instance v0, Landroidx/room/t0;

    invoke-direct {v0}, Landroidx/room/t0;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->l:Landroidx/room/t0;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->m:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->n:Ljava/util/LinkedHashSet;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/room/p0;->o:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/room/p0;->p:Z

    iput-boolean v0, p0, Landroidx/room/p0;->s:Z

    invoke-static {p2}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    iput-object p2, p0, Landroidx/room/p0;->a:Lj93/d;

    iput-object p1, p0, Landroidx/room/p0;->b:Landroid/content/Context;

    iput-object p3, p0, Landroidx/room/p0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final varargs a([Lmb/b;)V
    .locals 7

    const-string v0, "migrations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    iget v5, v4, Lmb/b;->startVersion:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Landroidx/room/p0;->n:Ljava/util/LinkedHashSet;

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget v4, v4, Lmb/b;->endVersion:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lmb/b;

    iget-object v1, p0, Landroidx/room/p0;->l:Landroidx/room/t0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    :goto_1
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v1, v3}, Landroidx/room/t0;->a(Lmb/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final b()Landroidx/room/z0;
    .locals 26

    move-object/from16 v1, p0

    iget-object v0, v1, Landroidx/room/p0;->f:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    iget-object v2, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    if-nez v2, :cond_0

    sget-object v0, Lt/a;->d:Landroidx/profileinstaller/b;

    iput-object v0, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    iput-object v0, v1, Landroidx/room/p0;->f:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v2, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    if-nez v2, :cond_1

    iput-object v0, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    iget-object v0, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    iput-object v0, v1, Landroidx/room/p0;->f:Ljava/util/concurrent/Executor;

    :cond_2
    :goto_0
    const-string v0, "migrationStartAndEndVersions"

    iget-object v2, v1, Landroidx/room/p0;->n:Ljava/util/LinkedHashSet;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "migrationsNotRequiredFrom"

    iget-object v3, v1, Landroidx/room/p0;->m:Ljava/util/LinkedHashSet;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "

    invoke-static {v2, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    iget-object v0, v1, Landroidx/room/p0;->h:Ljc/p;

    if-nez v0, :cond_5

    new-instance v0, Ljc/b;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Ljc/b;-><init>(I)V

    :cond_5
    move-object v6, v0

    iget-wide v4, v1, Landroidx/room/p0;->k:J

    const-wide/16 v7, 0x0

    cmp-long v0, v4, v7

    if-lez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    const-string v4, "Required value was null."

    if-eqz v0, :cond_8

    iget-object v0, v1, Landroidx/room/p0;->c:Ljava/lang/String;

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot create auto-closing database for an in-memory database."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v16, v3

    new-instance v3, Landroidx/room/g;

    iget-boolean v9, v1, Landroidx/room/p0;->i:Z

    iget-object v0, v1, Landroidx/room/p0;->j:Landroidx/room/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "context"

    move-object v7, v4

    iget-object v4, v1, Landroidx/room/p0;->b:Landroid/content/Context;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Landroidx/room/s0;->w:Landroidx/room/s0;

    const/4 v8, 0x0

    if-eq v0, v5, :cond_9

    :goto_3
    move-object v10, v0

    goto :goto_5

    :cond_9
    const-string v0, "activity"

    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v5, v0, Landroid/app/ActivityManager;

    if-eqz v5, :cond_a

    check-cast v0, Landroid/app/ActivityManager;

    goto :goto_4

    :cond_a
    move-object v0, v8

    :goto_4
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result v0

    if-nez v0, :cond_b

    sget-object v0, Landroidx/room/s0;->y:Landroidx/room/s0;

    goto :goto_3

    :cond_b
    sget-object v0, Landroidx/room/s0;->x:Landroidx/room/s0;

    goto :goto_3

    :goto_5
    iget-object v11, v1, Landroidx/room/p0;->f:Ljava/util/concurrent/Executor;

    if-eqz v11, :cond_11

    iget-object v12, v1, Landroidx/room/p0;->g:Ljava/util/concurrent/Executor;

    if-eqz v12, :cond_10

    iget-boolean v14, v1, Landroidx/room/p0;->p:Z

    iget-boolean v15, v1, Landroidx/room/p0;->q:Z

    iget-boolean v0, v1, Landroidx/room/p0;->r:Z

    const/16 v23, 0x0

    const/16 v24, 0x0

    iget-object v5, v1, Landroidx/room/p0;->c:Ljava/lang/String;

    iget-object v7, v1, Landroidx/room/p0;->l:Landroidx/room/t0;

    move-object v13, v8

    iget-object v8, v1, Landroidx/room/p0;->d:Ljava/util/ArrayList;

    move-object/from16 v17, v13

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    iget-object v13, v1, Landroidx/room/p0;->e:Ljava/util/ArrayList;

    const/16 v25, 0x1

    iget-object v2, v1, Landroidx/room/p0;->o:Ljava/util/ArrayList;

    move/from16 v22, v0

    move-object/from16 v21, v2

    move-object/from16 v0, v20

    move-object/from16 v20, v13

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v24}, Landroidx/room/g;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/d;Landroidx/room/t0;Ljava/util/List;ZLandroidx/room/s0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Ljava/util/List;Ljava/util/List;ZLtb/b;Lq83/j;)V

    iget-boolean v2, v1, Landroidx/room/p0;->s:Z

    iput-boolean v2, v3, Landroidx/room/g;->v:Z

    iget-object v2, v1, Landroidx/room/p0;->a:Lj93/d;

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_d

    :cond_c
    const-string v4, ""

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_6
    const/16 v6, 0x5f

    const/16 v7, 0x2e

    invoke-static {v5, v7, v6}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v5

    const-string v6, "_Impl"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_f

    move-object v4, v5

    goto :goto_7

    :cond_f
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_7
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    move/from16 v7, v25

    invoke-static {v4, v7, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v4

    const-string v6, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    check-cast v0, Landroidx/room/z0;

    invoke-virtual {v0, v3}, Landroidx/room/z0;->init(Landroidx/room/g;)V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_8

    :catch_1
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    goto :goto_a

    :goto_8
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to create an instance of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_9
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Cannot access the constructor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_a
    new-instance v3, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Cannot find implementation for "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not exist. Is Room annotation processor correctly configured?"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
