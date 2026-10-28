.class public final Ljb3/d;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljb3/h;


# direct methods
.method public synthetic constructor <init>(Ljb3/h;I)V
    .locals 0

    iput p2, p0, Ljb3/d;->w:I

    iput-object p1, p0, Ljb3/d;->x:Ljb3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ljb3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    invoke-static {v0}, Ljc/x;->u(Lr93/i;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->e:Lhb3/a;

    iget-object v0, v0, Ljb3/h;->U:Lhb3/y;

    invoke-interface {v1, v0}, Lhb3/c;->g(Lhb3/y;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    invoke-virtual {v0}, Ljb3/h;->isInline()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljb3/h;->isValue()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v1, v0, Ljb3/h;->F:Lsa3/a;

    const/4 v2, 0x5

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2, v3}, Lsa3/a;->a(III)Z

    move-result v5

    iget-object v4, v0, Ljb3/h;->E:Lqa3/k;

    iget-object v1, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v6, v1, Lhb3/k;->b:Lsa3/f;

    iget-object v7, v1, Lhb3/k;->d:Lsa3/h;

    new-instance v8, Lh3/i;

    iget-object v1, v1, Lhb3/k;->h:Lhb3/h0;

    invoke-direct {v8, v1}, Lh3/i;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lg40/f4;

    invoke-direct {v9, v0}, Lg40/f4;-><init>(Ljava/lang/Object;)V

    invoke-static/range {v4 .. v9}, Ldc/a;->H(Lqa3/k;ZLsa3/f;Lsa3/h;Lh3/i;Lg40/f4;)Lr93/y0;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v5, :cond_4

    invoke-virtual {v0}, Ljb3/h;->s()Lu93/j;

    move-result-object v1

    if-eqz v1, :cond_3

    check-cast v1, Lu93/x;

    invoke-virtual {v1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/a1;

    check-cast v1, Lu93/n;

    invoke-virtual {v1}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljb3/h;->Y(Lva3/h;)Llb3/c0;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v0, Lr93/x;

    invoke-direct {v0, v1, v2}, Lr93/x;-><init>(Lva3/h;Lob3/h;)V

    move-object v1, v0

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Value class has no underlying property: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Inline class has no primary constructor: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    const/4 v1, 0x0

    :goto_1
    return-object v1

    :pswitch_2
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->I:Lr93/a0;

    sget-object v2, Lr93/a0;->y:Lr93/a0;

    if-eq v1, v2, :cond_5

    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :cond_5
    iget-object v1, v0, Ljb3/h;->E:Lqa3/k;

    iget-object v1, v1, Lqa3/k;->U:Ljava/util/List;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    iget-object v4, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v5, v4, Lhb3/k;->a:Lhb3/i;

    iget-object v4, v4, Lhb3/k;->b:Lsa3/f;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v4, v3}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v3

    invoke-virtual {v5, v3}, Lhb3/i;->b(Lva3/c;)Lr93/e;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move-object v0, v2

    goto :goto_3

    :cond_8
    invoke-static {v0}, Lya3/r;->a(Lr93/e;)Ljava/util/Collection;

    move-result-object v0

    :goto_3
    return-object v0

    :pswitch_3
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->E:Lqa3/k;

    iget v2, v1, Lqa3/k;->y:I

    const/4 v3, 0x4

    and-int/2addr v2, v3

    const/4 v4, 0x0

    if-ne v2, v3, :cond_9

    iget-object v2, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v2, v2, Lhb3/k;->b:Lsa3/f;

    iget v1, v1, Lqa3/k;->F:I

    invoke-static {v2, v1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v1

    invoke-virtual {v0}, Ljb3/h;->X()Ljb3/g;

    move-result-object v0

    sget-object v2, Lz93/c;->G:Lz93/c;

    invoke-virtual {v0, v1, v2}, Ljb3/g;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_9

    move-object v4, v0

    check-cast v4, Lr93/e;

    :cond_9
    return-object v4

    :pswitch_4
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v2, v0, Ljb3/h;->E:Lqa3/k;

    iget-object v2, v2, Lqa3/k;->P:Ljava/util/List;

    const-string v3, "getConstructorList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lqa3/o;

    sget-object v6, Lsa3/d;->n:Lsa3/b;

    iget v5, v5, Lqa3/o;->z:I

    invoke-virtual {v6, v5}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/o;

    iget-object v5, v1, Lhb3/k;->i:Lhb3/x;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v6, 0x0

    invoke-virtual {v5, v4, v6}, Lhb3/x;->e(Lqa3/o;Z)Ljb3/c;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_c
    invoke-virtual {v0}, Ljb3/h;->s()Lu93/j;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->n:Lt93/b;

    invoke-interface {v1, v0}, Lt93/b;->c(Lr93/e;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ljb3/d;->x:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->K:Lr93/f;

    invoke-virtual {v1}, Lr93/f;->a()Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, Lya3/e;

    invoke-direct {v1, v0}, Lya3/e;-><init>(Lr93/e;)V

    invoke-virtual {v0}, Lu93/b;->i()Llb3/c0;

    move-result-object v0

    iput-object v0, v1, Lu93/x;->H:Llb3/y;

    goto :goto_7

    :cond_d
    iget-object v1, v0, Ljb3/h;->E:Lqa3/k;

    iget-object v1, v1, Lqa3/k;->P:Ljava/util/List;

    const-string v2, "getConstructorList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lqa3/o;

    sget-object v5, Lsa3/d;->n:Lsa3/b;

    iget v4, v4, Lqa3/o;->z:I

    invoke-virtual {v5, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_6

    :cond_f
    move-object v2, v3

    :goto_6
    check-cast v2, Lqa3/o;

    if-eqz v2, :cond_10

    iget-object v0, v0, Ljb3/h;->L:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->i:Lhb3/x;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lhb3/x;->e(Lqa3/o;Z)Ljb3/c;

    move-result-object v1

    goto :goto_7

    :cond_10
    move-object v1, v3

    :goto_7
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
