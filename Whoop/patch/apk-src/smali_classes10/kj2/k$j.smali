.class final Lkj2/k$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkj2/k;->z(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
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
        "Lkj2/c$b;",
        "stateAction",
        "Lca2/a;",
        "syncState",
        "<anonymous>",
        "(Lkj2/c$b;Lca2/a;)Lkj2/c$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshStateFlow$2"
    f = "StressMonitorInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkj2/k;


# direct methods
.method public constructor <init>(Lkj2/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/k;",
            "Lq83/d<",
            "-",
            "Lkj2/k$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lkj2/k$j;->z:Lkj2/k;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lkj2/c$b;Lca2/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkj2/c$b;",
            "Lca2/a;",
            "Lq83/d<",
            "-",
            "Lkj2/c$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lkj2/k$j;

    iget-object v1, p0, Lkj2/k$j;->z:Lkj2/k;

    invoke-direct {v0, v1, p3}, Lkj2/k$j;-><init>(Lkj2/k;Lq83/d;)V

    iput-object p1, v0, Lkj2/k$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lkj2/k$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lkj2/k$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkj2/c$b;

    check-cast p2, Lca2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lkj2/k$j;->f(Lkj2/c$b;Lca2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    move-object/from16 v0, p0

    iget-object v1, v0, Lkj2/k$j;->x:Ljava/lang/Object;

    check-cast v1, Lkj2/c$b;

    iget-object v2, v0, Lkj2/k$j;->y:Ljava/lang/Object;

    check-cast v2, Lca2/a;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lkj2/k$j;->w:I

    if-nez v3, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkj2/c$b;->a()Lnj2/l;

    move-result-object v3

    instance-of v4, v3, Lnj2/l$e;

    if-eqz v4, :cond_0

    move-object v5, v3

    check-cast v5, Lnj2/l$e;

    invoke-virtual {v5}, Lnj2/l$e;->B()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v1, Lkj2/c$b;

    invoke-virtual {v2}, Lca2/a;->c()Lca2/c;

    move-result-object v23

    iget-object v3, v0, Lkj2/k$j;->z:Lkj2/k;

    invoke-static {v3}, Lkj2/k;->i(Lkj2/k;)Lor2/b1;

    move-result-object v3

    invoke-virtual {v2}, Lca2/a;->a()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v3, v2}, Lor2/b1;->a(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v25

    const v33, 0x7f5ffff

    const/16 v34, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v5 .. v34}, Lnj2/l$e;->b(Lnj2/l$e;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lnj2/c;Ljava/lang/String;ZLnj2/z;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/educationModels/FeatureEducationDto;ZLjava/lang/String;Lcom/whoop/stress/domain/model/PendingActivityDialogue;Lcom/whoop/stress/domain/model/OnboardingDismissDialog;Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lca2/c;ZLjava/lang/String;Lcom/whoop/stress/domain/model/StressTrend;Lcom/whoop/stress/domain/model/StressDateSelector;ZLcom/whoop/design/models/items/graph/StressGraphingCardModel;Ljava/util/List;Lcom/whoop/design/models/items/StepperComponentModel;Lcom/whoop/stress/domain/model/MetaData;ILjava/lang/Object;)Lnj2/l$e;

    move-result-object v2

    invoke-direct {v1, v2}, Lkj2/c$b;-><init>(Lnj2/l;)V

    :cond_0
    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
