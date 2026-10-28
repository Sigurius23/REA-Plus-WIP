.class public final Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "",
        "label",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onAction",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;",
        "confirmationPopup",
        "<init>",
        "(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "Ljava/lang/String;",
        "getLabel",
        "()Ljava/lang/String;",
        "Lc93/a;",
        "getOnAction",
        "()Lc93/a;",
        "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;",
        "getConfirmationPopup",
        "()Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;",
        "",
        "icon",
        "I",
        "getIcon",
        "()I",
        "",
        "isDestructive",
        "Z",
        "()Z",
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

.field private final confirmationPopup:Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;

.field private final icon:I

.field private final isDestructive:Z

.field private final label:Ljava/lang/String;

.field private final onAction:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;",
            ")V"
        }
    .end annotation

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->channel:Lio/getstream/chat/android/models/Channel;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->label:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->onAction:Lc93/a;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->confirmationPopup:Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;

    .line 6
    sget p1, Lio/getstream/chat/android/ui/common/R$drawable;->stream_design_ic_leave:I

    iput p1, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->icon:I

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->isDestructive:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;-><init>(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lc93/a;Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;)V

    return-void
.end method


# virtual methods
.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getConfirmationPopup()Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->confirmationPopup:Lio/getstream/chat/android/ui/common/state/channels/actions/ConfirmationPopup;

    return-object v0
.end method

.method public final getIcon()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->icon:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->label:Ljava/lang/String;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->onAction:Lc93/a;

    return-object v0
.end method

.method public final isDestructive()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/state/channels/actions/LeaveGroup;->isDestructive:Z

    return v0
.end method
