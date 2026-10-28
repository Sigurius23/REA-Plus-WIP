.class final Lio/getstream/chat/android/ui/common/helper/DefaultDurationFormatter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/DurationFormatter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DefaultDurationFormatter;",
        "Lio/getstream/chat/android/ui/common/helper/DurationFormatter;",
        "<init>",
        "()V",
        "format",
        "",
        "durationInMillis",
        "",
        "stream-chat-android-ui-common_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final format(I)Ljava/lang/String;
    .locals 5

    sget-object v0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMinutes-impl(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    invoke-static {v2, p1}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v0

    const/16 v3, 0x3c

    int-to-long v3, v3

    rem-long/2addr v0, v3

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ":"

    invoke-static {p1, v1, v0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
