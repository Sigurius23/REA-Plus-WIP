.class final Lia0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lia0/a;->c(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "Lha0/d;",
        "<anonymous>",
        "()Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$fetchAllActivities$response$1"
    f = "ActivityTypesRepository.kt"
    l = {
        0x43
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lia0/a;


# direct methods
.method public constructor <init>(Lia0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lia0/a;",
            "Lq83/d<",
            "-",
            "Lia0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lia0/a$b;->x:Lia0/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lia0/a$b;

    iget-object v1, p0, Lia0/a$b;->x:Lia0/a;

    invoke-direct {v0, v1, p1}, Lia0/a$b;-><init>(Lia0/a;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lia0/a$b;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lha0/d;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lia0/a$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lia0/a$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lia0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lia0/a$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lia0/a$b;->x:Lia0/a;

    invoke-static {p1}, Lia0/a;->b(Lia0/a;)Lcom/whoop/service/network/ActivitiesApi;

    move-result-object p1

    iput v2, p0, Lia0/a$b;->w:I

    invoke-interface {p1, p0}, Lcom/whoop/service/network/ActivitiesApi;->getActivities(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/addactivity/network/model/Activity;

    new-instance v2, Lha0/d;

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getInternalName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getDeleted()Z

    move-result v6

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getCategory()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getScoreType()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/addactivity/network/model/Activity;->getHasGps()Z

    move-result v9

    invoke-direct/range {v2 .. v9}, Lha0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/addactivity/network/model/ScoreType;Z)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method
