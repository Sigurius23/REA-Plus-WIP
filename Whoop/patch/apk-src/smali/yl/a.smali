.class public final Lyl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Lq3/i;
    .locals 12

    invoke-static {p0}, Lyl/a;->h(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_5

    aget-object v4, p0, v2

    move v5, v1

    :goto_1
    add-int/lit8 v6, v5, 0x1

    const/4 v7, 0x5

    if-ge v5, v7, :cond_0

    :try_start_0
    new-instance v5, Ljava/util/zip/ZipFile;

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    invoke-direct {v5, v8, v9}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    goto :goto_2

    :catch_0
    move v5, v6

    goto :goto_1

    :cond_0
    :goto_2
    if-nez v3, :cond_1

    goto :goto_5

    :cond_1
    move v5, v1

    :goto_3
    add-int/lit8 v6, v5, 0x1

    if-ge v5, v7, :cond_4

    array-length v5, p1

    move v8, v1

    :goto_4
    if-ge v8, v5, :cond_3

    aget-object v9, p1, v8

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "lib"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-char v11, Ljava/io/File;->separatorChar:C

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Looking for %s in APK %s..."

    filled-new-array {v9, v4}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10, v11}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3, v9}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v9

    if-eqz v9, :cond_2

    new-instance p0, Lq3/i;

    invoke-direct {p0, v3, v9}, Lq3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_3
    move v5, v6

    goto :goto_3

    :cond_4
    :try_start_1
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v3
.end method

.method public static c()Lz1/f;
    .locals 1

    sget-object v0, Lz1/l;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/f;

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "lib"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-char v1, Ljava/io/File;->separatorChar:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "([^\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "]*)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0}, Lyl/a;->h(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    :try_start_0
    new-instance v4, Ljava/util/zip/ZipFile;

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-direct {v4, v5, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/zip/ZipEntry;

    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static e(Lz1/f;)Lz1/f;
    .locals 6

    instance-of v0, p0, Lz1/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lz1/d0;

    iget-wide v2, v0, Lz1/d0;->t:J

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iput-object v1, v0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    return-object p0

    :cond_0
    instance-of v0, p0, Lz1/e0;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lz1/e0;

    iget-wide v2, v0, Lz1/e0;->i:J

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iput-object v1, v0, Lz1/e0;->h:Lkotlin/jvm/functions/Function1;

    return-object p0

    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v1, v0}, Lz1/l;->h(Lz1/f;Lkotlin/jvm/functions/Function1;Z)Lz1/f;

    move-result-object p0

    invoke-virtual {p0}, Lz1/f;->j()Lz1/f;

    return-object p0
.end method

.method public static f(Lc93/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 6

    if-nez p1, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lz1/l;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/f;

    instance-of v1, v0, Lz1/d0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lz1/d0;

    iget-wide v2, v1, Lz1/d0;->t:J

    invoke-static {}, Lx1/c;->c()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    iget-object v2, v1, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    :try_start_0
    move-object v4, v0

    check-cast v4, Lz1/d0;

    const/4 v5, 0x1

    invoke-static {p1, v2, v5}, Lz1/l;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object p1, v4, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    check-cast v0, Lz1/d0;

    iput-object v3, v0, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v2, v1, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    iput-object v3, v1, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    iput-object v2, v1, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    iput-object v3, v1, Lz1/d0;->s:Lkotlin/jvm/functions/Function1;

    throw p0

    :cond_1
    if-eqz v0, :cond_2

    instance-of v1, v0, Lz1/b;

    if-eqz v1, :cond_3

    :cond_2
    move-object v1, v0

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {v0, p1}, Lz1/f;->u(Lkotlin/jvm/functions/Function1;)Lz1/f;

    move-result-object p1

    goto :goto_2

    :goto_0
    new-instance v0, Lz1/d0;

    instance-of v2, v1, Lz1/b;

    if-eqz v2, :cond_5

    check-cast v1, Lz1/b;

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lz1/d0;-><init>(Lz1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    move-object p1, v0

    :goto_2
    :try_start_1
    invoke-virtual {p1}, Lz1/f;->j()Lz1/f;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-static {v1}, Lz1/f;->q(Lz1/f;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {p1}, Lz1/f;->c()V

    return-object p0

    :catchall_1
    move-exception v0

    move-object p0, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p0, v0

    :try_start_4
    invoke-static {v1}, Lz1/f;->q(Lz1/f;)V

    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    invoke-virtual {p1}, Lz1/f;->c()V

    throw p0
.end method

.method public static g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    if-ne p0, p1, :cond_2

    instance-of p1, p0, Lz1/d0;

    if-eqz p1, :cond_0

    check-cast p0, Lz1/d0;

    iput-object p2, p0, Lz1/d0;->r:Lkotlin/jvm/functions/Function1;

    return-void

    :cond_0
    instance-of p1, p0, Lz1/e0;

    if-eqz p1, :cond_1

    check-cast p0, Lz1/e0;

    iput-object p2, p0, Lz1/e0;->h:Lkotlin/jvm/functions/Function1;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Non-transparent snapshot was reused: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lz1/f;->q(Lz1/f;)V

    invoke-virtual {p1}, Lz1/f;->c()V

    return-void
.end method

.method public static h(Landroid/content/Context;)[Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object v0, p0, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    array-length v1, v0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p0, v1, v3

    array-length p0, v0

    invoke-static {v0, v3, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_0
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
