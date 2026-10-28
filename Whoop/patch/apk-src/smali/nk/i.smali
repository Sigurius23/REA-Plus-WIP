.class public final Lnk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final m:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/lang/String;

.field public final c:Laj/d;

.field public final d:Lfk/a;

.field public final e:Lwe/o;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/Set;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Lmc3/a;

.field public final k:Lmc3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lnk/i;->l:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lnk/i;->m:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Laj/d;Lfk/a;Lwe/o;)V
    .locals 1

    const-string v0, "storageKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diagnostics"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk/i;->a:Ljava/io/File;

    iput-object p2, p0, Lnk/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lnk/i;->c:Laj/d;

    iput-object p4, p0, Lnk/i;->d:Lfk/a;

    iput-object p5, p0, Lnk/i;->e:Lwe/o;

    const-string p1, "amplitude.events.file.index."

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnk/i;->f:Ljava/lang/String;

    const-string p1, "amplitude.events.file.version."

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnk/i;->g:Ljava/lang/String;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    const-string p3, "newSetFromMap(ConcurrentHashMap())"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lnk/i;->h:Ljava/util/Set;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lnk/i;->i:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object p1, Lnk/i;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_1

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p3, p1

    :cond_1
    :goto_0
    check-cast p3, Lmc3/a;

    iput-object p3, p0, Lnk/i;->j:Lmc3/a;

    sget-object p1, Lnk/i;->m:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_3

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object p3, p1

    :cond_3
    :goto_1
    check-cast p3, Lmc3/a;

    iput-object p3, p0, Lnk/i;->k:Lmc3/a;

    invoke-virtual {p0}, Lnk/i;->e()Z

    new-instance p1, Landroidx/room/z1;

    const/16 p2, 0xb

    const/4 p3, 0x0

    invoke-direct {p1, p0, p3, p2}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1}, Lbc3/f0;->F(Lc93/m;)Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lnk/i;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lnk/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnk/d;

    iget v1, v0, Lnk/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnk/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnk/d;

    invoke-direct {v0, p0, p1}, Lnk/d;-><init>(Lnk/i;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lnk/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnk/d;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lnk/d;->x:Lmc3/a;

    iget-object v0, v0, Lnk/d;->w:Lnk/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, p0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lnk/i;->j:Lmc3/a;

    const-string v2, "writeMutex"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Lnk/d;->w:Lnk/i;

    iput-object p1, v0, Lnk/d;->x:Lmc3/a;

    iput v3, v0, Lnk/d;->E:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnk/i;->c:Laj/d;

    iget-object v2, p0, Lnk/i;->g:Ljava/lang/String;

    const-wide/16 v3, 0x1

    invoke-virtual {v1, v2, v3, v4}, Laj/d;->l(Ljava/lang/String;J)J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-lez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    iget-object v1, p0, Lnk/i;->a:Ljava/io/File;

    new-instance v2, Lnk/b;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lnk/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    new-array v1, v2, [Ljava/io/File;

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_6

    :cond_5
    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v1

    move v6, v2

    :goto_3
    if-ge v6, v5, :cond_7

    aget-object v7, v1, v6

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/io/File;

    const-string v5, "it"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v6, "charset"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/io/InputStreamReader;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v7, v5}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v6}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V

    const-string v6, "\u0000"

    invoke-static {v5, v6, v2}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v7, 0x5b

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-array v7, v3, [C

    fill-array-data v7, :array_0

    invoke-static {v5, v7}, Lyb3/r;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v5

    new-array v7, v3, [C

    fill-array-data v7, :array_1

    invoke-static {v5, v7}, Lyb3/r;->R0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5d

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lhg3/i;->r0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {p0, v6, v4, v2}, Lnk/i;->j(Ljava/util/List;Ljava/io/File;Z)V

    invoke-static {v4}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "tmp"

    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {p0, v4}, Lnk/i;->c(Ljava/io/File;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catch_0
    :try_start_4
    iget-object v6, p0, Lnk/i;->d:Lfk/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to parse events: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", dropping file: "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Lfk/a;->error(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "it.path"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lnk/i;->f(Ljava/lang/String;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_4

    :catchall_1
    move-exception p0

    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_6
    invoke-static {v6, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :cond_9
    iget-object v1, p0, Lnk/i;->c:Laj/d;

    iget-object p0, p0, Lnk/i;->g:Ljava/lang/String;

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3, p0}, Laj/d;->u(JLjava/lang/String;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_5
    invoke-interface {p1, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_6
    invoke-interface {p1, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0

    :array_0
    .array-data 2
        0x5bs
        0x2cs
    .end array-data

    :array_1
    .array-data 2
        0x5ds
        0x2cs
    .end array-data
.end method


# virtual methods
.method public final b()Ljava/io/File;
    .locals 8

    iget-object v0, p0, Lnk/i;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Lnk/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    iget-object v3, p0, Lnk/i;->a:Ljava/io/File;

    if-nez v2, :cond_1

    new-instance v2, Lnk/b;

    const/4 v4, 0x1

    invoke-direct {v2, p0, v4}, Lnk/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v2}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    new-array v2, v4, [Ljava/io/File;

    :cond_0
    invoke-static {v4, v2}, Lm83/n;->y0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :cond_1
    iget-object v4, p0, Lnk/i;->f:Ljava/lang/String;

    const-wide/16 v5, 0x0

    iget-object v7, p0, Lnk/i;->c:Laj/d;

    invoke-virtual {v7, v4, v5, v6}, Laj/d;->l(Ljava/lang/String;J)J

    move-result-wide v4

    if-nez v2, :cond_2

    new-instance v2, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x2d

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".tmp"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/File;

    return-object v0
.end method

.method public final c(Ljava/io/File;)V
    .locals 5

    invoke-virtual {p0, p1}, Lnk/i;->g(Ljava/io/File;)V

    const-wide/16 v0, 0x0

    iget-object p1, p0, Lnk/i;->c:Laj/d;

    iget-object v2, p0, Lnk/i;->f:Ljava/lang/String;

    invoke-virtual {p1, v2, v0, v1}, Laj/d;->l(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    invoke-virtual {p1, v0, v1, v2}, Laj/d;->u(JLjava/lang/String;)Z

    iget-object p1, p0, Lnk/i;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, p0, Lnk/i;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 10

    const-string v0, "\u0000"

    const-string v1, "Failed to parse events: "

    const-string v2, "["

    instance-of v3, p2, Lnk/c;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lnk/c;

    iget v4, v3, Lnk/c;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lnk/c;->F:I

    goto :goto_0

    :cond_0
    new-instance v3, Lnk/c;

    invoke-direct {v3, p0, p2}, Lnk/c;-><init>(Lnk/i;Ls83/c;)V

    :goto_0
    iget-object p2, v3, Lnk/c;->z:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lnk/c;->F:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object p1, v3, Lnk/c;->y:Lmc3/a;

    iget-object v4, v3, Lnk/c;->x:Ljava/lang/String;

    iget-object v3, v3, Lnk/c;->w:Lnk/i;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p1

    move-object p1, v4

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "readMutex"

    iget-object v5, p0, Lnk/i;->k:Lmc3/a;

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v3, Lnk/c;->w:Lnk/i;

    iput-object p1, v3, Lnk/c;->x:Ljava/lang/String;

    iput-object v5, v3, Lnk/c;->y:Lmc3/a;

    iput v6, v3, Lnk/c;->F:I

    invoke-interface {v5, v3}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, p0

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v4, v3, Lnk/i;->h:Ljava/util/Set;

    invoke-interface {v4, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, ""

    if-eqz v6, :cond_4

    :try_start_1
    invoke-interface {v4, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_4
    invoke-interface {v4, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v6, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v8, Ljava/io/InputStreamReader;

    new-instance v9, Ljava/io/FileInputStream;

    invoke-direct {v9, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v8, v9, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v4, Ljava/io/BufferedReader;

    const/16 v6, 0x2000

    invoke-direct {v4, v8, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v4}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v6, v0, v8}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v6, v0, v1}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-lez v2, :cond_5

    :try_start_3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto/16 :goto_5

    :catch_0
    :try_start_4
    iget-object v2, v3, Lnk/i;->e:Lwe/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    if-nez v6, :cond_6

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v6}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v2, Lwe/o;->w:Ljava/lang/Object;

    :cond_6
    iget-object v2, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_7

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-object v2, v3, Lnk/i;->d:Lfk/a;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to parse event: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_9

    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_9
    const-string p1, "if (events.length() > 0)\u2026 \"\"\n                    }"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v7, v2, [C

    fill-array-data v7, :array_0

    invoke-static {v6, v7}, Lyb3/r;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v6

    new-array v2, v2, [C

    fill-array-data v2, :array_1

    invoke-static {v6, v2}, Lyb3/r;->R0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v6, "jsonArray.toString()"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-object v7, v2

    goto :goto_3

    :catch_1
    :try_start_6
    iget-object v2, v3, Lnk/i;->e:Lwe/o;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "event"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    if-nez v6, :cond_b

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v6}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v2, Lwe/o;->w:Ljava/lang/Object;

    :cond_b
    iget-object v2, v2, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_c

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    iget-object v2, v3, Lnk/i;->d:Lfk/a;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dropping file: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lfk/a;->error(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lnk/i;->f(Ljava/lang/String;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object v7, v0

    :goto_3
    :try_start_7
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_4
    invoke-interface {v5, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v7

    :goto_5
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_9
    invoke-static {v4, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_6
    invoke-interface {v5, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    nop

    :array_0
    .array-data 2
        0x5bs
        0x2cs
    .end array-data

    :array_1
    .array-data 2
        0x5ds
        0x2cs
    .end array-data
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lnk/i;->a:Ljava/io/File;

    :try_start_0
    invoke-static {v0}, Landroidx/room/c1;->n(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to create directory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnk/i;->e:Lwe/o;

    invoke-virtual {v2, v1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to create directory for events storage: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnk/i;->d:Lfk/a;

    invoke-interface {v1, v0}, Lfk/a;->error(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final f(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnk/i;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result p1

    return p1
.end method

.method public final g(Ljava/io/File;)V
    .locals 5

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lx83/j;->n(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lnk/i;->a:Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "File already exists: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", handle gracefully."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lnk/i;->d:Lfk/a;

    invoke-interface {v3, v1}, Lfk/a;->debug(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    return-void

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lx83/j;->n(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final h(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lnk/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lnk/f;

    iget v1, v0, Lnk/f;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnk/f;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnk/f;

    invoke-direct {v0, p0, p1}, Lnk/f;-><init>(Lnk/i;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lnk/f;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnk/f;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lnk/f;->x:Lmc3/a;

    iget-object v0, v0, Lnk/f;->w:Lnk/i;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p1, "writeMutex"

    iget-object v2, p0, Lnk/i;->j:Lmc3/a;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Lnk/f;->w:Lnk/i;

    iput-object v2, v0, Lnk/f;->x:Lmc3/a;

    iput v3, v0, Lnk/f;->E:I

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, v2

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {v0}, Lnk/i;->b()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_4

    invoke-virtual {v0, v2}, Lnk/i;->c(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {v1, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0
.end method

.method public final i(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lnk/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnk/g;

    iget v1, v0, Lnk/g;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnk/g;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnk/g;

    invoke-direct {v0, p0, p2}, Lnk/g;-><init>(Lnk/i;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lnk/g;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnk/g;->F:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnk/g;->y:Lmc3/a;

    iget-object v1, v0, Lnk/g;->x:Ljava/lang/String;

    iget-object v0, v0, Lnk/g;->w:Lnk/i;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "writeMutex"

    iget-object v2, p0, Lnk/i;->j:Lmc3/a;

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v0, Lnk/g;->w:Lnk/i;

    iput-object p1, v0, Lnk/g;->x:Ljava/lang/String;

    iput-object v2, v0, Lnk/g;->y:Lmc3/a;

    iput v3, v0, Lnk/g;->F:I

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {v0}, Lnk/i;->e()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v4, v0, Lnk/i;->d:Lfk/a;

    iget-object v5, v0, Lnk/i;->e:Lwe/o;

    if-nez v1, :cond_4

    goto/16 :goto_3

    :cond_4
    :try_start_1
    invoke-virtual {v0}, Lnk/i;->b()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v7, "Failed to create new storage file: "

    if-nez v6, :cond_5

    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception p1

    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v8

    const-wide/32 v10, 0xee098

    cmp-long v6, v8, v10

    if-lez v6, :cond_6

    invoke-virtual {v0, v1}, Lnk/i;->c(Ljava/io/File;)V

    invoke-virtual {v0}, Lnk/i;->b()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v6, :cond_5

    :try_start_4
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catch_1
    move-exception p1

    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v4, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u0000"

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static {p1, v5, v6, v7}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v4, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v4, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1, v3}, Lnk/i;->k([BLjava/io/File;Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    invoke-interface {v2, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_4
    invoke-interface {v2, p2}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final j(Ljava/util/List;Ljava/io/File;Z)V
    .locals 9

    iget-object v1, p0, Lnk/i;->d:Lfk/a;

    iget-object v2, p0, Lnk/i;->e:Lwe/o;

    :try_start_0
    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    const-string v4, "\u0000"

    const-string v6, "\u0000"

    sget-object v7, Lnk/h;->w:Lnk/h;

    const/16 v8, 0x1a

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lnk/i;->k([BLjava/io/File;Z)V

    invoke-virtual {p0, p2}, Lnk/i;->g(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to write to split file: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " for error: "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Failed to create or write to split file: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final k([BLjava/io/File;Z)V
    .locals 5

    const-string v0, "Failed to write to file: "

    iget-object v1, p0, Lnk/i;->d:Lfk/a;

    const-string v2, "Error writing to file: "

    iget-object v3, p0, Lnk/i;->e:Lwe/o;

    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, p2, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v4, p1}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p3

    :try_start_4
    invoke-static {v4, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_4

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Security exception when saving event: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_4

    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lwe/o;->g(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "File not found: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lfk/a;->error(Ljava/lang/String;)V

    :goto_4
    return-void
.end method
