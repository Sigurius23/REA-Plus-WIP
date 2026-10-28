.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "messageListItemStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "messageReplyStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "messageBackgroundFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "showAvatarPredicate",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V",
        "messageOptionsDecorators",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "getDecorators",
        "()Ljava/util/List;",
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


# instance fields
.field private final decorators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;"
        }
    .end annotation
.end field

.field private final messageOptionsDecorators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V
    .locals 4

    const-string v0, "messageListItemStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageReplyStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageBackgroundFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showAvatarPredicate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;

    invoke-direct {v0, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;)V

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/TextDecorator;

    invoke-direct {p3, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/TextDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MaxPossibleWidthDecorator;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MaxPossibleWidthDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MessageContainerMarginDecorator;

    invoke-direct {v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MessageContainerMarginDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;

    invoke-direct {p1, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V

    new-instance p4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReplyDecorator;

    invoke-direct {p4, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReplyDecorator;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    const/4 p2, 0x6

    new-array p2, p2, [Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;

    const/4 v3, 0x0

    aput-object v0, p2, v3

    const/4 v0, 0x1

    aput-object p3, p2, v0

    const/4 p3, 0x2

    aput-object v1, p2, p3

    const/4 p3, 0x3

    aput-object v2, p2, p3

    const/4 p3, 0x4

    aput-object p1, p2, p3

    const/4 p1, 0x5

    aput-object p4, p2, p1

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;->messageOptionsDecorators:Ljava/util/List;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;->decorators:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getDecorators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsDecoratorProvider;->decorators:Ljava/util/List;

    return-object v0
.end method
