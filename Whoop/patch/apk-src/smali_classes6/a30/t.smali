.class public final La30/t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:La30/a0;

.field public final synthetic F:La30/n0;

.field public final synthetic G:Ly00/u1;

.field public final synthetic H:La30/k;

.field public final synthetic I:Z

.field public final synthetic J:La30/t0;

.field public final synthetic K:Ly00/n;

.field public w:La30/m0;

.field public x:I

.field public final synthetic y:Lbc3/j0;

.field public final synthetic z:Lbc3/i0;


# direct methods
.method public constructor <init>(Lbc3/j0;Lbc3/i0;La30/a0;La30/n0;Ly00/u1;La30/k;ZLa30/t0;Ly00/n;Lq83/d;)V
    .locals 0

    iput-object p1, p0, La30/t;->y:Lbc3/j0;

    iput-object p2, p0, La30/t;->z:Lbc3/i0;

    iput-object p3, p0, La30/t;->E:La30/a0;

    iput-object p4, p0, La30/t;->F:La30/n0;

    iput-object p5, p0, La30/t;->G:Ly00/u1;

    iput-object p6, p0, La30/t;->H:La30/k;

    iput-boolean p7, p0, La30/t;->I:Z

    iput-object p8, p0, La30/t;->J:La30/t0;

    iput-object p9, p0, La30/t;->K:Ly00/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    new-instance v0, La30/t;

    iget-object v8, p0, La30/t;->J:La30/t0;

    iget-object v9, p0, La30/t;->K:Ly00/n;

    iget-object v1, p0, La30/t;->y:Lbc3/j0;

    iget-object v2, p0, La30/t;->z:Lbc3/i0;

    iget-object v3, p0, La30/t;->E:La30/a0;

    iget-object v4, p0, La30/t;->F:La30/n0;

    iget-object v5, p0, La30/t;->G:Ly00/u1;

    iget-object v6, p0, La30/t;->H:La30/k;

    iget-boolean v7, p0, La30/t;->I:Z

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, La30/t;-><init>(Lbc3/j0;Lbc3/i0;La30/a0;La30/n0;Ly00/u1;La30/k;ZLa30/t0;Ly00/n;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La30/t;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La30/t;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La30/t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 46

    move-object/from16 v1, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, La30/t;->x:I

    const/4 v3, 0x0

    iget-object v4, v1, La30/t;->E:La30/a0;

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    iget-object v0, v1, La30/t;->w:La30/m0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    move-object v2, v0

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v6, v1, La30/t;->x:I

    iget-object v2, v1, La30/t;->y:Lbc3/j0;

    invoke-virtual {v2, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v2, La30/m0;

    iput-object v2, v1, La30/t;->w:La30/m0;

    iput v5, v1, La30/t;->x:I

    iget-object v7, v1, La30/t;->z:Lbc3/i0;

    move-object v8, v7

    check-cast v8, Lbc3/t1;

    invoke-virtual {v8}, Lbc3/t1;->isCompleted()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1

    :cond_4
    iget-object v7, v4, La30/a0;->h:Lb20/f;

    sget-object v8, Lb20/c;->T:Lb20/c;

    const/4 v9, 0x6

    invoke-static {v7, v8, v3, v3, v9}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    move-object v7, v3

    :goto_1
    if-ne v7, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    check-cast v7, Ljava/lang/Boolean;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v7, v0

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    iget-object v9, v1, La30/t;->G:Ly00/u1;

    iget-object v10, v9, Ly00/u1;->F:Ljava/util/Map;

    iget-object v11, v9, Ly00/u1;->w:Ly00/t1;

    iget-object v12, v9, Ly00/u1;->z:Ly00/c8;

    iget-object v13, v4, La30/a0;->m:Lbz/i;

    iget-object v14, v1, La30/t;->F:La30/n0;

    iget-object v15, v14, La30/n0;->b:Lmy/a;

    iget-object v0, v4, La30/a0;->e:Lu00/e;

    iget-object v8, v9, Ly00/u1;->N:Ljava/lang/Object;

    iget-object v5, v9, Ly00/u1;->H:Ly00/p1;

    iget-object v6, v9, Ly00/u1;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "stripeIntent"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v12}, Ly00/c8;->p()Ljava/util/List;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    sget-object v19, Lm83/y;->w:Lm83/y;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v20

    if-nez v20, :cond_8

    :cond_7
    move-object/from16 v20, v0

    goto :goto_7

    :cond_8
    invoke-static {v6}, Lx30/d1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v20, v0

    instance-of v0, v6, Ll83/m;

    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v21

    if-eqz v21, :cond_9

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v21

    goto :goto_5

    :cond_9
    const/16 v21, 0x0

    :goto_5
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v22

    if-nez v22, :cond_a

    goto :goto_6

    :cond_a
    move-object/from16 v6, v19

    :goto_6
    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v3, v6}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    move-object/from16 v6, v21

    move/from16 v21, v0

    goto :goto_8

    :goto_7
    const/4 v6, 0x0

    const/16 v21, 0x0

    :goto_8
    new-instance v0, Ljava/util/ArrayList;

    move/from16 v22, v7

    const/16 v7, 0xa

    move-object/from16 v23, v8

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual/range {v24 .. v24}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v7, 0xa

    goto :goto_9

    :cond_b
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v7, v20

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_d

    move-object/from16 v20, v7

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v24, v10

    move-object v10, v7

    check-cast v10, Ljava/lang/String;

    invoke-interface {v0, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    move-object/from16 v7, v20

    move-object/from16 v10, v24

    goto :goto_a

    :cond_d
    move-object/from16 v24, v10

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    const-class v0, Lu00/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v7, "lpms.json"

    invoke-virtual {v0, v7}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_e

    sget-object v7, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v10, Ljava/io/InputStreamReader;

    invoke-direct {v10, v0, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v0, Ljava/io/BufferedReader;

    const/16 v7, 0x2000

    invoke-direct {v0, v10, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v7, v0

    goto :goto_b

    :cond_e
    const/4 v7, 0x0

    :goto_b
    if-eqz v7, :cond_f

    :try_start_0
    invoke-static {v7}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_c
    const/4 v10, 0x0

    goto :goto_d

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v7, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    const/4 v0, 0x0

    goto :goto_c

    :goto_d
    invoke-static {v7, v10}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_11

    invoke-static {v0}, Lx30/d1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-nez v7, :cond_10

    goto :goto_e

    :cond_10
    move-object/from16 v0, v19

    :goto_e
    check-cast v0, Ljava/util/List;

    goto :goto_f

    :cond_11
    const/4 v0, 0x0

    :goto_f
    if-nez v0, :cond_12

    move-object/from16 v0, v19

    :cond_12
    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v20, v10

    check-cast v20, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    move-object/from16 v26, v0

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    move-object/from16 v0, v26

    goto :goto_10

    :cond_14
    invoke-static {v3, v7}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    :cond_15
    const/4 v7, 0x4

    if-eqz v21, :cond_16

    iget-object v0, v4, La30/a0;->g:Lk20/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lk20/l;

    invoke-direct {v8, v6, v7}, Lk20/l;-><init>(Ljava/lang/String;I)V

    const/4 v10, 0x0

    invoke-virtual {v0, v8, v10}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    :cond_16
    iget-object v6, v4, La30/a0;->l:Lx30/t0;

    iget-object v0, v9, Ly00/u1;->y:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_18

    :cond_17
    move-object/from16 v21, v3

    const/4 v10, 0x0

    goto :goto_13

    :cond_18
    :try_start_2
    sget-object v8, Lx30/u0;->a:Lad3/r;

    new-instance v10, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v20, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->Companion:Lcom/stripe/android/ui/core/elements/n;

    invoke-virtual/range {v20 .. v20}, Lcom/stripe/android/ui/core/elements/n;->serializer()Lwc3/c;

    move-result-object v7

    invoke-direct {v10, v7}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-virtual {v8, v10, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_11

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_11
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v7

    if-eqz v7, :cond_19

    iget-object v6, v6, Lx30/t0;->a:Lb20/f;

    sget-object v8, Lb20/e;->Q:Lb20/e;

    sget v10, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v7}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v7

    move-object/from16 v21, v3

    const/4 v3, 0x4

    const/4 v10, 0x0

    invoke-static {v6, v8, v7, v10, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    goto :goto_12

    :cond_19
    move-object/from16 v21, v3

    const/4 v10, 0x0

    :goto_12
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_1a

    move-object/from16 v19, v0

    :cond_1a
    check-cast v19, Ljava/util/List;

    :goto_13
    move-object/from16 v0, v19

    iget-object v3, v15, Lmy/a;->M:Ljava/util/List;

    iget-boolean v6, v15, Lmy/a;->K:Z

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    if-eqz v7, :cond_20

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1b

    goto :goto_17

    :cond_1b
    if-eqz v0, :cond_1d

    move-object v7, v0

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    move-object/from16 v19, v3

    const/16 v10, 0xa

    invoke-static {v7, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;

    invoke-virtual {v7}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1c
    move-object v10, v8

    goto :goto_15

    :cond_1d
    move-object/from16 v19, v3

    const/4 v10, 0x0

    :goto_15
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1e
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v10, :cond_1f

    invoke-interface {v10, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1e

    :cond_1f
    new-instance v8, Ljava/lang/StringBuilder;

    move-object/from16 v19, v3

    const-string v3, "Requested external payment method "

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not supported. View all available external payment methods here: https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v3}, Lbz/i;->a(Ljava/lang/String;)V

    move-object/from16 v3, v19

    goto :goto_16

    :cond_20
    :goto_17
    invoke-interface/range {v23 .. v23}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_22

    :cond_21
    move-object/from16 v20, v15

    goto :goto_1a

    :cond_22
    move-object/from16 v8, v23

    check-cast v8, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_23
    :goto_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_24

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v10, v8, Ly00/d1;

    if-eqz v10, :cond_23

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_24
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_21

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly00/d1;

    iget-object v8, v7, Ly00/d1;->w:Ljava/lang/String;

    iget-object v7, v7, Ly00/d1;->x:Ljava/lang/String;

    const-string v10, " contained an error \""

    move-object/from16 v19, v3

    const-string v3, "\"!"

    move-object/from16 v20, v15

    const-string v15, "Requested custom payment method "

    invoke-static {v15, v8, v10, v7, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v3}, Lbz/i;->a(Ljava/lang/String;)V

    move-object/from16 v3, v19

    move-object/from16 v15, v20

    goto :goto_19

    :goto_1a
    iget-object v3, v1, La30/t;->H:La30/k;

    instance-of v7, v3, La30/i;

    const-string v8, "customer"

    if-eqz v7, :cond_26

    if-eqz v5, :cond_25

    iget-object v10, v5, Ly00/p1;->y:Ly00/o1;

    iget-object v13, v10, Ly00/o1;->E:Ljava/lang/String;

    iget-object v10, v10, Ly00/o1;->y:Ljava/lang/String;

    move-object v15, v3

    check-cast v15, La30/i;

    iget-object v15, v15, La30/i;->b:Ljava/lang/String;

    move-object/from16 v29, v15

    :goto_1b
    move-object/from16 v28, v10

    move-object/from16 v27, v13

    goto :goto_1d

    :cond_25
    :goto_1c
    const/4 v10, 0x0

    goto/16 :goto_24

    :cond_26
    instance-of v10, v3, La30/j;

    if-eqz v10, :cond_32

    move-object v10, v3

    check-cast v10, La30/j;

    iget-object v13, v10, La30/j;->c:Ljava/lang/String;

    iget-object v10, v10, La30/j;->d:Ljava/lang/String;

    const/16 v29, 0x0

    goto :goto_1b

    :goto_1d
    new-instance v26, Lv00/p;

    if-eqz v5, :cond_27

    iget-object v10, v5, Ly00/p1;->y:Ly00/o1;

    if-eqz v10, :cond_27

    iget-object v10, v10, Ly00/o1;->F:Ly00/n1;

    if-eqz v10, :cond_27

    iget-object v10, v10, Ly00/n1;->w:Ly00/k1;

    goto :goto_1e

    :cond_27
    const/4 v10, 0x0

    :goto_1e
    instance-of v13, v10, Ly00/j1;

    if-eqz v13, :cond_28

    check-cast v10, Ly00/j1;

    goto :goto_1f

    :cond_28
    const/4 v10, 0x0

    :goto_1f
    if-eqz v10, :cond_29

    iget-boolean v10, v10, Ly00/j1;->E:Z

    move/from16 v30, v10

    goto :goto_20

    :cond_29
    const/16 v30, 0x0

    :goto_20
    if-eqz v7, :cond_31

    check-cast v3, La30/i;

    iget-object v3, v3, La30/i;->a:Ly00/p1;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Ly00/p1;->y:Ly00/o1;

    iget-object v3, v3, Ly00/o1;->F:Ly00/n1;

    iget-object v3, v3, Ly00/n1;->w:Ly00/k1;

    instance-of v7, v3, Ly00/j1;

    if-eqz v7, :cond_2d

    move-object v10, v3

    check-cast v10, Ly00/j1;

    iget-object v10, v10, Ly00/j1;->x:Ly00/l1;

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    if-eqz v10, :cond_2c

    const/4 v13, 0x1

    if-eq v10, v13, :cond_2b

    const/4 v13, 0x2

    if-ne v10, v13, :cond_2a

    sget-object v10, Lmy/b;->z:Lmy/b;

    goto :goto_21

    :cond_2a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2b
    sget-object v10, Lmy/b;->y:Lmy/b;

    goto :goto_21

    :cond_2c
    sget-object v10, Lmy/b;->x:Lmy/b;

    goto :goto_21

    :cond_2d
    instance-of v10, v3, Ly00/i1;

    if-eqz v10, :cond_30

    sget-object v10, Lmy/b;->z:Lmy/b;

    :goto_21
    if-eqz v6, :cond_2f

    if-eqz v7, :cond_2f

    check-cast v3, Ly00/j1;

    iget-object v3, v3, Ly00/j1;->y:Ly00/m1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ly00/m1;->w:Ly00/m1;

    if-eq v3, v6, :cond_2e

    sget-object v6, Ly00/m1;->y:Ly00/m1;

    if-ne v3, v6, :cond_2f

    :cond_2e
    const/4 v3, 0x1

    goto :goto_22

    :cond_2f
    const/4 v3, 0x0

    :goto_22
    new-instance v6, Lv00/o;

    const/4 v13, 0x1

    invoke-direct {v6, v10, v3, v13, v13}, Lv00/o;-><init>(Lmy/b;ZZZ)V

    move-object/from16 v31, v6

    goto :goto_23

    :cond_30
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_31
    new-instance v3, Lv00/o;

    sget-object v7, Lmy/b;->x:Lmy/b;

    const/4 v10, 0x0

    invoke-direct {v3, v7, v6, v10, v10}, Lv00/o;-><init>(Lmy/b;ZZZ)V

    move-object/from16 v31, v3

    :goto_23
    invoke-direct/range {v26 .. v31}, Lv00/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLv00/o;)V

    move-object/from16 v10, v26

    goto :goto_24

    :cond_32
    if-nez v3, :cond_95

    goto/16 :goto_1c

    :goto_24
    sget-object v3, Ld10/a;->a:Ljava/util/LinkedHashMap;

    iget-object v3, v4, La30/a0;->q:Ljava/lang/String;

    invoke-static {v3}, Ld10/a;->a(Ljava/lang/String;)Ld10/b;

    move-result-object v3

    iget-object v6, v1, La30/t;->J:La30/t0;

    invoke-virtual {v6, v3}, La30/t0;->b(Ld10/b;)Lv00/a0;

    move-result-object v3

    iget-object v7, v4, La30/a0;->r:La00/g;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, Ln83/f;

    invoke-direct {v13}, Ln83/f;-><init>()V

    new-instance v15, Ln83/f;

    invoke-direct {v15}, Ln83/f;-><init>()V

    new-instance v1, Lv00/l;

    move-object/from16 v19, v9

    instance-of v9, v6, La30/p0;

    if-eqz v9, :cond_33

    const-string v9, "crypto_onramp"

    :goto_25
    move-object/from16 v26, v0

    goto :goto_26

    :cond_33
    instance-of v9, v6, La30/o0;

    if-eqz v9, :cond_34

    const-string v9, "checkout_session"

    goto :goto_25

    :cond_34
    instance-of v9, v6, La30/q0;

    if-eqz v9, :cond_37

    move-object v9, v6

    check-cast v9, La30/q0;

    iget-object v9, v9, La30/q0;->w:Lh20/u2;

    iget-object v9, v9, Lh20/u2;->w:Lh20/r2;

    move-object/from16 v26, v0

    instance-of v0, v9, Lh20/p2;

    if-eqz v0, :cond_35

    const-string v9, "deferred_payment_intent"

    goto :goto_26

    :cond_35
    instance-of v0, v9, Lh20/q2;

    if-eqz v0, :cond_36

    const-string v9, "deferred_setup_intent"

    goto :goto_26

    :cond_36
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_37
    move-object/from16 v26, v0

    instance-of v0, v6, La30/r0;

    if-eqz v0, :cond_38

    const-string v9, "payment_intent"

    goto :goto_26

    :cond_38
    instance-of v0, v6, La30/s0;

    if-eqz v0, :cond_94

    const-string v9, "setup_intent"

    :goto_26
    invoke-direct {v1, v9}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v0, "intent_type"

    invoke-virtual {v15, v0, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    instance-of v1, v3, Lv00/z;

    if-eqz v1, :cond_39

    :goto_27
    const/4 v1, 0x0

    goto :goto_29

    :cond_39
    sget-object v1, Lv00/s;->w:Lv00/s;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3a

    :goto_28
    const/4 v1, 0x1

    goto :goto_29

    :cond_3a
    instance-of v1, v3, Lv00/u;

    if-eqz v1, :cond_3b

    goto :goto_28

    :cond_3b
    instance-of v1, v3, Lv00/v;

    if-eqz v1, :cond_3c

    goto :goto_28

    :cond_3c
    instance-of v1, v3, Lv00/w;

    if-eqz v1, :cond_3d

    goto :goto_28

    :cond_3d
    instance-of v1, v3, Lv00/x;

    if-eqz v1, :cond_3e

    goto :goto_28

    :cond_3e
    instance-of v1, v3, Lv00/r;

    if-eqz v1, :cond_93

    goto :goto_27

    :goto_29
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "is_decoupled"

    invoke-virtual {v15, v1, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    instance-of v1, v3, Lv00/x;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "is_spt"

    invoke-virtual {v15, v1, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    instance-of v1, v3, Lv00/v;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "is_confirmation_tokens"

    invoke-virtual {v15, v1, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    invoke-virtual {v13, v0}, Ln83/f;->putAll(Ljava/util/Map;)V

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    new-instance v1, Lv00/l;

    invoke-interface {v12}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v9}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v9, "intent_id"

    invoke-virtual {v0, v9, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv00/k;

    iget-object v9, v7, La00/g;->x:Ljava/lang/Object;

    check-cast v9, Ll20/a;

    invoke-virtual {v9, v12}, Ll20/a;->a(Ly00/c8;)Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-direct {v1, v9}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v9, "require_cvc_recollection"

    invoke-virtual {v0, v9, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv00/l;

    invoke-static {v12}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v1, v9}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v9, "currency"

    invoke-virtual {v0, v9, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv00/l;

    instance-of v9, v12, Ly00/g6;

    if-eqz v9, :cond_3f

    move-object v9, v12

    check-cast v9, Ly00/g6;

    iget-object v9, v9, Ly00/g6;->L:Lcom/stripe/android/model/StripeIntent$Usage;

    goto :goto_2a

    :cond_3f
    instance-of v9, v12, Ly00/l3;

    if-eqz v9, :cond_92

    move-object v9, v12

    check-cast v9, Ly00/l3;

    iget-object v9, v9, Ly00/l3;->R:Lcom/stripe/android/model/StripeIntent$Usage;

    :goto_2a
    if-eqz v9, :cond_40

    iget-object v9, v9, Lcom/stripe/android/model/StripeIntent$Usage;->w:Ljava/lang/String;

    goto :goto_2b

    :cond_40
    const/4 v9, 0x0

    :goto_2b
    invoke-direct {v1, v9}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v9, "setup_future_usage"

    invoke-virtual {v0, v9, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v12}, Ly00/c8;->G()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_41

    goto :goto_2f

    :cond_41
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_45

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v27, v1

    instance-of v1, v15, Ljava/util/Map;

    if-eqz v1, :cond_42

    move-object v1, v15

    check-cast v1, Ljava/util/Map;

    goto :goto_2d

    :cond_42
    const/4 v1, 0x0

    :goto_2d
    if-eqz v1, :cond_43

    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2e

    :cond_43
    const/4 v1, 0x0

    :goto_2e
    if-eqz v1, :cond_44

    const/4 v1, 0x1

    goto :goto_30

    :cond_44
    move-object/from16 v1, v27

    goto :goto_2c

    :cond_45
    :goto_2f
    const/4 v1, 0x0

    :goto_30
    new-instance v9, Lv00/k;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v9, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "payment_method_options_setup_future_usage"

    invoke-virtual {v0, v1, v9}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    invoke-virtual {v13, v0}, Ln83/f;->putAll(Ljava/util/Map;)V

    iget-object v0, v14, La30/n0;->b:Lmy/a;

    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    instance-of v9, v2, La30/l0;

    if-eqz v9, :cond_46

    move-object v15, v2

    check-cast v15, La30/l0;

    :goto_31
    move-object/from16 v42, v3

    goto :goto_32

    :cond_46
    const/4 v15, 0x0

    goto :goto_31

    :goto_32
    new-instance v3, Lv00/k;

    if-eqz v15, :cond_47

    const/16 v27, 0x1

    :goto_33
    move-object/from16 v28, v6

    goto :goto_34

    :cond_47
    const/16 v27, 0x0

    goto :goto_33

    :goto_34
    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v3, v6}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v6, "link_enabled"

    invoke-virtual {v1, v6, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lv00/l;

    if-eqz v11, :cond_4b

    iget-object v6, v11, Ly00/t1;->y:Ly00/p2;

    if-eqz v6, :cond_4b

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_4a

    move/from16 v27, v9

    const/4 v9, 0x1

    if-eq v6, v9, :cond_49

    const/4 v9, 0x2

    if-ne v6, v9, :cond_48

    const-string v6, "link_card_brand"

    goto :goto_35

    :cond_48
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_49
    const-string v6, "payment_method_mode"

    goto :goto_35

    :cond_4a
    move/from16 v27, v9

    const-string v6, "passthrough"

    goto :goto_35

    :cond_4b
    move/from16 v27, v9

    const/4 v6, 0x0

    :goto_35
    invoke-direct {v3, v6}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v6, "link_mode"

    invoke-virtual {v1, v6, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lf20/a;->a(Ly00/u1;)Lf20/b;

    move-result-object v3

    const/4 v6, -0x1

    if-nez v3, :cond_4c

    move v3, v6

    goto :goto_36

    :cond_4c
    sget-object v9, La30/b;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v9, v3

    :goto_36
    if-eq v3, v6, :cond_4f

    const/4 v9, 0x1

    if-eq v3, v9, :cond_4e

    const/4 v9, 0x2

    if-ne v3, v9, :cond_4d

    const-string v3, "LITE"

    goto :goto_37

    :cond_4d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4e
    const-string v3, "FULL"

    goto :goto_37

    :cond_4f
    const-string v3, "NONE"

    :goto_37
    new-instance v9, Lv00/l;

    invoke-direct {v9, v3}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v3, "fc_sdk_availability"

    invoke-virtual {v1, v3, v9}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lv00/l;

    iget-object v9, v0, Lmy/a;->z:Lh20/w2;

    move/from16 v29, v6

    iget-object v6, v0, Lmy/a;->x:Lh20/c2;

    iget-object v9, v9, Lh20/w2;->w:Lh20/v2;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    const-string v30, "automatic"

    if-eqz v9, :cond_51

    move-object/from16 v31, v4

    const/4 v4, 0x1

    if-ne v9, v4, :cond_50

    const-string v4, "never"

    goto :goto_38

    :cond_50
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_51
    move-object/from16 v31, v4

    move-object/from16 v4, v30

    :goto_38
    invoke-direct {v3, v4}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v4, "link_display"

    invoke-virtual {v1, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v3, v2, La30/f0;

    if-eqz v3, :cond_52

    move-object v3, v2

    check-cast v3, La30/f0;

    goto :goto_39

    :cond_52
    const/4 v3, 0x0

    :goto_39
    if-eqz v3, :cond_53

    iget-object v3, v3, La30/f0;->w:Ljava/util/List;

    if-eqz v3, :cond_53

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v32, v2

    const/16 v9, 0xa

    invoke-static {v3, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_54

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/o2;

    iget-object v3, v3, Ly00/o2;->w:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3a

    :cond_53
    move-object/from16 v32, v2

    const/4 v4, 0x0

    :cond_54
    const-string v2, "link_disabled_reasons"

    invoke-static {v1, v2, v4}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    if-eqz v15, :cond_55

    iget-object v2, v15, La30/l0;->y:La30/j0;

    if-eqz v2, :cond_55

    invoke-interface {v2}, La30/j0;->P()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_55

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v2, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_56

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly00/t2;

    iget-object v4, v4, Ly00/t2;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_55
    const/4 v3, 0x0

    :cond_56
    const-string v2, "link_signup_disabled_reasons"

    invoke-static {v1, v2, v3}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    new-instance v2, Lv00/k;

    iget-object v3, v7, La00/g;->E:Ljava/lang/Object;

    check-cast v3, Lu00/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lb00/a;

    if-eqz v11, :cond_57

    iget-boolean v4, v11, Ly00/t1;->G:Z

    goto :goto_3c

    :cond_57
    const/4 v4, 0x0

    :goto_3c
    if-eqz v11, :cond_58

    iget-boolean v9, v11, Ly00/t1;->H:Z

    goto :goto_3d

    :cond_58
    const/4 v9, 0x0

    :goto_3d
    if-eqz v11, :cond_59

    iget-boolean v15, v11, Ly00/t1;->I:Z

    goto :goto_3e

    :cond_59
    const/4 v15, 0x0

    :goto_3e
    invoke-direct {v3, v12, v4, v9, v15}, Lb00/a;-><init>(Ly00/c8;ZZZ)V

    invoke-virtual {v3}, Lb00/a;->b()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, v3}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v3, "link_native_available"

    invoke-virtual {v1, v3, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    invoke-virtual {v13, v1}, Ln83/f;->putAll(Ljava/util/Map;)V

    new-instance v1, Ln83/f;

    invoke-direct {v1}, Ln83/f;-><init>()V

    new-instance v2, Lv00/k;

    if-eqz v10, :cond_5a

    iget-boolean v3, v10, Lv00/p;->z:Z

    const/4 v9, 0x1

    if-ne v3, v9, :cond_5a

    const/4 v3, 0x1

    goto :goto_3f

    :cond_5a
    const/4 v3, 0x0

    :goto_3f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, v3}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v3, "set_as_default_enabled"

    invoke-virtual {v1, v3, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lv00/k;

    if-eqz v5, :cond_5b

    iget-object v3, v5, Ly00/p1;->x:Ljava/lang/String;

    goto :goto_40

    :cond_5b
    const/4 v3, 0x0

    :goto_40
    if-eqz v3, :cond_5c

    const/4 v3, 0x1

    goto :goto_41

    :cond_5c
    const/4 v3, 0x0

    :goto_41
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, v3}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v3, "has_default_payment_method"

    invoke-virtual {v1, v3, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    invoke-virtual {v13, v1}, Ln83/f;->putAll(Ljava/util/Map;)V

    new-instance v1, Lv00/k;

    invoke-static/range {v22 .. v22}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v1, v2}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v2, "google_pay_enabled"

    invoke-virtual {v13, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv00/j;

    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    new-instance v3, Ln83/f;

    invoke-direct {v3}, Ln83/f;-><init>()V

    new-instance v4, Lv00/k;

    iget-object v5, v0, Lmy/a;->X:Lh20/h1;

    if-eqz v6, :cond_5d

    const/4 v9, 0x1

    goto :goto_42

    :cond_5d
    const/4 v9, 0x0

    :goto_42
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-direct {v4, v9}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/l;

    if-eqz v6, :cond_5e

    iget-object v6, v6, Lh20/c2;->y:Lh20/b2;

    if-eqz v6, :cond_5e

    invoke-interface {v6}, Lh20/b2;->e()Ljava/lang/String;

    move-result-object v6

    goto :goto_43

    :cond_5e
    const/4 v6, 0x0

    :goto_43
    invoke-direct {v4, v6}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v6, "customer_access_provider"

    invoke-virtual {v3, v6, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-object v6, v0, Lmy/a;->y:Lh20/h2;

    if-eqz v6, :cond_5f

    const/4 v6, 0x1

    goto :goto_44

    :cond_5f
    const/4 v6, 0x0

    :goto_44
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v4, v6}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v6, "googlepay"

    invoke-virtual {v3, v6, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-object v6, v5, Lh20/h1;->E:Lh20/y2;

    iget-object v8, v6, Lh20/y2;->w:Lh20/z2;

    iget-object v9, v6, Lh20/y2;->x:Lh20/z2;

    iget-object v8, v8, Lh20/z2;->w:Ljava/lang/Integer;

    if-nez v8, :cond_61

    iget-object v8, v9, Lh20/z2;->w:Ljava/lang/Integer;

    if-eqz v8, :cond_60

    goto :goto_45

    :cond_60
    const/4 v8, 0x0

    goto :goto_46

    :cond_61
    :goto_45
    const/4 v8, 0x1

    :goto_46
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "primary_button_color"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-object v8, v0, Lmy/a;->E:Lh20/i1;

    if-eqz v8, :cond_62

    invoke-virtual {v8}, Lh20/i1;->b()Z

    move-result v8

    const/4 v12, 0x1

    if-ne v8, v12, :cond_62

    const/4 v8, 0x1

    goto :goto_47

    :cond_62
    const/4 v8, 0x0

    :goto_47
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "default_billing_details"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-boolean v8, v0, Lmy/a;->G:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "allows_delayed_payment_methods"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "payment_method_order"

    iget-object v8, v0, Lmy/a;->L:Ljava/util/List;

    invoke-static {v3, v4, v8}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    new-instance v4, Lv00/k;

    iget-boolean v8, v0, Lmy/a;->H:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "allows_payment_methods_requiring_shipping_address"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-boolean v8, v0, Lmy/a;->K:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "allows_removal_of_last_saved_payment_method"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lmy/a;->J:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v4, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_48
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_63

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly00/i;

    iget-object v12, v12, Ly00/i;->w:Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_48

    :cond_63
    const-string v4, "preferred_networks"

    invoke-static {v3, v4, v8}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    iget-object v4, v0, Lmy/a;->P:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v4, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_49
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_64

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lh20/y1;

    iget-object v12, v12, Lh20/y1;->w:Ljava/lang/String;

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_49

    :cond_64
    const-string v4, "custom_payment_methods"

    invoke-static {v3, v4, v8}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    iget-object v4, v0, Lmy/a;->M:Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    const/16 v12, 0xa

    invoke-static {v4, v12}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    const-string v8, "external_payment_methods"

    invoke-static {v3, v8, v4}, Ls2/e;->k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V

    new-instance v4, Lv00/k;

    iget-object v8, v0, Lmy/a;->N:Lh20/t1;

    instance-of v8, v8, Lh20/p1;

    const/16 v17, 0x1

    xor-int/lit8 v8, v8, 0x1

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "card_brand_acceptance"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-object v8, v7, La00/g;->z:Ljava/lang/Object;

    check-cast v8, Lk83/a;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_65

    const/4 v8, 0x1

    goto :goto_4a

    :cond_65
    const/4 v8, 0x0

    :goto_4a
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "analytic_callback_set"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-boolean v8, v0, Lmy/a;->V:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "open_card_scan_automatically"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/k;

    iget-object v8, v0, Lmy/a;->T:Ljava/util/Map;

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    const/16 v17, 0x1

    xor-int/lit8 v8, v8, 0x1

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v8, "terms_display"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/j;

    iget-object v8, v0, Lmy/a;->I:Lh20/l1;

    new-instance v12, Ln83/f;

    invoke-direct {v12}, Ln83/f;-><init>()V

    new-instance v15, Lv00/k;

    move-object/from16 v22, v10

    iget-boolean v10, v8, Lh20/l1;->E:Z

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-direct {v15, v10}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v10, "attach_defaults"

    invoke-virtual {v12, v10, v15}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lv00/l;

    iget-object v15, v8, Lh20/l1;->w:Lh20/k1;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v10, v15}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v15, "name"

    invoke-virtual {v12, v15, v10}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lv00/l;

    iget-object v15, v8, Lh20/l1;->y:Lh20/k1;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v10, v15}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v15, "email"

    invoke-virtual {v12, v15, v10}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lv00/l;

    iget-object v15, v8, Lh20/l1;->x:Lh20/k1;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v10, v15}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v15, "phone"

    invoke-virtual {v12, v15, v10}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lv00/l;

    iget-object v15, v8, Lh20/l1;->z:Lh20/j1;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v10, v15}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v15, "address"

    invoke-virtual {v12, v15, v10}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_66

    new-instance v10, Lv00/l;

    invoke-virtual {v8}, Lh20/l1;->b()Ljava/util/Set;

    move-result-object v8

    move-object/from16 v33, v8

    check-cast v33, Ljava/lang/Iterable;

    const/16 v37, 0x0

    const/16 v38, 0x3e

    const-string v34, ","

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v33 .. v38}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v10, v8}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v8, "allowed_countries"

    invoke-virtual {v12, v8, v10}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_66
    invoke-virtual {v12}, Ln83/f;->b()Ln83/f;

    move-result-object v8

    invoke-direct {v4, v8}, Lv00/j;-><init>(Ljava/util/Map;)V

    const-string v8, "billing_details_collection_configuration"

    invoke-virtual {v3, v8, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lv00/j;

    new-instance v8, Ln83/f;

    invoke-direct {v8}, Ln83/f;-><init>()V

    iget-object v10, v5, Lh20/h1;->z:Lh20/l3;

    iget-object v12, v5, Lh20/h1;->y:Lh20/c3;

    new-instance v15, Ln83/f;

    invoke-direct {v15}, Ln83/f;-><init>()V

    move-object/from16 v33, v11

    new-instance v11, Lv00/k;

    move-object/from16 v34, v13

    iget-object v13, v6, Lh20/y2;->w:Lh20/z2;

    move-object/from16 v35, v1

    iget-object v1, v6, Lh20/y2;->y:Lh20/a3;

    move-object/from16 v36, v14

    sget-object v14, Lh20/z2;->F:Lh20/z2;

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    const/16 v17, 0x1

    xor-int/lit8 v13, v13, 0x1

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v11, v13}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v13, "colorsLight"

    invoke-virtual {v15, v13, v11}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lv00/k;

    sget-object v14, Lh20/z2;->G:Lh20/z2;

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-direct {v11, v9}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v9, "colorsDark"

    invoke-virtual {v15, v9, v11}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lv00/k;

    iget-object v14, v1, Lh20/a3;->w:Ljava/lang/Float;

    if-eqz v14, :cond_67

    const/4 v14, 0x1

    goto :goto_4b

    :cond_67
    const/4 v14, 0x0

    :goto_4b
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v11, v14}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v14, "corner_radius"

    invoke-virtual {v15, v14, v11}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lv00/k;

    iget-object v1, v1, Lh20/a3;->x:Ljava/lang/Float;

    if-eqz v1, :cond_68

    const/4 v1, 0x1

    goto :goto_4c

    :cond_68
    const/4 v1, 0x0

    :goto_4c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v11, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "border_width"

    invoke-virtual {v15, v1, v11}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lv00/k;

    iget-object v6, v6, Lh20/y2;->z:Lh20/b3;

    iget-object v6, v6, Lh20/b3;->w:Ljava/lang/Integer;

    if-eqz v6, :cond_69

    const/4 v6, 0x1

    goto :goto_4d

    :cond_69
    const/4 v6, 0x0

    :goto_4d
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v11, v6}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v6, "font"

    invoke-virtual {v15, v6, v11}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15}, Ln83/f;->b()Ln83/f;

    move-result-object v11

    new-instance v15, Lv00/j;

    invoke-direct {v15, v11}, Lv00/j;-><init>(Ljava/util/Map;)V

    move-object/from16 v37, v11

    const-string v11, "primary_button"

    invoke-virtual {v8, v11, v15}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Ln83/f;

    invoke-direct {v11}, Ln83/f;-><init>()V

    new-instance v15, Lv00/k;

    move-object/from16 v38, v2

    iget-object v2, v5, Lh20/h1;->w:Lh20/v1;

    move-object/from16 v39, v0

    sget-object v0, Lh20/v1;->L:Lh20/v1;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/16 v17, 0x1

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v15, v0}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v13, v15}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    iget-object v2, v5, Lh20/h1;->x:Lh20/v1;

    sget-object v13, Lh20/v1;->M:Lh20/v1;

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v9, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    iget v2, v12, Lh20/c3;->w:F

    sget-object v9, Ld40/q;->c:Ld40/o;

    iget v13, v9, Ld40/o;->a:F

    cmpg-float v2, v2, v13

    if-nez v2, :cond_6a

    const/16 v17, 0x1

    :goto_4e
    const/4 v13, 0x1

    goto :goto_4f

    :cond_6a
    const/16 v17, 0x0

    goto :goto_4e

    :goto_4f
    xor-int/lit8 v2, v17, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v2}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v14, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v12, Lh20/c3;->x:F

    iget v2, v9, Ld40/o;->c:F

    cmpg-float v0, v0, v2

    if-nez v0, :cond_6b

    move/from16 v17, v13

    goto :goto_50

    :cond_6b
    const/16 v17, 0x0

    :goto_50
    xor-int/lit8 v0, v17, 0x1

    new-instance v2, Lv00/k;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v2, v0}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    iget-object v1, v10, Lh20/l3;->x:Ljava/lang/Integer;

    if-eqz v1, :cond_6c

    const/4 v1, 0x1

    goto :goto_51

    :cond_6c
    const/4 v1, 0x0

    :goto_51
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v6, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, v10, Lh20/l3;->w:F

    sget-object v1, Ld40/q;->d:Ld40/s;

    iget v1, v1, Ld40/s;->d:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_6d

    const/16 v17, 0x1

    :goto_52
    const/4 v9, 0x1

    goto :goto_53

    :cond_6d
    const/16 v17, 0x0

    goto :goto_52

    :goto_53
    xor-int/lit8 v0, v17, 0x1

    new-instance v1, Lv00/k;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v1, v0}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v0, "size_scale_factor"

    invoke-virtual {v11, v0, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    invoke-virtual {v8, v0}, Ln83/f;->putAll(Ljava/util/Map;)V

    iget-object v1, v7, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    sget-object v2, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->z:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    if-ne v1, v2, :cond_72

    iget-object v1, v5, Lh20/h1;->F:Lh20/g1;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    new-instance v5, Lv00/k;

    iget-object v1, v1, Lh20/g1;->w:Lh20/f1;

    sget-object v6, Lh20/g1;->E:Lh20/g1;

    iget-object v6, v6, Lh20/g1;->w:Lh20/f1;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v17, 0x1

    xor-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-direct {v5, v6}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v6, "style"

    invoke-virtual {v2, v6, v5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lv00/l;

    instance-of v6, v1, Lh20/e1;

    if-eqz v6, :cond_6e

    const-string v1, "floating_button"

    goto :goto_54

    :cond_6e
    instance-of v6, v1, Lh20/d1;

    if-eqz v6, :cond_6f

    const-string v1, "flat_with_radio"

    goto :goto_54

    :cond_6f
    instance-of v6, v1, Lh20/z0;

    if-eqz v6, :cond_70

    const-string v1, "flat_with_checkmark"

    goto :goto_54

    :cond_70
    instance-of v1, v1, Lh20/b1;

    if-eqz v1, :cond_71

    const-string v1, "flat_with_disclosure"

    :goto_54
    invoke-direct {v5, v1}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v1, "row_style"

    invoke-virtual {v2, v1, v5}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object v1

    new-instance v2, Lv00/j;

    invoke-direct {v2, v1}, Lv00/j;-><init>(Ljava/util/Map;)V

    const-string v5, "embedded_payment_element"

    invoke-virtual {v8, v5, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ln83/f;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ls2/e;->j(Ljava/util/Collection;)Z

    move-result v10

    goto :goto_55

    :cond_71
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_72
    const/4 v10, 0x0

    :goto_55
    invoke-virtual {v0}, Ln83/f;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ls2/e;->j(Ljava/util/Collection;)Z

    move-result v0

    invoke-virtual/range {v37 .. v37}, Ln83/f;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ls2/e;->j(Ljava/util/Collection;)Z

    move-result v1

    new-instance v2, Lv00/k;

    if-nez v0, :cond_74

    if-nez v1, :cond_74

    if-eqz v10, :cond_73

    goto :goto_56

    :cond_73
    const/4 v0, 0x0

    goto :goto_57

    :cond_74
    :goto_56
    const/4 v0, 0x1

    :goto_57
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {v2, v0}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v0, "usage"

    invoke-virtual {v8, v0, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    invoke-direct {v4, v0}, Lv00/j;-><init>(Ljava/util/Map;)V

    const-string v0, "appearance"

    invoke-virtual {v3, v0, v4}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lv00/k;

    move-object/from16 v1, v39

    iget-object v1, v1, Lmy/a;->O:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    sget-object v2, Lh20/u1;->x:Lt83/b;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/16 v17, 0x1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lv00/k;-><init>(Ljava/lang/Boolean;)V

    const-string v1, "card_funding_acceptance"

    invoke-virtual {v3, v1, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    move-object/from16 v1, v38

    invoke-virtual {v1, v0}, Ln83/f;->putAll(Ljava/util/Map;)V

    move-object/from16 v2, v36

    instance-of v0, v2, La30/n0;

    if-eqz v0, :cond_91

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    new-instance v3, Lv00/l;

    iget-object v2, v2, La30/n0;->a:Lh20/x1;

    iget-object v2, v2, Lh20/x1;->O:Lh20/x2;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_77

    const/4 v9, 0x1

    if-eq v2, v9, :cond_76

    const/4 v9, 0x2

    if-ne v2, v9, :cond_75

    :goto_58
    move-object/from16 v2, v30

    goto :goto_59

    :cond_75
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_76
    const-string v30, "vertical"

    goto :goto_58

    :cond_77
    const-string v30, "horizontal"

    goto :goto_58

    :goto_59
    invoke-direct {v3, v2}, Lv00/l;-><init>(Ljava/lang/String;)V

    const-string v2, "payment_method_layout"

    invoke-virtual {v0, v2, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln83/f;->putAll(Ljava/util/Map;)V

    invoke-virtual {v1}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-direct {v1, v0}, Lv00/j;-><init>(Ljava/util/Map;)V

    const-string v0, "mpe_config"

    move-object/from16 v2, v34

    invoke-virtual {v2, v0, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    new-instance v1, Lv00/n;

    invoke-direct {v1, v0}, Lv00/n;-><init>(Ljava/util/Map;)V

    move-object/from16 v2, v31

    iget-object v0, v2, La30/a0;->o:Lny/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "externalPaymentMethodSpecs"

    move-object/from16 v2, v26

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, v19

    iget-object v9, v3, Ly00/u1;->z:Ly00/c8;

    move-object/from16 v4, v20

    iget-object v10, v4, Lmy/a;->I:Lh20/l1;

    iget-boolean v11, v4, Lmy/a;->G:Z

    iget-boolean v12, v4, Lmy/a;->H:Z

    sget-object v0, Ly00/s1;->E:Ly00/s1;

    move-object/from16 v5, v24

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    sget-object v0, Lv00/s0;->x:Lt9/c0;

    if-eqz v27, :cond_78

    move-object/from16 v6, v32

    check-cast v6, La30/l0;

    goto :goto_5a

    :cond_78
    const/4 v6, 0x0

    :goto_5a
    iget-object v7, v4, Lmy/a;->Q:Lh20/g3;

    if-eqz v7, :cond_79

    const/4 v7, 0x1

    goto :goto_5b

    :cond_79
    const/4 v7, 0x0

    :goto_5b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v3, Ly00/u1;->E:Ljava/util/List;

    sget-object v8, Lv00/s0;->G:Lt83/b;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v15, La0/i1;

    move-object/from16 v43, v1

    const/4 v1, 0x2

    invoke-direct {v15, v8, v1}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :goto_5c
    invoke-virtual {v15}, La0/i1;->hasNext()Z

    move-result v1

    move-object/from16 v8, p0

    move/from16 v19, v1

    iget-boolean v1, v8, La30/t;->I:Z

    if-eqz v19, :cond_7e

    move/from16 v19, v1

    invoke-virtual {v15}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v2

    move-object v2, v1

    check-cast v2, Lv00/s0;

    move-object/from16 v20, v6

    iget-object v6, v2, Lv00/s0;->w:Ljava/lang/String;

    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_7c

    move/from16 v24, v6

    const/4 v6, 0x1

    if-eq v2, v6, :cond_7b

    const/4 v6, 0x2

    if-ne v2, v6, :cond_7a

    if-eqz v7, :cond_7d

    if-eqz v24, :cond_7d

    goto :goto_5d

    :cond_7a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_7b
    const/4 v6, 0x2

    if-eqz v20, :cond_7d

    goto :goto_5d

    :cond_7c
    move/from16 v24, v6

    const/4 v6, 0x2

    if-eqz v19, :cond_7d

    if-eqz v24, :cond_7d

    :goto_5d
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7d
    move-object/from16 v6, v20

    move-object/from16 v2, v26

    goto :goto_5c

    :cond_7e
    move/from16 v19, v1

    move-object/from16 v26, v2

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0xa

    invoke-static {v14, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v6, 0x10

    if-ge v2, v6, :cond_7f

    move v2, v6

    :cond_7f
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_82

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lv00/s0;

    iget-object v15, v7, Lv00/s0;->w:Ljava/lang/String;

    invoke-interface {v0, v15}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v15

    move-object/from16 v16, v0

    sget-object v0, Lv00/s0;->z:Lv00/s0;

    if-ne v7, v0, :cond_80

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v7, v0

    move/from16 v0, v29

    goto :goto_5f

    :cond_80
    move/from16 v0, v29

    if-ne v15, v0, :cond_81

    const/4 v7, 0x0

    goto :goto_5f

    :cond_81
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_5f
    invoke-interface {v1, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v29, v0

    move-object/from16 v0, v16

    goto :goto_5e

    :cond_82
    new-instance v0, Lm3/g;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lm3/g;-><init>(I)V

    new-instance v2, Lv00/r0;

    invoke-direct {v2, v0, v1}, Lv00/r0;-><init>(Lm3/g;Ljava/util/LinkedHashMap;)V

    invoke-static {v14, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v14

    iget-object v15, v4, Lmy/a;->L:Ljava/util/List;

    iget-object v0, v3, Ly00/u1;->K:Ly00/b1;

    if-eqz v0, :cond_83

    iget-boolean v0, v0, Ly00/b1;->w:Z

    goto :goto_60

    :cond_83
    const/4 v0, 0x0

    :goto_60
    iget-object v1, v4, Lmy/a;->J:Ljava/util/List;

    const-string v2, "preferredNetworks"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    if-ne v0, v6, :cond_84

    new-instance v0, Lw30/a;

    invoke-direct {v0, v1}, Lw30/a;-><init>(Ljava/util/List;)V

    :goto_61
    move-object/from16 v16, v0

    goto :goto_62

    :cond_84
    if-nez v0, :cond_90

    sget-object v0, Lw30/b;->w:Lw30/b;

    goto :goto_61

    :goto_62
    iget-object v0, v4, Lmy/a;->w:Ljava/lang/String;

    invoke-static/range {v28 .. v28}, Lvp/c;->X(La30/t0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v4, Lmy/a;->E:Lh20/i1;

    iget-object v6, v4, Lmy/a;->F:Li20/b;

    invoke-static {v3}, Ls6/a;->j(Ly00/u1;)Lv00/i0;

    move-result-object v27

    iget-object v7, v4, Lmy/a;->z:Lh20/w2;

    move-object/from16 v20, v0

    move-object/from16 v17, v1

    move-object/from16 v1, v33

    if-eqz v33, :cond_85

    iget-object v0, v1, Ly00/t1;->y:Ly00/p2;

    move-object/from16 v28, v0

    goto :goto_63

    :cond_85
    const/16 v28, 0x0

    :goto_63
    if-eqz v1, :cond_87

    iget-object v0, v1, Ly00/t1;->F:Ly00/n2;

    if-eqz v0, :cond_87

    iget-object v1, v0, Ly00/n2;->x:Ljava/lang/String;

    move-object/from16 v24, v2

    if-eqz v1, :cond_86

    new-instance v2, Lq20/c;

    iget-object v0, v0, Ly00/n2;->w:Ly00/m2;

    iget-object v0, v0, Ly00/m2;->w:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lq20/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_64

    :cond_86
    const/4 v2, 0x0

    :goto_64
    move-object/from16 v30, v2

    goto :goto_65

    :cond_87
    move-object/from16 v24, v2

    const/16 v30, 0x0

    :goto_65
    move-object/from16 v0, v23

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_66
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly00/e1;

    move-object/from16 v23, v0

    instance-of v0, v2, Ly00/c1;

    if-eqz v0, :cond_8a

    iget-object v0, v4, Lmy/a;->P:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_67
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_89

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v29, v0

    move-object/from16 v0, v25

    check-cast v0, Lh20/y1;

    move-object/from16 v25, v6

    move-object v6, v2

    check-cast v6, Ly00/c1;

    move-object/from16 v31, v7

    iget-object v7, v6, Ly00/c1;->w:Ljava/lang/String;

    move-object/from16 v33, v9

    iget-object v9, v0, Lh20/y1;->w:Ljava/lang/String;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_88

    new-instance v34, Lv00/q;

    iget-object v2, v6, Ly00/c1;->w:Ljava/lang/String;

    iget-object v7, v6, Ly00/c1;->x:Ljava/lang/String;

    iget-object v6, v6, Ly00/c1;->y:Ljava/lang/String;

    iget-object v9, v0, Lh20/y1;->x:Lzy/c;

    iget-boolean v0, v0, Lh20/y1;->y:Z

    move/from16 v39, v0

    move-object/from16 v35, v2

    move-object/from16 v37, v6

    move-object/from16 v36, v7

    move-object/from16 v38, v9

    invoke-direct/range {v34 .. v39}, Lv00/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzy/c;Z)V

    move-object/from16 v0, v34

    goto :goto_68

    :cond_88
    move-object/from16 v6, v25

    move-object/from16 v0, v29

    move-object/from16 v7, v31

    move-object/from16 v9, v33

    goto :goto_67

    :cond_89
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8a
    move-object/from16 v25, v6

    move-object/from16 v31, v7

    move-object/from16 v33, v9

    instance-of v0, v2, Ly00/d1;

    if-eqz v0, :cond_8c

    const/4 v0, 0x0

    :goto_68
    if-eqz v0, :cond_8b

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8b
    move-object/from16 v0, v23

    move-object/from16 v6, v25

    move-object/from16 v7, v31

    move-object/from16 v9, v33

    goto/16 :goto_66

    :cond_8c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8d
    move-object/from16 v25, v6

    move-object/from16 v31, v7

    move-object/from16 v33, v9

    new-instance v0, Lv00/j0;

    iget-object v2, v4, Lmy/a;->N:Lh20/t1;

    invoke-direct {v0, v2}, Lv00/j0;-><init>(Lh20/t1;)V

    new-instance v2, Lv00/k0;

    sget-object v6, Ly00/s1;->I:Ly00/s1;

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8e

    iget-object v6, v4, Lmy/a;->O:Ljava/util/List;

    goto :goto_69

    :cond_8e
    sget-object v6, Liy/a;->j:Lt83/b;

    :goto_69
    invoke-direct {v2, v6}, Lv00/k0;-><init>(Ljava/util/List;)V

    move-object/from16 v23, v26

    move-object/from16 v26, v31

    invoke-static {v3}, Lf20/a;->a(Ly00/u1;)Lf20/b;

    move-result-object v31

    iget-object v6, v4, Lmy/a;->T:Ljava/util/Map;

    sget-object v9, Ly00/s1;->G:Ly00/s1;

    invoke-interface {v5, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v35

    iget-object v5, v3, Ly00/u1;->F:Ljava/util/Map;

    sget-object v7, Ly00/s1;->F:Ly00/s1;

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-boolean v5, v4, Lmy/a;->V:Z

    iget-object v7, v3, Ly00/u1;->F:Ljava/util/Map;

    sget-object v9, Ly00/s1;->H:Ly00/s1;

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v4, v4, Lmy/a;->X:Lh20/h1;

    iget-object v7, v3, Ly00/u1;->R:Ljava/lang/String;

    iget-object v9, v3, Ly00/u1;->S:Ljava/lang/String;

    move-object/from16 v29, v1

    const/4 v1, 0x0

    invoke-static {v7, v9, v1}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_8f

    move-object/from16 v41, v7

    goto :goto_6a

    :cond_8f
    const/16 v41, 0x0

    :goto_6a
    iget-object v1, v3, Ly00/u1;->G:Ly00/r1;

    new-instance v3, Lv00/c0;

    const/16 v36, 0x0

    iget-object v7, v8, La30/t;->K:Ly00/n;

    const/16 v39, 0x0

    const/16 v45, 0x0

    move-object/from16 v44, v1

    move-object v8, v3

    move-object/from16 v40, v4

    move/from16 v37, v5

    move-object/from16 v34, v6

    move-object/from16 v38, v7

    move-object/from16 v18, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v25

    move-object/from16 v9, v33

    move-object/from16 v33, v2

    move/from16 v25, v19

    move-object/from16 v19, v24

    move-object/from16 v24, v22

    move-object/from16 v22, v29

    move-object/from16 v29, v32

    move-object/from16 v32, v0

    invoke-direct/range {v8 .. v45}, Lv00/c0;-><init>(Ly00/c8;Lh20/l1;ZZZLjava/util/List;Ljava/util/List;Lw30/c;Ljava/lang/String;Ljava/lang/String;Lh20/i1;Li20/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lv00/p;ZLh20/w2;Lv00/i0;Ly00/p2;La30/m0;Lq20/c;Lf20/b;Lux/a;Lux/b;Ljava/util/Map;ZLy00/c3;ZLy00/n;ZLh20/h1;Ljava/lang/String;Lv00/a0;Lv00/n;Ly00/r1;Z)V

    return-object v8

    :cond_90
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_91
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_92
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_93
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_94
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_95
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
