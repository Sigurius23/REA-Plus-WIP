.class public final Lio/getstream/chat/android/ui/common/utils/extensions/FiltersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "defaultChannelListFilter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "Lio/getstream/chat/android/models/Filters;",
        "user",
        "Lio/getstream/chat/android/models/User;",
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


# direct methods
.method public static final defaultChannelListFilter(Lio/getstream/chat/android/models/Filters;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string p0, "type"

    const-string v0, "messaging"

    invoke-static {p0, v0}, Lio/getstream/chat/android/models/Filters;->eq(Ljava/lang/String;Ljava/lang/Object;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v0, "members"

    invoke-static {v0, p1}, Lio/getstream/chat/android/models/Filters;->in(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    filled-new-array {p0, p1}, [Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/models/Filters;->and([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p0

    return-object p0
.end method
