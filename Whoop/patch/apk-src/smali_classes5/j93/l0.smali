.class public abstract Lj93/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(ILjava/lang/String;)I
    .locals 1

    const-string v0, "io.ktor.utils.io."

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :cond_0
    return p0
.end method

.method public static final B(Lj93/a0;)Ljava/lang/reflect/Type;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlin/jvm/internal/l;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/l;

    check-cast v0, Lwb3/a;

    iget-object v0, v0, Lwb3/a;->w:Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final C(Lj93/d0;)Ljava/lang/reflect/Type;
    .locals 4

    invoke-virtual {p0}, Lj93/d0;->d()Lj93/e0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p0, Lj93/m0;->y:Lj93/m0;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lj93/d0;->c()Lj93/a0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    new-instance v0, Lj93/m0;

    invoke-static {p0, v1}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-direct {v0, p0, v2}, Lj93/m0;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    new-instance v0, Lj93/m0;

    invoke-static {p0, v1}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Lj93/m0;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object v0

    :cond_3
    invoke-static {p0, v1}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final D(Ltb/a;)J
    .locals 3

    invoke-static {p0}, Lj93/l0;->H(Ltb/a;)I

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    const-string v0, "SELECT last_insert_rowid()"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {p0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-wide v0

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p0, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static E(Lio/sentry/q6;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lio/sentry/q6;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "java.io.tmpdir"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sentry_profiling_traces"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating a fallback directory for profiling failed in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setProfilingTracesDirPath(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final F(III)I
    .locals 1

    if-lez p2, :cond_4

    if-lt p0, p1, :cond_0

    goto :goto_3

    :cond_0
    rem-int v0, p1, p2

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr v0, p2

    :goto_0
    rem-int/2addr p0, p2

    if-ltz p0, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr p0, p2

    :goto_1
    sub-int/2addr v0, p0

    rem-int/2addr v0, p2

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v0, p2

    :goto_2
    sub-int/2addr p1, v0

    return p1

    :cond_4
    if-gez p2, :cond_9

    if-gt p0, p1, :cond_5

    :goto_3
    return p1

    :cond_5
    neg-int p2, p2

    rem-int/2addr p0, p2

    if-ltz p0, :cond_6

    goto :goto_4

    :cond_6
    add-int/2addr p0, p2

    :goto_4
    rem-int v0, p1, p2

    if-ltz v0, :cond_7

    goto :goto_5

    :cond_7
    add-int/2addr v0, p2

    :goto_5
    sub-int/2addr p0, v0

    rem-int/2addr p0, p2

    if-ltz p0, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr p0, p2

    :goto_6
    add-int/2addr p0, p1

    return p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step is zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static G(Lj93/d;)Ljava/lang/String;
    .locals 3

    const-string v0, "recordType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk7/b;->a:Ljava/lang/Object;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android.permission.health.READ_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Given recordType is not valid : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".simpleName"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final H(Ltb/a;)I
    .locals 2

    const-string v0, "connection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT changes()"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    long-to-int v0, v0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {p0, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static I(Lj93/d;)Ljava/lang/String;
    .locals 3

    const-string v0, "recordType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk7/b;->a:Ljava/lang/Object;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android.permission.health.WRITE_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-interface {v0, p0, v2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Given recordType is not valid : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".simpleName"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final J(I)Lic/a;
    .locals 3

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lic/a;->x:Lic/a;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to BackoffPolicy"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lic/a;->w:Lic/a;

    return-object p0
.end method

.method public static final K(I)Lic/x;
    .locals 3

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Lic/x;->F:Lic/x;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to NetworkType"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lic/x;->E:Lic/x;

    return-object p0

    :cond_2
    sget-object p0, Lic/x;->z:Lic/x;

    return-object p0

    :cond_3
    sget-object p0, Lic/x;->y:Lic/x;

    return-object p0

    :cond_4
    sget-object p0, Lic/x;->x:Lic/x;

    return-object p0

    :cond_5
    sget-object p0, Lic/x;->w:Lic/x;

    return-object p0
.end method

.method public static final L(I)Lic/i0;
    .locals 3

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lic/i0;->x:Lic/i0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to OutOfQuotaPolicy"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lic/i0;->w:Lic/i0;

    return-object p0
.end method

.method public static final M(I)Lic/m0;
    .locals 3

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Lic/m0;->F:Lic/m0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Could not convert "

    const-string v2, " to State"

    invoke-static {p0, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lic/m0;->E:Lic/m0;

    return-object p0

    :cond_2
    sget-object p0, Lic/m0;->z:Lic/m0;

    return-object p0

    :cond_3
    sget-object p0, Lic/m0;->y:Lic/m0;

    return-object p0

    :cond_4
    sget-object p0, Lic/m0;->x:Lic/m0;

    return-object p0

    :cond_5
    sget-object p0, Lic/m0;->w:Lic/m0;

    return-object p0
.end method

.method public static final N(Lr93/j0;Lva3/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lr93/j0;->b(Lva3/e;)Z

    move-result p0

    return p0
.end method

.method public static final O(Lh2/d;)Z
    .locals 6

    iget-wide v0, p0, Lh2/d;->e:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v4, v0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-wide v2, p0, Lh2/d;->f:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-wide v2, p0, Lh2/d;->g:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-wide v2, p0, Lh2/d;->h:J

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final P(Ljava/util/ArrayList;)Lub3/f;
    .locals 4

    new-instance v0, Lub3/f;

    invoke-direct {v0}, Lub3/f;-><init>()V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    if-eqz v2, :cond_0

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    if-eq v2, v3, :cond_0

    invoke-virtual {v0, v1}, Lub3/f;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final Q(Lic/x;)I
    .locals 3

    const-string v0, "networkType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lic/x;->F:Lic/x;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x5

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not convert "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to int"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final R(Lr93/j0;Lva3/e;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, p1, v0}, Lj93/l0;->p(Lr93/j0;Lva3/e;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static S(Ljava/lang/String;)Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;
    .locals 2

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    instance-of v0, p0, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Expected instanceof GlideModule, but found: "

    invoke-static {p0, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_3

    :goto_0
    invoke-static {p0, v1}, Lj93/l0;->e0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    throw v0

    :goto_1
    invoke-static {p0, v1}, Lj93/l0;->e0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    throw v0

    :goto_2
    invoke-static {p0, v1}, Lj93/l0;->e0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    throw v0

    :goto_3
    invoke-static {p0, v1}, Lj93/l0;->e0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V

    throw v0

    :catch_4
    move-exception p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unable to find GlideModule implementation"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static T(Ly2/i1;Ly2/j1;Lj4/k;)V
    .locals 8

    iget v0, p2, Lj4/k;->o:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget v0, p2, Lj4/k;->f:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->g:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->j:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->k:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->l:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->n:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p2, Lj4/k;->b:I

    long-to-int v3, v1

    sub-int/2addr v0, v3

    iget p2, p2, Lj4/k;->c:I

    long-to-int v1, v1

    sub-int/2addr p2, v1

    invoke-static {v0, p2}, Lvo/b;->a(II)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    return-void

    :cond_1
    new-instance v7, La0/a1;

    const/16 v0, 0x11

    invoke-direct {v7, p2, v0}, La0/a1;-><init>(Ljava/lang/Object;I)V

    iget v0, p2, Lj4/k;->b:I

    long-to-int v3, v1

    sub-int v4, v0, v3

    iget v0, p2, Lj4/k;->c:I

    long-to-int v1, v1

    sub-int v5, v0, v1

    iget v0, p2, Lj4/k;->k:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p2, 0x0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move v6, p2

    goto :goto_1

    :cond_2
    iget p2, p2, Lj4/k;->k:F

    goto :goto_0

    :goto_1
    invoke-virtual/range {v2 .. v7}, Ly2/i1;->r(Ly2/j1;IIFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final U(ILandroidx/compose/runtime/Composer;I)Lbm/t;
    .locals 6

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, 0x509c4ee5

    invoke-virtual {v3, p1}, Lp1/q;->f0(I)V

    and-int/lit8 p1, p2, 0x1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    move p0, p2

    :cond_0
    new-array v0, p2, [Ljava/lang/Object;

    sget-object v1, Lbm/t;->h:Lp0/n0;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const v2, 0x44faf204

    invoke-virtual {v3, v2}, Lp1/q;->f0(I)V

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v2, p1, :cond_2

    :cond_1
    new-instance v2, Lbm/u;

    invoke-direct {v2, p0}, Lbm/u;-><init>(I)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v3, p2}, Lp1/q;->q(Z)V

    check-cast v2, Lc93/a;

    const/16 v4, 0x48

    const/4 v5, 0x4

    invoke-static/range {v0 .. v5}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbm/t;

    invoke-virtual {v3, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static final V(ZLc93/a;FLp1/q;II)Lj1/l;
    .locals 6

    sget v0, Lj1/a;->a:F

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget p2, Lj1/a;->b:F

    :cond_0
    const/4 p5, 0x0

    int-to-float v1, p5

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v1

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lbc3/c0;

    invoke-static {p1, p3}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p1

    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/d0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p3, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5, v0}, Ly3/c;->q0(F)F

    move-result v0

    iput v0, v3, Lkotlin/jvm/internal/d0;->w:F

    invoke-interface {v5, p2}, Ly3/c;->q0(F)F

    move-result p2

    iput p2, v4, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_2

    if-ne v0, v2, :cond_3

    :cond_2
    new-instance v0, Lj1/l;

    iget p2, v4, Lkotlin/jvm/internal/d0;->w:F

    iget v5, v3, Lkotlin/jvm/internal/d0;->w:F

    invoke-direct {v0, v1, p1, p2, v5}, Lj1/l;-><init>(Lbc3/c0;Lp1/c1;FF)V

    invoke-virtual {p3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lj1/l;

    invoke-virtual {p3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    and-int/lit8 p2, p4, 0xe

    xor-int/lit8 p2, p2, 0x6

    const/4 v1, 0x4

    if-le p2, v1, :cond_4

    invoke-virtual {p3, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-nez p2, :cond_5

    :cond_4
    and-int/lit8 p2, p4, 0x6

    if-ne p2, v1, :cond_6

    :cond_5
    const/4 p5, 0x1

    :cond_6
    or-int/2addr p1, p5

    iget p2, v3, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p3, p2}, Lp1/q;->d(F)Z

    move-result p2

    or-int/2addr p1, p2

    iget p2, v4, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p3, p2}, Lp1/q;->d(F)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_7

    if-ne p2, v2, :cond_8

    :cond_7
    new-instance p2, Lj1/m;

    invoke-direct {p2, v0, p0, v3, v4}, Lj1/m;-><init>(Lj1/l;ZLkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast p2, Lc93/a;

    invoke-static {p2, p3}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    return-object v0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The refresh trigger must be greater than zero!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final W(Ljava/lang/Object;Lp1/q;I)Lg1/n7;
    .locals 9

    sget-object v0, Lg1/d7;->a:Ld0/i1;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_0

    new-instance v1, Lg1/u4;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lg1/u4;-><init>(I)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    new-instance v5, Ldw1/a;

    const/16 v6, 0x1b

    invoke-direct {v5, v6}, Ldw1/a;-><init>(I)V

    new-instance v6, Ldk2/i;

    invoke-direct {v6, v1}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v7, Lp0/n0;

    const/16 v8, 0xa

    invoke-direct {v7, v8, v5, v6}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    and-int/lit8 v5, p2, 0xe

    xor-int/lit8 v5, v5, 0x6

    const/4 v6, 0x1

    const/4 v8, 0x4

    if-le v5, v8, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    and-int/lit8 v5, p2, 0x6

    if-ne v5, v8, :cond_3

    :cond_2
    move v5, v6

    goto :goto_0

    :cond_3
    move v5, v3

    :goto_0
    invoke-virtual {p1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v5

    and-int/lit16 v5, p2, 0x380

    xor-int/lit16 v5, v5, 0x180

    const/16 v8, 0x100

    if-le v5, v8, :cond_4

    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_4
    and-int/lit16 p2, p2, 0x180

    if-ne p2, v8, :cond_5

    goto :goto_1

    :cond_5
    move v6, v3

    :cond_6
    :goto_1
    or-int p2, v0, v6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_7

    if-ne v0, v2, :cond_8

    :cond_7
    new-instance v0, Ld01/d;

    invoke-direct {v0, p0, v1}, Ld01/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lc93/a;

    invoke-static {v4, v7, v0, p1, v3}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/n7;

    return-object p0
.end method

.method public static X(Ljava/lang/Class;)V
    .locals 4

    new-instance v0, Lio/reactivex/exceptions/ProtocolViolationException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, " multiple times. Please create a fresh instance of "

    const-string v2, " and subscribe that to the target source instead."

    const-string v3, "It is not allowed to subscribe with a(n) "

    invoke-static {v3, p0, v1, p0, v2}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/reactivex/exceptions/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final Y(Ljava/util/Set;)[B
    .locals 4

    const-string v0, "triggers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lic/d;

    invoke-virtual {v2}, Lic/d;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    invoke-virtual {v2}, Lic/d;->b()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    const-string v0, "toByteArray(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_2

    :goto_1
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {v1, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {v0, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static Z(Lio/sentry/q6;Lio/sentry/q6;Z)Z
    .locals 3

    sget-boolean v0, Lio/sentry/util/i;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/sentry/q6;->getVersionDetector()Lio/sentry/q1;

    move-result-object v1

    instance-of v1, v1, Lio/sentry/i3;

    if-eqz v1, :cond_0

    new-instance v1, Lhm/d;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lio/sentry/q6;->setVersionDetector(Lio/sentry/q1;)V

    :cond_0
    invoke-virtual {p1}, Lio/sentry/q6;->getVersionDetector()Lio/sentry/q1;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/q1;->j()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    sget-object p1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string p2, "Not initializing Sentry because mixed SDK versions have been detected."

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p0, p1, p2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    const-string p0, "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions"

    goto :goto_0

    :cond_1
    const-string p0, "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions"

    :goto_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See "

    const-string v0, " for more details."

    invoke-static {p2, p0, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    if-nez p0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lio/sentry/q6;->isForceInit()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Lio/sentry/q6;->getInitPriority()Lio/sentry/r1;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    invoke-virtual {p1}, Lio/sentry/q6;->getInitPriority()Lio/sentry/r1;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-gt p0, p1, :cond_6

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_6
    return v2
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p2, Lp1/q;

    const v0, -0x3799f46e

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    if-eq v1, v2, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p0, p1}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p2, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, La11/j;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p3, v1}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static a0(Lui/b;Lqi/i;FLs83/i;I)Ljava/lang/Object;
    .locals 7

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    move-object p1, p0

    check-cast p1, Lui/i;

    invoke-virtual {p1}, Lui/i;->e()Lqi/i;

    move-result-object p1

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p4, 0x4

    const/4 p4, 0x1

    if-eqz p1, :cond_1

    move-object p1, p0

    check-cast p1, Lui/i;

    invoke-virtual {p1}, Lui/i;->j()I

    move-result p1

    move v4, p1

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    move-object p1, p0

    check-cast p1, Lui/i;

    invoke-virtual {p1}, Lui/i;->k()F

    move-result p1

    cmpg-float p1, p2, p1

    if-nez p1, :cond_2

    move p1, p4

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    xor-int/lit8 v5, p1, 0x1

    move-object v1, p0

    check-cast v1, Lui/i;

    iget-object p0, v1, Lui/i;->O:Lf0/c1;

    new-instance v0, Lui/h;

    const/4 v6, 0x0

    move v3, p2

    invoke-direct/range {v0 .. v6}, Lui/h;-><init>(Lui/i;Lqi/i;FIZLq83/d;)V

    invoke-static {p0, v0, p3}, Lf0/c1;->b(Lf0/c1;Lkotlin/jvm/functions/Function1;Ls83/i;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(FFFFFF)Lh2/d;
    .locals 17

    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {p5 .. p5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long v9, v0, v2

    new-instance v4, Lh2/d;

    move-wide v11, v9

    move-wide v13, v9

    move-wide v15, v9

    move/from16 v5, p0

    move/from16 v6, p1

    move/from16 v7, p2

    move/from16 v8, p3

    invoke-direct/range {v4 .. v16}, Lh2/d;-><init>(FFFFJJJJ)V

    return-object v4
.end method

.method public static final b0(Lic/m0;)I
    .locals 1

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Lh2/c;JJJJ)Lh2/d;
    .locals 13

    new-instance v0, Lh2/d;

    iget v1, p0, Lh2/c;->a:F

    iget v2, p0, Lh2/c;->b:F

    iget v3, p0, Lh2/c;->c:F

    iget v4, p0, Lh2/c;->d:F

    move-wide v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    invoke-direct/range {v0 .. v12}, Lh2/d;-><init>(FFFFJJJJ)V

    return-object v0
.end method

.method public static c0(Landroidx/compose/ui/Modifier;Lg1/n7;Ljava/util/Map;ZZLc93/m;Lg1/x4;I)Landroidx/compose/ui/Modifier;
    .locals 2

    sget-object v0, Lh0/d2;->w:Lh0/d2;

    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move p3, v1

    :cond_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    const/4 p4, 0x0

    :cond_1
    and-int/lit16 p7, p7, 0x80

    if-eqz p7, :cond_3

    sget-object p6, Lg1/d7;->a:Ld0/i1;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p6

    invoke-interface {p6}, Ljava/util/Set;->size()I

    move-result p7

    if-gt p7, v1, :cond_2

    const/4 p6, 0x0

    goto :goto_0

    :cond_2
    check-cast p6, Ljava/lang/Iterable;

    invoke-static {p6}, Lm83/s;->U0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p7

    invoke-static {p7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p7}, Ljava/lang/Float;->floatValue()F

    move-result p7

    invoke-static {p6}, Lm83/s;->Y0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p6

    invoke-static {p6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p6}, Ljava/lang/Float;->floatValue()F

    move-result p6

    sub-float/2addr p7, p6

    new-instance p6, Lg1/x4;

    const/high16 v0, 0x41200000    # 10.0f

    invoke-direct {p6, p7, v0, v0}, Lg1/x4;-><init>(FFF)V

    :cond_3
    :goto_0
    sget-object p7, Lg1/d7;->a:Ld0/i1;

    move p7, p4

    move-object p4, p6

    move p6, p3

    move-object p3, p1

    new-instance p1, Lg1/g7;

    invoke-direct/range {p1 .. p7}, Lg1/g7;-><init>(Ljava/util/Map;Lg1/n7;Lg1/x4;Lc93/m;ZZ)V

    invoke-static {p0, p1}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(JFFFF)Lh2/d;
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p0, v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p0, v1

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    move p1, p3

    move p3, p5

    move p5, p0

    move p0, p2

    move p2, p4

    move p4, v0

    invoke-static/range {p0 .. p5}, Lj93/l0;->b(FFFFFF)Lh2/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d0(ILjava/lang/Object;Lp3/x;Lp3/r;I)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    and-int/lit8 v0, p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p2, Lp3/x;->b:Lp3/r;

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lp3/r;->x:Lp3/r;

    invoke-static {}, Lse/g;->w()Lp3/r;

    move-result-object v0

    invoke-virtual {p3, v0}, Lp3/r;->a(Lp3/r;)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v0, p2, Lp3/x;->b:Lp3/r;

    invoke-static {}, Lse/g;->w()Lp3/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp3/r;->a(Lp3/r;)I

    move-result v0

    if-gez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    and-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p4, :cond_2

    goto :goto_1

    :cond_2
    move p0, v2

    goto :goto_2

    :cond_3
    :goto_1
    move p0, v1

    :goto_2
    if-nez p0, :cond_4

    if-nez v0, :cond_4

    return-object p1

    :cond_4
    if-eqz v0, :cond_5

    iget p3, p3, Lp3/r;->w:I

    goto :goto_3

    :cond_5
    iget-object p3, p2, Lp3/x;->b:Lp3/r;

    iget p3, p3, Lp3/r;->w:I

    :goto_3
    if-eqz p0, :cond_6

    if-ne p4, v2, :cond_7

    move v1, v2

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_7
    :goto_4
    check-cast p1, Landroid/graphics/Typeface;

    invoke-static {p1, p3, v1}, Ltx/f;->C(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Le63/e;Ljava/net/SocketTimeoutException;)Lio/ktor/client/network/sockets/SocketTimeoutException;
    .locals 3

    const-string v0, "request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/ktor/client/network/sockets/SocketTimeoutException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Socket timeout has expired [url="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Le63/e;->a:Li63/e0;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", socket_timeout="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, La63/h0;->d:La63/g0;

    invoke-virtual {p0}, Le63/e;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La63/f0;

    if-eqz p0, :cond_0

    iget-object p0, p0, La63/f0;->c:Ljava/lang/Long;

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "unknown"

    :cond_1
    const-string v2, "] ms"

    invoke-static {v1, v2, p0}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lio/ktor/client/network/sockets/SocketTimeoutException;-><init>(Ljava/lang/String;Ljava/net/SocketTimeoutException;)V

    return-object v0
.end method

.method public static e0(Ljava/lang/Class;Ljava/lang/ReflectiveOperationException;)V
    .locals 2

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unable to instantiate GlideModule implementation for "

    invoke-static {p0, v1}, Ld;->m(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final f(II)J
    .locals 4

    if-ltz p0, :cond_0

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "start and end cannot be negative. [start: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    int-to-long v0, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    int-to-long p0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    or-long/2addr p0, v0

    sget v0, Ll3/u0;->c:I

    return-wide p0
.end method

.method public static f0(Landroid/content/Context;I)I
    .locals 1

    const v0, 0x1030001

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return p1
.end method

.method public static final g(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Float;
    .locals 3

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static final g0([B)Lrc/e;
    .locals 6

    const-string v0, "bytes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    new-instance p0, Lrc/e;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    return-object p0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    new-instance p0, Ljava/io/ObjectInputStream;

    invoke-direct {p0, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_1

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v5

    aput v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    new-array v4, v1, [I

    :goto_1
    if-ge v3, v1, :cond_2

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v5

    aput v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v4, v2}, Lrc/f;->a([I[I)Lrc/e;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->close()V

    return-object v1

    :catchall_1
    move-exception p0

    goto :goto_3

    :goto_2
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v2

    :try_start_4
    invoke-static {p0, v1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {v0, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static final h(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lj93/k0;->w:Lj93/k0;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lxb3/k;->z(Lxb3/i;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[]"

    invoke-static {p0}, Lxb3/k;->p(Lxb3/i;)I

    move-result p0

    invoke-static {p0, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final h0(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    sget-object v0, Lme/i;->a:Ljava/util/LinkedHashSet;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Laws/sdk/kotlin/runtime/ConfigurationException;

    const-string v1, "Configured region \""

    const-string v2, "\" is invalid. A region must be a valid URI host component."

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Laws/sdk/kotlin/runtime/ConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static i(Lui/b;Lqi/i;IFLui/o;FILs83/i;I)Ljava/lang/Object;
    .locals 13

    move-object/from16 v6, p4

    move/from16 v0, p8

    move-object v1, p0

    check-cast v1, Lui/i;

    invoke-virtual {v1}, Lui/i;->j()I

    move-result v2

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Lui/i;

    iget-object v1, v1, Lui/i;->y:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Lui/i;

    iget-object v1, v1, Lui/i;->z:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_1
    move v4, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v1, p0

    check-cast v1, Lui/i;

    invoke-virtual {v1}, Lui/i;->l()F

    move-result v1

    move v5, v1

    goto :goto_3

    :cond_2
    move/from16 v5, p3

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    cmpg-float v7, v5, v1

    if-gez v7, :cond_3

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    if-nez p1, :cond_4

    goto :goto_5

    :cond_4
    if-gez v7, :cond_6

    if-eqz v6, :cond_5

    invoke-virtual {v6, p1}, Lui/o;->a(Lqi/i;)F

    move-result v1

    goto :goto_5

    :cond_5
    :goto_4
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_6
    if-eqz v6, :cond_7

    invoke-virtual {v6, p1}, Lui/o;->b(Lqi/i;)F

    move-result v1

    :cond_7
    :goto_5
    move v8, v1

    goto :goto_6

    :cond_8
    move/from16 v8, p5

    :goto_6
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    move v11, v0

    goto :goto_7

    :cond_9
    move/from16 v11, p6

    :goto_7
    move-object v1, p0

    check-cast v1, Lui/i;

    iget-object p0, v1, Lui/i;->O:Lf0/c1;

    new-instance v0, Lui/e;

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-direct/range {v0 .. v12}, Lui/e;-><init>(Lui/i;IIZFLui/o;Lqi/i;FZZILq83/d;)V

    move-object/from16 p1, p7

    invoke-static {p0, v0, p1}, Lf0/c1;->b(Lf0/c1;Lkotlin/jvm/functions/Function1;Ls83/i;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_a

    return-object p0

    :cond_a
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static i0(I[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x9

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "at index "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static final j(Lf63/c;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lf63/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf63/e;

    iget v1, v0, Lf63/e;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf63/e;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf63/e;

    invoke-direct {v0, p1}, Lf63/e;-><init>(Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf63/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf63/e;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object p0

    const-class p1, Lio/ktor/utils/io/q;

    invoke-static {p1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-static {p1, v2, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object p1

    iput v3, v0, Lf63/e;->x:I

    invoke-virtual {p0, p1, v0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    check-cast p1, Lio/ktor/utils/io/q;

    return-object p1

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lf63/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lf63/f;

    iget v1, v0, Lf63/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf63/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf63/f;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lf63/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf63/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lf63/f;->w:Ljava/nio/charset/CharsetDecoder;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li63/s;->getHeaders()Li63/m;

    move-result-object p2

    sget-object v2, Li63/r;->a:Ljava/util/List;

    const-string v2, "Content-Type"

    invoke-interface {p2, v2}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz p2, :cond_3

    sget-object v4, Li63/d;->f:Li63/d;

    invoke-static {p2}, Ljc/x;->h0(Ljava/lang/String;)Li63/d;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_4

    invoke-static {p2}, Lpf/c;->m(Li63/d;)Ljava/nio/charset/Charset;

    move-result-object v2

    :cond_4
    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v2

    :goto_2
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object p0

    const-class p2, Lv63/g;

    invoke-static {p2}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-static {p2, v2, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object p2

    iput-object p1, v0, Lf63/f;->w:Ljava/nio/charset/CharsetDecoder;

    iput v3, v0, Lf63/f;->y:I

    invoke-virtual {p0, p2, v0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object p0, p1

    :goto_3
    if-eqz p2, :cond_7

    check-cast p2, Lv63/g;

    const-string p1, "decoder"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Lhg3/i;->D(Ljava/nio/charset/CharsetDecoder;Lv63/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type io.ktor.utils.io.core.Input"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final l(Le4/s;Ljava/util/List;)V
    .locals 5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-static {v2}, Landroidx/compose/ui/layout/a;->a(Ly2/q0;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Ly2/q0;->p()Ljava/lang/Object;

    new-instance v3, Lu00/e;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Lu00/e;-><init>(I)V

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v3

    if-eqz v3, :cond_1

    iput-object v2, v3, Lj4/b;->f0:Ly2/q0;

    iget-object v3, v3, Lj4/b;->g0:Lm4/e;

    if-eqz v3, :cond_1

    iput-object v2, v3, Lm4/e;->g0:Ljava/lang/Object;

    :cond_1
    invoke-interface {v2}, Ly2/q0;->p()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final m([B)Ljava/util/LinkedHashSet;
    .locals 7

    const-string v0, "bytes"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v1, p0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    new-instance p0, Ljava/io/ObjectInputStream;

    invoke-direct {p0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readBoolean()Z

    move-result v5

    new-instance v6, Lic/d;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v6, v5, v4}, Lic/d;-><init>(ZLandroid/net/Uri;)V

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p0

    goto :goto_4

    :catch_0
    move-exception p0

    goto :goto_2

    :goto_1
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v3

    :try_start_4
    invoke-static {p0, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_2
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_3
    invoke-virtual {v1}, Ljava/io/ByteArrayInputStream;->close()V

    return-object v0

    :goto_4
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v1, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final n(Ljava/lang/String;)Ljava/util/Set;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const-string v0, "toCharArray(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    new-instance v0, Ljava/util/LinkedHashSet;

    array-length v2, p0

    const/16 v3, 0x80

    if-le v2, v3, :cond_0

    move v2, v3

    :cond_0
    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-char v3, p0, v1

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    aget-char p0, p0, v1

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    invoke-static {p0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lm83/a0;->w:Lm83/a0;

    return-object p0
.end method

.method public static final o(IJ)J
    .locals 5

    sget v0, Ll3/u0;->c:I

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    const/4 v1, 0x0

    if-gez v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-le v2, p0, :cond_1

    move v2, p0

    :cond_1
    const-wide v3, 0xffffffffL

    and-long/2addr v3, p1

    long-to-int v3, v3

    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    if-le v1, p0, :cond_3

    goto :goto_2

    :cond_3
    move p0, v1

    :goto_2
    if-ne v2, v0, :cond_5

    if-eq p0, v3, :cond_4

    goto :goto_3

    :cond_4
    return-wide p1

    :cond_5
    :goto_3
    invoke-static {v2, p0}, Lj93/l0;->f(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final p(Lr93/j0;Lva3/e;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lr93/j0;->a(Lva3/e;Ljava/util/ArrayList;)V

    return-void
.end method

.method public static final q(Lf63/c;)V
    .locals 1

    invoke-interface {p0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p0

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p0, Lbc3/u;

    invoke-interface {p0}, Lbc3/u;->complete()Z

    return-void
.end method

.method public static final r(Lj93/a0;Z)Ljava/lang/reflect/Type;
    .locals 3

    invoke-interface {p0}, Lj93/a0;->getClassifier()Lj93/e;

    move-result-object v0

    instance-of v1, v0, Lj93/b0;

    if-eqz v1, :cond_0

    new-instance p0, Lj93/i0;

    check-cast v0, Lj93/b0;

    invoke-direct {p0, v0}, Lj93/i0;-><init>(Lj93/b0;)V

    return-object p0

    :cond_0
    instance-of v1, v0, Lj93/d;

    if-eqz v1, :cond_b

    check-cast v0, Lj93/d;

    if-eqz p1, :cond_1

    invoke-static {v0}, Ljc/x;->T(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    :goto_0
    invoke-interface {p0}, Lj93/a0;->getArguments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v0}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj93/d0;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lj93/d0;->a()Lj93/e0;

    move-result-object p0

    invoke-virtual {v0}, Lj93/d0;->b()Lj93/a0;

    move-result-object v0

    const/4 v1, -0x1

    if-nez p0, :cond_4

    move p0, v1

    goto :goto_1

    :cond_4
    sget-object v2, Lj93/j0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    :goto_1
    if-eq p0, v1, :cond_8

    const/4 v1, 0x1

    if-eq p0, v1, :cond_8

    const/4 v1, 0x2

    if-eq p0, v1, :cond_6

    const/4 v1, 0x3

    if-ne p0, v1, :cond_5

    goto :goto_2

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_6
    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 p0, 0x0

    invoke-static {v0, p0}, Lj93/l0;->r(Lj93/a0;Z)Ljava/lang/reflect/Type;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Lj93/a;

    invoke-direct {p1, p0}, Lj93/a;-><init>(Ljava/lang/reflect/Type;)V

    :cond_8
    :goto_3
    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "kotlin.Array must have exactly one type argument: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-static {p1, v0}, Lj93/l0;->u(Ljava/lang/Class;Ljava/util/List;)Lj93/h0;

    move-result-object p0

    return-object p0

    :cond_b
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported type classifier: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    const-string v0, "collection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    return-object p1

    :cond_1
    instance-of v0, p0, Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object p0

    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static t(Lva3/e;Lkb3/k;Lr93/b0;Ljava/io/InputStream;)Lib3/c;
    .locals 7

    const-string v0, "fqName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lra3/a;->f:Lra3/a;

    invoke-static {p3}, Lpf/c;->R(Ljava/io/InputStream;)Lra3/a;

    move-result-object v6

    sget-object v0, Lra3/a;->f:Lra3/a;

    iget v1, v6, Lsa3/a;->c:I

    const-string v2, "ourVersion"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v0, Lsa3/a;->c:I

    iget v3, v0, Lsa3/a;->b:I

    iget v4, v6, Lsa3/a;->b:I

    if-nez v4, :cond_0

    if-nez v3, :cond_1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_0
    if-ne v4, v3, :cond_1

    if-gt v1, v2, :cond_1

    :goto_0
    new-instance v1, Lwa3/i;

    invoke-direct {v1}, Lwa3/i;-><init>()V

    invoke-static {v1}, Lra3/b;->a(Lwa3/i;)V

    sget-object v2, Lqa3/i0;->K:Lqa3/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lwa3/f;

    invoke-direct {v3, p3}, Lwa3/f;-><init>(Ljava/io/InputStream;)V

    invoke-interface {v2, v3, v1}, Lwa3/x;->a(Lwa3/f;Lwa3/i;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v3, v2}, Lwa3/f;->a(I)V
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v1}, Lwa3/c;->b(Lwa3/v;)V

    check-cast v1, Lqa3/i0;

    :goto_1
    move-object v5, v1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p0, v0

    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    invoke-interface {p3}, Ljava/io/Closeable;->close()V

    if-eqz v5, :cond_2

    new-instance v1, Lib3/c;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lib3/c;-><init>(Lva3/e;Lkb3/k;Lr93/b0;Lqa3/i0;Lra3/a;)V

    return-object v1

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Kotlin built-in definition format version is not supported: expected "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", actual "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Please update Kotlin"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-static {p3, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final u(Ljava/lang/Class;Ljava/util/List;)Lj93/h0;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d0;

    invoke-static {v1}, Lj93/l0;->C(Lj93/d0;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lj93/h0;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1, v0}, Lj93/h0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/ArrayList;)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v2

    if-eqz v2, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d0;

    invoke-static {v1}, Lj93/l0;->C(Lj93/d0;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Lj93/h0;

    invoke-direct {p1, p0, v0, v2}, Lj93/h0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/ArrayList;)V

    return-object p1

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v2

    array-length v2, v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {p1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lj93/l0;->u(Ljava/lang/Class;Ljava/util/List;)Lj93/h0;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {p1, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj93/d0;

    invoke-static {v1}, Lj93/l0;->C(Lj93/d0;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance p1, Lj93/h0;

    invoke-direct {p1, p0, v0, v2}, Lj93/h0;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/ArrayList;)V

    return-object p1
.end method

.method public static v(Lge/a;Ljava/lang/String;)Lge/b;
    .locals 11

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    sget-object v1, Lge/d;->a:Ljava/util/Set;

    const-string v1, "platform"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lge/j;

    iget-object v1, p0, Lge/a;->b:Ljava/lang/String;

    invoke-direct {v3, v1}, Lge/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvg/r;->c()Lvg/j;

    move-result-object v1

    new-instance v5, Lge/i;

    iget-object v2, v1, Lvg/j;->a:Lvg/k;

    iget-object v1, v1, Lvg/j;->b:Ljava/lang/String;

    invoke-direct {v5, v2, v1}, Lge/i;-><init>(Lvg/k;Ljava/lang/String;)V

    new-instance v6, Lge/g;

    sget-object v1, Lge/c;->a:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v6, v1}, Lge/g;-><init>(Ljava/util/Map;)V

    if-nez p1, :cond_0

    const-string p1, "aws.userAgentAppId"

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "AWS_SDK_UA_APP_ID"

    invoke-virtual {v0, p1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    move-object v9, p1

    const-string p1, "aws.frameworkMetadata"

    invoke-static {p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "AWS_FRAMEWORK_METADATA"

    invoke-virtual {v0, p1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const/4 v2, 0x1

    new-array v4, v2, [C

    const/16 v7, 0x3a

    const/4 v8, 0x0

    aput-char v7, v4, v8

    const/4 v7, 0x2

    invoke-static {p1, v4, v7, v7}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    if-ne v10, v7, :cond_2

    new-instance p1, Lge/f;

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p1, v7, v2}, Lge/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, p1

    goto :goto_0

    :cond_2
    const-string p0, "Invalid value for FRAMEWORK_METADATA: "

    const-string v0, "; must be of the form `name:version`"

    invoke-static {p0, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move-object v8, v1

    :goto_0
    sget-object p1, Lke/a;->c:Lgf/a;

    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object p1

    const-string v2, "getenv(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "AWS_CUSTOM_METADATA_"

    invoke-static {v2, p1}, Lq83/g;->u(Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {v0}, Lvg/r;->a()Ljava/util/LinkedHashMap;

    move-result-object v2

    const-string v4, "aws.customMetadata."

    invoke-static {v4, v2}, Lq83/g;->u(Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    new-instance v10, Lke/a;

    invoke-static {p1, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v10, p1, v2}, Lke/a;-><init>(Ljava/util/Map;Ljava/util/List;)V

    new-instance v2, Lge/b;

    const-string p1, "AWS_EXECUTION_ENV"

    invoke-virtual {v0, p1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v1, Lge/e;

    invoke-direct {v1, p1}, Lge/e;-><init>(Ljava/lang/String;)V

    :cond_4
    move-object v4, p0

    move-object v7, v1

    invoke-direct/range {v2 .. v10}, Lge/b;-><init>(Lge/j;Lge/a;Lge/i;Lge/g;Lge/e;Lge/f;Ljava/lang/String;Lke/a;)V

    return-object v2
.end method

.method public static final w(Lrc/e;)[B
    .locals 7

    const-string v0, "requestCompat"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lrc/e;->a:Ljava/lang/Object;

    check-cast p0, Landroid/net/NetworkRequest;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    new-array p0, v0, [B

    return-object p0

    :cond_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v2, Ljava/io/ObjectOutputStream;

    invoke-direct {v2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0}, Lrc/f;->c(Landroid/net/NetworkRequest;)[I

    move-result-object v3

    invoke-static {p0}, Lrc/f;->b(Landroid/net/NetworkRequest;)[I

    move-result-object p0

    array-length v4, v3

    invoke-virtual {v2, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    array-length v4, v3

    move v5, v0

    :goto_0
    if-ge v5, v4, :cond_1

    aget v6, v3, v5

    invoke-virtual {v2, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    array-length v3, p0

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    array-length v3, p0

    :goto_1
    if-ge v0, v3, :cond_2

    aget v4, p0, v0

    invoke-virtual {v2, v4}, Ljava/io/ObjectOutputStream;->writeInt(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    const-string v0, "toByteArray(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_3

    :goto_2
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-static {v2, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v1, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static final x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extension"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwa3/m;->l(Lwa3/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final y(Lwa3/m;Lwa3/o;I)Ljava/lang/Object;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extension"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lwa3/m;->o(Lwa3/o;)V

    iget-object v0, p0, Lwa3/m;->w:Lwa3/j;

    iget-object v1, p1, Lwa3/o;->d:Lwa3/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lwa3/j;->a:Lwa3/a0;

    iget-boolean v2, v1, Lwa3/n;->y:Z

    const-string v3, "getRepeatedField() can only be called on repeated fields."

    if-eqz v2, :cond_4

    invoke-virtual {v0, v1}, Lwa3/a0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge p2, v2, :cond_3

    invoke-virtual {p0, p1}, Lwa3/m;->o(Lwa3/o;)V

    iget-boolean p0, v1, Lwa3/n;->y:Z

    if-eqz p0, :cond_2

    invoke-virtual {v0, v1}, Lwa3/a0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lwa3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 p0, 0x0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z(Ld4/j;)Ld4/l;
    .locals 3

    new-instance v0, Ld4/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ld4/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ld4/i;->c:Ld4/n;

    new-instance v1, Ld4/l;

    invoke-direct {v1, v0}, Ld4/l;-><init>(Ld4/i;)V

    iput-object v1, v0, Ld4/i;->b:Ld4/l;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Ld4/i;->a:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p0, v0}, Ld4/j;->d(Ld4/i;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    iput-object p0, v0, Ld4/i;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object v1

    :goto_0
    iget-object v0, v1, Ld4/l;->x:Ld4/k;

    invoke-virtual {v0, p0}, Ld4/h;->k(Ljava/lang/Throwable;)Z

    return-object v1
.end method
