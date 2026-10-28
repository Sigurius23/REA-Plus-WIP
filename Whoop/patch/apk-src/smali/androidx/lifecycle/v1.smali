.class public final Landroidx/lifecycle/v1;
.super Landroidx/lifecycle/a;
.source "SourceFile"


# instance fields
.field public final d:Lxf3/c;

.field public final e:Laa3/i1;


# direct methods
.method public constructor <init>(Lxf3/c;Laa3/i1;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v0, Lpb/f;

    if-eqz v0, :cond_1

    iget-object v1, p2, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    :goto_0
    invoke-direct {p0, v0, v1}, Landroidx/lifecycle/a;-><init>(Lpb/f;Landroid/os/Bundle;)V

    iput-object p1, p0, Landroidx/lifecycle/v1;->d:Lxf3/c;

    iput-object p2, p0, Landroidx/lifecycle/v1;->e:Laa3/i1;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can\'t create SavedStateViewModelFactory without a proper stateRegistryOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;
    .locals 2

    const-string p1, "modelClass"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/v1;->e:Laa3/i1;

    iget-object p2, p1, Laa3/i1;->e:Ljava/lang/Object;

    check-cast p2, Lc93/a;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luf3/a;

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Luf3/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p2, v0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    :cond_1
    new-instance v0, La3/m0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2, p3}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p1, Laa3/i1;->b:Ljava/lang/Object;

    check-cast p2, Lj93/d;

    iget-object p1, p1, Laa3/i1;->c:Ljava/lang/Object;

    check-cast p1, Lvf3/a;

    iget-object p3, p0, Landroidx/lifecycle/v1;->d:Lxf3/c;

    invoke-virtual {p3, v0, p2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/w1;

    return-object p1
.end method
