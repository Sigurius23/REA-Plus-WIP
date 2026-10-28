.class public final Lmb0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lmb0/a$a$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lmb0/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmb0/a$a$a$a;

    iget v1, v0, Lmb0/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmb0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmb0/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lmb0/a$a$a$a;-><init>(Lmb0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lmb0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmb0/a$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmb0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lmb0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lmb0/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmb0/a$a$a;->w:Lec3/m;

    check-cast p1, Ljb0/b;

    instance-of v2, p1, Ljb0/b$b;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    sget-object p1, Llb0/c$b;->b:Llb0/c$b;

    goto :goto_3

    :cond_3
    instance-of v2, p1, Ljb0/b$a;

    if-eqz v2, :cond_4

    sget-object p1, Llb0/c$a;->b:Llb0/c$a;

    goto :goto_3

    :cond_4
    instance-of v2, p1, Ljb0/b$c;

    if-eqz v2, :cond_8

    check-cast p1, Ljb0/b$c;

    invoke-virtual {p1}, Ljb0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->getMetadata()Lcom/whoop/advancedlabs/domain/models/MetaData;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/advancedlabs/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v2

    goto :goto_1

    :cond_5
    move-object v2, v4

    :goto_1
    invoke-virtual {p1}, Ljb0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v5

    invoke-virtual {p1}, Ljb0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->getSections()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljb0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;->getAnalytics()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;

    move-result-object p1

    new-instance v6, Llb0/c$c;

    invoke-direct {v6, v2, v5, v7, p1}, Llb0/c$c;-><init>(Lep0/j;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V

    move-object p1, v6

    :goto_3
    iput-object v4, v0, Lmb0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lmb0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lmb0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lmb0/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lmb0/a$a$a$a;->H:I

    iput v3, v0, Lmb0/a$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
