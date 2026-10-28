.class public final Lnf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf/i;


# instance fields
.field public final a:Ln4/f;


# direct methods
.method public constructor <init>(Ln4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/g;->a:Ln4/f;

    return-void
.end method


# virtual methods
.method public final a(Lnf/k;Lq83/d;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lnf/f;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lnf/f;

    iget v3, v2, Lnf/f;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lnf/f;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lnf/f;

    check-cast v1, Ls83/c;

    invoke-direct {v2, v0, v1}, Lnf/f;-><init>(Lnf/g;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lnf/f;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lnf/f;->F:I

    const-string v5, "Required value was null."

    const/4 v6, 0x1

    iget-object v7, v0, Lnf/g;->a:Ln4/f;

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lnf/f;->y:Lwe/g;

    iget-object v4, v2, Lnf/f;->x:Lvf/b;

    iget-object v6, v2, Lnf/f;->w:Lgf/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v3

    :goto_1
    move-object v8, v4

    goto/16 :goto_d

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lnf/k;->b()Lxf/a;

    move-result-object v1

    instance-of v1, v1, Lve/e;

    if-eqz v1, :cond_1b

    invoke-virtual/range {p1 .. p1}, Lnf/k;->c()Lgf/b;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lnf/k;->a()Lvf/b;

    move-result-object v4

    invoke-virtual {v4}, Lvf/b;->c()Lmf/l;

    move-result-object v8

    invoke-static {}, Lwe/f;->d()Lgf/a;

    move-result-object v9

    invoke-interface {v1, v9}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwe/b0;

    invoke-static {}, Lwe/f;->h()Lgf/a;

    move-result-object v10

    invoke-interface {v1, v10}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwe/d;

    invoke-static {}, Lwe/f;->j()Lgf/a;

    move-result-object v11

    invoke-static {v1, v11}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {}, Lwe/f;->k()Lgf/a;

    move-result-object v12

    invoke-interface {v1, v12}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Set;

    invoke-static {}, Lwe/f;->a()Lgf/a;

    move-result-object v13

    invoke-interface {v1, v13}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Set;

    invoke-static {}, Lwe/f;->m()Lgf/a;

    move-result-object v14

    invoke-interface {v1, v14}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-static {}, Lwe/f;->e()Lgf/a;

    move-result-object v15

    invoke-interface {v1, v15}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Boolean;

    invoke-static {}, Lwe/f;->l()Lgf/a;

    move-result-object v6

    invoke-interface {v1, v6}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {}, Lwe/f;->f()Lgf/a;

    move-result-object v0

    invoke-interface {v1, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    move-object/from16 v16, v0

    invoke-static {}, Lwe/f;->c()Lgf/a;

    move-result-object v0

    invoke-interface {v1, v0}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/16 v17, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move/from16 v18, v0

    goto :goto_2

    :cond_3
    move/from16 v18, v17

    :goto_2
    new-instance v0, Lwe/g;

    invoke-direct {v0}, Lwe/g;-><init>()V

    if-nez v6, :cond_5

    iget-object v6, v7, Ln4/f;->e:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    invoke-virtual {v0, v6}, Lwe/g;->r(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lnf/k;->b()Lxf/a;

    move-result-object v6

    move-object/from16 v19, v9

    const-string v9, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.auth.awscredentials.Credentials"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lve/e;

    invoke-virtual {v0, v6}, Lwe/g;->l(Lve/e;)V

    iget-object v6, v7, Ln4/f;->g:Ljava/io/Serializable;

    check-cast v6, Lwe/e;

    invoke-virtual {v0, v6}, Lwe/g;->k(Lwe/e;)V

    invoke-virtual {v0}, Lwe/g;->b()Lwe/e;

    move-result-object v6

    sget-object v9, Lwe/e;->y:Lwe/e;

    if-ne v6, v9, :cond_7

    move-object v6, v13

    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_7

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v20, v13

    check-cast v20, Ljava/lang/Iterable;

    const/16 v24, 0x0

    const/16 v25, 0x3e

    const-string v21, ","

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v11

    goto :goto_5

    :cond_7
    :goto_4
    invoke-virtual {v0}, Lwe/g;->b()Lwe/e;

    move-result-object v6

    if-ne v6, v9, :cond_9

    move-object v6, v12

    check-cast v6, Ljava/util/Collection;

    if-eqz v6, :cond_9

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_5

    :cond_8
    move-object/from16 v20, v12

    check-cast v20, Ljava/lang/Iterable;

    const/16 v24, 0x0

    const/16 v25, 0x3e

    const-string v21, ","

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v11

    :cond_9
    :goto_5
    invoke-virtual {v0, v11}, Lwe/g;->q(Ljava/lang/String;)V

    invoke-static {}, Lwe/f;->i()Lgf/a;

    move-result-object v6

    invoke-interface {v1, v6}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lug/b;

    if-nez v6, :cond_b

    sget-object v6, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v6

    invoke-static {}, Luf/i;->c()Lgf/a;

    move-result-object v9

    invoke-interface {v1, v9}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lkotlin/time/Duration;

    if-eqz v9, :cond_a

    invoke-virtual {v9}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v11

    goto :goto_6

    :cond_a
    sget-object v9, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v9}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v11

    :goto_6
    invoke-virtual {v6, v11, v12}, Lug/b;->d(J)Lug/b;

    move-result-object v6

    :cond_b
    invoke-virtual {v0, v6}, Lwe/g;->v(Lug/b;)V

    iget-object v6, v7, Ln4/f;->f:Ljava/io/Serializable;

    check-cast v6, Lwe/c;

    invoke-virtual {v0, v6}, Lwe/g;->t(Lwe/c;)V

    if-eqz v16, :cond_c

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_7

    :cond_c
    move/from16 v6, v17

    :goto_7
    invoke-virtual {v0, v6}, Lwe/g;->p(Z)V

    if-eqz v15, :cond_d

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_8

    :cond_d
    iget-boolean v6, v7, Ln4/f;->c:Z

    :goto_8
    invoke-virtual {v0, v6}, Lwe/g;->o(Z)V

    if-eqz v14, :cond_e

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_9

    :cond_e
    iget-boolean v6, v7, Ln4/f;->b:Z

    :goto_9
    invoke-virtual {v0, v6}, Lwe/g;->w(Z)V

    iget-object v6, v7, Ln4/f;->i:Ljava/lang/Object;

    check-cast v6, Lmd0/b;

    invoke-virtual {v0, v6}, Lwe/g;->s(Lkotlin/jvm/functions/Function1;)V

    if-nez v10, :cond_f

    iget-object v6, v7, Ln4/f;->h:Ljava/lang/Object;

    move-object v10, v6

    check-cast v10, Lwe/d;

    :cond_f
    invoke-virtual {v0, v10}, Lwe/g;->u(Lwe/d;)V

    invoke-static {}, Lcf/l;->b()Lgf/a;

    move-result-object v6

    invoke-interface {v1, v6}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcf/e;

    if-eqz v6, :cond_10

    sget-object v9, Lcf/d;->d:Lcf/d;

    invoke-virtual {v6, v9}, Lcf/e;->a(Lcf/e;)Z

    move-result v6

    const/4 v9, 0x1

    if-ne v6, v9, :cond_10

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    move/from16 v6, v17

    :goto_a
    invoke-virtual {v0, v6}, Lwe/g;->n(Z)V

    if-nez v19, :cond_14

    instance-of v6, v8, Lmf/j;

    if-eqz v6, :cond_11

    sget-object v9, Lwe/w;->b:Lwe/w;

    goto :goto_c

    :cond_11
    invoke-static {v8}, Lsb3/a;->n(Lmf/l;)Z

    move-result v6

    if-eqz v6, :cond_13

    if-eqz v18, :cond_13

    invoke-virtual {v4}, Lvf/b;->d()Lmf/c;

    move-result-object v6

    const-string v8, "x-amz-trailer"

    invoke-virtual {v6, v8}, La2/a;->o(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_12

    sget-object v6, Lwe/z;->b:Lwe/z;

    :goto_b
    move-object v9, v6

    goto :goto_c

    :cond_12
    sget-object v6, Lwe/y;->b:Lwe/y;

    goto :goto_b

    :cond_13
    sget-object v9, Lwe/v;->a:Lwe/v;

    goto :goto_c

    :cond_14
    move-object/from16 v9, v19

    :goto_c
    invoke-virtual {v0, v9}, Lwe/g;->m(Lwe/b0;)V

    invoke-virtual {v0}, Lwe/g;->a()Lwe/g;

    move-result-object v0

    invoke-static {v0}, Lsb3/a;->j(Lwe/g;)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-static {v4}, Lsb3/a;->s(Lvf/b;)V

    :cond_15
    iget-object v6, v7, Ln4/f;->d:Ljava/lang/Object;

    check-cast v6, Lwe/o;

    if-eqz v6, :cond_1a

    invoke-virtual {v4}, Lvf/b;->b()Lvf/h;

    move-result-object v8

    iput-object v1, v2, Lnf/f;->w:Lgf/b;

    iput-object v4, v2, Lnf/f;->x:Lvf/b;

    iput-object v0, v2, Lnf/f;->y:Lwe/g;

    const/4 v9, 0x1

    iput v9, v2, Lnf/f;->F:I

    invoke-virtual {v6, v8, v0, v2}, Lwe/o;->T(Lvf/h;Lwe/g;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_16

    return-object v3

    :cond_16
    move-object v8, v6

    move-object v6, v1

    move-object v1, v8

    move-object v10, v0

    goto/16 :goto_1

    :goto_d
    check-cast v1, Lwe/h;

    invoke-virtual {v1}, Lwe/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvf/a;

    invoke-static {}, Lwe/f;->g()Lgf/a;

    move-result-object v3

    invoke-interface {v6, v3}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/s;

    if-eqz v3, :cond_17

    invoke-virtual {v1}, Lwe/h;->b()[B

    move-result-object v4

    check-cast v3, Lbc3/t;

    invoke-virtual {v3, v4}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_17
    invoke-static {v8, v0}, Ldp/d;->m(Lvf/b;Lvf/a;)V

    invoke-static {v10}, Lsb3/a;->j(Lwe/g;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, v7, Ln4/f;->d:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lwe/o;

    if-eqz v9, :cond_18

    invoke-virtual {v1}, Lwe/h;->b()[B

    move-result-object v11

    invoke-virtual {v8}, Lvf/b;->f()Lmf/c;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c;->Q()Lmf/d;

    move-result-object v12

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v13

    invoke-static/range {v8 .. v13}, Lsb3/a;->r(Lvf/b;Lwe/o;Lwe/g;[BLmf/d;Lq83/j;)V

    goto :goto_e

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    :goto_e
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "invalid Identity type "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lnf/k;->b()Lxf/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "; expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v1, Lve/e;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
