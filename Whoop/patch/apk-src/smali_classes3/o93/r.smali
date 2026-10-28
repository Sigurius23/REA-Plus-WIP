.class public abstract Lo93/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/HashMap;

.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lo93/q;->values()[Lo93/q;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    iget-object v5, v5, Lo93/q;->x:Lva3/h;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lo93/r;->a:Ljava/util/Set;

    invoke-static {}, Lo93/p;->values()[Lo93/p;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    iget-object v5, v5, Lo93/p;->w:Lva3/h;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo93/r;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo93/r;->c:Ljava/util/HashMap;

    sget-object v0, Lo93/p;->x:Lo93/p;

    const-string v1, "ubyteArrayOf"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/p;->y:Lo93/p;

    const-string v1, "ushortArrayOf"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/p;->z:Lo93/p;

    const-string v1, "uintArrayOf"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lo93/p;->E:Lo93/p;

    const-string v1, "ulongArrayOf"

    invoke-static {v1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v1

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v4, v5, v6}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    invoke-static {}, Lo93/q;->values()[Lo93/q;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    iget-object v5, v5, Lo93/q;->y:Lva3/c;

    invoke-virtual {v5}, Lva3/c;->f()Lva3/h;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    sput-object v1, Lo93/r;->d:Ljava/util/LinkedHashSet;

    invoke-static {}, Lo93/q;->values()[Lo93/q;

    move-result-object v0

    array-length v1, v0

    :goto_3
    if-ge v3, v1, :cond_3

    aget-object v2, v0, v3

    sget-object v4, Lo93/r;->b:Ljava/util/HashMap;

    iget-object v5, v2, Lo93/q;->y:Lva3/c;

    iget-object v6, v2, Lo93/q;->w:Lva3/c;

    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lo93/r;->c:Ljava/util/HashMap;

    iget-object v2, v2, Lo93/q;->y:Lva3/c;

    invoke-virtual {v4, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    return-void
.end method

.method public static a(Lva3/c;)Lva3/c;
    .locals 1

    sget-object v0, Lo93/r;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/c;

    return-object p0
.end method

.method public static b(Lva3/h;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/r;->d:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final c(Llb3/y;)Z
    .locals 2

    invoke-static {p0}, Llb3/d1;->l(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v1, v0, Lr93/g0;

    if-eqz v1, :cond_2

    check-cast v0, Lr93/g0;

    check-cast v0, Lu93/g0;

    iget-object v0, v0, Lu93/g0;->F:Lva3/e;

    sget-object v1, Lo93/n;->k:Lva3/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lo93/r;->a:Ljava/util/Set;

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
