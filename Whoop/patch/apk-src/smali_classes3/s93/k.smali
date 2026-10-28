.class public abstract Ls93/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(Lud3/o0;)Lud3/o0;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;ZZZZZ)Lzy/c;
    .locals 3

    const-string v0, "merchantName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laz/a;

    const/4 v1, 0x1

    if-ne p5, v1, :cond_0

    const-string p5, "https://link.com/terms/ach-authorization"

    goto :goto_0

    :cond_0
    if-nez p5, :cond_7

    const-string p5, "https://stripe.com/ach-payments/authorization"

    :goto_0
    const-string v1, "<a href=\""

    const-string v2, "\">"

    invoke-static {v1, p5, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    const-string v1, "<terms>"

    invoke-direct {v0, v1, p5}, Laz/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p5, Laz/a;

    const-string v1, "</terms>"

    const-string v2, "</a>"

    invoke-direct {p5, v1, v2}, Laz/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    filled-new-array {v0, p5}, [Laz/a;

    move-result-object p5

    invoke-static {p5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p5

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    const p2, 0x7f14110f

    filled-new-array {p0, p1, p0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1, p5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    const p2, 0x7f141110

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1, p5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    goto :goto_2

    :cond_2
    if-nez p4, :cond_4

    if-eqz p6, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const p2, 0x7f141053

    invoke-static {p2, p1, p5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_1
    const p1, 0x7f141054

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2, p5}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    :goto_2
    if-eqz p3, :cond_5

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lm83/y;->w:Lm83/y;

    const p3, 0x7f141088

    invoke-static {p3, p0, p2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p0

    goto :goto_3

    :cond_5
    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_6

    const-string p2, " "

    invoke-static {p2}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p2

    invoke-static {p0, p2}, Ls4/i;->q(Lzy/c;Lzy/c;)Lzy/a;

    move-result-object p0

    invoke-static {p0, p1}, Ls4/i;->q(Lzy/c;Lzy/c;)Lzy/a;

    move-result-object p0

    return-object p0

    :cond_6
    return-object p1

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static c(Ljava/lang/Object;)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Ls93/i;Ls93/i;)Ls93/i;
    .locals 3

    const-string v0, "first"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ls93/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Ls93/j;

    const/4 v1, 0x2

    new-array v1, v1, [Ls93/i;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-direct {v0, v1}, Ls93/j;-><init>([Ls93/i;)V

    return-object v0
.end method

.method public static f(Luc3/l;Ljava/lang/String;Luc3/b;)Luc3/b;
    .locals 8

    const-string v0, "initialContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Luc3/h;

    const/4 v2, 0x0

    invoke-direct {v0, p2, p0, v2}, Luc3/h;-><init>(Luc3/b;Luc3/l;I)V

    filled-new-array {v0}, [Luc3/h;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-static {p0}, Lm83/s;->m1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luc3/h;

    if-nez p2, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 p1, 0x1

    if-le p0, p1, :cond_1

    new-instance p0, Luc3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, p0}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    new-instance p0, Lkotlinx/datetime/internal/format/parser/ParseException;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ne p2, p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Position "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luc3/g;

    iget p2, p2, Luc3/g;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luc3/g;

    iget-object p2, p2, Luc3/g;->b:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x21

    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v6, Lu71/c;

    const/16 p1, 0xd

    invoke-direct {v6, p1}, Lu71/c;-><init>(I)V

    const/16 v7, 0x38

    const-string v3, ", "

    const-string v4, "Errors: "

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-object v0, p2, Luc3/h;->a:Ljava/lang/Object;

    check-cast v0, Luc3/b;

    invoke-interface {v0}, Luc3/b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luc3/b;

    iget v3, p2, Luc3/h;->c:I

    iget-object p2, p2, Luc3/h;->b:Luc3/l;

    iget-object v4, p2, Luc3/l;->a:Ljava/util/List;

    iget-object v5, p2, Luc3/l;->b:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v6, v2

    :goto_2
    if-ge v6, v4, :cond_6

    iget-object v7, p2, Luc3/l;->a:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Luc3/k;

    invoke-interface {v7, v0, p1, v3}, Luc3/k;->a(Luc3/b;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    instance-of v7, v3, Ljava/lang/Integer;

    if-eqz v7, :cond_4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    instance-of p2, v3, Luc3/g;

    if-eqz p2, :cond_5

    check-cast v3, Luc3/g;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Unexpected parse result: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ne v3, p2, :cond_7

    return-object v0

    :cond_7
    new-instance p2, Luc3/g;

    sget-object v0, Luc3/j;->w:Luc3/j;

    invoke-direct {p2, v3, v0}, Luc3/g;-><init>(ILc93/a;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    move-object p2, v5

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-ltz p2, :cond_0

    :goto_3
    add-int/lit8 v4, p2, -0x1

    new-instance v6, Luc3/h;

    invoke-interface {v5, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luc3/l;

    invoke-direct {v6, v0, p2, v3}, Luc3/h;-><init>(Luc3/b;Luc3/l;I)V

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-gez v4, :cond_9

    goto/16 :goto_0

    :cond_9
    move p2, v4

    goto :goto_3
.end method

.method public static g(Lwa/f;[Ljava/lang/String;Ljava/util/Map;)Lwa/f;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v2, p1

    if-ne v2, v1, :cond_1

    aget-object p0, p1, v0

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwa/f;

    return-object p0

    :cond_1
    array-length v2, p1

    if-le v2, v1, :cond_5

    new-instance p0, Lwa/f;

    invoke-direct {p0}, Lwa/f;-><init>()V

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa/f;

    invoke-virtual {p0, v2}, Lwa/f;->a(Lwa/f;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    if-eqz p1, :cond_4

    array-length v2, p1

    if-ne v2, v1, :cond_4

    aget-object p1, p1, v0

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa/f;

    invoke-virtual {p0, p1}, Lwa/f;->a(Lwa/f;)V

    return-object p0

    :cond_4
    if-eqz p1, :cond_5

    array-length v2, p1

    if-le v2, v1, :cond_5

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_5

    aget-object v2, p1, v0

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa/f;

    invoke-virtual {p0, v2}, Lwa/f;->a(Lwa/f;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-object p0
.end method

.method public static final h(Laws/sdk/kotlin/runtime/AwsServiceException;Lwf/a;Lye/c;)V
    .locals 4

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v0

    iget-object v0, v0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->e:Lgf/a;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object v3, p2, Lye/c;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-static {v0, v1, v3}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v0

    iget-object v0, v0, Lte/c;->a:Lgf/c;

    sget-object v1, Lte/e;->f:Lgf/a;

    if-eqz p2, :cond_1

    iget-object v2, p2, Lye/c;->b:Ljava/lang/String;

    :cond_1
    invoke-static {v0, v1, v2}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object p2

    iget-object p2, p2, Lte/c;->a:Lgf/c;

    sget-object v0, Lte/e;->i:Lgf/a;

    iget-object v1, p1, Lwf/a;->b:Lmf/h;

    const-string v2, "x-amz-request-id"

    invoke-interface {v1, v2}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v0, v1}, Ljc/x;->s0(Lgf/l;Lgf/a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object p0

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->h:Lgf/a;

    invoke-virtual {p0, p2, p1}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(Lvf/a;)Lvf/b;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lvf/g;

    if-eqz v0, :cond_1

    check-cast p0, Lvf/g;

    iget-boolean v0, p0, Lvf/g;->b:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lvf/g;->a:Lvf/b;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "This is an immutable HttpRequest that should not be converted to a builder"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    instance-of v0, p0, Lvf/h;

    if-eqz v0, :cond_5

    new-instance v0, Lvf/b;

    invoke-direct {v0}, Lvf/b;-><init>()V

    check-cast p0, Lvf/h;

    iget-object v1, p0, Lvf/h;->a:Lmf/r;

    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lvf/b;->w:Lmf/r;

    iget-object v1, p0, Lvf/h;->c:Lmf/h;

    iget-object v3, v0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Lgf/t;->b()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "values"

    const-string v6, "name"

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/util/List;

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-virtual {v3, v7, v4}, La2/a;->h(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lvf/h;->b:Lcg/o;

    iget-object v3, v0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v1, Lcg/o;->a:Lbg/l;

    iput-object v4, v3, Lcg/j;->w:Lbg/l;

    iget-object v4, v1, Lcg/o;->b:Lbg/e;

    iput-object v4, v3, Lcg/j;->x:Lbg/e;

    iget v4, v1, Lcg/o;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lcg/j;->y:Ljava/lang/Integer;

    iget-object v4, v3, Lcg/j;->z:Lbd3/k;

    iget-object v7, v1, Lcg/o;->d:Lcg/x;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v4, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->clear()V

    iget-object v9, v7, Lcg/x;->a:Ljava/util/List;

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v8, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-boolean v7, v7, Lcg/x;->b:Z

    iput-boolean v7, v4, Lbd3/k;->b:Z

    iget-object v4, v3, Lcg/j;->E:Lcg/g;

    iget-object v7, v1, Lcg/o;->e:Lcg/i;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Lcg/g;->clear()V

    iget-object v8, v7, Lcg/i;->w:Lgf/k;

    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    check-cast v9, Ljava/util/Collection;

    invoke-static {v9}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v9

    invoke-virtual {v4, v10, v9}, Lcg/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    iget-boolean v7, v7, Lcg/i;->x:Z

    iput-boolean v7, v4, Lcg/g;->x:Z

    iget-object v4, v3, Lcg/j;->F:Lwe/o;

    iget-object v7, v1, Lcg/o;->f:Lcg/y;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v7, Lcg/y;->a:Ltg/b;

    iput-object v8, v4, Lwe/o;->w:Ljava/lang/Object;

    iget-object v7, v7, Lcg/y;->b:Ltg/b;

    iput-object v7, v4, Lwe/o;->x:Ljava/lang/Object;

    iget-object v1, v1, Lcg/o;->g:Ltg/b;

    iput-object v1, v3, Lcg/j;->G:Ltg/b;

    iget-object v1, p0, Lvf/h;->d:Lmf/l;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lvf/b;->z:Lmf/l;

    iget-object p0, p0, Lvf/h;->e:Lmf/b;

    iget-object v1, v0, Lvf/b;->E:Lmf/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p0}, Lgf/t;->b()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/List;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v1, v3, v2}, La2/a;->h(Ljava/lang/String;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_4
    return-object v0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public abstract e()Ljava/lang/String;
.end method
