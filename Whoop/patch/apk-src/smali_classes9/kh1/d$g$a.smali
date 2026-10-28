.class public final Lkh1/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh1/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic F:Z

.field final synthetic G:Lkh1/d;

.field final synthetic w:Lec3/m;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkh1/d;)V
    .locals 0

    iput-object p1, p0, Lkh1/d$g$a;->w:Lec3/m;

    iput-object p2, p0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iput-object p5, p0, Lkh1/d$g$a;->E:Ljava/lang/String;

    iput-boolean p6, p0, Lkh1/d$g$a;->F:Z

    iput-object p7, p0, Lkh1/d$g$a;->G:Lkh1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lkh1/d$g$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lkh1/d$g$a$a;

    iget v3, v2, Lkh1/d$g$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lkh1/d$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lkh1/d$g$a$a;

    invoke-direct {v2, v0, v1}, Lkh1/d$g$a$a;-><init>(Lkh1/d$g$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lkh1/d$g$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lkh1/d$g$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lkh1/d$g$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lkh1/d$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lkh1/d$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lkh1/d$g$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    new-instance v8, Lkh1/c;

    iget-object v9, v0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iget-object v10, v0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iget-object v11, v0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iget-object v12, v0, Lkh1/d$g$a;->E:Ljava/lang/String;

    sget-object v13, Lkh1/a$b;->a:Lkh1/a$b;

    const/16 v22, 0x1fe0

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v8 .. v23}, Lkh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_6

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    const-string v8, ""

    if-eqz v6, :cond_5

    new-instance v9, Lkh1/c;

    iget-object v10, v0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iget-object v11, v0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iget-object v12, v0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iget-object v13, v0, Lkh1/d$g$a;->E:Ljava/lang/String;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    move-object/from16 v18, v8

    goto :goto_1

    :cond_4
    move-object/from16 v18, v4

    :goto_1
    iget-boolean v4, v0, Lkh1/d$g$a;->F:Z

    const/16 v23, 0x18d0

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v19, v4

    invoke-direct/range {v9 .. v24}, Lkh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move-object v8, v9

    goto/16 :goto_6

    :cond_5
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_8

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v6}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_6

    move-object/from16 v18, v8

    goto :goto_3

    :cond_6
    move-object/from16 v18, v6

    :goto_3
    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getCountrySelector()Lcom/whoop/design/models/items/CountrySelectorModel;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CountrySelectorModel;->getSelectedCountry()Lcom/whoop/design/models/items/CountryModel;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CountryModel;->getAlpha3()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v16, v4

    goto :goto_4

    :cond_7
    move-object/from16 v16, v7

    :goto_4
    new-instance v9, Lkh1/c;

    iget-object v10, v0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iget-object v11, v0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iget-object v12, v0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iget-object v13, v0, Lkh1/d$g$a;->E:Ljava/lang/String;

    const/16 v23, 0x1e90

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v9 .. v24}, Lkh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_8
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_a

    new-instance v9, Lkh1/c;

    iget-object v10, v0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iget-object v11, v0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iget-object v12, v0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iget-object v13, v0, Lkh1/d$g$a;->E:Ljava/lang/String;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;

    invoke-virtual {v4}, Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_9

    move-object/from16 v18, v8

    goto :goto_5

    :cond_9
    move-object/from16 v18, v4

    :goto_5
    const/16 v23, 0x1ed0

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v9 .. v24}, Lkh1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_a
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_c

    iget-object v6, v0, Lkh1/d$g$a;->G:Lkh1/d;

    check-cast v4, Lpm0/a$c;

    invoke-static {v6, v4}, Lkh1/d;->d(Lkh1/d;Lpm0/a$c;)Lkh1/c;

    move-result-object v8

    iget-object v9, v0, Lkh1/d$g$a;->x:Ljava/lang/String;

    iget-object v10, v0, Lkh1/d$g$a;->y:Ljava/lang/String;

    iget-object v11, v0, Lkh1/d$g$a;->z:Ljava/lang/String;

    iget-object v12, v0, Lkh1/d$g$a;->E:Ljava/lang/String;

    const/16 v22, 0x1ff0

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v8 .. v23}, Lkh1/c;->b(Lkh1/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/a;Lcom/whoop/gifting/feature/gifting/domain/models/GiftingModels;Ljava/lang/String;ILjava/lang/String;ZZZLnh1/a;ILjava/lang/Object;)Lkh1/c;

    move-result-object v8

    :goto_6
    iput-object v7, v2, Lkh1/d$g$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lkh1/d$g$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lkh1/d$g$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lkh1/d$g$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lkh1/d$g$a$a;->H:I

    iput v5, v2, Lkh1/d$g$a$a;->x:I

    invoke-interface {v1, v8, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    return-object v3

    :cond_b
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
