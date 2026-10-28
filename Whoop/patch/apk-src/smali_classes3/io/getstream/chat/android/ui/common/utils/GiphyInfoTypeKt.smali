.class public final Lio/getstream/chat/android/ui/common/utils/GiphyInfoTypeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u001a,\u0010\u000b\u001a\u00020\u00012\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0003\u00a8\u0006\u0011"
    }
    d2 = {
        "GIPHY_INFO_DEFAULT_WIDTH_DP",
        "",
        "getGIPHY_INFO_DEFAULT_WIDTH_DP$annotations",
        "()V",
        "GIPHY_INFO_DEFAULT_HEIGHT_DP",
        "getGIPHY_INFO_DEFAULT_HEIGHT_DP$annotations",
        "giphyInfo",
        "Lio/getstream/chat/android/ui/common/utils/GiphyInfo;",
        "Lio/getstream/chat/android/models/Attachment;",
        "field",
        "Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;",
        "getGiphySize",
        "map",
        "",
        "",
        "size",
        "defaultValue",
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
.field public static final GIPHY_INFO_DEFAULT_HEIGHT_DP:I = 0xc8

.field public static final GIPHY_INFO_DEFAULT_WIDTH_DP:I = 0xc8


# direct methods
.method public static synthetic getGIPHY_INFO_DEFAULT_HEIGHT_DP$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static synthetic getGIPHY_INFO_DEFAULT_WIDTH_DP$annotations()V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method private static final getGiphySize(Ljava/util/Map;Ljava/lang/String;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    :goto_0
    return p2
.end method

.method public static final giphyInfo(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;)Lio/getstream/chat/android/ui/common/utils/GiphyInfo;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p0

    const-string v0, "giphy"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/util/Map;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    instance-of p1, p0, Ljava/util/Map;

    if-eqz p1, :cond_2

    check-cast p0, Ljava/util/Map;

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_4

    new-instance p1, Lio/getstream/chat/android/ui/common/utils/GiphyInfo;

    const-string v0, "url"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    const-string v1, "width"

    const/16 v2, 0xc8

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/utils/Utils;->dpToPx(I)I

    move-result v3

    invoke-static {p0, v1, v3}, Lio/getstream/chat/android/ui/common/utils/GiphyInfoTypeKt;->getGiphySize(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v1

    const-string v3, "height"

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/utils/Utils;->dpToPx(I)I

    move-result v2

    invoke-static {p0, v3, v2}, Lio/getstream/chat/android/ui/common/utils/GiphyInfoTypeKt;->getGiphySize(Ljava/util/Map;Ljava/lang/String;I)I

    move-result p0

    invoke-direct {p1, v0, v1, p0}, Lio/getstream/chat/android/ui/common/utils/GiphyInfo;-><init>(Ljava/lang/String;II)V

    return-object p1

    :cond_4
    return-object v1
.end method
