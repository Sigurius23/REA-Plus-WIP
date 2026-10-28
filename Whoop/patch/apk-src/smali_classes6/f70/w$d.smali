.class final Lf70/w$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/w;->k(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lf70/e$b;",
        "<anonymous>",
        "(Lbc3/c0;)Lf70/e$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.activation.DeviceEducationFetcher$fetchDeviceEducationV2$result$1"
    f = "DeviceEducationFetcher.kt"
    l = {
        0x2d,
        0x38,
        0x3f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:I

.field N:I

.field O:I

.field P:I

.field Q:J

.field R:I

.field final synthetic S:Lf70/w;

.field final synthetic T:J

.field final synthetic U:Ljava/lang/Integer;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf70/w;JLjava/lang/Integer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/w;",
            "J",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lf70/w$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/w$d;->S:Lf70/w;

    iput-wide p2, p0, Lf70/w$d;->T:J

    iput-object p4, p0, Lf70/w$d;->U:Ljava/lang/Integer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf70/w$d;

    iget-object v1, p0, Lf70/w$d;->S:Lf70/w;

    iget-wide v2, p0, Lf70/w$d;->T:J

    iget-object v4, p0, Lf70/w$d;->U:Ljava/lang/Integer;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lf70/w$d;-><init>(Lf70/w;JLjava/lang/Integer;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lf70/e$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lf70/w$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/w$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf70/w$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf70/w$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v5, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lf70/w$d;->R:I

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v11, :cond_2

    if-eq v0, v10, :cond_1

    if-ne v0, v9, :cond_0

    iget-object v0, v5, Lf70/w$d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, v5, Lf70/w$d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v5, Lf70/w$d;->w:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    move-object v14, v0

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v5, Lf70/w$d;->N:I

    iget v1, v5, Lf70/w$d;->M:I

    iget-object v2, v5, Lf70/w$d;->L:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v3, v5, Lf70/w$d;->K:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v5, Lf70/w$d;->J:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    iget-object v4, v5, Lf70/w$d;->H:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v6, v5, Lf70/w$d;->G:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v5, Lf70/w$d;->F:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v5, Lf70/w$d;->E:Ljava/lang/Object;

    check-cast v7, Lf70/w;

    iget-object v14, v5, Lf70/w$d;->z:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v5, Lf70/w$d;->y:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v5, Lf70/w$d;->x:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v9, v5, Lf70/w$d;->w:Ljava/lang/Object;

    check-cast v9, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v17, v3

    move-object v3, v14

    move-object/from16 v14, p1

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Lf70/w$d;->S:Lf70/w;

    invoke-static {v1}, Lf70/w;->f(Lf70/w;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lf70/w$d$a;

    iget-object v2, v5, Lf70/w$d;->S:Lf70/w;

    invoke-direct {v4, v2, v13}, Lf70/w$d$a;-><init>(Lf70/w;Lq83/d;)V

    iput v11, v5, Lf70/w$d;->R:I

    const/4 v2, 0x0

    const-string v3, "Failed to get device education"

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_c

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;

    invoke-virtual {v0}, Lcom/whoop/activation/domain/models/ActivationFlowDeviceEducationResponse;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    if-eqz v3, :cond_5

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v5, Lf70/w$d;->S:Lf70/w;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v7, v2

    move-object v6, v4

    move-object v2, v1

    move-object v4, v3

    move v1, v12

    move v3, v1

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    invoke-virtual {v9}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->getLottieUrl()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_8

    iput-object v13, v5, Lf70/w$d;->w:Ljava/lang/Object;

    iput-object v2, v5, Lf70/w$d;->x:Ljava/lang/Object;

    iput-object v0, v5, Lf70/w$d;->y:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->z:Ljava/lang/Object;

    iput-object v7, v5, Lf70/w$d;->E:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->F:Ljava/lang/Object;

    iput-object v4, v5, Lf70/w$d;->G:Ljava/lang/Object;

    iput-object v6, v5, Lf70/w$d;->H:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->I:Ljava/lang/Object;

    iput-object v9, v5, Lf70/w$d;->J:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->K:Ljava/lang/Object;

    iput-object v4, v5, Lf70/w$d;->L:Ljava/lang/Object;

    iput v3, v5, Lf70/w$d;->M:I

    iput v1, v5, Lf70/w$d;->N:I

    iput v12, v5, Lf70/w$d;->O:I

    iput v12, v5, Lf70/w$d;->P:I

    iput v10, v5, Lf70/w$d;->R:I

    invoke-static {v7, v14, v5}, Lf70/w;->g(Lf70/w;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_7

    goto/16 :goto_6

    :cond_7
    move v15, v3

    move-object v3, v0

    move v0, v1

    move v1, v15

    move-object v15, v2

    move-object v2, v4

    move-object/from16 v17, v9

    move-object v4, v6

    move-object v6, v2

    :goto_4
    move-object/from16 v22, v14

    check-cast v22, Ljava/lang/String;

    const/16 v30, 0xfef

    const/16 v31, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v17 .. v31}, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;->copy$default(Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v9

    move v14, v1

    move v1, v0

    move-object v0, v3

    move v3, v14

    move v14, v9

    move-object v9, v7

    move-object v7, v4

    move-object v4, v2

    move-object v2, v15

    goto :goto_5

    :cond_8
    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v9

    move v14, v9

    move-object v9, v7

    move-object v7, v6

    move-object v6, v4

    :goto_5
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v6

    move-object v6, v7

    move-object v7, v9

    goto/16 :goto_3

    :cond_9
    check-cast v4, Ljava/util/List;

    iget-object v1, v5, Lf70/w$d;->S:Lf70/w;

    invoke-static {v1}, Lf70/w;->d(Lf70/w;)Ljava/time/Clock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    iget-wide v6, v5, Lf70/w$d;->T:J

    sub-long/2addr v3, v6

    iget-object v1, v5, Lf70/w$d;->S:Lf70/w;

    new-instance v17, Le80/a$c;

    long-to-double v6, v3

    const-string v9, "prefetchEnabled:true"

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v21

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v18, 0x0

    move-wide/from16 v19, v6

    invoke-direct/range {v17 .. v23}, Le80/a$c;-><init>(Ljava/lang/String;DLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v17

    iput-object v13, v5, Lf70/w$d;->w:Ljava/lang/Object;

    iput-object v2, v5, Lf70/w$d;->x:Ljava/lang/Object;

    iput-object v0, v5, Lf70/w$d;->y:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->z:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->E:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->F:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->G:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->H:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->I:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->J:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->K:Ljava/lang/Object;

    iput-object v13, v5, Lf70/w$d;->L:Ljava/lang/Object;

    iput-wide v3, v5, Lf70/w$d;->Q:J

    const/4 v3, 0x3

    iput v3, v5, Lf70/w$d;->R:I

    invoke-static {v1, v6, v5}, Lf70/w;->h(Lf70/w;Le80/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_a

    :goto_6
    return-object v8

    :cond_a
    move-object v1, v2

    goto/16 :goto_0

    :goto_7
    new-instance v13, Lf70/e$b;

    new-instance v15, Ln70/e;

    iget-object v0, v5, Lf70/w$d;->U:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v11

    invoke-static {v0, v12, v2}, Le93/b;->n(III)I

    move-result v12

    :cond_b
    move/from16 v16, v12

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v17

    sget-object v19, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->DEVICE_EDUCATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v31, 0x1fffc

    const/16 v32, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v13 .. v32}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13

    :cond_c
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_e

    check-cast v0, Lu02/a$b;

    invoke-static {v0}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v0

    return-object v0

    :cond_d
    new-instance v6, Lf70/e$b;

    sget-object v11, Lf70/b0;->ERROR:Lf70/b0;

    const v24, 0x1ffef

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

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

    const/16 v23, 0x0

    invoke-direct/range {v6 .. v25}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
