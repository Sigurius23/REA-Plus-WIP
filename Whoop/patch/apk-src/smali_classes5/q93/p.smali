.class public final Lq93/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt93/b;
.implements Lt93/d;


# static fields
.field public static final synthetic h:[Lj93/z;


# instance fields
.field public final a:Lu93/e0;

.field public final b:Lkb3/i;

.field public final c:Llb3/c0;

.field public final d:Lkb3/i;

.field public final e:Lkb3/e;

.field public final f:Lkb3/i;

.field public final g:Lkb3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lq93/p;

    const-string v2, "settings"

    const-string v3, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "cloneableType"

    const-string v5, "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v3

    const-string v5, "notConsideredDeprecation"

    const-string v6, "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"

    invoke-static {v1, v5, v6, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lq93/p;->h:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lu93/e0;Lkb3/k;Lfa3/u;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq93/p;->a:Lu93/e0;

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p2, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Lq93/p;->b:Lkb3/i;

    new-instance p3, Lva3/e;

    const-string v0, "java.io"

    invoke-direct {p3, v0}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v2, Lq93/o;

    invoke-direct {v2, p1, p3}, Lu93/g0;-><init>(Lr93/b0;Lva3/e;)V

    new-instance p1, Llb3/z;

    new-instance p3, Lq93/k;

    const/4 v0, 0x1

    invoke-direct {p3, p0, v0}, Lq93/k;-><init>(Lq93/p;I)V

    invoke-direct {p1, p2, p3}, Llb3/z;-><init>(Lkb3/n;Lc93/a;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lu93/l;

    const-string p3, "Serializable"

    invoke-static {p3}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v3

    sget-object v4, Lr93/a0;->E:Lr93/a0;

    sget-object v5, Lr93/f;->x:Lr93/f;

    move-object v6, p1

    check-cast v6, Ljava/util/Collection;

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lu93/l;-><init>(Lr93/k;Lva3/h;Lr93/a0;Lr93/f;Ljava/util/Collection;Lkb3/n;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    const/4 p2, 0x0

    sget-object p3, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    invoke-virtual {v1, p3, p1, p2}, Lu93/l;->X(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Ljava/util/Set;Lu93/j;)V

    invoke-virtual {v1}, Lu93/b;->i()Llb3/c0;

    move-result-object p1

    iput-object p1, p0, Lq93/p;->c:Llb3/c0;

    new-instance p1, Lce3/p;

    const/4 p2, 0x7

    const/4 p3, 0x0

    invoke-direct {p1, p0, v7, p3, p2}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    new-instance p2, Lkb3/i;

    invoke-direct {p2, v7, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lq93/p;->d:Lkb3/i;

    new-instance p1, Lkb3/e;

    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 p3, 0x3f800000    # 1.0f

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p2, v1, p3, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    new-instance p3, Lkb3/f;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-direct {p1, v7, p2, p3, v0}, Lkb3/e;-><init>(Lkb3/k;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;I)V

    iput-object p1, p0, Lq93/p;->e:Lkb3/e;

    new-instance p1, Lq93/k;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lq93/k;-><init>(Lq93/p;I)V

    new-instance p2, Lkb3/i;

    invoke-direct {p2, v7, p1}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p2, p0, Lq93/p;->f:Lkb3/i;

    new-instance p1, Ldc3/s;

    const/16 p2, 0xd

    invoke-direct {p1, p0, p2}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, p1}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Lq93/p;->g:Lkb3/e;

    return-void
.end method


# virtual methods
.method public final a(Lva3/h;Lr93/e;)Ljava/util/Collection;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "name"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "classDescriptor"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lq93/a;->b:Lva3/h;

    invoke-virtual {v1, v3}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lq93/p;->h:[Lj93/z;

    const/4 v5, 0x1

    sget-object v6, Lm83/y;->w:Lm83/y;

    if-eqz v3, :cond_4

    instance-of v3, v2, Ljb3/h;

    if-eqz v3, :cond_4

    sget-object v3, Lo93/m;->g:Lva3/f;

    invoke-static {v2, v3}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lo93/h;->s(Lr93/h;)Lo93/j;

    move-result-object v3

    if-eqz v3, :cond_4

    :cond_0
    check-cast v2, Ljb3/h;

    iget-object v3, v2, Ljb3/h;->E:Lqa3/k;

    iget-object v3, v3, Lqa3/k;->Q:Ljava/util/List;

    const-string v7, "getFunctionList(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    instance-of v7, v3, Ljava/util/Collection;

    if-eqz v7, :cond_1

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/c0;

    iget-object v8, v2, Ljb3/h;->L:Lhb3/k;

    iget-object v8, v8, Lhb3/k;->b:Lsa3/f;

    iget v7, v7, Lqa3/c0;->F:I

    invoke-static {v8, v7}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v7

    sget-object v8, Lq93/a;->b:Lva3/h;

    invoke-virtual {v7, v8}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    return-object v6

    :cond_3
    :goto_0
    iget-object v3, v0, Lq93/p;->d:Lkb3/i;

    aget-object v4, v4, v5

    invoke-static {v3, v4}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/c0;

    invoke-virtual {v3}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v3

    sget-object v4, Lz93/c;->w:Lz93/c;

    invoke-interface {v3, v1, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu93/q0;

    invoke-interface {v1}, Lr93/w;->l0()Lr93/v;

    move-result-object v1

    invoke-interface {v1, v2}, Lr93/v;->l(Lr93/k;)Lr93/v;

    sget-object v3, Lr93/q;->e:Lr93/p;

    invoke-interface {v1, v3}, Lr93/v;->w(Lr93/r;)Lr93/v;

    invoke-virtual {v2}, Lu93/b;->i()Llb3/c0;

    move-result-object v3

    invoke-interface {v1, v3}, Lr93/v;->n(Llb3/y;)Lr93/v;

    invoke-virtual {v2}, Lu93/b;->q0()Lr93/q0;

    move-result-object v2

    invoke-interface {v1, v2}, Lr93/v;->t(Lr93/q0;)Lr93/v;

    invoke-interface {v1}, Lr93/v;->build()Lr93/w;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lu93/q0;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    return-object v1

    :cond_4
    invoke-virtual {v0}, Lq93/p;->g()Lq93/i;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2}, Lq93/p;->f(Lr93/e;)Lja3/i;

    move-result-object v3

    const/4 v7, 0x2

    const/4 v8, 0x3

    const-string v9, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    if-nez v3, :cond_5

    :goto_1
    const/16 v16, 0x0

    goto/16 :goto_9

    :cond_5
    invoke-static {v3}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v11

    sget-object v12, Lq93/b;->f:Lq93/b;

    invoke-static {}, Lce/w;->N()Lq93/b;

    move-result-object v12

    const-string v13, "builtIns"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11, v12}, Lq93/e;->b(Lva3/e;Lo93/h;)Lr93/e;

    move-result-object v11

    const/4 v13, 0x0

    if-nez v11, :cond_6

    sget-object v11, Lm83/a0;->w:Lm83/a0;

    goto :goto_2

    :cond_6
    sget-object v14, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v11}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v14

    invoke-static {v14}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object v14

    if-nez v14, :cond_7

    invoke-static {v11}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    goto :goto_2

    :cond_7
    invoke-virtual {v12, v14}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v12

    new-array v14, v7, [Lr93/e;

    aput-object v11, v14, v13

    aput-object v12, v14, v5

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    :goto_2
    check-cast v11, Ljava/lang/Iterable;

    invoke-static {v11}, Lm83/s;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr93/e;

    if-nez v12, :cond_8

    goto :goto_1

    :cond_8
    sget v6, Lub3/h;->y:I

    new-instance v6, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v6, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lr93/e;

    invoke-static {v14}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance v11, Lub3/h;

    invoke-direct {v11, v13}, Lub3/h;-><init>(I)V

    invoke-virtual {v11, v6}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    sget-object v6, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v2}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v6

    sget-object v14, Lq93/d;->j:Ljava/util/HashMap;

    invoke-virtual {v14, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v3}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v14

    new-instance v15, Lce/d;

    const/16 v16, 0x0

    const/16 v10, 0x8

    invoke-direct {v15, v10, v3, v12}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, v0, Lq93/p;->e:Lkb3/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lkb3/g;

    invoke-direct {v10, v14, v15}, Lkb3/g;-><init>(Ljava/lang/Object;Lc93/a;)V

    invoke-virtual {v3, v10}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1e

    check-cast v3, Lr93/e;

    invoke-interface {v3}, Lr93/e;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v3

    const-string v10, "getUnsubstitutedMemberScope(...)"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lz93/c;->w:Lz93/c;

    invoke-interface {v3, v1, v10}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lu93/q0;

    invoke-virtual {v12}, Lu93/x;->getKind()I

    move-result v14

    if-eq v14, v5, :cond_a

    goto/16 :goto_8

    :cond_a
    invoke-virtual {v12}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v14, Lr93/o;

    iget-object v14, v14, Lr93/o;->a:Lr93/m1;

    iget-boolean v14, v14, Lr93/m1;->b:Z

    if-nez v14, :cond_b

    goto/16 :goto_8

    :cond_b
    invoke-static {v12}, Lo93/h;->D(Lr93/w;)Z

    move-result v14

    if-eqz v14, :cond_c

    goto/16 :goto_8

    :cond_c
    invoke-virtual {v12}, Lu93/x;->h()Ljava/util/Collection;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    instance-of v15, v14, Ljava/util/Collection;

    if-eqz v15, :cond_d

    move-object v15, v14

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_d

    goto :goto_6

    :cond_d
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr93/w;

    invoke-interface {v15}, Lr93/k;->g()Lr93/k;

    move-result-object v15

    const-string v13, "getContainingDeclaration(...)"

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v15}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v13

    invoke-virtual {v11, v13}, Lub3/h;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    :cond_e
    const/4 v13, 0x0

    goto :goto_8

    :cond_f
    const/4 v13, 0x0

    goto :goto_5

    :cond_10
    :goto_6
    invoke-virtual {v12}, Lu93/o;->g()Lr93/k;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Lr93/e;

    invoke-static {v12, v8}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v14

    sget-object v15, Lq93/s;->e:Ljava/util/LinkedHashSet;

    invoke-static {v13, v14}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v15, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    xor-int/2addr v13, v6

    if-eqz v13, :cond_11

    move v12, v5

    goto :goto_7

    :cond_11
    invoke-static {v12}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/util/Collection;

    new-instance v13, Lq93/m;

    invoke-direct {v13, v0}, Lq93/m;-><init>(Lq93/p;)V

    sget-object v14, Lq93/l;->w:Lq93/l;

    invoke-static {v12, v14, v13}, Ls93/h;->r(Ljava/util/Collection;Lub3/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v12

    const-string v13, "ifAny(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    :goto_7
    if-nez v12, :cond_e

    move v13, v5

    :goto_8
    if-eqz v13, :cond_12

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    const/4 v13, 0x0

    goto/16 :goto_4

    :cond_13
    move-object v6, v3

    :goto_9
    check-cast v6, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu93/q0;

    invoke-virtual {v6}, Lu93/o;->g()Lr93/k;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lr93/e;

    invoke-static {v10, v2}, Lcom/squareup/wire/n;->u(Lr93/e;Lr93/e;)Llb3/r0;

    move-result-object v10

    new-instance v11, Llb3/a1;

    invoke-direct {v11, v10}, Llb3/a1;-><init>(Llb3/y0;)V

    invoke-virtual {v6, v11}, Lu93/x;->d(Llb3/a1;)Lr93/w;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lu93/q0;

    invoke-interface {v10}, Lr93/w;->l0()Lr93/v;

    move-result-object v10

    invoke-interface {v10, v2}, Lr93/v;->l(Lr93/k;)Lr93/v;

    invoke-interface {v2}, Lr93/e;->q0()Lr93/q0;

    move-result-object v11

    invoke-interface {v10, v11}, Lr93/v;->t(Lr93/q0;)Lr93/v;

    invoke-interface {v10}, Lr93/v;->s()Lr93/v;

    invoke-virtual {v6}, Lu93/o;->g()Lr93/k;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lr93/e;

    invoke-static {v6, v8}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Lkotlin/jvm/internal/g0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    new-instance v14, Lq30/u0;

    invoke-direct {v14, v0, v7}, Lq30/u0;-><init>(Ljava/lang/Object;I)V

    new-instance v15, Lcb3/d;

    invoke-direct {v15, v12, v13, v5}, Lcb3/d;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v11, v14, v15}, Ls93/h;->i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "dfs(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lq93/n;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_1a

    if-eq v11, v5, :cond_1c

    if-eq v11, v7, :cond_17

    if-eq v11, v8, :cond_16

    const/4 v6, 0x4

    if-ne v11, v6, :cond_15

    :goto_b
    move-object/from16 v6, v16

    goto/16 :goto_e

    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_16
    iget-object v6, v0, Lq93/p;->f:Lkb3/i;

    aget-object v11, v4, v7

    invoke-static {v6, v11}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls93/i;

    invoke-interface {v10, v6}, Lr93/v;->v(Ls93/i;)Lr93/v;

    goto :goto_d

    :cond_17
    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v11

    invoke-static {}, Lq93/q;->a()Lva3/h;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    iget-object v13, v0, Lq93/p;->g:Lkb3/e;

    if-eqz v12, :cond_18

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v6

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v6

    new-instance v11, Ll83/k;

    const-string v12, "first"

    invoke-direct {v11, v6, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v11}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls93/i;

    goto :goto_c

    :cond_18
    invoke-static {}, Lq93/q;->b()Lva3/h;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v6

    invoke-virtual {v6}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v6

    new-instance v11, Ll83/k;

    const-string v12, "last"

    invoke-direct {v11, v6, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v11}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ls93/i;

    :goto_c
    invoke-interface {v10, v6}, Lr93/v;->v(Ls93/i;)Lr93/v;

    goto :goto_d

    :cond_19
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected name: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1a
    invoke-static {v2}, Lr93/y;->b(Lr93/e;)Z

    move-result v6

    if-eqz v6, :cond_1b

    goto/16 :goto_b

    :cond_1b
    invoke-interface {v10}, Lr93/v;->g()Lr93/v;

    :cond_1c
    :goto_d
    invoke-interface {v10}, Lr93/v;->build()Lr93/w;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v6, Lu93/q0;

    :goto_e
    if-eqz v6, :cond_14

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_1d
    return-object v1

    :cond_1e
    invoke-static {v8}, Lkb3/e;->a(I)V

    throw v16
.end method

.method public final b(Lr93/e;)Ljava/util/Collection;
    .locals 6

    invoke-static {p1}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p1

    sget-object v0, Lq93/s;->a:Ljava/util/LinkedHashSet;

    sget-object v0, Lo93/m;->g:Lva3/f;

    invoke-virtual {p1, v0}, Lva3/f;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lq93/p;->c:Llb3/c0;

    if-nez v1, :cond_5

    sget-object v1, Lo93/m;->g0:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1, v0}, Lva3/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lq93/d;->a:Ljava/lang/String;

    invoke-static {p1}, Lq93/d;->g(Lva3/f;)Lva3/c;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object p1

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    iget-object p1, p1, Lva3/f;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-class v0, Ljava/io/Serializable;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    goto :goto_1

    :cond_3
    :goto_0
    move v2, v3

    :catch_0
    :goto_1
    if-eqz v2, :cond_4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_2

    :cond_4
    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_2
    return-object p1

    :cond_5
    :goto_3
    sget-object p1, Lq93/p;->h:[Lj93/z;

    aget-object p1, p1, v3

    iget-object v0, p0, Lq93/p;->d:Lkb3/i;

    invoke-static {v0, p1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/c0;

    const/4 v0, 0x2

    new-array v0, v0, [Llb3/y;

    aput-object p1, v0, v2

    aput-object v4, v0, v3

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final c(Lr93/e;)Ljava/util/Collection;
    .locals 14

    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v0

    sget-object v1, Lr93/f;->w:Lr93/f;

    if-ne v0, v1, :cond_c

    invoke-virtual {p0}, Lq93/p;->g()Lq93/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lq93/p;->f(Lr93/e;)Lja3/i;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v1

    sget-object v2, Lq93/b;->f:Lq93/b;

    invoke-static {}, Lce/w;->N()Lq93/b;

    move-result-object v2

    invoke-static {v1, v2}, Lq93/e;->b(Lva3/e;Lo93/h;)Lr93/e;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-static {v1, v0}, Lcom/squareup/wire/n;->u(Lr93/e;Lr93/e;)Llb3/r0;

    move-result-object v2

    new-instance v3, Llb3/a1;

    invoke-direct {v3, v2}, Llb3/a1;-><init>(Llb3/y0;)V

    iget-object v2, v0, Lja3/i;->Q:Lja3/o;

    iget-object v2, v2, Lja3/o;->q:Lkb3/i;

    invoke-virtual {v2}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lu93/j;

    move-object v10, v9

    check-cast v10, Lu93/x;

    invoke-virtual {v10}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v11, Lr93/o;

    iget-object v11, v11, Lr93/o;->a:Lr93/m1;

    iget-boolean v11, v11, Lr93/m1;->b:Z

    if-eqz v11, :cond_2

    invoke-interface {v1}, Lr93/e;->getConstructors()Ljava/util/Collection;

    move-result-object v11

    const-string v12, "getConstructors(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/Iterable;

    instance-of v12, v11, Ljava/util/Collection;

    if-eqz v12, :cond_3

    move-object v12, v11

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu93/j;

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v9, v3}, Lu93/j;->Z0(Llb3/a1;)Lu93/j;

    move-result-object v13

    invoke-static {v12, v13}, Lya3/n;->j(Lr93/b;Lr93/b;)I

    move-result v12

    if-ne v12, v7, :cond_4

    goto :goto_0

    :cond_5
    :goto_1
    invoke-virtual {v10}, Lu93/x;->v()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    if-ne v11, v7, :cond_7

    invoke-virtual {v10}, Lu93/x;->v()Ljava/util/List;

    move-result-object v7

    const-string v10, "getValueParameters(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/a1;

    check-cast v7, Lu93/x0;

    invoke-virtual {v7}, Lu93/x0;->getType()Llb3/y;

    move-result-object v7

    invoke-virtual {v7}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->d()Lr93/h;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v7}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v8

    :cond_6
    invoke-static {p1}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-static {v9}, Lo93/h;->D(Lr93/w;)Z

    move-result v7

    if-nez v7, :cond_2

    sget-object v7, Lq93/s;->f:Ljava/util/LinkedHashSet;

    invoke-static {v9, v6}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu93/j;

    move-object v5, v4

    check-cast v5, Lu93/x;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {v5, v9}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v5

    iput-object p1, v5, Lu93/w;->x:Lr93/k;

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object v9

    invoke-virtual {v5, v9}, Lu93/w;->n(Llb3/y;)Lr93/v;

    iput-boolean v7, v5, Lu93/w;->O:Z

    invoke-virtual {v3}, Llb3/a1;->f()Llb3/y0;

    move-result-object v9

    if-eqz v9, :cond_a

    iput-object v9, v5, Lu93/w;->w:Llb3/y0;

    sget-object v9, Lq93/s;->g:Ljava/util/LinkedHashSet;

    invoke-static {v4, v6}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    sget-object v4, Lq93/p;->h:[Lj93/z;

    const/4 v9, 0x2

    aget-object v4, v4, v9

    iget-object v9, p0, Lq93/p;->f:Lkb3/i;

    invoke-static {v9, v4}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls93/i;

    invoke-virtual {v5, v4}, Lu93/w;->v(Ls93/i;)Lr93/v;

    :cond_9
    iget-object v4, v5, Lu93/w;->X:Lu93/x;

    invoke-virtual {v4, v5}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lu93/j;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    const/16 p1, 0x25

    invoke-static {p1}, Lu93/w;->a(I)V

    throw v8

    :cond_b
    return-object v1

    :cond_c
    :goto_3
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final d(Lr93/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lq93/p;->g()Lq93/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lq93/p;->f(Lr93/e;)Lja3/i;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lja3/i;->X()Lja3/o;

    move-result-object p1

    invoke-virtual {p1}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_1
    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final e(Lr93/e;Ljb3/t;)Z
    .locals 3

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lq93/p;->f(Lr93/e;)Lja3/i;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v0

    invoke-static {}, Lt93/e;->a()Lva3/e;

    move-result-object v1

    invoke-interface {v0, v1}, Ls93/i;->J(Lva3/e;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lq93/p;->g()Lq93/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    invoke-static {p2, v0}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lja3/i;->X()Lja3/o;

    move-result-object p1

    invoke-virtual {p2}, Lu93/n;->getName()Lva3/h;

    move-result-object p2

    const-string v2, "getName(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lz93/c;->w:Lz93/c;

    invoke-virtual {p1, p2, v2}, Lja3/o;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu93/q0;

    invoke-static {p2, v0}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Lr93/e;)Lja3/i;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    sget-object v1, Lo93/m;->a:Lva3/f;

    invoke-static {p1, v1}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo93/h;->J(Lr93/h;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p1

    invoke-virtual {p1}, Lva3/f;->d()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Lq93/d;->a:Ljava/lang/String;

    invoke-static {p1}, Lq93/d;->g(Lva3/f;)Lva3/c;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lq93/p;->g()Lq93/i;

    move-result-object v1

    iget-object v1, v1, Lq93/i;->a:Lu93/e0;

    sget-object v2, Lz93/c;->w:Lz93/c;

    invoke-static {v1, p1}, Lr93/y;->d(Lr93/b0;Lva3/e;)Lr93/e;

    move-result-object p1

    instance-of v1, p1, Lja3/i;

    if-eqz v1, :cond_4

    check-cast p1, Lja3/i;

    return-object p1

    :cond_4
    :goto_0
    return-object v0

    :cond_5
    const/16 p1, 0x6c

    invoke-static {p1}, Lo93/h;->a(I)V

    throw v0
.end method

.method public final g()Lq93/i;
    .locals 2

    sget-object v0, Lq93/p;->h:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lq93/p;->b:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq93/i;

    return-object v0
.end method
