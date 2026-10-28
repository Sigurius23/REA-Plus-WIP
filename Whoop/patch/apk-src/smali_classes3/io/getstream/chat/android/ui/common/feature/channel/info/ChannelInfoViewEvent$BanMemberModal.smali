.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BanMemberModal"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$Modal;",
        "member",
        "Lio/getstream/chat/android/models/Member;",
        "<init>",
        "(Lio/getstream/chat/android/models/Member;)V",
        "getMember",
        "()Lio/getstream/chat/android/models/Member;",
        "timeouts",
        "",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;",
        "getTimeouts",
        "()Ljava/util/List;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "Timeout",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final member:Lio/getstream/chat/android/models/Member;

.field private final timeouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Member;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    invoke-static {}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;->getEntries()Lt83/a;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->timeouts:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;Lio/getstream/chat/android/models/Member;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->copy(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;-><init>(Lio/getstream/chat/android/models/Member;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    iget-object p1, p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMember()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final getTimeouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal$Timeout;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->timeouts:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$BanMemberModal;->member:Lio/getstream/chat/android/models/Member;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "BanMemberModal(member="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
