.class final Lio/getstream/chat/android/ui/common/helper/DefaultReactionPushEmojiFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/helper/DefaultReactionPushEmojiFactory;",
        "Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;",
        "<init>",
        "()V",
        "emojiCode",
        "",
        "type",
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
.method public final emojiCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "love"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "\u2764\ufe0f"

    return-object p1

    :sswitch_1
    const-string v0, "like"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "\ud83d\udc4d"

    return-object p1

    :sswitch_2
    const-string v0, "haha"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "\ud83d\ude02"

    return-object p1

    :sswitch_3
    const-string v0, "wow"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const-string p1, "\ud83d\ude2e"

    return-object p1

    :sswitch_4
    const-string v0, "sad"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_4
    const-string p1, "\ud83d\udc4e"

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x1bbd6 -> :sswitch_4
        0x1cc9f -> :sswitch_3
        0x30bfb2 -> :sswitch_2
        0x32af97 -> :sswitch_1
        0x32c772 -> :sswitch_0
    .end sparse-switch
.end method
