.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->defaultFactory(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001JK\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "dateFormatter",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "messageListViewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "showAvatarPredicate",
        "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
        "messageBackgroundFactory",
        "Lkotlin/Function1;",
        "",
        "getLanguageDisplayName",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
        "createDecoratorProvider",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;",
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
.field final synthetic $predicate:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;->$predicate:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createDecoratorProvider(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
            "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageListViewStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showAvatarPredicate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageBackgroundFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getLanguageDisplayName"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;

    iget-object v8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;->$predicate:Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemDecoratorProvider;-><init>(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/ui/common/helper/DateFormatter;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method
