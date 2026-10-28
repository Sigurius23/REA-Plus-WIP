.class public final Lhb3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhb3/k;

.field public final b:Lwe/o;


# direct methods
.method public constructor <init>(Lhb3/k;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/x;->a:Lhb3/k;

    new-instance v0, Lwe/o;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, p1, Lhb3/i;->b:Lr93/b0;

    iget-object p1, p1, Lhb3/i;->l:Lzt/q;

    invoke-direct {v0, v1, p1}, Lwe/o;-><init>(Lr93/b0;Lzt/q;)V

    iput-object v0, p0, Lhb3/x;->b:Lwe/o;

    return-void
.end method


# virtual methods
.method public final a(Lr93/k;)Lhb3/a0;
    .locals 4

    instance-of v0, p1, Lr93/g0;

    if-eqz v0, :cond_0

    new-instance v0, Lhb3/z;

    check-cast p1, Lr93/g0;

    check-cast p1, Lu93/g0;

    iget-object p1, p1, Lu93/g0;->F:Lva3/e;

    iget-object v1, p0, Lhb3/x;->a:Lhb3/k;

    iget-object v2, v1, Lhb3/k;->b:Lsa3/f;

    iget-object v3, v1, Lhb3/k;->d:Lsa3/h;

    iget-object v1, v1, Lhb3/k;->g:Ljb3/j;

    invoke-direct {v0, p1, v2, v3, v1}, Lhb3/z;-><init>(Lva3/e;Lsa3/f;Lsa3/h;Lr93/s0;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Ljb3/h;

    if-eqz v0, :cond_1

    check-cast p1, Ljb3/h;

    iget-object p1, p1, Ljb3/h;->U:Lhb3/y;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/util/List;Ljava/util/List;Lwa3/m;I)Ljava/util/ArrayList;
    .locals 16

    move-object/from16 v1, p0

    iget-object v7, v1, Lhb3/x;->a:Lhb3/k;

    iget-object v0, v7, Lhb3/k;->c:Lr93/k;

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v0

    check-cast v8, Lr93/b;

    invoke-interface {v8}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v2

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v12, v5, 0x1

    if-ltz v5, :cond_3

    move-object v14, v0

    check-cast v14, Lqa3/w0;

    move-object/from16 v15, p2

    invoke-static {v5, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lqa3/e1;

    if-eqz v6, :cond_0

    iget v0, v6, Lqa3/e1;->y:I

    const/4 v3, 0x1

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_0

    iget v0, v6, Lqa3/e1;->z:I

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v2, :cond_1

    sget-object v3, Lsa3/d;->c:Lsa3/b;

    invoke-virtual {v3, v0}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljb3/w;

    iget-object v3, v7, Lhb3/k;->a:Lhb3/i;

    iget-object v3, v3, Lhb3/i;->a:Lkb3/k;

    move-object v4, v0

    new-instance v0, Lhb3/v;

    move-object v13, v3

    move-object v11, v4

    move-object/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v6}, Lhb3/v;-><init>(Lhb3/x;Lhb3/a0;Lwa3/v;IILqa3/e1;)V

    invoke-direct {v11, v13, v0}, Ljb3/w;-><init>(Lkb3/k;Lc93/a;)V

    move-object v0, v11

    goto :goto_2

    :cond_1
    sget-object v0, Ls93/g;->a:Ls93/f;

    :goto_2
    iget-object v1, v7, Lhb3/k;->h:Lhb3/h0;

    invoke-virtual {v1, v14}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v8, v1, v3, v0, v5}, Lya3/p;->d(Lr93/b;Llb3/y;Lva3/h;Ls93/i;I)Lu93/p0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v1, p0

    move v5, v12

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_4
    return-object v9
.end method

.method public final c(Lwa3/m;II)Ls93/i;
    .locals 3

    sget-object v0, Lsa3/d;->c:Lsa3/b;

    invoke-virtual {v0, p2}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Ls93/g;->a:Ls93/f;

    return-object p1

    :cond_0
    new-instance p2, Ljb3/w;

    iget-object v0, p0, Lhb3/x;->a:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->a:Lkb3/k;

    new-instance v1, Lhb3/s;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p3, v2}, Lhb3/s;-><init>(Lhb3/x;Lwa3/v;II)V

    invoke-direct {p2, v0, v1}, Ljb3/w;-><init>(Lkb3/k;Lc93/a;)V

    return-object p2
