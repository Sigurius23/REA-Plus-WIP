.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J>\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;",
        "",
        "createMessageOptionItems",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
        "selectedMessage",
        "Lio/getstream/chat/android/models/Message;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "isInThread",
        "",
        "ownCapabilities",
        "",
        "",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItemsFactory$Companion;

    return-void
.end method


# virtual methods
.method public abstract createMessageOptionItems(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;ZLjava/util/Set;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/models/User;",
            "Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;",
            ">;"
        }
    .end annotation
.end method
