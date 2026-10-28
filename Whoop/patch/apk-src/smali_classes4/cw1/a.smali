.class public final Lcw1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcw1/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lzv1/a;",
        "domainState",
        "Lbw1/c;",
        "a",
        "(Lzv1/a;)Lbw1/c;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcw1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lzv1/a;)Lbw1/c;
    .locals 33

    move-object/from16 v0, p1

    instance-of v1, v0, Lzv1/a$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    new-instance v3, Lkd1/o$c;

    check-cast v0, Lzv1/a$b;

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getHeaderImg()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v7, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getCta()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getCta()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lgz0/m0;->CREDIT_CARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v9

    array-length v10, v9

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v10, :cond_1

    aget-object v13, v9, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_1
    move-object v13, v2

    :goto_1
    if-nez v13, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v13

    :goto_2
    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    new-instance v13, Ly71/g;

    const/4 v4, 0x2

    invoke-direct {v13, v1, v2, v4, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lcw1/a$a;->w:Lcw1/a$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v14

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getCta()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v24

    const v31, 0x7eff96

    const/16 v32, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v7

    invoke-virtual {v0}, Lzv1/a$b;->a()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;->getCloseText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object/from16 v1, p0

    iget-object v0, v1, Lcw1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "use-card-button-for-dunning-cta-android"

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v9

    move-object v4, v3

    new-instance v3, Lbw1/c$b;

    invoke-direct/range {v3 .. v9}, Lbw1/c$b;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;Lcom/whoop/design/util/TextResource;Z)V

    return-object v3

    :cond_3
    move-object/from16 v1, p0

    instance-of v3, v0, Lzv1/a$a;

    if-eqz v3, :cond_5

    new-instance v4, Lkd1/o$c;

    check-cast v0, Lzv1/a$a;

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getHeaderImg()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getCycleData()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;

    invoke-virtual {v3}, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/membership/reactivationmodal/domain/models/MemberStatisticsModel;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v10, Lux1/a;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lux1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v10, Lbw1/a;

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getCta()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getCta()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    invoke-direct {v10, v2, v3}, Lbw1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;)V

    invoke-virtual {v0}, Lzv1/a$a;->a()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;->getCloseText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object v5, v4

    new-instance v4, Lbw1/c$a;

    invoke-direct/range {v4 .. v11}, Lbw1/c$a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lbw1/a;Lcom/whoop/design/util/TextResource;)V

    return-object v4

    :cond_5
    return-object v2
.end method
