.class public Landroidx/lifecycle/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# static fields
.field public static a:Landroidx/lifecycle/b2;


# virtual methods
.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/b2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lbi/g;->w(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Landroidx/lifecycle/b2;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method
