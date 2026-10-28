.class public final Landroidx/room/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:[Ljava/lang/String;


# instance fields
.field public final a:Landroidx/room/z0;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;

.field public final d:Z

.field public final e:Landroidx/room/u;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:[Ljava/lang/String;

.field public final h:Landroidx/room/g0;

.field public final i:Laj/c;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public k:Lc93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UPDATE"

    const-string v1, "DELETE"

    const-string v2, "INSERT"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/room/i2;->l:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;ZLandroidx/room/u;)V
    .locals 3

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/i2;->a:Landroidx/room/z0;

    iput-object p2, p0, Landroidx/room/i2;->b:Ljava/util/HashMap;

    iput-object p3, p0, Landroidx/room/i2;->c:Ljava/util/HashMap;

    iput-boolean p5, p0, Landroidx/room/i2;->d:Z

    iput-object p6, p0, Landroidx/room/i2;->e:Landroidx/room/u;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Landroidx/room/i2;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, La13/f;

    const/4 p3, 0x7

    invoke-direct {p1, p3}, La13/f;-><init>(I)V

    iput-object p1, p0, Landroidx/room/i2;->k:Lc93/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Landroidx/room/i2;->f:Ljava/util/LinkedHashMap;

    array-length p1, p4

    new-array p3, p1, [Ljava/lang/String;

    :goto_0
    const-string p5, "toLowerCase(...)"

    if-ge p2, p1, :cond_2

    aget-object p6, p4, p2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p6

    invoke-static {p6, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/room/i2;->f:Ljava/util/LinkedHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, p6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Landroidx/room/i2;->b:Ljava/util/HashMap;

    aget-object v2, p4, p2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object p6, v0

    :goto_2
    aput-object p6, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    iput-object p3, p0, Landroidx/room/i2;->g:[Ljava/lang/String;

    iget-object p1, p0, Landroidx/room/i2;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p6, p0, Landroidx/room/i2;->f:Ljava/util/LinkedHashMap;

    invoke-interface {p6, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Landroidx/room/i2;->f:Ljava/util/LinkedHashMap;

    invoke-static {p3, p4}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    new-instance p1, Landroidx/room/g0;

    iget-object p2, p0, Landroidx/room/i2;->g:[Ljava/lang/String;

    array-length p2, p2

    invoke-direct {p1, p2}, Landroidx/room/g0;-><init>(I)V

    iput-object p1, p0, Landroidx/room/i2;->h:Landroidx/room/g0;

    new-instance p1, Laj/c;

    iget-object p2, p0, Landroidx/room/i2;->g:[Ljava/lang/String;

    array-length p2, p2

    invoke-direct {p1, p2}, Laj/c;-><init>(I)V

    iput-object p1, p0, Landroidx/room/i2;->i:Laj/c;

    return-void
.end method

.method public static final a(Landroidx/room/i2;Landroidx/room/j0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Landroidx/room/y1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/room/y1;

    iget v1, v0, Landroidx/room/y1;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/y1;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/y1;

    invoke-direct {v0, p0, p2}, Landroidx/room/y1;-><init>(Landroidx/room/i2;Ls83/c;)V

    :goto_0
    iget-object p0, v0, Landroidx/room/y1;->x:Ljava/lang/Object;

    sget-object p2, Lr83/a;->w:Lr83/a;

    iget v1, v0, Landroidx/room/y1;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v0, Landroidx/room/y1;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Landroidx/room/y1;->w:Ljava/lang/Object;

    check-cast p1, Landroidx/room/j0;

    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p0, La11/g;

    const/4 v1, 0x6

    invoke-direct {p0, v1}, La11/g;-><init>(I)V

    iput-object p1, v0, Landroidx/room/y1;->w:Ljava/lang/Object;

    iput v3, v0, Landroidx/room/y1;->z:I

    const-string v1, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    invoke-interface {p1, v1, p0, v0}, Landroidx/room/j0;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    iput-object p0, v0, Landroidx/room/y1;->w:Ljava/lang/Object;

    iput v2, v0, Landroidx/room/y1;->z:I

    const-string v1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    invoke-static {p1, v1, v0}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_5

    :goto_2
    return-object p2

    :cond_5
    return-object p0
.end method

.method public static final b(Landroidx/room/i2;Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Landroidx/room/i2;->a:Landroidx/room/z0;

    instance-of v1, p1, Landroidx/room/c2;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Landroidx/room/c2;

    iget v2, v1, Landroidx/room/c2;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Landroidx/room/c2;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/room/c2;

    invoke-direct {v1, p0, p1}, Landroidx/room/c2;-><init>(Landroidx/room/i2;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Landroidx/room/c2;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Landroidx/room/c2;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v0, v1, Landroidx/room/c2;->w:Lkb/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/room/z0;->getCloseBarrier$room_runtime()Lkb/a;

    move-result-object p1

    invoke-virtual {p1}, Lkb/a;->a()Z

    move-result v3

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    if-eqz v3, :cond_7

    :try_start_1
    iget-object v3, p0, Landroidx/room/i2;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v3, :cond_3

    invoke-virtual {p1}, Lkb/a;->b()V

    return-object v5

    :cond_3
    :try_start_2
    iget-object v3, p0, Landroidx/room/i2;->k:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v3, :cond_4

    invoke-virtual {p1}, Lkb/a;->b()V

    return-object v5

    :cond_4
    :try_start_3
    new-instance v3, Landroidx/room/d2;

    const/4 v5, 0x0

    const/4 v7, 0x1

    invoke-direct {v3, p0, v5, v7}, Landroidx/room/d2;-><init>(Landroidx/room/i2;Lq83/d;I)V

    iput-object p1, v1, Landroidx/room/c2;->w:Lkb/a;

    iput v4, v1, Landroidx/room/c2;->z:I

    invoke-virtual {v0, v6, v3, v1}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v2, :cond_5

    return-object v2

    :cond_5
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Landroidx/room/i2;->i:Laj/c;

    invoke-virtual {v1, p1}, Laj/c;->M(Ljava/util/Set;)V

    iget-object p0, p0, Landroidx/room/i2;->e:Landroidx/room/u;

    invoke-virtual {p0, p1}, Landroidx/room/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    invoke-virtual {v0}, Lkb/a;->b()V

    return-object p1

    :catchall_1
    move-exception p0

    move-object v0, p1

    :goto_2
    invoke-virtual {v0}, Lkb/a;->b()V

    throw p0

    :cond_7
    return-object v5
.end method

.method public static final c(Landroidx/room/i2;Landroidx/room/x1;ILs83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v4, v3, Landroidx/room/e2;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Landroidx/room/e2;

    iget v5, v4, Landroidx/room/e2;->I:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Landroidx/room/e2;->I:I

    goto :goto_0

    :cond_0
    new-instance v4, Landroidx/room/e2;

    invoke-direct {v4, v0, v3}, Landroidx/room/e2;-><init>(Landroidx/room/i2;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Landroidx/room/e2;->G:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Landroidx/room/e2;->I:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget v1, v4, Landroidx/room/e2;->F:I

    iget v2, v4, Landroidx/room/e2;->E:I

    iget v6, v4, Landroidx/room/e2;->z:I

    iget-object v9, v4, Landroidx/room/e2;->y:[Ljava/lang/String;

    iget-object v10, v4, Landroidx/room/e2;->x:Ljava/lang/String;

    iget-object v11, v4, Landroidx/room/e2;->w:Landroidx/room/j0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 p3, v8

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v1, v4, Landroidx/room/e2;->z:I

    iget-object v2, v4, Landroidx/room/e2;->w:Landroidx/room/j0;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v1

    move-object/from16 v1, v16

    goto :goto_1

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", 0)"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v1, v4, Landroidx/room/e2;->w:Landroidx/room/j0;

    iput v2, v4, Landroidx/room/e2;->z:I

    iput v8, v4, Landroidx/room/e2;->I:I

    invoke-static {v1, v3, v4}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_4

    goto :goto_4

    :cond_4
    :goto_1
    iget-object v3, v0, Landroidx/room/i2;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    sget-object v6, Landroidx/room/i2;->l:[Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x3

    move-object v11, v6

    move v6, v2

    move v2, v9

    move-object v9, v11

    move-object v11, v1

    move v1, v10

    move-object v10, v3

    :goto_2
    if-ge v2, v1, :cond_7

    aget-object v3, v9, v2

    iget-boolean v12, v0, Landroidx/room/i2;->d:Z

    if-eqz v12, :cond_5

    const-string v12, "TEMP"

    goto :goto_3

    :cond_5
    const-string v12, ""

    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "room_table_modification_trigger_"

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x5f

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v14, " TRIGGER IF NOT EXISTS `"

    const-string v15, "` AFTER "

    move/from16 p3, v8

    const-string v8, "CREATE "

    invoke-static {v8, v12, v14, v13, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v12, " ON `"

    const-string v13, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    invoke-static {v8, v3, v12, v10, v13}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, " AND invalidated = 0; END"

    invoke-static {v8, v6, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v11, v4, Landroidx/room/e2;->w:Landroidx/room/j0;

    iput-object v10, v4, Landroidx/room/e2;->x:Ljava/lang/String;

    iput-object v9, v4, Landroidx/room/e2;->y:[Ljava/lang/String;

    iput v6, v4, Landroidx/room/e2;->z:I

    iput v2, v4, Landroidx/room/e2;->E:I

    iput v1, v4, Landroidx/room/e2;->F:I

    iput v7, v4, Landroidx/room/e2;->I:I

    invoke-static {v11, v3, v4}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_6

    :goto_4
    return-object v5

    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    move/from16 v8, p3

    goto :goto_2

    :cond_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final d(Landroidx/room/i2;Landroidx/room/x1;ILs83/c;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p3, Landroidx/room/f2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/room/f2;

    iget v1, v0, Landroidx/room/f2;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/f2;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/f2;

    invoke-direct {v0, p0, p3}, Landroidx/room/f2;-><init>(Landroidx/room/i2;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Landroidx/room/f2;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Landroidx/room/f2;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Landroidx/room/f2;->E:I

    iget p1, v0, Landroidx/room/f2;->z:I

    iget-object p2, v0, Landroidx/room/f2;->y:[Ljava/lang/String;

    iget-object v2, v0, Landroidx/room/f2;->x:Ljava/lang/String;

    iget-object v4, v0, Landroidx/room/f2;->w:Landroidx/room/j0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p2

    move-object p2, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p0, p0, Landroidx/room/i2;->g:[Ljava/lang/String;

    aget-object p0, p0, p2

    sget-object p2, Landroidx/room/i2;->l:[Ljava/lang/String;

    const/4 p3, 0x0

    const/4 v2, 0x3

    move v7, v2

    move-object v2, p0

    move p0, v7

    move-object v7, p2

    move-object p2, p1

    move p1, p3

    move-object p3, v7

    :goto_1
    if-ge p1, p0, :cond_4

    aget-object v4, p3, p1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "room_table_modification_trigger_"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "DROP TRIGGER IF EXISTS `"

    const/16 v6, 0x60

    invoke-static {v6, v5, v4}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object p2, v0, Landroidx/room/f2;->w:Landroidx/room/j0;

    iput-object v2, v0, Landroidx/room/f2;->x:Ljava/lang/String;

    iput-object p3, v0, Landroidx/room/f2;->y:[Ljava/lang/String;

    iput p1, v0, Landroidx/room/f2;->z:I

    iput p0, v0, Landroidx/room/f2;->E:I

    iput v3, v0, Landroidx/room/f2;->H:I

    invoke-static {p2, v4, v0}, Lts/o;->r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final e(Lc93/a;Lc93/a;)V
    .locals 4

    const-string v0, "onRefreshScheduled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRefreshCompleted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/room/i2;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Landroidx/room/i2;->a:Landroidx/room/z0;

    invoke-virtual {p1}, Landroidx/room/z0;->getCoroutineScope()Lbc3/c0;

    move-result-object p1

    new-instance v0, Lbc3/b0;

    const-string v1, "Room Invalidation Tracker Refresh"

    invoke-direct {v0, v1}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/c;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-direct {v1, p0, p2, v3, v2}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x2

    invoke-static {p1, v0, v3, v1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public final f(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Landroidx/room/g2;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/room/g2;

    iget v1, v0, Landroidx/room/g2;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/g2;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/g2;

    invoke-direct {v0, p0, p1}, Landroidx/room/g2;-><init>(Landroidx/room/i2;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Landroidx/room/g2;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Landroidx/room/g2;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Landroidx/room/g2;->w:Lkb/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/room/i2;->a:Landroidx/room/z0;

    invoke-virtual {p1}, Landroidx/room/z0;->getCloseBarrier$room_runtime()Lkb/a;

    move-result-object v2

    invoke-virtual {v2}, Lkb/a;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    :try_start_1
    new-instance v4, La6/v;

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-direct {v4, p0, v5, v6}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, v0, Landroidx/room/g2;->w:Lkb/a;

    iput v3, v0, Landroidx/room/g2;->z:I

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v4, v0}, Landroidx/room/z0;->useConnection(ZLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, v2

    :goto_1
    invoke-virtual {v0}, Lkb/a;->b()V

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v0, v2

    :goto_2
    invoke-virtual {v0}, Lkb/a;->b()V

    throw p1

    :cond_4
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g([Ljava/lang/String;)Ll83/k;
    .locals 7

    new-instance v0, Ln83/i;

    invoke-direct {v0}, Ln83/i;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-string v4, "toLowerCase(...)"

    if-ge v3, v1, :cond_1

    aget-object v5, p1, v3

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Landroidx/room/i2;->c:Ljava/util/HashMap;

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    if-eqz v4, :cond_0

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v0, v4}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v5}, Ln83/i;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    new-array v1, v0, [I

    :goto_2
    if-ge v2, v0, :cond_3

    aget-object v3, p1, v2

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Landroidx/room/i2;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "There is no table with name "

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v0, Ll83/k;

    invoke-direct {v0, p1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
