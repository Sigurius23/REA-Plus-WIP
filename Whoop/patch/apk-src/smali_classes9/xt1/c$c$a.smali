.class public final Lxt1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxt1/c$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lxt1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lxt1/c;)V
    .locals 0

    iput-object p1, p0, Lxt1/c$c$a;->w:Lec3/m;

    iput-object p2, p0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lxt1/c$c$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxt1/c$c$a$a;

    iget v3, v2, Lxt1/c$c$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxt1/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxt1/c$c$a$a;

    invoke-direct {v2, v0, v1}, Lxt1/c$c$a$a;-><init>(Lxt1/c$c$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lxt1/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxt1/c$c$a$a;->x:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lxt1/c$c$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lxt1/c$c$a$a;->L:I

    iget-object v6, v2, Lxt1/c$c$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v6, v2, Lxt1/c$c$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lxt1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v7, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v7, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lxt1/c$c$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget v4, v2, Lxt1/c$c$a$a;->L:I

    iget-object v6, v2, Lxt1/c$c$a$a;->K:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object v7, v2, Lxt1/c$c$a$a;->J:Ljava/lang/Object;

    check-cast v7, Lpm0/a;

    iget-object v7, v2, Lxt1/c$c$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lxt1/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v9, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v9, Lec3/m;

    iget-object v9, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v9, Lxt1/c$c$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v6

    goto :goto_1

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lxt1/c$c$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v9, v4, Lpm0/a$a$a;

    const/4 v10, 0x0

    if-eqz v9, :cond_e

    iget-object v6, v0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-static {v6}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v9

    :cond_5
    move-object v6, v9

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object v13, v0, Lxt1/c$c$a;->x:Lxt1/c;

    move-object v14, v4

    check-cast v14, Lpm0/a$a$a;

    invoke-virtual {v14}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-static {v13, v12, v14}, Lxt1/c;->c(Lxt1/c;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v12

    invoke-virtual {v6, v11, v12}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v4, v0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-static {v4}, Lxt1/c;->f(Lxt1/c;)Lqk1/b;

    move-result-object v4

    iput-object v8, v2, Lxt1/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lxt1/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->J:Ljava/lang/Object;

    iput-object v12, v2, Lxt1/c$c$a$a;->K:Ljava/lang/Object;

    iput v10, v2, Lxt1/c$c$a$a;->L:I

    iput v10, v2, Lxt1/c$c$a$a;->M:I

    iput v7, v2, Lxt1/c$c$a$a;->x:I

    invoke-interface {v4, v2}, Lqk1/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object v7, v1

    move-object v1, v4

    move v4, v10

    move-object v9, v12

    :goto_1
    check-cast v1, Lqk1/a;

    if-eqz v1, :cond_d

    invoke-virtual {v9}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->getRecords()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    instance-of v10, v6, Ljava/util/Collection;

    if-eqz v10, :cond_7

    move-object v10, v6

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_8
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;

    invoke-virtual {v10}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;->getItems()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    instance-of v11, v10, Ljava/util/Collection;

    if-eqz v11, :cond_9

    move-object v11, v10

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_2

    :cond_9
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;

    invoke-virtual {v11}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedResultModel;->getTrailingTimestamp()J

    move-result-wide v11

    invoke-virtual {v1}, Lqk1/a;->i()J

    move-result-wide v13

    cmp-long v11, v11, v13

    if-nez v11, :cond_a

    move-object v1, v9

    goto :goto_4

    :cond_b
    :goto_3
    iget-object v6, v0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-static {v6, v1}, Lxt1/c;->g(Lxt1/c;Lqk1/a;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;

    move-result-object v10

    const-string v1, ""

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/4 v14, 0x6

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;->copy$default(Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/labrador/feature/results/domain/model/LabradorPaginatedGroupModel;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v9}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->getRecords()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v1, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v11

    const/4 v13, 0x5

    const/4 v14, 0x0

    const/4 v10, 0x0

    invoke-static/range {v9 .. v14}, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;->copy$default(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/navigation/e;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v1

    :goto_4
    if-nez v1, :cond_c

    goto :goto_5

    :cond_c
    move-object v9, v1

    :cond_d
    :goto_5
    new-instance v1, Lxt1/b$f;

    invoke-direct {v1, v9}, Lxt1/b$f;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    move v10, v4

    goto/16 :goto_7

    :cond_e
    instance-of v7, v4, Lpm0/a$a$b;

    if-eqz v7, :cond_f

    new-instance v4, Lxt1/b$h;

    iget-object v6, v0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-static {v6}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v6

    check-cast v6, Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-direct {v4, v6}, Lxt1/b$h;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    :goto_6
    move-object v7, v1

    move-object v1, v4

    goto :goto_7

    :cond_f
    instance-of v7, v4, Lpm0/a$c;

    if-eqz v7, :cond_11

    iget-object v4, v0, Lxt1/c$c$a;->x:Lxt1/c;

    iput-object v8, v2, Lxt1/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lxt1/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->J:Ljava/lang/Object;

    iput v10, v2, Lxt1/c$c$a$a;->L:I

    iput v10, v2, Lxt1/c$c$a$a;->M:I

    iput v6, v2, Lxt1/c$c$a$a;->x:I

    invoke-static {v4, v2}, Lxt1/c;->e(Lxt1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_10

    goto :goto_a

    :cond_10
    move-object v6, v1

    move-object v1, v4

    goto :goto_8

    :cond_11
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_13

    iget-object v6, v0, Lxt1/c$c$a;->x:Lxt1/c;

    invoke-static {v6}, Lxt1/c;->d(Lxt1/c;)Lec3/p1;

    move-result-object v6

    :cond_12
    move-object v7, v6

    check-cast v7, Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    iget-object v12, v0, Lxt1/c$c$a;->x:Lxt1/c;

    move-object v13, v4

    check-cast v13, Lpm0/a$d;

    invoke-virtual {v13}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    invoke-static {v12, v11, v13}, Lxt1/c;->c(Lxt1/c;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;

    move-result-object v11

    invoke-virtual {v7, v9, v11}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    new-instance v4, Lxt1/b$g;

    invoke-direct {v4, v11}, Lxt1/b$g;-><init>(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V

    goto :goto_6

    :cond_13
    instance-of v4, v4, Lpm0/a$e;

    if-eqz v4, :cond_15

    sget-object v4, Lxt1/b$e;->a:Lxt1/b$e;

    goto :goto_6

    :goto_7
    move-object v6, v7

    :goto_8
    move v4, v10

    :goto_9
    iput-object v8, v2, Lxt1/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->J:Ljava/lang/Object;

    iput-object v8, v2, Lxt1/c$c$a$a;->K:Ljava/lang/Object;

    iput v4, v2, Lxt1/c$c$a$a;->L:I

    iput v5, v2, Lxt1/c$c$a$a;->x:I

    invoke-interface {v6, v1, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_14

    :goto_a
    return-object v3

    :cond_14
    :goto_b
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_15
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
