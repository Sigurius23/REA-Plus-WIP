.class public abstract Lkotlin/jvm/internal/n;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lj93/j;


# virtual methods
.method public computeReflected()Lj93/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v0

    return-object v0
.end method

.method public getDelegate()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/j;

    invoke-interface {v0}, Lj93/u;->getDelegate()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lj93/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/n;->getGetter()Lj93/t;

    move-result-object v0

    return-object v0
.end method

.method public getGetter()Lj93/t;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/j;

    invoke-interface {v0}, Lj93/u;->getGetter()Lj93/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSetter()Lj93/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/n;->getSetter()Lj93/i;

    move-result-object v0

    return-object v0
.end method

.method public getSetter()Lj93/i;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/j;

    invoke-interface {v0}, Lj93/j;->getSetter()Lj93/i;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lj93/u;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
