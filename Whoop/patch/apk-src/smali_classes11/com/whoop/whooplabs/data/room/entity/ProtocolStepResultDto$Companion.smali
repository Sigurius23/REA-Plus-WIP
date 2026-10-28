.class public final Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;",
        "stepResult",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
        "fromProtocolStepResult",
        "(Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;",
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
    invoke-direct {p0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromProtocolStepResult(Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;
    .locals 12

    const-string v0, "stepResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;->getProtocolStepResult()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v0

    new-instance v1, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getResultId()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getStartTimestamp()Lorg/joda/time/DateTime;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getEndTimestamp()Lorg/joda/time/DateTime;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v4

    :goto_1
    sget-object v6, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;->Companion:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getMysticReading()Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;->fromMysticReading(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    move-result-object v6

    move-object v7, v4

    move-object v4, v5

    move-object v5, v6

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getNumberInput()Ljava/lang/Integer;

    move-result-object v6

    move-object v8, v7

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextOption()Ljava/lang/String;

    move-result-object v7

    move-object v9, v8

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTextInput()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;->isTimePickerStep()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTimestampInput()Lorg/joda/time/DateTime;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v10

    goto :goto_2

    :cond_2
    move-object v10, v9

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepResultWithStepType;->isDateTimePickerStep()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->getTimestampInput()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object p1

    move-object v9, v10

    move-object v10, p1

    goto :goto_3

    :cond_3
    move-object v11, v10

    move-object v10, v9

    move-object v9, v11

    :goto_3
    invoke-direct/range {v1 .. v10}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto;-><init>(ILjava/util/Date;Ljava/util/Date;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResultDto$$serializer;

    return-object v0
.end method
