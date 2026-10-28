.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u000b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lm7/b0;",
        "Lrj1/a;",
        "healthConnectIntentActivityMatcher",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "toModel",
        "(Lm7/b0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "Lm7/g1;",
        "(Lm7/g1;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "Lm7/j0;",
        "(Lm7/j0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "Lm7/h0;",
        "(Lm7/h0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "Lm7/f;",
        "(Lm7/f;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;",
        "",
        "HEIGHT_RECORD_IN_METERS_TYPE",
        "Ljava/lang/String;",
        "WEIGHT_RECORD_IN_KILOGRAMS_TYPE",
        "MENSTRUATION_FLOW_RECORD_TYPE",
        "LEAN_BODY_MASS_RECORD_TYPE",
        "BODY_FAT_RECORD_TYPE",
        "health-connect_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BODY_FAT_RECORD_TYPE:Ljava/lang/String; = "BodyFatRecord"

.field private static final HEIGHT_RECORD_IN_METERS_TYPE:Ljava/lang/String; = "HeightMetersRecord"

.field private static final LEAN_BODY_MASS_RECORD_TYPE:Ljava/lang/String; = "LeanBodyMassRecord"

.field private static final MENSTRUATION_FLOW_RECORD_TYPE:Ljava/lang/String; = "MenstrualFlowRecord"

.field private static final WEIGHT_RECORD_IN_KILOGRAMS_TYPE:Ljava/lang/String; = "WeightKilogramsRecord"


# direct methods
.method public static final toModel(Lm7/b0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    .line 2
    iget-object v0, p0, Lm7/b0;->c:Lr7/s;

    .line 3
    invoke-virtual {v0}, Lr7/s;->a()D

    move-result-wide v3

    .line 4
    new-instance v0, Lorg/joda/time/DateTime;

    .line 5
    iget-object v2, p0, Lm7/b0;->a:Ljava/time/Instant;

    .line 6
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v2}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toString(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lm7/b0;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 9
    :goto_1
    iget-object p0, p0, Lm7/b0;->d:Ln7/c;

    .line 10
    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v7

    .line 11
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v8

    const-string p0, "getID(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const-string v2, "HeightMetersRecord"

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lm7/f;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    .line 51
    iget-object v0, p0, Lm7/f;->c:Lr7/c0;

    .line 52
    iget-wide v3, v0, Lr7/c0;->w:D

    .line 53
    new-instance v0, Lorg/joda/time/DateTime;

    .line 54
    iget-object v2, p0, Lm7/f;->a:Ljava/time/Instant;

    .line 55
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v2}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toString(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lm7/f;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 58
    :goto_1
    iget-object p0, p0, Lm7/f;->d:Ln7/c;

    .line 59
    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v7

    .line 60
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v8

    const-string p0, "getID(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    const-string v2, "BodyFatRecord"

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lm7/g1;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    .line 14
    iget-object v0, p0, Lm7/g1;->c:Lr7/b0;

    .line 15
    sget-object v2, Lr7/a0;->x:Lr7/v;

    .line 16
    invoke-virtual {v0, v2}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v3

    .line 17
    new-instance v0, Lorg/joda/time/DateTime;

    .line 18
    iget-object v2, p0, Lm7/g1;->a:Ljava/time/Instant;

    .line 19
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v2}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toString(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lm7/g1;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 22
    :goto_1
    iget-object p0, p0, Lm7/g1;->d:Ln7/c;

    .line 23
    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v7

    .line 24
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v8

    const-string p0, "getID(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const-string v2, "WeightKilogramsRecord"

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lm7/h0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    .line 38
    iget-object v0, p0, Lm7/h0;->c:Lr7/b0;

    .line 39
    sget-object v2, Lr7/a0;->x:Lr7/v;

    .line 40
    invoke-virtual {v0, v2}, Lr7/b0;->a(Lr7/a0;)D

    move-result-wide v3

    .line 41
    new-instance v0, Lorg/joda/time/DateTime;

    .line 42
    iget-object v2, p0, Lm7/h0;->a:Ljava/time/Instant;

    .line 43
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v2}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toString(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lm7/h0;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 46
    :goto_1
    iget-object p0, p0, Lm7/h0;->d:Ln7/c;

    .line 47
    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v7

    .line 48
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v8

    const-string p0, "getID(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const-string v2, "LeanBodyMassRecord"

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lm7/j0;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;

    .line 27
    iget v0, p0, Lm7/j0;->c:I

    int-to-double v3, v0

    .line 28
    new-instance v0, Lorg/joda/time/DateTime;

    .line 29
    iget-object v2, p0, Lm7/j0;->a:Ljava/time/Instant;

    .line 30
    invoke-virtual {v2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v2, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v2}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toString(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iget-object v0, p0, Lm7/j0;->b:Ljava/time/ZoneOffset;

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 33
    :goto_1
    iget-object p0, p0, Lm7/j0;->d:Ln7/c;

    .line 34
    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object v7

    .line 35
    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v8

    const-string p0, "getID(...)"

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    const-string v2, "MenstrualFlowRecord"

    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method
