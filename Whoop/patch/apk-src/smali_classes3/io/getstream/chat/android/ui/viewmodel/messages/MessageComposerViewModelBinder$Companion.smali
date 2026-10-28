.class public final Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder$Companion;",
        "",
        "<init>",
        "()V",
        "with",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;",
        "vm",
        "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;",
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
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final with(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;)Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;
    .locals 2

    const-string v0, "vm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModelBinder;-><init>(Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
