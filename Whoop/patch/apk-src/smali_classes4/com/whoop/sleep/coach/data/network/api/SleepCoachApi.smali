.class public interface abstract Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00072\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJ\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0004J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0004J \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0016H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u00020\u001b2\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u000fJ \u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 \u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;",
        "sleepScheduleComponents",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;",
        "alarmSchedule",
        "Ll83/a0;",
        "createAlarmSchedule",
        "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;",
        "getAllSleepScheduleComponents",
        "",
        "sleepScheduleId",
        "getSleepScheduleComponentsById",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "editAlarmSchedule",
        "(Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "deleteSleepScheduleById",
        "enableSleepSchedule",
        "disableSleepSchedule",
        "Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;",
        "body",
        "postSmartAlarmOverride",
        "(Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;Lq83/d;)Ljava/lang/Object;",
        "notificationCardId",
        "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;",
        "getEligibility",
        "Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;",
        "updateAlarmPreferencesTimezone",
        "(Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;Lq83/d;)Ljava/lang/Object;",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createAlarmSchedule(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "smart-alarm-bff/v1/schedule"
    .end annotation
.end method

.method public abstract deleteSleepScheduleById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "scheduleId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "smart-alarm-service/v1/alarm-schedule/{scheduleId}"
    .end annotation
.end method

.method public abstract disableSleepSchedule(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-service/v1/alarm-schedule/disable"
    .end annotation
.end method

.method public abstract editAlarmSchedule(Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "scheduleId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-bff/v1/schedule/{scheduleId}"
    .end annotation
.end method

.method public abstract enableSleepSchedule(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-service/v1/alarm-schedule/enable"
    .end annotation
.end method

.method public abstract getAllSleepScheduleComponents(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-bff/v1/schedule/all"
    .end annotation
.end method

.method public abstract getEligibility(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "notificationCardId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-service/v1/smartalarm/preferences/awake-disable"
    .end annotation
.end method

.method public abstract getSleepScheduleComponentsById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "scheduleId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-bff/v1/schedule/components/populated/{scheduleId}"
    .end annotation
.end method

.method public abstract postSmartAlarmOverride(Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-service/v1/smartalarm/override"
    .end annotation
.end method

.method public abstract sleepScheduleComponents(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-bff/v1/schedule/components"
    .end annotation
.end method

.method public abstract updateAlarmPreferencesTimezone(Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "smart-alarm-service/v1/smartalarm/preferences/timezone"
    .end annotation
.end method
