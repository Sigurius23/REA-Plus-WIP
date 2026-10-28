.class public final Lwf0/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwf0/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ljava/lang/String;

.field final synthetic w:Lec3/m;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Z

.field final synthetic z:Lwf0/d;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;ZLwf0/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lwf0/d$g$a;->w:Lec3/m;

    iput-object p2, p0, Lwf0/d$g$a;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lwf0/d$g$a;->y:Z

    iput-object p4, p0, Lwf0/d$g$a;->z:Lwf0/d;

    iput-object p5, p0, Lwf0/d$g$a;->E:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lwf0/d$g$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwf0/d$g$a$a;

    iget v3, v2, Lwf0/d$g$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwf0/d$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwf0/d$g$a$a;

    invoke-direct {v2, v0, v1}, Lwf0/d$g$a$a;-><init>(Lwf0/d$g$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lwf0/d$g$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwf0/d$g$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lwf0/d$g$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lwf0/d$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lwf0/d$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lwf0/d$g$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_3

    new-instance v7, Lwf0/c;

    sget-object v8, Lwf0/a$c;->a:Lwf0/a$c;

    iget-object v11, v0, Lwf0/d$g$a;->x:Ljava/lang/String;

    const/16 v14, 0x36

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lwf0/c;-><init>(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    const-string v7, ""

    if-eqz v6, :cond_5

    new-instance v8, Lwf0/c;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    move-object v11, v7

    goto :goto_1

    :cond_4
    move-object v11, v4

    :goto_1
    iget-object v12, v0, Lwf0/d$g$a;->x:Ljava/lang/String;

    iget-boolean v13, v0, Lwf0/d$g$a;->y:Z

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v16}, Lwf0/c;-><init>(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move-object v7, v8

    goto/16 :goto_5

    :cond_5
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_7

    new-instance v8, Lwf0/c;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    move-object v11, v7

    goto :goto_3

    :cond_6
    move-object v11, v4

    :goto_3
    iget-object v12, v0, Lwf0/d$g$a;->x:Ljava/lang/String;

    const/16 v15, 0x31

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lwf0/c;-><init>(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_7
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_9

    new-instance v8, Lwf0/c;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;

    invoke-virtual {v4}, Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_8

    move-object v11, v7

    goto :goto_4

    :cond_8
    move-object v11, v4

    :goto_4
    iget-object v12, v0, Lwf0/d$g$a;->x:Ljava/lang/String;

    const/16 v15, 0x31

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lwf0/c;-><init>(Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_9
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_b

    iget-object v6, v0, Lwf0/d$g$a;->z:Lwf0/d;

    check-cast v4, Lpm0/a$c;

    invoke-static {v6, v4}, Lwf0/d;->d(Lwf0/d;Lpm0/a$c;)Lwf0/c;

    move-result-object v7

    iget-object v10, v0, Lwf0/d$g$a;->E:Ljava/lang/String;

    iget-object v11, v0, Lwf0/d$g$a;->x:Ljava/lang/String;

    const/16 v14, 0x33

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lwf0/c;->b(Lwf0/c;Lwf0/a;Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/domain/models/PurchaseAddOnsModels;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Lwf0/c;

    move-result-object v7

    :goto_5
    const/4 v4, 0x0

    iput-object v4, v2, Lwf0/d$g$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lwf0/d$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lwf0/d$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lwf0/d$g$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lwf0/d$g$a$a;->H:I

    iput v5, v2, Lwf0/d$g$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    return-object v3

    :cond_a
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
