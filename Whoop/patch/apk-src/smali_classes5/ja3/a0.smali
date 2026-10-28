.class public abstract Lja3/a0;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# static fields
.field public static final synthetic m:[Lj93/z;


# instance fields
.field public final b:Lzt/q;

.field public final c:Lja3/a0;

.field public final d:Lkb3/c;

.field public final e:Lkb3/i;

.field public final f:Lkb3/e;

.field public final g:Landroidx/lifecycle/h2;

.field public final h:Lkb3/e;

.field public final i:Lkb3/i;

.field public final j:Lkb3/i;

.field public final k:Lkb3/i;

.field public final l:Lkb3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lja3/a0;

    const-string v2, "functionNamesLazy"

    const-string v3, "getFunctionNamesLazy()Ljava/util/Set;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "propertyNamesLazy"

    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v3

    const-string v5, "classNamesLazy"

    const-string v6, "getClassNamesLazy()Ljava/util/Set;"

    invoke-static {v1, v5, v6, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v3, v2, v0

    const/4 v0, 0x2

    aput-object v1, v2, v0

    sput-object v2, Lja3/a0;->m:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lja3/o;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/a0;->b:Lzt/q;

    iput-object p2, p0, Lja3/a0;->c:Lja3/a0;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    new-instance p2, Lja3/w;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lja3/w;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/c;

    invoke-direct {v1, v0, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/a0;->d:Lkb3/c;

    new-instance p2, Lja3/w;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lja3/w;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/i;

    invoke-direct {v1, v0, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/a0;->e:Lkb3/i;

    new-instance p2, Lja3/y;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lja3/y;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p2

    iput-object p2, p0, Lja3/a0;->f:Lkb3/e;

    new-instance p2, Lja3/y;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lja3/y;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p2

    iput-object p2, p0, Lja3/a0;->g:Landroidx/lifecycle/h2;

    new-instance p2, Lja3/y;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lja3/y;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p2

    iput-object p2, p0, Lja3/a0;->h:Lkb3/e;

    new-instance p2, Lja3/w;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lja3/w;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/i;

    invoke-direct {v1, v0, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/a0;->i:Lkb3/i;

    new-instance p2, Lja3/w;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lja3/w;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/i;

    invoke-direct {v1, v0, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/a0;->j:Lkb3/i;

    new-instance p2, Lja3/w;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v0}, Lja3/w;-><init>(Lja3/a0;I)V

    move-object v0, p1

    check-cast v0, Lkb3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lkb3/i;

    invoke-direct {v1, v0, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v1, p0, Lja3/a0;->k:Lkb3/i;

    new-instance p2, Lja3/y;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lja3/y;-><init>(Lja3/a0;I)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Lja3/a0;->l:Lkb3/e;

    return-void
.end method

.method public static e(Lx93/w;Lzt/q;)Llb3/y;
    .locals 4

    const-string v0, "method"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx93/v;->b()Lx93/n;

    move-result-object v0

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    sget-object v1, Llb3/b1;->x:Llb3/b1;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v1, v0, v2, v3}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v0

    iget-object p1, p1, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, La3/p;

    invoke-virtual {p0}, Lx93/w;->l()Lx93/a0;

    move-result-object p0

    invoke-virtual {p1, p0, v0}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object p0

    return-object p0
.end method

.method public static n(Lzt/q;Lu93/x;Ljava/util/List;)Lcom/iterable/iterableapi/g1;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, La3/p;

    iget-object v2, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v3, v2, Lia3/a;->o:Lr93/b0;

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    move-object v8, v4

    check-cast v8, Lm83/d0;

    iget-object v9, v8, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm83/c0;

    iget v12, v8, Lm83/c0;->a:I

    iget-object v8, v8, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v8, Lx93/c0;

    invoke-static {v0, v8}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v13

    sget-object v9, Llb3/b1;->x:Llb3/b1;

    const/4 v10, 0x7

    const/4 v11, 0x0

    invoke-static {v9, v6, v11, v10}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v9

    invoke-virtual {v8}, Lx93/c0;->d()Z

    move-result v10

    const/4 v14, 0x1

    if-eqz v10, :cond_2

    invoke-virtual {v8}, Lx93/c0;->c()Lma3/e;

    move-result-object v10

    instance-of v15, v10, Lx93/h;

    if-eqz v15, :cond_0

    move-object v11, v10

    check-cast v11, Lx93/h;

    :cond_0
    if-eqz v11, :cond_1

    invoke-virtual {v1, v11, v9, v14}, La3/p;->Y(Lx93/h;Lka3/a;Z)Llb3/f1;

    move-result-object v9

    invoke-interface {v3}, Lr93/b0;->c()Lo93/h;

    move-result-object v10

    invoke-virtual {v10, v9}, Lo93/h;->f(Llb3/y;)Llb3/y;

    move-result-object v10

    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Vararg parameter should be an array: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v8}, Lx93/c0;->c()Lma3/e;

    move-result-object v10

    invoke-virtual {v1, v10, v9}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v9

    new-instance v10, Ll83/k;

    invoke-direct {v10, v9, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v10

    :goto_1
    iget-object v9, v11, Ll83/k;->w:Ljava/lang/Object;

    move-object v15, v9

    check-cast v15, Llb3/y;

    iget-object v9, v11, Ll83/k;->x:Ljava/lang/Object;

    move-object/from16 v19, v9

    check-cast v19, Llb3/y;

    invoke-virtual/range {p1 .. p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v9

    invoke-virtual {v9}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v9

    const-string v10, "equals"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v14, :cond_4

    invoke-interface {v3}, Lr93/b0;->c()Lo93/h;

    move-result-object v9

    invoke-virtual {v9}, Lo93/h;->p()Llb3/c0;

    move-result-object v9

    invoke-virtual {v9, v15}, Llb3/y;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const-string v9, "other"

    invoke-static {v9}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v9

    :cond_3
    :goto_2
    move-object v14, v9

    goto :goto_3

    :cond_4
    invoke-virtual {v8}, Lx93/c0;->b()Lva3/h;

    move-result-object v9

    if-nez v9, :cond_5

    move v7, v14

    :cond_5
    if-nez v9, :cond_3

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "p"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v9

    goto :goto_2

    :goto_3
    new-instance v9, Lu93/w0;

    iget-object v10, v2, Lia3/a;->j:Lw93/d;

    invoke-virtual {v10, v8}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v20

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v10, p1

    invoke-direct/range {v9 .. v20}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    invoke-static {v5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/iterable/iterableapi/g1;

    invoke-direct {v1, v0, v7}, Lcom/iterable/iterableapi/g1;-><init>(Ljava/lang/Object;Z)V

    return-object v1
.end method


# virtual methods
.method public abstract a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
.end method

.method public abstract b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;
.end method

.method public c(Ljava/util/ArrayList;Lva3/h;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract d()Lja3/c;
.end method

.method public abstract f(Ljava/util/LinkedHashSet;Lva3/h;)V
.end method

.method public abstract g(Ljava/util/ArrayList;Lva3/h;)V
.end method

.method public final getClassifierNames()Ljava/util/Set;
    .locals 2

    sget-object v0, Lja3/a0;->m:[Lj93/z;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/a0;->k:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/a0;->d:Lkb3/c;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object p2, p0, Lja3/a0;->h:Lkb3/e;

    invoke-virtual {p2, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 0

    const-string p2, "name"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lja3/a0;->getVariableNames()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object p2, p0, Lja3/a0;->l:Lkb3/e;

    invoke-virtual {p2, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 2

    sget-object v0, Lja3/a0;->m:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/a0;->i:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 2

    sget-object v0, Lja3/a0;->m:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/a0;->j:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public abstract h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;
.end method

.method public abstract i()Lr93/q0;
.end method

.method public abstract j()Lr93/k;
.end method

.method public k(Lha3/e;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public abstract l(Lx93/w;Ljava/util/ArrayList;Llb3/y;Ljava/util/List;)Lja3/z;
.end method

.method public final m(Lx93/w;)Lha3/e;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "method"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lja3/a0;->b:Lzt/q;

    invoke-static {v2, v1}, Lhg3/i;->j0(Lzt/q;Lma3/b;)Lia3/c;

    move-result-object v3

    invoke-virtual {v0}, Lja3/a0;->j()Lr93/k;

    move-result-object v4

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v5

    iget-object v6, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v6, Lia3/a;

    iget-object v6, v6, Lia3/a;->j:Lw93/d;

    invoke-virtual {v6, v1}, Lw93/d;->c(Lma3/d;)Lw93/f;

    move-result-object v6

    iget-object v7, v0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {v7}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lja3/c;

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v8

    invoke-interface {v7, v8}, Lja3/c;->e(Lva3/h;)Lx93/z;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_0

    invoke-virtual {v1}, Lx93/w;->m()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    invoke-static {v4, v3, v5, v6, v7}, Lha3/e;->Y0(Lr93/k;Lia3/c;Lva3/h;Lw93/f;Z)Lha3/e;

    move-result-object v9

    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lzt/q;->z:Ljava/lang/Object;

    iget-object v4, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v4, Lia3/a;

    new-instance v5, Lia3/e;

    invoke-direct {v5, v2, v9, v1, v8}, Lia3/e;-><init>(Lzt/q;Lr93/l;Lma3/f;I)V

    new-instance v2, Lzt/q;

    invoke-direct {v2, v4, v5, v3}, Lzt/q;-><init>(Lia3/a;Lia3/f;Ll83/h;)V

    invoke-virtual {v1}, Lx93/w;->getTypeParameters()Ljava/util/ArrayList;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lx93/b0;

    iget-object v6, v2, Lzt/q;->y:Ljava/lang/Object;

    check-cast v6, Lia3/f;

    invoke-interface {v6, v5}, Lia3/f;->a(Lx93/b0;)Lr93/x0;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lx93/w;->m()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lja3/a0;->n(Lzt/q;Lu93/x;Ljava/util/List;)Lcom/iterable/iterableapi/g1;

    move-result-object v3

    invoke-static {v1, v2}, Lja3/a0;->e(Lx93/w;Lzt/q;)Llb3/y;

    move-result-object v5

    invoke-virtual {v3}, Lcom/iterable/iterableapi/g1;->c()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v0, v1, v4, v5, v6}, Lja3/a0;->l(Lx93/w;Ljava/util/ArrayList;Llb3/y;Ljava/util/List;)Lja3/z;

    move-result-object v4

    invoke-virtual {v4}, Lja3/z;->c()Llb3/y;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    sget-object v7, Ls93/g;->a:Ls93/f;

    invoke-static {v9, v5, v7}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v5

    move-object v10, v5

    goto :goto_2

    :cond_2
    move-object v10, v6

    :goto_2
    invoke-virtual {v0}, Lja3/a0;->i()Lr93/q0;

    move-result-object v11

    invoke-virtual {v4}, Lja3/z;->e()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v4}, Lja3/z;->f()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v4}, Lja3/z;->d()Llb3/y;

    move-result-object v15

    sget-object v5, Lr93/a0;->w:Lr93/v0;

    invoke-virtual {v1}, Lx93/v;->g()Z

    move-result v7

    invoke-virtual {v1}, Lx93/v;->h()Z

    move-result v8

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v7, :cond_3

    sget-object v5, Lr93/a0;->E:Lr93/a0;

    :goto_3
    move-object/from16 v16, v5

    goto :goto_4

    :cond_3
    if-nez v8, :cond_4

    sget-object v5, Lr93/a0;->z:Lr93/a0;

    goto :goto_3

    :cond_4
    sget-object v5, Lr93/a0;->x:Lr93/a0;

    goto :goto_3

    :goto_4
    invoke-virtual {v1}, Lx93/v;->f()Lr93/m1;

    move-result-object v1

    invoke-static {v1}, Lse/h;->U(Lr93/m1;)Lr93/r;

    move-result-object v17

    invoke-virtual {v4}, Lja3/z;->c()Llb3/y;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v3}, Lcom/iterable/iterableapi/g1;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    new-instance v5, Ll83/k;

    sget-object v7, Lha3/e;->g0:Lbb3/b;

    invoke-direct {v5, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    :goto_5
    move-object/from16 v18, v1

    goto :goto_6

    :cond_5
    sget-object v1, Lm83/z;->w:Lm83/z;

    goto :goto_5

    :goto_6
    sget-object v12, Lm83/y;->w:Lm83/y;

    invoke-virtual/range {v9 .. v18}, Lha3/e;->X0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;Ljava/util/Map;)Lu93/q0;

    invoke-virtual {v4}, Lja3/z;->b()Z

    move-result v1

    invoke-virtual {v3}, Lcom/iterable/iterableapi/g1;->d()Z

    move-result v3

    invoke-static {v1, v3}, Lev/n;->a(ZZ)I

    move-result v1

    iput v1, v9, Lha3/e;->e0:I

    invoke-virtual {v4}, Lja3/z;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, v2, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->e:Lga3/h;

    invoke-virtual {v4}, Lja3/z;->a()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_6

    const/4 v1, 0x6

    invoke-static {v1}, Lga3/h;->a(I)V

    throw v6

    :cond_6
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Should not be called"

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    return-object v9
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Lazy scope for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lja3/a0;->j()Lr93/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
