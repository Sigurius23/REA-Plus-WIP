.class public final Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion$newInstance$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;->newInstance$default(Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion;Landroid/content/Context;Lio/getstream/chat/android/models/Message;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$OptionsDialogType;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionsDialogFragment$Companion$newInstance$1$1",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "decorators",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
