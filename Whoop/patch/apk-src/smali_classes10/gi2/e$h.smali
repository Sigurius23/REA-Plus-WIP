.class final Lgi2/e$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgi2/e;->j(Lgi2/b$i;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.strava.domain.StravaInteractor$upsertSettings$2"
    f = "StravaInteractor.kt"
    l = {
        0x23,
        0x32
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lgi2/e;

.field final synthetic y:Lgi2/b$i;


# direct methods
.method public constructor <init>(Lgi2/e;Lgi2/b$i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgi2/e;",
            "Lgi2/b$i;",
            "Lq83/d<",
            "-",
            "Lgi2/e$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgi2/e$h;->x:Lgi2/e;

    iput-object p2, p0, Lgi2/e$h;->y:Lgi2/b$i;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lgi2/e$h;

    iget-object v1, p0, Lgi2/e$h;->x:Lgi2/e;

    iget-object v2, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-direct {v0, v1, v2, p1}, Lgi2/e$h;-><init>(Lgi2/e;Lgi2/b$i;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lgi2/e$h;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lgi2/e$h;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lgi2/e$h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lgi2/e$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lgi2/e$h;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lgi2/e$h;->x:Lgi2/e;

    invoke-static {p1}, Lgi2/e;->c(Lgi2/e;)Lcom/whoop/strava/domain/StravaApi;

    move-result-object p1

    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->d()Z

    move-result v5

    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->c()Z

    move-result v6

    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->f()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->c()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_3
    move-object v8, v1

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lji2/c;

    invoke-virtual {v9}, Lji2/c;->h()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v4, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v1, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lji2/c;

    invoke-virtual {v8}, Lji2/c;->e()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :goto_2
    iget-object v1, p0, Lgi2/e$h;->y:Lgi2/b$i;

    invoke-virtual {v1}, Lgi2/b$i;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    new-instance v4, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;

    invoke-direct/range {v4 .. v9}, Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;-><init>(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V

    iput v3, p0, Lgi2/e$h;->w:I

    invoke-interface {p1, v4, p0}, Lcom/whoop/strava/domain/StravaApi;->upsertSettings(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    iget-object p1, p0, Lgi2/e$h;->x:Lgi2/e;

    invoke-static {p1}, Lgi2/e;->c(Lgi2/e;)Lcom/whoop/strava/domain/StravaApi;

    move-result-object p1

    iput v2, p0, Lgi2/e$h;->w:I

    invoke-interface {p1, p0}, Lcom/whoop/strava/domain/StravaApi;->getBffSettings(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_4
    return-object v0

    :cond_8
    return-object p1
.end method
