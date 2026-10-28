.class public final Ljb3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic j:[Lj93/z;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Lkb3/e;

.field public final e:Lkb3/e;

.field public final f:Landroidx/lifecycle/h2;

.field public final g:Lkb3/i;

.field public final h:Lkb3/i;

.field public final synthetic i:Ljb3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Ljb3/p;

    const-string v2, "functionNames"

    const-string v3, "getFunctionNames()Ljava/util/Set;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "variableNames"

    const-string v5, "getVariableNames()Ljava/util/Set;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ljb3/p;->j:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Ljb3/q;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "functionList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljb3/p;->i:Ljb3/q;

    check-cast p2, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lwa3/v;

    iget-object v3, p1, Ljb3/q;->b:Lhb3/k;

    iget-object v3, v3, Lhb3/k;->b:Lsa3/f;

    check-cast v2, Lqa3/c0;

    iget v2, v2, Lqa3/c0;->F:I

    invoke-static {v3, v2}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljb3/p;->c(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->a:Ljava/util/LinkedHashMap;

    check-cast p3, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lwa3/v;

    iget-object v2, p1, Ljb3/q;->b:Lhb3/k;

    iget-object v2, v2, Lhb3/k;->b:Lsa3/f;

    check-cast v1, Lqa3/k0;

    iget v1, v1, Lqa3/k0;->F:I

    invoke-static {v2, v1}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p2}, Ljb3/p;->c(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->b:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p1, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p4, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Lwa3/v;

    iget-object v1, p1, Ljb3/q;->b:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->b:Lsa3/f;

    check-cast v0, Lqa3/y0;

    iget v0, v0, Lqa3/y0;->E:I

    invoke-static {v1, v0}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {p2}, Ljb3/p;->c(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->c:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p1, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Ljb3/m;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Ljb3/m;-><init>(Ljb3/p;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->d:Lkb3/e;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p1, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Ljb3/m;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Ljb3/m;-><init>(Ljb3/p;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->e:Lkb3/e;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p1, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Ljb3/m;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Ljb3/m;-><init>(Ljb3/p;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Ljb3/p;->f:Landroidx/lifecycle/h2;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p2, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p2, p2, Lhb3/k;->a:Lhb3/i;

    iget-object p2, p2, Lhb3/i;->a:Lkb3/k;

    new-instance p3, Ljb3/n;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p1, p4}, Ljb3/n;-><init>(Ljb3/p;Ljb3/q;I)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lkb3/i;

    invoke-direct {p1, p2, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p1, p0, Ljb3/p;->g:Lkb3/i;

    iget-object p1, p0, Ljb3/p;->i:Ljb3/q;

    iget-object p2, p1, Ljb3/q;->b:Lhb3/k;

    iget-object p2, p2, Lhb3/k;->a:Lhb3/i;

    iget-object p2, p2, Lhb3/i;->a:Lkb3/k;

    new-instance p3, Ljb3/n;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p1, p4}, Ljb3/n;-><init>(Ljb3/p;Ljb3/q;I)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lkb3/i;

    invoke-direct {p1, p2, p3}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p1, p0, Ljb3/p;->h:Lkb3/i;

    return-void
.end method

.method public static c(Ljava/util/LinkedHashMap;)Ljava/util/LinkedHashMap;
    .locals 9

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwa3/b;

    invoke-interface {v5}, Lwa3/v;->d()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->f(I)I

    move-result v7

    add-int/2addr v7, v6

    const/16 v8, 0x1000

    if-le v7, v8, :cond_0

    move v7, v8

    :cond_0
    invoke-static {v3, v7}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v7

    invoke-virtual {v7, v6}, Lwa3/g;->v(I)V

    invoke-interface {v5, v7}, Lwa3/v;->f(Lwa3/g;)V

    invoke-virtual {v7}, Lwa3/g;->i()V

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final a(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Ljb3/p;->j:[Lj93/z;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    iget-object v0, p0, Ljb3/p;->g:Lkb3/i;

    invoke-static {v0, p2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object p2, p0, Ljb3/p;->d:Lkb3/e;

    invoke-virtual {p2, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final b(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string p2, "name"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Ljb3/p;->j:[Lj93/z;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    iget-object v0, p0, Ljb3/p;->h:Lkb3/i;

    invoke-static {v0, p2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    iget-object p2, p0, Ljb3/p;->e:Lkb3/e;

    invoke-virtual {p2, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
