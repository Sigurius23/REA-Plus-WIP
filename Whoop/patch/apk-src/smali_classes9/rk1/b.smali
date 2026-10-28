.class public abstract Lrk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "",
        "samples",
        "",
        "lowest",
        "highest",
        "Lj71/b$g;",
        "a",
        "(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Lj71/b$g;",
        "heart-health-common_release"
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
.method public static final a(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Lj71/b$g;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ")",
            "Lj71/b$g;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "samples"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Lj71/b$g;

    const/16 v9, 0x39

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-string v4, "ecg-empty"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    const-string v1, "unreachable code"

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->T0(Ljava/lang/Iterable;)Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_5

    :cond_3
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_4

    move-object v4, v2

    goto :goto_3

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(DD)D

    move-result-wide v5

    goto :goto_2

    :cond_5
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    :goto_3
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_4

    :cond_6
    move-object v4, v2

    :goto_4
    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_5
    cmpg-float v4, v3, v1

    if-nez v4, :cond_7

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_7
    sub-float/2addr v3, v1

    :goto_6
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v5, 0x1

    if-ltz v5, :cond_8

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v9

    int-to-float v5, v5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    int-to-float v7, v7

    div-float v12, v5, v7

    double-to-float v5, v9

    sub-float/2addr v5, v1

    div-float v13, v5, v3

    new-instance v11, Lu61/e;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v8

    goto :goto_7

    :cond_8
    invoke-static {}, Lwb3/f;->d0()V

    throw v2

    :cond_9
    new-instance v8, Lk61/c;

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v13, v0

    sget-object v0, Lrk1/b$a;->w:Lrk1/b$a;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v16

    const/16 v20, 0x36

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    move-object v12, v8

    invoke-direct/range {v12 .. v21}, Lk61/c;-><init>(FIILi91/a;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "labrador-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lu61/a;

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    new-instance v9, Lj71/b$g;

    const/16 v16, 0x38

    const/16 v17, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v0

    invoke-direct/range {v9 .. v17}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic b(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)Lj71/b$g;
    .locals 1

    and-int/lit8 p4, p3, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-static {p0, p1, p2}, Lrk1/b;->a(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;)Lj71/b$g;

    move-result-object p0

    return-object p0
.end method
