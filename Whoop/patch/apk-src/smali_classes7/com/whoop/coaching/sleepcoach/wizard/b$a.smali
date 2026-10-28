.class public final Lcom/whoop/coaching/sleepcoach/wizard/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/coaching/sleepcoach/wizard/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/wizard/b$a;",
        "",
        "<init>",
        "()V",
        "Lorg/joda/time/LocalTime;",
        "defaultAlarmTime",
        "Lorg/joda/time/LocalTime;",
        "a",
        "()Lorg/joda/time/LocalTime;",
        "Lkp0/a;",
        "defaultAlarmType",
        "Lkp0/a;",
        "b",
        "()Lkp0/a;",
        "Lkp0/o;",
        "defaultSleepGoal",
        "Lkp0/o;",
        "",
        "defaultWakeWindowDurationMinutes",
        "I",
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
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lorg/joda/time/LocalTime;
    .locals 1

    invoke-static {}, Lcom/whoop/coaching/sleepcoach/wizard/b;->a()Lorg/joda/time/LocalTime;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lkp0/a;
    .locals 1

    invoke-static {}, Lcom/whoop/coaching/sleepcoach/wizard/b;->b()Lkp0/a;

    move-result-object v0

    return-object v0
.end method
