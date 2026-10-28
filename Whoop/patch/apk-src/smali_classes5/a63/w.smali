.class public final La63/w;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lv53/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V
    .locals 0

    .line 1
    iput p4, p0, La63/w;->w:I

    iput-object p1, p0, La63/w;->F:Ljava/lang/Object;

    iput-object p2, p0, La63/w;->y:Lv53/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lv53/c;Lz53/g;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La63/w;->w:I

    .line 2
    iput-object p1, p0, La63/w;->y:Lv53/c;

    iput-object p2, p0, La63/w;->F:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, La63/w;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance v0, La63/w;

    iget-object v1, p0, La63/w;->F:Ljava/lang/Object;

    check-cast v1, Lz53/g;

    iget-object v2, p0, La63/w;->y:Lv53/c;

    invoke-direct {v0, v2, v1, p3}, La63/w;-><init>(Lv53/c;Lz53/g;Lq83/d;)V

    iput-object p1, v0, La63/w;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/w;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, La63/i0;

    check-cast p2, Le63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/w;

    iget-object v1, p0, La63/w;->F:Ljava/lang/Object;

    check-cast v1, La63/h0;

    iget-object v2, p0, La63/w;->y:Lv53/c;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, p3, v3}, La63/w;-><init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V

    iput-object p1, v0, La63/w;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/w;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lr63/e;

    check-cast p3, Lq83/d;

    new-instance v0, La63/w;

    iget-object v1, p0, La63/w;->F:Ljava/lang/Object;

    check-cast v1, La63/e0;

    iget-object v2, p0, La63/w;->y:Lv53/c;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, p3, v3}, La63/w;-><init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V

    iput-object p1, v0, La63/w;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/w;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, La63/i0;

    check-cast p2, Le63/d;

    check-cast p3, Lq83/d;

    new-instance v0, La63/w;

    iget-object v1, p0, La63/w;->F:Ljava/lang/Object;

    check-cast v1, La63/x;

    iget-object v2, p0, La63/w;->y:Lv53/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p3, v3}, La63/w;-><init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V

    iput-object p1, v0, La63/w;->z:Ljava/lang/Object;

    iput-object p2, v0, La63/w;->E:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La63/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, La63/w;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const-string v3, "<this>"

    const/4 v4, 0x0

    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    iget-object v6, v0, La63/w;->y:Lv53/c;

    const/4 v7, 0x1

    const/4 v8, 0x2

    iget-object v9, v0, La63/w;->F:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v9, Lz53/g;

    iget-object v1, v6, Lv53/c;->J:Lad3/z;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v11, v0, La63/w;->x:I

    if-eqz v11, :cond_2

    if-eq v11, v7, :cond_1

    if-ne v11, v8, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, La63/w;->E:Ljava/lang/Object;

    check-cast v3, Le63/e;

    iget-object v5, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v5, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v13, v3

    move-object/from16 v3, p1

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v5, Lr63/e;

    iget-object v11, v0, La63/w;->E:Ljava/lang/Object;

    new-instance v12, Le63/d;

    invoke-direct {v12}, Le63/d;-><init>()V

    iget-object v13, v5, Lr63/e;->w:Ljava/lang/Object;

    check-cast v13, Le63/d;

    invoke-virtual {v12, v13}, Le63/d;->b(Le63/d;)V

    const-class v13, Ljava/lang/Object;

    if-nez v11, :cond_3

    sget-object v11, Lj63/a;->a:Lj63/a;

    iput-object v11, v12, Le63/d;->d:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v11

    invoke-static {v11}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v14

    sget-object v15, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v15, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v13, v11, v14}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v11

    invoke-virtual {v12, v11}, Le63/d;->a(Ls63/a;)V

    goto :goto_0

    :cond_3
    instance-of v14, v11, Lj63/d;

    if-eqz v14, :cond_4

    iput-object v11, v12, Le63/d;->d:Ljava/lang/Object;

    invoke-virtual {v12, v4}, Le63/d;->a(Ls63/a;)V

    goto :goto_0

    :cond_4
    iput-object v11, v12, Le63/d;->d:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v11

    invoke-static {v11}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v14

    sget-object v15, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v15, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v13, v11, v14}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v11

    invoke-virtual {v12, v11}, Le63/d;->a(Ls63/a;)V

    :goto_0
    sget-object v11, Lg63/b;->b:Lio/sentry/hints/j;

    invoke-virtual {v1, v11}, Lad3/z;->v(Lio/sentry/hints/j;)V

    new-instance v13, Le63/e;

    iget-object v11, v12, Le63/d;->a:Li63/z;

    invoke-virtual {v11}, Li63/z;->b()Li63/e0;

    move-result-object v14

    iget-object v15, v12, Le63/d;->b:Li63/t;

    new-instance v11, Li63/o;

    iget-object v8, v12, Le63/d;->c:Li63/n;

    iget-object v8, v8, Lal/a;->x:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    const-string v4, "values"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v8}, Lo63/o;-><init>(Ljava/util/Map;)V

    iget-object v4, v12, Le63/d;->d:Ljava/lang/Object;

    instance-of v8, v4, Lj63/d;

    if-eqz v8, :cond_5

    check-cast v4, Lj63/d;

    move-object/from16 v17, v4

    goto :goto_1

    :cond_5
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_e

    iget-object v4, v12, Le63/d;->e:Lbc3/e2;

    iget-object v8, v12, Le63/d;->f:Lo63/f;

    move-object/from16 v18, v4

    move-object/from16 v19, v8

    move-object/from16 v16, v11

    invoke-direct/range {v13 .. v19}, Le63/e;-><init>(Li63/e0;Li63/t;Li63/o;Lj63/d;Lbc3/k1;Lo63/f;)V

    move-object/from16 v4, v16

    sget-object v11, Ly53/f;->b:Lo63/a;

    iget-object v12, v6, Lv53/c;->K:Lv53/e;

    invoke-virtual {v8, v11, v12}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    iget-object v4, v4, Lo63/o;->c:Ljava/util/Map;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "unmodifiableSet(this)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/String;

    sget-object v12, Li63/r;->a:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_d

    iget-object v3, v13, Le63/e;->g:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly53/d;

    iget-object v8, v9, Lz53/g;->E:Ljava/util/Set;

    invoke-interface {v8, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_3

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Engine doesn\'t support "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9
    iput-object v5, v0, La63/w;->z:Ljava/lang/Object;

    iput-object v13, v0, La63/w;->E:Ljava/lang/Object;

    iput v7, v0, La63/w;->x:I

    invoke-static {v9, v13, v0}, Lv63/h;->a(Lz53/g;Le63/e;Ls83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    check-cast v3, Le63/g;

    new-instance v4, Lw53/b;

    const-string v7, "requestData"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "responseData"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v6}, Lw53/b;-><init>(Lv53/c;)V

    new-instance v7, Le63/a;

    invoke-direct {v7, v4, v13}, Le63/a;-><init>(Lw53/b;Le63/e;)V

    iput-object v7, v4, Lw53/b;->x:Le63/b;

    new-instance v7, Lf63/a;

    invoke-direct {v7, v4, v3}, Lf63/a;-><init>(Lw53/b;Le63/g;)V

    iput-object v7, v4, Lw53/b;->y:Lf63/c;

    iget-object v3, v3, Le63/g;->e:Ljava/lang/Object;

    instance-of v7, v3, Lio/ktor/utils/io/q;

    if-nez v7, :cond_b

    invoke-virtual {v4}, Lw53/b;->c()Le63/b;

    move-result-object v7

    invoke-interface {v7}, Le63/b;->getAttributes()Lo63/f;

    move-result-object v7

    sget-object v8, Lw53/b;->E:Lo63/a;

    invoke-virtual {v7, v8, v3}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    :cond_b
    invoke-virtual {v4}, Lw53/b;->d()Lf63/c;

    move-result-object v3

    sget-object v7, Lg63/b;->c:Lio/sentry/hints/j;

    invoke-virtual {v1, v7}, Lad3/z;->v(Lio/sentry/hints/j;)V

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v1

    new-instance v7, La3/m1;

    invoke-direct {v7, v6, v3}, La3/m1;-><init>(Lv53/c;Lf63/c;)V

    invoke-interface {v1, v7}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    const/4 v1, 0x0

    iput-object v1, v0, La63/w;->z:Ljava/lang/Object;

    iput-object v1, v0, La63/w;->E:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v0, La63/w;->x:I

    invoke-virtual {v5, v4, v0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_c

    :goto_5
    move-object v2, v10

    :cond_c
    :goto_6
    return-object v2

    :cond_d
    new-instance v1, Lio/ktor/http/UnsafeHeaderException;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lio/ktor/http/UnsafeHeaderException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No request transformation found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v12, Le63/d;->d:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    check-cast v9, La63/h0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La63/w;->x:I

    if-eqz v2, :cond_11

    if-eq v2, v7, :cond_f

    const/4 v1, 0x2

    if-ne v2, v1, :cond_10

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto/16 :goto_b

    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v2, La63/i0;

    iget-object v4, v0, La63/w;->E:Ljava/lang/Object;

    move-object v12, v4

    check-cast v12, Le63/d;

    iget-object v4, v12, Le63/d;->a:Li63/z;

    iget-object v5, v12, Le63/d;->f:Lo63/f;

    iget-object v4, v4, Li63/z;->a:Li63/b0;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v4, Li63/b0;->a:Ljava/lang/String;

    const-string v4, "ws"

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v14, 0x0

    if-nez v4, :cond_1c

    const-string v4, "wss"

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    goto/16 :goto_9

    :cond_12
    sget-object v3, La63/h0;->d:La63/g0;

    sget-object v4, Ly53/e;->a:Lo63/a;

    invoke-virtual {v5, v4}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-eqz v7, :cond_13

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_7

    :cond_13
    move-object v7, v14

    :goto_7
    check-cast v7, La63/f0;

    if-nez v7, :cond_15

    iget-object v8, v9, La63/h0;->a:Ljava/lang/Long;

    if-nez v8, :cond_14

    iget-object v8, v9, La63/h0;->b:Ljava/lang/Long;

    if-nez v8, :cond_14

    iget-object v8, v9, La63/h0;->c:Ljava/lang/Long;

    if-eqz v8, :cond_15

    :cond_14
    new-instance v7, La63/f0;

    invoke-direct {v7}, La63/f0;-><init>()V

    sget-object v8, Le63/c;->w:Le63/c;

    invoke-virtual {v5, v4, v8}, Lo63/f;->a(Lo63/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-interface {v4, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    if-eqz v7, :cond_1b

    iget-object v3, v7, La63/f0;->b:Ljava/lang/Long;

    if-nez v3, :cond_16

    iget-object v3, v9, La63/h0;->b:Ljava/lang/Long;

    :cond_16
    invoke-static {v3}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v3, v7, La63/f0;->b:Ljava/lang/Long;

    iget-object v3, v7, La63/f0;->c:Ljava/lang/Long;

    if-nez v3, :cond_17

    iget-object v3, v9, La63/h0;->c:Ljava/lang/Long;

    :cond_17
    invoke-static {v3}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v3, v7, La63/f0;->c:Ljava/lang/Long;

    iget-object v3, v7, La63/f0;->a:Ljava/lang/Long;

    if-nez v3, :cond_18

    iget-object v3, v9, La63/h0;->a:Ljava/lang/Long;

    :cond_18
    invoke-static {v3}, La63/f0;->a(Ljava/lang/Long;)V

    iput-object v3, v7, La63/f0;->a:Ljava/lang/Long;

    if-nez v3, :cond_19

    iget-object v3, v9, La63/h0;->a:Ljava/lang/Long;

    :cond_19
    move-object v11, v3

    if-eqz v11, :cond_1b

    const-wide v3, 0x7fffffffffffffffL

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v3, v7, v3

    if-nez v3, :cond_1a

    goto :goto_8

    :cond_1a
    iget-object v13, v12, Le63/d;->e:Lbc3/e2;

    new-instance v10, La1/h;

    const/4 v15, 0x6

    invoke-direct/range {v10 .. v15}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v6, v14, v14, v10, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v3

    iget-object v4, v12, Le63/d;->e:Lbc3/e2;

    new-instance v5, La0/a1;

    const/4 v6, 0x5

    invoke-direct {v5, v3, v6}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_1b
    :goto_8
    iput-object v14, v0, La63/w;->z:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v0, La63/w;->x:I

    invoke-interface {v2, v12, v0}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1d

    goto :goto_a

    :cond_1c
    :goto_9
    iput-object v14, v0, La63/w;->z:Ljava/lang/Object;

    iput v7, v0, La63/w;->x:I

    invoke-interface {v2, v12, v0}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1d

    :goto_a
    move-object v2, v1

    :cond_1d
    :goto_b
    return-object v2

    :pswitch_1
    check-cast v9, La63/e0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, La63/w;->x:I

    if-eqz v3, :cond_20

    if-eq v3, v7, :cond_1f

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1e

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_f

    :cond_1e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1f
    iget-object v3, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v3, Lr63/e;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_d

    :cond_20
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v3, Lr63/e;

    iget-object v4, v0, La63/w;->E:Ljava/lang/Object;

    instance-of v5, v4, Lj63/d;

    if-eqz v5, :cond_24

    iget-object v5, v3, Lr63/e;->w:Ljava/lang/Object;

    check-cast v5, Le63/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v4, v5, Le63/d;->d:Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Le63/d;->a(Ls63/a;)V

    new-instance v4, La63/c0;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v9, La63/e0;->a:Ljava/util/ArrayList;

    invoke-direct {v4, v6}, La63/c0;-><init>(Lv53/c;)V

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v6

    const/4 v8, 0x0

    const/4 v9, -0x1

    invoke-static {v6, v8, v9}, Lj93/l0;->F(III)I

    move-result v8

    new-instance v10, Li93/i;

    invoke-direct {v10, v6, v8, v9}, Li93/i;-><init>(III)V

    :goto_c
    iget-boolean v6, v10, Li93/i;->y:Z

    if-eqz v6, :cond_21

    invoke-virtual {v10}, Lm83/e0;->nextInt()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/jvm/functions/Function3;

    new-instance v8, La63/d0;

    invoke-direct {v8, v6, v4}, La63/d0;-><init>(Lkotlin/jvm/functions/Function3;La63/i0;)V

    move-object v4, v8

    goto :goto_c

    :cond_21
    iget-object v5, v3, Lr63/e;->w:Ljava/lang/Object;

    check-cast v5, Le63/d;

    iput-object v3, v0, La63/w;->z:Ljava/lang/Object;

    iput v7, v0, La63/w;->x:I

    invoke-interface {v4, v5, v0}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_22

    goto :goto_e

    :cond_22
    :goto_d
    check-cast v4, Lw53/b;

    const/4 v5, 0x0

    iput-object v5, v0, La63/w;->z:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, La63/w;->x:I

    invoke-virtual {v3, v4, v0}, Lr63/e;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_23

    :goto_e
    move-object v2, v1

    :cond_23
    :goto_f
    return-object v2

    :cond_24
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\n|Fail to prepare request body for sending. \n|The body type is: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", with Content-Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v3, Lr63/e;->w:Ljava/lang/Object;

    check-cast v2, Le63/d;

    invoke-static {v2}, Lts/o;->i(Le63/d;)Li63/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/s;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_2
    check-cast v9, La63/x;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La63/w;->x:I

    if-eqz v2, :cond_27

    if-eq v2, v7, :cond_26

    const/4 v3, 0x2

    if-ne v2, v3, :cond_25

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_11

    :cond_25
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    iget-object v2, v0, La63/w;->E:Ljava/lang/Object;

    check-cast v2, Le63/d;

    iget-object v3, v0, La63/w;->z:Ljava/lang/Object;

    check-cast v3, La63/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_10

    :cond_27
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, La63/w;->z:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, La63/i0;

    iget-object v2, v0, La63/w;->E:Ljava/lang/Object;

    check-cast v2, Le63/d;

    iput-object v3, v0, La63/w;->z:Ljava/lang/Object;

    iput-object v2, v0, La63/w;->E:Ljava/lang/Object;

    iput v7, v0, La63/w;->x:I

    invoke-interface {v3, v2, v0}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_28

    goto :goto_11

    :cond_28
    :goto_10
    check-cast v4, Lw53/b;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La63/y;->a:Ljava/util/Set;

    invoke-virtual {v4}, Lw53/b;->c()Le63/b;

    move-result-object v7

    invoke-interface {v7}, Le63/b;->getMethod()Li63/t;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_29

    move-object v1, v4

    goto :goto_11

    :cond_29
    sget-object v5, La63/x;->a:La63/a;

    const/4 v5, 0x0

    iput-object v5, v0, La63/w;->z:Ljava/lang/Object;

    iput-object v5, v0, La63/w;->E:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, La63/w;->x:I

    invoke-static {v3, v2, v4, v6, v0}, La63/a;->c(La63/i0;Le63/d;Lw53/b;Lv53/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2a

    goto :goto_11

    :cond_2a
    move-object v1, v2

    :goto_11
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
