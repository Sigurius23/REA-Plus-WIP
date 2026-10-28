.class public interface abstract Landroidx/lifecycle/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    const-string v0, "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."

    .line 3
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p0, p1}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
