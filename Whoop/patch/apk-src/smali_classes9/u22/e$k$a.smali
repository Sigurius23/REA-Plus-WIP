.class public final Lu22/e$k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu22/e$k;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Z

.field final synthetic y:Lu22/e;


# direct methods
.method public constructor <init>(Lec3/m;ZLu22/e;)V
    .locals 0

    iput-object p1, p0, Lu22/e$k$a;->w:Lec3/m;

    iput-boolean p2, p0, Lu22/e$k$a;->x:Z

    iput-object p3, p0, Lu22/e$k$a;->y:Lu22/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lu22/e$k$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lu22/e$k$a$a;

    iget v3, v2, Lu22/e$k$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lu22/e$k$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lu22/e$k$a$a;

    invoke-direct {v2, v0, v1}, Lu22/e$k$a$a;-><init>(Lu22/e$k$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lu22/e$k$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lu22/e$k$a$a;->x:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lu22/e$k$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lu22/e$k$a$a;->K:I

    iget-object v6, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v7, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lu22/e$k$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v4, v2, Lu22/e$k$a$a;->K:I

    iget-object v6, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v7, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lu22/e$k$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_4
    iget v4, v2, Lu22/e$k$a$a;->K:I

    iget-object v6, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v7, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    iget-object v7, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    check-cast v7, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lu22/e$k$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lu22/e$k$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v10, v4, Lpm0/a$e;

    const/4 v11, 0x0

    if-eqz v10, :cond_6

    new-instance v12, Lu22/d;

    sget-object v13, Lu22/b$c;->a:Lu22/b$c;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lu22/d;-><init>(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_7

    :cond_6
    instance-of v10, v4, Lpm0/a$a$b;

    if-eqz v10, :cond_7

    new-instance v12, Lu22/d;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    iget-boolean v15, v0, Lu22/e$k$a;->x:Z

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-static {v4}, Lu22/f;->a(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z

    move-result v18

    const/16 v19, 0x11

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v20}, Lu22/d;-><init>(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_7

    :cond_7
    instance-of v10, v4, Lpm0/a$a$a;

    if-eqz v10, :cond_9

    iget-object v6, v0, Lu22/e$k$a;->y:Lu22/e;

    invoke-static {v6}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object v6

    sget-object v7, Lt22/d;->a:Lt22/d;

    invoke-virtual {v7}, Lt22/d;->b()Ljy1/a;

    move-result-object v7

    iput-object v9, v2, Lu22/e$k$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    iput-object v4, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lu22/e$k$a$a;->K:I

    iput v11, v2, Lu22/e$k$a$a;->L:I

    iput v8, v2, Lu22/e$k$a$a;->x:I

    invoke-interface {v6, v7, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_8

    goto/16 :goto_8

    :cond_8
    move-object v7, v1

    move-object v6, v4

    move v4, v11

    :goto_1
    new-instance v10, Lu22/d;

    check-cast v6, Lpm0/a$a$a;

    invoke-virtual {v6}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-virtual {v6}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-static {v1}, Lu22/f;->a(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z

    move-result v16

    const/16 v17, 0x1d

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v18}, Lu22/d;-><init>(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move v11, v4

    move-object v1, v7

    move-object v12, v10

    goto/16 :goto_7

    :cond_9
    instance-of v8, v4, Lpm0/a$d;

    const-string v10, "network"

    const-string v12, "http"

    if-eqz v8, :cond_d

    iget-object v6, v0, Lu22/e$k$a;->y:Lu22/e;

    invoke-static {v6}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object v6

    sget-object v8, Lt22/d;->a:Lt22/d;

    move-object v13, v4

    check-cast v13, Lpm0/a$b;

    invoke-static {v13}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v14

    if-eqz v14, :cond_a

    move-object v10, v12

    :cond_a
    invoke-static {v13}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v12

    if-eqz v12, :cond_b

    move-object v12, v4

    check-cast v12, Lpm0/a$d;

    invoke-virtual {v12}, Lpm0/a$d;->b()I

    move-result v12

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v12}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_3

    :cond_b
    move-object v13, v9

    :goto_3
    invoke-virtual {v8, v10, v13}, Lt22/d;->a(Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;

    move-result-object v8

    iput-object v9, v2, Lu22/e$k$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    iput-object v4, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lu22/e$k$a$a;->K:I

    iput v11, v2, Lu22/e$k$a$a;->L:I

    iput v7, v2, Lu22/e$k$a$a;->x:I

    invoke-interface {v6, v8, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_c

    goto/16 :goto_8

    :cond_c
    move-object v7, v1

    move-object v6, v4

    move v4, v11

    :goto_4
    new-instance v10, Lu22/d;

    check-cast v6, Lpm0/a$d;

    invoke-virtual {v6}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-virtual {v6}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;

    invoke-static {v1}, Lu22/f;->a(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;)Z

    move-result v16

    const/16 v17, 0x1d

    const/16 v18, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v18}, Lu22/d;-><init>(Lu22/b;Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementModels;ZZLx22/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_d
    instance-of v7, v4, Lpm0/a$c;

    if-eqz v7, :cond_12

    iget-object v7, v0, Lu22/e$k$a;->y:Lu22/e;

    invoke-static {v7}, Lu22/e;->h(Lu22/e;)Liy1/c;

    move-result-object v7

    sget-object v8, Lt22/d;->a:Lt22/d;

    move-object v13, v4

    check-cast v13, Lpm0/a$b;

    invoke-static {v13}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v14

    if-eqz v14, :cond_e

    move-object v10, v12

    :cond_e
    invoke-static {v13}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result v12

    if-eqz v12, :cond_f

    move-object v12, v4

    check-cast v12, Lpm0/a$c;

    invoke-virtual {v12}, Lpm0/a$c;->b()I

    move-result v12

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v12}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_5

    :cond_f
    move-object v13, v9

    :goto_5
    invoke-virtual {v8, v10, v13}, Lt22/d;->a(Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;

    move-result-object v8

    iput-object v9, v2, Lu22/e$k$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    iput-object v4, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lu22/e$k$a$a;->K:I

    iput v11, v2, Lu22/e$k$a$a;->L:I

    iput v6, v2, Lu22/e$k$a$a;->x:I

    invoke-interface {v7, v8, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_10

    goto :goto_8

    :cond_10
    move-object v7, v1

    move-object v6, v4

    move v4, v11

    :goto_6
    iget-object v1, v0, Lu22/e$k$a;->y:Lu22/e;

    check-cast v6, Lpm0/a$c;

    invoke-static {v1, v6}, Lu22/e;->k(Lu22/e;Lpm0/a$c;)Lu22/d;

    move-result-object v12

    move v11, v4

    move-object v1, v7

    :goto_7
    iput-object v9, v2, Lu22/e$k$a$a;->y:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->E:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->F:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->G:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->H:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->I:Ljava/lang/Object;

    iput-object v9, v2, Lu22/e$k$a$a;->J:Ljava/lang/Object;

    iput v11, v2, Lu22/e$k$a$a;->K:I

    iput v5, v2, Lu22/e$k$a$a;->x:I

    invoke-interface {v1, v12, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_11

    :goto_8
    return-object v3

    :cond_11
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_12
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
