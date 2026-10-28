.class public final Lja3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# static fields
.field public static final synthetic f:[Lj93/z;


# instance fields
.field public final b:Lzt/q;

.field public final c:Lja3/q;

.field public final d:Lja3/v;

.field public final e:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lja3/d;

    const-string v2, "kotlinScopes"

    const-string v3, "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lja3/d;->f:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lx93/x;Lja3/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/d;->b:Lzt/q;

    iput-object p3, p0, Lja3/d;->c:Lja3/q;

    new-instance v0, Lja3/v;

    invoke-direct {v0, p1, p2, p3}, Lja3/v;-><init>(Lzt/q;Lx93/x;Lja3/q;)V

    iput-object v0, p0, Lja3/d;->d:Lja3/v;

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    new-instance p2, Lfa3/u;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lja3/d;->e:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    sget-object v0, Lja3/d;->f:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lja3/d;->e:Lkb3/i;

    invoke-static {v1, v0}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v0
.end method

.method public final getClassifierNames()Ljava/util/Set;
    .locals 2

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->V([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/config/a;->x(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v1}, Lja3/a0;->getClassifierNames()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/d;->recordLookup(Lva3/h;Lz93/a;)V

    iget-object v0, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lja3/v;->o(Lva3/h;Lx93/n;)Lr93/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v4

    if-eqz v4, :cond_2

    instance-of v5, v4, Lr93/i;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Lr93/z;

    invoke-interface {v5}, Lr93/z;->U()Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v1, :cond_2

    move-object v1, v4

    goto :goto_1

    :cond_1
    return-object v4

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 5

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    iget-object v1, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v1, p1, p2}, Lja3/v;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v1, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/d;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    iget-object v1, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v1, p1, p2}, Lja3/a0;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v1, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lja3/d;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    iget-object v1, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v1, v0

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v2, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 5

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v0}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 5

    invoke-virtual {p0}, Lja3/d;->a()[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lja3/d;->d:Lja3/v;

    invoke-virtual {v0}, Lja3/a0;->getVariableNames()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/d;->b:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->n:Lz93/b;

    iget-object v1, p0, Lja3/d;->c:Lja3/q;

    invoke-static {v0, p2, v1, p1}, Lva3/b;->j(Lz93/b;Lz93/a;Lr93/g0;Lva3/h;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "scope for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lja3/d;->c:Lja3/q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
