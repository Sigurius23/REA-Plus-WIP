.class final Lil1/r$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil1/r;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lil1/v;",
        "result",
        "Lil1/r$b;",
        "internalState",
        "<anonymous>",
        "(Lil1/v;Lil1/r$b;)Lil1/v;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.HomeFeedDomainInteractor$interact$4"
    f = "HomeFeedDomainInteractor.kt"
    l = {
        0x96,
        0x97,
        0x9a,
        0x9c,
        0xa3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lil1/r;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lil1/r;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/r;",
            "Lq83/d<",
            "-",
            "Lil1/r$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lil1/r$i;->E:Lil1/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lil1/v;Lil1/r$b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/v;",
            "Lil1/r$b;",
            "Lq83/d<",
            "-",
            "Lil1/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lil1/r$i;

    iget-object v1, p0, Lil1/r$i;->E:Lil1/r;

    invoke-direct {v0, v1, p3}, Lil1/r$i;-><init>(Lil1/r;Lq83/d;)V

    iput-object p1, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object p2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lil1/r$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lil1/v;

    check-cast p2, Lil1/r$b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lil1/r$i;->f(Lil1/v;Lil1/r$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lil1/r$i;->y:Ljava/lang/Object;

    check-cast v1, Lil1/v;

    iget-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    check-cast v2, Lil1/r$b;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lil1/r$i;->x:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v8, :cond_2

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    iget-object v1, v0, Lil1/r$i;->w:Ljava/lang/Object;

    check-cast v1, Lxl1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v1, v0, Lil1/r$i;->w:Ljava/lang/Object;

    check-cast v1, Lxl1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_2
    iget-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    check-cast v4, Lxl1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    check-cast v4, Lxl1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_4
    iget-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    check-cast v4, Lxl1/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    instance-of v11, v4, Lil1/r$a$b;

    if-eqz v11, :cond_17

    iget-object v4, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v4}, Lil1/r;->g(Lil1/r;)Lxl1/b;

    move-result-object v13

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getJournalMetaData()Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/JournalMetaData;->getJournalEnabled()Z

    move-result v4

    move v14, v4

    goto :goto_0

    :cond_6
    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->c()Ljava/time/LocalDate;

    move-result-object v15

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getCycleMetaData()Lcom/whoop/home/domain/models/CycleMetaData;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/CycleMetaData;->getCycleId()J

    move-result-wide v16

    goto :goto_1

    :cond_7
    const-wide/16 v16, 0x0

    :goto_1
    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getJournalMetaData()Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/JournalMetaData;->getJournalCompleted()Z

    move-result v4

    move/from16 v18, v4

    goto :goto_2

    :cond_8
    move/from16 v18, v9

    :goto_2
    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getJournalMetaData()Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/JournalMetaData;->getDisplayCycleState()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    :cond_9
    const-string v4, ""

    :cond_a
    sget-object v11, Lxl1/a;->ADD_SLEEP:Lxl1/a;

    invoke-static {}, Lxl1/a;->values()[Lxl1/a;

    move-result-object v12

    array-length v5, v12

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_c

    aget-object v19, v12, v6

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v6, v6, 0x1

    const/4 v8, 0x3

    goto :goto_3

    :cond_c
    move-object/from16 v19, v10

    :goto_4
    if-nez v19, :cond_d

    move-object/from16 v19, v11

    :cond_d
    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getJournalMetaData()Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/JournalMetaData;->getShouldAutoPop()Z

    move-result v4

    move/from16 v20, v4

    goto :goto_5

    :cond_e
    const/16 v20, 0x0

    :goto_5
    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getJournalMetaData()Lcom/whoop/home/domain/models/JournalMetaData;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/whoop/home/domain/models/JournalMetaData;->getHasEnoughRecoveries()Z

    move-result v12

    move/from16 v21, v12

    goto :goto_6

    :cond_f
    const/16 v21, 0x0

    :goto_6
    invoke-virtual/range {v13 .. v21}, Lxl1/b;->a(ZLjava/time/LocalDate;JZLxl1/a;ZZ)Lxl1/c;

    move-result-object v4

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v5

    check-cast v5, Lil1/r$a$b;

    invoke-virtual {v5}, Lil1/r$a$b;->b()Lem1/r;

    move-result-object v5

    sget-object v6, Lem1/r;->PULL_TO_REFRESH:Lem1/r;

    if-eq v5, v6, :cond_10

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v5

    check-cast v5, Lil1/r$a$b;

    invoke-virtual {v5}, Lil1/r$a$b;->b()Lem1/r;

    move-result-object v5

    sget-object v6, Lem1/r;->OVERRIDE:Lem1/r;

    if-ne v5, v6, :cond_12

    :cond_10
    iget-object v5, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v5}, Lil1/r;->i(Lil1/r;)Lpn1/c;

    move-result-object v5

    iput-object v1, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    iput-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    iput v9, v0, Lil1/r$i;->x:I

    invoke-virtual {v5, v0}, Lpn1/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_11

    goto/16 :goto_c

    :cond_11
    :goto_7
    iget-object v5, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v5}, Lil1/r;->j(Lil1/r;)Lwm0/a;

    move-result-object v5

    sget-object v6, Lwm0/a;->d:Lwm0/a$a;

    invoke-virtual {v6, v10}, Lwm0/a$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v1, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    iput-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    iput v7, v0, Lil1/r$i;->x:I

    invoke-virtual {v5, v6, v0}, Lwm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_12

    goto/16 :goto_c

    :cond_12
    :goto_8
    iget-object v5, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v5}, Lil1/r;->k(Lil1/r;)Lct2/c;

    move-result-object v5

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v6

    check-cast v6, Lil1/r$a$b;

    invoke-virtual {v6}, Lil1/r$a$b;->c()Ljava/time/LocalDate;

    move-result-object v6

    iput-object v1, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    iput-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v0, Lil1/r$i;->x:I

    invoke-virtual {v5, v6, v0}, Lct2/c;->b(Ljava/time/LocalDate;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_13

    goto :goto_c

    :cond_13
    :goto_9
    iget-object v5, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v5}, Lil1/r;->c(Lil1/r;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    const-string v7, "my-journal-home-tile-loading-fix"

    invoke-interface {v6, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v7

    check-cast v7, Lil1/r$a$b;

    invoke-virtual {v7}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v7

    invoke-virtual {v5, v6, v7, v1}, Lil1/r;->p(ZLcom/whoop/home/domain/models/HomeBffFeedResponse;Lil1/v;)Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v1

    iput-object v10, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    iput-object v4, v0, Lil1/r$i;->w:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v0, Lil1/r$i;->x:I

    invoke-virtual {v5, v1, v0}, Lil1/r;->n(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_14

    goto :goto_c

    :cond_14
    move-object v1, v4

    :goto_a
    iget-object v4, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v4}, Lil1/r;->d(Lil1/r;)Ldp0/g;

    move-result-object v4

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v5

    check-cast v5, Lil1/r$a$b;

    invoke-virtual {v5}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v5

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Lcom/whoop/home/domain/models/HomeBffFeedResponse;->getMetadata()Lcom/whoop/home/domain/models/HomeResponseMetaData;

    move-result-object v5

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Lcom/whoop/home/domain/models/HomeResponseMetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    move-result-object v5

    goto :goto_b

    :cond_15
    move-object v5, v10

    :goto_b
    iput-object v10, v0, Lil1/r$i;->y:Ljava/lang/Object;

    iput-object v2, v0, Lil1/r$i;->z:Ljava/lang/Object;

    iput-object v1, v0, Lil1/r$i;->w:Ljava/lang/Object;

    const/4 v6, 0x5

    iput v6, v0, Lil1/r$i;->x:I

    invoke-interface {v4, v5, v0}, Ldp0/g;->q(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_16

    :goto_c
    return-object v3

    :cond_16
    :goto_d
    new-instance v3, Lil1/v$c;

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v4

    check-cast v4, Lil1/r$a$b;

    invoke-virtual {v4}, Lil1/r$a$b;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v5

    check-cast v5, Lil1/r$a$b;

    invoke-virtual {v5}, Lil1/r$a$b;->c()Ljava/time/LocalDate;

    move-result-object v5

    invoke-virtual {v2}, Lil1/r$b;->b()Lfm1/g;

    move-result-object v2

    invoke-virtual {v2}, Lfm1/g;->getIndex()I

    move-result v2

    invoke-direct {v3, v4, v5, v2, v1}, Lil1/v$c;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;)V

    return-object v3

    :cond_17
    instance-of v3, v4, Lil1/r$a$e;

    if-eqz v3, :cond_18

    new-instance v11, Lil1/v$d;

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$e;

    invoke-virtual {v1}, Lil1/r$a$e;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v12

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$e;

    invoke-virtual {v1}, Lil1/r$a$e;->c()Ljava/time/LocalDate;

    move-result-object v13

    invoke-virtual {v2}, Lil1/r$b;->b()Lfm1/g;

    move-result-object v1

    invoke-virtual {v1}, Lfm1/g;->getIndex()I

    move-result v14

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$e;

    invoke-virtual {v1}, Lil1/r$a$e;->b()Lem1/r;

    move-result-object v15

    const/16 v17, 0x10

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lil1/v$d;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILem1/r;Lxl1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11

    :cond_18
    instance-of v3, v4, Lil1/r$a$c;

    if-eqz v3, :cond_19

    sget-object v1, Lil1/v$b;->a:Lil1/v$b;

    return-object v1

    :cond_19
    instance-of v3, v4, Lil1/r$a$a;

    if-eqz v3, :cond_1b

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$a;

    invoke-virtual {v1}, Lil1/r$a$a;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v1

    if-nez v1, :cond_1a

    iget-object v1, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v1}, Lil1/r;->c(Lil1/r;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v3, "android-home-error-analytics"

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1a

    iget-object v1, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v1}, Lil1/r;->e(Lil1/r;)Lgl1/b;

    move-result-object v1

    invoke-virtual {v1}, Lgl1/b;->S()V

    :cond_1a
    new-instance v3, Lil1/v$a;

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$a;

    invoke-virtual {v1}, Lil1/r$a$a;->a()Lcom/whoop/home/domain/models/HomeBffFeedResponse;

    move-result-object v4

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$a;

    invoke-virtual {v1}, Lil1/r$a$a;->c()Ljava/time/LocalDate;

    move-result-object v5

    invoke-virtual {v2}, Lil1/r$b;->a()Lil1/r$a;

    move-result-object v1

    check-cast v1, Lil1/r$a$a;

    invoke-virtual {v1}, Lil1/r$a$a;->b()Z

    move-result v8

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v10}, Lil1/v$a;-><init>(Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1b
    sget-object v2, Lil1/r$a$d;->a:Lil1/r$a$d;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    instance-of v2, v1, Lil1/v$c;

    if-eqz v2, :cond_1c

    iget-object v2, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v2}, Lil1/r;->c(Lil1/r;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v2

    const-string v3, "home-redesign-android-refresh-fix"

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1c

    iget-object v2, v0, Lil1/r$i;->E:Lil1/r;

    invoke-static {v2}, Lil1/r;->h(Lil1/r;)Ltr2/n;

    move-result-object v2

    move-object v3, v1

    check-cast v3, Lil1/v$c;

    invoke-virtual {v3}, Lil1/v$c;->f()Lxl1/c;

    move-result-object v1

    invoke-virtual {v1}, Lxl1/c;->a()Z

    move-result v1

    const-string v4, "InternalAction is NoOp, previous result shouldShowJournal is "

    invoke-static {v4, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {v2, v1, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v7, Lxl1/c;

    const/4 v1, 0x3

    invoke-direct {v7, v4, v4, v1, v10}, Lxl1/c;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lil1/v$c;->b(Lil1/v$c;Lcom/whoop/home/domain/models/HomeBffFeedResponse;Ljava/time/LocalDate;ILxl1/c;ILjava/lang/Object;)Lil1/v$c;

    move-result-object v1

    :cond_1c
    return-object v1

    :cond_1d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
