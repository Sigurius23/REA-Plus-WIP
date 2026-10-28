.class public final Ldp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lkr/e;

.field public static c:Ljava/lang/Boolean; = null

.field public static d:Ljava/lang/String; = null

.field public static e:Z = false

.field public static f:I = -0x1

.field public static g:Ljava/lang/Boolean;

.field public static final h:Ljava/lang/ThreadLocal;

.field public static final i:Lat/b;

.field public static final j:Lu00/e;

.field public static k:Ldp/g;

.field public static l:Ldp/h;


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ldp/b;->h:Ljava/lang/ThreadLocal;

    new-instance v0, Lat/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lat/b;-><init>(I)V

    sput-object v0, Ldp/b;->i:Lat/b;

    new-instance v0, Lu00/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    sput-object v0, Ldp/b;->j:Lu00/e;

    new-instance v0, Lkr/e;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    sput-object v0, Ldp/b;->b:Lkr/e;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp/b;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 9

    const-string v0, "DynamiteModule"

    const-string v1, "\'"

    const-string v2, "\' didn\'t match expected id \'"

    const-string v3, "Module descriptor id \'"

    const-string v4, ".ModuleDescriptor"

    const-string v5, "com.google.android.gms.dynamite.descriptors."

    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x3d

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const-string v4, "MODULE_ID"

    invoke-virtual {p0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const-string v5, "MODULE_VERSION"

    invoke-virtual {p0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, p1}, Luo/w;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x32

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v6

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Failed to load module descriptor class: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 p0, p0, 0x2d

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p0, "Local module descriptor class for "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return v6
.end method

.method public static c(Landroid/content/Context;Lkr/e;Ljava/lang/String;)Ldp/b;
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, " and remote module "

    const-string v4, ":"

    const-string v5, "Considering local module "

    const-string v6, "VersionPolicy returned invalid code:"

    const-string v7, "."

    const-string v8, " and remote version is "

    const-string v9, " found. Local version is "

    const-string v10, "No acceptable module "

    const-string v11, "Failed to load remote module: "

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    if-eqz v12, :cond_19

    sget-object v13, Ldp/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v13}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ldp/f;

    new-instance v15, Ldp/f;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v13, v15}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    move-object/from16 v16, v7

    sget-object v7, Ldp/b;->i:Lat/b;

    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v18, v8

    move-object/from16 v8, v17

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v19

    const-wide/16 v21, 0x0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v23

    move-object/from16 v17, v9

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    sget-object v9, Ldp/b;->j:Lu00/e;

    invoke-virtual {v2, v1, v3, v9}, Lkr/e;->o(Landroid/content/Context;Ljava/lang/String;Ldp/a;)Lcr/p;

    move-result-object v9

    move-object/from16 v23, v10

    const-string v10, "DynamiteModule"

    move-object/from16 v24, v6

    iget v6, v9, Lcr/p;->a:I

    iget v2, v9, Lcr/p;->b:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v25

    add-int/lit8 v25, v25, 0x1a

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v26

    add-int v25, v25, v26

    add-int/lit8 v25, v25, 0x13

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v26

    add-int v25, v25, v26

    move-object/from16 v26, v11

    const/4 v11, 0x1

    add-int/lit8 v25, v25, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->length()I

    move-result v27

    add-int v11, v25, v27

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, v9, Lcr/p;->c:I

    if-eqz v0, :cond_16

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, v9, Lcr/p;->a:I

    if-eqz v0, :cond_16

    move v0, v1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :goto_0
    if-ne v0, v2, :cond_1

    iget v2, v9, Lcr/p;->b:I

    if-eqz v2, :cond_16

    :cond_1
    if-ne v0, v1, :cond_4

    const-string v0, "Selected local version of "

    const-string v1, "DynamiteModule"

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ldp/b;

    invoke-direct {v0, v12}, Ldp/b;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v1, v19, v21

    if-nez v1, :cond_2

    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_1

    :cond_2
    invoke-virtual {v7, v8}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_1
    iget-object v1, v15, Ldp/f;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    invoke-virtual {v13, v14}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    const/4 v2, 0x1

    if-ne v0, v2, :cond_15

    :try_start_1
    iget v0, v9, Lcr/p;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    const-class v2, Ldp/b;

    monitor-enter v2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static/range {p0 .. p0}, Ldp/b;->d(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_11

    sget-object v4, Ldp/b;->c:Ljava/lang/Boolean;

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    if-eqz v4, :cond_10

    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x2

    if-eqz v2, :cond_a

    const-string v2, "DynamiteModule"

    const-string v5, "Selected remote version of "

    const-string v6, ", version >= "

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x28

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v7, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-class v2, Ldp/b;

    monitor-enter v2
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    sget-object v5, Ldp/b;->l:Ldp/h;

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz v5, :cond_9

    :try_start_6
    invoke-virtual {v13}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldp/f;

    if-eqz v2, :cond_8

    iget-object v6, v2, Ldp/f;->a:Landroid/database/Cursor;

    if-eqz v6, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    iget-object v2, v2, Ldp/f;->a:Landroid/database/Cursor;

    const/4 v7, 0x0

    invoke-static {v7}, Lcp/b;->j0(Ljava/lang/Object;)Lcp/b;

    const-class v7, Ldp/b;

    monitor-enter v7
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    sget v10, Ldp/b;->f:I

    if-lt v10, v4, :cond_5

    const/4 v11, 0x1

    goto :goto_2

    :cond_5
    const/4 v11, 0x0

    :goto_2
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v11, :cond_6

    :try_start_8
    const-string v4, "DynamiteModule"

    const-string v7, "Dynamite loader version >= 2, using loadModule2NoCrashUtils"

    invoke-static {v4, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Lcp/b;

    invoke-direct {v4, v6}, Lcp/b;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcp/b;

    invoke-direct {v6, v2}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v3, v0, v6}, Ldp/h;->n0(Lcp/b;Ljava/lang/String;ILcp/b;)Lcp/a;

    move-result-object v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object/from16 v7, p0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object/from16 v7, p0

    goto/16 :goto_7

    :catch_1
    move-exception v0

    move-object/from16 v7, p0

    goto/16 :goto_8

    :cond_6
    const-string v4, "DynamiteModule"

    const-string v7, "Dynamite loader version < 2, falling back to loadModule2"

    invoke-static {v4, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Lcp/b;

    invoke-direct {v4, v6}, Lcp/b;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcp/b;

    invoke-direct {v6, v2}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v3, v0, v6}, Ldp/h;->m0(Lcp/b;Ljava/lang/String;ILcp/b;)Lcp/a;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_7

    new-instance v2, Ldp/b;

    invoke-direct {v2, v0}, Ldp/b;-><init>(Landroid/content/Context;)V

    goto/16 :goto_a

    :cond_7
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "Failed to get module context"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_2
    move-exception v0

    :try_start_9
    monitor-exit v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    throw v0

    :cond_8
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "No result cursor"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "DynamiteLoaderV2 was not cached."

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_3
    move-exception v0

    :try_start_b
    monitor-exit v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v0

    :cond_a
    const-string v2, "DynamiteModule"

    const-string v5, "Selected remote version of "

    const-string v6, ", version >= "

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    add-int/lit8 v7, v7, 0x28

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v7, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static/range {p0 .. p0}, Ldp/b;->g(Landroid/content/Context;)Ldp/g;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v5

    const/4 v6, 0x6

    invoke-virtual {v2, v5, v6}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    move-result v6

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    const/4 v5, 0x3

    if-lt v6, v5, :cond_c

    invoke-virtual {v13}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldp/f;

    if-eqz v4, :cond_b

    new-instance v5, Lcp/b;
    :try_end_c
    .catch Landroid/os/RemoteException; {:try_start_c .. :try_end_c} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    move-object/from16 v7, p0

    :try_start_d
    invoke-direct {v5, v7}, Lcp/b;-><init>(Ljava/lang/Object;)V

    iget-object v4, v4, Ldp/f;->a:Landroid/database/Cursor;

    new-instance v6, Lcp/b;

    invoke-direct {v6, v4}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v5, v3, v0, v6}, Ldp/g;->p0(Lcp/b;Ljava/lang/String;ILcp/b;)Lcp/a;

    move-result-object v0

    goto :goto_4

    :catchall_4
    move-exception v0

    goto/16 :goto_6

    :catch_2
    move-exception v0

    goto/16 :goto_7

    :catch_3
    move-exception v0

    goto/16 :goto_8

    :cond_b
    move-object/from16 v7, p0

    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "No cached result cursor holder"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    move-object/from16 v7, p0

    if-ne v6, v4, :cond_d

    const-string v4, "DynamiteModule"

    const-string v5, "IDynamite loader version = 2"

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Lcp/b;

    invoke-direct {v4, v7}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v3, v0}, Ldp/g;->n0(Lcp/b;Ljava/lang/String;I)Lcp/a;

    move-result-object v0

    goto :goto_4

    :cond_d
    const-string v4, "DynamiteModule"

    const-string v5, "Dynamite loader version < 2, falling back to createModuleContext"

    invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Lcp/b;

    invoke-direct {v4, v7}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v3, v0}, Ldp/g;->m0(Lcp/b;Ljava/lang/String;I)Lcp/a;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v2, Ldp/b;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0}, Ldp/b;-><init>(Landroid/content/Context;)V

    goto/16 :goto_a

    :cond_e
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "Failed to load remote module."

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 v7, p0

    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "Failed to create IDynamiteLoader."

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    move-object/from16 v7, p0

    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "Failed to determine which loading route to use."

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catch Landroid/os/RemoteException; {:try_start_d .. :try_end_d} :catch_3
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_d .. :try_end_d} :catch_2
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_5
    move-exception v0

    move-object/from16 v7, p0

    goto :goto_5

    :cond_11
    move-object/from16 v7, p0

    :try_start_e
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v4, "Remote loading disabled"

    invoke-direct {v0, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_6
    move-exception v0

    :goto_5
    monitor-exit v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :try_start_f
    throw v0
    :try_end_f
    .catch Landroid/os/RemoteException; {:try_start_f .. :try_end_f} :catch_3
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_f .. :try_end_f} :catch_2
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :goto_6
    :try_start_10
    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v4, "Failed to load remote module."

    invoke-direct {v2, v4, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_4
    move-exception v0

    goto :goto_9

    :goto_7
    throw v0

    :goto_8
    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v4, "Failed to load remote module."

    invoke-direct {v2, v4, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_10
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catch_5
    move-exception v0

    move-object/from16 v7, p0

    :goto_9
    :try_start_11
    const-string v2, "DynamiteModule"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x1e

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object/from16 v5, v26

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget v2, v9, Lcr/p;->a:I

    if-eqz v2, :cond_14

    new-instance v4, Ld0/o2;

    const/4 v5, 0x1

    invoke-direct {v4, v2, v5}, Ld0/o2;-><init>(II)V

    move-object/from16 v2, p1

    invoke-virtual {v2, v7, v3, v4}, Lkr/e;->o(Landroid/content/Context;Ljava/lang/String;Ldp/a;)Lcr/p;

    move-result-object v2

    iget v2, v2, Lcr/p;->c:I

    if-ne v2, v1, :cond_14

    const-string v0, "Selected local version of "

    const-string v1, "DynamiteModule"

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ldp/b;

    invoke-direct {v2, v12}, Ldp/b;-><init>(Landroid/content/Context;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :goto_a
    cmp-long v0, v19, v21

    if-nez v0, :cond_12

    sget-object v0, Ldp/b;->i:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_b

    :cond_12
    sget-object v0, Ldp/b;->i:Lat/b;

    invoke-virtual {v0, v8}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_b
    iget-object v0, v15, Ldp/f;->a:Landroid/database/Cursor;

    if-eqz v0, :cond_13

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_13
    sget-object v0, Ldp/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v14}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v2

    :cond_14
    :try_start_12
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v2, "Remote load failed. No local fallback found."

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_15
    new-instance v1, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x24

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object/from16 v2, v24

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    iget v1, v9, Lcr/p;->a:I

    iget v2, v9, Lcr/p;->b:I

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2e

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x17

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v28, 0x1

    add-int/lit8 v4, v4, 0x1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object/from16 v4, v23

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v17

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :goto_c
    cmp-long v1, v19, v21

    if-nez v1, :cond_17

    sget-object v1, Ldp/b;->i:Lat/b;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_d

    :cond_17
    sget-object v1, Ldp/b;->i:Lat/b;

    invoke-virtual {v1, v8}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_d
    iget-object v1, v15, Ldp/f;->a:Landroid/database/Cursor;

    if-eqz v1, :cond_18

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_18
    sget-object v1, Ldp/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v14}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    throw v0

    :cond_19
    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v1, "null application Context"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 6

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ldp/b;->g:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return v2

    :cond_1
    sget-object v0, Ldp/b;->g:Ljava/lang/Boolean;

    const-string v1, "DynamiteModule"

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v4, v5, :cond_2

    const/high16 v4, 0x10000000

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    const-string v5, "com.google.android.gms.chimera"

    invoke-virtual {v0, v5, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/common/d;->getInstance()Lcom/google/android/gms/common/d;

    move-result-object v4

    const v5, 0x989680

    invoke-virtual {v4, p0, v5}, Lcom/google/android/gms/common/d;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result p0

    if-nez p0, :cond_3

    if-eqz v0, :cond_3

    const-string p0, "com.google.android.gms"

    iget-object v4, v0, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    move v3, v2

    :cond_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    sput-object p0, Ldp/b;->g:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    iget-object p0, v0, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p0, :cond_4

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 p0, p0, 0x81

    if-nez p0, :cond_4

    const-string p0, "Non-system-image GmsCore APK, forcing V1"

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sput-boolean v2, Ldp/b;->e:Z

    :cond_4
    if-nez v3, :cond_5

    const-string p0, "Invalid GmsCore APK, remote loading disabled."

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    return v3
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;ZZ)I
    .locals 14

    const-string v1, "V2 version check failed: "

    const/4 v2, 0x0

    :try_start_0
    sget-object v0, Ldp/b;->i:Lat/b;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-string v0, "api_force_staging"

    const-string v5, "api"

    const/4 v6, 0x1

    move/from16 v7, p2

    if-eq v6, v7, :cond_0

    move-object v0, v5

    :cond_0
    new-instance v5, Landroid/net/Uri$Builder;

    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    const-string v7, "content"

    invoke-virtual {v5, v7}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v7, "com.google.android.gms.chimera"

    invoke-virtual {v5, v7}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v5, "requestStartUptime"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, v8}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 p0, 0x2

    const/4 v3, 0x0

    if-nez v7, :cond_1

    :goto_0
    move-object v8, v2

    goto/16 :goto_7

    :cond_1
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :try_start_1
    invoke-virtual/range {v7 .. v12}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_2

    :catch_0
    :try_start_2
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    goto :goto_0

    :cond_2
    :try_start_3
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v0

    invoke-interface {v4}, Landroid/database/Cursor;->getColumnCount()I

    move-result v5

    new-instance v8, Landroid/database/MatrixCursor;

    invoke-interface {v4}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;I)V

    move v9, v3

    :goto_1
    if-ge v9, v0, :cond_a

    invoke-interface {v4, v9}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v10

    if-eqz v10, :cond_9

    new-array v10, v5, [Ljava/lang/Object;

    move v11, v3

    :goto_2
    if-ge v11, v5, :cond_8

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getType(I)I

    move-result v12

    if-eqz v12, :cond_7

    if-eq v12, v6, :cond_6

    if-eq v12, p0, :cond_5

    const/4 v13, 0x3

    if-eq v12, v13, :cond_4

    const/4 v13, 0x4

    if-ne v12, v13, :cond_3

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v12

    aput-object v12, v10, v11

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_4

    :cond_3
    new-instance v0, Landroid/os/RemoteException;

    const-string v5, "Unknown column type"

    invoke-direct {v0, v5}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v10, v11

    goto :goto_3

    :cond_5
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    aput-object v12, v10, v11

    goto :goto_3

    :cond_6
    invoke-interface {v4, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    aput-object v12, v10, v11

    goto :goto_3

    :cond_7
    aput-object v2, v10, v11

    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v8, v10}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_9
    new-instance v0, Landroid/os/RemoteException;

    const-string v5, "Cursor read incomplete (ContentProvider dead?)"

    invoke-direct {v0, v5}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_a
    :try_start_4
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object p0, v0

    goto :goto_6

    :goto_4
    :try_start_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_7
    invoke-virtual {v5, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v5
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_6
    :try_start_8
    invoke-virtual {v7}, Landroid/content/ContentProviderClient;->release()Z

    throw p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :goto_7
    if-eqz v8, :cond_13

    :try_start_9
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-lez v0, :cond_f

    const-class v4, Ldp/b;

    monitor-enter v4
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    invoke-interface {v8, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Ldp/b;->d:Ljava/lang/String;

    const-string p0, "loaderVersion"

    invoke-interface {v8, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_b

    invoke-interface {v8, p0}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    sput p0, Ldp/b;->f:I

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object p0, v0

    goto :goto_c

    :cond_b
    :goto_8
    const-string p0, "disableStandaloneDynamiteLoader2"

    invoke-interface {v8, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p0

    if-ltz p0, :cond_d

    invoke-interface {v8, p0}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    if-eqz p0, :cond_c

    move p0, v6

    goto :goto_9

    :cond_c
    move p0, v3

    :goto_9
    sput-boolean p0, Ldp/b;->e:Z

    goto :goto_a

    :cond_d
    move p0, v3

    :goto_a
    monitor-exit v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    sget-object v4, Ldp/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldp/f;

    if-eqz v4, :cond_e

    iget-object v5, v4, Ldp/f;->a:Landroid/database/Cursor;

    if-nez v5, :cond_e

    iput-object v8, v4, Ldp/f;->a:Landroid/database/Cursor;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_b

    :cond_e
    move v6, v3

    :goto_b
    move v3, p0

    if-eqz v6, :cond_f

    goto :goto_d

    :cond_f
    move-object v2, v8

    goto :goto_d

    :goto_c
    :try_start_c
    monitor-exit v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    throw p0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    move-object p0, v0

    goto :goto_f

    :catch_1
    move-exception v0

    move-object p0, v0

    goto :goto_10

    :goto_d
    if-eqz p3, :cond_11

    if-nez v3, :cond_10

    goto :goto_e

    :cond_10
    :try_start_e
    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v0, "forcing fallback to container DynamiteLoader impl"

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    :catchall_5
    move-exception v0

    move-object p0, v0

    goto :goto_12

    :catch_2
    move-exception v0

    move-object p0, v0

    goto :goto_11

    :cond_11
    :goto_e
    if-eqz v2, :cond_12

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_12
    return v0

    :cond_13
    :try_start_f
    const-string p0, "DynamiteModule"

    const-string v0, "Failed to retrieve remote module version."

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v0, "Failed to connect to dynamite module ContentResolver."

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :goto_f
    move-object v2, v8

    goto :goto_12

    :goto_10
    move-object v2, v8

    :goto_11
    :try_start_10
    instance-of v0, p0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    if-nez v0, :cond_14

    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x19

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_14
    throw p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :goto_12
    if-eqz v2, :cond_15

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_15
    throw p0
.end method

.method public static f(Ljava/lang/ClassLoader;)V
    .locals 3

    const-string v0, "com.google.android.gms.dynamite.IDynamiteLoaderV2"

    :try_start_0
    const-string v1, "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"

    invoke-virtual {p0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Ldp/h;

    if-eqz v2, :cond_1

    check-cast v1, Ldp/h;

    goto :goto_0

    :cond_1
    new-instance v1, Ldp/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, v2}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    :goto_0
    sput-object v1, Ldp/b;->l:Ldp/h;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v1, "Failed to instantiate dynamite loader"

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static g(Landroid/content/Context;)Ldp/g;
    .locals 6

    const-string v0, "Failed to load IDynamiteLoader from GmsCore: "

    const-class v1, Ldp/b;

    monitor-enter v1

    :try_start_0
    sget-object v2, Ldp/b;->k:Ldp/g;

    if-eqz v2, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    :try_start_1
    const-string v3, "com.google.android.gms"

    const/4 v4, 0x3

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v3, "com.google.android.gms.chimera.container.DynamiteLoaderImpl"

    invoke-virtual {p0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_1

    move-object v3, v2

    goto :goto_0

    :cond_1
    const-string v3, "com.google.android.gms.dynamite.IDynamiteLoader"

    invoke-interface {p0, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Ldp/g;

    if-eqz v4, :cond_2

    check-cast v3, Ldp/g;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_2
    new-instance v3, Ldp/g;

    const-string v4, "com.google.android.gms.dynamite.IDynamiteLoader"

    const/4 v5, 0x2

    invoke-direct {v3, p0, v4, v5}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    :goto_0
    if-eqz v3, :cond_3

    sput-object v3, Ldp/b;->k:Ldp/g;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v1

    return-object v3

    :goto_1
    const-string v3, "DynamiteModule"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2d

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    monitor-exit v1

    return-object v2

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public final b()Landroid/os/IBinder;
    .locals 4

    const-string v0, "com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl"

    :try_start_0
    iget-object v1, p0, Ldp/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IBinder;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    :goto_0
    new-instance v2, Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException;

    const-string v3, "Failed to instantiate module class: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
