.class final Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;->INSTANCE:Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lj93/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin$1;->invoke(Lj93/d;)Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final invoke(Lj93/d;)Ljava/lang/Void;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/d;",
            ")",
            "Ljava/lang/Void;"
        }
    .end annotation

    .line 1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
