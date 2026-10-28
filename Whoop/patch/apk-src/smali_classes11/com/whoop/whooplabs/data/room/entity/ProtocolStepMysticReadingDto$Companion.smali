.class public final Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;",
        "mysticReading",
        "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;",
        "fromMysticReading",
        "(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;",
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
    invoke-direct {p0}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromMysticReading(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;
    .locals 5

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getSystolic()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "Required value was null."

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getDiastolic()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getTimestamp()Lorg/joda/time/Instant;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getSystolic()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getDiastolic()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getTimestamp()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/base/AbstractInstant;->toDate()Ljava/util/Date;

    move-result-object v3

    const-string v4, "toDate(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;->getHeartRate()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto;-><init>(IILjava/util/Date;Ljava/lang/Integer;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReadingDto$$serializer;

    return-object v0
.end method
