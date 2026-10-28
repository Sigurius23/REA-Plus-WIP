.class final Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/SportsRepository;->getSports()Lxg3/g;
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
    c = "com.whoop.data.repositories.SportsRepository$getSports$1$job$1"
    f = "SportsRepository.kt"
    l = {
        0x1d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $it:Lxg3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/q;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/SportsRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/SportsRepository;",
            "Lxg3/q;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->$it:Lxg3/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    iget-object v1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->$it:Lxg3/q;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;-><init>(Lcom/whoop/data/repositories/SportsRepository;Lxg3/q;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v3, p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SportsRepository;->access$getUserContext$p(Lcom/whoop/data/repositories/SportsRepository;)Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->f()Lcom/whoop/domain/model/User;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "US"

    :cond_3
    :try_start_1
    iget-object v1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/SportsRepository;->getActivityServiceApi()Lcom/whoop/service/network/ActivityServiceApi;

    move-result-object v1

    iput-object v2, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->label:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/service/network/ActivityServiceApi;->getSports(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object p1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/SportsRepository;->access$getLog$p(Lcom/whoop/data/repositories/SportsRepository;)Ltr2/n;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v4, "Failed to fetch sports"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->this$0:Lcom/whoop/data/repositories/SportsRepository;

    iget-object v1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->$it:Lxg3/q;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/remote/domain/dto/SportDto;

    :try_start_2
    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/SportDto;->toSport()Lcom/whoop/service/network/model/Sport;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    invoke-static {v0}, Lcom/whoop/data/repositories/SportsRepository;->access$getLog$p(Lcom/whoop/data/repositories/SportsRepository;)Ltr2/n;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Failed to convert sport "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " to domain model"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    invoke-interface {v4, v5, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v4, v2

    :goto_4
    if-eqz v4, :cond_5

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lcom/whoop/data/repositories/SportsRepository$getSports$1$job$1;->$it:Lxg3/q;

    check-cast p1, Lch3/w0;

    invoke-virtual {p1, v3}, Lch3/w0;->d(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
