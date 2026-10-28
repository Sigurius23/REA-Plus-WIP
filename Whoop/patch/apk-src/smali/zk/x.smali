.class public final Lzk/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg5/d;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Ls/m2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Lzk/x;->a:Lg5/d;

    move-object p5, p4

    check-cast p5, Ljava/util/List;

    invoke-interface {p5}, Ljava/util/Collection;->isEmpty()Z

    move-result p5

    if-nez p5, :cond_0

    check-cast p4, Ljava/util/List;

    iput-object p4, p0, Lzk/x;->b:Ljava/util/List;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Failed LoadPath{"

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "->"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lzk/x;->c:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must not be empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lxk/g;Lwk/h;IILpg3/p;Ljava/util/List;)Lzk/z;
    .locals 13

    move-object/from16 v1, p6

    iget-object v2, p0, Lzk/x;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v0, 0x0

    const/4 v4, 0x0

    move v5, v4

    move-object v4, v0

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lzk/j;

    :try_start_0
    iget-object v12, v6, Lzk/j;->d:Lg5/d;

    invoke-interface {v12}, Lg5/d;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v7, "Argument must not be null"

    invoke-static {v0, v7}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, Ljava/util/List;
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v7, p1

    move-object v10, p2

    move/from16 v8, p3

    move/from16 v9, p4

    :try_start_1
    invoke-virtual/range {v6 .. v11}, Lzk/j;->a(Lxk/g;IILwk/h;Ljava/util/List;)Lzk/z;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v12, v11}, Lg5/d;->a(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v7, p5

    :try_start_3
    invoke-virtual {v7, v0}, Lpg3/p;->h(Lzk/z;)Lzk/z;

    move-result-object v0

    iget-object v6, v6, Lzk/j;->c:Lll/a;

    invoke-interface {v6, v0, p2}, Lll/a;->t(Lzk/z;Lwk/h;)Lzk/z;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 v7, p5

    invoke-interface {v12, v11}, Lg5/d;->a(Ljava/lang/Object;)Z

    throw v0
    :try_end_3
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object/from16 v7, p5

    :goto_1
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    if-eqz v4, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_3
    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    new-instance p1, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lzk/x;->c:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LoadPath{decodePaths="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lzk/x;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
