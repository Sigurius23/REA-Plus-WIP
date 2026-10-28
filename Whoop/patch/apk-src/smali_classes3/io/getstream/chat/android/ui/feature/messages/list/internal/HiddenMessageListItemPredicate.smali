.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$MessageListItemPredicate;",
        "<init>",
        "()V",
        "theirGiphyEphemeralMessagePredicate",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "",
        "predicate",
        "item",
        "stream-chat-android-ui-components_release"
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;

.field private static final theirGiphyEphemeralMessagePredicate:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;->theirGiphyEphemeralMessagePredicate:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;->theirGiphyEphemeralMessagePredicate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z

    move-result p0

    return p0
.end method

.method private static final theirGiphyEphemeralMessagePredicate$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isGiphyEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final predicate(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/HiddenMessageListItemPredicate;->theirGiphyEphemeralMessagePredicate:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
