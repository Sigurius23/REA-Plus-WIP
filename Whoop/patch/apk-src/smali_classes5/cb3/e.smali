.class public abstract Lcb3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "value"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    return-void
.end method

.method public static final a(Lr93/a1;)Z
    .locals 2

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    sget-object v0, Lcb3/a;->x:Lcb3/a;

    sget-object v1, Lcb3/c;->w:Lcb3/c;

    invoke-static {p0, v0, v1}, Ls93/h;->r(Ljava/util/Collection;Lub3/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "ifAny(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    new-instance v1, Lcb3/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcb3/a;-><init>(I)V

    new-instance v2, Lcb3/d;

    invoke-direct {v2, p1, v0}, Lcb3/d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/g0;)V

    invoke-static {p0, v1, v2}, Ls93/h;->i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr93/c;

    return-object p0
.end method

.method public static final c(Lr93/l;)Lva3/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->h(Lr93/k;)Lva3/f;

    move-result-object p0

    invoke-virtual {p0}, Lva3/f;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lva3/f;->i()Lva3/e;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final d(Ls93/b;)Lr93/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ls93/b;->getType()Llb3/y;

    move-result-object p0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_0

    check-cast p0, Lr93/e;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Lr93/k;)Lo93/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object p0

    invoke-interface {p0}, Lr93/b0;->c()Lo93/h;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lr93/h;)Lva3/c;
    .locals 3

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lr93/g0;

    const-string v2, "getName(...)"

    if-eqz v1, :cond_0

    new-instance v1, Lva3/c;

    check-cast v0, Lr93/g0;

    check-cast v0, Lu93/g0;

    iget-object v0, v0, Lu93/g0;->F:Lva3/e;

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v1

    :cond_0
    instance-of v1, v0, Lr93/i;

    if-eqz v1, :cond_1

    check-cast v0, Lr93/h;

    invoke-static {v0}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g(Lr93/k;)Lva3/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/f;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    invoke-static {v0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v0

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lva3/f;->a(Lva3/h;)Lva3/f;

    move-result-object p0

    invoke-virtual {p0}, Lva3/f;->i()Lva3/e;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lr93/k;)Lva3/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object p0

    const-string v0, "getFqName(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final i(Lr93/b0;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmb3/g;->a:Lbd3/e0;

    invoke-interface {p0, v0}, Lr93/b0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static final j(Lr93/k;)Lr93/b0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object p0

    const-string v0, "getContainingModule(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final k(Lr93/c;)Lr93/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lr93/m0;

    if-eqz v0, :cond_0

    check-cast p0, Lr93/m0;

    check-cast p0, Lu93/k0;

    invoke-virtual {p0}, Lu93/k0;->J0()Lr93/n0;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public static final l(Lr93/c;)Lxb3/g;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb3/d3;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p0

    const-string v2, "getOverriddenDescriptors(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p0

    new-instance v2, Lcb3/b;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcb3/b;-><init>(I)V

    invoke-static {p0, v2}, Lxb3/k;->t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    const/4 v2, 0x2

    new-array v2, v2, [Lxb3/i;

    const/4 v4, 0x0

    aput-object v0, v2, v4

    aput-object p0, v2, v3

    invoke-static {v2}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object p0

    new-instance v0, Lxa0/a;

    invoke-direct {v0, v1}, Lxa0/a;-><init>(I)V

    invoke-static {p0, v0}, Lxb3/k;->v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    return-object p0
.end method
