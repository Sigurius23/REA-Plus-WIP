.class public final Ljb3/m;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljb3/p;


# direct methods
.method public synthetic constructor <init>(Ljb3/p;I)V
    .locals 0

    iput p2, p0, Ljb3/m;->w:I

    iput-object p1, p0, Ljb3/m;->x:Ljb3/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ljb3/m;->w:I

    check-cast p1, Lva3/h;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/m;->x:Ljb3/p;

    iget-object v1, v0, Ljb3/p;->i:Ljb3/q;

    iget-object v1, v1, Ljb3/q;->b:Lhb3/k;

    iget-object v0, v0, Ljb3/p;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object p1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->p:Lwa3/i;

    sget-object v2, Lqa3/y0;->Q:Lqa3/l;

    invoke-virtual {v2, v0, p1}, Lwa3/c;->c(Ljava/io/ByteArrayInputStream;Lwa3/i;)Lwa3/v;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lqa3/y0;

    if-nez v8, :cond_1

    :goto_0
    const/4 p1, 0x0

    goto/16 :goto_4

    :cond_1
    iget-object p1, v1, Lhb3/k;->i:Lhb3/x;

    iget-object v0, p1, Lhb3/x;->a:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->b:Lsa3/f;

    iget-object v10, v0, Lhb3/k;->d:Lsa3/h;

    iget-object v2, v8, Lqa3/y0;->K:Ljava/util/List;

    const-string v3, "getAnnotationList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/h;

    iget-object v5, p1, Lhb3/x;->b:Lwe/o;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v1}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ls93/g;->a:Ls93/f;

    :goto_2
    move-object v5, p1

    goto :goto_3

    :cond_3
    new-instance p1, Ls93/j;

    const/4 v2, 0x0

    invoke-direct {p1, v3, v2}, Ls93/j;-><init>(Ljava/util/List;I)V

    goto :goto_2

    :goto_3
    sget-object p1, Lsa3/d;->d:Lsa3/c;

    iget v2, v8, Lqa3/y0;->z:I

    invoke-virtual {p1, v2}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lqa3/k1;

    invoke-static {p1}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v7

    new-instance v2, Ljb3/u;

    iget-object p1, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v3, p1, Lhb3/i;->a:Lkb3/k;

    iget-object v4, v0, Lhb3/k;->c:Lr93/k;

    iget p1, v8, Lqa3/y0;->E:I

    invoke-static {v1, p1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v6

    iget-object v9, v0, Lhb3/k;->b:Lsa3/f;

    iget-object v11, v0, Lhb3/k;->e:Lsa3/j;

    iget-object v12, v0, Lhb3/k;->g:Ljb3/j;

    invoke-direct/range {v2 .. v12}, Ljb3/u;-><init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Lr93/r;Lqa3/y0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V

    iget-object p1, v8, Lqa3/y0;->F:Ljava/util/List;

    const-string v1, "getTypeParameterList(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, p1}, Lhb3/k;->b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;

    move-result-object p1

    iget-object p1, p1, Lhb3/k;->h:Lhb3/h0;

    invoke-virtual {p1}, Lhb3/h0;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v8, v10}, Ljc/x;->z0(Lqa3/y0;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object v1

    invoke-static {v8, v10}, Ljc/x;->G(Lqa3/y0;Lsa3/h;)Lqa3/w0;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Lhb3/h0;->d(Lqa3/w0;Z)Llb3/c0;

    move-result-object p1

    invoke-virtual {v2, v0, v1, p1}, Ljb3/u;->M0(Ljava/util/List;Llb3/c0;Llb3/c0;)V

    move-object p1, v2

    :goto_4
    return-object p1

    :pswitch_0
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/m;->x:Ljb3/p;

    iget-object v1, v0, Ljb3/p;->b:Ljava/util/LinkedHashMap;

    sget-object v2, Lqa3/k0;->f0:Lqa3/a;

    const-string v3, "PARSER"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ljb3/p;->i:Ljb3/q;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-eqz v1, :cond_4

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v1, Ljb3/o;

    invoke-direct {v1, v2, v3, v0}, Ljb3/o;-><init>(Lwa3/x;Ljava/io/ByteArrayInputStream;Ljb3/q;)V

    invoke-static {v1}, Lxb3/k;->w(Lc93/a;)Lxb3/i;

    move-result-object v1

    invoke-static {v1}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    goto :goto_5

    :cond_4
    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_5
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/k0;

    iget-object v4, v0, Ljb3/q;->b:Lhb3/k;

    iget-object v4, v4, Lhb3/k;->i:Lhb3/x;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, Lhb3/x;->g(Lqa3/k0;Z)Ljb3/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_5
    invoke-virtual {v0, v3, p1}, Ljb3/q;->d(Ljava/util/ArrayList;Lva3/h;)V

    invoke-static {v3}, Lub3/j;->b(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :pswitch_1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/m;->x:Ljb3/p;

    iget-object v1, v0, Ljb3/p;->a:Ljava/util/LinkedHashMap;

    sget-object v2, Lqa3/c0;->Z:Lqa3/a;

    const-string v3, "PARSER"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Ljb3/p;->i:Ljb3/q;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    if-eqz v1, :cond_6

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v1, Ljb3/o;

    invoke-direct {v1, v2, v3, v0}, Ljb3/o;-><init>(Lwa3/x;Ljava/io/ByteArrayInputStream;Ljb3/q;)V

    invoke-static {v1}, Lxb3/k;->w(Lc93/a;)Lxb3/i;

    move-result-object v1

    invoke-static {v1}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    goto :goto_7

    :cond_6
    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_7
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/c0;

    iget-object v4, v0, Ljb3/q;->b:Lhb3/k;

    iget-object v4, v4, Lhb3/k;->i:Lhb3/x;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lhb3/x;->f(Lqa3/c0;)Ljb3/t;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb3/q;->k(Ljb3/t;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_9

    :cond_8
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_7

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_9
    invoke-virtual {v0, v3, p1}, Ljb3/q;->c(Ljava/util/ArrayList;Lva3/h;)V

    invoke-static {v3}, Lub3/j;->b(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
