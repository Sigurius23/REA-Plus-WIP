.class final Lvl2/u$o;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/u;->H(Lec3/l;)Lec3/l;
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
        "Lvl2/t;",
        "prevDomainState",
        "Lvl2/s;",
        "domainAction",
        "<anonymous>",
        "(Lvl2/t;Lvl2/s;)Lvl2/t;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trends.data.domain.TrendsApiInteractor$interact$1"
    f = "TrendsApiInteractor.kt"
    l = {
        0x31,
        0x35,
        0x39,
        0x3d,
        0x60,
        0x61,
        0x62,
        0x63,
        0x64,
        0x65,
        0x66,
        0x67
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvl2/u;


# direct methods
.method public constructor <init>(Lvl2/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/u;",
            "Lq83/d<",
            "-",
            "Lvl2/u$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvl2/u$o;->z:Lvl2/u;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvl2/t;Lvl2/s;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/t;",
            "Lvl2/s;",
            "Lq83/d<",
            "-",
            "Lvl2/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvl2/u$o;

    iget-object v1, p0, Lvl2/u$o;->z:Lvl2/u;

    invoke-direct {v0, v1, p3}, Lvl2/u$o;-><init>(Lvl2/u;Lq83/d;)V

    iput-object p1, v0, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvl2/u$o;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvl2/u$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl2/t;

    check-cast p2, Lvl2/s;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvl2/u$o;->f(Lvl2/t;Lvl2/s;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 47

    move-object/from16 v7, p0

    iget-object v0, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lvl2/t;

    iget-object v0, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    check-cast v0, Lvl2/s;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lvl2/u$o;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_c

    :pswitch_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_a

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_9

    :pswitch_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_8

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_7

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_6

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_5

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_4

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_3

    :pswitch_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_2

    :pswitch_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v1, v0, Lvl2/s$i;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$i;

    move-object v4, v1

    invoke-virtual {v4}, Lvl2/s$i;->b()Lor2/h0;

    move-result-object v1

    invoke-virtual {v4}, Lvl2/s$i;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lvl2/s$i;->c()Z

    move-result v4

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, v7, Lvl2/u$o;->w:I

    move-object v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, Lvl2/u;->D(Lvl2/u;Lor2/h0;Ljava/lang/String;Lvl2/t;ZZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_0

    goto/16 :goto_b

    :cond_0
    :goto_0
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_1
    move-object v1, v0

    nop

    instance-of v0, v1, Lvl2/s$l;

    if-eqz v0, :cond_3

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$l;

    invoke-virtual {v1}, Lvl2/s$l;->a()Lor2/h0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->l(Lvl2/u;Lor2/h0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_2

    goto/16 :goto_b

    :cond_2
    :goto_1
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_3
    instance-of v0, v1, Lvl2/s$j;

    if-eqz v0, :cond_5

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$j;

    invoke-virtual {v1}, Lvl2/s$j;->a()Lcm2/i;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->m(Lvl2/u;Lcm2/i;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_4

    goto/16 :goto_b

    :cond_4
    :goto_2
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_5
    instance-of v0, v1, Lvl2/s$k;

    if-eqz v0, :cond_7

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$k;

    invoke-virtual {v1}, Lvl2/s$k;->a()Lor2/h0;

    move-result-object v4

    invoke-virtual {v1}, Lvl2/s$k;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v4, v1, v3, v7}, Lvl2/u;->j(Lvl2/u;Lor2/h0;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_6

    goto/16 :goto_b

    :cond_6
    :goto_3
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_7
    sget-object v0, Lvl2/s$m;->a:Lvl2/s$m;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    instance-of v0, v3, Lvl2/t$c;

    if-eqz v0, :cond_b

    move-object v8, v3

    check-cast v8, Lvl2/t$c;

    const/16 v45, 0x7

    const/16 v46, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v44, -0x80001

    invoke-static/range {v8 .. v46}, Lvl2/t$c;->b(Lvl2/t$c;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;IILjava/lang/Object;)Lvl2/t$c;

    move-result-object v0

    return-object v0

    :cond_8
    sget-object v0, Lvl2/s$f;->a:Lvl2/s$f;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    instance-of v0, v3, Lvl2/t$c;

    if-eqz v0, :cond_b

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    invoke-static {v0}, Lvl2/u;->n(Lvl2/u;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v1, "vo2-max-delete-states-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    move-object v8, v3

    check-cast v8, Lvl2/t$c;

    sget-object v43, Lvl2/e$c;->a:Lvl2/e$c;

    const/16 v45, 0x3

    const/16 v46, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, -0x1

    invoke-static/range {v8 .. v46}, Lvl2/t$c;->b(Lvl2/t$c;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;IILjava/lang/Object;)Lvl2/t$c;

    move-result-object v0

    return-object v0

    :cond_9
    sget-object v0, Lvl2/s$o;->a:Lvl2/s$o;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    instance-of v0, v3, Lvl2/t$c;

    if-eqz v0, :cond_b

    move-object v8, v3

    check-cast v8, Lvl2/t$c;

    sget-object v43, Lvl2/e$d;->a:Lvl2/e$d;

    const/16 v45, 0x3

    const/16 v46, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, -0x1

    invoke-static/range {v8 .. v46}, Lvl2/t$c;->b(Lvl2/t$c;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;IILjava/lang/Object;)Lvl2/t$c;

    move-result-object v0

    return-object v0

    :cond_a
    sget-object v0, Lvl2/s$n;->a:Lvl2/s$n;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    instance-of v0, v3, Lvl2/t$c;

    if-eqz v0, :cond_b

    move-object v8, v3

    check-cast v8, Lvl2/t$c;

    sget-object v43, Lvl2/e$e;->a:Lvl2/e$e;

    const/16 v45, 0x3

    const/16 v46, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, -0x1

    invoke-static/range {v8 .. v46}, Lvl2/t$c;->b(Lvl2/t$c;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;Ljava/lang/String;Lor2/h0;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/trends/data/model/RecordedData;ZZZLcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/trends/data/model/MeasurementRecord;ZLcm2/i;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lvl2/e;IILjava/lang/Object;)Lvl2/t$c;

    move-result-object v0

    return-object v0

    :cond_b
    return-object v3

    :cond_c
    instance-of v0, v1, Lvl2/s$a;

    if-eqz v0, :cond_e

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$a;

    invoke-virtual {v1}, Lvl2/s$a;->a()Lbm2/f0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->a(Lvl2/u;Lbm2/f0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_d

    goto/16 :goto_b

    :cond_d
    :goto_4
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_e
    instance-of v0, v1, Lvl2/s$b;

    if-eqz v0, :cond_10

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$b;

    invoke-virtual {v1}, Lvl2/s$b;->a()Lbm2/f0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->b(Lvl2/u;Lbm2/f0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_f

    goto/16 :goto_b

    :cond_f
    :goto_5
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_10
    instance-of v0, v1, Lvl2/s$d;

    if-eqz v0, :cond_12

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$d;

    invoke-virtual {v1}, Lvl2/s$d;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->g(Lvl2/u;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_11

    goto/16 :goto_b

    :cond_11
    :goto_6
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_12
    instance-of v0, v1, Lvl2/s$p;

    if-eqz v0, :cond_14

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$p;

    invoke-virtual {v1}, Lvl2/s$p;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lvl2/s$p;->a()Lbm2/f0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/16 v2, 0x8

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v4, v1, v3, v7}, Lvl2/u;->p(Lvl2/u;Ljava/lang/String;Lbm2/f0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_13

    goto/16 :goto_b

    :cond_13
    :goto_7
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_14
    instance-of v0, v1, Lvl2/s$e;

    if-eqz v0, :cond_16

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$e;

    invoke-virtual {v1}, Lvl2/s$e;->b()Lcm2/i;

    move-result-object v4

    invoke-virtual {v1}, Lvl2/s$e;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/16 v2, 0x9

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v4, v1, v3, v7}, Lvl2/u;->d(Lvl2/u;Lcm2/i;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_15

    goto :goto_b

    :cond_15
    :goto_8
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_16
    instance-of v0, v1, Lvl2/s$c;

    if-eqz v0, :cond_18

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$c;

    invoke-virtual {v1}, Lvl2/s$c;->b()Lcm2/i;

    move-result-object v4

    invoke-virtual {v1}, Lvl2/s$c;->a()Lvl2/a0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/16 v2, 0xa

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v4, v1, v3, v7}, Lvl2/u;->c(Lvl2/u;Lcm2/i;Lvl2/a0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_17

    goto :goto_b

    :cond_17
    :goto_9
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_18
    instance-of v0, v1, Lvl2/s$h;

    if-eqz v0, :cond_1a

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$h;

    invoke-virtual {v1}, Lvl2/s$h;->b()Lcm2/i;

    move-result-object v4

    invoke-virtual {v1}, Lvl2/s$h;->a()Lvl2/a0;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/16 v2, 0xb

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v4, v1, v3, v7}, Lvl2/u;->i(Lvl2/u;Lcm2/i;Lvl2/a0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_19

    goto :goto_b

    :cond_19
    :goto_a
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_1a
    instance-of v0, v1, Lvl2/s$g;

    if-eqz v0, :cond_1c

    iget-object v0, v7, Lvl2/u$o;->z:Lvl2/u;

    check-cast v1, Lvl2/s$g;

    invoke-virtual {v1}, Lvl2/s$g;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v2, v7, Lvl2/u$o;->x:Ljava/lang/Object;

    iput-object v2, v7, Lvl2/u$o;->y:Ljava/lang/Object;

    const/16 v2, 0xc

    iput v2, v7, Lvl2/u$o;->w:I

    invoke-static {v0, v1, v3, v7}, Lvl2/u;->h(Lvl2/u;Ljava/lang/String;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1b

    :goto_b
    return-object v10

    :cond_1b
    :goto_c
    check-cast v0, Lvl2/t;

    return-object v0

    :cond_1c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
