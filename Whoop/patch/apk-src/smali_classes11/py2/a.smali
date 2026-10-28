.class public final Lpy2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loy2/m;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J.\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpy2/a;",
        "Loy2/m;",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
        "step",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "study",
        "",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
        "results",
        "Loy2/b$f;",
        "a",
        "(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
            ">;",
            "Lq83/d<",
            "-",
            "Loy2/b$f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getOrder()I

    move-result v0

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-virtual {v8}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getSystolic()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move/from16 v36, v4

    goto :goto_1

    :cond_1
    move/from16 v36, v3

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getDiastolic()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_3

    move/from16 v37, v4

    goto :goto_3

    :cond_3
    move/from16 v37, v3

    :goto_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getHeartRate()Ljava/lang/Integer;

    move-result-object v1

    :cond_4
    if-eqz v1, :cond_5

    move/from16 v38, v4

    goto :goto_4

    :cond_5
    move/from16 v38, v3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    new-instance v1, Loy2/o;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Loy2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Loy2/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getImageAlt()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicLabel()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMax()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicMin()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooHighText()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicTooLowText()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicSuffix()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequired()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSystolicRequiredText()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicLabel()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMax()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v21

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicMin()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v22

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooHighText()Ljava/lang/String;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicTooLowText()Ljava/lang/String;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicSuffix()Ljava/lang/String;

    move-result-object v25

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequired()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v26

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getDiastolicRequiredText()Ljava/lang/String;

    move-result-object v27

    invoke-static/range {v27 .. v27}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrLabel()Ljava/lang/String;

    move-result-object v28

    invoke-static/range {v28 .. v28}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMax()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v29

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrMin()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v30

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooHighText()Ljava/lang/String;

    move-result-object v31

    invoke-static/range {v31 .. v31}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrTooLowText()Ljava/lang/String;

    move-result-object v32

    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrSuffix()Ljava/lang/String;

    move-result-object v33

    invoke-static/range {v33 .. v33}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequired()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v34

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getHrRequiredText()Ljava/lang/String;

    move-result-object v35

    invoke-static/range {v35 .. v35}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v2, v1

    new-instance v1, Loy2/b$c;

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v39, 0x3c

    invoke-direct/range {v1 .. v41}, Loy2/b$c;-><init>(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
