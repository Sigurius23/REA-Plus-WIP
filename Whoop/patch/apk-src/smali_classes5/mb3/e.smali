.class public final Lmb3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lmb3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb3/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmb3/e;->a:Lmb3/e;

    return-void
.end method

.method public static b(Llb3/c0;)Llb3/c0;
    .locals 11

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    instance-of v1, v0, Lza3/c;

    const/16 v2, 0xa

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    check-cast v0, Lza3/c;

    iget-object v1, v0, Lza3/c;->w:Llb3/u0;

    invoke-virtual {v1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v4

    sget-object v5, Llb3/g1;->z:Llb3/g1;

    if-ne v4, v5, :cond_0

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Llb3/u0;->b()Llb3/y;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Llb3/y;->p0()Llb3/f1;

    move-result-object v3

    :cond_1
    move-object v7, v3

    iget-object v3, v0, Lza3/c;->x:Lmb3/i;

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lza3/c;->getSupertypes()Ljava/util/Collection;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/y;

    invoke-virtual {v3}, Llb3/y;->p0()Llb3/f1;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance v2, Lmb3/i;

    invoke-direct {v2, v1, v4}, Lmb3/i;-><init>(Llb3/u0;Ljava/util/ArrayList;)V

    iput-object v2, v0, Lza3/c;->x:Lmb3/i;

    :cond_3
    new-instance v4, Lmb3/h;

    sget-object v5, Lob3/b;->w:Lob3/b;

    iget-object v6, v0, Lza3/c;->x:Lmb3/i;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v8

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v9

    const/16 v10, 0x20

    invoke-direct/range {v4 .. v10}, Lmb3/h;-><init>(Lob3/b;Lmb3/i;Llb3/f1;Llb3/k0;ZI)V

    return-object v4

    :cond_4
    instance-of v1, v0, Llb3/x;

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v1

    if-eqz v1, :cond_9

    check-cast v0, Llb3/x;

    iget-object p0, v0, Llb3/x;->x:Ljava/util/LinkedHashSet;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-static {v2}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p0, v0, Llb3/x;->w:Llb3/y;

    if-eqz p0, :cond_7

    invoke-static {p0}, Lio/sentry/config/a;->Q(Llb3/y;)Llb3/f1;

    move-result-object v3

    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    new-instance v1, Llb3/x;

    invoke-direct {v1, p0}, Llb3/x;-><init>(Ljava/util/AbstractCollection;)V

    iput-object v3, v1, Llb3/x;->w:Llb3/y;

    move-object v3, v1

    :goto_3
    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_4
    invoke-virtual {v0}, Llb3/x;->a()Llb3/c0;

    move-result-object p0

    :cond_9
    return-object p0
.end method


# virtual methods
.method public final a(Lob3/g;)Llb3/f1;
    .locals 9

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llb3/y;

    if-eqz v0, :cond_5

    check-cast p1, Llb3/y;

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    instance-of v0, p1, Llb3/c0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llb3/c0;

    invoke-static {v0}, Lmb3/e;->b(Llb3/c0;)Llb3/c0;

    move-result-object v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Llb3/r;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Llb3/r;

    iget-object v1, v0, Llb3/r;->y:Llb3/c0;

    iget-object v0, v0, Llb3/r;->x:Llb3/c0;

    invoke-static {v0}, Lmb3/e;->b(Llb3/c0;)Llb3/c0;

    move-result-object v2

    invoke-static {v1}, Lmb3/e;->b(Llb3/c0;)Llb3/c0;

    move-result-object v3

    if-ne v2, v0, :cond_2

    if-eq v3, v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v2, v3}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    :goto_1
    new-instance v1, Landroidx/room/u;

    const/4 v7, 0x0

    const/16 v8, 0x12

    const/4 v2, 0x1

    const-class v4, Lmb3/e;

    const-string v5, "prepareType"

    const-string v6, "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;"

    move-object v3, p0

    invoke-direct/range {v1 .. v8}, Landroidx/room/u;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {p1}, Llb3/o;->c(Llb3/y;)Llb3/y;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v1, p1}, Landroidx/room/u;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    invoke-static {v0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
