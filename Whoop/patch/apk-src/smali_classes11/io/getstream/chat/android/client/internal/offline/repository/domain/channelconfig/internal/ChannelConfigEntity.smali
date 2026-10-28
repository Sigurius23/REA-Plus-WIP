.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;",
        "",
        "channelConfigInnerEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
        "commands",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V",
        "getChannelConfigInnerEntity",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
        "getCommands",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-client_release"
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
.field private final channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

.field private final commands:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelConfigInnerEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->copy(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;"
        }
    .end annotation

    const-string v0, "channelConfigInnerEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commands"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Ljava/util/List;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getChannelConfigInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    return-object v0
.end method

.method public final getCommands()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->channelConfigInnerEntity:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;->commands:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ChannelConfigEntity(channelConfigInnerEntity="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", commands="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
