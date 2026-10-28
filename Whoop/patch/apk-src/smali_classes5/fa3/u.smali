.class public final Lfa3/u;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lfa3/u;->w:I

    iput-object p1, p0, Lfa3/u;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lfa3/u;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lxa3/i;

    sget-object v2, Lxa3/g;->z:Lxa3/g;

    iget-object v1, v1, Lxa3/i;->a:Lxa3/l;

    new-instance v3, Lxa3/l;

    invoke-direct {v3}, Lxa3/l;-><init>()V

    const-class v4, Lxa3/l;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    const-string v6, "getDeclaredFields(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v6, v5

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/4 v9, 0x1

    if-ge v8, v6, :cond_4

    aget-object v10, v5, v8

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v11

    and-int/lit8 v11, v11, 0x8

    if-nez v11, :cond_3

    invoke-virtual {v10, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v10, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lf93/b;

    if-eqz v12, :cond_0

    check-cast v11, Lf93/b;

    goto :goto_1

    :cond_0
    const/4 v11, 0x0

    :goto_1
    if-nez v11, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getName(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "is"

    invoke-static {v12, v14, v7}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v17

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "get"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v13

    if-lez v13, :cond_2

    invoke-virtual {v15, v7}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v13

    invoke-virtual {v15, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    const-string v7, "substring(...)"

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    :cond_2
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    new-instance v14, Lkotlin/jvm/internal/x;

    sget-object v15, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    move-object v7, v12

    check-cast v7, Lkotlin/jvm/internal/d;

    invoke-interface {v7}, Lkotlin/jvm/internal/d;->getJClass()Ljava/lang/Class;

    move-result-object v16

    invoke-static {v12}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v19, v7, 0x1

    invoke-direct/range {v14 .. v19}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v11, v1, v14}, Lf93/b;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v7

    new-instance v9, Le4/c;

    invoke-direct {v9, v7, v3}, Le4/c;-><init>(Ljava/lang/Object;Lxa3/l;)V

    invoke-virtual {v10, v3, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v2, v3}, Lxa3/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iput-boolean v9, v3, Lxa3/l;->a:Z

    new-instance v1, Lxa3/i;

    invoke-direct {v1, v3}, Lxa3/i;-><init>(Lxa3/l;)V

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lr93/r0;

    iget-object v1, v1, Lr93/r0;->b:Lkotlin/jvm/functions/Function1;

    sget-object v2, Lmb3/f;->a:Lmb3/f;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lq93/j;

    iget-object v2, v1, Lq93/j;->f:Lo93/k;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lo93/k;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq93/i;

    const/4 v3, 0x0

    iput-object v3, v1, Lq93/j;->f:Lo93/k;

    return-object v2

    :cond_5
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "JvmBuiltins instance has not been initialized properly"

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_2
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lp1/o1;

    iget-object v1, v1, Lp1/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v3, La0/v0;

    invoke-direct {v3, v2}, La0/v0;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v2, :cond_7

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/r0;

    iget-object v6, v5, Lp1/r0;->b:Ljava/lang/Object;

    iget v7, v5, Lp1/r0;->a:I

    if-eqz v6, :cond_6

    new-instance v6, Lp1/q0;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v8, v5, Lp1/r0;->b:Ljava/lang/Object;

    invoke-direct {v6, v7, v8}, Lp1/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_4
    invoke-static {v3, v6, v5}, Lr1/a;->a(La0/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    new-instance v1, Lr1/a;

    invoke-direct {v1, v3}, Lr1/a;-><init>(La0/v0;)V

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, [Lec3/l;

    array-length v1, v1

    new-array v1, v1, [Lmc/c;

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/l0;

    sget-object v2, Lnb3/k;->Y:Lnb3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Llb3/f;

    new-instance v2, Llb3/e;

    invoke-virtual {v1}, Llb3/f;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v2, v1}, Llb3/e;-><init>(Ljava/util/Collection;)V

    return-object v2

    :pswitch_6
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;

    iget-object v2, v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-static {v2, v3, v4}, Ldt/b;->t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    return-object v1

    :pswitch_7
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Llb3/a1;

    invoke-virtual {v1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Llb3/a1;

    invoke-direct {v2, v1}, Llb3/a1;-><init>(Llb3/y0;)V

    return-object v2

    :pswitch_8
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Ljb3/v;

    iget-object v2, v1, Ljb3/v;->L:Lhb3/k;

    iget-object v3, v2, Lhb3/k;->a:Lhb3/i;

    iget-object v3, v3, Lhb3/i;->e:Lhb3/a;

    iget-object v1, v1, Ljb3/v;->M:Lqa3/b1;

    iget-object v2, v2, Lhb3/k;->b:Lsa3/f;

    invoke-interface {v3, v1, v2}, Lhb3/c;->r(Lqa3/b1;Lsa3/f;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_9
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Ljb3/q;

    invoke-virtual {v1}, Ljb3/q;->g()Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_8

    const/4 v1, 0x0

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Ljb3/q;->f()Ljava/util/Set;

    move-result-object v3

    iget-object v1, v1, Ljb3/q;->c:Ljb3/p;

    iget-object v1, v1, Ljb3/p;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v3, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v1

    :goto_5
    return-object v1

    :pswitch_a
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    return-object v1

    :pswitch_b
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lja3/d;

    iget-object v2, v1, Lja3/d;->c:Lja3/q;

    iget-object v3, v2, Lja3/q;->J:Lkb3/i;

    sget-object v4, Lja3/q;->N:[Lj93/z;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-static {v3, v4}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw93/b;

    iget-object v7, v1, Lja3/d;->b:Lzt/q;

    iget-object v7, v7, Lzt/q;->x:Ljava/lang/Object;

    check-cast v7, Lia3/a;

    iget-object v7, v7, Lia3/a;->d:Loa3/f;

    invoke-virtual {v7, v2, v6}, Loa3/f;->a(Lr93/g0;Lw93/b;)Ljb3/r;

    move-result-object v6

    if-eqz v6, :cond_9

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    invoke-static {v4}, Lj93/l0;->P(Ljava/util/ArrayList;)Lub3/f;

    move-result-object v1

    new-array v2, v5, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-virtual {v1, v2}, Lub3/f;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v1

    :pswitch_c
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lib3/c;

    iget-object v1, v1, Lib3/c;->J:Lzt/q;

    iget-object v1, v1, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lva3/c;

    invoke-virtual {v4}, Lva3/c;->g()Z

    move-result v5

    if-nez v5, :cond_b

    sget-object v5, Lhb3/g;->c:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lva3/c;

    invoke-virtual {v3}, Lva3/c;->f()Lva3/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    return-object v1

    :pswitch_d
    iget-object v1, v0, Lfa3/u;->x:Ljava/lang/Object;

    check-cast v1, Lfa3/v;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v2

    iget-object v3, v1, Lfa3/v;->a:Lfa3/b0;

    iget-object v3, v3, Lfa3/b0;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Lfa3/v;->b:Lfa3/b0;

    if-eqz v3, :cond_e

    iget-object v3, v3, Lfa3/b0;->w:Ljava/lang/String;

    const-string v4, "under-migration:"

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v1, v1, Lfa3/v;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "@"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x3a

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfa3/b0;

    iget-object v3, v3, Lfa3/b0;->w:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_f
    invoke-static {v2}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Ln83/c;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
