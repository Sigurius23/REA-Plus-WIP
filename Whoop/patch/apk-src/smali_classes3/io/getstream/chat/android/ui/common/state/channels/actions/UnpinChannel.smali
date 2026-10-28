.class public final Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "",
        "label",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onAction",
        "<init>",
        "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "Ljava/lang/String;",
        "getLabel",
        "()Ljava/lang/String;",
        "Lc93/a;",
        "getOnAction",
        "()Lc93/a;",
        "",
        "icon",
        "I",
        "getIcon",
        "()I",
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


# instance fields
.field private final channel:Lio/getstream/chat/android/models/Channel;

.field private final icon:I

.field private final label:Ljava/lang/String;

.field private final onAction:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->channel:Lio/getstream/chat/android/models/Channel;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->label:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->onAction:Lc93/a;

    sget p1, Lio/getstream/chat/android/ui/common/R$drawable;->stream_design_ic_unpin:I

    iput p1, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->icon:I

    return-void
.end method


# virtual methods
.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getConfirmationPopup()Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIcon()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->icon:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnAction()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/UnpinChannel;->onAction:Lc93/a;

    return-object v0
.end method

.method public final isDestructive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
