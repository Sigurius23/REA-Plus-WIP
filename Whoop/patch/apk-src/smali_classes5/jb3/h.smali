.class public final Ljb3/h;
.super Lu93/b;
.source "SourceFile"

# interfaces
.implements Lr93/k;


# instance fields
.field public final E:Lqa3/k;

.field public final F:Lsa3/a;

.field public final G:Lr93/s0;

.field public final H:Lva3/c;

.field public final I:Lr93/a0;

.field public final J:Lr93/o;

.field public final K:Lr93/f;

.field public final L:Lhb3/k;

.field public final M:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;

.field public final N:Lja3/h;

.field public final O:Lr93/r0;

.field public final P:La00/g;

.field public final Q:Lr93/k;

.field public final R:Lkb3/h;

.field public final S:Lkb3/i;

.field public final T:Lkb3/h;

.field public final U:Lhb3/y;

.field public final V:Ls93/i;


# direct methods
.method public constructor <init>(Lhb3/k;Lqa3/k;Lsa3/f;Lsa3/a;Lr93/s0;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move-object/from16 v3, p3

    move-object/from16 v9, p5

    const-string v2, "outerContext"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "classProto"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "nameResolver"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sourceElement"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v2, v2, Lhb3/i;->a:Lkb3/k;

    iget v4, v8, Lqa3/k;->E:I

    invoke-static {v3, v4}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v4

    invoke-virtual {v4}, Lva3/c;->f()Lva3/h;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Lu93/b;-><init>(Lkb3/n;Lva3/h;)V

    iput-object v8, v1, Ljb3/h;->E:Lqa3/k;

    move-object/from16 v6, p4

    iput-object v6, v1, Ljb3/h;->F:Lsa3/a;

    iput-object v9, v1, Ljb3/h;->G:Lr93/s0;

    iget v2, v8, Lqa3/k;->E:I

    invoke-static {v3, v2}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v2

    iput-object v2, v1, Ljb3/h;->H:Lva3/c;

    sget-object v2, Lsa3/d;->e:Lsa3/c;

    iget v4, v8, Lqa3/k;->z:I

    invoke-virtual {v2, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/e0;

    invoke-static {v2}, Lhb3/j;->e(Lqa3/e0;)Lr93/a0;

    move-result-object v2

    iput-object v2, v1, Ljb3/h;->I:Lr93/a0;

    sget-object v2, Lsa3/d;->d:Lsa3/c;

    iget v4, v8, Lqa3/k;->z:I

    invoke-virtual {v2, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/k1;

    invoke-static {v2}, Lge3/g;->s(Lqa3/k1;)Lr93/o;

    move-result-object v2

    iput-object v2, v1, Ljb3/h;->J:Lr93/o;

    sget-object v2, Lsa3/d;->f:Lsa3/c;

    iget v4, v8, Lqa3/k;->z:I

    invoke-virtual {v2, v4}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/j;

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v4, Lhb3/b0;->b:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    :goto_0
    packed-switch v2, :pswitch_data_0

    sget-object v2, Lr93/f;->w:Lr93/f;

    :goto_1
    move-object v10, v2

    goto :goto_2

    :pswitch_0
    sget-object v2, Lr93/f;->F:Lr93/f;

    goto :goto_1

    :pswitch_1
    sget-object v2, Lr93/f;->E:Lr93/f;

    goto :goto_1

    :pswitch_2
    sget-object v2, Lr93/f;->z:Lr93/f;

    goto :goto_1

    :pswitch_3
    sget-object v2, Lr93/f;->y:Lr93/f;

    goto :goto_1

    :pswitch_4
    sget-object v2, Lr93/f;->x:Lr93/f;

    goto :goto_1

    :pswitch_5
    sget-object v2, Lr93/f;->w:Lr93/f;

    goto :goto_1

    :goto_2
    iput-object v10, v1, Ljb3/h;->K:Lr93/f;

    iget-object v2, v8, Lqa3/k;->G:Ljava/util/List;

    const-string v4, "getTypeParameterList(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lsa3/h;

    iget-object v5, v8, Lqa3/k;->a0:Lqa3/c1;

    const-string v7, "getTypeTable(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v5, Lsa3/j;->b:Lsa3/j;

    iget-object v5, v8, Lqa3/k;->c0:Lqa3/j1;

    const-string v7, "getVersionRequirementTable(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lpf/c;->r(Lqa3/j1;)Lsa3/j;

    move-result-object v5

    invoke-virtual/range {v0 .. v6}, Lhb3/k;->a(Lr93/k;Ljava/util/List;Lsa3/f;Lsa3/h;Lsa3/j;Lsa3/a;)Lhb3/k;

    move-result-object v11

    move-object v12, v0

    iget-object v0, v11, Lhb3/k;->a:Lhb3/i;

    iget-object v13, v0, Lhb3/i;->a:Lkb3/k;

    iput-object v11, v1, Ljb3/h;->L:Lhb3/k;

    sget-object v2, Lsa3/d;->m:Lsa3/b;

    iget v3, v8, Lqa3/k;->z:I

    invoke-virtual {v2, v3}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    sget-object v14, Lr93/f;->y:Lr93/f;

    const/4 v3, 0x0

    if-ne v10, v14, :cond_3

    if-nez v2, :cond_2

    iget-object v2, v0, Lhb3/i;->s:Lhb3/n;

    invoke-interface {v2}, Lhb3/n;->d()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    move v2, v3

    goto :goto_4

    :cond_2
    :goto_3
    const/4 v2, 0x1

    :goto_4
    new-instance v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;

    invoke-direct {v4, v13, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;-><init>(Lkb3/k;Ljb3/h;Z)V

    goto :goto_5

    :cond_3
    sget-object v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    :goto_5
    iput-object v4, v1, Ljb3/h;->M:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;

    new-instance v2, Lja3/h;

    invoke-direct {v2, v1}, Lja3/h;-><init>(Ljb3/h;)V

    iput-object v2, v1, Ljb3/h;->N:Lja3/h;

    sget-object v16, Lr93/r0;->d:Lr93/v0;

    iget-object v0, v0, Lhb3/i;->q:Lmb3/k;

    check-cast v0, Lmb3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/room/u;

    const/4 v6, 0x0

    const/16 v7, 0x11

    const/4 v1, 0x1

    move v2, v3

    const-class v3, Ljb3/g;

    const-string v4, "<init>"

    const-string v5, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"

    move v15, v2

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object v6, v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "storageManager"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr93/r0;

    invoke-direct {v1, v6, v13, v0}, Lr93/r0;-><init>(Lu93/b;Lkb3/n;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, v6, Ljb3/h;->O:Lr93/r0;

    const/4 v0, 0x0

    if-ne v10, v14, :cond_4

    new-instance v1, La00/g;

    invoke-direct {v1, v6}, La00/g;-><init>(Ljb3/h;)V

    goto :goto_6

    :cond_4
    move-object v1, v0

    :goto_6
    iput-object v1, v6, Ljb3/h;->P:La00/g;

    iget-object v1, v12, Lhb3/k;->c:Lr93/k;

    iput-object v1, v6, Ljb3/h;->Q:Lr93/k;

    new-instance v2, Ljb3/d;

    invoke-direct {v2, v6, v15}, Ljb3/d;-><init>(Ljb3/h;I)V

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lkb3/h;

    invoke-direct {v3, v13, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v3, v6, Ljb3/h;->R:Lkb3/h;

    new-instance v2, Ljb3/d;

    const/4 v3, 0x1

    invoke-direct {v2, v6, v3}, Ljb3/d;-><init>(Ljb3/h;I)V

    new-instance v3, Lkb3/i;

    invoke-direct {v3, v13, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v3, v6, Ljb3/h;->S:Lkb3/i;

    new-instance v2, Ljb3/d;

    const/4 v3, 0x2

    invoke-direct {v2, v6, v3}, Ljb3/d;-><init>(Ljb3/h;I)V

    new-instance v3, Lkb3/h;

    invoke-direct {v3, v13, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    new-instance v2, Ljb3/d;

    const/4 v3, 0x3

    invoke-direct {v2, v6, v3}, Ljb3/d;-><init>(Ljb3/h;I)V

    invoke-virtual {v13, v2}, Lkb3/k;->a(Lc93/a;)Lkb3/i;

    new-instance v2, Ljb3/d;

    const/4 v3, 0x4

    invoke-direct {v2, v6, v3}, Ljb3/d;-><init>(Ljb3/h;I)V

    new-instance v3, Lkb3/h;

    invoke-direct {v3, v13, v2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v3, v6, Ljb3/h;->T:Lkb3/h;

    move-object v2, v0

    new-instance v0, Lhb3/y;

    move-object v3, v2

    iget-object v2, v11, Lhb3/k;->b:Lsa3/f;

    iget-object v4, v11, Lhb3/k;->d:Lsa3/h;

    instance-of v5, v1, Ljb3/h;

    if-eqz v5, :cond_5

    check-cast v1, Ljb3/h;

    goto :goto_7

    :cond_5
    move-object v1, v3

    :goto_7
    if-eqz v1, :cond_6

    iget-object v1, v1, Ljb3/h;->U:Lhb3/y;

    move-object v5, v1

    :goto_8
    move-object v3, v4

    move-object v1, v8

    move-object v4, v9

    goto :goto_9

    :cond_6
    move-object v5, v3

    goto :goto_8

    :goto_9
    invoke-direct/range {v0 .. v5}, Lhb3/y;-><init>(Lqa3/k;Lsa3/f;Lsa3/h;Lr93/s0;Lhb3/y;)V

    iput-object v0, v6, Ljb3/h;->U:Lhb3/y;

    sget-object v0, Lsa3/d;->c:Lsa3/b;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Ls93/g;->a:Ls93/f;

    goto :goto_a

    :cond_7
    new-instance v0, Ljb3/w;

    new-instance v1, Ljb3/d;

    const/4 v2, 0x5

    invoke-direct {v1, v6, v2}, Ljb3/d;-><init>(Ljb3/h;I)V

    invoke-direct {v0, v13, v1}, Ljb3/w;-><init>(Lkb3/k;Lc93/a;)V

    :goto_a
    iput-object v0, v6, Ljb3/h;->V:Ls93/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final I()Lr93/y0;
    .locals 1

    iget-object v0, p0, Ljb3/h;->T:Lkb3/h;

    invoke-virtual {v0}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/y0;

    return-object v0
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final M()Ljava/util/List;
    .locals 8

    iget-object v0, p0, Ljb3/h;->L:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->d:Lsa3/h;

    iget-object v2, p0, Ljb3/h;->E:Lqa3/k;

    invoke-static {v2, v1}, Ljc/x;->v(Lqa3/k;Lsa3/h;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    iget-object v4, v0, Lhb3/k;->h:Lhb3/h0;

    invoke-virtual {v4, v3}, Lhb3/h0;->g(Lqa3/w0;)Llb3/y;

    move-result-object v3

    new-instance v4, Lu93/p0;

    invoke-virtual {p0}, Lu93/b;->q0()Lr93/q0;

    move-result-object v5

    new-instance v6, Lfb3/a;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v3, v7}, Lfb3/a;-><init>(Lr93/e;Llb3/y;Lva3/h;)V

    sget-object v3, Ls93/g;->a:Ls93/f;

    invoke-direct {v4, v5, v6, v3}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public final N()Z
    .locals 2

    sget-object v0, Lsa3/d;->f:Lsa3/c;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lqa3/j;->F:Lqa3/j;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q()Z
    .locals 2

    sget-object v0, Lsa3/d;->l:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final U()Z
    .locals 2

    sget-object v0, Lsa3/d;->j:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Ljb3/h;->M:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;

    return-object v0
.end method

.method public final X()Ljb3/g;
    .locals 3

    iget-object v0, p0, Ljb3/h;->L:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->q:Lmb3/k;

    check-cast v0, Lmb3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ljb3/h;->O:Lr93/r0;

    iget-object v1, v0, Lr93/r0;->a:Lu93/b;

    invoke-static {v1}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    iget-object v0, v0, Lr93/r0;->c:Lkb3/i;

    sget-object v1, Lr93/r0;->e:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    check-cast v0, Ljb3/g;

    return-object v0
.end method

.method public final Y(Lva3/h;)Llb3/c0;
    .locals 5

    invoke-virtual {p0}, Ljb3/h;->X()Ljb3/g;

    move-result-object v0

    sget-object v1, Lz93/c;->G:Lz93/c;

    invoke-virtual {v0, p1, v1}, Ljb3/g;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lr93/n0;

    invoke-interface {v4}, Lr93/b;->B()Lr93/q0;

    move-result-object v4

    if-nez v4, :cond_0

    if-eqz v1, :cond_1

    :goto_1
    move-object v2, v0

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v2, Lr93/n0;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lr93/z0;->getType()Llb3/y;

    move-result-object v0

    :cond_4
    check-cast v0, Llb3/c0;

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Ljb3/h;->N:Lja3/h;

    return-object v0
.end method

.method public final g()Lr93/k;
    .locals 1

    iget-object v0, p0, Ljb3/h;->Q:Lr93/k;

    return-object v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Ljb3/h;->V:Ls93/i;

    return-object v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Ljb3/h;->S:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final getKind()Lr93/f;
    .locals 1

    iget-object v0, p0, Ljb3/h;->K:Lr93/f;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    iget-object v0, p0, Ljb3/h;->G:Lr93/s0;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    iget-object v0, p0, Ljb3/h;->J:Lr93/o;

    return-object v0
.end method

.method public final isExternal()Z
    .locals 2

    sget-object v0, Lsa3/d;->i:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isInline()Z
    .locals 4

    sget-object v0, Lsa3/d;->k:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Ljb3/h;->F:Lsa3/a;

    iget v1, v0, Lsa3/a;->b:I

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget v1, v0, Lsa3/a;->c:I

    const/4 v3, 0x4

    if-ge v1, v3, :cond_2

    goto :goto_0

    :cond_2
    if-le v1, v3, :cond_3

    goto :goto_1

    :cond_3
    iget v0, v0, Lsa3/a;->d:I

    if-gt v0, v2, :cond_4

    :goto_0
    return v2

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 2

    sget-object v0, Lsa3/d;->g:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isValue()Z
    .locals 4

    sget-object v0, Lsa3/d;->k:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x2

    iget-object v2, p0, Ljb3/h;->F:Lsa3/a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3, v0, v1}, Lsa3/a;->a(III)Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ljb3/h;->L:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->h:Lhb3/h0;

    invoke-virtual {v0}, Lhb3/h0;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    iget-object v0, p0, Ljb3/h;->I:Lr93/a0;

    return-object v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    iget-object p1, p0, Ljb3/h;->O:Lr93/r0;

    iget-object v0, p1, Lr93/r0;->a:Lu93/b;

    invoke-static {v0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    iget-object p1, p1, Lr93/r0;->c:Lkb3/i;

    sget-object v0, Lr93/r0;->e:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object p1
.end method

.method public final o0()Z
    .locals 2

    sget-object v0, Lsa3/d;->h:Lsa3/b;

    iget-object v1, p0, Ljb3/h;->E:Lqa3/k;

    iget v1, v1, Lqa3/k;->z:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final s()Lu93/j;
    .locals 1

    iget-object v0, p0, Ljb3/h;->R:Lkb3/h;

    invoke-virtual {v0}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu93/j;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "deserialized "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljb3/h;->U()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "expect "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
