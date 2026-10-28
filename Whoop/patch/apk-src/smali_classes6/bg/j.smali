.class public final Lbg/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lbg/j;->w:I

    iput-object p1, p0, Lbg/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, Lbg/j;->w:I

    sget-object v2, Lm83/z;->w:Lm83/z;

    const/16 v3, 0xa

    const/4 v5, 0x0

    iget-object v6, v0, Lbg/j;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v6, Llb3/u0;

    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    const-string v2, "getType(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :pswitch_0
    new-instance v1, Laws/smithy/kotlin/runtime/identity/IdentityProviderException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No identity could be resolved from the chain: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lve/g;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v5}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :pswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to resolve identity from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lxf/c;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_2
    check-cast v6, Ln83/c;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v6, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lec3/f2;

    invoke-interface {v3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    return-object v1

    :pswitch_3
    check-cast v6, Lu93/v0;

    iget-object v1, v6, Lu93/v0;->M:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    return-object v1

    :pswitch_4
    check-cast v6, Lu93/t;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, v6, Lu93/t;->e:Lu93/u;

    iget-object v2, v2, Lu93/u;->I:Lkb3/l;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lva3/h;

    sget-object v4, Lz93/c;->F:Lz93/c;

    invoke-virtual {v6, v3, v4}, Lu93/t;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v6, v3, v4}, Lu93/t;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_1
    return-object v1

    :pswitch_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Scope for type parameter "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lce3/p;

    iget-object v2, v6, Lce3/p;->x:Ljava/lang/Object;

    check-cast v2, Lva3/h;

    invoke-virtual {v2}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v6, Lce3/p;->y:Ljava/lang/Object;

    check-cast v2, Lu93/i;

    invoke-virtual {v2}, Lu93/i;->getUpperBounds()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->y(Ljava/lang/String;Ljava/util/Collection;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    return-object v1

    :pswitch_6
    move-object v8, v6

    check-cast v8, Lu93/g;

    move-object v1, v8

    check-cast v1, Ljb3/u;

    invoke-virtual {v1}, Ljb3/u;->J0()Lr93/e;

    move-result-object v2

    sget-object v14, Lm83/y;->w:Lm83/y;

    if-nez v2, :cond_2

    goto/16 :goto_a

    :cond_2
    invoke-interface {v2}, Lr93/e;->getConstructors()Ljava/util/Collection;

    move-result-object v2

    const-string v6, "getConstructors(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu93/j;

    sget-object v7, Lu93/t0;->h0:Lt9/c0;

    move-object v9, v7

    iget-object v7, v8, Lu93/g;->F:Lkb3/n;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "storageManager"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljb3/u;->J0()Lr93/e;

    move-result-object v9

    if-nez v9, :cond_3

    move-object v9, v5

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v9

    invoke-static {v9}, Llb3/a1;->d(Llb3/y;)Llb3/a1;

    move-result-object v9

    :goto_3
    if-nez v9, :cond_4

    :goto_4
    move-object/from16 v25, v5

    goto/16 :goto_9

    :cond_4
    move-object v10, v9

    invoke-virtual {v6, v10}, Lu93/j;->Z0(Llb3/a1;)Lu93/j;

    move-result-object v9

    if-nez v9, :cond_5

    goto :goto_4

    :cond_5
    new-instance v16, Lu93/t0;

    move-object v11, v6

    check-cast v11, Lal/a;

    invoke-virtual {v11}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v11

    check-cast v6, Lu93/x;

    invoke-virtual {v6}, Lu93/x;->getKind()I

    move-result v12

    const-string v13, "getKind(...)"

    invoke-static {v12, v13}, Ljh3/c;->m(ILjava/lang/String;)V

    invoke-virtual {v8}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v13

    const-string v4, "getSource(...)"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object v4, v6

    move-object/from16 v6, v16

    invoke-direct/range {v6 .. v13}, Lu93/t0;-><init>(Lkb3/n;Lr93/w0;Lu93/j;Lu93/s0;Ls93/i;ILr93/s0;)V

    invoke-virtual {v4}, Lu93/x;->v()Ljava/util/List;

    move-result-object v17

    if-eqz v17, :cond_c

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lu93/x;->N0(Lr93/w;Ljava/util/List;Llb3/a1;ZZ[Z)Ljava/util/ArrayList;

    move-result-object v21

    move-object/from16 v6, v16

    move-object/from16 v10, v18

    if-nez v21, :cond_6

    goto :goto_4

    :cond_6
    check-cast v9, Lu93/x;

    iget-object v7, v9, Lu93/x;->H:Llb3/y;

    invoke-virtual {v7}, Llb3/y;->p0()Llb3/f1;

    move-result-object v7

    invoke-static {v7}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v7

    invoke-virtual {v1}, Ljb3/u;->i()Llb3/c0;

    move-result-object v9

    invoke-static {v7, v9}, Llb3/o;->o(Llb3/c0;Llb3/c0;)Llb3/c0;

    move-result-object v22

    iget-object v7, v4, Lu93/x;->K:Lr93/q0;

    sget-object v9, Ls93/g;->a:Ls93/f;

    if-eqz v7, :cond_7

    check-cast v7, Lu93/d;

    invoke-virtual {v7}, Lu93/d;->getType()Llb3/y;

    move-result-object v7

    sget-object v11, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v10, v7, v11}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v7

    invoke-static {v6, v7, v9}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v7

    move-object/from16 v17, v7

    goto :goto_5

    :cond_7
    move-object/from16 v17, v5

    :goto_5
    invoke-virtual {v1}, Ljb3/u;->J0()Lr93/e;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Lu93/x;->c0()Ljava/util/List;

    move-result-object v4

    const-string v11, "getContextReceiverParameters(...)"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v12, 0x0

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v16, v12, 0x1

    if-ltz v12, :cond_8

    check-cast v13, Lr93/q0;

    check-cast v13, Lu93/d;

    invoke-virtual {v13}, Lu93/d;->getType()Llb3/y;

    move-result-object v3

    move-object/from16 v25, v5

    sget-object v5, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v10, v3, v5}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v3

    invoke-interface {v13}, Lr93/q0;->getValue()Lfb3/d;

    move-result-object v5

    const-string v13, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lfb3/a;

    invoke-virtual {v5}, Lfb3/a;->Q()Lva3/h;

    move-result-object v5

    new-instance v13, Lu93/p0;

    new-instance v0, Lfb3/a;

    invoke-direct {v0, v7, v3, v5}, Lfb3/a;-><init>(Lr93/e;Llb3/y;Lva3/h;)V

    invoke-static {v12}, Lva3/i;->a(I)Lva3/h;

    move-result-object v3

    invoke-direct {v13, v7, v0, v9, v3}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;Lva3/h;)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move/from16 v12, v16

    move-object/from16 v5, v25

    const/16 v3, 0xa

    goto :goto_6

    :cond_8
    move-object/from16 v25, v5

    invoke-static {}, Lwb3/f;->d0()V

    throw v25

    :cond_9
    move-object/from16 v19, v11

    :goto_7
    move-object/from16 v25, v5

    goto :goto_8

    :cond_a
    move-object/from16 v19, v14

    goto :goto_7

    :goto_8
    invoke-virtual {v8}, Lu93/g;->j()Ljava/util/List;

    move-result-object v20

    sget-object v23, Lr93/a0;->x:Lr93/a0;

    iget-object v0, v8, Lu93/g;->G:Lr93/r;

    const/16 v18, 0x0

    move-object/from16 v24, v0

    move-object/from16 v16, v6

    invoke-virtual/range {v16 .. v24}, Lu93/x;->O0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)V

    move-object/from16 v5, v16

    :goto_9
    if-eqz v5, :cond_b

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    move-object/from16 v0, p0

    move-object/from16 v5, v25

    const/16 v3, 0xa

    goto/16 :goto_2

    :cond_c
    move-object/from16 v25, v5

    const/16 v0, 0x1c

    invoke-static {v0}, Lu93/x;->r0(I)V

    throw v25

    :cond_d
    move-object v14, v15

    :goto_a
    return-object v14

    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "retrying request, attempt "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lkotlin/jvm/internal/e0;

    iget v1, v6, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    check-cast v6, Ls93/l;

    iget-object v0, v6, Ls93/l;->a:Lo93/h;

    iget-object v1, v6, Ls93/l;->b:Lva3/e;

    invoke-virtual {v0, v1}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    return-object v0

    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TLS connect end: handshake="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lud3/c0;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "proxy select start: url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lud3/e0;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dns query: domain="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_c
    move-object/from16 v25, v5

    check-cast v6, Lmb3/i;

    iget-object v0, v6, Lmb3/i;->x:Lc93/a;

    if-eqz v0, :cond_e

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    goto :goto_b

    :cond_e
    move-object/from16 v5, v25

    :goto_b
    return-object v5

    :pswitch_d
    check-cast v6, Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, [Z

    if-eqz v3, :cond_f

    check-cast v1, [Z

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v1

    goto :goto_d

    :cond_f
    instance-of v3, v1, [C

    if-eqz v3, :cond_10

    check-cast v1, [C

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([C)I

    move-result v1

    goto :goto_d

    :cond_10
    instance-of v3, v1, [B

    if-eqz v3, :cond_11

    check-cast v1, [B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    goto :goto_d

    :cond_11
    instance-of v3, v1, [S

    if-eqz v3, :cond_12

    check-cast v1, [S

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([S)I

    move-result v1

    goto :goto_d

    :cond_12
    instance-of v3, v1, [I

    if-eqz v3, :cond_13

    check-cast v1, [I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    goto :goto_d

    :cond_13
    instance-of v3, v1, [F

    if-eqz v3, :cond_14

    check-cast v1, [F

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([F)I

    move-result v1

    goto :goto_d

    :cond_14
    instance-of v3, v1, [J

    if-eqz v3, :cond_15

    check-cast v1, [J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    goto :goto_d

    :cond_15
    instance-of v3, v1, [D

    if-eqz v3, :cond_16

    check-cast v1, [D

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([D)I

    move-result v1

    goto :goto_d

    :cond_16
    instance-of v3, v1, [Ljava/lang/Object;

    if-eqz v3, :cond_17

    check-cast v1, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_d

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    mul-int/lit8 v2, v2, 0x7f

    xor-int/2addr v1, v2

    add-int/2addr v4, v1

    goto/16 :goto_c

    :cond_18
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_e
    check-cast v6, Llb3/h0;

    iget-object v0, v6, Llb3/h0;->a:Lr93/x0;

    invoke-static {v0}, Lds/q;->H(Lr93/x0;)Llb3/y;

    move-result-object v0

    return-object v0

    :pswitch_f
    check-cast v6, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;

    invoke-static {v6}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->accessor$GivenFunctionsMemberScope$lambda0(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v25, v5

    check-cast v6, La00/g;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, v6, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Ljb3/h;

    iget-object v2, v1, Ljb3/h;->N:Lja3/h;

    iget-object v3, v1, Ljb3/h;->L:Lhb3/k;

    iget-object v1, v1, Ljb3/h;->E:Lqa3/k;

    invoke-virtual {v2}, Llb3/f;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/y;

    invoke-virtual {v4}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v4

    const/4 v5, 0x3

    move-object/from16 v7, v25

    invoke-static {v4, v7, v5}, Ldt/b;->t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_19
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/k;

    instance-of v6, v5, Lu93/q0;

    if-nez v6, :cond_1a

    instance-of v6, v5, Lr93/n0;

    if-eqz v6, :cond_19

    :cond_1a
    check-cast v5, Lr93/c;

    invoke-interface {v5}, Lr93/k;->getName()Lva3/h;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_1b
    move-object/from16 v25, v7

    goto :goto_e

    :cond_1c
    iget-object v2, v1, Lqa3/k;->Q:Ljava/util/List;

    const-string v4, "getFunctionList(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/c0;

    iget-object v5, v3, Lhb3/k;->b:Lsa3/f;

    iget v4, v4, Lqa3/c0;->F:I

    invoke-static {v5, v4}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_1d
    iget-object v1, v1, Lqa3/k;->R:Ljava/util/List;

    const-string v2, "getPropertyList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/k0;

    iget-object v4, v3, Lhb3/k;->b:Lsa3/f;

    iget v2, v2, Lqa3/k0;->F:I

    invoke-static {v4, v2}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_1e
    invoke-static {v0, v0}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0

    :pswitch_11
    check-cast v6, Lja3/o;

    invoke-virtual {v6}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v6}, Lja3/a0;->getVariableNames()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object v7, v5

    check-cast v6, Lga3/j;

    iget-object v0, v6, Lga3/b;->d:Lma3/a;

    instance-of v1, v0, Lx93/g;

    if-eqz v1, :cond_1f

    sget-object v1, Lga3/e;->a:Ljava/lang/Object;

    check-cast v0, Lx93/g;

    invoke-virtual {v0}, Lx93/g;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lga3/e;->a(Ljava/util/List;)Lab3/b;

    move-result-object v0

    goto :goto_12

    :cond_1f
    instance-of v1, v0, Lx93/s;

    if-eqz v1, :cond_20

    sget-object v1, Lga3/e;->a:Ljava/lang/Object;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lga3/e;->a(Ljava/util/List;)Lab3/b;

    move-result-object v0

    goto :goto_12

    :cond_20
    move-object v0, v7

    :goto_12
    if-eqz v0, :cond_21

    sget-object v1, Lga3/c;->b:Lva3/h;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v5

    goto :goto_13

    :cond_21
    move-object v5, v7

    :goto_13
    if-nez v5, :cond_22

    goto :goto_14

    :cond_22
    move-object v2, v5

    :goto_14
    return-object v2

    :pswitch_13
    move-object v7, v5

    check-cast v6, Lga3/i;

    sget-object v0, Lga3/e;->a:Ljava/lang/Object;

    iget-object v0, v6, Lga3/b;->d:Lma3/a;

    instance-of v1, v0, Lx93/s;

    if-eqz v1, :cond_23

    check-cast v0, Lx93/s;

    goto :goto_15

    :cond_23
    move-object v0, v7

    :goto_15
    if-eqz v0, :cond_24

    sget-object v1, Lga3/e;->b:Ljava/lang/Object;

    iget-object v0, v0, Lx93/s;->b:Ljava/lang/Enum;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls93/o;

    if-eqz v0, :cond_24

    new-instance v1, Lab3/i;

    sget-object v3, Lo93/m;->v:Lva3/e;

    const-string v4, "topLevelFqName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lva3/c;

    invoke-virtual {v3}, Lva3/e;->b()Lva3/e;

    move-result-object v5

    iget-object v3, v3, Lva3/e;->a:Lva3/f;

    invoke-virtual {v3}, Lva3/f;->g()Lva3/h;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    goto :goto_16

    :cond_24
    move-object v1, v7

    :goto_16
    if-eqz v1, :cond_25

    sget-object v0, Lga3/c;->c:Lva3/h;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v5

    goto :goto_17

    :cond_25
    move-object v5, v7

    :goto_17
    if-nez v5, :cond_26

    goto :goto_18

    :cond_26
    move-object v2, v5

    :goto_18
    return-object v2

    :pswitch_14
    check-cast v6, Lbg/k;

    iget-object v0, v6, Lbg/k;->a:[B

    array-length v0, v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [S

    const/4 v4, 0x0

    :goto_19
    if-ge v4, v0, :cond_28

    iget-object v2, v6, Lbg/k;->a:[B

    mul-int/lit8 v3, v4, 0x2

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-gt v3, v5, :cond_27

    aget-byte v5, v2, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v3, v3, 0x1

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v2, v5

    int-to-short v2, v2

    aput-short v2, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_19

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    new-instance v0, Ll83/z;

    invoke-direct {v0, v1}, Ll83/z;-><init>([S)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
