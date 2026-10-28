.class public final Lce/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lce/d;->w:I

    iput-object p2, p0, Lce/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lce/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lu93/x;Llb3/a1;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lce/d;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lce/d;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    iget v1, v0, Lce/d;->w:I

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/4 v3, 0x0

    const/16 v4, 0xa

    iget-object v5, v0, Lce/d;->y:Ljava/lang/Object;

    iget-object v6, v0, Lce/d;->x:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unable to resolve identity from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lxf/c;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/lang/Exception;

    invoke-static {v5, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_0
    check-cast v6, Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

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
    check-cast v5, Lx30/t;

    iget-object v2, v5, Lx30/t;->a:Lg40/k0;

    invoke-static {v1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h1;

    return-object v1

    :pswitch_1
    check-cast v6, Lwb3/h;

    check-cast v5, Lc93/a;

    iget-object v1, v6, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v1}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    if-ltz v4, :cond_7

    check-cast v7, Llb3/u0;

    const/4 v9, 0x1

    if-nez v5, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    new-instance v10, Lwb3/g;

    invoke-direct {v10, v6, v9}, Lwb3/g;-><init>(Lwb3/h;I)V

    invoke-static {v10, v4}, Lkotlin/reflect/jvm/internal/ConvertFromMetadataKt;->convertTypeArgumentToJavaType(Lc93/a;I)Lc93/a;

    move-result-object v4

    :goto_2
    invoke-virtual {v7}, Llb3/u0;->c()Z

    move-result v10

    if-eqz v10, :cond_3

    sget-object v4, Lj93/d0;->c:Lj93/d0;

    goto :goto_3

    :cond_3
    new-instance v10, Lwb3/h;

    invoke-virtual {v7}, Llb3/u0;->b()Llb3/y;

    move-result-object v11

    const-string v12, "getType(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v11, v4}, Lwb3/h;-><init>(Llb3/y;Lc93/a;)V

    invoke-virtual {v7}, Llb3/u0;->a()Llb3/g1;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_6

    if-eq v4, v9, :cond_5

    const/4 v7, 0x2

    if-ne v4, v7, :cond_4

    sget-object v4, Lj93/d0;->c:Lj93/d0;

    new-instance v4, Lj93/d0;

    sget-object v7, Lj93/e0;->y:Lj93/e0;

    invoke-direct {v4, v7, v10}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    goto :goto_3

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    sget-object v4, Lj93/d0;->c:Lj93/d0;

    new-instance v4, Lj93/d0;

    sget-object v7, Lj93/e0;->x:Lj93/e0;

    invoke-direct {v4, v7, v10}, Lj93/d0;-><init>(Lj93/e0;Lj93/a0;)V

    goto :goto_3

    :cond_6
    sget-object v4, Lj93/d0;->c:Lj93/d0;

    invoke-static {v10}, Lx43/j;->I(Lj93/a0;)Lj93/d0;

    move-result-object v4

    :goto_3
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v8

    goto :goto_1

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_8
    :goto_4
    return-object v2

    :pswitch_2
    move-object v9, v6

    check-cast v9, Lu93/t0;

    move-object v8, v5

    check-cast v8, Lu93/j;

    new-instance v5, Lu93/t0;

    iget-object v6, v9, Lu93/t0;->e0:Lkb3/n;

    iget-object v7, v9, Lu93/t0;->f0:Lr93/w0;

    move-object v1, v8

    check-cast v1, Lal/a;

    invoke-virtual {v1}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v10

    move-object v1, v8

    check-cast v1, Lu93/x;

    invoke-virtual {v1}, Lu93/x;->getKind()I

    move-result v11

    const-string v2, "getKind(...)"

    invoke-static {v11, v2}, Ljh3/c;->m(ILjava/lang/String;)V

    iget-object v2, v9, Lu93/t0;->f0:Lr93/w0;

    move-object v12, v2

    check-cast v12, Lu93/o;

    invoke-virtual {v12}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v12

    const-string v13, "getSource(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v5 .. v12}, Lu93/t0;-><init>(Lkb3/n;Lr93/w0;Lu93/j;Lu93/s0;Ls93/i;ILr93/s0;)V

    sget-object v6, Lu93/t0;->h0:Lt9/c0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v6, v2

    check-cast v6, Ljb3/u;

    invoke-virtual {v6}, Ljb3/u;->J0()Lr93/e;

    move-result-object v7

    if-nez v7, :cond_9

    move-object v6, v3

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v6

    invoke-static {v6}, Llb3/a1;->d(Llb3/y;)Llb3/a1;

    move-result-object v6

    :goto_5
    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    iget-object v7, v1, Lu93/x;->K:Lr93/q0;

    if-eqz v7, :cond_b

    check-cast v7, Lu93/d;

    invoke-virtual {v7, v6}, Lu93/d;->I0(Llb3/a1;)Lu93/d;

    move-result-object v3

    :cond_b
    move-object v12, v3

    invoke-virtual {v1}, Lu93/x;->c0()Ljava/util/List;

    move-result-object v1

    const-string v3, "getContextReceiverParameters(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/q0;

    check-cast v3, Lu93/d;

    invoke-virtual {v3, v6}, Lu93/d;->I0(Llb3/a1;)Lu93/d;

    move-result-object v3

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    check-cast v2, Lu93/g;

    invoke-virtual {v2}, Lu93/g;->j()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v9}, Lu93/x;->v()Ljava/util/List;

    move-result-object v15

    iget-object v1, v9, Lu93/x;->H:Llb3/y;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v17, Lr93/a0;->x:Lr93/a0;

    iget-object v2, v2, Lu93/g;->G:Lr93/r;

    const/4 v11, 0x0

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    move-object v10, v5

    invoke-virtual/range {v10 .. v18}, Lu93/x;->O0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)V

    move-object v3, v5

    :goto_7
    return-object v3

    :pswitch_3
    new-instance v1, Lub3/f;

    invoke-direct {v1}, Lub3/f;-><init>()V

    check-cast v5, Lu93/x;

    invoke-virtual {v5}, Lu93/x;->h()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/w;

    move-object v4, v6

    check-cast v4, Llb3/a1;

    invoke-interface {v3, v4}, Lr93/w;->d(Llb3/a1;)Lr93/w;

    move-result-object v3

    invoke-virtual {v1, v3}, Lub3/f;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    return-object v1

    :pswitch_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "proxy select end: url="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Lud3/e0;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; proxies="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "dns resolved: domain="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; records="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/util/List;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_6
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "starting connection: addr="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v6, Ljava/net/InetSocketAddress;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "; proxy="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v5, Ljava/net/Proxy;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_7
    check-cast v6, Lja3/i;

    check-cast v5, Lr93/e;

    new-instance v1, Lja3/i;

    iget-object v2, v6, Lja3/i;->J:Lzt/q;

    iget-object v3, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v3, Lia3/a;

    new-instance v7, Lia3/a;

    iget-object v8, v3, Lia3/a;->a:Lkb3/n;

    iget-object v9, v3, Lia3/a;->b:Laj/c;

    iget-object v10, v3, Lia3/a;->c:Laj/d;

    iget-object v11, v3, Lia3/a;->d:Loa3/f;

    iget-object v12, v3, Lia3/a;->e:Lga3/h;

    iget-object v13, v3, Lia3/a;->f:Lhb3/o;

    iget-object v14, v3, Lia3/a;->h:Lga3/h;

    iget-object v15, v3, Lia3/a;->i:Lqt/e;

    iget-object v4, v3, Lia3/a;->j:Lw93/d;

    iget-object v0, v3, Lia3/a;->k:Laj/d;

    move-object/from16 v17, v0

    iget-object v0, v3, Lia3/a;->l:Loa3/g;

    move-object/from16 v18, v0

    iget-object v0, v3, Lia3/a;->m:Lr93/v0;

    move-object/from16 v19, v0

    iget-object v0, v3, Lia3/a;->n:Lz93/b;

    move-object/from16 v20, v0

    iget-object v0, v3, Lia3/a;->o:Lr93/b0;

    move-object/from16 v21, v0

    iget-object v0, v3, Lia3/a;->p:Lo93/l;

    move-object/from16 v22, v0

    iget-object v0, v3, Lia3/a;->q:Lfa3/b;

    move-object/from16 v23, v0

    iget-object v0, v3, Lia3/a;->r:Ljc/b;

    move-object/from16 v24, v0

    iget-object v0, v3, Lia3/a;->s:Lfa3/l;

    move-object/from16 v25, v0

    iget-object v0, v3, Lia3/a;->t:Lia3/b;

    move-object/from16 v26, v0

    iget-object v0, v3, Lia3/a;->u:Lmb3/k;

    move-object/from16 v27, v0

    iget-object v0, v3, Lia3/a;->v:Lch3/h;

    iget-object v3, v3, Lia3/a;->w:Loa3/g;

    move-object/from16 v28, v0

    move-object/from16 v29, v3

    move-object/from16 v16, v4

    invoke-direct/range {v7 .. v29}, Lia3/a;-><init>(Lkb3/n;Laj/c;Laj/d;Loa3/f;Lga3/h;Lhb3/o;Lga3/h;Lqt/e;Lw93/d;Laj/d;Loa3/g;Lr93/v0;Lz93/b;Lr93/b0;Lo93/l;Lfa3/b;Ljc/b;Lfa3/l;Lia3/b;Lmb3/k;Lch3/h;Loa3/g;)V

    new-instance v0, Lzt/q;

    iget-object v3, v2, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lia3/f;

    iget-object v2, v2, Lzt/q;->z:Ljava/lang/Object;

    invoke-direct {v0, v7, v3, v2}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    invoke-virtual {v6}, Lu93/k;->g()Lr93/k;

    move-result-object v2

    const-string v3, "getContainingDeclaration(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v6, Lja3/i;->H:Lx93/n;

    invoke-direct {v1, v0, v2, v3, v5}, Lja3/i;-><init>(Lzt/q;Lr93/k;Lx93/n;Lr93/e;)V

    return-object v1

    :pswitch_8
    check-cast v6, Lmb3/i;

    check-cast v5, Lmb3/f;

    iget-object v0, v6, Lmb3/i;->E:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    move-object v2, v0

    :goto_9
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/f1;

    invoke-virtual {v2, v5}, Llb3/f1;->s0(Lmb3/f;)Llb3/f1;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_f
    return-object v0

    :pswitch_9
    check-cast v6, Ljava/lang/Class;

    check-cast v5, Ljava/util/Map;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v0, 0x40

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Iterable;

    sget-object v12, Lm93/e;->w:Lm93/e;

    const/16 v13, 0x30

    const-string v9, ", "

    const-string v10, "("

    const-string v11, ")"

    invoke-static/range {v7 .. v13}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_a
    check-cast v6, Lmb3/f;

    check-cast v5, Llb3/z;

    iget-object v0, v5, Llb3/z;->y:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob3/g;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llb3/y;

    return-object v0

    :pswitch_b
    check-cast v6, Ljb3/h;

    check-cast v5, Lqa3/x;

    iget-object v0, v6, Ljb3/h;->L:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->e:Lhb3/a;

    iget-object v1, v6, Ljb3/h;->U:Lhb3/y;

    invoke-interface {v0, v1, v5}, Lhb3/c;->s(Lhb3/a0;Lqa3/x;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_c
    check-cast v6, Lzt/q;

    check-cast v5, Ls93/i;

    const-string v0, "<this>"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalAnnotations"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->q:Lfa3/b;

    iget-object v1, v6, Lzt/q;->z:Ljava/lang/Object;

    invoke-interface {v1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfa3/t;

    invoke-static {v0, v1, v5}, Lfa3/b;->b(Lfa3/b;Lfa3/t;Ls93/i;)Lfa3/t;

    move-result-object v0

    return-object v0

    :pswitch_d
    check-cast v6, Lzt/q;

    check-cast v5, Lga3/b;

    iget-object v0, v6, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {v0}, Lr93/b0;->c()Lo93/h;

    move-result-object v0

    iget-object v1, v5, Lga3/b;->a:Lva3/e;

    invoke-virtual {v0, v1}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    const-string v1, "getDefaultType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_e
    check-cast v6, Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_10
    check-cast v5, La33/d;

    iget-object v1, v5, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Lg40/k0;

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg40/h1;

    if-eqz v1, :cond_11

    move-object v3, v1

    :cond_12
    return-object v3

    :pswitch_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring property under invalid "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object v1, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lce/z;

    invoke-static {v1}, Lx43/j;->n(Lce/z;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Lce/z;

    iget-object v1, v1, Lce/z;->a:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    check-cast v6, Lce/m;

    iget v1, v6, Lce/m;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1, v0}, Lbp/b;->o(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
