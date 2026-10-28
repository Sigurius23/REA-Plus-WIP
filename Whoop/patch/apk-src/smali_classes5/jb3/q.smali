.class public abstract Ljb3/q;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# static fields
.field public static final synthetic f:[Lj93/z;


# instance fields
.field public final b:Lhb3/k;

.field public final c:Ljb3/p;

.field public final d:Lkb3/i;

.field public final e:Lkb3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Ljb3/q;

    const-string v2, "classNames"

    const-string v3, "getClassNames$deserialization()Ljava/util/Set;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "classifierNamesLazy"

    const-string v5, "getClassifierNamesLazy()Ljava/util/Set;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ljb3/q;->f:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lhb3/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lc93/a;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object v0, p1, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljb3/p;

    invoke-direct {v0, p0, p2, p3, p4}, Ljb3/p;-><init>(Ljb3/q;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v0, p0, Ljb3/q;->c:Ljb3/p;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Ljb3/l;

    const/4 p3, 0x0

    invoke-direct {p2, p5, p3}, Ljb3/l;-><init>(Lc93/a;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Ljb3/q;->d:Lkb3/i;

    new-instance p2, Lfa3/u;

    const/4 p3, 0x4

    invoke-direct {p2, p0, p3}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lkb3/h;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Ljb3/q;->e:Lkb3/h;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V
.end method

.method public final b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 9

    sget-object v0, Lz93/c;->z:Lz93/c;

    const-string v1, "kindFilter"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    sget v3, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->f:I

    invoke-virtual {p1, v3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v1, p2}, Ljb3/q;->a(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    iget-object v3, p0, Ljb3/q;->c:Ljb3/p;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->j:I

    invoke-virtual {p1, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v4

    sget-object v5, Lya3/i;->w:Lya3/i;

    if-eqz v4, :cond_3

    iget-object v4, v3, Ljb3/p;->h:Lkb3/i;

    sget-object v6, Ljb3/p;->j:[Lj93/z;

    const/4 v7, 0x1

    aget-object v6, v6, v7

    invoke-static {v4, v6}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    check-cast v4, Ljava/util/Collection;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lva3/h;

    invoke-interface {p2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v3, v7, v0}, Ljb3/p;->b(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    invoke-static {v6, v5}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3
    sget v4, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->i:I

    invoke-virtual {p1, v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v3, Ljb3/p;->g:Lkb3/i;

    sget-object v6, Ljb3/p;->j:[Lj93/z;

    aget-object v2, v6, v2

    invoke-static {v4, v2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lva3/h;

    invoke-interface {p2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v3, v6, v0}, Ljb3/p;->a(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_5
    invoke-static {v4, v5}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_6
    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->l:I

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Ljb3/q;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/h;

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v4, v4, Lhb3/k;->a:Lhb3/i;

    invoke-virtual {p0, v2}, Ljb3/q;->e(Lva3/h;)Lva3/c;

    move-result-object v2

    invoke-virtual {v4, v2}, Lhb3/i;->b(Lva3/c;)Lr93/e;

    move-result-object v2

    invoke-static {v1, v2}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->g:I

    invoke-virtual {p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->a(I)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, v3, Ljb3/p;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva3/h;

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Ljb3/p;->f:Landroidx/lifecycle/h2;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/w0;

    invoke-static {v1, v0}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    goto :goto_3

    :cond_a
    invoke-static {v1}, Lub3/j;->b(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public c(Ljava/util/ArrayList;Lva3/h;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/util/ArrayList;Lva3/h;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract e(Lva3/h;)Lva3/c;
.end method

.method public final f()Ljava/util/Set;
    .locals 2

    sget-object v0, Ljb3/q;->f:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Ljb3/q;->d:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public abstract g()Ljava/util/Set;
.end method

.method public final getClassifierNames()Ljava/util/Set;
    .locals 3

    sget-object v0, Ljb3/q;->f:[Lj93/z;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    const-string v1, "<this>"

    iget-object v2, p0, Ljb3/q;->e:Lkb3/h;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "p"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lkb3/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljb3/q;->j(Lva3/h;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Ljb3/q;->b:Lhb3/k;

    iget-object p2, p2, Lhb3/k;->a:Lhb3/i;

    invoke-virtual {p0, p1}, Ljb3/q;->e(Lva3/h;)Lva3/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lhb3/i;->b(Lva3/c;)Lr93/e;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Ljb3/q;->c:Ljb3/p;

    iget-object v0, p2, Ljb3/p;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Ljb3/p;->f:Landroidx/lifecycle/h2;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/w0;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/q;->c:Ljb3/p;

    invoke-virtual {v0, p1, p2}, Ljb3/p;->a(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/q;->c:Ljb3/p;

    invoke-virtual {v0, p1, p2}, Ljb3/p;->b(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ljb3/q;->c:Ljb3/p;

    iget-object v0, v0, Ljb3/p;->g:Lkb3/i;

    sget-object v1, Ljb3/p;->j:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ljb3/q;->c:Ljb3/p;

    iget-object v0, v0, Ljb3/p;->h:Lkb3/i;

    sget-object v1, Ljb3/p;->j:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public abstract h()Ljava/util/Set;
.end method

.method public abstract i()Ljava/util/Set;
.end method

.method public j(Lva3/h;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljb3/q;->f()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public k(Ljb3/t;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
