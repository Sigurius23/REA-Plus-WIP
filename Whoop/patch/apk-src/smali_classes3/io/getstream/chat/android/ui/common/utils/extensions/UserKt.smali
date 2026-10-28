.class public final Lio/getstream/chat/android/ui/common/utils/extensions/UserKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a0\u0010\u0008\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000c\u001a\u000c\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u000e\u0010\u0012\u001a\u00020\u000cX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "initials",
        "",
        "Lio/getstream/chat/android/models/User;",
        "getInitials",
        "(Lio/getstream/chat/android/models/User;)Ljava/lang/String;",
        "getUserByNameOrId",
        "",
        "nameOrId",
        "getLastSeenText",
        "context",
        "Landroid/content/Context;",
        "userOnlineResId",
        "",
        "userLastSeenJustNowResId",
        "userLastSeenResId",
        "isInLastMinute",
        "",
        "Ljava/util/Date;",
        "ONE_MINUTE_IN_MILLIS",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ONE_MINUTE_IN_MILLIS:I = 0xea60


# direct methods
.method public static final getInitials(Lio/getstream/chat/android/models/User;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->initials(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getLastSeenText(Lio/getstream/chat/android/models/User;Landroid/content/Context;III)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getOnline()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getLastActive()Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_4

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/extensions/UserKt;->isInLastMinute(Ljava/util/Date;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p2

    invoke-static {p2, p3}, Landroid/text/format/DateUtils;->getRelativeTimeSpanString(J)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p4, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    return-object p0

    :cond_4
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method public static final getUserByNameOrId(Ljava/util/List;Ljava/lang/String;)Lio/getstream/chat/android/models/User;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lio/getstream/chat/android/models/User;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameOrId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/models/User;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Lio/getstream/chat/android/models/User;

    if-nez v1, :cond_4

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v2, v0

    :cond_3
    check-cast v2, Lio/getstream/chat/android/models/User;

    return-object v2

    :cond_4
    return-object v1
.end method

.method private static final isInLastMinute(Ljava/util/Date;)Z
    .locals 4

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const v2, 0xea60

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long p0, v0, v2

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
