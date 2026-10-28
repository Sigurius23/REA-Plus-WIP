.class public abstract Lkotlin/jvm/internal/y;
.super Lkotlin/jvm/internal/a0;
.source "SourceFile"

# interfaces
.implements Lj93/y;


# virtual methods
.method public final computeReflected()Lj93/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->property2(Lkotlin/jvm/internal/y;)Lj93/y;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic getGetter()Lj93/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/y;->getGetter()Lj93/x;

    move-result-object v0

    return-object v0
.end method

.method public final getGetter()Lj93/x;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/a0;->getReflected()Lj93/z;

    move-result-object v0

    check-cast v0, Lj93/y;

    invoke-interface {v0}, Lj93/y;->getGetter()Lj93/x;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p0

    check-cast v0, Lkotlin/jvm/internal/z;

    invoke-virtual {v0}, Lkotlin/jvm/internal/y;->getGetter()Lj93/x;

    move-result-object v0

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
