.class public final Lbp2/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbp2/d$h;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Z

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lbp2/d;


# direct methods
.method public constructor <init>(Lec3/m;ZLjava/lang/String;Lbp2/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbp2/d$h$a;->w:Lec3/m;

    iput-boolean p2, p0, Lbp2/d$h$a;->x:Z

    iput-object p3, p0, Lbp2/d$h$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lbp2/d$h$a;->z:Lbp2/d;

    iput-object p5, p0, Lbp2/d$h$a;->E:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lbp2/d$h$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lbp2/d$h$a$a;

    iget v3, v2, Lbp2/d$h$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lbp2/d$h$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lbp2/d$h$a$a;

    invoke-direct {v2, v0, v1}, Lbp2/d$h$a$a;-><init>(Lbp2/d$h$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lbp2/d$h$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lbp2/d$h$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lbp2/d$h$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lbp2/d$h$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lbp2/d$h$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lbp2/d$h$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    new-instance v8, Lbp2/c;

    sget-object v9, Lbp2/a$b;->a:Lbp2/a$b;

    const/16 v17, 0xfe

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lbp2/c;-><init>(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_4

    new-instance v8, Lbp2/c;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    iget-boolean v11, v0, Lbp2/d$h$a;->x:Z

    iget-object v13, v0, Lbp2/d$h$a;->y:Ljava/lang/String;

    const/16 v17, 0xe1

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lbp2/c;-><init>(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_4
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_6

    iget-object v6, v0, Lbp2/d$h$a;->z:Lbp2/d;

    invoke-static {v6}, Lbp2/d;->c(Lbp2/d;)Lap2/a;

    move-result-object v6

    new-instance v8, Lep2/a$o;

    iget-object v9, v0, Lbp2/d$h$a;->E:Ljava/lang/String;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    invoke-virtual {v10}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;->getAnalyticsPayload()Ljava/util/Map;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v10}, Lu82/h;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    goto :goto_1

    :cond_5
    move-object v10, v7

    :goto_1
    iget-object v11, v0, Lbp2/d$h$a;->z:Lbp2/d;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    invoke-static {v11, v12}, Lbp2/d;->f(Lbp2/d;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v8, v9, v10, v11}, Lep2/a$o;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const/4 v9, 0x2

    invoke-static {v6, v8, v7, v9, v7}, Lap2/a;->b(Lap2/a;Lep2/a$a;Ljava/lang/String;ILjava/lang/Object;)V

    new-instance v10, Lbp2/c;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    iget-object v15, v0, Lbp2/d$h$a;->y:Ljava/lang/String;

    const/16 v19, 0xed

    const/16 v20, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lbp2/c;-><init>(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v10

    goto :goto_2

    :cond_6
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_7

    new-instance v8, Lbp2/c;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;

    iget-object v13, v0, Lbp2/d$h$a;->y:Ljava/lang/String;

    const/16 v17, 0xed

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lbp2/c;-><init>(Lbp2/a;Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptOrderResponse;ZZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_7
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_9

    iget-object v6, v0, Lbp2/d$h$a;->z:Lbp2/d;

    check-cast v4, Lpm0/a$c;

    iget-object v8, v0, Lbp2/d$h$a;->y:Ljava/lang/String;

    invoke-static {v6, v4, v8}, Lbp2/d;->e(Lbp2/d;Lpm0/a$c;Ljava/lang/String;)Lbp2/c;

    move-result-object v8

    :goto_2
    iput-object v7, v2, Lbp2/d$h$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lbp2/d$h$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lbp2/d$h$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lbp2/d$h$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lbp2/d$h$a$a;->H:I

    iput v5, v2, Lbp2/d$h$a$a;->x:I

    invoke-interface {v1, v8, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    return-object v3

    :cond_8
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
