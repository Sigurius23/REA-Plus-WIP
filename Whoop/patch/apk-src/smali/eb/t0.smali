.class public Leb/t0;
.super Leb/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/i1;"
    }
.end annotation

.annotation runtime Leb/h1;
    value = "navigation"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0017\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Leb/t0;",
        "Leb/i1;",
        "Leb/r0;",
        "navigation-common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final c:Leb/j1;


# direct methods
.method public constructor <init>(Leb/j1;)V
    .locals 1

    const-string v0, "navigatorProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/t0;->c:Leb/j1;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Leb/n0;
    .locals 1

    invoke-virtual {p0}, Leb/t0;->k()Leb/r0;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/util/List;Leb/x0;)V
    .locals 6

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/q;

    iget-object v1, v0, Leb/q;->x:Leb/n0;

    const-string v2, "null cannot be cast to non-null type androidx.navigation.NavGraph"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Leb/r0;

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget v0, v1, Leb/r0;->M:I

    iget-object v3, v1, Leb/r0;->O:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "no start destination defined via app:startDestination for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Leb/r0;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    const/4 v0, 0x0

    invoke-virtual {v1, v3, v0}, Leb/r0;->q(Ljava/lang/String;Z)Leb/n0;

    move-result-object v0

    goto :goto_2

    :cond_2
    iget-object v4, v1, Leb/r0;->L:La0/g1;

    invoke-virtual {v4, v0}, La0/g1;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/n0;

    :goto_2
    if-nez v0, :cond_5

    iget-object p1, v1, Leb/r0;->N:Ljava/lang/String;

    if-nez p1, :cond_4

    iget-object p1, v1, Leb/r0;->O:Ljava/lang/String;

    if-nez p1, :cond_3

    iget p1, v1, Leb/r0;->M:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    :cond_3
    iput-object p1, v1, Leb/r0;->N:Ljava/lang/String;

    :cond_4
    iget-object p1, v1, Leb/r0;->N:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "navigation destination "

    const-string v1, " is not a direct child of this NavGraph"

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    iget-object v1, v0, Leb/n0;->G:Ljava/util/LinkedHashMap;

    if-eqz v3, :cond_a

    iget-object v4, v0, Leb/n0;->I:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {v0, v3}, Leb/n0;->l(Ljava/lang/String;)Leb/l0;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v3, v3, Leb/l0;->x:Landroid/os/Bundle;

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v4, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v3, Landroid/os/Bundle;

    if-eqz v3, :cond_7

    invoke-virtual {v4, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_7
    iput-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_8
    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    new-instance v3, Lb3/t;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lb3/t;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v1, v3}, Lpf/c;->G(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Cannot navigate to startDestination "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ". Missing required arguments ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x5d

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    :goto_4
    iget-object v1, p0, Leb/t0;->c:Leb/j1;

    iget-object v3, v0, Leb/n0;->w:Ljava/lang/String;

    invoke-virtual {v1, v3}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v1

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v3

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    iget-object v3, v3, Leb/t;->h:Leb/a0;

    iget-object v4, v3, Leb/a0;->a:Landroid/content/Context;

    invoke-virtual {v3}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v5

    iget-object v3, v3, Leb/a0;->q:Leb/b0;

    invoke-static {v4, v0, v2, v5, v3}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0, p2}, Leb/i1;->d(Ljava/util/List;Leb/x0;)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public k()Leb/r0;
    .locals 1

    new-instance v0, Leb/r0;

    invoke-direct {v0, p0}, Leb/r0;-><init>(Leb/t0;)V

    return-object v0
.end method
