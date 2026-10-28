.class public final synthetic Lg1/u5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Ljava/util/List;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:F

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FLp1/c1;FFLp1/c1;Ljava/util/List;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/u5;->w:F

    iput-object p2, p0, Lg1/u5;->x:Lp1/c1;

    iput p3, p0, Lg1/u5;->y:F

    iput p4, p0, Lg1/u5;->z:F

    iput-object p5, p0, Lg1/u5;->E:Lp1/c1;

    iput-object p6, p0, Lg1/u5;->F:Ljava/util/List;

    iput-object p7, p0, Lg1/u5;->G:Lp1/c1;

    iput-object p8, p0, Lg1/u5;->H:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lk2/e;

    invoke-interface {v1}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object v2

    sget-object v3, Ly3/m;->x:Ly3/m;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v3

    const-wide v14, 0xffffffffL

    and-long/2addr v3, v14

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iget v4, v0, Lg1/u5;->w:F

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v7, v3

    const/16 v16, 0x20

    shl-long v5, v5, v16

    and-long/2addr v7, v14

    or-long/2addr v5, v7

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v7

    shr-long v7, v7, v16

    long-to-int v3, v7

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v3, v4

    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v7

    and-long/2addr v7, v14

    long-to-int v4, v7

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v7, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v7, v7, v16

    and-long/2addr v3, v14

    or-long/2addr v3, v7

    move-wide v8, v3

    if-eqz v2, :cond_1

    move-wide v6, v5

    move-wide v4, v8

    goto :goto_1

    :cond_1
    move-wide/from16 v22, v5

    move-wide/from16 v4, v22

    move-wide v6, v4

    :goto_1
    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-wide v6, v8

    :goto_2
    iget-object v2, v0, Lg1/u5;->x:Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    const/4 v10, 0x0

    const/16 v11, 0x1e0

    iget v8, v0, Lg1/u5;->y:F

    const/4 v9, 0x1

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    shr-long v2, v4, v16

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    shr-long v9, v6, v16

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    sub-float/2addr v10, v11

    iget v11, v0, Lg1/u5;->z:F

    mul-float/2addr v10, v11

    add-float/2addr v10, v3

    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v17

    and-long v12, v17, v14

    long-to-int v3, v12

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v12, v10

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    move-wide/from16 v17, v14

    int-to-long v14, v3

    shl-long v12, v12, v16

    and-long v14, v14, v17

    or-long/2addr v12, v14

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v9, v2

    const/4 v14, 0x0

    mul-float/2addr v9, v14

    add-float/2addr v9, v3

    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v2

    and-long v2, v2, v17

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v9, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v9, v9, v16

    and-long v2, v2, v17

    or-long/2addr v2, v9

    iget-object v9, v0, Lg1/u5;->E:Lp1/c1;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li2/x;

    iget-wide v9, v9, Li2/x;->a:J

    move-wide/from16 v20, v4

    move-wide v4, v2

    move-wide v2, v9

    const/4 v10, 0x0

    move v9, v11

    const/16 v11, 0x1e0

    move v15, v9

    const/4 v9, 0x1

    move-wide/from16 v22, v20

    move/from16 v20, v14

    move/from16 v21, v15

    move-wide v14, v6

    move-wide v6, v12

    move-wide/from16 v12, v22

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    iget-object v2, v0, Lg1/u5;->F:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpl-float v6, v5, v21

    if-gtz v6, :cond_4

    cmpg-float v5, v5, v20

    if-gez v5, :cond_3

    goto :goto_4

    :cond_3
    const/4 v5, 0x0

    goto :goto_5

    :cond_4
    :goto_4
    const/4 v5, 0x1

    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_7

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-static {v12, v13, v14, v15, v9}, Lge3/g;->H(JJF)J

    move-result-wide v9

    shr-long v9, v9, v16

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v10

    and-long v10, v10, v17

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    move-object v11, v2

    move-object/from16 v19, v3

    int-to-long v2, v9

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long v2, v2, v16

    and-long v9, v9, v17

    or-long/2addr v2, v9

    new-instance v9, Lh2/b;

    invoke-direct {v9, v2, v3}, Lh2/b;-><init>(J)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move-object v2, v11

    move-object/from16 v3, v19

    goto :goto_7

    :cond_7
    move-object v11, v2

    if-eqz v4, :cond_8

    iget-object v2, v0, Lg1/u5;->G:Lp1/c1;

    goto :goto_8

    :cond_8
    iget-object v2, v0, Lg1/u5;->H:Lp1/c1;

    :goto_8
    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    invoke-interface {v1, v5, v2, v3, v8}, Lk2/e;->y0(Ljava/util/ArrayList;JF)V

    move-object v2, v11

    goto/16 :goto_6

    :cond_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
