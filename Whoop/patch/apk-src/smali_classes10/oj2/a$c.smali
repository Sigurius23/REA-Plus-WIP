.class final Loj2/a$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loj2/a;->l(Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/HoldingFrame;DDLo81/a;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lnj2/t;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.util.BreathingAnimationHelper$segmentedAnimation$1"
    f = "BreathingAnimationHelper.kt"
    l = {
        0x5e,
        0x5f,
        0x6a,
        0x74
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

.field J:J

.field K:D

.field L:D

.field M:I

.field N:I

.field O:I

.field private synthetic P:Ljava/lang/Object;

.field final synthetic Q:Lcom/whoop/stress/domain/model/StressIntervention;

.field final synthetic R:Lcom/whoop/stress/domain/model/HoldingFrame;

.field final synthetic S:Loj2/a;

.field final synthetic T:D

.field final synthetic U:Lo81/a;

.field final synthetic V:D

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/HoldingFrame;Loj2/a;DLo81/a;DLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressIntervention;",
            "Lcom/whoop/stress/domain/model/HoldingFrame;",
            "Loj2/a;",
            "D",
            "Lo81/a;",
            "D",
            "Lq83/d<",
            "-",
            "Loj2/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loj2/a$c;->Q:Lcom/whoop/stress/domain/model/StressIntervention;

    iput-object p2, p0, Loj2/a$c;->R:Lcom/whoop/stress/domain/model/HoldingFrame;

    iput-object p3, p0, Loj2/a$c;->S:Loj2/a;

    iput-wide p4, p0, Loj2/a$c;->T:D

    iput-object p6, p0, Loj2/a$c;->U:Lo81/a;

    iput-wide p7, p0, Loj2/a$c;->V:D

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Loj2/a$c;

    iget-object v1, p0, Loj2/a$c;->Q:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v2, p0, Loj2/a$c;->R:Lcom/whoop/stress/domain/model/HoldingFrame;

    iget-object v3, p0, Loj2/a$c;->S:Loj2/a;

    iget-wide v4, p0, Loj2/a$c;->T:D

    iget-object v6, p0, Loj2/a$c;->U:Lo81/a;

    iget-wide v7, p0, Loj2/a$c;->V:D

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Loj2/a$c;-><init>(Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/HoldingFrame;Loj2/a;DLo81/a;DLq83/d;)V

    iput-object p1, v0, Loj2/a$c;->P:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loj2/a$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loj2/a$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loj2/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loj2/a$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Loj2/a$c;->P:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Loj2/a$c;->O:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    iget-wide v3, v0, Loj2/a$c;->J:J

    iget-object v7, v0, Loj2/a$c;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v0, Loj2/a$c;->w:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/d0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move-wide v14, v3

    move v2, v5

    move v3, v6

    const/4 v11, 0x0

    :cond_0
    move-object/from16 v19, v7

    goto/16 :goto_7

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-wide v3, v0, Loj2/a$c;->J:J

    iget-object v7, v0, Loj2/a$c;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v0, Loj2/a$c;->w:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/d0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move-wide v14, v3

    move v3, v6

    const/4 v11, 0x0

    goto/16 :goto_5

    :cond_3
    iget v3, v0, Loj2/a$c;->M:I

    iget-wide v10, v0, Loj2/a$c;->L:D

    iget-wide v12, v0, Loj2/a$c;->K:D

    iget-wide v14, v0, Loj2/a$c;->J:J

    iget-object v5, v0, Loj2/a$c;->I:Ljava/lang/Object;

    check-cast v5, Lnj2/t;

    iget-object v5, v0, Loj2/a$c;->H:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    iget-object v5, v0, Loj2/a$c;->F:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Loj2/a$c;->E:Ljava/lang/Object;

    check-cast v6, Lo81/a;

    iget-object v7, v0, Loj2/a$c;->z:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v8, v0, Loj2/a$c;->y:Ljava/lang/Object;

    check-cast v8, Loj2/a;

    iget-object v4, v0, Loj2/a$c;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Iterable;

    iget-object v4, v0, Loj2/a$c;->w:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/d0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move-object v2, v7

    move-wide/from16 v17, v12

    move-object v13, v6

    move-wide v11, v10

    move-wide v6, v14

    move v15, v3

    move-object v3, v1

    const/4 v1, 0x2

    goto/16 :goto_2

    :cond_4
    iget v3, v0, Loj2/a$c;->N:I

    iget v4, v0, Loj2/a$c;->M:I

    iget-wide v5, v0, Loj2/a$c;->L:D

    iget-wide v7, v0, Loj2/a$c;->K:D

    iget-wide v10, v0, Loj2/a$c;->J:J

    iget-object v12, v0, Loj2/a$c;->I:Ljava/lang/Object;

    check-cast v12, Lnj2/t;

    iget-object v12, v0, Loj2/a$c;->H:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    iget-object v13, v0, Loj2/a$c;->F:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v0, Loj2/a$c;->E:Ljava/lang/Object;

    check-cast v14, Lo81/a;

    iget-object v15, v0, Loj2/a$c;->z:Ljava/lang/Object;

    check-cast v15, Lcom/whoop/stress/domain/model/StressIntervention;

    iget-object v9, v0, Loj2/a$c;->y:Ljava/lang/Object;

    check-cast v9, Loj2/a;

    move-object/from16 v16, v1

    iget-object v1, v0, Loj2/a$c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v1, v0, Loj2/a$c;->w:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/d0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 p1, v16

    move/from16 v16, v3

    move-object/from16 v3, p1

    move-object/from16 p1, v2

    move-wide/from16 v17, v5

    move-object v6, v1

    move-wide v1, v7

    move-object v8, v9

    move-object v7, v15

    move v15, v4

    move-wide v4, v10

    goto/16 :goto_1

    :cond_5
    move-object/from16 v16, v1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, v0, Loj2/a$c;->Q:Lcom/whoop/stress/domain/model/StressIntervention;

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressIntervention;->getFrames()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    iget-object v4, v0, Loj2/a$c;->S:Loj2/a;

    iget-object v5, v0, Loj2/a$c;->Q:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-wide v6, v0, Loj2/a$c;->T:D

    iget-wide v8, v0, Loj2/a$c;->V:D

    iget-object v10, v0, Loj2/a$c;->U:Lo81/a;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v11, 0x0

    move-object v13, v10

    const/4 v15, 0x0

    move-object/from16 v24, v4

    move-object v4, v3

    move-object/from16 v3, v16

    move-object/from16 v25, v5

    move-object/from16 v5, v24

    move-wide/from16 v26, v8

    move-object/from16 v8, v25

    move-wide v9, v6

    move-wide v6, v11

    move-wide/from16 v11, v26

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/stress/domain/model/StressInterventionFrame;

    move-wide/from16 v16, v6

    iget v7, v1, Lkotlin/jvm/internal/d0;->w:F

    move-object v6, v14

    const/4 v14, 0x0

    move-wide/from16 v18, v16

    invoke-static/range {v5 .. v14}, Loj2/a;->a(Loj2/a;Lcom/whoop/stress/domain/model/StressInterventionFrame;FLcom/whoop/stress/domain/model/StressIntervention;DDLo81/a;Ljava/lang/Integer;)Lnj2/t;

    move-result-object v7

    iget v14, v1, Lkotlin/jvm/internal/d0;->w:F

    move/from16 v17, v14

    move/from16 v16, v15

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->getTime()J

    move-result-wide v14

    long-to-float v14, v14

    add-float v14, v17, v14

    iput v14, v1, Lkotlin/jvm/internal/d0;->w:F

    iput-object v3, v0, Loj2/a$c;->P:Ljava/lang/Object;

    iput-object v1, v0, Loj2/a$c;->w:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v0, Loj2/a$c;->x:Ljava/lang/Object;

    iput-object v5, v0, Loj2/a$c;->y:Ljava/lang/Object;

    iput-object v8, v0, Loj2/a$c;->z:Ljava/lang/Object;

    iput-object v13, v0, Loj2/a$c;->E:Ljava/lang/Object;

    iput-object v4, v0, Loj2/a$c;->F:Ljava/lang/Object;

    iput-object v14, v0, Loj2/a$c;->G:Ljava/lang/Object;

    iput-object v6, v0, Loj2/a$c;->H:Ljava/lang/Object;

    iput-object v14, v0, Loj2/a$c;->I:Ljava/lang/Object;

    move-wide/from16 v14, v18

    iput-wide v14, v0, Loj2/a$c;->J:J

    iput-wide v9, v0, Loj2/a$c;->K:D

    iput-wide v11, v0, Loj2/a$c;->L:D

    move-object/from16 v17, v1

    move/from16 v1, v16

    iput v1, v0, Loj2/a$c;->M:I

    const/4 v1, 0x0

    iput v1, v0, Loj2/a$c;->N:I

    const/4 v1, 0x1

    iput v1, v0, Loj2/a$c;->O:I

    invoke-interface {v3, v7, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_6

    move-object v9, v2

    goto/16 :goto_6

    :cond_6
    move-wide/from16 v24, v11

    move-object v12, v6

    move-object/from16 v6, v17

    move-wide/from16 v17, v24

    move-object/from16 p1, v2

    move-object v7, v8

    move-wide v1, v9

    move-object v8, v5

    move-object/from16 v24, v13

    move-object v13, v4

    move-wide v4, v14

    move/from16 v15, v16

    const/16 v16, 0x0

    move-object/from16 v14, v24

    :goto_1
    invoke-virtual {v12}, Lcom/whoop/stress/domain/model/StressInterventionFrame;->getTime()J

    move-result-wide v9

    iput-object v3, v0, Loj2/a$c;->P:Ljava/lang/Object;

    iput-object v6, v0, Loj2/a$c;->w:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v0, Loj2/a$c;->x:Ljava/lang/Object;

    iput-object v8, v0, Loj2/a$c;->y:Ljava/lang/Object;

    iput-object v7, v0, Loj2/a$c;->z:Ljava/lang/Object;

    iput-object v14, v0, Loj2/a$c;->E:Ljava/lang/Object;

    iput-object v13, v0, Loj2/a$c;->F:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->G:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->H:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->I:Ljava/lang/Object;

    iput-wide v4, v0, Loj2/a$c;->J:J

    iput-wide v1, v0, Loj2/a$c;->K:D

    move-wide/from16 v11, v17

    iput-wide v11, v0, Loj2/a$c;->L:D

    iput v15, v0, Loj2/a$c;->M:I

    move-wide/from16 v17, v1

    move/from16 v1, v16

    iput v1, v0, Loj2/a$c;->N:I

    const/4 v1, 0x2

    iput v1, v0, Loj2/a$c;->O:I

    invoke-static {v9, v10, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v9, p1

    if-ne v2, v9, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v2, v7

    move-wide/from16 v24, v4

    move-object v4, v6

    move-wide/from16 v6, v24

    move-object v5, v13

    move-object v13, v14

    :goto_2
    move-object v1, v4

    move-object v4, v5

    move-object v5, v8

    move-object v8, v2

    move-object v2, v9

    move-wide/from16 v9, v17

    goto/16 :goto_0

    :cond_8
    move-object v9, v2

    move-wide v14, v6

    iget-object v1, v0, Loj2/a$c;->R:Lcom/whoop/stress/domain/model/HoldingFrame;

    invoke-virtual {v1}, Lcom/whoop/stress/domain/model/HoldingFrame;->getBottomDisplay()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Loj2/a$c;->S:Loj2/a;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;

    new-instance v6, Ll83/k;

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressInterventionBottomDisplay;->getStyle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnj2/j;->valueOf(Ljava/lang/String;)Lnj2/j;

    move-result-object v5

    invoke-static {v2, v5}, Loj2/a;->b(Loj2/a;Lnj2/j;)Ly81/f;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    move-object v1, v3

    move-object/from16 v19, v4

    move-wide/from16 v17, v14

    :goto_4
    iget-object v2, v0, Loj2/a$c;->S:Loj2/a;

    iget-object v3, v0, Loj2/a$c;->Q:Lcom/whoop/stress/domain/model/StressIntervention;

    iget-wide v4, v0, Loj2/a$c;->T:D

    iget-object v6, v0, Loj2/a$c;->U:Lo81/a;

    move-object/from16 v16, v2

    move-object/from16 v20, v3

    move-wide/from16 v21, v4

    move-object/from16 v23, v6

    invoke-static/range {v16 .. v23}, Loj2/a;->c(Loj2/a;JLjava/util/List;Lcom/whoop/stress/domain/model/StressIntervention;DLo81/a;)Lnj2/t;

    move-result-object v2

    move-wide/from16 v14, v17

    move-object/from16 v4, v19

    iput-object v1, v0, Loj2/a$c;->P:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v0, Loj2/a$c;->w:Ljava/lang/Object;

    iput-object v4, v0, Loj2/a$c;->x:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->y:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->z:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->E:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->F:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->G:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->H:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->I:Ljava/lang/Object;

    iput-wide v14, v0, Loj2/a$c;->J:J

    const/4 v3, 0x3

    iput v3, v0, Loj2/a$c;->O:I

    invoke-interface {v1, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_a

    goto :goto_6

    :cond_a
    move-object v7, v4

    :goto_5
    iput-object v1, v0, Loj2/a$c;->P:Ljava/lang/Object;

    iput-object v11, v0, Loj2/a$c;->w:Ljava/lang/Object;

    iput-object v7, v0, Loj2/a$c;->x:Ljava/lang/Object;

    iput-wide v14, v0, Loj2/a$c;->J:J

    const/4 v2, 0x4

    iput v2, v0, Loj2/a$c;->O:I

    const-wide/16 v4, 0x3e8

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_0

    :goto_6
    return-object v9

    :goto_7
    const-wide/16 v4, 0x1

    add-long v17, v14, v4

    goto :goto_4
.end method
