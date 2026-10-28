.class public final Lio/getstream/chat/android/core/utils/date/DateUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a \u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\u0004\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a%\u0010\t\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a)\u0010\u000c\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u000b\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00000\n\"\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a)\u0010\u000e\u001a\u0004\u0018\u00010\u00002\u0016\u0010\u000b\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00000\n\"\u0004\u0018\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\r\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0014\u001a1\u0010\u0018\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u000e\u0008\u0002\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0016H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u001c"
    }
    d2 = {
        "Ljava/util/Date;",
        "that",
        "",
        "after",
        "(Ljava/util/Date;Ljava/util/Date;)Z",
        "dateA",
        "dateB",
        "max",
        "(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;",
        "min",
        "",
        "dates",
        "maxOf",
        "([Ljava/util/Date;)Ljava/util/Date;",
        "minOf",
        "",
        "otherTime",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "diff",
        "(Ljava/util/Date;J)Lio/getstream/chat/android/models/TimeDuration;",
        "(Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/models/TimeDuration;",
        "duration",
        "Lkotlin/Function0;",
        "now",
        "isWithinDurationFromNow",
        "(Ljava/util/Date;Lio/getstream/chat/android/models/TimeDuration;Lc93/a;)Z",
        "truncateFuture",
        "(Ljava/util/Date;Lc93/a;)Ljava/util/Date;",
        "stream-chat-android-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final after(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-nez p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0

    return p0
.end method

.method public static final diff(Ljava/util/Date;J)Lio/getstream/chat/android/models/TimeDuration;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    .line 2
    sget-object p2, Lio/getstream/chat/android/models/TimeDuration;->Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;

    invoke-virtual {p2, p0, p1}, Lio/getstream/chat/android/models/TimeDuration$Companion;->millis(J)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p0

    return-object p0
.end method

.method public static final diff(Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/models/TimeDuration;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "that"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p0

    sub-long/2addr v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    .line 4
    sget-object v0, Lio/getstream/chat/android/models/TimeDuration;->Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;

    invoke-virtual {v0, p0, p1}, Lio/getstream/chat/android/models/TimeDuration$Companion;->millis(J)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p0

    return-object p0
.end method

.method public static final isWithinDurationFromNow(Ljava/util/Date;Lio/getstream/chat/android/models/TimeDuration;Lc93/a;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "duration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/TimeDuration;->getMillis()J

    move-result-wide p0

    cmp-long p0, v0, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic isWithinDurationFromNow$default(Ljava/util/Date;Lio/getstream/chat/android/models/TimeDuration;Lc93/a;ILjava/lang/Object;)Z
    .locals 2

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lio/getstream/chat/android/core/utils/date/DateUtils$isWithinDurationFromNow$1;->INSTANCE:Lio/getstream/chat/android/core/utils/date/DateUtils$isWithinDurationFromNow$1;

    :cond_0
    const-string p3, "duration"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "now"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sub-long/2addr p2, v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/TimeDuration;->getMillis()J

    move-result-wide p0

    cmp-long p0, p2, p0

    if-gez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final max(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    invoke-static {p0, p1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->after(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static final varargs maxOf([Ljava/util/Date;)Ljava/util/Date;
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "dates"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt v2, v1, :cond_1

    :goto_0
    aget-object v3, p0, v2

    invoke-static {v0, v3}, Lio/getstream/chat/android/core/utils/date/DateUtils;->max(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final min(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    invoke-static {p0, p1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->after(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static final varargs minOf([Ljava/util/Date;)Ljava/util/Date;
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "dates"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-gt v2, v1, :cond_1

    :goto_0
    aget-object v3, p0, v2

    invoke-static {v0, v3}, Lio/getstream/chat/android/core/utils/date/DateUtils;->min(Ljava/util/Date;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final truncateFuture(Ljava/util/Date;Lc93/a;)Ljava/util/Date;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            "Lc93/a;",
            ")",
            "Ljava/util/Date;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/util/Date;->setTime(J)V

    :cond_0
    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic truncateFuture$default(Ljava/util/Date;Lc93/a;ILjava/lang/Object;)Ljava/util/Date;
    .locals 2

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lio/getstream/chat/android/core/utils/date/DateUtils$truncateFuture$1;->INSTANCE:Lio/getstream/chat/android/core/utils/date/DateUtils$truncateFuture$1;

    :cond_0
    const-string p2, "now"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-lez p2, :cond_1

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljava/util/Date;->setTime(J)V

    :cond_1
    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method
