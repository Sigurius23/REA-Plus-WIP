.class public final Lio/getstream/chat/android/models/TimeDuration$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/TimeDuration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0008J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/TimeDuration$Companion;",
        "",
        "<init>",
        "()V",
        "millis",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "",
        "seconds",
        "",
        "minutes",
        "hours",
        "days",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
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
    invoke-direct {p0}, Lio/getstream/chat/android/models/TimeDuration$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final days(I)Lio/getstream/chat/android/models/TimeDuration;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->DAYS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/models/TimeDuration;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final hours(I)Lio/getstream/chat/android/models/TimeDuration;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->HOURS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/models/TimeDuration;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final millis(J)Lio/getstream/chat/android/models/TimeDuration;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2, v1}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p1

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lio/getstream/chat/android/models/TimeDuration;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final minutes(I)Lio/getstream/chat/android/models/TimeDuration;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/models/TimeDuration;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final seconds(I)Lio/getstream/chat/android/models/TimeDuration;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration;

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-direct {v0, v1, v2, p1}, Lio/getstream/chat/android/models/TimeDuration;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
