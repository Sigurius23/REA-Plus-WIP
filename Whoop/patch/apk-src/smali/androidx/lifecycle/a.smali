.class public abstract Landroidx/lifecycle/a;
.super Landroidx/lifecycle/c2;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final a:Lpb/d;

.field public final b:Landroidx/lifecycle/x;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lpb/f;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/a;->a:Lpb/d;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/a;->b:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/a;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/w1;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/a;->a:Lpb/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/a;->b:Landroidx/lifecycle/x;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1}, Landroidx/lifecycle/o1;->c(Landroidx/lifecycle/w1;Lpb/d;Landroidx/lifecycle/x;)V

    :cond_0
    return-void
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 4

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 15
    iget-object v1, p0, Landroidx/lifecycle/a;->b:Landroidx/lifecycle/x;

    if-eqz v1, :cond_0

    .line 16
    iget-object v2, p0, Landroidx/lifecycle/a;->a:Lpb/d;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 18
    iget-object v3, p0, Landroidx/lifecycle/a;->c:Landroid/os/Bundle;

    .line 19
    invoke-static {v2, v1, v0, v3}, Landroidx/lifecycle/o1;->d(Lpb/d;Landroidx/lifecycle/x;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/m1;

    move-result-object v1

    .line 20
    iget-object v2, v1, Landroidx/lifecycle/m1;->x:Landroidx/lifecycle/k1;

    .line 21
    invoke-virtual {p0, v0, p1, v2}, Landroidx/lifecycle/a;->b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;

    move-result-object p1

    .line 22
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/w1;->addCloseable(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-object p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 24
    const-string v0, "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 25
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 3

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Landroidx/lifecycle/d2;->b:Lio/sentry/hints/j;

    invoke-virtual {p2, v0}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Landroidx/lifecycle/a;->a:Lpb/d;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 4
    iget-object p2, p0, Landroidx/lifecycle/a;->b:Landroidx/lifecycle/x;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    .line 5
    iget-object v2, p0, Landroidx/lifecycle/a;->c:Landroid/os/Bundle;

    .line 6
    invoke-static {v1, p2, v0, v2}, Landroidx/lifecycle/o1;->d(Lpb/d;Landroidx/lifecycle/x;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/m1;

    move-result-object p2

    .line 7
    iget-object v1, p2, Landroidx/lifecycle/m1;->x:Landroidx/lifecycle/k1;

    .line 8
    invoke-virtual {p0, v0, p1, v1}, Landroidx/lifecycle/a;->b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;

    move-result-object p1

    .line 9
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p1, v0, p2}, Landroidx/lifecycle/w1;->addCloseable(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-object p1

    .line 10
    :cond_0
    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object p2

    invoke-virtual {p0, v0, p1, p2}, Landroidx/lifecycle/a;->b(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
