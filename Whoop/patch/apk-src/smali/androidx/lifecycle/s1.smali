.class public final Landroidx/lifecycle/s1;
.super Landroidx/lifecycle/c2;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroidx/lifecycle/z1;

.field public final c:Landroid/os/Bundle;

.field public final d:Landroidx/lifecycle/x;

.field public final e:Lpb/d;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lpb/f;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lpb/f;->getSavedStateRegistry()Lpb/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/s1;->e:Lpb/d;

    invoke-interface {p2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/s1;->d:Landroidx/lifecycle/x;

    iput-object p3, p0, Landroidx/lifecycle/s1;->c:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/lifecycle/s1;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    sget-object p2, Landroidx/lifecycle/z1;->c:Landroidx/lifecycle/z1;

    if-nez p2, :cond_0

    new-instance p2, Landroidx/lifecycle/z1;

    invoke-direct {p2, p1}, Landroidx/lifecycle/z1;-><init>(Landroid/app/Application;)V

    sput-object p2, Landroidx/lifecycle/z1;->c:Landroidx/lifecycle/z1;

    :cond_0
    sget-object p1, Landroidx/lifecycle/z1;->c:Landroidx/lifecycle/z1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p1, Landroidx/lifecycle/z1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroidx/lifecycle/z1;-><init>(Landroid/app/Application;)V

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/s1;->b:Landroidx/lifecycle/z1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/w1;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/s1;->d:Landroidx/lifecycle/x;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/s1;->e:Lpb/d;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, v1, v0}, Landroidx/lifecycle/o1;->c(Landroidx/lifecycle/w1;Lpb/d;Landroidx/lifecycle/x;)V

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w1;
    .locals 6

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/s1;->d:Landroidx/lifecycle/x;

    if-eqz v0, :cond_5

    const-class v1, Landroidx/lifecycle/b;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    iget-object v2, p0, Landroidx/lifecycle/s1;->a:Landroid/app/Application;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    sget-object v3, Landroidx/lifecycle/t1;->a:Ljava/util/List;

    invoke-static {p1, v3}, Landroidx/lifecycle/t1;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    goto :goto_0

    :cond_0
    sget-object v3, Landroidx/lifecycle/t1;->b:Ljava/util/List;

    invoke-static {p1, v3}, Landroidx/lifecycle/t1;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_3

    if-eqz v2, :cond_1

    iget-object p2, p0, Landroidx/lifecycle/s1;->b:Landroidx/lifecycle/z1;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/z1;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p2, Landroidx/lifecycle/b2;->a:Landroidx/lifecycle/b2;

    if-nez p2, :cond_2

    new-instance p2, Landroidx/lifecycle/b2;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    sput-object p2, Landroidx/lifecycle/b2;->a:Landroidx/lifecycle/b2;

    :cond_2
    sget-object p2, Landroidx/lifecycle/b2;->a:Landroidx/lifecycle/b2;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lbi/g;->w(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v4, p0, Landroidx/lifecycle/s1;->e:Lpb/d;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, p0, Landroidx/lifecycle/s1;->c:Landroid/os/Bundle;

    invoke-static {v4, v0, p2, v5}, Landroidx/lifecycle/o1;->d(Lpb/d;Landroidx/lifecycle/x;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/m1;

    move-result-object p2

    iget-object v0, p2, Landroidx/lifecycle/m1;->x:Landroidx/lifecycle/k1;

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v3, v0}, Landroidx/lifecycle/t1;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w1;

    move-result-object p1

    goto :goto_1

    :cond_4
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v3, v0}, Landroidx/lifecycle/t1;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w1;

    move-result-object p1

    :goto_1
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p1, v0, p2}, Landroidx/lifecycle/w1;->addCloseable(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/s1;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 1

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/s1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 26
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;
    .locals 3

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroidx/lifecycle/d2;->b:Lio/sentry/hints/j;

    invoke-virtual {p2, v0}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 3
    sget-object v1, Landroidx/lifecycle/o1;->a:Lqt/e;

    invoke-virtual {p2, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 4
    sget-object v1, Landroidx/lifecycle/o1;->b:Lio/sentry/hints/j;

    invoke-virtual {p2, v1}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 5
    sget-object v0, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-virtual {p2, v0}, Ll8/c;->a(Ll8/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    .line 6
    const-class v1, Landroidx/lifecycle/b;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 7
    sget-object v2, Landroidx/lifecycle/t1;->a:Ljava/util/List;

    .line 8
    invoke-static {p1, v2}, Landroidx/lifecycle/t1;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    goto :goto_0

    .line 9
    :cond_0
    sget-object v2, Landroidx/lifecycle/t1;->b:Ljava/util/List;

    .line 10
    invoke-static {p1, v2}, Landroidx/lifecycle/t1;->a(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    .line 11
    iget-object v0, p0, Landroidx/lifecycle/s1;->b:Landroidx/lifecycle/z1;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/z1;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 12
    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object p2

    filled-new-array {v0, p2}, [Ljava/lang/Object;

    move-result-object p2

    .line 13
    invoke-static {p1, v2, p2}, Landroidx/lifecycle/t1;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    .line 14
    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/o1;->e(Ll8/c;)Landroidx/lifecycle/k1;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v2, p2}, Landroidx/lifecycle/t1;->b(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    .line 15
    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/s1;->d:Landroidx/lifecycle/x;

    if-eqz p2, :cond_4

    .line 16
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/s1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w1;

    move-result-object p1

    return-object p1

    .line 17
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
