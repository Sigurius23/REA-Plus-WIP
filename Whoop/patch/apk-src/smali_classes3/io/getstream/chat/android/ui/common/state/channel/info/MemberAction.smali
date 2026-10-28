.class public interface abstract Lio/getstream/chat/android/ui/common/state/channel/info/MemberAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/state/channel/info/MemberAction$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/state/channel/info/MemberAction;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "getMember",
        "()Lio/getstream/chat/android/models/Member;",
        "member",
        "",
        "getIcon",
        "()I",
        "icon",
        "",
        "getLabel",
        "()Ljava/lang/String;",
        "label",
        "",
        "isDestructive",
        "()Z",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "getOnAction",
        "()Lc93/a;",
        "onAction",
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


# direct methods
.method public static synthetic access$isDestructive$jd(Lio/getstream/chat/android/ui/common/state/channel/info/MemberAction;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract getIcon()I
.end method

.method public abstract getLabel()Ljava/lang/String;
.end method

.method public abstract getMember()Lio/getstream/chat/android/models/Member;
.end method

.method public abstract getOnAction()Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation
.end method

.method public isDestructive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
