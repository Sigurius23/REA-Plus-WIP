.class public final Lb30/l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public synthetic y:Ljava/lang/Object;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lb30/l;->w:I

    iput-object p1, p0, Lb30/l;->E:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly00/i;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lzx/d;

    check-cast p4, Lq83/d;

    new-instance v0, Lb30/l;

    iget-object v1, p0, Lb30/l;->E:Ljava/lang/Object;

    check-cast v1, Lx30/p0;

    const/4 v2, 0x3

    invoke-direct {v0, v1, p4, v2}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/l;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb30/l;->y:Ljava/lang/Object;

    iput-object p3, v0, Lb30/l;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Lq20/h;

    check-cast p4, Lq83/d;

    new-instance v0, Lb30/l;

    iget-object v1, p0, Lb30/l;->E:Ljava/lang/Object;

    check-cast v1, Lo20/a;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p4, v2}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/Set;

    iput-object p2, v0, Lb30/l;->z:Ljava/lang/Object;

    iput-object p3, v0, Lb30/l;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ll83/k;

    check-cast p2, Lj00/k;

    check-cast p3, Lh20/l;

    check-cast p4, Lq83/d;

    new-instance v0, Lb30/l;

    iget-object v1, p0, Lb30/l;->E:Ljava/lang/Object;

    check-cast v1, Lh20/g;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p4, v2}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lb30/l;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb30/l;->y:Ljava/lang/Object;

    iput-object p3, v0, Lb30/l;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/Set;

    check-cast p4, Lq83/d;

    new-instance v0, Lb30/l;

    iget-object v1, p0, Lb30/l;->E:Ljava/lang/Object;

    check-cast v1, Lb30/m;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p4, v2}, Lb30/l;-><init>(Ljava/lang/Object;Lq83/d;I)V

    check-cast p1, Ljava/util/List;

    iput-object p1, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iput-object p2, v0, Lb30/l;->y:Ljava/lang/Object;

    check-cast p3, Ljava/util/Set;

    iput-object p3, v0, Lb30/l;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb30/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lb30/l;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-object v6, v0, Lb30/l;->E:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast v1, Ly00/i;

    iget-object v7, v0, Lb30/l;->y:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v0, Lb30/l;->z:Ljava/lang/Object;

    check-cast v8, Lzx/d;

    check-cast v6, Lx30/p0;

    iget-object v8, v8, Lzx/d;->a:Ljava/lang/Object;

    iget-object v9, v6, Lx30/p0;->b:Lx30/y;

    iget-object v6, v6, Lx30/p0;->f:Lzx/s;

    invoke-virtual {v6}, Lzx/s;->a()Ly00/b;

    move-result-object v6

    if-eqz v6, :cond_0

    iget v6, v6, Ly00/b;->x:I

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v7}, Ly00/i;->c(Ljava/lang/String;)I

    move-result v6

    :goto_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "brand"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "number"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1

    sget-object v1, Lg40/t3;->b:Lg40/t3;

    goto/16 :goto_9

    :cond_1
    iget-object v10, v9, Lx30/y;->b:Lux/a;

    invoke-interface {v10, v1}, Lux/a;->o(Ly00/i;)Z

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_3

    iget-boolean v10, v9, Lx30/y;->a:Z

    if-eqz v10, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    iget v12, v9, Lx30/y;->f:I

    if-le v10, v12, :cond_3

    :cond_2
    new-instance v10, Lg40/v3;

    iget-object v12, v1, Ly00/i;->x:Ljava/lang/String;

    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const v13, 0x7f140ff2

    invoke-direct {v10, v13, v12, v11}, Lg40/v3;-><init>(ILjava/util/List;Z)V

    goto :goto_1

    :cond_3
    move-object v10, v5

    :goto_1
    if-eqz v10, :cond_4

    move-object v1, v10

    goto/16 :goto_9

    :cond_4
    sget-object v10, Ly00/i;->X:Ly00/i;

    const v12, 0x7f14101f

    if-ne v1, v10, :cond_5

    new-instance v1, Lg40/v3;

    invoke-direct {v1, v12, v3, v5}, Lg40/v3;-><init>(IILjava/util/List;)V

    goto/16 :goto_9

    :cond_5
    invoke-virtual {v1, v7}, Ly00/i;->c(Ljava/lang/String;)I

    move-result v1

    const/4 v10, -0x1

    if-eq v1, v10, :cond_6

    move v1, v4

    goto :goto_2

    :cond_6
    move v1, v11

    :goto_2
    iget-object v13, v9, Lx30/y;->c:Lux/b;

    check-cast v8, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_7
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    const/16 v16, 0xa

    move-object v2, v15

    check-cast v2, Ly00/b;

    iget-object v2, v2, Ly00/b;->w:Ly00/f;

    iget-boolean v2, v2, Ly00/f;->y:Z

    if-nez v2, :cond_7

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    const/16 v16, 0xa

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    :cond_9
    move v2, v11

    goto :goto_4

    :cond_a
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly00/b;

    iget-object v8, v8, Ly00/b;->z:Ly00/j;

    invoke-interface {v13, v8}, Lux/b;->F(Ly00/j;)Z

    move-result v8

    if-eqz v8, :cond_b

    move v2, v4

    :goto_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    iget v9, v9, Lx30/y;->g:I

    if-lt v8, v9, :cond_c

    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_c

    if-nez v2, :cond_c

    move v2, v4

    goto :goto_5

    :cond_c
    move v2, v11

    :goto_5
    invoke-interface {v13}, Lux/b;->A()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_d

    if-eqz v2, :cond_d

    goto :goto_6

    :cond_d
    move-object v8, v5

    :goto_6
    if-eqz v1, :cond_f

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v2, v6, :cond_f

    if-eqz v8, :cond_e

    new-instance v1, Lg40/v3;

    new-instance v2, Lg40/g1;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v2, v3}, Lg40/g1;-><init>(I)V

    invoke-direct {v1, v2, v11}, Lg40/v3;-><init>(Lg40/h1;Z)V

    goto :goto_9

    :cond_e
    new-instance v1, Lg40/u3;

    invoke-direct {v1, v12}, Lg40/u3;-><init>(I)V

    goto :goto_9

    :cond_f
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v4

    :goto_7
    if-ge v10, v2, :cond_13

    invoke-virtual {v7, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v13

    if-nez v13, :cond_10

    goto :goto_8

    :cond_10
    invoke-static {v9}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v9

    xor-int/lit8 v13, v4, 0x1

    if-nez v4, :cond_11

    mul-int/lit8 v9, v9, 0x2

    :cond_11
    const/16 v4, 0x9

    if-le v9, v4, :cond_12

    add-int/lit8 v9, v9, -0x9

    :cond_12
    add-int/2addr v11, v9

    add-int/lit8 v2, v2, -0x1

    move v4, v13

    goto :goto_7

    :cond_13
    rem-int/lit8 v11, v11, 0xa

    if-nez v11, :cond_16

    if-eqz v1, :cond_15

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v6, :cond_15

    if-eqz v8, :cond_14

    new-instance v1, Lg40/x3;

    new-instance v2, Lg40/g1;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v2, v3}, Lg40/g1;-><init>(I)V

    invoke-direct {v1, v2}, Lg40/x3;-><init>(Lg40/g1;)V

    goto :goto_9

    :cond_14
    new-instance v1, Lg40/x3;

    invoke-direct {v1, v5}, Lg40/x3;-><init>(Lg40/g1;)V

    goto :goto_9

    :cond_15
    new-instance v1, Lg40/v3;

    const/4 v2, 0x6

    invoke-direct {v1, v12, v2, v5}, Lg40/v3;-><init>(IILjava/util/List;)V

    goto :goto_9

    :cond_16
    :goto_8
    new-instance v1, Lg40/v3;

    invoke-direct {v1, v12, v3, v5}, Lg40/v3;-><init>(IILjava/util/List;)V

    :goto_9
    return-object v1

    :pswitch_0
    const/16 v16, 0xa

    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    check-cast v1, Ljava/util/Map;

    iget-object v2, v0, Lb30/l;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    check-cast v2, Ljava/util/Set;

    iget-object v3, v0, Lb30/l;->y:Ljava/lang/Object;

    check-cast v3, Lq20/h;

    check-cast v6, Lo20/a;

    iget-object v6, v6, Lo20/a;->a:Ljava/util/Map;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_17
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_18
    invoke-static {v7}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll40/a;

    if-eqz v7, :cond_1a

    iget-object v7, v7, Ll40/a;->a:Ljava/lang/String;

    goto :goto_c

    :cond_1a
    move-object v7, v5

    :goto_c
    if-eqz v7, :cond_1b

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_19

    :cond_1b
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    if-eqz v7, :cond_19

    invoke-static {v7}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1c

    goto :goto_b

    :cond_1c
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    new-instance v8, Ll40/a;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-direct {v8, v6, v4}, Ll40/a;-><init>(Ljava/lang/String;Z)V

    invoke-interface {v1, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_1d
    new-instance v2, Lo20/b;

    invoke-direct {v2, v1, v3}, Lo20/b;-><init>(Ljava/util/LinkedHashMap;Lq20/h;)V

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    move/from16 v4, v16

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll40/a;

    iget-boolean v4, v4, Ll40/a;->b:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_1e
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_e

    :cond_1f
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_f

    :cond_21
    :goto_e
    move-object v5, v2

    :goto_f
    return-object v5

    :pswitch_1
    check-cast v6, Lh20/g;

    iget-object v1, v6, Lh20/g;->d:Lv00/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast v2, Ll83/k;

    iget-object v3, v0, Lb30/l;->y:Ljava/lang/Object;

    check-cast v3, Lj00/k;

    iget-object v4, v0, Lb30/l;->z:Ljava/lang/Object;

    check-cast v4, Lh20/l;

    iget-object v6, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Lo20/b;

    if-eqz v6, :cond_24

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lv00/c0;->R(Ljava/lang/String;)Lu00/f;

    move-result-object v2

    if-eqz v2, :cond_23

    if-eqz v4, :cond_22

    iget-object v5, v4, Lh20/l;->b:Ly00/o4;

    :cond_22
    invoke-static {v6, v2, v1, v5, v3}, Lse/a;->j0(Lo20/b;Lu00/f;Lv00/c0;Ly00/o4;Lj00/k;)Lq20/y;

    move-result-object v5

    goto :goto_10

    :cond_23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    :goto_10
    return-object v5

    :pswitch_2
    sget-object v1, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lb30/l;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/List;

    iget-object v2, v0, Lb30/l;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/List;

    iget-object v7, v0, Lb30/l;->z:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    check-cast v7, Ljava/util/Set;

    check-cast v6, Lb30/m;

    iget-object v8, v6, Lb30/m;->x:Ljava/lang/Object;

    check-cast v8, Lb30/t1;

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_27

    if-eq v8, v4, :cond_29

    if-ne v8, v3, :cond_28

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_25
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_26

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    goto :goto_11

    :cond_26
    move-object v3, v5

    :goto_11
    check-cast v3, Ll83/k;

    if-eqz v3, :cond_27

    iget-object v1, v3, Ll83/k;->x:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ll40/a;

    :cond_27
    :goto_12
    move-object v9, v5

    goto :goto_13

    :cond_28
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_29
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v5

    goto :goto_12

    :goto_13
    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v10

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPhone$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v11

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine1$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v12

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getLine2$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v13

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCity$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v14

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getPostalCode$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v15

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getCountry$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v17

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getState$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v6, v2, v1, v7}, Lb30/m;->f(Lb30/m;Ljava/util/List;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;)Ll40/a;

    move-result-object v16

    new-instance v8, Lb30/n;

    invoke-direct/range {v8 .. v17}, Lb30/n;-><init>(Ll40/a;Ll40/a;Ll40/a;Ll40/a;Ll40/a;Ll40/a;Ll40/a;Ll40/a;Ll40/a;)V

    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
