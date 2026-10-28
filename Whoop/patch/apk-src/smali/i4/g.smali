.class public final Li4/g;
.super Li4/b;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# virtual methods
.method public final C()Li4/g;
    .locals 1

    invoke-super {p0}, Li4/b;->l()Li4/b;

    move-result-object v0

    check-cast v0, Li4/g;

    return-object v0
.end method

.method public final bridge synthetic a()Li4/c;
    .locals 1

    invoke-virtual {p0}, Li4/g;->C()Li4/g;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Li4/b;->l()Li4/b;

    move-result-object v0

    check-cast v0, Li4/g;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Li4/f;

    invoke-direct {v0, p0}, Li4/f;-><init>(Li4/g;)V

    return-object v0
.end method

.method public final bridge synthetic l()Li4/b;
    .locals 1

    invoke-virtual {p0}, Li4/g;->C()Li4/g;

    move-result-object v0

    return-object v0
.end method
