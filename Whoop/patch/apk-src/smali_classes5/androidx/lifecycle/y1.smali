.class public final Landroidx/lifecycle/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll83/h;


# instance fields
.field public E:Landroidx/lifecycle/w1;

.field public final w:Lj93/d;

.field public final x:Lkotlin/jvm/internal/m;

.field public final y:Lc93/a;

.field public final z:Lkotlin/jvm/internal/m;


# direct methods
.method public constructor <init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V
    .locals 1

    const-string v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/y1;->w:Lj93/d;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Landroidx/lifecycle/y1;->x:Lkotlin/jvm/internal/m;

    iput-object p3, p0, Landroidx/lifecycle/y1;->y:Lc93/a;

    check-cast p4, Lkotlin/jvm/internal/m;

    iput-object p4, p0, Landroidx/lifecycle/y1;->z:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/y1;->E:Landroidx/lifecycle/w1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/lifecycle/y1;->E:Landroidx/lifecycle/w1;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/y1;->x:Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/e2;

    iget-object v1, p0, Landroidx/lifecycle/y1;->y:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/a2;

    iget-object v2, p0, Landroidx/lifecycle/y1;->z:Lkotlin/jvm/internal/m;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll8/c;

    const-string v3, "store"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "factory"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "extras"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lzt/q;

    invoke-direct {v3, v0, v1, v2}, Lzt/q;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    const-string v0, "modelClass"

    iget-object v1, p0, Landroidx/lifecycle/y1;->w:Lj93/d;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/y1;->E:Landroidx/lifecycle/w1;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v0
.end method
