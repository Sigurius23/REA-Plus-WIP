.class public abstract Lzc1/y5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a\u0015\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0000H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0003\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lbd1/h;",
        "a",
        "()Ljava/util/List;",
        "Lbd1/y;",
        "c",
        "Lbd1/u;",
        "b",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lbd1/h;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->D()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkd1/h;

    new-instance v3, Lbd1/h;

    invoke-direct {v3, v2}, Lbd1/h;-><init>(Lkd1/h;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static final b()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lbd1/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v1

    invoke-virtual {v1}, Lz81/b;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lkd1/h;

    new-instance v3, Lbd1/u;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lbd1/u;-><init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lz81/f;->c()Lz81/e;

    move-result-object v1

    invoke-virtual {v1}, Lz81/e;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lkd1/h;

    new-instance v3, Lbd1/u;

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lbd1/u;-><init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_2
    const/16 v2, 0x9

    if-ge v1, v2, :cond_2

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    mul-int/lit8 v3, v1, 0x4

    const-string v4, "dp radius"

    invoke-static {v3, v4}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v5, Lbd1/u;

    new-instance v9, Ly3/f;

    invoke-direct {v9, v2}, Ly3/f;-><init>(F)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v11}, Lbd1/u;-><init>(Lkd1/h;Lkd1/h;Ljava/lang/String;Ly3/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lbd1/y;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkd1/h;

    new-instance v3, Lbd1/y;

    invoke-direct {v3, v2}, Lbd1/y;-><init>(Lkd1/h;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
