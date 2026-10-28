.class public final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\n \t*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;",
        "",
        "<init>",
        "()V",
        "WAKE_WINDOW_SLOP_TIME",
        "Lorg/joda/time/Duration;",
        "getWAKE_WINDOW_SLOP_TIME",
        "()Lorg/joda/time/Duration;",
        "HIGH_FREQ_SYNC_MODE_DURATION",
        "kotlin.jvm.PlatformType",
        "SMART_ALARM_REFRESH",
        "",
        "SMART_ALARM_DISABLE_HIGH_FREQUENCY",
        "DEFAULT_REFRESH_SCOPE",
        "scopeListenerList",
        "",
        "getScopeListenerList",
        "()Ljava/util/List;",
        "app_prodStandardRelease"
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
    invoke-direct {p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getScopeListenerList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getScopeListenerList$cp()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getWAKE_WINDOW_SLOP_TIME()Lorg/joda/time/Duration;
    .locals 1

    invoke-static {}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->access$getWAKE_WINDOW_SLOP_TIME$cp()Lorg/joda/time/Duration;

    move-result-object v0

    return-object v0
.end method
