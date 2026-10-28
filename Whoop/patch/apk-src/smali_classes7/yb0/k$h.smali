.class final Lyb0/k$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyb0/k;->e1(Lwb0/i;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersScreenKt$EditBiomarkersScreen$6$1"
    f = "EditBiomarkersScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lwb0/i;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLwb0/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lwb0/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lyb0/k$h;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lyb0/k$h;->x:Z

    iput-object p2, p0, Lyb0/k$h;->y:Lwb0/i;

    iput-object p3, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lyb0/k$h;->E:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyb0/k$h;

    iget-boolean v1, p0, Lyb0/k$h;->x:Z

    iget-object v2, p0, Lyb0/k$h;->y:Lwb0/i;

    iget-object v3, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lyb0/k$h;->E:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lyb0/k$h;-><init>(ZLwb0/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lyb0/k$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyb0/k$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyb0/k$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyb0/k$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lyb0/k$h;->w:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lyb0/k$h;->x:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast p1, Lwb0/i$e;

    invoke-virtual {p1}, Lwb0/i$e;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v0, Lwb0/i$e;

    invoke-virtual {v0}, Lwb0/i$e;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v0, Lwb0/i$e;

    invoke-virtual {v0}, Lwb0/i$e;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object p1, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lkd0/a$d1;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v7, v1}, Lkd0/a$d1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast p1, Lwb0/i$e;

    invoke-virtual {p1}, Lwb0/i$e;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lkd0/a$k;

    iget-object v1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v1, Lwb0/i$e;

    invoke-virtual {v1}, Lwb0/i$e;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v2, Lwb0/i$e;

    invoke-virtual {v2}, Lwb0/i$e;->c()Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkd0/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast p1, Lwb0/i$e;

    invoke-virtual {p1}, Lwb0/i$e;->d()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lkd0/a$n;

    iget-object v1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v1, Lwb0/i$e;

    invoke-virtual {v1}, Lwb0/i$e;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v2, Lwb0/i$e;

    invoke-virtual {v2}, Lwb0/i$e;->d()Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkd0/a$n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast p1, Lwb0/i$e;

    invoke-virtual {p1}, Lwb0/i$e;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lyb0/k$h;->z:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lkd0/a$m;

    iget-object v1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v1, Lwb0/i$e;

    invoke-virtual {v1}, Lwb0/i$e;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v2, Lwb0/i$e;

    invoke-virtual {v2}, Lwb0/i$e;->b()Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lkd0/a$m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    iget-object p1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast p1, Lwb0/i$e;

    invoke-virtual {p1}, Lwb0/i$e;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lyb0/k$h;->E:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lvb0/a$c;

    iget-object v1, p0, Lyb0/k$h;->y:Lwb0/i;

    check-cast v1, Lwb0/i$e;

    invoke-virtual {v1}, Lwb0/i$e;->e()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lvb0/a$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
