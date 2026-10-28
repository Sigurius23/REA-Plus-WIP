.class public final Lio/getstream/chat/android/models/TimeDuration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/TimeDuration$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lio/getstream/chat/android/models/TimeDuration;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0008\u0010\u0019\u001a\u00020\u0014H\u0016J\u0008\u0010\u001a\u001a\u00020\u001bH\u0016R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\r\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\n\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/models/TimeDuration;",
        "",
        "duration",
        "Lkotlin/time/Duration;",
        "<init>",
        "(J)V",
        "J",
        "millis",
        "",
        "getMillis",
        "()J",
        "seconds",
        "getSeconds",
        "minutes",
        "getMinutes",
        "hours",
        "getHours",
        "days",
        "getDays",
        "compareTo",
        "",
        "other",
        "equals",
        "",
        "",
        "hashCode",
        "toString",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;


# instance fields
.field private final duration:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/models/TimeDuration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/getstream/chat/android/models/TimeDuration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/getstream/chat/android/models/TimeDuration;->Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;

    return-void
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/models/TimeDuration;-><init>(J)V

    return-void
.end method


# virtual methods
.method public compareTo(Lio/getstream/chat/android/models/TimeDuration;)I
    .locals 4

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    iget-wide v2, p1, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/TimeDuration;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/TimeDuration;->compareTo(Lio/getstream/chat/android/models/TimeDuration;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/models/TimeDuration;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    check-cast p1, Lio/getstream/chat/android/models/TimeDuration;

    iget-wide v2, p1, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result p1

    return p1
.end method

.method public final getDays()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeDays-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getHours()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeHours-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getMillis()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getMinutes()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMinutes-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final getSeconds()J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/models/TimeDuration;->duration:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
