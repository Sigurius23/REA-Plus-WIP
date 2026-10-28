.class public final Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JS\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "study",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;",
        "device",
        "",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;",
        "studyTags",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;",
        "protocolStepResults",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
        "session",
        "",
        "strapBacklog",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
        "fromWhoopLabsStudyAndHrDevice",
        "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;-><init>()V

    return-void
.end method

.method public static synthetic fromWhoopLabsStudyAndHrDevice$default(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move-object v5, p8

    goto :goto_0

    :cond_1
    move-object v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move-object v6, p8

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    goto :goto_2

    :cond_2
    move-object v6, p6

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v6}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$Companion;->fromWhoopLabsStudyAndHrDevice(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final fromWhoopLabsStudyAndHrDevice(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;",
            ">;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;",
            "Ljava/lang/Long;",
            ")",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "study"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "device"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "studyTags"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "protocolStepResults"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v2

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object v7, v5

    :goto_0
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getEndTime()Lorg/joda/time/DateTime;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v5

    :cond_1
    move-object v8, v5

    invoke-virtual {v4}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getHrDeviceConnected()Z

    move-result v11

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Integer;

    move-result-object v12

    check-cast v0, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;

    sget-object v4, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;->Companion:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;

    invoke-virtual {v4, v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto$Companion;->fromWhoopLabsStudyTag(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTag;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyTagDto;

    move-result-object v3

    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;

    sget-object v2, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;->Companion:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;

    invoke-virtual {v2, v1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;->fromProtocolStepResult(Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    move-result-object v1

    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v6, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;

    const/4 v9, 0x0

    move-object/from16 v15, p5

    move-object/from16 v16, p6

    invoke-direct/range {v6 .. v16}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Z[Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/SessionDto;Ljava/lang/Long;)V

    return-object v6
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyDto$$serializer;

    return-object v0
.end method
