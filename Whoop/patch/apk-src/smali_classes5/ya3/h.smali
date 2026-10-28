.class public abstract Lya3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.jvm.JvmInline"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    sget-object v1, Lva3/e;->c:Lva3/e;

    invoke-static {v0}, Lva3/d;->j(Lva3/h;)Lva3/e;

    move-result-object v0

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.jvm.JvmName"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Lr93/c;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lr93/o0;

    if-eqz v0, :cond_1

    check-cast p0, Lr93/o0;

    check-cast p0, Lu93/k0;

    invoke-virtual {p0}, Lu93/k0;->J0()Lr93/n0;

    move-result-object p0

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_0

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lr93/e;->I()Lr93/y0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    const-string v1, "getName(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lr93/y0;->a(Lva3/h;)Z

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(Lr93/k;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_0

    check-cast p0, Lr93/e;

    invoke-interface {p0}, Lr93/e;->I()Lr93/y0;

    move-result-object p0

    instance-of p0, p0, Lr93/x;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Lr93/k;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lr93/e;

    if-eqz v0, :cond_0

    check-cast p0, Lr93/e;

    invoke-interface {p0}, Lr93/e;->I()Lr93/y0;

    move-result-object p0

    instance-of p0, p0, Lr93/c0;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final d(Lr93/b1;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lr93/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    sget v1, Lcb3/e;->a:I

    invoke-interface {v0}, Lr93/e;->I()Lr93/y0;

    move-result-object v0

    instance-of v1, v0, Lr93/x;

    if-eqz v1, :cond_1

    check-cast v0, Lr93/x;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    iget-object v2, v0, Lr93/x;->a:Lva3/h;

    :cond_2
    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object p0

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(Lr93/k;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lya3/h;->b(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lya3/h;->c(Lr93/k;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(Llb3/y;)Z
    .locals 0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lya3/h;->e(Lr93/k;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(Llb3/y;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lya3/h;->c(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lmb3/m;->w:Lmb3/m;

    invoke-virtual {v0, p0}, Lmb3/m;->n0(Lob3/g;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final h(Llb3/y;)Llb3/c0;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    instance-of v0, p0, Lr93/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lr93/e;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_2

    sget v0, Lcb3/e;->a:I

    invoke-interface {p0}, Lr93/e;->I()Lr93/y0;

    move-result-object p0

    instance-of v0, p0, Lr93/x;

    if-eqz v0, :cond_1

    check-cast p0, Lr93/x;

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    if-eqz p0, :cond_2

    iget-object p0, p0, Lr93/x;->b:Lob3/h;

    check-cast p0, Llb3/c0;

    return-object p0

    :cond_2
    return-object v1
.end method
