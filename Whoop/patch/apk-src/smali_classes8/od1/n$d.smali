.class final Lod1/n$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod1/n;->g(Ln82/a;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "Lha0/d;",
        "allActivities",
        "Lha0/h;",
        "recentActivitiesList",
        "Lod1/i$a;",
        "<anonymous>",
        "(Ljava/util/List;Ljava/util/List;)Lod1/i$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.domain.SelectActivityTypeInteractor$loadActivities$2"
    f = "SelectActivityTypeInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ln82/a;

.field final synthetic F:Z

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lod1/n;


# direct methods
.method public constructor <init>(Lod1/n;Ln82/a;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/n;",
            "Ln82/a;",
            "Z",
            "Lq83/d<",
            "-",
            "Lod1/n$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lod1/n$d;->z:Lod1/n;

    iput-object p2, p0, Lod1/n$d;->E:Ln82/a;

    iput-boolean p3, p0, Lod1/n$d;->F:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lha0/d;",
            ">;",
            "Ljava/util/List<",
            "Lha0/h;",
            ">;",
            "Lq83/d<",
            "-",
            "Lod1/i$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lod1/n$d;

    iget-object v1, p0, Lod1/n$d;->z:Lod1/n;

    iget-object v2, p0, Lod1/n$d;->E:Ln82/a;

    iget-boolean v3, p0, Lod1/n$d;->F:Z

    invoke-direct {v0, v1, v2, v3, p3}, Lod1/n$d;-><init>(Lod1/n;Ln82/a;ZLq83/d;)V

    iput-object p1, v0, Lod1/n$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lod1/n$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lod1/n$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lod1/n$d;->f(Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lod1/n$d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lod1/n$d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lod1/n$d;->w:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lha0/d;

    invoke-virtual {v3}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v3

    sget-object v4, Lcom/whoop/addactivity/network/model/ScoreType;->WEIGHTLIFTING_MSK:Lcom/whoop/addactivity/network/model/ScoreType;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lha0/d;

    new-instance v4, Lod1/a;

    invoke-virtual {v3}, Lha0/d;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lha0/d;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lha0/d;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v3

    invoke-direct {v4, v5, v6, v7, v3}, Lod1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-boolean p1, p0, Lod1/n$d;->F:Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lod1/a;

    invoke-static {v5, p1}, Lod1/o;->e(Lod1/a;Z)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    check-cast v1, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lha0/h;

    invoke-virtual {v3}, Lha0/h;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v5

    sget-object v6, Lcom/whoop/addactivity/network/model/ScoreType;->WEIGHTLIFTING_MSK:Lcom/whoop/addactivity/network/model/ScoreType;

    if-eq v5, v6, :cond_5

    invoke-virtual {v3}, Lha0/h;->f()Ljava/lang/String;

    move-result-object v5

    const-string v6, "increase_alertness"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-virtual {v3}, Lha0/h;->f()Ljava/lang/String;

    move-result-object v3

    const-string v5, "increase_relaxation"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lha0/h;

    new-instance v2, Lod1/a;

    invoke-virtual {v1}, Lha0/h;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lha0/h;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lha0/h;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lha0/h;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v1

    invoke-direct {v2, v3, v5, v6, v1}, Lod1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lod1/n$d;->z:Lod1/n;

    iget-object v1, p0, Lod1/n$d;->E:Ln82/a;

    invoke-static {v0, v1}, Lod1/o;->c(Ljava/util/List;Ln82/a;)Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Lod1/n;->f(Lod1/n;Ljava/util/List;)V

    new-instance v3, Lod1/i$a;

    iget-object p1, p0, Lod1/n$d;->E:Ln82/a;

    invoke-static {v0, p1}, Lod1/o;->c(Ljava/util/List;Ln82/a;)Ljava/util/List;

    move-result-object v5

    iget-object v7, p0, Lod1/n$d;->E:Ln82/a;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Lod1/i$a;-><init>(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
