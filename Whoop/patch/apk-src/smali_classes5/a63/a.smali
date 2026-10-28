.class public final La63/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La63/q;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La63/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(La63/i0;Le63/d;Lw53/b;Lv53/c;Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    sget-object v2, La63/x;->a:La63/a;

    instance-of v3, v1, La63/v;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, La63/v;

    iget v4, v3, La63/v;->J:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, La63/v;->J:I

    goto :goto_0

    :cond_0
    new-instance v3, La63/v;

    invoke-direct {v3, v1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v1, v3, La63/v;->I:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, La63/v;->J:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, La63/v;->H:Lkotlin/jvm/internal/g0;

    iget-object v2, v3, La63/v;->G:Ljava/lang/String;

    iget-object v5, v3, La63/v;->F:Li63/b0;

    iget-object v7, v3, La63/v;->E:Lkotlin/jvm/internal/g0;

    iget-object v8, v3, La63/v;->z:Lkotlin/jvm/internal/g0;

    iget-object v9, v3, La63/v;->y:Lv53/c;

    iget-object v10, v3, La63/v;->x:La63/i0;

    iget-object v11, v3, La63/v;->w:La63/a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    move-object v5, v2

    move-object v2, v8

    move-object/from16 v8, v16

    move-object/from16 v16, v7

    move-object v7, v3

    move-object v3, v11

    move-object/from16 v11, v16

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object v1

    invoke-virtual {v1}, Lf63/c;->e()Li63/v;

    move-result-object v1

    invoke-static {v1}, La63/y;->a(Li63/v;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-object/from16 v7, p1

    iput-object v7, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v0}, Lw53/b;->c()Le63/b;

    move-result-object v7

    invoke-interface {v7}, Le63/b;->getUrl()Li63/e0;

    move-result-object v7

    iget-object v7, v7, Li63/e0;->a:Li63/b0;

    invoke-virtual {v0}, Lw53/b;->c()Le63/b;

    move-result-object v0

    invoke-interface {v0}, Le63/b;->getUrl()Li63/e0;

    move-result-object v0

    invoke-static {v0}, Lbi/g;->D(Li63/e0;)Ljava/lang/String;

    move-result-object v0

    move-object v9, v5

    move-object v8, v7

    move-object v5, v0

    move-object v7, v3

    move-object/from16 v0, p0

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p3

    :goto_1
    iget-object v10, v1, Lv53/c;->J:Lad3/z;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La63/x;->c:Lio/sentry/hints/j;

    iget-object v12, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Lw53/b;

    invoke-virtual {v12}, Lw53/b;->d()Lf63/c;

    invoke-virtual {v10, v11}, Lad3/z;->v(Lio/sentry/hints/j;)V

    iget-object v10, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Lw53/b;

    invoke-virtual {v10}, Lw53/b;->d()Lf63/c;

    move-result-object v10

    invoke-interface {v10}, Li63/s;->getHeaders()Li63/m;

    move-result-object v10

    sget-object v11, Li63/r;->a:Ljava/util/List;

    const-string v11, "Location"

    invoke-interface {v10, v11}, Lo63/m;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Le63/d;

    invoke-direct {v11}, Le63/d;-><init>()V

    iget-object v12, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v12, Le63/d;

    invoke-virtual {v11, v12}, Le63/d;->b(Le63/d;)V

    iget-object v12, v11, Le63/d;->a:Li63/z;

    iget-object v13, v12, Li63/z;->j:Laj/c;

    iget-object v13, v13, Laj/c;->x:Ljava/lang/Object;

    check-cast v13, Li63/x;

    iget-object v13, v13, Lal/a;->x:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    invoke-interface {v13}, Ljava/util/Map;->clear()V

    if-eqz v10, :cond_4

    invoke-static {v12, v10}, Li63/a0;->b(Li63/z;Ljava/lang/String;)V

    :cond_4
    const-string v10, "<this>"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v8, Li63/b0;->a:Ljava/lang/String;

    const-string v14, "https"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    const-string v6, "wss"

    if-nez v15, :cond_5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    :cond_5
    iget-object v13, v12, Li63/z;->a:Li63/b0;

    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v13, Li63/b0;->a:Ljava/lang/String;

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v0

    :cond_7
    :goto_2
    invoke-static {v12}, Landroidx/room/c1;->v(Li63/z;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, v11, Le63/d;->c:Li63/n;

    iget-object v6, v6, Lal/a;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    const-string v10, "Authorization"

    invoke-interface {v6, v10}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iput-object v11, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v3, v7, La63/v;->w:La63/a;

    iput-object v0, v7, La63/v;->x:La63/i0;

    iput-object v1, v7, La63/v;->y:Lv53/c;

    iput-object v2, v7, La63/v;->z:Lkotlin/jvm/internal/g0;

    iput-object v9, v7, La63/v;->E:Lkotlin/jvm/internal/g0;

    iput-object v8, v7, La63/v;->F:Li63/b0;

    iput-object v5, v7, La63/v;->G:Ljava/lang/String;

    iput-object v2, v7, La63/v;->H:Lkotlin/jvm/internal/g0;

    const/4 v6, 0x1

    iput v6, v7, La63/v;->J:I

    invoke-interface {v0, v11, v7}, La63/i0;->a(Le63/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_9

    return-object v4

    :cond_9
    move-object v11, v9

    move-object v9, v1

    move-object v1, v10

    move-object v10, v0

    move-object v0, v2

    :goto_3
    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lw53/b;

    invoke-virtual {v0}, Lw53/b;->d()Lf63/c;

    move-result-object v0

    invoke-virtual {v0}, Lf63/c;->e()Li63/v;

    move-result-object v0

    invoke-static {v0}, La63/y;->a(Li63/v;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object v0

    :cond_a
    move-object v1, v9

    move-object v0, v10

    move-object v9, v11

    goto/16 :goto_1
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La63/a;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lqt/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, La63/e0;

    invoke-direct {p1}, La63/e0;-><init>()V

    return-object p1

    :pswitch_0
    new-instance p1, La63/z;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_1
    new-instance v0, Lio/sentry/hints/j;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/hints/j;-><init>(I)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, La63/x;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_2
    new-instance v0, La3/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, La3/p;-><init>(I)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, La63/u;

    iget-object v1, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    iget-object v2, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    iget-object v0, v0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v2, v0}, La63/u;-><init>(Ljava/util/Set;Ljava/util/Map;Ljava/nio/charset/Charset;)V

    return-object p1

    :pswitch_3
    new-instance v0, La63/l;

    invoke-direct {v0}, La63/l;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, La63/o;

    iget-object v1, v0, La63/l;->a:Ljava/util/ArrayList;

    invoke-static {v1}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, La63/l;->b:Ljava/util/ArrayList;

    invoke-static {v2}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iget-boolean v0, v0, La63/l;->c:Z

    invoke-direct {p1, v1, v2, v0}, La63/o;-><init>(Ljava/util/List;Ljava/util/List;Z)V

    return-object p1

    :pswitch_4
    new-instance p1, La63/d;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lv53/c;)V
    .locals 12

    iget v0, p0, La63/a;->a:I

    const-string v1, " was not registered for this pipeline"

    const-string v2, "Phase "

    const/4 v3, 0x3

    const/4 v4, -0x1

    const-string v5, "reference"

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v10, "scope"

    const-string v11, "plugin"

    packed-switch v0, :pswitch_data_0

    check-cast p1, La63/e0;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lv53/c;->E:Le63/f;

    sget-object v1, Le63/f;->k:Lhc3/x;

    new-instance v2, La63/w;

    invoke-direct {v2, p1, p2, v9, v8}, La63/w;-><init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V

    invoke-virtual {v0, v1, v2}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    return-void

    :pswitch_0
    check-cast p1, La63/z;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lv53/c;->E:Le63/f;

    sget-object v0, Le63/f;->g:Lhc3/x;

    new-instance v1, La63/c;

    invoke-direct {v1, p2, v9, v7}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    return-void

    :pswitch_1
    check-cast p1, La63/x;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La63/e0;->b:La63/a;

    invoke-static {p2}, La63/r;->a(Lv53/c;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La63/e0;

    new-instance v1, La63/w;

    invoke-direct {v1, p1, p2, v9, v6}, La63/w;-><init>(Ljava/lang/Object;Lv53/c;Lq83/d;I)V

    iget-object p1, v0, La63/e0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_2
    check-cast p1, La63/u;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lv53/c;->E:Le63/f;

    sget-object v1, Le63/f;->j:Lhc3/x;

    new-instance v2, La63/s;

    invoke-direct {v2, p1, v9, v6}, La63/s;-><init>(La63/u;Lq83/d;I)V

    invoke-virtual {v0, v1, v2}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    iget-object p2, p2, Lv53/c;->F:Lf63/b;

    sget-object v0, Lf63/b;->l:Lhc3/x;

    new-instance v1, La63/s;

    invoke-direct {v1, p1, v9, v8}, La63/s;-><init>(La63/u;Lq83/d;I)V

    invoke-virtual {p2, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    return-void

    :pswitch_3
    check-cast p1, La63/o;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lv53/c;->E:Le63/f;

    sget-object v6, Le63/f;->g:Lhc3/x;

    new-instance v10, La63/j;

    invoke-direct {v10, p1, v9, v8}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v6, v10}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    new-instance v0, Lhc3/x;

    const-string v6, "BeforeReceive"

    invoke-direct {v0, v6, v7}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    iget-object v6, p2, Lv53/c;->F:Lf63/b;

    sget-object v8, Lf63/b;->j:Lhc3/x;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lr63/d;->e(Lhc3/x;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v8}, Lr63/d;->c(Lhc3/x;)I

    move-result v5

    if-eq v5, v4, :cond_1

    iget-object v1, v6, Lr63/d;->a:Ljava/util/ArrayList;

    new-instance v2, Lr63/c;

    new-instance v4, Lr63/h;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-direct {v2, v0, v4}, Lr63/c;-><init>(Lhc3/x;Le93/b;)V

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_0
    new-instance v1, La63/j;

    invoke-direct {v1, p1, v9, v7}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v6, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    sget-object v0, La63/e0;->b:La63/a;

    invoke-static {p2}, La63/r;->a(Lv53/c;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La63/e0;

    new-instance v0, La63/j;

    invoke-direct {v0, p1, v9, v3}, La63/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, p2, La63/e0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    new-instance p1, Lb83/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lb83/c;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    check-cast p1, La63/d;

    invoke-static {p1, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhc3/x;

    const-string v0, "ObservableContent"

    invoke-direct {p1, v0, v7}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    iget-object v0, p2, Lv53/c;->E:Le63/f;

    sget-object v7, Le63/f;->j:Lhc3/x;

    iget-object v10, v0, Lr63/d;->a:Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lr63/d;->e(Lhc3/x;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_6

    :cond_2
    invoke-virtual {v0, v7}, Lr63/d;->c(Lhc3/x;)I

    move-result v5

    if-eq v5, v4, :cond_9

    add-int/lit8 v1, v5, 0x1

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-gt v1, v2, :cond_8

    :goto_1
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v11, v4, Lr63/c;

    if-eqz v11, :cond_3

    check-cast v4, Lr63/c;

    goto :goto_2

    :cond_3
    move-object v4, v9

    :goto_2
    if-eqz v4, :cond_8

    iget-object v4, v4, Lr63/c;->b:Le93/b;

    if-nez v4, :cond_4

    goto :goto_5

    :cond_4
    instance-of v11, v4, Lr63/g;

    if-eqz v11, :cond_5

    check-cast v4, Lr63/g;

    goto :goto_3

    :cond_5
    move-object v4, v9

    :goto_3
    if-eqz v4, :cond_7

    iget-object v4, v4, Lr63/g;->d:Lhc3/x;

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v5, v1

    :cond_7
    :goto_4
    if-eq v1, v2, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_8
    :goto_5
    add-int/2addr v5, v8

    new-instance v1, Lr63/c;

    new-instance v2, Lr63/g;

    invoke-direct {v2, v7}, Lr63/g;-><init>(Lhc3/x;)V

    invoke-direct {v1, p1, v2}, Lr63/c;-><init>(Lhc3/x;Le93/b;)V

    invoke-virtual {v10, v5, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_6
    new-instance v1, La63/b;

    invoke-direct {v1, v3, v6, v9}, La63/b;-><init>(IILq83/d;)V

    invoke-virtual {v0, p1, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    iget-object p1, p2, Lv53/c;->H:Lf63/b;

    sget-object p2, Lf63/b;->i:Lhc3/x;

    new-instance v0, La63/c;

    invoke-direct {v0, v3, v6, v9}, La63/c;-><init>(IILq83/d;)V

    invoke-virtual {p1, p2, v0}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    return-void

    :cond_9
    new-instance p1, Lb83/c;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lb83/c;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getKey()Lo63/a;
    .locals 1

    iget v0, p0, La63/a;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, La63/e0;->c:Lo63/a;

    return-object v0

    :pswitch_0
    sget-object v0, La63/z;->b:Lo63/a;

    return-object v0

    :pswitch_1
    sget-object v0, La63/x;->b:Lo63/a;

    return-object v0

    :pswitch_2
    sget-object v0, La63/u;->e:Lo63/a;

    return-object v0

    :pswitch_3
    sget-object v0, La63/o;->e:Lo63/a;

    return-object v0

    :pswitch_4
    sget-object v0, La63/d;->b:Lo63/a;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
