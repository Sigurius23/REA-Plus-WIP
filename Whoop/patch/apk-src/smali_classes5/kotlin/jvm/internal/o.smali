.class public Lkotlin/jvm/internal/o;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lkotlin/jvm/internal/n;->getGetter()Lj93/t;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v1}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
