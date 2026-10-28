.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;
.super Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;",
        "<init>",
        "()V",
        "toString",
        "",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MessageFocusRemoved"

    return-object v0
.end method