.end method

.method public final d(Lqa3/k0;Z)Ls93/i;
    .locals 3

    sget-object v0, Lsa3/d;->c:Lsa3/b;

    iget v1, p1, Lqa3/k0;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Ls93/g;->a:Ls93/f;

    return-object p1

    :cond_0
    new-instance v0, Ljb3/w;

    iget-object v1, p0, Lhb3/x;->a:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->a:Lkb3/k;

    new-instance v2, Lhb3/t;

    invoke-direct {v2, p0, p2, p1}, Lhb3/t;-><init>(Lhb3/x;ZLqa3/k0;)V

    invoke-direct {v0, v1, v2}, Ljb3/w;-><init>(Lkb3/k;Lc93/a;)V

    return-object v0
.end method

.method public final e(Lqa3/o;Z)Ljb3/c;
    .locals 14

    move-object v6, p1

    iget-object v12, p0, Lhb3/x;->a:Lhb3/k;

    iget-object v0, v12, Lhb3/k;->c:Lr93/k;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lr93/e;

    new-instance v0, Ljb3/c;

    iget v2, v6, Lqa3/o;->z:I

    const/4 v13, 0x1

    invoke-virtual {p0, p1, v2, v13}, Lhb3/x;->c(Lwa3/m;II)Ls93/i;

    move-result-object v3

    iget-object v7, v12, Lhb3/k;->b:Lsa3/f;

    iget-object v8, v12, Lhb3/k;->d:Lsa3/h;

    iget-object v9, v12, Lhb3/k;->e:Lsa3/j;

    iget-object v10, v12, Lhb3/k;->g:Ljb3/j;

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v11, 0x0

    move/from16 v4, p2

    invoke-direct/range {v0 .. v11}, Ljb3/c;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILqa3/o;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-static {v12, v0, v2}, Lhb3/k;->b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;

    move-result-object v2

    iget-object v2, v2, Lhb3/k;->i:Lhb3/x;

    iget-object v3, v6, Lqa3/o;->E:Ljava/util/List;

    const-string v4, "getValueParameterList(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, p1, v13}, Lhb3/x;->h(Ljava/util/List;Lwa3/m;I)Ljava/util/List;

    move-result-object v2

    sget-object v3, Lsa3/d;->d:Lsa3/c;

    iget v4, v6, Lqa3/o;->z:I

    invoke-virtual {v3, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/k1;

    invoke-static {v3}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lu93/j;->X0(Ljava/util/List;Lr93/r;)V

    invoke-interface {v1}, Lr93/e;->i()Llb3/c0;

    move-result-object v2

    invoke-virtual {v0, v2}, Lu93/x;->T0(Llb3/c0;)V

    invoke-interface {v1}, Lr93/z;->U()Z

    move-result v1

    iput-boolean v1, v0, Lu93/x;->S:Z

    sget-object v1, Lsa3/d;->o:Lsa3/b;

    iget v2, v6, Lqa3/o;->z:I

    invoke-virtual {v1, v2}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/2addr v1, v13

    iput-boolean v1, v0, Lu93/x;->W:Z

    return-object v0
.end method

.method public final f(Lqa3/c0;)Ljb3/t;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    iget-object v13, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v1, v13, Lhb3/k;->b:Lsa3/f;

    iget-object v9, v13, Lhb3/k;->d:Lsa3/h;

    const-string v2, "proto"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, v7, Lqa3/c0;->y:I

    const/4 v14, 0x1

    and-int/2addr v2, v14

    if-ne v2, v14, :cond_0

    iget v2, v7, Lqa3/c0;->z:I

    :goto_0
    move v15, v2

    goto :goto_1

    :cond_0
    iget v2, v7, Lqa3/c0;->E:I

    and-int/lit8 v3, v2, 0x3f

    shr-int/lit8 v2, v2, 0x8

    shl-int/lit8 v2, v2, 0x6

    add-int/2addr v2, v3

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v7, v15, v14}, Lhb3/x;->c(Lwa3/m;II)Ls93/i;

    move-result-object v4

    iget v2, v7, Lqa3/c0;->y:I

    and-int/lit8 v3, v2, 0x20

    const/16 v5, 0x20

    if-ne v3, v5, :cond_1

    goto :goto_2

    :cond_1
    const/16 v3, 0x40

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_2

    :goto_2
    new-instance v2, Ljb3/a;

    iget-object v3, v13, Lhb3/k;->a:Lhb3/i;

    iget-object v3, v3, Lhb3/i;->a:Lkb3/k;

    new-instance v5, Lhb3/s;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v7, v14, v6}, Lhb3/s;-><init>(Lhb3/x;Lwa3/v;II)V

    invoke-direct {v2, v3, v5}, Ljb3/a;-><init>(Lkb3/n;Lc93/a;)V

    goto :goto_3

    :cond_2
    sget-object v2, Ls93/g;->a:Ls93/f;

    :goto_3
    iget-object v3, v13, Lhb3/k;->c:Lr93/k;

    invoke-static {v3}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v3

    iget v5, v7, Lqa3/c0;->F:I

    invoke-static {v1, v5}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v5

    invoke-virtual {v3, v5}, Lva3/e;->a(Lva3/h;)Lva3/e;

    move-result-object v3

    sget-object v5, Lhb3/d0;->a:Lva3/e;

    invoke-virtual {v3, v5}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lsa3/j;->b:Lsa3/j;

    :goto_4
    move-object v10, v3

    goto :goto_5

    :cond_3
    iget-object v3, v13, Lhb3/k;->e:Lsa3/j;

    goto :goto_4

    :goto_5
    new-instance v16, Ljb3/t;

    move-object v3, v2

    iget-object v2, v13, Lhb3/k;->c:Lr93/k;

    iget v5, v7, Lqa3/c0;->F:I

    invoke-static {v1, v5}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v5

    sget-object v1, Lsa3/d;->p:Lsa3/c;

    invoke-virtual {v1, v15}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/d0;

    invoke-static {v1}, Lge3/g;->J(Lqa3/d0;)I

    move-result v6

    iget-object v8, v13, Lhb3/k;->b:Lsa3/f;

    iget-object v11, v13, Lhb3/k;->g:Ljb3/j;

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v12, 0x0

    move-object v14, v1

    move-object/from16 v1, v16

    invoke-direct/range {v1 .. v12}, Ljb3/t;-><init>(Lr93/k;Lu93/q0;Ls93/i;Lva3/h;ILqa3/c0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;Lr93/s0;)V

    iget-object v2, v7, Lqa3/c0;->I:Ljava/util/List;

    const-string v3, "getTypeParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v1, v2}, Lhb3/k;->b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;

    move-result-object v2

    iget-object v3, v2, Lhb3/k;->i:Lhb3/x;

    iget-object v2, v2, Lhb3/k;->h:Lhb3/h0;

    invoke-static {v7, v9}, Ljc/x;->l0(Lqa3/c0;Lsa3/h;)Lqa3/w0;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {v2, v4}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v1, v4, v14}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v4

    move-object/from16 v17, v4

    goto :goto_6

    :cond_4
    move-object/from16 v17, v5

    :goto_6
    iget-object v4, v13, Lhb3/k;->c:Lr93/k;

    instance-of v6, v4, Lr93/e;

    if-eqz v6, :cond_5

    check-cast v4, Lr93/e;

    goto :goto_7

    :cond_5
    move-object v4, v5

    :goto_7
    if-eqz v4, :cond_6

    invoke-interface {v4}, Lr93/e;->q0()Lr93/q0;

    move-result-object v5

    :cond_6
    move-object/from16 v18, v5

    invoke-static {v7, v9}, Ljc/x;->w(Lqa3/c0;Lsa3/h;)Ljava/util/List;

    move-result-object v4

    iget-object v5, v7, Lqa3/c0;->O:Ljava/util/List;

    const-string v6, "getContextParameterList(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-virtual {v3, v4, v5, v7, v6}, Lhb3/x;->b(Ljava/util/List;Ljava/util/List;Lwa3/m;I)Ljava/util/ArrayList;

    move-result-object v19

    invoke-virtual {v2}, Lhb3/h0;->b()Ljava/util/List;

    move-result-object v20

    iget-object v4, v7, Lqa3/c0;->P:Ljava/util/List;

    const-string v5, "getValueParameterList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4, v7, v6}, Lhb3/x;->h(Ljava/util/List;Lwa3/m;I)Ljava/util/List;

    move-result-object v21

    invoke-static {v7, v9}, Ljc/x;->q0(Lqa3/c0;Lsa3/h;)Lqa3/w0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v22

    sget-object v2, Lsa3/d;->e:Lsa3/c;

    invoke-virtual {v2, v15}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/e0;

    invoke-static {v2}, Lhb3/j;->e(Lqa3/e0;)Lr93/a0;

    move-result-object v23

    sget-object v2, Lsa3/d;->d:Lsa3/c;

    invoke-virtual {v2, v15}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/k1;

    invoke-static {v2}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v24

    sget-object v25, Lm83/z;->w:Lm83/z;

    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v25}, Lu93/q0;->X0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;Ljava/util/Map;)Lu93/q0;

    sget-object v2, Lsa3/d;->q:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->N:Z

    sget-object v2, Lsa3/d;->r:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->O:Z

    sget-object v2, Lsa3/d;->u:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->P:Z

    sget-object v2, Lsa3/d;->s:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->Q:Z

    sget-object v2, Lsa3/d;->t:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->R:Z

    sget-object v2, Lsa3/d;->v:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->V:Z

    sget-object v2, Lsa3/d;->w:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, v1, Lu93/x;->S:Z

    sget-object v2, Lsa3/d;->x:Lsa3/b;

    invoke-virtual {v2, v15}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v26, 0x1

    xor-int/lit8 v2, v2, 0x1

    iput-boolean v2, v1, Lu93/x;->W:Z

    iget-object v2, v13, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->m:Lhb3/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public final g(Lqa3/k0;Z)Ljb3/s;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, Lhb3/x;->a:Lhb3/k;

    iget-object v2, v1, Lhb3/k;->b:Lsa3/f;

    iget-object v3, v1, Lhb3/k;->d:Lsa3/h;

    iget v4, v15, Lqa3/k0;->y:I

    const/4 v5, 0x1

    and-int/2addr v4, v5

    const/16 v20, 0x6

    if-ne v4, v5, :cond_0

    iget v4, v15, Lqa3/k0;->z:I

    goto :goto_0

    :cond_0
    iget v4, v15, Lqa3/k0;->E:I

    and-int/lit8 v6, v4, 0x3f

    shr-int/lit8 v4, v4, 0x8

    shl-int/lit8 v4, v4, 0x6

    add-int/2addr v4, v6

    :goto_0
    sget-object v21, Ls93/g;->a:Ls93/f;

    if-eqz p2, :cond_3

    iget-object v7, v15, Lqa3/k0;->U:Ljava/util/List;

    const-string v8, "getAnnotationList(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqa3/h;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v10, v0, Lhb3/x;->b:Lwe/o;

    invoke-virtual {v10, v9, v2}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    move-object/from16 v7, v21

    goto :goto_2

    :cond_2
    new-instance v7, Ls93/j;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v9}, Ls93/j;-><init>(Ljava/util/List;I)V

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    new-instance v9, Ljb3/s;

    iget-object v8, v1, Lhb3/k;->c:Lr93/k;

    if-nez v7, :cond_4

    const/4 v7, 0x2

    invoke-virtual {v0, v15, v4, v7}, Lhb3/x;->c(Lwa3/m;II)Ls93/i;

    move-result-object v7

    :cond_4
    sget-object v10, Lsa3/d;->e:Lsa3/c;

    invoke-virtual {v10, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lqa3/e0;

    invoke-static {v11}, Lhb3/j;->e(Lqa3/e0;)Lr93/a0;

    move-result-object v11

    sget-object v12, Lsa3/d;->d:Lsa3/c;

    invoke-virtual {v12, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lqa3/k1;

    invoke-static {v13}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v13

    sget-object v14, Lsa3/d;->y:Lsa3/b;

    invoke-virtual {v14, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    iget v5, v15, Lqa3/k0;->F:I

    invoke-static {v2, v5}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v2

    sget-object v5, Lsa3/d;->p:Lsa3/c;

    invoke-virtual {v5, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/d0;

    invoke-static {v5}, Lge3/g;->J(Lqa3/d0;)I

    move-result v5

    sget-object v6, Lsa3/d;->C:Lsa3/b;

    invoke-virtual {v6, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object/from16 p2, v2

    sget-object v2, Lsa3/d;->B:Lsa3/b;

    invoke-virtual {v2, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v18, v2

    sget-object v2, Lsa3/d;->E:Lsa3/b;

    invoke-virtual {v2, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v19, v2

    sget-object v2, Lsa3/d;->F:Lsa3/b;

    invoke-virtual {v2, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v22, v2

    sget-object v2, Lsa3/d;->G:Lsa3/b;

    invoke-virtual {v2, v4}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move/from16 v23, v2

    iget-object v2, v1, Lhb3/k;->b:Lsa3/f;

    move-object/from16 v24, v2

    iget-object v2, v1, Lhb3/k;->e:Lsa3/j;

    move-object/from16 v25, v2

    iget-object v2, v1, Lhb3/k;->g:Ljb3/j;

    move-object/from16 v17, v3

    const/16 v26, 0x0

    const/4 v3, 0x0

    move-object v0, v1

    move-object v1, v9

    move-object/from16 v27, v10

    move-object/from16 v28, v12

    move/from16 v12, v19

    move-object/from16 v16, v24

    move-object/from16 v19, v2

    move v9, v5

    move v10, v6

    move-object v2, v8

    move-object v5, v11

    move-object v6, v13

    move/from16 v11, v18

    move/from16 v13, v22

    move-object/from16 v18, v25

    move-object/from16 v8, p2

    move/from16 v22, v4

    move-object v4, v7

    move v7, v14

    move/from16 v14, v23

    invoke-direct/range {v1 .. v19}, Ljb3/s;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;IZZZZZLqa3/k0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V

    move-object v9, v1

    move-object v1, v15

    move-object/from16 v2, v17

    iget-object v3, v1, Lqa3/k0;->I:Ljava/util/List;

    const-string v4, "getTypeParameterList(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v9, v3}, Lhb3/k;->b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;

    move-result-object v3

    iget-object v4, v3, Lhb3/k;->h:Lhb3/h0;

    sget-object v5, Lsa3/d;->z:Lsa3/b;

    move/from16 v6, v22

    invoke-virtual {v5, v6}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    const/4 v7, 0x3

    if-eqz v5, :cond_6

    iget v8, v1, Lqa3/k0;->y:I

    and-int/lit8 v10, v8, 0x20

    const/16 v11, 0x20

    if-ne v10, v11, :cond_5

    goto :goto_3

    :cond_5
    const/16 v10, 0x40

    and-int/2addr v8, v10

    if-ne v8, v10, :cond_6

    :goto_3
    new-instance v8, Ljb3/a;

    iget-object v10, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v10, v10, Lhb3/i;->a:Lkb3/k;

    new-instance v11, Lhb3/s;

    const/4 v12, 0x1

    move-object/from16 v14, p0

    invoke-direct {v11, v14, v1, v7, v12}, Lhb3/s;-><init>(Lhb3/x;Lwa3/v;II)V

    invoke-direct {v8, v10, v11}, Ljb3/a;-><init>(Lkb3/n;Lc93/a;)V

    goto :goto_4

    :cond_6
    move-object/from16 v14, p0

    move-object/from16 v8, v21

    :goto_4
    invoke-static {v1, v2}, Ljc/x;->r0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v10

    invoke-virtual {v4, v10}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v10

    move-object v11, v10

    invoke-virtual {v4}, Lhb3/h0;->b()Ljava/util/List;

    move-result-object v10

    iget-object v12, v0, Lhb3/k;->c:Lr93/k;

    instance-of v13, v12, Lr93/e;

    if-eqz v13, :cond_7

    check-cast v12, Lr93/e;

    goto :goto_5

    :cond_7
    const/4 v12, 0x0

    :goto_5
    if-eqz v12, :cond_8

    invoke-interface {v12}, Lr93/e;->q0()Lr93/q0;

    move-result-object v12

    move-object/from16 v29, v12

    move-object v12, v11

    move-object/from16 v11, v29

    goto :goto_6

    :cond_8
    move-object v12, v11

    const/4 v11, 0x0

    :goto_6
    invoke-static {v1, v2}, Ljc/x;->m0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v13

    if-eqz v13, :cond_9

    invoke-virtual {v4, v13}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-static {v9, v4, v8}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v4

    move-object v8, v9

    move-object v9, v12

    move-object v12, v4

    goto :goto_7

    :cond_9
    move-object v8, v9

    move-object v9, v12

    const/4 v12, 0x0

    :goto_7
    iget-object v4, v3, Lhb3/k;->i:Lhb3/x;

    invoke-static {v1, v2}, Ljc/x;->x(Lqa3/k0;Lsa3/h;)Ljava/util/List;

    move-result-object v2

    iget-object v13, v1, Lqa3/k0;->O:Ljava/util/List;

    const-string v15, "getContextParameterList(...)"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v2, v13, v1, v7}, Lhb3/x;->b(Ljava/util/List;Ljava/util/List;Lwa3/m;I)Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual/range {v8 .. v13}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    move-object v9, v8

    sget-object v2, Lsa3/d;->c:Lsa3/b;

    invoke-virtual {v2, v6}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    move-object/from16 v4, v28

    invoke-virtual {v4, v6}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lqa3/k1;

    move-object/from16 v10, v27

    invoke-virtual {v10, v6}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lqa3/e0;

    invoke-static {v2, v8, v11}, Lsa3/d;->b(ZLqa3/k1;Lqa3/e0;)I

    move-result v2

    sget-object v18, Lr93/s0;->q:Lr93/v0;

    if-eqz v5, :cond_c

    iget v5, v1, Lqa3/k0;->y:I

    const/16 v8, 0x100

    and-int/2addr v5, v8

    if-ne v5, v8, :cond_a

    iget v5, v1, Lqa3/k0;->Q:I

    goto :goto_8

    :cond_a
    move v5, v2

    :goto_8
    sget-object v8, Lsa3/d;->K:Lsa3/b;

    invoke-virtual {v8, v5}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    sget-object v11, Lsa3/d;->L:Lsa3/b;

    invoke-virtual {v11, v5}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v12, Lsa3/d;->M:Lsa3/b;

    invoke-virtual {v12, v5}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    invoke-virtual {v14, v1, v5, v7}, Lhb3/x;->c(Lwa3/m;II)Ls93/i;

    move-result-object v7

    if-eqz v8, :cond_b

    move v12, v8

    new-instance v8, Lu93/n0;

    invoke-virtual {v10, v5}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lqa3/e0;

    invoke-static {v13}, Lhb3/j;->e(Lqa3/e0;)Lr93/a0;

    move-result-object v13

    invoke-virtual {v4, v5}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/k1;

    invoke-static {v5}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v5

    move/from16 p2, v2

    const/4 v2, 0x1

    xor-int/2addr v12, v2

    invoke-virtual {v9}, Lu93/m0;->getKind()I

    move-result v16

    const/16 v17, 0x0

    move/from16 v29, v12

    move-object v12, v5

    move-object v5, v14

    move v14, v11

    move-object v11, v13

    move/from16 v13, v29

    move-object/from16 v29, v10

    move-object v10, v7

    move-object/from16 v7, v29

    invoke-direct/range {v8 .. v18}, Lu93/n0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V

    goto :goto_9

    :cond_b
    move-object/from16 p2, v10

    move-object v10, v7

    move-object/from16 v7, p2

    move/from16 p2, v2

    move-object v5, v14

    const/4 v2, 0x1

    invoke-static {v9, v10}, Lya3/p;->e(Lr93/n0;Ls93/i;)Lu93/n0;

    move-result-object v8

    :goto_9
    invoke-virtual {v9}, Lu93/m0;->getReturnType()Llb3/y;

    move-result-object v10

    invoke-virtual {v8, v10}, Lu93/n0;->M0(Llb3/y;)V

    goto :goto_a

    :cond_c
    move/from16 p2, v2

    move-object v7, v10

    move-object v5, v14

    const/4 v2, 0x1

    const/4 v8, 0x0

    :goto_a
    sget-object v10, Lsa3/d;->A:Lsa3/b;

    invoke-virtual {v10, v6}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_10

    iget v10, v1, Lqa3/k0;->y:I

    const/16 v11, 0x200

    and-int/2addr v10, v11

    if-ne v10, v11, :cond_d

    iget v10, v1, Lqa3/k0;->R:I

    goto :goto_b

    :cond_d
    move/from16 v10, p2

    :goto_b
    sget-object v11, Lsa3/d;->K:Lsa3/b;

    invoke-virtual {v11, v10}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    sget-object v12, Lsa3/d;->L:Lsa3/b;

    invoke-virtual {v12, v10}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    sget-object v12, Lsa3/d;->M:Lsa3/b;

    invoke-virtual {v12, v10}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    const/4 v12, 0x4

    invoke-virtual {v5, v1, v10, v12}, Lhb3/x;->c(Lwa3/m;II)Ls93/i;

    move-result-object v13

    if-eqz v11, :cond_f

    move-object/from16 v16, v8

    new-instance v8, Lu93/o0;

    invoke-virtual {v7, v10}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/e0;

    invoke-static {v7}, Lhb3/j;->e(Lqa3/e0;)Lr93/a0;

    move-result-object v7

    invoke-virtual {v4, v10}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/k1;

    invoke-static {v4}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v4

    xor-int/lit8 v10, v11, 0x1

    move-object/from16 v11, v16

    invoke-virtual {v9}, Lu93/m0;->getKind()I

    move-result v16

    const/16 v17, 0x0

    move/from16 v29, v12

    move-object v12, v4

    move-object v4, v11

    move-object v11, v7

    move/from16 v7, v29

    move-object/from16 v29, v13

    move v13, v10

    move-object/from16 v10, v29

    invoke-direct/range {v8 .. v18}, Lu93/o0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/p0;Lr93/s0;)V

    sget-object v10, Lm83/y;->w:Lm83/y;

    invoke-static {v3, v8, v10}, Lhb3/k;->b(Lhb3/k;Lu93/o;Ljava/util/List;)Lhb3/k;

    move-result-object v3

    iget-object v3, v3, Lhb3/k;->i:Lhb3/x;

    iget-object v10, v1, Lqa3/k0;->P:Lqa3/e1;

    invoke-static {v10}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v3, v10, v1, v7}, Lhb3/x;->h(Ljava/util/List;Lwa3/m;I)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/a1;

    if-eqz v3, :cond_e

    iput-object v3, v8, Lu93/o0;->N:Lr93/a1;

    move-object v7, v8

    const/4 v3, 0x0

    goto :goto_c

    :cond_e
    invoke-static/range {v20 .. v20}, Lu93/o0;->r0(I)V

    const/4 v3, 0x0

    throw v3

    :cond_f
    move-object v4, v8

    move-object v10, v13

    const/4 v3, 0x0

    invoke-static {v9, v10}, Lya3/p;->f(Lr93/n0;Ls93/i;)Lu93/o0;

    move-result-object v7

    goto :goto_c

    :cond_10
    move-object v4, v8

    const/4 v3, 0x0

    move-object v7, v3

    :goto_c
    sget-object v8, Lsa3/d;->D:Lsa3/b;

    invoke-virtual {v8, v6}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_11

    new-instance v6, Lhb3/r;

    const/4 v8, 0x0

    invoke-direct {v6, v5, v1, v9, v8}, Lhb3/r;-><init>(Lhb3/x;Lqa3/k0;Ljb3/s;I)V

    invoke-virtual {v9, v3, v6}, Lu93/m0;->O0(Lkb3/h;Lc93/a;)V

    :cond_11
    iget-object v0, v0, Lhb3/k;->c:Lr93/k;

    instance-of v6, v0, Lr93/e;

    if-eqz v6, :cond_12

    move-object v6, v0

    check-cast v6, Lr93/e;

    goto :goto_d

    :cond_12
    move-object v6, v3

    :goto_d
    if-eqz v6, :cond_13

    invoke-interface {v6}, Lr93/e;->getKind()Lr93/f;

    move-result-object v6

    goto :goto_e

    :cond_13
    move-object v6, v3

    :goto_e
    sget-object v0, Lr93/f;->E:Lr93/f;

    if-ne v6, v0, :cond_14

    new-instance v0, Lhb3/r;

    const/4 v6, 0x1

    invoke-direct {v0, v5, v1, v9, v6}, Lhb3/r;-><init>(Lhb3/x;Lqa3/k0;Ljb3/s;I)V

    invoke-virtual {v9, v3, v0}, Lu93/m0;->O0(Lkb3/h;Lc93/a;)V

    :cond_14
    new-instance v0, Lu93/v;

    const/4 v3, 0x0

    invoke-virtual {v5, v1, v3}, Lhb3/x;->d(Lqa3/k0;Z)Ls93/i;

    move-result-object v3

    invoke-direct {v0, v3}, Lal/a;-><init>(Ls93/i;)V

    new-instance v3, Lu93/v;

    invoke-virtual {v5, v1, v2}, Lhb3/x;->d(Lqa3/k0;Z)Ls93/i;

    move-result-object v1

    invoke-direct {v3, v1}, Lal/a;-><init>(Ls93/i;)V

    invoke-virtual {v9, v4, v7, v0, v3}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    return-object v9
.end method

.method public final h(Ljava/util/List;Lwa3/m;I)Ljava/util/List;
    .locals 25

    move-object/from16 v1, p0

    iget-object v7, v1, Lhb3/x;->a:Lhb3/k;

    iget-object v8, v7, Lhb3/k;->d:Lsa3/h;

    iget-object v9, v7, Lhb3/k;->h:Lhb3/h0;

    iget-object v0, v7, Lhb3/k;->c:Lr93/k;

    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, Lr93/b;

    invoke-interface {v11}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lhb3/x;->a(Lr93/k;)Lhb3/a0;

    move-result-object v2

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v22

    const/16 v23, 0x0

    move/from16 v13, v23

    :goto_0
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v24, v13, 0x1

    const/4 v12, 0x0

    if-ltz v13, :cond_3

    move-object v6, v0

    check-cast v6, Lqa3/e1;

    iget v0, v6, Lqa3/e1;->y:I

    const/4 v3, 0x1

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_0

    iget v0, v6, Lqa3/e1;->z:I

    move v14, v0

    goto :goto_1

    :cond_0
    move/from16 v14, v23

    :goto_1
    if-eqz v2, :cond_1

    sget-object v0, Lsa3/d;->c:Lsa3/b;

    invoke-virtual {v0, v14}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v15, Ljb3/w;

    iget-object v0, v7, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->a:Lkb3/k;

    move-object v3, v0

    new-instance v0, Lhb3/u;

    move/from16 v4, p3

    move v5, v13

    move-object v13, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v6}, Lhb3/u;-><init>(Lhb3/x;Lhb3/a0;Lwa3/v;IILqa3/e1;)V

    invoke-direct {v15, v13, v0}, Ljb3/w;-><init>(Lkb3/k;Lc93/a;)V

    goto :goto_2

    :cond_1
    move v5, v13

    sget-object v15, Ls93/g;->a:Ls93/f;

    :goto_2
    iget-object v0, v7, Lhb3/k;->b:Lsa3/f;

    iget v1, v6, Lqa3/e1;->E:I

    invoke-static {v0, v1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v0

    invoke-static {v6, v8}, Ljc/x;->y0(Lqa3/e1;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    invoke-virtual {v9, v1}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v16

    sget-object v1, Lsa3/d;->H:Lsa3/b;

    invoke-virtual {v1, v14}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    sget-object v1, Lsa3/d;->I:Lsa3/b;

    invoke-virtual {v1, v14}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    sget-object v1, Lsa3/d;->J:Lsa3/b;

    invoke-virtual {v1, v14}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v19

    invoke-static {v6, v8}, Ljc/x;->B0(Lqa3/e1;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v9, v1}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v12

    :cond_2
    move-object v1, v10

    move-object/from16 v20, v12

    new-instance v10, Lu93/w0;

    const/4 v12, 0x0

    sget-object v21, Lr93/s0;->q:Lr93/v0;

    move v13, v5

    move-object v14, v15

    move-object v15, v0

    invoke-direct/range {v10 .. v21}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v10, v1

    move/from16 v13, v24

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    throw v12

    :cond_4
    move-object v1, v10

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
