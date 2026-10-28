.class public final Loe3/g;
.super Lne3/p;
.source "SourceFile"


# static fields
.field public static final F:Lne3/e0;


# instance fields
.field public final E:Ll83/p;

.field public final y:Ljava/lang/ClassLoader;

.field public final z:Lne3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "/"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v0

    sput-object v0, Loe3/g;->F:Lne3/e0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 2

    const-string v0, "systemFileSystem"

    sget-object v1, Lne3/p;->w:Lne3/a0;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loe3/g;->y:Ljava/lang/ClassLoader;

    iput-object v1, p0, Loe3/g;->z:Lne3/p;

    new-instance p1, Lm83/p;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Loe3/g;->E:Ll83/p;

    return-void
.end method


# virtual methods
.method public final J(Lne3/e0;)Ljava/util/List;
    .locals 12

    sget-object v0, Loe3/g;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lne3/e0;->d(Lne3/e0;)Lne3/e0;

    move-result-object v2

    iget-object v2, v2, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v2}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v4, p0, Loe3/g;->E:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :catch_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Lne3/p;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Lne3/e0;

    :try_start_0
    invoke-virtual {v6, v2}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lne3/p;->J(Lne3/e0;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lne3/e0;

    invoke-static {v10}, Ljc/a;->g(Lne3/e0;)Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v8, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lne3/e0;

    const-string v10, "<this>"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v6, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v10}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v10

    iget-object v9, v9, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v9}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v10}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x5c

    const/16 v11, 0x2f

    invoke-static {v9, v10, v11}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v3, v7}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move v5, v1

    goto/16 :goto_0

    :cond_3
    if-eqz v5, :cond_4

    invoke-static {v3}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "file not found: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a0(Lne3/e0;)Ln4/f;
    .locals 3

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/a;->g(Lne3/e0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Loe3/g;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lne3/e0;->d(Lne3/e0;)Lne3/e0;

    move-result-object p1

    iget-object p1, p1, Lne3/e0;->w:Lne3/l;

    invoke-virtual {p1}, Lne3/l;->s()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Loe3/g;->E:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lne3/p;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lne3/e0;

    invoke-virtual {v1, p1}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lne3/p;->a0(Lne3/e0;)Ln4/f;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lne3/e0;)Lne3/n0;
    .locals 2

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is read-only"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0(Lne3/e0;)Lne3/z;
    .locals 5

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/a;->g(Lne3/e0;)Z

    move-result v0

    const-string v1, "file not found: "

    if-eqz v0, :cond_1

    sget-object v0, Loe3/g;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v0, p1, v2}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lne3/e0;->d(Lne3/e0;)Lne3/e0;

    move-result-object v0

    iget-object v0, v0, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Loe3/g;->E:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :catch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Lne3/p;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lne3/e0;

    :try_start_0
    invoke-virtual {v3, v0}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v3

    invoke-virtual {v4, v3}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Lne3/e0;Lne3/e0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is read-only"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lne3/e0;)V
    .locals 2

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is read-only"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Lne3/e0;)V
    .locals 2

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is read-only"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o0(Lne3/e0;)Lne3/z;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "resources are not writable"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final p0(Lne3/e0;Z)Lne3/n0;
    .locals 1

    const-string p2, "file"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " is read-only"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x0(Lne3/e0;)Lne3/p0;
    .locals 4

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/a;->g(Lne3/e0;)Z

    move-result v0

    const-string v1, "file not found: "

    if-eqz v0, :cond_2

    sget-object v0, Loe3/g;->F:Lne3/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v0, p1, v2}, Loe3/c;->b(Lne3/e0;Lne3/e0;Z)Lne3/e0;

    move-result-object v3

    invoke-virtual {v3, v0}, Lne3/e0;->d(Lne3/e0;)Lne3/e0;

    move-result-object v0

    iget-object v0, v0, Lne3/e0;->w:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->s()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Loe3/g;->y:Ljava/lang/ClassLoader;

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    instance-of v0, p1, Ljava/net/JarURLConnection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/net/JarURLConnection;

    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setUseCaches(Z)V

    :cond_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string v0, "getInputStream(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
