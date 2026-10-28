.class public final Lzu1/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu1/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Lzu1/d;

.field final synthetic w:Lec3/m;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;Ljava/lang/String;ZLzu1/d;)V
    .locals 0

    iput-object p1, p0, Lzu1/d$g$a;->w:Lec3/m;

    iput-object p2, p0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lzu1/d$g$a;->y:Ljava/lang/String;

    iput-boolean p4, p0, Lzu1/d$g$a;->z:Z

    iput-object p5, p0, Lzu1/d$g$a;->E:Lzu1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lzu1/d$g$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lzu1/d$g$a$a;

    iget v3, v2, Lzu1/d$g$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lzu1/d$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lzu1/d$g$a$a;

    invoke-direct {v2, v0, v1}, Lzu1/d$g$a$a;-><init>(Lzu1/d$g$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lzu1/d$g$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lzu1/d$g$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lzu1/d$g$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lzu1/d$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lzu1/d$g$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lzu1/d$g$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v6, v4, Lpm0/a$e;

    if-eqz v6, :cond_3

    sget-object v10, Lzu1/a$b;->a:Lzu1/a$b;

    new-instance v7, Lzu1/c;

    iget-object v8, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iget-object v9, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    const/16 v15, 0x78

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lzu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    :cond_3
    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_4

    check-cast v4, Lpm0/a$a$b;

    invoke-virtual {v4}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    new-instance v6, Lzu1/c;

    iget-object v7, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iget-object v8, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    iget-boolean v12, v0, Lzu1/d$g$a;->z:Z

    const/16 v14, 0x14

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v6 .. v15}, Lzu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v7, v6

    goto/16 :goto_2

    :cond_4
    instance-of v6, v4, Lpm0/a$a$a;

    if-eqz v6, :cond_7

    iget-boolean v6, v0, Lzu1/d$g$a;->z:Z

    if-nez v6, :cond_5

    iget-object v6, v0, Lzu1/d$g$a;->E:Lzu1/d;

    invoke-static {v6}, Lzu1/d;->c(Lzu1/d;)Lxu1/a;

    move-result-object v6

    new-instance v7, Lcv1/a$h;

    iget-object v8, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iget-object v9, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    iget-object v10, v0, Lzu1/d$g$a;->E:Lzu1/d;

    move-object v11, v4

    check-cast v11, Lpm0/a$a$a;

    invoke-virtual {v11}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    invoke-virtual {v11}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getSections()Ljava/util/List;

    move-result-object v11

    invoke-static {v10, v11}, Lzu1/d;->d(Lzu1/d;Ljava/util/List;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v7, v8, v9, v10}, Lcv1/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lxu1/a;->b(Lcv1/a$a;)V

    :cond_5
    new-instance v11, Lzu1/c;

    iget-object v12, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iget-object v13, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    check-cast v4, Lpm0/a$a$a;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    invoke-virtual {v4}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    invoke-virtual {v4}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getPreSelectedId()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v4, ""

    :cond_6
    move-object/from16 v16, v4

    const/16 v19, 0x64

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v20}, Lzu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v11

    goto :goto_2

    :cond_7
    instance-of v6, v4, Lpm0/a$d;

    if-eqz v6, :cond_8

    check-cast v4, Lpm0/a$d;

    invoke-virtual {v4}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    new-instance v6, Lzu1/c;

    iget-object v7, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    iget-object v8, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    const/16 v14, 0x74

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lzu1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lzu1/a;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_8
    instance-of v6, v4, Lpm0/a$c;

    if-eqz v6, :cond_a

    iget-object v6, v0, Lzu1/d$g$a;->E:Lzu1/d;

    check-cast v4, Lpm0/a$c;

    iget-object v7, v0, Lzu1/d$g$a;->y:Ljava/lang/String;

    iget-object v8, v0, Lzu1/d$g$a;->x:Ljava/lang/String;

    invoke-static {v6, v4, v7, v8}, Lzu1/d;->f(Lzu1/d;Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzu1/c;

    move-result-object v7

    :goto_2
    const/4 v4, 0x0

    iput-object v4, v2, Lzu1/d$g$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Lzu1/d$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Lzu1/d$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Lzu1/d$g$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lzu1/d$g$a$a;->H:I

    iput v5, v2, Lzu1/d$g$a$a;->x:I

    invoke-interface {v1, v7, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    return-object v3

    :cond_9
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_a
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
