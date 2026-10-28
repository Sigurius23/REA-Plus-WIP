.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;,
        Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`_B\u00fd\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0004\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00b5\u0002\u0008\u0010\u0012\u0006\u0010!\u001a\u00020 \u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008\u001e\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0016\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0016\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0016\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0016\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0016\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010(J\u0016\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010(J\u0016\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010(J\u0016\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010(J\u0016\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010(J\u0016\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010(J\u0016\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010(J\u0016\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010(J\u0016\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010(J\u0016\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010(J\u00aa\u0002\u00109\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00042\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00042\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008;\u0010&J\u0010\u0010<\u001a\u00020 H\u00d6\u0001\u00a2\u0006\u0004\u0008<\u0010=J\u001a\u0010@\u001a\u00020?2\u0008\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001\u00a2\u0006\u0004\u0008H\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010K\u001a\u0004\u0008L\u0010&R \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010M\u001a\u0004\u0008N\u0010(R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010M\u001a\u0004\u0008O\u0010(R \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010M\u001a\u0004\u0008P\u0010(R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010M\u001a\u0004\u0008Q\u0010(R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010M\u001a\u0004\u0008R\u0010(R \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010M\u001a\u0004\u0008S\u0010(R \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010M\u001a\u0004\u0008T\u0010(R \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010M\u001a\u0004\u0008U\u0010(R \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010M\u001a\u0004\u0008V\u0010(R \u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010M\u001a\u0004\u0008W\u0010(R \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010M\u001a\u0004\u0008X\u0010(R \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010M\u001a\u0004\u0008Y\u0010(R \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010M\u001a\u0004\u0008Z\u0010(R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010M\u001a\u0004\u0008[\u0010(R \u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010M\u001a\u0004\u0008\\\u0010(R \u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010M\u001a\u0004\u0008]\u0010(R \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010M\u001a\u0004\u0008^\u0010(\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "",
        "",
        "token",
        "",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
        "exerciseSessionRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
        "activeCaloriesBurnedRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
        "sleepSessionRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
        "respiratoryRateRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
        "restingHeartRateRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
        "oxygenSaturationRecords",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
        "heartRateRecords",
        "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
        "stepRecords",
        "deletedExerciseSessionRecords",
        "deletedActiveCaloriesBurnedRecords",
        "deletedSleepSessionRecords",
        "deletedSleepStageRecords",
        "deletedRespiratoryRateRecords",
        "deletedRestingHeartRateRecords",
        "deletedOxygenSaturationRecords",
        "deletedHeartRateRecords",
        "deletedStepRecords",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_connect_release",
        "(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getToken",
        "Ljava/util/List;",
        "getExerciseSessionRecords",
        "getActiveCaloriesBurnedRecords",
        "getSleepSessionRecords",
        "getRespiratoryRateRecords",
        "getRestingHeartRateRecords",
        "getOxygenSaturationRecords",
        "getHeartRateRecords",
        "getStepRecords",
        "getDeletedExerciseSessionRecords",
        "getDeletedActiveCaloriesBurnedRecords",
        "getDeletedSleepSessionRecords",
        "getDeletedSleepStageRecords",
        "getDeletedRespiratoryRateRecords",
        "getDeletedRestingHeartRateRecords",
        "getDeletedOxygenSaturationRecords",
        "getDeletedHeartRateRecords",
        "getDeletedStepRecords",
        "Companion",
        "$serializer",
        "health-connect_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;


# instance fields
.field private final activeCaloriesBurnedRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "active_calories_burned_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedActiveCaloriesBurnedRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_active_calories_burned_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedExerciseSessionRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_exercise_session_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedHeartRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_heart_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedOxygenSaturationRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_oxygen_saturation_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedRespiratoryRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_respiratory_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedRestingHeartRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_resting_heart_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedSleepSessionRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_sleep_session_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedSleepStageRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_sleep_stage_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final deletedStepRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted_step_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final exerciseSessionRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "exercise_session_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final heartRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "heart_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
            ">;"
        }
    .end annotation
.end field

.field private final oxygenSaturationRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "oxygen_saturation_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
            ">;"
        }
    .end annotation
.end field

.field private final respiratoryRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "respiratory_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
            ">;"
        }
    .end annotation
.end field

.field private final restingHeartRateRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "resting_heart_rate_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepSessionRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_session_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
            ">;"
        }
    .end annotation
.end field

.field private final stepRecords:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "step_records"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
            ">;"
        }
    .end annotation
.end field

.field private final token:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "token"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->Companion:Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Llh1/a;

    const/16 v4, 0xf

    invoke-direct {v3, v4}, Llh1/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Llj1/b;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Llj1/b;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Llj1/b;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Llj1/b;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Llh1/a;

    const/16 v10, 0x10

    invoke-direct {v9, v10}, Llh1/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Llh1/a;

    const/16 v12, 0x11

    invoke-direct {v11, v12}, Llh1/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Llh1/a;

    const/16 v14, 0x12

    invoke-direct {v13, v14}, Llh1/a;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    new-instance v15, Llh1/a;

    move/from16 v16, v0

    const/16 v0, 0x13

    invoke-direct {v15, v0}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-instance v15, Llh1/a;

    move-object/from16 v17, v1

    const/16 v1, 0x14

    invoke-direct {v15, v1}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    new-instance v15, Llh1/a;

    move/from16 v18, v4

    const/16 v4, 0x15

    invoke-direct {v15, v4}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v15, Llh1/a;

    move/from16 v19, v6

    const/16 v6, 0x16

    invoke-direct {v15, v6}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v15, Llh1/a;

    move/from16 v20, v8

    const/16 v8, 0x17

    invoke-direct {v15, v8}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v15, Llh1/a;

    move/from16 v21, v10

    const/16 v10, 0x18

    invoke-direct {v15, v10}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v10

    new-instance v15, Llh1/a;

    move/from16 v22, v12

    const/16 v12, 0x19

    invoke-direct {v15, v12}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    new-instance v15, Llh1/a;

    const/16 v14, 0x1a

    invoke-direct {v15, v14}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v14

    new-instance v15, Llh1/a;

    move-object/from16 v23, v0

    const/16 v0, 0x1b

    invoke-direct {v15, v0}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-instance v15, Llh1/a;

    move-object/from16 v24, v0

    const/16 v0, 0x1c

    invoke-direct {v15, v0}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    new-instance v15, Llh1/a;

    move-object/from16 v25, v0

    const/16 v0, 0x1d

    invoke-direct {v15, v0}, Llh1/a;-><init>(I)V

    invoke-static {v2, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x12

    new-array v2, v2, [Ll83/h;

    aput-object v17, v2, v19

    aput-object v3, v2, v20

    const/4 v3, 0x2

    aput-object v5, v2, v3

    const/4 v3, 0x3

    aput-object v7, v2, v3

    const/4 v3, 0x4

    aput-object v9, v2, v3

    const/4 v3, 0x5

    aput-object v11, v2, v3

    const/4 v3, 0x6

    aput-object v13, v2, v3

    const/4 v3, 0x7

    aput-object v23, v2, v3

    aput-object v1, v2, v16

    const/16 v1, 0x9

    aput-object v4, v2, v1

    const/16 v1, 0xa

    aput-object v6, v2, v1

    const/16 v1, 0xb

    aput-object v8, v2, v1

    const/16 v1, 0xc

    aput-object v10, v2, v1

    const/16 v1, 0xd

    aput-object v12, v2, v1

    const/16 v1, 0xe

    aput-object v14, v2, v1

    aput-object v24, v2, v18

    aput-object v25, v2, v21

    aput-object v0, v2, v22

    sput-object v2, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x3ffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    iput-object p5, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    iput-object p9, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    iput-object p10, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    iput-object p11, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    iput-object p12, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    iput-object p13, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "token"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseSessionRecords"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeCaloriesBurnedRecords"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepSessionRecords"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "respiratoryRateRecords"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHeartRateRecords"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oxygenSaturationRecords"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateRecords"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stepRecords"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedExerciseSessionRecords"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedActiveCaloriesBurnedRecords"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedSleepSessionRecords"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedSleepStageRecords"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRespiratoryRateRecords"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRestingHeartRateRecords"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedOxygenSaturationRecords"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedHeartRateRecords"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedStepRecords"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 3
    iput-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    .line 5
    iput-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    .line 6
    iput-object v4, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    .line 7
    iput-object v5, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    .line 8
    iput-object v6, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    .line 9
    iput-object v7, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    .line 10
    iput-object v8, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    .line 11
    iput-object v9, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    .line 12
    iput-object v10, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    .line 13
    iput-object v11, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    .line 14
    iput-object v12, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    .line 15
    iput-object v13, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    .line 16
    iput-object v14, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    move-object/from16 v1, p15

    .line 17
    iput-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    move-object/from16 v1, p16

    .line 18
    iput-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    move-object/from16 v1, p17

    .line 19
    iput-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    .line 20
    iput-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$10()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$11()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$12()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$13()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$14()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$15()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$6()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/StepsRecordModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$7()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$8()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$9()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$15()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$13()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p19, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p19, v16

    if-eqz v16, :cond_11

    move-object/from16 p3, v1

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    move-object/from16 p18, p3

    move-object/from16 p19, v1

    :goto_11
    move-object/from16 p17, p2

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_12

    :cond_11
    move-object/from16 p19, p18

    move-object/from16 p18, v1

    goto :goto_11

    :goto_12
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$6()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$9()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$12()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$8()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$14()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$11()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$7()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$10()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x4

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x5

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x7

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xa

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xb

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xf

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x10

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x11

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component16()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component17()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;"
        }
    .end annotation

    const-string v0, "token"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseSessionRecords"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeCaloriesBurnedRecords"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepSessionRecords"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "respiratoryRateRecords"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingHeartRateRecords"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "oxygenSaturationRecords"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateRecords"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stepRecords"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedExerciseSessionRecords"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedActiveCaloriesBurnedRecords"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedSleepSessionRecords"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedSleepStageRecords"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRespiratoryRateRecords"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedRestingHeartRateRecords"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedOxygenSaturationRecords"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedHeartRateRecords"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deletedStepRecords"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getActiveCaloriesBurnedRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectActiveCaloriesBurnedModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedActiveCaloriesBurnedRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedExerciseSessionRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedHeartRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedOxygenSaturationRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedRespiratoryRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedRestingHeartRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedSleepSessionRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedSleepStageRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getDeletedStepRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getExerciseSessionRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getHeartRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectHeartRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getOxygenSaturationRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectOxygenSaturationModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getRespiratoryRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRespiratoryRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getRestingHeartRateRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectRestingHeartRateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getSleepSessionRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/HealthConnectSleepSessionModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getStepRecords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/healthconnect/domain/models/StepsRecordModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->token:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->exerciseSessionRecords:Ljava/util/List;

    iget-object v3, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->activeCaloriesBurnedRecords:Ljava/util/List;

    iget-object v4, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->sleepSessionRecords:Ljava/util/List;

    iget-object v5, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->respiratoryRateRecords:Ljava/util/List;

    iget-object v6, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->restingHeartRateRecords:Ljava/util/List;

    iget-object v7, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->oxygenSaturationRecords:Ljava/util/List;

    iget-object v8, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->heartRateRecords:Ljava/util/List;

    iget-object v9, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->stepRecords:Ljava/util/List;

    iget-object v10, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedExerciseSessionRecords:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedActiveCaloriesBurnedRecords:Ljava/util/List;

    iget-object v12, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepSessionRecords:Ljava/util/List;

    iget-object v13, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedSleepStageRecords:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRespiratoryRateRecords:Ljava/util/List;

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedRestingHeartRateRecords:Ljava/util/List;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedOxygenSaturationRecords:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedHeartRateRecords:Ljava/util/List;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;->deletedStepRecords:Ljava/util/List;

    const-string v0, ", exerciseSessionRecords="

    move-object/from16 v19, v15

    const-string v15, ", activeCaloriesBurnedRecords="

    move-object/from16 v20, v13

    const-string v13, "HealthConnectEventsResponse(token="

    invoke-static {v13, v1, v0, v15, v2}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sleepSessionRecords="

    const-string v2, ", respiratoryRateRecords="

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", restingHeartRateRecords="

    const-string v2, ", oxygenSaturationRecords="

    invoke-static {v0, v5, v1, v6, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", heartRateRecords="

    const-string v2, ", stepRecords="

    invoke-static {v0, v7, v1, v8, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", deletedExerciseSessionRecords="

    const-string v2, ", deletedActiveCaloriesBurnedRecords="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", deletedSleepSessionRecords="

    const-string v2, ", deletedSleepStageRecords="

    invoke-static {v0, v11, v1, v12, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", deletedRespiratoryRateRecords="

    const-string v2, ", deletedRestingHeartRateRecords="

    move-object/from16 v3, v20

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", deletedOxygenSaturationRecords="

    const-string v2, ", deletedHeartRateRecords="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", deletedStepRecords="

    const-string v2, ")"

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
