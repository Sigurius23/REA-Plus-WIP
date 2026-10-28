.class public final Lga3/a;
.super Lya3/p;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lhb3/o;

.field public final synthetic c:Ljava/util/LinkedHashSet;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lhb3/o;Ljava/util/LinkedHashSet;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga3/a;->b:Lhb3/o;

    iput-object p2, p0, Lga3/a;->c:Ljava/util/LinkedHashSet;

    iput-boolean p3, p0, Lga3/a;->d:Z

    return-void
.end method

.method public static synthetic a(I)V
    .locals 7

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq p0, v5, :cond_3

    if-eq p0, v4, :cond_2

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const-string v6, "fakeOverride"

    aput-object v6, v1, v3

    goto :goto_0

    :cond_0
    const-string v6, "overridden"

    aput-object v6, v1, v3

    goto :goto_0

    :cond_1
    const-string v6, "member"

    aput-object v6, v1, v3

    goto :goto_0

    :cond_2
    const-string v6, "fromCurrent"

    aput-object v6, v1, v3

    goto :goto_0

    :cond_3
    const-string v6, "fromSuper"

    aput-object v6, v1, v3

    :goto_0
    const-string v3, "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1"

    aput-object v3, v1, v5

    if-eq p0, v5, :cond_5

    if-eq p0, v4, :cond_5

    if-eq p0, v0, :cond_4

    if-eq p0, v2, :cond_4

    const-string p0, "addFakeOverride"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_4
    const-string p0, "setOverriddenDescriptors"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_5
    const-string p0, "conflict"

    aput-object p0, v1, v4

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Lr93/c;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Ls;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lya3/n;->r(Lr93/c;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lga3/a;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lga3/a;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Lr93/c;Lr93/c;)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x2

    invoke-static {p1}, Lga3/a;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final n(Lr93/c;Ljava/util/Collection;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lga3/a;->d:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lr93/c;->getKind()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p2}, Lr93/c;->g0(Ljava/util/Collection;)V

    return-void

    :cond_1
    const/4 p1, 0x3

    invoke-static {p1}, Lga3/a;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method
