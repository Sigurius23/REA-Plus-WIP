.class public final Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\u0007*\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008\u001a\u0019\u0010\u0004\u001a\u00020\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ln7/c;",
        "Lrj1/a;",
        "healthConnectIntentActivityMatcher",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "toModel",
        "(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;",
        "Ln7/b;",
        "Lcom/whoop/healthconnect/domain/models/DeviceModel;",
        "(Ln7/b;)Lcom/whoop/healthconnect/domain/models/DeviceModel;",
        "Ln7/a;",
        "Lcom/whoop/healthconnect/domain/models/DataOriginModel;",
        "(Ln7/a;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/DataOriginModel;",
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
.method public static final toModel(Ln7/a;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/DataOriginModel;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    .line 19
    iget-object p0, p0, Ln7/a;->a:Ljava/lang/String;

    .line 20
    invoke-virtual {p1, p0}, Lrj1/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-direct {v0, p0, p1}, Lcom/whoop/healthconnect/domain/models/DataOriginModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toModel(Ln7/b;)Lcom/whoop/healthconnect/domain/models/DeviceModel;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Lcom/whoop/healthconnect/domain/models/DeviceModel;

    .line 14
    iget-object v1, p0, Ln7/b;->a:Ljava/lang/String;

    .line 15
    iget-object v2, p0, Ln7/b;->b:Ljava/lang/String;

    .line 16
    iget p0, p0, Ln7/b;->c:I

    .line 17
    invoke-direct {v0, v1, v2, p0}, Lcom/whoop/healthconnect/domain/models/DeviceModel;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final toModel(Ln7/c;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectIntentActivityMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    .line 2
    iget-object v2, p0, Ln7/c;->a:Ljava/lang/String;

    .line 3
    iget-object v3, p0, Ln7/c;->d:Ljava/lang/String;

    .line 4
    iget-wide v4, p0, Ln7/c;->e:J

    .line 5
    iget-object v0, p0, Ln7/c;->f:Ln7/b;

    if-eqz v0, :cond_0

    .line 6
    invoke-static {v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/b;)Lcom/whoop/healthconnect/domain/models/DeviceModel;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 7
    :goto_1
    iget-object v0, p0, Ln7/c;->b:Ln7/a;

    .line 8
    invoke-static {v0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModelKt;->toModel(Ln7/a;Lrj1/a;)Lcom/whoop/healthconnect/domain/models/DataOriginModel;

    move-result-object v7

    .line 9
    new-instance p1, Lorg/joda/time/DateTime;

    .line 10
    iget-object p0, p0, Ln7/c;->c:Ljava/time/Instant;

    .line 11
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v8

    sget-object p0, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-direct {p1, v8, v9, p0}, Lorg/joda/time/DateTime;-><init>(JLorg/joda/time/DateTimeZone;)V

    const-string p0, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-virtual {p1, p0}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 12
    invoke-direct/range {v1 .. v8}, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/whoop/healthconnect/domain/models/DeviceModel;Lcom/whoop/healthconnect/domain/models/DataOriginModel;Ljava/lang/String;)V

    return-object v1
.end method
