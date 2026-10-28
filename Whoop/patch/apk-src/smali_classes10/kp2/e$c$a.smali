.class public final Lkp2/e$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkp2/e$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lkp2/e;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;Lkp2/e;Z)V
    .locals 0

    iput-object p1, p0, Lkp2/e$c$a;->w:Lec3/m;

    iput-object p2, p0, Lkp2/e$c$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lkp2/e$c$a;->y:Lkp2/e;

    iput-boolean p4, p0, Lkp2/e$c$a;->z:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lkp2/e$c$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lkp2/e$c$a$a;

    iget v3, v2, Lkp2/e$c$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lkp2/e$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lkp2/e$c$a$a;

    invoke-direct {v2, v0, v1}, Lkp2/e$c$a$a;-><init>(Lkp2/e$c$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lkp2/e$c$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lkp2/e$c$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lkp2/e$c$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lkp2/e$c$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lkp2/e$c$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lkp2/e$c$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_3

    new-instance v7, Lkp2/c;

    sget-object v8, Lkp2/a$d;->a:Lkp2/a$d;

    iget-object v4, v0, Lkp2/e$c$a;->x:Ljava/lang/String;

    const/16 v24, 0x3ffe

    const/16 v25, 0x0

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

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, v4

    invoke-direct/range {v7 .. v25}, Lkp2/c;-><init>(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_4

    new-instance v7, Lkp2/c;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v8}, Lkp2/e;->c(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Map;

    move-result-object v10

    iget-boolean v14, v0, Lkp2/e$c$a;->z:Z

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v4}, Lkp2/e;->f(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Set;

    move-result-object v22

    iget-object v4, v0, Lkp2/e$c$a;->x:Ljava/lang/String;

    const/16 v24, 0x1f39

    const/16 v25, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 v23, v4

    invoke-direct/range {v7 .. v25}, Lkp2/c;-><init>(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_4
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_5

    new-instance v7, Lkp2/c;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v8}, Lkp2/e;->c(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Map;

    move-result-object v10

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v4}, Lkp2/e;->f(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Set;

    move-result-object v22

    iget-object v4, v0, Lkp2/e$c$a;->x:Ljava/lang/String;

    const/16 v24, 0x1ff9

    const/16 v25, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 v23, v4

    invoke-direct/range {v7 .. v25}, Lkp2/c;-><init>(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_6

    new-instance v7, Lkp2/c;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v8}, Lkp2/e;->c(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Map;

    move-result-object v10

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;

    invoke-static {v6, v4}, Lkp2/e;->f(Lkp2/e;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;)Ljava/util/Set;

    move-result-object v22

    iget-object v4, v0, Lkp2/e$c$a;->x:Ljava/lang/String;

    const/16 v24, 0x1ff9

    const/16 v25, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    move-object/from16 v23, v4

    invoke-direct/range {v7 .. v25}, Lkp2/c;-><init>(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_8

    iget-object v6, v0, Lkp2/e$c$a;->y:Lkp2/e;

    check-cast v4, Lpm0/a$c;

    iget-object v7, v0, Lkp2/e$c$a;->x:Ljava/lang/String;

    invoke-static {v6, v4, v7}, Lkp2/e;->h(Lkp2/e;Lpm0/a$c;Ljava/lang/String;)Lkp2/c;

    move-result-object v7

    :goto_1
    new-instance v4, Lkp2/f$a;

    invoke-direct {v4, v7}, Lkp2/f$a;-><init>(Lkp2/c;)V

    const/4 v6, 0x0

    iput-object v6, v2, Lkp2/e$c$a$a;->y:Ljava/lang/Object;

    iput-object v6, v2, Lkp2/e$c$a$a;->E:Ljava/lang/Object;

    iput-object v6, v2, Lkp2/e$c$a$a;->F:Ljava/lang/Object;

    iput-object v6, v2, Lkp2/e$c$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lkp2/e$c$a$a;->H:I

    iput v5, v2, Lkp2/e$c$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
