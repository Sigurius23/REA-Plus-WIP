.class public final Lpy2/c;
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
        "Lpy2/c;",
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
    .locals 20
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

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v0

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTimestampInput()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/joda/time/DateTime;->toLocalDateTime()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lorg/joda/time/LocalDateTime;->now()Lorg/joda/time/LocalDateTime;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    new-instance v2, Loy2/o;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Loy2/o;-><init>(Ljava/lang/String;Ljava/lang/String;Loy2/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getText()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getCta()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getInputConfig()Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfigKt;->toDomainState(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;)Loy2/i;

    move-result-object v11

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->getYear()I

    move-result v12

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->getMonthOfYear()I

    move-result v13

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->getDayOfMonth()I

    move-result v14

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->getHourOfDay()I

    move-result v15

    invoke-virtual {v1}, Lorg/joda/time/LocalDateTime;->getMinuteOfHour()I

    move-result v16

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_2
    move v9, v0

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getInputRequired()Z

    move-result v10

    move-object v3, v2

    new-instance v2, Loy2/b$b;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v19}, Loy2/b$b;-><init>(Loy2/o;Ljava/lang/String;Ljava/lang/String;ZZLoy2/g;ZZLoy2/i;IIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
