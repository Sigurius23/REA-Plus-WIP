.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lm7/w;",
        "Lrj1/a;",
        "healthConnectIntentActivityMatcher",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
        "toModel",
        "(Lm7/w;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;",
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


# direct methods
.method public static final toModel(Lm7/w;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;

    iget v2, p0, Lm7/w;->e:I

    iget-object v3, p0, Lm7/w;->g:Ljava/lang/String;

    iget-object v4, p0, Lm7/w;->f:Ljava/lang/String;

    new-instance v0, Lorg/joda/time/DateTime;

    iget-object v5, p0, Lm7/w;->a:Ljava/time/Instant;

    invoke-virtual {v5}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v5

    sget-object v7, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {v0, v5, v6, v7}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string v5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {v0, v5}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v6, "toString(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, p0, Lm7/w;->b:Ljava/time/ZoneOffset;

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object v8, v9

    :goto_0
    new-instance v10, Lorg/joda/time/DateTime;

    iget-object v11, p0, Lm7/w;->c:Ljava/time/Instant;

    invoke-virtual {v11}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v11

    invoke-direct {v10, v11, v12, v7}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    invoke-virtual {v10, v5}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, p0, Lm7/w;->d:Ljava/time/ZoneOffset;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/time/ZoneOffset;->getId()Ljava/lang/String;

    move-result-object v9

    :cond_1
    iget-object p0, p0, Lm7/w;->h:Ln7/c;

    invoke-static {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    move-result-object p0

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeZone;->getID()Ljava/lang/String;

    move-result-object v10

    move-object v5, v0

    move-object v6, v8

    move-object v8, v9

    move-object v9, p0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;)V

    return-object v1
.end method
