.class public final Ldt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Ljava/lang/Object;

.field public static final k:La0/g;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ldt/i;

.field public final d:Lgt/g;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Lgt/l;

.field public final h:Lst/a;

.field public final i:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ldt/g;->j:Ljava/lang/Object;

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    sput-object v0, Ldt/g;->k:La0/g;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ldt/i;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ldt/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ldt/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ldt/g;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Ldt/g;->a:Landroid/content/Context;

    invoke-static {p2}, Luo/w;->d(Ljava/lang/String;)V

    iput-object p2, p0, Ldt/g;->b:Ljava/lang/String;

    iput-object p3, p0, Ldt/g;->c:Ldt/i;

    sget-object p2, Lcu/a;->w:Ldt/a;

    const-string v0, "Firebase"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const-string v0, "ComponentDiscovery"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const-class v2, Lcom/google/firebase/components/ComponentDiscoveryService;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v2, "Context has no PackageManager."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance v6, Landroid/content/ComponentName;

    invoke-direct {v6, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v7, 0x80

    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no service info."

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v4, v5, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v2, "Application info not found."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    if-nez v4, :cond_2

    const-string v2, "Could not retrieve metadata, returning empty list of registrars."

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "com.google.firebase.components.ComponentRegistrar"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v6, "com.google.firebase.components:"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x1f

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v4, Lgt/d;

    invoke-direct {v4, v2, v1}, Lgt/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "Runtime"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    sget-object v0, Lht/k;->w:Lht/k;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v3, Lcom/google/firebase/FirebaseCommonRegistrar;

    invoke-direct {v3}, Lcom/google/firebase/FirebaseCommonRegistrar;-><init>()V

    new-instance v4, Lgt/d;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Lgt/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/google/firebase/concurrent/ExecutorsRegistrar;

    invoke-direct {v3}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;-><init>()V

    new-instance v4, Lgt/d;

    invoke-direct {v4, v3, v5}, Lgt/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v3, Landroid/content/Context;

    new-array v4, v1, [Ljava/lang/Class;

    invoke-static {p1, v3, v4}, Lgt/b;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lgt/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v3, Ldt/g;

    new-array v4, v1, [Ljava/lang/Class;

    invoke-static {p0, v3, v4}, Lgt/b;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lgt/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v3, Ldt/i;

    new-array v4, v1, [Ljava/lang/Class;

    invoke-static {p3, v3, v4}, Lgt/b;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lgt/b;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p3, Lqt/e;

    const/16 v3, 0xf

    invoke-direct {p3, v3}, Lqt/e;-><init>(I)V

    invoke-static {p1}, Lge3/g;->G(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lcu/a;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_6

    const-class v3, Ldt/a;

    new-array v4, v1, [Ljava/lang/Class;

    invoke-static {p2, v3, v4}, Lgt/b;->b(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lgt/b;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    new-instance p2, Lgt/g;

    invoke-direct {p2, v0, v2, p3}, Lgt/g;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Lqt/e;)V

    iput-object p2, p0, Ldt/g;->d:Lgt/g;

    invoke-static {}, Landroid/os/Trace;->endSection()V

    new-instance p3, Lgt/l;

    new-instance v0, Ldt/c;

    invoke-direct {v0, v1, p0, p1}, Ldt/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p3, v0}, Lgt/l;-><init>(Lst/a;)V

    iput-object p3, p0, Ldt/g;->g:Lgt/l;

    const-class p1, Lqt/d;

    invoke-interface {p2, p1}, Lgt/c;->e(Ljava/lang/Class;)Lst/a;

    move-result-object p1

    iput-object p1, p0, Ldt/g;->h:Lst/a;

    new-instance p1, Ldt/d;

    invoke-direct {p1, p0}, Ldt/d;-><init>(Ldt/g;)V

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object p2, p0, Ldt/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Lto/c;->E:Lto/c;

    iget-object p2, p2, Lto/c;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    :cond_7
    iget-object p2, p0, Ldt/g;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void
.end method

.method public static b()Ldt/g;
    .locals 4

    const-string v0, "Default FirebaseApp is not initialized in this process "

    sget-object v1, Ldt/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Ldt/g;->k:La0/g;

    const-string v3, "[DEFAULT]"

    invoke-virtual {v2, v3}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldt/g;

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v0, Lzo/b;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/app/Application;->getProcessName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lzo/b;->f:Ljava/lang/String;

    :cond_0
    sget-object v0, Lzo/b;->f:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, v2, Ldt/g;->h:Lst/a;

    invoke-interface {v0}, Lst/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqt/d;

    invoke-virtual {v0}, Lqt/d;->b()V

    monitor-exit v1

    return-object v2

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static e(Landroid/content/Context;Ldt/i;)Ldt/g;
    .locals 6

    const-string v0, "[DEFAULT]"

    sget-object v1, Ldt/e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Landroid/app/Application;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    sget-object v2, Ldt/e;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance v3, Ldt/e;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v1}, Lto/c;->a(Landroid/app/Application;)V

    sget-object v4, Lto/c;->E:Lto/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v4

    :try_start_0
    iget-object v1, v4, Lto/c;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_1
    sget-object v1, Ldt/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    sget-object v2, Ldt/g;->k:La0/g;

    invoke-virtual {v2, v0}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "FirebaseApp name "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " already exists!"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Luo/w;->h(Ljava/lang/String;Z)V

    const-string v3, "Application context cannot be null."

    invoke-static {p0, v3}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ldt/g;

    invoke-direct {v3, p0, v0, p1}, Ldt/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ldt/i;)V

    invoke-virtual {v2, v0, v3}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v3}, Ldt/g;->d()V

    return-object v3

    :catchall_1
    move-exception p0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ldt/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v1, v0}, Luo/w;->h(Ljava/lang/String;Z)V

    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v1, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v1, p0, Ldt/g;->c:Ldt/i;

    iget-object v1, v1, Ldt/i;->b:Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lzo/b;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 5

    iget-object v0, p0, Ldt/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lge3/g;->G(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "FirebaseApp"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v2, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ldt/g;->a:Landroid/content/Context;

    invoke-static {v0}, Ldt/f;->a(Landroid/content/Context;)V

    return-void

    :cond_0
    const-string v0, "FirebaseApp"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Device unlocked: initializing all Firebase APIs for app "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v2, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ldt/g;->d:Lgt/g;

    const-string v1, "[DEFAULT]"

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v2, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lgt/g;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :cond_1
    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    monitor-enter v0

    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    iget-object v3, v0, Lgt/g;->a:Ljava/util/HashMap;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v2}, Lgt/g;->b(ZLjava/util/HashMap;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    :goto_0
    iget-object v0, p0, Ldt/g;->h:Lst/a;

    invoke-interface {v0}, Lst/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqt/d;

    invoke-virtual {v0}, Lqt/d;->b()V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ldt/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ldt/g;

    invoke-virtual {p1}, Ldt/g;->a()V

    iget-object p1, p1, Ldt/g;->b:Ljava/lang/String;

    iget-object v0, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lpg3/p;

    invoke-direct {v0, p0}, Lpg3/p;-><init>(Ljava/lang/Object;)V

    const-string v1, "name"

    iget-object v2, p0, Ldt/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "options"

    iget-object v2, p0, Ldt/g;->c:Ldt/i;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
