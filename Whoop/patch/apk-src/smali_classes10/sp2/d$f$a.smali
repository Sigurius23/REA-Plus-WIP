.class public final Lsp2/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsp2/d$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic z:Lsp2/d;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;ZLsp2/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lsp2/d$f$a;->w:Lec3/m;

    iput-object p2, p0, Lsp2/d$f$a;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lsp2/d$f$a;->y:Z

    iput-object p4, p0, Lsp2/d$f$a;->z:Lsp2/d;

    iput-object p5, p0, Lsp2/d$f$a;->E:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lsp2/d$f$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lsp2/d$f$a$a;

    iget v3, v2, Lsp2/d$f$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lsp2/d$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lsp2/d$f$a$a;

    invoke-direct {v2, v0, v1}, Lsp2/d$f$a$a;-><init>(Lsp2/d$f$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lsp2/d$f$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lsp2/d$f$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lsp2/d$f$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lsp2/d$f$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lsp2/d$f$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lsp2/d$f$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    new-instance v8, Lsp2/c;

    iget-object v9, v0, Lsp2/d$f$a;->x:Ljava/lang/String;

    sget-object v10, Lsp2/a$b;->a:Lsp2/a$b;

    const/16 v17, 0xfc

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lsp2/c;-><init>(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_5

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getShippingMethods()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getId()Ljava/lang/String;

    move-result-object v6

    move-object v12, v6

    goto :goto_1

    :cond_4
    move-object v12, v7

    :goto_1
    new-instance v8, Lsp2/c;

    iget-object v9, v0, Lsp2/d$f$a;->x:Ljava/lang/String;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    iget-boolean v14, v0, Lsp2/d$f$a;->y:Z

    const/16 v17, 0x92

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lsp2/c;-><init>(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_5
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_7

    iget-object v6, v0, Lsp2/d$f$a;->z:Lsp2/d;

    invoke-static {v6}, Lsp2/d;->c(Lsp2/d;)Lqp2/a;

    move-result-object v6

    new-instance v8, Lvp2/a$j;

    iget-object v9, v0, Lsp2/d$f$a;->E:Ljava/lang/String;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    invoke-virtual {v10}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getAnalyticsPayload()Ljava/util/Map;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Lvp2/a$j;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v6, v8}, Lqp2/a;->a(Lvp2/a$a;)V

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getShippingMethods()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getId()Ljava/lang/String;

    move-result-object v6

    move-object v12, v6

    goto :goto_2

    :cond_6
    move-object v12, v7

    :goto_2
    new-instance v8, Lsp2/c;

    iget-object v9, v0, Lsp2/d$f$a;->x:Ljava/lang/String;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    const/16 v17, 0xf2

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lsp2/c;-><init>(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_7
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_9

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;->getShippingMethods()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethod;->getId()Ljava/lang/String;

    move-result-object v6

    move-object v12, v6

    goto :goto_3

    :cond_8
    move-object v12, v7

    :goto_3
    new-instance v8, Lsp2/c;

    iget-object v9, v0, Lsp2/d$f$a;->x:Ljava/lang/String;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;

    const/16 v17, 0xf2

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lsp2/c;-><init>(Ljava/lang/String;Lsp2/a;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;Ljava/lang/String;ZZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_9
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_b

    iget-object v6, v0, Lsp2/d$f$a;->z:Lsp2/d;

    check-cast v4, Lpm0/a$c;

    iget-object v8, v0, Lsp2/d$f$a;->x:Ljava/lang/String;

    invoke-static {v6, v4, v8}, Lsp2/d;->e(Lsp2/d;Lpm0/a$c;Ljava/lang/String;)Lsp2/c;

    move-result-object v8

    :goto_4
    iput-object v7, v2, Lsp2/d$f$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lsp2/d$f$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lsp2/d$f$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lsp2/d$f$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lsp2/d$f$a$a;->H:I

    iput v5, v2, Lsp2/d$f$a$a;->x:I

    invoke-interface {v1, v8, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    return-object v3

    :cond_a
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
