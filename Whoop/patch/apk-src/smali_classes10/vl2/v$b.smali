.class final Lvl2/v$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/v;->d(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lvl2/t;",
        "api",
        "Lvl2/y;",
        "state",
        "Lvl2/n;",
        "menuSheetState",
        "Lvl2/w;",
        "<anonymous>",
        "(Lvl2/t;Lvl2/y;Lvl2/n;)Lvl2/w;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trends.data.domain.TrendsDomainReducer$reduce$1"
    f = "TrendsDomainReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvl2/v;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvl2/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/v;",
            "Lq83/d<",
            "-",
            "Lvl2/v$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvl2/v$b;->E:Lvl2/v;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvl2/t;Lvl2/y;Lvl2/n;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/t;",
            "Lvl2/y;",
            "Lvl2/n;",
            "Lq83/d<",
            "-",
            "Lvl2/w;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvl2/v$b;

    iget-object v1, p0, Lvl2/v$b;->E:Lvl2/v;

    invoke-direct {v0, v1, p4}, Lvl2/v$b;-><init>(Lvl2/v;Lq83/d;)V

    iput-object p1, v0, Lvl2/v$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvl2/v$b;->y:Ljava/lang/Object;

    iput-object p3, v0, Lvl2/v$b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvl2/v$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl2/t;

    check-cast p2, Lvl2/y;

    check-cast p3, Lvl2/n;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lvl2/v$b;->f(Lvl2/t;Lvl2/y;Lvl2/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 43

    move-object/from16 v0, p0

    iget-object v1, v0, Lvl2/v$b;->x:Ljava/lang/Object;

    check-cast v1, Lvl2/t;

    iget-object v2, v0, Lvl2/v$b;->y:Ljava/lang/Object;

    check-cast v2, Lvl2/y;

    iget-object v3, v0, Lvl2/v$b;->z:Ljava/lang/Object;

    check-cast v3, Lvl2/n;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lvl2/v$b;->w:I

    if-nez v4, :cond_5

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v4, "null cannot be cast to non-null type com.whoop.trends.data.domain.TrendsLocalStateResult.ResultV3"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lvl2/y$a;

    instance-of v4, v1, Lvl2/t$a;

    if-eqz v4, :cond_0

    new-instance v3, Lvl2/w$a;

    invoke-virtual {v2}, Lvl2/y$a;->c()Lor2/h0;

    move-result-object v4

    invoke-virtual {v2}, Lvl2/y$a;->b()Lvl2/a;

    move-result-object v5

    check-cast v1, Lvl2/t$a;

    invoke-virtual {v1}, Lvl2/t$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lvl2/y$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v5, v1, v2}, Lvl2/w$a;-><init>(Lor2/h0;Lvl2/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_0
    instance-of v4, v1, Lvl2/t$b;

    if-eqz v4, :cond_1

    new-instance v1, Lvl2/w$b;

    invoke-virtual {v2}, Lvl2/y$a;->c()Lor2/h0;

    move-result-object v2

    invoke-direct {v1, v2}, Lvl2/w$b;-><init>(Lor2/h0;)V

    return-object v1

    :cond_1
    instance-of v4, v1, Lvl2/t$c;

    if-eqz v4, :cond_4

    new-instance v5, Lvl2/w$c;

    check-cast v1, Lvl2/t$c;

    invoke-virtual {v1}, Lvl2/t$c;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lvl2/t$c;->D()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    move-result-object v7

    invoke-virtual {v1}, Lvl2/t$c;->x()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lvl2/t$c;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lvl2/t$c;->t()Lcom/whoop/trends/data/model/MetricEducationV3;

    move-result-object v10

    invoke-virtual {v1}, Lvl2/t$c;->J()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object v11

    invoke-virtual {v1}, Lvl2/t$c;->v()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object v12

    invoke-virtual {v1}, Lvl2/t$c;->E()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object v13

    invoke-virtual {v1}, Lvl2/t$c;->d()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object v14

    invoke-virtual {v1}, Lvl2/t$c;->w()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v1}, Lvl2/t$c;->h()Lor2/h0;

    move-result-object v16

    invoke-virtual {v2}, Lvl2/y$a;->b()Lvl2/a;

    move-result-object v17

    invoke-virtual {v2}, Lvl2/y$a;->a()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lvl2/t$c;->g()Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    move-result-object v19

    invoke-virtual {v1}, Lvl2/t$c;->j()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lvl2/t$c;->l()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    move-result-object v21

    invoke-virtual {v2}, Lvl2/y$a;->d()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v1}, Lvl2/t$c;->m()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-result-object v23

    invoke-virtual {v1}, Lvl2/t$c;->C()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-result-object v24

    invoke-virtual {v1}, Lvl2/t$c;->n()Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-result-object v25

    invoke-virtual {v1}, Lvl2/t$c;->z()Lcom/whoop/trends/data/model/RecordedData;

    move-result-object v26

    invoke-virtual {v1}, Lvl2/t$c;->A()Z

    move-result v27

    invoke-virtual {v1}, Lvl2/t$c;->F()Z

    move-result v28

    invoke-virtual {v1}, Lvl2/t$c;->I()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    move-result-object v29

    invoke-virtual {v1}, Lvl2/t$c;->H()Ljava/util/List;

    move-result-object v30

    invoke-virtual {v1}, Lvl2/t$c;->e()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-result-object v31

    invoke-virtual {v1}, Lvl2/t$c;->u()Ljava/util/List;

    move-result-object v32

    invoke-virtual {v1}, Lvl2/t$c;->k()Ljava/util/List;

    move-result-object v33

    invoke-virtual {v1}, Lvl2/t$c;->o()Ljava/lang/String;

    move-result-object v34

    invoke-virtual {v1}, Lvl2/t$c;->G()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v4, v0, Lvl2/v$b;->E:Lvl2/v;

    invoke-static {v4, v2, v3}, Lvl2/v;->b(Lvl2/v;Ljava/util/List;Lvl2/n;)Ljava/util/List;

    move-result-object v2

    move-object/from16 v35, v2

    goto :goto_0

    :cond_2
    const/16 v35, 0x0

    :goto_0
    invoke-virtual {v1}, Lvl2/t$c;->c()Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-result-object v36

    invoke-virtual {v1}, Lvl2/t$c;->q()Lcom/whoop/trends/data/model/MeasurementRecord;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v4, v0, Lvl2/v$b;->E:Lvl2/v;

    invoke-static {v4, v2, v3}, Lvl2/v;->a(Lvl2/v;Lcom/whoop/trends/data/model/MeasurementRecord;Lvl2/n;)Lvl2/f;

    move-result-object v4

    move-object/from16 v37, v4

    goto :goto_1

    :cond_3
    const/16 v37, 0x0

    :goto_1
    invoke-virtual {v1}, Lvl2/t$c;->B()Z

    move-result v38

    invoke-virtual {v1}, Lvl2/t$c;->p()Lcm2/i;

    move-result-object v39

    invoke-virtual {v1}, Lvl2/t$c;->f()Ljava/util/List;

    move-result-object v40

    invoke-virtual {v1}, Lvl2/t$c;->s()Lcom/whoop/trends/data/model/MetaData;

    move-result-object v41

    invoke-virtual {v1}, Lvl2/t$c;->r()Lvl2/e;

    move-result-object v42

    invoke-direct/range {v5 .. v42}, Lvl2/w$c;-><init>(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Lor2/h0;Lvl2/a;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Ljava/lang/String;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/util/List;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lvl2/f;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;)V

    return-object v5

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
