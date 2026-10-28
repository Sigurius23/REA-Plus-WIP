.class public final Lgc0/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc0/d$d;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic y:Lgc0/d;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;Lgc0/d;)V
    .locals 0

    iput-object p1, p0, Lgc0/d$d$a;->w:Lec3/m;

    iput-object p2, p0, Lgc0/d$d$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lgc0/d$d$a;->y:Lgc0/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lgc0/d$d$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lgc0/d$d$a$a;

    iget v3, v2, Lgc0/d$d$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lgc0/d$d$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lgc0/d$d$a$a;

    invoke-direct {v2, v0, v1}, Lgc0/d$d$a$a;-><init>(Lgc0/d$d$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lgc0/d$d$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lgc0/d$d$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lgc0/d$d$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lgc0/d$d$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lgc0/d$d$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lgc0/d$d$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    sget-object v4, Lgc0/c$b;->a:Lgc0/c$b;

    goto/16 :goto_2

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    const/4 v8, 0x2

    if-eqz v6, :cond_6

    new-instance v9, Lgc0/c$f;

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    new-instance v11, Lgc0/e;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getIntakeScreens()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializerKt;->toHormonalContextScreenId(Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_4
    sget-object v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->LIFE_STAGE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    :cond_5
    invoke-direct {v11, v4, v7, v8, v7}, Lgc0/e;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lgc0/b;

    iget-object v13, v0, Lgc0/d$d$a;->x:Ljava/lang/String;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lgc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x8

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lgc0/c$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v4, v9

    goto/16 :goto_2

    :cond_6
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_9

    new-instance v9, Lgc0/c$f;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    new-instance v11, Lgc0/e;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getIntakeScreens()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-static {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializerKt;->toHormonalContextScreenId(Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v4

    if-nez v4, :cond_8

    :cond_7
    sget-object v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->LIFE_STAGE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    :cond_8
    invoke-direct {v11, v4, v7, v8, v7}, Lgc0/e;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lgc0/b;

    iget-object v13, v0, Lgc0/d$d$a;->x:Ljava/lang/String;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lgc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x8

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lgc0/c$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_9
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_c

    new-instance v9, Lgc0/c$f;

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v10, v6

    check-cast v10, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    new-instance v11, Lgc0/e;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;->getIntakeScreens()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {v4}, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenSerializerKt;->toHormonalContextScreenId(Ljava/lang/String;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    move-result-object v4

    if-nez v4, :cond_b

    :cond_a
    sget-object v4, Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;->LIFE_STAGE:Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;

    :cond_b
    invoke-direct {v11, v4, v7, v8, v7}, Lgc0/e;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lgc0/b;

    iget-object v13, v0, Lgc0/d$d$a;->x:Ljava/lang/String;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lgc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x8

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lgc0/c$f;-><init>(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_c
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_e

    iget-object v6, v0, Lgc0/d$d$a;->y:Lgc0/d;

    check-cast v4, Lpm0/a$c;

    iget-object v8, v0, Lgc0/d$d$a;->x:Ljava/lang/String;

    invoke-static {v6, v4, v8}, Lgc0/d;->g(Lgc0/d;Lpm0/a$c;Ljava/lang/String;)Lgc0/c$a;

    move-result-object v4

    :goto_2
    iput-object v7, v2, Lgc0/d$d$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lgc0/d$d$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lgc0/d$d$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lgc0/d$d$a$a;->G:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, v2, Lgc0/d$d$a$a;->H:I

    iput v5, v2, Lgc0/d$d$a$a;->x:I

    invoke-interface {v1, v4, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    return-object v3

    :cond_d
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
