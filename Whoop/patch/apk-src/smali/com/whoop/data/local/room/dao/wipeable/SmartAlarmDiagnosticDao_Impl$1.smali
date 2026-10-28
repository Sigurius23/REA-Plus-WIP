.class Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;)V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;

    invoke-static {v0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->e(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;)Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getEventType()Lf82/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;->fromSmartAlarmEventType(Lf82/a;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    :goto_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getAlarmTrigger()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 6
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getAlarmTrigger()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x3

    .line 8
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getTimestamp()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x4

    .line 9
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    .line 10
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getMobileEventMetadata()Lcom/whoop/service/network/model/MobileEventMetaData;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->isAckSuccess()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->isAckSuccess()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_2
    const/4 v2, 0x5

    if-nez v0, :cond_3

    .line 12
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_3

    .line 13
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 14
    :goto_3
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDevicePlatform()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    if-nez v0, :cond_4

    .line 15
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_4

    .line 16
    :cond_4
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDevicePlatform()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 17
    :goto_4
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDeviceOs()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x7

    if-nez v0, :cond_5

    .line 18
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_5

    .line 19
    :cond_5
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDeviceOs()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 20
    :goto_5
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x8

    if-nez v0, :cond_6

    .line 21
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_6

    .line 22
    :cond_6
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 23
    :goto_6
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getStrapId()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x9

    if-nez v0, :cond_7

    .line 24
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_7

    .line 25
    :cond_7
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getStrapId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 26
    :goto_7
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getMaximVersion()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xa

    if-nez v0, :cond_8

    .line 27
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_8

    .line 28
    :cond_8
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getMaximVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 29
    :goto_8
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getNordicVersion()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xb

    if-nez v0, :cond_9

    .line 30
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_9

    .line 31
    :cond_9
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getNordicVersion()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 32
    :goto_9
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getBatteryOptimizationOn()Z

    move-result v0

    const/16 v2, 0xc

    int-to-long v3, v0

    .line 33
    invoke-interface {p1, v2, v3, v4}, Ltb/c;->p(IJ)V

    .line 34
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getPhoneSetAlarmTime()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xd

    if-nez v0, :cond_a

    .line 35
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_a

    .line 36
    :cond_a
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getPhoneSetAlarmTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 37
    :goto_a
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getStrapReportedAlarmTime()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xe

    if-nez v0, :cond_b

    .line 38
    invoke-interface {p1, v2}, Ltb/c;->u(I)V

    goto :goto_b

    .line 39
    :cond_b
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->getStrapReportedAlarmTime()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 40
    :goto_b
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->isStrapConnected()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lcom/whoop/service/network/model/MobileEventMetaData;->isStrapConnected()Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_c
    const/16 p2, 0xf

    if-nez v1, :cond_d

    .line 41
    invoke-interface {p1, p2}, Ltb/c;->u(I)V

    return-void

    .line 42
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p1, p2, v0, v1}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_smart_alarm_diagnostics` (`event_type`,`alarm_trigger`,`timestamp_millis`,`id`,`isAckSuccess`,`devicePlatform`,`deviceOs`,`deviceModel`,`strapId`,`maximVersion`,`nordicVersion`,`batteryOptimizationOn`,`phoneSetAlarmTime`,`strapReportedAlarmTime`,`isStrapConnected`) VALUES (?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
