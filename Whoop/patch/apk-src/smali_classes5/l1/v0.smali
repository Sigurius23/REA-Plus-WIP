.class public final Ll1/v0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/a;Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;ILq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ll1/v0;->w:I

    .line 1
    iput-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    iput-object p2, p0, Ll1/v0;->E:Ljava/lang/Object;

    iput-object p3, p0, Ll1/v0;->F:Ljava/lang/Object;

    iput p4, p0, Ll1/v0;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln0/u;ILi93/j;Lm1/r;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ll1/v0;->w:I

    .line 2
    iput-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    iput p2, p0, Ll1/v0;->y:I

    iput-object p3, p0, Ll1/v0;->E:Ljava/lang/Object;

    iput-object p4, p0, Ll1/v0;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lt30/g;Lr30/d;ILq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ll1/v0;->w:I

    .line 3
    iput-object p1, p0, Ll1/v0;->E:Ljava/lang/Object;

    iput-object p2, p0, Ll1/v0;->F:Ljava/lang/Object;

    iput p3, p0, Ll1/v0;->y:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lyo1/b;Ljava/lang/Iterable;ILab/i0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ll1/v0;->w:I

    .line 4
    iput-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    iput-object p2, p0, Ll1/v0;->E:Ljava/lang/Object;

    iput p3, p0, Ll1/v0;->y:I

    iput-object p4, p0, Ll1/v0;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Ll1/v0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ll1/v0;

    iget-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lyo1/b;

    iget-object p1, p0, Ll1/v0;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    iget-object p1, p0, Ll1/v0;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lab/i0;

    iget v4, p0, Ll1/v0;->y:I

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll1/v0;-><init>(Lyo1/b;Ljava/lang/Iterable;ILab/i0;Lq83/d;)V

    return-object v1

    :pswitch_0
    move-object v7, p2

    new-instance v2, Ll1/v0;

    iget-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/a;

    iget-object p1, p0, Ll1/v0;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Ll1/v0;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    iget v6, p0, Ll1/v0;->y:I

    invoke-direct/range {v2 .. v7}, Ll1/v0;-><init>(Lcom/amplitude/android/engagement/a;Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;ILq83/d;)V

    return-object v2

    :pswitch_1
    move-object v7, p2

    new-instance p2, Ll1/v0;

    iget-object v0, p0, Ll1/v0;->E:Ljava/lang/Object;

    check-cast v0, Lt30/g;

    iget-object v1, p0, Ll1/v0;->F:Ljava/lang/Object;

    check-cast v1, Lr30/d;

    iget v2, p0, Ll1/v0;->y:I

    invoke-direct {p2, v0, v1, v2, v7}, Ll1/v0;-><init>(Lt30/g;Lr30/d;ILq83/d;)V

    iput-object p1, p2, Ll1/v0;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_2
    move-object v7, p2

    new-instance v2, Ll1/v0;

    iget-object p1, p0, Ll1/v0;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ln0/u;

    iget-object p1, p0, Ll1/v0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Li93/j;

    iget-object p1, p0, Ll1/v0;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lm1/r;

    iget v4, p0, Ll1/v0;->y:I

    invoke-direct/range {v2 .. v7}, Ll1/v0;-><init>(Ln0/u;ILi93/j;Lm1/r;Lq83/d;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll1/v0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/lifecycle/q0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Ll1/v0;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x1

    iget v8, v0, Ll1/v0;->y:I

    iget-object v9, v0, Ll1/v0;->F:Ljava/lang/Object;

    iget-object v10, v0, Ll1/v0;->E:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v13, v10

    check-cast v13, Ljava/lang/Iterable;

    iget-object v1, v0, Ll1/v0;->z:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lyo1/b;

    move-object v15, v9

    check-cast v15, Lab/i0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll1/v0;->x:I

    if-eqz v2, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lyo1/b;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyy/n0;

    iget v3, v2, Lyy/n0;->a:I

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-static {v13, v5}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-lez v8, :cond_5

    iget-object v2, v15, Lab/i0;->F:Ljava/lang/Object;

    check-cast v2, Lqy/d;

    const-string v5, ". Retrying up to "

    const-string v6, " more time(s)."

    const-string v9, "Request failed with code "

    invoke-static {v3, v8, v9, v5, v6}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lqy/d;->c(Ljava/lang/String;)V

    iget-object v2, v15, Lab/i0;->E:Ljava/lang/Object;

    check-cast v2, Lyy/g0;

    invoke-interface {v2, v8}, Lyy/g0;->a(I)J

    move-result-wide v2

    iput v7, v0, Ll1/v0;->x:I

    invoke-static {v2, v3, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    add-int/lit8 v14, v8, -0x1

    iput v4, v0, Ll1/v0;->x:I

    iget-object v2, v15, Lab/i0;->y:Ljava/lang/Object;

    check-cast v2, Lq83/j;

    new-instance v11, Ll1/v0;

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Ll1/v0;-><init>(Lyo1/b;Ljava/lang/Iterable;ILab/i0;Lq83/d;)V

    invoke-static {v2, v11, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v1, v2

    check-cast v1, Lyy/n0;

    goto :goto_2

    :cond_5
    move-object v1, v2

    :goto_2
    return-object v1

    :pswitch_0
    check-cast v9, Lp1/c1;

    iget-object v1, v0, Ll1/v0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/a;

    check-cast v10, Lcom/amplitude/android/engagement/types/Nudge;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v11, v0, Ll1/v0;->x:I

    if-eqz v11, :cond_7

    if-ne v11, v7, :cond_6

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v6

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Llj/e0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v13, Lhj/t;

    invoke-direct {v13, v6, v11}, Lhj/t;-><init>(ILlj/e0;)V

    invoke-virtual {v12, v13}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    if-eqz v11, :cond_8

    invoke-virtual {v11}, Llj/e0;->toJSONString()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_9

    :cond_8
    const-string v11, "undefined"

    :cond_9
    iget-object v12, v1, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "globalThis.nudgeActions.updateSurveyResponse("

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x29

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6, v3}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_14

    sget-object v6, Ltj/b;->a:Lp1/b0;

    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/NudgeStep;->getContent()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_a
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v13, v12, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-nez v13, :cond_b

    instance-of v12, v12, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v12, :cond_a

    :cond_b
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_d
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Lcom/amplitude/android/engagement/types/ButtonBlock;

    if-eqz v12, :cond_d

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_e
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ne v9, v7, :cond_11

    invoke-static {v8}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/amplitude/android/engagement/types/ContentBlock;

    instance-of v9, v8, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-eqz v9, :cond_f

    check-cast v8, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v8

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getListType()Ljava/lang/String;

    move-result-object v8

    const-string v9, "single"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    goto :goto_5

    :cond_f
    instance-of v8, v8, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    if-eqz v8, :cond_10

    move v8, v7

    goto :goto_5

    :cond_10
    move v8, v2

    :goto_5
    if-eqz v8, :cond_11

    move v8, v7

    goto :goto_6

    :cond_11
    move v8, v2

    :goto_6
    if-eqz v8, :cond_12

    if-eqz v6, :cond_12

    move v2, v7

    :cond_12
    if-eqz v2, :cond_14

    iput v7, v0, Ll1/v0;->x:I

    const-wide/16 v8, 0xc8

    invoke-static {v8, v9, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_13

    move-object v5, v4

    goto :goto_8

    :cond_13
    :goto_7
    invoke-virtual {v10}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    new-instance v4, Lcom/amplitude/android/engagement/types/StepForwardAction;

    invoke-direct {v4, v3, v7, v3}, Lcom/amplitude/android/engagement/types/StepForwardAction;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/amplitude/android/engagement/types/ButtonMeta;

    const/16 v14, 0x1f

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/amplitude/android/engagement/types/ButtonMeta;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2, v4, v8}, Lcom/amplitude/android/engagement/a;->c(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V

    :cond_14
    :goto_8
    return-object v5

    :pswitch_1
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll1/v0;->x:I

    if-eqz v2, :cond_17

    if-eq v2, v7, :cond_16

    if-ne v2, v4, :cond_15

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_15
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    iget-object v2, v0, Ll1/v0;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/q0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto/16 :goto_c

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ll1/v0;->z:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/q0;

    check-cast v10, Lt30/g;

    iget-object v6, v10, Lt30/g;->z:Lq30/w0;

    check-cast v9, Lr30/d;

    if-eqz v9, :cond_1f

    iget-object v10, v9, Lr30/d;->x:Ljava/lang/String;

    iget-object v11, v9, Lr30/d;->y:Ljava/lang/String;

    iget-object v9, v9, Lr30/d;->w:Ljava/lang/String;

    const/16 v12, 0xa0

    if-gt v8, v12, :cond_18

    move-object v8, v9

    goto :goto_9

    :cond_18
    const/16 v12, 0x140

    if-lt v8, v12, :cond_19

    move-object v8, v11

    goto :goto_9

    :cond_19
    move-object v8, v10

    :goto_9
    if-eqz v8, :cond_1a

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_1b

    :cond_1a
    move-object v8, v3

    :cond_1b
    if-nez v8, :cond_20

    filled-new-array {v11, v10, v9}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1c
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_1c

    invoke-static {v10}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_1e

    goto :goto_a

    :cond_1d
    move-object v9, v3

    :cond_1e
    move-object v8, v9

    check-cast v8, Ljava/lang/String;

    goto :goto_b

    :cond_1f
    move-object v8, v3

    :cond_20
    :goto_b
    iput-object v2, v0, Ll1/v0;->z:Ljava/lang/Object;

    iput v7, v0, Ll1/v0;->x:I

    iget-object v7, v6, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v7, Lq83/j;

    new-instance v9, Lp33/m;

    const/4 v10, 0x7

    invoke-direct {v9, v8, v6, v3, v10}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v7, v9, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_21

    goto :goto_d

    :cond_21
    :goto_c
    iput-object v3, v0, Ll1/v0;->z:Ljava/lang/Object;

    iput v4, v0, Ll1/v0;->x:I

    check-cast v2, Landroidx/lifecycle/r0;

    invoke-virtual {v2, v6, v0}, Landroidx/lifecycle/r0;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_22

    :goto_d
    move-object v5, v1

    :cond_22
    :goto_e
    return-object v5

    :pswitch_2
    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v3, v0, Ll1/v0;->x:I

    if-eqz v3, :cond_24

    if-ne v3, v7, :cond_23

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_23
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Ll1/v0;->z:Ljava/lang/Object;

    check-cast v3, Ln0/u;

    check-cast v10, Li93/j;

    iget v4, v10, Li93/h;->w:I

    sub-int/2addr v8, v4

    mul-int/lit8 v8, v8, 0xc

    check-cast v9, Lm1/r;

    iget v4, v9, Lm1/r;->b:I

    add-int/2addr v8, v4

    sub-int/2addr v8, v7

    iput v7, v0, Ll1/v0;->x:I

    sget-object v4, Ln0/u;->x:Lp0/n0;

    invoke-virtual {v3, v8, v2, v0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_25

    move-object v5, v1

    :cond_25
    :goto_f
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
