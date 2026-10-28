.class public final Loa3/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;

.field public static final d:Lsa3/e;

.field public static final e:Lsa3/e;


# instance fields
.field public a:Lhb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lpa3/a;->E:Lpa3/a;

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Loa3/f;->b:Ljava/util/Set;

    sget-object v0, Lpa3/a;->F:Lpa3/a;

    sget-object v1, Lpa3/a;->I:Lpa3/a;

    filled-new-array {v0, v1}, [Lpa3/a;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Loa3/f;->c:Ljava/util/Set;

    new-instance v0, Lsa3/e;

    const/4 v1, 0x2

    const/4 v2, 0x1

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3}, Lsa3/e;-><init>([IZ)V

    new-instance v0, Lsa3/e;

    const/16 v1, 0xb

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsa3/e;-><init>([IZ)V

    sput-object v0, Loa3/f;->d:Lsa3/e;

    new-instance v0, Lsa3/e;

    const/16 v1, 0xd

    filled-new-array {v2, v2, v1}, [I

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsa3/e;-><init>([IZ)V

    sput-object v0, Loa3/f;->e:Lsa3/e;

    return-void
.end method


# virtual methods
.method public final a(Lr93/g0;Lw93/b;)Ljb3/r;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    const-string v2, "Could not read data from "

    const-string v0, "kotlinClass"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v3, Lw93/b;->b:Lpa3/b;

    iget-object v4, v0, Lpa3/b;->f:Ljava/io/Serializable;

    check-cast v4, [Ljava/lang/String;

    if-nez v4, :cond_0

    iget-object v4, v0, Lpa3/b;->g:Ljava/io/Serializable;

    check-cast v4, [Ljava/lang/String;

    :cond_0
    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object v6, v0, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v6, Lpa3/a;

    sget-object v7, Loa3/f;->c:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    iget-object v6, v0, Lpa3/b;->e:Ljava/lang/Object;

    move-object v11, v6

    check-cast v11, Lsa3/e;

    iget-object v0, v0, Lpa3/b;->h:Ljava/io/Serializable;

    check-cast v0, [Ljava/lang/String;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    :try_start_0
    invoke-static {v4, v0}, Lua3/g;->i([Ljava/lang/String;[Ljava/lang/String;)Ll83/k;

    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lw93/b;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v1}, Loa3/f;->c()Lhb3/i;

    move-result-object v2

    iget-object v2, v2, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Loa3/f;->e()Lsa3/e;

    move-result-object v2

    invoke-virtual {v11, v2}, Lsa3/e;->b(Lsa3/e;)Z

    move-result v2

    if-nez v2, :cond_5

    move-object v0, v5

    :goto_2
    if-nez v0, :cond_4

    :goto_3
    return-object v5

    :cond_4
    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Lua3/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lqa3/g0;

    new-instance v2, Loa3/h;

    invoke-virtual {v1, v3}, Loa3/f;->d(Lw93/b;)Lhb3/q;

    invoke-virtual {v1, v3}, Loa3/f;->f(Lw93/b;)Z

    move-result v6

    invoke-virtual {v1, v3}, Loa3/f;->b(Lw93/b;)Ljb3/i;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Loa3/h;-><init>(Lw93/b;Lqa3/g0;Lua3/f;ZLjb3/i;)V

    new-instance v7, Ljb3/r;

    invoke-virtual {v1}, Loa3/f;->c()Lhb3/i;

    move-result-object v13

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "scope for "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " in "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    sget-object v15, Loa3/e;->w:Loa3/e;

    move-object v12, v2

    move-object v9, v4

    move-object v10, v5

    invoke-direct/range {v7 .. v15}, Ljb3/r;-><init>(Lr93/g0;Lqa3/g0;Lsa3/f;Lsa3/a;Loa3/h;Lhb3/i;Ljava/lang/String;Lc93/a;)V

    return-object v7

    :cond_5
    throw v0
.end method

.method public final b(Lw93/b;)Ljb3/i;
    .locals 1

    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lw93/b;->b:Lpa3/b;

    iget p1, p1, Lpa3/b;->c:I

    and-int/lit8 v0, p1, 0x10

    if-eqz v0, :cond_1

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ljb3/i;->x:Ljb3/i;

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljb3/i;->w:Ljb3/i;

    return-object p1
.end method

.method public final c()Lhb3/i;
    .locals 1

    iget-object v0, p0, Loa3/f;->a:Lhb3/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "components"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d(Lw93/b;)Lhb3/q;
    .locals 8

    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lw93/b;->b:Lpa3/b;

    iget-object v0, v0, Lpa3/b;->e:Ljava/lang/Object;

    check-cast v0, Lsa3/e;

    invoke-virtual {p0}, Loa3/f;->e()Lsa3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsa3/e;->b(Lsa3/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lhb3/q;

    iget-object v1, p1, Lw93/b;->b:Lpa3/b;

    iget-object v1, v1, Lpa3/b;->e:Ljava/lang/Object;

    check-cast v1, Lsa3/e;

    sget-object v2, Lsa3/e;->g:Lsa3/e;

    invoke-virtual {p0}, Loa3/f;->e()Lsa3/e;

    move-result-object v3

    invoke-virtual {p0}, Loa3/f;->e()Lsa3/e;

    move-result-object v4

    iget-boolean v5, v1, Lsa3/e;->f:Z

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_1

    move-object v5, v2

    goto :goto_0

    :cond_1
    sget-object v5, Lsa3/e;->h:Lsa3/e;

    :goto_0
    iget v6, v5, Lsa3/a;->b:I

    iget v7, v4, Lsa3/a;->b:I

    if-le v6, v7, :cond_2

    goto :goto_1

    :cond_2
    if-ge v6, v7, :cond_3

    goto :goto_2

    :cond_3
    iget v6, v5, Lsa3/a;->c:I

    iget v7, v4, Lsa3/a;->c:I

    if-le v6, v7, :cond_4

    :goto_1
    move-object v4, v5

    :cond_4
    :goto_2
    invoke-virtual {p1}, Lw93/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lhb3/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lsa3/e;Lsa3/e;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Lsa3/e;
    .locals 1

    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lsa3/e;->g:Lsa3/e;

    return-object v0
.end method

.method public final f(Lw93/b;)Z
    .locals 2

    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v0

    iget-object v0, v0, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lw93/b;->b:Lpa3/b;

    iget v0, p1, Lpa3/b;->c:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lpa3/b;->e:Ljava/lang/Object;

    check-cast p1, Lsa3/e;

    sget-object v0, Loa3/f;->d:Lsa3/e;

    invoke-virtual {p1, v0}, Lsa3/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final g(Lw93/b;)Lhb3/d;
    .locals 6

    const-string v0, "Could not read data from "

    iget-object v1, p1, Lw93/b;->b:Lpa3/b;

    iget-object v2, v1, Lpa3/b;->f:Ljava/io/Serializable;

    check-cast v2, [Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, v1, Lpa3/b;->g:Ljava/io/Serializable;

    check-cast v2, [Ljava/lang/String;

    :cond_0
    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v4, v1, Lpa3/b;->d:Ljava/lang/Object;

    check-cast v4, Lpa3/a;

    sget-object v5, Loa3/f;->b:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    iget-object v4, v1, Lpa3/b;->e:Ljava/lang/Object;

    check-cast v4, Lsa3/e;

    iget-object v1, v1, Lpa3/b;->h:Ljava/io/Serializable;

    check-cast v1, [Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    :try_start_0
    invoke-static {v2, v1}, Lua3/g;->f([Ljava/lang/String;[Ljava/lang/String;)Ll83/k;

    move-result-object v0
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lw93/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {p0}, Loa3/f;->c()Lhb3/i;

    move-result-object v1

    iget-object v1, v1, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Loa3/f;->e()Lsa3/e;

    move-result-object v1

    invoke-virtual {v4, v1}, Lsa3/e;->b(Lsa3/e;)Z

    move-result v1

    if-nez v1, :cond_5

    move-object v0, v3

    :goto_2
    if-nez v0, :cond_4

    :goto_3
    return-object v3

    :cond_4
    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lua3/f;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lqa3/k;

    new-instance v2, Loa3/q;

    invoke-virtual {p0, p1}, Loa3/f;->d(Lw93/b;)Lhb3/q;

    new-instance v3, Ljb3/x;

    invoke-virtual {p0, p1}, Loa3/f;->f(Lw93/b;)Z

    move-result v5

    invoke-direct {v3, v5}, Ljb3/x;-><init>(Z)V

    invoke-virtual {p0, p1}, Loa3/f;->b(Lw93/b;)Ljb3/i;

    move-result-object v5

    invoke-direct {v2, p1, v3, v5}, Loa3/q;-><init>(Lw93/b;Ljb3/x;Ljb3/i;)V

    new-instance p1, Lhb3/d;

    invoke-direct {p1, v1, v0, v4, v2}, Lhb3/d;-><init>(Lsa3/f;Lqa3/k;Lsa3/a;Lr93/s0;)V

    return-object p1

    :cond_5
    throw v0
.end method
