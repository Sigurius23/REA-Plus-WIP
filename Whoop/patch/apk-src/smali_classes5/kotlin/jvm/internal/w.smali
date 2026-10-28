.class public abstract Lkotlin/jvm/internal/w;
.super Lkotlin/jvm/internal/a0;
.source "SourceFile"

# interfaces
.implements Lj93/w;


# virtual methods
.method public final computeReflected()Lj93/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    return-object v0
.end method

.method public final getDelegate(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/w;

    invoke-interface {v0, p1}, Lj93/w;->getDelegate(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getGetter()Lj93/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/w;->getGetter()Lj93/v;

    move-result-object v0

    return-object v0
.end method

.method public final getGetter()Lj93/v;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/w;

    invoke-interface {v0}, Lj93/w;->getGetter()Lj93/v;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
