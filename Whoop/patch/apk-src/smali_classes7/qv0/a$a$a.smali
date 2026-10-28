.class public final Lqv0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqv0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lqv0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lqv0/a;)V
    .locals 0

    iput-object p1, p0, Lqv0/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lqv0/a$a$a;->x:Lqv0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lqv0/a$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lqv0/a$a$a$a;

    iget v3, v2, Lqv0/a$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lqv0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lqv0/a$a$a$a;

    invoke-direct {v2, v0, v1}, Lqv0/a$a$a$a;-><init>(Lqv0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lqv0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lqv0/a$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lqv0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lqv0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lqv0/a$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lqv0/a$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lnv0/b;

    instance-of v6, v4, Lnv0/b$c;

    if-eqz v6, :cond_c

    check-cast v4, Lnv0/b$c;

    invoke-virtual {v4}, Lnv0/b$c;->c()Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;->getRecords()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_b

    check-cast v6, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;

    invoke-virtual {v4}, Lnv0/b$c;->g()Z

    move-result v11

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getNavBar()Lcom/whoop/contentsearch/domain/models/NavBar;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/contentsearch/domain/models/NavBar;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getNavBar()Lcom/whoop/contentsearch/domain/models/NavBar;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/contentsearch/domain/models/NavBar;->getLeftButton()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    sget-object v10, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v12

    array-length v14, v12

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v14, :cond_4

    aget-object v16, v12, v15

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v15, v15, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    const/16 v16, 0x0

    :goto_2
    if-nez v16, :cond_5

    goto :goto_3

    :cond_5
    move-object/from16 v10, v16

    :goto_3
    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    :goto_4
    move v14, v5

    goto :goto_5

    :cond_6
    sget-object v5, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    goto :goto_4

    :goto_5
    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getSearchTextPlaceholder()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v4}, Lnv0/b$c;->e()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getFilterTypes()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v5, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    invoke-virtual {v4}, Lnv0/b$c;->f()Ljava/lang/String;

    move-result-object v18

    iget-object v5, v0, Lqv0/a$a$a;->x:Lqv0/a;

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getTiles()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v4}, Lnv0/b$c;->f()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getFilterTypes()Ljava/util/List;

    move-result-object v7

    invoke-static {v5, v10, v12, v7}, Lqv0/a;->a(Lqv0/a;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v19

    invoke-virtual {v4}, Lnv0/b$c;->d()Lnv0/d;

    move-result-object v20

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getSearchLanding()Lcom/whoop/contentsearch/domain/models/SearchLanding;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/contentsearch/domain/models/SearchLanding;->getTitleText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getSearchLanding()Lcom/whoop/contentsearch/domain/models/SearchLanding;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/contentsearch/domain/models/SearchLanding;->getSubText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getSearchLanding()Lcom/whoop/contentsearch/domain/models/SearchLanding;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/contentsearch/domain/models/SearchLanding;->getIcon()Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lgz0/m0;->SEARCH:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v10

    array-length v12, v10

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v12, :cond_9

    aget-object v17, v10, v8

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    goto :goto_7

    :cond_9
    const/16 v17, 0x0

    :goto_8
    if-nez v17, :cond_a

    goto :goto_9

    :cond_a
    move-object/from16 v7, v17

    :goto_9
    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v23

    invoke-virtual {v4}, Lnv0/b$c;->c()Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/contentsearch/domain/models/ContentSearchResponse;->getNextToken()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getPaginationDetails()Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/contentsearch/domain/models/PaginationDetails;->getErrorText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-virtual {v6}, Lcom/whoop/contentsearch/domain/models/ContentSearchScreen;->getPaginationDetails()Lcom/whoop/contentsearch/domain/models/PaginationDetails;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/contentsearch/domain/models/PaginationDetails;->getRetryButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    move-object/from16 v17, v9

    new-instance v9, Lpv0/d;

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v26}, Lpv0/d;-><init>(ZZZLcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lnv0/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    :goto_a
    const/4 v0, 0x0

    goto :goto_b

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Content Search BFF Contract is Broken - No records returned"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    instance-of v0, v4, Lnv0/b$b;

    if-eqz v0, :cond_d

    new-instance v5, Lpv0/d;

    const v23, 0x1fffa

    const/16 v24, 0x0

    const/4 v6, 0x1

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

    invoke-direct/range {v5 .. v24}, Lpv0/d;-><init>(ZZZLcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lnv0/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v5

    goto :goto_a

    :cond_d
    instance-of v0, v4, Lnv0/b$a;

    if-eqz v0, :cond_f

    new-instance v4, Lpv0/d;

    const v22, 0x1fffa

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

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

    invoke-direct/range {v4 .. v23}, Lpv0/d;-><init>(ZZZLcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lnv0/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v4

    goto :goto_a

    :goto_b
    iput-object v0, v2, Lqv0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v0, v2, Lqv0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v0, v2, Lqv0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v0, v2, Lqv0/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, v2, Lqv0/a$a$a$a;->H:I

    const/4 v0, 0x1

    iput v0, v2, Lqv0/a$a$a$a;->x:I

    invoke-interface {v1, v9, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_e

    return-object v3

    :cond_e
    :goto_c
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_f
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
