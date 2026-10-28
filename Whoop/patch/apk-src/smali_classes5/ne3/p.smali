.class public abstract Lne3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final w:Lne3/a0;

.field public static final x:Lne3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    const-string v0, "java.nio.file.Files"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    new-instance v0, Lne3/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lne3/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    sput-object v0, Lne3/p;->w:Lne3/a0;

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "java.io.tmpdir"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getProperty(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v0

    sput-object v0, Lne3/p;->x:Lne3/e0;

    new-instance v0, Loe3/g;

    const-class v1, Loe3/g;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const-string v2, "getClassLoader(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Loe3/g;-><init>(Ljava/lang/ClassLoader;)V

    return-void
.end method


# virtual methods
.method public abstract J(Lne3/e0;)Ljava/util/List;
.end method

.method public final T(Lne3/e0;)Ln4/f;
    .locals 3

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lne3/p;->a0(Lne3/e0;)Ln4/f;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no such file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract a0(Lne3/e0;)Ln4/f;
.end method

.method public abstract b(Lne3/e0;)Lne3/n0;
.end method

.method public abstract b0(Lne3/e0;)Lne3/z;
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public abstract h(Lne3/e0;Lne3/e0;)V
.end method

.method public final i(Lne3/e0;)V
    .locals 2

    new-instance v0, Lm83/m;

    invoke-direct {v0}, Lm83/m;-><init>()V

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lne3/p;->x(Lne3/e0;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lm83/m;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lne3/e0;->c()Lne3/e0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lne3/e0;

    invoke-virtual {p0, v0}, Lne3/p;->k(Lne3/e0;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public abstract k(Lne3/e0;)V
.end method

.method public abstract m(Lne3/e0;)V
.end method

.method public abstract o0(Lne3/e0;)Lne3/z;
.end method

.method public abstract p0(Lne3/e0;Z)Lne3/n0;
.end method

.method public final s(Lne3/e0;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lne3/p;->m(Lne3/e0;)V

    return-void
.end method

.method public final x(Lne3/e0;)Z
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lne3/p;->a0(Lne3/e0;)Ln4/f;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract x0(Lne3/e0;)Lne3/p0;
.end method
