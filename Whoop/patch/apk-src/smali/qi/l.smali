.class public abstract Lqi/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashSet;

.field public static final c:[B

.field public static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lqi/l;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lqi/l;->b:Ljava/util/HashSet;

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lqi/l;->c:[B

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lqi/l;->d:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x50t
        0x4bt
        0x3t
        0x4t
    .end array-data

    :array_1
    .array-data 1
        0x1ft
        -0x75t
        0x8t
    .end array-data
.end method

.method public static a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lwi/g;->b:Lwi/g;

    invoke-virtual {v1, p0}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    new-instance v0, Lqi/d0;

    invoke-direct {v0, v1}, Lqi/d0;-><init>(Lqi/i;)V

    :cond_1
    sget-object v1, Lqi/l;->a:Ljava/util/HashMap;

    if-eqz p0, :cond_2

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi/d0;

    :cond_2
    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-object v0

    :cond_4
    new-instance p2, Lqi/d0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lqi/d0;-><init>(Ljava/util/concurrent/Callable;Z)V

    if-eqz p0, :cond_5

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Lqi/j;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lqi/j;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-virtual {p2, v0}, Lqi/d0;->b(Lqi/z;)V

    new-instance v0, Lqi/j;

    const/4 v2, 0x1

    invoke-direct {v0, p0, p1, v2}, Lqi/j;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-virtual {p2, v0}, Lqi/d0;->a(Lqi/z;)V

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1, p0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_5

    invoke-static {}, Lqi/l;->k()V

    :cond_5
    return-object p2
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;
    .locals 1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lwi/g;->b:Lwi/g;

    invoke-virtual {v0, p2}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance p0, Lqi/b0;

    invoke-direct {p0, v0}, Lqi/b0;-><init>(Lqi/i;)V

    return-object p0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p0, p2, p1}, Lqi/l;->c(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Lqi/b0;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lqi/b0;

    invoke-direct {p1, p0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;)Lqi/b0;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lwi/g;->b:Lwi/g;

    invoke-virtual {v0, p1}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance p0, Lqi/b0;

    invoke-direct {p0, v0}, Lqi/b0;-><init>(Lqi/i;)V

    return-object p0

    :cond_1
    :try_start_0
    invoke-static {p2}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p2

    invoke-static {p2}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p2

    sget-object v0, Lqi/l;->c:[B

    invoke-static {p2, v0}, Lqi/l;->j(Lne3/j0;[B)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v1, Lne3/i0;

    invoke-direct {v1, p2}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0, v0, p1}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lqi/l;->d:[B

    invoke-static {p2, p0}, Lqi/l;->j(Lne3/j0;[B)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_3

    new-instance p0, Ljava/util/zip/GZIPInputStream;

    new-instance v0, Lne3/i0;

    invoke-direct {v0, p2}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {p0, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p0

    invoke-static {p0, p1}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lcj/c;->E:[Ljava/lang/String;

    new-instance p0, Lcj/d;

    invoke-direct {p0, p2}, Lcj/d;-><init>(Lne3/j0;)V

    const/4 p2, 0x1

    invoke-static {p0, p1, p2}, Lqi/l;->d(Lcj/d;Ljava/lang/String;Z)Lqi/b0;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lqi/b0;

    invoke-direct {p1, p0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method

.method public static d(Lcj/d;Ljava/lang/String;Z)Lqi/b0;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    :try_start_0
    sget-object v0, Lwi/g;->b:Lwi/g;

    invoke-virtual {v0, p1}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    new-instance p1, Lqi/b0;

    invoke-direct {p1, v0}, Lqi/b0;-><init>(Lqi/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_1

    invoke-static {p0}, Ldj/i;->b(Ljava/io/Closeable;)V

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-static {p0}, Lbj/s;->a(Lcj/d;)Lqi/i;

    move-result-object v0

    if-eqz p1, :cond_3

    sget-object v1, Lwi/g;->b:Lwi/g;

    iget-object v1, v1, Lwi/g;->a:La0/a0;

    invoke-virtual {v1, p1, v0}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    new-instance p1, Lqi/b0;

    invoke-direct {p1, v0}, Lqi/b0;-><init>(Lqi/i;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    invoke-static {p0}, Ldj/i;->b(Ljava/io/Closeable;)V

    :cond_4
    return-object p1

    :goto_1
    :try_start_2
    new-instance v0, Lqi/b0;

    invoke-direct {v0, p1}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p2, :cond_5

    invoke-static {p0}, Ldj/i;->b(Ljava/io/Closeable;)V

    :cond_5
    return-object v0

    :goto_2
    if-eqz p2, :cond_6

    invoke-static {p0}, Ldj/i;->b(Ljava/io/Closeable;)V

    :cond_6
    throw p1
.end method

.method public static e(Lne3/y;Ljava/lang/String;)Lqi/b0;
    .locals 1

    invoke-static {p0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p0

    sget-object v0, Lcj/c;->E:[Ljava/lang/String;

    new-instance v0, Lcj/d;

    invoke-direct {v0, p0}, Lcj/d;-><init>(Lne3/j0;)V

    const/4 p0, 0x1

    invoke-static {v0, p1, p0}, Lqi/l;->d(Lcj/d;Ljava/lang/String;Z)Lqi/b0;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;ILjava/lang/String;)Lqi/d0;
    .locals 2

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v1, Lqi/k;

    invoke-direct {v1, v0, p0, p1, p2}, Lqi/k;-><init>(Ljava/lang/ref/WeakReference;Landroid/content/Context;ILjava/lang/String;)V

    const/4 p0, 0x0

    invoke-static {p2, v1, p0}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;ILjava/lang/String;)Lqi/b0;
    .locals 2

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lwi/g;->b:Lwi/g;

    invoke-virtual {v0, p2}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    new-instance p0, Lqi/b0;

    invoke-direct {p0, v0}, Lqi/b0;-><init>(Lqi/i;)V

    return-object p0

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p1

    invoke-static {p1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1

    sget-object v0, Lqi/l;->c:[B

    invoke-static {p1, v0}, Lqi/l;->j(Lne3/j0;[B)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v1, Lne3/i0;

    invoke-direct {v1, p1}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0, v0, p2}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lqi/l;->d:[B

    invoke-static {p1, p0}, Lqi/l;->j(Lne3/j0;[B)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p0, :cond_3

    :try_start_1
    new-instance p0, Ljava/util/zip/GZIPInputStream;

    new-instance v0, Lne3/i0;

    invoke-direct {v0, p1}, Lne3/i0;-><init>(Lne3/j0;)V

    invoke-direct {p0, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p0}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p0

    invoke-static {p0, p2}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-exception p0

    :try_start_2
    new-instance p1, Lqi/b0;

    invoke-direct {p1, p0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_3
    sget-object p0, Lcj/c;->E:[Ljava/lang/String;

    new-instance p0, Lcj/d;

    invoke-direct {p0, p1}, Lcj/d;-><init>(Lne3/j0;)V

    const/4 p1, 0x1

    invoke-static {p0, p2, p1}, Lqi/l;->d(Lcj/d;Ljava/lang/String;Z)Lqi/b0;

    move-result-object p0
    :try_end_2
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    new-instance p1, Lqi/b0;

    invoke-direct {p1, p0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method

.method public static h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;
    .locals 0

    :try_start_0
    invoke-static {p0, p1, p2}, Lqi/l;->i(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p1}, Ldj/i;->b(Ljava/io/Closeable;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p1}, Ldj/i;->b(Ljava/io/Closeable;)V

    throw p0
.end method

.method public static i(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;
    .locals 13

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    if-nez p2, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    :try_start_0
    sget-object v3, Lwi/g;->b:Lwi/g;

    invoke-virtual {v3, p2}, Lwi/g;->a(Ljava/lang/String;)Lqi/i;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_1

    new-instance p0, Lqi/b0;

    invoke-direct {p0, v3}, Lqi/b0;-><init>(Lqi/i;)V

    return-object p0

    :cond_1
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v3

    move-object v4, v2

    :goto_1
    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "__MACOSX"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    goto/16 :goto_b

    :cond_2
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "manifest.json"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    goto/16 :goto_b

    :cond_3
    invoke-virtual {v3}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v8, ".json"

    invoke-virtual {v3, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {p1}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object v3

    invoke-static {v3}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v3

    sget-object v4, Lcj/c;->E:[Ljava/lang/String;

    new-instance v4, Lcj/d;

    invoke-direct {v4, v3}, Lcj/d;-><init>(Lne3/j0;)V

    invoke-static {v4, v2, v6}, Lqi/l;->d(Lcj/d;Ljava/lang/String;Z)Lqi/b0;

    move-result-object v3

    iget-object v4, v3, Lqi/b0;->a:Lqi/i;

    goto/16 :goto_b

    :cond_4
    const-string v3, ".png"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v8, "/"

    if-nez v3, :cond_b

    :try_start_1
    const-string v3, ".webp"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    const-string v3, ".jpg"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    const-string v3, ".jpeg"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_a

    :cond_5
    const-string v3, ".ttf"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string v3, ".otf"

    invoke-virtual {v7, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    goto/16 :goto_b

    :cond_7
    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v7, v3

    sub-int/2addr v7, v5

    aget-object v3, v3, v7

    const-string v5, "\\."

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v6

    if-nez p0, :cond_8

    new-instance p0, Lqi/b0;

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to extract font "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " please pass a non-null Context parameter"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_8
    new-instance v7, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v9, Ljava/io/FileOutputStream;

    invoke-direct {v9, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v10, 0x1000

    :try_start_4
    new-array v10, v10, [B

    :goto_3
    invoke-virtual {p1, v10}, Ljava/io/InputStream;->read([B)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_9

    invoke-virtual {v9, v10, v6, v11}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_3

    :catchall_0
    move-exception v6

    goto :goto_4

    :cond_9
    invoke-virtual {v9}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v6

    goto :goto_8

    :catchall_2
    move-exception v6

    goto :goto_6

    :goto_4
    :try_start_7
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v9

    :try_start_8
    invoke-virtual {v6, v9}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_6
    :try_start_9
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v8

    :try_start_a
    invoke-virtual {v6, v8}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_8
    :try_start_b
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unable to save font "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " to the temporary file: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". "

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    invoke-static {v7}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;

    move-result-object v3

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    move-result v6

    if-nez v6, :cond_a

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Failed to delete temp font file "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ldj/c;->b(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v1, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_b
    :goto_a
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v6, v3

    sub-int/2addr v6, v5

    aget-object v3, v3, v6

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_b
    invoke-virtual {p1}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v3
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1

    goto/16 :goto_1

    :cond_c
    if-nez v4, :cond_d

    new-instance p0, Lqi/b0;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to parse composition"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :cond_d
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_e
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4}, Lqi/i;->c()Ljava/util/Map;

    move-result-object v7

    check-cast v7, Ljava/util/HashMap;

    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lqi/y;

    invoke-virtual {v8}, Lqi/y;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    goto :goto_d

    :cond_10
    move-object v8, v2

    :goto_d
    if-eqz v8, :cond_e

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Lqi/y;->e()I

    move-result v3

    invoke-virtual {v8}, Lqi/y;->c()I

    move-result v7

    invoke-static {p1, v3, v7}, Ldj/i;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v8, p1}, Lqi/y;->f(Landroid/graphics/Bitmap;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_12
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_15

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v1, v4, Lqi/i;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v3, v6

    :cond_13
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwi/c;

    invoke-virtual {v7}, Lwi/c;->a()Ljava/lang/String;

    move-result-object v8

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    invoke-virtual {v7, v3}, Lwi/c;->c(Landroid/graphics/Typeface;)V

    move v3, v5

    goto :goto_f

    :cond_14
    if-nez v3, :cond_12

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Parsed font for "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " however it was not found in the animation."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_18

    invoke-virtual {v4}, Lqi/i;->c()Ljava/util/Map;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_16
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqi/y;

    if-nez p1, :cond_17

    return-object v2

    :cond_17
    invoke-virtual {p1}, Lqi/y;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    const/16 v3, 0xa0

    iput v3, v1, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    const-string v3, "data:"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    const-string v3, "base64,"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    if-lez v3, :cond_16

    const/16 v3, 0x2c

    :try_start_c
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/2addr v3, v5

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c .. :try_end_c} :catch_0

    array-length v3, v0

    invoke-static {v0, v6, v3, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {p1}, Lqi/y;->e()I

    move-result v1

    invoke-virtual {p1}, Lqi/y;->c()I

    move-result v3

    invoke-static {v0, v1, v3}, Ldj/i;->d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Lqi/y;->f(Landroid/graphics/Bitmap;)V

    goto :goto_10

    :catch_0
    move-exception p0

    const-string p1, "data URL did not have correct base64 format."

    invoke-static {p1, p0}, Ldj/c;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :cond_18
    if-eqz p2, :cond_19

    sget-object p0, Lwi/g;->b:Lwi/g;

    iget-object p0, p0, Lwi/g;->a:La0/a0;

    invoke-virtual {p0, p2, v4}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    new-instance p0, Lqi/b0;

    invoke-direct {p0, v4}, Lqi/b0;-><init>(Lqi/i;)V

    return-object p0

    :catch_1
    move-exception p0

    new-instance p1, Lqi/b0;

    invoke-direct {p1, p0}, Lqi/b0;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method

.method public static j(Lne3/j0;[B)Ljava/lang/Boolean;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lne3/j0;->peek()Lne3/j0;

    move-result-object p0

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-byte v2, p1, v1

    invoke-virtual {p0}, Lne3/j0;->readByte()B

    move-result v3

    if-eq v3, v2, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lne3/j0;->close()V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object p0, Ldj/c;->a:Ldj/b;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :catch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static k()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lqi/l;->b:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public static l(Landroid/content/Context;I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "rawRes"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v1, 0x20

    if-ne p0, v1, :cond_0

    const-string p0, "_night_"

    goto :goto_0

    :cond_0
    const-string p0, "_day_"

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
