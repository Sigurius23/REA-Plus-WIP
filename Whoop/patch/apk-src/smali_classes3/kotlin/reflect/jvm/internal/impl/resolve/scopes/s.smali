.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# static fields
.field public static final synthetic f:[Lj93/z;


# instance fields
.field public final b:Ljb3/h;

.field public final c:Z

.field public final d:Lkb3/i;

.field public final e:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;

    const-string v2, "functions"

    const-string v3, "getFunctions()Ljava/util/List;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const-string v3, "properties"

    const-string v5, "getProperties()Ljava/util/List;"

    invoke-static {v1, v3, v5, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->f:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lkb3/k;Ljb3/h;Z)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->b:Ljb3/h;

    iput-boolean p3, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->c:Z

    sget-object p2, Lr93/f;->w:Lr93/f;

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;I)V

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->d:Lkb3/i;

    new-instance p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/r;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;I)V

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->e:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->f:[Lj93/z;

    aget-object p1, p2, p1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->d:Lkb3/i;

    invoke-static {v0, p1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->e:Lkb3/i;

    invoke-static {v0, p2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->f:[Lj93/z;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->d:Lkb3/i;

    invoke-static {v0, p2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Lub3/f;

    invoke-direct {v0}, Lub3/f;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lu93/q0;

    invoke-virtual {v2}, Lu93/n;->getName()Lva3/h;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lub3/f;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 3

    const-string p2, "name"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->f:[Lj93/z;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/s;->e:Lkb3/i;

    invoke-static {v0, p2}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Lub3/f;

    invoke-direct {v0}, Lub3/f;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr93/n0;

    invoke-interface {v2}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lub3/f;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
