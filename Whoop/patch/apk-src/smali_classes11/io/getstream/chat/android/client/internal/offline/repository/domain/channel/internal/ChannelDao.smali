.class public interface abstract Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008a\u0018\u0000 %2\u00020\u0001:\u0001%J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ*\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J*\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J$\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00072\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\nJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J \u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ(\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0004\u0008!\u0010\"J \u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0004\u0008!\u0010#J\u0010\u0010$\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008$\u0010\r\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006&\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "channelEntity",
        "Ll83/a0;",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "channelEntities",
        "insertMany",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "selectAllCids",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "",
        "limit",
        "selectCidsBySyncNeeded",
        "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;",
        "selectSyncNeeded",
        "cids",
        "select",
        "cid",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "delete",
        "Ljava/util/Date;",
        "deletedAt",
        "setDeletedAt",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "",
        "hidden",
        "hideMessagesBefore",
        "setHidden",
        "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "Companion",
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


# static fields
.field public static final synthetic Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao$Companion;

    return-void
.end method

.method public static synthetic selectCidsBySyncNeeded$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, -0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->selectCidsBySyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectCidsBySyncNeeded"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic selectSyncNeeded$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, -0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->selectSyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectSyncNeeded"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract delete(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertMany(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectAllCids(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectCidsBySyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectSyncNeeded(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setHidden(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setHidden(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
