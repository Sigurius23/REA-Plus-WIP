.class public final Landroidx/lifecycle/i0;
.super Landroidx/lifecycle/x;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public c:Lu/a;

.field public d:Landroidx/lifecycle/w;

.field public final e:Ljava/lang/ref/WeakReference;

.field public f:I

.field public g:Z

.field public h:Z

.field public final i:Ljava/util/ArrayList;

.field public final j:Lec3/h2;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/g0;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 8
    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;Z)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/g0;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/x;-><init>()V

    .line 2
    iput-boolean p2, p0, Landroidx/lifecycle/i0;->b:Z

    .line 3
    new-instance p2, Lu/a;

    invoke-direct {p2}, Lu/a;-><init>()V

    iput-object p2, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    .line 4
    sget-object p2, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    iput-object p2, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/i0;->i:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/i0;->e:Ljava/lang/ref/WeakReference;

    .line 7
    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Landroidx/lifecycle/i0;->j:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/f0;)V
    .locals 9

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/i0;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    :goto_0
    new-instance v0, Landroidx/lifecycle/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v2, Landroidx/lifecycle/k0;->a:Ljava/util/HashMap;

    instance-of v2, p1, Landroidx/lifecycle/e0;

    instance-of v3, p1, Landroidx/lifecycle/DefaultLifecycleObserver;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    new-instance v2, Landroidx/lifecycle/l;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/DefaultLifecycleObserver;

    move-object v8, p1

    check-cast v8, Landroidx/lifecycle/e0;

    invoke-direct {v2, v3, v8}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/e0;)V

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    new-instance v2, Landroidx/lifecycle/l;

    move-object v3, p1

    check-cast v3, Landroidx/lifecycle/DefaultLifecycleObserver;

    invoke-direct {v2, v3, v5}, Landroidx/lifecycle/l;-><init>(Landroidx/lifecycle/DefaultLifecycleObserver;Landroidx/lifecycle/e0;)V

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroidx/lifecycle/e0;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/k0;->b(Ljava/lang/Class;)I

    move-result v3

    if-ne v3, v4, :cond_6

    sget-object v3, Landroidx/lifecycle/k0;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v7, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v8, v3, [Landroidx/lifecycle/q;

    if-gtz v3, :cond_4

    new-instance v2, Landroidx/lifecycle/g;

    invoke-direct {v2, v8}, Landroidx/lifecycle/g;-><init>([Landroidx/lifecycle/q;)V

    goto :goto_1

    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/k0;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/f0;)V

    throw v5

    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/k0;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/f0;)V

    throw v5

    :cond_6
    new-instance v2, Landroidx/lifecycle/c1;

    invoke-direct {v2, p1}, Landroidx/lifecycle/c1;-><init>(Landroidx/lifecycle/f0;)V

    :goto_1
    iput-object v2, v0, Landroidx/lifecycle/h0;->b:Landroidx/lifecycle/e0;

    iput-object v1, v0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    invoke-virtual {v1, p1, v0}, Lu/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/h0;

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    iget-object v1, p0, Landroidx/lifecycle/i0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/g0;

    if-nez v1, :cond_8

    :goto_2
    return-void

    :cond_8
    iget v2, p0, Landroidx/lifecycle/i0;->f:I

    if-nez v2, :cond_9

    iget-boolean v2, p0, Landroidx/lifecycle/i0;->g:Z

    if-eqz v2, :cond_a

    :cond_9
    move v6, v7

    :cond_a
    invoke-virtual {p0, p1}, Landroidx/lifecycle/i0;->e(Landroidx/lifecycle/f0;)Landroidx/lifecycle/w;

    move-result-object v2

    iget v3, p0, Landroidx/lifecycle/i0;->f:I

    add-int/2addr v3, v7

    iput v3, p0, Landroidx/lifecycle/i0;->f:I

    :goto_3
    iget-object v3, v0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_f

    iget-object v2, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v2, v2, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v3, p0, Landroidx/lifecycle/i0;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Landroidx/lifecycle/v;->Companion:Landroidx/lifecycle/t;

    iget-object v8, v0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "state"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eq v2, v7, :cond_d

    if-eq v2, v4, :cond_c

    const/4 v8, 0x3

    if-eq v2, v8, :cond_b

    move-object v2, v5

    goto :goto_4

    :cond_b
    sget-object v2, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    goto :goto_4

    :cond_c
    sget-object v2, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    goto :goto_4

    :cond_d
    sget-object v2, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    :goto_4
    if-eqz v2, :cond_e

    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/h0;->a(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v7

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/i0;->e(Landroidx/lifecycle/f0;)Landroidx/lifecycle/w;

    move-result-object v2

    goto :goto_3

    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "no event up from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    if-nez v6, :cond_10

    invoke-virtual {p0}, Landroidx/lifecycle/i0;->j()V

    :cond_10
    iget p1, p0, Landroidx/lifecycle/i0;->f:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/i0;->f:I

    return-void
.end method

.method public final b()Landroidx/lifecycle/w;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    return-object v0
.end method

.method public final d(Landroidx/lifecycle/f0;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/i0;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    invoke-virtual {v0, p1}, Lu/a;->d(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e(Landroidx/lifecycle/f0;)Landroidx/lifecycle/w;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v0, v0, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu/c;

    iget-object p1, p1, Lu/c;->z:Lu/c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lu/c;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/h0;

    iget-object p1, p1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/i0;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/w;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    const-string v1, "state1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    return-object v2

    :cond_4
    return-object p1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/lifecycle/i0;->b:Z

    if-eqz v0, :cond_1

    invoke-static {}, Lt/a;->V()Lt/a;

    move-result-object v0

    iget-object v0, v0, Lt/a;->a:Lt/b;

    invoke-virtual {v0}, Lt/b;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final g(Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/i0;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/i0;->h(Landroidx/lifecycle/w;)V

    return-void
.end method

.method public final h(Landroidx/lifecycle/w;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    if-ne v0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/i0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    const-string v2, "current"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "next"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    if-ne v1, v2, :cond_2

    sget-object v2, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "State must be at least \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\' to be moved to \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' in component "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    sget-object v2, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-ne v1, v2, :cond_4

    if-ne v1, p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "State is \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' and cannot be moved to `"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "` in component "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_1
    iput-object p1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    iget-boolean p1, p0, Landroidx/lifecycle/i0;->g:Z

    const/4 v0, 0x1

    if-nez p1, :cond_7

    iget p1, p0, Landroidx/lifecycle/i0;->f:I

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    iput-boolean v0, p0, Landroidx/lifecycle/i0;->g:Z

    invoke-virtual {p0}, Landroidx/lifecycle/i0;->j()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/i0;->g:Z

    iget-object p1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    if-ne p1, v2, :cond_6

    new-instance p1, Lu/a;

    invoke-direct {p1}, Lu/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    :cond_6
    :goto_2
    return-void

    :cond_7
    :goto_3
    iput-boolean v0, p0, Landroidx/lifecycle/i0;->h:Z

    return-void
.end method

.method public final i(Landroidx/lifecycle/w;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/i0;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/i0;->h(Landroidx/lifecycle/w;)V

    return-void
.end method

.method public final j()V
    .locals 8

    iget-object v0, p0, Landroidx/lifecycle/i0;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/g0;

    if-eqz v0, :cond_b

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget v2, v1, Lu/f;->z:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lu/f;->w:Lu/c;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, v1, Lu/c;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/h0;

    iget-object v1, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v2, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v2, v2, Lu/f;->x:Lu/c;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Lu/c;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/h0;

    iget-object v2, v2, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    if-ne v1, v2, :cond_2

    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/i0;->h:Z

    iget-object v0, p0, Landroidx/lifecycle/i0;->j:Lec3/h2;

    iget-object v1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void

    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/i0;->h:Z

    iget-object v1, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    iget-object v2, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v2, v2, Lu/f;->w:Lu/c;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, v2, Lu/c;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/h0;

    iget-object v2, v2, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x1

    iget-object v3, p0, Landroidx/lifecycle/i0;->i:Ljava/util/ArrayList;

    if-gez v1, :cond_5

    iget-object v1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    new-instance v4, Lu/b;

    iget-object v5, v1, Lu/f;->x:Lu/c;

    iget-object v6, v1, Lu/f;->w:Lu/c;

    const/4 v7, 0x1

    invoke-direct {v4, v5, v6, v7}, Lu/b;-><init>(Lu/c;Lu/c;I)V

    iget-object v1, v1, Lu/f;->y:Ljava/util/WeakHashMap;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v4}, Lu/b;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Landroidx/lifecycle/i0;->h:Z

    if-nez v1, :cond_5

    invoke-virtual {v4}, Lu/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/f0;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/h0;

    :goto_1
    iget-object v6, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v7, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-lez v6, :cond_3

    iget-boolean v6, p0, Landroidx/lifecycle/i0;->h:Z

    if-nez v6, :cond_3

    iget-object v6, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v6, v6, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    sget-object v6, Landroidx/lifecycle/v;->Companion:Landroidx/lifecycle/t;

    iget-object v7, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/w;)Landroidx/lifecycle/v;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Landroidx/lifecycle/v;->a()Landroidx/lifecycle/w;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v6}, Landroidx/lifecycle/h0;->a(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object v1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v1, v1, Lu/f;->x:Lu/c;

    iget-boolean v4, p0, Landroidx/lifecycle/i0;->h:Z

    if-nez v4, :cond_0

    if-eqz v1, :cond_0

    iget-object v4, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    iget-object v1, v1, Lu/c;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/h0;

    iget-object v1, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v4, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lu/d;

    invoke-direct {v4, v1}, Lu/d;-><init>(Lu/f;)V

    iget-object v1, v1, Lu/f;->y:Ljava/util/WeakHashMap;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {v4}, Lu/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/lifecycle/i0;->h:Z

    if-nez v1, :cond_0

    invoke-virtual {v4}, Lu/d;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/f0;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/h0;

    :goto_2
    iget-object v6, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    iget-object v7, p0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v6

    if-gez v6, :cond_6

    iget-boolean v6, p0, Landroidx/lifecycle/i0;->h:Z

    if-nez v6, :cond_6

    iget-object v6, p0, Landroidx/lifecycle/i0;->c:Lu/a;

    iget-object v6, v6, Lu/a;->E:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v6, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v6, Landroidx/lifecycle/v;->Companion:Landroidx/lifecycle/t;

    iget-object v7, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "state"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eq v6, v2, :cond_9

    const/4 v7, 0x2

    if-eq v6, v7, :cond_8

    const/4 v7, 0x3

    if-eq v6, v7, :cond_7

    const/4 v6, 0x0

    goto :goto_3

    :cond_7
    sget-object v6, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    goto :goto_3

    :cond_8
    sget-object v6, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    goto :goto_3

    :cond_9
    sget-object v6, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    :goto_3
    if-eqz v6, :cond_a

    invoke-virtual {v1, v0, v6}, Landroidx/lifecycle/h0;->a(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v2

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/h0;->a:Landroidx/lifecycle/w;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
