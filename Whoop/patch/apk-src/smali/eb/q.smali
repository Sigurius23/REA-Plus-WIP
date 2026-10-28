.class public final Leb/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/g0;
.implements Landroidx/lifecycle/f2;
.implements Landroidx/lifecycle/r;
.implements Lpb/f;


# instance fields
.field public final E:Leb/b0;

.field public final F:Ljava/lang/String;

.field public final G:Landroid/os/Bundle;

.field public final H:Landroidx/lifecycle/i0;

.field public final I:Lpb/e;

.field public J:Z

.field public final K:Ll83/p;

.field public L:Landroidx/lifecycle/w;

.field public final M:Landroidx/lifecycle/s1;

.field public final w:Landroid/content/Context;

.field public x:Leb/n0;

.field public final y:Landroid/os/Bundle;

.field public z:Landroidx/lifecycle/w;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/q;->w:Landroid/content/Context;

    iput-object p2, p0, Leb/q;->x:Leb/n0;

    iput-object p3, p0, Leb/q;->y:Landroid/os/Bundle;

    iput-object p4, p0, Leb/q;->z:Landroidx/lifecycle/w;

    iput-object p5, p0, Leb/q;->E:Leb/b0;

    iput-object p6, p0, Leb/q;->F:Ljava/lang/String;

    iput-object p7, p0, Leb/q;->G:Landroid/os/Bundle;

    new-instance p1, Landroidx/lifecycle/i0;

    invoke-direct {p1, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object p1, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    new-instance p1, Lrb/a;

    new-instance p2, Lm83/p;

    const/16 p3, 0xa

    invoke-direct {p2, p0, p3}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p0, p2}, Lrb/a;-><init>(Lpb/f;Lm83/p;)V

    new-instance p2, Lpb/e;

    invoke-direct {p2, p1}, Lpb/e;-><init>(Lrb/a;)V

    iput-object p2, p0, Leb/q;->I:Lpb/e;

    new-instance p1, Leb/p;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Leb/p;-><init>(Leb/q;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    new-instance p2, Leb/p;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Leb/p;-><init>(Leb/q;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Leb/q;->K:Ll83/p;

    sget-object p2, Landroidx/lifecycle/w;->x:Landroidx/lifecycle/w;

    iput-object p2, p0, Leb/q;->L:Landroidx/lifecycle/w;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/s1;

    iput-object p1, p0, Leb/q;->M:Landroidx/lifecycle/s1;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Leb/q;->y:Landroid/os/Bundle;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v1
.end method

.method public final b()Landroidx/lifecycle/k1;
    .locals 1

    iget-object v0, p0, Leb/q;->K:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k1;

    return-object v0
.end method

.method public final c(Landroidx/lifecycle/w;)V
    .locals 1

    const-string v0, "maxState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Leb/q;->L:Landroidx/lifecycle/w;

    invoke-virtual {p0}, Leb/q;->d()V

    return-void
.end method

.method public final d()V
    .locals 3

    iget-boolean v0, p0, Leb/q;->J:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Leb/q;->I:Lpb/e;

    iget-object v1, v0, Lpb/e;->a:Lrb/a;

    invoke-virtual {v1}, Lrb/a;->a()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Leb/q;->J:Z

    iget-object v1, p0, Leb/q;->E:Leb/b0;

    if-eqz v1, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/o1;->f(Lpb/f;)V

    :cond_0
    iget-object v1, p0, Leb/q;->G:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lpb/e;->a(Landroid/os/Bundle;)V

    :cond_1
    iget-object v0, p0, Leb/q;->z:Landroidx/lifecycle/w;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Leb/q;->L:Landroidx/lifecycle/w;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    iget-object v2, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Leb/q;->z:Landroidx/lifecycle/w;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    return-void

    :cond_2
    iget-object v0, p0, Leb/q;->L:Landroidx/lifecycle/w;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->i(Landroidx/lifecycle/w;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    instance-of v1, p1, Leb/q;

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    check-cast p1, Leb/q;

    iget-object v1, p1, Leb/q;->y:Landroid/os/Bundle;

    iget-object v2, p1, Leb/q;->F:Ljava/lang/String;

    iget-object v3, p0, Leb/q;->F:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Leb/q;->x:Leb/n0;

    iget-object v3, p1, Leb/q;->x:Leb/n0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object v3, p1, Leb/q;->H:Landroidx/lifecycle/i0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Leb/q;->I:Lpb/e;

    iget-object v2, v2, Lpb/e;->b:Lpb/d;

    iget-object p1, p1, Leb/q;->I:Lpb/e;

    iget-object p1, p1, Lpb/e;->b:Lpb/d;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Leb/q;->y:Landroid/os/Bundle;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v1, :cond_3

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    return v0
.end method

.method public final getDefaultViewModelCreationExtras()Ll8/c;
    .locals 4

    new-instance v0, Ll8/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll8/e;-><init>(I)V

    const/4 v1, 0x0

    iget-object v2, p0, Leb/q;->w:Landroid/content/Context;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    instance-of v3, v2, Landroid/app/Application;

    if-eqz v3, :cond_1

    move-object v1, v2

    check-cast v1, Landroid/app/Application;

    :cond_1
    iget-object v2, v0, Ll8/c;->a:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    sget-object v3, Landroidx/lifecycle/z1;->d:Lio/sentry/hints/j;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Landroidx/lifecycle/o1;->a:Lqt/e;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/o1;->b:Lio/sentry/hints/j;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v3, Landroidx/lifecycle/o1;->c:Lqt/e;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v0
.end method

.method public final getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;
    .locals 1

    iget-object v0, p0, Leb/q;->M:Landroidx/lifecycle/s1;

    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/x;
    .locals 1

    iget-object v0, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lpb/d;
    .locals 1

    iget-object v0, p0, Leb/q;->I:Lpb/e;

    iget-object v0, v0, Lpb/e;->b:Lpb/d;

    return-object v0
.end method

.method public final getViewModelStore()Landroidx/lifecycle/e2;
    .locals 3

    iget-boolean v0, p0, Leb/q;->J:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    iget-object v0, v0, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v1, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Leb/q;->E:Leb/b0;

    if-eqz v0, :cond_1

    const-string v1, "backStackEntryId"

    iget-object v2, p0, Leb/q;->F:Ljava/lang/String;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Leb/b0;->w:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/e2;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/lifecycle/e2;

    invoke-direct {v1}, Landroidx/lifecycle/e2;-><init>()V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels after the NavBackStackEntry is destroyed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot access the NavBackStackEntry\'s ViewModels until it is added to the NavController\'s back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state)."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Leb/q;->x:Leb/n0;

    invoke-virtual {v1}, Leb/n0;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Leb/q;->y:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Leb/q;->H:Landroidx/lifecycle/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Leb/q;->I:Lpb/e;

    iget-object v1, v1, Lpb/e;->b:Lpb/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Leb/q;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Leb/q;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/q;->x:Leb/n0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sb.toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
