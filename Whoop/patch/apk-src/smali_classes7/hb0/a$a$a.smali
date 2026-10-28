.class public final Lhb0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lhb0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lhb0/a;)V
    .locals 0

    iput-object p1, p0, Lhb0/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lhb0/a$a$a;->x:Lhb0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lhb0/a$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lhb0/a$a$a$a;

    iget v3, v2, Lhb0/a$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lhb0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lhb0/a$a$a$a;

    invoke-direct {v2, v0, v1}, Lhb0/a$a$a$a;-><init>(Lhb0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lhb0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lhb0/a$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lhb0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lhb0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lhb0/a$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lhb0/a$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Leb0/b;

    instance-of v6, v4, Leb0/b$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v6, :cond_3

    sget-object v4, Lgb0/c$a;->b:Lgb0/c$a;

    goto/16 :goto_7

    :cond_3
    instance-of v6, v4, Leb0/b$b;

    if-eqz v6, :cond_b

    check-cast v4, Leb0/b$b;

    invoke-virtual {v4}, Leb0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;->getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v6

    move-object v10, v6

    goto :goto_1

    :cond_4
    move-object v10, v8

    :goto_1
    invoke-virtual {v4}, Leb0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4}, Leb0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationRightButton()Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/NavigationButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lgz0/m0;->DOWNLOAD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v12

    array-length v13, v12

    move v14, v7

    :goto_2
    if-ge v14, v13, :cond_6

    aget-object v15, v12, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v14, v14, 0x1

    const/4 v5, 0x1

    goto :goto_2

    :cond_6
    move-object v15, v8

    :goto_3
    if-nez v15, :cond_7

    goto :goto_4

    :cond_7
    move-object v9, v15

    :goto_4
    new-instance v5, Lgb0/d;

    invoke-direct {v5, v9}, Lgb0/d;-><init>(Lgz0/m0;)V

    move-object v12, v5

    goto :goto_5

    :cond_8
    move-object v12, v8

    :goto_5
    invoke-virtual {v4}, Leb0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;->getItems()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v13, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v9, v0, Lhb0/a$a$a;->x:Lhb0/a;

    invoke-static {v9}, Lhb0/a;->a(Lhb0/a;)Ljb1/a;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Leb0/b$b;->a()Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object v14

    new-instance v9, Lgb0/c$c;

    invoke-direct/range {v9 .. v14}, Lgb0/c$c;-><init>(Lep0/j;Ljava/lang/String;Lgb0/d;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V

    move-object v4, v9

    :goto_7
    iput-object v8, v2, Lhb0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lhb0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lhb0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lhb0/a$a$a$a;->G:Ljava/lang/Object;

    iput v7, v2, Lhb0/a$a$a$a;->H:I

    const/4 v5, 0x1

    iput v5, v2, Lhb0/a$a$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    return-object v3

    :cond_a
    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
